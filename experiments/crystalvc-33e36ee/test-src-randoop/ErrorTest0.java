
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test01"); }

    crystal.client.ProjectPreferences projectPreferences0 = null;
    crystal.model.DataSource dataSource1 = null;
    crystal.model.DataSource.RepoKind repoKind3 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.lang.String str4 = crystal.server.AbstractStateChecker.getRelationship(projectPreferences0, dataSource1, "AHEAD", repoKind3);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test02"); }

    crystal.client.ProjectPreferences projectPreferences0 = null;
    crystal.model.DataSource dataSource1 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.lang.String str3 = crystal.server.HgStateChecker.getRelationship(projectPreferences0, dataSource1, "");

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test03"); }

    crystal.model.Relationship[] relationship_array0 = new crystal.model.Relationship[] {  };
    java.util.ArrayList<crystal.model.Relationship> arraylist_relationship1 = new java.util.ArrayList<crystal.model.Relationship>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<crystal.model.Relationship>)arraylist_relationship1, relationship_array0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.awt.Image image3 = crystal.model.Relationship.getDominant((java.util.Collection<crystal.model.Relationship>)arraylist_relationship1);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test04"); }

    crystal.model.DataSource dataSource0 = null;
    crystal.client.ClientPreferences clientPreferences5 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences6 = new crystal.client.ProjectPreferences(dataSource0, clientPreferences5);
    
    // Checks the contract:  projectPreferences6.equals(projectPreferences6)
    org.junit.Assert.assertTrue("Contract failed: projectPreferences6.equals(projectPreferences6)", projectPreferences6.equals(projectPreferences6));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test05"); }

    crystal.client.ProjectPreferences projectPreferences0 = null;
    crystal.model.DataSource dataSource1 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.lang.String str3 = crystal.server.GitStateChecker.getRelationship(projectPreferences0, dataSource1, "TESTCONFLICT");

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test06"); }

    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    boolean b3 = crystal.server.GitStateChecker.isGitRepository("", "0 ms", "TESTCONFLICT");

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test07"); }

    crystal.model.DataSource dataSource0 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    crystal.model.LocalStateResult localStateResult5 = new crystal.model.LocalStateResult(dataSource0, "", "hi!", "hi!", "0 ms");

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test08"); }

    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    boolean b3 = crystal.server.GitStateChecker.isGitRepository("$HOME", "AHEAD", "");

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test09"); }

    crystal.client.ProjectPreferences projectPreferences0 = null;
    crystal.model.DataSource dataSource1 = null;
    crystal.model.DataSource.RepoKind repoKind3 = crystal.model.DataSource.RepoKind.HG;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.lang.String str4 = crystal.server.AbstractStateChecker.getRelationship(projectPreferences0, dataSource1, "PENDING", repoKind3);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test10"); }

    crystal.client.ProjectPreferences projectPreferences0 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener1 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener2 = null;
    crystal.client.CalculateProjectTask calculateProjectTask3 = new crystal.client.CalculateProjectTask(projectPreferences0, computationListener1, computationListener2);
    java.beans.PropertyChangeSupport propertyChangeSupport4 = calculateProjectTask3.getPropertyChangeSupport();
    crystal.client.ClientPreferences clientPreferences10 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ClientPreferences clientPreferences11 = clientPreferences10.clone();
    clientPreferences11.setChanged(false);
    java.lang.Object obj14 = null;
    calculateProjectTask3.firePropertyChange("hi!", (java.lang.Object)false, obj14);
    
    // Checks the contract:  equals-hashcode on clientPreferences10 and clientPreferences11
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on clientPreferences10 and clientPreferences11", clientPreferences10.equals(clientPreferences11) ? clientPreferences10.hashCode() == clientPreferences11.hashCode() : true);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test11"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "AHEAD", "TESTCONFLICT" };
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    crystal.util.RunIt.Output output6 = crystal.util.RunIt.execute("", str_array3, "$HOME", false);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test12"); }

    crystal.client.ProjectPreferences projectPreferences0 = null;
    crystal.model.DataSource.RepoKind repoKind5 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment8 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind5, false, "hi!");
    crystal.model.Environment environment11 = new crystal.model.Environment("Action: hg merge", "2017-06-04T14-21-48.265-0700", repoKind5, true, "Action: hg merge");
    java.lang.String str12 = environment11.getRemoteCmd();
    crystal.model.DataSource.RepoKind repoKind14 = crystal.model.DataSource.RepoKind.HG;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.lang.String str15 = crystal.server.AbstractStateChecker.getRelationship(projectPreferences0, (crystal.model.DataSource)environment11, "$HOME", repoKind14);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test13"); }

    crystal.client.ProjectPreferences projectPreferences0 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.lang.String str1 = crystal.server.GitStateChecker.getLocalState(projectPreferences0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test14"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ClientPreferences clientPreferences5 = clientPreferences4.clone();
    crystal.client.ProjectPreferences projectPreferences6 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    crystal.client.DataSourceGuiEditorFrame dataSourceGuiEditorFrame7 = new crystal.client.DataSourceGuiEditorFrame(clientPreferences4, projectPreferences6);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test15"); }

    crystal.client.ProjectPreferences projectPreferences0 = null;
    crystal.model.DataSource.RepoKind repoKind3 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment6 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind3, false, "hi!");
    java.lang.String str7 = environment6.getParent();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.lang.String str9 = crystal.server.HgStateChecker.getRelationship(projectPreferences0, (crystal.model.DataSource)environment6, "ToolTipUI");

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test16"); }

    crystal.client.ConflictDaemon conflictDaemon0 = crystal.client.ConflictDaemon.getInstance();
    conflictDaemon0.enable(true);
    conflictDaemon0.removeAllListeners();
    java.util.Collection<crystal.model.Relationship> collection_relationship4 = conflictDaemon0.getRelationships();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.awt.Image image5 = crystal.model.Relationship.getDominant(collection_relationship4);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test17"); }

    crystal.client.ProjectPreferences projectPreferences0 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.lang.String str1 = crystal.server.HgStateChecker.getLocalState(projectPreferences0);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test18"); }

    crystal.client.ProjectPreferences projectPreferences0 = null;
    crystal.model.DataSource.RepoKind repoKind3 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment6 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind3, false, "hi!");
    environment6.setParent("Action: hg merge");
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.lang.String str10 = crystal.server.GitStateChecker.getRelationship(projectPreferences0, (crystal.model.DataSource)environment6, "0 ms");

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test19"); }

    crystal.client.ConflictDaemon conflictDaemon0 = crystal.client.ConflictDaemon.getInstance();
    conflictDaemon0.enable(true);
    conflictDaemon0.removeAllListeners();
    conflictDaemon0.removeAllListeners();
    conflictDaemon0.removeAllListeners();
    crystal.model.DataSource.RepoKind repoKind12 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment15 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind12, false, "hi!");
    crystal.model.Environment environment18 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind12, true, "PENDING");
    crystal.model.DataSource dataSource21 = new crystal.model.DataSource("ToolTipUI", "415725 hours 21 min", repoKind12, true, "415725 hours 21 min");
    crystal.model.DataSource dataSource22 = dataSource21.clone();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    crystal.model.LocalStateResult localStateResult23 = conflictDaemon0.getLocalState(dataSource21);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test20"); }

    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    boolean b3 = crystal.server.HgStateChecker.isHgRepository("TESTCONFLICT", "cannot compute hg action", "ERROR");

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test21"); }

    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    crystal.util.RunIt.Output output2 = crystal.util.RunIt.tryCommand("ERROR", "hi!");

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test22"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences5 = null;
    clientPreferences4.addProjectPreferences(projectPreferences5);
    crystal.client.ProjectPreferences projectPreferences7 = null;
    clientPreferences4.removeProjectPreferences(projectPreferences7);
    crystal.client.ClientPreferences clientPreferences9 = clientPreferences4.clone();
    crystal.client.ProjectPreferences projectPreferences10 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    crystal.client.DataSourceGuiEditorFrame dataSourceGuiEditorFrame11 = new crystal.client.DataSourceGuiEditorFrame(clientPreferences4, projectPreferences10);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test23"); }

    crystal.client.ConflictDaemon conflictDaemon0 = crystal.client.ConflictDaemon.getInstance();
    conflictDaemon0.enable(false);
    crystal.client.ConflictClient conflictClient3 = new crystal.client.ConflictClient();
    crystal.client.ClientPreferences clientPreferences8 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences9 = null;
    clientPreferences8.addProjectPreferences(projectPreferences9);
    crystal.client.ProjectPreferences projectPreferences11 = null;
    clientPreferences8.removeProjectPreferences(projectPreferences11);
    crystal.client.ClientPreferences clientPreferences13 = clientPreferences8.clone();
    conflictClient3.createAndShowGUI(clientPreferences8);
    conflictDaemon0.addListener((crystal.client.ConflictDaemon.ComputationListener)conflictClient3);
    
    // Checks the contract:  equals-hashcode on clientPreferences13 and clientPreferences8
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on clientPreferences13 and clientPreferences8", clientPreferences13.equals(clientPreferences8) ? clientPreferences13.hashCode() == clientPreferences8.hashCode() : true);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test24"); }

    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    boolean b3 = crystal.server.GitStateChecker.isGitRepository("", "", "");

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test25"); }

    crystal.client.ProjectPreferences projectPreferences0 = null;
    crystal.model.DataSource.RepoKind repoKind3 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment6 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind3, false, "hi!");
    javax.swing.ImageIcon imageIcon9 = null;
    java.awt.Image image10 = null;
    crystal.model.Relationship relationship11 = new crystal.model.Relationship("AHEAD", imageIcon9, image10);
    javax.swing.ImageIcon imageIcon14 = null;
    java.awt.Image image15 = null;
    crystal.model.Relationship relationship16 = new crystal.model.Relationship("AHEAD", imageIcon14, image15);
    relationship11.calculateAction("AHEAD", relationship16);
    crystal.model.RevisionHistory.Capable capable18 = crystal.model.RevisionHistory.Capable.MUST;
    relationship16.setCapable(capable18);
    crystal.model.DataSource.RepoKind repoKind24 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment27 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind24, false, "hi!");
    crystal.model.Environment environment30 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind24, true, "PENDING");
    java.lang.String str31 = relationship16.getAction(repoKind24);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.lang.String str32 = crystal.server.AbstractStateChecker.getRelationship(projectPreferences0, (crystal.model.DataSource)environment6, "$HOME", repoKind24);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test26"); }

    crystal.client.ProjectPreferences projectPreferences0 = null;
    crystal.client.ConflictClient conflictClient1 = new crystal.client.ConflictClient();
    crystal.client.ClientPreferences clientPreferences6 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences7 = null;
    clientPreferences6.addProjectPreferences(projectPreferences7);
    crystal.client.ProjectPreferences projectPreferences9 = null;
    clientPreferences6.removeProjectPreferences(projectPreferences9);
    crystal.client.ClientPreferences clientPreferences11 = clientPreferences6.clone();
    conflictClient1.createAndShowGUI(clientPreferences6);
    crystal.client.ConflictClient conflictClient13 = new crystal.client.ConflictClient();
    crystal.client.ClientPreferences clientPreferences18 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences19 = null;
    clientPreferences18.addProjectPreferences(projectPreferences19);
    crystal.client.ProjectPreferences projectPreferences21 = null;
    clientPreferences18.removeProjectPreferences(projectPreferences21);
    crystal.client.ClientPreferences clientPreferences23 = clientPreferences18.clone();
    conflictClient13.createAndShowGUI(clientPreferences18);
    crystal.client.CalculateProjectTask calculateProjectTask25 = new crystal.client.CalculateProjectTask(projectPreferences0, (crystal.client.ConflictDaemon.ComputationListener)conflictClient1, (crystal.client.ConflictDaemon.ComputationListener)conflictClient13);
    
    // Checks the contract:  equals-hashcode on clientPreferences23 and clientPreferences6
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on clientPreferences23 and clientPreferences6", clientPreferences23.equals(clientPreferences6) ? clientPreferences23.hashCode() == clientPreferences6.hashCode() : true);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test27"); }

    java.lang.String[] str_array3 = new java.lang.String[] { ",", "AHEAD_HG_2017-06-04T14-21-48.265-0700" };
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    crystal.util.RunIt.Output output6 = crystal.util.RunIt.executeTwice("ToolTipUI", str_array3, "$HOME", false);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test28"); }

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
    java.lang.String str52 = revisionHistory51.toString();
    javax.swing.ImageIcon imageIcon55 = null;
    java.awt.Image image56 = null;
    crystal.model.Relationship relationship57 = new crystal.model.Relationship("AHEAD", imageIcon55, image56);
    javax.swing.ImageIcon imageIcon60 = null;
    java.awt.Image image61 = null;
    crystal.model.Relationship relationship62 = new crystal.model.Relationship("AHEAD", imageIcon60, image61);
    relationship57.calculateAction("AHEAD", relationship62);
    crystal.model.RevisionHistory.Capable capable64 = crystal.model.RevisionHistory.Capable.MUST;
    relationship62.setCapable(capable64);
    crystal.model.DataSource.RepoKind repoKind70 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment73 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind70, false, "hi!");
    crystal.model.Environment environment76 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind70, true, "PENDING");
    java.lang.String str77 = relationship62.getAction(repoKind70);
    crystal.model.RevisionHistory revisionHistory78 = new crystal.model.RevisionHistory("ERROR", repoKind70);
    java.lang.String str79 = revisionHistory78.toString();
    javax.swing.ImageIcon imageIcon81 = null;
    java.awt.Image image82 = null;
    crystal.model.Relationship relationship83 = new crystal.model.Relationship("AHEAD", imageIcon81, image82);
    crystal.util.JMultiLineToolTip jMultiLineToolTip84 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle85 = null;
    java.awt.Rectangle rectangle86 = jMultiLineToolTip84.getBounds(rectangle85);
    java.awt.Rectangle rectangle87 = jMultiLineToolTip84.getVisibleRect();
    boolean b88 = jMultiLineToolTip84.isEnabled();
    java.awt.Event event89 = null;
    boolean b92 = jMultiLineToolTip84.mouseEnter(event89, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener93 = null;
    jMultiLineToolTip84.addPropertyChangeListener(propertyChangeListener93);
    java.awt.Point point95 = jMultiLineToolTip84.getLocation();
    boolean b96 = relationship83.equals((java.lang.Object)jMultiLineToolTip84);
    crystal.model.RevisionHistory.Capable capable98 = revisionHistory25.getCapable(revisionHistory51, revisionHistory78, relationship83, true);
    
    // Checks the contract:  equals-hashcode on environment76 and environment23
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on environment76 and environment23", environment76.equals(environment23) ? environment76.hashCode() == environment23.hashCode() : true);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test29"); }

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
    java.lang.String str52 = revisionHistory51.toString();
    javax.swing.ImageIcon imageIcon55 = null;
    java.awt.Image image56 = null;
    crystal.model.Relationship relationship57 = new crystal.model.Relationship("AHEAD", imageIcon55, image56);
    javax.swing.ImageIcon imageIcon60 = null;
    java.awt.Image image61 = null;
    crystal.model.Relationship relationship62 = new crystal.model.Relationship("AHEAD", imageIcon60, image61);
    relationship57.calculateAction("AHEAD", relationship62);
    crystal.model.RevisionHistory.Capable capable64 = crystal.model.RevisionHistory.Capable.MUST;
    relationship62.setCapable(capable64);
    crystal.model.DataSource.RepoKind repoKind70 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment73 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind70, false, "hi!");
    crystal.model.Environment environment76 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind70, true, "PENDING");
    java.lang.String str77 = relationship62.getAction(repoKind70);
    crystal.model.RevisionHistory revisionHistory78 = new crystal.model.RevisionHistory("ERROR", repoKind70);
    java.lang.String str79 = revisionHistory78.toString();
    javax.swing.ImageIcon imageIcon81 = null;
    java.awt.Image image82 = null;
    crystal.model.Relationship relationship83 = new crystal.model.Relationship("AHEAD", imageIcon81, image82);
    javax.swing.ImageIcon imageIcon86 = null;
    java.awt.Image image87 = null;
    crystal.model.Relationship relationship88 = new crystal.model.Relationship("AHEAD", imageIcon86, image87);
    relationship83.calculateAction("AHEAD", relationship88);
    crystal.model.RevisionHistory.Action action90 = relationship88.getAction();
    crystal.model.RevisionHistory.Capable capable92 = revisionHistory25.getCapable(revisionHistory51, revisionHistory78, relationship88, false);
    
    // Checks the contract:  equals-hashcode on environment23 and environment49
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on environment23 and environment49", environment23.equals(environment49) ? environment23.hashCode() == environment49.hashCode() : true);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test30"); }

    crystal.model.DataSource.RepoKind repoKind4 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment7 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind4, false, "hi!");
    crystal.model.Environment environment10 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind4, true, "PENDING");
    environment10.setCompileCommand("TESTCONFLICT");
    crystal.client.ClientPreferences clientPreferences17 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences18 = null;
    clientPreferences17.addProjectPreferences(projectPreferences18);
    clientPreferences17.setGitPath("");
    crystal.client.ProjectPreferences projectPreferences22 = null;
    clientPreferences17.removeProjectPreferences(projectPreferences22);
    crystal.client.ProjectPreferences projectPreferences24 = new crystal.client.ProjectPreferences((crystal.model.DataSource)environment10, clientPreferences17);
    javax.swing.ImageIcon imageIcon28 = null;
    java.awt.Image image29 = null;
    crystal.model.Relationship relationship30 = new crystal.model.Relationship("AHEAD", imageIcon28, image29);
    javax.swing.ImageIcon imageIcon33 = null;
    java.awt.Image image34 = null;
    crystal.model.Relationship relationship35 = new crystal.model.Relationship("AHEAD", imageIcon33, image34);
    relationship30.calculateAction("AHEAD", relationship35);
    crystal.model.DataSource.RepoKind repoKind43 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment46 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind43, false, "hi!");
    crystal.model.Environment environment49 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind43, true, "PENDING");
    crystal.model.DataSource dataSource52 = new crystal.model.DataSource("ToolTipUI", "415725 hours 21 min", repoKind43, true, "415725 hours 21 min");
    java.lang.String str53 = relationship35.getAction(repoKind43);
    crystal.model.DataSource dataSource56 = new crystal.model.DataSource("cannot compute hg action", "%5p - %m%n", repoKind43, false, "ERROR");
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.lang.String str58 = crystal.server.HgStateChecker.getRelationship(projectPreferences24, dataSource56, "");

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test31"); }

    java.lang.String[] str_array5 = new java.lang.String[] { ",", "2017-06-04T14-21-48.265-0700", "hi!", "" };
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    crystal.util.RunIt.Output output8 = crystal.util.RunIt.execute("0 ms", str_array5, ",", false);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test32"); }

    crystal.client.ConflictDaemon conflictDaemon0 = crystal.client.ConflictDaemon.getInstance();
    conflictDaemon0.enable(true);
    conflictDaemon0.removeAllListeners();
    crystal.model.DataSource.RepoKind repoKind10 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment13 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind10, false, "hi!");
    crystal.model.Environment environment16 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind10, true, "PENDING");
    crystal.model.DataSource dataSource19 = new crystal.model.DataSource("ToolTipUI", "415725 hours 21 min", repoKind10, true, "415725 hours 21 min");
    crystal.model.DataSource dataSource20 = dataSource19.clone();
    crystal.client.ClientPreferences clientPreferences25 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.util.JMultiLineToolTip jMultiLineToolTip26 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle27 = null;
    java.awt.Rectangle rectangle28 = jMultiLineToolTip26.getBounds(rectangle27);
    java.awt.Rectangle rectangle29 = jMultiLineToolTip26.getVisibleRect();
    boolean b30 = jMultiLineToolTip26.isEnabled();
    java.beans.VetoableChangeListener[] vetoableChangeListener_array31 = jMultiLineToolTip26.getVetoableChangeListeners();
    boolean b32 = clientPreferences25.equals((java.lang.Object)vetoableChangeListener_array31);
    java.lang.String str33 = clientPreferences25.getHgPath();
    long long34 = clientPreferences25.getRefresh();
    crystal.model.DataSource.RepoKind repoKind39 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment42 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind39, false, "hi!");
    crystal.model.Environment environment45 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind39, true, "PENDING");
    environment45.setCompileCommand("TESTCONFLICT");
    crystal.client.ClientPreferences clientPreferences52 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences53 = null;
    clientPreferences52.addProjectPreferences(projectPreferences53);
    clientPreferences52.setGitPath("");
    crystal.client.ProjectPreferences projectPreferences57 = null;
    clientPreferences52.removeProjectPreferences(projectPreferences57);
    crystal.client.ProjectPreferences projectPreferences59 = new crystal.client.ProjectPreferences((crystal.model.DataSource)environment45, clientPreferences52);
    clientPreferences25.addProjectPreferences(projectPreferences59);
    crystal.model.Relationship relationship61 = conflictDaemon0.calculateRelationship(dataSource19, projectPreferences59);
    
    // Checks the contract:  equals-hashcode on environment16 and environment45
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on environment16 and environment45", environment16.equals(environment45) ? environment16.hashCode() == environment45.hashCode() : true);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test33"); }

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
    java.lang.String str26 = revisionHistory25.toString();
    javax.swing.ImageIcon imageIcon29 = null;
    java.awt.Image image30 = null;
    crystal.model.Relationship relationship31 = new crystal.model.Relationship("AHEAD", imageIcon29, image30);
    javax.swing.ImageIcon imageIcon34 = null;
    java.awt.Image image35 = null;
    crystal.model.Relationship relationship36 = new crystal.model.Relationship("AHEAD", imageIcon34, image35);
    relationship31.calculateAction("AHEAD", relationship36);
    crystal.model.RevisionHistory.Capable capable38 = crystal.model.RevisionHistory.Capable.MUST;
    relationship36.setCapable(capable38);
    crystal.model.DataSource.RepoKind repoKind44 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment47 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind44, false, "hi!");
    crystal.model.Environment environment50 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind44, true, "PENDING");
    java.lang.String str51 = relationship36.getAction(repoKind44);
    crystal.model.RevisionHistory revisionHistory52 = new crystal.model.RevisionHistory("ERROR", repoKind44);
    java.lang.String str53 = revisionHistory52.toString();
    boolean b54 = revisionHistory25.subHistory(revisionHistory52);
    
    // Checks the contract:  equals-hashcode on environment50 and environment23
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on environment50 and environment23", environment50.equals(environment23) ? environment50.hashCode() == environment23.hashCode() : true);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test34"); }

    crystal.client.ProjectPreferences projectPreferences0 = null;
    crystal.model.DataSource.RepoKind repoKind3 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment6 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind3, false, "hi!");
    environment6.setParent("Action: hg merge");
    environment6.setCompileCommand("AHEAD");
    crystal.model.DataSource.RepoKind repoKind18 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment21 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind18, false, "hi!");
    crystal.model.Environment environment24 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind18, true, "PENDING");
    crystal.model.DataSource dataSource27 = new crystal.model.DataSource("ToolTipUI", "415725 hours 21 min", repoKind18, true, "415725 hours 21 min");
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.lang.String str28 = crystal.server.AbstractStateChecker.getRelationship(projectPreferences0, (crystal.model.DataSource)environment6, "AHEAD", repoKind18);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test35"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.util.JMultiLineToolTip jMultiLineToolTip5 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle6 = null;
    java.awt.Rectangle rectangle7 = jMultiLineToolTip5.getBounds(rectangle6);
    java.awt.Rectangle rectangle8 = jMultiLineToolTip5.getVisibleRect();
    boolean b9 = jMultiLineToolTip5.isEnabled();
    java.beans.VetoableChangeListener[] vetoableChangeListener_array10 = jMultiLineToolTip5.getVetoableChangeListeners();
    boolean b11 = clientPreferences4.equals((java.lang.Object)vetoableChangeListener_array10);
    java.lang.String str12 = clientPreferences4.getHgPath();
    long long13 = clientPreferences4.getRefresh();
    crystal.model.DataSource.RepoKind repoKind18 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment21 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind18, false, "hi!");
    crystal.model.Environment environment24 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind18, true, "PENDING");
    environment24.setCompileCommand("TESTCONFLICT");
    crystal.client.ClientPreferences clientPreferences31 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences32 = null;
    clientPreferences31.addProjectPreferences(projectPreferences32);
    clientPreferences31.setGitPath("");
    crystal.client.ProjectPreferences projectPreferences36 = null;
    clientPreferences31.removeProjectPreferences(projectPreferences36);
    crystal.client.ProjectPreferences projectPreferences38 = new crystal.client.ProjectPreferences((crystal.model.DataSource)environment24, clientPreferences31);
    clientPreferences4.addProjectPreferences(projectPreferences38);
    crystal.model.DataSource.RepoKind repoKind44 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment47 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind44, false, "hi!");
    crystal.model.Environment environment50 = new crystal.model.Environment("Action: hg merge", "2017-06-04T14-21-48.265-0700", repoKind44, true, "Action: hg merge");
    java.lang.String str51 = environment50.getRemoteCmd();
    projectPreferences38.removeDataSource((crystal.model.DataSource)environment50);
    
    // Checks the contract:  equals-hashcode on environment21 and environment47
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on environment21 and environment47", environment21.equals(environment47) ? environment21.hashCode() == environment47.hashCode() : true);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test36"); }

    crystal.client.ConflictClient conflictClient0 = new crystal.client.ConflictClient();
    crystal.client.ClientPreferences clientPreferences5 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences6 = null;
    clientPreferences5.addProjectPreferences(projectPreferences6);
    crystal.client.ProjectPreferences projectPreferences8 = null;
    clientPreferences5.removeProjectPreferences(projectPreferences8);
    crystal.client.ClientPreferences clientPreferences10 = clientPreferences5.clone();
    conflictClient0.createAndShowGUI(clientPreferences5);
    conflictClient0.update();
    
    // Checks the contract:  equals-hashcode on clientPreferences5 and clientPreferences10
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on clientPreferences5 and clientPreferences10", clientPreferences5.equals(clientPreferences10) ? clientPreferences5.hashCode() == clientPreferences10.hashCode() : true);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test37"); }

    crystal.client.ConflictDaemon conflictDaemon0 = crystal.client.ConflictDaemon.getInstance();
    conflictDaemon0.enable(true);
    conflictDaemon0.removeAllListeners();
    java.util.Collection<crystal.model.Relationship> collection_relationship4 = conflictDaemon0.getRelationships();
    crystal.model.DataSource.RepoKind repoKind7 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment10 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind7, false, "hi!");
    java.lang.String str11 = environment10.getParent();
    boolean b12 = environment10.isHidden();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    crystal.model.LocalStateResult localStateResult13 = conflictDaemon0.getLocalState((crystal.model.DataSource)environment10);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test38"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences5 = null;
    clientPreferences4.addProjectPreferences(projectPreferences5);
    crystal.client.ProjectPreferences projectPreferences7 = null;
    clientPreferences4.removeProjectPreferences(projectPreferences7);
    crystal.client.ClientPreferences clientPreferences9 = clientPreferences4.clone();
    crystal.model.DataSource.RepoKind repoKind14 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment17 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind14, false, "hi!");
    crystal.model.Environment environment20 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind14, true, "PENDING");
    environment20.setCompileCommand("TESTCONFLICT");
    crystal.client.ClientPreferences clientPreferences27 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences28 = null;
    clientPreferences27.addProjectPreferences(projectPreferences28);
    clientPreferences27.setGitPath("");
    crystal.client.ProjectPreferences projectPreferences32 = null;
    clientPreferences27.removeProjectPreferences(projectPreferences32);
    crystal.client.ProjectPreferences projectPreferences34 = new crystal.client.ProjectPreferences((crystal.model.DataSource)environment20, clientPreferences27);
    crystal.model.DataSource dataSource36 = projectPreferences34.getDataSource("PENDING");
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    crystal.client.DataSourceGuiEditorFrame dataSourceGuiEditorFrame37 = new crystal.client.DataSourceGuiEditorFrame(clientPreferences4, projectPreferences34);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test39"); }

    crystal.model.DataSource.RepoKind repoKind4 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment7 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind4, false, "hi!");
    crystal.model.Environment environment10 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind4, true, "PENDING");
    environment10.setCompileCommand("TESTCONFLICT");
    crystal.client.ClientPreferences clientPreferences17 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences18 = null;
    clientPreferences17.addProjectPreferences(projectPreferences18);
    clientPreferences17.setGitPath("");
    crystal.client.ProjectPreferences projectPreferences22 = null;
    clientPreferences17.removeProjectPreferences(projectPreferences22);
    crystal.client.ProjectPreferences projectPreferences24 = new crystal.client.ProjectPreferences((crystal.model.DataSource)environment10, clientPreferences17);
    crystal.client.ProjectPreferences projectPreferences25 = projectPreferences24.clone();
    crystal.model.DataSource.RepoKind repoKind28 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment31 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind28, false, "hi!");
    environment31.setParent("Action: hg merge");
    environment31.setCompileCommand("AHEAD");
    environment31.setRemoteCmd("");
    crystal.model.DataSource.RepoKind repoKind43 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment46 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind43, false, "hi!");
    crystal.model.Environment environment49 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind43, true, "PENDING");
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.lang.String str50 = crystal.server.AbstractStateChecker.getRelationship(projectPreferences24, (crystal.model.DataSource)environment31, "cannot compute hg action", repoKind43);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test40"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.util.JMultiLineToolTip jMultiLineToolTip5 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle6 = null;
    java.awt.Rectangle rectangle7 = jMultiLineToolTip5.getBounds(rectangle6);
    java.awt.Rectangle rectangle8 = jMultiLineToolTip5.getVisibleRect();
    boolean b9 = jMultiLineToolTip5.isEnabled();
    java.beans.VetoableChangeListener[] vetoableChangeListener_array10 = jMultiLineToolTip5.getVetoableChangeListeners();
    boolean b11 = clientPreferences4.equals((java.lang.Object)vetoableChangeListener_array10);
    java.lang.String str12 = clientPreferences4.getHgPath();
    long long13 = clientPreferences4.getRefresh();
    crystal.model.DataSource.RepoKind repoKind18 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment21 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind18, false, "hi!");
    crystal.model.Environment environment24 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind18, true, "PENDING");
    environment24.setCompileCommand("TESTCONFLICT");
    crystal.client.ClientPreferences clientPreferences31 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences32 = null;
    clientPreferences31.addProjectPreferences(projectPreferences32);
    clientPreferences31.setGitPath("");
    crystal.client.ProjectPreferences projectPreferences36 = null;
    clientPreferences31.removeProjectPreferences(projectPreferences36);
    crystal.client.ProjectPreferences projectPreferences38 = new crystal.client.ProjectPreferences((crystal.model.DataSource)environment24, clientPreferences31);
    clientPreferences4.addProjectPreferences(projectPreferences38);
    crystal.client.ConflictClient conflictClient40 = new crystal.client.ConflictClient();
    crystal.client.ConflictClient conflictClient41 = new crystal.client.ConflictClient();
    crystal.client.ClientPreferences clientPreferences46 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences47 = null;
    clientPreferences46.addProjectPreferences(projectPreferences47);
    crystal.client.ProjectPreferences projectPreferences49 = null;
    clientPreferences46.removeProjectPreferences(projectPreferences49);
    crystal.client.ClientPreferences clientPreferences51 = clientPreferences46.clone();
    conflictClient41.createAndShowGUI(clientPreferences46);
    crystal.client.CalculateProjectTask calculateProjectTask53 = new crystal.client.CalculateProjectTask(projectPreferences38, (crystal.client.ConflictDaemon.ComputationListener)conflictClient40, (crystal.client.ConflictDaemon.ComputationListener)conflictClient41);
    
    // Checks the contract:  equals-hashcode on clientPreferences51 and clientPreferences31
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on clientPreferences51 and clientPreferences31", clientPreferences51.equals(clientPreferences31) ? clientPreferences51.hashCode() == clientPreferences31.hashCode() : true);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test41"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ClientPreferences clientPreferences5 = clientPreferences4.clone();
    crystal.client.ClientPreferences.DEFAULT_CLIENT_PREFERENCES = clientPreferences4;
    crystal.model.DataSource.RepoKind repoKind9 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment12 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind9, false, "hi!");
    environment12.setParent("Action: hg merge");
    environment12.setCompileCommand("AHEAD");
    environment12.setRemoteCmd("");
    crystal.client.ClientPreferences clientPreferences19 = null;
    crystal.client.ProjectPreferences projectPreferences20 = new crystal.client.ProjectPreferences((crystal.model.DataSource)environment12, clientPreferences19);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    crystal.client.DataSourceGuiEditorFrame dataSourceGuiEditorFrame21 = new crystal.client.DataSourceGuiEditorFrame(clientPreferences4, projectPreferences20);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test42"); }

    crystal.client.ConflictClient conflictClient0 = new crystal.client.ConflictClient();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    conflictClient0.show();

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test43"); }

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
    java.lang.String str52 = revisionHistory51.toString();
    javax.swing.ImageIcon imageIcon55 = null;
    java.awt.Image image56 = null;
    crystal.model.Relationship relationship57 = new crystal.model.Relationship("AHEAD", imageIcon55, image56);
    javax.swing.ImageIcon imageIcon60 = null;
    java.awt.Image image61 = null;
    crystal.model.Relationship relationship62 = new crystal.model.Relationship("AHEAD", imageIcon60, image61);
    relationship57.calculateAction("AHEAD", relationship62);
    crystal.model.RevisionHistory.Capable capable64 = crystal.model.RevisionHistory.Capable.MUST;
    relationship62.setCapable(capable64);
    crystal.model.DataSource.RepoKind repoKind70 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment73 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind70, false, "hi!");
    crystal.model.Environment environment76 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind70, true, "PENDING");
    java.lang.String str77 = relationship62.getAction(repoKind70);
    crystal.model.RevisionHistory revisionHistory78 = new crystal.model.RevisionHistory("ERROR", repoKind70);
    javax.swing.ImageIcon imageIcon80 = null;
    java.awt.Image image81 = null;
    crystal.model.Relationship relationship82 = new crystal.model.Relationship("AHEAD", imageIcon80, image81);
    crystal.util.JMultiLineToolTip jMultiLineToolTip83 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle84 = null;
    java.awt.Rectangle rectangle85 = jMultiLineToolTip83.getBounds(rectangle84);
    java.awt.Rectangle rectangle86 = jMultiLineToolTip83.getVisibleRect();
    boolean b87 = jMultiLineToolTip83.isEnabled();
    java.awt.Event event88 = null;
    boolean b91 = jMultiLineToolTip83.mouseEnter(event88, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener92 = null;
    jMultiLineToolTip83.addPropertyChangeListener(propertyChangeListener92);
    java.awt.Point point94 = jMultiLineToolTip83.getLocation();
    boolean b95 = relationship82.equals((java.lang.Object)jMultiLineToolTip83);
    java.awt.Image image96 = relationship82.getImage();
    crystal.model.Relationship relationship97 = revisionHistory25.getConsequences(revisionHistory51, revisionHistory78, relationship82);
    
    // Checks the contract:  equals-hashcode on environment76 and environment49
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on environment76 and environment49", environment76.equals(environment49) ? environment76.hashCode() == environment49.hashCode() : true);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test44"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ClientPreferences clientPreferences5 = clientPreferences4.clone();
    boolean b6 = clientPreferences4.hasChanged();
    boolean b7 = clientPreferences4.hasChanged();
    clientPreferences4.setChanged(false);
    crystal.model.DataSource.RepoKind repoKind14 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment17 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind14, false, "hi!");
    crystal.model.Environment environment20 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind14, true, "PENDING");
    environment20.setCompileCommand("TESTCONFLICT");
    crystal.client.ClientPreferences clientPreferences27 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences28 = null;
    clientPreferences27.addProjectPreferences(projectPreferences28);
    clientPreferences27.setGitPath("");
    crystal.client.ProjectPreferences projectPreferences32 = null;
    clientPreferences27.removeProjectPreferences(projectPreferences32);
    crystal.client.ProjectPreferences projectPreferences34 = new crystal.client.ProjectPreferences((crystal.model.DataSource)environment20, clientPreferences27);
    crystal.client.ProjectPreferences projectPreferences35 = projectPreferences34.clone();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    crystal.client.DataSourceGuiEditorFrame dataSourceGuiEditorFrame36 = new crystal.client.DataSourceGuiEditorFrame(clientPreferences4, projectPreferences35);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test45"); }

    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    boolean b3 = crystal.server.GitStateChecker.isGitRepository("", "$HOME", "ERROR");

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test46"); }

    crystal.client.ConflictClient conflictClient0 = new crystal.client.ConflictClient();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    conflictClient0.setCanUpdate(true);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test47"); }

    crystal.client.ConflictDaemon conflictDaemon0 = crystal.client.ConflictDaemon.getInstance();
    conflictDaemon0.enable(false);
    boolean b3 = conflictDaemon0.isEnabled();
    crystal.model.DataSource.RepoKind repoKind6 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment9 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind6, false, "hi!");
    environment9.setParent("Action: hg merge");
    environment9.setCompileCommand("AHEAD");
    environment9.setRemoteCmd("");
    crystal.client.ClientPreferences clientPreferences16 = null;
    crystal.client.ProjectPreferences projectPreferences17 = new crystal.client.ProjectPreferences((crystal.model.DataSource)environment9, clientPreferences16);
    java.lang.String str18 = environment9.getShortName();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    crystal.model.LocalStateResult localStateResult19 = conflictDaemon0.getLocalState((crystal.model.DataSource)environment9);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test48"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences5 = null;
    clientPreferences4.addProjectPreferences(projectPreferences5);
    crystal.client.ProjectPreferences projectPreferences7 = null;
    clientPreferences4.removeProjectPreferences(projectPreferences7);
    crystal.client.ClientPreferences clientPreferences9 = clientPreferences4.clone();
    java.util.Collection<crystal.client.ProjectPreferences> collection_projectPreferences10 = clientPreferences9.getProjectPreference();
    crystal.model.DataSource.RepoKind repoKind15 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment18 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind15, false, "hi!");
    crystal.model.Environment environment21 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind15, true, "PENDING");
    environment21.setCompileCommand("TESTCONFLICT");
    crystal.client.ClientPreferences clientPreferences28 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences29 = null;
    clientPreferences28.addProjectPreferences(projectPreferences29);
    clientPreferences28.setGitPath("");
    crystal.client.ProjectPreferences projectPreferences33 = null;
    clientPreferences28.removeProjectPreferences(projectPreferences33);
    crystal.client.ProjectPreferences projectPreferences35 = new crystal.client.ProjectPreferences((crystal.model.DataSource)environment21, clientPreferences28);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    crystal.client.DataSourceGuiEditorFrame dataSourceGuiEditorFrame36 = new crystal.client.DataSourceGuiEditorFrame(clientPreferences9, projectPreferences35);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test49"); }

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
    java.lang.String str26 = revisionHistory25.toString();
    int i27 = revisionHistory25.size();
    javax.swing.ImageIcon imageIcon30 = null;
    java.awt.Image image31 = null;
    crystal.model.Relationship relationship32 = new crystal.model.Relationship("AHEAD", imageIcon30, image31);
    javax.swing.ImageIcon imageIcon35 = null;
    java.awt.Image image36 = null;
    crystal.model.Relationship relationship37 = new crystal.model.Relationship("AHEAD", imageIcon35, image36);
    relationship32.calculateAction("AHEAD", relationship37);
    crystal.model.RevisionHistory.Capable capable39 = crystal.model.RevisionHistory.Capable.MUST;
    relationship37.setCapable(capable39);
    crystal.model.DataSource.RepoKind repoKind45 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment48 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind45, false, "hi!");
    crystal.model.Environment environment51 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind45, true, "PENDING");
    java.lang.String str52 = relationship37.getAction(repoKind45);
    crystal.model.RevisionHistory revisionHistory53 = new crystal.model.RevisionHistory("ERROR", repoKind45);
    java.lang.String str54 = revisionHistory53.toString();
    javax.swing.ImageIcon imageIcon57 = null;
    java.awt.Image image58 = null;
    crystal.model.Relationship relationship59 = new crystal.model.Relationship("AHEAD", imageIcon57, image58);
    javax.swing.ImageIcon imageIcon62 = null;
    java.awt.Image image63 = null;
    crystal.model.Relationship relationship64 = new crystal.model.Relationship("AHEAD", imageIcon62, image63);
    relationship59.calculateAction("AHEAD", relationship64);
    crystal.model.RevisionHistory.Capable capable66 = crystal.model.RevisionHistory.Capable.MUST;
    relationship64.setCapable(capable66);
    crystal.model.DataSource.RepoKind repoKind72 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment75 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind72, false, "hi!");
    crystal.model.Environment environment78 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind72, true, "PENDING");
    java.lang.String str79 = relationship64.getAction(repoKind72);
    crystal.model.RevisionHistory revisionHistory80 = new crystal.model.RevisionHistory("ERROR", repoKind72);
    java.lang.String str81 = revisionHistory80.toString();
    javax.swing.ImageIcon imageIcon83 = null;
    java.awt.Image image84 = null;
    crystal.model.Relationship relationship85 = new crystal.model.Relationship("AHEAD", imageIcon83, image84);
    crystal.model.RevisionHistory.When when86 = revisionHistory25.getWhen(revisionHistory53, revisionHistory80, relationship85);
    
    // Checks the contract:  equals-hashcode on environment20 and environment48
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on environment20 and environment48", environment20.equals(environment48) ? environment20.hashCode() == environment48.hashCode() : true);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test50"); }

    crystal.model.DataSource.RepoKind repoKind4 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment7 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind4, false, "hi!");
    crystal.model.Environment environment10 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind4, true, "PENDING");
    environment10.setCompileCommand("TESTCONFLICT");
    crystal.client.ClientPreferences clientPreferences17 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences18 = null;
    clientPreferences17.addProjectPreferences(projectPreferences18);
    clientPreferences17.setGitPath("");
    crystal.client.ProjectPreferences projectPreferences22 = null;
    clientPreferences17.removeProjectPreferences(projectPreferences22);
    crystal.client.ProjectPreferences projectPreferences24 = new crystal.client.ProjectPreferences((crystal.model.DataSource)environment10, clientPreferences17);
    crystal.model.DataSource dataSource25 = projectPreferences24.getEnvironment();
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
    crystal.model.DataSource dataSource51 = projectPreferences50.getEnvironment();
    javax.swing.ImageIcon imageIcon54 = null;
    java.awt.Image image55 = null;
    crystal.model.Relationship relationship56 = new crystal.model.Relationship("AHEAD", imageIcon54, image55);
    javax.swing.ImageIcon imageIcon59 = null;
    java.awt.Image image60 = null;
    crystal.model.Relationship relationship61 = new crystal.model.Relationship("AHEAD", imageIcon59, image60);
    relationship56.calculateAction("AHEAD", relationship61);
    crystal.model.DataSource.RepoKind repoKind69 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment72 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind69, false, "hi!");
    crystal.model.Environment environment75 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind69, true, "PENDING");
    crystal.model.DataSource dataSource78 = new crystal.model.DataSource("ToolTipUI", "415725 hours 21 min", repoKind69, true, "415725 hours 21 min");
    java.lang.String str79 = relationship61.getAction(repoKind69);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.lang.String str80 = crystal.server.AbstractStateChecker.getRelationship(projectPreferences24, dataSource51, ",", repoKind69);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test51"); }

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
    java.lang.Object obj26 = null;
    boolean b27 = revisionHistory25.equals(obj26);
    javax.swing.ImageIcon imageIcon30 = null;
    java.awt.Image image31 = null;
    crystal.model.Relationship relationship32 = new crystal.model.Relationship("AHEAD", imageIcon30, image31);
    javax.swing.ImageIcon imageIcon35 = null;
    java.awt.Image image36 = null;
    crystal.model.Relationship relationship37 = new crystal.model.Relationship("AHEAD", imageIcon35, image36);
    relationship32.calculateAction("AHEAD", relationship37);
    crystal.model.RevisionHistory.Capable capable39 = crystal.model.RevisionHistory.Capable.MUST;
    relationship37.setCapable(capable39);
    crystal.model.DataSource.RepoKind repoKind45 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment48 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind45, false, "hi!");
    crystal.model.Environment environment51 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind45, true, "PENDING");
    java.lang.String str52 = relationship37.getAction(repoKind45);
    crystal.model.RevisionHistory revisionHistory53 = new crystal.model.RevisionHistory("ERROR", repoKind45);
    javax.swing.ImageIcon imageIcon56 = null;
    java.awt.Image image57 = null;
    crystal.model.Relationship relationship58 = new crystal.model.Relationship("AHEAD", imageIcon56, image57);
    javax.swing.ImageIcon imageIcon61 = null;
    java.awt.Image image62 = null;
    crystal.model.Relationship relationship63 = new crystal.model.Relationship("AHEAD", imageIcon61, image62);
    relationship58.calculateAction("AHEAD", relationship63);
    crystal.model.RevisionHistory.Capable capable65 = crystal.model.RevisionHistory.Capable.MUST;
    relationship63.setCapable(capable65);
    crystal.model.DataSource.RepoKind repoKind71 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment74 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind71, false, "hi!");
    crystal.model.Environment environment77 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind71, true, "PENDING");
    java.lang.String str78 = relationship63.getAction(repoKind71);
    crystal.model.RevisionHistory revisionHistory79 = new crystal.model.RevisionHistory("ERROR", repoKind71);
    java.lang.String str80 = revisionHistory79.toString();
    javax.swing.ImageIcon imageIcon82 = null;
    java.awt.Image image83 = null;
    crystal.model.Relationship relationship84 = new crystal.model.Relationship("AHEAD", imageIcon82, image83);
    javax.swing.ImageIcon imageIcon87 = null;
    java.awt.Image image88 = null;
    crystal.model.Relationship relationship89 = new crystal.model.Relationship("AHEAD", imageIcon87, image88);
    relationship84.calculateAction("AHEAD", relationship89);
    java.lang.String str91 = relationship84.getToolTipText();
    boolean b93 = relationship84.equals((java.lang.Object)(byte)0);
    crystal.model.RevisionHistory.Capable capable95 = revisionHistory25.getCapable(revisionHistory53, revisionHistory79, relationship84, false);
    
    // Checks the contract:  equals-hashcode on environment74 and environment20
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on environment74 and environment20", environment74.equals(environment20) ? environment74.hashCode() == environment20.hashCode() : true);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test52"); }

    crystal.client.ConflictClient conflictClient0 = new crystal.client.ConflictClient();
    crystal.client.ClientPreferences clientPreferences5 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences6 = null;
    clientPreferences5.addProjectPreferences(projectPreferences6);
    crystal.client.ProjectPreferences projectPreferences8 = null;
    clientPreferences5.removeProjectPreferences(projectPreferences8);
    crystal.client.ClientPreferences clientPreferences10 = clientPreferences5.clone();
    conflictClient0.createAndShowGUI(clientPreferences5);
    conflictClient0.update();
    
    // Checks the contract:  equals-hashcode on clientPreferences10 and clientPreferences5
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on clientPreferences10 and clientPreferences5", clientPreferences10.equals(clientPreferences5) ? clientPreferences10.hashCode() == clientPreferences5.hashCode() : true);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test53"); }

    crystal.client.ConflictDaemon conflictDaemon0 = crystal.client.ConflictDaemon.getInstance();
    java.util.Collection<crystal.model.LocalStateResult> collection_localStateResult1 = conflictDaemon0.getLocalStates();
    conflictDaemon0.removeAllListeners();
    crystal.client.ConflictClient conflictClient3 = new crystal.client.ConflictClient();
    crystal.client.ClientPreferences clientPreferences8 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences9 = null;
    clientPreferences8.addProjectPreferences(projectPreferences9);
    crystal.client.ProjectPreferences projectPreferences11 = null;
    clientPreferences8.removeProjectPreferences(projectPreferences11);
    crystal.client.ClientPreferences clientPreferences13 = clientPreferences8.clone();
    conflictClient3.createAndShowGUI(clientPreferences8);
    conflictDaemon0.addListener((crystal.client.ConflictDaemon.ComputationListener)conflictClient3);
    
    // Checks the contract:  equals-hashcode on clientPreferences8 and clientPreferences13
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on clientPreferences8 and clientPreferences13", clientPreferences8.equals(clientPreferences13) ? clientPreferences8.hashCode() == clientPreferences13.hashCode() : true);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test54"); }

    crystal.model.DataSource.RepoKind repoKind6 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment9 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind6, false, "hi!");
    crystal.model.Environment environment12 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind6, true, "PENDING");
    crystal.model.DataSource dataSource15 = new crystal.model.DataSource("ToolTipUI", "415725 hours 21 min", repoKind6, true, "415725 hours 21 min");
    crystal.model.DataSource dataSource16 = dataSource15.clone();
    crystal.model.DataSource dataSource17 = dataSource16.clone();
    dataSource17.setCompileCommand("AHEAD");
    
    // Checks the contract:  equals-hashcode on dataSource15 and dataSource16
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on dataSource15 and dataSource16", dataSource15.equals(dataSource16) ? dataSource15.hashCode() == dataSource16.hashCode() : true);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test55"); }

    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    boolean b3 = crystal.server.GitStateChecker.isGitRepository("415725 hours 21 min", "ToolTipUI_HG_415725 hours 21 min", "32 ms");

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test56"); }

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
    javax.swing.ImageIcon imageIcon73 = null;
    java.awt.Image image74 = null;
    crystal.model.Relationship relationship75 = new crystal.model.Relationship("AHEAD", imageIcon73, image74);
    javax.swing.ImageIcon imageIcon78 = null;
    java.awt.Image image79 = null;
    crystal.model.Relationship relationship80 = new crystal.model.Relationship("AHEAD", imageIcon78, image79);
    relationship75.calculateAction("AHEAD", relationship80);
    crystal.model.RevisionHistory.Capable capable82 = crystal.model.RevisionHistory.Capable.MUST;
    relationship80.setCapable(capable82);
    crystal.model.DataSource.RepoKind repoKind88 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment91 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind88, false, "hi!");
    crystal.model.Environment environment94 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind88, true, "PENDING");
    java.lang.String str95 = relationship80.getAction(repoKind88);
    crystal.model.RevisionHistory revisionHistory96 = new crystal.model.RevisionHistory("ERROR", repoKind88);
    java.lang.String str97 = revisionHistory96.toString();
    environment5.setHistory(revisionHistory96);
    int i99 = revisionHistory96.size();
    
    // Checks the contract:  equals-hashcode on environment91 and environment5
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on environment91 and environment5", environment91.equals(environment5) ? environment91.hashCode() == environment5.hashCode() : true);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test57"); }

    crystal.model.DataSource.RepoKind repoKind2 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    crystal.model.DataSource dataSource5 = new crystal.model.DataSource("cannot compute hg action", "$HOME", repoKind2, false, "PENDING");

  }

}
