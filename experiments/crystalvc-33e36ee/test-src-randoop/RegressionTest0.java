
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    long long0 = crystal.Constants.DEFAULT_REFRESH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long0 == 600L);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    crystal.model.Relationship.PENDING = "";

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    crystal.model.DataSource.RepoKind repoKind1 = null;
    // The following exception was thrown during execution in test generation
    try {
    crystal.model.RevisionHistory revisionHistory2 = new crystal.model.RevisionHistory("", repoKind1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    java.lang.String str0 = crystal.model.Relationship.AHEAD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AHEAD"+ "'", str0.equals("AHEAD"));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    crystal.client.ClientPreferences.CONFIG_PATH = "";

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    float f0 = java.awt.Component.BOTTOM_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 1.0f);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "", "hi!" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str3 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str3, str_array2);
    java.lang.String[] str_array7 = new java.lang.String[] { "hi!", "hi!" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str8 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str8, str_array7);
    java.lang.String[] str_array12 = new java.lang.String[] { "AHEAD", "hi!" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str13 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str13, str_array12);
    crystal.model.Relationship relationship15 = null;
    // The following exception was thrown during execution in test generation
    try {
    crystal.model.Relationship relationship16 = crystal.server.GuidanceChecker.getConsequences((java.util.Set<java.lang.String>)linkedhashset_str3, (java.util.Set<java.lang.String>)linkedhashset_str8, (java.util.Set<java.lang.String>)linkedhashset_str13, relationship15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    crystal.Constants.DEFAULT_REFRESH = (short)10;

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    crystal.model.LocalStateResult.HG_UNCHECKPOINTED = "AHEAD";

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    java.awt.Window[] window_array0 = java.awt.Window.getOwnerlessWindows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(window_array0);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    int i0 = java.awt.Frame.NORMAL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    java.lang.String str0 = crystal.model.Relationship.TESTCONFLICT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "TESTCONFLICT"+ "'", str0.equals("TESTCONFLICT"));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    crystal.Constants constants0 = new crystal.Constants();

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    int i0 = java.awt.image.ImageObserver.ALLBITS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 32);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    crystal.util.LSMRLogger.LOG_PATTERN_VERBOSE = "hi!";

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    int i0 = javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    java.lang.String str1 = crystal.util.TimeUtility.msToHumanReadable((long)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0 ms"+ "'", str1.equals("0 ms"));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    int i0 = java.awt.Frame.WAIT_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 3);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    crystal.model.LocalStateResult.GIT_MUST_RESOLVE = "AHEAD";

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    int i0 = java.awt.image.ImageObserver.PROPERTIES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 4);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    crystal.client.ClientPreferences.CONFIG_PATH = "TESTCONFLICT";

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    java.util.HashMap<java.lang.String,crystal.server.AbstractLogParser.Checkpoint> hashmap_str_checkpoint1 = crystal.server.HgLogParser.parseLog("0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_str_checkpoint1);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    java.util.Set<java.lang.String> set_str0 = null;
    java.lang.String[] str_array3 = new java.lang.String[] { "TESTCONFLICT", "" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str4 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str4, str_array3);
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = crystal.util.SetOperations.isSubset(set_str0, (java.util.Set<java.lang.String>)linkedhashset_str4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    boolean b1 = crystal.util.ValidInputChecker.checkDirectoryPath("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    // The following exception was thrown during execution in test generation
    try {
    crystal.util.ValidInputChecker.checkValidDirectoryPath("0 ms");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    int i0 = java.awt.Frame.N_RESIZE_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 8);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    crystal.server.HgStateChecker hgStateChecker0 = new crystal.server.HgStateChecker();

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    crystal.server.HgLogParser hgLogParser0 = new crystal.server.HgLogParser();

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    crystal.client.ClientPreferences clientPreferences0 = null;
    // The following exception was thrown during execution in test generation
    try {
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(clientPreferences0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    java.lang.String str1 = crystal.util.TimeUtility.msToHumanReadableDelta((long)8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "415725 hours 21 min"+ "'", str1.equals("415725 hours 21 min"));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    java.util.HashMap<java.lang.String,crystal.server.AbstractLogParser.Checkpoint> hashmap_str_checkpoint1 = crystal.server.GitLogParser.parseLog("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_str_checkpoint1);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    int i0 = javax.swing.WindowConstants.EXIT_ON_CLOSE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 3);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    int i0 = javax.swing.JComponent.UNDEFINED_CONDITION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == (-1));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    crystal.model.LocalStateResult.HG_MUST_RESOLVE = "hi!";

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    crystal.model.Relationship.MERGECLEAN = "hi!";

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    java.io.File file0 = null;
    // The following exception was thrown during execution in test generation
    try {
    crystal.client.ClientPreferences clientPreferences1 = crystal.client.ClientPreferences.loadPreferencesFromXML(file0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    crystal.util.LSMRLogger lSMRLogger0 = new crystal.util.LSMRLogger();

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    org.apache.log4j.Level level1 = null;
    crystal.util.LSMRLogger.startLog4J(true, level1);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    int i0 = java.awt.Frame.NE_RESIZE_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 7);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    int i0 = java.awt.image.ImageObserver.ABORT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 128);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    crystal.client.ConflictDaemon conflictDaemon0 = crystal.client.ConflictDaemon.getInstance();
    conflictDaemon0.enable(true);
    conflictDaemon0.removeAllListeners();
    crystal.client.ConflictDaemon.ComputationListener computationListener4 = null;
    conflictDaemon0.addListener(computationListener4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(conflictDaemon0);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    crystal.model.LocalStateResult.HG_UNCHECKPOINTED = "TESTCONFLICT";

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    javax.swing.ImageIcon imageIcon1 = null;
    java.awt.Image image2 = null;
    // The following exception was thrown during execution in test generation
    try {
    crystal.model.Relationship relationship3 = new crystal.model.Relationship("0 ms", imageIcon1, image2);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    int i0 = java.awt.Frame.ICONIFIED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    crystal.util.XMLTools.STANDARD_DATE_FORMAT = "";

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    int i0 = java.awt.Frame.DEFAULT_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    // The following exception was thrown during execution in test generation
    try {
    crystal.util.ValidInputChecker.checkValidDirectoryPath("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    crystal.model.LocalStateResult.ALL_CLEAR = "";

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    crystal.model.RevisionHistory.Action action0 = crystal.model.RevisionHistory.Action.SYNC;
    org.junit.Assert.assertTrue("'" + action0 + "' != '" + crystal.model.RevisionHistory.Action.SYNC + "'", action0.equals(crystal.model.RevisionHistory.Action.SYNC));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    int i0 = java.awt.Frame.SE_RESIZE_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 5);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    java.lang.String str0 = crystal.model.LocalStateResult.ALL_CLEAR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + ""+ "'", str0.equals(""));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    crystal.model.RevisionHistory.Action action0 = crystal.model.RevisionHistory.Action.UNKNOWN;
    org.junit.Assert.assertTrue("'" + action0 + "' != '" + crystal.model.RevisionHistory.Action.UNKNOWN + "'", action0.equals(crystal.model.RevisionHistory.Action.UNKNOWN));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    boolean b0 = crystal.Constants.DEBUG_UI;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b0 == false);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    crystal.util.TimeUtility timeUtility0 = new crystal.util.TimeUtility();

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    crystal.util.LSMRLogger.startLog4J(true);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    int i0 = javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ClientPreferences clientPreferences5 = clientPreferences4.clone();
    crystal.client.ProjectPreferences projectPreferences6 = null;
    // The following exception was thrown during execution in test generation
    try {
    crystal.client.DataSourceGuiEditorFrame dataSourceGuiEditorFrame8 = new crystal.client.DataSourceGuiEditorFrame(clientPreferences4, projectPreferences6, "415725 hours 21 min");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clientPreferences5);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ClientPreferences clientPreferences5 = clientPreferences4.clone();
    // The following exception was thrown during execution in test generation
    try {
    clientPreferences4.removeProjectPreferencesAtIndex((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clientPreferences5);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    float f0 = java.awt.Component.LEFT_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 0.0f);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    java.lang.String str0 = crystal.model.Relationship.PENDING;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + ""+ "'", str0.equals(""));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    crystal.model.LocalStateResult.HG_MUST_RESOLVE = "TESTCONFLICT";

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    java.util.HashMap<java.lang.String,crystal.server.AbstractLogParser.Checkpoint> hashmap_str_checkpoint1 = crystal.server.HgLogParser.parseLog("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_str_checkpoint1);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    java.lang.String str0 = crystal.model.Relationship.MERGECLEAN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "hi!"+ "'", str0.equals("hi!"));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    int i0 = javax.swing.JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    crystal.server.GuidanceChecker guidanceChecker0 = new crystal.server.GuidanceChecker();

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    crystal.client.ClientPreferences.DuplicateProjectNameException duplicateProjectNameException1 = new crystal.client.ClientPreferences.DuplicateProjectNameException("hi!");

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    crystal.model.Relationship.COMPILECONFLICT = "0 ms";

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    float f0 = java.awt.Component.CENTER_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 0.5f);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    crystal.util.LSMRLogger.startLog4J();

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    java.awt.Component component0 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b1 = javax.swing.JComponent.isLightweightComponent(component0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    int i0 = crystal.client.ClientPreferences.ConfigurationReadingException.PATH_NOT_DIRECTORY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 3);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    java.lang.String str0 = crystal.model.LocalStateResult.HG_MUST_RESOLVE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "TESTCONFLICT"+ "'", str0.equals("TESTCONFLICT"));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    int i0 = java.awt.Frame.CROSSHAIR_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    java.lang.String str0 = crystal.Constants.HOME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "$HOME"+ "'", str0.equals("$HOME"));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    crystal.model.Relationship.PENDING = "AHEAD";

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    crystal.client.ClientPreferences.CONFIG_PATH = "hi!";

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    java.lang.String str0 = crystal.client.ClientPreferences.CONFIG_PATH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "hi!"+ "'", str0.equals("hi!"));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences5 = null;
    clientPreferences4.addProjectPreferences(projectPreferences5);
    // The following exception was thrown during execution in test generation
    try {
    clientPreferences4.removeProjectPreferencesAtIndex(1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    float f0 = java.awt.Component.TOP_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 0.0f);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    java.lang.String str0 = crystal.model.LocalStateResult.PENDING;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PENDING"+ "'", str0.equals("PENDING"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    java.util.Date date1 = crystal.util.TimeUtility.parseLSMRDate("0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(date1);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

    boolean b0 = crystal.Constants.QUIET_CONSOLE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b0 == true);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

    crystal.model.LocalStateResult.ALL_CLEAR = "AHEAD";

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ClientPreferences clientPreferences5 = clientPreferences4.clone();
    // The following exception was thrown during execution in test generation
    try {
    crystal.client.ProjectPreferences projectPreferences7 = clientPreferences5.getProjectPreferences("TESTCONFLICT");
      org.junit.Assert.fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clientPreferences5);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    crystal.util.LSMRLogger.LOG_PATTERN_VERBOSE = "415725 hours 21 min";

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    java.util.HashMap<java.lang.String,crystal.server.AbstractLogParser.Checkpoint> hashmap_str_checkpoint1 = crystal.server.GitLogParser.parseLog("AHEAD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_str_checkpoint1);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    crystal.model.LocalStateResult.GIT_UNCHECKPOINTED = "0 ms";

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ClientPreferences clientPreferences5 = clientPreferences4.clone();
    long long6 = clientPreferences4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clientPreferences5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 32L);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    crystal.util.ValidInputChecker.checkValidStringInput("TESTCONFLICT");

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    int i0 = crystal.client.ClientPreferences.ConfigurationReadingException.HG_PATH_INVALID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    javax.swing.JPanel jPanel0 = null;
    // The following exception was thrown during execution in test generation
    try {
    crystal.util.SpringLayoutUtility.formGridInColumn(jPanel0, (int)(byte)-1, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    int i0 = javax.swing.WindowConstants.HIDE_ON_CLOSE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Point point1 = null;
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.setLocation(point1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    int i0 = javax.swing.JComponent.WHEN_FOCUSED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Event event1 = null;
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.deliverEvent(event1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    crystal.model.RevisionHistory.Action action0 = crystal.model.RevisionHistory.Action.CHECKPOINT;
    org.junit.Assert.assertTrue("'" + action0 + "' != '" + crystal.model.RevisionHistory.Action.CHECKPOINT + "'", action0.equals(crystal.model.RevisionHistory.Action.CHECKPOINT));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    javax.swing.JPanel jPanel0 = null;
    // The following exception was thrown during execution in test generation
    try {
    crystal.util.SpringLayoutUtility.formGridInColumn(jPanel0, (int)' ', (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    crystal.util.XMLTools xMLTools0 = new crystal.util.XMLTools();

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    crystal.model.Relationship.MERGECLEAN = "0 ms";

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    jMultiLineToolTip0.firePropertyChange("AHEAD", 0, 128);
    java.awt.Dimension dimension7 = null;
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.setSize(dimension7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.event.MouseListener mouseListener5 = null;
    jMultiLineToolTip0.removeMouseListener(mouseListener5);
    java.awt.Event event7 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = jMultiLineToolTip0.handleEvent(event7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.event.MouseListener mouseListener5 = null;
    jMultiLineToolTip0.removeMouseListener(mouseListener5);
    jMultiLineToolTip0.setTipText("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    crystal.client.ConflictDaemon conflictDaemon0 = crystal.client.ConflictDaemon.getInstance();
    crystal.model.DataSource dataSource1 = null;
    crystal.client.ProjectPreferences projectPreferences2 = null;
    crystal.model.Relationship relationship3 = conflictDaemon0.calculateRelationship(dataSource1, projectPreferences2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(conflictDaemon0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(relationship3);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    crystal.util.XMLTools.STANDARD_DATE_FORMAT = "hi!";

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    crystal.client.ClientPreferences.REFRESH = (short)-1;

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color1 = null;
    jMultiLineToolTip0.setBackground(color1);
    jMultiLineToolTip0.transferFocusBackward();
    java.awt.Event event4 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = jMultiLineToolTip0.postEvent(event4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.event.MouseListener mouseListener5 = null;
    jMultiLineToolTip0.removeMouseListener(mouseListener5);
    java.awt.Graphics graphics7 = null;
    jMultiLineToolTip0.printComponents(graphics7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    crystal.Constants.DEFAULT_REFRESH = 1;

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

    int i0 = java.awt.Frame.MAXIMIZED_BOTH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 6);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    int i0 = java.awt.Frame.TEXT_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    crystal.model.RevisionHistory.Capable capable0 = crystal.model.RevisionHistory.Capable.CANNOT;
    org.junit.Assert.assertTrue("'" + capable0 + "' != '" + crystal.model.RevisionHistory.Capable.CANNOT + "'", capable0.equals(crystal.model.RevisionHistory.Capable.CANNOT));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    int i0 = java.awt.Frame.S_RESIZE_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 9);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    crystal.util.JMultiLineToolTip jMultiLineToolTip3 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle4 = null;
    java.awt.Rectangle rectangle5 = jMultiLineToolTip3.getBounds(rectangle4);
    jMultiLineToolTip0.repaint(rectangle5);
    boolean b8 = jMultiLineToolTip0.areFocusTraversalKeysSet((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    java.lang.String str0 = crystal.util.TimeUtility.getCurrentLSMRDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "2017-06-04T14-21-48.265-0700"+ "'", str0.equals("2017-06-04T14-21-48.265-0700"));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    java.lang.String str0 = crystal.model.LocalStateResult.HG_UNCHECKPOINTED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "TESTCONFLICT"+ "'", str0.equals("TESTCONFLICT"));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    crystal.util.ValidInputChecker validInputChecker0 = new crystal.util.ValidInputChecker();

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener8 = null;
    jMultiLineToolTip0.removePropertyChangeListener("415725 hours 21 min", propertyChangeListener8);
    javax.swing.JPopupMenu jPopupMenu10 = null;
    jMultiLineToolTip0.setComponentPopupMenu(jPopupMenu10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    int i0 = crystal.client.ClientPreferences.ConfigurationReadingException.TEMP_PATH_INVALID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

    javax.swing.ImageIcon imageIcon1 = null;
    crystal.util.JMultiLineToolTip jMultiLineToolTip2 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle3 = null;
    java.awt.Rectangle rectangle4 = jMultiLineToolTip2.getBounds(rectangle3);
    java.awt.Toolkit toolkit5 = jMultiLineToolTip2.getToolkit();
    jMultiLineToolTip2.setSize(32, (int)(byte)-1);
    java.awt.image.ImageProducer imageProducer9 = null;
    java.awt.Image image10 = jMultiLineToolTip2.createImage(imageProducer9);
    // The following exception was thrown during execution in test generation
    try {
    crystal.model.Relationship relationship11 = new crystal.model.Relationship("Action: hg merge", imageIcon1, image10);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image10);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences5 = null;
    clientPreferences4.addProjectPreferences(projectPreferences5);
    crystal.client.ProjectPreferences projectPreferences7 = null;
    clientPreferences4.removeProjectPreferences(projectPreferences7);
    crystal.client.ClientPreferences clientPreferences9 = clientPreferences4.clone();
    crystal.client.ProjectPreferences projectPreferences10 = null;
    // The following exception was thrown during execution in test generation
    try {
    crystal.client.DataSourceGuiEditorFrame dataSourceGuiEditorFrame12 = new crystal.client.DataSourceGuiEditorFrame(clientPreferences4, projectPreferences10, "$HOME");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clientPreferences9);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

    boolean b1 = crystal.util.ValidInputChecker.checkCommand("415725 hours 21 min");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    crystal.client.ClientPreferences.ConfigurationReadingException configurationReadingException2 = new crystal.client.ClientPreferences.ConfigurationReadingException("415725 hours 21 min", 4);
    java.lang.Throwable[] throwable_array3 = configurationReadingException2.getSuppressed();
    int i4 = configurationReadingException2.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 4);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    crystal.util.XMLTools.STANDARD_DATE_FORMAT = "0 ms";

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

    java.awt.Frame[] frame_array0 = java.awt.Frame.getFrames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(frame_array0);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

    int i0 = java.awt.Frame.E_RESIZE_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 11);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Dimension dimension5 = null;
    jMultiLineToolTip0.setPreferredSize(dimension5);
    crystal.util.JMultiLineToolTip jMultiLineToolTip7 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle8 = null;
    java.awt.Rectangle rectangle9 = jMultiLineToolTip7.getBounds(rectangle8);
    java.awt.Event event10 = null;
    boolean b12 = jMultiLineToolTip7.action(event10, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel13 = jMultiLineToolTip7.getColorModel();
    boolean b14 = jMultiLineToolTip0.isAncestorOf((java.awt.Component)jMultiLineToolTip7);
    jMultiLineToolTip0.repaint((long)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color1 = null;
    jMultiLineToolTip0.setBackground(color1);
    jMultiLineToolTip0.revalidate();

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip0.firePropertyChange("", (double)0L, 0.0d);
    java.beans.PropertyChangeListener propertyChangeListener6 = null;
    jMultiLineToolTip0.removePropertyChangeListener("0 ms", propertyChangeListener6);
    javax.swing.event.AncestorListener ancestorListener8 = null;
    jMultiLineToolTip0.addAncestorListener(ancestorListener8);
    // The following exception was thrown during execution in test generation
    try {
    javax.swing.InputMap inputMap11 = jMultiLineToolTip0.getInputMap(8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

    javax.swing.ImageIcon imageIcon1 = null;
    java.awt.Image image2 = null;
    crystal.model.Relationship relationship3 = new crystal.model.Relationship("AHEAD", imageIcon1, image2);
    crystal.util.JMultiLineToolTip jMultiLineToolTip4 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle5 = null;
    java.awt.Rectangle rectangle6 = jMultiLineToolTip4.getBounds(rectangle5);
    java.awt.Rectangle rectangle7 = jMultiLineToolTip4.getVisibleRect();
    boolean b8 = jMultiLineToolTip4.isEnabled();
    java.awt.Event event9 = null;
    boolean b12 = jMultiLineToolTip4.mouseEnter(event9, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener13 = null;
    jMultiLineToolTip4.addPropertyChangeListener(propertyChangeListener13);
    java.awt.Point point15 = jMultiLineToolTip4.getLocation();
    boolean b16 = relationship3.equals((java.lang.Object)jMultiLineToolTip4);
    java.lang.String str17 = relationship3.getToolTipText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }

    int i0 = java.awt.image.ImageObserver.ERROR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 64);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

    crystal.util.XMLTools.STANDARD_DATE_FORMAT = "ToolTipUI";

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

    int i0 = java.awt.Frame.SW_RESIZE_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 4);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

    crystal.model.Relationship.AHEAD = "Action: hg merge";

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

    org.apache.log4j.Logger logger0 = crystal.util.RunIt._log;
    crystal.util.RunIt._log = logger0;
    crystal.util.RunIt._log = logger0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(logger0);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

    crystal.model.Relationship.BEHIND = "415725 hours 21 min";

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel6 = jMultiLineToolTip0.getColorModel();
    jMultiLineToolTip0.removeNotify();
    crystal.util.JMultiLineToolTip jMultiLineToolTip8 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle9 = null;
    java.awt.Rectangle rectangle10 = jMultiLineToolTip8.getBounds(rectangle9);
    java.awt.Toolkit toolkit11 = jMultiLineToolTip8.getToolkit();
    java.awt.Font font12 = null;
    jMultiLineToolTip8.setFont(font12);
    java.awt.Color color14 = jMultiLineToolTip8.getBackground();
    jMultiLineToolTip0.setForeground(color14);
    java.awt.event.MouseWheelListener[] mouseWheelListener_array16 = jMultiLineToolTip0.getMouseWheelListeners();
    jMultiLineToolTip0.disable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseWheelListener_array16);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

    org.apache.log4j.Level level2 = crystal.Constants.LOG_LEVEL;
    crystal.util.LSMRLogger.startLog4J(true, true, level2, "415725 hours 21 min", "TESTCONFLICT");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(level2);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.Component component8 = jMultiLineToolTip0.locate((int)'4', 1);
    // The following exception was thrown during execution in test generation
    try {
    component8.firePropertyChange("", (double)0, (double)3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component8);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager7 = null;
    jMultiLineToolTip0.setLayout(layoutManager7);
    boolean b9 = jMultiLineToolTip0.isFocusOwner();
    boolean b10 = jMultiLineToolTip0.isShowing();
    java.awt.Graphics graphics11 = null;
    jMultiLineToolTip0.update(graphics11);
    java.awt.event.MouseMotionListener mouseMotionListener13 = null;
    jMultiLineToolTip0.addMouseMotionListener(mouseMotionListener13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    java.awt.Point point11 = jMultiLineToolTip0.getLocation();
    jMultiLineToolTip0.setDoubleBuffered(true);
    java.awt.Font font14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.FontMetrics fontMetrics15 = jMultiLineToolTip0.getFontMetrics(font14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point11);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Dimension dimension5 = null;
    jMultiLineToolTip0.setPreferredSize(dimension5);
    jMultiLineToolTip0.move(10, (int)(short)10);
    java.awt.Point point11 = jMultiLineToolTip0.getMousePosition(true);
    crystal.util.JMultiLineToolTip jMultiLineToolTip12 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip12.firePropertyChange("", (double)0L, 0.0d);
    boolean b17 = jMultiLineToolTip12.getIgnoreRepaint();
    jMultiLineToolTip12.enable();
    java.awt.im.InputMethodRequests inputMethodRequests19 = jMultiLineToolTip12.getInputMethodRequests();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array20 = jMultiLineToolTip12.getMouseMotionListeners();
    java.awt.Container container21 = jMultiLineToolTip12.getParent();
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.setComponentZOrder((java.awt.Component)container21, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputMethodRequests19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container21);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color1 = null;
    jMultiLineToolTip0.setBackground(color1);
    jMultiLineToolTip0.transferFocusBackward();
    int i4 = jMultiLineToolTip0.getWidth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.Font font4 = null;
    jMultiLineToolTip0.setFont(font4);
    java.awt.Color color6 = jMultiLineToolTip0.getBackground();
    jMultiLineToolTip0.show();
    java.awt.Component.BaselineResizeBehavior baselineResizeBehavior8 = jMultiLineToolTip0.getBaselineResizeBehavior();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color6);
    org.junit.Assert.assertTrue("'" + baselineResizeBehavior8 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior8.equals(java.awt.Component.BaselineResizeBehavior.OTHER));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences5 = null;
    clientPreferences4.addProjectPreferences(projectPreferences5);
    crystal.client.ProjectPreferences projectPreferences7 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = crystal.util.ValidInputChecker.checkProjectPreferencesNameDuplicate(clientPreferences4, projectPreferences7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener8 = null;
    jMultiLineToolTip0.removePropertyChangeListener("415725 hours 21 min", propertyChangeListener8);
    java.awt.event.KeyListener keyListener10 = null;
    jMultiLineToolTip0.removeKeyListener(keyListener10);
    java.awt.Graphics graphics12 = jMultiLineToolTip0.getGraphics();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphics12);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip0.firePropertyChange("", (double)0L, 0.0d);
    boolean b5 = jMultiLineToolTip0.getIgnoreRepaint();
    jMultiLineToolTip0.enable();
    java.awt.im.InputMethodRequests inputMethodRequests7 = jMultiLineToolTip0.getInputMethodRequests();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array8 = jMultiLineToolTip0.getMouseMotionListeners();
    float f9 = jMultiLineToolTip0.getAlignmentX();
    crystal.util.JMultiLineToolTip jMultiLineToolTip10 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle11 = null;
    java.awt.Rectangle rectangle12 = jMultiLineToolTip10.getBounds(rectangle11);
    java.awt.Rectangle rectangle13 = jMultiLineToolTip10.getVisibleRect();
    boolean b14 = jMultiLineToolTip10.isEnabled();
    java.awt.Event event15 = null;
    boolean b18 = jMultiLineToolTip10.mouseEnter(event15, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener19 = null;
    jMultiLineToolTip10.addPropertyChangeListener(propertyChangeListener19);
    javax.swing.KeyStroke keyStroke21 = null;
    jMultiLineToolTip10.unregisterKeyboardAction(keyStroke21);
    jMultiLineToolTip10.enableInputMethods(false);
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.add((java.awt.Component)jMultiLineToolTip10, (java.lang.Object)'a', (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputMethodRequests7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f9 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel6 = jMultiLineToolTip0.getColorModel();
    java.io.PrintWriter printWriter7 = null;
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.list(printWriter7, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel6);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    crystal.util.JMultiLineToolTip jMultiLineToolTip3 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle4 = null;
    java.awt.Rectangle rectangle5 = jMultiLineToolTip3.getBounds(rectangle4);
    jMultiLineToolTip0.repaint(rectangle5);
    java.util.Locale locale7 = jMultiLineToolTip0.getLocale();
    jMultiLineToolTip0.setColumns(0);
    boolean b10 = jMultiLineToolTip0.isDisplayable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.image.ImageProducer imageProducer7 = null;
    java.awt.Image image8 = jMultiLineToolTip0.createImage(imageProducer7);
    java.awt.AWTEvent aWTEvent9 = null;
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.dispatchEvent(aWTEvent9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image8);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    java.lang.String str0 = crystal.util.LSMRLogger.LOG_PATTERN_FAST;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "%5p - %m%n"+ "'", str0.equals("%5p - %m%n"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

    java.lang.String str0 = crystal.model.LocalStateResult.TEST;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "TEST"+ "'", str0.equals("TEST"));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.event.InputMethodListener inputMethodListener6 = null;
    jMultiLineToolTip0.removeInputMethodListener(inputMethodListener6);
    boolean b8 = jMultiLineToolTip0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    crystal.util.JMultiLineToolTip jMultiLineToolTip3 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle4 = null;
    java.awt.Rectangle rectangle5 = jMultiLineToolTip3.getBounds(rectangle4);
    jMultiLineToolTip0.repaint(rectangle5);
    java.util.Locale locale7 = jMultiLineToolTip0.getLocale();
    jMultiLineToolTip0.setColumns(0);
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.remove((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale7);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    crystal.util.JMultiLineToolTip jMultiLineToolTip3 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle4 = null;
    java.awt.Rectangle rectangle5 = jMultiLineToolTip3.getBounds(rectangle4);
    jMultiLineToolTip0.repaint(rectangle5);
    java.util.Locale locale7 = jMultiLineToolTip0.getLocale();
    javax.swing.plaf.ToolTipUI toolTipUI8 = jMultiLineToolTip0.getUI();
    crystal.util.JMultiLineToolTip jMultiLineToolTip9 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle10 = null;
    java.awt.Rectangle rectangle11 = jMultiLineToolTip9.getBounds(rectangle10);
    java.awt.Event event12 = null;
    boolean b15 = jMultiLineToolTip9.mouseDrag(event12, 32, 1);
    javax.swing.ImageIcon imageIcon17 = null;
    java.awt.Image image18 = null;
    crystal.model.Relationship relationship19 = new crystal.model.Relationship("AHEAD", imageIcon17, image18);
    crystal.util.JMultiLineToolTip jMultiLineToolTip20 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle21 = null;
    java.awt.Rectangle rectangle22 = jMultiLineToolTip20.getBounds(rectangle21);
    java.awt.Rectangle rectangle23 = jMultiLineToolTip20.getVisibleRect();
    boolean b24 = jMultiLineToolTip20.isEnabled();
    java.awt.Event event25 = null;
    boolean b28 = jMultiLineToolTip20.mouseEnter(event25, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener29 = null;
    jMultiLineToolTip20.addPropertyChangeListener(propertyChangeListener29);
    java.awt.Point point31 = jMultiLineToolTip20.getLocation();
    boolean b32 = relationship19.equals((java.lang.Object)jMultiLineToolTip20);
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.add((java.awt.Component)jMultiLineToolTip9, (java.lang.Object)b32, 128);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolTipUI8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    jMultiLineToolTip0.setSize((int)' ', (-1));
    boolean b6 = jMultiLineToolTip0.requestFocus(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener4 = null;
    jMultiLineToolTip0.addHierarchyBoundsListener(hierarchyBoundsListener4);
    javax.accessibility.AccessibleContext accessibleContext6 = jMultiLineToolTip0.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext6);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    crystal.model.RevisionHistory.Action action0 = crystal.model.RevisionHistory.Action.RESOLVE;
    org.junit.Assert.assertTrue("'" + action0 + "' != '" + crystal.model.RevisionHistory.Action.RESOLVE + "'", action0.equals(crystal.model.RevisionHistory.Action.RESOLVE));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    jMultiLineToolTip0.firePropertyChange("hi!", ' ', '#');
    java.lang.Object obj6 = jMultiLineToolTip0.getTreeLock();
    jMultiLineToolTip0.transferFocusBackward();
    crystal.util.JMultiLineToolTip jMultiLineToolTip8 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle9 = null;
    java.awt.Rectangle rectangle10 = jMultiLineToolTip8.getBounds(rectangle9);
    jMultiLineToolTip8.firePropertyChange("AHEAD", 0, 128);
    javax.swing.InputVerifier inputVerifier15 = jMultiLineToolTip8.getInputVerifier();
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.setComponentZOrder((java.awt.Component)jMultiLineToolTip8, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier15);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.beans.VetoableChangeListener[] vetoableChangeListener_array5 = jMultiLineToolTip0.getVetoableChangeListeners();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array6 = jMultiLineToolTip0.getMouseMotionListeners();
    java.awt.event.InputMethodListener inputMethodListener7 = null;
    jMultiLineToolTip0.addInputMethodListener(inputMethodListener7);
    jMultiLineToolTip0.setBounds((int)(short)10, 0, (int)(short)100, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vetoableChangeListener_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array6);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

    crystal.model.Relationship.MERGECONFLICT = "AHEAD";

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    crystal.util.ValidInputChecker.checkValidStringInput("%5p - %m%n");

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

    // The following exception was thrown during execution in test generation
    try {
    boolean b3 = crystal.util.RunIt.validGit((double)(short)0, "Action: hg merge", "TEST");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip0.firePropertyChange("", (double)0L, 0.0d);
    boolean b5 = jMultiLineToolTip0.getIgnoreRepaint();
    jMultiLineToolTip0.enable();
    java.awt.im.InputMethodRequests inputMethodRequests7 = jMultiLineToolTip0.getInputMethodRequests();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array8 = jMultiLineToolTip0.getMouseMotionListeners();
    float f9 = jMultiLineToolTip0.getAlignmentX();
    crystal.util.JMultiLineToolTip jMultiLineToolTip10 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle11 = null;
    java.awt.Rectangle rectangle12 = jMultiLineToolTip10.getBounds(rectangle11);
    java.awt.Insets insets13 = jMultiLineToolTip10.getInsets();
    boolean b14 = jMultiLineToolTip10.hasFocus();
    crystal.util.JMultiLineToolTip jMultiLineToolTip15 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle16 = null;
    java.awt.Rectangle rectangle17 = jMultiLineToolTip15.getBounds(rectangle16);
    java.awt.Event event18 = null;
    boolean b20 = jMultiLineToolTip15.action(event18, (java.lang.Object)'4');
    java.awt.Component component23 = jMultiLineToolTip15.locate((int)'4', 1);
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.add((java.awt.Component)jMultiLineToolTip10, (java.lang.Object)jMultiLineToolTip15, 128);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputMethodRequests7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f9 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component23);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "$HOME", "$HOME", "AHEAD" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str4 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str4, str_array3);
    java.lang.String[] str_array14 = new java.lang.String[] { "0 ms", "$HOME", "", "$HOME", "$HOME", "415725 hours 21 min", "", "$HOME" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str15 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str15, str_array14);
    java.util.Set<java.lang.String> set_str17 = crystal.util.SetOperations.setDifference((java.util.Set<java.lang.String>)linkedhashset_str4, (java.util.Set<java.lang.String>)linkedhashset_str15);
    java.lang.String[] str_array21 = new java.lang.String[] { "$HOME", "$HOME", "AHEAD" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str22 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str22, str_array21);
    java.lang.String[] str_array32 = new java.lang.String[] { "0 ms", "$HOME", "", "$HOME", "$HOME", "415725 hours 21 min", "", "$HOME" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str33 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str33, str_array32);
    java.util.Set<java.lang.String> set_str35 = crystal.util.SetOperations.setDifference((java.util.Set<java.lang.String>)linkedhashset_str22, (java.util.Set<java.lang.String>)linkedhashset_str33);
    java.lang.String[] str_array39 = new java.lang.String[] { "$HOME", "$HOME", "AHEAD" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str40 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str40, str_array39);
    java.lang.String[] str_array50 = new java.lang.String[] { "0 ms", "$HOME", "", "$HOME", "$HOME", "415725 hours 21 min", "", "$HOME" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str51 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str51, str_array50);
    java.util.Set<java.lang.String> set_str53 = crystal.util.SetOperations.setDifference((java.util.Set<java.lang.String>)linkedhashset_str40, (java.util.Set<java.lang.String>)linkedhashset_str51);
    java.util.Set<java.lang.String> set_str54 = crystal.util.SetOperations.xor(set_str35, set_str53);
    java.lang.String[] str_array58 = new java.lang.String[] { "$HOME", "$HOME", "AHEAD" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str59 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str59, str_array58);
    java.lang.String[] str_array69 = new java.lang.String[] { "0 ms", "$HOME", "", "$HOME", "$HOME", "415725 hours 21 min", "", "$HOME" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str70 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str70, str_array69);
    java.util.Set<java.lang.String> set_str72 = crystal.util.SetOperations.setDifference((java.util.Set<java.lang.String>)linkedhashset_str59, (java.util.Set<java.lang.String>)linkedhashset_str70);
    java.lang.String[] str_array76 = new java.lang.String[] { "$HOME", "$HOME", "AHEAD" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str77 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str77, str_array76);
    java.lang.String[] str_array87 = new java.lang.String[] { "0 ms", "$HOME", "", "$HOME", "$HOME", "415725 hours 21 min", "", "$HOME" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str88 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str88, str_array87);
    java.util.Set<java.lang.String> set_str90 = crystal.util.SetOperations.setDifference((java.util.Set<java.lang.String>)linkedhashset_str77, (java.util.Set<java.lang.String>)linkedhashset_str88);
    java.util.Set<java.lang.String> set_str91 = crystal.util.SetOperations.xor(set_str72, set_str90);
    java.util.Set<java.lang.String> set_str92 = crystal.util.SetOperations.union(set_str54, set_str90);
    boolean b93 = crystal.util.SetOperations.isSuperset(set_str17, set_str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == true);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

    crystal.model.RevisionHistory.Action action0 = crystal.model.RevisionHistory.Action.PUBLISH;
    org.junit.Assert.assertTrue("'" + action0 + "' != '" + crystal.model.RevisionHistory.Action.PUBLISH + "'", action0.equals(crystal.model.RevisionHistory.Action.PUBLISH));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    jMultiLineToolTip0.setFocusTraversalPolicyProvider(false);
    // The following exception was thrown during execution in test generation
    try {
    int i15 = jMultiLineToolTip0.getBaseline((int)'4', (int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager7 = null;
    jMultiLineToolTip0.setLayout(layoutManager7);
    boolean b9 = jMultiLineToolTip0.isFocusOwner();
    boolean b10 = jMultiLineToolTip0.isShowing();
    java.awt.Graphics graphics11 = null;
    jMultiLineToolTip0.update(graphics11);
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Component component14 = jMultiLineToolTip0.getComponent(32);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.beans.VetoableChangeListener[] vetoableChangeListener_array5 = jMultiLineToolTip0.getVetoableChangeListeners();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array6 = jMultiLineToolTip0.getMouseMotionListeners();
    java.awt.event.ContainerListener containerListener7 = null;
    jMultiLineToolTip0.addContainerListener(containerListener7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vetoableChangeListener_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array6);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip0.firePropertyChange("", (double)0L, 0.0d);
    java.beans.PropertyChangeListener propertyChangeListener6 = null;
    jMultiLineToolTip0.removePropertyChangeListener("0 ms", propertyChangeListener6);
    javax.swing.event.AncestorListener ancestorListener8 = null;
    jMultiLineToolTip0.addAncestorListener(ancestorListener8);
    jMultiLineToolTip0.setDebugGraphicsOptions(6);
    crystal.util.JMultiLineToolTip jMultiLineToolTip12 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle13 = null;
    java.awt.Rectangle rectangle14 = jMultiLineToolTip12.getBounds(rectangle13);
    java.awt.Toolkit toolkit15 = jMultiLineToolTip12.getToolkit();
    jMultiLineToolTip12.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager19 = null;
    jMultiLineToolTip12.setLayout(layoutManager19);
    crystal.util.JMultiLineToolTip jMultiLineToolTip21 = new crystal.util.JMultiLineToolTip();
    boolean b22 = jMultiLineToolTip21.isFocusTraversalPolicyProvider();
    jMultiLineToolTip21.firePropertyChange("hi!", ' ', '#');
    java.awt.Dimension dimension27 = jMultiLineToolTip21.getMaximumSize();
    java.awt.Dimension dimension28 = jMultiLineToolTip12.getSize(dimension27);
    javax.swing.event.AncestorListener[] ancestorListener_array29 = jMultiLineToolTip12.getAncestorListeners();
    crystal.model.DataSource.RepoKind repoKind34 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment37 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind34, false, "hi!");
    crystal.model.Environment environment40 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind34, true, "PENDING");
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.add((java.awt.Component)jMultiLineToolTip12, (java.lang.Object)"AHEAD", 32);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ancestorListener_array29);
    org.junit.Assert.assertTrue("'" + repoKind34 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind34.equals(crystal.model.DataSource.RepoKind.HG));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }

    javax.swing.JPanel jPanel0 = null;
    // The following exception was thrown during execution in test generation
    try {
    crystal.util.SpringLayoutUtility.formGridInColumn(jPanel0, 0, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }

    crystal.client.ClientPreferences clientPreferences0 = crystal.client.ClientPreferences.DEFAULT_CLIENT_PREFERENCES;
    // The following exception was thrown during execution in test generation
    try {
    crystal.client.ProjectPreferences projectPreferences2 = clientPreferences0.getProjectPreferences("415725 hours 21 min");
      org.junit.Assert.fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clientPreferences0);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }

    java.lang.String str0 = crystal.model.LocalStateResult.GIT_MUST_RESOLVE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AHEAD"+ "'", str0.equals("AHEAD"));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.beans.VetoableChangeListener[] vetoableChangeListener_array5 = jMultiLineToolTip0.getVetoableChangeListeners();
    jMultiLineToolTip0.transferFocusUpCycle();
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Component component8 = jMultiLineToolTip0.getComponent((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vetoableChangeListener_array5);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }

    java.lang.String str0 = crystal.model.Relationship.ERROR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ERROR"+ "'", str0.equals("ERROR"));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }

    crystal.model.Relationship.ERROR = "AHEAD";

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener[] propertyChangeListener_array9 = jMultiLineToolTip0.getPropertyChangeListeners();
    crystal.util.JMultiLineToolTip jMultiLineToolTip10 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle11 = null;
    java.awt.Rectangle rectangle12 = jMultiLineToolTip10.getBounds(rectangle11);
    java.awt.Toolkit toolkit13 = jMultiLineToolTip10.getToolkit();
    java.awt.Font font14 = null;
    jMultiLineToolTip10.setFont(font14);
    java.awt.Color color16 = jMultiLineToolTip10.getBackground();
    jMultiLineToolTip0.setForeground(color16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color16);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }

    crystal.client.ConflictClient conflictClient0 = new crystal.client.ConflictClient();
    crystal.client.ClientPreferences clientPreferences5 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences6 = null;
    clientPreferences5.addProjectPreferences(projectPreferences6);
    // The following exception was thrown during execution in test generation
    try {
    conflictClient0.reloadWindowBody(clientPreferences5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }

    crystal.model.LocalStateResult.ERROR = "Action: hg merge";

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }

    crystal.model.RevisionHistory.When when0 = crystal.model.RevisionHistory.When.NOTHING;
    org.junit.Assert.assertTrue("'" + when0 + "' != '" + crystal.model.RevisionHistory.When.NOTHING + "'", when0.equals(crystal.model.RevisionHistory.When.NOTHING));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }

    int i0 = java.awt.image.ImageObserver.SOMEBITS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 8);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }

    crystal.model.RevisionHistory.Ease ease0 = crystal.server.GuidanceChecker.getEase();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(ease0);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip0.firePropertyChange("", (double)0L, 0.0d);
    boolean b5 = jMultiLineToolTip0.getIgnoreRepaint();
    jMultiLineToolTip0.enable();
    boolean b7 = jMultiLineToolTip0.isForegroundSet();
    java.awt.Dimension dimension8 = jMultiLineToolTip0.getMinimumSize();
    java.awt.Container container9 = jMultiLineToolTip0.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container9);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }

    crystal.model.DataSource.RepoKind repoKind2 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment5 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind2, false, "hi!");
    environment5.setShortName("PENDING");
    environment5.setParent("%5p - %m%n");
    org.junit.Assert.assertTrue("'" + repoKind2 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind2.equals(crystal.model.DataSource.RepoKind.HG));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }

    java.lang.String str0 = crystal.model.Relationship.SAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "SAME"+ "'", str0.equals("SAME"));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }

    int i0 = java.awt.Frame.NW_RESIZE_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 6);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip0.firePropertyChange("", (double)0L, 0.0d);
    boolean b5 = jMultiLineToolTip0.getIgnoreRepaint();
    jMultiLineToolTip0.enable();
    java.awt.im.InputMethodRequests inputMethodRequests7 = jMultiLineToolTip0.getInputMethodRequests();
    java.awt.Rectangle rectangle8 = jMultiLineToolTip0.getVisibleRect();
    java.io.PrintStream printStream9 = null;
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.list(printStream9, 5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputMethodRequests7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }

    crystal.model.LocalStateResult.HG_MUST_RESOLVE = "TEST";

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    jMultiLineToolTip0.firePropertyChange("hi!", ' ', '#');
    java.awt.Dimension dimension6 = jMultiLineToolTip0.getMaximumSize();
    boolean b7 = jMultiLineToolTip0.isFocusTraversalPolicySet();
    java.awt.Graphics graphics8 = null;
    jMultiLineToolTip0.printAll(graphics8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }

    java.lang.String str1 = crystal.util.TimeUtility.msToHumanReadable((long)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32 ms"+ "'", str1.equals("32 ms"));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b6 = jMultiLineToolTip0.mouseDrag(event3, 32, 1);
    java.awt.Graphics graphics7 = null;
    jMultiLineToolTip0.printComponents(graphics7);
    java.awt.event.FocusListener[] focusListener_array9 = jMultiLineToolTip0.getFocusListeners();
    java.awt.Dimension dimension10 = null;
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.resize(dimension10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array9);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }

    crystal.model.LocalStateResult.PENDING = "2017-06-04T14-21-48.265-0700";

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }

    crystal.server.GitLogParser gitLogParser0 = new crystal.server.GitLogParser();

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.Font font4 = null;
    jMultiLineToolTip0.setFont(font4);
    java.awt.Color color6 = jMultiLineToolTip0.getBackground();
    jMultiLineToolTip0.show();
    int i8 = jMultiLineToolTip0.getColumns();
    java.awt.Component component9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Component component11 = jMultiLineToolTip0.add(component9, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }

    int i0 = java.awt.Frame.MAXIMIZED_VERT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 4);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    jMultiLineToolTip0.setFocusTraversalPolicyProvider(false);
    jMultiLineToolTip0.repaint((long)'a');
    java.beans.PropertyChangeListener[] propertyChangeListener_array16 = jMultiLineToolTip0.getPropertyChangeListeners("2017-06-04T14-21-48.265-0700");
    jMultiLineToolTip0.setFocusable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array16);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }

    crystal.client.ProjectPreferences projectPreferences0 = null;
    crystal.client.ClientPreferences clientPreferences1 = null;
    javax.swing.JFrame jFrame2 = null;
    javax.swing.JTabbedPane jTabbedPane3 = null;
    java.util.Map<javax.swing.JComponent,java.lang.Boolean> map_jComponent_b4 = null;
    crystal.client.ProjectPreferences projectPreferences5 = null;
    java.util.Map<javax.swing.JTextField,java.lang.Boolean> map_jTextField_b6 = null;
    // The following exception was thrown during execution in test generation
    try {
    crystal.client.ProjectPanel projectPanel7 = new crystal.client.ProjectPanel(projectPreferences0, clientPreferences1, jFrame2, jTabbedPane3, map_jComponent_b4, projectPreferences5, map_jTextField_b6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    jMultiLineToolTip0.setFocusTraversalPolicyProvider(false);
    jMultiLineToolTip0.grabFocus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    java.awt.Point point11 = jMultiLineToolTip0.getLocation();
    jMultiLineToolTip0.setDoubleBuffered(true);
    boolean b14 = jMultiLineToolTip0.getVerifyInputWhenFocusTarget();
    java.io.PrintStream printStream15 = null;
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.list(printStream15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }

    crystal.model.Relationship.TESTCONFLICT = "";

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color1 = null;
    jMultiLineToolTip0.setBackground(color1);
    jMultiLineToolTip0.transferFocusBackward();
    jMultiLineToolTip0.firePropertyChange("$HOME", false, false);
    javax.swing.JPopupMenu jPopupMenu8 = jMultiLineToolTip0.getComponentPopupMenu();
    crystal.util.JMultiLineToolTip jMultiLineToolTip9 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle10 = null;
    java.awt.Rectangle rectangle11 = jMultiLineToolTip9.getBounds(rectangle10);
    java.awt.Rectangle rectangle12 = jMultiLineToolTip9.getVisibleRect();
    boolean b13 = jMultiLineToolTip9.isEnabled();
    java.awt.Dimension dimension14 = null;
    jMultiLineToolTip9.setPreferredSize(dimension14);
    crystal.util.JMultiLineToolTip jMultiLineToolTip16 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle17 = null;
    java.awt.Rectangle rectangle18 = jMultiLineToolTip16.getBounds(rectangle17);
    java.awt.Event event19 = null;
    boolean b21 = jMultiLineToolTip16.action(event19, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel22 = jMultiLineToolTip16.getColorModel();
    boolean b23 = jMultiLineToolTip9.isAncestorOf((java.awt.Component)jMultiLineToolTip16);
    jMultiLineToolTip9.disable();
    crystal.util.JMultiLineToolTip jMultiLineToolTip25 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle26 = null;
    java.awt.Rectangle rectangle27 = jMultiLineToolTip25.getBounds(rectangle26);
    java.awt.Rectangle rectangle28 = jMultiLineToolTip25.getVisibleRect();
    boolean b29 = jMultiLineToolTip25.isEnabled();
    java.awt.Event event30 = null;
    boolean b33 = jMultiLineToolTip25.mouseEnter(event30, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener34 = null;
    jMultiLineToolTip25.addPropertyChangeListener(propertyChangeListener34);
    java.awt.Point point36 = jMultiLineToolTip25.getLocation();
    java.awt.Point point37 = jMultiLineToolTip9.getLocation(point36);
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Component component38 = jPopupMenu8.findComponentAt(point36);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jPopupMenu8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point37);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    crystal.util.JMultiLineToolTip jMultiLineToolTip6 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle7 = null;
    java.awt.Rectangle rectangle8 = jMultiLineToolTip6.getBounds(rectangle7);
    java.awt.Event event9 = null;
    boolean b11 = jMultiLineToolTip6.action(event9, (java.lang.Object)'4');
    jMultiLineToolTip0.setComponent((javax.swing.JComponent)jMultiLineToolTip6);
    int i13 = jMultiLineToolTip6.countComponents();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    javax.swing.KeyStroke keyStroke11 = null;
    jMultiLineToolTip0.unregisterKeyboardAction(keyStroke11);
    jMultiLineToolTip0.enableInputMethods(false);
    java.awt.event.ComponentListener componentListener15 = null;
    jMultiLineToolTip0.addComponentListener(componentListener15);
    jMultiLineToolTip0.invalidate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }

    crystal.client.ProjectPreferences projectPreferences0 = null;
    crystal.client.ClientPreferences clientPreferences5 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.util.JMultiLineToolTip jMultiLineToolTip6 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle7 = null;
    java.awt.Rectangle rectangle8 = jMultiLineToolTip6.getBounds(rectangle7);
    java.awt.Rectangle rectangle9 = jMultiLineToolTip6.getVisibleRect();
    boolean b10 = jMultiLineToolTip6.isEnabled();
    java.beans.VetoableChangeListener[] vetoableChangeListener_array11 = jMultiLineToolTip6.getVetoableChangeListeners();
    boolean b12 = clientPreferences5.equals((java.lang.Object)vetoableChangeListener_array11);
    clientPreferences5.setTempDirectory("415725 hours 21 min");
    javax.swing.JFrame jFrame15 = null;
    javax.swing.JTabbedPane jTabbedPane16 = null;
    java.util.Map<javax.swing.JComponent,java.lang.Boolean> map_jComponent_b17 = null;
    crystal.client.ProjectPreferences projectPreferences18 = null;
    java.util.Map<javax.swing.JTextField,java.lang.Boolean> map_jTextField_b19 = null;
    // The following exception was thrown during execution in test generation
    try {
    crystal.client.ProjectPanel projectPanel20 = new crystal.client.ProjectPanel(projectPreferences0, clientPreferences5, jFrame15, jTabbedPane16, map_jComponent_b17, projectPreferences18, map_jTextField_b19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vetoableChangeListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }

    boolean b0 = crystal.Constants.DEBUG_RUNIT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b0 == false);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip0.firePropertyChange("", (double)0L, 0.0d);
    java.awt.Graphics graphics5 = null;
    jMultiLineToolTip0.printAll(graphics5);
    java.awt.event.MouseEvent mouseEvent7 = null;
    java.lang.String str8 = jMultiLineToolTip0.getToolTipText(mouseEvent7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.deliverEvent(event3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }

    crystal.client.ProjectPreferences projectPreferences0 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener1 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener2 = null;
    crystal.client.CalculateProjectTask calculateProjectTask3 = new crystal.client.CalculateProjectTask(projectPreferences0, computationListener1, computationListener2);
    java.beans.PropertyChangeSupport propertyChangeSupport4 = calculateProjectTask3.getPropertyChangeSupport();
    java.beans.PropertyChangeListener propertyChangeListener5 = null;
    calculateProjectTask3.addPropertyChangeListener(propertyChangeListener5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeSupport4);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }

    java.lang.String str0 = crystal.model.Relationship.MERGECONFLICT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AHEAD"+ "'", str0.equals("AHEAD"));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }

    javax.swing.ImageIcon imageIcon1 = null;
    java.awt.Image image2 = null;
    crystal.model.Relationship relationship3 = new crystal.model.Relationship("AHEAD", imageIcon1, image2);
    crystal.util.JMultiLineToolTip jMultiLineToolTip4 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle5 = null;
    java.awt.Rectangle rectangle6 = jMultiLineToolTip4.getBounds(rectangle5);
    java.awt.Rectangle rectangle7 = jMultiLineToolTip4.getVisibleRect();
    boolean b8 = jMultiLineToolTip4.isEnabled();
    java.awt.Event event9 = null;
    boolean b12 = jMultiLineToolTip4.mouseEnter(event9, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener13 = null;
    jMultiLineToolTip4.addPropertyChangeListener(propertyChangeListener13);
    java.awt.Point point15 = jMultiLineToolTip4.getLocation();
    boolean b16 = relationship3.equals((java.lang.Object)jMultiLineToolTip4);
    crystal.util.JMultiLineToolTip jMultiLineToolTip17 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip17.firePropertyChange("", (double)0L, 0.0d);
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Component component23 = jMultiLineToolTip4.add((java.awt.Component)jMultiLineToolTip17, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager7 = null;
    jMultiLineToolTip0.setLayout(layoutManager7);
    boolean b9 = jMultiLineToolTip0.isFocusOwner();
    boolean b10 = jMultiLineToolTip0.isShowing();
    java.awt.Graphics graphics11 = null;
    jMultiLineToolTip0.update(graphics11);
    java.awt.Font font13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.FontMetrics fontMetrics14 = jMultiLineToolTip0.getFontMetrics(font13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip0.firePropertyChange("", (double)0L, 0.0d);
    java.beans.PropertyChangeListener propertyChangeListener6 = null;
    jMultiLineToolTip0.removePropertyChangeListener("0 ms", propertyChangeListener6);
    javax.swing.event.AncestorListener ancestorListener8 = null;
    jMultiLineToolTip0.addAncestorListener(ancestorListener8);
    boolean b12 = jMultiLineToolTip0.contains((int)(byte)0, 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ClientPreferences clientPreferences5 = clientPreferences4.clone();
    crystal.client.ClientPreferences.DEFAULT_CLIENT_PREFERENCES = clientPreferences4;
    clientPreferences4.setGitPath("TEST");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clientPreferences5);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.event.InputMethodListener inputMethodListener6 = null;
    jMultiLineToolTip0.removeInputMethodListener(inputMethodListener6);
    java.awt.Graphics graphics8 = null;
    jMultiLineToolTip0.print(graphics8);
    java.awt.dnd.DropTarget dropTarget10 = null;
    jMultiLineToolTip0.setDropTarget(dropTarget10);
    java.awt.Graphics graphics12 = jMultiLineToolTip0.getGraphics();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphics12);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.event.InputMethodListener inputMethodListener6 = null;
    jMultiLineToolTip0.removeInputMethodListener(inputMethodListener6);
    java.awt.Graphics graphics8 = null;
    jMultiLineToolTip0.print(graphics8);
    java.awt.Event event10 = null;
    boolean b13 = jMultiLineToolTip0.mouseMove(event10, (int)(byte)1, 100);
    boolean b14 = jMultiLineToolTip0.isEnabled();
    java.awt.Dimension dimension15 = jMultiLineToolTip0.preferredSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension15);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }

    crystal.server.GitStateChecker gitStateChecker0 = new crystal.server.GitStateChecker();

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }

    java.lang.String str0 = crystal.model.LocalStateResult.GIT_UNCHECKPOINTED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "0 ms"+ "'", str0.equals("0 ms"));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Dimension dimension5 = null;
    jMultiLineToolTip0.setPreferredSize(dimension5);
    crystal.util.JMultiLineToolTip jMultiLineToolTip7 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle8 = null;
    java.awt.Rectangle rectangle9 = jMultiLineToolTip7.getBounds(rectangle8);
    java.awt.Event event10 = null;
    boolean b12 = jMultiLineToolTip7.action(event10, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel13 = jMultiLineToolTip7.getColorModel();
    boolean b14 = jMultiLineToolTip0.isAncestorOf((java.awt.Component)jMultiLineToolTip7);
    jMultiLineToolTip0.disable();
    crystal.util.JMultiLineToolTip jMultiLineToolTip16 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle17 = null;
    java.awt.Rectangle rectangle18 = jMultiLineToolTip16.getBounds(rectangle17);
    java.awt.Rectangle rectangle19 = jMultiLineToolTip16.getVisibleRect();
    boolean b20 = jMultiLineToolTip16.isEnabled();
    java.awt.Event event21 = null;
    boolean b24 = jMultiLineToolTip16.mouseEnter(event21, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener25 = null;
    jMultiLineToolTip16.addPropertyChangeListener(propertyChangeListener25);
    java.awt.Point point27 = jMultiLineToolTip16.getLocation();
    java.awt.Point point28 = jMultiLineToolTip0.getLocation(point27);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<java.awt.AWTKeyStroke> set_aWTKeyStroke30 = jMultiLineToolTip0.getFocusTraversalKeys((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point28);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }

    crystal.model.Relationship.BEHIND = "ToolTipUI";

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    crystal.util.JMultiLineToolTip jMultiLineToolTip5 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle6 = null;
    java.awt.Rectangle rectangle7 = jMultiLineToolTip5.getBounds(rectangle6);
    java.awt.Toolkit toolkit8 = jMultiLineToolTip5.getToolkit();
    jMultiLineToolTip5.setSize(32, (int)(byte)-1);
    java.awt.image.ImageProducer imageProducer12 = null;
    java.awt.Image image13 = jMultiLineToolTip5.createImage(imageProducer12);
    crystal.util.JMultiLineToolTip jMultiLineToolTip14 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle15 = null;
    java.awt.Rectangle rectangle16 = jMultiLineToolTip14.getBounds(rectangle15);
    java.awt.Rectangle rectangle17 = jMultiLineToolTip14.getVisibleRect();
    boolean b18 = jMultiLineToolTip14.isEnabled();
    java.awt.Dimension dimension19 = null;
    jMultiLineToolTip14.setPreferredSize(dimension19);
    jMultiLineToolTip14.move(10, (int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
    boolean b24 = jMultiLineToolTip0.prepareImage(image13, (java.awt.image.ImageObserver)jMultiLineToolTip14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences5 = null;
    clientPreferences4.addProjectPreferences(projectPreferences5);
    // The following exception was thrown during execution in test generation
    try {
    clientPreferences4.removeProjectPreferencesAtIndex((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }

    crystal.client.ClientPreferences.NonexistentProjectException nonexistentProjectException1 = new crystal.client.ClientPreferences.NonexistentProjectException("%5p - %m%n");

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Dimension dimension5 = null;
    jMultiLineToolTip0.setPreferredSize(dimension5);
    java.awt.image.VolatileImage volatileImage9 = jMultiLineToolTip0.createVolatileImage(11, (int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(volatileImage9);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.beans.VetoableChangeListener[] vetoableChangeListener_array5 = jMultiLineToolTip0.getVetoableChangeListeners();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array6 = jMultiLineToolTip0.getMouseMotionListeners();
    java.awt.event.InputMethodListener inputMethodListener7 = null;
    jMultiLineToolTip0.addInputMethodListener(inputMethodListener7);
    crystal.util.JMultiLineToolTip jMultiLineToolTip9 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle10 = null;
    java.awt.Rectangle rectangle11 = jMultiLineToolTip9.getBounds(rectangle10);
    java.awt.Toolkit toolkit12 = jMultiLineToolTip9.getToolkit();
    jMultiLineToolTip9.setSize(32, (int)(byte)-1);
    java.awt.image.ImageProducer imageProducer16 = null;
    java.awt.Image image17 = jMultiLineToolTip9.createImage(imageProducer16);
    crystal.util.JMultiLineToolTip jMultiLineToolTip20 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle21 = null;
    java.awt.Rectangle rectangle22 = jMultiLineToolTip20.getBounds(rectangle21);
    java.awt.Toolkit toolkit23 = jMultiLineToolTip20.getToolkit();
    jMultiLineToolTip20.setSize(32, (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener28 = null;
    jMultiLineToolTip20.removePropertyChangeListener("415725 hours 21 min", propertyChangeListener28);
    java.awt.event.FocusListener focusListener30 = null;
    jMultiLineToolTip20.addFocusListener(focusListener30);
    javax.swing.event.AncestorListener ancestorListener32 = null;
    jMultiLineToolTip20.removeAncestorListener(ancestorListener32);
    // The following exception was thrown during execution in test generation
    try {
    boolean b34 = jMultiLineToolTip0.prepareImage(image17, 3, (int)' ', (java.awt.image.ImageObserver)jMultiLineToolTip20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vetoableChangeListener_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit23);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }

    crystal.client.ConflictClient conflictClient0 = new crystal.client.ConflictClient();
    crystal.client.ClientPreferences clientPreferences5 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences6 = null;
    clientPreferences5.addProjectPreferences(projectPreferences6);
    crystal.client.ProjectPreferences projectPreferences8 = null;
    clientPreferences5.removeProjectPreferences(projectPreferences8);
    crystal.client.ClientPreferences clientPreferences10 = clientPreferences5.clone();
    // The following exception was thrown during execution in test generation
    try {
    conflictClient0.reloadWindowBody(clientPreferences5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clientPreferences10);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.im.InputMethodRequests inputMethodRequests7 = jMultiLineToolTip0.getInputMethodRequests();
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.remove((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputMethodRequests7);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip0.firePropertyChange("", (double)0L, 0.0d);
    boolean b5 = jMultiLineToolTip0.getIgnoreRepaint();
    jMultiLineToolTip0.invalidate();
    java.awt.peer.ComponentPeer componentPeer7 = jMultiLineToolTip0.getPeer();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentPeer7);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }

    java.util.HashMap<java.lang.String,crystal.server.AbstractLogParser.Checkpoint> hashmap_str_checkpoint1 = crystal.server.HgLogParser.parseLog("PENDING");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_str_checkpoint1);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.event.InputMethodListener inputMethodListener6 = null;
    jMultiLineToolTip0.removeInputMethodListener(inputMethodListener6);
    jMultiLineToolTip0.invalidate();
    java.awt.Component component11 = jMultiLineToolTip0.getComponentAt(3, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component11);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }

    java.util.Map<crystal.server.AbstractLogParser.CheckpointLabels,java.lang.String> map_checkpointLabels_str0 = crystal.server.HgLogParser.hgCheckpoint;
    crystal.server.HgLogParser.hgCheckpoint = map_checkpointLabels_str0;
    crystal.server.GitLogParser.gitCheckpoint = map_checkpointLabels_str0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_checkpointLabels_str0);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }

    org.jdom.Document document1 = crystal.util.XMLTools.readXMLDocument("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(document1);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener8 = null;
    jMultiLineToolTip0.removePropertyChangeListener("415725 hours 21 min", propertyChangeListener8);
    java.awt.event.FocusListener focusListener10 = null;
    jMultiLineToolTip0.addFocusListener(focusListener10);
    javax.swing.event.AncestorListener ancestorListener12 = null;
    jMultiLineToolTip0.removeAncestorListener(ancestorListener12);
    java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListener_array14 = jMultiLineToolTip0.getHierarchyBoundsListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyBoundsListener_array14);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }

    java.util.Date date0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str1 = crystal.util.TimeUtility.formatLSMRDate(date0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip0.firePropertyChange("", (double)0L, 0.0d);
    java.awt.Graphics graphics5 = null;
    jMultiLineToolTip0.printAll(graphics5);
    crystal.util.JMultiLineToolTip jMultiLineToolTip7 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle8 = null;
    java.awt.Rectangle rectangle9 = jMultiLineToolTip7.getBounds(rectangle8);
    java.awt.Toolkit toolkit10 = jMultiLineToolTip7.getToolkit();
    java.awt.Font font11 = null;
    jMultiLineToolTip7.setFont(font11);
    java.awt.Color color13 = jMultiLineToolTip7.getBackground();
    crystal.util.JMultiLineToolTip jMultiLineToolTip14 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle15 = null;
    java.awt.Rectangle rectangle16 = jMultiLineToolTip14.getBounds(rectangle15);
    crystal.util.JMultiLineToolTip jMultiLineToolTip17 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle18 = null;
    java.awt.Rectangle rectangle19 = jMultiLineToolTip17.getBounds(rectangle18);
    jMultiLineToolTip14.repaint(rectangle19);
    java.awt.Rectangle rectangle21 = jMultiLineToolTip7.getBounds(rectangle19);
    java.awt.Rectangle rectangle22 = jMultiLineToolTip0.getBounds(rectangle21);
    java.awt.Insets insets23 = jMultiLineToolTip0.getInsets();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets23);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.event.MouseListener mouseListener5 = null;
    jMultiLineToolTip0.removeMouseListener(mouseListener5);
    java.awt.Graphics graphics7 = null;
    jMultiLineToolTip0.print(graphics7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "$HOME", "$HOME", "AHEAD" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str4 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str4, str_array3);
    java.lang.String[] str_array14 = new java.lang.String[] { "0 ms", "$HOME", "", "$HOME", "$HOME", "415725 hours 21 min", "", "$HOME" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str15 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str15, str_array14);
    java.util.Set<java.lang.String> set_str17 = crystal.util.SetOperations.setDifference((java.util.Set<java.lang.String>)linkedhashset_str4, (java.util.Set<java.lang.String>)linkedhashset_str15);
    java.lang.String[] str_array21 = new java.lang.String[] { "$HOME", "$HOME", "AHEAD" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str22 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str22, str_array21);
    java.lang.String[] str_array32 = new java.lang.String[] { "0 ms", "$HOME", "", "$HOME", "$HOME", "415725 hours 21 min", "", "$HOME" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str33 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str33, str_array32);
    java.util.Set<java.lang.String> set_str35 = crystal.util.SetOperations.setDifference((java.util.Set<java.lang.String>)linkedhashset_str22, (java.util.Set<java.lang.String>)linkedhashset_str33);
    java.util.Set<java.lang.String> set_str36 = crystal.util.SetOperations.xor(set_str17, set_str35);
    java.lang.String[] str_array40 = new java.lang.String[] { "$HOME", "$HOME", "AHEAD" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str41 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str41, str_array40);
    java.lang.String[] str_array51 = new java.lang.String[] { "0 ms", "$HOME", "", "$HOME", "$HOME", "415725 hours 21 min", "", "$HOME" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str52 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str52, str_array51);
    java.util.Set<java.lang.String> set_str54 = crystal.util.SetOperations.setDifference((java.util.Set<java.lang.String>)linkedhashset_str41, (java.util.Set<java.lang.String>)linkedhashset_str52);
    java.lang.String[] str_array58 = new java.lang.String[] { "$HOME", "$HOME", "AHEAD" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str59 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str59, str_array58);
    java.lang.String[] str_array69 = new java.lang.String[] { "0 ms", "$HOME", "", "$HOME", "$HOME", "415725 hours 21 min", "", "$HOME" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str70 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str70, str_array69);
    java.util.Set<java.lang.String> set_str72 = crystal.util.SetOperations.setDifference((java.util.Set<java.lang.String>)linkedhashset_str59, (java.util.Set<java.lang.String>)linkedhashset_str70);
    java.util.Set<java.lang.String> set_str73 = crystal.util.SetOperations.xor(set_str54, set_str72);
    java.util.Set<java.lang.String> set_str74 = crystal.util.SetOperations.intersection(set_str35, set_str72);
    java.lang.String[] str_array76 = new java.lang.String[] { "$HOME" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str77 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str77, str_array76);
    boolean b79 = crystal.util.SetOperations.isSubset(set_str72, (java.util.Set<java.lang.String>)linkedhashset_str77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }

    float f0 = java.awt.Component.RIGHT_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 1.0f);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }

    crystal.client.ClientPreferences.DuplicateProjectNameException duplicateProjectNameException1 = new crystal.client.ClientPreferences.DuplicateProjectNameException("2017-06-04T14-21-48.265-0700");

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Dimension dimension5 = null;
    jMultiLineToolTip0.setPreferredSize(dimension5);
    jMultiLineToolTip0.move(10, (int)(short)10);
    java.awt.event.KeyListener[] keyListener_array10 = jMultiLineToolTip0.getKeyListeners();
    java.awt.Graphics graphics11 = null;
    jMultiLineToolTip0.print(graphics11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(keyListener_array10);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }

    java.util.Locale locale0 = null;
    javax.swing.JComponent.setDefaultLocale(locale0);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }

    java.io.File file0 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b1 = crystal.util.RunIt.deleteDirectory(file0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }

    crystal.util.RunIt runIt0 = new crystal.util.RunIt();

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    javax.swing.KeyStroke keyStroke11 = null;
    jMultiLineToolTip0.unregisterKeyboardAction(keyStroke11);
    crystal.util.JMultiLineToolTip jMultiLineToolTip13 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle14 = null;
    java.awt.Rectangle rectangle15 = jMultiLineToolTip13.getBounds(rectangle14);
    java.awt.Rectangle rectangle16 = jMultiLineToolTip13.getVisibleRect();
    jMultiLineToolTip0.paintImmediately(rectangle16);
    jMultiLineToolTip0.firePropertyChange("%5p - %m%n", 'a', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }

    crystal.model.Relationship.COMPILECONFLICT = "hi!";

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences5 = null;
    clientPreferences4.addProjectPreferences(projectPreferences5);
    clientPreferences4.setGitPath("");
    crystal.client.ProjectPreferences projectPreferences9 = null;
    clientPreferences4.removeProjectPreferences(projectPreferences9);
    // The following exception was thrown during execution in test generation
    try {
    crystal.client.ProjectPreferences projectPreferences12 = clientPreferences4.getProjectPreferences("");
      org.junit.Assert.fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    java.awt.Dimension dimension11 = jMultiLineToolTip0.preferredSize();
    boolean b12 = jMultiLineToolTip0.getIgnoreRepaint();
    java.lang.String str13 = jMultiLineToolTip0.getTipText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    crystal.util.JMultiLineToolTip jMultiLineToolTip6 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle7 = null;
    java.awt.Rectangle rectangle8 = jMultiLineToolTip6.getBounds(rectangle7);
    java.awt.Event event9 = null;
    boolean b11 = jMultiLineToolTip6.action(event9, (java.lang.Object)'4');
    jMultiLineToolTip0.setComponent((javax.swing.JComponent)jMultiLineToolTip6);
    crystal.util.JMultiLineToolTip jMultiLineToolTip13 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle14 = null;
    java.awt.Rectangle rectangle15 = jMultiLineToolTip13.getBounds(rectangle14);
    java.awt.Toolkit toolkit16 = jMultiLineToolTip13.getToolkit();
    jMultiLineToolTip13.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager20 = null;
    jMultiLineToolTip13.setLayout(layoutManager20);
    boolean b22 = jMultiLineToolTip13.isFocusOwner();
    boolean b23 = jMultiLineToolTip13.isShowing();
    java.awt.Graphics graphics24 = null;
    jMultiLineToolTip13.update(graphics24);
    java.awt.Component component26 = jMultiLineToolTip0.add((java.awt.Component)jMultiLineToolTip13);
    java.awt.Font font27 = null;
    jMultiLineToolTip13.setFont(font27);
    crystal.util.JMultiLineToolTip jMultiLineToolTip29 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle30 = null;
    java.awt.Rectangle rectangle31 = jMultiLineToolTip29.getBounds(rectangle30);
    java.awt.Insets insets32 = jMultiLineToolTip29.getInsets();
    java.awt.Insets insets33 = jMultiLineToolTip13.getInsets(insets32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets33);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color1 = null;
    jMultiLineToolTip0.setBackground(color1);
    jMultiLineToolTip0.transferFocusBackward();
    jMultiLineToolTip0.firePropertyChange("$HOME", false, false);
    crystal.util.JMultiLineToolTip jMultiLineToolTip8 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle9 = null;
    java.awt.Rectangle rectangle10 = jMultiLineToolTip8.getBounds(rectangle9);
    jMultiLineToolTip8.firePropertyChange("AHEAD", 0, 128);
    javax.swing.InputVerifier inputVerifier15 = jMultiLineToolTip8.getInputVerifier();
    crystal.util.JMultiLineToolTip jMultiLineToolTip16 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle17 = null;
    java.awt.Rectangle rectangle18 = jMultiLineToolTip16.getBounds(rectangle17);
    java.awt.Event event19 = null;
    boolean b22 = jMultiLineToolTip16.mouseDrag(event19, 32, 1);
    java.awt.Graphics graphics23 = null;
    jMultiLineToolTip16.printComponents(graphics23);
    java.awt.Point point25 = jMultiLineToolTip16.location();
    jMultiLineToolTip8.setLocation(point25);
    java.awt.Component component27 = jMultiLineToolTip0.getComponentAt(point25);
    boolean b28 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setName("hi!");
    javax.swing.border.Border border6 = jMultiLineToolTip0.getBorder();
    java.awt.Dimension dimension7 = jMultiLineToolTip0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(border6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension7);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }

    int i0 = java.awt.image.ImageObserver.FRAMEBITS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 16);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.Font font4 = null;
    jMultiLineToolTip0.setFont(font4);
    java.awt.Event event6 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = jMultiLineToolTip0.postEvent(event6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    crystal.util.JMultiLineToolTip jMultiLineToolTip6 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle7 = null;
    java.awt.Rectangle rectangle8 = jMultiLineToolTip6.getBounds(rectangle7);
    java.awt.Event event9 = null;
    boolean b11 = jMultiLineToolTip6.action(event9, (java.lang.Object)'4');
    jMultiLineToolTip0.setComponent((javax.swing.JComponent)jMultiLineToolTip6);
    crystal.util.JMultiLineToolTip jMultiLineToolTip13 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle14 = null;
    java.awt.Rectangle rectangle15 = jMultiLineToolTip13.getBounds(rectangle14);
    java.awt.Toolkit toolkit16 = jMultiLineToolTip13.getToolkit();
    jMultiLineToolTip13.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager20 = null;
    jMultiLineToolTip13.setLayout(layoutManager20);
    boolean b22 = jMultiLineToolTip13.isFocusOwner();
    boolean b23 = jMultiLineToolTip13.isShowing();
    java.awt.Graphics graphics24 = null;
    jMultiLineToolTip13.update(graphics24);
    java.awt.Component component26 = jMultiLineToolTip0.add((java.awt.Component)jMultiLineToolTip13);
    java.awt.Font font27 = null;
    jMultiLineToolTip13.setFont(font27);
    crystal.util.JMultiLineToolTip jMultiLineToolTip29 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle30 = null;
    java.awt.Rectangle rectangle31 = jMultiLineToolTip29.getBounds(rectangle30);
    java.awt.Rectangle rectangle32 = jMultiLineToolTip29.getVisibleRect();
    boolean b33 = jMultiLineToolTip29.isEnabled();
    java.awt.Event event34 = null;
    boolean b37 = jMultiLineToolTip29.mouseEnter(event34, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener38 = null;
    jMultiLineToolTip29.addPropertyChangeListener(propertyChangeListener38);
    java.awt.Point point40 = jMultiLineToolTip29.getLocation();
    jMultiLineToolTip13.setLocation(point40);
    boolean b42 = jMultiLineToolTip13.isPaintingTile();
    jMultiLineToolTip13.firePropertyChange("ToolTipUI", '4', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    java.awt.Point point11 = jMultiLineToolTip0.getLocation();
    java.awt.Event event12 = null;
    boolean b15 = jMultiLineToolTip0.mouseDown(event12, 7, (int)(byte)10);
    jMultiLineToolTip0.firePropertyChange("TESTCONFLICT", (double)32L, 0.0d);
    java.awt.Event event20 = null;
    boolean b22 = jMultiLineToolTip0.lostFocus(event20, (java.lang.Object)(-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip0.firePropertyChange("", (double)0L, 0.0d);
    boolean b5 = jMultiLineToolTip0.getIgnoreRepaint();
    jMultiLineToolTip0.enable();
    jMultiLineToolTip0.disable();
    crystal.util.JMultiLineToolTip jMultiLineToolTip8 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip8.firePropertyChange("", (double)0L, 0.0d);
    boolean b13 = jMultiLineToolTip8.getIgnoreRepaint();
    jMultiLineToolTip8.enable();
    java.awt.im.InputMethodRequests inputMethodRequests15 = jMultiLineToolTip8.getInputMethodRequests();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array16 = jMultiLineToolTip8.getMouseMotionListeners();
    boolean b17 = jMultiLineToolTip0.isFocusCycleRoot((java.awt.Container)jMultiLineToolTip8);
    java.awt.Container container18 = jMultiLineToolTip0.getTopLevelAncestor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputMethodRequests15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container18);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }

    crystal.client.ClientPreferences.NonexistentProjectException nonexistentProjectException1 = new crystal.client.ClientPreferences.NonexistentProjectException("TESTCONFLICT");

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }

    crystal.util.ValidInputChecker.checkValidStringInput("cannot compute hg action");

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    jMultiLineToolTip0.firePropertyChange("hi!", ' ', '#');
    java.awt.Dimension dimension6 = jMultiLineToolTip0.getMaximumSize();
    boolean b7 = jMultiLineToolTip0.isFocusTraversalPolicySet();
    java.awt.Graphics graphics8 = null;
    jMultiLineToolTip0.printAll(graphics8);
    jMultiLineToolTip0.transferFocusBackward();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.event.InputMethodListener inputMethodListener6 = null;
    jMultiLineToolTip0.removeInputMethodListener(inputMethodListener6);
    jMultiLineToolTip0.invalidate();
    boolean b9 = jMultiLineToolTip0.isDoubleBuffered();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }

    java.util.Date date1 = crystal.util.TimeUtility.parseLSMRDate("ERROR");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(date1);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }

    // The following exception was thrown during execution in test generation
    try {
    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("SAME", "32 ms", "0 ms", (long)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }

    crystal.model.LocalStateResult.HG_MUST_RESOLVE = "cannot compute hg action";

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Dimension dimension5 = null;
    jMultiLineToolTip0.setPreferredSize(dimension5);
    jMultiLineToolTip0.move(10, (int)(short)10);
    java.lang.String str10 = jMultiLineToolTip0.getUIClassID();
    java.awt.image.ColorModel colorModel11 = jMultiLineToolTip0.getColorModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ToolTipUI"+ "'", str10.equals("ToolTipUI"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel11);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.io.PrintWriter printWriter5 = null;
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.list(printWriter5, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    java.awt.Point point11 = jMultiLineToolTip0.getLocation();
    jMultiLineToolTip0.setDoubleBuffered(true);
    java.awt.im.InputMethodRequests inputMethodRequests14 = jMultiLineToolTip0.getInputMethodRequests();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputMethodRequests14);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }

    org.jdom.Document document1 = crystal.util.XMLTools.readXMLDocument("0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(document1);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }

    crystal.client.ConflictDaemon conflictDaemon0 = crystal.client.ConflictDaemon.getInstance();
    conflictDaemon0.enable(true);
    crystal.client.ProjectPreferences projectPreferences3 = null;
    // The following exception was thrown during execution in test generation
    try {
    crystal.model.LocalStateResult localStateResult4 = conflictDaemon0.calculateLocalState(projectPreferences3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(conflictDaemon0);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }

    boolean b1 = crystal.util.ValidInputChecker.checkDirectoryPath("SAME");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color1 = null;
    jMultiLineToolTip0.setBackground(color1);
    jMultiLineToolTip0.transferFocusBackward();
    jMultiLineToolTip0.firePropertyChange("$HOME", false, false);
    java.awt.Graphics graphics8 = null;
    jMultiLineToolTip0.paintComponents(graphics8);
    boolean b10 = jMultiLineToolTip0.isShowing();
    java.beans.VetoableChangeListener vetoableChangeListener11 = null;
    jMultiLineToolTip0.addVetoableChangeListener(vetoableChangeListener11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    jMultiLineToolTip0.firePropertyChange("AHEAD", 0, 128);
    jMultiLineToolTip0.setBounds((int)(byte)1, (int)(byte)100, 0, (-1));
    java.awt.Event event12 = null;
    boolean b15 = jMultiLineToolTip0.mouseDrag(event12, 64, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ClientPreferences clientPreferences5 = clientPreferences4.clone();
    java.lang.String str6 = clientPreferences4.getTempDirectory();
    // The following exception was thrown during execution in test generation
    try {
    crystal.client.ProjectPreferences projectPreferences8 = clientPreferences4.getProjectPreferences("AHEAD");
      org.junit.Assert.fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clientPreferences5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }

    int i0 = crystal.client.ClientPreferences.ConfigurationReadingException.PATH_INVALID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    java.awt.Dimension dimension11 = jMultiLineToolTip0.preferredSize();
    java.beans.VetoableChangeListener vetoableChangeListener12 = null;
    jMultiLineToolTip0.removeVetoableChangeListener(vetoableChangeListener12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }

    crystal.client.ConflictClient conflictClient0 = new crystal.client.ConflictClient();
    crystal.client.ClientPreferences clientPreferences5 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences6 = null;
    clientPreferences5.addProjectPreferences(projectPreferences6);
    crystal.client.ProjectPreferences projectPreferences8 = null;
    clientPreferences5.removeProjectPreferences(projectPreferences8);
    crystal.client.ClientPreferences clientPreferences10 = clientPreferences5.clone();
    conflictClient0.createAndShowGUI(clientPreferences5);
    crystal.client.ClientPreferences clientPreferences16 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences17 = null;
    clientPreferences16.addProjectPreferences(projectPreferences17);
    boolean b19 = clientPreferences16.hasChanged();
    // The following exception was thrown during execution in test generation
    try {
    conflictClient0.reloadWindowBody(clientPreferences16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clientPreferences10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.Font font4 = null;
    jMultiLineToolTip0.setFont(font4);
    java.awt.Color color6 = jMultiLineToolTip0.getBackground();
    crystal.util.JMultiLineToolTip jMultiLineToolTip7 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle8 = null;
    java.awt.Rectangle rectangle9 = jMultiLineToolTip7.getBounds(rectangle8);
    crystal.util.JMultiLineToolTip jMultiLineToolTip10 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle11 = null;
    java.awt.Rectangle rectangle12 = jMultiLineToolTip10.getBounds(rectangle11);
    jMultiLineToolTip7.repaint(rectangle12);
    java.awt.Rectangle rectangle14 = jMultiLineToolTip0.getBounds(rectangle12);
    crystal.util.JMultiLineToolTip jMultiLineToolTip16 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle17 = null;
    java.awt.Rectangle rectangle18 = jMultiLineToolTip16.getBounds(rectangle17);
    java.awt.Rectangle rectangle19 = jMultiLineToolTip16.getVisibleRect();
    boolean b20 = jMultiLineToolTip16.isEnabled();
    java.awt.Event event21 = null;
    boolean b24 = jMultiLineToolTip16.mouseEnter(event21, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener25 = null;
    jMultiLineToolTip16.addPropertyChangeListener(propertyChangeListener25);
    java.awt.Point point27 = jMultiLineToolTip16.getLocation();
    jMultiLineToolTip16.setDoubleBuffered(true);
    java.awt.Graphics graphics30 = null;
    jMultiLineToolTip16.print(graphics30);
    java.util.Set<java.awt.AWTKeyStroke> set_aWTKeyStroke33 = jMultiLineToolTip16.getFocusTraversalKeys((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.setFocusTraversalKeys(11, set_aWTKeyStroke33);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_aWTKeyStroke33);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }

    crystal.model.DataSource.RepoKind repoKind4 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment7 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind4, false, "hi!");
    crystal.model.Environment environment10 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind4, true, "PENDING");
    crystal.model.DataSource dataSource11 = environment10.clone();
    java.lang.String str12 = dataSource11.getTestCommand();
    org.junit.Assert.assertTrue("'" + repoKind4 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind4.equals(crystal.model.DataSource.RepoKind.HG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dataSource11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip0.firePropertyChange("", (double)0L, 0.0d);
    boolean b5 = jMultiLineToolTip0.getIgnoreRepaint();
    jMultiLineToolTip0.enable();
    java.awt.im.InputMethodRequests inputMethodRequests7 = jMultiLineToolTip0.getInputMethodRequests();
    jMultiLineToolTip0.firePropertyChange("Action: hg merge", (short)0, (short)100);
    java.awt.Dimension dimension12 = jMultiLineToolTip0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputMethodRequests7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ClientPreferences clientPreferences5 = clientPreferences4.clone();
    java.lang.String str6 = clientPreferences4.getTempDirectory();
    crystal.client.ProjectPreferences projectPreferences7 = null;
    // The following exception was thrown during execution in test generation
    try {
    crystal.client.DataSourceGuiEditorFrame dataSourceGuiEditorFrame9 = new crystal.client.DataSourceGuiEditorFrame(clientPreferences4, projectPreferences7, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clientPreferences5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }

    java.util.HashMap<java.lang.String,crystal.server.AbstractLogParser.Checkpoint> hashmap_str_checkpoint1 = crystal.server.HgLogParser.parseLog("ERROR");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_str_checkpoint1);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Dimension dimension5 = null;
    jMultiLineToolTip0.setPreferredSize(dimension5);
    crystal.util.JMultiLineToolTip jMultiLineToolTip7 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle8 = null;
    java.awt.Rectangle rectangle9 = jMultiLineToolTip7.getBounds(rectangle8);
    java.awt.Event event10 = null;
    boolean b12 = jMultiLineToolTip7.action(event10, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel13 = jMultiLineToolTip7.getColorModel();
    boolean b14 = jMultiLineToolTip0.isAncestorOf((java.awt.Component)jMultiLineToolTip7);
    jMultiLineToolTip0.disable();
    crystal.util.JMultiLineToolTip jMultiLineToolTip16 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle17 = null;
    java.awt.Rectangle rectangle18 = jMultiLineToolTip16.getBounds(rectangle17);
    java.awt.Rectangle rectangle19 = jMultiLineToolTip16.getVisibleRect();
    boolean b20 = jMultiLineToolTip16.isEnabled();
    java.awt.Event event21 = null;
    boolean b24 = jMultiLineToolTip16.mouseEnter(event21, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener25 = null;
    jMultiLineToolTip16.addPropertyChangeListener(propertyChangeListener25);
    java.awt.Point point27 = jMultiLineToolTip16.getLocation();
    java.awt.Point point28 = jMultiLineToolTip0.getLocation(point27);
    jMultiLineToolTip0.setToolTipText("ERROR");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point28);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }

    crystal.client.ClientPreferences clientPreferences0 = crystal.client.ClientPreferences.DEFAULT_CLIENT_PREFERENCES;
    // The following exception was thrown during execution in test generation
    try {
    clientPreferences0.removeProjectPreferencesAtIndex(1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clientPreferences0);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isManagingFocus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    jMultiLineToolTip0.setSize((int)' ', (-1));
    java.awt.Container container5 = jMultiLineToolTip0.getFocusCycleRootAncestor();
    javax.swing.event.AncestorListener ancestorListener6 = null;
    jMultiLineToolTip0.addAncestorListener(ancestorListener6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container5);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip0.firePropertyChange("", (double)0L, 0.0d);
    boolean b5 = jMultiLineToolTip0.getIgnoreRepaint();
    jMultiLineToolTip0.enable();
    java.awt.im.InputMethodRequests inputMethodRequests7 = jMultiLineToolTip0.getInputMethodRequests();
    javax.swing.event.AncestorListener ancestorListener8 = null;
    jMultiLineToolTip0.removeAncestorListener(ancestorListener8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputMethodRequests7);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }

    boolean b1 = crystal.util.ValidInputChecker.checkStringToLong("415725 hours 21 min");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    jMultiLineToolTip0.firePropertyChange("AHEAD", 0, 128);
    jMultiLineToolTip0.setBounds((int)(byte)1, (int)(byte)100, 0, (-1));
    jMultiLineToolTip0.setDoubleBuffered(false);
    javax.swing.border.Border border14 = jMultiLineToolTip0.getBorder();
    boolean b15 = jMultiLineToolTip0.isForegroundSet();
    java.awt.LayoutManager layoutManager16 = null;
    jMultiLineToolTip0.setLayout(layoutManager16);
    java.awt.event.ContainerListener containerListener18 = null;
    jMultiLineToolTip0.addContainerListener(containerListener18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(border14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }

    crystal.model.DataSource.RepoKind repoKind4 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment7 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind4, false, "hi!");
    crystal.model.Environment environment10 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind4, true, "PENDING");
    java.lang.String str11 = environment10.toString();
    org.junit.Assert.assertTrue("'" + repoKind4 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind4.equals(crystal.model.DataSource.RepoKind.HG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "AHEAD_HG_2017-06-04T14-21-48.265-0700"+ "'", str11.equals("AHEAD_HG_2017-06-04T14-21-48.265-0700"));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.beans.VetoableChangeListener[] vetoableChangeListener_array5 = jMultiLineToolTip0.getVetoableChangeListeners();
    int i6 = jMultiLineToolTip0.getWidth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vetoableChangeListener_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }

    crystal.model.LocalStateResult.GIT_UNCHECKPOINTED = "TESTCONFLICT";

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager7 = null;
    jMultiLineToolTip0.setLayout(layoutManager7);
    java.awt.Graphics graphics9 = null;
    jMultiLineToolTip0.print(graphics9);
    jMultiLineToolTip0.firePropertyChange("%5p - %m%n", (double)32, (double)7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Dimension dimension5 = null;
    jMultiLineToolTip0.setPreferredSize(dimension5);
    jMultiLineToolTip0.show();
    jMultiLineToolTip0.paintImmediately((int)(byte)0, (int)(byte)100, 9, 1);
    java.awt.event.KeyListener keyListener13 = null;
    jMultiLineToolTip0.addKeyListener(keyListener13);
    crystal.util.JMultiLineToolTip jMultiLineToolTip15 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle16 = null;
    java.awt.Rectangle rectangle17 = jMultiLineToolTip15.getBounds(rectangle16);
    java.awt.Insets insets18 = jMultiLineToolTip15.getInsets();
    java.awt.Insets insets19 = jMultiLineToolTip0.getInsets(insets18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets19);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager7 = null;
    jMultiLineToolTip0.setLayout(layoutManager7);
    boolean b9 = jMultiLineToolTip0.isFocusOwner();
    boolean b10 = jMultiLineToolTip0.isShowing();
    java.awt.Graphics graphics11 = null;
    jMultiLineToolTip0.update(graphics11);
    javax.swing.KeyStroke keyStroke13 = null;
    int i14 = jMultiLineToolTip0.getConditionForKeyStroke(keyStroke13);
    jMultiLineToolTip0.doLayout();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.lang.String str7 = jMultiLineToolTip0.toString();
    float f8 = jMultiLineToolTip0.getAlignmentX();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.5f);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }

    crystal.model.Relationship.AHEAD = "TEST";

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }

    // The following exception was thrown during execution in test generation
    try {
    boolean b3 = crystal.util.RunIt.validGit((double)(byte)-1, "415725 hours 21 min", "ERROR");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }

    java.lang.String str0 = crystal.util.XMLTools.STANDARD_DATE_FORMAT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ToolTipUI"+ "'", str0.equals("ToolTipUI"));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager7 = null;
    jMultiLineToolTip0.setLayout(layoutManager7);
    java.awt.event.InputMethodListener inputMethodListener9 = null;
    jMultiLineToolTip0.removeInputMethodListener(inputMethodListener9);
    java.awt.Point point11 = jMultiLineToolTip0.getMousePosition();
    javax.swing.JPopupMenu jPopupMenu12 = jMultiLineToolTip0.getComponentPopupMenu();
    crystal.util.JMultiLineToolTip jMultiLineToolTip13 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle14 = null;
    java.awt.Rectangle rectangle15 = jMultiLineToolTip13.getBounds(rectangle14);
    java.awt.Toolkit toolkit16 = jMultiLineToolTip13.getToolkit();
    jMultiLineToolTip13.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager20 = null;
    jMultiLineToolTip13.setLayout(layoutManager20);
    crystal.util.JMultiLineToolTip jMultiLineToolTip22 = new crystal.util.JMultiLineToolTip();
    boolean b23 = jMultiLineToolTip22.isFocusTraversalPolicyProvider();
    jMultiLineToolTip22.firePropertyChange("hi!", ' ', '#');
    java.awt.Dimension dimension28 = jMultiLineToolTip22.getMaximumSize();
    java.awt.Dimension dimension29 = jMultiLineToolTip13.getSize(dimension28);
    // The following exception was thrown during execution in test generation
    try {
    jPopupMenu12.setMaximumSize(dimension28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jPopupMenu12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension29);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }

    javax.swing.ImageIcon imageIcon1 = null;
    java.awt.Image image2 = null;
    crystal.model.Relationship relationship3 = new crystal.model.Relationship("AHEAD", imageIcon1, image2);
    crystal.util.JMultiLineToolTip jMultiLineToolTip4 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle5 = null;
    java.awt.Rectangle rectangle6 = jMultiLineToolTip4.getBounds(rectangle5);
    java.awt.Rectangle rectangle7 = jMultiLineToolTip4.getVisibleRect();
    boolean b8 = jMultiLineToolTip4.isEnabled();
    java.awt.Event event9 = null;
    boolean b12 = jMultiLineToolTip4.mouseEnter(event9, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener13 = null;
    jMultiLineToolTip4.addPropertyChangeListener(propertyChangeListener13);
    java.awt.Point point15 = jMultiLineToolTip4.getLocation();
    boolean b16 = relationship3.equals((java.lang.Object)jMultiLineToolTip4);
    java.awt.Graphics graphics17 = null;
    jMultiLineToolTip4.update(graphics17);
    javax.swing.TransferHandler transferHandler19 = null;
    jMultiLineToolTip4.setTransferHandler(transferHandler19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Insets insets3 = jMultiLineToolTip0.getInsets();
    java.awt.Event event4 = null;
    boolean b7 = jMultiLineToolTip0.mouseDown(event4, 11, (int)' ');
    int i8 = jMultiLineToolTip0.countComponents();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager7 = null;
    jMultiLineToolTip0.setLayout(layoutManager7);
    boolean b9 = jMultiLineToolTip0.isFocusOwner();
    boolean b10 = jMultiLineToolTip0.isShowing();
    jMultiLineToolTip0.transferFocusUpCycle();
    crystal.util.JMultiLineToolTip jMultiLineToolTip12 = new crystal.util.JMultiLineToolTip();
    boolean b13 = jMultiLineToolTip12.isFocusTraversalPolicyProvider();
    java.awt.Dimension dimension14 = jMultiLineToolTip12.preferredSize();
    java.awt.Dimension dimension15 = jMultiLineToolTip0.getSize(dimension14);
    java.awt.Event event16 = null;
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.deliverEvent(event16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension15);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    boolean b2 = jMultiLineToolTip0.isRequestFocusEnabled();
    java.awt.event.ContainerListener containerListener3 = null;
    jMultiLineToolTip0.removeContainerListener(containerListener3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.Font font4 = null;
    jMultiLineToolTip0.setFont(font4);
    java.awt.LayoutManager layoutManager6 = jMultiLineToolTip0.getLayout();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(layoutManager6);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }

    javax.swing.ImageIcon imageIcon2 = null;
    java.awt.Image image3 = null;
    crystal.model.Relationship relationship4 = new crystal.model.Relationship("AHEAD", imageIcon2, image3);
    javax.swing.ImageIcon imageIcon7 = null;
    java.awt.Image image8 = null;
    crystal.model.Relationship relationship9 = new crystal.model.Relationship("AHEAD", imageIcon7, image8);
    relationship4.calculateAction("AHEAD", relationship9);
    javax.swing.ImageIcon imageIcon11 = relationship9.getIcon();
    crystal.util.JMultiLineToolTip jMultiLineToolTip12 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle13 = null;
    java.awt.Rectangle rectangle14 = jMultiLineToolTip12.getBounds(rectangle13);
    java.awt.Toolkit toolkit15 = jMultiLineToolTip12.getToolkit();
    jMultiLineToolTip12.setSize(32, (int)(byte)-1);
    java.awt.image.ImageProducer imageProducer19 = null;
    java.awt.Image image20 = jMultiLineToolTip12.createImage(imageProducer19);
    // The following exception was thrown during execution in test generation
    try {
    crystal.model.Relationship relationship21 = new crystal.model.Relationship("2017-06-04T14-21-48.265-0700", imageIcon11, image20);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(imageIcon11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image20);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.beans.VetoableChangeListener[] vetoableChangeListener_array5 = jMultiLineToolTip0.getVetoableChangeListeners();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array6 = jMultiLineToolTip0.getMouseMotionListeners();
    java.awt.event.InputMethodListener inputMethodListener7 = null;
    jMultiLineToolTip0.addInputMethodListener(inputMethodListener7);
    java.awt.dnd.DropTarget dropTarget9 = jMultiLineToolTip0.getDropTarget();
    javax.swing.JToolTip jToolTip10 = jMultiLineToolTip0.createToolTip();
    javax.swing.event.AncestorListener ancestorListener11 = null;
    jToolTip10.removeAncestorListener(ancestorListener11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vetoableChangeListener_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(dropTarget9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jToolTip10);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences5 = null;
    clientPreferences4.addProjectPreferences(projectPreferences5);
    clientPreferences4.setGitPath("");
    crystal.client.ProjectPreferences projectPreferences9 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = crystal.util.ValidInputChecker.checkProjectPreferencesNameDuplicate(clientPreferences4, projectPreferences9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip0.firePropertyChange("", (double)0L, 0.0d);
    boolean b5 = jMultiLineToolTip0.getIgnoreRepaint();
    jMultiLineToolTip0.invalidate();
    java.awt.Graphics graphics7 = null;
    jMultiLineToolTip0.paint(graphics7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }

    crystal.client.ProjectPreferences projectPreferences0 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener1 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener2 = null;
    crystal.client.CalculateProjectTask calculateProjectTask3 = new crystal.client.CalculateProjectTask(projectPreferences0, computationListener1, computationListener2);
    java.beans.PropertyChangeSupport propertyChangeSupport4 = calculateProjectTask3.getPropertyChangeSupport();
    calculateProjectTask3.execute();
    java.beans.PropertyChangeListener propertyChangeListener6 = null;
    calculateProjectTask3.removePropertyChangeListener(propertyChangeListener6);
    java.beans.PropertyChangeSupport propertyChangeSupport8 = calculateProjectTask3.getPropertyChangeSupport();
    calculateProjectTask3.execute();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeSupport4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeSupport8);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }

    javax.swing.JPanel jPanel0 = null;
    // The following exception was thrown during execution in test generation
    try {
    crystal.util.SpringLayoutUtility.formGridInColumn(jPanel0, (-1), 0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    crystal.util.JMultiLineToolTip jMultiLineToolTip6 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle7 = null;
    java.awt.Rectangle rectangle8 = jMultiLineToolTip6.getBounds(rectangle7);
    java.awt.Event event9 = null;
    boolean b11 = jMultiLineToolTip6.action(event9, (java.lang.Object)'4');
    jMultiLineToolTip0.setComponent((javax.swing.JComponent)jMultiLineToolTip6);
    crystal.util.JMultiLineToolTip jMultiLineToolTip13 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle14 = null;
    java.awt.Rectangle rectangle15 = jMultiLineToolTip13.getBounds(rectangle14);
    java.awt.Toolkit toolkit16 = jMultiLineToolTip13.getToolkit();
    jMultiLineToolTip13.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager20 = null;
    jMultiLineToolTip13.setLayout(layoutManager20);
    boolean b22 = jMultiLineToolTip13.isFocusOwner();
    boolean b23 = jMultiLineToolTip13.isShowing();
    java.awt.Graphics graphics24 = null;
    jMultiLineToolTip13.update(graphics24);
    java.awt.Component component26 = jMultiLineToolTip0.add((java.awt.Component)jMultiLineToolTip13);
    java.awt.Font font27 = null;
    jMultiLineToolTip13.setFont(font27);
    java.awt.event.InputMethodListener[] inputMethodListener_array29 = jMultiLineToolTip13.getInputMethodListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMethodListener_array29);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip0.firePropertyChange("", (double)0L, 0.0d);
    boolean b5 = jMultiLineToolTip0.getIgnoreRepaint();
    jMultiLineToolTip0.enable();
    boolean b7 = jMultiLineToolTip0.isForegroundSet();
    java.awt.Dimension dimension8 = jMultiLineToolTip0.getMinimumSize();
    int i9 = jMultiLineToolTip0.getX();
    java.io.PrintStream printStream10 = null;
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.list(printStream10, (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    javax.swing.KeyStroke keyStroke11 = null;
    jMultiLineToolTip0.unregisterKeyboardAction(keyStroke11);
    jMultiLineToolTip0.enableInputMethods(false);
    jMultiLineToolTip0.setVisible(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    jMultiLineToolTip0.firePropertyChange("AHEAD", 0, 128);
    jMultiLineToolTip0.setBounds((int)(byte)1, (int)(byte)100, 0, (-1));
    jMultiLineToolTip0.setDoubleBuffered(false);
    javax.swing.border.Border border14 = jMultiLineToolTip0.getBorder();
    boolean b15 = jMultiLineToolTip0.isForegroundSet();
    boolean b16 = jMultiLineToolTip0.isVisible();
    java.awt.ImageCapabilities imageCapabilities19 = null;
    java.awt.image.VolatileImage volatileImage20 = jMultiLineToolTip0.createVolatileImage((int)(short)0, 10, imageCapabilities19);
    crystal.util.JMultiLineToolTip jMultiLineToolTip21 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle22 = null;
    java.awt.Rectangle rectangle23 = jMultiLineToolTip21.getBounds(rectangle22);
    java.awt.Toolkit toolkit24 = jMultiLineToolTip21.getToolkit();
    java.awt.Font font25 = null;
    jMultiLineToolTip21.setFont(font25);
    javax.swing.KeyStroke[] keyStroke_array27 = jMultiLineToolTip21.getRegisteredKeyStrokes();
    int i28 = jMultiLineToolTip21.getComponentCount();
    int i29 = jMultiLineToolTip0.getComponentZOrder((java.awt.Component)jMultiLineToolTip21);
    jMultiLineToolTip0.enableInputMethods(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(border14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(volatileImage20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(keyStroke_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == (-1));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.Font font4 = null;
    jMultiLineToolTip0.setFont(font4);
    java.awt.Color color6 = jMultiLineToolTip0.getBackground();
    crystal.util.JMultiLineToolTip jMultiLineToolTip7 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle8 = null;
    java.awt.Rectangle rectangle9 = jMultiLineToolTip7.getBounds(rectangle8);
    crystal.util.JMultiLineToolTip jMultiLineToolTip10 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle11 = null;
    java.awt.Rectangle rectangle12 = jMultiLineToolTip10.getBounds(rectangle11);
    jMultiLineToolTip7.repaint(rectangle12);
    java.awt.Rectangle rectangle14 = jMultiLineToolTip0.getBounds(rectangle12);
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener15 = null;
    jMultiLineToolTip0.addHierarchyBoundsListener(hierarchyBoundsListener15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }

    java.lang.String str1 = crystal.util.RunIt.getExecutable("2017-06-04T14-21-48.265-0700");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }

    crystal.Constants.DEFAULT_REFRESH = (short)100;

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.Font font4 = null;
    jMultiLineToolTip0.setFont(font4);
    javax.swing.KeyStroke[] keyStroke_array6 = jMultiLineToolTip0.getRegisteredKeyStrokes();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener7 = null;
    jMultiLineToolTip0.removeHierarchyBoundsListener(hierarchyBoundsListener7);
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Component component10 = jMultiLineToolTip0.getComponent((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(keyStroke_array6);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel6 = jMultiLineToolTip0.getColorModel();
    jMultiLineToolTip0.removeNotify();
    jMultiLineToolTip0.doLayout();
    boolean b9 = jMultiLineToolTip0.isVisible();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }

    crystal.model.Relationship.ERROR = "0 ms";

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.image.ImageProducer imageProducer7 = null;
    java.awt.Image image8 = jMultiLineToolTip0.createImage(imageProducer7);
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
    jMultiLineToolTip0.addHierarchyBoundsListener(hierarchyBoundsListener9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image8);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.Font font4 = null;
    jMultiLineToolTip0.setFont(font4);
    javax.swing.KeyStroke[] keyStroke_array6 = jMultiLineToolTip0.getRegisteredKeyStrokes();
    int i7 = jMultiLineToolTip0.getComponentCount();
    jMultiLineToolTip0.setVerifyInputWhenFocusTarget(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(keyStroke_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }

    crystal.Constants.DEFAULT_REFRESH = 6;

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel6 = jMultiLineToolTip0.getColorModel();
    jMultiLineToolTip0.removeNotify();
    crystal.util.JMultiLineToolTip jMultiLineToolTip8 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle9 = null;
    java.awt.Rectangle rectangle10 = jMultiLineToolTip8.getBounds(rectangle9);
    java.awt.Toolkit toolkit11 = jMultiLineToolTip8.getToolkit();
    java.awt.Font font12 = null;
    jMultiLineToolTip8.setFont(font12);
    java.awt.Color color14 = jMultiLineToolTip8.getBackground();
    jMultiLineToolTip0.setForeground(color14);
    java.awt.event.MouseWheelListener[] mouseWheelListener_array16 = jMultiLineToolTip0.getMouseWheelListeners();
    java.awt.Insets insets17 = jMultiLineToolTip0.insets();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseWheelListener_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets17);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }

    crystal.model.LocalStateResult.GIT_UNCHECKPOINTED = "Action: hg merge";

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }

    crystal.model.LocalStateResult.ERROR = "PENDING";

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    javax.swing.KeyStroke keyStroke11 = null;
    jMultiLineToolTip0.unregisterKeyboardAction(keyStroke11);
    crystal.util.JMultiLineToolTip jMultiLineToolTip13 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle14 = null;
    java.awt.Rectangle rectangle15 = jMultiLineToolTip13.getBounds(rectangle14);
    java.awt.Rectangle rectangle16 = jMultiLineToolTip13.getVisibleRect();
    jMultiLineToolTip0.paintImmediately(rectangle16);
    javax.swing.JPopupMenu jPopupMenu18 = null;
    jMultiLineToolTip0.setComponentPopupMenu(jPopupMenu18);
    crystal.util.JMultiLineToolTip jMultiLineToolTip20 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle21 = null;
    java.awt.Rectangle rectangle22 = jMultiLineToolTip20.getBounds(rectangle21);
    java.awt.Toolkit toolkit23 = jMultiLineToolTip20.getToolkit();
    jMultiLineToolTip20.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager27 = null;
    jMultiLineToolTip20.setLayout(layoutManager27);
    boolean b29 = jMultiLineToolTip20.isFocusOwner();
    boolean b30 = jMultiLineToolTip20.isShowing();
    jMultiLineToolTip20.transferFocusUpCycle();
    crystal.util.JMultiLineToolTip jMultiLineToolTip32 = new crystal.util.JMultiLineToolTip();
    boolean b33 = jMultiLineToolTip32.isFocusTraversalPolicyProvider();
    java.awt.Dimension dimension34 = jMultiLineToolTip32.preferredSize();
    java.awt.Dimension dimension35 = jMultiLineToolTip20.getSize(dimension34);
    java.awt.Component component36 = jMultiLineToolTip0.add((java.awt.Component)jMultiLineToolTip20);
    crystal.util.JMultiLineToolTip jMultiLineToolTip37 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle38 = null;
    java.awt.Rectangle rectangle39 = jMultiLineToolTip37.getBounds(rectangle38);
    java.awt.Event event40 = null;
    boolean b42 = jMultiLineToolTip37.action(event40, (java.lang.Object)'4');
    java.awt.event.InputMethodListener inputMethodListener43 = null;
    jMultiLineToolTip37.removeInputMethodListener(inputMethodListener43);
    java.awt.Dimension dimension45 = jMultiLineToolTip37.getSize();
    java.awt.Point point46 = jMultiLineToolTip37.location();
    java.awt.Component component47 = jMultiLineToolTip0.getComponentAt(point46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component47);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel6 = jMultiLineToolTip0.getColorModel();
    jMultiLineToolTip0.addNotify();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel6);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    jMultiLineToolTip0.setSize((int)' ', (-1));
    java.awt.Container container5 = jMultiLineToolTip0.getFocusCycleRootAncestor();
    crystal.util.JMultiLineToolTip jMultiLineToolTip6 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle7 = null;
    java.awt.Rectangle rectangle8 = jMultiLineToolTip6.getBounds(rectangle7);
    jMultiLineToolTip6.firePropertyChange("AHEAD", 0, 128);
    javax.swing.InputVerifier inputVerifier13 = jMultiLineToolTip6.getInputVerifier();
    crystal.util.JMultiLineToolTip jMultiLineToolTip14 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle15 = null;
    java.awt.Rectangle rectangle16 = jMultiLineToolTip14.getBounds(rectangle15);
    java.awt.Event event17 = null;
    boolean b20 = jMultiLineToolTip14.mouseDrag(event17, 32, 1);
    java.awt.Graphics graphics21 = null;
    jMultiLineToolTip14.printComponents(graphics21);
    java.awt.Point point23 = jMultiLineToolTip14.location();
    jMultiLineToolTip6.setLocation(point23);
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Point point25 = container5.getLocation(point23);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point23);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    // The following exception was thrown during execution in test generation
    try {
    crystal.client.ProjectPreferences projectPreferences6 = clientPreferences4.getProjectPreferences("2017-06-04T14-21-48.265-0700");
      org.junit.Assert.fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    jMultiLineToolTip0.setFocusTraversalPolicyProvider(false);
    jMultiLineToolTip0.repaint((long)'a');
    crystal.util.JMultiLineToolTip jMultiLineToolTip15 = new crystal.util.JMultiLineToolTip();
    boolean b16 = jMultiLineToolTip15.isFocusTraversalPolicyProvider();
    jMultiLineToolTip15.firePropertyChange("hi!", ' ', '#');
    java.awt.Dimension dimension21 = jMultiLineToolTip15.getMaximumSize();
    jMultiLineToolTip0.resize(dimension21);
    crystal.util.JMultiLineToolTip jMultiLineToolTip23 = new crystal.util.JMultiLineToolTip();
    boolean b24 = jMultiLineToolTip23.isFocusTraversalPolicyProvider();
    jMultiLineToolTip23.firePropertyChange("hi!", ' ', '#');
    java.awt.Dimension dimension29 = jMultiLineToolTip23.getMaximumSize();
    int i30 = jMultiLineToolTip0.getComponentZOrder((java.awt.Component)jMultiLineToolTip23);
    jMultiLineToolTip23.firePropertyChange("hi!", 0.0f, (float)128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == (-1));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    jMultiLineToolTip0.firePropertyChange("AHEAD", 0, 128);
    jMultiLineToolTip0.setBounds((int)(byte)1, (int)(byte)100, 0, (-1));
    jMultiLineToolTip0.setDoubleBuffered(false);
    javax.swing.border.Border border14 = jMultiLineToolTip0.getBorder();
    boolean b15 = jMultiLineToolTip0.isForegroundSet();
    java.awt.Graphics graphics16 = jMultiLineToolTip0.getGraphics();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(border14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphics16);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }

    java.lang.String str1 = crystal.util.TimeUtility.msToHumanReadableDelta((long)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "415725 hours 22 min"+ "'", str1.equals("415725 hours 22 min"));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Dimension dimension5 = null;
    jMultiLineToolTip0.setPreferredSize(dimension5);
    jMultiLineToolTip0.move(10, (int)(short)10);
    java.awt.Point point11 = jMultiLineToolTip0.getMousePosition(true);
    java.awt.im.InputContext inputContext12 = jMultiLineToolTip0.getInputContext();
    crystal.util.JMultiLineToolTip jMultiLineToolTip13 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle14 = null;
    java.awt.Rectangle rectangle15 = jMultiLineToolTip13.getBounds(rectangle14);
    java.awt.Event event16 = null;
    boolean b18 = jMultiLineToolTip13.action(event16, (java.lang.Object)'4');
    java.awt.Component component21 = jMultiLineToolTip13.locate((int)'4', 1);
    jMultiLineToolTip13.setFocusTraversalPolicyProvider(true);
    int i24 = jMultiLineToolTip0.getComponentZOrder((java.awt.Component)jMultiLineToolTip13);
    jMultiLineToolTip0.nextFocus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputContext12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.Font font4 = null;
    jMultiLineToolTip0.setFont(font4);
    javax.swing.KeyStroke[] keyStroke_array6 = jMultiLineToolTip0.getRegisteredKeyStrokes();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener7 = null;
    jMultiLineToolTip0.removeHierarchyBoundsListener(hierarchyBoundsListener7);
    boolean b9 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)jMultiLineToolTip0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(keyStroke_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }

    crystal.client.ClientPreferences.CONFIG_PATH = "0 ms";

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color1 = null;
    jMultiLineToolTip0.setBackground(color1);
    jMultiLineToolTip0.transferFocusBackward();
    jMultiLineToolTip0.firePropertyChange("$HOME", false, false);
    crystal.util.JMultiLineToolTip jMultiLineToolTip8 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle9 = null;
    java.awt.Rectangle rectangle10 = jMultiLineToolTip8.getBounds(rectangle9);
    jMultiLineToolTip8.firePropertyChange("AHEAD", 0, 128);
    javax.swing.InputVerifier inputVerifier15 = jMultiLineToolTip8.getInputVerifier();
    crystal.util.JMultiLineToolTip jMultiLineToolTip16 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle17 = null;
    java.awt.Rectangle rectangle18 = jMultiLineToolTip16.getBounds(rectangle17);
    java.awt.Event event19 = null;
    boolean b22 = jMultiLineToolTip16.mouseDrag(event19, 32, 1);
    java.awt.Graphics graphics23 = null;
    jMultiLineToolTip16.printComponents(graphics23);
    java.awt.Point point25 = jMultiLineToolTip16.location();
    jMultiLineToolTip8.setLocation(point25);
    java.awt.Component component27 = jMultiLineToolTip0.getComponentAt(point25);
    crystal.util.JMultiLineToolTip jMultiLineToolTip28 = new crystal.util.JMultiLineToolTip();
    boolean b29 = jMultiLineToolTip28.isFocusTraversalPolicyProvider();
    java.awt.Dimension dimension30 = jMultiLineToolTip28.preferredSize();
    // The following exception was thrown during execution in test generation
    try {
    component27.setSize(dimension30);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension30);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(clientPreferences4);
    crystal.client.ClientPreferences.DEFAULT_CLIENT_PREFERENCES = clientPreferences4;
    clientPreferences4.setChanged(false);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "$HOME", "$HOME", "AHEAD" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str5 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str5, str_array4);
    java.lang.String[] str_array15 = new java.lang.String[] { "0 ms", "$HOME", "", "$HOME", "$HOME", "415725 hours 21 min", "", "$HOME" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str16 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str16, str_array15);
    java.util.Set<java.lang.String> set_str18 = crystal.util.SetOperations.setDifference((java.util.Set<java.lang.String>)linkedhashset_str5, (java.util.Set<java.lang.String>)linkedhashset_str16);
    java.lang.String[] str_array22 = new java.lang.String[] { "$HOME", "$HOME", "AHEAD" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str23 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str23, str_array22);
    java.lang.String[] str_array33 = new java.lang.String[] { "0 ms", "$HOME", "", "$HOME", "$HOME", "415725 hours 21 min", "", "$HOME" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str34 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str34, str_array33);
    java.util.Set<java.lang.String> set_str36 = crystal.util.SetOperations.setDifference((java.util.Set<java.lang.String>)linkedhashset_str23, (java.util.Set<java.lang.String>)linkedhashset_str34);
    java.util.Set<java.lang.String> set_str37 = crystal.util.SetOperations.xor(set_str18, set_str36);
    // The following exception was thrown during execution in test generation
    try {
    crystal.util.ValidInputChecker.checkStringInSet("cannot compute hg action", (java.util.Collection<java.lang.String>)set_str37);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str37);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }

    int i0 = java.awt.image.ImageObserver.HEIGHT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.event.InputMethodListener inputMethodListener7 = null;
    jMultiLineToolTip0.addInputMethodListener(inputMethodListener7);
    boolean b9 = jMultiLineToolTip0.isPaintingForPrint();
    jMultiLineToolTip0.removeNotify();
    java.awt.Point point11 = jMultiLineToolTip0.getMousePosition();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point11);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener4 = null;
    jMultiLineToolTip0.addHierarchyBoundsListener(hierarchyBoundsListener4);
    jMultiLineToolTip0.setFocusable(false);
    jMultiLineToolTip0.firePropertyChange("ToolTipUI", (double)(byte)-1, (double)7);
    java.awt.ImageCapabilities imageCapabilities14 = null;
    java.awt.image.VolatileImage volatileImage15 = jMultiLineToolTip0.createVolatileImage(4, 7, imageCapabilities14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(volatileImage15);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel6 = jMultiLineToolTip0.getColorModel();
    jMultiLineToolTip0.removeNotify();
    jMultiLineToolTip0.doLayout();
    boolean b9 = jMultiLineToolTip0.isMaximumSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    crystal.util.JMultiLineToolTip jMultiLineToolTip6 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle7 = null;
    java.awt.Rectangle rectangle8 = jMultiLineToolTip6.getBounds(rectangle7);
    java.awt.Event event9 = null;
    boolean b11 = jMultiLineToolTip6.action(event9, (java.lang.Object)'4');
    jMultiLineToolTip0.setComponent((javax.swing.JComponent)jMultiLineToolTip6);
    crystal.util.JMultiLineToolTip jMultiLineToolTip13 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle14 = null;
    java.awt.Rectangle rectangle15 = jMultiLineToolTip13.getBounds(rectangle14);
    java.awt.Toolkit toolkit16 = jMultiLineToolTip13.getToolkit();
    jMultiLineToolTip13.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager20 = null;
    jMultiLineToolTip13.setLayout(layoutManager20);
    boolean b22 = jMultiLineToolTip13.isFocusOwner();
    boolean b23 = jMultiLineToolTip13.isShowing();
    java.awt.Graphics graphics24 = null;
    jMultiLineToolTip13.update(graphics24);
    java.awt.Component component26 = jMultiLineToolTip0.add((java.awt.Component)jMultiLineToolTip13);
    jMultiLineToolTip0.setToolTipText("Action: hg merge");
    crystal.util.JMultiLineToolTip jMultiLineToolTip29 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle30 = null;
    java.awt.Rectangle rectangle31 = jMultiLineToolTip29.getBounds(rectangle30);
    java.awt.Event event32 = null;
    boolean b34 = jMultiLineToolTip29.action(event32, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel35 = jMultiLineToolTip29.getColorModel();
    jMultiLineToolTip29.removeNotify();
    crystal.util.JMultiLineToolTip jMultiLineToolTip37 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle38 = null;
    java.awt.Rectangle rectangle39 = jMultiLineToolTip37.getBounds(rectangle38);
    java.awt.Toolkit toolkit40 = jMultiLineToolTip37.getToolkit();
    java.awt.Font font41 = null;
    jMultiLineToolTip37.setFont(font41);
    java.awt.Color color43 = jMultiLineToolTip37.getBackground();
    jMultiLineToolTip29.setForeground(color43);
    crystal.util.JMultiLineToolTip jMultiLineToolTip45 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle46 = null;
    java.awt.Rectangle rectangle47 = jMultiLineToolTip45.getBounds(rectangle46);
    jMultiLineToolTip45.firePropertyChange("AHEAD", 0, 128);
    jMultiLineToolTip45.setBounds((int)(byte)1, (int)(byte)100, 0, (-1));
    jMultiLineToolTip45.setDoubleBuffered(false);
    javax.swing.border.Border border59 = jMultiLineToolTip45.getBorder();
    java.lang.Object obj60 = jMultiLineToolTip29.getClientProperty((java.lang.Object)border59);
    jMultiLineToolTip0.setBorder(border59);
    java.awt.FocusTraversalPolicy focusTraversalPolicy62 = jMultiLineToolTip0.getFocusTraversalPolicy();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(border59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(focusTraversalPolicy62);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }

    javax.swing.ImageIcon imageIcon2 = null;
    java.awt.Image image3 = null;
    crystal.model.Relationship relationship4 = new crystal.model.Relationship("AHEAD", imageIcon2, image3);
    javax.swing.ImageIcon imageIcon7 = null;
    java.awt.Image image8 = null;
    crystal.model.Relationship relationship9 = new crystal.model.Relationship("AHEAD", imageIcon7, image8);
    relationship4.calculateAction("AHEAD", relationship9);
    crystal.model.RevisionHistory.Capable capable11 = crystal.model.RevisionHistory.Capable.MUST;
    relationship9.setCapable(capable11);
    crystal.model.DataSource.RepoKind repoKind17 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment20 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind17, false, "hi!");
    crystal.model.Environment environment23 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind17, true, "PENDING");
    java.lang.String str24 = relationship9.getAction(repoKind17);
    crystal.model.RevisionHistory revisionHistory25 = new crystal.model.RevisionHistory("ERROR", repoKind17);
    javax.swing.ImageIcon imageIcon28 = null;
    java.awt.Image image29 = null;
    crystal.model.Relationship relationship30 = new crystal.model.Relationship("AHEAD", imageIcon28, image29);
    javax.swing.ImageIcon imageIcon33 = null;
    java.awt.Image image34 = null;
    crystal.model.Relationship relationship35 = new crystal.model.Relationship("AHEAD", imageIcon33, image34);
    relationship30.calculateAction("AHEAD", relationship35);
    crystal.model.RevisionHistory.Capable capable37 = crystal.model.RevisionHistory.Capable.MUST;
    relationship35.setCapable(capable37);
    crystal.model.DataSource.RepoKind repoKind43 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment46 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind43, false, "hi!");
    crystal.model.Environment environment49 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind43, true, "PENDING");
    java.lang.String str50 = relationship35.getAction(repoKind43);
    crystal.model.RevisionHistory revisionHistory51 = new crystal.model.RevisionHistory("ERROR", repoKind43);
    javax.swing.ImageIcon imageIcon54 = null;
    java.awt.Image image55 = null;
    crystal.model.Relationship relationship56 = new crystal.model.Relationship("AHEAD", imageIcon54, image55);
    javax.swing.ImageIcon imageIcon59 = null;
    java.awt.Image image60 = null;
    crystal.model.Relationship relationship61 = new crystal.model.Relationship("AHEAD", imageIcon59, image60);
    relationship56.calculateAction("AHEAD", relationship61);
    crystal.model.RevisionHistory.Capable capable63 = crystal.model.RevisionHistory.Capable.MUST;
    relationship61.setCapable(capable63);
    crystal.model.DataSource.RepoKind repoKind69 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment72 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind69, false, "hi!");
    crystal.model.Environment environment75 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind69, true, "PENDING");
    java.lang.String str76 = relationship61.getAction(repoKind69);
    crystal.model.RevisionHistory revisionHistory77 = new crystal.model.RevisionHistory("ERROR", repoKind69);
    java.lang.String str78 = revisionHistory77.toString();
    javax.swing.ImageIcon imageIcon80 = null;
    java.awt.Image image81 = null;
    crystal.model.Relationship relationship82 = new crystal.model.Relationship("AHEAD", imageIcon80, image81);
    javax.swing.ImageIcon imageIcon85 = null;
    java.awt.Image image86 = null;
    crystal.model.Relationship relationship87 = new crystal.model.Relationship("AHEAD", imageIcon85, image86);
    relationship82.calculateAction("AHEAD", relationship87);
    crystal.model.RevisionHistory.When when89 = crystal.model.RevisionHistory.When.LATER;
    relationship82.setWhen(when89);
    relationship82.setCommitters("TEST");
    crystal.model.Relationship relationship93 = relationship82.getConsequences();
    // The following exception was thrown during execution in test generation
    try {
    crystal.model.RevisionHistory.Capable capable95 = revisionHistory25.getCapable(revisionHistory51, revisionHistory77, relationship93, false);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + capable11 + "' != '" + crystal.model.RevisionHistory.Capable.MUST + "'", capable11.equals(crystal.model.RevisionHistory.Capable.MUST));
    org.junit.Assert.assertTrue("'" + repoKind17 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind17.equals(crystal.model.DataSource.RepoKind.HG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "cannot compute hg action"+ "'", str24.equals("cannot compute hg action"));
    org.junit.Assert.assertTrue("'" + capable37 + "' != '" + crystal.model.RevisionHistory.Capable.MUST + "'", capable37.equals(crystal.model.RevisionHistory.Capable.MUST));
    org.junit.Assert.assertTrue("'" + repoKind43 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind43.equals(crystal.model.DataSource.RepoKind.HG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "cannot compute hg action"+ "'", str50.equals("cannot compute hg action"));
    org.junit.Assert.assertTrue("'" + capable63 + "' != '" + crystal.model.RevisionHistory.Capable.MUST + "'", capable63.equals(crystal.model.RevisionHistory.Capable.MUST));
    org.junit.Assert.assertTrue("'" + repoKind69 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind69.equals(crystal.model.DataSource.RepoKind.HG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "cannot compute hg action"+ "'", str76.equals("cannot compute hg action"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str78 + "' != '" + ","+ "'", str78.equals(","));
    org.junit.Assert.assertTrue("'" + when89 + "' != '" + crystal.model.RevisionHistory.When.LATER + "'", when89.equals(crystal.model.RevisionHistory.When.LATER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(relationship93);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }

    double d0 = crystal.Constants.MIN_HG_VERSION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d0 == 1.6d);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }

    javax.swing.ImageIcon imageIcon1 = null;
    java.awt.Image image2 = null;
    crystal.model.Relationship relationship3 = new crystal.model.Relationship("AHEAD", imageIcon1, image2);
    crystal.util.JMultiLineToolTip jMultiLineToolTip4 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle5 = null;
    java.awt.Rectangle rectangle6 = jMultiLineToolTip4.getBounds(rectangle5);
    java.awt.Rectangle rectangle7 = jMultiLineToolTip4.getVisibleRect();
    boolean b8 = jMultiLineToolTip4.isEnabled();
    java.awt.Event event9 = null;
    boolean b12 = jMultiLineToolTip4.mouseEnter(event9, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener13 = null;
    jMultiLineToolTip4.addPropertyChangeListener(propertyChangeListener13);
    java.awt.Point point15 = jMultiLineToolTip4.getLocation();
    boolean b16 = relationship3.equals((java.lang.Object)jMultiLineToolTip4);
    jMultiLineToolTip4.setEnabled(true);
    jMultiLineToolTip4.firePropertyChange("$HOME", true, true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.event.InputMethodListener inputMethodListener6 = null;
    jMultiLineToolTip0.removeInputMethodListener(inputMethodListener6);
    java.awt.Graphics graphics8 = null;
    jMultiLineToolTip0.print(graphics8);
    java.awt.AWTEvent aWTEvent10 = null;
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.dispatchEvent(aWTEvent10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip0.firePropertyChange("", (double)0L, 0.0d);
    boolean b5 = jMultiLineToolTip0.getIgnoreRepaint();
    jMultiLineToolTip0.enable();
    java.awt.im.InputMethodRequests inputMethodRequests7 = jMultiLineToolTip0.getInputMethodRequests();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array8 = jMultiLineToolTip0.getMouseMotionListeners();
    jMultiLineToolTip0.requestFocus();
    jMultiLineToolTip0.layout();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputMethodRequests7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array8);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    javax.swing.KeyStroke keyStroke11 = null;
    jMultiLineToolTip0.unregisterKeyboardAction(keyStroke11);
    float f13 = jMultiLineToolTip0.getAlignmentY();
    java.awt.Rectangle rectangle14 = jMultiLineToolTip0.getBounds();
    java.awt.Event event15 = null;
    boolean b17 = jMultiLineToolTip0.keyUp(event15, 7);
    boolean b18 = jMultiLineToolTip0.isFocusTraversalPolicySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f13 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }

    int i0 = java.awt.Frame.MOVE_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 13);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }

    javax.swing.ImageIcon imageIcon1 = null;
    java.awt.Image image2 = null;
    crystal.model.Relationship relationship3 = new crystal.model.Relationship("AHEAD", imageIcon1, image2);
    javax.swing.ImageIcon imageIcon6 = null;
    java.awt.Image image7 = null;
    crystal.model.Relationship relationship8 = new crystal.model.Relationship("AHEAD", imageIcon6, image7);
    relationship3.calculateAction("AHEAD", relationship8);
    java.lang.String str10 = relationship3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "AHEAD"+ "'", str10.equals("AHEAD"));

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip0.firePropertyChange("", (double)0L, 0.0d);
    boolean b5 = jMultiLineToolTip0.getIgnoreRepaint();
    jMultiLineToolTip0.enable();
    boolean b7 = jMultiLineToolTip0.isForegroundSet();
    javax.swing.TransferHandler transferHandler8 = null;
    jMultiLineToolTip0.setTransferHandler(transferHandler8);
    jMultiLineToolTip0.firePropertyChange("Action: hg merge", (long)(byte)100, (long)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color1 = null;
    jMultiLineToolTip0.setBackground(color1);
    jMultiLineToolTip0.transferFocusBackward();
    jMultiLineToolTip0.firePropertyChange("$HOME", false, false);
    javax.swing.JPopupMenu jPopupMenu8 = jMultiLineToolTip0.getComponentPopupMenu();
    // The following exception was thrown during execution in test generation
    try {
    jPopupMenu8.setEnabled(true);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jPopupMenu8);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.ComponentOrientation componentOrientation7 = jMultiLineToolTip0.getComponentOrientation();
    java.awt.Event event8 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = jMultiLineToolTip0.postEvent(event8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentOrientation7);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    crystal.util.JMultiLineToolTip jMultiLineToolTip6 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle7 = null;
    java.awt.Rectangle rectangle8 = jMultiLineToolTip6.getBounds(rectangle7);
    java.awt.Event event9 = null;
    boolean b11 = jMultiLineToolTip6.action(event9, (java.lang.Object)'4');
    jMultiLineToolTip0.setComponent((javax.swing.JComponent)jMultiLineToolTip6);
    boolean b13 = jMultiLineToolTip6.isVisible();
    jMultiLineToolTip6.firePropertyChange("415725 hours 21 min", (-1.0d), (double)1);
    java.awt.Rectangle rectangle18 = jMultiLineToolTip6.getVisibleRect();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    jMultiLineToolTip0.setSize((int)' ', (-1));
    java.awt.GraphicsConfiguration graphicsConfiguration5 = jMultiLineToolTip0.getGraphicsConfiguration();
    jMultiLineToolTip0.requestFocus();
    jMultiLineToolTip0.reshape(11, (int)(short)0, (int)(byte)1, 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphicsConfiguration5);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }

    crystal.model.Relationship.MERGECONFLICT = "TESTCONFLICT";

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }

    crystal.client.ProjectPreferences projectPreferences0 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener1 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener2 = null;
    crystal.client.CalculateProjectTask calculateProjectTask3 = new crystal.client.CalculateProjectTask(projectPreferences0, computationListener1, computationListener2);
    java.beans.PropertyChangeSupport propertyChangeSupport4 = calculateProjectTask3.getPropertyChangeSupport();
    boolean b5 = calculateProjectTask3.isDone();
    javax.swing.SwingWorker.StateValue stateValue6 = calculateProjectTask3.getState();
    boolean b8 = calculateProjectTask3.cancel(true);
    calculateProjectTask3.execute();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeSupport4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    org.junit.Assert.assertTrue("'" + stateValue6 + "' != '" + javax.swing.SwingWorker.StateValue.PENDING + "'", stateValue6.equals(javax.swing.SwingWorker.StateValue.PENDING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }

    crystal.client.ProjectPreferences projectPreferences0 = null;
    crystal.model.DataSource.RepoKind repoKind7 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment10 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind7, false, "hi!");
    crystal.model.Environment environment13 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind7, true, "PENDING");
    crystal.model.DataSource dataSource16 = new crystal.model.DataSource("ToolTipUI", "415725 hours 21 min", repoKind7, true, "415725 hours 21 min");
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = crystal.util.ValidInputChecker.checkDataSourceNameDuplicate(projectPreferences0, dataSource16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + repoKind7 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind7.equals(crystal.model.DataSource.RepoKind.HG));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    jMultiLineToolTip0.firePropertyChange("AHEAD", 0, 128);
    jMultiLineToolTip0.setBounds((int)(byte)1, (int)(byte)100, 0, (-1));
    jMultiLineToolTip0.setDoubleBuffered(false);
    javax.swing.border.Border border14 = jMultiLineToolTip0.getBorder();
    boolean b15 = jMultiLineToolTip0.isForegroundSet();
    java.awt.LayoutManager layoutManager16 = null;
    jMultiLineToolTip0.setLayout(layoutManager16);
    java.awt.Dimension dimension18 = null;
    jMultiLineToolTip0.setPreferredSize(dimension18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(border14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }

    org.jdom.Document document1 = crystal.util.XMLTools.newXMLErrorDocument("");
    boolean b3 = crystal.util.XMLTools.writeXMLDocument(document1, "$HOME");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(document1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    crystal.util.JMultiLineToolTip jMultiLineToolTip6 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle7 = null;
    java.awt.Rectangle rectangle8 = jMultiLineToolTip6.getBounds(rectangle7);
    java.awt.Event event9 = null;
    boolean b11 = jMultiLineToolTip6.action(event9, (java.lang.Object)'4');
    jMultiLineToolTip0.setComponent((javax.swing.JComponent)jMultiLineToolTip6);
    crystal.util.JMultiLineToolTip jMultiLineToolTip13 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle14 = null;
    java.awt.Rectangle rectangle15 = jMultiLineToolTip13.getBounds(rectangle14);
    java.awt.Toolkit toolkit16 = jMultiLineToolTip13.getToolkit();
    jMultiLineToolTip13.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager20 = null;
    jMultiLineToolTip13.setLayout(layoutManager20);
    boolean b22 = jMultiLineToolTip13.isFocusOwner();
    boolean b23 = jMultiLineToolTip13.isShowing();
    java.awt.Graphics graphics24 = null;
    jMultiLineToolTip13.update(graphics24);
    java.awt.Component component26 = jMultiLineToolTip0.add((java.awt.Component)jMultiLineToolTip13);
    jMultiLineToolTip0.setToolTipText("Action: hg merge");
    crystal.util.JMultiLineToolTip jMultiLineToolTip29 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle30 = null;
    java.awt.Rectangle rectangle31 = jMultiLineToolTip29.getBounds(rectangle30);
    java.awt.Event event32 = null;
    boolean b34 = jMultiLineToolTip29.action(event32, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel35 = jMultiLineToolTip29.getColorModel();
    jMultiLineToolTip29.removeNotify();
    crystal.util.JMultiLineToolTip jMultiLineToolTip37 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle38 = null;
    java.awt.Rectangle rectangle39 = jMultiLineToolTip37.getBounds(rectangle38);
    java.awt.Toolkit toolkit40 = jMultiLineToolTip37.getToolkit();
    java.awt.Font font41 = null;
    jMultiLineToolTip37.setFont(font41);
    java.awt.Color color43 = jMultiLineToolTip37.getBackground();
    jMultiLineToolTip29.setForeground(color43);
    crystal.util.JMultiLineToolTip jMultiLineToolTip45 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle46 = null;
    java.awt.Rectangle rectangle47 = jMultiLineToolTip45.getBounds(rectangle46);
    jMultiLineToolTip45.firePropertyChange("AHEAD", 0, 128);
    jMultiLineToolTip45.setBounds((int)(byte)1, (int)(byte)100, 0, (-1));
    jMultiLineToolTip45.setDoubleBuffered(false);
    javax.swing.border.Border border59 = jMultiLineToolTip45.getBorder();
    java.lang.Object obj60 = jMultiLineToolTip29.getClientProperty((java.lang.Object)border59);
    jMultiLineToolTip0.setBorder(border59);
    java.awt.Graphics graphics62 = null;
    jMultiLineToolTip0.paint(graphics62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(border59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj60);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    jMultiLineToolTip0.setFocusTraversalPolicyProvider(false);
    java.io.PrintStream printStream13 = null;
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.list(printStream13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    crystal.util.JMultiLineToolTip jMultiLineToolTip6 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle7 = null;
    java.awt.Rectangle rectangle8 = jMultiLineToolTip6.getBounds(rectangle7);
    java.awt.Event event9 = null;
    boolean b11 = jMultiLineToolTip6.action(event9, (java.lang.Object)'4');
    jMultiLineToolTip0.setComponent((javax.swing.JComponent)jMultiLineToolTip6);
    java.awt.event.KeyListener keyListener13 = null;
    jMultiLineToolTip6.addKeyListener(keyListener13);
    java.awt.Dimension dimension15 = jMultiLineToolTip6.getMinimumSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension15);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }

    crystal.client.ClientPreferences.ConfigurationReadingException configurationReadingException2 = new crystal.client.ClientPreferences.ConfigurationReadingException("%5p - %m%n", (int)(short)0);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color1 = null;
    jMultiLineToolTip0.setBackground(color1);
    jMultiLineToolTip0.transferFocusBackward();
    jMultiLineToolTip0.firePropertyChange("$HOME", false, false);
    crystal.util.JMultiLineToolTip jMultiLineToolTip8 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle9 = null;
    java.awt.Rectangle rectangle10 = jMultiLineToolTip8.getBounds(rectangle9);
    jMultiLineToolTip8.firePropertyChange("AHEAD", 0, 128);
    javax.swing.InputVerifier inputVerifier15 = jMultiLineToolTip8.getInputVerifier();
    crystal.util.JMultiLineToolTip jMultiLineToolTip16 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle17 = null;
    java.awt.Rectangle rectangle18 = jMultiLineToolTip16.getBounds(rectangle17);
    java.awt.Event event19 = null;
    boolean b22 = jMultiLineToolTip16.mouseDrag(event19, 32, 1);
    java.awt.Graphics graphics23 = null;
    jMultiLineToolTip16.printComponents(graphics23);
    java.awt.Point point25 = jMultiLineToolTip16.location();
    jMultiLineToolTip8.setLocation(point25);
    java.awt.Component component27 = jMultiLineToolTip0.getComponentAt(point25);
    java.awt.Event event28 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b31 = component27.mouseEnter(event28, 5, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component27);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }

    javax.swing.ImageIcon imageIcon1 = null;
    java.awt.Image image2 = null;
    crystal.model.Relationship relationship3 = new crystal.model.Relationship("AHEAD", imageIcon1, image2);
    javax.swing.ImageIcon imageIcon6 = null;
    java.awt.Image image7 = null;
    crystal.model.Relationship relationship8 = new crystal.model.Relationship("AHEAD", imageIcon6, image7);
    relationship3.calculateAction("AHEAD", relationship8);
    crystal.model.RevisionHistory.When when10 = crystal.model.RevisionHistory.When.LATER;
    relationship3.setWhen(when10);
    relationship3.setCommitters("TEST");
    crystal.model.RevisionHistory.Ease ease14 = crystal.model.RevisionHistory.Ease.ME;
    relationship3.setEase(ease14);
    org.junit.Assert.assertTrue("'" + when10 + "' != '" + crystal.model.RevisionHistory.When.LATER + "'", when10.equals(crystal.model.RevisionHistory.When.LATER));
    org.junit.Assert.assertTrue("'" + ease14 + "' != '" + crystal.model.RevisionHistory.Ease.ME + "'", ease14.equals(crystal.model.RevisionHistory.Ease.ME));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.event.InputMethodListener inputMethodListener6 = null;
    jMultiLineToolTip0.removeInputMethodListener(inputMethodListener6);
    crystal.util.JMultiLineToolTip jMultiLineToolTip8 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color9 = null;
    jMultiLineToolTip8.setBackground(color9);
    jMultiLineToolTip8.transferFocusBackward();
    java.lang.Object obj12 = jMultiLineToolTip0.getClientProperty((java.lang.Object)jMultiLineToolTip8);
    crystal.util.JMultiLineToolTip jMultiLineToolTip13 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color14 = null;
    jMultiLineToolTip13.setBackground(color14);
    jMultiLineToolTip13.transferFocusBackward();
    jMultiLineToolTip13.firePropertyChange("$HOME", false, false);
    java.awt.Graphics graphics21 = null;
    jMultiLineToolTip13.paintComponents(graphics21);
    boolean b23 = jMultiLineToolTip13.isShowing();
    crystal.util.JMultiLineToolTip jMultiLineToolTip24 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle25 = null;
    java.awt.Rectangle rectangle26 = jMultiLineToolTip24.getBounds(rectangle25);
    java.awt.Toolkit toolkit27 = jMultiLineToolTip24.getToolkit();
    java.awt.Font font28 = null;
    jMultiLineToolTip24.setFont(font28);
    java.awt.Color color30 = jMultiLineToolTip24.getBackground();
    crystal.util.JMultiLineToolTip jMultiLineToolTip31 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle32 = null;
    java.awt.Rectangle rectangle33 = jMultiLineToolTip31.getBounds(rectangle32);
    crystal.util.JMultiLineToolTip jMultiLineToolTip34 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle35 = null;
    java.awt.Rectangle rectangle36 = jMultiLineToolTip34.getBounds(rectangle35);
    jMultiLineToolTip31.repaint(rectangle36);
    java.awt.Rectangle rectangle38 = jMultiLineToolTip24.getBounds(rectangle36);
    jMultiLineToolTip13.setBounds(rectangle38);
    jMultiLineToolTip8.repaint(rectangle38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle38);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.util.JMultiLineToolTip jMultiLineToolTip5 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle6 = null;
    java.awt.Rectangle rectangle7 = jMultiLineToolTip5.getBounds(rectangle6);
    java.awt.Rectangle rectangle8 = jMultiLineToolTip5.getVisibleRect();
    boolean b9 = jMultiLineToolTip5.isEnabled();
    java.beans.VetoableChangeListener[] vetoableChangeListener_array10 = jMultiLineToolTip5.getVetoableChangeListeners();
    boolean b11 = clientPreferences4.equals((java.lang.Object)vetoableChangeListener_array10);
    crystal.client.ClientPreferences clientPreferences16 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.util.JMultiLineToolTip jMultiLineToolTip17 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle18 = null;
    java.awt.Rectangle rectangle19 = jMultiLineToolTip17.getBounds(rectangle18);
    java.awt.Rectangle rectangle20 = jMultiLineToolTip17.getVisibleRect();
    boolean b21 = jMultiLineToolTip17.isEnabled();
    java.beans.VetoableChangeListener[] vetoableChangeListener_array22 = jMultiLineToolTip17.getVetoableChangeListeners();
    boolean b23 = clientPreferences16.equals((java.lang.Object)vetoableChangeListener_array22);
    java.lang.String str24 = clientPreferences16.getHgPath();
    long long25 = clientPreferences16.getRefresh();
    crystal.model.DataSource.RepoKind repoKind30 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment33 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind30, false, "hi!");
    crystal.model.Environment environment36 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind30, true, "PENDING");
    environment36.setCompileCommand("TESTCONFLICT");
    crystal.client.ClientPreferences clientPreferences43 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences44 = null;
    clientPreferences43.addProjectPreferences(projectPreferences44);
    clientPreferences43.setGitPath("");
    crystal.client.ProjectPreferences projectPreferences48 = null;
    clientPreferences43.removeProjectPreferences(projectPreferences48);
    crystal.client.ProjectPreferences projectPreferences50 = new crystal.client.ProjectPreferences((crystal.model.DataSource)environment36, clientPreferences43);
    clientPreferences16.addProjectPreferences(projectPreferences50);
    // The following exception was thrown during execution in test generation
    try {
    crystal.client.DataSourceGuiEditorFrame dataSourceGuiEditorFrame53 = new crystal.client.DataSourceGuiEditorFrame(clientPreferences4, projectPreferences50, "$HOME");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vetoableChangeListener_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vetoableChangeListener_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "TESTCONFLICT"+ "'", str24.equals("TESTCONFLICT"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long25 == 32L);
    org.junit.Assert.assertTrue("'" + repoKind30 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind30.equals(crystal.model.DataSource.RepoKind.HG));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.event.InputMethodListener inputMethodListener6 = null;
    jMultiLineToolTip0.removeInputMethodListener(inputMethodListener6);
    java.awt.Graphics graphics8 = null;
    jMultiLineToolTip0.print(graphics8);
    jMultiLineToolTip0.repaint(4, 3, 128, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.Font font4 = null;
    jMultiLineToolTip0.setFont(font4);
    javax.swing.KeyStroke[] keyStroke_array6 = jMultiLineToolTip0.getRegisteredKeyStrokes();
    java.awt.Dimension dimension7 = jMultiLineToolTip0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(keyStroke_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension7);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.Component component8 = jMultiLineToolTip0.locate((int)'4', 1);
    jMultiLineToolTip0.setFocusTraversalPolicyProvider(true);
    crystal.util.JMultiLineToolTip jMultiLineToolTip11 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle12 = null;
    java.awt.Rectangle rectangle13 = jMultiLineToolTip11.getBounds(rectangle12);
    java.awt.Rectangle rectangle14 = jMultiLineToolTip11.getVisibleRect();
    boolean b15 = jMultiLineToolTip11.isEnabled();
    java.awt.Dimension dimension16 = null;
    jMultiLineToolTip11.setPreferredSize(dimension16);
    jMultiLineToolTip11.show();
    crystal.util.JMultiLineToolTip jMultiLineToolTip19 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle20 = null;
    java.awt.Rectangle rectangle21 = jMultiLineToolTip19.getBounds(rectangle20);
    java.awt.Rectangle rectangle22 = jMultiLineToolTip19.getVisibleRect();
    boolean b23 = jMultiLineToolTip19.isEnabled();
    java.awt.Event event24 = null;
    boolean b27 = jMultiLineToolTip19.mouseEnter(event24, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener28 = null;
    jMultiLineToolTip19.addPropertyChangeListener(propertyChangeListener28);
    jMultiLineToolTip19.setFocusTraversalPolicyProvider(false);
    jMultiLineToolTip19.repaint((long)'a');
    crystal.util.JMultiLineToolTip jMultiLineToolTip34 = new crystal.util.JMultiLineToolTip();
    boolean b35 = jMultiLineToolTip34.isFocusTraversalPolicyProvider();
    jMultiLineToolTip34.firePropertyChange("hi!", ' ', '#');
    java.awt.Dimension dimension40 = jMultiLineToolTip34.getMaximumSize();
    jMultiLineToolTip19.resize(dimension40);
    jMultiLineToolTip11.setMaximumSize(dimension40);
    crystal.util.JMultiLineToolTip jMultiLineToolTip43 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle44 = null;
    java.awt.Rectangle rectangle45 = jMultiLineToolTip43.getBounds(rectangle44);
    java.awt.Rectangle rectangle46 = jMultiLineToolTip43.getVisibleRect();
    boolean b47 = jMultiLineToolTip43.isEnabled();
    java.awt.Dimension dimension48 = null;
    jMultiLineToolTip43.setPreferredSize(dimension48);
    jMultiLineToolTip43.move(10, (int)(short)10);
    java.awt.Point point54 = jMultiLineToolTip43.getMousePosition(true);
    java.awt.im.InputContext inputContext55 = jMultiLineToolTip43.getInputContext();
    jMultiLineToolTip0.putClientProperty((java.lang.Object)dimension40, (java.lang.Object)jMultiLineToolTip43);
    java.awt.event.ActionListener actionListener57 = null;
    javax.swing.KeyStroke keyStroke59 = null;
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.registerKeyboardAction(actionListener57, "%5p - %m%n", keyStroke59, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputContext55);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }

    java.lang.String str1 = crystal.util.RunIt.getExecutable("cannot compute hg action");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.event.InputMethodListener inputMethodListener6 = null;
    jMultiLineToolTip0.removeInputMethodListener(inputMethodListener6);
    crystal.util.JMultiLineToolTip jMultiLineToolTip8 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color9 = null;
    jMultiLineToolTip8.setBackground(color9);
    jMultiLineToolTip8.transferFocusBackward();
    java.lang.Object obj12 = jMultiLineToolTip0.getClientProperty((java.lang.Object)jMultiLineToolTip8);
    java.awt.FocusTraversalPolicy focusTraversalPolicy13 = jMultiLineToolTip0.getFocusTraversalPolicy();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(focusTraversalPolicy13);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Dimension dimension5 = null;
    jMultiLineToolTip0.setPreferredSize(dimension5);
    crystal.util.JMultiLineToolTip jMultiLineToolTip7 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle8 = null;
    java.awt.Rectangle rectangle9 = jMultiLineToolTip7.getBounds(rectangle8);
    java.awt.Event event10 = null;
    boolean b12 = jMultiLineToolTip7.action(event10, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel13 = jMultiLineToolTip7.getColorModel();
    boolean b14 = jMultiLineToolTip0.isAncestorOf((java.awt.Component)jMultiLineToolTip7);
    boolean b15 = jMultiLineToolTip0.isShowing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }

    crystal.client.PreferencesGUIEditorFrame preferencesGUIEditorFrame0 = crystal.client.PreferencesGUIEditorFrame.getPreferencesGUIEditorFrame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(preferencesGUIEditorFrame0);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }

    crystal.model.RevisionHistory.When when0 = crystal.model.RevisionHistory.When.NOW;
    org.junit.Assert.assertTrue("'" + when0 + "' != '" + crystal.model.RevisionHistory.When.NOW + "'", when0.equals(crystal.model.RevisionHistory.When.NOW));

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }

    java.util.Map<crystal.server.AbstractLogParser.CheckpointLabels,java.lang.String> map_checkpointLabels_str0 = crystal.server.HgLogParser.hgCheckpoint;
    crystal.server.HgLogParser.hgCheckpoint = map_checkpointLabels_str0;
    crystal.server.HgLogParser.hgCheckpoint = map_checkpointLabels_str0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_checkpointLabels_str0);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }

    java.lang.String str0 = crystal.util.LSMRLogger.LOG_PATTERN_VERBOSE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "415725 hours 21 min"+ "'", str0.equals("415725 hours 21 min"));

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }

    javax.swing.ImageIcon imageIcon1 = null;
    java.awt.Image image2 = null;
    crystal.model.Relationship relationship3 = new crystal.model.Relationship("AHEAD", imageIcon1, image2);
    crystal.util.JMultiLineToolTip jMultiLineToolTip4 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle5 = null;
    java.awt.Rectangle rectangle6 = jMultiLineToolTip4.getBounds(rectangle5);
    java.awt.Rectangle rectangle7 = jMultiLineToolTip4.getVisibleRect();
    boolean b8 = jMultiLineToolTip4.isEnabled();
    java.awt.Event event9 = null;
    boolean b12 = jMultiLineToolTip4.mouseEnter(event9, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener13 = null;
    jMultiLineToolTip4.addPropertyChangeListener(propertyChangeListener13);
    java.awt.Point point15 = jMultiLineToolTip4.getLocation();
    boolean b16 = relationship3.equals((java.lang.Object)jMultiLineToolTip4);
    java.awt.Graphics graphics17 = null;
    jMultiLineToolTip4.update(graphics17);
    jMultiLineToolTip4.repaint(1L, 0, (int)(short)-1, 6, 0);
    javax.swing.ActionMap actionMap25 = null;
    jMultiLineToolTip4.setActionMap(actionMap25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "$HOME", "$HOME", "AHEAD" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str4 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str4, str_array3);
    java.lang.String[] str_array14 = new java.lang.String[] { "0 ms", "$HOME", "", "$HOME", "$HOME", "415725 hours 21 min", "", "$HOME" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str15 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str15, str_array14);
    java.util.Set<java.lang.String> set_str17 = crystal.util.SetOperations.setDifference((java.util.Set<java.lang.String>)linkedhashset_str4, (java.util.Set<java.lang.String>)linkedhashset_str15);
    java.lang.String[] str_array21 = new java.lang.String[] { "$HOME", "$HOME", "AHEAD" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str22 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str22, str_array21);
    java.lang.String[] str_array32 = new java.lang.String[] { "0 ms", "$HOME", "", "$HOME", "$HOME", "415725 hours 21 min", "", "$HOME" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str33 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str33, str_array32);
    java.util.Set<java.lang.String> set_str35 = crystal.util.SetOperations.setDifference((java.util.Set<java.lang.String>)linkedhashset_str22, (java.util.Set<java.lang.String>)linkedhashset_str33);
    java.lang.String[] str_array39 = new java.lang.String[] { "$HOME", "$HOME", "AHEAD" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str40 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str40, str_array39);
    java.lang.String[] str_array50 = new java.lang.String[] { "0 ms", "$HOME", "", "$HOME", "$HOME", "415725 hours 21 min", "", "$HOME" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str51 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str51, str_array50);
    java.util.Set<java.lang.String> set_str53 = crystal.util.SetOperations.setDifference((java.util.Set<java.lang.String>)linkedhashset_str40, (java.util.Set<java.lang.String>)linkedhashset_str51);
    java.util.Set<java.lang.String> set_str54 = crystal.util.SetOperations.xor(set_str35, set_str53);
    java.lang.String[] str_array58 = new java.lang.String[] { "$HOME", "$HOME", "AHEAD" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str59 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str59, str_array58);
    java.lang.String[] str_array69 = new java.lang.String[] { "0 ms", "$HOME", "", "$HOME", "$HOME", "415725 hours 21 min", "", "$HOME" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str70 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str70, str_array69);
    java.util.Set<java.lang.String> set_str72 = crystal.util.SetOperations.setDifference((java.util.Set<java.lang.String>)linkedhashset_str59, (java.util.Set<java.lang.String>)linkedhashset_str70);
    java.lang.String[] str_array76 = new java.lang.String[] { "$HOME", "$HOME", "AHEAD" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str77 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str77, str_array76);
    java.lang.String[] str_array87 = new java.lang.String[] { "0 ms", "$HOME", "", "$HOME", "$HOME", "415725 hours 21 min", "", "$HOME" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str88 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str88, str_array87);
    java.util.Set<java.lang.String> set_str90 = crystal.util.SetOperations.setDifference((java.util.Set<java.lang.String>)linkedhashset_str77, (java.util.Set<java.lang.String>)linkedhashset_str88);
    java.util.Set<java.lang.String> set_str91 = crystal.util.SetOperations.xor(set_str72, set_str90);
    java.util.Set<java.lang.String> set_str92 = crystal.util.SetOperations.intersection(set_str53, set_str90);
    java.util.Set<java.lang.String> set_str93 = crystal.util.SetOperations.setDifference((java.util.Set<java.lang.String>)linkedhashset_str15, set_str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str93);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    javax.swing.KeyStroke keyStroke11 = null;
    jMultiLineToolTip0.unregisterKeyboardAction(keyStroke11);
    java.awt.Graphics graphics13 = null;
    jMultiLineToolTip0.print(graphics13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    jMultiLineToolTip0.firePropertyChange("AHEAD", 0, 128);
    jMultiLineToolTip0.paintImmediately(3, (int)(byte)10, 100, (int)(short)0);
    int i12 = jMultiLineToolTip0.getColumns();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.Font font4 = null;
    jMultiLineToolTip0.setFont(font4);
    javax.swing.KeyStroke[] keyStroke_array6 = jMultiLineToolTip0.getRegisteredKeyStrokes();
    crystal.util.JMultiLineToolTip jMultiLineToolTip7 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle8 = null;
    java.awt.Rectangle rectangle9 = jMultiLineToolTip7.getBounds(rectangle8);
    java.awt.Rectangle rectangle10 = jMultiLineToolTip7.getVisibleRect();
    boolean b11 = jMultiLineToolTip7.isEnabled();
    java.awt.Event event12 = null;
    boolean b15 = jMultiLineToolTip7.mouseEnter(event12, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener16 = null;
    jMultiLineToolTip7.addPropertyChangeListener(propertyChangeListener16);
    javax.swing.KeyStroke keyStroke18 = null;
    jMultiLineToolTip7.unregisterKeyboardAction(keyStroke18);
    jMultiLineToolTip7.enableInputMethods(false);
    java.awt.event.ComponentListener componentListener22 = null;
    jMultiLineToolTip7.addComponentListener(componentListener22);
    crystal.util.JMultiLineToolTip jMultiLineToolTip24 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip24.firePropertyChange("", (double)0L, 0.0d);
    java.awt.Graphics graphics29 = null;
    jMultiLineToolTip24.printAll(graphics29);
    crystal.util.JMultiLineToolTip jMultiLineToolTip31 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle32 = null;
    java.awt.Rectangle rectangle33 = jMultiLineToolTip31.getBounds(rectangle32);
    java.awt.Toolkit toolkit34 = jMultiLineToolTip31.getToolkit();
    java.awt.Font font35 = null;
    jMultiLineToolTip31.setFont(font35);
    java.awt.Color color37 = jMultiLineToolTip31.getBackground();
    crystal.util.JMultiLineToolTip jMultiLineToolTip38 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle39 = null;
    java.awt.Rectangle rectangle40 = jMultiLineToolTip38.getBounds(rectangle39);
    crystal.util.JMultiLineToolTip jMultiLineToolTip41 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle42 = null;
    java.awt.Rectangle rectangle43 = jMultiLineToolTip41.getBounds(rectangle42);
    jMultiLineToolTip38.repaint(rectangle43);
    java.awt.Rectangle rectangle45 = jMultiLineToolTip31.getBounds(rectangle43);
    java.awt.Rectangle rectangle46 = jMultiLineToolTip24.getBounds(rectangle45);
    jMultiLineToolTip7.scrollRectToVisible(rectangle45);
    java.awt.Rectangle rectangle48 = jMultiLineToolTip0.getBounds(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(keyStroke_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle48);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    jMultiLineToolTip0.firePropertyChange("hi!", ' ', '#');
    java.awt.Dimension dimension6 = jMultiLineToolTip0.getMaximumSize();
    boolean b7 = jMultiLineToolTip0.isFocusTraversalPolicySet();
    java.awt.Graphics graphics8 = null;
    jMultiLineToolTip0.printAll(graphics8);
    java.awt.FocusTraversalPolicy focusTraversalPolicy10 = null;
    jMultiLineToolTip0.setFocusTraversalPolicy(focusTraversalPolicy10);
    java.awt.Insets insets12 = jMultiLineToolTip0.getInsets();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets12);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }

    // The following exception was thrown during execution in test generation
    try {
    crystal.util.ValidInputChecker.checkValidDirectoryPath("");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.event.InputMethodListener inputMethodListener6 = null;
    jMultiLineToolTip0.removeInputMethodListener(inputMethodListener6);
    java.awt.Graphics graphics8 = null;
    jMultiLineToolTip0.print(graphics8);
    java.awt.Color color10 = jMultiLineToolTip0.getForeground();
    javax.swing.JPopupMenu jPopupMenu11 = jMultiLineToolTip0.getComponentPopupMenu();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jPopupMenu11);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.event.InputMethodListener inputMethodListener6 = null;
    jMultiLineToolTip0.removeInputMethodListener(inputMethodListener6);
    java.awt.Graphics graphics8 = null;
    jMultiLineToolTip0.print(graphics8);
    java.awt.Event event10 = null;
    boolean b13 = jMultiLineToolTip0.mouseMove(event10, (int)(byte)1, 100);
    java.awt.image.ImageProducer imageProducer14 = null;
    java.awt.Image image15 = jMultiLineToolTip0.createImage(imageProducer14);
    java.awt.event.InputMethodListener inputMethodListener16 = null;
    jMultiLineToolTip0.addInputMethodListener(inputMethodListener16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image15);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Dimension dimension5 = null;
    jMultiLineToolTip0.setPreferredSize(dimension5);
    boolean b7 = jMultiLineToolTip0.isFocusTraversable();
    java.awt.Graphics graphics8 = null;
    jMultiLineToolTip0.printAll(graphics8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setName("hi!");
    javax.swing.ImageIcon imageIcon7 = null;
    java.awt.Image image8 = null;
    crystal.model.Relationship relationship9 = new crystal.model.Relationship("AHEAD", imageIcon7, image8);
    crystal.util.JMultiLineToolTip jMultiLineToolTip10 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle11 = null;
    java.awt.Rectangle rectangle12 = jMultiLineToolTip10.getBounds(rectangle11);
    java.awt.Rectangle rectangle13 = jMultiLineToolTip10.getVisibleRect();
    boolean b14 = jMultiLineToolTip10.isEnabled();
    java.awt.Event event15 = null;
    boolean b18 = jMultiLineToolTip10.mouseEnter(event15, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener19 = null;
    jMultiLineToolTip10.addPropertyChangeListener(propertyChangeListener19);
    java.awt.Point point21 = jMultiLineToolTip10.getLocation();
    boolean b22 = relationship9.equals((java.lang.Object)jMultiLineToolTip10);
    java.awt.Image image23 = relationship9.getImage();
    boolean b29 = jMultiLineToolTip0.imageUpdate(image23, 32, (int)(short)1, (int)(short)100, 128, 9);
    int i30 = jMultiLineToolTip0.getColumns();
    java.awt.Component.BaselineResizeBehavior baselineResizeBehavior31 = jMultiLineToolTip0.getBaselineResizeBehavior();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    org.junit.Assert.assertTrue("'" + baselineResizeBehavior31 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior31.equals(java.awt.Component.BaselineResizeBehavior.OTHER));

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b6 = jMultiLineToolTip0.mouseDrag(event3, 32, 1);
    java.awt.Graphics graphics7 = null;
    jMultiLineToolTip0.printComponents(graphics7);
    java.awt.event.FocusListener[] focusListener_array9 = jMultiLineToolTip0.getFocusListeners();
    java.awt.event.ActionListener actionListener10 = null;
    javax.swing.KeyStroke keyStroke12 = null;
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.registerKeyboardAction(actionListener10, "", keyStroke12, 128);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array9);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.FocusTraversalPolicy focusTraversalPolicy4 = null;
    jMultiLineToolTip0.setFocusTraversalPolicy(focusTraversalPolicy4);
    boolean b6 = jMultiLineToolTip0.isForegroundSet();
    jMultiLineToolTip0.setFocusable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ClientPreferences clientPreferences5 = clientPreferences4.clone();
    java.lang.String str6 = clientPreferences4.getTempDirectory();
    crystal.client.ProjectPreferences projectPreferences7 = null;
    clientPreferences4.removeProjectPreferences(projectPreferences7);
    crystal.util.JMultiLineToolTip jMultiLineToolTip9 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle10 = null;
    java.awt.Rectangle rectangle11 = jMultiLineToolTip9.getBounds(rectangle10);
    java.awt.Toolkit toolkit12 = jMultiLineToolTip9.getToolkit();
    java.awt.Font font13 = null;
    jMultiLineToolTip9.setFont(font13);
    java.awt.Color color15 = jMultiLineToolTip9.getBackground();
    crystal.util.JMultiLineToolTip jMultiLineToolTip16 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle17 = null;
    java.awt.Rectangle rectangle18 = jMultiLineToolTip16.getBounds(rectangle17);
    crystal.util.JMultiLineToolTip jMultiLineToolTip19 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle20 = null;
    java.awt.Rectangle rectangle21 = jMultiLineToolTip19.getBounds(rectangle20);
    jMultiLineToolTip16.repaint(rectangle21);
    java.awt.Rectangle rectangle23 = jMultiLineToolTip9.getBounds(rectangle21);
    boolean b24 = clientPreferences4.equals((java.lang.Object)rectangle23);
    crystal.client.ProjectPreferences projectPreferences25 = null;
    clientPreferences4.removeProjectPreferences(projectPreferences25);
    long long27 = clientPreferences4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clientPreferences5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long27 == 32L);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }

    boolean b1 = crystal.util.ValidInputChecker.checkDirectoryPath(",");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    crystal.util.JMultiLineToolTip jMultiLineToolTip3 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle4 = null;
    java.awt.Rectangle rectangle5 = jMultiLineToolTip3.getBounds(rectangle4);
    jMultiLineToolTip0.repaint(rectangle5);
    java.awt.event.ComponentListener componentListener7 = null;
    jMultiLineToolTip0.removeComponentListener(componentListener7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    jMultiLineToolTip0.firePropertyChange("AHEAD", 0, 128);
    jMultiLineToolTip0.setBounds((int)(byte)1, (int)(byte)100, 0, (-1));
    java.awt.Event event12 = null;
    boolean b15 = jMultiLineToolTip0.mouseDrag(event12, 3, 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setName("hi!");
    int i6 = jMultiLineToolTip0.getX();
    jMultiLineToolTip0.disable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip0.firePropertyChange("", (double)0L, 0.0d);
    java.beans.PropertyChangeListener propertyChangeListener6 = null;
    jMultiLineToolTip0.removePropertyChangeListener("0 ms", propertyChangeListener6);
    javax.swing.event.AncestorListener ancestorListener8 = null;
    jMultiLineToolTip0.addAncestorListener(ancestorListener8);
    jMultiLineToolTip0.setToolTipText("ToolTipUI");

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Dimension dimension5 = null;
    jMultiLineToolTip0.setPreferredSize(dimension5);
    jMultiLineToolTip0.show();
    crystal.util.JMultiLineToolTip jMultiLineToolTip8 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle9 = null;
    java.awt.Rectangle rectangle10 = jMultiLineToolTip8.getBounds(rectangle9);
    java.awt.Rectangle rectangle11 = jMultiLineToolTip8.getVisibleRect();
    boolean b12 = jMultiLineToolTip8.isEnabled();
    java.awt.Event event13 = null;
    boolean b16 = jMultiLineToolTip8.mouseEnter(event13, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener17 = null;
    jMultiLineToolTip8.addPropertyChangeListener(propertyChangeListener17);
    jMultiLineToolTip8.setFocusTraversalPolicyProvider(false);
    jMultiLineToolTip8.repaint((long)'a');
    crystal.util.JMultiLineToolTip jMultiLineToolTip23 = new crystal.util.JMultiLineToolTip();
    boolean b24 = jMultiLineToolTip23.isFocusTraversalPolicyProvider();
    jMultiLineToolTip23.firePropertyChange("hi!", ' ', '#');
    java.awt.Dimension dimension29 = jMultiLineToolTip23.getMaximumSize();
    jMultiLineToolTip8.resize(dimension29);
    jMultiLineToolTip0.setMaximumSize(dimension29);
    java.beans.PropertyChangeListener[] propertyChangeListener_array32 = jMultiLineToolTip0.getPropertyChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array32);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }

    crystal.model.Relationship.ERROR = "415725 hours 22 min";

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setName("hi!");
    javax.swing.ImageIcon imageIcon7 = null;
    java.awt.Image image8 = null;
    crystal.model.Relationship relationship9 = new crystal.model.Relationship("AHEAD", imageIcon7, image8);
    crystal.util.JMultiLineToolTip jMultiLineToolTip10 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle11 = null;
    java.awt.Rectangle rectangle12 = jMultiLineToolTip10.getBounds(rectangle11);
    java.awt.Rectangle rectangle13 = jMultiLineToolTip10.getVisibleRect();
    boolean b14 = jMultiLineToolTip10.isEnabled();
    java.awt.Event event15 = null;
    boolean b18 = jMultiLineToolTip10.mouseEnter(event15, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener19 = null;
    jMultiLineToolTip10.addPropertyChangeListener(propertyChangeListener19);
    java.awt.Point point21 = jMultiLineToolTip10.getLocation();
    boolean b22 = relationship9.equals((java.lang.Object)jMultiLineToolTip10);
    java.awt.Image image23 = relationship9.getImage();
    boolean b29 = jMultiLineToolTip0.imageUpdate(image23, 32, (int)(short)1, (int)(short)100, 128, 9);
    java.awt.event.MouseMotionListener[] mouseMotionListener_array30 = jMultiLineToolTip0.getMouseMotionListeners();
    boolean b31 = jMultiLineToolTip0.getFocusTraversalKeysEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener4 = null;
    jMultiLineToolTip0.addHierarchyBoundsListener(hierarchyBoundsListener4);
    jMultiLineToolTip0.setFocusable(false);
    jMultiLineToolTip0.firePropertyChange("ToolTipUI", (double)(byte)-1, (double)7);
    java.awt.image.ColorModel colorModel12 = jMultiLineToolTip0.getColorModel();
    boolean b13 = jMultiLineToolTip0.getVerifyInputWhenFocusTarget();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color1 = null;
    jMultiLineToolTip0.setBackground(color1);
    jMultiLineToolTip0.transferFocusBackward();
    jMultiLineToolTip0.firePropertyChange("$HOME", false, false);
    crystal.util.JMultiLineToolTip jMultiLineToolTip8 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle9 = null;
    java.awt.Rectangle rectangle10 = jMultiLineToolTip8.getBounds(rectangle9);
    jMultiLineToolTip8.firePropertyChange("AHEAD", 0, 128);
    javax.swing.InputVerifier inputVerifier15 = jMultiLineToolTip8.getInputVerifier();
    crystal.util.JMultiLineToolTip jMultiLineToolTip16 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle17 = null;
    java.awt.Rectangle rectangle18 = jMultiLineToolTip16.getBounds(rectangle17);
    java.awt.Event event19 = null;
    boolean b22 = jMultiLineToolTip16.mouseDrag(event19, 32, 1);
    java.awt.Graphics graphics23 = null;
    jMultiLineToolTip16.printComponents(graphics23);
    java.awt.Point point25 = jMultiLineToolTip16.location();
    jMultiLineToolTip8.setLocation(point25);
    java.awt.Component component27 = jMultiLineToolTip0.getComponentAt(point25);
    jMultiLineToolTip0.repaint(600L, 32, (int)'#', 8, (int)(byte)100);
    java.awt.Color color34 = jMultiLineToolTip0.getBackground();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(color34);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.event.InputMethodListener inputMethodListener7 = null;
    jMultiLineToolTip0.addInputMethodListener(inputMethodListener7);
    boolean b9 = jMultiLineToolTip0.isPaintingForPrint();
    java.awt.event.HierarchyListener hierarchyListener10 = null;
    jMultiLineToolTip0.removeHierarchyListener(hierarchyListener10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    javax.swing.KeyStroke keyStroke11 = null;
    jMultiLineToolTip0.unregisterKeyboardAction(keyStroke11);
    crystal.util.JMultiLineToolTip jMultiLineToolTip13 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle14 = null;
    java.awt.Rectangle rectangle15 = jMultiLineToolTip13.getBounds(rectangle14);
    java.awt.Rectangle rectangle16 = jMultiLineToolTip13.getVisibleRect();
    jMultiLineToolTip0.paintImmediately(rectangle16);
    javax.swing.JPopupMenu jPopupMenu18 = null;
    jMultiLineToolTip0.setComponentPopupMenu(jPopupMenu18);
    crystal.util.JMultiLineToolTip jMultiLineToolTip20 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle21 = null;
    java.awt.Rectangle rectangle22 = jMultiLineToolTip20.getBounds(rectangle21);
    java.awt.Toolkit toolkit23 = jMultiLineToolTip20.getToolkit();
    jMultiLineToolTip20.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager27 = null;
    jMultiLineToolTip20.setLayout(layoutManager27);
    boolean b29 = jMultiLineToolTip20.isFocusOwner();
    boolean b30 = jMultiLineToolTip20.isShowing();
    jMultiLineToolTip20.transferFocusUpCycle();
    crystal.util.JMultiLineToolTip jMultiLineToolTip32 = new crystal.util.JMultiLineToolTip();
    boolean b33 = jMultiLineToolTip32.isFocusTraversalPolicyProvider();
    java.awt.Dimension dimension34 = jMultiLineToolTip32.preferredSize();
    java.awt.Dimension dimension35 = jMultiLineToolTip20.getSize(dimension34);
    java.awt.Component component36 = jMultiLineToolTip0.add((java.awt.Component)jMultiLineToolTip20);
    jMultiLineToolTip20.enable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component36);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    crystal.util.JMultiLineToolTip jMultiLineToolTip6 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle7 = null;
    java.awt.Rectangle rectangle8 = jMultiLineToolTip6.getBounds(rectangle7);
    java.awt.Event event9 = null;
    boolean b11 = jMultiLineToolTip6.action(event9, (java.lang.Object)'4');
    jMultiLineToolTip0.setComponent((javax.swing.JComponent)jMultiLineToolTip6);
    boolean b13 = jMultiLineToolTip6.isVisible();
    jMultiLineToolTip6.setVisible(false);
    java.awt.Event event16 = null;
    crystal.util.JMultiLineToolTip jMultiLineToolTip17 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle18 = null;
    java.awt.Rectangle rectangle19 = jMultiLineToolTip17.getBounds(rectangle18);
    java.awt.Toolkit toolkit20 = jMultiLineToolTip17.getToolkit();
    jMultiLineToolTip17.setSize(32, (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener25 = null;
    jMultiLineToolTip17.removePropertyChangeListener("415725 hours 21 min", propertyChangeListener25);
    java.awt.event.KeyListener keyListener27 = null;
    jMultiLineToolTip17.removeKeyListener(keyListener27);
    jMultiLineToolTip17.setFocusTraversalKeysEnabled(true);
    boolean b31 = jMultiLineToolTip6.lostFocus(event16, (java.lang.Object)jMultiLineToolTip17);
    java.awt.Container container32 = jMultiLineToolTip17.getFocusCycleRootAncestor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container32);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Dimension dimension5 = null;
    jMultiLineToolTip0.setPreferredSize(dimension5);
    jMultiLineToolTip0.move(10, (int)(short)10);
    java.awt.Point point11 = jMultiLineToolTip0.getMousePosition(true);
    java.awt.im.InputContext inputContext12 = jMultiLineToolTip0.getInputContext();
    javax.swing.KeyStroke[] keyStroke_array13 = jMultiLineToolTip0.getRegisteredKeyStrokes();
    crystal.util.JMultiLineToolTip jMultiLineToolTip14 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle15 = null;
    java.awt.Rectangle rectangle16 = jMultiLineToolTip14.getBounds(rectangle15);
    java.awt.Toolkit toolkit17 = jMultiLineToolTip14.getToolkit();
    jMultiLineToolTip14.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager21 = null;
    jMultiLineToolTip14.setLayout(layoutManager21);
    boolean b23 = jMultiLineToolTip14.isFocusOwner();
    boolean b24 = jMultiLineToolTip14.isShowing();
    jMultiLineToolTip14.transferFocusUpCycle();
    crystal.util.JMultiLineToolTip jMultiLineToolTip26 = new crystal.util.JMultiLineToolTip();
    boolean b27 = jMultiLineToolTip26.isFocusTraversalPolicyProvider();
    java.awt.Dimension dimension28 = jMultiLineToolTip26.preferredSize();
    java.awt.Dimension dimension29 = jMultiLineToolTip14.getSize(dimension28);
    crystal.util.JMultiLineToolTip jMultiLineToolTip30 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle31 = null;
    java.awt.Rectangle rectangle32 = jMultiLineToolTip30.getBounds(rectangle31);
    java.awt.Event event33 = null;
    boolean b35 = jMultiLineToolTip30.action(event33, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel36 = jMultiLineToolTip30.getColorModel();
    jMultiLineToolTip30.removeNotify();
    crystal.util.JMultiLineToolTip jMultiLineToolTip38 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle39 = null;
    java.awt.Rectangle rectangle40 = jMultiLineToolTip38.getBounds(rectangle39);
    java.awt.Toolkit toolkit41 = jMultiLineToolTip38.getToolkit();
    java.awt.Font font42 = null;
    jMultiLineToolTip38.setFont(font42);
    java.awt.Color color44 = jMultiLineToolTip38.getBackground();
    jMultiLineToolTip30.setForeground(color44);
    crystal.util.JMultiLineToolTip jMultiLineToolTip46 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle47 = null;
    java.awt.Rectangle rectangle48 = jMultiLineToolTip46.getBounds(rectangle47);
    jMultiLineToolTip46.firePropertyChange("AHEAD", 0, 128);
    jMultiLineToolTip46.setBounds((int)(byte)1, (int)(byte)100, 0, (-1));
    jMultiLineToolTip46.setDoubleBuffered(false);
    javax.swing.border.Border border60 = jMultiLineToolTip46.getBorder();
    java.lang.Object obj61 = jMultiLineToolTip30.getClientProperty((java.lang.Object)border60);
    java.awt.Event event62 = null;
    boolean b65 = jMultiLineToolTip30.mouseDown(event62, 64, 128);
    java.awt.Font font66 = jMultiLineToolTip30.getFont();
    jMultiLineToolTip14.setFont(font66);
    java.awt.FontMetrics fontMetrics68 = jMultiLineToolTip0.getFontMetrics(font66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputContext12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(keyStroke_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(border60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(fontMetrics68);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel6 = jMultiLineToolTip0.getColorModel();
    jMultiLineToolTip0.enable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel6);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.beans.VetoableChangeListener[] vetoableChangeListener_array5 = jMultiLineToolTip0.getVetoableChangeListeners();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array6 = jMultiLineToolTip0.getMouseMotionListeners();
    boolean b7 = jMultiLineToolTip0.isShowing();
    java.awt.Graphics graphics8 = null;
    jMultiLineToolTip0.printAll(graphics8);
    jMultiLineToolTip0.enable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vetoableChangeListener_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }

    org.apache.log4j.Level level4 = crystal.Constants.LOG_LEVEL;
    crystal.util.LSMRLogger.startLog4J(true, true, level4, "", "ToolTipUI");
    crystal.util.LSMRLogger.startLog4J(true, true, level4, "hi!", "2017-06-04T14-21-48.265-0700");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(level4);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }

    javax.swing.JPanel jPanel0 = null;
    // The following exception was thrown during execution in test generation
    try {
    crystal.util.SpringLayoutUtility.formGridInColumn(jPanel0, (int)(byte)0, 4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    javax.swing.KeyStroke keyStroke11 = null;
    jMultiLineToolTip0.unregisterKeyboardAction(keyStroke11);
    float f13 = jMultiLineToolTip0.getAlignmentY();
    java.awt.Rectangle rectangle14 = jMultiLineToolTip0.getBounds();
    java.awt.Event event15 = null;
    boolean b17 = jMultiLineToolTip0.keyUp(event15, 7);
    java.awt.Point point18 = jMultiLineToolTip0.getMousePosition();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f13 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point18);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener[] propertyChangeListener_array9 = jMultiLineToolTip0.getPropertyChangeListeners();
    java.awt.event.InputMethodListener inputMethodListener10 = null;
    jMultiLineToolTip0.addInputMethodListener(inputMethodListener10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array9);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.beans.VetoableChangeListener[] vetoableChangeListener_array5 = jMultiLineToolTip0.getVetoableChangeListeners();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array6 = jMultiLineToolTip0.getMouseMotionListeners();
    java.awt.event.InputMethodListener inputMethodListener7 = null;
    jMultiLineToolTip0.addInputMethodListener(inputMethodListener7);
    java.awt.dnd.DropTarget dropTarget9 = jMultiLineToolTip0.getDropTarget();
    javax.swing.JToolTip jToolTip10 = jMultiLineToolTip0.createToolTip();
    jMultiLineToolTip0.firePropertyChange("TEST", (double)'a', (double)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vetoableChangeListener_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(dropTarget9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jToolTip10);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Insets insets3 = jMultiLineToolTip0.getInsets();
    boolean b4 = jMultiLineToolTip0.isValidateRoot();
    java.awt.Dimension dimension5 = jMultiLineToolTip0.minimumSize();
    java.awt.event.MouseEvent mouseEvent6 = null;
    java.awt.Point point7 = jMultiLineToolTip0.getToolTipLocation(mouseEvent6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point7);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }

    int i0 = javax.swing.JFrame.EXIT_ON_CLOSE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 3);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }

    javax.swing.ImageIcon imageIcon1 = null;
    java.awt.Image image2 = null;
    crystal.model.Relationship relationship3 = new crystal.model.Relationship("AHEAD", imageIcon1, image2);
    javax.swing.ImageIcon imageIcon6 = null;
    java.awt.Image image7 = null;
    crystal.model.Relationship relationship8 = new crystal.model.Relationship("AHEAD", imageIcon6, image7);
    relationship3.calculateAction("AHEAD", relationship8);
    crystal.model.RevisionHistory.Action action10 = relationship8.getAction();
    crystal.model.RevisionHistory.When when11 = relationship8.getWhen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(action10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(when11);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    jMultiLineToolTip0.hide();
    java.awt.peer.ComponentPeer componentPeer10 = jMultiLineToolTip0.getPeer();
    javax.swing.JToolTip jToolTip11 = jMultiLineToolTip0.createToolTip();
    crystal.util.JMultiLineToolTip jMultiLineToolTip12 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle13 = null;
    java.awt.Rectangle rectangle14 = jMultiLineToolTip12.getBounds(rectangle13);
    java.awt.Rectangle rectangle15 = jMultiLineToolTip12.getVisibleRect();
    boolean b16 = jMultiLineToolTip12.isEnabled();
    java.awt.Event event17 = null;
    boolean b20 = jMultiLineToolTip12.mouseEnter(event17, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener21 = null;
    jMultiLineToolTip12.addPropertyChangeListener(propertyChangeListener21);
    javax.swing.KeyStroke keyStroke23 = null;
    jMultiLineToolTip12.unregisterKeyboardAction(keyStroke23);
    jMultiLineToolTip12.enableInputMethods(false);
    jToolTip11.setNextFocusableComponent((java.awt.Component)jMultiLineToolTip12);
    crystal.util.JMultiLineToolTip jMultiLineToolTip28 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle29 = null;
    java.awt.Rectangle rectangle30 = jMultiLineToolTip28.getBounds(rectangle29);
    java.awt.Toolkit toolkit31 = jMultiLineToolTip28.getToolkit();
    jMultiLineToolTip28.setName("hi!");
    javax.swing.border.Border border34 = jMultiLineToolTip28.getBorder();
    jToolTip11.setBorder(border34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentPeer10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jToolTip11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(border34);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }

    crystal.model.DataSource.RepoKind repoKind6 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment9 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind6, false, "hi!");
    crystal.model.Environment environment12 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind6, true, "PENDING");
    crystal.model.DataSource dataSource15 = new crystal.model.DataSource("ToolTipUI", "415725 hours 21 min", repoKind6, true, "415725 hours 21 min");
    java.lang.String str16 = dataSource15.getRemoteCmd();
    org.junit.Assert.assertTrue("'" + repoKind6 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind6.equals(crystal.model.DataSource.RepoKind.HG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    jMultiLineToolTip0.firePropertyChange("hi!", ' ', '#');
    crystal.util.JMultiLineToolTip jMultiLineToolTip6 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle7 = null;
    java.awt.Rectangle rectangle8 = jMultiLineToolTip6.getBounds(rectangle7);
    java.awt.Event event9 = null;
    boolean b11 = jMultiLineToolTip6.action(event9, (java.lang.Object)'4');
    crystal.util.JMultiLineToolTip jMultiLineToolTip12 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle13 = null;
    java.awt.Rectangle rectangle14 = jMultiLineToolTip12.getBounds(rectangle13);
    java.awt.Event event15 = null;
    boolean b17 = jMultiLineToolTip12.action(event15, (java.lang.Object)'4');
    jMultiLineToolTip6.setComponent((javax.swing.JComponent)jMultiLineToolTip12);
    crystal.util.JMultiLineToolTip jMultiLineToolTip19 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle20 = null;
    java.awt.Rectangle rectangle21 = jMultiLineToolTip19.getBounds(rectangle20);
    java.awt.Toolkit toolkit22 = jMultiLineToolTip19.getToolkit();
    jMultiLineToolTip19.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager26 = null;
    jMultiLineToolTip19.setLayout(layoutManager26);
    boolean b28 = jMultiLineToolTip19.isFocusOwner();
    boolean b29 = jMultiLineToolTip19.isShowing();
    java.awt.Graphics graphics30 = null;
    jMultiLineToolTip19.update(graphics30);
    java.awt.Component component32 = jMultiLineToolTip6.add((java.awt.Component)jMultiLineToolTip19);
    java.awt.Font font33 = null;
    jMultiLineToolTip19.setFont(font33);
    crystal.util.JMultiLineToolTip jMultiLineToolTip35 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle36 = null;
    java.awt.Rectangle rectangle37 = jMultiLineToolTip35.getBounds(rectangle36);
    java.awt.Rectangle rectangle38 = jMultiLineToolTip35.getVisibleRect();
    boolean b39 = jMultiLineToolTip35.isEnabled();
    java.awt.Event event40 = null;
    boolean b43 = jMultiLineToolTip35.mouseEnter(event40, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener44 = null;
    jMultiLineToolTip35.addPropertyChangeListener(propertyChangeListener44);
    java.awt.Point point46 = jMultiLineToolTip35.getLocation();
    jMultiLineToolTip19.setLocation(point46);
    java.awt.Point point48 = jMultiLineToolTip0.getLocation(point46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point48);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color1 = null;
    jMultiLineToolTip0.setBackground(color1);
    jMultiLineToolTip0.transferFocusBackward();
    jMultiLineToolTip0.firePropertyChange("$HOME", false, false);
    java.awt.Graphics graphics8 = null;
    jMultiLineToolTip0.paintComponents(graphics8);
    boolean b10 = jMultiLineToolTip0.isPaintingForPrint();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    javax.swing.KeyStroke keyStroke11 = null;
    jMultiLineToolTip0.unregisterKeyboardAction(keyStroke11);
    float f13 = jMultiLineToolTip0.getAlignmentY();
    java.awt.Rectangle rectangle14 = jMultiLineToolTip0.getBounds();
    java.awt.Event event15 = null;
    boolean b17 = jMultiLineToolTip0.keyUp(event15, 7);
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = jMultiLineToolTip0.areFocusTraversalKeysSet(5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f13 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.Font font4 = null;
    jMultiLineToolTip0.setFont(font4);
    javax.swing.KeyStroke[] keyStroke_array6 = jMultiLineToolTip0.getRegisteredKeyStrokes();
    boolean b7 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event8 = null;
    crystal.util.JMultiLineToolTip jMultiLineToolTip9 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle10 = null;
    java.awt.Rectangle rectangle11 = jMultiLineToolTip9.getBounds(rectangle10);
    java.awt.Toolkit toolkit12 = jMultiLineToolTip9.getToolkit();
    jMultiLineToolTip9.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager16 = null;
    jMultiLineToolTip9.setLayout(layoutManager16);
    boolean b18 = jMultiLineToolTip9.isFocusOwner();
    boolean b19 = jMultiLineToolTip9.isShowing();
    jMultiLineToolTip9.transferFocusUpCycle();
    crystal.util.JMultiLineToolTip jMultiLineToolTip21 = new crystal.util.JMultiLineToolTip();
    boolean b22 = jMultiLineToolTip21.isFocusTraversalPolicyProvider();
    java.awt.Dimension dimension23 = jMultiLineToolTip21.preferredSize();
    java.awt.Dimension dimension24 = jMultiLineToolTip9.getSize(dimension23);
    boolean b25 = jMultiLineToolTip0.action(event8, (java.lang.Object)dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(keyStroke_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }

    javax.swing.ImageIcon imageIcon1 = null;
    java.awt.Image image2 = null;
    crystal.model.Relationship relationship3 = new crystal.model.Relationship("AHEAD", imageIcon1, image2);
    crystal.util.JMultiLineToolTip jMultiLineToolTip4 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle5 = null;
    java.awt.Rectangle rectangle6 = jMultiLineToolTip4.getBounds(rectangle5);
    java.awt.Rectangle rectangle7 = jMultiLineToolTip4.getVisibleRect();
    boolean b8 = jMultiLineToolTip4.isEnabled();
    java.awt.Event event9 = null;
    boolean b12 = jMultiLineToolTip4.mouseEnter(event9, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener13 = null;
    jMultiLineToolTip4.addPropertyChangeListener(propertyChangeListener13);
    java.awt.Point point15 = jMultiLineToolTip4.getLocation();
    boolean b16 = relationship3.equals((java.lang.Object)jMultiLineToolTip4);
    java.awt.event.MouseListener[] mouseListener_array17 = jMultiLineToolTip4.getMouseListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseListener_array17);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color1 = null;
    jMultiLineToolTip0.setBackground(color1);
    java.awt.Graphics graphics3 = null;
    jMultiLineToolTip0.printComponents(graphics3);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }

    crystal.model.RevisionHistory.Action action0 = crystal.model.RevisionHistory.Action.NOTHING;
    org.junit.Assert.assertTrue("'" + action0 + "' != '" + crystal.model.RevisionHistory.Action.NOTHING + "'", action0.equals(crystal.model.RevisionHistory.Action.NOTHING));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }

    java.util.Date date1 = crystal.util.TimeUtility.parseLSMRDate("415725 hours 22 min");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(date1);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences5 = null;
    clientPreferences4.addProjectPreferences(projectPreferences5);
    boolean b7 = clientPreferences4.hasChanged();
    // The following exception was thrown during execution in test generation
    try {
    crystal.client.PreferencesGUIEditorFrame preferencesGUIEditorFrame8 = crystal.client.PreferencesGUIEditorFrame.getPreferencesGUIEditorFrame(clientPreferences4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    crystal.util.JMultiLineToolTip jMultiLineToolTip11 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle12 = null;
    java.awt.Rectangle rectangle13 = jMultiLineToolTip11.getBounds(rectangle12);
    java.awt.Rectangle rectangle14 = jMultiLineToolTip11.getVisibleRect();
    java.awt.Rectangle rectangle15 = jMultiLineToolTip0.getBounds(rectangle14);
    java.awt.event.KeyListener keyListener16 = null;
    jMultiLineToolTip0.addKeyListener(keyListener16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle15);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager7 = null;
    jMultiLineToolTip0.setLayout(layoutManager7);
    java.awt.Event event9 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = jMultiLineToolTip0.postEvent(event9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }

    crystal.model.LocalStateResult.PENDING = "hi!";

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }

    crystal.model.Relationship.MERGECLEAN = "ERROR";

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }

    crystal.client.ClientPreferences.NonexistentProjectException nonexistentProjectException1 = new crystal.client.ClientPreferences.NonexistentProjectException("");
    crystal.client.ClientPreferences.ConfigurationReadingException configurationReadingException4 = new crystal.client.ClientPreferences.ConfigurationReadingException("PENDING", (int)(short)-1);
    nonexistentProjectException1.addSuppressed((java.lang.Throwable)configurationReadingException4);
    int i6 = configurationReadingException4.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    jMultiLineToolTip0.firePropertyChange("AHEAD", 0, 128);
    jMultiLineToolTip0.setBounds((int)(byte)1, (int)(byte)100, 0, (-1));
    jMultiLineToolTip0.setDoubleBuffered(false);
    javax.swing.border.Border border14 = jMultiLineToolTip0.getBorder();
    boolean b15 = jMultiLineToolTip0.isForegroundSet();
    boolean b16 = jMultiLineToolTip0.isVisible();
    java.awt.ImageCapabilities imageCapabilities19 = null;
    java.awt.image.VolatileImage volatileImage20 = jMultiLineToolTip0.createVolatileImage((int)(short)0, 10, imageCapabilities19);
    crystal.util.JMultiLineToolTip jMultiLineToolTip21 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle22 = null;
    java.awt.Rectangle rectangle23 = jMultiLineToolTip21.getBounds(rectangle22);
    java.awt.Toolkit toolkit24 = jMultiLineToolTip21.getToolkit();
    java.awt.Font font25 = null;
    jMultiLineToolTip21.setFont(font25);
    javax.swing.KeyStroke[] keyStroke_array27 = jMultiLineToolTip21.getRegisteredKeyStrokes();
    int i28 = jMultiLineToolTip21.getComponentCount();
    int i29 = jMultiLineToolTip0.getComponentZOrder((java.awt.Component)jMultiLineToolTip21);
    java.awt.image.VolatileImage volatileImage32 = jMultiLineToolTip21.createVolatileImage(13, 9);
    jMultiLineToolTip21.firePropertyChange("ToolTipUI_HG_415725 hours 21 min", (float)16, (float)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(border14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(volatileImage20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(keyStroke_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(volatileImage32);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }

    java.lang.String str0 = crystal.model.Relationship.COMPILECONFLICT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "hi!"+ "'", str0.equals("hi!"));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }

    long long0 = crystal.client.ClientPreferences.REFRESH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long0 == 32L);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager7 = null;
    jMultiLineToolTip0.setLayout(layoutManager7);
    boolean b9 = jMultiLineToolTip0.isFocusOwner();
    boolean b10 = jMultiLineToolTip0.isShowing();
    java.awt.Graphics graphics11 = null;
    jMultiLineToolTip0.update(graphics11);
    java.awt.event.ActionListener actionListener13 = null;
    javax.swing.KeyStroke keyStroke14 = null;
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.registerKeyboardAction(actionListener13, keyStroke14, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Dimension dimension5 = null;
    jMultiLineToolTip0.setPreferredSize(dimension5);
    crystal.util.JMultiLineToolTip jMultiLineToolTip7 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle8 = null;
    java.awt.Rectangle rectangle9 = jMultiLineToolTip7.getBounds(rectangle8);
    java.awt.Event event10 = null;
    boolean b12 = jMultiLineToolTip7.action(event10, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel13 = jMultiLineToolTip7.getColorModel();
    boolean b14 = jMultiLineToolTip0.isAncestorOf((java.awt.Component)jMultiLineToolTip7);
    crystal.util.JMultiLineToolTip jMultiLineToolTip15 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle16 = null;
    java.awt.Rectangle rectangle17 = jMultiLineToolTip15.getBounds(rectangle16);
    java.awt.Event event18 = null;
    boolean b20 = jMultiLineToolTip15.action(event18, (java.lang.Object)'4');
    java.awt.Component component23 = jMultiLineToolTip15.locate((int)'4', 1);
    jMultiLineToolTip15.setFocusTraversalPolicyProvider(true);
    crystal.util.JMultiLineToolTip jMultiLineToolTip26 = new crystal.util.JMultiLineToolTip();
    boolean b27 = jMultiLineToolTip26.isFocusTraversalPolicyProvider();
    jMultiLineToolTip26.firePropertyChange("hi!", ' ', '#');
    java.awt.Dimension dimension32 = jMultiLineToolTip26.getMaximumSize();
    jMultiLineToolTip15.setSize(dimension32);
    jMultiLineToolTip7.setMaximumSize(dimension32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension32);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Dimension dimension5 = null;
    jMultiLineToolTip0.setPreferredSize(dimension5);
    jMultiLineToolTip0.show();
    crystal.util.JMultiLineToolTip jMultiLineToolTip8 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle9 = null;
    java.awt.Rectangle rectangle10 = jMultiLineToolTip8.getBounds(rectangle9);
    java.awt.Rectangle rectangle11 = jMultiLineToolTip8.getVisibleRect();
    boolean b12 = jMultiLineToolTip8.isEnabled();
    java.awt.Event event13 = null;
    boolean b16 = jMultiLineToolTip8.mouseEnter(event13, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener17 = null;
    jMultiLineToolTip8.addPropertyChangeListener(propertyChangeListener17);
    jMultiLineToolTip8.setFocusTraversalPolicyProvider(false);
    jMultiLineToolTip8.repaint((long)'a');
    crystal.util.JMultiLineToolTip jMultiLineToolTip23 = new crystal.util.JMultiLineToolTip();
    boolean b24 = jMultiLineToolTip23.isFocusTraversalPolicyProvider();
    jMultiLineToolTip23.firePropertyChange("hi!", ' ', '#');
    java.awt.Dimension dimension29 = jMultiLineToolTip23.getMaximumSize();
    jMultiLineToolTip8.resize(dimension29);
    jMultiLineToolTip0.setMaximumSize(dimension29);
    java.lang.String str32 = jMultiLineToolTip0.getToolTipText();
    int i33 = jMultiLineToolTip0.getFixedWidth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setName("hi!");
    java.awt.AWTKeyStroke[] aWTKeyStroke_array7 = new java.awt.AWTKeyStroke[] {  };
    java.util.LinkedHashSet<java.awt.AWTKeyStroke> linkedhashset_aWTKeyStroke8 = new java.util.LinkedHashSet<java.awt.AWTKeyStroke>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.awt.AWTKeyStroke>)linkedhashset_aWTKeyStroke8, aWTKeyStroke_array7);
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.setFocusTraversalKeys(9, (java.util.Set<java.awt.AWTKeyStroke>)linkedhashset_aWTKeyStroke8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aWTKeyStroke_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.beans.VetoableChangeListener[] vetoableChangeListener_array5 = jMultiLineToolTip0.getVetoableChangeListeners();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array6 = jMultiLineToolTip0.getMouseMotionListeners();
    boolean b7 = jMultiLineToolTip0.isShowing();
    java.awt.PopupMenu popupMenu8 = null;
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.add(popupMenu8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vetoableChangeListener_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }

    crystal.model.DataSource.RepoKind repoKind2 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment5 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind2, false, "hi!");
    crystal.util.JMultiLineToolTip jMultiLineToolTip6 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle7 = null;
    java.awt.Rectangle rectangle8 = jMultiLineToolTip6.getBounds(rectangle7);
    java.awt.Event event9 = null;
    boolean b11 = jMultiLineToolTip6.action(event9, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel12 = jMultiLineToolTip6.getColorModel();
    jMultiLineToolTip6.removeNotify();
    crystal.util.JMultiLineToolTip jMultiLineToolTip14 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle15 = null;
    java.awt.Rectangle rectangle16 = jMultiLineToolTip14.getBounds(rectangle15);
    java.awt.Toolkit toolkit17 = jMultiLineToolTip14.getToolkit();
    java.awt.Font font18 = null;
    jMultiLineToolTip14.setFont(font18);
    java.awt.Color color20 = jMultiLineToolTip14.getBackground();
    jMultiLineToolTip6.setForeground(color20);
    crystal.util.JMultiLineToolTip jMultiLineToolTip22 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle23 = null;
    java.awt.Rectangle rectangle24 = jMultiLineToolTip22.getBounds(rectangle23);
    jMultiLineToolTip22.firePropertyChange("AHEAD", 0, 128);
    jMultiLineToolTip22.setBounds((int)(byte)1, (int)(byte)100, 0, (-1));
    jMultiLineToolTip22.setDoubleBuffered(false);
    javax.swing.border.Border border36 = jMultiLineToolTip22.getBorder();
    java.lang.Object obj37 = jMultiLineToolTip6.getClientProperty((java.lang.Object)border36);
    java.awt.event.HierarchyListener hierarchyListener38 = null;
    jMultiLineToolTip6.removeHierarchyListener(hierarchyListener38);
    java.awt.event.InputMethodListener inputMethodListener40 = null;
    jMultiLineToolTip6.removeInputMethodListener(inputMethodListener40);
    boolean b42 = environment5.equals((java.lang.Object)inputMethodListener40);
    crystal.util.JMultiLineToolTip jMultiLineToolTip43 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle44 = null;
    java.awt.Rectangle rectangle45 = jMultiLineToolTip43.getBounds(rectangle44);
    java.awt.Rectangle rectangle46 = jMultiLineToolTip43.getVisibleRect();
    boolean b47 = jMultiLineToolTip43.isEnabled();
    java.awt.Dimension dimension48 = null;
    jMultiLineToolTip43.setPreferredSize(dimension48);
    jMultiLineToolTip43.move(10, (int)(short)10);
    java.awt.Point point54 = jMultiLineToolTip43.getMousePosition(true);
    java.awt.im.InputContext inputContext55 = jMultiLineToolTip43.getInputContext();
    crystal.util.JMultiLineToolTip jMultiLineToolTip56 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle57 = null;
    java.awt.Rectangle rectangle58 = jMultiLineToolTip56.getBounds(rectangle57);
    java.awt.Event event59 = null;
    boolean b61 = jMultiLineToolTip56.action(event59, (java.lang.Object)'4');
    java.awt.Component component64 = jMultiLineToolTip56.locate((int)'4', 1);
    jMultiLineToolTip56.setFocusTraversalPolicyProvider(true);
    int i67 = jMultiLineToolTip43.getComponentZOrder((java.awt.Component)jMultiLineToolTip56);
    javax.swing.InputMap inputMap68 = jMultiLineToolTip43.getInputMap();
    java.awt.Dimension dimension69 = jMultiLineToolTip43.getPreferredSize();
    boolean b70 = environment5.equals((java.lang.Object)dimension69);
    environment5.setRemoteCmd("2017-06-04T14-21-48.265-0700");
    org.junit.Assert.assertTrue("'" + repoKind2 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind2.equals(crystal.model.DataSource.RepoKind.HG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(border36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputContext55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.beans.VetoableChangeListener[] vetoableChangeListener_array5 = jMultiLineToolTip0.getVetoableChangeListeners();
    jMultiLineToolTip0.transferFocusUpCycle();
    java.awt.LayoutManager layoutManager7 = jMultiLineToolTip0.getLayout();
    javax.swing.TransferHandler transferHandler8 = jMultiLineToolTip0.getTransferHandler();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vetoableChangeListener_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(layoutManager7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferHandler8);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    jMultiLineToolTip0.setFocusTraversalPolicyProvider(false);
    jMultiLineToolTip0.repaint((long)'a');
    crystal.util.JMultiLineToolTip jMultiLineToolTip15 = new crystal.util.JMultiLineToolTip();
    boolean b16 = jMultiLineToolTip15.isFocusTraversalPolicyProvider();
    jMultiLineToolTip15.firePropertyChange("hi!", ' ', '#');
    java.awt.Dimension dimension21 = jMultiLineToolTip15.getMaximumSize();
    jMultiLineToolTip0.resize(dimension21);
    crystal.util.JMultiLineToolTip jMultiLineToolTip23 = new crystal.util.JMultiLineToolTip();
    boolean b24 = jMultiLineToolTip23.isFocusTraversalPolicyProvider();
    jMultiLineToolTip23.firePropertyChange("hi!", ' ', '#');
    java.awt.Dimension dimension29 = jMultiLineToolTip23.getMaximumSize();
    int i30 = jMultiLineToolTip0.getComponentZOrder((java.awt.Component)jMultiLineToolTip23);
    jMultiLineToolTip23.setFixedWidth(11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == (-1));

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.Font font4 = null;
    jMultiLineToolTip0.setFont(font4);
    boolean b6 = jMultiLineToolTip0.getAutoscrolls();
    java.awt.event.MouseWheelListener mouseWheelListener7 = null;
    jMultiLineToolTip0.removeMouseWheelListener(mouseWheelListener7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.Font font4 = null;
    jMultiLineToolTip0.setFont(font4);
    crystal.util.JMultiLineToolTip jMultiLineToolTip6 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle7 = null;
    java.awt.Rectangle rectangle8 = jMultiLineToolTip6.getBounds(rectangle7);
    java.awt.Rectangle rectangle9 = jMultiLineToolTip6.getVisibleRect();
    boolean b10 = jMultiLineToolTip6.isEnabled();
    java.awt.Dimension dimension11 = null;
    jMultiLineToolTip6.setPreferredSize(dimension11);
    crystal.util.JMultiLineToolTip jMultiLineToolTip13 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle14 = null;
    java.awt.Rectangle rectangle15 = jMultiLineToolTip13.getBounds(rectangle14);
    java.awt.Event event16 = null;
    boolean b18 = jMultiLineToolTip13.action(event16, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel19 = jMultiLineToolTip13.getColorModel();
    boolean b20 = jMultiLineToolTip6.isAncestorOf((java.awt.Component)jMultiLineToolTip13);
    crystal.util.JMultiLineToolTip jMultiLineToolTip21 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle22 = null;
    java.awt.Rectangle rectangle23 = jMultiLineToolTip21.getBounds(rectangle22);
    java.awt.Event event24 = null;
    boolean b26 = jMultiLineToolTip21.action(event24, (java.lang.Object)'4');
    java.awt.event.InputMethodListener inputMethodListener27 = null;
    jMultiLineToolTip21.removeInputMethodListener(inputMethodListener27);
    jMultiLineToolTip21.invalidate();
    java.awt.Event event30 = null;
    crystal.util.JMultiLineToolTip jMultiLineToolTip31 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle32 = null;
    java.awt.Rectangle rectangle33 = jMultiLineToolTip31.getBounds(rectangle32);
    java.awt.Toolkit toolkit34 = jMultiLineToolTip31.getToolkit();
    jMultiLineToolTip31.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager38 = null;
    jMultiLineToolTip31.setLayout(layoutManager38);
    boolean b40 = jMultiLineToolTip31.isFocusOwner();
    boolean b41 = jMultiLineToolTip31.isShowing();
    java.awt.Graphics graphics42 = null;
    jMultiLineToolTip31.update(graphics42);
    boolean b44 = jMultiLineToolTip21.action(event30, (java.lang.Object)graphics42);
    java.awt.Rectangle rectangle45 = jMultiLineToolTip21.getVisibleRect();
    jMultiLineToolTip6.putClientProperty((java.lang.Object)rectangle45, (java.lang.Object)true);
    jMultiLineToolTip0.repaint(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    javax.swing.KeyStroke keyStroke11 = null;
    jMultiLineToolTip0.unregisterKeyboardAction(keyStroke11);
    crystal.util.JMultiLineToolTip jMultiLineToolTip13 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle14 = null;
    java.awt.Rectangle rectangle15 = jMultiLineToolTip13.getBounds(rectangle14);
    java.awt.Rectangle rectangle16 = jMultiLineToolTip13.getVisibleRect();
    jMultiLineToolTip0.paintImmediately(rectangle16);
    javax.swing.JPopupMenu jPopupMenu18 = null;
    jMultiLineToolTip0.setComponentPopupMenu(jPopupMenu18);
    javax.swing.border.Border border20 = jMultiLineToolTip0.getBorder();
    crystal.util.JMultiLineToolTip jMultiLineToolTip21 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle22 = null;
    java.awt.Rectangle rectangle23 = jMultiLineToolTip21.getBounds(rectangle22);
    java.awt.Toolkit toolkit24 = jMultiLineToolTip21.getToolkit();
    jMultiLineToolTip21.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager28 = null;
    jMultiLineToolTip21.setLayout(layoutManager28);
    boolean b30 = jMultiLineToolTip21.isFocusOwner();
    boolean b31 = jMultiLineToolTip21.isShowing();
    jMultiLineToolTip21.transferFocusUpCycle();
    crystal.util.JMultiLineToolTip jMultiLineToolTip33 = new crystal.util.JMultiLineToolTip();
    boolean b34 = jMultiLineToolTip33.isFocusTraversalPolicyProvider();
    java.awt.Dimension dimension35 = jMultiLineToolTip33.preferredSize();
    java.awt.Dimension dimension36 = jMultiLineToolTip21.getSize(dimension35);
    jMultiLineToolTip0.setMaximumSize(dimension36);
    crystal.util.JMultiLineToolTip jMultiLineToolTip38 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle39 = null;
    java.awt.Rectangle rectangle40 = jMultiLineToolTip38.getBounds(rectangle39);
    java.awt.Rectangle rectangle41 = jMultiLineToolTip38.getVisibleRect();
    crystal.util.JMultiLineToolTip jMultiLineToolTip42 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle43 = null;
    java.awt.Rectangle rectangle44 = jMultiLineToolTip42.getBounds(rectangle43);
    java.awt.Rectangle rectangle45 = jMultiLineToolTip42.getVisibleRect();
    boolean b46 = jMultiLineToolTip42.isEnabled();
    java.awt.Event event47 = null;
    boolean b50 = jMultiLineToolTip42.mouseEnter(event47, (-1), (int)(byte)-1);
    jMultiLineToolTip42.hide();
    java.awt.peer.ComponentPeer componentPeer52 = jMultiLineToolTip42.getPeer();
    javax.swing.JToolTip jToolTip53 = jMultiLineToolTip42.createToolTip();
    jMultiLineToolTip0.add((java.awt.Component)jMultiLineToolTip38, (java.lang.Object)jMultiLineToolTip42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(border20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentPeer52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jToolTip53);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip0.firePropertyChange("", (double)0L, 0.0d);
    boolean b5 = jMultiLineToolTip0.getIgnoreRepaint();
    jMultiLineToolTip0.invalidate();
    boolean b7 = jMultiLineToolTip0.requestFocusInWindow();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Insets insets3 = jMultiLineToolTip0.getInsets();
    java.awt.Event event4 = null;
    boolean b7 = jMultiLineToolTip0.mouseDown(event4, 11, (int)' ');
    int i8 = jMultiLineToolTip0.getColumns();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }

    java.awt.Window[] window_array0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(window_array0);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.Font font4 = null;
    jMultiLineToolTip0.setFont(font4);
    int i6 = jMultiLineToolTip0.getY();
    java.lang.String str7 = jMultiLineToolTip0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    javax.swing.KeyStroke keyStroke11 = null;
    jMultiLineToolTip0.unregisterKeyboardAction(keyStroke11);
    float f13 = jMultiLineToolTip0.getAlignmentX();
    java.awt.event.FocusListener[] focusListener_array14 = jMultiLineToolTip0.getFocusListeners();
    jMultiLineToolTip0.hide();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f13 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array14);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    jMultiLineToolTip0.setSize((int)' ', (-1));
    java.awt.GraphicsConfiguration graphicsConfiguration5 = jMultiLineToolTip0.getGraphicsConfiguration();
    jMultiLineToolTip0.setVerifyInputWhenFocusTarget(true);
    java.awt.Point point8 = jMultiLineToolTip0.getMousePosition();
    java.lang.String str9 = jMultiLineToolTip0.getTipText();
    java.awt.Insets insets10 = jMultiLineToolTip0.insets();
    java.awt.Toolkit toolkit11 = jMultiLineToolTip0.getToolkit();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphicsConfiguration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit11);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.Font font4 = null;
    jMultiLineToolTip0.setFont(font4);
    javax.swing.KeyStroke[] keyStroke_array6 = jMultiLineToolTip0.getRegisteredKeyStrokes();
    boolean b7 = jMultiLineToolTip0.isFocusTraversalPolicySet();
    java.lang.String str8 = jMultiLineToolTip0.toString();
    javax.swing.KeyStroke keyStroke9 = null;
    java.awt.event.ActionListener actionListener10 = jMultiLineToolTip0.getActionForKeyStroke(keyStroke9);
    java.awt.event.MouseListener mouseListener11 = null;
    jMultiLineToolTip0.removeMouseListener(mouseListener11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(keyStroke_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(actionListener10);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Insets insets3 = jMultiLineToolTip0.getInsets();
    boolean b4 = jMultiLineToolTip0.isValidateRoot();
    java.awt.Point point5 = jMultiLineToolTip0.getLocation();
    crystal.util.JMultiLineToolTip jMultiLineToolTip6 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle7 = null;
    java.awt.Rectangle rectangle8 = jMultiLineToolTip6.getBounds(rectangle7);
    java.awt.Rectangle rectangle9 = jMultiLineToolTip6.getVisibleRect();
    boolean b10 = jMultiLineToolTip6.isEnabled();
    java.awt.Event event11 = null;
    boolean b14 = jMultiLineToolTip6.mouseEnter(event11, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener15 = null;
    jMultiLineToolTip6.addPropertyChangeListener(propertyChangeListener15);
    java.awt.Point point17 = jMultiLineToolTip6.getLocation();
    jMultiLineToolTip6.setDoubleBuffered(true);
    java.awt.Component[] component_array20 = jMultiLineToolTip6.getComponents();
    jMultiLineToolTip6.firePropertyChange("PENDING", (int)'#', (int)(short)0);
    jMultiLineToolTip6.updateUI();
    crystal.util.JMultiLineToolTip jMultiLineToolTip26 = new crystal.util.JMultiLineToolTip();
    boolean b27 = jMultiLineToolTip26.isFocusTraversalPolicyProvider();
    java.awt.Dimension dimension28 = jMultiLineToolTip26.preferredSize();
    boolean b29 = jMultiLineToolTip26.isMaximumSizeSet();
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.add((java.awt.Component)jMultiLineToolTip6, (java.lang.Object)jMultiLineToolTip26, 16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color1 = null;
    jMultiLineToolTip0.setBackground(color1);
    jMultiLineToolTip0.transferFocusBackward();
    jMultiLineToolTip0.firePropertyChange("$HOME", false, false);
    javax.swing.JPopupMenu jPopupMenu8 = jMultiLineToolTip0.getComponentPopupMenu();
    java.awt.event.MouseWheelListener mouseWheelListener9 = null;
    jMultiLineToolTip0.removeMouseWheelListener(mouseWheelListener9);
    crystal.util.JMultiLineToolTip jMultiLineToolTip11 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle12 = null;
    java.awt.Rectangle rectangle13 = jMultiLineToolTip11.getBounds(rectangle12);
    java.awt.Insets insets14 = jMultiLineToolTip11.getInsets();
    boolean b15 = jMultiLineToolTip11.isValidateRoot();
    java.awt.Dimension dimension16 = jMultiLineToolTip11.minimumSize();
    jMultiLineToolTip0.setMinimumSize(dimension16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jPopupMenu8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension16);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ClientPreferences clientPreferences5 = clientPreferences4.clone();
    java.lang.String str6 = clientPreferences4.getTempDirectory();
    crystal.client.ProjectPreferences projectPreferences7 = null;
    clientPreferences4.removeProjectPreferences(projectPreferences7);
    crystal.util.JMultiLineToolTip jMultiLineToolTip9 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle10 = null;
    java.awt.Rectangle rectangle11 = jMultiLineToolTip9.getBounds(rectangle10);
    java.awt.Toolkit toolkit12 = jMultiLineToolTip9.getToolkit();
    java.awt.Font font13 = null;
    jMultiLineToolTip9.setFont(font13);
    java.awt.Color color15 = jMultiLineToolTip9.getBackground();
    crystal.util.JMultiLineToolTip jMultiLineToolTip16 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle17 = null;
    java.awt.Rectangle rectangle18 = jMultiLineToolTip16.getBounds(rectangle17);
    crystal.util.JMultiLineToolTip jMultiLineToolTip19 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle20 = null;
    java.awt.Rectangle rectangle21 = jMultiLineToolTip19.getBounds(rectangle20);
    jMultiLineToolTip16.repaint(rectangle21);
    java.awt.Rectangle rectangle23 = jMultiLineToolTip9.getBounds(rectangle21);
    boolean b24 = clientPreferences4.equals((java.lang.Object)rectangle23);
    crystal.client.ProjectPreferences projectPreferences25 = null;
    clientPreferences4.removeProjectPreferences(projectPreferences25);
    java.lang.String str27 = clientPreferences4.getHgPath();
    clientPreferences4.setRefresh((long)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clientPreferences5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "TESTCONFLICT"+ "'", str27.equals("TESTCONFLICT"));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    jMultiLineToolTip0.firePropertyChange("AHEAD", 0, 128);
    jMultiLineToolTip0.setBounds((int)(byte)1, (int)(byte)100, 0, (-1));
    java.lang.String str12 = jMultiLineToolTip0.toString();
    jMultiLineToolTip0.enable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip0.firePropertyChange("", (double)0L, 0.0d);
    boolean b5 = jMultiLineToolTip0.getIgnoreRepaint();
    jMultiLineToolTip0.enable();
    boolean b7 = jMultiLineToolTip0.isForegroundSet();
    java.awt.event.MouseMotionListener mouseMotionListener8 = null;
    jMultiLineToolTip0.removeMouseMotionListener(mouseMotionListener8);
    float f10 = jMultiLineToolTip0.getAlignmentX();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f10 == 0.5f);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }

    java.lang.String str0 = javax.swing.JComponent.TOOL_TIP_TEXT_KEY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ToolTipText"+ "'", str0.equals("ToolTipText"));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    jMultiLineToolTip0.firePropertyChange("AHEAD", 0, 128);
    javax.swing.InputVerifier inputVerifier7 = jMultiLineToolTip0.getInputVerifier();
    crystal.util.JMultiLineToolTip jMultiLineToolTip8 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle9 = null;
    java.awt.Rectangle rectangle10 = jMultiLineToolTip8.getBounds(rectangle9);
    java.awt.Event event11 = null;
    boolean b14 = jMultiLineToolTip8.mouseDrag(event11, 32, 1);
    java.awt.Graphics graphics15 = null;
    jMultiLineToolTip8.printComponents(graphics15);
    java.awt.Point point17 = jMultiLineToolTip8.location();
    jMultiLineToolTip0.setLocation(point17);
    jMultiLineToolTip0.firePropertyChange("ERROR", (float)(-1), (float)1);
    java.awt.Event event23 = null;
    boolean b25 = jMultiLineToolTip0.keyUp(event23, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    jMultiLineToolTip0.setFocusTraversalPolicyProvider(false);
    jMultiLineToolTip0.repaint((long)'a');
    crystal.util.JMultiLineToolTip jMultiLineToolTip15 = new crystal.util.JMultiLineToolTip();
    boolean b16 = jMultiLineToolTip15.isFocusTraversalPolicyProvider();
    jMultiLineToolTip15.firePropertyChange("hi!", ' ', '#');
    java.awt.Dimension dimension21 = jMultiLineToolTip15.getMaximumSize();
    jMultiLineToolTip0.resize(dimension21);
    crystal.util.JMultiLineToolTip jMultiLineToolTip23 = new crystal.util.JMultiLineToolTip();
    boolean b24 = jMultiLineToolTip23.isFocusTraversalPolicyProvider();
    jMultiLineToolTip23.firePropertyChange("hi!", ' ', '#');
    java.awt.Dimension dimension29 = jMultiLineToolTip23.getMaximumSize();
    int i30 = jMultiLineToolTip0.getComponentZOrder((java.awt.Component)jMultiLineToolTip23);
    java.awt.Graphics graphics31 = null;
    jMultiLineToolTip0.printAll(graphics31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == (-1));

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }

    javax.swing.ImageIcon imageIcon1 = null;
    java.awt.Image image2 = null;
    crystal.model.Relationship relationship3 = new crystal.model.Relationship("AHEAD", imageIcon1, image2);
    crystal.util.JMultiLineToolTip jMultiLineToolTip4 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle5 = null;
    java.awt.Rectangle rectangle6 = jMultiLineToolTip4.getBounds(rectangle5);
    java.awt.Rectangle rectangle7 = jMultiLineToolTip4.getVisibleRect();
    boolean b8 = jMultiLineToolTip4.isEnabled();
    java.awt.Event event9 = null;
    boolean b12 = jMultiLineToolTip4.mouseEnter(event9, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener13 = null;
    jMultiLineToolTip4.addPropertyChangeListener(propertyChangeListener13);
    java.awt.Point point15 = jMultiLineToolTip4.getLocation();
    boolean b16 = relationship3.equals((java.lang.Object)jMultiLineToolTip4);
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Point point17 = jMultiLineToolTip4.getLocationOnScreen();
      org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }

    org.jdom.Document document1 = crystal.util.XMLTools.readXMLDocument("32 ms");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(document1);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }

    crystal.model.DataSource.RepoKind repoKind2 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment5 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind2, false, "hi!");
    environment5.setParent("Action: hg merge");
    environment5.setCompileCommand("AHEAD");
    environment5.setRemoteCmd("");
    environment5.setCompileCommand("0 ms");
    org.junit.Assert.assertTrue("'" + repoKind2 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind2.equals(crystal.model.DataSource.RepoKind.HG));

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }

    crystal.model.LocalStateResult.GIT_UNCHECKPOINTED = "%5p - %m%n";

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    java.awt.Point point11 = jMultiLineToolTip0.getLocation();
    java.awt.Event event12 = null;
    boolean b15 = jMultiLineToolTip0.mouseDown(event12, 7, (int)(byte)10);
    java.awt.Graphics graphics16 = null;
    jMultiLineToolTip0.paintComponents(graphics16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    jMultiLineToolTip0.setSize((int)' ', (-1));
    jMultiLineToolTip0.firePropertyChange("", (byte)100, (byte)-1);
    javax.swing.JRootPane jRootPane9 = jMultiLineToolTip0.getRootPane();
    // The following exception was thrown during execution in test generation
    try {
    jRootPane9.validate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jRootPane9);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    crystal.util.JMultiLineToolTip jMultiLineToolTip6 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle7 = null;
    java.awt.Rectangle rectangle8 = jMultiLineToolTip6.getBounds(rectangle7);
    java.awt.Event event9 = null;
    boolean b11 = jMultiLineToolTip6.action(event9, (java.lang.Object)'4');
    jMultiLineToolTip0.setComponent((javax.swing.JComponent)jMultiLineToolTip6);
    crystal.util.JMultiLineToolTip jMultiLineToolTip13 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle14 = null;
    java.awt.Rectangle rectangle15 = jMultiLineToolTip13.getBounds(rectangle14);
    java.awt.Toolkit toolkit16 = jMultiLineToolTip13.getToolkit();
    jMultiLineToolTip13.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager20 = null;
    jMultiLineToolTip13.setLayout(layoutManager20);
    boolean b22 = jMultiLineToolTip13.isFocusOwner();
    boolean b23 = jMultiLineToolTip13.isShowing();
    java.awt.Graphics graphics24 = null;
    jMultiLineToolTip13.update(graphics24);
    java.awt.Component component26 = jMultiLineToolTip0.add((java.awt.Component)jMultiLineToolTip13);
    javax.swing.KeyStroke keyStroke27 = null;
    java.awt.event.ActionListener actionListener28 = jMultiLineToolTip13.getActionForKeyStroke(keyStroke27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(actionListener28);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color1 = null;
    jMultiLineToolTip0.setBackground(color1);
    javax.swing.KeyStroke keyStroke3 = null;
    java.awt.event.ActionListener actionListener4 = jMultiLineToolTip0.getActionForKeyStroke(keyStroke3);
    boolean b5 = jMultiLineToolTip0.hasFocus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(actionListener4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    java.awt.Graphics graphics4 = null;
    jMultiLineToolTip0.paint(graphics4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel6 = jMultiLineToolTip0.getColorModel();
    jMultiLineToolTip0.removeNotify();
    crystal.util.JMultiLineToolTip jMultiLineToolTip8 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle9 = null;
    java.awt.Rectangle rectangle10 = jMultiLineToolTip8.getBounds(rectangle9);
    java.awt.Toolkit toolkit11 = jMultiLineToolTip8.getToolkit();
    java.awt.Font font12 = null;
    jMultiLineToolTip8.setFont(font12);
    java.awt.Color color14 = jMultiLineToolTip8.getBackground();
    jMultiLineToolTip0.setForeground(color14);
    crystal.util.JMultiLineToolTip jMultiLineToolTip16 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle17 = null;
    java.awt.Rectangle rectangle18 = jMultiLineToolTip16.getBounds(rectangle17);
    jMultiLineToolTip16.firePropertyChange("AHEAD", 0, 128);
    jMultiLineToolTip16.setBounds((int)(byte)1, (int)(byte)100, 0, (-1));
    jMultiLineToolTip16.setDoubleBuffered(false);
    javax.swing.border.Border border30 = jMultiLineToolTip16.getBorder();
    java.lang.Object obj31 = jMultiLineToolTip0.getClientProperty((java.lang.Object)border30);
    java.awt.event.HierarchyListener hierarchyListener32 = null;
    jMultiLineToolTip0.removeHierarchyListener(hierarchyListener32);
    java.awt.Container container34 = jMultiLineToolTip0.getFocusCycleRootAncestor();
    boolean b35 = jMultiLineToolTip0.isShowing();
    java.awt.Insets insets36 = jMultiLineToolTip0.getInsets();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(border30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets36);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    jMultiLineToolTip0.setFocusTraversalPolicyProvider(false);
    jMultiLineToolTip0.repaint((long)'a');
    crystal.util.JMultiLineToolTip jMultiLineToolTip15 = new crystal.util.JMultiLineToolTip();
    boolean b16 = jMultiLineToolTip15.isFocusTraversalPolicyProvider();
    jMultiLineToolTip15.firePropertyChange("hi!", ' ', '#');
    java.awt.Dimension dimension21 = jMultiLineToolTip15.getMaximumSize();
    jMultiLineToolTip0.resize(dimension21);
    java.awt.image.ImageProducer imageProducer23 = null;
    java.awt.Image image24 = jMultiLineToolTip0.createImage(imageProducer23);
    java.awt.Dimension dimension25 = jMultiLineToolTip0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    javax.swing.KeyStroke keyStroke11 = null;
    jMultiLineToolTip0.unregisterKeyboardAction(keyStroke11);
    crystal.util.JMultiLineToolTip jMultiLineToolTip13 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle14 = null;
    java.awt.Rectangle rectangle15 = jMultiLineToolTip13.getBounds(rectangle14);
    java.awt.Rectangle rectangle16 = jMultiLineToolTip13.getVisibleRect();
    jMultiLineToolTip0.paintImmediately(rectangle16);
    jMultiLineToolTip0.removeAll();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }

    crystal.client.ProjectPreferences projectPreferences0 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener1 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener2 = null;
    crystal.client.CalculateProjectTask calculateProjectTask3 = new crystal.client.CalculateProjectTask(projectPreferences0, computationListener1, computationListener2);
    java.beans.PropertyChangeListener propertyChangeListener4 = null;
    calculateProjectTask3.removePropertyChangeListener(propertyChangeListener4);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.Font font4 = null;
    jMultiLineToolTip0.setFont(font4);
    java.awt.Color color6 = jMultiLineToolTip0.getBackground();
    jMultiLineToolTip0.show();
    int i8 = jMultiLineToolTip0.getColumns();
    java.awt.image.ImageProducer imageProducer9 = null;
    java.awt.Image image10 = jMultiLineToolTip0.createImage(imageProducer9);
    boolean b11 = jMultiLineToolTip0.isVisible();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color1 = null;
    jMultiLineToolTip0.setBackground(color1);
    jMultiLineToolTip0.transferFocusBackward();
    jMultiLineToolTip0.firePropertyChange("$HOME", false, false);
    crystal.util.JMultiLineToolTip jMultiLineToolTip8 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle9 = null;
    java.awt.Rectangle rectangle10 = jMultiLineToolTip8.getBounds(rectangle9);
    jMultiLineToolTip8.firePropertyChange("AHEAD", 0, 128);
    javax.swing.InputVerifier inputVerifier15 = jMultiLineToolTip8.getInputVerifier();
    crystal.util.JMultiLineToolTip jMultiLineToolTip16 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle17 = null;
    java.awt.Rectangle rectangle18 = jMultiLineToolTip16.getBounds(rectangle17);
    java.awt.Event event19 = null;
    boolean b22 = jMultiLineToolTip16.mouseDrag(event19, 32, 1);
    java.awt.Graphics graphics23 = null;
    jMultiLineToolTip16.printComponents(graphics23);
    java.awt.Point point25 = jMultiLineToolTip16.location();
    jMultiLineToolTip8.setLocation(point25);
    java.awt.Component component27 = jMultiLineToolTip0.getComponentAt(point25);
    jMultiLineToolTip0.firePropertyChange("cannot compute hg action", (int)(byte)-1, 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component27);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    jMultiLineToolTip0.setSize((int)' ', (-1));
    jMultiLineToolTip0.firePropertyChange("", (byte)100, (byte)-1);
    javax.swing.ActionMap actionMap9 = jMultiLineToolTip0.getActionMap();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(actionMap9);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.event.InputMethodListener inputMethodListener6 = null;
    jMultiLineToolTip0.removeInputMethodListener(inputMethodListener6);
    jMultiLineToolTip0.invalidate();
    boolean b11 = jMultiLineToolTip0.contains((int)(short)10, 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }

    javax.swing.ImageIcon imageIcon1 = null;
    java.awt.Image image2 = null;
    crystal.model.Relationship relationship3 = new crystal.model.Relationship("AHEAD", imageIcon1, image2);
    javax.swing.ImageIcon imageIcon6 = null;
    java.awt.Image image7 = null;
    crystal.model.Relationship relationship8 = new crystal.model.Relationship("AHEAD", imageIcon6, image7);
    relationship3.calculateAction("AHEAD", relationship8);
    crystal.model.RevisionHistory.When when10 = crystal.model.RevisionHistory.When.LATER;
    relationship3.setWhen(when10);
    crystal.model.RevisionHistory.Ease ease12 = crystal.model.RevisionHistory.Ease.YOU;
    relationship3.setEase(ease12);
    java.lang.String str14 = relationship3.getCommitters();
    org.junit.Assert.assertTrue("'" + when10 + "' != '" + crystal.model.RevisionHistory.When.LATER + "'", when10.equals(crystal.model.RevisionHistory.When.LATER));
    org.junit.Assert.assertTrue("'" + ease12 + "' != '" + crystal.model.RevisionHistory.Ease.YOU + "'", ease12.equals(crystal.model.RevisionHistory.Ease.YOU));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip0.firePropertyChange("", (double)0L, 0.0d);
    java.awt.Graphics graphics5 = null;
    jMultiLineToolTip0.printAll(graphics5);
    jMultiLineToolTip0.revalidate();
    float f8 = jMultiLineToolTip0.getAlignmentY();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.5f);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }

    java.util.Map<crystal.server.AbstractLogParser.CheckpointLabels,java.lang.String> map_checkpointLabels_str0 = crystal.server.GitLogParser.gitCheckpoint;
    crystal.server.GitLogParser.gitCheckpoint = map_checkpointLabels_str0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_checkpointLabels_str0);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    javax.swing.KeyStroke keyStroke11 = null;
    jMultiLineToolTip0.unregisterKeyboardAction(keyStroke11);
    crystal.util.JMultiLineToolTip jMultiLineToolTip13 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle14 = null;
    java.awt.Rectangle rectangle15 = jMultiLineToolTip13.getBounds(rectangle14);
    java.awt.Rectangle rectangle16 = jMultiLineToolTip13.getVisibleRect();
    jMultiLineToolTip0.paintImmediately(rectangle16);
    javax.swing.JPopupMenu jPopupMenu18 = null;
    jMultiLineToolTip0.setComponentPopupMenu(jPopupMenu18);
    crystal.util.JMultiLineToolTip jMultiLineToolTip20 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle21 = null;
    java.awt.Rectangle rectangle22 = jMultiLineToolTip20.getBounds(rectangle21);
    java.awt.Toolkit toolkit23 = jMultiLineToolTip20.getToolkit();
    jMultiLineToolTip20.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager27 = null;
    jMultiLineToolTip20.setLayout(layoutManager27);
    boolean b29 = jMultiLineToolTip20.isFocusOwner();
    boolean b30 = jMultiLineToolTip20.isShowing();
    jMultiLineToolTip20.transferFocusUpCycle();
    crystal.util.JMultiLineToolTip jMultiLineToolTip32 = new crystal.util.JMultiLineToolTip();
    boolean b33 = jMultiLineToolTip32.isFocusTraversalPolicyProvider();
    java.awt.Dimension dimension34 = jMultiLineToolTip32.preferredSize();
    java.awt.Dimension dimension35 = jMultiLineToolTip20.getSize(dimension34);
    java.awt.Component component36 = jMultiLineToolTip0.add((java.awt.Component)jMultiLineToolTip20);
    javax.swing.KeyStroke keyStroke37 = null;
    jMultiLineToolTip0.unregisterKeyboardAction(keyStroke37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component36);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }

    crystal.client.ProjectPreferences projectPreferences0 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener1 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener2 = null;
    crystal.client.CalculateProjectTask calculateProjectTask3 = new crystal.client.CalculateProjectTask(projectPreferences0, computationListener1, computationListener2);
    java.beans.PropertyChangeSupport propertyChangeSupport4 = calculateProjectTask3.getPropertyChangeSupport();
    calculateProjectTask3.execute();
    int i6 = calculateProjectTask3.getProgress();
    javax.swing.SwingWorker.StateValue stateValue7 = calculateProjectTask3.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeSupport4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    org.junit.Assert.assertTrue("'" + stateValue7 + "' != '" + javax.swing.SwingWorker.StateValue.DONE + "'", stateValue7.equals(javax.swing.SwingWorker.StateValue.DONE));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Insets insets3 = jMultiLineToolTip0.getInsets();
    boolean b4 = jMultiLineToolTip0.isValidateRoot();
    java.awt.event.HierarchyListener[] hierarchyListener_array5 = jMultiLineToolTip0.getHierarchyListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array5);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.FocusTraversalPolicy focusTraversalPolicy4 = null;
    jMultiLineToolTip0.setFocusTraversalPolicy(focusTraversalPolicy4);
    boolean b6 = jMultiLineToolTip0.isForegroundSet();
    java.awt.event.FocusListener focusListener7 = null;
    jMultiLineToolTip0.addFocusListener(focusListener7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    javax.swing.KeyStroke keyStroke11 = null;
    jMultiLineToolTip0.unregisterKeyboardAction(keyStroke11);
    crystal.util.JMultiLineToolTip jMultiLineToolTip13 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle14 = null;
    java.awt.Rectangle rectangle15 = jMultiLineToolTip13.getBounds(rectangle14);
    java.awt.Rectangle rectangle16 = jMultiLineToolTip13.getVisibleRect();
    boolean b17 = jMultiLineToolTip13.isEnabled();
    java.awt.Event event18 = null;
    boolean b21 = jMultiLineToolTip13.mouseEnter(event18, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener22 = null;
    jMultiLineToolTip13.addPropertyChangeListener(propertyChangeListener22);
    java.awt.Point point24 = jMultiLineToolTip13.getLocation();
    java.awt.Event event25 = null;
    boolean b28 = jMultiLineToolTip13.mouseDown(event25, 7, (int)(byte)10);
    int i29 = jMultiLineToolTip13.countComponents();
    jMultiLineToolTip13.layout();
    java.awt.Font font31 = jMultiLineToolTip13.getFont();
    java.awt.FontMetrics fontMetrics32 = jMultiLineToolTip0.getFontMetrics(font31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(fontMetrics32);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    jMultiLineToolTip0.firePropertyChange("hi!", ' ', '#');
    java.lang.Object obj6 = jMultiLineToolTip0.getTreeLock();
    jMultiLineToolTip0.setAlignmentX((float)8);
    java.lang.String str9 = jMultiLineToolTip0.getUIClassID();
    jMultiLineToolTip0.resize((int)'4', 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ToolTipUI"+ "'", str9.equals("ToolTipUI"));

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }

    java.util.Date date1 = crystal.util.TimeUtility.parseLSMRDate("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(date1);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    java.awt.Dimension dimension11 = jMultiLineToolTip0.preferredSize();
    boolean b12 = jMultiLineToolTip0.getIgnoreRepaint();
    boolean b13 = jMultiLineToolTip0.isOptimizedDrawingEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    jMultiLineToolTip0.firePropertyChange("AHEAD", 0, 128);
    jMultiLineToolTip0.paintImmediately(3, (int)(byte)10, 100, (int)(short)0);
    java.awt.event.HierarchyListener hierarchyListener12 = null;
    jMultiLineToolTip0.removeHierarchyListener(hierarchyListener12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }

    int i0 = javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Dimension dimension5 = null;
    jMultiLineToolTip0.setPreferredSize(dimension5);
    jMultiLineToolTip0.show();
    jMultiLineToolTip0.disable();
    java.awt.event.KeyListener keyListener9 = null;
    jMultiLineToolTip0.addKeyListener(keyListener9);
    jMultiLineToolTip0.setRequestFocusEnabled(false);
    jMultiLineToolTip0.firePropertyChange("AHEAD", (short)0, (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager7 = null;
    jMultiLineToolTip0.setLayout(layoutManager7);
    java.awt.event.InputMethodListener inputMethodListener9 = null;
    jMultiLineToolTip0.removeInputMethodListener(inputMethodListener9);
    java.awt.Point point11 = jMultiLineToolTip0.getMousePosition();
    javax.swing.JPopupMenu jPopupMenu12 = jMultiLineToolTip0.getComponentPopupMenu();
    java.awt.Component component15 = jMultiLineToolTip0.getComponentAt((int)(short)0, 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jPopupMenu12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component15);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager7 = null;
    jMultiLineToolTip0.setLayout(layoutManager7);
    java.awt.event.InputMethodListener inputMethodListener9 = null;
    jMultiLineToolTip0.removeInputMethodListener(inputMethodListener9);
    java.awt.Point point11 = jMultiLineToolTip0.getMousePosition();
    javax.swing.JPopupMenu jPopupMenu12 = jMultiLineToolTip0.getComponentPopupMenu();
    // The following exception was thrown during execution in test generation
    try {
    jPopupMenu12.setLocation((int)(byte)-1, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jPopupMenu12);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }

    crystal.model.DataSource.RepoKind repoKind2 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment5 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind2, false, "hi!");
    environment5.setParent("Action: hg merge");
    environment5.setCompileCommand("AHEAD");
    crystal.util.JMultiLineToolTip jMultiLineToolTip10 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle11 = null;
    java.awt.Rectangle rectangle12 = jMultiLineToolTip10.getBounds(rectangle11);
    java.awt.Event event13 = null;
    boolean b15 = jMultiLineToolTip10.action(event13, (java.lang.Object)'4');
    java.awt.event.InputMethodListener inputMethodListener16 = null;
    jMultiLineToolTip10.removeInputMethodListener(inputMethodListener16);
    java.awt.Graphics graphics18 = null;
    jMultiLineToolTip10.print(graphics18);
    javax.swing.border.Border border20 = jMultiLineToolTip10.getBorder();
    java.beans.VetoableChangeListener[] vetoableChangeListener_array21 = jMultiLineToolTip10.getVetoableChangeListeners();
    boolean b22 = environment5.equals((java.lang.Object)jMultiLineToolTip10);
    org.junit.Assert.assertTrue("'" + repoKind2 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind2.equals(crystal.model.DataSource.RepoKind.HG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(border20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vetoableChangeListener_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Insets insets3 = jMultiLineToolTip0.getInsets();
    crystal.util.JMultiLineToolTip jMultiLineToolTip4 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle5 = null;
    java.awt.Rectangle rectangle6 = jMultiLineToolTip4.getBounds(rectangle5);
    java.awt.Toolkit toolkit7 = jMultiLineToolTip4.getToolkit();
    java.awt.Font font8 = null;
    jMultiLineToolTip4.setFont(font8);
    java.awt.Color color10 = jMultiLineToolTip4.getBackground();
    jMultiLineToolTip0.setBackground(color10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color10);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color1 = null;
    jMultiLineToolTip0.setBackground(color1);
    java.awt.event.MouseListener mouseListener3 = null;
    jMultiLineToolTip0.removeMouseListener(mouseListener3);
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener5 = null;
    jMultiLineToolTip0.addHierarchyBoundsListener(hierarchyBoundsListener5);
    int i7 = jMultiLineToolTip0.getComponentCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    jMultiLineToolTip0.firePropertyChange("hi!", ' ', '#');
    java.awt.Dimension dimension6 = jMultiLineToolTip0.getMaximumSize();
    int i7 = jMultiLineToolTip0.getY();
    java.awt.Component component10 = jMultiLineToolTip0.locate(0, 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component10);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }

    crystal.client.ClientPreferences.ConfigurationReadingException configurationReadingException1 = new crystal.client.ClientPreferences.ConfigurationReadingException(100);
    crystal.client.ClientPreferences.NonexistentProjectException nonexistentProjectException3 = new crystal.client.ClientPreferences.NonexistentProjectException("");
    crystal.client.ClientPreferences.ConfigurationReadingException configurationReadingException6 = new crystal.client.ClientPreferences.ConfigurationReadingException("PENDING", (int)(short)-1);
    nonexistentProjectException3.addSuppressed((java.lang.Throwable)configurationReadingException6);
    configurationReadingException1.addSuppressed((java.lang.Throwable)configurationReadingException6);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }

    javax.swing.ImageIcon imageIcon1 = null;
    java.awt.Image image2 = null;
    crystal.model.Relationship relationship3 = new crystal.model.Relationship("AHEAD", imageIcon1, image2);
    javax.swing.ImageIcon imageIcon6 = null;
    java.awt.Image image7 = null;
    crystal.model.Relationship relationship8 = new crystal.model.Relationship("AHEAD", imageIcon6, image7);
    relationship3.calculateAction("AHEAD", relationship8);
    java.lang.String str10 = relationship3.getToolTipText();
    java.lang.String str11 = relationship3.getToolTipText();
    javax.swing.ImageIcon imageIcon12 = relationship3.getIcon();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Action: hg merge"+ "'", str10.equals("Action: hg merge"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Action: hg merge"+ "'", str11.equals("Action: hg merge"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(imageIcon12);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    crystal.util.JMultiLineToolTip jMultiLineToolTip6 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle7 = null;
    java.awt.Rectangle rectangle8 = jMultiLineToolTip6.getBounds(rectangle7);
    java.awt.Event event9 = null;
    boolean b11 = jMultiLineToolTip6.action(event9, (java.lang.Object)'4');
    jMultiLineToolTip0.setComponent((javax.swing.JComponent)jMultiLineToolTip6);
    boolean b13 = jMultiLineToolTip6.isVisible();
    java.awt.event.KeyListener keyListener14 = null;
    jMultiLineToolTip6.removeKeyListener(keyListener14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    crystal.util.JMultiLineToolTip jMultiLineToolTip6 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle7 = null;
    java.awt.Rectangle rectangle8 = jMultiLineToolTip6.getBounds(rectangle7);
    java.awt.Event event9 = null;
    boolean b11 = jMultiLineToolTip6.action(event9, (java.lang.Object)'4');
    jMultiLineToolTip0.setComponent((javax.swing.JComponent)jMultiLineToolTip6);
    crystal.util.JMultiLineToolTip jMultiLineToolTip13 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle14 = null;
    java.awt.Rectangle rectangle15 = jMultiLineToolTip13.getBounds(rectangle14);
    java.awt.Toolkit toolkit16 = jMultiLineToolTip13.getToolkit();
    jMultiLineToolTip13.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager20 = null;
    jMultiLineToolTip13.setLayout(layoutManager20);
    boolean b22 = jMultiLineToolTip13.isFocusOwner();
    boolean b23 = jMultiLineToolTip13.isShowing();
    java.awt.Graphics graphics24 = null;
    jMultiLineToolTip13.update(graphics24);
    java.awt.Component component26 = jMultiLineToolTip0.add((java.awt.Component)jMultiLineToolTip13);
    java.awt.Font font27 = null;
    jMultiLineToolTip13.setFont(font27);
    crystal.util.JMultiLineToolTip jMultiLineToolTip29 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle30 = null;
    java.awt.Rectangle rectangle31 = jMultiLineToolTip29.getBounds(rectangle30);
    java.awt.Rectangle rectangle32 = jMultiLineToolTip29.getVisibleRect();
    boolean b33 = jMultiLineToolTip29.isEnabled();
    java.awt.Event event34 = null;
    boolean b37 = jMultiLineToolTip29.mouseEnter(event34, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener38 = null;
    jMultiLineToolTip29.addPropertyChangeListener(propertyChangeListener38);
    java.awt.Point point40 = jMultiLineToolTip29.getLocation();
    jMultiLineToolTip13.setLocation(point40);
    boolean b42 = jMultiLineToolTip13.isPaintingTile();
    java.awt.ComponentOrientation componentOrientation43 = jMultiLineToolTip13.getComponentOrientation();
    java.awt.event.KeyListener[] keyListener_array44 = jMultiLineToolTip13.getKeyListeners();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener45 = null;
    jMultiLineToolTip13.addHierarchyBoundsListener(hierarchyBoundsListener45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentOrientation43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(keyListener_array44);

  }

}
