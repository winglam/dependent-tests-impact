
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test001"); }

    crystal.util.XMLTools.STANDARD_DATE_FORMAT = "PENDING";

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    jMultiLineToolTip0.firePropertyChange("hi!", ' ', '#');
    java.awt.Dimension dimension6 = jMultiLineToolTip0.getMaximumSize();
    int i7 = jMultiLineToolTip0.getY();
    crystal.util.JMultiLineToolTip jMultiLineToolTip8 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle9 = null;
    java.awt.Rectangle rectangle10 = jMultiLineToolTip8.getBounds(rectangle9);
    java.awt.Event event11 = null;
    boolean b13 = jMultiLineToolTip8.action(event11, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel14 = jMultiLineToolTip8.getColorModel();
    java.awt.ComponentOrientation componentOrientation15 = jMultiLineToolTip8.getComponentOrientation();
    jMultiLineToolTip0.applyComponentOrientation(componentOrientation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentOrientation15);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }

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
    crystal.util.JMultiLineToolTip jMultiLineToolTip17 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle18 = null;
    java.awt.Rectangle rectangle19 = jMultiLineToolTip17.getBounds(rectangle18);
    java.awt.Rectangle rectangle20 = jMultiLineToolTip17.getVisibleRect();
    boolean b21 = jMultiLineToolTip17.isEnabled();
    java.awt.Event event22 = null;
    boolean b25 = jMultiLineToolTip17.mouseEnter(event22, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener26 = null;
    jMultiLineToolTip17.addPropertyChangeListener(propertyChangeListener26);
    java.awt.Point point28 = jMultiLineToolTip17.getLocation();
    jMultiLineToolTip17.setDoubleBuffered(true);
    java.awt.Graphics graphics31 = null;
    jMultiLineToolTip17.print(graphics31);
    jMultiLineToolTip0.setComponentZOrder((java.awt.Component)jMultiLineToolTip17, 0);
    jMultiLineToolTip0.revalidate();
    boolean b36 = jMultiLineToolTip0.isForegroundSet();
    jMultiLineToolTip0.enableInputMethods(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }

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
    crystal.util.JMultiLineToolTip jMultiLineToolTip24 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle25 = null;
    java.awt.Rectangle rectangle26 = jMultiLineToolTip24.getBounds(rectangle25);
    java.awt.Rectangle rectangle27 = jMultiLineToolTip24.getVisibleRect();
    boolean b28 = jMultiLineToolTip24.isEnabled();
    java.awt.Event event29 = null;
    boolean b32 = jMultiLineToolTip24.mouseEnter(event29, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener33 = null;
    jMultiLineToolTip24.addPropertyChangeListener(propertyChangeListener33);
    java.awt.Point point35 = jMultiLineToolTip24.getLocation();
    jMultiLineToolTip24.setDoubleBuffered(true);
    java.awt.Graphics graphics38 = null;
    jMultiLineToolTip24.print(graphics38);
    java.util.Set<java.awt.AWTKeyStroke> set_aWTKeyStroke41 = jMultiLineToolTip24.getFocusTraversalKeys((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.setFocusTraversalKeys(7, set_aWTKeyStroke41);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    org.junit.Assert.assertNotNull(rectangle26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_aWTKeyStroke41);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }

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
    java.awt.Rectangle rectangle13 = null;
    java.awt.Rectangle rectangle14 = jMultiLineToolTip12.getBounds(rectangle13);
    java.awt.Toolkit toolkit15 = jMultiLineToolTip12.getToolkit();
    java.awt.Font font16 = null;
    jMultiLineToolTip12.setFont(font16);
    java.awt.Color color18 = jMultiLineToolTip12.getBackground();
    jMultiLineToolTip0.setForeground(color18);
    boolean b20 = jMultiLineToolTip0.isRequestFocusEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    jMultiLineToolTip0.firePropertyChange("hi!", ' ', '#');
    java.awt.Dimension dimension6 = jMultiLineToolTip0.getMaximumSize();
    int i7 = jMultiLineToolTip0.getY();
    java.awt.event.ContainerListener containerListener8 = null;
    jMultiLineToolTip0.addContainerListener(containerListener8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }

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
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Point point37 = jMultiLineToolTip0.getLocationOnScreen();
      org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
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
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences5 = null;
    clientPreferences4.addProjectPreferences(projectPreferences5);
    boolean b7 = clientPreferences4.hasChanged();
    long long8 = clientPreferences4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 32L);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.event.InputMethodListener inputMethodListener6 = null;
    jMultiLineToolTip0.removeInputMethodListener(inputMethodListener6);
    java.awt.Graphics graphics8 = null;
    jMultiLineToolTip0.print(graphics8);
    jMultiLineToolTip0.transferFocusBackward();
    java.awt.event.MouseWheelListener mouseWheelListener11 = null;
    jMultiLineToolTip0.addMouseWheelListener(mouseWheelListener11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }

    crystal.util.ValidInputChecker.checkValidStringInput("hi!");

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }

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
    boolean b25 = jMultiLineToolTip4.isFocusable();
    
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
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }

    javax.swing.ImageIcon imageIcon3 = null;
    java.awt.Image image4 = null;
    crystal.model.Relationship relationship5 = new crystal.model.Relationship("AHEAD", imageIcon3, image4);
    javax.swing.ImageIcon imageIcon8 = null;
    java.awt.Image image9 = null;
    crystal.model.Relationship relationship10 = new crystal.model.Relationship("AHEAD", imageIcon8, image9);
    relationship5.calculateAction("AHEAD", relationship10);
    crystal.model.RevisionHistory.Capable capable12 = crystal.model.RevisionHistory.Capable.MUST;
    relationship10.setCapable(capable12);
    crystal.model.DataSource.RepoKind repoKind18 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment21 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind18, false, "hi!");
    crystal.model.Environment environment24 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind18, true, "PENDING");
    java.lang.String str25 = relationship10.getAction(repoKind18);
    crystal.model.Environment environment28 = new crystal.model.Environment("AHEAD", "ToolTipUI", repoKind18, false, "AHEAD_HG_2017-06-04T14-21-48.265-0700");
    org.junit.Assert.assertTrue("'" + capable12 + "' != '" + crystal.model.RevisionHistory.Capable.MUST + "'", capable12.equals(crystal.model.RevisionHistory.Capable.MUST));
    org.junit.Assert.assertTrue("'" + repoKind18 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind18.equals(crystal.model.DataSource.RepoKind.HG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "cannot compute hg action"+ "'", str25.equals("cannot compute hg action"));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }

    crystal.model.DataSource.RepoKind repoKind2 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment5 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind2, false, "hi!");
    environment5.setParent("Action: hg merge");
    environment5.setCompileCommand("AHEAD");
    environment5.setRemoteCmd("");
    crystal.client.ClientPreferences clientPreferences12 = null;
    crystal.client.ProjectPreferences projectPreferences13 = new crystal.client.ProjectPreferences((crystal.model.DataSource)environment5, clientPreferences12);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = crystal.server.GitStateChecker.getLocalState(projectPreferences13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + repoKind2 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind2.equals(crystal.model.DataSource.RepoKind.HG));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }

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
    java.awt.Graphics graphics14 = null;
    jMultiLineToolTip0.print(graphics14);
    java.awt.FocusTraversalPolicy focusTraversalPolicy16 = null;
    jMultiLineToolTip0.setFocusTraversalPolicy(focusTraversalPolicy16);
    javax.swing.event.AncestorListener ancestorListener18 = null;
    jMultiLineToolTip0.addAncestorListener(ancestorListener18);
    
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
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    jMultiLineToolTip0.firePropertyChange("AHEAD", 0, 128);
    jMultiLineToolTip0.setBounds((int)(byte)1, (int)(byte)100, 0, (-1));
    jMultiLineToolTip0.setDoubleBuffered(false);
    javax.swing.border.Border border14 = jMultiLineToolTip0.getBorder();
    javax.accessibility.AccessibleContext accessibleContext15 = jMultiLineToolTip0.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(border14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext15);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }

    crystal.model.Relationship.SAME = "PENDING";

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }

    crystal.model.DataSource.RepoKind repoKind2 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment5 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind2, false, "hi!");
    environment5.setShortName("PENDING");
    environment5.setCompileCommand("415725 hours 21 min");
    org.junit.Assert.assertTrue("'" + repoKind2 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind2.equals(crystal.model.DataSource.RepoKind.HG));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    jMultiLineToolTip0.setSize((int)' ', (-1));
    java.awt.GraphicsConfiguration graphicsConfiguration5 = jMultiLineToolTip0.getGraphicsConfiguration();
    jMultiLineToolTip0.setVerifyInputWhenFocusTarget(true);
    java.awt.Point point8 = jMultiLineToolTip0.getMousePosition();
    java.lang.String str9 = jMultiLineToolTip0.getTipText();
    java.awt.Insets insets10 = jMultiLineToolTip0.insets();
    java.awt.Cursor cursor11 = null;
    jMultiLineToolTip0.setCursor(cursor11);
    
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

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    javax.swing.JToolTip jToolTip2 = jMultiLineToolTip0.createToolTip();
    jToolTip2.firePropertyChange("SAME", 'a', '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jToolTip2);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }

    crystal.model.Relationship.BEHIND = "$HOME";

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener8 = null;
    jMultiLineToolTip0.removePropertyChangeListener("415725 hours 21 min", propertyChangeListener8);
    java.awt.event.FocusListener focusListener10 = null;
    jMultiLineToolTip0.addFocusListener(focusListener10);
    java.awt.event.ComponentListener componentListener12 = null;
    jMultiLineToolTip0.addComponentListener(componentListener12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager7 = null;
    jMultiLineToolTip0.setLayout(layoutManager7);
    java.awt.event.InputMethodListener inputMethodListener9 = null;
    jMultiLineToolTip0.removeInputMethodListener(inputMethodListener9);
    java.awt.event.FocusListener[] focusListener_array11 = jMultiLineToolTip0.getFocusListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array11);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    jMultiLineToolTip0.firePropertyChange("AHEAD", 0, 128);
    float f7 = jMultiLineToolTip0.getAlignmentY();
    java.awt.event.MouseListener mouseListener8 = null;
    jMultiLineToolTip0.addMouseListener(mouseListener8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 0.5f);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }

    crystal.client.ProjectPreferences projectPreferences0 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener1 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener2 = null;
    crystal.client.CalculateProjectTask calculateProjectTask3 = new crystal.client.CalculateProjectTask(projectPreferences0, computationListener1, computationListener2);
    java.beans.PropertyChangeSupport propertyChangeSupport4 = calculateProjectTask3.getPropertyChangeSupport();
    boolean b5 = calculateProjectTask3.isDone();
    java.beans.PropertyChangeListener propertyChangeListener6 = null;
    calculateProjectTask3.removePropertyChangeListener(propertyChangeListener6);
    calculateProjectTask3.run();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeSupport4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    jMultiLineToolTip0.firePropertyChange("hi!", ' ', '#');
    java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = jMultiLineToolTip0.getBaselineResizeBehavior();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }

    crystal.client.ConflictClient conflictClient0 = new crystal.client.ConflictClient();
    crystal.client.ClientPreferences clientPreferences5 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences6 = null;
    clientPreferences5.addProjectPreferences(projectPreferences6);
    crystal.client.ProjectPreferences projectPreferences8 = null;
    clientPreferences5.removeProjectPreferences(projectPreferences8);
    crystal.client.ClientPreferences clientPreferences10 = clientPreferences5.clone();
    conflictClient0.createAndShowGUI(clientPreferences5);
    java.util.Collection<crystal.client.ProjectPreferences> collection_projectPreferences12 = clientPreferences5.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clientPreferences10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_projectPreferences12);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    jMultiLineToolTip0.firePropertyChange("hi!", ' ', '#');
    jMultiLineToolTip0.setRequestFocusEnabled(false);
    crystal.util.JMultiLineToolTip jMultiLineToolTip8 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle9 = null;
    java.awt.Rectangle rectangle10 = jMultiLineToolTip8.getBounds(rectangle9);
    java.awt.Toolkit toolkit11 = jMultiLineToolTip8.getToolkit();
    jMultiLineToolTip8.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager15 = null;
    jMultiLineToolTip8.setLayout(layoutManager15);
    boolean b17 = jMultiLineToolTip8.isFocusOwner();
    boolean b18 = jMultiLineToolTip8.isShowing();
    jMultiLineToolTip8.transferFocusUpCycle();
    crystal.util.JMultiLineToolTip jMultiLineToolTip20 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle21 = null;
    java.awt.Rectangle rectangle22 = jMultiLineToolTip20.getBounds(rectangle21);
    java.awt.Toolkit toolkit23 = jMultiLineToolTip20.getToolkit();
    java.awt.Font font24 = null;
    jMultiLineToolTip20.setFont(font24);
    java.awt.Color color26 = jMultiLineToolTip20.getBackground();
    jMultiLineToolTip8.setForeground(color26);
    java.awt.ComponentOrientation componentOrientation28 = jMultiLineToolTip8.getComponentOrientation();
    jMultiLineToolTip0.applyComponentOrientation(componentOrientation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentOrientation28);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    crystal.util.JMultiLineToolTip jMultiLineToolTip3 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle4 = null;
    java.awt.Rectangle rectangle5 = jMultiLineToolTip3.getBounds(rectangle4);
    jMultiLineToolTip0.repaint(rectangle5);
    java.util.Locale locale7 = jMultiLineToolTip0.getLocale();
    javax.swing.plaf.ToolTipUI toolTipUI8 = jMultiLineToolTip0.getUI();
    jMultiLineToolTip0.repaint(0L, (int)(short)-1, (int)(byte)100, (int)'4', (int)'a');
    jMultiLineToolTip0.setTipText("TESTCONFLICT");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolTipUI8);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    jMultiLineToolTip0.firePropertyChange("AHEAD", 0, 128);
    java.awt.Event event7 = null;
    boolean b10 = jMultiLineToolTip0.mouseExit(event7, 1, (int)(short)1);
    java.awt.event.MouseEvent mouseEvent11 = null;
    java.awt.Point point12 = jMultiLineToolTip0.getToolTipLocation(mouseEvent11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point12);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Insets insets3 = jMultiLineToolTip0.getInsets();
    boolean b4 = jMultiLineToolTip0.isValidateRoot();
    java.awt.Dimension dimension5 = jMultiLineToolTip0.minimumSize();
    jMultiLineToolTip0.setFocusable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension5);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ClientPreferences clientPreferences5 = clientPreferences4.clone();
    boolean b6 = clientPreferences4.hasChanged();
    clientPreferences4.setHgPath("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clientPreferences5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.util.JMultiLineToolTip jMultiLineToolTip5 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle6 = null;
    java.awt.Rectangle rectangle7 = jMultiLineToolTip5.getBounds(rectangle6);
    java.awt.Rectangle rectangle8 = jMultiLineToolTip5.getVisibleRect();
    boolean b9 = jMultiLineToolTip5.isEnabled();
    java.beans.VetoableChangeListener[] vetoableChangeListener_array10 = jMultiLineToolTip5.getVetoableChangeListeners();
    boolean b11 = clientPreferences4.equals((java.lang.Object)vetoableChangeListener_array10);
    clientPreferences4.setTempDirectory("415725 hours 21 min");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(clientPreferences4);
    
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

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }

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
    java.awt.Rectangle rectangle13 = null;
    java.awt.Rectangle rectangle14 = jMultiLineToolTip12.getBounds(rectangle13);
    java.awt.Toolkit toolkit15 = jMultiLineToolTip12.getToolkit();
    java.awt.Font font16 = null;
    jMultiLineToolTip12.setFont(font16);
    java.awt.Color color18 = jMultiLineToolTip12.getBackground();
    jMultiLineToolTip0.setForeground(color18);
    boolean b20 = jMultiLineToolTip0.getVerifyInputWhenFocusTarget();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    jMultiLineToolTip0.firePropertyChange("AHEAD", 0, 128);
    jMultiLineToolTip0.setBounds((int)(byte)1, (int)(byte)100, 0, (-1));
    jMultiLineToolTip0.setDoubleBuffered(false);
    javax.swing.border.Border border14 = jMultiLineToolTip0.getBorder();
    boolean b15 = jMultiLineToolTip0.isForegroundSet();
    boolean b16 = jMultiLineToolTip0.isVisible();
    java.awt.event.MouseListener mouseListener17 = null;
    jMultiLineToolTip0.removeMouseListener(mouseListener17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(border14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }

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
    java.awt.event.ContainerListener containerListener35 = null;
    jMultiLineToolTip0.addContainerListener(containerListener35);
    
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

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }

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
    boolean b16 = jMultiLineToolTip0.isPaintingForPrint();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener17 = null;
    jMultiLineToolTip0.addHierarchyBoundsListener(hierarchyBoundsListener17);
    java.beans.PropertyChangeListener[] propertyChangeListener_array20 = jMultiLineToolTip0.getPropertyChangeListeners("cannot compute hg action");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array20);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Insets insets3 = jMultiLineToolTip0.getInsets();
    boolean b4 = jMultiLineToolTip0.isValidateRoot();
    java.awt.Point point5 = jMultiLineToolTip0.getLocation();
    java.awt.FocusTraversalPolicy focusTraversalPolicy6 = jMultiLineToolTip0.getFocusTraversalPolicy();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(focusTraversalPolicy6);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    jMultiLineToolTip0.firePropertyChange("AHEAD", 0, 128);
    jMultiLineToolTip0.paintImmediately(3, (int)(byte)10, 100, (int)(short)0);
    jMultiLineToolTip0.enable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }

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
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener25 = null;
    jMultiLineToolTip13.addHierarchyBoundsListener(hierarchyBoundsListener25);
    int i27 = jMultiLineToolTip13.getY();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color1 = null;
    jMultiLineToolTip0.setBackground(color1);
    jMultiLineToolTip0.transferFocusBackward();
    jMultiLineToolTip0.firePropertyChange("$HOME", false, false);
    jMultiLineToolTip0.setToolTipText(",");

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }

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
    java.lang.String str32 = jMultiLineToolTip0.getToolTipText();
    java.awt.event.InputMethodListener inputMethodListener33 = null;
    jMultiLineToolTip0.addInputMethodListener(inputMethodListener33);
    crystal.util.JMultiLineToolTip jMultiLineToolTip35 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle36 = null;
    java.awt.Rectangle rectangle37 = jMultiLineToolTip35.getBounds(rectangle36);
    java.awt.Rectangle rectangle38 = jMultiLineToolTip35.getVisibleRect();
    boolean b39 = jMultiLineToolTip35.isEnabled();
    java.awt.Dimension dimension40 = null;
    jMultiLineToolTip35.setPreferredSize(dimension40);
    crystal.util.JMultiLineToolTip jMultiLineToolTip42 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle43 = null;
    java.awt.Rectangle rectangle44 = jMultiLineToolTip42.getBounds(rectangle43);
    java.awt.Event event45 = null;
    boolean b47 = jMultiLineToolTip42.action(event45, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel48 = jMultiLineToolTip42.getColorModel();
    boolean b49 = jMultiLineToolTip35.isAncestorOf((java.awt.Component)jMultiLineToolTip42);
    boolean b50 = jMultiLineToolTip35.isFontSet();
    javax.swing.ActionMap actionMap51 = null;
    jMultiLineToolTip35.setActionMap(actionMap51);
    crystal.util.JMultiLineToolTip jMultiLineToolTip53 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle54 = null;
    java.awt.Rectangle rectangle55 = jMultiLineToolTip53.getBounds(rectangle54);
    java.awt.Rectangle rectangle56 = jMultiLineToolTip53.getVisibleRect();
    boolean b57 = jMultiLineToolTip53.isEnabled();
    java.awt.Dimension dimension58 = null;
    jMultiLineToolTip53.setPreferredSize(dimension58);
    crystal.util.JMultiLineToolTip jMultiLineToolTip60 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle61 = null;
    java.awt.Rectangle rectangle62 = jMultiLineToolTip60.getBounds(rectangle61);
    java.awt.Event event63 = null;
    boolean b65 = jMultiLineToolTip60.action(event63, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel66 = jMultiLineToolTip60.getColorModel();
    boolean b67 = jMultiLineToolTip53.isAncestorOf((java.awt.Component)jMultiLineToolTip60);
    jMultiLineToolTip53.disable();
    crystal.util.JMultiLineToolTip jMultiLineToolTip69 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle70 = null;
    java.awt.Rectangle rectangle71 = jMultiLineToolTip69.getBounds(rectangle70);
    java.awt.Rectangle rectangle72 = jMultiLineToolTip69.getVisibleRect();
    boolean b73 = jMultiLineToolTip69.isEnabled();
    java.awt.Event event74 = null;
    boolean b77 = jMultiLineToolTip69.mouseEnter(event74, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener78 = null;
    jMultiLineToolTip69.addPropertyChangeListener(propertyChangeListener78);
    java.awt.Point point80 = jMultiLineToolTip69.getLocation();
    java.awt.Point point81 = jMultiLineToolTip53.getLocation(point80);
    java.awt.Point point82 = jMultiLineToolTip35.getLocation(point80);
    boolean b83 = jMultiLineToolTip0.contains(point80);
    javax.swing.KeyStroke[] keyStroke_array84 = jMultiLineToolTip0.getRegisteredKeyStrokes();
    
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
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(keyStroke_array84);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }

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
    javax.swing.InputVerifier inputVerifier12 = null;
    jMultiLineToolTip0.setInputVerifier(inputVerifier12);
    jMultiLineToolTip0.requestFocus();
    java.awt.event.InputMethodListener inputMethodListener15 = null;
    jMultiLineToolTip0.addInputMethodListener(inputMethodListener15);
    
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
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }

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
    javax.swing.InputVerifier inputVerifier12 = null;
    jMultiLineToolTip0.setInputVerifier(inputVerifier12);
    java.beans.PropertyChangeListener propertyChangeListener15 = null;
    jMultiLineToolTip0.addPropertyChangeListener("", propertyChangeListener15);
    javax.swing.KeyStroke[] keyStroke_array17 = jMultiLineToolTip0.getRegisteredKeyStrokes();
    
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
    org.junit.Assert.assertNotNull(keyStroke_array17);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }

    crystal.model.DataSource.RepoKind repoKind4 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment7 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind4, false, "hi!");
    crystal.model.Environment environment10 = new crystal.model.Environment("Action: hg merge", "2017-06-04T14-21-48.265-0700", repoKind4, true, "Action: hg merge");
    environment10.setShortName("$HOME");
    org.junit.Assert.assertTrue("'" + repoKind4 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind4.equals(crystal.model.DataSource.RepoKind.HG));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }

    javax.swing.ImageIcon imageIcon1 = null;
    java.awt.Image image2 = null;
    crystal.model.Relationship relationship3 = new crystal.model.Relationship("AHEAD", imageIcon1, image2);
    javax.swing.ImageIcon imageIcon6 = null;
    java.awt.Image image7 = null;
    crystal.model.Relationship relationship8 = new crystal.model.Relationship("AHEAD", imageIcon6, image7);
    relationship3.calculateAction("AHEAD", relationship8);
    javax.swing.ImageIcon imageIcon10 = relationship8.getIcon();
    crystal.model.Relationship[] relationship_array11 = new crystal.model.Relationship[] { relationship8 };
    java.util.ArrayList<crystal.model.Relationship> arraylist_relationship12 = new java.util.ArrayList<crystal.model.Relationship>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<crystal.model.Relationship>)arraylist_relationship12, relationship_array11);
    java.awt.Image image14 = crystal.model.Relationship.getDominant((java.util.Collection<crystal.model.Relationship>)arraylist_relationship12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(imageIcon10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(relationship_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image14);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }

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
    java.awt.Insets insets12 = jMultiLineToolTip0.getInsets();
    int i13 = jMultiLineToolTip0.getY();
    
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
    org.junit.Assert.assertNotNull(insets12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setName("hi!");
    java.awt.im.InputContext inputContext6 = jMultiLineToolTip0.getInputContext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputContext6);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }

    javax.swing.JFrame.setDefaultLookAndFeelDecorated(false);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.event.InputMethodListener inputMethodListener7 = null;
    jMultiLineToolTip0.addInputMethodListener(inputMethodListener7);
    boolean b9 = jMultiLineToolTip0.isPaintingForPrint();
    int i10 = jMultiLineToolTip0.getWidth();
    jMultiLineToolTip0.setSize(64, 7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }

    crystal.model.LocalStateResult.HG_MUST_RESOLVE = "0 ms";

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }

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
    java.awt.event.InputMethodListener inputMethodListener21 = null;
    jMultiLineToolTip15.removeInputMethodListener(inputMethodListener21);
    jMultiLineToolTip15.invalidate();
    java.awt.Event event24 = null;
    crystal.util.JMultiLineToolTip jMultiLineToolTip25 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle26 = null;
    java.awt.Rectangle rectangle27 = jMultiLineToolTip25.getBounds(rectangle26);
    java.awt.Toolkit toolkit28 = jMultiLineToolTip25.getToolkit();
    jMultiLineToolTip25.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager32 = null;
    jMultiLineToolTip25.setLayout(layoutManager32);
    boolean b34 = jMultiLineToolTip25.isFocusOwner();
    boolean b35 = jMultiLineToolTip25.isShowing();
    java.awt.Graphics graphics36 = null;
    jMultiLineToolTip25.update(graphics36);
    boolean b38 = jMultiLineToolTip15.action(event24, (java.lang.Object)graphics36);
    java.awt.Rectangle rectangle39 = jMultiLineToolTip15.getVisibleRect();
    jMultiLineToolTip0.putClientProperty((java.lang.Object)rectangle39, (java.lang.Object)true);
    java.awt.Graphics graphics42 = null;
    jMultiLineToolTip0.printAll(graphics42);
    
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
    org.junit.Assert.assertNotNull(rectangle27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle39);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.ComponentOrientation componentOrientation7 = jMultiLineToolTip0.getComponentOrientation();
    java.awt.event.ComponentListener componentListener8 = null;
    jMultiLineToolTip0.removeComponentListener(componentListener8);
    java.awt.Event event10 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = jMultiLineToolTip0.handleEvent(event10);
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
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }

    javax.swing.ImageIcon imageIcon2 = null;
    java.awt.Image image3 = null;
    crystal.model.Relationship relationship4 = new crystal.model.Relationship("AHEAD", imageIcon2, image3);
    javax.swing.ImageIcon imageIcon7 = null;
    java.awt.Image image8 = null;
    crystal.model.Relationship relationship9 = new crystal.model.Relationship("AHEAD", imageIcon7, image8);
    relationship4.calculateAction("AHEAD", relationship9);
    crystal.model.RevisionHistory.When when11 = crystal.model.RevisionHistory.When.LATER;
    relationship4.setWhen(when11);
    javax.swing.ImageIcon imageIcon13 = relationship4.getIcon();
    javax.swing.ImageIcon imageIcon15 = null;
    java.awt.Image image16 = null;
    crystal.model.Relationship relationship17 = new crystal.model.Relationship("AHEAD", imageIcon15, image16);
    crystal.util.JMultiLineToolTip jMultiLineToolTip18 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle19 = null;
    java.awt.Rectangle rectangle20 = jMultiLineToolTip18.getBounds(rectangle19);
    java.awt.Rectangle rectangle21 = jMultiLineToolTip18.getVisibleRect();
    boolean b22 = jMultiLineToolTip18.isEnabled();
    java.awt.Event event23 = null;
    boolean b26 = jMultiLineToolTip18.mouseEnter(event23, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener27 = null;
    jMultiLineToolTip18.addPropertyChangeListener(propertyChangeListener27);
    java.awt.Point point29 = jMultiLineToolTip18.getLocation();
    boolean b30 = relationship17.equals((java.lang.Object)jMultiLineToolTip18);
    java.awt.Image image31 = relationship17.getImage();
    // The following exception was thrown during execution in test generation
    try {
    crystal.model.Relationship relationship32 = new crystal.model.Relationship("", imageIcon13, image31);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + when11 + "' != '" + crystal.model.RevisionHistory.When.LATER + "'", when11.equals(crystal.model.RevisionHistory.When.LATER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(imageIcon13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image31);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Insets insets3 = jMultiLineToolTip0.getInsets();
    java.awt.Event event4 = null;
    boolean b7 = jMultiLineToolTip0.mouseDown(event4, 11, (int)' ');
    boolean b8 = jMultiLineToolTip0.isFontSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }

    javax.swing.ImageIcon imageIcon1 = null;
    java.awt.Image image2 = null;
    crystal.model.Relationship relationship3 = new crystal.model.Relationship("AHEAD", imageIcon1, image2);
    javax.swing.ImageIcon imageIcon6 = null;
    java.awt.Image image7 = null;
    crystal.model.Relationship relationship8 = new crystal.model.Relationship("AHEAD", imageIcon6, image7);
    relationship3.calculateAction("AHEAD", relationship8);
    crystal.model.RevisionHistory.Capable capable10 = relationship8.getCapable();
    javax.swing.ImageIcon imageIcon12 = null;
    java.awt.Image image13 = null;
    crystal.model.Relationship relationship14 = new crystal.model.Relationship("AHEAD", imageIcon12, image13);
    javax.swing.ImageIcon imageIcon17 = null;
    java.awt.Image image18 = null;
    crystal.model.Relationship relationship19 = new crystal.model.Relationship("AHEAD", imageIcon17, image18);
    relationship14.calculateAction("AHEAD", relationship19);
    relationship8.setConsequences(relationship14);
    javax.swing.ImageIcon imageIcon23 = null;
    java.awt.Image image24 = null;
    crystal.model.Relationship relationship25 = new crystal.model.Relationship("AHEAD", imageIcon23, image24);
    javax.swing.ImageIcon imageIcon28 = null;
    java.awt.Image image29 = null;
    crystal.model.Relationship relationship30 = new crystal.model.Relationship("AHEAD", imageIcon28, image29);
    relationship25.calculateAction("AHEAD", relationship30);
    java.lang.String str32 = relationship25.getToolTipText();
    crystal.model.RevisionHistory.Capable capable33 = crystal.model.RevisionHistory.Capable.MIGHT;
    relationship25.setCapable(capable33);
    relationship8.setCapable(capable33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(capable10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Action: hg merge"+ "'", str32.equals("Action: hg merge"));
    org.junit.Assert.assertTrue("'" + capable33 + "' != '" + crystal.model.RevisionHistory.Capable.MIGHT + "'", capable33.equals(crystal.model.RevisionHistory.Capable.MIGHT));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }

    javax.swing.ImageIcon imageIcon1 = null;
    java.awt.Image image2 = null;
    crystal.model.Relationship relationship3 = new crystal.model.Relationship("AHEAD", imageIcon1, image2);
    javax.swing.ImageIcon imageIcon6 = null;
    java.awt.Image image7 = null;
    crystal.model.Relationship relationship8 = new crystal.model.Relationship("AHEAD", imageIcon6, image7);
    relationship3.calculateAction("AHEAD", relationship8);
    java.lang.String str10 = relationship3.getToolTipText();
    relationship3.setReady();
    javax.swing.ImageIcon imageIcon13 = null;
    java.awt.Image image14 = null;
    crystal.model.Relationship relationship15 = new crystal.model.Relationship("AHEAD", imageIcon13, image14);
    javax.swing.ImageIcon imageIcon18 = null;
    java.awt.Image image19 = null;
    crystal.model.Relationship relationship20 = new crystal.model.Relationship("AHEAD", imageIcon18, image19);
    relationship15.calculateAction("AHEAD", relationship20);
    java.lang.String str22 = relationship15.getToolTipText();
    java.lang.String str23 = relationship15.getToolTipText();
    javax.swing.ImageIcon imageIcon26 = null;
    java.awt.Image image27 = null;
    crystal.model.Relationship relationship28 = new crystal.model.Relationship("AHEAD", imageIcon26, image27);
    javax.swing.ImageIcon imageIcon31 = null;
    java.awt.Image image32 = null;
    crystal.model.Relationship relationship33 = new crystal.model.Relationship("AHEAD", imageIcon31, image32);
    relationship28.calculateAction("AHEAD", relationship33);
    crystal.model.RevisionHistory.Capable capable35 = crystal.model.RevisionHistory.Capable.MUST;
    relationship33.setCapable(capable35);
    relationship15.calculateAction("TESTCONFLICT", relationship33);
    boolean b38 = relationship3.equals((java.lang.Object)relationship15);
    crystal.model.RevisionHistory.Capable capable39 = relationship15.getCapable();
    relationship15.setReady();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Action: hg merge"+ "'", str10.equals("Action: hg merge"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Action: hg merge"+ "'", str22.equals("Action: hg merge"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Action: hg merge"+ "'", str23.equals("Action: hg merge"));
    org.junit.Assert.assertTrue("'" + capable35 + "' != '" + crystal.model.RevisionHistory.Capable.MUST + "'", capable35.equals(crystal.model.RevisionHistory.Capable.MUST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(capable39);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }

    crystal.client.ProjectPreferences projectPreferences0 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener1 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener2 = null;
    crystal.client.CalculateProjectTask calculateProjectTask3 = new crystal.client.CalculateProjectTask(projectPreferences0, computationListener1, computationListener2);
    java.beans.PropertyChangeSupport propertyChangeSupport4 = calculateProjectTask3.getPropertyChangeSupport();
    boolean b5 = calculateProjectTask3.isDone();
    boolean b6 = calculateProjectTask3.isDone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeSupport4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }

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
    java.awt.FocusTraversalPolicy focusTraversalPolicy11 = jMultiLineToolTip0.getFocusTraversalPolicy();
    float f12 = jMultiLineToolTip0.getAlignmentY();
    java.awt.event.MouseEvent mouseEvent13 = null;
    java.awt.Point point14 = jMultiLineToolTip0.getPopupLocation(mouseEvent13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(focusTraversalPolicy11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f12 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point14);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.beans.VetoableChangeListener[] vetoableChangeListener_array5 = jMultiLineToolTip0.getVetoableChangeListeners();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array6 = jMultiLineToolTip0.getMouseMotionListeners();
    java.awt.event.InputMethodListener inputMethodListener7 = null;
    jMultiLineToolTip0.addInputMethodListener(inputMethodListener7);
    jMultiLineToolTip0.setDoubleBuffered(false);
    java.awt.Event event11 = null;
    boolean b14 = jMultiLineToolTip0.mouseEnter(event11, 100, 8);
    
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
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }

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
    jMultiLineToolTip0.removeNotify();
    
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
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }

    crystal.model.DataSource.RepoKind repoKind4 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment7 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind4, false, "hi!");
    crystal.model.Environment environment10 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind4, true, "PENDING");
    environment10.setTestCommand("$HOME");
    org.junit.Assert.assertTrue("'" + repoKind4 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind4.equals(crystal.model.DataSource.RepoKind.HG));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }

    java.lang.String str1 = crystal.util.RunIt.getExecutable("ToolTipUI_HG_415725 hours 21 min");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }

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
    java.awt.event.MouseEvent mouseEvent18 = null;
    java.lang.String str19 = jMultiLineToolTip6.getToolTipText(mouseEvent18);
    
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
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.Font font4 = null;
    jMultiLineToolTip0.setFont(font4);
    crystal.util.JMultiLineToolTip jMultiLineToolTip6 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle7 = null;
    java.awt.Rectangle rectangle8 = jMultiLineToolTip6.getBounds(rectangle7);
    java.awt.Event event9 = null;
    boolean b12 = jMultiLineToolTip6.mouseDrag(event9, 32, 1);
    java.awt.Graphics graphics13 = null;
    jMultiLineToolTip6.printComponents(graphics13);
    java.awt.MenuComponent menuComponent15 = null;
    jMultiLineToolTip6.remove(menuComponent15);
    jMultiLineToolTip0.putClientProperty((java.lang.Object)jMultiLineToolTip6, (java.lang.Object)"ERROR");
    java.awt.Container container19 = jMultiLineToolTip6.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container19);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Dimension dimension5 = null;
    jMultiLineToolTip0.setPreferredSize(dimension5);
    jMultiLineToolTip0.show();
    java.lang.String str8 = jMultiLineToolTip0.getTipText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }

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
    float f38 = jMultiLineToolTip0.getAlignmentX();
    
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
    org.junit.Assert.assertTrue(f38 == 0.5f);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }

    org.jdom.Document document1 = crystal.util.XMLTools.newXMLErrorDocument("AHEAD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(document1);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }

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
    // The following exception was thrown during execution in test generation
    try {
    container34.setFocusTraversalKeysEnabled(false);
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

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }

    crystal.model.DataSource.RepoKind repoKind6 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment9 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind6, false, "hi!");
    crystal.model.Environment environment12 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind6, true, "PENDING");
    crystal.model.DataSource dataSource15 = new crystal.model.DataSource("ToolTipUI", "415725 hours 21 min", repoKind6, true, "415725 hours 21 min");
    crystal.model.DataSource dataSource16 = dataSource15.clone();
    dataSource15.setEnabled(true);
    org.junit.Assert.assertTrue("'" + repoKind6 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind6.equals(crystal.model.DataSource.RepoKind.HG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dataSource16);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    jMultiLineToolTip0.setSize((int)' ', (-1));
    java.awt.Graphics graphics5 = null;
    jMultiLineToolTip0.printAll(graphics5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    jMultiLineToolTip0.firePropertyChange("AHEAD", 0, 128);
    java.awt.Graphics graphics7 = null;
    jMultiLineToolTip0.printAll(graphics7);
    java.awt.event.InputMethodListener inputMethodListener9 = null;
    jMultiLineToolTip0.addInputMethodListener(inputMethodListener9);
    boolean b11 = jMultiLineToolTip0.requestFocusInWindow();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }

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
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener25 = null;
    jMultiLineToolTip13.addHierarchyBoundsListener(hierarchyBoundsListener25);
    jMultiLineToolTip13.setFocusTraversalKeysEnabled(false);
    
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
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    javax.swing.TransferHandler transferHandler3 = null;
    jMultiLineToolTip0.setTransferHandler(transferHandler3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Insets insets3 = jMultiLineToolTip0.getInsets();
    boolean b4 = jMultiLineToolTip0.isValidateRoot();
    boolean b5 = jMultiLineToolTip0.isForegroundSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    jMultiLineToolTip0.firePropertyChange("AHEAD", 0, 128);
    jMultiLineToolTip0.setBounds((int)(byte)1, (int)(byte)100, 0, (-1));
    jMultiLineToolTip0.setDoubleBuffered(false);
    javax.swing.border.Border border14 = jMultiLineToolTip0.getBorder();
    boolean b15 = jMultiLineToolTip0.isForegroundSet();
    java.lang.String str16 = jMultiLineToolTip0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(border14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }

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
    java.awt.Rectangle rectangle13 = null;
    java.awt.Rectangle rectangle14 = jMultiLineToolTip12.getBounds(rectangle13);
    java.awt.Toolkit toolkit15 = jMultiLineToolTip12.getToolkit();
    java.awt.Font font16 = null;
    jMultiLineToolTip12.setFont(font16);
    java.awt.Color color18 = jMultiLineToolTip12.getBackground();
    jMultiLineToolTip0.setForeground(color18);
    boolean b20 = jMultiLineToolTip0.isShowing();
    java.beans.PropertyChangeListener[] propertyChangeListener_array21 = jMultiLineToolTip0.getPropertyChangeListeners();
    jMultiLineToolTip0.firePropertyChange("SAME", (float)10, (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array21);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }

    crystal.client.ProjectPreferences projectPreferences0 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener1 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener2 = null;
    crystal.client.CalculateProjectTask calculateProjectTask3 = new crystal.client.CalculateProjectTask(projectPreferences0, computationListener1, computationListener2);
    java.beans.PropertyChangeSupport propertyChangeSupport4 = calculateProjectTask3.getPropertyChangeSupport();
    boolean b5 = calculateProjectTask3.isDone();
    javax.swing.SwingWorker.StateValue stateValue6 = calculateProjectTask3.getState();
    javax.swing.SwingWorker.StateValue stateValue7 = calculateProjectTask3.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeSupport4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    org.junit.Assert.assertTrue("'" + stateValue6 + "' != '" + javax.swing.SwingWorker.StateValue.PENDING + "'", stateValue6.equals(javax.swing.SwingWorker.StateValue.PENDING));
    org.junit.Assert.assertTrue("'" + stateValue7 + "' != '" + javax.swing.SwingWorker.StateValue.PENDING + "'", stateValue7.equals(javax.swing.SwingWorker.StateValue.PENDING));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }

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
    jMultiLineToolTip0.firePropertyChange("ERROR", 'a', '4');
    
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
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }

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
    java.awt.LayoutManager layoutManager12 = null;
    jMultiLineToolTip0.setLayout(layoutManager12);
    
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
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }

    crystal.model.DataSource.RepoKind repoKind6 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment9 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind6, false, "hi!");
    crystal.model.Environment environment12 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind6, true, "PENDING");
    crystal.model.DataSource dataSource15 = new crystal.model.DataSource("ToolTipUI", "415725 hours 21 min", repoKind6, true, "415725 hours 21 min");
    crystal.model.DataSource dataSource16 = dataSource15.clone();
    java.lang.String str17 = dataSource16.toString();
    dataSource16.setCompileCommand("SAME");
    org.junit.Assert.assertTrue("'" + repoKind6 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind6.equals(crystal.model.DataSource.RepoKind.HG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dataSource16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ToolTipUI_HG_415725 hours 21 min"+ "'", str17.equals("ToolTipUI_HG_415725 hours 21 min"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }

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
    crystal.util.JMultiLineToolTip jMultiLineToolTip28 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle29 = null;
    java.awt.Rectangle rectangle30 = jMultiLineToolTip28.getBounds(rectangle29);
    java.awt.Event event31 = null;
    boolean b33 = jMultiLineToolTip28.action(event31, (java.lang.Object)'4');
    crystal.util.JMultiLineToolTip jMultiLineToolTip34 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle35 = null;
    java.awt.Rectangle rectangle36 = jMultiLineToolTip34.getBounds(rectangle35);
    java.awt.Event event37 = null;
    boolean b39 = jMultiLineToolTip34.action(event37, (java.lang.Object)'4');
    jMultiLineToolTip28.setComponent((javax.swing.JComponent)jMultiLineToolTip34);
    crystal.util.JMultiLineToolTip jMultiLineToolTip41 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle42 = null;
    java.awt.Rectangle rectangle43 = jMultiLineToolTip41.getBounds(rectangle42);
    java.awt.Toolkit toolkit44 = jMultiLineToolTip41.getToolkit();
    jMultiLineToolTip41.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager48 = null;
    jMultiLineToolTip41.setLayout(layoutManager48);
    boolean b50 = jMultiLineToolTip41.isFocusOwner();
    boolean b51 = jMultiLineToolTip41.isShowing();
    java.awt.Graphics graphics52 = null;
    jMultiLineToolTip41.update(graphics52);
    java.awt.Component component54 = jMultiLineToolTip28.add((java.awt.Component)jMultiLineToolTip41);
    java.awt.Font font55 = null;
    jMultiLineToolTip41.setFont(font55);
    crystal.util.JMultiLineToolTip jMultiLineToolTip57 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle58 = null;
    java.awt.Rectangle rectangle59 = jMultiLineToolTip57.getBounds(rectangle58);
    java.awt.Rectangle rectangle60 = jMultiLineToolTip57.getVisibleRect();
    boolean b61 = jMultiLineToolTip57.isEnabled();
    java.awt.Event event62 = null;
    boolean b65 = jMultiLineToolTip57.mouseEnter(event62, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener66 = null;
    jMultiLineToolTip57.addPropertyChangeListener(propertyChangeListener66);
    java.awt.Point point68 = jMultiLineToolTip57.getLocation();
    jMultiLineToolTip41.setLocation(point68);
    java.awt.Component component70 = jMultiLineToolTip0.add("ERROR", (java.awt.Component)jMultiLineToolTip41);
    java.awt.event.ContainerListener containerListener71 = null;
    jMultiLineToolTip0.removeContainerListener(containerListener71);
    jMultiLineToolTip0.setInheritsPopupMenu(false);
    
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
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component70);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }

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
    boolean b16 = jMultiLineToolTip0.isMinimumSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }

    crystal.client.ConflictDaemon conflictDaemon0 = crystal.client.ConflictDaemon.getInstance();
    conflictDaemon0.enable(false);
    java.util.Collection<crystal.model.LocalStateResult> collection_localStateResult3 = conflictDaemon0.getLocalStates();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(conflictDaemon0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_localStateResult3);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener8 = null;
    jMultiLineToolTip0.removePropertyChangeListener("415725 hours 21 min", propertyChangeListener8);
    java.awt.ComponentOrientation componentOrientation10 = null;
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.applyComponentOrientation(componentOrientation10);
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
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }

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
    java.awt.Graphics graphics14 = null;
    jMultiLineToolTip0.print(graphics14);
    java.awt.FocusTraversalPolicy focusTraversalPolicy16 = null;
    jMultiLineToolTip0.setFocusTraversalPolicy(focusTraversalPolicy16);
    jMultiLineToolTip0.setTipText("");
    
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
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }

    java.util.Locale locale0 = javax.swing.JComponent.getDefaultLocale();
    javax.swing.JComponent.setDefaultLocale(locale0);
    javax.swing.JComponent.setDefaultLocale(locale0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale0);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Component component5 = jMultiLineToolTip0.getComponentAt(32, (int)'4');
    java.awt.event.ContainerListener[] containerListener_array6 = jMultiLineToolTip0.getContainerListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(containerListener_array6);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }

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
    javax.swing.InputMap inputMap15 = jMultiLineToolTip0.getInputMap(0);
    boolean b16 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    java.awt.image.ImageProducer imageProducer17 = null;
    java.awt.Image image18 = jMultiLineToolTip0.createImage(imageProducer17);
    
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
    org.junit.Assert.assertNotNull(inputMap15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image18);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }

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
    java.awt.ImageCapabilities imageCapabilities15 = null;
    java.awt.image.VolatileImage volatileImage16 = jMultiLineToolTip0.createVolatileImage((int)(byte)10, (int)(byte)100, imageCapabilities15);
    crystal.util.JMultiLineToolTip jMultiLineToolTip18 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle19 = null;
    java.awt.Rectangle rectangle20 = jMultiLineToolTip18.getBounds(rectangle19);
    jMultiLineToolTip18.firePropertyChange("AHEAD", 0, 128);
    jMultiLineToolTip18.setBounds((int)(byte)1, (int)(byte)100, 0, (-1));
    jMultiLineToolTip18.setDoubleBuffered(false);
    javax.swing.InputMap inputMap32 = jMultiLineToolTip18.getInputMap();
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.setInputMap(6, inputMap32);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(volatileImage16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap32);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.event.InputMethodListener inputMethodListener6 = null;
    jMultiLineToolTip0.removeInputMethodListener(inputMethodListener6);
    jMultiLineToolTip0.invalidate();
    java.awt.Event event9 = null;
    boolean b12 = jMultiLineToolTip0.mouseDrag(event9, 0, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences5 = null;
    clientPreferences4.addProjectPreferences(projectPreferences5);
    crystal.model.DataSource.RepoKind repoKind11 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment14 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind11, false, "hi!");
    crystal.model.Environment environment17 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind11, true, "PENDING");
    environment17.setCompileCommand("TESTCONFLICT");
    crystal.client.ClientPreferences clientPreferences24 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences25 = null;
    clientPreferences24.addProjectPreferences(projectPreferences25);
    clientPreferences24.setGitPath("");
    crystal.client.ProjectPreferences projectPreferences29 = null;
    clientPreferences24.removeProjectPreferences(projectPreferences29);
    crystal.client.ProjectPreferences projectPreferences31 = new crystal.client.ProjectPreferences((crystal.model.DataSource)environment17, clientPreferences24);
    crystal.model.DataSource dataSource33 = projectPreferences31.getDataSource("PENDING");
    clientPreferences4.removeProjectPreferences(projectPreferences31);
    crystal.util.JMultiLineToolTip jMultiLineToolTip35 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color36 = null;
    jMultiLineToolTip35.setBackground(color36);
    jMultiLineToolTip35.setOpaque(false);
    java.awt.dnd.DropTarget dropTarget40 = jMultiLineToolTip35.getDropTarget();
    crystal.client.ProjectPreferences projectPreferences41 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener42 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener43 = null;
    crystal.client.CalculateProjectTask calculateProjectTask44 = new crystal.client.CalculateProjectTask(projectPreferences41, computationListener42, computationListener43);
    java.beans.PropertyChangeSupport propertyChangeSupport45 = calculateProjectTask44.getPropertyChangeSupport();
    calculateProjectTask44.execute();
    java.beans.PropertyChangeListener propertyChangeListener47 = null;
    calculateProjectTask44.removePropertyChangeListener(propertyChangeListener47);
    java.beans.PropertyChangeSupport propertyChangeSupport49 = calculateProjectTask44.getPropertyChangeSupport();
    crystal.util.JMultiLineToolTip jMultiLineToolTip51 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle52 = null;
    java.awt.Rectangle rectangle53 = jMultiLineToolTip51.getBounds(rectangle52);
    java.awt.Toolkit toolkit54 = jMultiLineToolTip51.getToolkit();
    jMultiLineToolTip51.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager58 = null;
    jMultiLineToolTip51.setLayout(layoutManager58);
    boolean b60 = jMultiLineToolTip51.isFocusOwner();
    boolean b61 = jMultiLineToolTip51.isShowing();
    java.awt.Graphics graphics62 = null;
    jMultiLineToolTip51.update(graphics62);
    javax.swing.KeyStroke keyStroke64 = null;
    int i65 = jMultiLineToolTip51.getConditionForKeyStroke(keyStroke64);
    crystal.util.JMultiLineToolTip jMultiLineToolTip66 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color67 = null;
    jMultiLineToolTip66.setBackground(color67);
    jMultiLineToolTip66.transferFocusBackward();
    jMultiLineToolTip66.firePropertyChange("$HOME", false, false);
    crystal.util.JMultiLineToolTip jMultiLineToolTip74 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle75 = null;
    java.awt.Rectangle rectangle76 = jMultiLineToolTip74.getBounds(rectangle75);
    jMultiLineToolTip74.firePropertyChange("AHEAD", 0, 128);
    javax.swing.InputVerifier inputVerifier81 = jMultiLineToolTip74.getInputVerifier();
    crystal.util.JMultiLineToolTip jMultiLineToolTip82 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle83 = null;
    java.awt.Rectangle rectangle84 = jMultiLineToolTip82.getBounds(rectangle83);
    java.awt.Event event85 = null;
    boolean b88 = jMultiLineToolTip82.mouseDrag(event85, 32, 1);
    java.awt.Graphics graphics89 = null;
    jMultiLineToolTip82.printComponents(graphics89);
    java.awt.Point point91 = jMultiLineToolTip82.location();
    jMultiLineToolTip74.setLocation(point91);
    java.awt.Component component93 = jMultiLineToolTip66.getComponentAt(point91);
    calculateProjectTask44.firePropertyChange("2017-06-04T14-21-48.265-0700", (java.lang.Object)jMultiLineToolTip51, (java.lang.Object)point91);
    java.awt.Component component95 = jMultiLineToolTip35.getComponentAt(point91);
    boolean b96 = projectPreferences31.equals((java.lang.Object)component95);
    org.junit.Assert.assertTrue("'" + repoKind11 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind11.equals(crystal.model.DataSource.RepoKind.HG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(dataSource33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(dropTarget40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeSupport45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeSupport49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == false);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel6 = jMultiLineToolTip0.getColorModel();
    java.beans.VetoableChangeListener[] vetoableChangeListener_array7 = jMultiLineToolTip0.getVetoableChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vetoableChangeListener_array7);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }

    javax.swing.ImageIcon imageIcon1 = null;
    java.awt.Image image2 = null;
    crystal.model.Relationship relationship3 = new crystal.model.Relationship("AHEAD", imageIcon1, image2);
    javax.swing.ImageIcon imageIcon6 = null;
    java.awt.Image image7 = null;
    crystal.model.Relationship relationship8 = new crystal.model.Relationship("AHEAD", imageIcon6, image7);
    relationship3.calculateAction("AHEAD", relationship8);
    java.lang.String str10 = relationship3.getToolTipText();
    java.lang.String str11 = relationship3.getToolTipText();
    javax.swing.ImageIcon imageIcon13 = null;
    java.awt.Image image14 = null;
    crystal.model.Relationship relationship15 = new crystal.model.Relationship("AHEAD", imageIcon13, image14);
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
    boolean b28 = relationship15.equals((java.lang.Object)jMultiLineToolTip16);
    relationship3.setConsequences(relationship15);
    crystal.model.RevisionHistory.Capable capable30 = relationship15.getCapable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Action: hg merge"+ "'", str10.equals("Action: hg merge"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Action: hg merge"+ "'", str11.equals("Action: hg merge"));
    
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
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(capable30);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }

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
    java.awt.AWTEvent aWTEvent15 = null;
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.dispatchEvent(aWTEvent15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
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

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }

    crystal.model.LocalStateResult.BUILD = "hi!";

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }

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
    jMultiLineToolTip15.firePropertyChange("AHEAD", 0, 128);
    java.awt.Graphics graphics22 = null;
    jMultiLineToolTip15.printAll(graphics22);
    crystal.util.JMultiLineToolTip jMultiLineToolTip24 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle25 = null;
    java.awt.Rectangle rectangle26 = jMultiLineToolTip24.getBounds(rectangle25);
    java.awt.Event event27 = null;
    boolean b29 = jMultiLineToolTip24.action(event27, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel30 = jMultiLineToolTip24.getColorModel();
    jMultiLineToolTip24.removeNotify();
    crystal.util.JMultiLineToolTip jMultiLineToolTip32 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle33 = null;
    java.awt.Rectangle rectangle34 = jMultiLineToolTip32.getBounds(rectangle33);
    java.awt.Toolkit toolkit35 = jMultiLineToolTip32.getToolkit();
    java.awt.Font font36 = null;
    jMultiLineToolTip32.setFont(font36);
    java.awt.Color color38 = jMultiLineToolTip32.getBackground();
    jMultiLineToolTip24.setForeground(color38);
    jMultiLineToolTip15.setForeground(color38);
    jMultiLineToolTip0.setForeground(color38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color38);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip0.firePropertyChange("", (double)0L, 0.0d);
    boolean b5 = jMultiLineToolTip0.getIgnoreRepaint();
    java.awt.ComponentOrientation componentOrientation6 = null;
    jMultiLineToolTip0.setComponentOrientation(componentOrientation6);
    crystal.util.JMultiLineToolTip jMultiLineToolTip8 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle9 = null;
    java.awt.Rectangle rectangle10 = jMultiLineToolTip8.getBounds(rectangle9);
    java.awt.Toolkit toolkit11 = jMultiLineToolTip8.getToolkit();
    jMultiLineToolTip8.setName("hi!");
    javax.swing.ImageIcon imageIcon15 = null;
    java.awt.Image image16 = null;
    crystal.model.Relationship relationship17 = new crystal.model.Relationship("AHEAD", imageIcon15, image16);
    crystal.util.JMultiLineToolTip jMultiLineToolTip18 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle19 = null;
    java.awt.Rectangle rectangle20 = jMultiLineToolTip18.getBounds(rectangle19);
    java.awt.Rectangle rectangle21 = jMultiLineToolTip18.getVisibleRect();
    boolean b22 = jMultiLineToolTip18.isEnabled();
    java.awt.Event event23 = null;
    boolean b26 = jMultiLineToolTip18.mouseEnter(event23, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener27 = null;
    jMultiLineToolTip18.addPropertyChangeListener(propertyChangeListener27);
    java.awt.Point point29 = jMultiLineToolTip18.getLocation();
    boolean b30 = relationship17.equals((java.lang.Object)jMultiLineToolTip18);
    java.awt.Image image31 = relationship17.getImage();
    boolean b37 = jMultiLineToolTip8.imageUpdate(image31, 32, (int)(short)1, (int)(short)100, 128, 9);
    crystal.util.JMultiLineToolTip jMultiLineToolTip40 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle41 = null;
    java.awt.Rectangle rectangle42 = jMultiLineToolTip40.getBounds(rectangle41);
    java.awt.Event event43 = null;
    boolean b45 = jMultiLineToolTip40.action(event43, (java.lang.Object)'4');
    crystal.util.JMultiLineToolTip jMultiLineToolTip46 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle47 = null;
    java.awt.Rectangle rectangle48 = jMultiLineToolTip46.getBounds(rectangle47);
    java.awt.Event event49 = null;
    boolean b51 = jMultiLineToolTip46.action(event49, (java.lang.Object)'4');
    jMultiLineToolTip40.setComponent((javax.swing.JComponent)jMultiLineToolTip46);
    crystal.util.JMultiLineToolTip jMultiLineToolTip53 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle54 = null;
    java.awt.Rectangle rectangle55 = jMultiLineToolTip53.getBounds(rectangle54);
    java.awt.Toolkit toolkit56 = jMultiLineToolTip53.getToolkit();
    jMultiLineToolTip53.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager60 = null;
    jMultiLineToolTip53.setLayout(layoutManager60);
    boolean b62 = jMultiLineToolTip53.isFocusOwner();
    boolean b63 = jMultiLineToolTip53.isShowing();
    java.awt.Graphics graphics64 = null;
    jMultiLineToolTip53.update(graphics64);
    java.awt.Component component66 = jMultiLineToolTip40.add((java.awt.Component)jMultiLineToolTip53);
    java.awt.Font font67 = null;
    jMultiLineToolTip53.setFont(font67);
    crystal.util.JMultiLineToolTip jMultiLineToolTip69 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle70 = null;
    java.awt.Rectangle rectangle71 = jMultiLineToolTip69.getBounds(rectangle70);
    java.awt.Rectangle rectangle72 = jMultiLineToolTip69.getVisibleRect();
    boolean b73 = jMultiLineToolTip69.isEnabled();
    java.awt.Event event74 = null;
    boolean b77 = jMultiLineToolTip69.mouseEnter(event74, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener78 = null;
    jMultiLineToolTip69.addPropertyChangeListener(propertyChangeListener78);
    java.awt.Point point80 = jMultiLineToolTip69.getLocation();
    jMultiLineToolTip53.setLocation(point80);
    boolean b82 = jMultiLineToolTip0.prepareImage(image31, 100, 128, (java.awt.image.ImageObserver)jMultiLineToolTip53);
    java.awt.event.MouseEvent mouseEvent83 = null;
    java.awt.Point point84 = jMultiLineToolTip0.getPopupLocation(mouseEvent83);
    boolean b85 = jMultiLineToolTip0.isFocusTraversalPolicySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip0.firePropertyChange("", (double)0L, 0.0d);
    boolean b5 = jMultiLineToolTip0.getIgnoreRepaint();
    jMultiLineToolTip0.enable();
    jMultiLineToolTip0.disable();
    javax.swing.JComponent jComponent8 = jMultiLineToolTip0.getComponent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jComponent8);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }

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
    jMultiLineToolTip0.removeNotify();
    java.awt.Dimension dimension35 = jMultiLineToolTip0.getSize();
    javax.swing.JRootPane jRootPane36 = jMultiLineToolTip0.getRootPane();
    
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
    org.junit.Assert.assertNotNull(dimension35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jRootPane36);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }

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
    java.awt.Component[] component_array14 = jMultiLineToolTip0.getComponents();
    boolean b15 = jMultiLineToolTip0.isFocusCycleRoot();
    jMultiLineToolTip0.removeAll();
    jMultiLineToolTip0.resize((int)(short)1, (int)(byte)10);
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
    jMultiLineToolTip0.setPreferredSize(dimension35);
    
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
    org.junit.Assert.assertNotNull(component_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
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

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip0.firePropertyChange("", (double)0L, 0.0d);
    boolean b5 = jMultiLineToolTip0.getIgnoreRepaint();
    java.awt.ComponentOrientation componentOrientation6 = null;
    jMultiLineToolTip0.setComponentOrientation(componentOrientation6);
    crystal.util.JMultiLineToolTip jMultiLineToolTip8 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle9 = null;
    java.awt.Rectangle rectangle10 = jMultiLineToolTip8.getBounds(rectangle9);
    java.awt.Toolkit toolkit11 = jMultiLineToolTip8.getToolkit();
    jMultiLineToolTip8.setName("hi!");
    javax.swing.ImageIcon imageIcon15 = null;
    java.awt.Image image16 = null;
    crystal.model.Relationship relationship17 = new crystal.model.Relationship("AHEAD", imageIcon15, image16);
    crystal.util.JMultiLineToolTip jMultiLineToolTip18 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle19 = null;
    java.awt.Rectangle rectangle20 = jMultiLineToolTip18.getBounds(rectangle19);
    java.awt.Rectangle rectangle21 = jMultiLineToolTip18.getVisibleRect();
    boolean b22 = jMultiLineToolTip18.isEnabled();
    java.awt.Event event23 = null;
    boolean b26 = jMultiLineToolTip18.mouseEnter(event23, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener27 = null;
    jMultiLineToolTip18.addPropertyChangeListener(propertyChangeListener27);
    java.awt.Point point29 = jMultiLineToolTip18.getLocation();
    boolean b30 = relationship17.equals((java.lang.Object)jMultiLineToolTip18);
    java.awt.Image image31 = relationship17.getImage();
    boolean b37 = jMultiLineToolTip8.imageUpdate(image31, 32, (int)(short)1, (int)(short)100, 128, 9);
    crystal.util.JMultiLineToolTip jMultiLineToolTip40 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle41 = null;
    java.awt.Rectangle rectangle42 = jMultiLineToolTip40.getBounds(rectangle41);
    java.awt.Event event43 = null;
    boolean b45 = jMultiLineToolTip40.action(event43, (java.lang.Object)'4');
    crystal.util.JMultiLineToolTip jMultiLineToolTip46 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle47 = null;
    java.awt.Rectangle rectangle48 = jMultiLineToolTip46.getBounds(rectangle47);
    java.awt.Event event49 = null;
    boolean b51 = jMultiLineToolTip46.action(event49, (java.lang.Object)'4');
    jMultiLineToolTip40.setComponent((javax.swing.JComponent)jMultiLineToolTip46);
    crystal.util.JMultiLineToolTip jMultiLineToolTip53 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle54 = null;
    java.awt.Rectangle rectangle55 = jMultiLineToolTip53.getBounds(rectangle54);
    java.awt.Toolkit toolkit56 = jMultiLineToolTip53.getToolkit();
    jMultiLineToolTip53.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager60 = null;
    jMultiLineToolTip53.setLayout(layoutManager60);
    boolean b62 = jMultiLineToolTip53.isFocusOwner();
    boolean b63 = jMultiLineToolTip53.isShowing();
    java.awt.Graphics graphics64 = null;
    jMultiLineToolTip53.update(graphics64);
    java.awt.Component component66 = jMultiLineToolTip40.add((java.awt.Component)jMultiLineToolTip53);
    java.awt.Font font67 = null;
    jMultiLineToolTip53.setFont(font67);
    crystal.util.JMultiLineToolTip jMultiLineToolTip69 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle70 = null;
    java.awt.Rectangle rectangle71 = jMultiLineToolTip69.getBounds(rectangle70);
    java.awt.Rectangle rectangle72 = jMultiLineToolTip69.getVisibleRect();
    boolean b73 = jMultiLineToolTip69.isEnabled();
    java.awt.Event event74 = null;
    boolean b77 = jMultiLineToolTip69.mouseEnter(event74, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener78 = null;
    jMultiLineToolTip69.addPropertyChangeListener(propertyChangeListener78);
    java.awt.Point point80 = jMultiLineToolTip69.getLocation();
    jMultiLineToolTip53.setLocation(point80);
    boolean b82 = jMultiLineToolTip0.prepareImage(image31, 100, 128, (java.awt.image.ImageObserver)jMultiLineToolTip53);
    jMultiLineToolTip0.setVisible(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color1 = null;
    jMultiLineToolTip0.setBackground(color1);
    jMultiLineToolTip0.transferFocusBackward();
    jMultiLineToolTip0.firePropertyChange("$HOME", false, false);
    java.awt.Graphics graphics8 = null;
    jMultiLineToolTip0.paintComponents(graphics8);
    boolean b10 = jMultiLineToolTip0.isShowing();
    crystal.util.JMultiLineToolTip jMultiLineToolTip11 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle12 = null;
    java.awt.Rectangle rectangle13 = jMultiLineToolTip11.getBounds(rectangle12);
    java.awt.Toolkit toolkit14 = jMultiLineToolTip11.getToolkit();
    java.awt.Font font15 = null;
    jMultiLineToolTip11.setFont(font15);
    java.awt.Color color17 = jMultiLineToolTip11.getBackground();
    crystal.util.JMultiLineToolTip jMultiLineToolTip18 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle19 = null;
    java.awt.Rectangle rectangle20 = jMultiLineToolTip18.getBounds(rectangle19);
    crystal.util.JMultiLineToolTip jMultiLineToolTip21 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle22 = null;
    java.awt.Rectangle rectangle23 = jMultiLineToolTip21.getBounds(rectangle22);
    jMultiLineToolTip18.repaint(rectangle23);
    java.awt.Rectangle rectangle25 = jMultiLineToolTip11.getBounds(rectangle23);
    jMultiLineToolTip0.setBounds(rectangle25);
    jMultiLineToolTip0.grabFocus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle25);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.im.InputMethodRequests inputMethodRequests7 = jMultiLineToolTip0.getInputMethodRequests();
    boolean b8 = jMultiLineToolTip0.isOpaque();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputMethodRequests7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }

    crystal.model.DataSource.RepoKind repoKind0 = crystal.model.DataSource.RepoKind.GIT;
    org.junit.Assert.assertTrue("'" + repoKind0 + "' != '" + crystal.model.DataSource.RepoKind.GIT + "'", repoKind0.equals(crystal.model.DataSource.RepoKind.GIT));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }

    int i0 = java.awt.Frame.MAXIMIZED_HORIZ;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }

    crystal.util.ValidInputChecker.checkValidDirectoryPath("415725 hours 21 min");

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }

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
    javax.swing.InputMap inputMap25 = jMultiLineToolTip0.getInputMap();
    java.awt.FocusTraversalPolicy focusTraversalPolicy26 = jMultiLineToolTip0.getFocusTraversalPolicy();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(focusTraversalPolicy26);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }

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
    java.awt.Insets insets11 = jMultiLineToolTip8.getInsets();
    java.awt.Insets insets12 = jMultiLineToolTip0.getInsets(insets11);
    jMultiLineToolTip0.setAlignmentX((float)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets12);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }

    crystal.client.ProjectPreferences projectPreferences0 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener1 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener2 = null;
    crystal.client.CalculateProjectTask calculateProjectTask3 = new crystal.client.CalculateProjectTask(projectPreferences0, computationListener1, computationListener2);
    java.beans.PropertyChangeSupport propertyChangeSupport4 = calculateProjectTask3.getPropertyChangeSupport();
    calculateProjectTask3.execute();
    java.beans.PropertyChangeListener propertyChangeListener6 = null;
    calculateProjectTask3.removePropertyChangeListener(propertyChangeListener6);
    java.beans.PropertyChangeSupport propertyChangeSupport8 = calculateProjectTask3.getPropertyChangeSupport();
    crystal.util.JMultiLineToolTip jMultiLineToolTip10 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle11 = null;
    java.awt.Rectangle rectangle12 = jMultiLineToolTip10.getBounds(rectangle11);
    java.awt.Toolkit toolkit13 = jMultiLineToolTip10.getToolkit();
    jMultiLineToolTip10.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager17 = null;
    jMultiLineToolTip10.setLayout(layoutManager17);
    boolean b19 = jMultiLineToolTip10.isFocusOwner();
    boolean b20 = jMultiLineToolTip10.isShowing();
    java.awt.Graphics graphics21 = null;
    jMultiLineToolTip10.update(graphics21);
    javax.swing.KeyStroke keyStroke23 = null;
    int i24 = jMultiLineToolTip10.getConditionForKeyStroke(keyStroke23);
    crystal.util.JMultiLineToolTip jMultiLineToolTip25 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color26 = null;
    jMultiLineToolTip25.setBackground(color26);
    jMultiLineToolTip25.transferFocusBackward();
    jMultiLineToolTip25.firePropertyChange("$HOME", false, false);
    crystal.util.JMultiLineToolTip jMultiLineToolTip33 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle34 = null;
    java.awt.Rectangle rectangle35 = jMultiLineToolTip33.getBounds(rectangle34);
    jMultiLineToolTip33.firePropertyChange("AHEAD", 0, 128);
    javax.swing.InputVerifier inputVerifier40 = jMultiLineToolTip33.getInputVerifier();
    crystal.util.JMultiLineToolTip jMultiLineToolTip41 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle42 = null;
    java.awt.Rectangle rectangle43 = jMultiLineToolTip41.getBounds(rectangle42);
    java.awt.Event event44 = null;
    boolean b47 = jMultiLineToolTip41.mouseDrag(event44, 32, 1);
    java.awt.Graphics graphics48 = null;
    jMultiLineToolTip41.printComponents(graphics48);
    java.awt.Point point50 = jMultiLineToolTip41.location();
    jMultiLineToolTip33.setLocation(point50);
    java.awt.Component component52 = jMultiLineToolTip25.getComponentAt(point50);
    calculateProjectTask3.firePropertyChange("2017-06-04T14-21-48.265-0700", (java.lang.Object)jMultiLineToolTip10, (java.lang.Object)point50);
    boolean b54 = calculateProjectTask3.isDone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeSupport4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeSupport8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }

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
    java.awt.Graphics graphics14 = null;
    jMultiLineToolTip0.print(graphics14);
    java.awt.FocusTraversalPolicy focusTraversalPolicy16 = null;
    jMultiLineToolTip0.setFocusTraversalPolicy(focusTraversalPolicy16);
    java.awt.Toolkit toolkit18 = jMultiLineToolTip0.getToolkit();
    
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
    org.junit.Assert.assertNotNull(toolkit18);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    jMultiLineToolTip0.firePropertyChange("hi!", ' ', '#');
    java.awt.Dimension dimension6 = jMultiLineToolTip0.getMaximumSize();
    boolean b7 = jMultiLineToolTip0.isFocusTraversalPolicySet();
    jMultiLineToolTip0.validate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color1 = null;
    jMultiLineToolTip0.setBackground(color1);
    jMultiLineToolTip0.transferFocusBackward();
    jMultiLineToolTip0.firePropertyChange("$HOME", false, false);
    javax.swing.JPopupMenu jPopupMenu8 = jMultiLineToolTip0.getComponentPopupMenu();
    java.awt.event.MouseWheelListener mouseWheelListener9 = null;
    jMultiLineToolTip0.removeMouseWheelListener(mouseWheelListener9);
    int i11 = jMultiLineToolTip0.getColumns();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jPopupMenu8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    jMultiLineToolTip0.firePropertyChange("AHEAD", 0, 128);
    jMultiLineToolTip0.setBounds((int)(byte)1, (int)(byte)100, 0, (-1));
    java.lang.String str12 = jMultiLineToolTip0.toString();
    jMultiLineToolTip0.resize(7, (int)'4');
    java.awt.LayoutManager layoutManager16 = null;
    jMultiLineToolTip0.setLayout(layoutManager16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.event.InputMethodListener inputMethodListener7 = null;
    jMultiLineToolTip0.addInputMethodListener(inputMethodListener7);
    boolean b9 = jMultiLineToolTip0.isPaintingForPrint();
    float f10 = jMultiLineToolTip0.getAlignmentX();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f10 == 0.5f);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }

    crystal.Constants.DEFAULT_REFRESH = 'a';

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color1 = null;
    jMultiLineToolTip0.setBackground(color1);
    jMultiLineToolTip0.setOpaque(false);
    java.awt.dnd.DropTarget dropTarget5 = jMultiLineToolTip0.getDropTarget();
    crystal.client.ProjectPreferences projectPreferences6 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener7 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener8 = null;
    crystal.client.CalculateProjectTask calculateProjectTask9 = new crystal.client.CalculateProjectTask(projectPreferences6, computationListener7, computationListener8);
    java.beans.PropertyChangeSupport propertyChangeSupport10 = calculateProjectTask9.getPropertyChangeSupport();
    calculateProjectTask9.execute();
    java.beans.PropertyChangeListener propertyChangeListener12 = null;
    calculateProjectTask9.removePropertyChangeListener(propertyChangeListener12);
    java.beans.PropertyChangeSupport propertyChangeSupport14 = calculateProjectTask9.getPropertyChangeSupport();
    crystal.util.JMultiLineToolTip jMultiLineToolTip16 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle17 = null;
    java.awt.Rectangle rectangle18 = jMultiLineToolTip16.getBounds(rectangle17);
    java.awt.Toolkit toolkit19 = jMultiLineToolTip16.getToolkit();
    jMultiLineToolTip16.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager23 = null;
    jMultiLineToolTip16.setLayout(layoutManager23);
    boolean b25 = jMultiLineToolTip16.isFocusOwner();
    boolean b26 = jMultiLineToolTip16.isShowing();
    java.awt.Graphics graphics27 = null;
    jMultiLineToolTip16.update(graphics27);
    javax.swing.KeyStroke keyStroke29 = null;
    int i30 = jMultiLineToolTip16.getConditionForKeyStroke(keyStroke29);
    crystal.util.JMultiLineToolTip jMultiLineToolTip31 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color32 = null;
    jMultiLineToolTip31.setBackground(color32);
    jMultiLineToolTip31.transferFocusBackward();
    jMultiLineToolTip31.firePropertyChange("$HOME", false, false);
    crystal.util.JMultiLineToolTip jMultiLineToolTip39 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle40 = null;
    java.awt.Rectangle rectangle41 = jMultiLineToolTip39.getBounds(rectangle40);
    jMultiLineToolTip39.firePropertyChange("AHEAD", 0, 128);
    javax.swing.InputVerifier inputVerifier46 = jMultiLineToolTip39.getInputVerifier();
    crystal.util.JMultiLineToolTip jMultiLineToolTip47 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle48 = null;
    java.awt.Rectangle rectangle49 = jMultiLineToolTip47.getBounds(rectangle48);
    java.awt.Event event50 = null;
    boolean b53 = jMultiLineToolTip47.mouseDrag(event50, 32, 1);
    java.awt.Graphics graphics54 = null;
    jMultiLineToolTip47.printComponents(graphics54);
    java.awt.Point point56 = jMultiLineToolTip47.location();
    jMultiLineToolTip39.setLocation(point56);
    java.awt.Component component58 = jMultiLineToolTip31.getComponentAt(point56);
    calculateProjectTask9.firePropertyChange("2017-06-04T14-21-48.265-0700", (java.lang.Object)jMultiLineToolTip16, (java.lang.Object)point56);
    java.awt.Component component60 = jMultiLineToolTip0.getComponentAt(point56);
    java.awt.Dimension dimension61 = jMultiLineToolTip0.getMaximumSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(dropTarget5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeSupport10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeSupport14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension61);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ClientPreferences clientPreferences5 = clientPreferences4.clone();
    boolean b6 = clientPreferences4.hasChanged();
    crystal.model.DataSource.RepoKind repoKind9 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment12 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind9, false, "hi!");
    environment12.setParent("Action: hg merge");
    environment12.setCompileCommand("AHEAD");
    environment12.setRemoteCmd("");
    crystal.client.ClientPreferences clientPreferences19 = null;
    crystal.client.ProjectPreferences projectPreferences20 = new crystal.client.ProjectPreferences((crystal.model.DataSource)environment12, clientPreferences19);
    // The following exception was thrown during execution in test generation
    try {
    crystal.client.DataSourceGuiEditorFrame dataSourceGuiEditorFrame22 = new crystal.client.DataSourceGuiEditorFrame(clientPreferences4, projectPreferences20, "415725 hours 22 min");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clientPreferences5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    org.junit.Assert.assertTrue("'" + repoKind9 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind9.equals(crystal.model.DataSource.RepoKind.HG));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }

    crystal.model.LocalStateResult.TEST = "";

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }

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
    java.lang.String str32 = jMultiLineToolTip0.getToolTipText();
    java.awt.event.InputMethodListener inputMethodListener33 = null;
    jMultiLineToolTip0.addInputMethodListener(inputMethodListener33);
    jMultiLineToolTip0.transferFocusUpCycle();
    
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
    org.junit.Assert.assertNull(str32);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Dimension dimension5 = null;
    jMultiLineToolTip0.setPreferredSize(dimension5);
    jMultiLineToolTip0.show();
    jMultiLineToolTip0.disable();
    crystal.util.JMultiLineToolTip jMultiLineToolTip9 = new crystal.util.JMultiLineToolTip();
    boolean b10 = jMultiLineToolTip9.isFocusTraversalPolicyProvider();
    jMultiLineToolTip9.firePropertyChange("hi!", ' ', '#');
    java.awt.Dimension dimension15 = jMultiLineToolTip9.getMaximumSize();
    jMultiLineToolTip0.resize(dimension15);
    java.awt.event.InputMethodListener inputMethodListener17 = null;
    jMultiLineToolTip0.addInputMethodListener(inputMethodListener17);
    java.awt.event.MouseListener[] mouseListener_array19 = jMultiLineToolTip0.getMouseListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseListener_array19);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }

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
    jMultiLineToolTip0.nextFocus();
    boolean b17 = jMultiLineToolTip0.isFocusable();
    
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
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }

    org.apache.log4j.Logger logger0 = crystal.client.ClientPreferences._log;
    crystal.client.ClientPreferences._log = logger0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(logger0);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    jMultiLineToolTip0.firePropertyChange("hi!", ' ', '#');
    java.awt.image.ImageProducer imageProducer6 = null;
    java.awt.Image image7 = jMultiLineToolTip0.createImage(imageProducer6);
    javax.swing.JRootPane jRootPane8 = jMultiLineToolTip0.getRootPane();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jRootPane8);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "$HOME", "$HOME", "AHEAD" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str4 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str4, str_array3);
    java.lang.String[] str_array14 = new java.lang.String[] { "0 ms", "$HOME", "", "$HOME", "$HOME", "415725 hours 21 min", "", "$HOME" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str15 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str15, str_array14);
    java.util.Set<java.lang.String> set_str17 = crystal.util.SetOperations.setDifference((java.util.Set<java.lang.String>)linkedhashset_str4, (java.util.Set<java.lang.String>)linkedhashset_str15);
    java.lang.String[] str_array39 = new java.lang.String[] { "cannot compute hg action", "TEST", "cannot compute hg action", "ToolTipText", "$HOME", "TESTCONFLICT", "$HOME", "32 ms", "Action: hg merge", "TESTCONFLICT", "", "TEST", "ERROR", "AHEAD_HG_2017-06-04T14-21-48.265-0700", "Action: hg merge", "hi!", "%5p - %m%n", "ToolTipUI", "ToolTipText", "415725 hours 21 min", "ToolTipText" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str40 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str40, str_array39);
    boolean b42 = crystal.util.SetOperations.isSuperset((java.util.Set<java.lang.String>)linkedhashset_str15, (java.util.Set<java.lang.String>)linkedhashset_str40);
    
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
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    jMultiLineToolTip0.firePropertyChange("hi!", ' ', '#');
    java.awt.Dimension dimension6 = jMultiLineToolTip0.getMaximumSize();
    java.awt.Event event7 = null;
    boolean b10 = jMultiLineToolTip0.mouseDown(event7, 32, 3);
    java.awt.event.ComponentListener componentListener11 = null;
    jMultiLineToolTip0.addComponentListener(componentListener11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }

    crystal.model.LocalStateResult.PENDING = "%5p - %m%n";

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }

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
    java.awt.Toolkit toolkit16 = jMultiLineToolTip13.getToolkit();
    jMultiLineToolTip13.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager20 = null;
    jMultiLineToolTip13.setLayout(layoutManager20);
    boolean b22 = jMultiLineToolTip13.isFocusOwner();
    boolean b23 = jMultiLineToolTip13.isShowing();
    jMultiLineToolTip13.transferFocusUpCycle();
    crystal.util.JMultiLineToolTip jMultiLineToolTip25 = new crystal.util.JMultiLineToolTip();
    boolean b26 = jMultiLineToolTip25.isFocusTraversalPolicyProvider();
    java.awt.Dimension dimension27 = jMultiLineToolTip25.preferredSize();
    java.awt.Dimension dimension28 = jMultiLineToolTip13.getSize(dimension27);
    boolean b29 = jMultiLineToolTip13.isPaintingForPrint();
    jMultiLineToolTip13.move(32, 2);
    java.awt.ImageCapabilities imageCapabilities35 = null;
    java.awt.image.VolatileImage volatileImage36 = jMultiLineToolTip13.createVolatileImage(8, (int)'#', imageCapabilities35);
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.setComponentZOrder((java.awt.Component)jMultiLineToolTip13, (int)(short)100);
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
    org.junit.Assert.assertNotNull(rectangle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(volatileImage36);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences5 = null;
    clientPreferences4.addProjectPreferences(projectPreferences5);
    crystal.client.ProjectPreferences projectPreferences7 = null;
    clientPreferences4.removeProjectPreferences(projectPreferences7);
    long long9 = clientPreferences4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 32L);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }

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
    crystal.util.JMultiLineToolTip jMultiLineToolTip36 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle37 = null;
    java.awt.Rectangle rectangle38 = jMultiLineToolTip36.getBounds(rectangle37);
    java.awt.Event event39 = null;
    boolean b41 = jMultiLineToolTip36.action(event39, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel42 = jMultiLineToolTip36.getColorModel();
    jMultiLineToolTip36.removeNotify();
    crystal.util.JMultiLineToolTip jMultiLineToolTip44 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle45 = null;
    java.awt.Rectangle rectangle46 = jMultiLineToolTip44.getBounds(rectangle45);
    java.awt.Toolkit toolkit47 = jMultiLineToolTip44.getToolkit();
    java.awt.Font font48 = null;
    jMultiLineToolTip44.setFont(font48);
    java.awt.Color color50 = jMultiLineToolTip44.getBackground();
    jMultiLineToolTip36.setForeground(color50);
    crystal.util.JMultiLineToolTip jMultiLineToolTip52 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle53 = null;
    java.awt.Rectangle rectangle54 = jMultiLineToolTip52.getBounds(rectangle53);
    jMultiLineToolTip52.firePropertyChange("AHEAD", 0, 128);
    jMultiLineToolTip52.setBounds((int)(byte)1, (int)(byte)100, 0, (-1));
    jMultiLineToolTip52.setDoubleBuffered(false);
    javax.swing.border.Border border66 = jMultiLineToolTip52.getBorder();
    java.lang.Object obj67 = jMultiLineToolTip36.getClientProperty((java.lang.Object)border66);
    java.awt.Event event68 = null;
    boolean b71 = jMultiLineToolTip36.mouseDown(event68, 64, 128);
    java.awt.Font font72 = jMultiLineToolTip36.getFont();
    jMultiLineToolTip20.setFont(font72);
    jMultiLineToolTip0.setFont(font72);
    
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
    org.junit.Assert.assertNotNull(rectangle38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(border66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font72);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }

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
    javax.swing.InputMap inputMap15 = jMultiLineToolTip0.getInputMap(0);
    javax.swing.plaf.ToolTipUI toolTipUI16 = jMultiLineToolTip0.getUI();
    
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
    org.junit.Assert.assertNotNull(inputMap15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolTipUI16);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }

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
    crystal.util.JMultiLineToolTip jMultiLineToolTip17 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle18 = null;
    java.awt.Rectangle rectangle19 = jMultiLineToolTip17.getBounds(rectangle18);
    java.awt.Rectangle rectangle20 = jMultiLineToolTip17.getVisibleRect();
    boolean b21 = jMultiLineToolTip17.isEnabled();
    java.awt.Event event22 = null;
    boolean b25 = jMultiLineToolTip17.mouseEnter(event22, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener26 = null;
    jMultiLineToolTip17.addPropertyChangeListener(propertyChangeListener26);
    java.awt.Point point28 = jMultiLineToolTip17.getLocation();
    jMultiLineToolTip17.setDoubleBuffered(true);
    java.awt.Graphics graphics31 = null;
    jMultiLineToolTip17.print(graphics31);
    jMultiLineToolTip0.setComponentZOrder((java.awt.Component)jMultiLineToolTip17, 0);
    jMultiLineToolTip0.firePropertyChange("ERROR", ' ', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point28);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.beans.VetoableChangeListener[] vetoableChangeListener_array5 = jMultiLineToolTip0.getVetoableChangeListeners();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array6 = jMultiLineToolTip0.getMouseMotionListeners();
    boolean b7 = jMultiLineToolTip0.isShowing();
    crystal.util.JMultiLineToolTip jMultiLineToolTip8 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle9 = null;
    java.awt.Rectangle rectangle10 = jMultiLineToolTip8.getBounds(rectangle9);
    java.awt.Toolkit toolkit11 = jMultiLineToolTip8.getToolkit();
    jMultiLineToolTip8.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager15 = null;
    jMultiLineToolTip8.setLayout(layoutManager15);
    crystal.util.JMultiLineToolTip jMultiLineToolTip17 = new crystal.util.JMultiLineToolTip();
    boolean b18 = jMultiLineToolTip17.isFocusTraversalPolicyProvider();
    jMultiLineToolTip17.firePropertyChange("hi!", ' ', '#');
    java.awt.Dimension dimension23 = jMultiLineToolTip17.getMaximumSize();
    java.awt.Dimension dimension24 = jMultiLineToolTip8.getSize(dimension23);
    java.awt.Dimension dimension25 = jMultiLineToolTip0.getSize(dimension24);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }

    crystal.util.SetOperations setOperations0 = new crystal.util.SetOperations();

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    jMultiLineToolTip0.firePropertyChange("hi!", ' ', '#');
    java.lang.Object obj6 = jMultiLineToolTip0.getTreeLock();
    jMultiLineToolTip0.transferFocus();
    java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListener_array8 = jMultiLineToolTip0.getHierarchyBoundsListeners();
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.addPropertyChangeListener(propertyChangeListener9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyBoundsListener_array8);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }

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
    crystal.util.JMultiLineToolTip jMultiLineToolTip17 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle18 = null;
    java.awt.Rectangle rectangle19 = jMultiLineToolTip17.getBounds(rectangle18);
    java.awt.Rectangle rectangle20 = jMultiLineToolTip17.getVisibleRect();
    boolean b21 = jMultiLineToolTip17.isEnabled();
    java.awt.Event event22 = null;
    boolean b25 = jMultiLineToolTip17.mouseEnter(event22, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener26 = null;
    jMultiLineToolTip17.addPropertyChangeListener(propertyChangeListener26);
    java.awt.Point point28 = jMultiLineToolTip17.getLocation();
    jMultiLineToolTip17.setDoubleBuffered(true);
    java.awt.Graphics graphics31 = null;
    jMultiLineToolTip17.print(graphics31);
    jMultiLineToolTip0.setComponentZOrder((java.awt.Component)jMultiLineToolTip17, 0);
    java.awt.Component.BaselineResizeBehavior baselineResizeBehavior35 = jMultiLineToolTip17.getBaselineResizeBehavior();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point28);
    org.junit.Assert.assertTrue("'" + baselineResizeBehavior35 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior35.equals(java.awt.Component.BaselineResizeBehavior.OTHER));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }

    java.util.HashMap<java.lang.String,crystal.server.AbstractLogParser.Checkpoint> hashmap_str_checkpoint1 = crystal.server.GitLogParser.parseLog("%5p - %m%n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_str_checkpoint1);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }

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
    int i16 = jMultiLineToolTip0.countComponents();
    jMultiLineToolTip0.layout();
    java.awt.Font font18 = jMultiLineToolTip0.getFont();
    jMultiLineToolTip0.setBounds(32, 64, (int)'a', 10);
    
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
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font18);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }

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
    java.awt.event.MouseEvent mouseEvent32 = null;
    java.awt.Point point33 = jMultiLineToolTip0.getToolTipLocation(mouseEvent32);
    jMultiLineToolTip0.resize((int)'a', (int)(short)100);
    
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
    org.junit.Assert.assertNull(point33);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }

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
    java.awt.Event event44 = null;
    boolean b47 = jMultiLineToolTip13.mouseDown(event44, 11, (int)(byte)-1);
    crystal.util.JMultiLineToolTip jMultiLineToolTip48 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle49 = null;
    java.awt.Rectangle rectangle50 = jMultiLineToolTip48.getBounds(rectangle49);
    jMultiLineToolTip48.firePropertyChange("AHEAD", 0, 128);
    jMultiLineToolTip48.paintImmediately(3, (int)(byte)10, 100, (int)(short)0);
    jMultiLineToolTip13.setComponent((javax.swing.JComponent)jMultiLineToolTip48);
    
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
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle50);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }

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
    java.beans.PropertyChangeListener propertyChangeListener33 = null;
    jMultiLineToolTip0.addPropertyChangeListener("ERROR", propertyChangeListener33);
    boolean b35 = jMultiLineToolTip0.isEnabled();
    
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
    org.junit.Assert.assertTrue(b35 == true);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test141"); }

    javax.swing.ImageIcon imageIcon1 = null;
    java.awt.Image image2 = null;
    crystal.model.Relationship relationship3 = new crystal.model.Relationship("AHEAD", imageIcon1, image2);
    java.lang.String str4 = relationship3.getName();
    crystal.model.RevisionHistory.Capable capable5 = relationship3.getCapable();
    java.awt.Image image6 = relationship3.getImage();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AHEAD"+ "'", str4.equals("AHEAD"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(capable5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image6);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test142"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b6 = jMultiLineToolTip0.mouseDrag(event3, 32, 1);
    java.awt.Graphics graphics7 = null;
    jMultiLineToolTip0.printComponents(graphics7);
    java.awt.event.FocusListener[] focusListener_array9 = jMultiLineToolTip0.getFocusListeners();
    jMultiLineToolTip0.transferFocusDownCycle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array9);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test143"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel6 = jMultiLineToolTip0.getColorModel();
    java.awt.ComponentOrientation componentOrientation7 = jMultiLineToolTip0.getComponentOrientation();
    java.awt.FocusTraversalPolicy focusTraversalPolicy8 = null;
    jMultiLineToolTip0.setFocusTraversalPolicy(focusTraversalPolicy8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentOrientation7);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test144"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.Font font4 = null;
    jMultiLineToolTip0.setFont(font4);
    java.awt.Color color6 = jMultiLineToolTip0.getBackground();
    boolean b7 = jMultiLineToolTip0.isFocusOwner();
    java.awt.Event event8 = null;
    boolean b11 = jMultiLineToolTip0.mouseUp(event8, (int)(byte)10, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test145"); }

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
    jMultiLineToolTip0.show();
    boolean b18 = jMultiLineToolTip0.isMaximumSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test146"); }

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
    boolean b15 = jMultiLineToolTip0.isFontSet();
    javax.swing.ActionMap actionMap16 = null;
    jMultiLineToolTip0.setActionMap(actionMap16);
    crystal.util.JMultiLineToolTip jMultiLineToolTip18 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle19 = null;
    java.awt.Rectangle rectangle20 = jMultiLineToolTip18.getBounds(rectangle19);
    java.awt.Event event21 = null;
    boolean b24 = jMultiLineToolTip18.mouseDrag(event21, 32, 1);
    java.awt.Graphics graphics25 = null;
    jMultiLineToolTip18.printComponents(graphics25);
    java.awt.Point point27 = jMultiLineToolTip18.location();
    java.awt.Component component28 = jMultiLineToolTip0.getComponentAt(point27);
    java.awt.Event event29 = null;
    boolean b32 = jMultiLineToolTip0.mouseDrag(event29, 5, 64);
    java.awt.Graphics graphics33 = jMultiLineToolTip0.getGraphics();
    
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
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphics33);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test147"); }

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
    environment10.setCloneString("%5p - %m%n");
    org.junit.Assert.assertTrue("'" + repoKind4 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind4.equals(crystal.model.DataSource.RepoKind.HG));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test148"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener4 = null;
    jMultiLineToolTip0.addHierarchyBoundsListener(hierarchyBoundsListener4);
    jMultiLineToolTip0.setFocusable(false);
    jMultiLineToolTip0.firePropertyChange("ToolTipUI", (double)(byte)-1, (double)7);
    java.awt.image.ColorModel colorModel12 = jMultiLineToolTip0.getColorModel();
    javax.accessibility.AccessibleContext accessibleContext13 = jMultiLineToolTip0.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext13);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test149"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.event.InputMethodListener inputMethodListener7 = null;
    jMultiLineToolTip0.addInputMethodListener(inputMethodListener7);
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
    jMultiLineToolTip10.setDoubleBuffered(true);
    java.awt.Graphics graphics24 = null;
    jMultiLineToolTip10.print(graphics24);
    java.util.Set<java.awt.AWTKeyStroke> set_aWTKeyStroke27 = jMultiLineToolTip10.getFocusTraversalKeys((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.setFocusTraversalKeys((int)'#', set_aWTKeyStroke27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    org.junit.Assert.assertNotNull(set_aWTKeyStroke27);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test150"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.im.InputMethodRequests inputMethodRequests7 = jMultiLineToolTip0.getInputMethodRequests();
    jMultiLineToolTip0.setAlignmentX((float)(-1L));
    jMultiLineToolTip0.setTipText("AHEAD_HG_2017-06-04T14-21-48.265-0700");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputMethodRequests7);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test151"); }

    javax.swing.ImageIcon imageIcon1 = null;
    java.awt.Image image2 = null;
    crystal.model.Relationship relationship3 = new crystal.model.Relationship("AHEAD", imageIcon1, image2);
    javax.swing.ImageIcon imageIcon6 = null;
    java.awt.Image image7 = null;
    crystal.model.Relationship relationship8 = new crystal.model.Relationship("AHEAD", imageIcon6, image7);
    relationship3.calculateAction("AHEAD", relationship8);
    crystal.model.DataSource.RepoKind repoKind16 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment19 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind16, false, "hi!");
    crystal.model.Environment environment22 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind16, true, "PENDING");
    crystal.model.DataSource dataSource25 = new crystal.model.DataSource("ToolTipUI", "415725 hours 21 min", repoKind16, true, "415725 hours 21 min");
    java.lang.String str26 = relationship8.getAction(repoKind16);
    boolean b27 = relationship8.isReady();
    crystal.util.JMultiLineToolTip jMultiLineToolTip28 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle29 = null;
    java.awt.Rectangle rectangle30 = jMultiLineToolTip28.getBounds(rectangle29);
    java.awt.Toolkit toolkit31 = jMultiLineToolTip28.getToolkit();
    int i32 = jMultiLineToolTip28.countComponents();
    java.awt.Graphics graphics33 = null;
    jMultiLineToolTip28.printAll(graphics33);
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
    jMultiLineToolTip35.setDoubleBuffered(true);
    java.awt.Component[] component_array49 = jMultiLineToolTip35.getComponents();
    java.awt.Component component50 = jMultiLineToolTip28.add((java.awt.Component)jMultiLineToolTip35);
    boolean b51 = relationship8.equals((java.lang.Object)jMultiLineToolTip28);
    org.junit.Assert.assertTrue("'" + repoKind16 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind16.equals(crystal.model.DataSource.RepoKind.HG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "cannot compute hg action"+ "'", str26.equals("cannot compute hg action"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
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
    org.junit.Assert.assertNotNull(component_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test152"); }

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
    crystal.util.JMultiLineToolTip jMultiLineToolTip18 = new crystal.util.JMultiLineToolTip();
    boolean b19 = jMultiLineToolTip18.isFocusTraversalPolicyProvider();
    jMultiLineToolTip18.setSize((int)' ', (-1));
    java.awt.GraphicsConfiguration graphicsConfiguration23 = jMultiLineToolTip18.getGraphicsConfiguration();
    jMultiLineToolTip18.requestFocus();
    jMultiLineToolTip0.setNextFocusableComponent((java.awt.Component)jMultiLineToolTip18);
    
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
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphicsConfiguration23);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test153"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    java.awt.im.InputContext inputContext2 = jMultiLineToolTip0.getInputContext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputContext2);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test154"); }

    crystal.model.LocalStateResult.GIT_MUST_RESOLVE = "415725 hours 21 min";

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test155"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b6 = jMultiLineToolTip0.mouseDrag(event3, 32, 1);
    float f7 = jMultiLineToolTip0.getAlignmentY();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 0.5f);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test156"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setName("hi!");
    int i6 = jMultiLineToolTip0.getX();
    boolean b7 = jMultiLineToolTip0.isOptimizedDrawingEnabled();
    jMultiLineToolTip0.layout();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test157"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.event.MouseEvent mouseEvent6 = null;
    java.awt.Point point7 = jMultiLineToolTip0.getToolTipLocation(mouseEvent6);
    crystal.util.JMultiLineToolTip jMultiLineToolTip9 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle10 = null;
    java.awt.Rectangle rectangle11 = jMultiLineToolTip9.getBounds(rectangle10);
    java.awt.Rectangle rectangle12 = jMultiLineToolTip9.getVisibleRect();
    boolean b13 = jMultiLineToolTip9.isEnabled();
    java.awt.Dimension dimension14 = null;
    jMultiLineToolTip9.setPreferredSize(dimension14);
    jMultiLineToolTip9.move(10, (int)(short)10);
    java.awt.Point point20 = jMultiLineToolTip9.getMousePosition(true);
    java.awt.im.InputContext inputContext21 = jMultiLineToolTip9.getInputContext();
    crystal.util.JMultiLineToolTip jMultiLineToolTip22 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle23 = null;
    java.awt.Rectangle rectangle24 = jMultiLineToolTip22.getBounds(rectangle23);
    java.awt.Event event25 = null;
    boolean b27 = jMultiLineToolTip22.action(event25, (java.lang.Object)'4');
    java.awt.Component component30 = jMultiLineToolTip22.locate((int)'4', 1);
    jMultiLineToolTip22.setFocusTraversalPolicyProvider(true);
    int i33 = jMultiLineToolTip9.getComponentZOrder((java.awt.Component)jMultiLineToolTip22);
    javax.swing.InputMap inputMap34 = jMultiLineToolTip9.getInputMap();
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.setInputMap(3, inputMap34);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputContext21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap34);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test158"); }

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
    crystal.util.JMultiLineToolTip jMultiLineToolTip28 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle29 = null;
    java.awt.Rectangle rectangle30 = jMultiLineToolTip28.getBounds(rectangle29);
    java.awt.Event event31 = null;
    boolean b33 = jMultiLineToolTip28.action(event31, (java.lang.Object)'4');
    crystal.util.JMultiLineToolTip jMultiLineToolTip34 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle35 = null;
    java.awt.Rectangle rectangle36 = jMultiLineToolTip34.getBounds(rectangle35);
    java.awt.Event event37 = null;
    boolean b39 = jMultiLineToolTip34.action(event37, (java.lang.Object)'4');
    jMultiLineToolTip28.setComponent((javax.swing.JComponent)jMultiLineToolTip34);
    crystal.util.JMultiLineToolTip jMultiLineToolTip41 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle42 = null;
    java.awt.Rectangle rectangle43 = jMultiLineToolTip41.getBounds(rectangle42);
    java.awt.Toolkit toolkit44 = jMultiLineToolTip41.getToolkit();
    jMultiLineToolTip41.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager48 = null;
    jMultiLineToolTip41.setLayout(layoutManager48);
    boolean b50 = jMultiLineToolTip41.isFocusOwner();
    boolean b51 = jMultiLineToolTip41.isShowing();
    java.awt.Graphics graphics52 = null;
    jMultiLineToolTip41.update(graphics52);
    java.awt.Component component54 = jMultiLineToolTip28.add((java.awt.Component)jMultiLineToolTip41);
    java.awt.Font font55 = null;
    jMultiLineToolTip41.setFont(font55);
    crystal.util.JMultiLineToolTip jMultiLineToolTip57 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle58 = null;
    java.awt.Rectangle rectangle59 = jMultiLineToolTip57.getBounds(rectangle58);
    java.awt.Rectangle rectangle60 = jMultiLineToolTip57.getVisibleRect();
    boolean b61 = jMultiLineToolTip57.isEnabled();
    java.awt.Event event62 = null;
    boolean b65 = jMultiLineToolTip57.mouseEnter(event62, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener66 = null;
    jMultiLineToolTip57.addPropertyChangeListener(propertyChangeListener66);
    java.awt.Point point68 = jMultiLineToolTip57.getLocation();
    jMultiLineToolTip41.setLocation(point68);
    java.awt.Component component70 = jMultiLineToolTip0.add("ERROR", (java.awt.Component)jMultiLineToolTip41);
    java.awt.event.FocusListener focusListener71 = null;
    component70.removeFocusListener(focusListener71);
    
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
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component70);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test159"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Dimension dimension5 = null;
    jMultiLineToolTip0.setPreferredSize(dimension5);
    boolean b7 = jMultiLineToolTip0.isFocusTraversable();
    crystal.util.JMultiLineToolTip jMultiLineToolTip8 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle9 = null;
    java.awt.Rectangle rectangle10 = jMultiLineToolTip8.getBounds(rectangle9);
    java.awt.Rectangle rectangle11 = jMultiLineToolTip8.getVisibleRect();
    boolean b12 = jMultiLineToolTip8.isEnabled();
    java.awt.Dimension dimension13 = null;
    jMultiLineToolTip8.setPreferredSize(dimension13);
    jMultiLineToolTip8.show();
    crystal.util.JMultiLineToolTip jMultiLineToolTip16 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle17 = null;
    java.awt.Rectangle rectangle18 = jMultiLineToolTip16.getBounds(rectangle17);
    java.awt.Rectangle rectangle19 = jMultiLineToolTip16.getVisibleRect();
    boolean b20 = jMultiLineToolTip16.isEnabled();
    java.awt.Event event21 = null;
    boolean b24 = jMultiLineToolTip16.mouseEnter(event21, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener25 = null;
    jMultiLineToolTip16.addPropertyChangeListener(propertyChangeListener25);
    jMultiLineToolTip16.setFocusTraversalPolicyProvider(false);
    jMultiLineToolTip16.repaint((long)'a');
    crystal.util.JMultiLineToolTip jMultiLineToolTip31 = new crystal.util.JMultiLineToolTip();
    boolean b32 = jMultiLineToolTip31.isFocusTraversalPolicyProvider();
    jMultiLineToolTip31.firePropertyChange("hi!", ' ', '#');
    java.awt.Dimension dimension37 = jMultiLineToolTip31.getMaximumSize();
    jMultiLineToolTip16.resize(dimension37);
    jMultiLineToolTip8.setMaximumSize(dimension37);
    jMultiLineToolTip0.setSize(dimension37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension37);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test160"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel6 = jMultiLineToolTip0.getColorModel();
    jMultiLineToolTip0.removeNotify();
    java.awt.Rectangle rectangle8 = jMultiLineToolTip0.getBounds();
    java.awt.Dimension dimension9 = jMultiLineToolTip0.getPreferredSize();
    jMultiLineToolTip0.firePropertyChange("32 ms", (double)(byte)10, (double)100);
    crystal.util.JMultiLineToolTip jMultiLineToolTip14 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle15 = null;
    java.awt.Rectangle rectangle16 = jMultiLineToolTip14.getBounds(rectangle15);
    java.awt.Event event17 = null;
    boolean b19 = jMultiLineToolTip14.action(event17, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel20 = jMultiLineToolTip14.getColorModel();
    jMultiLineToolTip14.removeNotify();
    crystal.util.JMultiLineToolTip jMultiLineToolTip22 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle23 = null;
    java.awt.Rectangle rectangle24 = jMultiLineToolTip22.getBounds(rectangle23);
    java.awt.Toolkit toolkit25 = jMultiLineToolTip22.getToolkit();
    java.awt.Font font26 = null;
    jMultiLineToolTip22.setFont(font26);
    java.awt.Color color28 = jMultiLineToolTip22.getBackground();
    jMultiLineToolTip14.setForeground(color28);
    crystal.util.JMultiLineToolTip jMultiLineToolTip30 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle31 = null;
    java.awt.Rectangle rectangle32 = jMultiLineToolTip30.getBounds(rectangle31);
    jMultiLineToolTip30.firePropertyChange("AHEAD", 0, 128);
    jMultiLineToolTip30.setBounds((int)(byte)1, (int)(byte)100, 0, (-1));
    jMultiLineToolTip30.setDoubleBuffered(false);
    javax.swing.border.Border border44 = jMultiLineToolTip30.getBorder();
    java.lang.Object obj45 = jMultiLineToolTip14.getClientProperty((java.lang.Object)border44);
    java.awt.Event event46 = null;
    boolean b49 = jMultiLineToolTip14.mouseDown(event46, 64, 128);
    java.awt.Font font50 = jMultiLineToolTip14.getFont();
    jMultiLineToolTip0.setFont(font50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(border44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font50);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test161"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.Font font4 = null;
    jMultiLineToolTip0.setFont(font4);
    java.awt.Color color6 = jMultiLineToolTip0.getBackground();
    java.awt.Toolkit toolkit7 = jMultiLineToolTip0.getToolkit();
    java.awt.Dimension dimension8 = jMultiLineToolTip0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test162"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b6 = jMultiLineToolTip0.mouseDrag(event3, 32, 1);
    java.awt.event.FocusListener[] focusListener_array7 = jMultiLineToolTip0.getFocusListeners();
    boolean b8 = jMultiLineToolTip0.isBackgroundSet();
    java.awt.Event event9 = null;
    crystal.util.JMultiLineToolTip jMultiLineToolTip10 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle11 = null;
    java.awt.Rectangle rectangle12 = jMultiLineToolTip10.getBounds(rectangle11);
    java.awt.Toolkit toolkit13 = jMultiLineToolTip10.getToolkit();
    jMultiLineToolTip10.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager17 = null;
    jMultiLineToolTip10.setLayout(layoutManager17);
    boolean b19 = jMultiLineToolTip10.isFocusOwner();
    boolean b20 = jMultiLineToolTip10.isShowing();
    jMultiLineToolTip10.transferFocusUpCycle();
    crystal.util.JMultiLineToolTip jMultiLineToolTip22 = new crystal.util.JMultiLineToolTip();
    boolean b23 = jMultiLineToolTip22.isFocusTraversalPolicyProvider();
    java.awt.Dimension dimension24 = jMultiLineToolTip22.preferredSize();
    java.awt.Dimension dimension25 = jMultiLineToolTip10.getSize(dimension24);
    boolean b26 = jMultiLineToolTip0.action(event9, (java.lang.Object)dimension25);
    java.awt.Event event27 = null;
    crystal.model.RevisionHistory.Capable capable28 = crystal.model.RevisionHistory.Capable.NOTHING;
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)capable28);
    boolean b30 = jMultiLineToolTip0.lostFocus(event27, (java.lang.Object)capable28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    org.junit.Assert.assertTrue("'" + capable28 + "' != '" + crystal.model.RevisionHistory.Capable.NOTHING + "'", capable28.equals(crystal.model.RevisionHistory.Capable.NOTHING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test163"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    crystal.util.JMultiLineToolTip jMultiLineToolTip3 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle4 = null;
    java.awt.Rectangle rectangle5 = jMultiLineToolTip3.getBounds(rectangle4);
    jMultiLineToolTip0.repaint(rectangle5);
    java.util.Locale locale7 = jMultiLineToolTip0.getLocale();
    boolean b8 = jMultiLineToolTip0.isDoubleBuffered();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test164"); }

    crystal.client.ProjectPreferences projectPreferences0 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener1 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener2 = null;
    crystal.client.CalculateProjectTask calculateProjectTask3 = new crystal.client.CalculateProjectTask(projectPreferences0, computationListener1, computationListener2);
    boolean b4 = calculateProjectTask3.isDone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test165"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Dimension dimension5 = null;
    jMultiLineToolTip0.setPreferredSize(dimension5);
    jMultiLineToolTip0.move(10, (int)(short)10);
    java.awt.event.KeyListener[] keyListener_array10 = jMultiLineToolTip0.getKeyListeners();
    java.awt.Event event11 = null;
    boolean b14 = jMultiLineToolTip0.mouseEnter(event11, 6, (int)(short)0);
    java.awt.event.MouseListener mouseListener15 = null;
    jMultiLineToolTip0.addMouseListener(mouseListener15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(keyListener_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test166"); }

    crystal.model.Relationship.MERGECLEAN = "32 ms";

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test167"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    java.awt.Dimension dimension2 = jMultiLineToolTip0.preferredSize();
    boolean b3 = jMultiLineToolTip0.isMaximumSizeSet();
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
    jMultiLineToolTip4.setDoubleBuffered(true);
    java.awt.Component[] component_array18 = jMultiLineToolTip4.getComponents();
    boolean b19 = jMultiLineToolTip4.isFocusCycleRoot();
    jMultiLineToolTip4.removeAll();
    jMultiLineToolTip4.resize((int)(short)1, (int)(byte)10);
    java.awt.Component component26 = jMultiLineToolTip4.findComponentAt(100, (int)(short)100);
    boolean b27 = jMultiLineToolTip0.isAncestorOf((java.awt.Component)jMultiLineToolTip4);
    boolean b28 = jMultiLineToolTip0.isFocusCycleRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
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
    org.junit.Assert.assertNotNull(component_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test168"); }

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
    boolean b16 = jMultiLineToolTip0.isPaintingForPrint();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener17 = null;
    jMultiLineToolTip0.addHierarchyBoundsListener(hierarchyBoundsListener17);
    java.awt.Event event19 = null;
    crystal.util.JMultiLineToolTip jMultiLineToolTip20 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle21 = null;
    java.awt.Rectangle rectangle22 = jMultiLineToolTip20.getBounds(rectangle21);
    java.awt.Event event23 = null;
    boolean b25 = jMultiLineToolTip20.action(event23, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel26 = jMultiLineToolTip20.getColorModel();
    jMultiLineToolTip20.removeNotify();
    crystal.util.JMultiLineToolTip jMultiLineToolTip28 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle29 = null;
    java.awt.Rectangle rectangle30 = jMultiLineToolTip28.getBounds(rectangle29);
    java.awt.Toolkit toolkit31 = jMultiLineToolTip28.getToolkit();
    java.awt.Font font32 = null;
    jMultiLineToolTip28.setFont(font32);
    java.awt.Color color34 = jMultiLineToolTip28.getBackground();
    jMultiLineToolTip20.setForeground(color34);
    crystal.util.JMultiLineToolTip jMultiLineToolTip36 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle37 = null;
    java.awt.Rectangle rectangle38 = jMultiLineToolTip36.getBounds(rectangle37);
    jMultiLineToolTip36.firePropertyChange("AHEAD", 0, 128);
    jMultiLineToolTip36.setBounds((int)(byte)1, (int)(byte)100, 0, (-1));
    jMultiLineToolTip36.setDoubleBuffered(false);
    javax.swing.border.Border border50 = jMultiLineToolTip36.getBorder();
    java.lang.Object obj51 = jMultiLineToolTip20.getClientProperty((java.lang.Object)border50);
    java.awt.event.HierarchyListener hierarchyListener52 = null;
    jMultiLineToolTip20.removeHierarchyListener(hierarchyListener52);
    jMultiLineToolTip20.removeNotify();
    java.awt.Dimension dimension55 = jMultiLineToolTip20.getSize();
    boolean b56 = jMultiLineToolTip0.lostFocus(event19, (java.lang.Object)jMultiLineToolTip20);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(border50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test169"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Event event5 = null;
    boolean b8 = jMultiLineToolTip0.mouseEnter(event5, (-1), (int)(byte)-1);
    jMultiLineToolTip0.hide();
    java.awt.peer.ComponentPeer componentPeer10 = jMultiLineToolTip0.getPeer();
    java.awt.event.MouseWheelListener[] mouseWheelListener_array11 = jMultiLineToolTip0.getMouseWheelListeners();
    
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
    org.junit.Assert.assertNotNull(mouseWheelListener_array11);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test170"); }

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
    crystal.client.ClientPreferences clientPreferences28 = clientPreferences4.clone();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clientPreferences28);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test171"); }

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
    javax.swing.KeyStroke keyStroke12 = null;
    int i13 = jMultiLineToolTip0.getConditionForKeyStroke(keyStroke12);
    crystal.util.JMultiLineToolTip jMultiLineToolTip14 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle15 = null;
    java.awt.Rectangle rectangle16 = jMultiLineToolTip14.getBounds(rectangle15);
    java.awt.Toolkit toolkit17 = jMultiLineToolTip14.getToolkit();
    java.awt.FocusTraversalPolicy focusTraversalPolicy18 = null;
    jMultiLineToolTip14.setFocusTraversalPolicy(focusTraversalPolicy18);
    int i20 = jMultiLineToolTip0.getComponentZOrder((java.awt.Component)jMultiLineToolTip14);
    jMultiLineToolTip14.validate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test172"); }

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
    javax.swing.KeyStroke keyStroke32 = null;
    int i33 = jMultiLineToolTip17.getConditionForKeyStroke(keyStroke32);
    
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
    org.junit.Assert.assertTrue(i33 == (-1));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test173"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b6 = jMultiLineToolTip0.mouseDrag(event3, 32, 1);
    java.awt.Graphics graphics7 = null;
    jMultiLineToolTip0.printComponents(graphics7);
    jMultiLineToolTip0.addNotify();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test174"); }

    javax.swing.ImageIcon imageIcon2 = null;
    java.awt.Image image3 = null;
    crystal.model.Relationship relationship4 = new crystal.model.Relationship("AHEAD", imageIcon2, image3);
    javax.swing.ImageIcon imageIcon7 = null;
    java.awt.Image image8 = null;
    crystal.model.Relationship relationship9 = new crystal.model.Relationship("AHEAD", imageIcon7, image8);
    relationship4.calculateAction("AHEAD", relationship9);
    javax.swing.ImageIcon imageIcon11 = relationship9.getIcon();
    crystal.util.JMultiLineToolTip jMultiLineToolTip12 = new crystal.util.JMultiLineToolTip();
    boolean b13 = jMultiLineToolTip12.isFocusTraversalPolicyProvider();
    jMultiLineToolTip12.firePropertyChange("hi!", ' ', '#');
    java.awt.image.ImageProducer imageProducer18 = null;
    java.awt.Image image19 = jMultiLineToolTip12.createImage(imageProducer18);
    crystal.model.Relationship relationship20 = new crystal.model.Relationship("ERROR", imageIcon11, image19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(imageIcon11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image19);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test175"); }

    org.jdom.Document document1 = crystal.util.XMLTools.newXMLErrorDocument("AHEAD_HG_2017-06-04T14-21-48.265-0700");
    // The following exception was thrown during execution in test generation
    try {
    boolean b3 = crystal.util.XMLTools.writeXMLDocument(document1, "");
      org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(document1);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test176"); }

    crystal.model.LocalStateResult.BUILD = "TEST";

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test177"); }

    crystal.server.AbstractLogParser.Checkpoint[] checkpoint_array0 = new crystal.server.AbstractLogParser.Checkpoint[] {  };
    java.util.LinkedHashSet<crystal.server.AbstractLogParser.Checkpoint> linkedhashset_checkpoint1 = new java.util.LinkedHashSet<crystal.server.AbstractLogParser.Checkpoint>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<crystal.server.AbstractLogParser.Checkpoint>)linkedhashset_checkpoint1, checkpoint_array0);
    java.lang.String str3 = crystal.server.GuidanceChecker.getCommitters((java.util.Set<crystal.server.AbstractLogParser.Checkpoint>)linkedhashset_checkpoint1);
    java.lang.String str4 = crystal.server.GuidanceChecker.getCommitters((java.util.Set<crystal.server.AbstractLogParser.Checkpoint>)linkedhashset_checkpoint1);
    java.lang.String str5 = crystal.server.GuidanceChecker.getCommitters((java.util.Set<crystal.server.AbstractLogParser.Checkpoint>)linkedhashset_checkpoint1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkpoint_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test178"); }

    crystal.util.ValidInputChecker.checkValidStringInput("ERROR");

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test179"); }

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
    boolean b43 = environment5.hasHistoryChanged();
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
    org.junit.Assert.assertTrue(b43 == true);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test180"); }

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
    java.awt.im.InputMethodRequests inputMethodRequests29 = jMultiLineToolTip0.getInputMethodRequests();
    java.awt.Container container30 = jMultiLineToolTip0.getTopLevelAncestor();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputMethodRequests29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container30);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test181"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.beans.VetoableChangeListener[] vetoableChangeListener_array5 = jMultiLineToolTip0.getVetoableChangeListeners();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array6 = jMultiLineToolTip0.getMouseMotionListeners();
    java.awt.event.InputMethodListener inputMethodListener7 = null;
    jMultiLineToolTip0.addInputMethodListener(inputMethodListener7);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    jMultiLineToolTip0.removePropertyChangeListener(propertyChangeListener9);
    
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
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test182"); }

    crystal.client.ProjectPreferences projectPreferences0 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener1 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener2 = null;
    crystal.client.CalculateProjectTask calculateProjectTask3 = new crystal.client.CalculateProjectTask(projectPreferences0, computationListener1, computationListener2);
    java.beans.PropertyChangeSupport propertyChangeSupport4 = calculateProjectTask3.getPropertyChangeSupport();
    calculateProjectTask3.execute();
    java.beans.PropertyChangeListener propertyChangeListener6 = null;
    calculateProjectTask3.removePropertyChangeListener(propertyChangeListener6);
    java.beans.PropertyChangeSupport propertyChangeSupport8 = calculateProjectTask3.getPropertyChangeSupport();
    crystal.util.JMultiLineToolTip jMultiLineToolTip10 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle11 = null;
    java.awt.Rectangle rectangle12 = jMultiLineToolTip10.getBounds(rectangle11);
    java.awt.Toolkit toolkit13 = jMultiLineToolTip10.getToolkit();
    jMultiLineToolTip10.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager17 = null;
    jMultiLineToolTip10.setLayout(layoutManager17);
    boolean b19 = jMultiLineToolTip10.isFocusOwner();
    boolean b20 = jMultiLineToolTip10.isShowing();
    java.awt.Graphics graphics21 = null;
    jMultiLineToolTip10.update(graphics21);
    javax.swing.KeyStroke keyStroke23 = null;
    int i24 = jMultiLineToolTip10.getConditionForKeyStroke(keyStroke23);
    crystal.util.JMultiLineToolTip jMultiLineToolTip25 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color26 = null;
    jMultiLineToolTip25.setBackground(color26);
    jMultiLineToolTip25.transferFocusBackward();
    jMultiLineToolTip25.firePropertyChange("$HOME", false, false);
    crystal.util.JMultiLineToolTip jMultiLineToolTip33 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle34 = null;
    java.awt.Rectangle rectangle35 = jMultiLineToolTip33.getBounds(rectangle34);
    jMultiLineToolTip33.firePropertyChange("AHEAD", 0, 128);
    javax.swing.InputVerifier inputVerifier40 = jMultiLineToolTip33.getInputVerifier();
    crystal.util.JMultiLineToolTip jMultiLineToolTip41 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle42 = null;
    java.awt.Rectangle rectangle43 = jMultiLineToolTip41.getBounds(rectangle42);
    java.awt.Event event44 = null;
    boolean b47 = jMultiLineToolTip41.mouseDrag(event44, 32, 1);
    java.awt.Graphics graphics48 = null;
    jMultiLineToolTip41.printComponents(graphics48);
    java.awt.Point point50 = jMultiLineToolTip41.location();
    jMultiLineToolTip33.setLocation(point50);
    java.awt.Component component52 = jMultiLineToolTip25.getComponentAt(point50);
    calculateProjectTask3.firePropertyChange("2017-06-04T14-21-48.265-0700", (java.lang.Object)jMultiLineToolTip10, (java.lang.Object)point50);
    java.beans.PropertyChangeSupport propertyChangeSupport54 = calculateProjectTask3.getPropertyChangeSupport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeSupport4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeSupport8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeSupport54);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test183"); }

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
    crystal.util.JMultiLineToolTip jMultiLineToolTip17 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle18 = null;
    java.awt.Rectangle rectangle19 = jMultiLineToolTip17.getBounds(rectangle18);
    java.awt.Rectangle rectangle20 = jMultiLineToolTip17.getVisibleRect();
    boolean b21 = jMultiLineToolTip17.isEnabled();
    java.awt.Event event22 = null;
    boolean b25 = jMultiLineToolTip17.mouseEnter(event22, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener26 = null;
    jMultiLineToolTip17.addPropertyChangeListener(propertyChangeListener26);
    java.awt.Point point28 = jMultiLineToolTip17.getLocation();
    jMultiLineToolTip17.setDoubleBuffered(true);
    java.awt.Graphics graphics31 = null;
    jMultiLineToolTip17.print(graphics31);
    jMultiLineToolTip0.setComponentZOrder((java.awt.Component)jMultiLineToolTip17, 0);
    java.awt.Graphics graphics35 = null;
    jMultiLineToolTip17.print(graphics35);
    java.lang.String str37 = jMultiLineToolTip17.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str37);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test184"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Dimension dimension5 = null;
    jMultiLineToolTip0.setPreferredSize(dimension5);
    jMultiLineToolTip0.show();
    jMultiLineToolTip0.paintImmediately((int)(byte)0, (int)(byte)100, 9, 1);
    java.awt.Component component15 = jMultiLineToolTip0.getComponentAt(0, 7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component15);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test185"); }

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
    javax.swing.KeyStroke keyStroke57 = null;
    jMultiLineToolTip43.unregisterKeyboardAction(keyStroke57);
    
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
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test186"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip0.firePropertyChange("", (double)0L, 0.0d);
    boolean b5 = jMultiLineToolTip0.getIgnoreRepaint();
    jMultiLineToolTip0.enable();
    jMultiLineToolTip0.disable();
    int i8 = jMultiLineToolTip0.countComponents();
    jMultiLineToolTip0.requestFocus();
    jMultiLineToolTip0.firePropertyChange("$HOME", (byte)10, (byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test187"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.Font font4 = null;
    jMultiLineToolTip0.setFont(font4);
    javax.swing.KeyStroke[] keyStroke_array6 = jMultiLineToolTip0.getRegisteredKeyStrokes();
    boolean b7 = jMultiLineToolTip0.isFocusTraversalPolicySet();
    java.lang.String str8 = jMultiLineToolTip0.toString();
    java.awt.event.MouseListener mouseListener9 = null;
    jMultiLineToolTip0.addMouseListener(mouseListener9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(keyStroke_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test188"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color1 = null;
    jMultiLineToolTip0.setBackground(color1);
    jMultiLineToolTip0.enable();

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test189"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.ComponentOrientation componentOrientation7 = jMultiLineToolTip0.getComponentOrientation();
    java.awt.Dimension dimension8 = jMultiLineToolTip0.getMinimumSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentOrientation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test190"); }

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
    boolean b16 = jMultiLineToolTip0.isRequestFocusEnabled();
    
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
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test191"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color1 = null;
    jMultiLineToolTip0.setBackground(color1);
    jMultiLineToolTip0.transferFocusBackward();
    jMultiLineToolTip0.firePropertyChange("$HOME", false, false);
    javax.swing.JPopupMenu jPopupMenu8 = jMultiLineToolTip0.getComponentPopupMenu();
    // The following exception was thrown during execution in test generation
    try {
    jPopupMenu8.enable();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jPopupMenu8);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test192"); }

    crystal.model.Relationship.BEHIND = "AHEAD_HG_2017-06-04T14-21-48.265-0700";

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test193"); }

    crystal.util.LSMRLogger.LOG_PATTERN_FAST = "cannot compute hg action";

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test194"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    jMultiLineToolTip0.firePropertyChange("AHEAD", 0, 128);
    jMultiLineToolTip0.setBounds((int)(byte)1, (int)(byte)100, 0, (-1));
    java.lang.String str12 = jMultiLineToolTip0.toString();
    jMultiLineToolTip0.resize(7, (int)'4');
    javax.swing.border.Border border16 = jMultiLineToolTip0.getBorder();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(border16);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test195"); }

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
    java.awt.Component[] component_array14 = jMultiLineToolTip0.getComponents();
    jMultiLineToolTip0.firePropertyChange("PENDING", (int)'#', (int)(short)0);
    int i19 = jMultiLineToolTip0.countComponents();
    boolean b20 = jMultiLineToolTip0.isValid();
    crystal.util.JMultiLineToolTip jMultiLineToolTip21 = new crystal.util.JMultiLineToolTip();
    boolean b22 = jMultiLineToolTip21.isFocusTraversalPolicyProvider();
    jMultiLineToolTip21.setSize((int)' ', (-1));
    java.awt.GraphicsConfiguration graphicsConfiguration26 = jMultiLineToolTip21.getGraphicsConfiguration();
    java.awt.GraphicsConfiguration graphicsConfiguration27 = jMultiLineToolTip21.getGraphicsConfiguration();
    boolean b28 = jMultiLineToolTip0.isAncestorOf((java.awt.Component)jMultiLineToolTip21);
    
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
    org.junit.Assert.assertNotNull(component_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphicsConfiguration26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphicsConfiguration27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test196"); }

    javax.swing.ImageIcon imageIcon1 = null;
    java.awt.Image image2 = null;
    crystal.model.Relationship relationship3 = new crystal.model.Relationship("AHEAD", imageIcon1, image2);
    javax.swing.ImageIcon imageIcon6 = null;
    java.awt.Image image7 = null;
    crystal.model.Relationship relationship8 = new crystal.model.Relationship("AHEAD", imageIcon6, image7);
    relationship3.calculateAction("AHEAD", relationship8);
    crystal.model.RevisionHistory.Capable capable10 = crystal.model.RevisionHistory.Capable.MUST;
    relationship8.setCapable(capable10);
    crystal.model.DataSource.RepoKind repoKind16 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment19 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind16, false, "hi!");
    crystal.model.Environment environment22 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind16, true, "PENDING");
    java.lang.String str23 = relationship8.getAction(repoKind16);
    crystal.model.RevisionHistory.Capable capable24 = relationship8.getCapable();
    java.lang.String str25 = relationship8.getName();
    org.junit.Assert.assertTrue("'" + capable10 + "' != '" + crystal.model.RevisionHistory.Capable.MUST + "'", capable10.equals(crystal.model.RevisionHistory.Capable.MUST));
    org.junit.Assert.assertTrue("'" + repoKind16 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind16.equals(crystal.model.DataSource.RepoKind.HG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "cannot compute hg action"+ "'", str23.equals("cannot compute hg action"));
    org.junit.Assert.assertTrue("'" + capable24 + "' != '" + crystal.model.RevisionHistory.Capable.MUST + "'", capable24.equals(crystal.model.RevisionHistory.Capable.MUST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "AHEAD"+ "'", str25.equals("AHEAD"));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test197"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    jMultiLineToolTip0.setSize((int)' ', (-1));
    jMultiLineToolTip0.firePropertyChange("", (byte)100, (byte)-1);
    java.awt.Dimension dimension9 = jMultiLineToolTip0.getMinimumSize();
    crystal.util.JMultiLineToolTip jMultiLineToolTip10 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle11 = null;
    java.awt.Rectangle rectangle12 = jMultiLineToolTip10.getBounds(rectangle11);
    java.awt.Event event13 = null;
    boolean b15 = jMultiLineToolTip10.action(event13, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel16 = jMultiLineToolTip10.getColorModel();
    jMultiLineToolTip10.removeNotify();
    java.awt.Rectangle rectangle18 = jMultiLineToolTip10.getBounds();
    java.awt.Dimension dimension19 = jMultiLineToolTip10.getPreferredSize();
    java.awt.Dimension dimension20 = jMultiLineToolTip0.getSize(dimension19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension20);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test198"); }

    javax.swing.ImageIcon imageIcon1 = null;
    java.awt.Image image2 = null;
    crystal.model.Relationship relationship3 = new crystal.model.Relationship("AHEAD", imageIcon1, image2);
    javax.swing.ImageIcon imageIcon6 = null;
    java.awt.Image image7 = null;
    crystal.model.Relationship relationship8 = new crystal.model.Relationship("AHEAD", imageIcon6, image7);
    relationship3.calculateAction("AHEAD", relationship8);
    crystal.model.RevisionHistory.When when10 = crystal.model.RevisionHistory.When.LATER;
    relationship3.setWhen(when10);
    javax.swing.ImageIcon imageIcon12 = relationship3.getIcon();
    java.lang.String str13 = relationship3.getToolTipText();
    org.junit.Assert.assertTrue("'" + when10 + "' != '" + crystal.model.RevisionHistory.When.LATER + "'", when10.equals(crystal.model.RevisionHistory.When.LATER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(imageIcon12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test199"); }

    crystal.client.ConflictDaemon conflictDaemon0 = crystal.client.ConflictDaemon.getInstance();
    java.util.Collection<crystal.model.LocalStateResult> collection_localStateResult1 = conflictDaemon0.getLocalStates();
    java.util.Collection<crystal.model.LocalStateResult> collection_localStateResult2 = conflictDaemon0.getLocalStates();
    crystal.client.ClientPreferences clientPreferences7 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences8 = null;
    clientPreferences7.addProjectPreferences(projectPreferences8);
    crystal.client.ProjectPreferences projectPreferences10 = null;
    clientPreferences7.removeProjectPreferences(projectPreferences10);
    crystal.client.ClientPreferences clientPreferences12 = clientPreferences7.clone();
    conflictDaemon0.prePerformCalculations(clientPreferences7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(conflictDaemon0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_localStateResult1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_localStateResult2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clientPreferences12);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test200"); }

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
    java.awt.Event event44 = null;
    boolean b47 = jMultiLineToolTip13.mouseDown(event44, 11, (int)(byte)-1);
    java.awt.Container container48 = jMultiLineToolTip13.getFocusCycleRootAncestor();
    
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
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container48);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test201"); }

    crystal.client.ConflictDaemon conflictDaemon0 = crystal.client.ConflictDaemon.getInstance();
    conflictDaemon0.enable(true);
    conflictDaemon0.removeAllListeners();
    conflictDaemon0.removeAllListeners();
    conflictDaemon0.removeAllListeners();
    boolean b6 = conflictDaemon0.isEnabled();
    conflictDaemon0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(conflictDaemon0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test202"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager7 = null;
    jMultiLineToolTip0.setLayout(layoutManager7);
    java.awt.event.InputMethodListener inputMethodListener9 = null;
    jMultiLineToolTip0.removeInputMethodListener(inputMethodListener9);
    crystal.util.JMultiLineToolTip jMultiLineToolTip11 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle12 = null;
    java.awt.Rectangle rectangle13 = jMultiLineToolTip11.getBounds(rectangle12);
    jMultiLineToolTip11.firePropertyChange("AHEAD", 0, 128);
    jMultiLineToolTip11.setBounds((int)(byte)1, (int)(byte)100, 0, (-1));
    jMultiLineToolTip11.setDoubleBuffered(false);
    javax.swing.border.Border border25 = jMultiLineToolTip11.getBorder();
    boolean b26 = jMultiLineToolTip11.isForegroundSet();
    boolean b27 = jMultiLineToolTip11.isVisible();
    jMultiLineToolTip11.firePropertyChange("ToolTipText", '4', '4');
    crystal.util.JMultiLineToolTip jMultiLineToolTip32 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle33 = null;
    java.awt.Rectangle rectangle34 = jMultiLineToolTip32.getBounds(rectangle33);
    java.awt.Toolkit toolkit35 = jMultiLineToolTip32.getToolkit();
    java.awt.Font font36 = null;
    jMultiLineToolTip32.setFont(font36);
    javax.swing.KeyStroke[] keyStroke_array38 = jMultiLineToolTip32.getRegisteredKeyStrokes();
    boolean b39 = jMultiLineToolTip32.isFocusTraversalPolicySet();
    jMultiLineToolTip0.putClientProperty((java.lang.Object)'4', (java.lang.Object)b39);
    jMultiLineToolTip0.setDebugGraphicsOptions((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(border25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(keyStroke_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test203"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ClientPreferences clientPreferences5 = clientPreferences4.clone();
    clientPreferences5.setChanged(false);
    long long8 = clientPreferences5.getRefresh();
    java.lang.String str9 = clientPreferences5.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clientPreferences5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 32L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test204"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    int i4 = jMultiLineToolTip0.countComponents();
    java.awt.Graphics graphics5 = null;
    jMultiLineToolTip0.printAll(graphics5);
    crystal.util.JMultiLineToolTip jMultiLineToolTip7 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle8 = null;
    java.awt.Rectangle rectangle9 = jMultiLineToolTip7.getBounds(rectangle8);
    java.awt.Rectangle rectangle10 = jMultiLineToolTip7.getVisibleRect();
    boolean b11 = jMultiLineToolTip7.isEnabled();
    java.awt.Event event12 = null;
    boolean b15 = jMultiLineToolTip7.mouseEnter(event12, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener16 = null;
    jMultiLineToolTip7.addPropertyChangeListener(propertyChangeListener16);
    java.awt.Point point18 = jMultiLineToolTip7.getLocation();
    jMultiLineToolTip7.setDoubleBuffered(true);
    java.awt.Component[] component_array21 = jMultiLineToolTip7.getComponents();
    java.awt.Component component22 = jMultiLineToolTip0.add((java.awt.Component)jMultiLineToolTip7);
    jMultiLineToolTip0.repaint(2, (int)' ', (int)(short)10, (int)(byte)10);
    jMultiLineToolTip0.repaint(6, (int)'4', 11, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component22);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test205"); }

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
    jMultiLineToolTip12.setName("hi!");
    javax.swing.ImageIcon imageIcon19 = null;
    java.awt.Image image20 = null;
    crystal.model.Relationship relationship21 = new crystal.model.Relationship("AHEAD", imageIcon19, image20);
    crystal.util.JMultiLineToolTip jMultiLineToolTip22 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle23 = null;
    java.awt.Rectangle rectangle24 = jMultiLineToolTip22.getBounds(rectangle23);
    java.awt.Rectangle rectangle25 = jMultiLineToolTip22.getVisibleRect();
    boolean b26 = jMultiLineToolTip22.isEnabled();
    java.awt.Event event27 = null;
    boolean b30 = jMultiLineToolTip22.mouseEnter(event27, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener31 = null;
    jMultiLineToolTip22.addPropertyChangeListener(propertyChangeListener31);
    java.awt.Point point33 = jMultiLineToolTip22.getLocation();
    boolean b34 = relationship21.equals((java.lang.Object)jMultiLineToolTip22);
    java.awt.Image image35 = relationship21.getImage();
    boolean b41 = jMultiLineToolTip12.imageUpdate(image35, 32, (int)(short)1, (int)(short)100, 128, 9);
    // The following exception was thrown during execution in test generation
    try {
    crystal.model.Relationship relationship42 = new crystal.model.Relationship("Action: hg merge", imageIcon11, image35);
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
    org.junit.Assert.assertNotNull(rectangle24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test206"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.Font font4 = null;
    jMultiLineToolTip0.setFont(font4);
    int i6 = jMultiLineToolTip0.getY();
    java.awt.Graphics graphics7 = null;
    jMultiLineToolTip0.printAll(graphics7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test207"); }

    crystal.client.ClientPreferences.REFRESH = (short)10;

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test208"); }

    crystal.model.DataSource.RepoKind repoKind6 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment9 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind6, false, "hi!");
    crystal.model.Environment environment12 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind6, true, "PENDING");
    crystal.model.DataSource dataSource15 = new crystal.model.DataSource("ToolTipUI", "415725 hours 21 min", repoKind6, true, "415725 hours 21 min");
    crystal.model.DataSource dataSource16 = dataSource15.clone();
    boolean b17 = dataSource16.isHidden();
    org.junit.Assert.assertTrue("'" + repoKind6 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind6.equals(crystal.model.DataSource.RepoKind.HG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dataSource16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test209"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    jMultiLineToolTip0.setSize((int)' ', (-1));
    java.awt.GraphicsConfiguration graphicsConfiguration5 = jMultiLineToolTip0.getGraphicsConfiguration();
    jMultiLineToolTip0.setVerifyInputWhenFocusTarget(true);
    java.awt.Point point8 = jMultiLineToolTip0.getMousePosition();
    java.lang.String str9 = jMultiLineToolTip0.getTipText();
    crystal.util.JMultiLineToolTip jMultiLineToolTip10 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle11 = null;
    java.awt.Rectangle rectangle12 = jMultiLineToolTip10.getBounds(rectangle11);
    java.awt.Toolkit toolkit13 = jMultiLineToolTip10.getToolkit();
    jMultiLineToolTip10.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager17 = null;
    jMultiLineToolTip10.setLayout(layoutManager17);
    boolean b19 = jMultiLineToolTip10.isFocusOwner();
    boolean b20 = jMultiLineToolTip10.isShowing();
    jMultiLineToolTip10.transferFocusUpCycle();
    crystal.util.JMultiLineToolTip jMultiLineToolTip22 = new crystal.util.JMultiLineToolTip();
    boolean b23 = jMultiLineToolTip22.isFocusTraversalPolicyProvider();
    java.awt.Dimension dimension24 = jMultiLineToolTip22.preferredSize();
    java.awt.Dimension dimension25 = jMultiLineToolTip10.getSize(dimension24);
    java.lang.Object obj26 = jMultiLineToolTip0.getClientProperty((java.lang.Object)dimension25);
    int i27 = jMultiLineToolTip0.getWidth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphicsConfiguration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 32);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test210"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    jMultiLineToolTip0.firePropertyChange("hi!", ' ', '#');
    java.lang.Object obj6 = jMultiLineToolTip0.getTreeLock();
    jMultiLineToolTip0.transferFocusBackward();
    jMultiLineToolTip0.grabFocus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test211"); }

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
    jMultiLineToolTip43.setVisible(true);
    
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
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test212"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.util.JMultiLineToolTip jMultiLineToolTip5 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle6 = null;
    java.awt.Rectangle rectangle7 = jMultiLineToolTip5.getBounds(rectangle6);
    java.awt.Rectangle rectangle8 = jMultiLineToolTip5.getVisibleRect();
    boolean b9 = jMultiLineToolTip5.isEnabled();
    java.beans.VetoableChangeListener[] vetoableChangeListener_array10 = jMultiLineToolTip5.getVetoableChangeListeners();
    boolean b11 = clientPreferences4.equals((java.lang.Object)vetoableChangeListener_array10);
    crystal.client.ClientPreferences.savePreferencesToXML(clientPreferences4, "415725 hours 22 min");
    
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

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test213"); }

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
    boolean b15 = jMultiLineToolTip0.isFontSet();
    javax.swing.ActionMap actionMap16 = null;
    jMultiLineToolTip0.setActionMap(actionMap16);
    crystal.util.JMultiLineToolTip jMultiLineToolTip18 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle19 = null;
    java.awt.Rectangle rectangle20 = jMultiLineToolTip18.getBounds(rectangle19);
    java.awt.Event event21 = null;
    boolean b24 = jMultiLineToolTip18.mouseDrag(event21, 32, 1);
    java.awt.Graphics graphics25 = null;
    jMultiLineToolTip18.printComponents(graphics25);
    java.awt.Point point27 = jMultiLineToolTip18.location();
    java.awt.Component component28 = jMultiLineToolTip0.getComponentAt(point27);
    boolean b29 = jMultiLineToolTip0.isFocusTraversable();
    
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
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test214"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener4 = null;
    jMultiLineToolTip0.addHierarchyBoundsListener(hierarchyBoundsListener4);
    int i6 = jMultiLineToolTip0.getFixedWidth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test215"); }

    crystal.client.ConflictDaemon conflictDaemon0 = crystal.client.ConflictDaemon.getInstance();
    conflictDaemon0.enable(true);
    java.util.Collection<crystal.model.Relationship> collection_relationship3 = conflictDaemon0.getRelationships();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(conflictDaemon0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_relationship3);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test216"); }

    crystal.model.Relationship.COMPILECONFLICT = "AHEAD_HG_2017-06-04T14-21-48.265-0700";

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test217"); }

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
    java.awt.Component[] component_array14 = jMultiLineToolTip0.getComponents();
    jMultiLineToolTip0.firePropertyChange("PENDING", (int)'#', (int)(short)0);
    int i19 = jMultiLineToolTip0.countComponents();
    java.awt.Event event20 = null;
    crystal.util.JMultiLineToolTip jMultiLineToolTip21 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle22 = null;
    java.awt.Rectangle rectangle23 = jMultiLineToolTip21.getBounds(rectangle22);
    java.awt.Event event24 = null;
    boolean b26 = jMultiLineToolTip21.action(event24, (java.lang.Object)'4');
    crystal.util.JMultiLineToolTip jMultiLineToolTip27 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle28 = null;
    java.awt.Rectangle rectangle29 = jMultiLineToolTip27.getBounds(rectangle28);
    java.awt.Event event30 = null;
    boolean b32 = jMultiLineToolTip27.action(event30, (java.lang.Object)'4');
    jMultiLineToolTip21.setComponent((javax.swing.JComponent)jMultiLineToolTip27);
    crystal.util.JMultiLineToolTip jMultiLineToolTip34 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle35 = null;
    java.awt.Rectangle rectangle36 = jMultiLineToolTip34.getBounds(rectangle35);
    java.awt.Toolkit toolkit37 = jMultiLineToolTip34.getToolkit();
    jMultiLineToolTip34.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager41 = null;
    jMultiLineToolTip34.setLayout(layoutManager41);
    boolean b43 = jMultiLineToolTip34.isFocusOwner();
    boolean b44 = jMultiLineToolTip34.isShowing();
    java.awt.Graphics graphics45 = null;
    jMultiLineToolTip34.update(graphics45);
    java.awt.Component component47 = jMultiLineToolTip21.add((java.awt.Component)jMultiLineToolTip34);
    crystal.util.JMultiLineToolTip jMultiLineToolTip49 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle50 = null;
    java.awt.Rectangle rectangle51 = jMultiLineToolTip49.getBounds(rectangle50);
    java.awt.Event event52 = null;
    boolean b54 = jMultiLineToolTip49.action(event52, (java.lang.Object)'4');
    crystal.util.JMultiLineToolTip jMultiLineToolTip55 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle56 = null;
    java.awt.Rectangle rectangle57 = jMultiLineToolTip55.getBounds(rectangle56);
    java.awt.Event event58 = null;
    boolean b60 = jMultiLineToolTip55.action(event58, (java.lang.Object)'4');
    jMultiLineToolTip49.setComponent((javax.swing.JComponent)jMultiLineToolTip55);
    crystal.util.JMultiLineToolTip jMultiLineToolTip62 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle63 = null;
    java.awt.Rectangle rectangle64 = jMultiLineToolTip62.getBounds(rectangle63);
    java.awt.Toolkit toolkit65 = jMultiLineToolTip62.getToolkit();
    jMultiLineToolTip62.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager69 = null;
    jMultiLineToolTip62.setLayout(layoutManager69);
    boolean b71 = jMultiLineToolTip62.isFocusOwner();
    boolean b72 = jMultiLineToolTip62.isShowing();
    java.awt.Graphics graphics73 = null;
    jMultiLineToolTip62.update(graphics73);
    java.awt.Component component75 = jMultiLineToolTip49.add((java.awt.Component)jMultiLineToolTip62);
    java.awt.Font font76 = null;
    jMultiLineToolTip62.setFont(font76);
    crystal.util.JMultiLineToolTip jMultiLineToolTip78 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle79 = null;
    java.awt.Rectangle rectangle80 = jMultiLineToolTip78.getBounds(rectangle79);
    java.awt.Rectangle rectangle81 = jMultiLineToolTip78.getVisibleRect();
    boolean b82 = jMultiLineToolTip78.isEnabled();
    java.awt.Event event83 = null;
    boolean b86 = jMultiLineToolTip78.mouseEnter(event83, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener87 = null;
    jMultiLineToolTip78.addPropertyChangeListener(propertyChangeListener87);
    java.awt.Point point89 = jMultiLineToolTip78.getLocation();
    jMultiLineToolTip62.setLocation(point89);
    java.awt.Component component91 = jMultiLineToolTip21.add("ERROR", (java.awt.Component)jMultiLineToolTip62);
    boolean b92 = jMultiLineToolTip0.gotFocus(event20, (java.lang.Object)component91);
    component91.enableInputMethods(true);
    
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
    org.junit.Assert.assertNotNull(component_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test218"); }

    javax.swing.ImageIcon imageIcon3 = null;
    java.awt.Image image4 = null;
    crystal.model.Relationship relationship5 = new crystal.model.Relationship("AHEAD", imageIcon3, image4);
    javax.swing.ImageIcon imageIcon8 = null;
    java.awt.Image image9 = null;
    crystal.model.Relationship relationship10 = new crystal.model.Relationship("AHEAD", imageIcon8, image9);
    relationship5.calculateAction("AHEAD", relationship10);
    crystal.model.DataSource.RepoKind repoKind18 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment21 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind18, false, "hi!");
    crystal.model.Environment environment24 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind18, true, "PENDING");
    crystal.model.DataSource dataSource27 = new crystal.model.DataSource("ToolTipUI", "415725 hours 21 min", repoKind18, true, "415725 hours 21 min");
    java.lang.String str28 = relationship10.getAction(repoKind18);
    crystal.model.DataSource dataSource31 = new crystal.model.DataSource("cannot compute hg action", "%5p - %m%n", repoKind18, false, "ERROR");
    java.lang.String str32 = dataSource31.getParent();
    java.lang.String str33 = dataSource31.getCloneString();
    org.junit.Assert.assertTrue("'" + repoKind18 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind18.equals(crystal.model.DataSource.RepoKind.HG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "cannot compute hg action"+ "'", str28.equals("cannot compute hg action"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "ERROR"+ "'", str32.equals("ERROR"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "%5p - %m%n"+ "'", str33.equals("%5p - %m%n"));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test219"); }

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
    java.awt.event.ContainerListener containerListener16 = null;
    jMultiLineToolTip0.addContainerListener(containerListener16);
    boolean b18 = jMultiLineToolTip0.isPaintingForPrint();
    
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
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test220"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel6 = jMultiLineToolTip0.getColorModel();
    jMultiLineToolTip0.removeNotify();
    java.awt.Graphics graphics8 = null;
    jMultiLineToolTip0.update(graphics8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel6);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test221"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ClientPreferences clientPreferences5 = clientPreferences4.clone();
    crystal.client.ClientPreferences.DEFAULT_CLIENT_PREFERENCES = clientPreferences4;
    crystal.client.ProjectPreferences projectPreferences7 = null;
    clientPreferences4.addProjectPreferences(projectPreferences7);
    crystal.client.ProjectPreferences projectPreferences9 = null;
    // The following exception was thrown during execution in test generation
    try {
    crystal.client.DataSourceGuiEditorFrame dataSourceGuiEditorFrame11 = new crystal.client.DataSourceGuiEditorFrame(clientPreferences4, projectPreferences9, "%5p - %m%n");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clientPreferences5);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test222"); }

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
    java.awt.im.InputMethodRequests inputMethodRequests29 = jMultiLineToolTip0.getInputMethodRequests();
    crystal.util.JMultiLineToolTip jMultiLineToolTip30 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle31 = null;
    java.awt.Rectangle rectangle32 = jMultiLineToolTip30.getBounds(rectangle31);
    java.awt.Toolkit toolkit33 = jMultiLineToolTip30.getToolkit();
    java.awt.Font font34 = null;
    jMultiLineToolTip30.setFont(font34);
    java.awt.Color color36 = jMultiLineToolTip30.getBackground();
    crystal.util.JMultiLineToolTip jMultiLineToolTip37 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle38 = null;
    java.awt.Rectangle rectangle39 = jMultiLineToolTip37.getBounds(rectangle38);
    crystal.util.JMultiLineToolTip jMultiLineToolTip40 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle41 = null;
    java.awt.Rectangle rectangle42 = jMultiLineToolTip40.getBounds(rectangle41);
    jMultiLineToolTip37.repaint(rectangle42);
    java.awt.Rectangle rectangle44 = jMultiLineToolTip30.getBounds(rectangle42);
    jMultiLineToolTip0.repaint(rectangle44);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputMethodRequests29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle44);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test223"); }

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
    java.awt.Rectangle rectangle13 = null;
    java.awt.Rectangle rectangle14 = jMultiLineToolTip12.getBounds(rectangle13);
    java.awt.Toolkit toolkit15 = jMultiLineToolTip12.getToolkit();
    java.awt.Font font16 = null;
    jMultiLineToolTip12.setFont(font16);
    java.awt.Color color18 = jMultiLineToolTip12.getBackground();
    jMultiLineToolTip0.setForeground(color18);
    boolean b20 = jMultiLineToolTip0.isShowing();
    java.beans.PropertyChangeListener[] propertyChangeListener_array21 = jMultiLineToolTip0.getPropertyChangeListeners();
    jMultiLineToolTip0.show(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array21);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test224"); }

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
    java.awt.event.ContainerListener containerListener16 = null;
    jMultiLineToolTip0.addContainerListener(containerListener16);
    java.awt.event.ContainerListener[] containerListener_array18 = jMultiLineToolTip0.getContainerListeners();
    java.awt.Toolkit toolkit19 = jMultiLineToolTip0.getToolkit();
    
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
    org.junit.Assert.assertNotNull(containerListener_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit19);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test225"); }

    crystal.util.LSMRLogger.LOG_PATTERN_FAST = "32 ms";

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test226"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Rectangle rectangle3 = jMultiLineToolTip0.getVisibleRect();
    boolean b4 = jMultiLineToolTip0.isEnabled();
    java.awt.Dimension dimension5 = null;
    jMultiLineToolTip0.setPreferredSize(dimension5);
    jMultiLineToolTip0.show();
    jMultiLineToolTip0.disable();
    crystal.util.JMultiLineToolTip jMultiLineToolTip9 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle10 = null;
    java.awt.Rectangle rectangle11 = jMultiLineToolTip9.getBounds(rectangle10);
    java.awt.Toolkit toolkit12 = jMultiLineToolTip9.getToolkit();
    java.awt.Font font13 = null;
    jMultiLineToolTip9.setFont(font13);
    java.awt.Color color15 = jMultiLineToolTip9.getBackground();
    java.awt.Toolkit toolkit16 = jMultiLineToolTip9.getToolkit();
    jMultiLineToolTip0.setComponentZOrder((java.awt.Component)jMultiLineToolTip9, (int)(short)1);
    boolean b19 = jMultiLineToolTip9.isFocusable();
    java.awt.Insets insets20 = jMultiLineToolTip9.getInsets();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets20);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test227"); }

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
    java.awt.Cursor cursor15 = null;
    jMultiLineToolTip0.setCursor(cursor15);
    java.awt.event.MouseWheelListener[] mouseWheelListener_array17 = jMultiLineToolTip0.getMouseWheelListeners();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseWheelListener_array17);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test228"); }

    boolean b0 = javax.swing.JFrame.isDefaultLookAndFeelDecorated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b0 == false);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test229"); }

    boolean b1 = crystal.util.ValidInputChecker.checkStringToLong("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test230"); }

    javax.swing.ImageIcon imageIcon3 = null;
    java.awt.Image image4 = null;
    crystal.model.Relationship relationship5 = new crystal.model.Relationship("AHEAD", imageIcon3, image4);
    javax.swing.ImageIcon imageIcon8 = null;
    java.awt.Image image9 = null;
    crystal.model.Relationship relationship10 = new crystal.model.Relationship("AHEAD", imageIcon8, image9);
    relationship5.calculateAction("AHEAD", relationship10);
    crystal.model.DataSource.RepoKind repoKind18 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment21 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind18, false, "hi!");
    crystal.model.Environment environment24 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind18, true, "PENDING");
    crystal.model.DataSource dataSource27 = new crystal.model.DataSource("ToolTipUI", "415725 hours 21 min", repoKind18, true, "415725 hours 21 min");
    java.lang.String str28 = relationship10.getAction(repoKind18);
    crystal.model.DataSource dataSource31 = new crystal.model.DataSource("cannot compute hg action", "%5p - %m%n", repoKind18, false, "ERROR");
    java.lang.String str32 = dataSource31.getTestCommand();
    dataSource31.hide(false);
    org.junit.Assert.assertTrue("'" + repoKind18 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind18.equals(crystal.model.DataSource.RepoKind.HG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "cannot compute hg action"+ "'", str28.equals("cannot compute hg action"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test231"); }

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
    crystal.util.JMultiLineToolTip jMultiLineToolTip18 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle19 = null;
    java.awt.Rectangle rectangle20 = jMultiLineToolTip18.getBounds(rectangle19);
    java.awt.Event event21 = null;
    boolean b23 = jMultiLineToolTip18.action(event21, (java.lang.Object)'4');
    crystal.util.JMultiLineToolTip jMultiLineToolTip24 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle25 = null;
    java.awt.Rectangle rectangle26 = jMultiLineToolTip24.getBounds(rectangle25);
    java.awt.Event event27 = null;
    boolean b29 = jMultiLineToolTip24.action(event27, (java.lang.Object)'4');
    jMultiLineToolTip18.setComponent((javax.swing.JComponent)jMultiLineToolTip24);
    boolean b31 = jMultiLineToolTip24.isVisible();
    jMultiLineToolTip24.setVisible(false);
    java.awt.Event event34 = null;
    crystal.util.JMultiLineToolTip jMultiLineToolTip35 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle36 = null;
    java.awt.Rectangle rectangle37 = jMultiLineToolTip35.getBounds(rectangle36);
    java.awt.Toolkit toolkit38 = jMultiLineToolTip35.getToolkit();
    jMultiLineToolTip35.setSize(32, (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener43 = null;
    jMultiLineToolTip35.removePropertyChangeListener("415725 hours 21 min", propertyChangeListener43);
    java.awt.event.KeyListener keyListener45 = null;
    jMultiLineToolTip35.removeKeyListener(keyListener45);
    jMultiLineToolTip35.setFocusTraversalKeysEnabled(true);
    boolean b49 = jMultiLineToolTip24.lostFocus(event34, (java.lang.Object)jMultiLineToolTip35);
    crystal.util.JMultiLineToolTip jMultiLineToolTip50 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle51 = null;
    java.awt.Rectangle rectangle52 = jMultiLineToolTip50.getBounds(rectangle51);
    java.awt.Toolkit toolkit53 = jMultiLineToolTip50.getToolkit();
    int i54 = jMultiLineToolTip50.countComponents();
    jMultiLineToolTip0.add((java.awt.Component)jMultiLineToolTip35, (java.lang.Object)jMultiLineToolTip50);
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener56 = null;
    jMultiLineToolTip35.addHierarchyBoundsListener(hierarchyBoundsListener56);
    
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
    org.junit.Assert.assertNotNull(rectangle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test232"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip0.firePropertyChange("", (double)0L, 0.0d);
    java.beans.PropertyChangeListener propertyChangeListener6 = null;
    jMultiLineToolTip0.removePropertyChangeListener("0 ms", propertyChangeListener6);
    javax.swing.event.AncestorListener ancestorListener8 = null;
    jMultiLineToolTip0.addAncestorListener(ancestorListener8);
    java.awt.event.MouseEvent mouseEvent10 = null;
    java.lang.String str11 = jMultiLineToolTip0.getToolTipText(mouseEvent10);
    jMultiLineToolTip0.removeNotify();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test233"); }

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
    boolean b15 = jMultiLineToolTip0.isFontSet();
    javax.swing.ActionMap actionMap16 = null;
    jMultiLineToolTip0.setActionMap(actionMap16);
    crystal.util.JMultiLineToolTip jMultiLineToolTip18 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle19 = null;
    java.awt.Rectangle rectangle20 = jMultiLineToolTip18.getBounds(rectangle19);
    java.awt.Event event21 = null;
    boolean b24 = jMultiLineToolTip18.mouseDrag(event21, 32, 1);
    java.awt.Graphics graphics25 = null;
    jMultiLineToolTip18.printComponents(graphics25);
    java.awt.Point point27 = jMultiLineToolTip18.location();
    java.awt.Component component28 = jMultiLineToolTip0.getComponentAt(point27);
    java.awt.Event event29 = null;
    boolean b32 = jMultiLineToolTip0.mouseDrag(event29, 5, 64);
    java.beans.PropertyChangeListener propertyChangeListener34 = null;
    jMultiLineToolTip0.addPropertyChangeListener("$HOME", propertyChangeListener34);
    javax.swing.InputVerifier inputVerifier36 = null;
    jMultiLineToolTip0.setInputVerifier(inputVerifier36);
    
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
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test234"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b6 = jMultiLineToolTip0.mouseDrag(event3, 32, 1);
    java.awt.Graphics graphics7 = null;
    jMultiLineToolTip0.printComponents(graphics7);
    java.awt.Point point9 = jMultiLineToolTip0.location();
    boolean b10 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)jMultiLineToolTip0);
    jMultiLineToolTip0.revalidate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test235"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    crystal.util.JMultiLineToolTip jMultiLineToolTip3 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle4 = null;
    java.awt.Rectangle rectangle5 = jMultiLineToolTip3.getBounds(rectangle4);
    jMultiLineToolTip0.repaint(rectangle5);
    jMultiLineToolTip0.transferFocusDownCycle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test236"); }

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
    boolean b18 = jMultiLineToolTip8.isDoubleBuffered();
    crystal.util.JMultiLineToolTip jMultiLineToolTip19 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle20 = null;
    java.awt.Rectangle rectangle21 = jMultiLineToolTip19.getBounds(rectangle20);
    crystal.util.JMultiLineToolTip jMultiLineToolTip22 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle23 = null;
    java.awt.Rectangle rectangle24 = jMultiLineToolTip22.getBounds(rectangle23);
    jMultiLineToolTip19.repaint(rectangle24);
    jMultiLineToolTip8.repaint(rectangle24);
    
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
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle24);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test237"); }

    crystal.client.ConflictClient conflictClient0 = new crystal.client.ConflictClient();
    crystal.client.ClientPreferences clientPreferences5 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ProjectPreferences projectPreferences6 = null;
    clientPreferences5.addProjectPreferences(projectPreferences6);
    crystal.client.ProjectPreferences projectPreferences8 = null;
    clientPreferences5.removeProjectPreferences(projectPreferences8);
    crystal.client.ClientPreferences clientPreferences10 = clientPreferences5.clone();
    conflictClient0.createAndShowGUI(clientPreferences10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clientPreferences10);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test238"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    jMultiLineToolTip0.setSize((int)' ', (-1));
    java.awt.GraphicsConfiguration graphicsConfiguration5 = jMultiLineToolTip0.getGraphicsConfiguration();
    jMultiLineToolTip0.setEnabled(true);
    boolean b10 = jMultiLineToolTip0.contains((int)(byte)10, (int)(byte)10);
    boolean b11 = jMultiLineToolTip0.isMinimumSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphicsConfiguration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test239"); }

    crystal.model.Relationship.MERGECLEAN = "SAME";

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test240"); }

    javax.swing.ImageIcon imageIcon1 = null;
    java.awt.Image image2 = null;
    crystal.model.Relationship relationship3 = new crystal.model.Relationship("AHEAD", imageIcon1, image2);
    javax.swing.ImageIcon imageIcon6 = null;
    java.awt.Image image7 = null;
    crystal.model.Relationship relationship8 = new crystal.model.Relationship("AHEAD", imageIcon6, image7);
    relationship3.calculateAction("AHEAD", relationship8);
    java.lang.String str10 = relationship3.getToolTipText();
    relationship3.setReady();
    javax.swing.ImageIcon imageIcon13 = null;
    java.awt.Image image14 = null;
    crystal.model.Relationship relationship15 = new crystal.model.Relationship("AHEAD", imageIcon13, image14);
    javax.swing.ImageIcon imageIcon18 = null;
    java.awt.Image image19 = null;
    crystal.model.Relationship relationship20 = new crystal.model.Relationship("AHEAD", imageIcon18, image19);
    relationship15.calculateAction("AHEAD", relationship20);
    java.lang.String str22 = relationship15.getToolTipText();
    java.lang.String str23 = relationship15.getToolTipText();
    javax.swing.ImageIcon imageIcon26 = null;
    java.awt.Image image27 = null;
    crystal.model.Relationship relationship28 = new crystal.model.Relationship("AHEAD", imageIcon26, image27);
    javax.swing.ImageIcon imageIcon31 = null;
    java.awt.Image image32 = null;
    crystal.model.Relationship relationship33 = new crystal.model.Relationship("AHEAD", imageIcon31, image32);
    relationship28.calculateAction("AHEAD", relationship33);
    crystal.model.RevisionHistory.Capable capable35 = crystal.model.RevisionHistory.Capable.MUST;
    relationship33.setCapable(capable35);
    relationship15.calculateAction("TESTCONFLICT", relationship33);
    boolean b38 = relationship3.equals((java.lang.Object)relationship15);
    relationship3.setReady();
    javax.swing.ImageIcon imageIcon40 = relationship3.getIcon();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    org.junit.Assert.assertTrue("'" + capable35 + "' != '" + crystal.model.RevisionHistory.Capable.MUST + "'", capable35.equals(crystal.model.RevisionHistory.Capable.MUST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(imageIcon40);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test241"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager7 = null;
    jMultiLineToolTip0.setLayout(layoutManager7);
    boolean b9 = jMultiLineToolTip0.isFocusOwner();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener10 = null;
    jMultiLineToolTip0.addHierarchyBoundsListener(hierarchyBoundsListener10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test242"); }

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
    jMultiLineToolTip0.show();
    jMultiLineToolTip0.setDebugGraphicsOptions(6);
    
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
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test243"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.image.ColorModel colorModel6 = jMultiLineToolTip0.getColorModel();
    jMultiLineToolTip0.removeNotify();
    java.awt.Rectangle rectangle8 = jMultiLineToolTip0.getBounds();
    java.awt.Dimension dimension9 = jMultiLineToolTip0.getPreferredSize();
    jMultiLineToolTip0.firePropertyChange("32 ms", (double)(byte)10, (double)100);
    java.beans.VetoableChangeListener vetoableChangeListener14 = null;
    jMultiLineToolTip0.removeVetoableChangeListener(vetoableChangeListener14);
    boolean b16 = jMultiLineToolTip0.isForegroundSet();
    boolean b17 = jMultiLineToolTip0.isMaximumSizeSet();
    java.awt.Event event18 = null;
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.deliverEvent(event18);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test244"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.dnd.DropTarget dropTarget4 = jMultiLineToolTip0.getDropTarget();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(dropTarget4);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test245"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.image.ImageProducer imageProducer7 = null;
    java.awt.Image image8 = jMultiLineToolTip0.createImage(imageProducer7);
    javax.swing.event.AncestorListener[] ancestorListener_array9 = jMultiLineToolTip0.getAncestorListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ancestorListener_array9);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test246"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ClientPreferences clientPreferences5 = clientPreferences4.clone();
    clientPreferences5.setChanged(false);
    java.lang.String str8 = clientPreferences5.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clientPreferences5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test247"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Event event3 = null;
    boolean b5 = jMultiLineToolTip0.action(event3, (java.lang.Object)'4');
    java.awt.event.InputMethodListener inputMethodListener6 = null;
    jMultiLineToolTip0.removeInputMethodListener(inputMethodListener6);
    java.awt.Graphics graphics8 = null;
    jMultiLineToolTip0.print(graphics8);
    javax.swing.border.Border border10 = jMultiLineToolTip0.getBorder();
    java.beans.VetoableChangeListener[] vetoableChangeListener_array11 = jMultiLineToolTip0.getVetoableChangeListeners();
    crystal.util.JMultiLineToolTip jMultiLineToolTip12 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle13 = null;
    java.awt.Rectangle rectangle14 = jMultiLineToolTip12.getBounds(rectangle13);
    java.awt.Toolkit toolkit15 = jMultiLineToolTip12.getToolkit();
    java.awt.Font font16 = null;
    jMultiLineToolTip12.setFont(font16);
    crystal.util.JMultiLineToolTip jMultiLineToolTip18 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle19 = null;
    java.awt.Rectangle rectangle20 = jMultiLineToolTip18.getBounds(rectangle19);
    java.awt.Event event21 = null;
    boolean b24 = jMultiLineToolTip18.mouseDrag(event21, 32, 1);
    java.awt.Graphics graphics25 = null;
    jMultiLineToolTip18.printComponents(graphics25);
    java.awt.MenuComponent menuComponent27 = null;
    jMultiLineToolTip18.remove(menuComponent27);
    jMultiLineToolTip12.putClientProperty((java.lang.Object)jMultiLineToolTip18, (java.lang.Object)"ERROR");
    java.awt.Dimension dimension31 = jMultiLineToolTip18.getMinimumSize();
    jMultiLineToolTip0.resize(dimension31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(border10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vetoableChangeListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension31);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test248"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setName("hi!");
    jMultiLineToolTip0.invalidate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test249"); }

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
    int i28 = revisionHistory25.size();
    org.junit.Assert.assertTrue("'" + capable11 + "' != '" + crystal.model.RevisionHistory.Capable.MUST + "'", capable11.equals(crystal.model.RevisionHistory.Capable.MUST));
    org.junit.Assert.assertTrue("'" + repoKind17 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind17.equals(crystal.model.DataSource.RepoKind.HG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "cannot compute hg action"+ "'", str24.equals("cannot compute hg action"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ","+ "'", str26.equals(","));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test250"); }

    crystal.client.ProjectPreferences projectPreferences0 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener1 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener2 = null;
    crystal.client.CalculateProjectTask calculateProjectTask3 = new crystal.client.CalculateProjectTask(projectPreferences0, computationListener1, computationListener2);
    java.beans.PropertyChangeSupport propertyChangeSupport4 = calculateProjectTask3.getPropertyChangeSupport();
    boolean b5 = calculateProjectTask3.isDone();
    javax.swing.SwingWorker.StateValue stateValue6 = calculateProjectTask3.getState();
    boolean b8 = calculateProjectTask3.cancel(true);
    int i9 = calculateProjectTask3.getProgress();
    calculateProjectTask3.run();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeSupport4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    org.junit.Assert.assertTrue("'" + stateValue6 + "' != '" + javax.swing.SwingWorker.StateValue.PENDING + "'", stateValue6.equals(javax.swing.SwingWorker.StateValue.PENDING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test251"); }

    crystal.client.ClientPreferences clientPreferences4 = new crystal.client.ClientPreferences("hi!", "TESTCONFLICT", "0 ms", (long)32);
    crystal.client.ClientPreferences clientPreferences5 = clientPreferences4.clone();
    boolean b6 = clientPreferences4.hasChanged();
    crystal.client.ClientPreferences.savePreferencesToXML(clientPreferences4, "415725 hours 22 min");
    // The following exception was thrown during execution in test generation
    try {
    clientPreferences4.removeProjectPreferencesAtIndex((int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clientPreferences5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test252"); }

    crystal.model.DataSource.RepoKind repoKind4 = crystal.model.DataSource.RepoKind.HG;
    crystal.model.Environment environment7 = new crystal.model.Environment("", "2017-06-04T14-21-48.265-0700", repoKind4, false, "hi!");
    crystal.model.Environment environment10 = new crystal.model.Environment("AHEAD", "2017-06-04T14-21-48.265-0700", repoKind4, true, "PENDING");
    crystal.model.DataSource dataSource11 = environment10.clone();
    java.lang.String str12 = dataSource11.getCompileCommand();
    java.lang.String str13 = dataSource11.getParent();
    org.junit.Assert.assertTrue("'" + repoKind4 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind4.equals(crystal.model.DataSource.RepoKind.HG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dataSource11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "PENDING"+ "'", str13.equals("PENDING"));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test253"); }

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
    crystal.util.JMultiLineToolTip jMultiLineToolTip42 = new crystal.util.JMultiLineToolTip();
    boolean b43 = jMultiLineToolTip42.isFocusTraversalPolicyProvider();
    jMultiLineToolTip42.setSize((int)' ', (-1));
    jMultiLineToolTip42.firePropertyChange("", (byte)100, (byte)-1);
    jMultiLineToolTip42.transferFocusUpCycle();
    boolean b52 = jMultiLineToolTip42.isDoubleBuffered();
    java.awt.Component component55 = jMultiLineToolTip42.findComponentAt((-1), 3);
    jMultiLineToolTip13.remove((java.awt.Component)jMultiLineToolTip42);
    
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
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component55);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test254"); }

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
    crystal.util.JMultiLineToolTip jMultiLineToolTip11 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle12 = null;
    java.awt.Rectangle rectangle13 = jMultiLineToolTip11.getBounds(rectangle12);
    java.awt.Rectangle rectangle14 = jMultiLineToolTip11.getVisibleRect();
    boolean b15 = jMultiLineToolTip11.isEnabled();
    java.awt.Event event16 = null;
    boolean b19 = jMultiLineToolTip11.mouseEnter(event16, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener20 = null;
    jMultiLineToolTip11.addPropertyChangeListener(propertyChangeListener20);
    java.awt.Dimension dimension22 = jMultiLineToolTip11.preferredSize();
    jMultiLineToolTip0.setMinimumSize(dimension22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension22);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test255"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    boolean b1 = jMultiLineToolTip0.isFocusTraversalPolicyProvider();
    jMultiLineToolTip0.setSize((int)' ', (-1));
    java.awt.GraphicsConfiguration graphicsConfiguration5 = jMultiLineToolTip0.getGraphicsConfiguration();
    jMultiLineToolTip0.setVerifyInputWhenFocusTarget(true);
    java.awt.Point point8 = jMultiLineToolTip0.getMousePosition();
    java.lang.String str9 = jMultiLineToolTip0.getTipText();
    java.awt.AWTKeyStroke[] aWTKeyStroke_array11 = new java.awt.AWTKeyStroke[] {  };
    java.util.LinkedHashSet<java.awt.AWTKeyStroke> linkedhashset_aWTKeyStroke12 = new java.util.LinkedHashSet<java.awt.AWTKeyStroke>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.awt.AWTKeyStroke>)linkedhashset_aWTKeyStroke12, aWTKeyStroke_array11);
    jMultiLineToolTip0.setFocusTraversalKeys(1, (java.util.Set<java.awt.AWTKeyStroke>)linkedhashset_aWTKeyStroke12);
    crystal.util.JMultiLineToolTip jMultiLineToolTip15 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color16 = null;
    jMultiLineToolTip15.setBackground(color16);
    jMultiLineToolTip15.setOpaque(false);
    java.awt.dnd.DropTarget dropTarget20 = jMultiLineToolTip15.getDropTarget();
    crystal.client.ProjectPreferences projectPreferences21 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener22 = null;
    crystal.client.ConflictDaemon.ComputationListener computationListener23 = null;
    crystal.client.CalculateProjectTask calculateProjectTask24 = new crystal.client.CalculateProjectTask(projectPreferences21, computationListener22, computationListener23);
    java.beans.PropertyChangeSupport propertyChangeSupport25 = calculateProjectTask24.getPropertyChangeSupport();
    calculateProjectTask24.execute();
    java.beans.PropertyChangeListener propertyChangeListener27 = null;
    calculateProjectTask24.removePropertyChangeListener(propertyChangeListener27);
    java.beans.PropertyChangeSupport propertyChangeSupport29 = calculateProjectTask24.getPropertyChangeSupport();
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
    javax.swing.KeyStroke keyStroke44 = null;
    int i45 = jMultiLineToolTip31.getConditionForKeyStroke(keyStroke44);
    crystal.util.JMultiLineToolTip jMultiLineToolTip46 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color47 = null;
    jMultiLineToolTip46.setBackground(color47);
    jMultiLineToolTip46.transferFocusBackward();
    jMultiLineToolTip46.firePropertyChange("$HOME", false, false);
    crystal.util.JMultiLineToolTip jMultiLineToolTip54 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle55 = null;
    java.awt.Rectangle rectangle56 = jMultiLineToolTip54.getBounds(rectangle55);
    jMultiLineToolTip54.firePropertyChange("AHEAD", 0, 128);
    javax.swing.InputVerifier inputVerifier61 = jMultiLineToolTip54.getInputVerifier();
    crystal.util.JMultiLineToolTip jMultiLineToolTip62 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle63 = null;
    java.awt.Rectangle rectangle64 = jMultiLineToolTip62.getBounds(rectangle63);
    java.awt.Event event65 = null;
    boolean b68 = jMultiLineToolTip62.mouseDrag(event65, 32, 1);
    java.awt.Graphics graphics69 = null;
    jMultiLineToolTip62.printComponents(graphics69);
    java.awt.Point point71 = jMultiLineToolTip62.location();
    jMultiLineToolTip54.setLocation(point71);
    java.awt.Component component73 = jMultiLineToolTip46.getComponentAt(point71);
    calculateProjectTask24.firePropertyChange("2017-06-04T14-21-48.265-0700", (java.lang.Object)jMultiLineToolTip31, (java.lang.Object)point71);
    java.awt.Component component75 = jMultiLineToolTip15.getComponentAt(point71);
    java.awt.Point point76 = jMultiLineToolTip0.getLocation(point71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphicsConfiguration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aWTKeyStroke_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(dropTarget20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeSupport25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeSupport29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point76);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test256"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.event.InputMethodListener inputMethodListener7 = null;
    jMultiLineToolTip0.addInputMethodListener(inputMethodListener7);
    boolean b9 = jMultiLineToolTip0.isPaintingForPrint();
    jMultiLineToolTip0.removeNotify();
    jMultiLineToolTip0.validate();
    boolean b12 = jMultiLineToolTip0.requestDefaultFocus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test257"); }

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
    java.awt.Point point23 = jMultiLineToolTip12.getLocation();
    java.awt.Event event24 = null;
    boolean b27 = jMultiLineToolTip12.mouseDown(event24, 7, (int)(byte)10);
    int i28 = jMultiLineToolTip12.countComponents();
    jMultiLineToolTip12.layout();
    java.awt.Font font30 = jMultiLineToolTip12.getFont();
    java.awt.FontMetrics fontMetrics31 = jMultiLineToolTip0.getFontMetrics(font30);
    
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
    org.junit.Assert.assertNotNull(point23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(fontMetrics31);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test258"); }

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
    java.awt.Component component12 = jMultiLineToolTip0.getNextFocusableComponent();
    // The following exception was thrown during execution in test generation
    try {
    component12.resize(16, 7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component12);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test259"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Color color1 = null;
    jMultiLineToolTip0.setBackground(color1);
    jMultiLineToolTip0.nextFocus();

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test260"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener8 = null;
    jMultiLineToolTip0.removePropertyChangeListener("415725 hours 21 min", propertyChangeListener8);
    boolean b10 = jMultiLineToolTip0.isMaximumSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test261"); }

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
    java.beans.PropertyChangeListener propertyChangeListener23 = null;
    jMultiLineToolTip0.removePropertyChangeListener(propertyChangeListener23);
    
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

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test262"); }

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
    java.awt.Event event32 = null;
    boolean b35 = jMultiLineToolTip0.mouseDown(event32, 64, 128);
    java.awt.Font font36 = jMultiLineToolTip0.getFont();
    jMultiLineToolTip0.firePropertyChange("cannot compute hg action", 'a', ' ');
    
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
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font36);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test263"); }

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
    crystal.model.DataSource dataSource26 = projectPreferences24.getDataSource("PENDING");
    crystal.model.DataSource dataSource28 = projectPreferences24.getDataSource("0 ms");
    crystal.client.ConflictDaemon.ComputationListener computationListener29 = null;
    crystal.client.ConflictClient conflictClient30 = new crystal.client.ConflictClient();
    crystal.client.CalculateProjectTask calculateProjectTask31 = new crystal.client.CalculateProjectTask(projectPreferences24, computationListener29, (crystal.client.ConflictDaemon.ComputationListener)conflictClient30);
    org.junit.Assert.assertTrue("'" + repoKind4 + "' != '" + crystal.model.DataSource.RepoKind.HG + "'", repoKind4.equals(crystal.model.DataSource.RepoKind.HG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(dataSource26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(dataSource28);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test264"); }

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
    java.lang.String str32 = jMultiLineToolTip0.getToolTipText();
    java.awt.event.InputMethodListener inputMethodListener33 = null;
    jMultiLineToolTip0.addInputMethodListener(inputMethodListener33);
    java.awt.event.ActionListener actionListener35 = null;
    javax.swing.KeyStroke keyStroke36 = null;
    jMultiLineToolTip0.registerKeyboardAction(actionListener35, keyStroke36, (int)(byte)0);
    
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
    org.junit.Assert.assertNull(str32);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test265"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    jMultiLineToolTip0.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager7 = null;
    jMultiLineToolTip0.setLayout(layoutManager7);
    java.awt.event.InputMethodListener inputMethodListener9 = null;
    jMultiLineToolTip0.removeInputMethodListener(inputMethodListener9);
    boolean b11 = jMultiLineToolTip0.isForegroundSet();
    java.io.PrintStream printStream12 = null;
    // The following exception was thrown during execution in test generation
    try {
    jMultiLineToolTip0.list(printStream12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test266"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = jMultiLineToolTip0.getBounds(rectangle1);
    java.awt.Toolkit toolkit3 = jMultiLineToolTip0.getToolkit();
    java.awt.Font font4 = null;
    jMultiLineToolTip0.setFont(font4);
    java.awt.Color color6 = jMultiLineToolTip0.getBackground();
    jMultiLineToolTip0.show();
    int i8 = jMultiLineToolTip0.getColumns();
    int i9 = jMultiLineToolTip0.getDebugGraphicsOptions();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test267"); }

    javax.swing.ImageIcon imageIcon1 = null;
    java.awt.Image image2 = null;
    crystal.model.Relationship relationship3 = new crystal.model.Relationship("AHEAD", imageIcon1, image2);
    javax.swing.ImageIcon imageIcon6 = null;
    java.awt.Image image7 = null;
    crystal.model.Relationship relationship8 = new crystal.model.Relationship("AHEAD", imageIcon6, image7);
    relationship3.calculateAction("AHEAD", relationship8);
    java.lang.String str10 = relationship3.getToolTipText();
    boolean b12 = relationship3.equals((java.lang.Object)(byte)0);
    javax.swing.ImageIcon imageIcon13 = relationship3.getIcon();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(imageIcon13);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test268"); }

    org.jdom.Document document0 = crystal.util.XMLTools.newXMLDocument();
    // The following exception was thrown during execution in test generation
    try {
    boolean b2 = crystal.util.XMLTools.writeXMLDocument(document0, ",");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(document0);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test269"); }

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
    jMultiLineToolTip4.setTipText("AHEAD_HG_2017-06-04T14-21-48.265-0700");
    
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
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test270"); }

    crystal.util.JMultiLineToolTip jMultiLineToolTip0 = new crystal.util.JMultiLineToolTip();
    jMultiLineToolTip0.firePropertyChange("", (double)0L, 0.0d);
    boolean b5 = jMultiLineToolTip0.getIgnoreRepaint();
    java.awt.ComponentOrientation componentOrientation6 = null;
    jMultiLineToolTip0.setComponentOrientation(componentOrientation6);
    crystal.util.JMultiLineToolTip jMultiLineToolTip8 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle9 = null;
    java.awt.Rectangle rectangle10 = jMultiLineToolTip8.getBounds(rectangle9);
    java.awt.Toolkit toolkit11 = jMultiLineToolTip8.getToolkit();
    jMultiLineToolTip8.setName("hi!");
    javax.swing.ImageIcon imageIcon15 = null;
    java.awt.Image image16 = null;
    crystal.model.Relationship relationship17 = new crystal.model.Relationship("AHEAD", imageIcon15, image16);
    crystal.util.JMultiLineToolTip jMultiLineToolTip18 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle19 = null;
    java.awt.Rectangle rectangle20 = jMultiLineToolTip18.getBounds(rectangle19);
    java.awt.Rectangle rectangle21 = jMultiLineToolTip18.getVisibleRect();
    boolean b22 = jMultiLineToolTip18.isEnabled();
    java.awt.Event event23 = null;
    boolean b26 = jMultiLineToolTip18.mouseEnter(event23, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener27 = null;
    jMultiLineToolTip18.addPropertyChangeListener(propertyChangeListener27);
    java.awt.Point point29 = jMultiLineToolTip18.getLocation();
    boolean b30 = relationship17.equals((java.lang.Object)jMultiLineToolTip18);
    java.awt.Image image31 = relationship17.getImage();
    boolean b37 = jMultiLineToolTip8.imageUpdate(image31, 32, (int)(short)1, (int)(short)100, 128, 9);
    crystal.util.JMultiLineToolTip jMultiLineToolTip40 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle41 = null;
    java.awt.Rectangle rectangle42 = jMultiLineToolTip40.getBounds(rectangle41);
    java.awt.Event event43 = null;
    boolean b45 = jMultiLineToolTip40.action(event43, (java.lang.Object)'4');
    crystal.util.JMultiLineToolTip jMultiLineToolTip46 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle47 = null;
    java.awt.Rectangle rectangle48 = jMultiLineToolTip46.getBounds(rectangle47);
    java.awt.Event event49 = null;
    boolean b51 = jMultiLineToolTip46.action(event49, (java.lang.Object)'4');
    jMultiLineToolTip40.setComponent((javax.swing.JComponent)jMultiLineToolTip46);
    crystal.util.JMultiLineToolTip jMultiLineToolTip53 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle54 = null;
    java.awt.Rectangle rectangle55 = jMultiLineToolTip53.getBounds(rectangle54);
    java.awt.Toolkit toolkit56 = jMultiLineToolTip53.getToolkit();
    jMultiLineToolTip53.setSize(32, (int)(byte)-1);
    java.awt.LayoutManager layoutManager60 = null;
    jMultiLineToolTip53.setLayout(layoutManager60);
    boolean b62 = jMultiLineToolTip53.isFocusOwner();
    boolean b63 = jMultiLineToolTip53.isShowing();
    java.awt.Graphics graphics64 = null;
    jMultiLineToolTip53.update(graphics64);
    java.awt.Component component66 = jMultiLineToolTip40.add((java.awt.Component)jMultiLineToolTip53);
    java.awt.Font font67 = null;
    jMultiLineToolTip53.setFont(font67);
    crystal.util.JMultiLineToolTip jMultiLineToolTip69 = new crystal.util.JMultiLineToolTip();
    java.awt.Rectangle rectangle70 = null;
    java.awt.Rectangle rectangle71 = jMultiLineToolTip69.getBounds(rectangle70);
    java.awt.Rectangle rectangle72 = jMultiLineToolTip69.getVisibleRect();
    boolean b73 = jMultiLineToolTip69.isEnabled();
    java.awt.Event event74 = null;
    boolean b77 = jMultiLineToolTip69.mouseEnter(event74, (-1), (int)(byte)-1);
    java.beans.PropertyChangeListener propertyChangeListener78 = null;
    jMultiLineToolTip69.addPropertyChangeListener(propertyChangeListener78);
    java.awt.Point point80 = jMultiLineToolTip69.getLocation();
    jMultiLineToolTip53.setLocation(point80);
    boolean b82 = jMultiLineToolTip0.prepareImage(image31, 100, 128, (java.awt.image.ImageObserver)jMultiLineToolTip53);
    boolean b84 = jMultiLineToolTip53.areFocusTraversalKeysSet(0);
    int i85 = jMultiLineToolTip53.getWidth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 32);

  }

}
