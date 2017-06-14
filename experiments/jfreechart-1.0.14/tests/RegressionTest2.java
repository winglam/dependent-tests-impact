
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test01"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel14.paintImmediately((int)(short)100, (int)(short)100, (int)'#', (int)(byte)1);
    chartPanel14.invalidate();

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test02"); }

    org.jfree.chart.block.BlockResult blockResult0 = new org.jfree.chart.block.BlockResult();
    org.jfree.chart.entity.EntityCollection entityCollection1 = blockResult0.getEntityCollection();
    org.jfree.chart.entity.EntityCollection entityCollection2 = blockResult0.getEntityCollection();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(entityCollection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(entityCollection2);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test03"); }

    org.jfree.data.time.DateRange dateRange0 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range3 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange0, (double)'a', true);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint5 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange0, (double)8);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint6 = rectangleConstraint5.toUnconstrainedHeight();
    org.jfree.data.time.DateRange dateRange7 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange8 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint9 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange7, (org.jfree.data.Range)dateRange8);
    double d10 = dateRange8.getLength();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint11 = rectangleConstraint6.toRangeHeight((org.jfree.data.Range)dateRange8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleConstraint6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleConstraint11);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test04"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel14.setReshowDelay((int)(short)1);
    int i17 = chartPanel14.getMinimumDrawWidth();
    boolean b18 = chartPanel14.isDoubleBuffered();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test05"); }

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
    boolean b82 = categoryAxis1.isTickMarksVisible();
    categoryAxis1.setLabelAngle((double)(short)100);
    
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
    org.junit.Assert.assertTrue(b82 == true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test06"); }

    org.jfree.ui.HorizontalAlignment horizontalAlignment0 = null;
    org.jfree.ui.VerticalAlignment verticalAlignment1 = null;
    org.jfree.chart.block.ColumnArrangement columnArrangement4 = new org.jfree.chart.block.ColumnArrangement(horizontalAlignment0, verticalAlignment1, 32.0d, (double)12);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test07"); }

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
    org.jfree.chart.ClipPath clipPath35 = new org.jfree.chart.ClipPath(d_array10, d_array26, true, false, true);
    org.jfree.chart.axis.CategoryAxis categoryAxis37 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer40 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle41 = jThermometer40.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge42 = null;
    double d43 = categoryAxis37.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle41, rectangleEdge42);
    categoryAxis37.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke46 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis37.setTickMarkStroke(stroke46);
    clipPath35.setDrawStroke(stroke46);
    
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
    org.junit.Assert.assertNotNull(rectangle41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d43 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke46);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test08"); }

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
    org.jfree.text.TextBox textBox59 = null;
    org.jfree.chart.plot.PieLabelRecord pieLabelRecord63 = new org.jfree.chart.plot.PieLabelRecord((java.lang.Comparable)4.0d, (double)100.0f, 0.2d, textBox59, (double)(-1.0f), (double)1.0f, (double)0.5f);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number65 = defaultIntervalCategoryDataset30.getEndValue((java.lang.Comparable)0.2d, (java.lang.Comparable)3600000L);
      org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException e) {
      // Expected exception.
    }
    
    
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

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test09"); }

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
    org.jfree.data.DomainOrder domainOrder59 = defaultBoxAndWhiskerXYDataset1.getDomainOrder();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(domainOrder59);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test10"); }

    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition0 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition1 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition2 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition3 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions4 = new org.jfree.chart.axis.CategoryLabelPositions(categoryLabelPosition0, categoryLabelPosition1, categoryLabelPosition2, categoryLabelPosition3);
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition5 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition6 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition7 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition8 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions9 = new org.jfree.chart.axis.CategoryLabelPositions(categoryLabelPosition5, categoryLabelPosition6, categoryLabelPosition7, categoryLabelPosition8);
    org.jfree.ui.TextAnchor textAnchor10 = categoryLabelPosition5.getRotationAnchor();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition11 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition12 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition13 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition14 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions15 = new org.jfree.chart.axis.CategoryLabelPositions(categoryLabelPosition11, categoryLabelPosition12, categoryLabelPosition13, categoryLabelPosition14);
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition16 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition17 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition18 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition19 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions20 = new org.jfree.chart.axis.CategoryLabelPositions(categoryLabelPosition16, categoryLabelPosition17, categoryLabelPosition18, categoryLabelPosition19);
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions21 = new org.jfree.chart.axis.CategoryLabelPositions(categoryLabelPosition0, categoryLabelPosition5, categoryLabelPosition13, categoryLabelPosition18);
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition22 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition23 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition24 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition25 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions26 = new org.jfree.chart.axis.CategoryLabelPositions(categoryLabelPosition22, categoryLabelPosition23, categoryLabelPosition24, categoryLabelPosition25);
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition27 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition28 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition29 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition30 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions31 = new org.jfree.chart.axis.CategoryLabelPositions(categoryLabelPosition27, categoryLabelPosition28, categoryLabelPosition29, categoryLabelPosition30);
    org.jfree.ui.TextAnchor textAnchor32 = categoryLabelPosition27.getRotationAnchor();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition33 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition34 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition35 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition36 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions37 = new org.jfree.chart.axis.CategoryLabelPositions(categoryLabelPosition33, categoryLabelPosition34, categoryLabelPosition35, categoryLabelPosition36);
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition38 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition39 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition40 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition41 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions42 = new org.jfree.chart.axis.CategoryLabelPositions(categoryLabelPosition38, categoryLabelPosition39, categoryLabelPosition40, categoryLabelPosition41);
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions43 = new org.jfree.chart.axis.CategoryLabelPositions(categoryLabelPosition22, categoryLabelPosition27, categoryLabelPosition35, categoryLabelPosition40);
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition44 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition45 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition46 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition47 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions48 = new org.jfree.chart.axis.CategoryLabelPositions(categoryLabelPosition44, categoryLabelPosition45, categoryLabelPosition46, categoryLabelPosition47);
    org.jfree.ui.TextAnchor textAnchor49 = categoryLabelPosition44.getRotationAnchor();
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions50 = new org.jfree.chart.axis.CategoryLabelPositions();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition51 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition52 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition53 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition54 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions55 = new org.jfree.chart.axis.CategoryLabelPositions(categoryLabelPosition51, categoryLabelPosition52, categoryLabelPosition53, categoryLabelPosition54);
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions56 = org.jfree.chart.axis.CategoryLabelPositions.replaceTopPosition(categoryLabelPositions50, categoryLabelPosition52);
    org.jfree.ui.TextAnchor textAnchor57 = categoryLabelPosition52.getRotationAnchor();
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions58 = new org.jfree.chart.axis.CategoryLabelPositions(categoryLabelPosition5, categoryLabelPosition27, categoryLabelPosition44, categoryLabelPosition52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelPositions56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor57);

  }

}
