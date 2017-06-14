
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test001"); }

    org.jfree.chart.axis.MonthDateFormat monthDateFormat0 = new org.jfree.chart.axis.MonthDateFormat();
    double[][] d_array_array1 = new double[][] {  };
    double[][] d_array_array2 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array1, d_array_array2);
    org.jfree.data.general.SeriesDataset[] seriesDataset_array4 = new org.jfree.data.general.SeriesDataset[] { defaultIntervalCategoryDataset3 };
    org.jfree.data.general.CombinedDataset combinedDataset5 = new org.jfree.data.general.CombinedDataset(seriesDataset_array4);
    org.jfree.data.general.CombinedDataset combinedDataset6 = new org.jfree.data.general.CombinedDataset(seriesDataset_array4);
    boolean b7 = monthDateFormat0.equals((java.lang.Object)seriesDataset_array4);
    org.jfree.chart.plot.JThermometer jThermometer8 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event9 = null;
    boolean b11 = jThermometer8.keyDown(event9, 100);
    jThermometer8.setSize((int)(short)100, 8);
    java.lang.Object obj15 = jThermometer8.getTreeLock();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = monthDateFormat0.format(obj15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(seriesDataset_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }

    org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle5 = jThermometer4.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge6 = null;
    double d7 = categoryAxis1.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle5, rectangleEdge6);
    categoryAxis1.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis1.setTickMarkStroke(stroke10);
    double d12 = categoryAxis1.getLowerMargin();
    double d13 = categoryAxis1.getFixedDimension();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }

    org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset defaultBoxAndWhiskerXYDataset1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset((java.lang.Comparable)(-1));
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number4 = defaultBoxAndWhiskerXYDataset1.getY((-143), (-192));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    boolean b3 = jThermometer0.keyDown(event1, 100);
    jThermometer0.setSize((int)(short)100, 8);
    java.awt.Point point7 = jThermometer0.location();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point7);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    int i2 = jThermometer0.getShowAxisLocation();
    java.awt.event.MouseEvent mouseEvent3 = null;
    java.lang.String str4 = jThermometer0.getToolTipText(mouseEvent3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }

    org.jfree.chart.axis.ColorBar colorBar1 = new org.jfree.chart.axis.ColorBar("E");
    colorBar1.setMinimumValue(0.05d);
    org.jfree.chart.plot.RainbowPalette rainbowPalette4 = new org.jfree.chart.plot.RainbowPalette();
    rainbowPalette4.setLogscale(false);
    java.awt.Color color8 = rainbowPalette4.getColor((int)'#');
    boolean b9 = rainbowPalette4.isStepped();
    java.awt.Color color11 = rainbowPalette4.getColorLog((double)(byte)0);
    colorBar1.setColorPalette((org.jfree.chart.plot.ColorPalette)rainbowPalette4);
    java.awt.Graphics2D graphics2D13 = null;
    org.jfree.chart.plot.JThermometer jThermometer19 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event20 = null;
    boolean b22 = jThermometer19.keyDown(event20, 100);
    jThermometer19.setSize((int)(short)100, 8);
    java.awt.Dimension dimension26 = jThermometer19.minimumSize();
    java.awt.Dimension dimension27 = jThermometer19.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener28 = null;
    jThermometer19.removeHierarchyBoundsListener(hierarchyBoundsListener28);
    org.jfree.chart.plot.JThermometer jThermometer30 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle31 = jThermometer30.getVisibleRect();
    java.awt.Rectangle rectangle32 = jThermometer19.getBounds(rectangle31);
    java.awt.Color color33 = java.awt.Color.black;
    float[] f_array39 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array40 = color33.getRGBComponents(f_array39);
    org.jfree.chart.LegendItem legendItem41 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle32, (java.awt.Paint)color33);
    org.jfree.chart.axis.CategoryAxis categoryAxis43 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer46 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle47 = jThermometer46.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge48 = null;
    double d49 = categoryAxis43.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle47, rectangleEdge48);
    org.jfree.chart.axis.CategoryAxis categoryAxis51 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer54 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle55 = jThermometer54.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge56 = null;
    double d57 = categoryAxis51.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle55, rectangleEdge56);
    org.jfree.chart.plot.JThermometer jThermometer64 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event65 = null;
    boolean b67 = jThermometer64.keyDown(event65, 100);
    jThermometer64.setSize((int)(short)100, 8);
    java.awt.Dimension dimension71 = jThermometer64.minimumSize();
    java.awt.Dimension dimension72 = jThermometer64.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener73 = null;
    jThermometer64.removeHierarchyBoundsListener(hierarchyBoundsListener73);
    org.jfree.chart.plot.JThermometer jThermometer75 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle76 = jThermometer75.getVisibleRect();
    java.awt.Rectangle rectangle77 = jThermometer64.getBounds(rectangle76);
    java.awt.Color color78 = java.awt.Color.black;
    float[] f_array84 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array85 = color78.getRGBComponents(f_array84);
    org.jfree.chart.LegendItem legendItem86 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle77, (java.awt.Paint)color78);
    org.jfree.ui.RectangleEdge rectangleEdge87 = null;
    double d88 = categoryAxis51.getCategoryEnd(9, 13, (java.awt.geom.Rectangle2D)rectangle77, rectangleEdge87);
    org.jfree.ui.RectangleEdge rectangleEdge89 = null;
    // The following exception was thrown during execution in test generation
    try {
    double d90 = colorBar1.draw(graphics2D13, (double)10, (java.awt.geom.Rectangle2D)rectangle32, (java.awt.geom.Rectangle2D)rectangle47, (java.awt.geom.Rectangle2D)rectangle77, rectangleEdge89);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d49 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d57 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d88 == 0.0d);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }

    org.jfree.data.function.LineFunction2D lineFunction2D2 = new org.jfree.data.function.LineFunction2D((double)(short)-1, (double)'#');
    boolean b4 = lineFunction2D2.equals((java.lang.Object)(-4));
    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline8 = new org.jfree.chart.axis.SegmentedTimeline((long)0, (int)(byte)-1, 3);
    boolean b9 = segmentedTimeline8.getAdjustForDaylightSaving();
    boolean b10 = lineFunction2D2.equals((java.lang.Object)b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }

    double[][] d_array_array0 = new double[][] {  };
    double[][] d_array_array1 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array0, d_array_array1);
    org.jfree.data.general.SeriesDataset[] seriesDataset_array3 = new org.jfree.data.general.SeriesDataset[] { defaultIntervalCategoryDataset2 };
    org.jfree.data.general.CombinedDataset combinedDataset4 = new org.jfree.data.general.CombinedDataset(seriesDataset_array3);
    org.jfree.data.Range range5 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset)combinedDataset4);
    combinedDataset4.validateObject();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number9 = combinedDataset4.getY(52, 680);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(seriesDataset_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(range5);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }

    org.jfree.chart.axis.ColorBar colorBar1 = new org.jfree.chart.axis.ColorBar("E");
    org.jfree.chart.plot.ColorPalette colorPalette2 = colorBar1.getColorPalette();
    colorBar1.setMinimumValue(97.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorPalette2);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }

    java.lang.String str0 = org.jfree.chart.ChartPanel.SAVE_COMMAND;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "SAVE"+ "'", str0.equals("SAVE"));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    jThermometer16.requestFocus();
    org.jfree.data.time.DateRange dateRange20 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range23 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange20, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType24 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange26 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange27 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange26, (org.jfree.data.Range)dateRange27);
    org.jfree.chart.axis.CompassFormat compassFormat29 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType30 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b31 = compassFormat29.equals((java.lang.Object)lengthConstraintType30);
    org.jfree.chart.axis.CompassFormat compassFormat32 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType33 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b34 = compassFormat32.equals((java.lang.Object)lengthConstraintType33);
    boolean b35 = lengthConstraintType30.equals((java.lang.Object)b34);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint36 = new org.jfree.chart.block.RectangleConstraint(0.0d, range23, lengthConstraintType24, (double)1L, (org.jfree.data.Range)dateRange26, lengthConstraintType30);
    chartPanel14.add((java.awt.Component)jThermometer16, (java.lang.Object)lengthConstraintType24);
    int i38 = chartPanel14.getMinimumDrawWidth();
    chartPanel14.setFocusTraversalKeysEnabled(false);
    java.awt.Paint paint41 = chartPanel14.getZoomOutlinePaint();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint41);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }

    double[][] d_array_array0 = new double[][] {  };
    double[][] d_array_array1 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array0, d_array_array1);
    org.jfree.data.general.PieDataset pieDataset4 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset2, (java.lang.Comparable)0.5d);
    double d5 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pieDataset4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }

    org.jfree.data.time.DateRange dateRange0 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange1 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint2 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange0, (org.jfree.data.Range)dateRange1);
    boolean b4 = dateRange1.contains((double)64);
    java.util.Date date5 = dateRange1.getLowerDate();
    org.jfree.chart.axis.MonthDateFormat monthDateFormat6 = new org.jfree.chart.axis.MonthDateFormat();
    java.lang.Object obj7 = monthDateFormat6.clone();
    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline11 = new org.jfree.chart.axis.SegmentedTimeline((long)0, (int)(byte)-1, 3);
    java.util.Date date13 = segmentedTimeline11.getDate((long)'a');
    java.lang.String str14 = monthDateFormat6.format(date13);
    org.jfree.data.time.DateRange dateRange15 = new org.jfree.data.time.DateRange(date5, date13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "D"+ "'", str14.equals("D"));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b4 = jThermometer0.gotFocus(event1, (java.lang.Object)timeSeries3);
    boolean b5 = jThermometer0.requestDefaultFocus();
    boolean b6 = jThermometer0.isCursorSet();
    java.awt.Dimension dimension7 = jThermometer0.minimumSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension7);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }

    org.jfree.chart.plot.RainbowPalette rainbowPalette0 = new org.jfree.chart.plot.RainbowPalette();
    rainbowPalette0.setLogscale(false);
    java.awt.Color color4 = rainbowPalette0.getColor((int)'#');
    org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("ZOOM_IN_BOTH");
    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer7 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis13 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge18 = null;
    double d19 = categoryAxis13.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle17, rectangleEdge18);
    org.jfree.chart.plot.JThermometer jThermometer24 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event25 = null;
    boolean b27 = jThermometer24.keyDown(event25, 100);
    jThermometer24.setSize((int)(short)100, 8);
    java.awt.Dimension dimension31 = jThermometer24.minimumSize();
    java.awt.Dimension dimension32 = jThermometer24.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener33 = null;
    jThermometer24.removeHierarchyBoundsListener(hierarchyBoundsListener33);
    org.jfree.chart.plot.JThermometer jThermometer35 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle36 = jThermometer35.getVisibleRect();
    java.awt.Rectangle rectangle37 = jThermometer24.getBounds(rectangle36);
    java.awt.Color color38 = java.awt.Color.black;
    float[] f_array44 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array45 = color38.getRGBComponents(f_array44);
    org.jfree.chart.LegendItem legendItem46 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle37, (java.awt.Paint)color38);
    org.jfree.chart.axis.CategoryAxis categoryAxis48 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer51 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle52 = jThermometer51.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge53 = null;
    double d54 = categoryAxis48.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle52, rectangleEdge53);
    categoryAxis48.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke57 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis48.setTickMarkStroke(stroke57);
    org.jfree.chart.JFreeChart jFreeChart59 = null;
    org.jfree.chart.ChartPanel chartPanel73 = new org.jfree.chart.ChartPanel(jFreeChart59, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel73.setReshowDelay((int)(short)1);
    java.awt.Color color76 = java.awt.Color.WHITE;
    chartPanel73.setZoomOutlinePaint((java.awt.Paint)color76);
    org.jfree.chart.LegendItem legendItem78 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle17, (java.awt.Paint)color38, stroke57, (java.awt.Paint)color76);
    xYShapeRenderer7.setShape((java.awt.Shape)rectangle17);
    xYShapeRenderer7.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    org.jfree.chart.labels.ItemLabelPosition itemLabelPosition84 = xYShapeRenderer7.getBasePositiveItemLabelPosition();
    org.jfree.chart.plot.XYPlot xYPlot85 = null;
    xYShapeRenderer7.setPlot(xYPlot85);
    xYShapeRenderer7.clearSeriesPaints(true);
    java.awt.Color color91 = java.awt.Color.BLACK;
    java.awt.Stroke stroke92 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    org.jfree.chart.plot.CategoryMarker categoryMarker93 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)9, (java.awt.Paint)color91, stroke92);
    xYShapeRenderer7.setSeriesStroke(768, stroke92);
    legendItem6.setOutlineStroke(stroke92);
    boolean b96 = rainbowPalette0.equals((java.lang.Object)legendItem6);
    rainbowPalette0.setInverse(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d54 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelPosition84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == false);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }

    org.jfree.data.time.TimeSeriesCollection timeSeriesCollection0 = new org.jfree.data.time.TimeSeriesCollection();
    org.jfree.chart.axis.MonthDateFormat monthDateFormat1 = new org.jfree.chart.axis.MonthDateFormat();
    java.lang.Object obj2 = monthDateFormat1.clone();
    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline6 = new org.jfree.chart.axis.SegmentedTimeline((long)0, (int)(byte)-1, 3);
    java.util.Date date8 = segmentedTimeline6.getDate((long)'a');
    java.lang.String str9 = monthDateFormat1.format(date8);
    org.jfree.data.time.TimeSeries timeSeries10 = timeSeriesCollection0.getSeries((java.lang.Comparable)date8);
    org.jfree.data.time.TimePeriodAnchor timePeriodAnchor11 = timeSeriesCollection0.getXPosition();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "D"+ "'", str9.equals("D"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(timeSeries10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timePeriodAnchor11);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    boolean b3 = jThermometer0.keyDown(event1, 100);
    java.awt.Event event4 = null;
    java.awt.Color color5 = java.awt.Color.YELLOW;
    boolean b6 = jThermometer0.lostFocus(event4, (java.lang.Object)color5);
    jThermometer0.setVerifyInputWhenFocusTarget(false);
    java.awt.FocusTraversalPolicy focusTraversalPolicy9 = null;
    jThermometer0.setFocusTraversalPolicy(focusTraversalPolicy9);
    java.io.PrintStream printStream11 = null;
    // The following exception was thrown during execution in test generation
    try {
    jThermometer0.list(printStream11, 2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }

    int i0 = java.awt.image.ImageObserver.FRAMEBITS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 16);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    jThermometer0.requestFocus();
    javax.swing.JPopupMenu jPopupMenu3 = jThermometer0.getComponentPopupMenu();
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    boolean b5 = jThermometer0.isAncestorOf((java.awt.Component)jThermometer4);
    org.jfree.chart.axis.CategoryAxis categoryAxis7 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer10 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle11 = jThermometer10.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge12 = null;
    double d13 = categoryAxis7.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle11, rectangleEdge12);
    categoryAxis7.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis7.setTickMarkStroke(stroke16);
    int i18 = categoryAxis7.getMaximumCategoryLabelLines();
    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer19 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis25 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer28 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle29 = jThermometer28.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge30 = null;
    double d31 = categoryAxis25.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle29, rectangleEdge30);
    org.jfree.chart.plot.JThermometer jThermometer36 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event37 = null;
    boolean b39 = jThermometer36.keyDown(event37, 100);
    jThermometer36.setSize((int)(short)100, 8);
    java.awt.Dimension dimension43 = jThermometer36.minimumSize();
    java.awt.Dimension dimension44 = jThermometer36.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener45 = null;
    jThermometer36.removeHierarchyBoundsListener(hierarchyBoundsListener45);
    org.jfree.chart.plot.JThermometer jThermometer47 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle48 = jThermometer47.getVisibleRect();
    java.awt.Rectangle rectangle49 = jThermometer36.getBounds(rectangle48);
    java.awt.Color color50 = java.awt.Color.black;
    float[] f_array56 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array57 = color50.getRGBComponents(f_array56);
    org.jfree.chart.LegendItem legendItem58 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle49, (java.awt.Paint)color50);
    org.jfree.chart.axis.CategoryAxis categoryAxis60 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer63 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle64 = jThermometer63.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge65 = null;
    double d66 = categoryAxis60.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle64, rectangleEdge65);
    categoryAxis60.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke69 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis60.setTickMarkStroke(stroke69);
    org.jfree.chart.JFreeChart jFreeChart71 = null;
    org.jfree.chart.ChartPanel chartPanel85 = new org.jfree.chart.ChartPanel(jFreeChart71, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel85.setReshowDelay((int)(short)1);
    java.awt.Color color88 = java.awt.Color.WHITE;
    chartPanel85.setZoomOutlinePaint((java.awt.Paint)color88);
    org.jfree.chart.LegendItem legendItem90 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle29, (java.awt.Paint)color50, stroke69, (java.awt.Paint)color88);
    xYShapeRenderer19.setShape((java.awt.Shape)rectangle29);
    xYShapeRenderer19.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    org.jfree.chart.labels.ItemLabelPosition itemLabelPosition96 = xYShapeRenderer19.getBasePositiveItemLabelPosition();
    jThermometer4.putClientProperty((java.lang.Object)i18, (java.lang.Object)itemLabelPosition96);
    java.awt.Rectangle rectangle98 = jThermometer4.getVisibleRect();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jPopupMenu3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d66 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelPosition96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle98);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }

    int i0 = java.awt.Frame.MAXIMIZED_HORIZ;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    jThermometer16.requestFocus();
    org.jfree.data.time.DateRange dateRange20 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range23 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange20, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType24 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange26 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange27 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange26, (org.jfree.data.Range)dateRange27);
    org.jfree.chart.axis.CompassFormat compassFormat29 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType30 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b31 = compassFormat29.equals((java.lang.Object)lengthConstraintType30);
    org.jfree.chart.axis.CompassFormat compassFormat32 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType33 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b34 = compassFormat32.equals((java.lang.Object)lengthConstraintType33);
    boolean b35 = lengthConstraintType30.equals((java.lang.Object)b34);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint36 = new org.jfree.chart.block.RectangleConstraint(0.0d, range23, lengthConstraintType24, (double)1L, (org.jfree.data.Range)dateRange26, lengthConstraintType30);
    chartPanel14.add((java.awt.Component)jThermometer16, (java.lang.Object)lengthConstraintType24);
    javax.swing.InputVerifier inputVerifier38 = chartPanel14.getInputVerifier();
    java.awt.Component[] component_array39 = chartPanel14.getComponents();
    java.awt.Dimension dimension40 = chartPanel14.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension40);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }

    org.jfree.data.time.TimeSeriesCollection timeSeriesCollection0 = new org.jfree.data.time.TimeSeriesCollection();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number3 = timeSeriesCollection0.getX(5, 52);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    javax.swing.JPopupMenu jPopupMenu15 = null;
    chartPanel14.setComponentPopupMenu(jPopupMenu15);
    // The following exception was thrown during execution in test generation
    try {
    chartPanel14.doEditChartProperties();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }

    org.jfree.chart.block.RectangleConstraint rectangleConstraint0 = org.jfree.chart.block.RectangleConstraint.NONE;
    org.jfree.data.time.DateRange dateRange2 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range5 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange2, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType6 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange8 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange9 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint10 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange8, (org.jfree.data.Range)dateRange9);
    org.jfree.chart.axis.CompassFormat compassFormat11 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType12 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b13 = compassFormat11.equals((java.lang.Object)lengthConstraintType12);
    org.jfree.chart.axis.CompassFormat compassFormat14 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType15 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b16 = compassFormat14.equals((java.lang.Object)lengthConstraintType15);
    boolean b17 = lengthConstraintType12.equals((java.lang.Object)b16);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint18 = new org.jfree.chart.block.RectangleConstraint(0.0d, range5, lengthConstraintType6, (double)1L, (org.jfree.data.Range)dateRange8, lengthConstraintType12);
    double d19 = dateRange8.getLowerBound();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint20 = rectangleConstraint0.toRangeWidth((org.jfree.data.Range)dateRange8);
    org.jfree.ui.Size2D size2D21 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.ui.Size2D size2D22 = rectangleConstraint20.calculateConstrainedSize(size2D21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleConstraint0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleConstraint20);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }

    org.jfree.chart.axis.SubCategoryAxis subCategoryAxis1 = new org.jfree.chart.axis.SubCategoryAxis("Time");
    org.jfree.chart.plot.JThermometer jThermometer2 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle3 = jThermometer2.getVisibleRect();
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle5 = jThermometer4.getVisibleRect();
    int i6 = jThermometer4.getShowAxisLocation();
    int i7 = jThermometer4.getWidth();
    java.awt.Component component8 = jThermometer2.add((java.awt.Component)jThermometer4);
    jThermometer2.addNotify();
    java.awt.event.ContainerListener containerListener10 = null;
    jThermometer2.addContainerListener(containerListener10);
    java.awt.Font font12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
    jThermometer2.setValueFont(font12);
    subCategoryAxis1.setSubLabelFont(font12);
    org.jfree.ui.RectangleInsets rectangleInsets15 = subCategoryAxis1.getLabelInsets();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets15);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }

    org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle5 = jThermometer4.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge6 = null;
    double d7 = categoryAxis1.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle5, rectangleEdge6);
    categoryAxis1.setMinorTickMarkOutsideLength((float)(-4));
    int i10 = categoryAxis1.getCategoryLabelPositionOffset();
    float f11 = categoryAxis1.getMinorTickMarkInsideLength();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 0.0f);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }

    org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)768, "", " onMouseOver=\"return stm(['','item'],Style[32]);\" onMouseOut=\"return htm();\"");

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }

    java.io.PrintWriter printWriter0 = null;
    org.jfree.chart.plot.JThermometer jThermometer2 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle3 = jThermometer2.getVisibleRect();
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle5 = jThermometer4.getVisibleRect();
    int i6 = jThermometer4.getShowAxisLocation();
    int i7 = jThermometer4.getWidth();
    java.awt.Component component8 = jThermometer2.add((java.awt.Component)jThermometer4);
    java.awt.Event event9 = null;
    org.jfree.chart.JFreeChart jFreeChart10 = null;
    org.jfree.chart.ChartPanel chartPanel24 = new org.jfree.chart.ChartPanel(jFreeChart10, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo25 = chartPanel24.getChartRenderingInfo();
    boolean b26 = component8.lostFocus(event9, (java.lang.Object)chartRenderingInfo25);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.imagemap.ImageMapUtilities.writeImageMap(printWriter0, "SAVE", chartRenderingInfo25, false);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }

    org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions2 = categoryAxis1.getCategoryLabelPositions();
    org.jfree.chart.event.AxisChangeListener axisChangeListener3 = null;
    categoryAxis1.removeChangeListener(axisChangeListener3);
    org.jfree.data.xy.YIntervalDataItem yIntervalDataItem9 = new org.jfree.data.xy.YIntervalDataItem((double)9, (double)(byte)1, (double)4, (double)(byte)0);
    java.awt.Font font10 = categoryAxis1.getTickLabelFont((java.lang.Comparable)yIntervalDataItem9);
    double d11 = categoryAxis1.getLowerMargin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelPositions2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.05d);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }

    org.jfree.data.time.TimePeriodValuesCollection timePeriodValuesCollection0 = new org.jfree.data.time.TimePeriodValuesCollection();
    // The following exception was thrown during execution in test generation
    try {
    double d3 = timePeriodValuesCollection0.getEndXValue((int)(byte)-1, 2);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }

    int i0 = java.awt.Frame.HAND_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 12);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }

    org.jfree.chart.util.LogFormat logFormat3 = new org.jfree.chart.util.LogFormat((double)(byte)0, " onMouseOver=\"return stm(['','item'],Style[32]);\" onMouseOut=\"return htm();\"", false);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }

    java.lang.Comparable comparable0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.xy.XYIntervalSeries xYIntervalSeries3 = new org.jfree.data.xy.XYIntervalSeries(comparable0, true, false);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }

    org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues("ZOOM_RESET_RANGE", "ZOOM_RESET_DOMAIN", "");
    org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy(100, 100);
    double[][] d_array_array7 = new double[][] {  };
    double[][] d_array_array8 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset9 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array7, d_array_array8);
    org.jfree.data.general.SeriesDataset[] seriesDataset_array10 = new org.jfree.data.general.SeriesDataset[] { defaultIntervalCategoryDataset9 };
    org.jfree.data.general.CombinedDataset combinedDataset11 = new org.jfree.data.general.CombinedDataset(seriesDataset_array10);
    timePeriodValues3.addChangeListener((org.jfree.data.general.SeriesChangeListener)combinedDataset11);
    // The following exception was thrown during execution in test generation
    try {
    double d15 = combinedDataset11.getCloseValue(7, (-192));
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timePeriodValues6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(seriesDataset_array10);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }

    org.jfree.data.function.PowerFunction2D powerFunction2D2 = new org.jfree.data.function.PowerFunction2D(0.0d, (double)100L);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }

    java.awt.Color color0 = org.jfree.chart.ChartColor.VERY_LIGHT_BLUE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color0);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.plot.JThermometer jThermometer3 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle4 = jThermometer3.getVisibleRect();
    org.jfree.chart.plot.JThermometer jThermometer5 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle6 = jThermometer5.getVisibleRect();
    int i7 = jThermometer5.getShowAxisLocation();
    int i8 = jThermometer5.getWidth();
    java.awt.Component component9 = jThermometer3.add((java.awt.Component)jThermometer5);
    java.awt.Event event10 = null;
    org.jfree.chart.JFreeChart jFreeChart11 = null;
    org.jfree.chart.ChartPanel chartPanel25 = new org.jfree.chart.ChartPanel(jFreeChart11, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo26 = chartPanel25.getChartRenderingInfo();
    boolean b27 = component9.lostFocus(event10, (java.lang.Object)chartRenderingInfo26);
    javax.servlet.http.HttpSession httpSession28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = org.jfree.chart.servlet.ServletUtilities.saveChartAsPNG(jFreeChart0, 5, 64, chartRenderingInfo26, httpSession28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge11 = null;
    double d12 = categoryAxis6.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle10, rectangleEdge11);
    org.jfree.chart.plot.JThermometer jThermometer17 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event18 = null;
    boolean b20 = jThermometer17.keyDown(event18, 100);
    jThermometer17.setSize((int)(short)100, 8);
    java.awt.Dimension dimension24 = jThermometer17.minimumSize();
    java.awt.Dimension dimension25 = jThermometer17.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
    jThermometer17.removeHierarchyBoundsListener(hierarchyBoundsListener26);
    org.jfree.chart.plot.JThermometer jThermometer28 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle29 = jThermometer28.getVisibleRect();
    java.awt.Rectangle rectangle30 = jThermometer17.getBounds(rectangle29);
    java.awt.Color color31 = java.awt.Color.black;
    float[] f_array37 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array38 = color31.getRGBComponents(f_array37);
    org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle30, (java.awt.Paint)color31);
    org.jfree.chart.axis.CategoryAxis categoryAxis41 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer44 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle45 = jThermometer44.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge46 = null;
    double d47 = categoryAxis41.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle45, rectangleEdge46);
    categoryAxis41.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis41.setTickMarkStroke(stroke50);
    org.jfree.chart.JFreeChart jFreeChart52 = null;
    org.jfree.chart.ChartPanel chartPanel66 = new org.jfree.chart.ChartPanel(jFreeChart52, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel66.setReshowDelay((int)(short)1);
    java.awt.Color color69 = java.awt.Color.WHITE;
    chartPanel66.setZoomOutlinePaint((java.awt.Paint)color69);
    org.jfree.chart.LegendItem legendItem71 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle10, (java.awt.Paint)color31, stroke50, (java.awt.Paint)color69);
    xYShapeRenderer0.setShape((java.awt.Shape)rectangle10);
    xYShapeRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    org.jfree.chart.labels.ItemLabelPosition itemLabelPosition77 = xYShapeRenderer0.getBasePositiveItemLabelPosition();
    xYShapeRenderer0.setCreateEntities((java.lang.Boolean)false, false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelPosition77);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }

    double[][] d_array_array0 = new double[][] {  };
    double[][] d_array_array1 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array0, d_array_array1);
    org.jfree.data.general.SeriesDataset[] seriesDataset_array3 = new org.jfree.data.general.SeriesDataset[] { defaultIntervalCategoryDataset2 };
    org.jfree.data.general.CombinedDataset combinedDataset4 = new org.jfree.data.general.CombinedDataset(seriesDataset_array3);
    org.jfree.data.Range range5 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset)combinedDataset4);
    combinedDataset4.validateObject();
    java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset)combinedDataset4);
    java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue((org.jfree.data.xy.XYDataset)combinedDataset4);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number11 = combinedDataset4.getVolume(2, 3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(seriesDataset_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(range5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(number7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(number8);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }

    java.awt.Color color1 = java.awt.Color.BLACK;
    org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator5 = new org.jfree.chart.util.DefaultShadowGenerator((int)(byte)100, color1, (float)0, (int)'4', (double)1.0f);
    org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor6 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE4;
    boolean b7 = defaultShadowGenerator5.equals((java.lang.Object)itemLabelAnchor6);
    int i8 = defaultShadowGenerator5.getDistance();
    int i9 = defaultShadowGenerator5.getDistance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelAnchor6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }

    org.jfree.data.xy.XYCoordinate xYCoordinate0 = new org.jfree.data.xy.XYCoordinate();
    java.lang.String str1 = xYCoordinate0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "(0.0, 0.0)"+ "'", str1.equals("(0.0, 0.0)"));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b4 = jThermometer0.gotFocus(event1, (java.lang.Object)timeSeries3);
    jThermometer0.removeNotify();
    int i6 = jThermometer0.getDebugGraphicsOptions();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }

    org.jfree.chart.plot.PieLabelLinkStyle pieLabelLinkStyle0 = org.jfree.chart.plot.PieLabelLinkStyle.QUAD_CURVE;
    java.lang.String str1 = pieLabelLinkStyle0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pieLabelLinkStyle0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "PieLabelLinkStyle.QUAD_CURVE"+ "'", str1.equals("PieLabelLinkStyle.QUAD_CURVE"));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    jThermometer16.requestFocus();
    org.jfree.data.time.DateRange dateRange20 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range23 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange20, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType24 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange26 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange27 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange26, (org.jfree.data.Range)dateRange27);
    org.jfree.chart.axis.CompassFormat compassFormat29 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType30 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b31 = compassFormat29.equals((java.lang.Object)lengthConstraintType30);
    org.jfree.chart.axis.CompassFormat compassFormat32 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType33 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b34 = compassFormat32.equals((java.lang.Object)lengthConstraintType33);
    boolean b35 = lengthConstraintType30.equals((java.lang.Object)b34);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint36 = new org.jfree.chart.block.RectangleConstraint(0.0d, range23, lengthConstraintType24, (double)1L, (org.jfree.data.Range)dateRange26, lengthConstraintType30);
    chartPanel14.add((java.awt.Component)jThermometer16, (java.lang.Object)lengthConstraintType24);
    javax.swing.InputVerifier inputVerifier38 = chartPanel14.getInputVerifier();
    boolean b39 = chartPanel14.getRefreshBuffer();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array40 = chartPanel14.getMouseMotionListeners();
    chartPanel14.removeAll();
    java.awt.im.InputMethodRequests inputMethodRequests42 = chartPanel14.getInputMethodRequests();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputMethodRequests42);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }

    int i0 = java.awt.image.ImageObserver.SOMEBITS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 8);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }

    java.lang.String str0 = org.jfree.chart.ChartPanel.COPY_COMMAND;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "COPY"+ "'", str0.equals("COPY"));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }

    org.jfree.chart.plot.RainbowPalette rainbowPalette0 = new org.jfree.chart.plot.RainbowPalette();
    rainbowPalette0.setLogscale(false);
    java.awt.Color color4 = rainbowPalette0.getColor((int)'#');
    org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("ZOOM_IN_BOTH");
    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer7 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis13 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge18 = null;
    double d19 = categoryAxis13.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle17, rectangleEdge18);
    org.jfree.chart.plot.JThermometer jThermometer24 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event25 = null;
    boolean b27 = jThermometer24.keyDown(event25, 100);
    jThermometer24.setSize((int)(short)100, 8);
    java.awt.Dimension dimension31 = jThermometer24.minimumSize();
    java.awt.Dimension dimension32 = jThermometer24.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener33 = null;
    jThermometer24.removeHierarchyBoundsListener(hierarchyBoundsListener33);
    org.jfree.chart.plot.JThermometer jThermometer35 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle36 = jThermometer35.getVisibleRect();
    java.awt.Rectangle rectangle37 = jThermometer24.getBounds(rectangle36);
    java.awt.Color color38 = java.awt.Color.black;
    float[] f_array44 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array45 = color38.getRGBComponents(f_array44);
    org.jfree.chart.LegendItem legendItem46 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle37, (java.awt.Paint)color38);
    org.jfree.chart.axis.CategoryAxis categoryAxis48 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer51 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle52 = jThermometer51.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge53 = null;
    double d54 = categoryAxis48.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle52, rectangleEdge53);
    categoryAxis48.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke57 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis48.setTickMarkStroke(stroke57);
    org.jfree.chart.JFreeChart jFreeChart59 = null;
    org.jfree.chart.ChartPanel chartPanel73 = new org.jfree.chart.ChartPanel(jFreeChart59, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel73.setReshowDelay((int)(short)1);
    java.awt.Color color76 = java.awt.Color.WHITE;
    chartPanel73.setZoomOutlinePaint((java.awt.Paint)color76);
    org.jfree.chart.LegendItem legendItem78 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle17, (java.awt.Paint)color38, stroke57, (java.awt.Paint)color76);
    xYShapeRenderer7.setShape((java.awt.Shape)rectangle17);
    xYShapeRenderer7.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    org.jfree.chart.labels.ItemLabelPosition itemLabelPosition84 = xYShapeRenderer7.getBasePositiveItemLabelPosition();
    org.jfree.chart.plot.XYPlot xYPlot85 = null;
    xYShapeRenderer7.setPlot(xYPlot85);
    xYShapeRenderer7.clearSeriesPaints(true);
    java.awt.Color color91 = java.awt.Color.BLACK;
    java.awt.Stroke stroke92 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    org.jfree.chart.plot.CategoryMarker categoryMarker93 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)9, (java.awt.Paint)color91, stroke92);
    xYShapeRenderer7.setSeriesStroke(768, stroke92);
    legendItem6.setOutlineStroke(stroke92);
    boolean b96 = rainbowPalette0.equals((java.lang.Object)legendItem6);
    java.lang.String str97 = rainbowPalette0.getPaletteName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d54 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelPosition84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str97 + "' != '" + "Rainbow"+ "'", str97.equals("Rainbow"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }

    org.jfree.data.time.DateRange dateRange1 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange2 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint3 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange1, (org.jfree.data.Range)dateRange2);
    boolean b5 = dateRange2.contains((double)64);
    org.jfree.data.time.DateRange dateRange6 = new org.jfree.data.time.DateRange((org.jfree.data.Range)dateRange2);
    org.jfree.chart.plot.MeterInterval meterInterval7 = new org.jfree.chart.plot.MeterInterval("1.0, -1", (org.jfree.data.Range)dateRange2);
    org.jfree.data.time.DateRange dateRange8 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint9 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange2, (org.jfree.data.Range)dateRange8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }

    org.jfree.text.TextBox textBox3 = null;
    org.jfree.chart.plot.PieLabelRecord pieLabelRecord7 = new org.jfree.chart.plot.PieLabelRecord((java.lang.Comparable)(-1L), (double)10, (double)10.0f, textBox3, (double)(byte)10, (double)0L, (double)0.5f);
    pieLabelRecord7.setBaseY((double)(byte)1);
    double d10 = pieLabelRecord7.getAllocatedY();
    java.lang.String str11 = pieLabelRecord7.toString();
    java.lang.String str12 = pieLabelRecord7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "1.0, -1"+ "'", str11.equals("1.0, -1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1.0, -1"+ "'", str12.equals("1.0, -1"));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    boolean b3 = jThermometer0.keyDown(event1, 100);
    java.awt.Event event4 = null;
    boolean b7 = jThermometer0.mouseDown(event4, 6, (int)(byte)1);
    jThermometer0.setFollowDataInSubranges(false);
    int i10 = jThermometer0.getShowAxisLocation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge11 = null;
    double d12 = categoryAxis6.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle10, rectangleEdge11);
    org.jfree.chart.plot.JThermometer jThermometer17 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event18 = null;
    boolean b20 = jThermometer17.keyDown(event18, 100);
    jThermometer17.setSize((int)(short)100, 8);
    java.awt.Dimension dimension24 = jThermometer17.minimumSize();
    java.awt.Dimension dimension25 = jThermometer17.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
    jThermometer17.removeHierarchyBoundsListener(hierarchyBoundsListener26);
    org.jfree.chart.plot.JThermometer jThermometer28 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle29 = jThermometer28.getVisibleRect();
    java.awt.Rectangle rectangle30 = jThermometer17.getBounds(rectangle29);
    java.awt.Color color31 = java.awt.Color.black;
    float[] f_array37 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array38 = color31.getRGBComponents(f_array37);
    org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle30, (java.awt.Paint)color31);
    org.jfree.chart.axis.CategoryAxis categoryAxis41 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer44 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle45 = jThermometer44.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge46 = null;
    double d47 = categoryAxis41.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle45, rectangleEdge46);
    categoryAxis41.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis41.setTickMarkStroke(stroke50);
    org.jfree.chart.JFreeChart jFreeChart52 = null;
    org.jfree.chart.ChartPanel chartPanel66 = new org.jfree.chart.ChartPanel(jFreeChart52, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel66.setReshowDelay((int)(short)1);
    java.awt.Color color69 = java.awt.Color.WHITE;
    chartPanel66.setZoomOutlinePaint((java.awt.Paint)color69);
    org.jfree.chart.LegendItem legendItem71 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle10, (java.awt.Paint)color31, stroke50, (java.awt.Paint)color69);
    xYShapeRenderer0.setShape((java.awt.Shape)rectangle10);
    xYShapeRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    org.jfree.chart.labels.ItemLabelPosition itemLabelPosition77 = xYShapeRenderer0.getBasePositiveItemLabelPosition();
    org.jfree.chart.plot.XYPlot xYPlot78 = null;
    xYShapeRenderer0.setPlot(xYPlot78);
    xYShapeRenderer0.clearSeriesPaints(true);
    java.awt.Color color84 = java.awt.Color.BLACK;
    java.awt.Stroke stroke85 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    org.jfree.chart.plot.CategoryMarker categoryMarker86 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)9, (java.awt.Paint)color84, stroke85);
    xYShapeRenderer0.setSeriesStroke(768, stroke85);
    java.awt.Stroke stroke89 = xYShapeRenderer0.lookupSeriesStroke(2);
    java.awt.Paint paint90 = xYShapeRenderer0.getGuideLinePaint();
    java.awt.Paint paint92 = xYShapeRenderer0.getSeriesPaint(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelPosition77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(paint92);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }

    double[][] d_array_array0 = new double[][] {  };
    double[][] d_array_array1 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array0, d_array_array1);
    org.jfree.data.general.PieDataset pieDataset4 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset2, (java.lang.Comparable)0.5d);
    org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
    defaultIntervalCategoryDataset2.removeChangeListener(datasetChangeListener5);
    java.lang.Object obj7 = defaultIntervalCategoryDataset2.clone();
    java.lang.Object obj8 = defaultIntervalCategoryDataset2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pieDataset4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }

    org.jfree.data.time.TimePeriodValuesCollection timePeriodValuesCollection0 = new org.jfree.data.time.TimePeriodValuesCollection();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number3 = timePeriodValuesCollection0.getStartY((int)' ', 128);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }

    java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getPercentInstance();
    org.jfree.chart.axis.NumberTickUnit numberTickUnit3 = new org.jfree.chart.axis.NumberTickUnit((double)(-1.0f), numberFormat1, 1);
    java.util.Currency currency4 = null;
    // The following exception was thrown during execution in test generation
    try {
    numberFormat1.setCurrency(currency4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(numberFormat1);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }

    org.jfree.data.time.DateRange dateRange2 = new org.jfree.data.time.DateRange((double)(-557783151), (double)2.0f);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    java.awt.Color color2 = java.awt.Color.GRAY;
    int i3 = color2.getAlpha();
    xYShapeRenderer0.setLegendTextPaint(100, (java.awt.Paint)color2);
    boolean b5 = xYShapeRenderer0.getAutoPopulateSeriesPaint();
    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer7 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis13 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge18 = null;
    double d19 = categoryAxis13.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle17, rectangleEdge18);
    org.jfree.chart.plot.JThermometer jThermometer24 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event25 = null;
    boolean b27 = jThermometer24.keyDown(event25, 100);
    jThermometer24.setSize((int)(short)100, 8);
    java.awt.Dimension dimension31 = jThermometer24.minimumSize();
    java.awt.Dimension dimension32 = jThermometer24.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener33 = null;
    jThermometer24.removeHierarchyBoundsListener(hierarchyBoundsListener33);
    org.jfree.chart.plot.JThermometer jThermometer35 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle36 = jThermometer35.getVisibleRect();
    java.awt.Rectangle rectangle37 = jThermometer24.getBounds(rectangle36);
    java.awt.Color color38 = java.awt.Color.black;
    float[] f_array44 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array45 = color38.getRGBComponents(f_array44);
    org.jfree.chart.LegendItem legendItem46 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle37, (java.awt.Paint)color38);
    org.jfree.chart.axis.CategoryAxis categoryAxis48 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer51 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle52 = jThermometer51.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge53 = null;
    double d54 = categoryAxis48.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle52, rectangleEdge53);
    categoryAxis48.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke57 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis48.setTickMarkStroke(stroke57);
    org.jfree.chart.JFreeChart jFreeChart59 = null;
    org.jfree.chart.ChartPanel chartPanel73 = new org.jfree.chart.ChartPanel(jFreeChart59, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel73.setReshowDelay((int)(short)1);
    java.awt.Color color76 = java.awt.Color.WHITE;
    chartPanel73.setZoomOutlinePaint((java.awt.Paint)color76);
    org.jfree.chart.LegendItem legendItem78 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle17, (java.awt.Paint)color38, stroke57, (java.awt.Paint)color76);
    xYShapeRenderer7.setShape((java.awt.Shape)rectangle17);
    xYShapeRenderer7.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    org.jfree.chart.labels.ItemLabelPosition itemLabelPosition84 = xYShapeRenderer7.getBasePositiveItemLabelPosition();
    xYShapeRenderer0.setSeriesPositiveItemLabelPosition((int)'4', itemLabelPosition84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d54 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelPosition84);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }

    int i0 = java.awt.Frame.DEFAULT_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }

    org.jfree.chart.axis.NumberTickUnit numberTickUnit1 = new org.jfree.chart.axis.NumberTickUnit((double)10.0f);
    org.jfree.chart.axis.CategoryLabelWidthType categoryLabelWidthType2 = org.jfree.chart.axis.CategoryLabelWidthType.RANGE;
    int i3 = numberTickUnit1.compareTo((java.lang.Object)categoryLabelWidthType2);
    org.jfree.data.time.ohlc.OHLCSeries oHLCSeries4 = new org.jfree.data.time.ohlc.OHLCSeries((java.lang.Comparable)i3);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.ComparableObjectItem comparableObjectItem6 = oHLCSeries4.getDataItem((-557783151));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelWidthType2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }

    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.xy.MatrixSeries matrixSeries3 = new org.jfree.data.xy.MatrixSeries("ZOOM_IN_BOTH", (-143), (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }

    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline3 = new org.jfree.chart.axis.SegmentedTimeline((long)0, (int)(byte)-1, 3);
    long long4 = segmentedTimeline3.getSegmentsExcludedSize();
    int i5 = segmentedTimeline3.getGroupSegmentCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    jThermometer0.requestFocus();
    javax.swing.JPopupMenu jPopupMenu3 = jThermometer0.getComponentPopupMenu();
    java.beans.PropertyChangeListener[] propertyChangeListener_array5 = jThermometer0.getPropertyChangeListeners("jfreechart-");
    java.awt.Event event6 = null;
    boolean b9 = jThermometer0.mouseEnter(event6, 255, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jPopupMenu3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }

    org.jfree.data.xy.VectorSeries vectorSeries1 = new org.jfree.data.xy.VectorSeries((java.lang.Comparable)0.2d);
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    vectorSeries1.addPropertyChangeListener(propertyChangeListener2);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.ComparableObjectItem comparableObjectItem5 = vectorSeries1.getDataItem((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }

    org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)100.0f);
    org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
    // The following exception was thrown during execution in test generation
    try {
    timeSeries1.add(regularTimePeriod2, (double)3600000L);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }

    org.jfree.chart.axis.CompassFormat compassFormat0 = new org.jfree.chart.axis.CompassFormat();
    int i1 = compassFormat0.getMinimumIntegerDigits();
    java.lang.String str3 = compassFormat0.format((long)100);
    int i4 = compassFormat0.getMinimumIntegerDigits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "E"+ "'", str3.equals("E"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }

    java.awt.image.BufferedImage bufferedImage0 = null;
    java.io.OutputStream outputStream2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.encoders.EncoderUtil.writeBufferedImage(bufferedImage0, "N", outputStream2, (float)(short)1, false);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }

    org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double)' ');
    java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
    org.jfree.ui.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
    org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
    valueMarker1.addChangeListener(markerChangeListener4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor3);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = chartRenderingInfo15.getPlotInfo();
    java.awt.geom.Rectangle2D rectangle2D17 = plotRenderingInfo16.getPlotArea();
    int i18 = plotRenderingInfo16.getSubplotCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(plotRenderingInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rectangle2D17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel14.setReshowDelay((int)(short)1);
    chartPanel14.setIgnoreRepaint(false);
    java.awt.event.MouseEvent mouseEvent19 = null;
    chartPanel14.mouseDragged(mouseEvent19);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    jThermometer0.revalidate();
    jThermometer0.requestFocus();
    java.awt.Component component4 = jThermometer0.getNextFocusableComponent();
    // The following exception was thrown during execution in test generation
    try {
    java.awt.event.ComponentListener[] componentListener_array5 = component4.getComponentListeners();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component4);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }

    org.jfree.chart.renderer.xy.StandardXYBarPainter standardXYBarPainter0 = new org.jfree.chart.renderer.xy.StandardXYBarPainter();
    java.awt.Graphics2D graphics2D1 = null;
    org.jfree.chart.renderer.xy.XYBarRenderer xYBarRenderer2 = null;
    org.jfree.chart.plot.JThermometer jThermometer5 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle6 = jThermometer5.getVisibleRect();
    int i7 = jThermometer5.getShowAxisLocation();
    java.awt.Event event8 = null;
    boolean b11 = jThermometer5.mouseMove(event8, 1, (int)' ');
    jThermometer5.firePropertyChange("hi!", 0, 2);
    boolean b16 = jThermometer5.isVisible();
    jThermometer5.setFocusTraversalKeysEnabled(true);
    org.jfree.chart.plot.JThermometer jThermometer19 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle20 = jThermometer19.getVisibleRect();
    jThermometer5.paintImmediately(rectangle20);
    org.jfree.ui.RectangleEdge rectangleEdge22 = null;
    // The following exception was thrown during execution in test generation
    try {
    standardXYBarPainter0.paintBar(graphics2D1, xYBarRenderer2, 128, (int)'#', (java.awt.geom.RectangularShape)rectangle20, rectangleEdge22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }

    org.jfree.data.xy.YWithXInterval yWithXInterval3 = new org.jfree.data.xy.YWithXInterval((double)680, (double)1, (double)'4');

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }

    org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number)0L, (java.lang.Number)100L);
    java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + number3 + "' != '" + 100L+ "'", number3.equals(100L));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge11 = null;
    double d12 = categoryAxis6.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle10, rectangleEdge11);
    org.jfree.chart.plot.JThermometer jThermometer17 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event18 = null;
    boolean b20 = jThermometer17.keyDown(event18, 100);
    jThermometer17.setSize((int)(short)100, 8);
    java.awt.Dimension dimension24 = jThermometer17.minimumSize();
    java.awt.Dimension dimension25 = jThermometer17.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
    jThermometer17.removeHierarchyBoundsListener(hierarchyBoundsListener26);
    org.jfree.chart.plot.JThermometer jThermometer28 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle29 = jThermometer28.getVisibleRect();
    java.awt.Rectangle rectangle30 = jThermometer17.getBounds(rectangle29);
    java.awt.Color color31 = java.awt.Color.black;
    float[] f_array37 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array38 = color31.getRGBComponents(f_array37);
    org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle30, (java.awt.Paint)color31);
    org.jfree.chart.axis.CategoryAxis categoryAxis41 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer44 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle45 = jThermometer44.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge46 = null;
    double d47 = categoryAxis41.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle45, rectangleEdge46);
    categoryAxis41.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis41.setTickMarkStroke(stroke50);
    org.jfree.chart.JFreeChart jFreeChart52 = null;
    org.jfree.chart.ChartPanel chartPanel66 = new org.jfree.chart.ChartPanel(jFreeChart52, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel66.setReshowDelay((int)(short)1);
    java.awt.Color color69 = java.awt.Color.WHITE;
    chartPanel66.setZoomOutlinePaint((java.awt.Paint)color69);
    org.jfree.chart.LegendItem legendItem71 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle10, (java.awt.Paint)color31, stroke50, (java.awt.Paint)color69);
    xYShapeRenderer0.setShape((java.awt.Shape)rectangle10);
    xYShapeRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    java.awt.Font font77 = xYShapeRenderer0.getBaseItemLabelFont();
    xYShapeRenderer0.setSeriesVisibleInLegend((java.lang.Boolean)true, true);
    java.awt.Color color82 = org.jfree.chart.ChartColor.DARK_YELLOW;
    org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator86 = new org.jfree.chart.util.DefaultShadowGenerator((int)'#', color82, (float)(-143), (int)(byte)-1, 0.2d);
    xYShapeRenderer0.setBaseItemLabelPaint((java.awt.Paint)color82, true);
    java.awt.Shape shape90 = xYShapeRenderer0.lookupSeriesShape((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(shape90);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }

    org.jfree.data.xml.RootHandler rootHandler0 = new org.jfree.data.xml.RootHandler();
    rootHandler0.skippedEntity("jfreechart-");
    org.xml.sax.Attributes attributes6 = null;
    rootHandler0.startElement("Time", "SAVE", "1.0, -1", attributes6);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }

    java.awt.image.BufferedImage bufferedImage0 = null;
    java.io.OutputStream outputStream2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.encoders.EncoderUtil.writeBufferedImage(bufferedImage0, "RangeType.FULL", outputStream2, (float)12, false);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    int i2 = jThermometer0.getShowAxisLocation();
    int i3 = jThermometer0.getDebugGraphicsOptions();
    jThermometer0.setInheritsPopupMenu(true);
    java.awt.dnd.DropTarget dropTarget6 = jThermometer0.getDropTarget();
    int i7 = jThermometer0.getY();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(dropTarget6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }

    org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
    org.jfree.chart.block.BlockContainer blockContainer1 = null;
    java.awt.Graphics2D graphics2D2 = null;
    org.jfree.chart.block.RectangleConstraint rectangleConstraint5 = new org.jfree.chart.block.RectangleConstraint((double)768, 100.0d);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.ui.Size2D size2D6 = borderArrangement0.arrange(blockContainer1, graphics2D2, rectangleConstraint5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }

    double[][] d_array_array0 = new double[][] {  };
    double[][] d_array_array1 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array0, d_array_array1);
    int i3 = defaultIntervalCategoryDataset2.getRowCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    boolean b15 = chartPanel14.isDomainZoomable();
    double d16 = chartPanel14.getZoomOutFactor();
    boolean b17 = chartPanel14.isRangeZoomable();
    chartPanel14.firePropertyChange(" onMouseOver=\"return stm(['','item'],Style[32]);\" onMouseOut=\"return htm();\"", ' ', '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }

    org.jfree.data.time.DateRange dateRange1 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range4 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange1, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType5 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange7 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange8 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint9 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange7, (org.jfree.data.Range)dateRange8);
    org.jfree.chart.axis.CompassFormat compassFormat10 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType11 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b12 = compassFormat10.equals((java.lang.Object)lengthConstraintType11);
    org.jfree.chart.axis.CompassFormat compassFormat13 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType14 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b15 = compassFormat13.equals((java.lang.Object)lengthConstraintType14);
    boolean b16 = lengthConstraintType11.equals((java.lang.Object)b15);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = new org.jfree.chart.block.RectangleConstraint(0.0d, range4, lengthConstraintType5, (double)1L, (org.jfree.data.Range)dateRange7, lengthConstraintType11);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint19 = rectangleConstraint17.toFixedWidth((double)0.0f);
    org.jfree.data.time.DateRange dateRange21 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range24 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange21, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType25 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange27 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange28 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint29 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange27, (org.jfree.data.Range)dateRange28);
    org.jfree.chart.axis.CompassFormat compassFormat30 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType31 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b32 = compassFormat30.equals((java.lang.Object)lengthConstraintType31);
    org.jfree.chart.axis.CompassFormat compassFormat33 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType34 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b35 = compassFormat33.equals((java.lang.Object)lengthConstraintType34);
    boolean b36 = lengthConstraintType31.equals((java.lang.Object)b35);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint37 = new org.jfree.chart.block.RectangleConstraint(0.0d, range24, lengthConstraintType25, (double)1L, (org.jfree.data.Range)dateRange27, lengthConstraintType31);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint38 = rectangleConstraint19.toRangeWidth(range24);
    org.jfree.data.time.DateRange dateRange39 = new org.jfree.data.time.DateRange(range24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleConstraint19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleConstraint38);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }

    org.jfree.data.time.DateRange dateRange1 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange2 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint3 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange1, (org.jfree.data.Range)dateRange2);
    org.jfree.chart.plot.JThermometer jThermometer8 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event9 = null;
    boolean b11 = jThermometer8.keyDown(event9, 100);
    jThermometer8.setSize((int)(short)100, 8);
    java.awt.Dimension dimension15 = jThermometer8.minimumSize();
    java.awt.Dimension dimension16 = jThermometer8.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener17 = null;
    jThermometer8.removeHierarchyBoundsListener(hierarchyBoundsListener17);
    org.jfree.chart.plot.JThermometer jThermometer19 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle20 = jThermometer19.getVisibleRect();
    java.awt.Rectangle rectangle21 = jThermometer8.getBounds(rectangle20);
    java.awt.Color color22 = java.awt.Color.black;
    float[] f_array28 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array29 = color22.getRGBComponents(f_array28);
    org.jfree.chart.LegendItem legendItem30 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle21, (java.awt.Paint)color22);
    java.awt.Font font31 = legendItem30.getLabelFont();
    legendItem30.setDatasetIndex((int)(byte)10);
    java.awt.Paint paint34 = legendItem30.getOutlinePaint();
    org.jfree.chart.axis.CategoryAxis categoryAxis36 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer39 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle40 = jThermometer39.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge41 = null;
    double d42 = categoryAxis36.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle40, rectangleEdge41);
    categoryAxis36.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke45 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis36.setTickMarkStroke(stroke45);
    java.awt.Color color47 = java.awt.Color.BLACK;
    org.jfree.chart.plot.MeterInterval meterInterval48 = new org.jfree.chart.plot.MeterInterval("", (org.jfree.data.Range)dateRange2, paint34, stroke45, (java.awt.Paint)color47);
    java.lang.String str49 = meterInterval48.getLabel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(font31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d42 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + ""+ "'", str49.equals(""));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }

    org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
    float f1 = categoryAxis3D0.getTickMarkInsideLength();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == 0.0f);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }

    org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
    borderArrangement0.clear();
    org.jfree.chart.block.BlockContainer blockContainer2 = null;
    java.awt.Graphics2D graphics2D3 = null;
    org.jfree.data.time.DateRange dateRange4 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range7 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange4, (double)'a', true);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint9 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange4, (double)8);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.ui.Size2D size2D10 = borderArrangement0.arrange(blockContainer2, graphics2D3, rectangleConstraint9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range7);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge11 = null;
    double d12 = categoryAxis6.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle10, rectangleEdge11);
    org.jfree.chart.plot.JThermometer jThermometer17 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event18 = null;
    boolean b20 = jThermometer17.keyDown(event18, 100);
    jThermometer17.setSize((int)(short)100, 8);
    java.awt.Dimension dimension24 = jThermometer17.minimumSize();
    java.awt.Dimension dimension25 = jThermometer17.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
    jThermometer17.removeHierarchyBoundsListener(hierarchyBoundsListener26);
    org.jfree.chart.plot.JThermometer jThermometer28 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle29 = jThermometer28.getVisibleRect();
    java.awt.Rectangle rectangle30 = jThermometer17.getBounds(rectangle29);
    java.awt.Color color31 = java.awt.Color.black;
    float[] f_array37 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array38 = color31.getRGBComponents(f_array37);
    org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle30, (java.awt.Paint)color31);
    org.jfree.chart.axis.CategoryAxis categoryAxis41 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer44 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle45 = jThermometer44.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge46 = null;
    double d47 = categoryAxis41.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle45, rectangleEdge46);
    categoryAxis41.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis41.setTickMarkStroke(stroke50);
    org.jfree.chart.JFreeChart jFreeChart52 = null;
    org.jfree.chart.ChartPanel chartPanel66 = new org.jfree.chart.ChartPanel(jFreeChart52, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel66.setReshowDelay((int)(short)1);
    java.awt.Color color69 = java.awt.Color.WHITE;
    chartPanel66.setZoomOutlinePaint((java.awt.Paint)color69);
    org.jfree.chart.LegendItem legendItem71 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle10, (java.awt.Paint)color31, stroke50, (java.awt.Paint)color69);
    xYShapeRenderer0.setShape((java.awt.Shape)rectangle10);
    xYShapeRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    java.awt.Stroke stroke77 = xYShapeRenderer0.getGuideLineStroke();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke77);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }

    java.awt.Color color0 = org.jfree.chart.ChartColor.LIGHT_MAGENTA;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color0);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }

    java.lang.String str0 = org.jfree.data.xml.DatasetTags.ITEM_TAG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Item"+ "'", str0.equals("Item"));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    boolean b15 = chartPanel14.isDomainZoomable();
    chartPanel14.setZoomOutFactor((double)768);
    chartPanel14.setVerticalAxisTrace(true);
    chartPanel14.grabFocus();
    // The following exception was thrown during execution in test generation
    try {
    chartPanel14.restoreAutoDomainBounds();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    jThermometer16.requestFocus();
    org.jfree.data.time.DateRange dateRange20 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range23 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange20, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType24 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange26 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange27 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange26, (org.jfree.data.Range)dateRange27);
    org.jfree.chart.axis.CompassFormat compassFormat29 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType30 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b31 = compassFormat29.equals((java.lang.Object)lengthConstraintType30);
    org.jfree.chart.axis.CompassFormat compassFormat32 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType33 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b34 = compassFormat32.equals((java.lang.Object)lengthConstraintType33);
    boolean b35 = lengthConstraintType30.equals((java.lang.Object)b34);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint36 = new org.jfree.chart.block.RectangleConstraint(0.0d, range23, lengthConstraintType24, (double)1L, (org.jfree.data.Range)dateRange26, lengthConstraintType30);
    chartPanel14.add((java.awt.Component)jThermometer16, (java.lang.Object)lengthConstraintType24);
    javax.swing.InputVerifier inputVerifier38 = chartPanel14.getInputVerifier();
    java.awt.event.ComponentListener componentListener39 = null;
    chartPanel14.removeComponentListener(componentListener39);
    chartPanel14.move(5, 0);
    chartPanel14.updateUI();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier38);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }

    org.jfree.chart.LegendItemCollection legendItemCollection0 = new org.jfree.chart.LegendItemCollection();
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.LegendItem legendItem2 = legendItemCollection0.get(7);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }

    java.lang.Class class3 = null;
    org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)13, "ZOOM_DOMAIN_BOTH", "", class3);
    java.util.TimeZone timeZone5 = org.jfree.chart.axis.SegmentedTimeline.NO_DST_TIME_ZONE;
    org.jfree.data.time.TimeSeriesCollection timeSeriesCollection6 = new org.jfree.data.time.TimeSeriesCollection(timeSeries4, timeZone5);
    timeSeries4.setMaximumItemAge(60000L);
    // The following exception was thrown during execution in test generation
    try {
    timeSeries4.delete(6, 128, false);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeZone5);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }

    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event5 = null;
    boolean b7 = jThermometer4.keyDown(event5, 100);
    jThermometer4.setSize((int)(short)100, 8);
    java.awt.Dimension dimension11 = jThermometer4.minimumSize();
    java.awt.Dimension dimension12 = jThermometer4.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener13 = null;
    jThermometer4.removeHierarchyBoundsListener(hierarchyBoundsListener13);
    org.jfree.chart.plot.JThermometer jThermometer15 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle16 = jThermometer15.getVisibleRect();
    java.awt.Rectangle rectangle17 = jThermometer4.getBounds(rectangle16);
    java.awt.Color color18 = java.awt.Color.black;
    float[] f_array24 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array25 = color18.getRGBComponents(f_array24);
    org.jfree.chart.LegendItem legendItem26 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle17, (java.awt.Paint)color18);
    java.awt.Font font27 = legendItem26.getLabelFont();
    double[][] d_array_array28 = new double[][] {  };
    double[][] d_array_array29 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset30 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array28, d_array_array29);
    org.jfree.data.general.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset30, (java.lang.Comparable)0.5d);
    java.util.List list33 = defaultIntervalCategoryDataset30.getSeries();
    org.jfree.data.general.SeriesChangeEvent seriesChangeEvent34 = null;
    defaultIntervalCategoryDataset30.seriesChanged(seriesChangeEvent34);
    org.jfree.chart.JFreeChart jFreeChart36 = null;
    org.jfree.chart.ChartPanel chartPanel50 = new org.jfree.chart.ChartPanel(jFreeChart36, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    boolean b51 = chartPanel50.isDomainZoomable();
    chartPanel50.setZoomOutFactor((double)768);
    boolean b54 = defaultIntervalCategoryDataset30.hasListener((java.util.EventListener)chartPanel50);
    legendItem26.setDataset((org.jfree.data.general.Dataset)defaultIntervalCategoryDataset30);
    java.awt.Stroke stroke56 = legendItem26.getOutlineStroke();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(font27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pieDataset32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke56);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }

    org.jfree.chart.renderer.xy.GradientXYBarPainter gradientXYBarPainter0 = new org.jfree.chart.renderer.xy.GradientXYBarPainter();
    java.awt.Graphics2D graphics2D1 = null;
    org.jfree.chart.renderer.xy.XYBarRenderer xYBarRenderer2 = null;
    org.jfree.chart.plot.JThermometer jThermometer5 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle6 = jThermometer5.getVisibleRect();
    int i7 = jThermometer5.getShowAxisLocation();
    java.awt.Event event8 = null;
    boolean b11 = jThermometer5.mouseMove(event8, 1, (int)' ');
    jThermometer5.firePropertyChange("hi!", 0, 2);
    boolean b16 = jThermometer5.isVisible();
    jThermometer5.setFocusTraversalKeysEnabled(true);
    org.jfree.chart.plot.JThermometer jThermometer19 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle20 = jThermometer19.getVisibleRect();
    jThermometer5.paintImmediately(rectangle20);
    org.jfree.ui.RectangleEdge rectangleEdge22 = null;
    // The following exception was thrown during execution in test generation
    try {
    gradientXYBarPainter0.paintBarShadow(graphics2D1, xYBarRenderer2, 1, (-192), (java.awt.geom.RectangularShape)rectangle20, rectangleEdge22, true);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }

    java.io.PrintWriter printWriter0 = null;
    org.jfree.chart.JFreeChart jFreeChart2 = null;
    org.jfree.chart.ChartPanel chartPanel16 = new org.jfree.chart.ChartPanel(jFreeChart2, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo17 = chartPanel16.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer18 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle19 = jThermometer18.getVisibleRect();
    jThermometer18.requestFocus();
    org.jfree.data.time.DateRange dateRange22 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range25 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange22, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType26 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange28 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange29 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint30 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange28, (org.jfree.data.Range)dateRange29);
    org.jfree.chart.axis.CompassFormat compassFormat31 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType32 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b33 = compassFormat31.equals((java.lang.Object)lengthConstraintType32);
    org.jfree.chart.axis.CompassFormat compassFormat34 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType35 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b36 = compassFormat34.equals((java.lang.Object)lengthConstraintType35);
    boolean b37 = lengthConstraintType32.equals((java.lang.Object)b36);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint38 = new org.jfree.chart.block.RectangleConstraint(0.0d, range25, lengthConstraintType26, (double)1L, (org.jfree.data.Range)dateRange28, lengthConstraintType32);
    chartPanel16.add((java.awt.Component)jThermometer18, (java.lang.Object)lengthConstraintType26);
    int i40 = chartPanel16.getMinimumDrawWidth();
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo41 = chartPanel16.getChartRenderingInfo();
    org.jfree.chart.imagemap.StandardToolTipTagFragmentGenerator standardToolTipTagFragmentGenerator42 = new org.jfree.chart.imagemap.StandardToolTipTagFragmentGenerator();
    org.jfree.chart.imagemap.URLTagFragmentGenerator uRLTagFragmentGenerator43 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.imagemap.ImageMapUtilities.writeImageMap(printWriter0, "", chartRenderingInfo41, (org.jfree.chart.imagemap.ToolTipTagFragmentGenerator)standardToolTipTagFragmentGenerator42, uRLTagFragmentGenerator43);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo41);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }

    java.awt.geom.Rectangle2D rectangle2D0 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b3 = org.jfree.chart.renderer.xy.AbstractXYItemRenderer.isPointInRect(rectangle2D0, (double)1024, (double)(-192));
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }

    double[][] d_array_array0 = new double[][] {  };
    double[][] d_array_array1 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array0, d_array_array1);
    org.jfree.data.general.PieDataset pieDataset4 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset2, (java.lang.Comparable)0.5d);
    java.util.List list5 = defaultIntervalCategoryDataset2.getSeries();
    org.jfree.data.general.SeriesChangeEvent seriesChangeEvent6 = null;
    defaultIntervalCategoryDataset2.seriesChanged(seriesChangeEvent6);
    org.jfree.chart.JFreeChart jFreeChart8 = null;
    org.jfree.chart.ChartPanel chartPanel22 = new org.jfree.chart.ChartPanel(jFreeChart8, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    boolean b23 = chartPanel22.isDomainZoomable();
    chartPanel22.setZoomOutFactor((double)768);
    boolean b26 = defaultIntervalCategoryDataset2.hasListener((java.util.EventListener)chartPanel22);
    java.awt.event.MouseEvent mouseEvent27 = null;
    chartPanel22.mouseDragged(mouseEvent27);
    org.jfree.chart.entity.ChartEntity chartEntity31 = chartPanel22.getEntityForPoint((int)(byte)100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pieDataset4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(chartEntity31);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }

    int i0 = java.text.DateFormat.WEEK_OF_YEAR_FIELD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 12);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }

    double[][] d_array_array0 = new double[][] {  };
    double[][] d_array_array1 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array0, d_array_array1);
    org.jfree.data.general.SeriesDataset[] seriesDataset_array3 = new org.jfree.data.general.SeriesDataset[] { defaultIntervalCategoryDataset2 };
    org.jfree.data.general.CombinedDataset combinedDataset4 = new org.jfree.data.general.CombinedDataset(seriesDataset_array3);
    org.jfree.data.Range range5 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset)combinedDataset4);
    org.jfree.data.Range range6 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset)combinedDataset4);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number9 = combinedDataset4.getEndX(9, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(seriesDataset_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(range5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(range6);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }

    org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues("hi!", "hi!", "");
    int i4 = timePeriodValues3.getMinEndIndex();
    org.jfree.chart.plot.JThermometer jThermometer5 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle6 = jThermometer5.getVisibleRect();
    jThermometer5.requestFocus();
    boolean b8 = timePeriodValues3.equals((java.lang.Object)jThermometer5);
    boolean b10 = jThermometer5.requestFocus(true);
    boolean b11 = jThermometer5.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    jThermometer16.requestFocus();
    org.jfree.data.time.DateRange dateRange20 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range23 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange20, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType24 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange26 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange27 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange26, (org.jfree.data.Range)dateRange27);
    org.jfree.chart.axis.CompassFormat compassFormat29 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType30 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b31 = compassFormat29.equals((java.lang.Object)lengthConstraintType30);
    org.jfree.chart.axis.CompassFormat compassFormat32 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType33 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b34 = compassFormat32.equals((java.lang.Object)lengthConstraintType33);
    boolean b35 = lengthConstraintType30.equals((java.lang.Object)b34);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint36 = new org.jfree.chart.block.RectangleConstraint(0.0d, range23, lengthConstraintType24, (double)1L, (org.jfree.data.Range)dateRange26, lengthConstraintType30);
    chartPanel14.add((java.awt.Component)jThermometer16, (java.lang.Object)lengthConstraintType24);
    javax.swing.InputVerifier inputVerifier38 = chartPanel14.getInputVerifier();
    java.awt.Event event39 = null;
    org.jfree.chart.plot.JThermometer jThermometer40 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event41 = null;
    org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b44 = jThermometer40.gotFocus(event41, (java.lang.Object)timeSeries43);
    boolean b45 = jThermometer40.requestDefaultFocus();
    java.awt.Point point47 = jThermometer40.getMousePosition(false);
    boolean b48 = chartPanel14.lostFocus(event39, (java.lang.Object)jThermometer40);
    org.jfree.chart.JFreeChart jFreeChart49 = chartPanel14.getChart();
    boolean b50 = chartPanel14.isRangeZoomable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jFreeChart49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    jThermometer16.requestFocus();
    org.jfree.data.time.DateRange dateRange20 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range23 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange20, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType24 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange26 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange27 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange26, (org.jfree.data.Range)dateRange27);
    org.jfree.chart.axis.CompassFormat compassFormat29 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType30 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b31 = compassFormat29.equals((java.lang.Object)lengthConstraintType30);
    org.jfree.chart.axis.CompassFormat compassFormat32 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType33 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b34 = compassFormat32.equals((java.lang.Object)lengthConstraintType33);
    boolean b35 = lengthConstraintType30.equals((java.lang.Object)b34);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint36 = new org.jfree.chart.block.RectangleConstraint(0.0d, range23, lengthConstraintType24, (double)1L, (org.jfree.data.Range)dateRange26, lengthConstraintType30);
    chartPanel14.add((java.awt.Component)jThermometer16, (java.lang.Object)lengthConstraintType24);
    java.awt.Event event38 = null;
    boolean b41 = jThermometer16.mouseMove(event38, (-1), (int)' ');
    java.awt.Font font42 = jThermometer16.getFont();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font42);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b4 = jThermometer0.gotFocus(event1, (java.lang.Object)timeSeries3);
    boolean b5 = jThermometer0.requestDefaultFocus();
    java.awt.Component component8 = jThermometer0.locate(100, 52);
    boolean b9 = jThermometer0.requestFocusInWindow();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }

    double[][] d_array_array0 = new double[][] {  };
    double[][] d_array_array1 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array0, d_array_array1);
    org.jfree.data.general.PieDataset pieDataset4 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset2, (java.lang.Comparable)0.5d);
    java.util.List list5 = defaultIntervalCategoryDataset2.getSeries();
    org.jfree.data.Range range6 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset2);
    org.jfree.data.xy.XYDatasetTableModel xYDatasetTableModel7 = new org.jfree.data.xy.XYDatasetTableModel();
    defaultIntervalCategoryDataset2.addChangeListener((org.jfree.data.general.DatasetChangeListener)xYDatasetTableModel7);
    java.lang.Object obj11 = xYDatasetTableModel7.getValueAt(100, 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pieDataset4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(range6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }

    org.jfree.chart.axis.SubCategoryAxis subCategoryAxis1 = new org.jfree.chart.axis.SubCategoryAxis("Time");
    org.jfree.chart.plot.JThermometer jThermometer2 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle3 = jThermometer2.getVisibleRect();
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle5 = jThermometer4.getVisibleRect();
    int i6 = jThermometer4.getShowAxisLocation();
    int i7 = jThermometer4.getWidth();
    java.awt.Component component8 = jThermometer2.add((java.awt.Component)jThermometer4);
    jThermometer2.addNotify();
    java.awt.event.ContainerListener containerListener10 = null;
    jThermometer2.addContainerListener(containerListener10);
    java.awt.Font font12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
    jThermometer2.setValueFont(font12);
    subCategoryAxis1.setSubLabelFont(font12);
    double[][] d_array_array15 = new double[][] {  };
    double[][] d_array_array16 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset17 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array15, d_array_array16);
    org.jfree.data.general.SeriesDataset[] seriesDataset_array18 = new org.jfree.data.general.SeriesDataset[] { defaultIntervalCategoryDataset17 };
    org.jfree.data.general.CombinedDataset combinedDataset19 = new org.jfree.data.general.CombinedDataset(seriesDataset_array18);
    org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset)combinedDataset19);
    combinedDataset19.validateObject();
    boolean b22 = subCategoryAxis1.hasListener((java.util.EventListener)combinedDataset19);
    subCategoryAxis1.setLabel("index.html");
    double d25 = subCategoryAxis1.getLabelAngle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(seriesDataset_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(range20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == 0.0d);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }

    org.jfree.chart.JFreeChart jFreeChart1 = null;
    org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("series", jFreeChart1);
    chartFrame2.setResizable(false);
    chartFrame2.setBounds((int)'#', (int)' ', 9, 0);
    javax.swing.JMenuBar jMenuBar10 = null;
    chartFrame2.setJMenuBar(jMenuBar10);
    chartFrame2.setState(11);
    chartFrame2.show();

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }

    org.jfree.data.xy.YIntervalSeries yIntervalSeries3 = new org.jfree.data.xy.YIntervalSeries((java.lang.Comparable)(byte)100, true, false);
    yIntervalSeries3.setMaximumItemCount((int)(byte)10);
    yIntervalSeries3.clear();

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }

    org.jfree.chart.block.GridArrangement gridArrangement2 = new org.jfree.chart.block.GridArrangement(0, 3);
    gridArrangement2.clear();

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }

    int i0 = java.text.DateFormat.DAY_OF_WEEK_FIELD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 9);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }

    org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions2 = categoryAxis1.getCategoryLabelPositions();
    categoryAxis1.clearCategoryLabelToolTips();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelPositions2);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }

    org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
    float f1 = categoryAxis3D0.getMinorTickMarkInsideLength();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == 0.0f);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }

    org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues("ZOOM_RESET_RANGE", "ZOOM_RESET_DOMAIN", "");
    org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy(100, 100);
    double[][] d_array_array7 = new double[][] {  };
    double[][] d_array_array8 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset9 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array7, d_array_array8);
    org.jfree.data.general.SeriesDataset[] seriesDataset_array10 = new org.jfree.data.general.SeriesDataset[] { defaultIntervalCategoryDataset9 };
    org.jfree.data.general.CombinedDataset combinedDataset11 = new org.jfree.data.general.CombinedDataset(seriesDataset_array10);
    timePeriodValues3.addChangeListener((org.jfree.data.general.SeriesChangeListener)combinedDataset11);
    int i13 = timePeriodValues3.getMaxMiddleIndex();
    org.jfree.data.time.TimePeriodValuesCollection timePeriodValuesCollection14 = new org.jfree.data.time.TimePeriodValuesCollection(timePeriodValues3);
    org.jfree.data.time.TimePeriodValues timePeriodValues18 = new org.jfree.data.time.TimePeriodValues("hi!", "hi!", "");
    int i19 = timePeriodValues18.getMinEndIndex();
    org.jfree.chart.plot.JThermometer jThermometer20 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle21 = jThermometer20.getVisibleRect();
    jThermometer20.requestFocus();
    boolean b23 = timePeriodValues18.equals((java.lang.Object)jThermometer20);
    java.lang.String str24 = timePeriodValues18.getRangeDescription();
    timePeriodValuesCollection14.addSeries(timePeriodValues18);
    int i26 = timePeriodValuesCollection14.getSeriesCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timePeriodValues6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(seriesDataset_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 2);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }

    org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)11, "ZOOM_RESET_DOMAIN", "RectangleConstraintType.RANGE");

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    boolean b3 = jThermometer0.keyDown(event1, 100);
    jThermometer0.setSize((int)(short)100, 8);
    java.awt.Dimension dimension7 = jThermometer0.minimumSize();
    java.awt.Dimension dimension8 = jThermometer0.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
    jThermometer0.removeHierarchyBoundsListener(hierarchyBoundsListener9);
    org.jfree.chart.plot.JThermometer jThermometer11 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle12 = jThermometer11.getVisibleRect();
    java.awt.Rectangle rectangle13 = jThermometer0.getBounds(rectangle12);
    jThermometer0.enable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle13);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }

    org.jfree.data.KeyedValueComparatorType keyedValueComparatorType0 = org.jfree.data.KeyedValueComparatorType.BY_KEY;
    org.jfree.util.SortOrder sortOrder1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.KeyedValueComparator keyedValueComparator2 = new org.jfree.data.KeyedValueComparator(keyedValueComparatorType0, sortOrder1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(keyedValueComparatorType0);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    boolean b3 = jThermometer0.keyDown(event1, 100);
    jThermometer0.setSize((int)(short)100, 8);
    java.awt.Dimension dimension7 = jThermometer0.minimumSize();
    java.awt.Dimension dimension8 = jThermometer0.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
    jThermometer0.removeHierarchyBoundsListener(hierarchyBoundsListener9);
    javax.swing.InputMap inputMap11 = jThermometer0.getInputMap();
    jThermometer0.repaint((long)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap11);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    jThermometer16.requestFocus();
    org.jfree.data.time.DateRange dateRange20 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range23 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange20, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType24 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange26 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange27 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange26, (org.jfree.data.Range)dateRange27);
    org.jfree.chart.axis.CompassFormat compassFormat29 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType30 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b31 = compassFormat29.equals((java.lang.Object)lengthConstraintType30);
    org.jfree.chart.axis.CompassFormat compassFormat32 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType33 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b34 = compassFormat32.equals((java.lang.Object)lengthConstraintType33);
    boolean b35 = lengthConstraintType30.equals((java.lang.Object)b34);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint36 = new org.jfree.chart.block.RectangleConstraint(0.0d, range23, lengthConstraintType24, (double)1L, (org.jfree.data.Range)dateRange26, lengthConstraintType30);
    chartPanel14.add((java.awt.Component)jThermometer16, (java.lang.Object)lengthConstraintType24);
    javax.swing.InputVerifier inputVerifier38 = chartPanel14.getInputVerifier();
    boolean b39 = chartPanel14.getRefreshBuffer();
    java.awt.Event event40 = null;
    boolean b42 = chartPanel14.keyUp(event40, 2);
    chartPanel14.repaint(60000L, 13, (int)(short)100, (int)(short)-1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.ChartTransferable chartTransferable4 = new org.jfree.chart.ChartTransferable(jFreeChart0, 11, 13, false);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }

    org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues("hi!", "hi!", "");
    int i4 = timePeriodValues3.getMinEndIndex();
    org.jfree.chart.plot.JThermometer jThermometer5 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle6 = jThermometer5.getVisibleRect();
    jThermometer5.requestFocus();
    boolean b8 = timePeriodValues3.equals((java.lang.Object)jThermometer5);
    boolean b10 = jThermometer5.requestFocus(true);
    org.jfree.chart.axis.CategoryAxis categoryAxis12 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer15 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle16 = jThermometer15.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge17 = null;
    double d18 = categoryAxis12.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle16, rectangleEdge17);
    org.jfree.chart.plot.JThermometer jThermometer25 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event26 = null;
    boolean b28 = jThermometer25.keyDown(event26, 100);
    jThermometer25.setSize((int)(short)100, 8);
    java.awt.Dimension dimension32 = jThermometer25.minimumSize();
    java.awt.Dimension dimension33 = jThermometer25.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener34 = null;
    jThermometer25.removeHierarchyBoundsListener(hierarchyBoundsListener34);
    org.jfree.chart.plot.JThermometer jThermometer36 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle37 = jThermometer36.getVisibleRect();
    java.awt.Rectangle rectangle38 = jThermometer25.getBounds(rectangle37);
    java.awt.Color color39 = java.awt.Color.black;
    float[] f_array45 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array46 = color39.getRGBComponents(f_array45);
    org.jfree.chart.LegendItem legendItem47 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle38, (java.awt.Paint)color39);
    org.jfree.ui.RectangleEdge rectangleEdge48 = null;
    double d49 = categoryAxis12.getCategoryEnd(9, 13, (java.awt.geom.Rectangle2D)rectangle38, rectangleEdge48);
    jThermometer5.paintImmediately(rectangle38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d49 == 0.0d);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }

    org.jfree.data.xy.XYIntervalSeries xYIntervalSeries1 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    double d3 = xYIntervalSeries1.getYHighValue((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }

    org.jfree.chart.JFreeChart jFreeChart1 = null;
    org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("series", jFreeChart1);
    chartFrame2.setResizable(false);
    chartFrame2.setBounds((int)'#', (int)' ', 9, 0);
    int i10 = chartFrame2.getCursorType();
    boolean b11 = chartFrame2.isActive();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }

    int i0 = org.jfree.chart.util.HexNumberFormat.QWORD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 16);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }

    org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double)' ');
    java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
    org.jfree.ui.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
    // The following exception was thrown during execution in test generation
    try {
    valueMarker1.setAlpha((float)11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor3);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }

    org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues("hi!", "hi!", "");
    java.beans.VetoableChangeListener vetoableChangeListener4 = null;
    timePeriodValues3.removeVetoableChangeListener(vetoableChangeListener4);
    int i6 = timePeriodValues3.getMaxStartIndex();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }

    org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle5 = jThermometer4.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge6 = null;
    double d7 = categoryAxis1.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle5, rectangleEdge6);
    categoryAxis1.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis1.setTickMarkStroke(stroke10);
    categoryAxis1.setMinorTickMarkInsideLength((float)2);
    java.lang.Object obj14 = categoryAxis1.clone();
    java.awt.Color color16 = java.awt.Color.BLACK;
    org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator20 = new org.jfree.chart.util.DefaultShadowGenerator((int)(byte)100, color16, (float)0, (int)'4', (double)1.0f);
    java.awt.Color color21 = defaultShadowGenerator20.getShadowColor();
    categoryAxis1.setTickLabelPaint((java.awt.Paint)color21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color21);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    jThermometer16.requestFocus();
    org.jfree.data.time.DateRange dateRange20 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range23 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange20, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType24 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange26 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange27 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange26, (org.jfree.data.Range)dateRange27);
    org.jfree.chart.axis.CompassFormat compassFormat29 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType30 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b31 = compassFormat29.equals((java.lang.Object)lengthConstraintType30);
    org.jfree.chart.axis.CompassFormat compassFormat32 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType33 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b34 = compassFormat32.equals((java.lang.Object)lengthConstraintType33);
    boolean b35 = lengthConstraintType30.equals((java.lang.Object)b34);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint36 = new org.jfree.chart.block.RectangleConstraint(0.0d, range23, lengthConstraintType24, (double)1L, (org.jfree.data.Range)dateRange26, lengthConstraintType30);
    chartPanel14.add((java.awt.Component)jThermometer16, (java.lang.Object)lengthConstraintType24);
    java.awt.Paint paint38 = chartPanel14.getZoomOutlinePaint();
    boolean b39 = chartPanel14.hasFocus();
    java.awt.Component component42 = chartPanel14.findComponentAt(52, (int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component42);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }

    java.awt.Color color0 = org.jfree.chart.ChartColor.VERY_LIGHT_CYAN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color0);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }

    java.lang.Class class3 = null;
    org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)13, "ZOOM_DOMAIN_BOTH", "", class3);
    java.util.TimeZone timeZone5 = org.jfree.chart.axis.SegmentedTimeline.NO_DST_TIME_ZONE;
    org.jfree.data.time.TimeSeriesCollection timeSeriesCollection6 = new org.jfree.data.time.TimeSeriesCollection(timeSeries4, timeZone5);
    int i7 = timeSeriesCollection6.getSeriesCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeZone5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }

    org.jfree.chart.axis.NumberTickUnit numberTickUnit1 = new org.jfree.chart.axis.NumberTickUnit((double)10.0f);
    org.jfree.chart.axis.CategoryLabelWidthType categoryLabelWidthType2 = org.jfree.chart.axis.CategoryLabelWidthType.RANGE;
    int i3 = numberTickUnit1.compareTo((java.lang.Object)categoryLabelWidthType2);
    java.awt.Paint paint4 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LINE_PAINT;
    int i5 = numberTickUnit1.compareTo((java.lang.Object)paint4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelWidthType2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }

    org.jfree.data.time.DateRange dateRange1 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range4 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange1, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType5 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange7 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange8 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint9 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange7, (org.jfree.data.Range)dateRange8);
    org.jfree.chart.axis.CompassFormat compassFormat10 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType11 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b12 = compassFormat10.equals((java.lang.Object)lengthConstraintType11);
    org.jfree.chart.axis.CompassFormat compassFormat13 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType14 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b15 = compassFormat13.equals((java.lang.Object)lengthConstraintType14);
    boolean b16 = lengthConstraintType11.equals((java.lang.Object)b15);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = new org.jfree.chart.block.RectangleConstraint(0.0d, range4, lengthConstraintType5, (double)1L, (org.jfree.data.Range)dateRange7, lengthConstraintType11);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint19 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange7, (double)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }

    org.jfree.chart.axis.NumberAxis numberAxis0 = null;
    org.jfree.chart.plot.JThermometer jThermometer5 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle6 = jThermometer5.getVisibleRect();
    org.jfree.chart.plot.JThermometer jThermometer7 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle8 = jThermometer7.getVisibleRect();
    int i9 = jThermometer7.getShowAxisLocation();
    int i10 = jThermometer7.getWidth();
    java.awt.Component component11 = jThermometer5.add((java.awt.Component)jThermometer7);
    jThermometer5.addNotify();
    java.awt.event.ContainerListener containerListener13 = null;
    jThermometer5.addContainerListener(containerListener13);
    java.awt.Font font15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
    jThermometer5.setValueFont(font15);
    org.jfree.chart.axis.MarkerAxisBand markerAxisBand17 = new org.jfree.chart.axis.MarkerAxisBand(numberAxis0, Double.NaN, 0.0d, (double)100, (double)8, font15);
    org.jfree.data.xml.RootHandler rootHandler18 = new org.jfree.data.xml.RootHandler();
    rootHandler18.endElement("E", "E", "jfreechart-");
    boolean b23 = markerAxisBand17.equals((java.lang.Object)rootHandler18);
    org.jfree.data.xml.PieDatasetHandler pieDatasetHandler24 = new org.jfree.data.xml.PieDatasetHandler();
    org.jfree.data.xml.ItemHandler itemHandler25 = new org.jfree.data.xml.ItemHandler(rootHandler18, (org.xml.sax.helpers.DefaultHandler)pieDatasetHandler24);
    org.jfree.data.xml.CategorySeriesHandler categorySeriesHandler26 = new org.jfree.data.xml.CategorySeriesHandler((org.jfree.data.xml.RootHandler)pieDatasetHandler24);
    org.xml.sax.SAXParseException sAXParseException27 = null;
    // The following exception was thrown during execution in test generation
    try {
    pieDatasetHandler24.fatalError(sAXParseException27);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }

    org.jfree.chart.StrokeMap strokeMap0 = new org.jfree.chart.StrokeMap();
    org.jfree.data.time.TimePeriodValues timePeriodValues4 = new org.jfree.data.time.TimePeriodValues("ZOOM_RESET_RANGE", "ZOOM_RESET_DOMAIN", "");
    org.jfree.data.time.TimePeriodValues timePeriodValues7 = timePeriodValues4.createCopy(100, 100);
    double[][] d_array_array8 = new double[][] {  };
    double[][] d_array_array9 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset10 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array8, d_array_array9);
    org.jfree.data.general.SeriesDataset[] seriesDataset_array11 = new org.jfree.data.general.SeriesDataset[] { defaultIntervalCategoryDataset10 };
    org.jfree.data.general.CombinedDataset combinedDataset12 = new org.jfree.data.general.CombinedDataset(seriesDataset_array11);
    timePeriodValues4.addChangeListener((org.jfree.data.general.SeriesChangeListener)combinedDataset12);
    int i14 = timePeriodValues4.getMaxMiddleIndex();
    boolean b15 = strokeMap0.equals((java.lang.Object)i14);
    org.jfree.text.TextBox textBox19 = null;
    org.jfree.chart.plot.PieLabelRecord pieLabelRecord23 = new org.jfree.chart.plot.PieLabelRecord((java.lang.Comparable)(-1L), (double)10, (double)10.0f, textBox19, (double)(byte)10, (double)0L, (double)0.5f);
    pieLabelRecord23.setBaseY((double)(byte)1);
    double d26 = pieLabelRecord23.getAllocatedY();
    java.lang.String str27 = pieLabelRecord23.toString();
    java.awt.Stroke stroke28 = strokeMap0.getStroke((java.lang.Comparable)str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timePeriodValues7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(seriesDataset_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d26 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "1.0, -1"+ "'", str27.equals("1.0, -1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(stroke28);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }

    org.jfree.data.time.DateRange dateRange1 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range4 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange1, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType5 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange7 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange8 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint9 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange7, (org.jfree.data.Range)dateRange8);
    org.jfree.chart.axis.CompassFormat compassFormat10 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType11 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b12 = compassFormat10.equals((java.lang.Object)lengthConstraintType11);
    org.jfree.chart.axis.CompassFormat compassFormat13 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType14 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b15 = compassFormat13.equals((java.lang.Object)lengthConstraintType14);
    boolean b16 = lengthConstraintType11.equals((java.lang.Object)b15);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = new org.jfree.chart.block.RectangleConstraint(0.0d, range4, lengthConstraintType5, (double)1L, (org.jfree.data.Range)dateRange7, lengthConstraintType11);
    double d18 = dateRange7.getLowerBound();
    double d19 = dateRange7.getCentralValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 0.5d);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    jThermometer0.revalidate();
    jThermometer0.requestFocus();
    java.awt.Component component4 = jThermometer0.getNextFocusableComponent();
    java.awt.Event event5 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = component4.mouseEnter(event5, 680, 7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component4);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }

    org.jfree.data.function.PowerFunction2D powerFunction2D2 = new org.jfree.data.function.PowerFunction2D(0.05d, (double)4);
    double d3 = powerFunction2D2.getB();
    double d4 = powerFunction2D2.getA();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 4.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.05d);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }

    java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getPercentInstance();
    org.jfree.chart.axis.NumberTickUnit numberTickUnit3 = new org.jfree.chart.axis.NumberTickUnit((double)(-1.0f), numberFormat1, 1);
    java.lang.String str5 = numberFormat1.format((double)11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(numberFormat1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1,100%"+ "'", str5.equals("1,100%"));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }

    org.jfree.chart.plot.CrosshairState crosshairState0 = new org.jfree.chart.plot.CrosshairState();
    crosshairState0.setDatasetIndex(12);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }

    java.awt.Paint paint0 = org.jfree.chart.annotations.TextAnnotation.DEFAULT_PAINT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint0);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }

    org.jfree.chart.urls.StandardCategoryURLGenerator standardCategoryURLGenerator3 = new org.jfree.chart.urls.StandardCategoryURLGenerator("1,100%", "ZOOM_RESET_DOMAIN", "1.0, -1");

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    jThermometer16.requestFocus();
    org.jfree.data.time.DateRange dateRange20 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range23 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange20, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType24 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange26 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange27 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange26, (org.jfree.data.Range)dateRange27);
    org.jfree.chart.axis.CompassFormat compassFormat29 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType30 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b31 = compassFormat29.equals((java.lang.Object)lengthConstraintType30);
    org.jfree.chart.axis.CompassFormat compassFormat32 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType33 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b34 = compassFormat32.equals((java.lang.Object)lengthConstraintType33);
    boolean b35 = lengthConstraintType30.equals((java.lang.Object)b34);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint36 = new org.jfree.chart.block.RectangleConstraint(0.0d, range23, lengthConstraintType24, (double)1L, (org.jfree.data.Range)dateRange26, lengthConstraintType30);
    chartPanel14.add((java.awt.Component)jThermometer16, (java.lang.Object)lengthConstraintType24);
    org.jfree.chart.plot.JThermometer jThermometer38 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event39 = null;
    boolean b41 = jThermometer38.keyDown(event39, 100);
    jThermometer38.setVisible(false);
    java.awt.Point point44 = jThermometer38.location();
    java.awt.Point point45 = chartPanel14.getLocation(point44);
    chartPanel14.setDoubleBuffered(true);
    java.awt.dnd.DropTarget dropTarget48 = null;
    chartPanel14.setDropTarget(dropTarget48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point45);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }

    org.jfree.chart.axis.SubCategoryAxis subCategoryAxis1 = new org.jfree.chart.axis.SubCategoryAxis("Time");
    org.jfree.chart.plot.JThermometer jThermometer2 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle3 = jThermometer2.getVisibleRect();
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle5 = jThermometer4.getVisibleRect();
    int i6 = jThermometer4.getShowAxisLocation();
    int i7 = jThermometer4.getWidth();
    java.awt.Component component8 = jThermometer2.add((java.awt.Component)jThermometer4);
    jThermometer2.addNotify();
    java.awt.event.ContainerListener containerListener10 = null;
    jThermometer2.addContainerListener(containerListener10);
    java.awt.Font font12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
    jThermometer2.setValueFont(font12);
    subCategoryAxis1.setSubLabelFont(font12);
    double[][] d_array_array15 = new double[][] {  };
    double[][] d_array_array16 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset17 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array15, d_array_array16);
    org.jfree.data.general.SeriesDataset[] seriesDataset_array18 = new org.jfree.data.general.SeriesDataset[] { defaultIntervalCategoryDataset17 };
    org.jfree.data.general.CombinedDataset combinedDataset19 = new org.jfree.data.general.CombinedDataset(seriesDataset_array18);
    org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset)combinedDataset19);
    combinedDataset19.validateObject();
    boolean b22 = subCategoryAxis1.hasListener((java.util.EventListener)combinedDataset19);
    subCategoryAxis1.setLabel("index.html");
    subCategoryAxis1.setCategoryMargin((double)255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(seriesDataset_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(range20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }

    org.jfree.data.time.TimeSeriesCollection timeSeriesCollection0 = new org.jfree.data.time.TimeSeriesCollection();
    org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    java.beans.VetoableChangeListener vetoableChangeListener3 = null;
    timeSeries2.addVetoableChangeListener(vetoableChangeListener3);
    timeSeriesCollection0.removeSeries(timeSeries2);
    org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
    org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.time.TimeSeries timeSeries8 = timeSeries2.createCopy(regularTimePeriod6, regularTimePeriod7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test141"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    jThermometer16.requestFocus();
    org.jfree.data.time.DateRange dateRange20 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range23 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange20, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType24 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange26 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange27 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange26, (org.jfree.data.Range)dateRange27);
    org.jfree.chart.axis.CompassFormat compassFormat29 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType30 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b31 = compassFormat29.equals((java.lang.Object)lengthConstraintType30);
    org.jfree.chart.axis.CompassFormat compassFormat32 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType33 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b34 = compassFormat32.equals((java.lang.Object)lengthConstraintType33);
    boolean b35 = lengthConstraintType30.equals((java.lang.Object)b34);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint36 = new org.jfree.chart.block.RectangleConstraint(0.0d, range23, lengthConstraintType24, (double)1L, (org.jfree.data.Range)dateRange26, lengthConstraintType30);
    chartPanel14.add((java.awt.Component)jThermometer16, (java.lang.Object)lengthConstraintType24);
    int i38 = chartPanel14.getMinimumDrawWidth();
    java.awt.Graphics graphics39 = null;
    java.awt.print.PageFormat pageFormat40 = null;
    int i42 = chartPanel14.print(graphics39, pageFormat40, 9);
    java.io.File file43 = chartPanel14.getDefaultDirectoryForSaveAs();
    java.awt.Color color44 = java.awt.Color.GREEN;
    chartPanel14.setZoomOutlinePaint((java.awt.Paint)color44);
    java.awt.LayoutManager layoutManager46 = chartPanel14.getLayout();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(file43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(layoutManager46);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test142"); }

    org.jfree.data.xy.XYIntervalSeries xYIntervalSeries1 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    double d3 = xYIntervalSeries1.getYLowValue((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test143"); }

    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline3 = new org.jfree.chart.axis.SegmentedTimeline((long)0, (int)(byte)-1, 3);
    boolean b4 = segmentedTimeline3.getAdjustForDaylightSaving();
    int i5 = segmentedTimeline3.getSegmentsIncluded();
    java.lang.Object obj6 = segmentedTimeline3.clone();
    long long7 = segmentedTimeline3.getSegmentsExcludedSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test144"); }

    org.jfree.data.xy.YIntervalDataItem yIntervalDataItem4 = new org.jfree.data.xy.YIntervalDataItem((double)100, (double)100, (double)13, (double)' ');
    org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)100);
    int i6 = xYSeries5.getItemCount();
    // The following exception was thrown during execution in test generation
    try {
    xYSeries5.updateByIndex((int)(short)-1, (java.lang.Number)1024);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test145"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    org.jfree.chart.plot.JThermometer jThermometer2 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle3 = jThermometer2.getVisibleRect();
    int i4 = jThermometer2.getShowAxisLocation();
    int i5 = jThermometer2.getWidth();
    java.awt.Component component6 = jThermometer0.add((java.awt.Component)jThermometer2);
    java.util.Locale locale7 = null;
    jThermometer0.setLocale(locale7);
    java.awt.Dimension dimension9 = jThermometer0.minimumSize();
    org.jfree.chart.plot.JThermometer jThermometer10 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event11 = null;
    boolean b13 = jThermometer10.keyDown(event11, 100);
    jThermometer10.setSize((int)(short)100, 8);
    org.jfree.chart.plot.JThermometer jThermometer17 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event18 = null;
    boolean b20 = jThermometer17.keyDown(event18, 100);
    jThermometer17.setSize((int)(short)100, 8);
    java.awt.Dimension dimension24 = jThermometer17.minimumSize();
    java.awt.Dimension dimension25 = jThermometer17.preferredSize();
    java.awt.Dimension dimension26 = jThermometer10.getSize(dimension25);
    java.awt.Dimension dimension27 = jThermometer0.getSize(dimension25);
    float f28 = jThermometer0.getAlignmentY();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f28 == 0.5f);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test146"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    jThermometer16.requestFocus();
    org.jfree.data.time.DateRange dateRange20 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range23 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange20, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType24 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange26 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange27 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange26, (org.jfree.data.Range)dateRange27);
    org.jfree.chart.axis.CompassFormat compassFormat29 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType30 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b31 = compassFormat29.equals((java.lang.Object)lengthConstraintType30);
    org.jfree.chart.axis.CompassFormat compassFormat32 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType33 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b34 = compassFormat32.equals((java.lang.Object)lengthConstraintType33);
    boolean b35 = lengthConstraintType30.equals((java.lang.Object)b34);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint36 = new org.jfree.chart.block.RectangleConstraint(0.0d, range23, lengthConstraintType24, (double)1L, (org.jfree.data.Range)dateRange26, lengthConstraintType30);
    chartPanel14.add((java.awt.Component)jThermometer16, (java.lang.Object)lengthConstraintType24);
    javax.swing.InputVerifier inputVerifier38 = chartPanel14.getInputVerifier();
    boolean b39 = chartPanel14.getRefreshBuffer();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array40 = chartPanel14.getMouseMotionListeners();
    java.awt.Event event41 = null;
    boolean b44 = chartPanel14.mouseExit(event41, 13, 768);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test147"); }

    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event5 = null;
    boolean b7 = jThermometer4.keyDown(event5, 100);
    jThermometer4.setSize((int)(short)100, 8);
    java.awt.Dimension dimension11 = jThermometer4.minimumSize();
    java.awt.Dimension dimension12 = jThermometer4.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener13 = null;
    jThermometer4.removeHierarchyBoundsListener(hierarchyBoundsListener13);
    org.jfree.chart.plot.JThermometer jThermometer15 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle16 = jThermometer15.getVisibleRect();
    java.awt.Rectangle rectangle17 = jThermometer4.getBounds(rectangle16);
    java.awt.Color color18 = java.awt.Color.black;
    float[] f_array24 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array25 = color18.getRGBComponents(f_array24);
    org.jfree.chart.LegendItem legendItem26 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle17, (java.awt.Paint)color18);
    java.awt.Font font27 = legendItem26.getLabelFont();
    java.lang.String str28 = legendItem26.getLabel();
    java.lang.String str29 = legendItem26.getToolTipText();
    legendItem26.setToolTipText("RectangleConstraintType.RANGE");
    java.awt.Paint paint32 = legendItem26.getOutlinePaint();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(font27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint32);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test148"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    jThermometer16.requestFocus();
    org.jfree.data.time.DateRange dateRange20 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range23 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange20, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType24 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange26 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange27 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange26, (org.jfree.data.Range)dateRange27);
    org.jfree.chart.axis.CompassFormat compassFormat29 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType30 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b31 = compassFormat29.equals((java.lang.Object)lengthConstraintType30);
    org.jfree.chart.axis.CompassFormat compassFormat32 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType33 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b34 = compassFormat32.equals((java.lang.Object)lengthConstraintType33);
    boolean b35 = lengthConstraintType30.equals((java.lang.Object)b34);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint36 = new org.jfree.chart.block.RectangleConstraint(0.0d, range23, lengthConstraintType24, (double)1L, (org.jfree.data.Range)dateRange26, lengthConstraintType30);
    chartPanel14.add((java.awt.Component)jThermometer16, (java.lang.Object)lengthConstraintType24);
    chartPanel14.updateUI();
    java.lang.Object obj39 = chartPanel14.getTreeLock();
    chartPanel14.setZoomTriggerDistance(7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj39);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test149"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    jThermometer16.requestFocus();
    org.jfree.data.time.DateRange dateRange20 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range23 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange20, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType24 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange26 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange27 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange26, (org.jfree.data.Range)dateRange27);
    org.jfree.chart.axis.CompassFormat compassFormat29 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType30 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b31 = compassFormat29.equals((java.lang.Object)lengthConstraintType30);
    org.jfree.chart.axis.CompassFormat compassFormat32 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType33 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b34 = compassFormat32.equals((java.lang.Object)lengthConstraintType33);
    boolean b35 = lengthConstraintType30.equals((java.lang.Object)b34);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint36 = new org.jfree.chart.block.RectangleConstraint(0.0d, range23, lengthConstraintType24, (double)1L, (org.jfree.data.Range)dateRange26, lengthConstraintType30);
    chartPanel14.add((java.awt.Component)jThermometer16, (java.lang.Object)lengthConstraintType24);
    javax.swing.InputVerifier inputVerifier38 = chartPanel14.getInputVerifier();
    boolean b39 = chartPanel14.getRefreshBuffer();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array40 = chartPanel14.getMouseMotionListeners();
    java.awt.peer.ComponentPeer componentPeer41 = chartPanel14.getPeer();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentPeer41);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test150"); }

    org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double)' ');
    double d2 = valueMarker1.getValue();
    org.jfree.ui.RectangleInsets rectangleInsets3 = valueMarker1.getLabelOffset();
    org.jfree.ui.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor4);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test151"); }

    org.jfree.chart.plot.GreyPalette greyPalette0 = new org.jfree.chart.plot.GreyPalette();

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test152"); }

    org.jfree.data.time.ohlc.OHLCSeriesCollection oHLCSeriesCollection0 = new org.jfree.data.time.ohlc.OHLCSeriesCollection();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number3 = oHLCSeriesCollection0.getY((int)(short)0, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test153"); }

    org.jfree.data.xy.YIntervalDataItem yIntervalDataItem4 = new org.jfree.data.xy.YIntervalDataItem((double)100, (double)100, (double)13, (double)' ');
    org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)100);
    int i6 = xYSeries5.getItemCount();
    xYSeries5.setMaximumItemCount(8);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number10 = xYSeries5.getX((-143));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test154"); }

    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions1 = org.jfree.chart.axis.CategoryLabelPositions.createDownRotationLabelPositions((double)2.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelPositions1);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test155"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge11 = null;
    double d12 = categoryAxis6.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle10, rectangleEdge11);
    org.jfree.chart.plot.JThermometer jThermometer17 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event18 = null;
    boolean b20 = jThermometer17.keyDown(event18, 100);
    jThermometer17.setSize((int)(short)100, 8);
    java.awt.Dimension dimension24 = jThermometer17.minimumSize();
    java.awt.Dimension dimension25 = jThermometer17.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
    jThermometer17.removeHierarchyBoundsListener(hierarchyBoundsListener26);
    org.jfree.chart.plot.JThermometer jThermometer28 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle29 = jThermometer28.getVisibleRect();
    java.awt.Rectangle rectangle30 = jThermometer17.getBounds(rectangle29);
    java.awt.Color color31 = java.awt.Color.black;
    float[] f_array37 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array38 = color31.getRGBComponents(f_array37);
    org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle30, (java.awt.Paint)color31);
    org.jfree.chart.axis.CategoryAxis categoryAxis41 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer44 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle45 = jThermometer44.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge46 = null;
    double d47 = categoryAxis41.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle45, rectangleEdge46);
    categoryAxis41.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis41.setTickMarkStroke(stroke50);
    org.jfree.chart.JFreeChart jFreeChart52 = null;
    org.jfree.chart.ChartPanel chartPanel66 = new org.jfree.chart.ChartPanel(jFreeChart52, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel66.setReshowDelay((int)(short)1);
    java.awt.Color color69 = java.awt.Color.WHITE;
    chartPanel66.setZoomOutlinePaint((java.awt.Paint)color69);
    org.jfree.chart.LegendItem legendItem71 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle10, (java.awt.Paint)color31, stroke50, (java.awt.Paint)color69);
    xYShapeRenderer0.setShape((java.awt.Shape)rectangle10);
    boolean b73 = xYShapeRenderer0.getDrawOutlines();
    org.jfree.chart.labels.XYToolTipGenerator xYToolTipGenerator74 = null;
    xYShapeRenderer0.setBaseToolTipGenerator(xYToolTipGenerator74);
    java.awt.Paint paint77 = xYShapeRenderer0.getSeriesItemLabelPaint(52);
    boolean b78 = xYShapeRenderer0.getBaseCreateEntities();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(paint77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test156"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge11 = null;
    double d12 = categoryAxis6.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle10, rectangleEdge11);
    org.jfree.chart.plot.JThermometer jThermometer17 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event18 = null;
    boolean b20 = jThermometer17.keyDown(event18, 100);
    jThermometer17.setSize((int)(short)100, 8);
    java.awt.Dimension dimension24 = jThermometer17.minimumSize();
    java.awt.Dimension dimension25 = jThermometer17.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
    jThermometer17.removeHierarchyBoundsListener(hierarchyBoundsListener26);
    org.jfree.chart.plot.JThermometer jThermometer28 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle29 = jThermometer28.getVisibleRect();
    java.awt.Rectangle rectangle30 = jThermometer17.getBounds(rectangle29);
    java.awt.Color color31 = java.awt.Color.black;
    float[] f_array37 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array38 = color31.getRGBComponents(f_array37);
    org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle30, (java.awt.Paint)color31);
    org.jfree.chart.axis.CategoryAxis categoryAxis41 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer44 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle45 = jThermometer44.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge46 = null;
    double d47 = categoryAxis41.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle45, rectangleEdge46);
    categoryAxis41.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis41.setTickMarkStroke(stroke50);
    org.jfree.chart.JFreeChart jFreeChart52 = null;
    org.jfree.chart.ChartPanel chartPanel66 = new org.jfree.chart.ChartPanel(jFreeChart52, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel66.setReshowDelay((int)(short)1);
    java.awt.Color color69 = java.awt.Color.WHITE;
    chartPanel66.setZoomOutlinePaint((java.awt.Paint)color69);
    org.jfree.chart.LegendItem legendItem71 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle10, (java.awt.Paint)color31, stroke50, (java.awt.Paint)color69);
    xYShapeRenderer0.setShape((java.awt.Shape)rectangle10);
    xYShapeRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    java.awt.Font font77 = xYShapeRenderer0.getBaseItemLabelFont();
    xYShapeRenderer0.setSeriesVisibleInLegend((java.lang.Boolean)true, true);
    java.awt.Color color82 = org.jfree.chart.ChartColor.DARK_YELLOW;
    org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator86 = new org.jfree.chart.util.DefaultShadowGenerator((int)'#', color82, (float)(-143), (int)(byte)-1, 0.2d);
    xYShapeRenderer0.setBaseItemLabelPaint((java.awt.Paint)color82, true);
    java.awt.Color color89 = org.jfree.chart.ChartColor.VERY_LIGHT_MAGENTA;
    xYShapeRenderer0.setFillPaint((java.awt.Paint)color89, false);
    java.awt.Shape shape93 = xYShapeRenderer0.lookupLegendShape(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(shape93);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test157"); }

    org.jfree.data.xy.YIntervalSeries yIntervalSeries3 = new org.jfree.data.xy.YIntervalSeries((java.lang.Comparable)(byte)100, true, false);
    yIntervalSeries3.setMaximumItemCount((int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number7 = yIntervalSeries3.getX(52);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test158"); }

    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline0 = org.jfree.chart.axis.SegmentedTimeline.newFifteenMinuteTimeline();
    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline4 = new org.jfree.chart.axis.SegmentedTimeline((long)0, (int)(byte)-1, 3);
    java.util.Date date6 = segmentedTimeline4.getDate((long)'a');
    org.jfree.chart.axis.SegmentedTimeline.Segment segment7 = segmentedTimeline0.getSegment(date6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(segmentedTimeline0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(segment7);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test159"); }

    org.jfree.ui.HorizontalAlignment horizontalAlignment0 = null;
    org.jfree.ui.VerticalAlignment verticalAlignment1 = null;
    org.jfree.chart.block.ColumnArrangement columnArrangement4 = new org.jfree.chart.block.ColumnArrangement(horizontalAlignment0, verticalAlignment1, (double)100L, (double)11);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test160"); }

    org.jfree.data.xml.RootHandler rootHandler0 = new org.jfree.data.xml.RootHandler();
    rootHandler0.endElement("E", "E", "jfreechart-");
    rootHandler0.skippedEntity("ZOOM_RESET_DOMAIN");
    rootHandler0.notationDecl("", "", "jfreechart-");
    rootHandler0.unparsedEntityDecl("LengthConstraintType.NONE", "RangeType.FULL", "(0.0, 0.0)", "RangeType.FULL");

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test161"); }

    org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions2 = categoryAxis1.getCategoryLabelPositions();
    org.jfree.chart.event.AxisChangeListener axisChangeListener3 = null;
    categoryAxis1.removeChangeListener(axisChangeListener3);
    org.jfree.data.xy.YIntervalDataItem yIntervalDataItem9 = new org.jfree.data.xy.YIntervalDataItem((double)9, (double)(byte)1, (double)4, (double)(byte)0);
    java.awt.Font font10 = categoryAxis1.getTickLabelFont((java.lang.Comparable)yIntervalDataItem9);
    java.awt.Paint paint11 = categoryAxis1.getTickMarkPaint();
    float f12 = categoryAxis1.getMaximumCategoryLabelWidthRatio();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelPositions2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f12 == 0.0f);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test162"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge11 = null;
    double d12 = categoryAxis6.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle10, rectangleEdge11);
    org.jfree.chart.plot.JThermometer jThermometer17 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event18 = null;
    boolean b20 = jThermometer17.keyDown(event18, 100);
    jThermometer17.setSize((int)(short)100, 8);
    java.awt.Dimension dimension24 = jThermometer17.minimumSize();
    java.awt.Dimension dimension25 = jThermometer17.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
    jThermometer17.removeHierarchyBoundsListener(hierarchyBoundsListener26);
    org.jfree.chart.plot.JThermometer jThermometer28 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle29 = jThermometer28.getVisibleRect();
    java.awt.Rectangle rectangle30 = jThermometer17.getBounds(rectangle29);
    java.awt.Color color31 = java.awt.Color.black;
    float[] f_array37 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array38 = color31.getRGBComponents(f_array37);
    org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle30, (java.awt.Paint)color31);
    org.jfree.chart.axis.CategoryAxis categoryAxis41 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer44 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle45 = jThermometer44.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge46 = null;
    double d47 = categoryAxis41.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle45, rectangleEdge46);
    categoryAxis41.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis41.setTickMarkStroke(stroke50);
    org.jfree.chart.JFreeChart jFreeChart52 = null;
    org.jfree.chart.ChartPanel chartPanel66 = new org.jfree.chart.ChartPanel(jFreeChart52, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel66.setReshowDelay((int)(short)1);
    java.awt.Color color69 = java.awt.Color.WHITE;
    chartPanel66.setZoomOutlinePaint((java.awt.Paint)color69);
    org.jfree.chart.LegendItem legendItem71 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle10, (java.awt.Paint)color31, stroke50, (java.awt.Paint)color69);
    xYShapeRenderer0.setShape((java.awt.Shape)rectangle10);
    xYShapeRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    org.jfree.chart.plot.XYPlot xYPlot77 = xYShapeRenderer0.getPlot();
    int i78 = xYShapeRenderer0.getPassCount();
    java.awt.Stroke stroke79 = xYShapeRenderer0.getBaseStroke();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xYPlot77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke79);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test163"); }

    org.jfree.data.statistics.HistogramType histogramType0 = org.jfree.data.statistics.HistogramType.FREQUENCY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(histogramType0);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test164"); }

    org.jfree.chart.axis.SubCategoryAxis subCategoryAxis1 = new org.jfree.chart.axis.SubCategoryAxis("Time");
    org.jfree.chart.plot.JThermometer jThermometer2 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle3 = jThermometer2.getVisibleRect();
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle5 = jThermometer4.getVisibleRect();
    int i6 = jThermometer4.getShowAxisLocation();
    int i7 = jThermometer4.getWidth();
    java.awt.Component component8 = jThermometer2.add((java.awt.Component)jThermometer4);
    jThermometer2.addNotify();
    java.awt.event.ContainerListener containerListener10 = null;
    jThermometer2.addContainerListener(containerListener10);
    java.awt.Font font12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
    jThermometer2.setValueFont(font12);
    subCategoryAxis1.setSubLabelFont(font12);
    double[][] d_array_array15 = new double[][] {  };
    double[][] d_array_array16 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset17 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array15, d_array_array16);
    org.jfree.data.general.SeriesDataset[] seriesDataset_array18 = new org.jfree.data.general.SeriesDataset[] { defaultIntervalCategoryDataset17 };
    org.jfree.data.general.CombinedDataset combinedDataset19 = new org.jfree.data.general.CombinedDataset(seriesDataset_array18);
    org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset)combinedDataset19);
    combinedDataset19.validateObject();
    boolean b22 = subCategoryAxis1.hasListener((java.util.EventListener)combinedDataset19);
    subCategoryAxis1.setLabel("index.html");
    float f25 = subCategoryAxis1.getMinorTickMarkInsideLength();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(seriesDataset_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(range20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f25 == 0.0f);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test165"); }

    org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)100.0f);
    org.jfree.chart.plot.JThermometer jThermometer2 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event3 = null;
    org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b6 = jThermometer2.gotFocus(event3, (java.lang.Object)timeSeries5);
    java.lang.Class class7 = timeSeries5.getTimePeriodClass();
    java.util.List list8 = timeSeries5.getItems();
    org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
    org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries9.addOrUpdate(regularTimePeriod10, 10.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeSeries9);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test166"); }

    org.jfree.chart.plot.RainbowPalette rainbowPalette0 = new org.jfree.chart.plot.RainbowPalette();
    rainbowPalette0.setLogscale(false);
    java.awt.Color color4 = rainbowPalette0.getColor((int)'#');
    org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("ZOOM_IN_BOTH");
    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer7 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis13 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge18 = null;
    double d19 = categoryAxis13.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle17, rectangleEdge18);
    org.jfree.chart.plot.JThermometer jThermometer24 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event25 = null;
    boolean b27 = jThermometer24.keyDown(event25, 100);
    jThermometer24.setSize((int)(short)100, 8);
    java.awt.Dimension dimension31 = jThermometer24.minimumSize();
    java.awt.Dimension dimension32 = jThermometer24.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener33 = null;
    jThermometer24.removeHierarchyBoundsListener(hierarchyBoundsListener33);
    org.jfree.chart.plot.JThermometer jThermometer35 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle36 = jThermometer35.getVisibleRect();
    java.awt.Rectangle rectangle37 = jThermometer24.getBounds(rectangle36);
    java.awt.Color color38 = java.awt.Color.black;
    float[] f_array44 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array45 = color38.getRGBComponents(f_array44);
    org.jfree.chart.LegendItem legendItem46 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle37, (java.awt.Paint)color38);
    org.jfree.chart.axis.CategoryAxis categoryAxis48 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer51 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle52 = jThermometer51.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge53 = null;
    double d54 = categoryAxis48.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle52, rectangleEdge53);
    categoryAxis48.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke57 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis48.setTickMarkStroke(stroke57);
    org.jfree.chart.JFreeChart jFreeChart59 = null;
    org.jfree.chart.ChartPanel chartPanel73 = new org.jfree.chart.ChartPanel(jFreeChart59, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel73.setReshowDelay((int)(short)1);
    java.awt.Color color76 = java.awt.Color.WHITE;
    chartPanel73.setZoomOutlinePaint((java.awt.Paint)color76);
    org.jfree.chart.LegendItem legendItem78 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle17, (java.awt.Paint)color38, stroke57, (java.awt.Paint)color76);
    xYShapeRenderer7.setShape((java.awt.Shape)rectangle17);
    xYShapeRenderer7.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    org.jfree.chart.labels.ItemLabelPosition itemLabelPosition84 = xYShapeRenderer7.getBasePositiveItemLabelPosition();
    org.jfree.chart.plot.XYPlot xYPlot85 = null;
    xYShapeRenderer7.setPlot(xYPlot85);
    xYShapeRenderer7.clearSeriesPaints(true);
    java.awt.Color color91 = java.awt.Color.BLACK;
    java.awt.Stroke stroke92 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    org.jfree.chart.plot.CategoryMarker categoryMarker93 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)9, (java.awt.Paint)color91, stroke92);
    xYShapeRenderer7.setSeriesStroke(768, stroke92);
    legendItem6.setOutlineStroke(stroke92);
    boolean b96 = rainbowPalette0.equals((java.lang.Object)legendItem6);
    java.lang.String str97 = legendItem6.getURLText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d54 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelPosition84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str97);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test167"); }

    org.jfree.chart.block.GridArrangement gridArrangement2 = new org.jfree.chart.block.GridArrangement(0, 3);
    org.jfree.chart.block.Block block3 = null;
    gridArrangement2.add(block3, (java.lang.Object)2.0f);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test168"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    jThermometer0.requestFocus();
    javax.swing.JPopupMenu jPopupMenu3 = jThermometer0.getComponentPopupMenu();
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    boolean b5 = jThermometer0.isAncestorOf((java.awt.Component)jThermometer4);
    jThermometer0.setSubrangeInfo((int)'4', (double)(byte)1, (double)(byte)1, (double)'4', (double)(short)1);
    jThermometer0.setSubrangeInfo((int)(byte)0, (double)1.0f, (double)'#');
    int i16 = jThermometer0.getShowAxisLocation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jPopupMenu3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 2);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test169"); }

    org.jfree.chart.JFreeChart jFreeChart1 = null;
    org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("series", jFreeChart1);
    chartFrame2.setResizable(false);
    chartFrame2.setBounds((int)'#', (int)' ', 9, 0);
    javax.swing.JMenuBar jMenuBar10 = null;
    chartFrame2.setJMenuBar(jMenuBar10);
    chartFrame2.dispose();
    java.awt.im.InputContext inputContext13 = chartFrame2.getInputContext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputContext13);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test170"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b4 = jThermometer0.gotFocus(event1, (java.lang.Object)timeSeries3);
    org.jfree.chart.plot.JThermometer jThermometer5 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event6 = null;
    org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b9 = jThermometer5.gotFocus(event6, (java.lang.Object)timeSeries8);
    boolean b10 = timeSeries8.getNotify();
    org.jfree.data.time.TimeSeries timeSeries11 = timeSeries3.addAndOrUpdate(timeSeries8);
    org.jfree.data.time.TimeSeriesTableModel timeSeriesTableModel12 = new org.jfree.data.time.TimeSeriesTableModel(timeSeries11);
    org.jfree.data.general.SeriesChangeEvent seriesChangeEvent13 = null;
    timeSeriesTableModel12.seriesChanged(seriesChangeEvent13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeSeries11);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test171"); }

    org.jfree.chart.axis.MonthDateFormat monthDateFormat0 = new org.jfree.chart.axis.MonthDateFormat();
    java.lang.Object obj1 = monthDateFormat0.clone();
    org.jfree.chart.urls.TimeSeriesURLGenerator timeSeriesURLGenerator5 = new org.jfree.chart.urls.TimeSeriesURLGenerator((java.text.DateFormat)monthDateFormat0, "LengthConstraintType.NONE", "ZOOM_RESET_DOMAIN", "E");
    java.lang.String str6 = timeSeriesURLGenerator5.getSeriesParameterName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ZOOM_RESET_DOMAIN"+ "'", str6.equals("ZOOM_RESET_DOMAIN"));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test172"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge11 = null;
    double d12 = categoryAxis6.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle10, rectangleEdge11);
    org.jfree.chart.plot.JThermometer jThermometer17 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event18 = null;
    boolean b20 = jThermometer17.keyDown(event18, 100);
    jThermometer17.setSize((int)(short)100, 8);
    java.awt.Dimension dimension24 = jThermometer17.minimumSize();
    java.awt.Dimension dimension25 = jThermometer17.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
    jThermometer17.removeHierarchyBoundsListener(hierarchyBoundsListener26);
    org.jfree.chart.plot.JThermometer jThermometer28 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle29 = jThermometer28.getVisibleRect();
    java.awt.Rectangle rectangle30 = jThermometer17.getBounds(rectangle29);
    java.awt.Color color31 = java.awt.Color.black;
    float[] f_array37 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array38 = color31.getRGBComponents(f_array37);
    org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle30, (java.awt.Paint)color31);
    org.jfree.chart.axis.CategoryAxis categoryAxis41 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer44 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle45 = jThermometer44.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge46 = null;
    double d47 = categoryAxis41.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle45, rectangleEdge46);
    categoryAxis41.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis41.setTickMarkStroke(stroke50);
    org.jfree.chart.JFreeChart jFreeChart52 = null;
    org.jfree.chart.ChartPanel chartPanel66 = new org.jfree.chart.ChartPanel(jFreeChart52, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel66.setReshowDelay((int)(short)1);
    java.awt.Color color69 = java.awt.Color.WHITE;
    chartPanel66.setZoomOutlinePaint((java.awt.Paint)color69);
    org.jfree.chart.LegendItem legendItem71 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle10, (java.awt.Paint)color31, stroke50, (java.awt.Paint)color69);
    xYShapeRenderer0.setShape((java.awt.Shape)rectangle10);
    xYShapeRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    java.awt.Font font77 = xYShapeRenderer0.getBaseItemLabelFont();
    java.awt.Stroke stroke79 = xYShapeRenderer0.getSeriesOutlineStroke(13);
    org.jfree.chart.labels.XYToolTipGenerator xYToolTipGenerator81 = xYShapeRenderer0.getSeriesToolTipGenerator((int)' ');
    java.awt.Font font83 = xYShapeRenderer0.getSeriesItemLabelFont((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(stroke79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xYToolTipGenerator81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(font83);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test173"); }

    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline0 = org.jfree.chart.axis.SegmentedTimeline.newFifteenMinuteTimeline();
    org.jfree.chart.axis.SegmentedTimeline.Segment segment2 = segmentedTimeline0.getSegment((long)3);
    boolean b4 = segment2.contains((long)(-4));
    boolean b5 = segment2.inExceptionSegments();
    boolean b8 = segment2.contains((long)(byte)-1, (long)(byte)1);
    boolean b11 = segment2.contained((long)100, 3600000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(segmentedTimeline0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(segment2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test174"); }

    org.jfree.chart.needle.PinNeedle pinNeedle0 = new org.jfree.chart.needle.PinNeedle();
    org.jfree.chart.JFreeChart jFreeChart1 = null;
    org.jfree.chart.ChartPanel chartPanel15 = new org.jfree.chart.ChartPanel(jFreeChart1, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    boolean b16 = chartPanel15.isDomainZoomable();
    chartPanel15.setZoomOutFactor((double)768);
    chartPanel15.setVerticalAxisTrace(true);
    java.beans.PropertyChangeListener propertyChangeListener21 = null;
    chartPanel15.removePropertyChangeListener(propertyChangeListener21);
    boolean b23 = pinNeedle0.equals((java.lang.Object)propertyChangeListener21);
    java.awt.Paint paint24 = pinNeedle0.getHighlightPaint();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(paint24);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test175"); }

    org.jfree.chart.axis.QuarterDateFormat quarterDateFormat0 = new org.jfree.chart.axis.QuarterDateFormat();
    quarterDateFormat0.setLenient(true);
    java.text.ParsePosition parsePosition4 = null;
    java.util.Date date5 = quarterDateFormat0.parse("E", parsePosition4);
    java.text.ParsePosition parsePosition7 = null;
    java.util.Date date8 = quarterDateFormat0.parse("Rainbow", parsePosition7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(date5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(date8);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test176"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    jThermometer16.requestFocus();
    org.jfree.data.time.DateRange dateRange20 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range23 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange20, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType24 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange26 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange27 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange26, (org.jfree.data.Range)dateRange27);
    org.jfree.chart.axis.CompassFormat compassFormat29 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType30 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b31 = compassFormat29.equals((java.lang.Object)lengthConstraintType30);
    org.jfree.chart.axis.CompassFormat compassFormat32 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType33 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b34 = compassFormat32.equals((java.lang.Object)lengthConstraintType33);
    boolean b35 = lengthConstraintType30.equals((java.lang.Object)b34);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint36 = new org.jfree.chart.block.RectangleConstraint(0.0d, range23, lengthConstraintType24, (double)1L, (org.jfree.data.Range)dateRange26, lengthConstraintType30);
    chartPanel14.add((java.awt.Component)jThermometer16, (java.lang.Object)lengthConstraintType24);
    javax.swing.InputVerifier inputVerifier38 = chartPanel14.getInputVerifier();
    boolean b39 = chartPanel14.getRefreshBuffer();
    chartPanel14.firePropertyChange("hi!", (byte)0, (byte)0);
    java.awt.event.MouseEvent mouseEvent44 = null;
    // The following exception was thrown during execution in test generation
    try {
    chartPanel14.mouseReleased(mouseEvent44);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test177"); }

    org.jfree.chart.axis.StandardTickUnitSource standardTickUnitSource0 = new org.jfree.chart.axis.StandardTickUnitSource();
    org.jfree.chart.axis.NumberTickUnit numberTickUnit2 = new org.jfree.chart.axis.NumberTickUnit((double)10.0f);
    org.jfree.chart.axis.CategoryLabelWidthType categoryLabelWidthType3 = org.jfree.chart.axis.CategoryLabelWidthType.RANGE;
    int i4 = numberTickUnit2.compareTo((java.lang.Object)categoryLabelWidthType3);
    org.jfree.chart.axis.TickUnit tickUnit5 = standardTickUnitSource0.getLargerTickUnit((org.jfree.chart.axis.TickUnit)numberTickUnit2);
    org.jfree.chart.axis.QuarterDateFormat quarterDateFormat6 = new org.jfree.chart.axis.QuarterDateFormat();
    boolean b7 = standardTickUnitSource0.equals((java.lang.Object)quarterDateFormat6);
    java.lang.Object obj8 = quarterDateFormat6.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelWidthType3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tickUnit5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test178"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge11 = null;
    double d12 = categoryAxis6.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle10, rectangleEdge11);
    org.jfree.chart.plot.JThermometer jThermometer17 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event18 = null;
    boolean b20 = jThermometer17.keyDown(event18, 100);
    jThermometer17.setSize((int)(short)100, 8);
    java.awt.Dimension dimension24 = jThermometer17.minimumSize();
    java.awt.Dimension dimension25 = jThermometer17.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
    jThermometer17.removeHierarchyBoundsListener(hierarchyBoundsListener26);
    org.jfree.chart.plot.JThermometer jThermometer28 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle29 = jThermometer28.getVisibleRect();
    java.awt.Rectangle rectangle30 = jThermometer17.getBounds(rectangle29);
    java.awt.Color color31 = java.awt.Color.black;
    float[] f_array37 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array38 = color31.getRGBComponents(f_array37);
    org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle30, (java.awt.Paint)color31);
    org.jfree.chart.axis.CategoryAxis categoryAxis41 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer44 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle45 = jThermometer44.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge46 = null;
    double d47 = categoryAxis41.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle45, rectangleEdge46);
    categoryAxis41.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis41.setTickMarkStroke(stroke50);
    org.jfree.chart.JFreeChart jFreeChart52 = null;
    org.jfree.chart.ChartPanel chartPanel66 = new org.jfree.chart.ChartPanel(jFreeChart52, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel66.setReshowDelay((int)(short)1);
    java.awt.Color color69 = java.awt.Color.WHITE;
    chartPanel66.setZoomOutlinePaint((java.awt.Paint)color69);
    org.jfree.chart.LegendItem legendItem71 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle10, (java.awt.Paint)color31, stroke50, (java.awt.Paint)color69);
    xYShapeRenderer0.setShape((java.awt.Shape)rectangle10);
    xYShapeRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    org.jfree.chart.plot.XYPlot xYPlot77 = xYShapeRenderer0.getPlot();
    int i78 = xYShapeRenderer0.getPassCount();
    java.awt.Color color80 = java.awt.Color.orange;
    int i81 = color80.getAlpha();
    xYShapeRenderer0.setSeriesFillPaint(10, (java.awt.Paint)color80, false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xYPlot77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 255);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test179"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    boolean b3 = jThermometer0.keyDown(event1, 100);
    jThermometer0.setSize((int)(short)100, 8);
    org.jfree.chart.plot.JThermometer jThermometer7 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event8 = null;
    boolean b10 = jThermometer7.keyDown(event8, 100);
    jThermometer7.setSize((int)(short)100, 8);
    java.awt.Dimension dimension14 = jThermometer7.minimumSize();
    java.awt.Dimension dimension15 = jThermometer7.preferredSize();
    java.awt.Dimension dimension16 = jThermometer0.getSize(dimension15);
    javax.swing.border.Border border17 = jThermometer0.getBorder();
    java.awt.Color color18 = jThermometer0.getForeground();
    boolean b19 = jThermometer0.isDoubleBuffered();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(border17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test180"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    boolean b3 = jThermometer0.keyDown(event1, 100);
    jThermometer0.setSize((int)(short)100, 8);
    java.awt.Dimension dimension7 = jThermometer0.minimumSize();
    java.awt.event.InputMethodListener[] inputMethodListener_array8 = jThermometer0.getInputMethodListeners();
    org.jfree.chart.JFreeChart jFreeChart9 = null;
    org.jfree.chart.ChartPanel chartPanel23 = new org.jfree.chart.ChartPanel(jFreeChart9, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel23.setReshowDelay((int)(short)1);
    java.awt.Color color26 = java.awt.Color.WHITE;
    chartPanel23.setZoomOutlinePaint((java.awt.Paint)color26);
    jThermometer0.setBackground(color26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMethodListener_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color26);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test181"); }

    org.jfree.data.xy.YIntervalDataItem yIntervalDataItem4 = new org.jfree.data.xy.YIntervalDataItem((double)100, (double)100, (double)13, (double)' ');
    org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)100);
    int i6 = xYSeries5.getItemCount();
    double d7 = xYSeries5.getMinY();
    boolean b8 = xYSeries5.getAutoSort();
    org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries5.addOrUpdate((double)3600000L, (double)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertEquals((double)d7, Double.NaN, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xYDataItem11);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test182"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    org.jfree.chart.plot.JThermometer jThermometer2 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle3 = jThermometer2.getVisibleRect();
    int i4 = jThermometer2.getShowAxisLocation();
    int i5 = jThermometer2.getWidth();
    java.awt.Component component6 = jThermometer0.add((java.awt.Component)jThermometer2);
    // The following exception was thrown during execution in test generation
    try {
    jThermometer2.setRange(52.0d, 0.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component6);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test183"); }

    org.jfree.data.time.TimeSeriesCollection timeSeriesCollection0 = new org.jfree.data.time.TimeSeriesCollection();
    timeSeriesCollection0.setDomainIsPointsInTime(true);
    // The following exception was thrown during execution in test generation
    try {
    int i4 = timeSeriesCollection0.getItemCount(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test184"); }

    org.jfree.chart.plot.CategoryCrosshairState categoryCrosshairState0 = new org.jfree.chart.plot.CategoryCrosshairState();
    org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions3 = categoryAxis2.getCategoryLabelPositions();
    org.jfree.chart.event.AxisChangeListener axisChangeListener4 = null;
    categoryAxis2.removeChangeListener(axisChangeListener4);
    org.jfree.data.xy.YIntervalDataItem yIntervalDataItem10 = new org.jfree.data.xy.YIntervalDataItem((double)9, (double)(byte)1, (double)4, (double)(byte)0);
    java.awt.Font font11 = categoryAxis2.getTickLabelFont((java.lang.Comparable)yIntervalDataItem10);
    org.jfree.chart.plot.PlotOrientation plotOrientation17 = org.jfree.chart.plot.PlotOrientation.VERTICAL;
    categoryCrosshairState0.updateCrosshairPoint((java.lang.Comparable)yIntervalDataItem10, (java.lang.Comparable)52, (double)10.0f, (int)'4', (double)7, 0.0d, plotOrientation17);
    org.jfree.chart.axis.CategoryAxis categoryAxis21 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions22 = categoryAxis21.getCategoryLabelPositions();
    org.jfree.chart.event.AxisChangeListener axisChangeListener23 = null;
    categoryAxis21.removeChangeListener(axisChangeListener23);
    org.jfree.data.xy.YIntervalDataItem yIntervalDataItem29 = new org.jfree.data.xy.YIntervalDataItem((double)9, (double)(byte)1, (double)4, (double)(byte)0);
    java.awt.Font font30 = categoryAxis21.getTickLabelFont((java.lang.Comparable)yIntervalDataItem29);
    org.jfree.chart.plot.PlotOrientation plotOrientation35 = org.jfree.chart.plot.PlotOrientation.VERTICAL;
    categoryCrosshairState0.updateCrosshairPoint((java.lang.Comparable)"E", (java.lang.Comparable)yIntervalDataItem29, (double)5, 100, (double)0, 52.0d, plotOrientation35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelPositions3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(plotOrientation17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelPositions22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(plotOrientation35);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test185"); }

    org.jfree.chart.JFreeChart jFreeChart1 = null;
    org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("series", jFreeChart1);
    boolean b3 = chartFrame2.isAlwaysOnTop();
    // The following exception was thrown during execution in test generation
    try {
    chartFrame2.remove(7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test186"); }

    org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle5 = jThermometer4.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge6 = null;
    double d7 = categoryAxis1.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle5, rectangleEdge6);
    categoryAxis1.setMinorTickMarkOutsideLength((float)(-4));
    categoryAxis1.setLabel("index.html");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test187"); }

    org.jfree.chart.axis.CategoryLabelWidthType categoryLabelWidthType0 = org.jfree.chart.axis.CategoryLabelWidthType.CATEGORY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelWidthType0);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test188"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b4 = jThermometer0.gotFocus(event1, (java.lang.Object)timeSeries3);
    java.lang.Class class5 = timeSeries3.getTimePeriodClass();
    java.util.List list6 = timeSeries3.getItems();
    java.util.TimeZone timeZone7 = org.jfree.chart.axis.SegmentedTimeline.NO_DST_TIME_ZONE;
    org.jfree.data.time.TimeSeriesCollection timeSeriesCollection8 = new org.jfree.data.time.TimeSeriesCollection(timeSeries3, timeZone7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeZone7);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test189"); }

    org.jfree.data.general.SeriesException seriesException1 = new org.jfree.data.general.SeriesException("item");

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test190"); }

    org.jfree.data.xy.YIntervalDataItem yIntervalDataItem4 = new org.jfree.data.xy.YIntervalDataItem((double)100, (double)100, (double)13, (double)' ');
    org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)100);
    int i6 = xYSeries5.getItemCount();
    xYSeries5.add((double)2.0f, (java.lang.Number)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test191"); }

    org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number)2454364L, (java.lang.Number)(byte)100);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test192"); }

    org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle5 = jThermometer4.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge6 = null;
    double d7 = categoryAxis1.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle5, rectangleEdge6);
    categoryAxis1.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis1.setTickMarkStroke(stroke10);
    double d12 = categoryAxis1.getLowerMargin();
    org.jfree.chart.event.OverlayChangeEvent overlayChangeEvent13 = new org.jfree.chart.event.OverlayChangeEvent((java.lang.Object)d12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.05d);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test193"); }

    org.jfree.data.time.ohlc.OHLCSeriesCollection oHLCSeriesCollection0 = new org.jfree.data.time.ohlc.OHLCSeriesCollection();
    // The following exception was thrown during execution in test generation
    try {
    double d3 = oHLCSeriesCollection0.getOpenValue((int)'a', 10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test194"); }

    org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues("ZOOM_RESET_RANGE", "ZOOM_RESET_DOMAIN", "");
    org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy(100, 100);
    double[][] d_array_array7 = new double[][] {  };
    double[][] d_array_array8 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset9 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array7, d_array_array8);
    org.jfree.data.general.SeriesDataset[] seriesDataset_array10 = new org.jfree.data.general.SeriesDataset[] { defaultIntervalCategoryDataset9 };
    org.jfree.data.general.CombinedDataset combinedDataset11 = new org.jfree.data.general.CombinedDataset(seriesDataset_array10);
    timePeriodValues3.addChangeListener((org.jfree.data.general.SeriesChangeListener)combinedDataset11);
    int i13 = timePeriodValues3.getMaxMiddleIndex();
    org.jfree.data.time.TimePeriodValuesCollection timePeriodValuesCollection14 = new org.jfree.data.time.TimePeriodValuesCollection(timePeriodValues3);
    org.jfree.data.time.TimePeriodValues timePeriodValues18 = new org.jfree.data.time.TimePeriodValues("hi!", "hi!", "");
    int i19 = timePeriodValues18.getMinEndIndex();
    org.jfree.chart.plot.JThermometer jThermometer20 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle21 = jThermometer20.getVisibleRect();
    jThermometer20.requestFocus();
    boolean b23 = timePeriodValues18.equals((java.lang.Object)jThermometer20);
    java.lang.String str24 = timePeriodValues18.getRangeDescription();
    timePeriodValuesCollection14.addSeries(timePeriodValues18);
    double d27 = timePeriodValuesCollection14.getDomainLowerBound(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timePeriodValues6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(seriesDataset_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertEquals((double)d27, Double.NaN, 0);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test195"); }

    org.jfree.data.gantt.GanttCategoryDataset ganttCategoryDataset0 = null;
    org.jfree.data.gantt.SlidingGanttCategoryDataset slidingGanttCategoryDataset3 = new org.jfree.data.gantt.SlidingGanttCategoryDataset(ganttCategoryDataset0, 0, 64);
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)slidingGanttCategoryDataset3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test196"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    int i2 = jThermometer0.getShowAxisLocation();
    java.awt.Event event3 = null;
    boolean b6 = jThermometer0.mouseMove(event3, 1, (int)' ');
    java.awt.image.ImageProducer imageProducer7 = null;
    java.awt.Image image8 = jThermometer0.createImage(imageProducer7);
    java.awt.Graphics graphics9 = null;
    jThermometer0.paintAll(graphics9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image8);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test197"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge11 = null;
    double d12 = categoryAxis6.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle10, rectangleEdge11);
    org.jfree.chart.plot.JThermometer jThermometer17 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event18 = null;
    boolean b20 = jThermometer17.keyDown(event18, 100);
    jThermometer17.setSize((int)(short)100, 8);
    java.awt.Dimension dimension24 = jThermometer17.minimumSize();
    java.awt.Dimension dimension25 = jThermometer17.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
    jThermometer17.removeHierarchyBoundsListener(hierarchyBoundsListener26);
    org.jfree.chart.plot.JThermometer jThermometer28 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle29 = jThermometer28.getVisibleRect();
    java.awt.Rectangle rectangle30 = jThermometer17.getBounds(rectangle29);
    java.awt.Color color31 = java.awt.Color.black;
    float[] f_array37 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array38 = color31.getRGBComponents(f_array37);
    org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle30, (java.awt.Paint)color31);
    org.jfree.chart.axis.CategoryAxis categoryAxis41 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer44 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle45 = jThermometer44.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge46 = null;
    double d47 = categoryAxis41.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle45, rectangleEdge46);
    categoryAxis41.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis41.setTickMarkStroke(stroke50);
    org.jfree.chart.JFreeChart jFreeChart52 = null;
    org.jfree.chart.ChartPanel chartPanel66 = new org.jfree.chart.ChartPanel(jFreeChart52, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel66.setReshowDelay((int)(short)1);
    java.awt.Color color69 = java.awt.Color.WHITE;
    chartPanel66.setZoomOutlinePaint((java.awt.Paint)color69);
    org.jfree.chart.LegendItem legendItem71 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle10, (java.awt.Paint)color31, stroke50, (java.awt.Paint)color69);
    xYShapeRenderer0.setShape((java.awt.Shape)rectangle10);
    xYShapeRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    org.jfree.chart.labels.ItemLabelPosition itemLabelPosition77 = xYShapeRenderer0.getBasePositiveItemLabelPosition();
    org.jfree.chart.plot.XYPlot xYPlot78 = null;
    xYShapeRenderer0.setPlot(xYPlot78);
    xYShapeRenderer0.clearSeriesPaints(true);
    java.awt.Color color84 = java.awt.Color.BLACK;
    java.awt.Stroke stroke85 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    org.jfree.chart.plot.CategoryMarker categoryMarker86 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)9, (java.awt.Paint)color84, stroke85);
    xYShapeRenderer0.setSeriesStroke(768, stroke85);
    org.jfree.chart.labels.XYItemLabelGenerator xYItemLabelGenerator88 = null;
    xYShapeRenderer0.setBaseItemLabelGenerator(xYItemLabelGenerator88);
    xYShapeRenderer0.setCreateEntities((java.lang.Boolean)true);
    xYShapeRenderer0.setSeriesVisibleInLegend((int)(byte)0, (java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelPosition77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke85);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test198"); }

    org.jfree.data.time.TimeSeriesCollection timeSeriesCollection0 = new org.jfree.data.time.TimeSeriesCollection();
    org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    java.beans.VetoableChangeListener vetoableChangeListener3 = null;
    timeSeries2.addVetoableChangeListener(vetoableChangeListener3);
    timeSeriesCollection0.removeSeries(timeSeries2);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.time.TimeSeries timeSeries8 = timeSeries2.createCopy(680, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test199"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    boolean b3 = jThermometer0.keyDown(event1, 100);
    jThermometer0.setSize((int)(short)100, 8);
    org.jfree.chart.plot.JThermometer jThermometer7 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event8 = null;
    boolean b10 = jThermometer7.keyDown(event8, 100);
    jThermometer7.setSize((int)(short)100, 8);
    java.awt.Dimension dimension14 = jThermometer7.minimumSize();
    java.awt.Dimension dimension15 = jThermometer7.preferredSize();
    java.awt.Dimension dimension16 = jThermometer0.getSize(dimension15);
    javax.swing.border.Border border17 = jThermometer0.getBorder();
    java.awt.Color color18 = jThermometer0.getForeground();
    java.awt.image.VolatileImage volatileImage21 = jThermometer0.createVolatileImage(100, 5);
    jThermometer0.setName("Time");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(border17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(volatileImage21);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test200"); }

    org.jfree.chart.plot.PieLabelDistributor pieLabelDistributor1 = new org.jfree.chart.plot.PieLabelDistributor(11);
    pieLabelDistributor1.clear();

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test201"); }

    org.jfree.data.time.DateRange dateRange1 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range4 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange1, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType5 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange7 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange8 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint9 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange7, (org.jfree.data.Range)dateRange8);
    org.jfree.chart.axis.CompassFormat compassFormat10 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType11 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b12 = compassFormat10.equals((java.lang.Object)lengthConstraintType11);
    org.jfree.chart.axis.CompassFormat compassFormat13 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType14 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b15 = compassFormat13.equals((java.lang.Object)lengthConstraintType14);
    boolean b16 = lengthConstraintType11.equals((java.lang.Object)b15);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = new org.jfree.chart.block.RectangleConstraint(0.0d, range4, lengthConstraintType5, (double)1L, (org.jfree.data.Range)dateRange7, lengthConstraintType11);
    double d18 = rectangleConstraint17.getWidth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test202"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    boolean b15 = chartPanel14.isDomainZoomable();
    chartPanel14.setAutoscrolls(true);
    boolean b18 = chartPanel14.isFocusCycleRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test203"); }

    org.jfree.data.time.DateRange dateRange1 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range4 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange1, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType5 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange7 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange8 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint9 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange7, (org.jfree.data.Range)dateRange8);
    org.jfree.chart.axis.CompassFormat compassFormat10 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType11 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b12 = compassFormat10.equals((java.lang.Object)lengthConstraintType11);
    org.jfree.chart.axis.CompassFormat compassFormat13 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType14 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b15 = compassFormat13.equals((java.lang.Object)lengthConstraintType14);
    boolean b16 = lengthConstraintType11.equals((java.lang.Object)b15);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = new org.jfree.chart.block.RectangleConstraint(0.0d, range4, lengthConstraintType5, (double)1L, (org.jfree.data.Range)dateRange7, lengthConstraintType11);
    double d19 = dateRange7.constrain((double)10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 1.0d);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test204"); }

    org.jfree.chart.urls.StandardCategoryURLGenerator standardCategoryURLGenerator1 = new org.jfree.chart.urls.StandardCategoryURLGenerator("CategoryDataset");

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test205"); }

    org.jfree.chart.axis.NumberTickUnit numberTickUnit1 = new org.jfree.chart.axis.NumberTickUnit((double)10.0f);
    org.jfree.chart.axis.CategoryLabelWidthType categoryLabelWidthType2 = org.jfree.chart.axis.CategoryLabelWidthType.RANGE;
    int i3 = numberTickUnit1.compareTo((java.lang.Object)categoryLabelWidthType2);
    org.jfree.data.time.ohlc.OHLCSeries oHLCSeries4 = new org.jfree.data.time.ohlc.OHLCSeries((java.lang.Comparable)i3);
    org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
    // The following exception was thrown during execution in test generation
    try {
    oHLCSeries4.add(regularTimePeriod5, (double)(byte)10, 32.0d, 1.0d, 4.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelWidthType2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test206"); }

    org.jfree.chart.axis.SubCategoryAxis subCategoryAxis1 = new org.jfree.chart.axis.SubCategoryAxis("Time");
    org.jfree.chart.plot.JThermometer jThermometer2 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle3 = jThermometer2.getVisibleRect();
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle5 = jThermometer4.getVisibleRect();
    int i6 = jThermometer4.getShowAxisLocation();
    int i7 = jThermometer4.getWidth();
    java.awt.Component component8 = jThermometer2.add((java.awt.Component)jThermometer4);
    jThermometer2.addNotify();
    java.awt.event.ContainerListener containerListener10 = null;
    jThermometer2.addContainerListener(containerListener10);
    java.awt.Font font12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
    jThermometer2.setValueFont(font12);
    subCategoryAxis1.setSubLabelFont(font12);
    double[][] d_array_array15 = new double[][] {  };
    double[][] d_array_array16 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset17 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array15, d_array_array16);
    org.jfree.data.general.SeriesDataset[] seriesDataset_array18 = new org.jfree.data.general.SeriesDataset[] { defaultIntervalCategoryDataset17 };
    org.jfree.data.general.CombinedDataset combinedDataset19 = new org.jfree.data.general.CombinedDataset(seriesDataset_array18);
    org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset)combinedDataset19);
    combinedDataset19.validateObject();
    boolean b22 = subCategoryAxis1.hasListener((java.util.EventListener)combinedDataset19);
    org.jfree.data.general.DatasetGroup datasetGroup23 = combinedDataset19.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(seriesDataset_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(range20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(datasetGroup23);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test207"); }

    org.jfree.data.xml.RootHandler rootHandler0 = new org.jfree.data.xml.RootHandler();
    rootHandler0.endElement("E", "E", "jfreechart-");
    rootHandler0.skippedEntity("ZOOM_RESET_DOMAIN");
    rootHandler0.endElement("E", "ZOOM_RESET_DOMAIN", "Time");

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test208"); }

    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event5 = null;
    boolean b7 = jThermometer4.keyDown(event5, 100);
    jThermometer4.setSize((int)(short)100, 8);
    java.awt.Dimension dimension11 = jThermometer4.minimumSize();
    java.awt.Dimension dimension12 = jThermometer4.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener13 = null;
    jThermometer4.removeHierarchyBoundsListener(hierarchyBoundsListener13);
    org.jfree.chart.plot.JThermometer jThermometer15 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle16 = jThermometer15.getVisibleRect();
    java.awt.Rectangle rectangle17 = jThermometer4.getBounds(rectangle16);
    java.awt.Color color18 = java.awt.Color.black;
    float[] f_array24 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array25 = color18.getRGBComponents(f_array24);
    org.jfree.chart.LegendItem legendItem26 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle17, (java.awt.Paint)color18);
    java.awt.Font font27 = legendItem26.getLabelFont();
    java.lang.String str28 = legendItem26.getLabel();
    java.lang.String str29 = legendItem26.getToolTipText();
    org.jfree.chart.plot.JThermometer jThermometer34 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event35 = null;
    boolean b37 = jThermometer34.keyDown(event35, 100);
    jThermometer34.setSize((int)(short)100, 8);
    java.awt.Dimension dimension41 = jThermometer34.minimumSize();
    java.awt.Dimension dimension42 = jThermometer34.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener43 = null;
    jThermometer34.removeHierarchyBoundsListener(hierarchyBoundsListener43);
    org.jfree.chart.plot.JThermometer jThermometer45 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle46 = jThermometer45.getVisibleRect();
    java.awt.Rectangle rectangle47 = jThermometer34.getBounds(rectangle46);
    java.awt.Color color48 = java.awt.Color.black;
    float[] f_array54 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array55 = color48.getRGBComponents(f_array54);
    org.jfree.chart.LegendItem legendItem56 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle47, (java.awt.Paint)color48);
    java.awt.Font font57 = legendItem56.getLabelFont();
    legendItem56.setDatasetIndex((int)(byte)10);
    java.awt.Paint paint60 = legendItem56.getOutlinePaint();
    legendItem56.setLineVisible(false);
    org.jfree.ui.GradientPaintTransformer gradientPaintTransformer63 = legendItem56.getFillPaintTransformer();
    legendItem26.setFillPaintTransformer(gradientPaintTransformer63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(font27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(font57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gradientPaintTransformer63);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test209"); }

    java.lang.Number number2 = null;
    double[][] d_array_array8 = new double[][] {  };
    double[][] d_array_array9 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset10 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array8, d_array_array9);
    org.jfree.data.general.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset10, (java.lang.Comparable)0.5d);
    org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
    defaultIntervalCategoryDataset10.removeChangeListener(datasetChangeListener13);
    java.util.List list15 = defaultIntervalCategoryDataset10.getCategories();
    org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem16 = new org.jfree.data.statistics.BoxAndWhiskerItem((java.lang.Number)6, (java.lang.Number)(-143), number2, (java.lang.Number)1.0f, (java.lang.Number)(byte)1, (java.lang.Number)(-1L), (java.lang.Number)7, (java.lang.Number)1.0d, list15);
    java.lang.Number number17 = boxAndWhiskerItem16.getMean();
    java.lang.Number number18 = boxAndWhiskerItem16.getMinRegularValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pieDataset12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + number17 + "' != '" + 6+ "'", number17.equals(6));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + number18 + "' != '" + (byte)1+ "'", number18.equals((byte)1));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test210"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    jThermometer16.requestFocus();
    org.jfree.data.time.DateRange dateRange20 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range23 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange20, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType24 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange26 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange27 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange26, (org.jfree.data.Range)dateRange27);
    org.jfree.chart.axis.CompassFormat compassFormat29 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType30 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b31 = compassFormat29.equals((java.lang.Object)lengthConstraintType30);
    org.jfree.chart.axis.CompassFormat compassFormat32 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType33 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b34 = compassFormat32.equals((java.lang.Object)lengthConstraintType33);
    boolean b35 = lengthConstraintType30.equals((java.lang.Object)b34);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint36 = new org.jfree.chart.block.RectangleConstraint(0.0d, range23, lengthConstraintType24, (double)1L, (org.jfree.data.Range)dateRange26, lengthConstraintType30);
    chartPanel14.add((java.awt.Component)jThermometer16, (java.lang.Object)lengthConstraintType24);
    javax.swing.InputVerifier inputVerifier38 = chartPanel14.getInputVerifier();
    java.awt.event.ComponentListener componentListener39 = null;
    chartPanel14.removeComponentListener(componentListener39);
    chartPanel14.move(5, 0);
    java.awt.Graphics graphics44 = null;
    chartPanel14.printComponents(graphics44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier38);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test211"); }

    org.jfree.chart.plot.CategoryCrosshairState categoryCrosshairState0 = new org.jfree.chart.plot.CategoryCrosshairState();
    org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions3 = categoryAxis2.getCategoryLabelPositions();
    org.jfree.chart.event.AxisChangeListener axisChangeListener4 = null;
    categoryAxis2.removeChangeListener(axisChangeListener4);
    org.jfree.data.xy.YIntervalDataItem yIntervalDataItem10 = new org.jfree.data.xy.YIntervalDataItem((double)9, (double)(byte)1, (double)4, (double)(byte)0);
    java.awt.Font font11 = categoryAxis2.getTickLabelFont((java.lang.Comparable)yIntervalDataItem10);
    org.jfree.chart.plot.PlotOrientation plotOrientation17 = org.jfree.chart.plot.PlotOrientation.VERTICAL;
    categoryCrosshairState0.updateCrosshairPoint((java.lang.Comparable)yIntervalDataItem10, (java.lang.Comparable)52, (double)10.0f, (int)'4', (double)7, 0.0d, plotOrientation17);
    categoryCrosshairState0.setDatasetIndex(768);
    categoryCrosshairState0.updateCrosshairY((double)768);
    categoryCrosshairState0.setAnchorY((double)(byte)100);
    double d25 = categoryCrosshairState0.getAnchorX();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelPositions3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(plotOrientation17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == 0.0d);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test212"); }

    java.awt.image.BufferedImage bufferedImage0 = null;
    java.io.OutputStream outputStream2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.encoders.EncoderUtil.writeBufferedImage(bufferedImage0, "SAVE", outputStream2, (float)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test213"); }

    org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues("ZOOM_RESET_RANGE", "ZOOM_RESET_DOMAIN", "");
    org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy(100, 100);
    double[][] d_array_array7 = new double[][] {  };
    double[][] d_array_array8 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset9 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array7, d_array_array8);
    org.jfree.data.general.SeriesDataset[] seriesDataset_array10 = new org.jfree.data.general.SeriesDataset[] { defaultIntervalCategoryDataset9 };
    org.jfree.data.general.CombinedDataset combinedDataset11 = new org.jfree.data.general.CombinedDataset(seriesDataset_array10);
    timePeriodValues3.addChangeListener((org.jfree.data.general.SeriesChangeListener)combinedDataset11);
    int i13 = timePeriodValues3.getMaxMiddleIndex();
    org.jfree.data.time.TimePeriodValuesCollection timePeriodValuesCollection14 = new org.jfree.data.time.TimePeriodValuesCollection(timePeriodValues3);
    org.jfree.data.time.TimePeriodAnchor timePeriodAnchor15 = timePeriodValuesCollection14.getXPosition();
    // The following exception was thrown during execution in test generation
    try {
    double d18 = timePeriodValuesCollection14.getEndXValue(0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timePeriodValues6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(seriesDataset_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timePeriodAnchor15);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test214"); }

    double[][] d_array_array0 = new double[][] {  };
    double[][] d_array_array1 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array0, d_array_array1);
    org.jfree.data.general.SeriesDataset[] seriesDataset_array3 = new org.jfree.data.general.SeriesDataset[] { defaultIntervalCategoryDataset2 };
    org.jfree.data.general.CombinedDataset combinedDataset4 = new org.jfree.data.general.CombinedDataset(seriesDataset_array3);
    org.jfree.data.Range range5 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset)combinedDataset4);
    org.jfree.data.Range range6 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset)combinedDataset4);
    int[] i_array7 = combinedDataset4.getMap();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(seriesDataset_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(range5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(range6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array7);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test215"); }

    org.jfree.data.xy.YIntervalSeries yIntervalSeries3 = new org.jfree.data.xy.YIntervalSeries((java.lang.Comparable)(byte)100, true, false);
    yIntervalSeries3.clear();
    java.beans.VetoableChangeListener vetoableChangeListener5 = null;
    yIntervalSeries3.removeVetoableChangeListener(vetoableChangeListener5);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.ComparableObjectItem comparableObjectItem8 = yIntervalSeries3.getDataItem(1024);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test216"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.JFreeChart jFreeChart3 = null;
    org.jfree.chart.ChartPanel chartPanel17 = new org.jfree.chart.ChartPanel(jFreeChart3, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo18 = chartPanel17.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer19 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle20 = jThermometer19.getVisibleRect();
    jThermometer19.requestFocus();
    org.jfree.data.time.DateRange dateRange23 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range26 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange23, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType27 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange29 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange30 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint31 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange29, (org.jfree.data.Range)dateRange30);
    org.jfree.chart.axis.CompassFormat compassFormat32 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType33 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b34 = compassFormat32.equals((java.lang.Object)lengthConstraintType33);
    org.jfree.chart.axis.CompassFormat compassFormat35 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType36 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b37 = compassFormat35.equals((java.lang.Object)lengthConstraintType36);
    boolean b38 = lengthConstraintType33.equals((java.lang.Object)b37);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint39 = new org.jfree.chart.block.RectangleConstraint(0.0d, range26, lengthConstraintType27, (double)1L, (org.jfree.data.Range)dateRange29, lengthConstraintType33);
    chartPanel17.add((java.awt.Component)jThermometer19, (java.lang.Object)lengthConstraintType27);
    int i41 = chartPanel17.getMinimumDrawWidth();
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo42 = chartPanel17.getChartRenderingInfo();
    javax.servlet.http.HttpSession httpSession43 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str44 = org.jfree.chart.servlet.ServletUtilities.saveChartAsPNG(jFreeChart0, 10, 12, chartRenderingInfo42, httpSession43);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo42);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test217"); }

    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline3 = new org.jfree.chart.axis.SegmentedTimeline((long)128, (-1), (int)(byte)1);
    long long4 = segmentedTimeline3.getSegmentsIncludedSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-128L));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test218"); }

    java.awt.Color color0 = org.jfree.chart.ChartColor.VERY_DARK_BLUE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color0);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test219"); }

    org.jfree.ui.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets0);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test220"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    boolean b15 = chartPanel14.isDomainZoomable();
    java.awt.geom.Point2D point2D16 = chartPanel14.getAnchor();
    chartPanel14.setDismissDelay(5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point2D16);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test221"); }

    org.jfree.chart.axis.SubCategoryAxis subCategoryAxis1 = new org.jfree.chart.axis.SubCategoryAxis("Time");
    org.jfree.chart.plot.JThermometer jThermometer2 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle3 = jThermometer2.getVisibleRect();
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle5 = jThermometer4.getVisibleRect();
    int i6 = jThermometer4.getShowAxisLocation();
    int i7 = jThermometer4.getWidth();
    java.awt.Component component8 = jThermometer2.add((java.awt.Component)jThermometer4);
    jThermometer2.addNotify();
    java.awt.event.ContainerListener containerListener10 = null;
    jThermometer2.addContainerListener(containerListener10);
    java.awt.Font font12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
    jThermometer2.setValueFont(font12);
    subCategoryAxis1.setSubLabelFont(font12);
    org.jfree.chart.JFreeChart jFreeChart15 = null;
    org.jfree.chart.ChartPanel chartPanel29 = new org.jfree.chart.ChartPanel(jFreeChart15, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo30 = chartPanel29.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer31 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle32 = jThermometer31.getVisibleRect();
    jThermometer31.requestFocus();
    org.jfree.data.time.DateRange dateRange35 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range38 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange35, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType39 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange41 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange42 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint43 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange41, (org.jfree.data.Range)dateRange42);
    org.jfree.chart.axis.CompassFormat compassFormat44 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType45 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b46 = compassFormat44.equals((java.lang.Object)lengthConstraintType45);
    org.jfree.chart.axis.CompassFormat compassFormat47 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType48 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b49 = compassFormat47.equals((java.lang.Object)lengthConstraintType48);
    boolean b50 = lengthConstraintType45.equals((java.lang.Object)b49);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint51 = new org.jfree.chart.block.RectangleConstraint(0.0d, range38, lengthConstraintType39, (double)1L, (org.jfree.data.Range)dateRange41, lengthConstraintType45);
    chartPanel29.add((java.awt.Component)jThermometer31, (java.lang.Object)lengthConstraintType39);
    javax.swing.InputVerifier inputVerifier53 = chartPanel29.getInputVerifier();
    boolean b54 = chartPanel29.getRefreshBuffer();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array55 = chartPanel29.getMouseMotionListeners();
    java.lang.String str56 = chartPanel29.toString();
    boolean b57 = subCategoryAxis1.equals((java.lang.Object)str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0str56,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=10,height=0]]"+ "'", str56.equals("org.jfree.chart.ChartPanel[,0,0,0str56,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=10,height=0]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test222"); }

    org.jfree.data.contour.DefaultContourDataset defaultContourDataset0 = new org.jfree.data.contour.DefaultContourDataset();
    int i1 = defaultContourDataset0.getSeriesCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test223"); }

    org.jfree.data.xy.YIntervalDataItem yIntervalDataItem4 = new org.jfree.data.xy.YIntervalDataItem((double)100, (double)100, (double)13, (double)' ');
    org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)100);
    int i6 = xYSeries5.getItemCount();
    double d7 = xYSeries5.getMinY();
    boolean b8 = xYSeries5.getAllowDuplicateXValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertEquals((double)d7, Double.NaN, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test224"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel14.setReshowDelay((int)(short)1);
    int i17 = chartPanel14.getMinimumDrawWidth();
    chartPanel14.repaint((int)'#', (int)'#', (int)(byte)0, (-192));
    chartPanel14.setDismissDelay(100);
    javax.swing.ActionMap actionMap25 = null;
    chartPanel14.setActionMap(actionMap25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 13);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test225"); }

    org.jfree.data.time.TimePeriodValuesCollection timePeriodValuesCollection0 = new org.jfree.data.time.TimePeriodValuesCollection();
    org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset)timePeriodValuesCollection0);
    java.lang.Object obj2 = null;
    boolean b3 = timePeriodValuesCollection0.equals(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(range1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test226"); }

    org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE12;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelAnchor0);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test227"); }

    org.jfree.chart.axis.MonthDateFormat monthDateFormat0 = new org.jfree.chart.axis.MonthDateFormat();
    double[][] d_array_array1 = new double[][] {  };
    double[][] d_array_array2 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array1, d_array_array2);
    org.jfree.data.general.SeriesDataset[] seriesDataset_array4 = new org.jfree.data.general.SeriesDataset[] { defaultIntervalCategoryDataset3 };
    org.jfree.data.general.CombinedDataset combinedDataset5 = new org.jfree.data.general.CombinedDataset(seriesDataset_array4);
    org.jfree.data.general.CombinedDataset combinedDataset6 = new org.jfree.data.general.CombinedDataset(seriesDataset_array4);
    boolean b7 = monthDateFormat0.equals((java.lang.Object)seriesDataset_array4);
    org.jfree.data.general.CombinedDataset combinedDataset8 = new org.jfree.data.general.CombinedDataset(seriesDataset_array4);
    org.jfree.data.function.PowerFunction2D powerFunction2D11 = new org.jfree.data.function.PowerFunction2D(0.05d, (double)4);
    org.jfree.text.TextBox textBox18 = null;
    org.jfree.chart.plot.PieLabelRecord pieLabelRecord22 = new org.jfree.chart.plot.PieLabelRecord((java.lang.Comparable)(-1L), (double)10, (double)10.0f, textBox18, (double)(byte)10, (double)0L, (double)0.5f);
    double d23 = pieLabelRecord22.getLabelHeight();
    org.jfree.text.TextBox textBox24 = pieLabelRecord22.getLabel();
    org.jfree.data.xy.XYDataset xYDataset25 = org.jfree.data.general.DatasetUtilities.sampleFunction2D((org.jfree.data.function.Function2D)powerFunction2D11, (double)9, (double)255, (int)'#', (java.lang.Comparable)pieLabelRecord22);
    org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(xYDataset25, true);
    combinedDataset8.add((org.jfree.data.general.SeriesDataset)xYDataset25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(seriesDataset_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(textBox24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xYDataset25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range27);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test228"); }

    org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset defaultBoxAndWhiskerXYDataset1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset((java.lang.Comparable)(-1));
    // The following exception was thrown during execution in test generation
    try {
    java.util.Date date4 = defaultBoxAndWhiskerXYDataset1.getXDate(7, 128);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test229"); }

    java.lang.Class class3 = null;
    org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)13, "ZOOM_DOMAIN_BOTH", "", class3);
    java.util.TimeZone timeZone5 = org.jfree.chart.axis.SegmentedTimeline.NO_DST_TIME_ZONE;
    org.jfree.data.time.TimeSeriesCollection timeSeriesCollection6 = new org.jfree.data.time.TimeSeriesCollection(timeSeries4, timeZone5);
    timeSeriesCollection6.setDomainIsPointsInTime(true);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number11 = timeSeriesCollection6.getStartX(10, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeZone5);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test230"); }

    org.jfree.chart.renderer.OutlierListCollection outlierListCollection0 = new org.jfree.chart.renderer.OutlierListCollection();
    boolean b1 = outlierListCollection0.isHighFarOut();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test231"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    jThermometer16.requestFocus();
    org.jfree.data.time.DateRange dateRange20 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range23 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange20, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType24 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange26 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange27 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange26, (org.jfree.data.Range)dateRange27);
    org.jfree.chart.axis.CompassFormat compassFormat29 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType30 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b31 = compassFormat29.equals((java.lang.Object)lengthConstraintType30);
    org.jfree.chart.axis.CompassFormat compassFormat32 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType33 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b34 = compassFormat32.equals((java.lang.Object)lengthConstraintType33);
    boolean b35 = lengthConstraintType30.equals((java.lang.Object)b34);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint36 = new org.jfree.chart.block.RectangleConstraint(0.0d, range23, lengthConstraintType24, (double)1L, (org.jfree.data.Range)dateRange26, lengthConstraintType30);
    chartPanel14.add((java.awt.Component)jThermometer16, (java.lang.Object)lengthConstraintType24);
    java.awt.Event event38 = null;
    boolean b41 = jThermometer16.mouseMove(event38, (-1), (int)' ');
    java.beans.PropertyChangeListener propertyChangeListener43 = null;
    jThermometer16.removePropertyChangeListener("Time", propertyChangeListener43);
    org.jfree.chart.JFreeChart jFreeChart46 = null;
    org.jfree.chart.ChartFrame chartFrame47 = new org.jfree.chart.ChartFrame("series", jFreeChart46);
    java.awt.Color color48 = chartFrame47.getBackground();
    jThermometer16.setBackground(color48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color48);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test232"); }

    java.lang.Number number1 = null;
    org.jfree.data.general.DefaultKeyedValueDataset defaultKeyedValueDataset2 = new org.jfree.data.general.DefaultKeyedValueDataset((java.lang.Comparable)0.0f, number1);
    org.jfree.chart.axis.CategoryAxis categoryAxis4 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions5 = categoryAxis4.getCategoryLabelPositions();
    org.jfree.chart.event.AxisChangeListener axisChangeListener6 = null;
    categoryAxis4.removeChangeListener(axisChangeListener6);
    org.jfree.data.xy.YIntervalDataItem yIntervalDataItem12 = new org.jfree.data.xy.YIntervalDataItem((double)9, (double)(byte)1, (double)4, (double)(byte)0);
    java.awt.Font font13 = categoryAxis4.getTickLabelFont((java.lang.Comparable)yIntervalDataItem12);
    defaultKeyedValueDataset2.setValue((java.lang.Comparable)yIntervalDataItem12, (java.lang.Number)(byte)0);
    java.lang.Comparable comparable16 = defaultKeyedValueDataset2.getKey();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelPositions5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparable16);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test233"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge11 = null;
    double d12 = categoryAxis6.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle10, rectangleEdge11);
    org.jfree.chart.plot.JThermometer jThermometer17 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event18 = null;
    boolean b20 = jThermometer17.keyDown(event18, 100);
    jThermometer17.setSize((int)(short)100, 8);
    java.awt.Dimension dimension24 = jThermometer17.minimumSize();
    java.awt.Dimension dimension25 = jThermometer17.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
    jThermometer17.removeHierarchyBoundsListener(hierarchyBoundsListener26);
    org.jfree.chart.plot.JThermometer jThermometer28 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle29 = jThermometer28.getVisibleRect();
    java.awt.Rectangle rectangle30 = jThermometer17.getBounds(rectangle29);
    java.awt.Color color31 = java.awt.Color.black;
    float[] f_array37 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array38 = color31.getRGBComponents(f_array37);
    org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle30, (java.awt.Paint)color31);
    org.jfree.chart.axis.CategoryAxis categoryAxis41 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer44 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle45 = jThermometer44.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge46 = null;
    double d47 = categoryAxis41.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle45, rectangleEdge46);
    categoryAxis41.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis41.setTickMarkStroke(stroke50);
    org.jfree.chart.JFreeChart jFreeChart52 = null;
    org.jfree.chart.ChartPanel chartPanel66 = new org.jfree.chart.ChartPanel(jFreeChart52, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel66.setReshowDelay((int)(short)1);
    java.awt.Color color69 = java.awt.Color.WHITE;
    chartPanel66.setZoomOutlinePaint((java.awt.Paint)color69);
    org.jfree.chart.LegendItem legendItem71 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle10, (java.awt.Paint)color31, stroke50, (java.awt.Paint)color69);
    xYShapeRenderer0.setShape((java.awt.Shape)rectangle10);
    xYShapeRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    boolean b77 = xYShapeRenderer0.getUseFillPaint();
    org.jfree.chart.JFreeChart jFreeChart78 = null;
    org.jfree.chart.ChartPanel chartPanel92 = new org.jfree.chart.ChartPanel(jFreeChart78, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel92.setReshowDelay((int)(short)1);
    boolean b95 = xYShapeRenderer0.hasListener((java.util.EventListener)chartPanel92);
    java.lang.Boolean b97 = xYShapeRenderer0.getSeriesCreateEntities(3);
    org.jfree.chart.labels.XYToolTipGenerator xYToolTipGenerator98 = null;
    xYShapeRenderer0.setBaseToolTipGenerator(xYToolTipGenerator98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b97);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test234"); }

    org.jfree.data.resources.DataPackageResources_de dataPackageResources_de0 = new org.jfree.data.resources.DataPackageResources_de();

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test235"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel14.setReshowDelay((int)(short)1);
    java.awt.Color color17 = java.awt.Color.WHITE;
    chartPanel14.setZoomOutlinePaint((java.awt.Paint)color17);
    org.jfree.chart.JFreeChart jFreeChart19 = null;
    org.jfree.chart.ChartPanel chartPanel33 = new org.jfree.chart.ChartPanel(jFreeChart19, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel33.setReshowDelay((int)(short)1);
    java.lang.Object obj36 = chartPanel14.getClientProperty((java.lang.Object)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    chartPanel14.remove((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj36);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test236"); }

    org.jfree.data.time.DateRange dateRange1 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange2 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint3 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange1, (org.jfree.data.Range)dateRange2);
    org.jfree.chart.plot.JThermometer jThermometer8 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event9 = null;
    boolean b11 = jThermometer8.keyDown(event9, 100);
    jThermometer8.setSize((int)(short)100, 8);
    java.awt.Dimension dimension15 = jThermometer8.minimumSize();
    java.awt.Dimension dimension16 = jThermometer8.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener17 = null;
    jThermometer8.removeHierarchyBoundsListener(hierarchyBoundsListener17);
    org.jfree.chart.plot.JThermometer jThermometer19 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle20 = jThermometer19.getVisibleRect();
    java.awt.Rectangle rectangle21 = jThermometer8.getBounds(rectangle20);
    java.awt.Color color22 = java.awt.Color.black;
    float[] f_array28 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array29 = color22.getRGBComponents(f_array28);
    org.jfree.chart.LegendItem legendItem30 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle21, (java.awt.Paint)color22);
    java.awt.Font font31 = legendItem30.getLabelFont();
    legendItem30.setDatasetIndex((int)(byte)10);
    java.awt.Paint paint34 = legendItem30.getOutlinePaint();
    org.jfree.chart.axis.CategoryAxis categoryAxis36 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer39 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle40 = jThermometer39.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge41 = null;
    double d42 = categoryAxis36.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle40, rectangleEdge41);
    categoryAxis36.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke45 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis36.setTickMarkStroke(stroke45);
    java.awt.Color color47 = java.awt.Color.BLACK;
    org.jfree.chart.plot.MeterInterval meterInterval48 = new org.jfree.chart.plot.MeterInterval("", (org.jfree.data.Range)dateRange2, paint34, stroke45, (java.awt.Paint)color47);
    org.jfree.data.Range range49 = meterInterval48.getRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint51 = new org.jfree.chart.block.RectangleConstraint(range49, (double)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(font31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d42 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range49);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test237"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b4 = jThermometer0.gotFocus(event1, (java.lang.Object)timeSeries3);
    boolean b5 = timeSeries3.getNotify();
    org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries3.getDataItem(regularTimePeriod6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test238"); }

    int i0 = java.text.DateFormat.FULL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test239"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge11 = null;
    double d12 = categoryAxis6.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle10, rectangleEdge11);
    org.jfree.chart.plot.JThermometer jThermometer17 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event18 = null;
    boolean b20 = jThermometer17.keyDown(event18, 100);
    jThermometer17.setSize((int)(short)100, 8);
    java.awt.Dimension dimension24 = jThermometer17.minimumSize();
    java.awt.Dimension dimension25 = jThermometer17.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
    jThermometer17.removeHierarchyBoundsListener(hierarchyBoundsListener26);
    org.jfree.chart.plot.JThermometer jThermometer28 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle29 = jThermometer28.getVisibleRect();
    java.awt.Rectangle rectangle30 = jThermometer17.getBounds(rectangle29);
    java.awt.Color color31 = java.awt.Color.black;
    float[] f_array37 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array38 = color31.getRGBComponents(f_array37);
    org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle30, (java.awt.Paint)color31);
    org.jfree.chart.axis.CategoryAxis categoryAxis41 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer44 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle45 = jThermometer44.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge46 = null;
    double d47 = categoryAxis41.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle45, rectangleEdge46);
    categoryAxis41.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis41.setTickMarkStroke(stroke50);
    org.jfree.chart.JFreeChart jFreeChart52 = null;
    org.jfree.chart.ChartPanel chartPanel66 = new org.jfree.chart.ChartPanel(jFreeChart52, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel66.setReshowDelay((int)(short)1);
    java.awt.Color color69 = java.awt.Color.WHITE;
    chartPanel66.setZoomOutlinePaint((java.awt.Paint)color69);
    org.jfree.chart.LegendItem legendItem71 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle10, (java.awt.Paint)color31, stroke50, (java.awt.Paint)color69);
    xYShapeRenderer0.setShape((java.awt.Shape)rectangle10);
    xYShapeRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    org.jfree.chart.labels.ItemLabelPosition itemLabelPosition77 = xYShapeRenderer0.getBasePositiveItemLabelPosition();
    org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor78 = itemLabelPosition77.getItemLabelAnchor();
    org.jfree.chart.JFreeChart jFreeChart79 = null;
    org.jfree.chart.event.ChartChangeEventType chartChangeEventType80 = org.jfree.chart.event.ChartChangeEventType.GENERAL;
    org.jfree.chart.event.ChartChangeEvent chartChangeEvent81 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)itemLabelPosition77, jFreeChart79, chartChangeEventType80);
    org.jfree.chart.JFreeChart jFreeChart82 = null;
    chartChangeEvent81.setChart(jFreeChart82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelPosition77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelAnchor78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartChangeEventType80);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test240"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    int i2 = jThermometer0.getShowAxisLocation();
    java.awt.Event event3 = null;
    boolean b6 = jThermometer0.mouseMove(event3, 1, (int)' ');
    boolean b7 = jThermometer0.isOpaque();
    java.beans.PropertyChangeListener propertyChangeListener8 = null;
    jThermometer0.removePropertyChangeListener(propertyChangeListener8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test241"); }

    org.jfree.data.contour.DefaultContourDataset defaultContourDataset0 = new org.jfree.data.contour.DefaultContourDataset();
    java.lang.Number[] number_array1 = defaultContourDataset0.getXValues();
    int i2 = defaultContourDataset0.getSeriesCount();
    int[] i_array3 = defaultContourDataset0.getXIndices();
    // The following exception was thrown during execution in test generation
    try {
    int i5 = defaultContourDataset0.getItemCount((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(number_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array3);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test242"); }

    org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test243"); }

    org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle5 = jThermometer4.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge6 = null;
    double d7 = categoryAxis1.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle5, rectangleEdge6);
    categoryAxis1.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis1.setTickMarkStroke(stroke10);
    categoryAxis1.setMinorTickMarkInsideLength((float)2);
    org.jfree.chart.event.AxisChangeListener axisChangeListener14 = null;
    categoryAxis1.removeChangeListener(axisChangeListener14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke10);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test244"); }

    org.jfree.data.xy.XIntervalSeries xIntervalSeries3 = new org.jfree.data.xy.XIntervalSeries((java.lang.Comparable)"XYCoordinateType.INDEX", false, false);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test245"); }

    org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues("<map id=\"index.html\" name=\"index.html\">\n</map>", "ZOOM_DOMAIN_BOTH", "LengthConstraintType.NONE");

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test246"); }

    org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues("ZOOM_RESET_RANGE", "ZOOM_RESET_DOMAIN", "");
    org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy(100, 100);
    double[][] d_array_array7 = new double[][] {  };
    double[][] d_array_array8 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset9 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array7, d_array_array8);
    org.jfree.data.general.SeriesDataset[] seriesDataset_array10 = new org.jfree.data.general.SeriesDataset[] { defaultIntervalCategoryDataset9 };
    org.jfree.data.general.CombinedDataset combinedDataset11 = new org.jfree.data.general.CombinedDataset(seriesDataset_array10);
    timePeriodValues3.addChangeListener((org.jfree.data.general.SeriesChangeListener)combinedDataset11);
    int i13 = timePeriodValues3.getMaxMiddleIndex();
    org.jfree.data.time.TimePeriodValuesCollection timePeriodValuesCollection14 = new org.jfree.data.time.TimePeriodValuesCollection(timePeriodValues3);
    org.jfree.data.time.TimePeriodAnchor timePeriodAnchor15 = timePeriodValuesCollection14.getXPosition();
    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer16 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis22 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer25 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle26 = jThermometer25.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge27 = null;
    double d28 = categoryAxis22.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle26, rectangleEdge27);
    org.jfree.chart.plot.JThermometer jThermometer33 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event34 = null;
    boolean b36 = jThermometer33.keyDown(event34, 100);
    jThermometer33.setSize((int)(short)100, 8);
    java.awt.Dimension dimension40 = jThermometer33.minimumSize();
    java.awt.Dimension dimension41 = jThermometer33.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener42 = null;
    jThermometer33.removeHierarchyBoundsListener(hierarchyBoundsListener42);
    org.jfree.chart.plot.JThermometer jThermometer44 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle45 = jThermometer44.getVisibleRect();
    java.awt.Rectangle rectangle46 = jThermometer33.getBounds(rectangle45);
    java.awt.Color color47 = java.awt.Color.black;
    float[] f_array53 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array54 = color47.getRGBComponents(f_array53);
    org.jfree.chart.LegendItem legendItem55 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle46, (java.awt.Paint)color47);
    org.jfree.chart.axis.CategoryAxis categoryAxis57 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer60 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle61 = jThermometer60.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge62 = null;
    double d63 = categoryAxis57.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle61, rectangleEdge62);
    categoryAxis57.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke66 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis57.setTickMarkStroke(stroke66);
    org.jfree.chart.JFreeChart jFreeChart68 = null;
    org.jfree.chart.ChartPanel chartPanel82 = new org.jfree.chart.ChartPanel(jFreeChart68, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel82.setReshowDelay((int)(short)1);
    java.awt.Color color85 = java.awt.Color.WHITE;
    chartPanel82.setZoomOutlinePaint((java.awt.Paint)color85);
    org.jfree.chart.LegendItem legendItem87 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle26, (java.awt.Paint)color47, stroke66, (java.awt.Paint)color85);
    xYShapeRenderer16.setShape((java.awt.Shape)rectangle26);
    xYShapeRenderer16.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    org.jfree.chart.labels.ItemLabelPosition itemLabelPosition93 = xYShapeRenderer16.getBasePositiveItemLabelPosition();
    java.awt.Paint paint96 = xYShapeRenderer16.getItemPaint(2, (int)(short)0);
    boolean b97 = timePeriodValuesCollection14.equals((java.lang.Object)xYShapeRenderer16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timePeriodValues6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(seriesDataset_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timePeriodAnchor15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d63 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelPosition93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b97 == false);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test247"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    boolean b15 = chartPanel14.isDomainZoomable();
    java.awt.geom.Point2D point2D16 = chartPanel14.getAnchor();
    java.awt.Event event17 = null;
    org.jfree.chart.JFreeChart jFreeChart18 = null;
    org.jfree.chart.ChartPanel chartPanel32 = new org.jfree.chart.ChartPanel(jFreeChart18, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo33 = chartPanel32.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer34 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle35 = jThermometer34.getVisibleRect();
    jThermometer34.requestFocus();
    org.jfree.data.time.DateRange dateRange38 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range41 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange38, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType42 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange44 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange45 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint46 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange44, (org.jfree.data.Range)dateRange45);
    org.jfree.chart.axis.CompassFormat compassFormat47 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType48 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b49 = compassFormat47.equals((java.lang.Object)lengthConstraintType48);
    org.jfree.chart.axis.CompassFormat compassFormat50 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType51 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b52 = compassFormat50.equals((java.lang.Object)lengthConstraintType51);
    boolean b53 = lengthConstraintType48.equals((java.lang.Object)b52);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint54 = new org.jfree.chart.block.RectangleConstraint(0.0d, range41, lengthConstraintType42, (double)1L, (org.jfree.data.Range)dateRange44, lengthConstraintType48);
    chartPanel32.add((java.awt.Component)jThermometer34, (java.lang.Object)lengthConstraintType42);
    javax.swing.InputVerifier inputVerifier56 = chartPanel32.getInputVerifier();
    boolean b57 = chartPanel32.getRefreshBuffer();
    boolean b58 = chartPanel14.lostFocus(event17, (java.lang.Object)b57);
    java.beans.VetoableChangeListener vetoableChangeListener59 = null;
    chartPanel14.removeVetoableChangeListener(vetoableChangeListener59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point2D16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test248"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    int i2 = jThermometer0.getShowAxisLocation();
    java.awt.event.ContainerListener containerListener3 = null;
    jThermometer0.addContainerListener(containerListener3);
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener5 = null;
    jThermometer0.addHierarchyBoundsListener(hierarchyBoundsListener5);
    javax.swing.JPopupMenu jPopupMenu7 = null;
    jThermometer0.setComponentPopupMenu(jPopupMenu7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test249"); }

    org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle5 = jThermometer4.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge6 = null;
    double d7 = categoryAxis1.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle5, rectangleEdge6);
    categoryAxis1.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis1.setTickMarkStroke(stroke10);
    double d12 = categoryAxis1.getLowerMargin();
    org.jfree.ui.RectangleInsets rectangleInsets13 = categoryAxis1.getTickLabelInsets();
    java.awt.Paint paint14 = categoryAxis1.getLabelPaint();
    categoryAxis1.setAxisLineVisible(false);
    int i17 = categoryAxis1.getCategoryLabelPositionOffset();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 4);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test250"); }

    org.jfree.chart.axis.DateTickUnitType dateTickUnitType0 = null;
    org.jfree.chart.axis.MonthDateFormat monthDateFormat2 = new org.jfree.chart.axis.MonthDateFormat();
    java.lang.Object obj3 = monthDateFormat2.clone();
    boolean b5 = monthDateFormat2.equals((java.lang.Object)(-4));
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.axis.DateTickUnit dateTickUnit6 = new org.jfree.chart.axis.DateTickUnit(dateTickUnitType0, 1, (java.text.DateFormat)monthDateFormat2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test251"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    boolean b3 = jThermometer0.keyDown(event1, 100);
    jThermometer0.setSize((int)(short)100, 8);
    java.awt.Dimension dimension7 = jThermometer0.minimumSize();
    java.awt.Dimension dimension8 = jThermometer0.preferredSize();
    java.awt.event.KeyListener keyListener9 = null;
    jThermometer0.addKeyListener(keyListener9);
    java.awt.Font font11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.FontMetrics fontMetrics12 = jThermometer0.getFontMetrics(font11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test252"); }

    org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions2 = categoryAxis1.getCategoryLabelPositions();
    org.jfree.chart.event.AxisChangeListener axisChangeListener3 = null;
    categoryAxis1.removeChangeListener(axisChangeListener3);
    org.jfree.ui.RectangleInsets rectangleInsets5 = categoryAxis1.getTickLabelInsets();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelPositions2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets5);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test253"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge11 = null;
    double d12 = categoryAxis6.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle10, rectangleEdge11);
    org.jfree.chart.plot.JThermometer jThermometer17 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event18 = null;
    boolean b20 = jThermometer17.keyDown(event18, 100);
    jThermometer17.setSize((int)(short)100, 8);
    java.awt.Dimension dimension24 = jThermometer17.minimumSize();
    java.awt.Dimension dimension25 = jThermometer17.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
    jThermometer17.removeHierarchyBoundsListener(hierarchyBoundsListener26);
    org.jfree.chart.plot.JThermometer jThermometer28 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle29 = jThermometer28.getVisibleRect();
    java.awt.Rectangle rectangle30 = jThermometer17.getBounds(rectangle29);
    java.awt.Color color31 = java.awt.Color.black;
    float[] f_array37 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array38 = color31.getRGBComponents(f_array37);
    org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle30, (java.awt.Paint)color31);
    org.jfree.chart.axis.CategoryAxis categoryAxis41 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer44 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle45 = jThermometer44.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge46 = null;
    double d47 = categoryAxis41.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle45, rectangleEdge46);
    categoryAxis41.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis41.setTickMarkStroke(stroke50);
    org.jfree.chart.JFreeChart jFreeChart52 = null;
    org.jfree.chart.ChartPanel chartPanel66 = new org.jfree.chart.ChartPanel(jFreeChart52, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel66.setReshowDelay((int)(short)1);
    java.awt.Color color69 = java.awt.Color.WHITE;
    chartPanel66.setZoomOutlinePaint((java.awt.Paint)color69);
    org.jfree.chart.LegendItem legendItem71 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle10, (java.awt.Paint)color31, stroke50, (java.awt.Paint)color69);
    xYShapeRenderer0.setShape((java.awt.Shape)rectangle10);
    xYShapeRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    org.jfree.chart.labels.ItemLabelPosition itemLabelPosition77 = xYShapeRenderer0.getBasePositiveItemLabelPosition();
    org.jfree.chart.plot.XYPlot xYPlot78 = null;
    xYShapeRenderer0.setPlot(xYPlot78);
    xYShapeRenderer0.clearSeriesPaints(true);
    java.awt.Color color84 = java.awt.Color.BLACK;
    java.awt.Stroke stroke85 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    org.jfree.chart.plot.CategoryMarker categoryMarker86 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)9, (java.awt.Paint)color84, stroke85);
    xYShapeRenderer0.setSeriesStroke(768, stroke85);
    java.awt.Stroke stroke89 = xYShapeRenderer0.lookupSeriesStroke(2);
    java.awt.Paint paint90 = xYShapeRenderer0.getGuideLinePaint();
    org.jfree.chart.LegendItemCollection legendItemCollection91 = xYShapeRenderer0.getLegendItems();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelPosition77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(legendItemCollection91);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test254"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge11 = null;
    double d12 = categoryAxis6.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle10, rectangleEdge11);
    org.jfree.chart.plot.JThermometer jThermometer17 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event18 = null;
    boolean b20 = jThermometer17.keyDown(event18, 100);
    jThermometer17.setSize((int)(short)100, 8);
    java.awt.Dimension dimension24 = jThermometer17.minimumSize();
    java.awt.Dimension dimension25 = jThermometer17.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
    jThermometer17.removeHierarchyBoundsListener(hierarchyBoundsListener26);
    org.jfree.chart.plot.JThermometer jThermometer28 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle29 = jThermometer28.getVisibleRect();
    java.awt.Rectangle rectangle30 = jThermometer17.getBounds(rectangle29);
    java.awt.Color color31 = java.awt.Color.black;
    float[] f_array37 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array38 = color31.getRGBComponents(f_array37);
    org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle30, (java.awt.Paint)color31);
    org.jfree.chart.axis.CategoryAxis categoryAxis41 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer44 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle45 = jThermometer44.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge46 = null;
    double d47 = categoryAxis41.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle45, rectangleEdge46);
    categoryAxis41.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis41.setTickMarkStroke(stroke50);
    org.jfree.chart.JFreeChart jFreeChart52 = null;
    org.jfree.chart.ChartPanel chartPanel66 = new org.jfree.chart.ChartPanel(jFreeChart52, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel66.setReshowDelay((int)(short)1);
    java.awt.Color color69 = java.awt.Color.WHITE;
    chartPanel66.setZoomOutlinePaint((java.awt.Paint)color69);
    org.jfree.chart.LegendItem legendItem71 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle10, (java.awt.Paint)color31, stroke50, (java.awt.Paint)color69);
    xYShapeRenderer0.setShape((java.awt.Shape)rectangle10);
    xYShapeRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    java.awt.Font font77 = xYShapeRenderer0.getBaseItemLabelFont();
    java.awt.Stroke stroke79 = xYShapeRenderer0.getSeriesOutlineStroke(13);
    java.awt.Color color81 = java.awt.Color.black;
    xYShapeRenderer0.setLegendTextPaint(4, (java.awt.Paint)color81);
    java.lang.Boolean b84 = xYShapeRenderer0.getSeriesVisibleInLegend((int)(short)-1);
    org.jfree.chart.labels.XYToolTipGenerator xYToolTipGenerator85 = xYShapeRenderer0.getToolTipGenerator();
    org.jfree.chart.labels.XYToolTipGenerator xYToolTipGenerator86 = xYShapeRenderer0.getBaseToolTipGenerator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(stroke79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xYToolTipGenerator85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xYToolTipGenerator86);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test255"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    int i2 = jThermometer0.getShowAxisLocation();
    int i3 = jThermometer0.getDebugGraphicsOptions();
    jThermometer0.firePropertyChange("", (byte)-1, (byte)10);
    jThermometer0.setSubrangeInfo((int)' ', (double)100.0f, 0.0d);
    java.awt.Graphics graphics12 = null;
    jThermometer0.update(graphics12);
    boolean b14 = jThermometer0.isFocusable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test256"); }

    org.jfree.data.xy.XYDatasetTableModel xYDatasetTableModel0 = new org.jfree.data.xy.XYDatasetTableModel();
    java.lang.Object obj3 = xYDatasetTableModel0.getValueAt((int)(byte)100, 0);
    xYDatasetTableModel0.fireTableCellUpdated(1024, 1024);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test257"); }

    org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues("hi!", "hi!", "");
    int i4 = timePeriodValues3.getMinEndIndex();
    org.jfree.chart.plot.JThermometer jThermometer5 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle6 = jThermometer5.getVisibleRect();
    jThermometer5.requestFocus();
    boolean b8 = timePeriodValues3.equals((java.lang.Object)jThermometer5);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
    java.lang.Object obj11 = timePeriodValues3.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test258"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    jThermometer0.revalidate();
    org.jfree.chart.JFreeChart jFreeChart3 = null;
    org.jfree.chart.ChartPanel chartPanel17 = new org.jfree.chart.ChartPanel(jFreeChart3, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    boolean b18 = chartPanel17.isDomainZoomable();
    chartPanel17.setZoomOutFactor((double)768);
    chartPanel17.setVerticalAxisTrace(true);
    java.beans.PropertyChangeListener propertyChangeListener23 = null;
    chartPanel17.removePropertyChangeListener(propertyChangeListener23);
    jThermometer0.removeMouseListener((java.awt.event.MouseListener)chartPanel17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test259"); }

    org.jfree.data.RangeType rangeType0 = org.jfree.data.RangeType.NEGATIVE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rangeType0);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test260"); }

    org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle5 = jThermometer4.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge6 = null;
    double d7 = categoryAxis1.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle5, rectangleEdge6);
    categoryAxis1.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis1.setTickMarkStroke(stroke10);
    categoryAxis1.setMaximumCategoryLabelLines((-143));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke10);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test261"); }

    org.jfree.chart.JFreeChart jFreeChart1 = null;
    org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("series", jFreeChart1);
    chartFrame2.setResizable(false);
    chartFrame2.setBounds((int)'#', (int)' ', 9, 0);
    javax.swing.JMenuBar jMenuBar10 = null;
    chartFrame2.setJMenuBar(jMenuBar10);
    java.awt.Graphics graphics12 = null;
    chartFrame2.paint(graphics12);
    chartFrame2.pack();
    chartFrame2.show();

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test262"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    jThermometer16.requestFocus();
    org.jfree.data.time.DateRange dateRange20 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range23 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange20, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType24 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange26 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange27 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange26, (org.jfree.data.Range)dateRange27);
    org.jfree.chart.axis.CompassFormat compassFormat29 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType30 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b31 = compassFormat29.equals((java.lang.Object)lengthConstraintType30);
    org.jfree.chart.axis.CompassFormat compassFormat32 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType33 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b34 = compassFormat32.equals((java.lang.Object)lengthConstraintType33);
    boolean b35 = lengthConstraintType30.equals((java.lang.Object)b34);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint36 = new org.jfree.chart.block.RectangleConstraint(0.0d, range23, lengthConstraintType24, (double)1L, (org.jfree.data.Range)dateRange26, lengthConstraintType30);
    chartPanel14.add((java.awt.Component)jThermometer16, (java.lang.Object)lengthConstraintType24);
    javax.swing.InputVerifier inputVerifier38 = chartPanel14.getInputVerifier();
    boolean b39 = chartPanel14.getRefreshBuffer();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array40 = chartPanel14.getMouseMotionListeners();
    java.lang.String str41 = chartPanel14.toString();
    java.awt.event.HierarchyListener hierarchyListener42 = null;
    chartPanel14.addHierarchyListener(hierarchyListener42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0str41,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=10,height=0]]"+ "'", str41.equals("org.jfree.chart.ChartPanel[,0,0,0str41,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=10,height=0]]"));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test263"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    jThermometer16.requestFocus();
    org.jfree.data.time.DateRange dateRange20 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range23 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange20, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType24 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange26 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange27 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange26, (org.jfree.data.Range)dateRange27);
    org.jfree.chart.axis.CompassFormat compassFormat29 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType30 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b31 = compassFormat29.equals((java.lang.Object)lengthConstraintType30);
    org.jfree.chart.axis.CompassFormat compassFormat32 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType33 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b34 = compassFormat32.equals((java.lang.Object)lengthConstraintType33);
    boolean b35 = lengthConstraintType30.equals((java.lang.Object)b34);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint36 = new org.jfree.chart.block.RectangleConstraint(0.0d, range23, lengthConstraintType24, (double)1L, (org.jfree.data.Range)dateRange26, lengthConstraintType30);
    chartPanel14.add((java.awt.Component)jThermometer16, (java.lang.Object)lengthConstraintType24);
    int i38 = chartPanel14.getMinimumDrawWidth();
    chartPanel14.setFocusTraversalKeysEnabled(false);
    java.awt.Color color41 = java.awt.Color.lightGray;
    chartPanel14.setZoomOutlinePaint((java.awt.Paint)color41);
    int i43 = color41.getTransparency();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test264"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    jThermometer16.requestFocus();
    org.jfree.data.time.DateRange dateRange20 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range23 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange20, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType24 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange26 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange27 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange26, (org.jfree.data.Range)dateRange27);
    org.jfree.chart.axis.CompassFormat compassFormat29 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType30 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b31 = compassFormat29.equals((java.lang.Object)lengthConstraintType30);
    org.jfree.chart.axis.CompassFormat compassFormat32 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType33 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b34 = compassFormat32.equals((java.lang.Object)lengthConstraintType33);
    boolean b35 = lengthConstraintType30.equals((java.lang.Object)b34);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint36 = new org.jfree.chart.block.RectangleConstraint(0.0d, range23, lengthConstraintType24, (double)1L, (org.jfree.data.Range)dateRange26, lengthConstraintType30);
    chartPanel14.add((java.awt.Component)jThermometer16, (java.lang.Object)lengthConstraintType24);
    javax.swing.InputVerifier inputVerifier38 = chartPanel14.getInputVerifier();
    java.awt.event.ComponentListener componentListener39 = null;
    chartPanel14.removeComponentListener(componentListener39);
    chartPanel14.move(5, 0);
    java.awt.event.FocusListener[] focusListener_array44 = chartPanel14.getFocusListeners();
    java.awt.Dimension dimension45 = chartPanel14.getPreferredSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension45);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test265"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    jThermometer16.requestFocus();
    org.jfree.data.time.DateRange dateRange20 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range23 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange20, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType24 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange26 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange27 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange26, (org.jfree.data.Range)dateRange27);
    org.jfree.chart.axis.CompassFormat compassFormat29 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType30 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b31 = compassFormat29.equals((java.lang.Object)lengthConstraintType30);
    org.jfree.chart.axis.CompassFormat compassFormat32 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType33 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b34 = compassFormat32.equals((java.lang.Object)lengthConstraintType33);
    boolean b35 = lengthConstraintType30.equals((java.lang.Object)b34);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint36 = new org.jfree.chart.block.RectangleConstraint(0.0d, range23, lengthConstraintType24, (double)1L, (org.jfree.data.Range)dateRange26, lengthConstraintType30);
    chartPanel14.add((java.awt.Component)jThermometer16, (java.lang.Object)lengthConstraintType24);
    javax.swing.InputVerifier inputVerifier38 = chartPanel14.getInputVerifier();
    boolean b39 = chartPanel14.getRefreshBuffer();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array40 = chartPanel14.getMouseMotionListeners();
    chartPanel14.removeAll();
    java.awt.event.MouseEvent mouseEvent42 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str43 = chartPanel14.getToolTipText(mouseEvent42);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array40);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test266"); }

    org.jfree.chart.axis.CategoryAnchor categoryAnchor0 = org.jfree.chart.axis.CategoryAnchor.START;
    java.text.NumberFormat numberFormat2 = java.text.NumberFormat.getPercentInstance();
    org.jfree.chart.axis.NumberTickUnit numberTickUnit4 = new org.jfree.chart.axis.NumberTickUnit((double)(-1.0f), numberFormat2, 1);
    numberFormat2.setMinimumIntegerDigits((int)' ');
    boolean b7 = categoryAnchor0.equals((java.lang.Object)numberFormat2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryAnchor0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(numberFormat2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test267"); }

    java.util.Locale locale0 = javax.swing.JComponent.getDefaultLocale();
    java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getInstance(locale0);
    java.math.RoundingMode roundingMode2 = numberFormat1.getRoundingMode();
    java.lang.String str4 = numberFormat1.format((long)9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(numberFormat1);
    org.junit.Assert.assertTrue("'" + roundingMode2 + "' != '" + java.math.RoundingMode.HALF_EVEN + "'", roundingMode2.equals(java.math.RoundingMode.HALF_EVEN));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "9"+ "'", str4.equals("9"));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test268"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    int i2 = jThermometer0.getShowAxisLocation();
    java.awt.Event event3 = null;
    boolean b6 = jThermometer0.mouseMove(event3, 1, (int)' ');
    jThermometer0.firePropertyChange("hi!", 0, 2);
    boolean b11 = jThermometer0.isVisible();
    jThermometer0.setFocusTraversalKeysEnabled(true);
    float f14 = jThermometer0.getAlignmentY();
    jThermometer0.setLocation(768, 13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f14 == 0.5f);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test269"); }

    java.lang.String str0 = org.jfree.data.xml.DatasetTags.VALUE_TAG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Value"+ "'", str0.equals("Value"));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test270"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    boolean b15 = chartPanel14.isDomainZoomable();
    double d16 = chartPanel14.getZoomOutFactor();
    boolean b17 = chartPanel14.isRangeZoomable();
    boolean b18 = chartPanel14.isOpaque();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test271"); }

    org.jfree.data.time.TimeSeriesCollection timeSeriesCollection0 = new org.jfree.data.time.TimeSeriesCollection();
    timeSeriesCollection0.setDomainIsPointsInTime(true);
    double d4 = timeSeriesCollection0.getDomainLowerBound(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertEquals((double)d4, Double.NaN, 0);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test272"); }

    int i0 = org.jfree.chart.renderer.WaferMapRenderer.POSITION_INDEX;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test273"); }

    org.jfree.data.gantt.GanttCategoryDataset ganttCategoryDataset0 = null;
    org.jfree.data.gantt.SlidingGanttCategoryDataset slidingGanttCategoryDataset3 = new org.jfree.data.gantt.SlidingGanttCategoryDataset(ganttCategoryDataset0, 0, 64);
    org.jfree.data.gantt.SlidingGanttCategoryDataset slidingGanttCategoryDataset6 = new org.jfree.data.gantt.SlidingGanttCategoryDataset((org.jfree.data.gantt.GanttCategoryDataset)slidingGanttCategoryDataset3, 680, (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number10 = slidingGanttCategoryDataset3.getEndValue((int)(byte)0, (int)'a', 12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test274"); }

    org.jfree.data.xy.YIntervalSeries yIntervalSeries1 = new org.jfree.data.xy.YIntervalSeries((java.lang.Comparable)2.0f);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test275"); }

    org.jfree.data.xy.XYIntervalSeries xYIntervalSeries1 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number3 = xYIntervalSeries1.getX(11);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test276"); }

    org.jfree.data.xy.YIntervalDataItem yIntervalDataItem4 = new org.jfree.data.xy.YIntervalDataItem((double)'4', (double)9, (double)10, (double)0.5f);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test277"); }

    org.jfree.data.xml.RootHandler rootHandler0 = new org.jfree.data.xml.RootHandler();
    rootHandler0.skippedEntity("jfreechart-");
    org.jfree.data.xml.ItemHandler itemHandler3 = null;
    org.jfree.data.xml.KeyHandler keyHandler4 = new org.jfree.data.xml.KeyHandler(rootHandler0, itemHandler3);
    char[] char_array7 = new char[] { '#', '#' };
    // The following exception was thrown during execution in test generation
    try {
    keyHandler4.characters(char_array7, 4, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array7);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test278"); }

    org.jfree.chart.plot.CategoryCrosshairState categoryCrosshairState0 = new org.jfree.chart.plot.CategoryCrosshairState();
    org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions3 = categoryAxis2.getCategoryLabelPositions();
    org.jfree.chart.event.AxisChangeListener axisChangeListener4 = null;
    categoryAxis2.removeChangeListener(axisChangeListener4);
    org.jfree.data.xy.YIntervalDataItem yIntervalDataItem10 = new org.jfree.data.xy.YIntervalDataItem((double)9, (double)(byte)1, (double)4, (double)(byte)0);
    java.awt.Font font11 = categoryAxis2.getTickLabelFont((java.lang.Comparable)yIntervalDataItem10);
    org.jfree.chart.plot.PlotOrientation plotOrientation17 = org.jfree.chart.plot.PlotOrientation.VERTICAL;
    categoryCrosshairState0.updateCrosshairPoint((java.lang.Comparable)yIntervalDataItem10, (java.lang.Comparable)52, (double)10.0f, (int)'4', (double)7, 0.0d, plotOrientation17);
    java.lang.String str19 = plotOrientation17.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelPositions3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(plotOrientation17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "PlotOrientation.VERTICAL"+ "'", str19.equals("PlotOrientation.VERTICAL"));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test279"); }

    org.jfree.chart.JFreeChart jFreeChart1 = null;
    org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("series", jFreeChart1);
    chartFrame2.setResizable(false);
    chartFrame2.setBounds((int)'#', (int)' ', 9, 0);
    javax.swing.JMenuBar jMenuBar10 = null;
    chartFrame2.setJMenuBar(jMenuBar10);
    chartFrame2.dispose();
    java.awt.Component component13 = chartFrame2.getFocusOwner();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component13);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test280"); }

    org.jfree.chart.axis.ColorBar colorBar1 = new org.jfree.chart.axis.ColorBar("E");
    org.jfree.chart.plot.ColorPalette colorPalette2 = colorBar1.getColorPalette();
    org.jfree.chart.axis.ColorBar colorBar4 = new org.jfree.chart.axis.ColorBar("E");
    org.jfree.chart.plot.ColorPalette colorPalette5 = colorBar4.getColorPalette();
    org.jfree.chart.axis.ValueAxis valueAxis6 = colorBar4.getAxis();
    colorBar1.setAxis(valueAxis6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorPalette2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorPalette5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(valueAxis6);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test281"); }

    java.util.TimeZone timeZone1 = org.jfree.chart.axis.SegmentedTimeline.NO_DST_TIME_ZONE;
    org.jfree.chart.axis.SegmentedTimeline.DEFAULT_TIME_ZONE = timeZone1;
    org.jfree.chart.plot.JThermometer jThermometer3 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event4 = null;
    boolean b6 = jThermometer3.keyDown(event4, 100);
    jThermometer3.setVisible(false);
    boolean b9 = jThermometer3.isFocusTraversable();
    java.util.Locale locale10 = javax.swing.JComponent.getDefaultLocale();
    jThermometer3.setLocale(locale10);
    org.jfree.chart.axis.MonthDateFormat monthDateFormat12 = new org.jfree.chart.axis.MonthDateFormat(locale10);
    org.jfree.chart.axis.MonthDateFormat monthDateFormat16 = new org.jfree.chart.axis.MonthDateFormat(timeZone1, locale10, (-1), true, false);
    java.lang.ClassLoader classLoader17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.ResourceBundle resourceBundle18 = org.jfree.chart.util.ResourceBundleWrapper.getBundle("Rainbow", locale10, classLoader17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeZone1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale10);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test282"); }

    org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("ZOOM_IN_BOTH");
    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer2 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis8 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer11 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle12 = jThermometer11.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge13 = null;
    double d14 = categoryAxis8.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle12, rectangleEdge13);
    org.jfree.chart.plot.JThermometer jThermometer19 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event20 = null;
    boolean b22 = jThermometer19.keyDown(event20, 100);
    jThermometer19.setSize((int)(short)100, 8);
    java.awt.Dimension dimension26 = jThermometer19.minimumSize();
    java.awt.Dimension dimension27 = jThermometer19.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener28 = null;
    jThermometer19.removeHierarchyBoundsListener(hierarchyBoundsListener28);
    org.jfree.chart.plot.JThermometer jThermometer30 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle31 = jThermometer30.getVisibleRect();
    java.awt.Rectangle rectangle32 = jThermometer19.getBounds(rectangle31);
    java.awt.Color color33 = java.awt.Color.black;
    float[] f_array39 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array40 = color33.getRGBComponents(f_array39);
    org.jfree.chart.LegendItem legendItem41 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle32, (java.awt.Paint)color33);
    org.jfree.chart.axis.CategoryAxis categoryAxis43 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer46 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle47 = jThermometer46.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge48 = null;
    double d49 = categoryAxis43.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle47, rectangleEdge48);
    categoryAxis43.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke52 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis43.setTickMarkStroke(stroke52);
    org.jfree.chart.JFreeChart jFreeChart54 = null;
    org.jfree.chart.ChartPanel chartPanel68 = new org.jfree.chart.ChartPanel(jFreeChart54, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel68.setReshowDelay((int)(short)1);
    java.awt.Color color71 = java.awt.Color.WHITE;
    chartPanel68.setZoomOutlinePaint((java.awt.Paint)color71);
    org.jfree.chart.LegendItem legendItem73 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle12, (java.awt.Paint)color33, stroke52, (java.awt.Paint)color71);
    xYShapeRenderer2.setShape((java.awt.Shape)rectangle12);
    xYShapeRenderer2.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    org.jfree.chart.labels.ItemLabelPosition itemLabelPosition79 = xYShapeRenderer2.getBasePositiveItemLabelPosition();
    org.jfree.chart.plot.XYPlot xYPlot80 = null;
    xYShapeRenderer2.setPlot(xYPlot80);
    xYShapeRenderer2.clearSeriesPaints(true);
    java.awt.Color color86 = java.awt.Color.BLACK;
    java.awt.Stroke stroke87 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    org.jfree.chart.plot.CategoryMarker categoryMarker88 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)9, (java.awt.Paint)color86, stroke87);
    xYShapeRenderer2.setSeriesStroke(768, stroke87);
    legendItem1.setOutlineStroke(stroke87);
    java.lang.Object obj91 = legendItem1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d49 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelPosition79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj91);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test283"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer1 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    java.awt.Color color3 = java.awt.Color.GRAY;
    int i4 = color3.getAlpha();
    xYShapeRenderer1.setLegendTextPaint(100, (java.awt.Paint)color3);
    org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator9 = new org.jfree.chart.util.DefaultShadowGenerator(0, color3, (float)'a', 13, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 255);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test284"); }

    org.jfree.chart.labels.StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new org.jfree.chart.labels.StandardCrosshairLabelGenerator();
    org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = new org.jfree.chart.labels.ItemLabelPosition();
    boolean b2 = standardCrosshairLabelGenerator0.equals((java.lang.Object)itemLabelPosition1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test285"); }

    org.jfree.chart.plot.XYCrosshairState xYCrosshairState0 = new org.jfree.chart.plot.XYCrosshairState();

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test286"); }

    org.jfree.chart.JFreeChart jFreeChart1 = null;
    org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("series", jFreeChart1);
    chartFrame2.setResizable(false);
    chartFrame2.setBounds((int)'#', (int)' ', 9, 0);
    javax.swing.JMenuBar jMenuBar10 = null;
    chartFrame2.setJMenuBar(jMenuBar10);
    chartFrame2.setState(11);
    org.jfree.chart.JFreeChart jFreeChart15 = null;
    org.jfree.chart.ChartFrame chartFrame16 = new org.jfree.chart.ChartFrame("series", jFreeChart15);
    chartFrame16.setFocusCycleRoot(false);
    chartFrame2.remove((java.awt.Component)chartFrame16);
    chartFrame2.show();

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test287"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge11 = null;
    double d12 = categoryAxis6.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle10, rectangleEdge11);
    org.jfree.chart.plot.JThermometer jThermometer17 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event18 = null;
    boolean b20 = jThermometer17.keyDown(event18, 100);
    jThermometer17.setSize((int)(short)100, 8);
    java.awt.Dimension dimension24 = jThermometer17.minimumSize();
    java.awt.Dimension dimension25 = jThermometer17.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
    jThermometer17.removeHierarchyBoundsListener(hierarchyBoundsListener26);
    org.jfree.chart.plot.JThermometer jThermometer28 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle29 = jThermometer28.getVisibleRect();
    java.awt.Rectangle rectangle30 = jThermometer17.getBounds(rectangle29);
    java.awt.Color color31 = java.awt.Color.black;
    float[] f_array37 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array38 = color31.getRGBComponents(f_array37);
    org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle30, (java.awt.Paint)color31);
    org.jfree.chart.axis.CategoryAxis categoryAxis41 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer44 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle45 = jThermometer44.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge46 = null;
    double d47 = categoryAxis41.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle45, rectangleEdge46);
    categoryAxis41.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis41.setTickMarkStroke(stroke50);
    org.jfree.chart.JFreeChart jFreeChart52 = null;
    org.jfree.chart.ChartPanel chartPanel66 = new org.jfree.chart.ChartPanel(jFreeChart52, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel66.setReshowDelay((int)(short)1);
    java.awt.Color color69 = java.awt.Color.WHITE;
    chartPanel66.setZoomOutlinePaint((java.awt.Paint)color69);
    org.jfree.chart.LegendItem legendItem71 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle10, (java.awt.Paint)color31, stroke50, (java.awt.Paint)color69);
    xYShapeRenderer0.setShape((java.awt.Shape)rectangle10);
    xYShapeRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    java.awt.Font font77 = xYShapeRenderer0.getBaseItemLabelFont();
    xYShapeRenderer0.setSeriesVisibleInLegend((java.lang.Boolean)true, true);
    java.awt.Paint paint82 = xYShapeRenderer0.lookupSeriesFillPaint((int)(short)10);
    java.lang.Boolean b83 = xYShapeRenderer0.getSeriesVisibleInLegend();
    xYShapeRenderer0.setSeriesVisible((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b83 + "' != '" + true+ "'", b83.equals(true));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test288"); }

    org.jfree.chart.plot.CategoryCrosshairState categoryCrosshairState0 = new org.jfree.chart.plot.CategoryCrosshairState();
    org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions3 = categoryAxis2.getCategoryLabelPositions();
    org.jfree.chart.event.AxisChangeListener axisChangeListener4 = null;
    categoryAxis2.removeChangeListener(axisChangeListener4);
    org.jfree.data.xy.YIntervalDataItem yIntervalDataItem10 = new org.jfree.data.xy.YIntervalDataItem((double)9, (double)(byte)1, (double)4, (double)(byte)0);
    java.awt.Font font11 = categoryAxis2.getTickLabelFont((java.lang.Comparable)yIntervalDataItem10);
    org.jfree.chart.plot.PlotOrientation plotOrientation17 = org.jfree.chart.plot.PlotOrientation.VERTICAL;
    categoryCrosshairState0.updateCrosshairPoint((java.lang.Comparable)yIntervalDataItem10, (java.lang.Comparable)52, (double)10.0f, (int)'4', (double)7, 0.0d, plotOrientation17);
    categoryCrosshairState0.setAnchorX((double)10);
    double d21 = categoryCrosshairState0.getAnchorY();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelPositions3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(plotOrientation17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 0.0d);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test289"); }

    java.awt.Color color1 = java.awt.Color.BLACK;
    java.awt.Stroke stroke2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    org.jfree.chart.plot.CategoryMarker categoryMarker3 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)9, (java.awt.Paint)color1, stroke2);
    categoryMarker3.setKey((java.lang.Comparable)"Item");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke2);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test290"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    boolean b15 = chartPanel14.isDomainZoomable();
    java.awt.geom.Point2D point2D16 = chartPanel14.getAnchor();
    boolean b17 = chartPanel14.isMaximumSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point2D16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test291"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge11 = null;
    double d12 = categoryAxis6.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle10, rectangleEdge11);
    org.jfree.chart.plot.JThermometer jThermometer17 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event18 = null;
    boolean b20 = jThermometer17.keyDown(event18, 100);
    jThermometer17.setSize((int)(short)100, 8);
    java.awt.Dimension dimension24 = jThermometer17.minimumSize();
    java.awt.Dimension dimension25 = jThermometer17.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
    jThermometer17.removeHierarchyBoundsListener(hierarchyBoundsListener26);
    org.jfree.chart.plot.JThermometer jThermometer28 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle29 = jThermometer28.getVisibleRect();
    java.awt.Rectangle rectangle30 = jThermometer17.getBounds(rectangle29);
    java.awt.Color color31 = java.awt.Color.black;
    float[] f_array37 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array38 = color31.getRGBComponents(f_array37);
    org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle30, (java.awt.Paint)color31);
    org.jfree.chart.axis.CategoryAxis categoryAxis41 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer44 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle45 = jThermometer44.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge46 = null;
    double d47 = categoryAxis41.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle45, rectangleEdge46);
    categoryAxis41.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis41.setTickMarkStroke(stroke50);
    org.jfree.chart.JFreeChart jFreeChart52 = null;
    org.jfree.chart.ChartPanel chartPanel66 = new org.jfree.chart.ChartPanel(jFreeChart52, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel66.setReshowDelay((int)(short)1);
    java.awt.Color color69 = java.awt.Color.WHITE;
    chartPanel66.setZoomOutlinePaint((java.awt.Paint)color69);
    org.jfree.chart.LegendItem legendItem71 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle10, (java.awt.Paint)color31, stroke50, (java.awt.Paint)color69);
    xYShapeRenderer0.setShape((java.awt.Shape)rectangle10);
    xYShapeRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    java.awt.Font font77 = xYShapeRenderer0.getBaseItemLabelFont();
    xYShapeRenderer0.setSeriesVisibleInLegend((java.lang.Boolean)true, true);
    java.awt.Color color82 = org.jfree.chart.ChartColor.DARK_YELLOW;
    org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator86 = new org.jfree.chart.util.DefaultShadowGenerator((int)'#', color82, (float)(-143), (int)(byte)-1, 0.2d);
    xYShapeRenderer0.setBaseItemLabelPaint((java.awt.Paint)color82, true);
    java.awt.Color color89 = org.jfree.chart.ChartColor.VERY_LIGHT_MAGENTA;
    xYShapeRenderer0.setFillPaint((java.awt.Paint)color89, false);
    java.util.Collection collection92 = xYShapeRenderer0.getAnnotations();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection92);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test292"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    boolean b15 = chartPanel14.isDomainZoomable();
    boolean b16 = chartPanel14.getVerifyInputWhenFocusTarget();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test293"); }

    org.jfree.data.time.DateRange dateRange0 = new org.jfree.data.time.DateRange();
    boolean b2 = dateRange0.contains((double)52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test294"); }

    org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)100.0f);
    org.jfree.chart.plot.JThermometer jThermometer2 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event3 = null;
    org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b6 = jThermometer2.gotFocus(event3, (java.lang.Object)timeSeries5);
    java.lang.Class class7 = timeSeries5.getTimePeriodClass();
    java.util.List list8 = timeSeries5.getItems();
    org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
    java.lang.Object obj10 = timeSeries1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeSeries9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test295"); }

    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.encoders.ImageEncoder imageEncoder2 = org.jfree.chart.encoders.ImageEncoderFactory.newInstance("PlotOrientation.VERTICAL", true);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test296"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.ChartTransferable chartTransferable8 = new org.jfree.chart.ChartTransferable(jFreeChart0, (int)' ', 0, (int)' ', (-1), 1024, 6, true);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test297"); }

    org.jfree.chart.axis.AxisLocation axisLocation0 = org.jfree.chart.axis.AxisLocation.TOP_OR_RIGHT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(axisLocation0);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test298"); }

    org.jfree.chart.plot.IntervalMarker intervalMarker2 = new org.jfree.chart.plot.IntervalMarker(0.0d, (double)0.5f);
    org.jfree.ui.GradientPaintTransformer gradientPaintTransformer3 = intervalMarker2.getGradientPaintTransformer();
    intervalMarker2.setLabel("jfreechart-");
    double d6 = intervalMarker2.getEndValue();
    java.lang.Class class7 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.EventListener[] eventListener_array8 = intervalMarker2.getListeners(class7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(gradientPaintTransformer3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.5d);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test299"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    jThermometer0.requestFocus();
    javax.swing.JPopupMenu jPopupMenu3 = jThermometer0.getComponentPopupMenu();
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    boolean b5 = jThermometer0.isAncestorOf((java.awt.Component)jThermometer4);
    java.awt.Dimension dimension6 = jThermometer4.getPreferredSize();
    java.awt.Graphics graphics7 = null;
    jThermometer4.printAll(graphics7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jPopupMenu3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test300"); }

    double[] d_array4 = new double[] { 2, ' ', 10.0d, '4' };
    int i5 = org.jfree.chart.HashUtilities.hashCodeForDoubleArray(d_array4);
    double[] d_array10 = new double[] { 2, ' ', 10.0d, '4' };
    int i11 = org.jfree.chart.HashUtilities.hashCodeForDoubleArray(d_array10);
    org.jfree.chart.ClipPath clipPath15 = new org.jfree.chart.ClipPath(d_array4, d_array10, true, false, true);
    boolean b16 = clipPath15.isClip();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-557783151));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-557783151));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test301"); }

    org.jfree.data.xy.XYDatasetTableModel xYDatasetTableModel0 = new org.jfree.data.xy.XYDatasetTableModel();
    java.lang.Object obj3 = xYDatasetTableModel0.getValueAt((int)(byte)100, 0);
    javax.swing.event.TableModelListener[] tableModelListener_array4 = xYDatasetTableModel0.getTableModelListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tableModelListener_array4);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test302"); }

    org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions2 = categoryAxis1.getCategoryLabelPositions();
    org.jfree.chart.event.AxisChangeListener axisChangeListener3 = null;
    categoryAxis1.removeChangeListener(axisChangeListener3);
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions5 = new org.jfree.chart.axis.CategoryLabelPositions();
    categoryAxis1.setCategoryLabelPositions(categoryLabelPositions5);
    java.text.NumberFormat numberFormat8 = java.text.NumberFormat.getPercentInstance();
    org.jfree.chart.axis.NumberTickUnit numberTickUnit10 = new org.jfree.chart.axis.NumberTickUnit((double)(-1.0f), numberFormat8, 1);
    org.jfree.chart.plot.RainbowPalette rainbowPalette11 = new org.jfree.chart.plot.RainbowPalette();
    double[][] d_array_array12 = new double[][] {  };
    double[][] d_array_array13 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset14 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array12, d_array_array13);
    org.jfree.data.general.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset14, (java.lang.Comparable)0.5d);
    java.util.List list17 = defaultIntervalCategoryDataset14.getSeries();
    org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset14);
    java.util.List list19 = defaultIntervalCategoryDataset14.getSeries();
    boolean b20 = rainbowPalette11.equals((java.lang.Object)list19);
    org.jfree.chart.plot.JThermometer jThermometer21 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle22 = jThermometer21.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge23 = null;
    // The following exception was thrown during execution in test generation
    try {
    double d24 = categoryAxis1.getCategoryMiddle((java.lang.Comparable)1, list19, (java.awt.geom.Rectangle2D)rectangle22, rectangleEdge23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelPositions2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(numberFormat8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pieDataset16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(range18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle22);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test303"); }

    org.jfree.chart.encoders.ImageEncoderFactory.setImageEncoder("jfreechart-", "");

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test304"); }

    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event5 = null;
    boolean b7 = jThermometer4.keyDown(event5, 100);
    jThermometer4.setSize((int)(short)100, 8);
    java.awt.Dimension dimension11 = jThermometer4.minimumSize();
    java.awt.Dimension dimension12 = jThermometer4.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener13 = null;
    jThermometer4.removeHierarchyBoundsListener(hierarchyBoundsListener13);
    org.jfree.chart.plot.JThermometer jThermometer15 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle16 = jThermometer15.getVisibleRect();
    java.awt.Rectangle rectangle17 = jThermometer4.getBounds(rectangle16);
    java.awt.Color color18 = java.awt.Color.black;
    float[] f_array24 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array25 = color18.getRGBComponents(f_array24);
    org.jfree.chart.LegendItem legendItem26 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle17, (java.awt.Paint)color18);
    java.awt.Font font27 = legendItem26.getLabelFont();
    legendItem26.setDatasetIndex((int)(byte)10);
    java.awt.Color color30 = java.awt.Color.YELLOW;
    legendItem26.setFillPaint((java.awt.Paint)color30);
    legendItem26.setShapeVisible(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(font27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color30);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test305"); }

    org.jfree.chart.needle.PlumNeedle plumNeedle0 = new org.jfree.chart.needle.PlumNeedle();
    java.awt.Paint paint1 = plumNeedle0.getOutlinePaint();
    java.awt.Paint paint2 = plumNeedle0.getHighlightPaint();
    double d3 = plumNeedle0.getRotateY();
    java.awt.Paint paint4 = plumNeedle0.getHighlightPaint();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(paint1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(paint2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(paint4);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test306"); }

    org.jfree.chart.axis.MonthDateFormat monthDateFormat0 = new org.jfree.chart.axis.MonthDateFormat();
    java.lang.Object obj1 = monthDateFormat0.clone();
    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline5 = new org.jfree.chart.axis.SegmentedTimeline((long)0, (int)(byte)-1, 3);
    java.util.Date date7 = segmentedTimeline5.getDate((long)'a');
    java.lang.String str8 = monthDateFormat0.format(date7);
    org.jfree.ui.TextAnchor textAnchor10 = org.jfree.chart.annotations.TextAnnotation.DEFAULT_TEXT_ANCHOR;
    org.jfree.ui.TextAnchor textAnchor11 = org.jfree.chart.annotations.TextAnnotation.DEFAULT_TEXT_ANCHOR;
    org.jfree.chart.axis.DateTick dateTick13 = new org.jfree.chart.axis.DateTick(date7, "RectangleConstraintType.RANGE", textAnchor10, textAnchor11, (double)100);
    java.lang.Object obj14 = dateTick13.clone();
    org.jfree.ui.TextAnchor textAnchor15 = dateTick13.getRotationAnchor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "D"+ "'", str8.equals("D"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor15);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test307"); }

    boolean b0 = org.jfree.chart.ChartPanel.DEFAULT_BUFFER_USED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b0 == true);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test308"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge11 = null;
    double d12 = categoryAxis6.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle10, rectangleEdge11);
    org.jfree.chart.plot.JThermometer jThermometer17 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event18 = null;
    boolean b20 = jThermometer17.keyDown(event18, 100);
    jThermometer17.setSize((int)(short)100, 8);
    java.awt.Dimension dimension24 = jThermometer17.minimumSize();
    java.awt.Dimension dimension25 = jThermometer17.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
    jThermometer17.removeHierarchyBoundsListener(hierarchyBoundsListener26);
    org.jfree.chart.plot.JThermometer jThermometer28 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle29 = jThermometer28.getVisibleRect();
    java.awt.Rectangle rectangle30 = jThermometer17.getBounds(rectangle29);
    java.awt.Color color31 = java.awt.Color.black;
    float[] f_array37 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array38 = color31.getRGBComponents(f_array37);
    org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle30, (java.awt.Paint)color31);
    org.jfree.chart.axis.CategoryAxis categoryAxis41 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer44 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle45 = jThermometer44.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge46 = null;
    double d47 = categoryAxis41.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle45, rectangleEdge46);
    categoryAxis41.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis41.setTickMarkStroke(stroke50);
    org.jfree.chart.JFreeChart jFreeChart52 = null;
    org.jfree.chart.ChartPanel chartPanel66 = new org.jfree.chart.ChartPanel(jFreeChart52, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel66.setReshowDelay((int)(short)1);
    java.awt.Color color69 = java.awt.Color.WHITE;
    chartPanel66.setZoomOutlinePaint((java.awt.Paint)color69);
    org.jfree.chart.LegendItem legendItem71 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle10, (java.awt.Paint)color31, stroke50, (java.awt.Paint)color69);
    xYShapeRenderer0.setShape((java.awt.Shape)rectangle10);
    xYShapeRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    java.awt.Font font77 = xYShapeRenderer0.getBaseItemLabelFont();
    java.awt.Stroke stroke79 = xYShapeRenderer0.getSeriesOutlineStroke(13);
    java.awt.Color color81 = java.awt.Color.black;
    xYShapeRenderer0.setLegendTextPaint(4, (java.awt.Paint)color81);
    java.lang.Boolean b84 = xYShapeRenderer0.getSeriesVisibleInLegend((int)(short)-1);
    org.jfree.chart.labels.XYToolTipGenerator xYToolTipGenerator85 = xYShapeRenderer0.getToolTipGenerator();
    org.jfree.chart.labels.XYItemLabelGenerator xYItemLabelGenerator87 = xYShapeRenderer0.getSeriesItemLabelGenerator(5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(stroke79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xYToolTipGenerator85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xYItemLabelGenerator87);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test309"); }

    int i0 = java.text.NumberFormat.INTEGER_FIELD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test310"); }

    double[] d_array4 = new double[] { 11, 680, 100.0f, 4.0d };
    int i5 = org.jfree.chart.HashUtilities.hashCodeForDoubleArray(d_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-331012207));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test311"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    jThermometer16.requestFocus();
    org.jfree.data.time.DateRange dateRange20 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range23 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange20, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType24 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange26 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange27 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange26, (org.jfree.data.Range)dateRange27);
    org.jfree.chart.axis.CompassFormat compassFormat29 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType30 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b31 = compassFormat29.equals((java.lang.Object)lengthConstraintType30);
    org.jfree.chart.axis.CompassFormat compassFormat32 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType33 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b34 = compassFormat32.equals((java.lang.Object)lengthConstraintType33);
    boolean b35 = lengthConstraintType30.equals((java.lang.Object)b34);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint36 = new org.jfree.chart.block.RectangleConstraint(0.0d, range23, lengthConstraintType24, (double)1L, (org.jfree.data.Range)dateRange26, lengthConstraintType30);
    chartPanel14.add((java.awt.Component)jThermometer16, (java.lang.Object)lengthConstraintType24);
    org.jfree.chart.plot.JThermometer jThermometer38 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event39 = null;
    boolean b41 = jThermometer38.keyDown(event39, 100);
    jThermometer38.setVisible(false);
    java.awt.Point point44 = jThermometer38.location();
    java.awt.Point point45 = chartPanel14.getLocation(point44);
    chartPanel14.setDoubleBuffered(true);
    javax.swing.event.AncestorListener ancestorListener48 = null;
    chartPanel14.addAncestorListener(ancestorListener48);
    java.awt.Graphics graphics50 = null;
    java.awt.print.PageFormat pageFormat51 = null;
    int i53 = chartPanel14.print(graphics50, pageFormat51, (int)'4');
    java.awt.Component component55 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Component component56 = chartPanel14.add("Item", component55);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test312"); }

    org.jfree.data.xy.XYDatasetTableModel xYDatasetTableModel0 = new org.jfree.data.xy.XYDatasetTableModel();
    java.lang.Object obj3 = xYDatasetTableModel0.getValueAt((int)(byte)100, 0);
    org.jfree.data.xy.TableXYDataset tableXYDataset4 = null;
    // The following exception was thrown during execution in test generation
    try {
    xYDatasetTableModel0.setModel(tableXYDataset4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test313"); }

    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline3 = new org.jfree.chart.axis.SegmentedTimeline((long)0, (int)(byte)-1, 3);
    boolean b4 = segmentedTimeline3.getAdjustForDaylightSaving();
    int i5 = segmentedTimeline3.getSegmentsIncluded();
    java.lang.Object obj6 = segmentedTimeline3.clone();
    // The following exception was thrown during execution in test generation
    try {
    segmentedTimeline3.addException((long)'4', (long)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test314"); }

    org.jfree.data.xy.YInterval yInterval3 = new org.jfree.data.xy.YInterval((double)'a', (double)0.5f, (double)(byte)10);
    double d4 = yInterval3.getY();
    double d5 = yInterval3.getY();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 97.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 97.0d);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test315"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b4 = jThermometer0.gotFocus(event1, (java.lang.Object)timeSeries3);
    org.jfree.chart.plot.JThermometer jThermometer5 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event6 = null;
    org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b9 = jThermometer5.gotFocus(event6, (java.lang.Object)timeSeries8);
    boolean b10 = timeSeries8.getNotify();
    org.jfree.data.time.TimeSeries timeSeries11 = timeSeries3.addAndOrUpdate(timeSeries8);
    java.util.List list12 = timeSeries3.getItems();
    org.jfree.chart.plot.JThermometer jThermometer13 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event14 = null;
    org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b17 = jThermometer13.gotFocus(event14, (java.lang.Object)timeSeries16);
    java.lang.Class class18 = timeSeries16.getTimePeriodClass();
    org.jfree.data.time.TimeSeries timeSeries19 = timeSeries3.addAndOrUpdate(timeSeries16);
    org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = timeSeries19.addOrUpdate(regularTimePeriod20, (double)(-192));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeSeries11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeSeries19);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test316"); }

    java.lang.Number number2 = null;
    double[][] d_array_array8 = new double[][] {  };
    double[][] d_array_array9 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset10 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array8, d_array_array9);
    org.jfree.data.general.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset10, (java.lang.Comparable)0.5d);
    org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
    defaultIntervalCategoryDataset10.removeChangeListener(datasetChangeListener13);
    java.util.List list15 = defaultIntervalCategoryDataset10.getCategories();
    org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem16 = new org.jfree.data.statistics.BoxAndWhiskerItem((java.lang.Number)6, (java.lang.Number)(-143), number2, (java.lang.Number)1.0f, (java.lang.Number)(byte)1, (java.lang.Number)(-1L), (java.lang.Number)7, (java.lang.Number)1.0d, list15);
    java.lang.Number number17 = boxAndWhiskerItem16.getMean();
    org.jfree.chart.axis.CategoryAxis categoryAxis19 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer22 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle23 = jThermometer22.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge24 = null;
    double d25 = categoryAxis19.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle23, rectangleEdge24);
    org.jfree.chart.plot.JThermometer jThermometer32 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event33 = null;
    boolean b35 = jThermometer32.keyDown(event33, 100);
    jThermometer32.setSize((int)(short)100, 8);
    java.awt.Dimension dimension39 = jThermometer32.minimumSize();
    java.awt.Dimension dimension40 = jThermometer32.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener41 = null;
    jThermometer32.removeHierarchyBoundsListener(hierarchyBoundsListener41);
    org.jfree.chart.plot.JThermometer jThermometer43 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle44 = jThermometer43.getVisibleRect();
    java.awt.Rectangle rectangle45 = jThermometer32.getBounds(rectangle44);
    java.awt.Color color46 = java.awt.Color.black;
    float[] f_array52 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array53 = color46.getRGBComponents(f_array52);
    org.jfree.chart.LegendItem legendItem54 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle45, (java.awt.Paint)color46);
    org.jfree.ui.RectangleEdge rectangleEdge55 = null;
    double d56 = categoryAxis19.getCategoryEnd(9, 13, (java.awt.geom.Rectangle2D)rectangle45, rectangleEdge55);
    boolean b57 = boxAndWhiskerItem16.equals((java.lang.Object)13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pieDataset12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + number17 + "' != '" + 6+ "'", number17.equals(6));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d56 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test317"); }

    org.jfree.chart.plot.PlotState plotState0 = new org.jfree.chart.plot.PlotState();

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test318"); }

    java.io.InputStream inputStream0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.general.PieDataset pieDataset1 = org.jfree.data.xml.DatasetReader.readPieDatasetFromXML(inputStream0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test319"); }

    org.jfree.data.time.ohlc.OHLC oHLC4 = new org.jfree.data.time.ohlc.OHLC((double)0, (double)(short)10, (double)(byte)10, (double)(-1));
    double d5 = oHLC4.getClose();
    double d6 = oHLC4.getLow();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 10.0d);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test320"); }

    org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues("ZOOM_RESET_RANGE", "ZOOM_RESET_DOMAIN", "");
    org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy(100, 100);
    double[][] d_array_array7 = new double[][] {  };
    double[][] d_array_array8 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset9 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array7, d_array_array8);
    org.jfree.data.general.SeriesDataset[] seriesDataset_array10 = new org.jfree.data.general.SeriesDataset[] { defaultIntervalCategoryDataset9 };
    org.jfree.data.general.CombinedDataset combinedDataset11 = new org.jfree.data.general.CombinedDataset(seriesDataset_array10);
    timePeriodValues3.addChangeListener((org.jfree.data.general.SeriesChangeListener)combinedDataset11);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number15 = combinedDataset11.getStartX(16, (-192));
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timePeriodValues6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(seriesDataset_array10);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test321"); }

    org.jfree.chart.JFreeChart jFreeChart1 = null;
    org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("series", jFreeChart1);
    chartFrame2.setResizable(false);
    chartFrame2.setBounds((int)'#', (int)' ', 9, 0);
    javax.swing.JMenuBar jMenuBar10 = null;
    chartFrame2.setJMenuBar(jMenuBar10);
    chartFrame2.dispose();
    chartFrame2.setFocusableWindowState(false);
    chartFrame2.setState((int)(short)1);
    java.awt.Color color17 = chartFrame2.getBackground();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color17);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test322"); }

    java.awt.Color color1 = java.awt.Color.BLACK;
    org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator5 = new org.jfree.chart.util.DefaultShadowGenerator((int)(byte)100, color1, (float)0, (int)'4', (double)1.0f);
    java.awt.Color color6 = defaultShadowGenerator5.getShadowColor();
    float f7 = defaultShadowGenerator5.getShadowOpacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 0.0f);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test323"); }

    org.jfree.data.xml.RootHandler rootHandler0 = new org.jfree.data.xml.RootHandler();
    rootHandler0.skippedEntity("jfreechart-");
    org.jfree.chart.axis.NumberAxis numberAxis3 = null;
    org.jfree.chart.plot.JThermometer jThermometer8 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle9 = jThermometer8.getVisibleRect();
    org.jfree.chart.plot.JThermometer jThermometer10 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle11 = jThermometer10.getVisibleRect();
    int i12 = jThermometer10.getShowAxisLocation();
    int i13 = jThermometer10.getWidth();
    java.awt.Component component14 = jThermometer8.add((java.awt.Component)jThermometer10);
    jThermometer8.addNotify();
    java.awt.event.ContainerListener containerListener16 = null;
    jThermometer8.addContainerListener(containerListener16);
    java.awt.Font font18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
    jThermometer8.setValueFont(font18);
    org.jfree.chart.axis.MarkerAxisBand markerAxisBand20 = new org.jfree.chart.axis.MarkerAxisBand(numberAxis3, Double.NaN, 0.0d, (double)100, (double)8, font18);
    org.jfree.data.xml.RootHandler rootHandler21 = new org.jfree.data.xml.RootHandler();
    rootHandler21.endElement("E", "E", "jfreechart-");
    boolean b26 = markerAxisBand20.equals((java.lang.Object)rootHandler21);
    org.jfree.data.xml.PieDatasetHandler pieDatasetHandler27 = new org.jfree.data.xml.PieDatasetHandler();
    org.jfree.data.xml.ItemHandler itemHandler28 = new org.jfree.data.xml.ItemHandler(rootHandler21, (org.xml.sax.helpers.DefaultHandler)pieDatasetHandler27);
    org.jfree.data.xml.ValueHandler valueHandler29 = new org.jfree.data.xml.ValueHandler(rootHandler0, itemHandler28);
    valueHandler29.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test324"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge11 = null;
    double d12 = categoryAxis6.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle10, rectangleEdge11);
    org.jfree.chart.plot.JThermometer jThermometer17 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event18 = null;
    boolean b20 = jThermometer17.keyDown(event18, 100);
    jThermometer17.setSize((int)(short)100, 8);
    java.awt.Dimension dimension24 = jThermometer17.minimumSize();
    java.awt.Dimension dimension25 = jThermometer17.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
    jThermometer17.removeHierarchyBoundsListener(hierarchyBoundsListener26);
    org.jfree.chart.plot.JThermometer jThermometer28 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle29 = jThermometer28.getVisibleRect();
    java.awt.Rectangle rectangle30 = jThermometer17.getBounds(rectangle29);
    java.awt.Color color31 = java.awt.Color.black;
    float[] f_array37 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array38 = color31.getRGBComponents(f_array37);
    org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle30, (java.awt.Paint)color31);
    org.jfree.chart.axis.CategoryAxis categoryAxis41 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer44 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle45 = jThermometer44.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge46 = null;
    double d47 = categoryAxis41.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle45, rectangleEdge46);
    categoryAxis41.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis41.setTickMarkStroke(stroke50);
    org.jfree.chart.JFreeChart jFreeChart52 = null;
    org.jfree.chart.ChartPanel chartPanel66 = new org.jfree.chart.ChartPanel(jFreeChart52, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel66.setReshowDelay((int)(short)1);
    java.awt.Color color69 = java.awt.Color.WHITE;
    chartPanel66.setZoomOutlinePaint((java.awt.Paint)color69);
    org.jfree.chart.LegendItem legendItem71 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle10, (java.awt.Paint)color31, stroke50, (java.awt.Paint)color69);
    xYShapeRenderer0.setShape((java.awt.Shape)rectangle10);
    xYShapeRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    java.awt.Font font77 = xYShapeRenderer0.getBaseItemLabelFont();
    java.awt.Stroke stroke79 = xYShapeRenderer0.getSeriesOutlineStroke(13);
    java.awt.Color color81 = java.awt.Color.black;
    xYShapeRenderer0.setLegendTextPaint(4, (java.awt.Paint)color81);
    double d83 = xYShapeRenderer0.getItemLabelAnchorOffset();
    // The following exception was thrown during execution in test generation
    try {
    xYShapeRenderer0.setSeriesVisible((int)(byte)-1, (java.lang.Boolean)true, true);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(stroke79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d83 == 2.0d);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test325"); }

    java.util.Locale locale1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.ResourceBundle resourceBundle2 = org.jfree.chart.util.ResourceBundleWrapper.getBundle("D", locale1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test326"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    boolean b15 = chartPanel14.isDomainZoomable();
    chartPanel14.setZoomOutFactor((double)768);
    java.awt.event.HierarchyListener hierarchyListener18 = null;
    chartPanel14.removeHierarchyListener(hierarchyListener18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test327"); }

    org.jfree.chart.renderer.xy.StandardXYBarPainter standardXYBarPainter0 = new org.jfree.chart.renderer.xy.StandardXYBarPainter();
    java.awt.Font font1 = org.jfree.chart.annotations.TextAnnotation.DEFAULT_FONT;
    boolean b2 = standardXYBarPainter0.equals((java.lang.Object)font1);
    java.awt.Graphics2D graphics2D3 = null;
    org.jfree.chart.renderer.xy.XYBarRenderer xYBarRenderer4 = null;
    org.jfree.chart.plot.JThermometer jThermometer7 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle8 = jThermometer7.getVisibleRect();
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    int i11 = jThermometer9.getShowAxisLocation();
    int i12 = jThermometer9.getWidth();
    java.awt.Component component13 = jThermometer7.add((java.awt.Component)jThermometer9);
    jThermometer7.addNotify();
    org.jfree.chart.plot.JThermometer jThermometer19 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event20 = null;
    boolean b22 = jThermometer19.keyDown(event20, 100);
    jThermometer19.setSize((int)(short)100, 8);
    java.awt.Dimension dimension26 = jThermometer19.minimumSize();
    java.awt.Dimension dimension27 = jThermometer19.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener28 = null;
    jThermometer19.removeHierarchyBoundsListener(hierarchyBoundsListener28);
    org.jfree.chart.plot.JThermometer jThermometer30 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle31 = jThermometer30.getVisibleRect();
    java.awt.Rectangle rectangle32 = jThermometer19.getBounds(rectangle31);
    java.awt.Color color33 = java.awt.Color.black;
    float[] f_array39 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array40 = color33.getRGBComponents(f_array39);
    org.jfree.chart.LegendItem legendItem41 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle32, (java.awt.Paint)color33);
    java.awt.Rectangle rectangle42 = jThermometer7.getBounds(rectangle32);
    org.jfree.ui.RectangleEdge rectangleEdge43 = null;
    // The following exception was thrown during execution in test generation
    try {
    standardXYBarPainter0.paintBarShadow(graphics2D3, xYBarRenderer4, 11, (-331012207), (java.awt.geom.RectangularShape)rectangle32, rectangleEdge43, false);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle42);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test328"); }

    double[][] d_array_array0 = new double[][] {  };
    double[][] d_array_array1 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array0, d_array_array1);
    org.jfree.data.general.PieDataset pieDataset4 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset2, (java.lang.Comparable)0.5d);
    java.util.List list5 = defaultIntervalCategoryDataset2.getSeries();
    org.jfree.data.general.SeriesChangeEvent seriesChangeEvent6 = null;
    defaultIntervalCategoryDataset2.seriesChanged(seriesChangeEvent6);
    org.jfree.chart.JFreeChart jFreeChart8 = null;
    org.jfree.chart.ChartPanel chartPanel22 = new org.jfree.chart.ChartPanel(jFreeChart8, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    boolean b23 = chartPanel22.isDomainZoomable();
    chartPanel22.setZoomOutFactor((double)768);
    boolean b26 = defaultIntervalCategoryDataset2.hasListener((java.util.EventListener)chartPanel22);
    java.awt.event.MouseEvent mouseEvent27 = null;
    chartPanel22.mouseDragged(mouseEvent27);
    java.awt.event.MouseEvent mouseEvent29 = null;
    chartPanel22.mouseExited(mouseEvent29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pieDataset4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test329"); }

    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition0 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.text.TextBlockAnchor textBlockAnchor1 = categoryLabelPosition0.getLabelAnchor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBlockAnchor1);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test330"); }

    java.awt.Color color1 = java.awt.Color.BLACK;
    org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator5 = new org.jfree.chart.util.DefaultShadowGenerator((int)(byte)100, color1, (float)0, (int)'4', (double)1.0f);
    org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor6 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE4;
    boolean b7 = defaultShadowGenerator5.equals((java.lang.Object)itemLabelAnchor6);
    int i8 = defaultShadowGenerator5.getDistance();
    float f9 = defaultShadowGenerator5.getShadowOpacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelAnchor6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f9 == 0.0f);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test331"); }

    java.util.TimeZone timeZone0 = org.jfree.chart.axis.SegmentedTimeline.NO_DST_TIME_ZONE;
    org.jfree.chart.axis.SegmentedTimeline.DEFAULT_TIME_ZONE = timeZone0;
    org.jfree.chart.plot.JThermometer jThermometer2 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event3 = null;
    boolean b5 = jThermometer2.keyDown(event3, 100);
    jThermometer2.setVisible(false);
    boolean b8 = jThermometer2.isFocusTraversable();
    java.util.Locale locale9 = javax.swing.JComponent.getDefaultLocale();
    jThermometer2.setLocale(locale9);
    org.jfree.chart.axis.MonthDateFormat monthDateFormat11 = new org.jfree.chart.axis.MonthDateFormat(locale9);
    org.jfree.chart.axis.MonthDateFormat monthDateFormat15 = new org.jfree.chart.axis.MonthDateFormat(timeZone0, locale9, (-1), true, false);
    java.util.TimeZone timeZone16 = org.jfree.chart.axis.SegmentedTimeline.NO_DST_TIME_ZONE;
    org.jfree.chart.axis.SegmentedTimeline.DEFAULT_TIME_ZONE = timeZone16;
    org.jfree.chart.plot.JThermometer jThermometer18 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event19 = null;
    boolean b21 = jThermometer18.keyDown(event19, 100);
    jThermometer18.setVisible(false);
    boolean b24 = jThermometer18.isFocusTraversable();
    java.util.Locale locale25 = javax.swing.JComponent.getDefaultLocale();
    jThermometer18.setLocale(locale25);
    org.jfree.chart.axis.MonthDateFormat monthDateFormat27 = new org.jfree.chart.axis.MonthDateFormat(locale25);
    org.jfree.chart.axis.MonthDateFormat monthDateFormat31 = new org.jfree.chart.axis.MonthDateFormat(timeZone16, locale25, (-1), true, false);
    boolean[] b_array33 = new boolean[] {  };
    org.jfree.chart.axis.MonthDateFormat monthDateFormat34 = new org.jfree.chart.axis.MonthDateFormat();
    java.lang.Object obj35 = monthDateFormat34.clone();
    org.jfree.chart.axis.MonthDateFormat monthDateFormat36 = new org.jfree.chart.axis.MonthDateFormat(timeZone0, locale25, 16, b_array33, (java.text.DateFormat)monthDateFormat34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeZone0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeZone16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj35);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test332"); }

    org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset defaultBoxAndWhiskerXYDataset1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset((java.lang.Comparable)(-1));
    int i3 = defaultBoxAndWhiskerXYDataset1.getItemCount((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    java.util.List list6 = defaultBoxAndWhiskerXYDataset1.getOutliers((int)'#', (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test333"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge11 = null;
    double d12 = categoryAxis6.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle10, rectangleEdge11);
    org.jfree.chart.plot.JThermometer jThermometer17 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event18 = null;
    boolean b20 = jThermometer17.keyDown(event18, 100);
    jThermometer17.setSize((int)(short)100, 8);
    java.awt.Dimension dimension24 = jThermometer17.minimumSize();
    java.awt.Dimension dimension25 = jThermometer17.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
    jThermometer17.removeHierarchyBoundsListener(hierarchyBoundsListener26);
    org.jfree.chart.plot.JThermometer jThermometer28 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle29 = jThermometer28.getVisibleRect();
    java.awt.Rectangle rectangle30 = jThermometer17.getBounds(rectangle29);
    java.awt.Color color31 = java.awt.Color.black;
    float[] f_array37 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array38 = color31.getRGBComponents(f_array37);
    org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle30, (java.awt.Paint)color31);
    org.jfree.chart.axis.CategoryAxis categoryAxis41 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer44 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle45 = jThermometer44.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge46 = null;
    double d47 = categoryAxis41.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle45, rectangleEdge46);
    categoryAxis41.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis41.setTickMarkStroke(stroke50);
    org.jfree.chart.JFreeChart jFreeChart52 = null;
    org.jfree.chart.ChartPanel chartPanel66 = new org.jfree.chart.ChartPanel(jFreeChart52, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel66.setReshowDelay((int)(short)1);
    java.awt.Color color69 = java.awt.Color.WHITE;
    chartPanel66.setZoomOutlinePaint((java.awt.Paint)color69);
    org.jfree.chart.LegendItem legendItem71 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle10, (java.awt.Paint)color31, stroke50, (java.awt.Paint)color69);
    xYShapeRenderer0.setShape((java.awt.Shape)rectangle10);
    xYShapeRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    org.jfree.chart.labels.ItemLabelPosition itemLabelPosition77 = xYShapeRenderer0.getBasePositiveItemLabelPosition();
    org.jfree.chart.plot.XYPlot xYPlot78 = null;
    xYShapeRenderer0.setPlot(xYPlot78);
    xYShapeRenderer0.setBaseItemLabelsVisible((java.lang.Boolean)true);
    java.awt.Font font82 = xYShapeRenderer0.getBaseLegendTextFont();
    xYShapeRenderer0.setAutoPopulateSeriesFillPaint(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelPosition77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(font82);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test334"); }

    org.jfree.chart.plot.RainbowPalette rainbowPalette0 = new org.jfree.chart.plot.RainbowPalette();
    rainbowPalette0.setLogscale(false);
    rainbowPalette0.setStepped(true);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test335"); }

    org.jfree.chart.JFreeChart jFreeChart1 = null;
    org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("series", jFreeChart1);
    chartFrame2.setResizable(false);
    chartFrame2.setBounds((int)'#', (int)' ', 9, 0);
    javax.swing.JMenuBar jMenuBar10 = null;
    chartFrame2.setJMenuBar(jMenuBar10);
    chartFrame2.setState(11);
    org.jfree.chart.JFreeChart jFreeChart15 = null;
    org.jfree.chart.ChartFrame chartFrame16 = new org.jfree.chart.ChartFrame("series", jFreeChart15);
    chartFrame16.setFocusCycleRoot(false);
    chartFrame2.remove((java.awt.Component)chartFrame16);
    javax.swing.JLayeredPane jLayeredPane20 = chartFrame16.getLayeredPane();
    chartFrame16.toFront();
    chartFrame16.toBack();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLayeredPane20);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test336"); }

    org.jfree.chart.JFreeChart jFreeChart1 = null;
    org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("series", jFreeChart1);
    chartFrame2.setResizable(false);
    chartFrame2.setBounds((int)'#', (int)' ', 9, 0);
    javax.swing.JMenuBar jMenuBar10 = null;
    chartFrame2.setJMenuBar(jMenuBar10);
    chartFrame2.setState(11);
    org.jfree.chart.JFreeChart jFreeChart15 = null;
    org.jfree.chart.ChartFrame chartFrame16 = new org.jfree.chart.ChartFrame("series", jFreeChart15);
    chartFrame16.setFocusCycleRoot(false);
    chartFrame2.remove((java.awt.Component)chartFrame16);
    org.jfree.chart.axis.CategoryAxis3D categoryAxis3D20 = new org.jfree.chart.axis.CategoryAxis3D();
    org.jfree.chart.plot.JThermometer jThermometer23 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle24 = jThermometer23.getVisibleRect();
    org.jfree.chart.plot.JThermometer jThermometer25 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle26 = jThermometer25.getVisibleRect();
    int i27 = jThermometer25.getShowAxisLocation();
    int i28 = jThermometer25.getWidth();
    java.awt.Component component29 = jThermometer23.add((java.awt.Component)jThermometer25);
    jThermometer23.addNotify();
    org.jfree.chart.plot.JThermometer jThermometer35 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event36 = null;
    boolean b38 = jThermometer35.keyDown(event36, 100);
    jThermometer35.setSize((int)(short)100, 8);
    java.awt.Dimension dimension42 = jThermometer35.minimumSize();
    java.awt.Dimension dimension43 = jThermometer35.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener44 = null;
    jThermometer35.removeHierarchyBoundsListener(hierarchyBoundsListener44);
    org.jfree.chart.plot.JThermometer jThermometer46 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle47 = jThermometer46.getVisibleRect();
    java.awt.Rectangle rectangle48 = jThermometer35.getBounds(rectangle47);
    java.awt.Color color49 = java.awt.Color.black;
    float[] f_array55 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array56 = color49.getRGBComponents(f_array55);
    org.jfree.chart.LegendItem legendItem57 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle48, (java.awt.Paint)color49);
    java.awt.Rectangle rectangle58 = jThermometer23.getBounds(rectangle48);
    org.jfree.ui.RectangleEdge rectangleEdge59 = null;
    double d60 = categoryAxis3D20.getCategoryMiddle(16, 52, (java.awt.geom.Rectangle2D)rectangle58, rectangleEdge59);
    // The following exception was thrown during execution in test generation
    try {
    chartFrame16.setShape((java.awt.Shape)rectangle58);
      org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d60 == 0.0d);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test337"); }

    org.jfree.data.function.PowerFunction2D powerFunction2D2 = new org.jfree.data.function.PowerFunction2D((double)(-1), (double)(-1.0f));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test338"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge11 = null;
    double d12 = categoryAxis6.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle10, rectangleEdge11);
    org.jfree.chart.plot.JThermometer jThermometer17 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event18 = null;
    boolean b20 = jThermometer17.keyDown(event18, 100);
    jThermometer17.setSize((int)(short)100, 8);
    java.awt.Dimension dimension24 = jThermometer17.minimumSize();
    java.awt.Dimension dimension25 = jThermometer17.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
    jThermometer17.removeHierarchyBoundsListener(hierarchyBoundsListener26);
    org.jfree.chart.plot.JThermometer jThermometer28 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle29 = jThermometer28.getVisibleRect();
    java.awt.Rectangle rectangle30 = jThermometer17.getBounds(rectangle29);
    java.awt.Color color31 = java.awt.Color.black;
    float[] f_array37 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array38 = color31.getRGBComponents(f_array37);
    org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle30, (java.awt.Paint)color31);
    org.jfree.chart.axis.CategoryAxis categoryAxis41 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer44 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle45 = jThermometer44.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge46 = null;
    double d47 = categoryAxis41.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle45, rectangleEdge46);
    categoryAxis41.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis41.setTickMarkStroke(stroke50);
    org.jfree.chart.JFreeChart jFreeChart52 = null;
    org.jfree.chart.ChartPanel chartPanel66 = new org.jfree.chart.ChartPanel(jFreeChart52, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel66.setReshowDelay((int)(short)1);
    java.awt.Color color69 = java.awt.Color.WHITE;
    chartPanel66.setZoomOutlinePaint((java.awt.Paint)color69);
    org.jfree.chart.LegendItem legendItem71 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle10, (java.awt.Paint)color31, stroke50, (java.awt.Paint)color69);
    xYShapeRenderer0.setShape((java.awt.Shape)rectangle10);
    xYShapeRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    java.awt.Font font77 = xYShapeRenderer0.getBaseItemLabelFont();
    xYShapeRenderer0.setSeriesVisibleInLegend((java.lang.Boolean)true, true);
    java.awt.Color color82 = org.jfree.chart.ChartColor.DARK_YELLOW;
    org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator86 = new org.jfree.chart.util.DefaultShadowGenerator((int)'#', color82, (float)(-143), (int)(byte)-1, 0.2d);
    xYShapeRenderer0.setBaseItemLabelPaint((java.awt.Paint)color82, true);
    java.awt.Color color89 = org.jfree.chart.ChartColor.VERY_LIGHT_MAGENTA;
    xYShapeRenderer0.setFillPaint((java.awt.Paint)color89, false);
    org.jfree.chart.renderer.PaintScale paintScale92 = null;
    // The following exception was thrown during execution in test generation
    try {
    xYShapeRenderer0.setPaintScale(paintScale92);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color89);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test339"); }

    java.lang.Class class3 = null;
    org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)13, "ZOOM_DOMAIN_BOTH", "", class3);
    java.util.TimeZone timeZone5 = org.jfree.chart.axis.SegmentedTimeline.NO_DST_TIME_ZONE;
    org.jfree.data.time.TimeSeriesCollection timeSeriesCollection6 = new org.jfree.data.time.TimeSeriesCollection(timeSeries4, timeZone5);
    double d8 = timeSeriesCollection6.getDomainUpperBound(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeZone5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertEquals((double)d8, Double.NaN, 0);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test340"); }

    org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues("ZOOM_RESET_RANGE", "ZOOM_RESET_DOMAIN", "");
    java.lang.Object obj4 = timePeriodValues3.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test341"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    jThermometer0.revalidate();
    jThermometer0.requestFocus();
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event5 = null;
    boolean b7 = jThermometer4.keyDown(event5, 100);
    jThermometer4.setSize((int)(short)100, 8);
    java.awt.Dimension dimension11 = jThermometer4.minimumSize();
    jThermometer0.setMaximumSize(dimension11);
    java.awt.Rectangle rectangle13 = jThermometer0.getBounds();
    java.awt.event.MouseEvent mouseEvent14 = null;
    java.awt.Point point15 = jThermometer0.getPopupLocation(mouseEvent14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point15);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test342"); }

    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline3 = new org.jfree.chart.axis.SegmentedTimeline((long)(-1), (int)(byte)100, 768);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test343"); }

    org.jfree.data.xy.XYDataItem xYDataItem2 = new org.jfree.data.xy.XYDataItem((java.lang.Number)0.05d, (java.lang.Number)97L);
    java.lang.String str3 = xYDataItem2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[0.05, 97.0]"+ "'", str3.equals("[0.05, 97.0]"));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test344"); }

    org.jfree.data.xy.Vector vector2 = new org.jfree.data.xy.Vector(Double.NaN, (double)11);
    double d3 = vector2.getX();
    double d4 = vector2.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertEquals((double)d3, Double.NaN, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertEquals((double)d4, Double.NaN, 0);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test345"); }

    org.jfree.chart.axis.CategoryAxis3D categoryAxis3D1 = new org.jfree.chart.axis.CategoryAxis3D("N");
    org.jfree.chart.axis.CategoryAnchor categoryAnchor2 = org.jfree.chart.axis.CategoryAnchor.START;
    org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge11 = null;
    double d12 = categoryAxis6.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle10, rectangleEdge11);
    org.jfree.chart.plot.JThermometer jThermometer19 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event20 = null;
    boolean b22 = jThermometer19.keyDown(event20, 100);
    jThermometer19.setSize((int)(short)100, 8);
    java.awt.Dimension dimension26 = jThermometer19.minimumSize();
    java.awt.Dimension dimension27 = jThermometer19.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener28 = null;
    jThermometer19.removeHierarchyBoundsListener(hierarchyBoundsListener28);
    org.jfree.chart.plot.JThermometer jThermometer30 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle31 = jThermometer30.getVisibleRect();
    java.awt.Rectangle rectangle32 = jThermometer19.getBounds(rectangle31);
    java.awt.Color color33 = java.awt.Color.black;
    float[] f_array39 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array40 = color33.getRGBComponents(f_array39);
    org.jfree.chart.LegendItem legendItem41 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle32, (java.awt.Paint)color33);
    org.jfree.ui.RectangleEdge rectangleEdge42 = null;
    double d43 = categoryAxis6.getCategoryEnd(9, 13, (java.awt.geom.Rectangle2D)rectangle32, rectangleEdge42);
    org.jfree.ui.RectangleEdge rectangleEdge44 = null;
    // The following exception was thrown during execution in test generation
    try {
    double d45 = categoryAxis3D1.getCategoryJava2DCoordinate(categoryAnchor2, (int)(byte)1, 16, (java.awt.geom.Rectangle2D)rectangle32, rectangleEdge44);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryAnchor2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d43 == 0.0d);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test346"); }

    org.jfree.data.resources.DataPackageResources_pl dataPackageResources_pl0 = new org.jfree.data.resources.DataPackageResources_pl();
    java.util.Locale locale1 = dataPackageResources_pl0.getLocale();
    java.util.Locale locale2 = dataPackageResources_pl0.getLocale();
    java.lang.Object obj4 = dataPackageResources_pl0.handleGetObject("Time");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(locale1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(locale2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test347"); }

    long long0 = org.jfree.chart.axis.SegmentedTimeline.FIRST_MONDAY_AFTER_1900;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long0 == (-2208960000000L));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test348"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b4 = jThermometer0.gotFocus(event1, (java.lang.Object)timeSeries3);
    boolean b5 = jThermometer0.requestDefaultFocus();
    java.awt.Point point7 = jThermometer0.getMousePosition(false);
    boolean b8 = jThermometer0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test349"); }

    org.jfree.data.DomainOrder domainOrder0 = org.jfree.data.DomainOrder.DESCENDING;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(domainOrder0);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test350"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    boolean b1 = xYShapeRenderer0.getBaseCreateEntities();
    // The following exception was thrown during execution in test generation
    try {
    xYShapeRenderer0.setSeriesItemLabelsVisible((int)(short)-1, false);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test351"); }

    org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double)' ');
    double d2 = valueMarker1.getValue();
    org.jfree.ui.RectangleInsets rectangleInsets3 = valueMarker1.getLabelOffset();
    valueMarker1.setValue((double)97L);
    org.jfree.chart.axis.SubCategoryAxis subCategoryAxis7 = new org.jfree.chart.axis.SubCategoryAxis("Time");
    org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer12 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle13 = jThermometer12.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge14 = null;
    double d15 = categoryAxis9.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle13, rectangleEdge14);
    categoryAxis9.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis9.setTickMarkStroke(stroke18);
    double d20 = categoryAxis9.getLowerMargin();
    org.jfree.ui.RectangleInsets rectangleInsets21 = categoryAxis9.getTickLabelInsets();
    subCategoryAxis7.setLabelInsets(rectangleInsets21);
    valueMarker1.setLabelOffset(rectangleInsets21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets21);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test352"); }

    org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE5;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelAnchor0);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test353"); }

    org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset defaultBoxAndWhiskerXYDataset1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset((java.lang.Comparable)(-1));
    boolean b2 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset)defaultBoxAndWhiskerXYDataset1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test354"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge11 = null;
    double d12 = categoryAxis6.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle10, rectangleEdge11);
    org.jfree.chart.plot.JThermometer jThermometer17 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event18 = null;
    boolean b20 = jThermometer17.keyDown(event18, 100);
    jThermometer17.setSize((int)(short)100, 8);
    java.awt.Dimension dimension24 = jThermometer17.minimumSize();
    java.awt.Dimension dimension25 = jThermometer17.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
    jThermometer17.removeHierarchyBoundsListener(hierarchyBoundsListener26);
    org.jfree.chart.plot.JThermometer jThermometer28 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle29 = jThermometer28.getVisibleRect();
    java.awt.Rectangle rectangle30 = jThermometer17.getBounds(rectangle29);
    java.awt.Color color31 = java.awt.Color.black;
    float[] f_array37 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array38 = color31.getRGBComponents(f_array37);
    org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle30, (java.awt.Paint)color31);
    org.jfree.chart.axis.CategoryAxis categoryAxis41 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer44 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle45 = jThermometer44.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge46 = null;
    double d47 = categoryAxis41.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle45, rectangleEdge46);
    categoryAxis41.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis41.setTickMarkStroke(stroke50);
    org.jfree.chart.JFreeChart jFreeChart52 = null;
    org.jfree.chart.ChartPanel chartPanel66 = new org.jfree.chart.ChartPanel(jFreeChart52, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel66.setReshowDelay((int)(short)1);
    java.awt.Color color69 = java.awt.Color.WHITE;
    chartPanel66.setZoomOutlinePaint((java.awt.Paint)color69);
    org.jfree.chart.LegendItem legendItem71 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle10, (java.awt.Paint)color31, stroke50, (java.awt.Paint)color69);
    xYShapeRenderer0.setShape((java.awt.Shape)rectangle10);
    xYShapeRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    org.jfree.chart.labels.ItemLabelPosition itemLabelPosition77 = xYShapeRenderer0.getBasePositiveItemLabelPosition();
    org.jfree.chart.plot.XYPlot xYPlot78 = null;
    xYShapeRenderer0.setPlot(xYPlot78);
    xYShapeRenderer0.clearSeriesPaints(true);
    java.awt.Color color84 = java.awt.Color.BLACK;
    java.awt.Stroke stroke85 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    org.jfree.chart.plot.CategoryMarker categoryMarker86 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)9, (java.awt.Paint)color84, stroke85);
    xYShapeRenderer0.setSeriesStroke(768, stroke85);
    org.jfree.chart.labels.XYItemLabelGenerator xYItemLabelGenerator88 = null;
    xYShapeRenderer0.setBaseItemLabelGenerator(xYItemLabelGenerator88);
    xYShapeRenderer0.setCreateEntities((java.lang.Boolean)true);
    java.awt.Paint paint94 = xYShapeRenderer0.getItemLabelPaint(6, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelPosition77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint94);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test355"); }

    org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double)' ');
    double d2 = valueMarker1.getValue();
    org.jfree.ui.RectangleInsets rectangleInsets3 = valueMarker1.getLabelOffset();
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event5 = null;
    org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b8 = jThermometer4.gotFocus(event5, (java.lang.Object)timeSeries7);
    java.awt.im.InputMethodRequests inputMethodRequests9 = jThermometer4.getInputMethodRequests();
    java.awt.Color color10 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
    jThermometer4.setForeground(color10);
    java.awt.color.ColorSpace colorSpace12 = color10.getColorSpace();
    valueMarker1.setLabelPaint((java.awt.Paint)color10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputMethodRequests9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorSpace12);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test356"); }

    org.jfree.chart.servlet.ServletUtilities.setTempOneTimeFilePrefix("E");

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test357"); }

    org.jfree.data.time.TimeSeriesCollection timeSeriesCollection0 = new org.jfree.data.time.TimeSeriesCollection();
    org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    java.beans.VetoableChangeListener vetoableChangeListener3 = null;
    timeSeries2.addVetoableChangeListener(vetoableChangeListener3);
    timeSeriesCollection0.removeSeries(timeSeries2);
    org.jfree.data.DomainOrder domainOrder6 = timeSeriesCollection0.getDomainOrder();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(domainOrder6);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test358"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    jThermometer0.revalidate();
    jThermometer0.requestFocus();
    java.awt.Component component4 = jThermometer0.getNextFocusableComponent();
    // The following exception was thrown during execution in test generation
    try {
    component4.setIgnoreRepaint(true);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component4);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test359"); }

    org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions2 = categoryAxis1.getCategoryLabelPositions();
    org.jfree.chart.axis.CategoryAxis categoryAxis13 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge18 = null;
    double d19 = categoryAxis13.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle17, rectangleEdge18);
    org.jfree.chart.plot.JThermometer jThermometer24 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event25 = null;
    boolean b27 = jThermometer24.keyDown(event25, 100);
    jThermometer24.setSize((int)(short)100, 8);
    java.awt.Dimension dimension31 = jThermometer24.minimumSize();
    java.awt.Dimension dimension32 = jThermometer24.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener33 = null;
    jThermometer24.removeHierarchyBoundsListener(hierarchyBoundsListener33);
    org.jfree.chart.plot.JThermometer jThermometer35 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle36 = jThermometer35.getVisibleRect();
    java.awt.Rectangle rectangle37 = jThermometer24.getBounds(rectangle36);
    java.awt.Color color38 = java.awt.Color.black;
    float[] f_array44 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array45 = color38.getRGBComponents(f_array44);
    org.jfree.chart.LegendItem legendItem46 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle37, (java.awt.Paint)color38);
    org.jfree.chart.axis.CategoryAxis categoryAxis48 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer51 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle52 = jThermometer51.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge53 = null;
    double d54 = categoryAxis48.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle52, rectangleEdge53);
    categoryAxis48.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke57 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis48.setTickMarkStroke(stroke57);
    org.jfree.chart.JFreeChart jFreeChart59 = null;
    org.jfree.chart.ChartPanel chartPanel73 = new org.jfree.chart.ChartPanel(jFreeChart59, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel73.setReshowDelay((int)(short)1);
    java.awt.Color color76 = java.awt.Color.WHITE;
    chartPanel73.setZoomOutlinePaint((java.awt.Paint)color76);
    org.jfree.chart.LegendItem legendItem78 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle17, (java.awt.Paint)color38, stroke57, (java.awt.Paint)color76);
    org.jfree.ui.RectangleEdge rectangleEdge79 = null;
    double d80 = categoryAxis1.getCategorySeriesMiddle(1, 52, 100, 768, (double)768, (java.awt.geom.Rectangle2D)rectangle17, rectangleEdge79);
    categoryAxis1.setTickMarkInsideLength((float)'#');
    categoryAxis1.setAxisLineVisible(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelPositions2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d54 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d80 == 0.0d);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test360"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    jThermometer0.requestFocus();
    org.jfree.chart.plot.JThermometer jThermometer7 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event8 = null;
    boolean b10 = jThermometer7.keyDown(event8, 100);
    jThermometer7.setSize((int)(short)100, 8);
    java.awt.Dimension dimension14 = jThermometer7.minimumSize();
    java.awt.Dimension dimension15 = jThermometer7.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener16 = null;
    jThermometer7.removeHierarchyBoundsListener(hierarchyBoundsListener16);
    org.jfree.chart.plot.JThermometer jThermometer18 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle19 = jThermometer18.getVisibleRect();
    java.awt.Rectangle rectangle20 = jThermometer7.getBounds(rectangle19);
    java.awt.Color color21 = java.awt.Color.black;
    float[] f_array27 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array28 = color21.getRGBComponents(f_array27);
    org.jfree.chart.LegendItem legendItem29 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle20, (java.awt.Paint)color21);
    java.lang.String str30 = legendItem29.getDescription();
    org.jfree.chart.axis.CategoryAxis categoryAxis32 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer35 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle36 = jThermometer35.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge37 = null;
    double d38 = categoryAxis32.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle36, rectangleEdge37);
    legendItem29.setShape((java.awt.Shape)rectangle36);
    jThermometer0.computeVisibleRect(rectangle36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "ZOOM_RESET_RANGE"+ "'", str30.equals("ZOOM_RESET_RANGE"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d38 == 0.0d);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test361"); }

    org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE3;
    org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions3 = categoryAxis2.getCategoryLabelPositions();
    org.jfree.chart.event.AxisChangeListener axisChangeListener4 = null;
    categoryAxis2.removeChangeListener(axisChangeListener4);
    org.jfree.data.xy.YIntervalDataItem yIntervalDataItem10 = new org.jfree.data.xy.YIntervalDataItem((double)9, (double)(byte)1, (double)4, (double)(byte)0);
    java.awt.Font font11 = categoryAxis2.getTickLabelFont((java.lang.Comparable)yIntervalDataItem10);
    boolean b12 = itemLabelAnchor0.equals((java.lang.Object)yIntervalDataItem10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelAnchor0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelPositions3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test362"); }

    org.jfree.chart.axis.CompassFormat compassFormat0 = new org.jfree.chart.axis.CompassFormat();
    int i1 = compassFormat0.getMinimumIntegerDigits();
    java.lang.String str3 = compassFormat0.format((long)100);
    compassFormat0.setParseIntegerOnly(false);
    java.lang.String str7 = compassFormat0.getDirectionCode((double)9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "E"+ "'", str3.equals("E"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "N"+ "'", str7.equals("N"));

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test363"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    jThermometer16.requestFocus();
    org.jfree.data.time.DateRange dateRange20 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range23 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange20, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType24 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange26 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange27 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange26, (org.jfree.data.Range)dateRange27);
    org.jfree.chart.axis.CompassFormat compassFormat29 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType30 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b31 = compassFormat29.equals((java.lang.Object)lengthConstraintType30);
    org.jfree.chart.axis.CompassFormat compassFormat32 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType33 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b34 = compassFormat32.equals((java.lang.Object)lengthConstraintType33);
    boolean b35 = lengthConstraintType30.equals((java.lang.Object)b34);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint36 = new org.jfree.chart.block.RectangleConstraint(0.0d, range23, lengthConstraintType24, (double)1L, (org.jfree.data.Range)dateRange26, lengthConstraintType30);
    chartPanel14.add((java.awt.Component)jThermometer16, (java.lang.Object)lengthConstraintType24);
    javax.swing.InputVerifier inputVerifier38 = chartPanel14.getInputVerifier();
    java.awt.Event event39 = null;
    org.jfree.chart.plot.JThermometer jThermometer40 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event41 = null;
    org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b44 = jThermometer40.gotFocus(event41, (java.lang.Object)timeSeries43);
    boolean b45 = jThermometer40.requestDefaultFocus();
    java.awt.Point point47 = jThermometer40.getMousePosition(false);
    boolean b48 = chartPanel14.lostFocus(event39, (java.lang.Object)jThermometer40);
    org.jfree.chart.plot.JThermometer jThermometer49 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event50 = null;
    boolean b52 = jThermometer49.keyDown(event50, 100);
    jThermometer49.setVisible(false);
    boolean b55 = jThermometer49.isFocusTraversable();
    java.util.Locale locale56 = javax.swing.JComponent.getDefaultLocale();
    jThermometer49.setLocale(locale56);
    org.jfree.chart.axis.MonthDateFormat monthDateFormat58 = new org.jfree.chart.axis.MonthDateFormat(locale56);
    jThermometer40.setLocale(locale56);
    boolean b60 = jThermometer40.isVisible();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test364"); }

    org.jfree.chart.plot.CrosshairState crosshairState0 = new org.jfree.chart.plot.CrosshairState();
    crosshairState0.setAnchorX(0.0d);
    crosshairState0.setCrosshairY((double)768);
    crosshairState0.setCrosshairY(52.0d);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test365"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    java.awt.Color color2 = java.awt.Color.GRAY;
    int i3 = color2.getAlpha();
    xYShapeRenderer0.setLegendTextPaint(100, (java.awt.Paint)color2);
    boolean b5 = xYShapeRenderer0.getAutoPopulateSeriesPaint();
    java.awt.Stroke stroke7 = xYShapeRenderer0.getSeriesStroke(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(stroke7);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test366"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge11 = null;
    double d12 = categoryAxis6.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle10, rectangleEdge11);
    org.jfree.chart.plot.JThermometer jThermometer17 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event18 = null;
    boolean b20 = jThermometer17.keyDown(event18, 100);
    jThermometer17.setSize((int)(short)100, 8);
    java.awt.Dimension dimension24 = jThermometer17.minimumSize();
    java.awt.Dimension dimension25 = jThermometer17.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
    jThermometer17.removeHierarchyBoundsListener(hierarchyBoundsListener26);
    org.jfree.chart.plot.JThermometer jThermometer28 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle29 = jThermometer28.getVisibleRect();
    java.awt.Rectangle rectangle30 = jThermometer17.getBounds(rectangle29);
    java.awt.Color color31 = java.awt.Color.black;
    float[] f_array37 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array38 = color31.getRGBComponents(f_array37);
    org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle30, (java.awt.Paint)color31);
    org.jfree.chart.axis.CategoryAxis categoryAxis41 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer44 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle45 = jThermometer44.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge46 = null;
    double d47 = categoryAxis41.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle45, rectangleEdge46);
    categoryAxis41.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis41.setTickMarkStroke(stroke50);
    org.jfree.chart.JFreeChart jFreeChart52 = null;
    org.jfree.chart.ChartPanel chartPanel66 = new org.jfree.chart.ChartPanel(jFreeChart52, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel66.setReshowDelay((int)(short)1);
    java.awt.Color color69 = java.awt.Color.WHITE;
    chartPanel66.setZoomOutlinePaint((java.awt.Paint)color69);
    org.jfree.chart.LegendItem legendItem71 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle10, (java.awt.Paint)color31, stroke50, (java.awt.Paint)color69);
    xYShapeRenderer0.setShape((java.awt.Shape)rectangle10);
    xYShapeRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    org.jfree.chart.labels.ItemLabelPosition itemLabelPosition77 = xYShapeRenderer0.getBasePositiveItemLabelPosition();
    xYShapeRenderer0.setBaseCreateEntities(false, false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelPosition77);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test367"); }

    org.jfree.chart.util.LogFormat logFormat3 = new org.jfree.chart.util.LogFormat((double)1L, "series", true);
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle5 = jThermometer4.getVisibleRect();
    int i6 = jThermometer4.getShowAxisLocation();
    int i7 = jThermometer4.getWidth();
    boolean b8 = logFormat3.equals((java.lang.Object)jThermometer4);
    logFormat3.setMaximumFractionDigits(8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test368"); }

    java.lang.Number number10 = null;
    double[][] d_array_array16 = new double[][] {  };
    double[][] d_array_array17 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset18 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array16, d_array_array17);
    org.jfree.data.general.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset18, (java.lang.Comparable)0.5d);
    org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
    defaultIntervalCategoryDataset18.removeChangeListener(datasetChangeListener21);
    java.util.List list23 = defaultIntervalCategoryDataset18.getCategories();
    org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem24 = new org.jfree.data.statistics.BoxAndWhiskerItem((java.lang.Number)6, (java.lang.Number)(-143), number10, (java.lang.Number)1.0f, (java.lang.Number)(byte)1, (java.lang.Number)(-1L), (java.lang.Number)7, (java.lang.Number)1.0d, list23);
    org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem25 = new org.jfree.data.statistics.BoxAndWhiskerItem(97.0d, (double)(byte)1, (double)(short)-1, (double)(short)-1, (double)(-143), (double)128, (double)0, (double)(-4), list23);
    org.jfree.chart.plot.JThermometer jThermometer26 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event27 = null;
    boolean b29 = jThermometer26.keyDown(event27, 100);
    jThermometer26.setSize((int)(short)100, 8);
    java.lang.Object obj33 = jThermometer26.getTreeLock();
    org.jfree.chart.plot.JThermometer jThermometer34 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event35 = null;
    boolean b37 = jThermometer34.keyDown(event35, 100);
    jThermometer34.setSize((int)(short)100, 8);
    org.jfree.chart.plot.JThermometer jThermometer41 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event42 = null;
    boolean b44 = jThermometer41.keyDown(event42, 100);
    jThermometer41.setSize((int)(short)100, 8);
    java.awt.Dimension dimension48 = jThermometer41.minimumSize();
    java.awt.Dimension dimension49 = jThermometer41.preferredSize();
    java.awt.Dimension dimension50 = jThermometer34.getSize(dimension49);
    boolean b51 = jThermometer26.isAncestorOf((java.awt.Component)jThermometer34);
    org.jfree.data.resources.DataPackageResources_pl dataPackageResources_pl52 = new org.jfree.data.resources.DataPackageResources_pl();
    java.lang.Object[][] obj_array_array53 = dataPackageResources_pl52.getContents();
    org.jfree.chart.util.ParamChecks paramChecks54 = new org.jfree.chart.util.ParamChecks();
    jThermometer34.putClientProperty((java.lang.Object)dataPackageResources_pl52, (java.lang.Object)paramChecks54);
    java.lang.Object[][] obj_array_array56 = dataPackageResources_pl52.getContents();
    boolean b57 = boxAndWhiskerItem25.equals((java.lang.Object)obj_array_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pieDataset20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test369"); }

    org.jfree.chart.axis.ColorBar colorBar1 = new org.jfree.chart.axis.ColorBar("E");
    colorBar1.setMinimumValue(0.05d);
    org.jfree.chart.plot.RainbowPalette rainbowPalette4 = new org.jfree.chart.plot.RainbowPalette();
    rainbowPalette4.setLogscale(false);
    java.awt.Color color8 = rainbowPalette4.getColor((int)'#');
    boolean b9 = rainbowPalette4.isStepped();
    java.awt.Color color11 = rainbowPalette4.getColorLog((double)(byte)0);
    colorBar1.setColorPalette((org.jfree.chart.plot.ColorPalette)rainbowPalette4);
    colorBar1.setMaximumValue((double)7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color11);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test370"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge11 = null;
    double d12 = categoryAxis6.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle10, rectangleEdge11);
    org.jfree.chart.plot.JThermometer jThermometer17 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event18 = null;
    boolean b20 = jThermometer17.keyDown(event18, 100);
    jThermometer17.setSize((int)(short)100, 8);
    java.awt.Dimension dimension24 = jThermometer17.minimumSize();
    java.awt.Dimension dimension25 = jThermometer17.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
    jThermometer17.removeHierarchyBoundsListener(hierarchyBoundsListener26);
    org.jfree.chart.plot.JThermometer jThermometer28 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle29 = jThermometer28.getVisibleRect();
    java.awt.Rectangle rectangle30 = jThermometer17.getBounds(rectangle29);
    java.awt.Color color31 = java.awt.Color.black;
    float[] f_array37 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array38 = color31.getRGBComponents(f_array37);
    org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle30, (java.awt.Paint)color31);
    org.jfree.chart.axis.CategoryAxis categoryAxis41 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer44 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle45 = jThermometer44.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge46 = null;
    double d47 = categoryAxis41.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle45, rectangleEdge46);
    categoryAxis41.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis41.setTickMarkStroke(stroke50);
    org.jfree.chart.JFreeChart jFreeChart52 = null;
    org.jfree.chart.ChartPanel chartPanel66 = new org.jfree.chart.ChartPanel(jFreeChart52, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel66.setReshowDelay((int)(short)1);
    java.awt.Color color69 = java.awt.Color.WHITE;
    chartPanel66.setZoomOutlinePaint((java.awt.Paint)color69);
    org.jfree.chart.LegendItem legendItem71 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle10, (java.awt.Paint)color31, stroke50, (java.awt.Paint)color69);
    xYShapeRenderer0.setShape((java.awt.Shape)rectangle10);
    xYShapeRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    boolean b77 = xYShapeRenderer0.getUseFillPaint();
    org.jfree.chart.event.RendererChangeEvent rendererChangeEvent78 = null;
    xYShapeRenderer0.notifyListeners(rendererChangeEvent78);
    int i80 = xYShapeRenderer0.getPassCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 2);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test371"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    boolean b15 = chartPanel14.isDomainZoomable();
    chartPanel14.setZoomOutFactor((double)768);
    chartPanel14.setVerticalAxisTrace(true);
    chartPanel14.grabFocus();
    int i21 = chartPanel14.getHeight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test372"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    boolean b15 = chartPanel14.isDomainZoomable();
    chartPanel14.setAutoscrolls(true);
    chartPanel14.setDisplayToolTips(false);
    java.lang.Object obj20 = chartPanel14.getTreeLock();
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo21 = chartPanel14.getChartRenderingInfo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo21);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test373"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b4 = jThermometer0.gotFocus(event1, (java.lang.Object)timeSeries3);
    org.jfree.chart.plot.JThermometer jThermometer5 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event6 = null;
    org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b9 = jThermometer5.gotFocus(event6, (java.lang.Object)timeSeries8);
    boolean b10 = timeSeries8.getNotify();
    org.jfree.data.time.TimeSeries timeSeries11 = timeSeries3.addAndOrUpdate(timeSeries8);
    org.jfree.data.time.TimeSeriesTableModel timeSeriesTableModel12 = new org.jfree.data.time.TimeSeriesTableModel(timeSeries11);
    java.text.NumberFormat numberFormat13 = java.text.NumberFormat.getPercentInstance();
    timeSeriesTableModel12.setValueAt((java.lang.Object)numberFormat13, (int)(byte)-1, 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeSeries11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(numberFormat13);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test374"); }

    org.jfree.chart.title.Title title0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.event.TitleChangeEvent titleChangeEvent1 = new org.jfree.chart.event.TitleChangeEvent(title0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test375"); }

    org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues("ZOOM_RESET_RANGE", "ZOOM_RESET_DOMAIN", "");
    org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy(100, 100);
    double[][] d_array_array7 = new double[][] {  };
    double[][] d_array_array8 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset9 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array7, d_array_array8);
    org.jfree.data.general.SeriesDataset[] seriesDataset_array10 = new org.jfree.data.general.SeriesDataset[] { defaultIntervalCategoryDataset9 };
    org.jfree.data.general.CombinedDataset combinedDataset11 = new org.jfree.data.general.CombinedDataset(seriesDataset_array10);
    timePeriodValues3.addChangeListener((org.jfree.data.general.SeriesChangeListener)combinedDataset11);
    int i13 = timePeriodValues3.getMaxMiddleIndex();
    org.jfree.data.time.TimePeriodValuesCollection timePeriodValuesCollection14 = new org.jfree.data.time.TimePeriodValuesCollection(timePeriodValues3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number17 = timePeriodValuesCollection14.getStartX(9, 16);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timePeriodValues6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(seriesDataset_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test376"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    boolean b3 = jThermometer0.keyDown(event1, 100);
    jThermometer0.setSize((int)(short)100, 8);
    java.awt.Dimension dimension7 = jThermometer0.minimumSize();
    java.awt.Dimension dimension8 = jThermometer0.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
    jThermometer0.removeHierarchyBoundsListener(hierarchyBoundsListener9);
    java.awt.Component[] component_array11 = jThermometer0.getComponents();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component_array11);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test377"); }

    double[] d_array4 = new double[] { 2, ' ', 10.0d, '4' };
    int i5 = org.jfree.chart.HashUtilities.hashCodeForDoubleArray(d_array4);
    double[] d_array10 = new double[] { 2, ' ', 10.0d, '4' };
    int i11 = org.jfree.chart.HashUtilities.hashCodeForDoubleArray(d_array10);
    org.jfree.chart.ClipPath clipPath15 = new org.jfree.chart.ClipPath(d_array4, d_array10, true, false, true);
    double[] d_array20 = new double[] { 2, ' ', 10.0d, '4' };
    int i21 = org.jfree.chart.HashUtilities.hashCodeForDoubleArray(d_array20);
    double[] d_array26 = new double[] { 2, ' ', 10.0d, '4' };
    int i27 = org.jfree.chart.HashUtilities.hashCodeForDoubleArray(d_array26);
    org.jfree.chart.ClipPath clipPath31 = new org.jfree.chart.ClipPath(d_array20, d_array26, true, false, true);
    double[] d_array36 = new double[] { 2, ' ', 10.0d, '4' };
    int i37 = org.jfree.chart.HashUtilities.hashCodeForDoubleArray(d_array36);
    double[] d_array42 = new double[] { 2, ' ', 10.0d, '4' };
    int i43 = org.jfree.chart.HashUtilities.hashCodeForDoubleArray(d_array42);
    org.jfree.chart.ClipPath clipPath47 = new org.jfree.chart.ClipPath(d_array36, d_array42, true, false, true);
    org.jfree.chart.ClipPath clipPath51 = new org.jfree.chart.ClipPath(d_array26, d_array42, true, false, true);
    clipPath15.setYValue(d_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-557783151));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-557783151));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-557783151));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-557783151));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-557783151));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == (-557783151));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test378"); }

    java.text.AttributedString attributedString0 = null;
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle5 = jThermometer4.getVisibleRect();
    java.awt.Stroke stroke6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer7 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis13 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge18 = null;
    double d19 = categoryAxis13.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle17, rectangleEdge18);
    org.jfree.chart.plot.JThermometer jThermometer24 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event25 = null;
    boolean b27 = jThermometer24.keyDown(event25, 100);
    jThermometer24.setSize((int)(short)100, 8);
    java.awt.Dimension dimension31 = jThermometer24.minimumSize();
    java.awt.Dimension dimension32 = jThermometer24.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener33 = null;
    jThermometer24.removeHierarchyBoundsListener(hierarchyBoundsListener33);
    org.jfree.chart.plot.JThermometer jThermometer35 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle36 = jThermometer35.getVisibleRect();
    java.awt.Rectangle rectangle37 = jThermometer24.getBounds(rectangle36);
    java.awt.Color color38 = java.awt.Color.black;
    float[] f_array44 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array45 = color38.getRGBComponents(f_array44);
    org.jfree.chart.LegendItem legendItem46 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle37, (java.awt.Paint)color38);
    org.jfree.chart.axis.CategoryAxis categoryAxis48 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer51 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle52 = jThermometer51.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge53 = null;
    double d54 = categoryAxis48.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle52, rectangleEdge53);
    categoryAxis48.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke57 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis48.setTickMarkStroke(stroke57);
    org.jfree.chart.JFreeChart jFreeChart59 = null;
    org.jfree.chart.ChartPanel chartPanel73 = new org.jfree.chart.ChartPanel(jFreeChart59, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel73.setReshowDelay((int)(short)1);
    java.awt.Color color76 = java.awt.Color.WHITE;
    chartPanel73.setZoomOutlinePaint((java.awt.Paint)color76);
    org.jfree.chart.LegendItem legendItem78 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle17, (java.awt.Paint)color38, stroke57, (java.awt.Paint)color76);
    xYShapeRenderer7.setShape((java.awt.Shape)rectangle17);
    xYShapeRenderer7.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    java.awt.Font font84 = xYShapeRenderer7.getBaseItemLabelFont();
    java.awt.Stroke stroke86 = xYShapeRenderer7.getSeriesOutlineStroke(13);
    java.awt.Color color88 = java.awt.Color.black;
    xYShapeRenderer7.setLegendTextPaint(4, (java.awt.Paint)color88);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.LegendItem legendItem90 = new org.jfree.chart.LegendItem(attributedString0, "ZOOM_DOMAIN_BOTH", "ZOOM_IN_BOTH", "jfreechart-", (java.awt.Shape)rectangle5, stroke6, (java.awt.Paint)color88);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d54 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(stroke86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color88);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test379"); }

    int i0 = org.jfree.chart.axis.DateTickUnit.MINUTE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 4);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test380"); }

    java.awt.Color color0 = org.jfree.chart.ChartColor.VERY_LIGHT_RED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color0);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test381"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    int i2 = jThermometer0.getShowAxisLocation();
    javax.swing.KeyStroke keyStroke3 = null;
    java.awt.event.ActionListener actionListener4 = jThermometer0.getActionForKeyStroke(keyStroke3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(actionListener4);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test382"); }

    org.jfree.chart.axis.TickType tickType0 = org.jfree.chart.axis.TickType.MAJOR;
    java.lang.String str1 = tickType0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tickType0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "MAJOR"+ "'", str1.equals("MAJOR"));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test383"); }

    org.jfree.chart.axis.AxisState axisState1 = new org.jfree.chart.axis.AxisState((double)(byte)10);
    double d2 = axisState1.getCursor();
    java.lang.Number number5 = null;
    double[][] d_array_array11 = new double[][] {  };
    double[][] d_array_array12 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array11, d_array_array12);
    org.jfree.data.general.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset13, (java.lang.Comparable)0.5d);
    org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
    defaultIntervalCategoryDataset13.removeChangeListener(datasetChangeListener16);
    java.util.List list18 = defaultIntervalCategoryDataset13.getCategories();
    org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem19 = new org.jfree.data.statistics.BoxAndWhiskerItem((java.lang.Number)6, (java.lang.Number)(-143), number5, (java.lang.Number)1.0f, (java.lang.Number)(byte)1, (java.lang.Number)(-1L), (java.lang.Number)7, (java.lang.Number)1.0d, list18);
    axisState1.setTicks(list18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pieDataset15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test384"); }

    org.jfree.chart.needle.MiddlePinNeedle middlePinNeedle0 = new org.jfree.chart.needle.MiddlePinNeedle();

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test385"); }

    java.awt.Color color1 = java.awt.Color.BLACK;
    java.awt.Stroke stroke2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    org.jfree.chart.plot.CategoryMarker categoryMarker3 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)9, (java.awt.Paint)color1, stroke2);
    java.lang.Comparable comparable4 = categoryMarker3.getKey();
    org.jfree.ui.LengthAdjustmentType lengthAdjustmentType5 = null;
    // The following exception was thrown during execution in test generation
    try {
    categoryMarker3.setLabelOffsetType(lengthAdjustmentType5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + comparable4 + "' != '" + 9+ "'", comparable4.equals(9));

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test386"); }

    org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)100.0f);
    org.jfree.chart.plot.JThermometer jThermometer2 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event3 = null;
    org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b6 = jThermometer2.gotFocus(event3, (java.lang.Object)timeSeries5);
    java.lang.Class class7 = timeSeries5.getTimePeriodClass();
    java.util.List list8 = timeSeries5.getItems();
    org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
    int i10 = timeSeries9.getItemCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeSeries9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test387"); }

    org.jfree.chart.needle.ShipNeedle shipNeedle0 = new org.jfree.chart.needle.ShipNeedle();

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test388"); }

    org.jfree.data.xy.VectorSeries vectorSeries1 = new org.jfree.data.xy.VectorSeries((java.lang.Comparable)0.2d);
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    vectorSeries1.addPropertyChangeListener(propertyChangeListener2);
    // The following exception was thrown during execution in test generation
    try {
    double d5 = vectorSeries1.getXValue(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test389"); }

    org.jfree.chart.JFreeChart jFreeChart1 = null;
    org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("series", jFreeChart1);
    java.awt.Graphics graphics3 = null;
    chartFrame2.paint(graphics3);
    // The following exception was thrown during execution in test generation
    try {
    chartFrame2.createBufferStrategy(6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test390"); }

    org.jfree.chart.JFreeChart jFreeChart1 = null;
    org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("series", jFreeChart1);
    chartFrame2.setResizable(false);
    chartFrame2.setBounds((int)'#', (int)' ', 9, 0);
    javax.swing.JMenuBar jMenuBar10 = null;
    chartFrame2.setJMenuBar(jMenuBar10);
    chartFrame2.dispose();
    java.util.List<java.awt.Image> list_image13 = chartFrame2.getIconImages();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_image13);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test391"); }

    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event5 = null;
    boolean b7 = jThermometer4.keyDown(event5, 100);
    jThermometer4.setSize((int)(short)100, 8);
    java.awt.Dimension dimension11 = jThermometer4.minimumSize();
    java.awt.Dimension dimension12 = jThermometer4.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener13 = null;
    jThermometer4.removeHierarchyBoundsListener(hierarchyBoundsListener13);
    org.jfree.chart.plot.JThermometer jThermometer15 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle16 = jThermometer15.getVisibleRect();
    java.awt.Rectangle rectangle17 = jThermometer4.getBounds(rectangle16);
    java.awt.Color color18 = java.awt.Color.black;
    float[] f_array24 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array25 = color18.getRGBComponents(f_array24);
    org.jfree.chart.LegendItem legendItem26 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle17, (java.awt.Paint)color18);
    java.lang.String str27 = legendItem26.getDescription();
    java.awt.Stroke stroke28 = legendItem26.getOutlineStroke();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "ZOOM_RESET_RANGE"+ "'", str27.equals("ZOOM_RESET_RANGE"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke28);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test392"); }

    org.jfree.chart.needle.LineNeedle lineNeedle0 = new org.jfree.chart.needle.LineNeedle();
    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline1 = org.jfree.chart.axis.SegmentedTimeline.newFifteenMinuteTimeline();
    org.jfree.chart.axis.SegmentedTimeline.Segment segment3 = segmentedTimeline1.getSegment((long)3);
    boolean b5 = segment3.contains((long)(-4));
    boolean b6 = segment3.inExceptionSegments();
    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline7 = org.jfree.chart.axis.SegmentedTimeline.newFifteenMinuteTimeline();
    org.jfree.chart.axis.SegmentedTimeline.Segment segment9 = segmentedTimeline7.getSegment((long)3);
    boolean b11 = segment9.contains((long)(-4));
    boolean b12 = segment9.inExceptionSegments();
    boolean b13 = segment3.contains(segment9);
    long long15 = segment3.calculateSegmentNumber(0L);
    boolean b16 = lineNeedle0.equals((java.lang.Object)segment3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(segmentedTimeline1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(segment3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(segmentedTimeline7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(segment9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 2454364L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test393"); }

    org.jfree.chart.LegendRenderingOrder legendRenderingOrder0 = org.jfree.chart.LegendRenderingOrder.STANDARD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(legendRenderingOrder0);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test394"); }

    org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset defaultBoxAndWhiskerXYDataset1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset((java.lang.Comparable)(-1));
    // The following exception was thrown during execution in test generation
    try {
    defaultBoxAndWhiskerXYDataset1.setFaroutCoefficient(0.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test395"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    boolean b15 = chartPanel14.isDomainZoomable();
    java.awt.geom.Point2D point2D16 = chartPanel14.getAnchor();
    java.awt.Event event17 = null;
    org.jfree.chart.JFreeChart jFreeChart18 = null;
    org.jfree.chart.ChartPanel chartPanel32 = new org.jfree.chart.ChartPanel(jFreeChart18, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo33 = chartPanel32.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer34 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle35 = jThermometer34.getVisibleRect();
    jThermometer34.requestFocus();
    org.jfree.data.time.DateRange dateRange38 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range41 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange38, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType42 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange44 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange45 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint46 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange44, (org.jfree.data.Range)dateRange45);
    org.jfree.chart.axis.CompassFormat compassFormat47 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType48 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b49 = compassFormat47.equals((java.lang.Object)lengthConstraintType48);
    org.jfree.chart.axis.CompassFormat compassFormat50 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType51 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b52 = compassFormat50.equals((java.lang.Object)lengthConstraintType51);
    boolean b53 = lengthConstraintType48.equals((java.lang.Object)b52);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint54 = new org.jfree.chart.block.RectangleConstraint(0.0d, range41, lengthConstraintType42, (double)1L, (org.jfree.data.Range)dateRange44, lengthConstraintType48);
    chartPanel32.add((java.awt.Component)jThermometer34, (java.lang.Object)lengthConstraintType42);
    javax.swing.InputVerifier inputVerifier56 = chartPanel32.getInputVerifier();
    boolean b57 = chartPanel32.getRefreshBuffer();
    boolean b58 = chartPanel14.lostFocus(event17, (java.lang.Object)b57);
    java.io.File file59 = chartPanel14.getDefaultDirectoryForSaveAs();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point2D16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(file59);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test396"); }

    org.jfree.text.TextBox textBox3 = null;
    org.jfree.chart.plot.PieLabelRecord pieLabelRecord7 = new org.jfree.chart.plot.PieLabelRecord((java.lang.Comparable)(-1L), (double)10, (double)10.0f, textBox3, (double)(byte)10, (double)0L, (double)0.5f);
    pieLabelRecord7.setBaseY((double)(byte)1);
    double d10 = pieLabelRecord7.getAllocatedY();
    java.lang.String str11 = pieLabelRecord7.toString();
    double d12 = pieLabelRecord7.getAllocatedY();
    double d13 = pieLabelRecord7.getAllocatedY();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "1.0, -1"+ "'", str11.equals("1.0, -1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 10.0d);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test397"); }

    org.jfree.data.time.ohlc.OHLCSeriesCollection oHLCSeriesCollection0 = new org.jfree.data.time.ohlc.OHLCSeriesCollection();
    oHLCSeriesCollection0.removeAllSeries();

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test398"); }

    org.jfree.data.xml.RootHandler rootHandler0 = new org.jfree.data.xml.RootHandler();
    rootHandler0.skippedEntity("jfreechart-");
    org.jfree.chart.axis.NumberAxis numberAxis3 = null;
    org.jfree.chart.plot.JThermometer jThermometer8 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle9 = jThermometer8.getVisibleRect();
    org.jfree.chart.plot.JThermometer jThermometer10 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle11 = jThermometer10.getVisibleRect();
    int i12 = jThermometer10.getShowAxisLocation();
    int i13 = jThermometer10.getWidth();
    java.awt.Component component14 = jThermometer8.add((java.awt.Component)jThermometer10);
    jThermometer8.addNotify();
    java.awt.event.ContainerListener containerListener16 = null;
    jThermometer8.addContainerListener(containerListener16);
    java.awt.Font font18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
    jThermometer8.setValueFont(font18);
    org.jfree.chart.axis.MarkerAxisBand markerAxisBand20 = new org.jfree.chart.axis.MarkerAxisBand(numberAxis3, Double.NaN, 0.0d, (double)100, (double)8, font18);
    org.jfree.data.xml.RootHandler rootHandler21 = new org.jfree.data.xml.RootHandler();
    rootHandler21.endElement("E", "E", "jfreechart-");
    boolean b26 = markerAxisBand20.equals((java.lang.Object)rootHandler21);
    org.jfree.data.xml.PieDatasetHandler pieDatasetHandler27 = new org.jfree.data.xml.PieDatasetHandler();
    org.jfree.data.xml.ItemHandler itemHandler28 = new org.jfree.data.xml.ItemHandler(rootHandler21, (org.xml.sax.helpers.DefaultHandler)pieDatasetHandler27);
    org.jfree.data.xml.ValueHandler valueHandler29 = new org.jfree.data.xml.ValueHandler(rootHandler0, itemHandler28);
    char[] char_array35 = new char[] { 'a', 'a', 'a', ' ', 'a' };
    rootHandler0.characters(char_array35, 100, 8);
    rootHandler0.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array35);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test399"); }

    org.jfree.chart.plot.PolarAxisLocation polarAxisLocation0 = org.jfree.chart.plot.PolarAxisLocation.EAST_BELOW;
    org.jfree.data.xy.YIntervalDataItem yIntervalDataItem5 = new org.jfree.data.xy.YIntervalDataItem((double)100, (double)100, (double)13, (double)' ');
    org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)100);
    double d7 = xYSeries6.getMinX();
    java.lang.Object obj8 = xYSeries6.clone();
    boolean b9 = polarAxisLocation0.equals((java.lang.Object)xYSeries6);
    xYSeries6.setKey((java.lang.Comparable)0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(polarAxisLocation0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertEquals((double)d7, Double.NaN, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test400"); }

    org.jfree.data.time.ohlc.OHLCSeriesCollection oHLCSeriesCollection0 = new org.jfree.data.time.ohlc.OHLCSeriesCollection();
    org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset)oHLCSeriesCollection0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(range1);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test401"); }

    org.jfree.data.xy.XYIntervalSeries xYIntervalSeries1 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable)3);
    // The following exception was thrown during execution in test generation
    try {
    double d3 = xYIntervalSeries1.getYHighValue(9);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test402"); }

    org.jfree.chart.axis.NumberAxis numberAxis0 = null;
    org.jfree.chart.plot.JThermometer jThermometer5 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle6 = jThermometer5.getVisibleRect();
    org.jfree.chart.plot.JThermometer jThermometer7 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle8 = jThermometer7.getVisibleRect();
    int i9 = jThermometer7.getShowAxisLocation();
    int i10 = jThermometer7.getWidth();
    java.awt.Component component11 = jThermometer5.add((java.awt.Component)jThermometer7);
    jThermometer5.addNotify();
    jThermometer5.validate();
    org.jfree.chart.plot.JThermometer jThermometer14 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle15 = jThermometer14.getVisibleRect();
    int i16 = jThermometer14.getShowAxisLocation();
    java.awt.Event event17 = null;
    boolean b20 = jThermometer14.mouseMove(event17, 1, (int)' ');
    jThermometer14.firePropertyChange("hi!", 0, 2);
    boolean b25 = jThermometer14.isVisible();
    jThermometer14.setFocusTraversalKeysEnabled(true);
    jThermometer5.remove((java.awt.Component)jThermometer14);
    int i29 = jThermometer5.getHeight();
    java.beans.PropertyChangeListener[] propertyChangeListener_array31 = jThermometer5.getPropertyChangeListeners("item");
    org.jfree.chart.plot.JThermometer jThermometer36 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event37 = null;
    boolean b39 = jThermometer36.keyDown(event37, 100);
    jThermometer36.setSize((int)(short)100, 8);
    java.awt.Dimension dimension43 = jThermometer36.minimumSize();
    java.awt.Dimension dimension44 = jThermometer36.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener45 = null;
    jThermometer36.removeHierarchyBoundsListener(hierarchyBoundsListener45);
    org.jfree.chart.plot.JThermometer jThermometer47 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle48 = jThermometer47.getVisibleRect();
    java.awt.Rectangle rectangle49 = jThermometer36.getBounds(rectangle48);
    java.awt.Color color50 = java.awt.Color.black;
    float[] f_array56 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array57 = color50.getRGBComponents(f_array56);
    org.jfree.chart.LegendItem legendItem58 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle49, (java.awt.Paint)color50);
    java.lang.Object obj59 = jThermometer5.getClientProperty((java.lang.Object)"ZOOM_RESET_RANGE");
    java.awt.Font font60 = org.jfree.chart.annotations.TextAnnotation.DEFAULT_FONT;
    jThermometer5.setValueFont(font60);
    org.jfree.chart.axis.MarkerAxisBand markerAxisBand62 = new org.jfree.chart.axis.MarkerAxisBand(numberAxis0, (double)'a', (double)10.0f, (double)52, (double)(-1.0f), font60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font60);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test403"); }

    org.jfree.chart.urls.StandardCategoryURLGenerator standardCategoryURLGenerator0 = new org.jfree.chart.urls.StandardCategoryURLGenerator();
    double[][] d_array_array1 = new double[][] {  };
    double[][] d_array_array2 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array1, d_array_array2);
    org.jfree.data.general.PieDataset pieDataset5 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset3, (java.lang.Comparable)0.5d);
    org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
    defaultIntervalCategoryDataset3.removeChangeListener(datasetChangeListener6);
    java.lang.Object obj8 = defaultIntervalCategoryDataset3.clone();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = standardCategoryURLGenerator0.generateURL((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset3, 4, (-143));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pieDataset5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test404"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    int i2 = jThermometer0.getShowAxisLocation();
    jThermometer0.setTickFontStyle((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test405"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel6 = new org.jfree.chart.ChartPanel(jFreeChart0, true, false, false, false, false);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test406"); }

    int i0 = java.text.DateFormat.AM_PM_FIELD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 14);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test407"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge11 = null;
    double d12 = categoryAxis6.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle10, rectangleEdge11);
    org.jfree.chart.plot.JThermometer jThermometer17 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event18 = null;
    boolean b20 = jThermometer17.keyDown(event18, 100);
    jThermometer17.setSize((int)(short)100, 8);
    java.awt.Dimension dimension24 = jThermometer17.minimumSize();
    java.awt.Dimension dimension25 = jThermometer17.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
    jThermometer17.removeHierarchyBoundsListener(hierarchyBoundsListener26);
    org.jfree.chart.plot.JThermometer jThermometer28 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle29 = jThermometer28.getVisibleRect();
    java.awt.Rectangle rectangle30 = jThermometer17.getBounds(rectangle29);
    java.awt.Color color31 = java.awt.Color.black;
    float[] f_array37 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array38 = color31.getRGBComponents(f_array37);
    org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle30, (java.awt.Paint)color31);
    org.jfree.chart.axis.CategoryAxis categoryAxis41 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer44 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle45 = jThermometer44.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge46 = null;
    double d47 = categoryAxis41.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle45, rectangleEdge46);
    categoryAxis41.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis41.setTickMarkStroke(stroke50);
    org.jfree.chart.JFreeChart jFreeChart52 = null;
    org.jfree.chart.ChartPanel chartPanel66 = new org.jfree.chart.ChartPanel(jFreeChart52, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel66.setReshowDelay((int)(short)1);
    java.awt.Color color69 = java.awt.Color.WHITE;
    chartPanel66.setZoomOutlinePaint((java.awt.Paint)color69);
    org.jfree.chart.LegendItem legendItem71 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle10, (java.awt.Paint)color31, stroke50, (java.awt.Paint)color69);
    xYShapeRenderer0.setShape((java.awt.Shape)rectangle10);
    xYShapeRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    boolean b77 = xYShapeRenderer0.getUseFillPaint();
    org.jfree.chart.JFreeChart jFreeChart78 = null;
    org.jfree.chart.ChartPanel chartPanel92 = new org.jfree.chart.ChartPanel(jFreeChart78, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel92.setReshowDelay((int)(short)1);
    boolean b95 = xYShapeRenderer0.hasListener((java.util.EventListener)chartPanel92);
    java.lang.Boolean b97 = xYShapeRenderer0.getSeriesCreateEntities(3);
    xYShapeRenderer0.setDrawOutlines(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b97);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test408"); }

    org.jfree.data.time.DateRange dateRange0 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange1 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint2 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange0, (org.jfree.data.Range)dateRange1);
    org.jfree.data.Range range5 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange0, (double)1024, false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range5);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test409"); }

    org.jfree.chart.needle.PlumNeedle plumNeedle0 = new org.jfree.chart.needle.PlumNeedle();
    plumNeedle0.setSize((int)(byte)1);
    plumNeedle0.setRotateY((double)' ');
    java.awt.Graphics2D graphics2D5 = null;
    org.jfree.chart.axis.CategoryAxis3D categoryAxis3D6 = new org.jfree.chart.axis.CategoryAxis3D();
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    org.jfree.chart.plot.JThermometer jThermometer11 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle12 = jThermometer11.getVisibleRect();
    int i13 = jThermometer11.getShowAxisLocation();
    int i14 = jThermometer11.getWidth();
    java.awt.Component component15 = jThermometer9.add((java.awt.Component)jThermometer11);
    jThermometer9.addNotify();
    org.jfree.chart.plot.JThermometer jThermometer21 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event22 = null;
    boolean b24 = jThermometer21.keyDown(event22, 100);
    jThermometer21.setSize((int)(short)100, 8);
    java.awt.Dimension dimension28 = jThermometer21.minimumSize();
    java.awt.Dimension dimension29 = jThermometer21.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener30 = null;
    jThermometer21.removeHierarchyBoundsListener(hierarchyBoundsListener30);
    org.jfree.chart.plot.JThermometer jThermometer32 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle33 = jThermometer32.getVisibleRect();
    java.awt.Rectangle rectangle34 = jThermometer21.getBounds(rectangle33);
    java.awt.Color color35 = java.awt.Color.black;
    float[] f_array41 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array42 = color35.getRGBComponents(f_array41);
    org.jfree.chart.LegendItem legendItem43 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle34, (java.awt.Paint)color35);
    java.awt.Rectangle rectangle44 = jThermometer9.getBounds(rectangle34);
    org.jfree.ui.RectangleEdge rectangleEdge45 = null;
    double d46 = categoryAxis3D6.getCategoryMiddle(16, 52, (java.awt.geom.Rectangle2D)rectangle44, rectangleEdge45);
    org.jfree.chart.JFreeChart jFreeChart47 = null;
    org.jfree.chart.ChartPanel chartPanel61 = new org.jfree.chart.ChartPanel(jFreeChart47, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo62 = chartPanel61.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer63 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle64 = jThermometer63.getVisibleRect();
    jThermometer63.requestFocus();
    org.jfree.data.time.DateRange dateRange67 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range70 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange67, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType71 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange73 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange74 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint75 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange73, (org.jfree.data.Range)dateRange74);
    org.jfree.chart.axis.CompassFormat compassFormat76 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType77 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b78 = compassFormat76.equals((java.lang.Object)lengthConstraintType77);
    org.jfree.chart.axis.CompassFormat compassFormat79 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType80 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b81 = compassFormat79.equals((java.lang.Object)lengthConstraintType80);
    boolean b82 = lengthConstraintType77.equals((java.lang.Object)b81);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint83 = new org.jfree.chart.block.RectangleConstraint(0.0d, range70, lengthConstraintType71, (double)1L, (org.jfree.data.Range)dateRange73, lengthConstraintType77);
    chartPanel61.add((java.awt.Component)jThermometer63, (java.lang.Object)lengthConstraintType71);
    org.jfree.chart.plot.JThermometer jThermometer85 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event86 = null;
    boolean b88 = jThermometer85.keyDown(event86, 100);
    jThermometer85.setVisible(false);
    java.awt.Point point91 = jThermometer85.location();
    java.awt.Point point92 = chartPanel61.getLocation(point91);
    // The following exception was thrown during execution in test generation
    try {
    plumNeedle0.draw(graphics2D5, (java.awt.geom.Rectangle2D)rectangle44, (java.awt.geom.Point2D)point91, (double)2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d46 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point92);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test410"); }

    org.jfree.chart.encoders.KeypointPNGEncoderAdapter keypointPNGEncoderAdapter0 = new org.jfree.chart.encoders.KeypointPNGEncoderAdapter();
    keypointPNGEncoderAdapter0.setQuality((float)(-1));
    boolean b3 = keypointPNGEncoderAdapter0.isEncodingAlpha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test411"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel14.setReshowDelay((int)(short)1);
    java.awt.Color color17 = java.awt.Color.WHITE;
    chartPanel14.setZoomOutlinePaint((java.awt.Paint)color17);
    double d19 = chartPanel14.getZoomOutFactor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 2.0d);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test412"); }

    int i0 = javax.swing.JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test413"); }

    int i0 = org.jfree.chart.ChartPanel.DEFAULT_ZOOM_TRIGGER_DISTANCE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 10);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test414"); }

    org.jfree.chart.JFreeChart jFreeChart1 = null;
    org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("series", jFreeChart1);
    chartFrame2.setFocusCycleRoot(false);
    chartFrame2.setAutoRequestFocus(false);
    chartFrame2.setLocationByPlatform(true);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test415"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    int i2 = jThermometer0.getShowAxisLocation();
    java.awt.Event event3 = null;
    boolean b6 = jThermometer0.mouseMove(event3, 1, (int)' ');
    jThermometer0.firePropertyChange("hi!", 0, 2);
    javax.swing.KeyStroke keyStroke11 = null;
    jThermometer0.unregisterKeyboardAction(keyStroke11);
    javax.swing.JPopupMenu jPopupMenu13 = null;
    jThermometer0.setComponentPopupMenu(jPopupMenu13);
    jThermometer0.setSubrangeInfo(11, (double)768, (double)(-128L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test416"); }

    org.jfree.chart.needle.PlumNeedle plumNeedle0 = new org.jfree.chart.needle.PlumNeedle();
    java.awt.Paint paint1 = plumNeedle0.getFillPaint();
    java.awt.Paint paint2 = plumNeedle0.getHighlightPaint();
    double d3 = plumNeedle0.getRotateX();
    java.awt.Color color4 = java.awt.Color.BLUE;
    java.awt.Color color5 = color4.darker();
    java.awt.Color color7 = java.awt.Color.BLACK;
    java.awt.Stroke stroke8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    org.jfree.chart.plot.CategoryMarker categoryMarker9 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)9, (java.awt.Paint)color7, stroke8);
    org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double)' ');
    double d12 = valueMarker11.getValue();
    org.jfree.ui.RectangleInsets rectangleInsets13 = valueMarker11.getLabelOffset();
    org.jfree.chart.block.LineBorder lineBorder14 = new org.jfree.chart.block.LineBorder((java.awt.Paint)color4, stroke8, rectangleInsets13);
    boolean b15 = plumNeedle0.equals((java.lang.Object)color4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(paint1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(paint2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test417"); }

    org.jfree.chart.axis.CategoryAxis categoryAxis5 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer8 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle9 = jThermometer8.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge10 = null;
    double d11 = categoryAxis5.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle9, rectangleEdge10);
    java.awt.Color color13 = java.awt.Color.BLACK;
    org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator17 = new org.jfree.chart.util.DefaultShadowGenerator((int)(byte)100, color13, (float)0, (int)'4', (double)1.0f);
    java.awt.Color color18 = defaultShadowGenerator17.getShadowColor();
    org.jfree.data.time.DateRange dateRange20 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange21 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint22 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange20, (org.jfree.data.Range)dateRange21);
    org.jfree.chart.plot.JThermometer jThermometer27 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event28 = null;
    boolean b30 = jThermometer27.keyDown(event28, 100);
    jThermometer27.setSize((int)(short)100, 8);
    java.awt.Dimension dimension34 = jThermometer27.minimumSize();
    java.awt.Dimension dimension35 = jThermometer27.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener36 = null;
    jThermometer27.removeHierarchyBoundsListener(hierarchyBoundsListener36);
    org.jfree.chart.plot.JThermometer jThermometer38 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle39 = jThermometer38.getVisibleRect();
    java.awt.Rectangle rectangle40 = jThermometer27.getBounds(rectangle39);
    java.awt.Color color41 = java.awt.Color.black;
    float[] f_array47 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array48 = color41.getRGBComponents(f_array47);
    org.jfree.chart.LegendItem legendItem49 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle40, (java.awt.Paint)color41);
    java.awt.Font font50 = legendItem49.getLabelFont();
    legendItem49.setDatasetIndex((int)(byte)10);
    java.awt.Paint paint53 = legendItem49.getOutlinePaint();
    org.jfree.chart.axis.CategoryAxis categoryAxis55 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer58 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle59 = jThermometer58.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge60 = null;
    double d61 = categoryAxis55.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle59, rectangleEdge60);
    categoryAxis55.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke64 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis55.setTickMarkStroke(stroke64);
    java.awt.Color color66 = java.awt.Color.BLACK;
    org.jfree.chart.plot.MeterInterval meterInterval67 = new org.jfree.chart.plot.MeterInterval("", (org.jfree.data.Range)dateRange21, paint53, stroke64, (java.awt.Paint)color66);
    java.awt.Color color68 = java.awt.Color.BLUE;
    org.jfree.chart.LegendItem legendItem69 = new org.jfree.chart.LegendItem("ZOOM_RESET_RANGE", "ZOOM_RESET_RANGE", "Item", "(0.0, 0.0)", (java.awt.Shape)rectangle9, (java.awt.Paint)color18, stroke64, (java.awt.Paint)color68);
    org.jfree.chart.block.BlockBorder blockBorder70 = new org.jfree.chart.block.BlockBorder((java.awt.Paint)color68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(font50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d61 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color68);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test418"); }

    org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle5 = jThermometer4.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge6 = null;
    double d7 = categoryAxis1.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle5, rectangleEdge6);
    categoryAxis1.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis1.setTickMarkStroke(stroke10);
    categoryAxis1.setMinorTickMarkInsideLength((float)2);
    java.lang.Object obj14 = categoryAxis1.clone();
    categoryAxis1.setMinorTickMarkInsideLength((float)(-557783151));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test419"); }

    long long0 = org.jfree.chart.axis.SegmentedTimeline.FIFTEEN_MINUTE_SEGMENT_SIZE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long0 == 900000L);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test420"); }

    org.jfree.data.contour.NonGridContourDataset nonGridContourDataset0 = new org.jfree.data.contour.NonGridContourDataset();

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test421"); }

    org.jfree.data.contour.DefaultContourDataset defaultContourDataset0 = new org.jfree.data.contour.DefaultContourDataset();
    java.lang.Number[] number_array1 = defaultContourDataset0.getXValues();
    // The following exception was thrown during execution in test generation
    try {
    double d4 = defaultContourDataset0.getZValue((int)(byte)1, 2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(number_array1);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test422"); }

    org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset defaultBoxAndWhiskerXYDataset1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset((java.lang.Comparable)(-1));
    int i3 = defaultBoxAndWhiskerXYDataset1.getItemCount((int)(byte)0);
    org.jfree.chart.JFreeChart jFreeChart4 = null;
    org.jfree.chart.ChartPanel chartPanel18 = new org.jfree.chart.ChartPanel(jFreeChart4, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo19 = chartPanel18.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer20 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle21 = jThermometer20.getVisibleRect();
    jThermometer20.requestFocus();
    org.jfree.data.time.DateRange dateRange24 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range27 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange24, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType28 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange30 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange31 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint32 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange30, (org.jfree.data.Range)dateRange31);
    org.jfree.chart.axis.CompassFormat compassFormat33 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType34 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b35 = compassFormat33.equals((java.lang.Object)lengthConstraintType34);
    org.jfree.chart.axis.CompassFormat compassFormat36 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType37 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b38 = compassFormat36.equals((java.lang.Object)lengthConstraintType37);
    boolean b39 = lengthConstraintType34.equals((java.lang.Object)b38);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint40 = new org.jfree.chart.block.RectangleConstraint(0.0d, range27, lengthConstraintType28, (double)1L, (org.jfree.data.Range)dateRange30, lengthConstraintType34);
    chartPanel18.add((java.awt.Component)jThermometer20, (java.lang.Object)lengthConstraintType28);
    org.jfree.chart.plot.JThermometer jThermometer42 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event43 = null;
    boolean b45 = jThermometer42.keyDown(event43, 100);
    jThermometer42.setVisible(false);
    java.awt.Point point48 = jThermometer42.location();
    java.awt.Point point49 = chartPanel18.getLocation(point48);
    chartPanel18.setDoubleBuffered(true);
    javax.swing.event.AncestorListener ancestorListener52 = null;
    chartPanel18.addAncestorListener(ancestorListener52);
    java.awt.Graphics graphics54 = null;
    java.awt.print.PageFormat pageFormat55 = null;
    int i57 = chartPanel18.print(graphics54, pageFormat55, (int)'4');
    boolean b58 = defaultBoxAndWhiskerXYDataset1.equals((java.lang.Object)graphics54);
    defaultBoxAndWhiskerXYDataset1.setOutlierCoefficient((double)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test423"); }

    org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder0 = org.jfree.chart.plot.SeriesRenderingOrder.REVERSE;
    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer1 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis7 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer10 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle11 = jThermometer10.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge12 = null;
    double d13 = categoryAxis7.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle11, rectangleEdge12);
    org.jfree.chart.plot.JThermometer jThermometer18 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event19 = null;
    boolean b21 = jThermometer18.keyDown(event19, 100);
    jThermometer18.setSize((int)(short)100, 8);
    java.awt.Dimension dimension25 = jThermometer18.minimumSize();
    java.awt.Dimension dimension26 = jThermometer18.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener27 = null;
    jThermometer18.removeHierarchyBoundsListener(hierarchyBoundsListener27);
    org.jfree.chart.plot.JThermometer jThermometer29 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle30 = jThermometer29.getVisibleRect();
    java.awt.Rectangle rectangle31 = jThermometer18.getBounds(rectangle30);
    java.awt.Color color32 = java.awt.Color.black;
    float[] f_array38 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array39 = color32.getRGBComponents(f_array38);
    org.jfree.chart.LegendItem legendItem40 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle31, (java.awt.Paint)color32);
    org.jfree.chart.axis.CategoryAxis categoryAxis42 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer45 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle46 = jThermometer45.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge47 = null;
    double d48 = categoryAxis42.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle46, rectangleEdge47);
    categoryAxis42.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke51 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis42.setTickMarkStroke(stroke51);
    org.jfree.chart.JFreeChart jFreeChart53 = null;
    org.jfree.chart.ChartPanel chartPanel67 = new org.jfree.chart.ChartPanel(jFreeChart53, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel67.setReshowDelay((int)(short)1);
    java.awt.Color color70 = java.awt.Color.WHITE;
    chartPanel67.setZoomOutlinePaint((java.awt.Paint)color70);
    org.jfree.chart.LegendItem legendItem72 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle11, (java.awt.Paint)color32, stroke51, (java.awt.Paint)color70);
    xYShapeRenderer1.setShape((java.awt.Shape)rectangle11);
    xYShapeRenderer1.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    boolean b78 = seriesRenderingOrder0.equals((java.lang.Object)true);
    org.jfree.data.resources.DataPackageResources_pl dataPackageResources_pl79 = new org.jfree.data.resources.DataPackageResources_pl();
    java.util.Locale locale80 = dataPackageResources_pl79.getLocale();
    boolean b81 = seriesRenderingOrder0.equals((java.lang.Object)locale80);
    java.lang.String str82 = seriesRenderingOrder0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(seriesRenderingOrder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d48 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(locale80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str82 + "' != '" + "SeriesRenderingOrder.REVERSE"+ "'", str82.equals("SeriesRenderingOrder.REVERSE"));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test424"); }

    org.jfree.chart.JFreeChart jFreeChart1 = null;
    org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("series", jFreeChart1);
    chartFrame2.setResizable(false);
    chartFrame2.setBounds((int)'#', (int)' ', 9, 0);
    javax.swing.JMenuBar jMenuBar10 = null;
    chartFrame2.setJMenuBar(jMenuBar10);
    chartFrame2.setState(11);
    org.jfree.chart.JFreeChart jFreeChart15 = null;
    org.jfree.chart.ChartFrame chartFrame16 = new org.jfree.chart.ChartFrame("series", jFreeChart15);
    chartFrame16.setFocusCycleRoot(false);
    chartFrame2.remove((java.awt.Component)chartFrame16);
    chartFrame16.hide();
    int i21 = chartFrame16.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test425"); }

    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition0 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition1 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition2 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition3 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions4 = new org.jfree.chart.axis.CategoryLabelPositions(categoryLabelPosition0, categoryLabelPosition1, categoryLabelPosition2, categoryLabelPosition3);
    double d5 = categoryLabelPosition0.getAngle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test426"); }

    org.jfree.chart.axis.ColorBar colorBar1 = new org.jfree.chart.axis.ColorBar("E");
    org.jfree.chart.plot.ColorPalette colorPalette2 = colorBar1.getColorPalette();
    org.jfree.chart.plot.ColorPalette colorPalette3 = colorBar1.getColorPalette();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorPalette2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorPalette3);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test427"); }

    int i0 = java.text.DateFormat.MINUTE_FIELD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 6);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test428"); }

    java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateFormat0);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test429"); }

    org.jfree.chart.axis.QuarterDateFormat quarterDateFormat0 = new org.jfree.chart.axis.QuarterDateFormat();
    quarterDateFormat0.setLenient(true);
    java.text.ParsePosition parsePosition4 = null;
    java.util.Date date5 = quarterDateFormat0.parse("E", parsePosition4);
    org.jfree.chart.urls.TimeSeriesURLGenerator timeSeriesURLGenerator9 = new org.jfree.chart.urls.TimeSeriesURLGenerator((java.text.DateFormat)quarterDateFormat0, "", "ZOOM_DOMAIN_BOTH", "SAVE");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(date5);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test430"); }

    org.jfree.data.time.DateRange dateRange1 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange2 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint3 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange1, (org.jfree.data.Range)dateRange2);
    boolean b5 = dateRange2.contains((double)64);
    org.jfree.data.time.DateRange dateRange6 = new org.jfree.data.time.DateRange((org.jfree.data.Range)dateRange2);
    org.jfree.chart.plot.MeterInterval meterInterval7 = new org.jfree.chart.plot.MeterInterval("1.0, -1", (org.jfree.data.Range)dateRange2);
    java.awt.Paint paint8 = meterInterval7.getOutlinePaint();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint8);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test431"); }

    double[][] d_array_array0 = new double[][] {  };
    double[][] d_array_array1 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array0, d_array_array1);
    org.jfree.data.general.PieDataset pieDataset4 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset2, (java.lang.Comparable)0.5d);
    java.util.List list5 = defaultIntervalCategoryDataset2.getSeries();
    org.jfree.data.general.SeriesChangeEvent seriesChangeEvent6 = null;
    defaultIntervalCategoryDataset2.seriesChanged(seriesChangeEvent6);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable comparable9 = defaultIntervalCategoryDataset2.getColumnKey(1024);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pieDataset4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test432"); }

    org.jfree.chart.plot.RainbowPalette rainbowPalette0 = new org.jfree.chart.plot.RainbowPalette();
    rainbowPalette0.setLogscale(false);
    java.awt.Color color4 = rainbowPalette0.getColor((int)'#');
    rainbowPalette0.setPaletteName("");
    double[][] d_array_array7 = new double[][] {  };
    double[][] d_array_array8 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset9 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array7, d_array_array8);
    org.jfree.data.general.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset9, (java.lang.Comparable)0.5d);
    java.util.List list12 = defaultIntervalCategoryDataset9.getSeries();
    org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset9);
    java.util.List list14 = defaultIntervalCategoryDataset9.getSeries();
    rainbowPalette0.setTickValues(list14);
    boolean b16 = rainbowPalette0.isInverse();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pieDataset11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(range13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test433"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b4 = jThermometer0.gotFocus(event1, (java.lang.Object)timeSeries3);
    org.jfree.chart.plot.JThermometer jThermometer5 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event6 = null;
    org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b9 = jThermometer5.gotFocus(event6, (java.lang.Object)timeSeries8);
    boolean b10 = timeSeries8.getNotify();
    org.jfree.data.time.TimeSeries timeSeries11 = timeSeries3.addAndOrUpdate(timeSeries8);
    java.util.List list12 = timeSeries3.getItems();
    org.jfree.chart.plot.JThermometer jThermometer13 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event14 = null;
    org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b17 = jThermometer13.gotFocus(event14, (java.lang.Object)timeSeries16);
    java.lang.Class class18 = timeSeries16.getTimePeriodClass();
    org.jfree.data.time.TimeSeries timeSeries19 = timeSeries3.addAndOrUpdate(timeSeries16);
    java.lang.Comparable comparable20 = timeSeries16.getKey();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeSeries11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeSeries19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + comparable20 + "' != '" + 6+ "'", comparable20.equals(6));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test434"); }

    org.jfree.data.xml.PieDatasetHandler pieDatasetHandler0 = new org.jfree.data.xml.PieDatasetHandler();
    // The following exception was thrown during execution in test generation
    try {
    org.xml.sax.helpers.DefaultHandler defaultHandler1 = pieDatasetHandler0.popSubHandler();
      org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test435"); }

    org.jfree.data.function.LineFunction2D lineFunction2D2 = new org.jfree.data.function.LineFunction2D((double)(short)-1, (double)'#');
    double d4 = lineFunction2D2.getValue(0.2d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 6.0d);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test436"); }

    int i0 = java.awt.Frame.NORMAL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test437"); }

    java.awt.Color color1 = java.awt.Color.BLACK;
    org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator5 = new org.jfree.chart.util.DefaultShadowGenerator((int)(byte)100, color1, (float)0, (int)'4', (double)1.0f);
    org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor6 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE4;
    boolean b7 = defaultShadowGenerator5.equals((java.lang.Object)itemLabelAnchor6);
    int i8 = defaultShadowGenerator5.calculateOffsetY();
    double d9 = defaultShadowGenerator5.getAngle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelAnchor6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-143));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 1.0d);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test438"); }

    org.jfree.chart.JFreeChart jFreeChart1 = null;
    org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("series", jFreeChart1);
    chartFrame2.setResizable(false);
    chartFrame2.setBounds((int)'#', (int)' ', 9, 0);
    javax.swing.JMenuBar jMenuBar10 = null;
    chartFrame2.setJMenuBar(jMenuBar10);
    chartFrame2.setState(11);
    org.jfree.chart.JFreeChart jFreeChart15 = null;
    org.jfree.chart.ChartFrame chartFrame16 = new org.jfree.chart.ChartFrame("series", jFreeChart15);
    chartFrame16.setFocusCycleRoot(false);
    chartFrame2.remove((java.awt.Component)chartFrame16);
    javax.swing.JLayeredPane jLayeredPane20 = chartFrame16.getLayeredPane();
    java.io.PrintWriter printWriter21 = null;
    // The following exception was thrown during execution in test generation
    try {
    jLayeredPane20.list(printWriter21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLayeredPane20);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test439"); }

    org.jfree.chart.util.XYCoordinateType xYCoordinateType0 = org.jfree.chart.util.XYCoordinateType.DATA;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xYCoordinateType0);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test440"); }

    org.jfree.chart.plot.RainbowPalette rainbowPalette0 = new org.jfree.chart.plot.RainbowPalette();
    double[] d_array5 = new double[] { 2, ' ', 10.0d, '4' };
    int i6 = org.jfree.chart.HashUtilities.hashCodeForDoubleArray(d_array5);
    double[] d_array11 = new double[] { 2, ' ', 10.0d, '4' };
    int i12 = org.jfree.chart.HashUtilities.hashCodeForDoubleArray(d_array11);
    org.jfree.chart.ClipPath clipPath16 = new org.jfree.chart.ClipPath(d_array5, d_array11, true, false, true);
    rainbowPalette0.setTickValues(d_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-557783151));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-557783151));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test441"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b4 = jThermometer0.gotFocus(event1, (java.lang.Object)timeSeries3);
    jThermometer0.removeNotify();
    jThermometer0.setLocation((int)(byte)-1, 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test442"); }

    org.jfree.chart.plot.PolarAxisLocation polarAxisLocation0 = org.jfree.chart.plot.PolarAxisLocation.EAST_BELOW;
    org.jfree.data.xy.YIntervalDataItem yIntervalDataItem5 = new org.jfree.data.xy.YIntervalDataItem((double)100, (double)100, (double)13, (double)' ');
    org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)100);
    double d7 = xYSeries6.getMinX();
    java.lang.Object obj8 = xYSeries6.clone();
    boolean b9 = polarAxisLocation0.equals((java.lang.Object)xYSeries6);
    xYSeries6.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(polarAxisLocation0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertEquals((double)d7, Double.NaN, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test443"); }

    org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)100.0d, false);
    xYSeries2.add((double)97L, (java.lang.Number)0);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test444"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    org.jfree.chart.plot.JThermometer jThermometer2 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle3 = jThermometer2.getVisibleRect();
    int i4 = jThermometer2.getShowAxisLocation();
    int i5 = jThermometer2.getWidth();
    java.awt.Component component6 = jThermometer0.add((java.awt.Component)jThermometer2);
    java.util.Locale locale7 = null;
    jThermometer0.setLocale(locale7);
    java.awt.Dimension dimension9 = jThermometer0.minimumSize();
    jThermometer0.setVerifyInputWhenFocusTarget(true);
    java.awt.Event event12 = null;
    boolean b14 = jThermometer0.action(event12, (java.lang.Object)0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test445"); }

    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event5 = null;
    boolean b7 = jThermometer4.keyDown(event5, 100);
    jThermometer4.setSize((int)(short)100, 8);
    java.awt.Dimension dimension11 = jThermometer4.minimumSize();
    java.awt.Dimension dimension12 = jThermometer4.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener13 = null;
    jThermometer4.removeHierarchyBoundsListener(hierarchyBoundsListener13);
    org.jfree.chart.plot.JThermometer jThermometer15 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle16 = jThermometer15.getVisibleRect();
    java.awt.Rectangle rectangle17 = jThermometer4.getBounds(rectangle16);
    java.awt.Color color18 = java.awt.Color.black;
    float[] f_array24 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array25 = color18.getRGBComponents(f_array24);
    org.jfree.chart.LegendItem legendItem26 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle17, (java.awt.Paint)color18);
    java.awt.Font font27 = legendItem26.getLabelFont();
    double[][] d_array_array28 = new double[][] {  };
    double[][] d_array_array29 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset30 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array28, d_array_array29);
    org.jfree.data.general.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset30, (java.lang.Comparable)0.5d);
    java.util.List list33 = defaultIntervalCategoryDataset30.getSeries();
    org.jfree.data.general.SeriesChangeEvent seriesChangeEvent34 = null;
    defaultIntervalCategoryDataset30.seriesChanged(seriesChangeEvent34);
    org.jfree.chart.JFreeChart jFreeChart36 = null;
    org.jfree.chart.ChartPanel chartPanel50 = new org.jfree.chart.ChartPanel(jFreeChart36, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    boolean b51 = chartPanel50.isDomainZoomable();
    chartPanel50.setZoomOutFactor((double)768);
    boolean b54 = defaultIntervalCategoryDataset30.hasListener((java.util.EventListener)chartPanel50);
    legendItem26.setDataset((org.jfree.data.general.Dataset)defaultIntervalCategoryDataset30);
    java.lang.String str56 = legendItem26.getLabel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(font27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pieDataset32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + ""+ "'", str56.equals(""));

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test446"); }

    org.jfree.chart.plot.RainbowPalette rainbowPalette0 = new org.jfree.chart.plot.RainbowPalette();
    rainbowPalette0.setLogscale(false);
    java.awt.Color color4 = rainbowPalette0.getColor((int)'#');
    rainbowPalette0.setPaletteName("");
    double[] d_array11 = new double[] { 2, ' ', 10.0d, '4' };
    int i12 = org.jfree.chart.HashUtilities.hashCodeForDoubleArray(d_array11);
    double[] d_array17 = new double[] { 2, ' ', 10.0d, '4' };
    int i18 = org.jfree.chart.HashUtilities.hashCodeForDoubleArray(d_array17);
    org.jfree.chart.ClipPath clipPath22 = new org.jfree.chart.ClipPath(d_array11, d_array17, true, false, true);
    rainbowPalette0.setTickValues(d_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-557783151));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-557783151));

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test447"); }

    org.jfree.chart.renderer.OutlierListCollection outlierListCollection0 = new org.jfree.chart.renderer.OutlierListCollection();
    boolean b1 = outlierListCollection0.isLowFarOut();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test448"); }

    org.jfree.chart.renderer.OutlierListCollection outlierListCollection0 = new org.jfree.chart.renderer.OutlierListCollection();
    outlierListCollection0.setLowFarOut(true);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test449"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel14.setMinimumDrawHeight((int)(byte)-1);
    chartPanel14.setInitialDelay(13);
    org.jfree.chart.panel.Overlay overlay19 = null;
    // The following exception was thrown during execution in test generation
    try {
    chartPanel14.removeOverlay(overlay19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test450"); }

    java.lang.Class class3 = null;
    org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)13, "ZOOM_DOMAIN_BOTH", "", class3);
    java.util.TimeZone timeZone5 = org.jfree.chart.axis.SegmentedTimeline.NO_DST_TIME_ZONE;
    org.jfree.data.time.TimeSeriesCollection timeSeriesCollection6 = new org.jfree.data.time.TimeSeriesCollection(timeSeries4, timeZone5);
    org.jfree.data.Range range8 = timeSeriesCollection6.getDomainBounds(false);
    // The following exception was thrown during execution in test generation
    try {
    int i10 = timeSeriesCollection6.getItemCount(14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeZone5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(range8);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test451"); }

    java.lang.Class class3 = null;
    org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)13, "ZOOM_DOMAIN_BOTH", "", class3);
    java.util.TimeZone timeZone5 = org.jfree.chart.axis.SegmentedTimeline.NO_DST_TIME_ZONE;
    org.jfree.data.time.TimeSeriesCollection timeSeriesCollection6 = new org.jfree.data.time.TimeSeriesCollection(timeSeries4, timeZone5);
    timeSeriesCollection6.setDomainIsPointsInTime(true);
    // The following exception was thrown during execution in test generation
    try {
    double d11 = timeSeriesCollection6.getXValue((int)(byte)10, 2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeZone5);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test452"); }

    org.jfree.data.gantt.GanttCategoryDataset ganttCategoryDataset0 = null;
    org.jfree.data.gantt.SlidingGanttCategoryDataset slidingGanttCategoryDataset3 = new org.jfree.data.gantt.SlidingGanttCategoryDataset(ganttCategoryDataset0, 0, 64);
    org.jfree.data.gantt.SlidingGanttCategoryDataset slidingGanttCategoryDataset6 = new org.jfree.data.gantt.SlidingGanttCategoryDataset((org.jfree.data.gantt.GanttCategoryDataset)slidingGanttCategoryDataset3, 680, (int)(byte)-1);
    org.jfree.data.gantt.GanttCategoryDataset ganttCategoryDataset7 = slidingGanttCategoryDataset3.getUnderlyingDataset();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number10 = slidingGanttCategoryDataset3.getStartValue(255, 52);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(ganttCategoryDataset7);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test453"); }

    org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem3 = timeSeries1.addOrUpdate(timeSeriesDataItem2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test454"); }

    java.lang.Number number2 = null;
    double[][] d_array_array8 = new double[][] {  };
    double[][] d_array_array9 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset10 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array8, d_array_array9);
    org.jfree.data.general.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset10, (java.lang.Comparable)0.5d);
    org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
    defaultIntervalCategoryDataset10.removeChangeListener(datasetChangeListener13);
    java.util.List list15 = defaultIntervalCategoryDataset10.getCategories();
    org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem16 = new org.jfree.data.statistics.BoxAndWhiskerItem((java.lang.Number)6, (java.lang.Number)(-143), number2, (java.lang.Number)1.0f, (java.lang.Number)(byte)1, (java.lang.Number)(-1L), (java.lang.Number)7, (java.lang.Number)1.0d, list15);
    java.lang.Number number17 = boxAndWhiskerItem16.getMedian();
    java.lang.Number number18 = boxAndWhiskerItem16.getMaxRegularValue();
    java.lang.Number number19 = boxAndWhiskerItem16.getQ3();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pieDataset12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + number17 + "' != '" + (-143)+ "'", number17.equals((-143)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + number18 + "' != '" + (-1L)+ "'", number18.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + number19 + "' != '" + 1.0f+ "'", number19.equals(1.0f));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test455"); }

    org.jfree.data.xml.RootHandler rootHandler0 = new org.jfree.data.xml.RootHandler();
    rootHandler0.endElement("E", "E", "jfreechart-");
    rootHandler0.skippedEntity("ZOOM_RESET_DOMAIN");
    org.jfree.data.xml.RootHandler rootHandler7 = new org.jfree.data.xml.RootHandler();
    rootHandler7.skippedEntity("jfreechart-");
    org.jfree.chart.axis.NumberAxis numberAxis10 = null;
    org.jfree.chart.plot.JThermometer jThermometer15 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle16 = jThermometer15.getVisibleRect();
    org.jfree.chart.plot.JThermometer jThermometer17 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle18 = jThermometer17.getVisibleRect();
    int i19 = jThermometer17.getShowAxisLocation();
    int i20 = jThermometer17.getWidth();
    java.awt.Component component21 = jThermometer15.add((java.awt.Component)jThermometer17);
    jThermometer15.addNotify();
    java.awt.event.ContainerListener containerListener23 = null;
    jThermometer15.addContainerListener(containerListener23);
    java.awt.Font font25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
    jThermometer15.setValueFont(font25);
    org.jfree.chart.axis.MarkerAxisBand markerAxisBand27 = new org.jfree.chart.axis.MarkerAxisBand(numberAxis10, Double.NaN, 0.0d, (double)100, (double)8, font25);
    org.jfree.data.xml.RootHandler rootHandler28 = new org.jfree.data.xml.RootHandler();
    rootHandler28.endElement("E", "E", "jfreechart-");
    boolean b33 = markerAxisBand27.equals((java.lang.Object)rootHandler28);
    org.jfree.data.xml.PieDatasetHandler pieDatasetHandler34 = new org.jfree.data.xml.PieDatasetHandler();
    org.jfree.data.xml.ItemHandler itemHandler35 = new org.jfree.data.xml.ItemHandler(rootHandler28, (org.xml.sax.helpers.DefaultHandler)pieDatasetHandler34);
    org.jfree.data.xml.ValueHandler valueHandler36 = new org.jfree.data.xml.ValueHandler(rootHandler7, itemHandler35);
    org.jfree.data.xml.ValueHandler valueHandler37 = new org.jfree.data.xml.ValueHandler(rootHandler0, itemHandler35);
    org.xml.sax.SAXParseException sAXParseException38 = null;
    // The following exception was thrown during execution in test generation
    try {
    valueHandler37.fatalError(sAXParseException38);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test456"); }

    org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double)' ');
    double d2 = valueMarker1.getValue();
    org.jfree.chart.axis.CategoryAxis categoryAxis4 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer7 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle8 = jThermometer7.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge9 = null;
    double d10 = categoryAxis4.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle8, rectangleEdge9);
    categoryAxis4.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis4.setTickMarkStroke(stroke13);
    valueMarker1.setStroke(stroke13);
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    jThermometer16.requestFocus();
    javax.swing.JPopupMenu jPopupMenu19 = jThermometer16.getComponentPopupMenu();
    boolean b20 = valueMarker1.equals((java.lang.Object)jPopupMenu19);
    java.awt.Paint paint21 = valueMarker1.getLabelPaint();
    org.jfree.chart.JFreeChart jFreeChart22 = null;
    org.jfree.chart.ChartPanel chartPanel36 = new org.jfree.chart.ChartPanel(jFreeChart22, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo37 = chartPanel36.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer38 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle39 = jThermometer38.getVisibleRect();
    jThermometer38.requestFocus();
    org.jfree.data.time.DateRange dateRange42 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range45 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange42, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType46 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange48 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange49 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint50 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange48, (org.jfree.data.Range)dateRange49);
    org.jfree.chart.axis.CompassFormat compassFormat51 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType52 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b53 = compassFormat51.equals((java.lang.Object)lengthConstraintType52);
    org.jfree.chart.axis.CompassFormat compassFormat54 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType55 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b56 = compassFormat54.equals((java.lang.Object)lengthConstraintType55);
    boolean b57 = lengthConstraintType52.equals((java.lang.Object)b56);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint58 = new org.jfree.chart.block.RectangleConstraint(0.0d, range45, lengthConstraintType46, (double)1L, (org.jfree.data.Range)dateRange48, lengthConstraintType52);
    chartPanel36.add((java.awt.Component)jThermometer38, (java.lang.Object)lengthConstraintType46);
    boolean b60 = valueMarker1.equals((java.lang.Object)lengthConstraintType46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jPopupMenu19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test457"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = chartRenderingInfo15.getPlotInfo();
    chartRenderingInfo15.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(plotRenderingInfo16);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test458"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    org.jfree.chart.plot.JThermometer jThermometer2 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle3 = jThermometer2.getVisibleRect();
    int i4 = jThermometer2.getShowAxisLocation();
    int i5 = jThermometer2.getWidth();
    java.awt.Component component6 = jThermometer0.add((java.awt.Component)jThermometer2);
    java.util.Locale locale7 = null;
    jThermometer0.setLocale(locale7);
    java.awt.Dimension dimension9 = jThermometer0.minimumSize();
    jThermometer0.updateUI();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test459"); }

    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline0 = org.jfree.chart.axis.SegmentedTimeline.newFifteenMinuteTimeline();
    org.jfree.chart.axis.SegmentedTimeline.Segment segment2 = segmentedTimeline0.getSegment((long)3);
    segment2.dec();
    segment2.dec();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(segmentedTimeline0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(segment2);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test460"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b4 = jThermometer0.gotFocus(event1, (java.lang.Object)timeSeries3);
    boolean b5 = jThermometer0.requestDefaultFocus();
    java.awt.Component component8 = jThermometer0.locate(100, 52);
    java.awt.FocusTraversalPolicy focusTraversalPolicy9 = jThermometer0.getFocusTraversalPolicy();
    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer10 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis16 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer19 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle20 = jThermometer19.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge21 = null;
    double d22 = categoryAxis16.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle20, rectangleEdge21);
    org.jfree.chart.plot.JThermometer jThermometer27 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event28 = null;
    boolean b30 = jThermometer27.keyDown(event28, 100);
    jThermometer27.setSize((int)(short)100, 8);
    java.awt.Dimension dimension34 = jThermometer27.minimumSize();
    java.awt.Dimension dimension35 = jThermometer27.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener36 = null;
    jThermometer27.removeHierarchyBoundsListener(hierarchyBoundsListener36);
    org.jfree.chart.plot.JThermometer jThermometer38 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle39 = jThermometer38.getVisibleRect();
    java.awt.Rectangle rectangle40 = jThermometer27.getBounds(rectangle39);
    java.awt.Color color41 = java.awt.Color.black;
    float[] f_array47 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array48 = color41.getRGBComponents(f_array47);
    org.jfree.chart.LegendItem legendItem49 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle40, (java.awt.Paint)color41);
    org.jfree.chart.axis.CategoryAxis categoryAxis51 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer54 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle55 = jThermometer54.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge56 = null;
    double d57 = categoryAxis51.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle55, rectangleEdge56);
    categoryAxis51.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke60 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis51.setTickMarkStroke(stroke60);
    org.jfree.chart.JFreeChart jFreeChart62 = null;
    org.jfree.chart.ChartPanel chartPanel76 = new org.jfree.chart.ChartPanel(jFreeChart62, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel76.setReshowDelay((int)(short)1);
    java.awt.Color color79 = java.awt.Color.WHITE;
    chartPanel76.setZoomOutlinePaint((java.awt.Paint)color79);
    org.jfree.chart.LegendItem legendItem81 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle20, (java.awt.Paint)color41, stroke60, (java.awt.Paint)color79);
    xYShapeRenderer10.setShape((java.awt.Shape)rectangle20);
    jThermometer0.paintImmediately(rectangle20);
    java.awt.Event event84 = null;
    org.jfree.chart.plot.JThermometer jThermometer85 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle86 = jThermometer85.getVisibleRect();
    int i87 = jThermometer85.getShowAxisLocation();
    java.awt.event.ContainerListener containerListener88 = null;
    jThermometer85.addContainerListener(containerListener88);
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener90 = null;
    jThermometer85.addHierarchyBoundsListener(hierarchyBoundsListener90);
    boolean b92 = jThermometer0.lostFocus(event84, (java.lang.Object)hierarchyBoundsListener90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(focusTraversalPolicy9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d57 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test461"); }

    org.jfree.chart.JFreeChart jFreeChart1 = null;
    org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("series", jFreeChart1);
    chartFrame2.setResizable(false);
    java.awt.Image image5 = chartFrame2.getIconImage();
    java.lang.String str6 = chartFrame2.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(image5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "series"+ "'", str6.equals("series"));

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test462"); }

    java.awt.Color color0 = org.jfree.chart.ChartColor.LIGHT_CYAN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color0);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test463"); }

    org.jfree.data.xy.XYIntervalSeries xYIntervalSeries1 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable)3);
    xYIntervalSeries1.add(0.0d, (double)(byte)0, Double.NaN, (double)(byte)10, 32.0d, (double)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    double d10 = xYIntervalSeries1.getYValue(768);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test464"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge11 = null;
    double d12 = categoryAxis6.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle10, rectangleEdge11);
    org.jfree.chart.plot.JThermometer jThermometer17 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event18 = null;
    boolean b20 = jThermometer17.keyDown(event18, 100);
    jThermometer17.setSize((int)(short)100, 8);
    java.awt.Dimension dimension24 = jThermometer17.minimumSize();
    java.awt.Dimension dimension25 = jThermometer17.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
    jThermometer17.removeHierarchyBoundsListener(hierarchyBoundsListener26);
    org.jfree.chart.plot.JThermometer jThermometer28 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle29 = jThermometer28.getVisibleRect();
    java.awt.Rectangle rectangle30 = jThermometer17.getBounds(rectangle29);
    java.awt.Color color31 = java.awt.Color.black;
    float[] f_array37 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array38 = color31.getRGBComponents(f_array37);
    org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle30, (java.awt.Paint)color31);
    org.jfree.chart.axis.CategoryAxis categoryAxis41 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer44 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle45 = jThermometer44.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge46 = null;
    double d47 = categoryAxis41.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle45, rectangleEdge46);
    categoryAxis41.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis41.setTickMarkStroke(stroke50);
    org.jfree.chart.JFreeChart jFreeChart52 = null;
    org.jfree.chart.ChartPanel chartPanel66 = new org.jfree.chart.ChartPanel(jFreeChart52, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel66.setReshowDelay((int)(short)1);
    java.awt.Color color69 = java.awt.Color.WHITE;
    chartPanel66.setZoomOutlinePaint((java.awt.Paint)color69);
    org.jfree.chart.LegendItem legendItem71 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle10, (java.awt.Paint)color31, stroke50, (java.awt.Paint)color69);
    xYShapeRenderer0.setShape((java.awt.Shape)rectangle10);
    xYShapeRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    org.jfree.chart.labels.ItemLabelPosition itemLabelPosition77 = xYShapeRenderer0.getBasePositiveItemLabelPosition();
    java.awt.Paint paint80 = xYShapeRenderer0.getItemPaint(2, (int)(short)0);
    org.jfree.chart.labels.XYToolTipGenerator xYToolTipGenerator81 = xYShapeRenderer0.getToolTipGenerator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelPosition77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xYToolTipGenerator81);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test465"); }

    org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
    // The following exception was thrown during execution in test generation
    try {
    double d2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test466"); }

    org.jfree.chart.axis.NumberAxis numberAxis0 = null;
    org.jfree.chart.plot.JThermometer jThermometer5 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle6 = jThermometer5.getVisibleRect();
    org.jfree.chart.plot.JThermometer jThermometer7 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle8 = jThermometer7.getVisibleRect();
    int i9 = jThermometer7.getShowAxisLocation();
    int i10 = jThermometer7.getWidth();
    java.awt.Component component11 = jThermometer5.add((java.awt.Component)jThermometer7);
    jThermometer5.addNotify();
    java.awt.event.ContainerListener containerListener13 = null;
    jThermometer5.addContainerListener(containerListener13);
    java.awt.Font font15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
    jThermometer5.setValueFont(font15);
    org.jfree.chart.axis.MarkerAxisBand markerAxisBand17 = new org.jfree.chart.axis.MarkerAxisBand(numberAxis0, Double.NaN, 0.0d, (double)100, (double)8, font15);
    org.jfree.data.xml.RootHandler rootHandler18 = new org.jfree.data.xml.RootHandler();
    rootHandler18.endElement("E", "E", "jfreechart-");
    boolean b23 = markerAxisBand17.equals((java.lang.Object)rootHandler18);
    org.jfree.data.xml.PieDatasetHandler pieDatasetHandler24 = new org.jfree.data.xml.PieDatasetHandler();
    org.jfree.data.xml.ItemHandler itemHandler25 = new org.jfree.data.xml.ItemHandler(rootHandler18, (org.xml.sax.helpers.DefaultHandler)pieDatasetHandler24);
    org.jfree.data.xml.CategorySeriesHandler categorySeriesHandler26 = new org.jfree.data.xml.CategorySeriesHandler((org.jfree.data.xml.RootHandler)pieDatasetHandler24);
    org.xml.sax.Attributes attributes30 = null;
    // The following exception was thrown during execution in test generation
    try {
    categorySeriesHandler26.startElement("", "9", "(0.0, 0.0)", attributes30);
      org.junit.Assert.fail("Expected exception of type org.xml.sax.SAXException");
    } catch (org.xml.sax.SAXException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test467"); }

    org.jfree.chart.JFreeChart jFreeChart1 = null;
    org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("series", jFreeChart1);
    chartFrame2.setSize(5, (-331012207));

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test468"); }

    org.jfree.chart.needle.ArrowNeedle arrowNeedle1 = new org.jfree.chart.needle.ArrowNeedle(true);
    java.awt.geom.AffineTransform affineTransform2 = arrowNeedle1.getTransform();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(affineTransform2);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test469"); }

    org.jfree.chart.axis.MonthDateFormat monthDateFormat0 = new org.jfree.chart.axis.MonthDateFormat();
    java.lang.Object obj1 = monthDateFormat0.clone();
    org.jfree.chart.urls.TimeSeriesURLGenerator timeSeriesURLGenerator5 = new org.jfree.chart.urls.TimeSeriesURLGenerator((java.text.DateFormat)monthDateFormat0, "LengthConstraintType.NONE", "ZOOM_RESET_DOMAIN", "E");
    org.jfree.chart.JFreeChart jFreeChart6 = null;
    org.jfree.chart.ChartPanel chartPanel20 = new org.jfree.chart.ChartPanel(jFreeChart6, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo21 = chartPanel20.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer22 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle23 = jThermometer22.getVisibleRect();
    jThermometer22.requestFocus();
    org.jfree.data.time.DateRange dateRange26 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range29 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange26, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType30 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange32 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange33 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint34 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange32, (org.jfree.data.Range)dateRange33);
    org.jfree.chart.axis.CompassFormat compassFormat35 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType36 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b37 = compassFormat35.equals((java.lang.Object)lengthConstraintType36);
    org.jfree.chart.axis.CompassFormat compassFormat38 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType39 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b40 = compassFormat38.equals((java.lang.Object)lengthConstraintType39);
    boolean b41 = lengthConstraintType36.equals((java.lang.Object)b40);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint42 = new org.jfree.chart.block.RectangleConstraint(0.0d, range29, lengthConstraintType30, (double)1L, (org.jfree.data.Range)dateRange32, lengthConstraintType36);
    chartPanel20.add((java.awt.Component)jThermometer22, (java.lang.Object)lengthConstraintType30);
    chartPanel20.updateUI();
    boolean b45 = timeSeriesURLGenerator5.equals((java.lang.Object)chartPanel20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test470"); }

    org.jfree.data.xy.XYDataItem xYDataItem2 = new org.jfree.data.xy.XYDataItem((double)(short)100, 0.5d);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test471"); }

    org.jfree.chart.axis.AxisState axisState0 = new org.jfree.chart.axis.AxisState();

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test472"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    boolean b3 = jThermometer0.keyDown(event1, 100);
    java.awt.event.HierarchyListener hierarchyListener4 = null;
    jThermometer0.addHierarchyListener(hierarchyListener4);
    jThermometer0.setFollowDataInSubranges(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test473"); }

    org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions2 = categoryAxis1.getCategoryLabelPositions();
    org.jfree.chart.axis.CategoryAxis categoryAxis13 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge18 = null;
    double d19 = categoryAxis13.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle17, rectangleEdge18);
    org.jfree.chart.plot.JThermometer jThermometer24 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event25 = null;
    boolean b27 = jThermometer24.keyDown(event25, 100);
    jThermometer24.setSize((int)(short)100, 8);
    java.awt.Dimension dimension31 = jThermometer24.minimumSize();
    java.awt.Dimension dimension32 = jThermometer24.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener33 = null;
    jThermometer24.removeHierarchyBoundsListener(hierarchyBoundsListener33);
    org.jfree.chart.plot.JThermometer jThermometer35 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle36 = jThermometer35.getVisibleRect();
    java.awt.Rectangle rectangle37 = jThermometer24.getBounds(rectangle36);
    java.awt.Color color38 = java.awt.Color.black;
    float[] f_array44 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array45 = color38.getRGBComponents(f_array44);
    org.jfree.chart.LegendItem legendItem46 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle37, (java.awt.Paint)color38);
    org.jfree.chart.axis.CategoryAxis categoryAxis48 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer51 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle52 = jThermometer51.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge53 = null;
    double d54 = categoryAxis48.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle52, rectangleEdge53);
    categoryAxis48.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke57 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis48.setTickMarkStroke(stroke57);
    org.jfree.chart.JFreeChart jFreeChart59 = null;
    org.jfree.chart.ChartPanel chartPanel73 = new org.jfree.chart.ChartPanel(jFreeChart59, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel73.setReshowDelay((int)(short)1);
    java.awt.Color color76 = java.awt.Color.WHITE;
    chartPanel73.setZoomOutlinePaint((java.awt.Paint)color76);
    org.jfree.chart.LegendItem legendItem78 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle17, (java.awt.Paint)color38, stroke57, (java.awt.Paint)color76);
    org.jfree.ui.RectangleEdge rectangleEdge79 = null;
    double d80 = categoryAxis1.getCategorySeriesMiddle(1, 52, 100, 768, (double)768, (java.awt.geom.Rectangle2D)rectangle17, rectangleEdge79);
    java.awt.Paint paint81 = categoryAxis1.getLabelPaint();
    org.jfree.chart.axis.CategoryAxis categoryAxis83 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer86 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle87 = jThermometer86.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge88 = null;
    double d89 = categoryAxis83.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle87, rectangleEdge88);
    categoryAxis83.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke92 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis83.setTickMarkStroke(stroke92);
    double d94 = categoryAxis83.getLowerMargin();
    org.jfree.ui.RectangleInsets rectangleInsets95 = categoryAxis83.getTickLabelInsets();
    categoryAxis1.setLabelInsets(rectangleInsets95);
    float f97 = categoryAxis1.getTickMarkInsideLength();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelPositions2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d54 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d80 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d89 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d94 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f97 == 0.0f);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test474"); }

    org.jfree.chart.needle.PlumNeedle plumNeedle0 = new org.jfree.chart.needle.PlumNeedle();
    java.awt.Paint paint1 = plumNeedle0.getFillPaint();
    java.awt.Paint paint2 = plumNeedle0.getHighlightPaint();
    double d3 = plumNeedle0.getRotateX();
    double d4 = plumNeedle0.getRotateX();
    plumNeedle0.setRotateX(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(paint1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(paint2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.5d);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test475"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel14.setReshowDelay((int)(short)1);
    int i17 = chartPanel14.getMinimumDrawWidth();
    chartPanel14.repaint((int)'#', (int)'#', (int)(byte)0, (-192));
    boolean b23 = chartPanel14.isEnabled();
    java.awt.Container container24 = chartPanel14.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container24);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test476"); }

    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event5 = null;
    boolean b7 = jThermometer4.keyDown(event5, 100);
    jThermometer4.setSize((int)(short)100, 8);
    java.awt.Dimension dimension11 = jThermometer4.minimumSize();
    java.awt.Dimension dimension12 = jThermometer4.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener13 = null;
    jThermometer4.removeHierarchyBoundsListener(hierarchyBoundsListener13);
    org.jfree.chart.plot.JThermometer jThermometer15 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle16 = jThermometer15.getVisibleRect();
    java.awt.Rectangle rectangle17 = jThermometer4.getBounds(rectangle16);
    java.awt.Color color18 = java.awt.Color.black;
    float[] f_array24 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array25 = color18.getRGBComponents(f_array24);
    org.jfree.chart.LegendItem legendItem26 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle17, (java.awt.Paint)color18);
    java.awt.Font font27 = legendItem26.getLabelFont();
    legendItem26.setDatasetIndex((int)(byte)10);
    java.awt.Paint paint30 = legendItem26.getOutlinePaint();
    legendItem26.setLineVisible(false);
    org.jfree.ui.GradientPaintTransformer gradientPaintTransformer33 = legendItem26.getFillPaintTransformer();
    int i34 = legendItem26.getSeriesIndex();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(font27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gradientPaintTransformer33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test477"); }

    double[][] d_array_array0 = new double[][] {  };
    double[][] d_array_array1 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array0, d_array_array1);
    org.jfree.data.general.SeriesDataset[] seriesDataset_array3 = new org.jfree.data.general.SeriesDataset[] { defaultIntervalCategoryDataset2 };
    org.jfree.data.general.CombinedDataset combinedDataset4 = new org.jfree.data.general.CombinedDataset(seriesDataset_array3);
    org.jfree.data.Range range5 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset)combinedDataset4);
    org.jfree.data.Range range6 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset)combinedDataset4);
    org.jfree.data.general.SeriesDataset seriesDataset7 = combinedDataset4.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(seriesDataset_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(range5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(range6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(seriesDataset7);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test478"); }

    org.jfree.data.time.DateRange dateRange1 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range4 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange1, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType5 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange7 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange8 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint9 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange7, (org.jfree.data.Range)dateRange8);
    org.jfree.chart.axis.CompassFormat compassFormat10 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType11 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b12 = compassFormat10.equals((java.lang.Object)lengthConstraintType11);
    org.jfree.chart.axis.CompassFormat compassFormat13 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType14 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b15 = compassFormat13.equals((java.lang.Object)lengthConstraintType14);
    boolean b16 = lengthConstraintType11.equals((java.lang.Object)b15);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = new org.jfree.chart.block.RectangleConstraint(0.0d, range4, lengthConstraintType5, (double)1L, (org.jfree.data.Range)dateRange7, lengthConstraintType11);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint19 = rectangleConstraint17.toFixedWidth((double)0.0f);
    org.jfree.data.Range range20 = rectangleConstraint17.getWidthRange();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleConstraint19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range20);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test479"); }

    org.jfree.data.resources.DataPackageResources_pl dataPackageResources_pl0 = new org.jfree.data.resources.DataPackageResources_pl();
    java.util.Locale locale1 = dataPackageResources_pl0.getLocale();
    java.util.Locale locale2 = dataPackageResources_pl0.getLocale();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj4 = dataPackageResources_pl0.getObject("ZOOM_RESET_DOMAIN");
      org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(locale1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(locale2);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test480"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    jThermometer16.requestFocus();
    org.jfree.data.time.DateRange dateRange20 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range23 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange20, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType24 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange26 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange27 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange26, (org.jfree.data.Range)dateRange27);
    org.jfree.chart.axis.CompassFormat compassFormat29 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType30 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b31 = compassFormat29.equals((java.lang.Object)lengthConstraintType30);
    org.jfree.chart.axis.CompassFormat compassFormat32 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType33 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b34 = compassFormat32.equals((java.lang.Object)lengthConstraintType33);
    boolean b35 = lengthConstraintType30.equals((java.lang.Object)b34);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint36 = new org.jfree.chart.block.RectangleConstraint(0.0d, range23, lengthConstraintType24, (double)1L, (org.jfree.data.Range)dateRange26, lengthConstraintType30);
    chartPanel14.add((java.awt.Component)jThermometer16, (java.lang.Object)lengthConstraintType24);
    javax.swing.InputVerifier inputVerifier38 = chartPanel14.getInputVerifier();
    boolean b39 = chartPanel14.getRefreshBuffer();
    chartPanel14.firePropertyChange("hi!", (byte)0, (byte)0);
    // The following exception was thrown during execution in test generation
    try {
    chartPanel14.zoomInBoth(0.0d, (double)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test481"); }

    org.jfree.data.xml.RootHandler rootHandler0 = new org.jfree.data.xml.RootHandler();
    org.jfree.data.xml.ItemHandler itemHandler1 = null;
    org.jfree.data.xml.KeyHandler keyHandler2 = new org.jfree.data.xml.KeyHandler(rootHandler0, itemHandler1);
    rootHandler0.notationDecl("Rainbow", "XYCoordinateType.INDEX", "ToolTipText");

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test482"); }

    org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("E");
    java.awt.Font font2 = categoryAxis1.getTickLabelFont();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test483"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    boolean b3 = jThermometer0.keyDown(event1, 100);
    jThermometer0.setSize((int)(short)100, 8);
    boolean b7 = jThermometer0.requestFocusInWindow();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test484"); }

    org.jfree.chart.JFreeChart jFreeChart1 = null;
    org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("series", jFreeChart1);
    chartFrame2.setResizable(false);
    chartFrame2.setBounds((int)'#', (int)' ', 9, 0);
    javax.swing.JMenuBar jMenuBar10 = null;
    chartFrame2.setJMenuBar(jMenuBar10);
    javax.accessibility.AccessibleContext accessibleContext12 = chartFrame2.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext12);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test485"); }

    org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test486"); }

    org.jfree.chart.LegendItemCollection legendItemCollection0 = new org.jfree.chart.LegendItemCollection();
    org.jfree.chart.plot.JThermometer jThermometer5 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event6 = null;
    boolean b8 = jThermometer5.keyDown(event6, 100);
    jThermometer5.setSize((int)(short)100, 8);
    java.awt.Dimension dimension12 = jThermometer5.minimumSize();
    java.awt.Dimension dimension13 = jThermometer5.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener14 = null;
    jThermometer5.removeHierarchyBoundsListener(hierarchyBoundsListener14);
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    java.awt.Rectangle rectangle18 = jThermometer5.getBounds(rectangle17);
    java.awt.Color color19 = java.awt.Color.black;
    float[] f_array25 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array26 = color19.getRGBComponents(f_array25);
    org.jfree.chart.LegendItem legendItem27 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle18, (java.awt.Paint)color19);
    java.awt.Font font28 = legendItem27.getLabelFont();
    legendItem27.setDatasetIndex((int)(byte)10);
    java.awt.Paint paint31 = legendItem27.getOutlinePaint();
    legendItem27.setURLText("");
    legendItem27.setShapeVisible(false);
    legendItemCollection0.add(legendItem27);
    java.util.Iterator iterator37 = legendItemCollection0.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(font28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator37);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test487"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    jThermometer16.requestFocus();
    org.jfree.data.time.DateRange dateRange20 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range23 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange20, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType24 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange26 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange27 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange26, (org.jfree.data.Range)dateRange27);
    org.jfree.chart.axis.CompassFormat compassFormat29 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType30 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b31 = compassFormat29.equals((java.lang.Object)lengthConstraintType30);
    org.jfree.chart.axis.CompassFormat compassFormat32 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType33 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b34 = compassFormat32.equals((java.lang.Object)lengthConstraintType33);
    boolean b35 = lengthConstraintType30.equals((java.lang.Object)b34);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint36 = new org.jfree.chart.block.RectangleConstraint(0.0d, range23, lengthConstraintType24, (double)1L, (org.jfree.data.Range)dateRange26, lengthConstraintType30);
    chartPanel14.add((java.awt.Component)jThermometer16, (java.lang.Object)lengthConstraintType24);
    int i38 = chartPanel14.getMinimumDrawWidth();
    java.awt.Graphics graphics39 = null;
    java.awt.print.PageFormat pageFormat40 = null;
    int i42 = chartPanel14.print(graphics39, pageFormat40, 9);
    java.io.File file43 = chartPanel14.getDefaultDirectoryForSaveAs();
    boolean b44 = chartPanel14.getRefreshBuffer();
    java.awt.ComponentOrientation componentOrientation45 = null;
    chartPanel14.setComponentOrientation(componentOrientation45);
    chartPanel14.setMaximumDrawWidth((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(file43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test488"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle17 = jThermometer16.getVisibleRect();
    jThermometer16.requestFocus();
    org.jfree.data.time.DateRange dateRange20 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range23 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange20, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType24 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange26 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange27 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange26, (org.jfree.data.Range)dateRange27);
    org.jfree.chart.axis.CompassFormat compassFormat29 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType30 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b31 = compassFormat29.equals((java.lang.Object)lengthConstraintType30);
    org.jfree.chart.axis.CompassFormat compassFormat32 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType33 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b34 = compassFormat32.equals((java.lang.Object)lengthConstraintType33);
    boolean b35 = lengthConstraintType30.equals((java.lang.Object)b34);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint36 = new org.jfree.chart.block.RectangleConstraint(0.0d, range23, lengthConstraintType24, (double)1L, (org.jfree.data.Range)dateRange26, lengthConstraintType30);
    chartPanel14.add((java.awt.Component)jThermometer16, (java.lang.Object)lengthConstraintType24);
    org.jfree.chart.plot.JThermometer jThermometer38 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event39 = null;
    boolean b41 = jThermometer38.keyDown(event39, 100);
    jThermometer38.setVisible(false);
    java.awt.Point point44 = jThermometer38.location();
    java.awt.Point point45 = chartPanel14.getLocation(point44);
    chartPanel14.setDoubleBuffered(true);
    javax.swing.event.AncestorListener ancestorListener48 = null;
    chartPanel14.addAncestorListener(ancestorListener48);
    java.awt.Graphics graphics50 = null;
    // The following exception was thrown during execution in test generation
    try {
    chartPanel14.paintComponent(graphics50);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point45);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test489"); }

    org.jfree.chart.axis.QuarterDateFormat quarterDateFormat0 = new org.jfree.chart.axis.QuarterDateFormat();
    quarterDateFormat0.setLenient(true);
    java.text.ParsePosition parsePosition4 = null;
    java.util.Date date5 = quarterDateFormat0.parse("ZOOM_RESET_DOMAIN", parsePosition4);
    java.text.ParsePosition parsePosition7 = null;
    java.util.Date date8 = quarterDateFormat0.parse("ZOOM_RESET_RANGE", parsePosition7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(date5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(date8);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test490"); }

    org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)100.0d, false);
    org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries2.addOrUpdate((java.lang.Number)(-2208960000000L), (java.lang.Number)6.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xYDataItem5);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test491"); }

    org.jfree.chart.JFreeChart jFreeChart1 = null;
    org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("series", jFreeChart1);
    chartFrame2.setFocusCycleRoot(false);
    chartFrame2.setAutoRequestFocus(false);
    chartFrame2.setExtendedState(680);
    chartFrame2.addNotify();

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test492"); }

    org.jfree.chart.JFreeChart jFreeChart1 = null;
    org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("series", jFreeChart1);
    chartFrame2.setResizable(false);
    chartFrame2.setBounds((int)'#', (int)' ', 9, 0);
    javax.swing.JMenuBar jMenuBar10 = null;
    chartFrame2.setJMenuBar(jMenuBar10);
    chartFrame2.dispose();
    chartFrame2.setFocusableWindowState(false);
    org.jfree.chart.plot.JThermometer jThermometer15 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle16 = jThermometer15.getVisibleRect();
    jThermometer15.revalidate();
    jThermometer15.requestFocus();
    org.jfree.chart.plot.JThermometer jThermometer19 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event20 = null;
    boolean b22 = jThermometer19.keyDown(event20, 100);
    jThermometer19.setSize((int)(short)100, 8);
    java.awt.Dimension dimension26 = jThermometer19.minimumSize();
    jThermometer15.setMaximumSize(dimension26);
    chartFrame2.setSize(dimension26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension26);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test493"); }

    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline3 = new org.jfree.chart.axis.SegmentedTimeline((long)0, (int)(byte)-1, 3);
    boolean b4 = segmentedTimeline3.getAdjustForDaylightSaving();
    int i5 = segmentedTimeline3.getSegmentsIncluded();
    long long6 = segmentedTimeline3.getSegmentsExcludedSize();
    java.lang.Object obj7 = segmentedTimeline3.clone();
    org.jfree.data.time.DateRange dateRange8 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange9 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint10 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange8, (org.jfree.data.Range)dateRange9);
    boolean b12 = dateRange9.contains((double)64);
    java.util.Date date13 = dateRange9.getLowerDate();
    long long14 = segmentedTimeline3.getTime(date13);
    org.jfree.chart.axis.MonthDateFormat monthDateFormat15 = new org.jfree.chart.axis.MonthDateFormat();
    java.lang.Object obj16 = monthDateFormat15.clone();
    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline20 = new org.jfree.chart.axis.SegmentedTimeline((long)0, (int)(byte)-1, 3);
    java.util.Date date22 = segmentedTimeline20.getDate((long)'a');
    java.lang.String str23 = monthDateFormat15.format(date22);
    long long24 = segmentedTimeline3.getTime(date22);
    org.jfree.chart.util.RelativeDateFormat relativeDateFormat25 = new org.jfree.chart.util.RelativeDateFormat(date22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "D"+ "'", str23.equals("D"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long24 == 97L);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test494"); }

    java.lang.String str0 = org.jfree.chart.ChartPanel.ZOOM_OUT_BOTH_COMMAND;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ZOOM_OUT_BOTH"+ "'", str0.equals("ZOOM_OUT_BOTH"));

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test495"); }

    org.jfree.data.xml.RootHandler rootHandler0 = new org.jfree.data.xml.RootHandler();
    rootHandler0.endElement("E", "E", "jfreechart-");
    rootHandler0.skippedEntity("ZOOM_RESET_DOMAIN");
    org.jfree.data.xml.RootHandler rootHandler7 = new org.jfree.data.xml.RootHandler();
    rootHandler7.skippedEntity("jfreechart-");
    org.jfree.chart.axis.NumberAxis numberAxis10 = null;
    org.jfree.chart.plot.JThermometer jThermometer15 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle16 = jThermometer15.getVisibleRect();
    org.jfree.chart.plot.JThermometer jThermometer17 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle18 = jThermometer17.getVisibleRect();
    int i19 = jThermometer17.getShowAxisLocation();
    int i20 = jThermometer17.getWidth();
    java.awt.Component component21 = jThermometer15.add((java.awt.Component)jThermometer17);
    jThermometer15.addNotify();
    java.awt.event.ContainerListener containerListener23 = null;
    jThermometer15.addContainerListener(containerListener23);
    java.awt.Font font25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
    jThermometer15.setValueFont(font25);
    org.jfree.chart.axis.MarkerAxisBand markerAxisBand27 = new org.jfree.chart.axis.MarkerAxisBand(numberAxis10, Double.NaN, 0.0d, (double)100, (double)8, font25);
    org.jfree.data.xml.RootHandler rootHandler28 = new org.jfree.data.xml.RootHandler();
    rootHandler28.endElement("E", "E", "jfreechart-");
    boolean b33 = markerAxisBand27.equals((java.lang.Object)rootHandler28);
    org.jfree.data.xml.PieDatasetHandler pieDatasetHandler34 = new org.jfree.data.xml.PieDatasetHandler();
    org.jfree.data.xml.ItemHandler itemHandler35 = new org.jfree.data.xml.ItemHandler(rootHandler28, (org.xml.sax.helpers.DefaultHandler)pieDatasetHandler34);
    org.jfree.data.xml.ValueHandler valueHandler36 = new org.jfree.data.xml.ValueHandler(rootHandler7, itemHandler35);
    org.jfree.data.xml.ValueHandler valueHandler37 = new org.jfree.data.xml.ValueHandler(rootHandler0, itemHandler35);
    // The following exception was thrown during execution in test generation
    try {
    valueHandler37.endElement("ZOOM_RESET_RANGE", "N", "ZOOM_OUT_BOTH");
      org.junit.Assert.fail("Expected exception of type org.xml.sax.SAXException");
    } catch (org.xml.sax.SAXException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test496"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    jThermometer0.disable();
    javax.swing.KeyStroke keyStroke3 = null;
    java.awt.event.ActionListener actionListener4 = jThermometer0.getActionForKeyStroke(keyStroke3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(actionListener4);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test497"); }

    org.jfree.chart.JFreeChart jFreeChart1 = null;
    org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("series", jFreeChart1);
    chartFrame2.setResizable(false);
    chartFrame2.setBounds((int)'#', (int)' ', 9, 0);
    javax.swing.JMenuBar jMenuBar10 = null;
    chartFrame2.setJMenuBar(jMenuBar10);
    chartFrame2.dispose();
    java.awt.Dimension dimension13 = chartFrame2.minimumSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension13);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test498"); }

    org.jfree.data.time.TimeSeriesCollection timeSeriesCollection0 = new org.jfree.data.time.TimeSeriesCollection();
    org.jfree.chart.axis.MonthDateFormat monthDateFormat1 = new org.jfree.chart.axis.MonthDateFormat();
    java.lang.Object obj2 = monthDateFormat1.clone();
    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline6 = new org.jfree.chart.axis.SegmentedTimeline((long)0, (int)(byte)-1, 3);
    java.util.Date date8 = segmentedTimeline6.getDate((long)'a');
    java.lang.String str9 = monthDateFormat1.format(date8);
    org.jfree.data.time.TimeSeries timeSeries10 = timeSeriesCollection0.getSeries((java.lang.Comparable)date8);
    org.jfree.data.xy.XYDataset xYDataset14 = org.jfree.data.time.MovingAverage.createMovingAverage((org.jfree.data.xy.XYDataset)timeSeriesCollection0, "jfreechart-", (double)60000L, 2.0d);
    int i15 = timeSeriesCollection0.getSeriesCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "D"+ "'", str9.equals("D"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(timeSeries10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xYDataset14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test499"); }

    org.jfree.data.time.TimePeriod timePeriod0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.time.TimePeriodValue timePeriodValue2 = new org.jfree.data.time.TimePeriodValue(timePeriod0, (double)(-331012207));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test500"); }

    java.awt.Paint paint0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_PAINT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint0);

  }

}
