
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    org.jfree.data.category.CategoryDataset categoryDataset0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset0, false);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    float f0 = java.awt.Component.CENTER_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 0.5f);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    org.jfree.data.Range range0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.Range range2 = org.jfree.data.Range.scale(range0, 0.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    int i0 = java.awt.Frame.NW_RESIZE_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 6);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.encoders.ImageEncoder imageEncoder3 = org.jfree.chart.encoders.ImageEncoderFactory.newInstance("", (float)(short)100, false);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    int i0 = java.awt.Frame.MOVE_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 13);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    org.jfree.data.time.TimePeriod timePeriod0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.time.TimePeriodValue timePeriodValue2 = new org.jfree.data.time.TimePeriodValue(timePeriod0, (java.lang.Number)0L);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    java.awt.image.BufferedImage bufferedImage0 = null;
    java.io.OutputStream outputStream2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.encoders.EncoderUtil.writeBufferedImage(bufferedImage0, "", outputStream2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    java.lang.Class class0 = null;
    java.text.DateFormat dateFormat1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.axis.PeriodAxisLabelInfo periodAxisLabelInfo2 = new org.jfree.chart.axis.PeriodAxisLabelInfo(class0, dateFormat1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    java.net.URL uRL0 = null;
    java.net.URLClassLoader uRLClassLoader1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.util.ResourceBundleWrapper.removeCodeBase(uRL0, uRLClassLoader1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    int i0 = java.text.DateFormat.YEAR_FIELD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    int i0 = java.text.DateFormat.MONTH_FIELD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    java.util.Locale locale1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.ResourceBundle resourceBundle2 = org.jfree.chart.util.ResourceBundleWrapper.getBundle("hi!", locale1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    java.awt.geom.Line2D line2D0 = null;
    java.awt.geom.Rectangle2D rectangle2D1 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b2 = org.jfree.chart.util.LineUtilities.clipLine(line2D0, rectangle2D1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    int i0 = javax.swing.JComponent.WHEN_FOCUSED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    java.awt.Color color0 = org.jfree.chart.ChartColor.DARK_MAGENTA;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color0);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number3 = timeSeries1.getValue(13);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    org.jfree.ui.RectangleAnchor rectangleAnchor0 = null;
    org.jfree.text.TextBlockAnchor textBlockAnchor1 = null;
    org.jfree.chart.axis.CategoryLabelWidthType categoryLabelWidthType2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition4 = new org.jfree.chart.axis.CategoryLabelPosition(rectangleAnchor0, textBlockAnchor1, categoryLabelWidthType2, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    java.awt.Color color1 = java.awt.Color.getColor("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(color1);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.PolarChartPanel polarChartPanel1 = new org.jfree.chart.PolarChartPanel(jFreeChart0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    org.jfree.chart.plot.PolarAxisLocation polarAxisLocation0 = org.jfree.chart.plot.PolarAxisLocation.WEST_BELOW;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(polarAxisLocation0);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions0 = null;
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions2 = org.jfree.chart.axis.CategoryLabelPositions.replaceLeftPosition(categoryLabelPositions0, categoryLabelPosition1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    org.jfree.chart.annotations.Annotation annotation1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.event.AnnotationChangeEvent annotationChangeEvent2 = new org.jfree.chart.event.AnnotationChangeEvent((java.lang.Object)1.0d, annotation1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    org.jfree.data.category.CategoryDataset categoryDataset0 = null;
    boolean b1 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    java.awt.Color color0 = java.awt.Color.BLACK;
    float[] f_array2 = new float[] { 'a' };
    // The following exception was thrown during execution in test generation
    try {
    float[] f_array3 = color0.getComponents(f_array2);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array2);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    org.jfree.chart.servlet.ServletUtilities.setTempOneTimeFilePrefix("");

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    org.jfree.data.Range range1 = null;
    java.awt.Color color2 = java.awt.Color.YELLOW;
    java.awt.Stroke stroke3 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    java.awt.Color color4 = java.awt.Color.BLACK;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.plot.MeterInterval meterInterval5 = new org.jfree.chart.plot.MeterInterval("hi!", range1, (java.awt.Paint)color2, stroke3, (java.awt.Paint)color4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color4);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    org.jfree.chart.event.ChartChangeEventType chartChangeEventType0 = org.jfree.chart.event.ChartChangeEventType.DATASET_UPDATED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartChangeEventType0);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    double d0 = org.jfree.chart.axis.CategoryAxis.DEFAULT_CATEGORY_MARGIN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d0 == 0.2d);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    int i0 = org.jfree.chart.util.HexNumberFormat.DWORD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 8);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    org.jfree.data.category.CategoryDataset categoryDataset0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.editor.ChartEditor chartEditor1 = org.jfree.chart.editor.ChartEditorManager.getChartEditor(jFreeChart0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
    // The following exception was thrown during execution in test generation
    try {
    double d2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE11;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelAnchor0);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    java.util.Date date0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat(date0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.jdbc.JDBCXYDataset jDBCXYDataset4 = new org.jfree.data.jdbc.JDBCXYDataset("", "hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    int i0 = java.awt.image.ImageObserver.WIDTH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    float[] f_array4 = new float[] { (short)100 };
    // The following exception was thrown during execution in test generation
    try {
    float[] f_array5 = java.awt.Color.RGBtoHSB((int)(byte)100, 2, (int)(byte)10, f_array4);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array4);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    org.jfree.data.KeyedValues keyedValues1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.category.CategoryDataset categoryDataset2 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable)'4', keyedValues1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    java.text.DateFormat dateFormat2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.axis.DateTickUnit dateTickUnit3 = new org.jfree.chart.axis.DateTickUnit((int)'#', 6, dateFormat2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    javax.accessibility.AccessibleContext accessibleContext2 = jThermometer0.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext2);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
    java.util.TimeZone timeZone3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.time.DynamicTimeSeriesCollection dynamicTimeSeriesCollection4 = new org.jfree.data.time.DynamicTimeSeriesCollection((int)(byte)-1, 13, regularTimePeriod2, timeZone3);
      org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    org.jfree.chart.event.ChartChangeEventType chartChangeEventType0 = org.jfree.chart.event.ChartChangeEventType.NEW_DATASET;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartChangeEventType0);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.CENTER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelAnchor0);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    org.jfree.chart.renderer.RendererUtilities rendererUtilities0 = new org.jfree.chart.renderer.RendererUtilities();

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    org.jfree.data.category.CategoryDataset categoryDataset0 = null;
    org.jfree.data.KeyToGroupMap keyToGroupMap1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset0, keyToGroupMap1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    java.lang.String str0 = org.jfree.chart.servlet.ServletUtilities.getTempFilePrefix();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "jfreechart-"+ "'", str0.equals("jfreechart-"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    int i0 = java.awt.Frame.S_RESIZE_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 9);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    org.jfree.data.xy.XYDataset xYDataset0 = null;
    java.util.List list1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.Range range3 = org.jfree.data.general.DatasetUtilities.findDomainBounds(xYDataset0, list1, false);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    org.jfree.data.category.CategoryDataset categoryDataset0 = null;
    java.util.List list1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.Range range3 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset0, list1, true);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b4 = jThermometer0.gotFocus(event1, (java.lang.Object)timeSeries3);
    java.lang.String str5 = timeSeries3.getDomainDescription();
    org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i7 = timeSeries3.getIndex(regularTimePeriod6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Time"+ "'", str5.equals("Time"));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition0 = null;
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition1 = null;
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition2 = null;
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions4 = new org.jfree.chart.axis.CategoryLabelPositions(categoryLabelPosition0, categoryLabelPosition1, categoryLabelPosition2, categoryLabelPosition3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelAnchor0);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    org.jfree.data.general.PieDataset pieDataset0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.general.PieDataset pieDataset4 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset0, (java.lang.Comparable)10.0d, (double)(byte)1, (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    java.awt.image.BufferedImage bufferedImage0 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array4 = org.jfree.chart.encoders.EncoderUtil.encode(bufferedImage0, "jfreechart-", (float)'#', true);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    int i0 = javax.swing.JFrame.EXIT_ON_CLOSE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 3);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    org.jfree.data.category.CategoryDataset categoryDataset0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    org.jfree.data.time.DateRange dateRange0 = new org.jfree.data.time.DateRange();
    double d1 = dateRange0.getLowerBound();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    org.jfree.data.xy.XYIntervalSeries xYIntervalSeries1 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    double d3 = xYIntervalSeries1.getYLowValue((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    // The following exception was thrown during execution in test generation
    try {
    chartPanel14.restoreAutoDomainBounds();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    int i3 = java.awt.Color.HSBtoRGB((float)(byte)100, (-1.0f), (float)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-4));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    java.lang.String str0 = org.jfree.chart.ChartPanel.ZOOM_RESET_DOMAIN_COMMAND;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ZOOM_RESET_DOMAIN"+ "'", str0.equals("ZOOM_RESET_DOMAIN"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    java.text.DateFormat dateFormat2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.axis.DateTickUnit dateTickUnit3 = new org.jfree.chart.axis.DateTickUnit(9, (-1), dateFormat2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    java.awt.Paint paint0 = org.jfree.chart.axis.PeriodAxisLabelInfo.DEFAULT_DIVIDER_PAINT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint0);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    org.jfree.data.xy.XYDataset xYDataset0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number1 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(xYDataset0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    java.lang.String str0 = org.jfree.chart.ChartPanel.ZOOM_RESET_RANGE_COMMAND;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ZOOM_RESET_RANGE"+ "'", str0.equals("ZOOM_RESET_RANGE"));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    float f0 = java.awt.Component.BOTTOM_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 1.0f);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    java.awt.Color color1 = java.awt.Color.BLACK;
    org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator5 = new org.jfree.chart.util.DefaultShadowGenerator((int)(byte)100, color1, (float)0, (int)'4', (double)1.0f);
    org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor6 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE4;
    boolean b7 = defaultShadowGenerator5.equals((java.lang.Object)itemLabelAnchor6);
    float f8 = defaultShadowGenerator5.getShadowOpacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelAnchor6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    double[][] d_array_array0 = new double[][] {  };
    double[][] d_array_array1 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array0, d_array_array1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable comparable4 = defaultIntervalCategoryDataset2.getColumnKey(13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array1);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b4 = jThermometer0.gotFocus(event1, (java.lang.Object)timeSeries3);
    java.lang.String str5 = timeSeries3.getDomainDescription();
    org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
    // The following exception was thrown during execution in test generation
    try {
    timeSeries3.add(timeSeriesDataItem6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Time"+ "'", str5.equals("Time"));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    java.awt.Color color0 = java.awt.Color.black;
    float[] f_array6 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array7 = color0.getRGBComponents(f_array6);
    java.awt.Color color8 = java.awt.Color.black;
    float[] f_array14 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array15 = color8.getRGBComponents(f_array14);
    float[] f_array16 = color0.getRGBComponents(f_array14);
    float[] f_array18 = new float[] { '#' };
    // The following exception was thrown during execution in test generation
    try {
    float[] f_array19 = color0.getRGBComponents(f_array18);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array18);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    org.jfree.data.xy.XYZDataset xYZDataset0 = null;
    java.util.List list1 = null;
    org.jfree.data.time.DateRange dateRange2 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange3 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint4 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange2, (org.jfree.data.Range)dateRange3);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.Range range6 = org.jfree.data.general.DatasetUtilities.iterateToFindZBounds(xYZDataset0, list1, (org.jfree.data.Range)dateRange2, false);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    org.jfree.data.time.RegularTimePeriod regularTimePeriod0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem2 = new org.jfree.data.time.TimeSeriesDataItem(regularTimePeriod0, (double)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    java.beans.VetoableChangeListener vetoableChangeListener2 = null;
    timeSeries1.addVetoableChangeListener(vetoableChangeListener2);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = timeSeries1.getNextTimePeriod();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    jThermometer0.requestFocus();
    boolean b3 = jThermometer0.requestFocusInWindow();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    java.awt.Font font2 = null;
    // The following exception was thrown during execution in test generation
    try {
    jThermometer0.setTickLabelFont(font2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    java.awt.image.BufferedImage bufferedImage0 = null;
    java.io.OutputStream outputStream2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.encoders.EncoderUtil.writeBufferedImage(bufferedImage0, "Time", outputStream2, (float)'4', true);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    int i0 = java.text.DateFormat.HOUR_OF_DAY1_FIELD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 4);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    org.jfree.chart.axis.CompassFormat compassFormat0 = new org.jfree.chart.axis.CompassFormat();
    int i1 = compassFormat0.getMinimumIntegerDigits();
    int i2 = compassFormat0.getMaximumFractionDigits();
    java.util.Currency currency3 = null;
    // The following exception was thrown during execution in test generation
    try {
    compassFormat0.setCurrency(currency3);
      org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    int i0 = java.awt.image.ImageObserver.ERROR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 64);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    org.jfree.chart.plot.JThermometer jThermometer2 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle3 = jThermometer2.getVisibleRect();
    int i4 = jThermometer2.getShowAxisLocation();
    int i5 = jThermometer2.getWidth();
    java.awt.Component component6 = jThermometer0.add((java.awt.Component)jThermometer2);
    java.awt.Graphics graphics7 = null;
    jThermometer2.update(graphics7);
    
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
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

    int i0 = java.awt.Frame.NE_RESIZE_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 7);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b4 = jThermometer0.gotFocus(event1, (java.lang.Object)timeSeries3);
    jThermometer0.removeNotify();
    // The following exception was thrown during execution in test generation
    try {
    jThermometer0.remove(1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    int i0 = org.jfree.data.time.DynamicTimeSeriesCollection.START;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE7;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelAnchor0);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    org.jfree.data.xy.YIntervalSeries yIntervalSeries3 = new org.jfree.data.xy.YIntervalSeries((java.lang.Comparable)(byte)100, false, false);
    // The following exception was thrown during execution in test generation
    try {
    double d5 = yIntervalSeries3.getYLowValue((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues("hi!", "hi!", "");
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.time.TimePeriod timePeriod5 = timePeriodValues3.getTimePeriod((int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    org.jfree.chart.axis.CompassFormat compassFormat0 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType1 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b2 = compassFormat0.equals((java.lang.Object)lengthConstraintType1);
    java.lang.StringBuffer stringBuffer4 = null;
    java.text.FieldPosition fieldPosition5 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.StringBuffer stringBuffer6 = compassFormat0.format((long)6, stringBuffer4, fieldPosition5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    java.text.AttributedString attributedString0 = null;
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
    java.awt.Stroke stroke18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    java.awt.Color color19 = java.awt.Color.black;
    float[] f_array25 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array26 = color19.getRGBComponents(f_array25);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.LegendItem legendItem27 = new org.jfree.chart.LegendItem(attributedString0, "jfreechart-", "", "E", (java.awt.Shape)rectangle17, stroke18, (java.awt.Paint)color19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
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
    org.junit.Assert.assertNotNull(stroke18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array26);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    org.jfree.data.xml.RootHandler rootHandler0 = new org.jfree.data.xml.RootHandler();
    rootHandler0.endElement("E", "E", "jfreechart-");
    org.xml.sax.SAXParseException sAXParseException5 = null;
    rootHandler0.warning(sAXParseException5);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    int i2 = jThermometer0.getShowAxisLocation();
    javax.swing.plaf.PanelUI panelUI3 = jThermometer0.getUI();
    // The following exception was thrown during execution in test generation
    try {
    jThermometer0.setRange((double)100, (double)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(panelUI3);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    org.jfree.chart.plot.JThermometer jThermometer2 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle3 = jThermometer2.getVisibleRect();
    int i4 = jThermometer2.getShowAxisLocation();
    int i5 = jThermometer2.getWidth();
    java.awt.Component component6 = jThermometer0.add((java.awt.Component)jThermometer2);
    jThermometer0.repaint((int)(short)10, (int)'4', 0, (int)(byte)10);
    
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
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    double[][] d_array_array0 = new double[][] {  };
    double[][] d_array_array1 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array0, d_array_array1);
    org.jfree.data.general.PieDataset pieDataset4 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset2, (java.lang.Comparable)0.5d);
    org.jfree.chart.axis.NumberTickUnit numberTickUnit6 = new org.jfree.chart.axis.NumberTickUnit((double)10.0f);
    java.lang.Comparable[] comparable_array10 = new java.lang.Comparable[] { 10.0f, 64, 6, 10.0f };
    // The following exception was thrown during execution in test generation
    try {
    defaultIntervalCategoryDataset2.setCategoryKeys(comparable_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pieDataset4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparable_array10);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    org.jfree.data.xml.DatasetReader datasetReader0 = new org.jfree.data.xml.DatasetReader();

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    double d0 = org.jfree.chart.axis.CategoryAxis.DEFAULT_AXIS_MARGIN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d0 == 0.05d);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel14.setReshowDelay((int)(short)1);
    java.awt.Color color17 = java.awt.Color.WHITE;
    chartPanel14.setZoomOutlinePaint((java.awt.Paint)color17);
    java.awt.event.MouseEvent mouseEvent19 = null;
    // The following exception was thrown during execution in test generation
    try {
    chartPanel14.mouseMoved(mouseEvent19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color17);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    // The following exception was thrown during execution in test generation
    try {
    java.awt.Color color1 = java.awt.Color.decode("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    int i0 = java.text.DateFormat.MILLISECOND_FIELD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 8);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelAnchor0);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder0 = org.jfree.chart.plot.DatasetRenderingOrder.REVERSE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(datasetRenderingOrder0);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    org.jfree.ui.RectangleAnchor rectangleAnchor0 = null;
    org.jfree.text.TextBlockAnchor textBlockAnchor1 = null;
    org.jfree.chart.axis.CategoryLabelWidthType categoryLabelWidthType2 = org.jfree.chart.axis.CategoryLabelWidthType.RANGE;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition4 = new org.jfree.chart.axis.CategoryLabelPosition(rectangleAnchor0, textBlockAnchor1, categoryLabelWidthType2, (float)7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelWidthType2);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    java.awt.Paint paint0 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_PAINT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint0);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    org.jfree.ui.TextAnchor textAnchor0 = org.jfree.chart.annotations.TextAnnotation.DEFAULT_ROTATION_ANCHOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor0);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b4 = jThermometer0.gotFocus(event1, (java.lang.Object)timeSeries3);
    java.awt.Font font5 = jThermometer0.getTickLabelFont();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font5);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    org.jfree.data.time.TimeSeriesCollection timeSeriesCollection0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.time.TimeSeriesCollection timeSeriesCollection4 = org.jfree.data.time.MovingAverage.createMovingAverage(timeSeriesCollection0, "hi!", 0, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

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
    java.awt.Rectangle rectangle39 = jThermometer38.getVisibleRect();
    org.jfree.chart.JFreeChart jFreeChart40 = null;
    org.jfree.chart.ChartPanel chartPanel54 = new org.jfree.chart.ChartPanel(jFreeChart40, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel54.setReshowDelay((int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    jThermometer16.add((java.awt.Component)jThermometer38, (java.lang.Object)(short)1, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
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
    org.junit.Assert.assertNotNull(rectangle39);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

    org.jfree.chart.urls.URLUtilities uRLUtilities0 = new org.jfree.chart.urls.URLUtilities();

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    org.jfree.data.xy.YIntervalDataItem yIntervalDataItem4 = new org.jfree.data.xy.YIntervalDataItem((double)9, (double)(byte)1, (double)4, (double)(byte)0);
    double d5 = yIntervalDataItem4.getYHighValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

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
    boolean b27 = legendItem26.isLineVisible();
    
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
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel14.setReshowDelay((int)(short)1);
    int i17 = chartPanel14.getMinimumDrawWidth();
    java.awt.event.MouseEvent mouseEvent18 = null;
    // The following exception was thrown during execution in test generation
    try {
    chartPanel14.mouseClicked(mouseEvent18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 13);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelAnchor0);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    org.jfree.chart.block.LengthConstraintType lengthConstraintType0 = org.jfree.chart.block.LengthConstraintType.NONE;
    java.lang.String str1 = lengthConstraintType0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "LengthConstraintType.NONE"+ "'", str1.equals("LengthConstraintType.NONE"));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    org.jfree.chart.urls.StandardPieURLGenerator standardPieURLGenerator2 = new org.jfree.chart.urls.StandardPieURLGenerator("hi!", "LengthConstraintType.NONE");

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    org.jfree.chart.encoders.KeypointPNGEncoderAdapter keypointPNGEncoderAdapter0 = new org.jfree.chart.encoders.KeypointPNGEncoderAdapter();
    java.awt.image.BufferedImage bufferedImage1 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array2 = keypointPNGEncoderAdapter0.encode(bufferedImage1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    java.awt.Color color0 = java.awt.Color.YELLOW;
    float[] f_array1 = new float[] {  };
    // The following exception was thrown during execution in test generation
    try {
    float[] f_array2 = color0.getComponents(f_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array1);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    boolean b3 = jThermometer0.keyDown(event1, 100);
    java.awt.Event event4 = null;
    boolean b7 = jThermometer0.mouseEnter(event4, (int)(short)10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

    org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder0 = org.jfree.chart.plot.DatasetRenderingOrder.FORWARD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(datasetRenderingOrder0);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    int i0 = java.awt.Frame.CROSSHAIR_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    int i2 = jThermometer0.getShowAxisLocation();
    int i3 = jThermometer0.getDebugGraphicsOptions();
    jThermometer0.setInheritsPopupMenu(true);
    int i6 = jThermometer0.getY();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    java.awt.Color color0 = java.awt.Color.PINK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color0);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

    java.lang.String str0 = org.jfree.chart.urls.StandardXYURLGenerator.DEFAULT_SERIES_PARAMETER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "series"+ "'", str0.equals("series"));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    java.awt.Color color0 = java.awt.Color.ORANGE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color0);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    java.lang.Object obj0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.event.OverlayChangeEvent overlayChangeEvent1 = new org.jfree.chart.event.OverlayChangeEvent(obj0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

    java.lang.String str0 = org.jfree.chart.ChartPanel.ZOOM_IN_BOTH_COMMAND;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ZOOM_IN_BOTH"+ "'", str0.equals("ZOOM_IN_BOTH"));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

    double[][] d_array_array0 = new double[][] {  };
    double[][] d_array_array1 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array0, d_array_array1);
    java.util.List list3 = defaultIntervalCategoryDataset2.getCategories();
    org.jfree.data.KeyToGroupMap keyToGroupMap4 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.Range range5 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset2, keyToGroupMap4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

    java.util.TimeZone timeZone0 = null;
    org.jfree.chart.axis.SegmentedTimeline.DEFAULT_TIME_ZONE = timeZone0;

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

    int i0 = org.jfree.chart.axis.DateTickUnit.MONTH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

    org.jfree.chart.plot.CrosshairState crosshairState0 = new org.jfree.chart.plot.CrosshairState();
    crosshairState0.setCrosshairY((double)1L);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

    org.jfree.data.xy.YWithXInterval yWithXInterval3 = new org.jfree.data.xy.YWithXInterval((double)100, (double)10, (double)0);
    double d4 = yWithXInterval3.getXHigh();
    double d5 = yWithXInterval3.getXHigh();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b4 = jThermometer0.gotFocus(event1, (java.lang.Object)timeSeries3);
    java.awt.Graphics graphics5 = null;
    jThermometer0.printAll(graphics5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

    int i0 = java.text.DateFormat.DAY_OF_YEAR_FIELD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 10);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

    double[][] d_array_array0 = new double[][] {  };
    double[][] d_array_array1 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array0, d_array_array1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable comparable4 = defaultIntervalCategoryDataset2.getColumnKey((int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array1);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

    org.jfree.data.xy.YWithXInterval yWithXInterval3 = new org.jfree.data.xy.YWithXInterval((double)(byte)100, 0.05d, (double)100L);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

    org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double)'#', "ZOOM_RESET_RANGE", "", true);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

    org.jfree.data.xy.YIntervalSeries yIntervalSeries3 = new org.jfree.data.xy.YIntervalSeries((java.lang.Comparable)(byte)100, false, false);
    java.lang.Object obj4 = yIntervalSeries3.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b4 = jThermometer0.gotFocus(event1, (java.lang.Object)timeSeries3);
    jThermometer0.removeNotify();
    boolean b6 = jThermometer0.requestFocusInWindow();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

    java.lang.Class class3 = null;
    org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6, "hi!", "", class3);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    java.lang.String str0 = org.jfree.chart.ChartPanel.ZOOM_OUT_DOMAIN_COMMAND;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ZOOM_DOMAIN_BOTH"+ "'", str0.equals("ZOOM_DOMAIN_BOTH"));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline3 = new org.jfree.chart.axis.SegmentedTimeline((long)0, (int)(byte)-1, 3);
    segmentedTimeline3.setAdjustForDaylightSaving(false);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline3 = new org.jfree.chart.axis.SegmentedTimeline((long)0, (int)(byte)-1, 3);
    boolean b4 = segmentedTimeline3.getAdjustForDaylightSaving();
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.axis.SegmentedTimeline.Segment segment6 = segmentedTimeline3.getSegment((long)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

    int i0 = javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    java.awt.Color color1 = java.awt.Color.BLACK;
    org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator5 = new org.jfree.chart.util.DefaultShadowGenerator((int)(byte)100, color1, (float)0, (int)'4', (double)1.0f);
    double d6 = defaultShadowGenerator5.getAngle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 1.0d);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    jThermometer0.requestFocus();
    javax.swing.JPopupMenu jPopupMenu3 = jThermometer0.getComponentPopupMenu();
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    boolean b5 = jThermometer0.isAncestorOf((java.awt.Component)jThermometer4);
    jThermometer4.setSize((-4), 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jPopupMenu3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    org.jfree.chart.axis.DateTickMarkPosition dateTickMarkPosition0 = org.jfree.chart.axis.DateTickMarkPosition.MIDDLE;
    java.lang.String str1 = dateTickMarkPosition0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTickMarkPosition0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "DateTickMarkPosition.MIDDLE"+ "'", str1.equals("DateTickMarkPosition.MIDDLE"));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

    java.awt.Font font0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font0);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    int i2 = jThermometer0.getShowAxisLocation();
    int i3 = jThermometer0.getWidth();
    java.awt.Event event4 = null;
    boolean b7 = jThermometer0.mouseDown(event4, 10, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }

    org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double)' ', (double)0, 10.0d, (double)(byte)-1, (double)'4', (double)0.0f);
    double d7 = xYIntervalDataItem6.getXHighValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 10.0d);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

    org.jfree.chart.plot.CategoryCrosshairState categoryCrosshairState0 = new org.jfree.chart.plot.CategoryCrosshairState();
    org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions3 = categoryAxis2.getCategoryLabelPositions();
    org.jfree.chart.event.AxisChangeListener axisChangeListener4 = null;
    categoryAxis2.removeChangeListener(axisChangeListener4);
    org.jfree.data.xy.YIntervalDataItem yIntervalDataItem10 = new org.jfree.data.xy.YIntervalDataItem((double)9, (double)(byte)1, (double)4, (double)(byte)0);
    java.awt.Font font11 = categoryAxis2.getTickLabelFont((java.lang.Comparable)yIntervalDataItem10);
    org.jfree.chart.plot.PlotOrientation plotOrientation17 = org.jfree.chart.plot.PlotOrientation.VERTICAL;
    categoryCrosshairState0.updateCrosshairPoint((java.lang.Comparable)yIntervalDataItem10, (java.lang.Comparable)52, (double)10.0f, (int)'4', (double)7, 0.0d, plotOrientation17);
    java.lang.Object obj19 = yIntervalDataItem10.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelPositions3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(plotOrientation17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

    int i0 = org.jfree.chart.ChartPanel.DEFAULT_MAXIMUM_DRAW_HEIGHT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 768);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions2 = categoryAxis1.getCategoryLabelPositions();
    org.jfree.chart.event.AxisChangeListener axisChangeListener3 = null;
    categoryAxis1.removeChangeListener(axisChangeListener3);
    org.jfree.data.xy.YIntervalDataItem yIntervalDataItem9 = new org.jfree.data.xy.YIntervalDataItem((double)9, (double)(byte)1, (double)4, (double)(byte)0);
    java.awt.Font font10 = categoryAxis1.getTickLabelFont((java.lang.Comparable)yIntervalDataItem9);
    double d11 = yIntervalDataItem9.getYValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelPositions2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

    double[][] d_array_array0 = new double[][] {  };
    double[][] d_array_array1 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array0, d_array_array1);
    org.jfree.data.general.PieDataset pieDataset4 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset2, (java.lang.Comparable)0.5d);
    org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
    defaultIntervalCategoryDataset2.removeChangeListener(datasetChangeListener5);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable comparable8 = defaultIntervalCategoryDataset2.getSeriesKey((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pieDataset4);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b4 = jThermometer0.gotFocus(event1, (java.lang.Object)timeSeries3);
    org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries3.addOrUpdate(regularTimePeriod5, (double)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = null;
    org.jfree.chart.renderer.RendererState rendererState1 = new org.jfree.chart.renderer.RendererState(plotRenderingInfo0);
    org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = rendererState1.getInfo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(plotRenderingInfo2);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

    org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.time.DynamicTimeSeriesCollection dynamicTimeSeriesCollection3 = new org.jfree.data.time.DynamicTimeSeriesCollection((int)(byte)-1, 13, regularTimePeriod2);
      org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    double[][] d_array_array2 = new double[][] {  };
    double[][] d_array_array3 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset4 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array2, d_array_array3);
    org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "jfreechart-", d_array_array3);
    org.jfree.data.KeyToGroupMap keyToGroupMap6 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset5, keyToGroupMap6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryDataset5);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    org.jfree.chart.plot.PolarAxisLocation polarAxisLocation0 = org.jfree.chart.plot.PolarAxisLocation.NORTH_LEFT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(polarAxisLocation0);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    double[][] d_array_array0 = new double[][] {  };
    double[][] d_array_array1 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array0, d_array_array1);
    org.jfree.data.general.SeriesDataset[] seriesDataset_array3 = new org.jfree.data.general.SeriesDataset[] { defaultIntervalCategoryDataset2 };
    org.jfree.data.general.CombinedDataset combinedDataset4 = new org.jfree.data.general.CombinedDataset(seriesDataset_array3);
    org.jfree.data.Range range5 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset)combinedDataset4);
    // The following exception was thrown during execution in test generation
    try {
    double d8 = combinedDataset4.getCloseValue(8, (int)(byte)-1);
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
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    org.jfree.chart.plot.PolarAxisLocation polarAxisLocation0 = org.jfree.chart.plot.PolarAxisLocation.NORTH_RIGHT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(polarAxisLocation0);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

    java.awt.Color color0 = java.awt.Color.DARK_GRAY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color0);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    jThermometer0.revalidate();
    java.lang.Object obj3 = jThermometer0.getTreeLock();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    org.jfree.data.xy.XYIntervalSeries xYIntervalSeries1 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    double d3 = xYIntervalSeries1.getXHighValue(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

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
    double d15 = combinedDataset11.getYValue(7, (int)'#');
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
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

    org.jfree.chart.plot.JThermometer jThermometer1 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle2 = jThermometer1.getVisibleRect();
    jThermometer1.requestFocus();
    javax.swing.JPopupMenu jPopupMenu4 = jThermometer1.getComponentPopupMenu();
    java.beans.PropertyChangeListener[] propertyChangeListener_array6 = jThermometer1.getPropertyChangeListeners("jfreechart-");
    java.awt.Paint[] paint_array7 = org.jfree.chart.ChartColor.createDefaultPaintArray();
    java.awt.Paint[] paint_array8 = org.jfree.chart.ChartColor.createDefaultPaintArray();
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.contour.DefaultContourDataset defaultContourDataset9 = new org.jfree.data.contour.DefaultContourDataset((java.lang.Comparable)"", (java.lang.Object[])propertyChangeListener_array6, (java.lang.Object[])paint_array7, (java.lang.Object[])paint_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jPopupMenu4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint_array8);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    java.text.AttributedString attributedString0 = null;
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
    java.lang.String str31 = legendItem30.getDescription();
    org.jfree.chart.axis.CategoryAxis categoryAxis33 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer36 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle37 = jThermometer36.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge38 = null;
    double d39 = categoryAxis33.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle37, rectangleEdge38);
    legendItem30.setShape((java.awt.Shape)rectangle37);
    java.awt.Color color41 = java.awt.Color.YELLOW;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.LegendItem legendItem42 = new org.jfree.chart.LegendItem(attributedString0, "Time", "ZOOM_DOMAIN_BOTH", "ZOOM_RESET_DOMAIN", (java.awt.Shape)rectangle37, (java.awt.Paint)color41);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "ZOOM_RESET_RANGE"+ "'", str31.equals("ZOOM_RESET_RANGE"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d39 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color41);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

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
    // The following exception was thrown during execution in test generation
    try {
    timeSeries3.delete((int)(byte)0, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
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

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

    org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues("hi!", "hi!", "");
    int i4 = timePeriodValues3.getItemCount();
    org.jfree.data.time.TimePeriodValue timePeriodValue5 = null;
    // The following exception was thrown during execution in test generation
    try {
    timePeriodValues3.add(timePeriodValue5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }

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
    categoryAxis1.setVisible(true);
    
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

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    boolean b3 = jThermometer0.keyDown(event1, 100);
    jThermometer0.setSize((int)(short)100, 8);
    java.lang.Object obj7 = jThermometer0.getTreeLock();
    java.awt.Dimension dimension8 = jThermometer0.preferredSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }

    int i0 = java.awt.print.Printable.NO_SUCH_PAGE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }

    org.jfree.data.xy.VectorSeries vectorSeries1 = new org.jfree.data.xy.VectorSeries((java.lang.Comparable)0.2d);
    // The following exception was thrown during execution in test generation
    try {
    double d3 = vectorSeries1.getVectorXValue(8);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }

    org.jfree.chart.axis.CompassFormat compassFormat0 = new org.jfree.chart.axis.CompassFormat();
    int i1 = compassFormat0.getMinimumIntegerDigits();
    java.lang.String str3 = compassFormat0.format((long)100);
    java.text.ParsePosition parsePosition5 = null;
    java.lang.Number number6 = compassFormat0.parse("ZOOM_DOMAIN_BOTH", parsePosition5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "E"+ "'", str3.equals("E"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(number6);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }

    org.jfree.chart.urls.StandardCategoryURLGenerator standardCategoryURLGenerator1 = new org.jfree.chart.urls.StandardCategoryURLGenerator("ZOOM_IN_BOTH");

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }

    org.jfree.data.xy.YIntervalSeries yIntervalSeries3 = new org.jfree.data.xy.YIntervalSeries((java.lang.Comparable)(byte)100, false, false);
    // The following exception was thrown during execution in test generation
    try {
    double d5 = yIntervalSeries3.getYLowValue((int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }

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
    org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries8.addOrUpdate(timeSeriesDataItem12);
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

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel14.setReshowDelay((int)(short)1);
    java.awt.Color color17 = java.awt.Color.WHITE;
    chartPanel14.setZoomOutlinePaint((java.awt.Paint)color17);
    // The following exception was thrown during execution in test generation
    try {
    chartPanel14.restoreAutoBounds();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color17);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }

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
    java.awt.Color color20 = org.jfree.chart.ChartColor.LIGHT_YELLOW;
    int i21 = color20.getRGB();
    java.awt.Color color23 = java.awt.Color.black;
    org.jfree.chart.axis.CategoryAxis categoryAxis25 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer28 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle29 = jThermometer28.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge30 = null;
    double d31 = categoryAxis25.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle29, rectangleEdge30);
    categoryAxis25.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis25.setTickMarkStroke(stroke34);
    org.jfree.chart.plot.JThermometer jThermometer41 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event42 = null;
    boolean b44 = jThermometer41.keyDown(event42, 100);
    jThermometer41.setSize((int)(short)100, 8);
    java.awt.Dimension dimension48 = jThermometer41.minimumSize();
    java.awt.Dimension dimension49 = jThermometer41.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener50 = null;
    jThermometer41.removeHierarchyBoundsListener(hierarchyBoundsListener50);
    org.jfree.chart.plot.JThermometer jThermometer52 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle53 = jThermometer52.getVisibleRect();
    java.awt.Rectangle rectangle54 = jThermometer41.getBounds(rectangle53);
    java.awt.Color color55 = java.awt.Color.black;
    float[] f_array61 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array62 = color55.getRGBComponents(f_array61);
    org.jfree.chart.LegendItem legendItem63 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle54, (java.awt.Paint)color55);
    java.awt.Stroke stroke64 = null;
    java.awt.Color color66 = java.awt.Color.BLACK;
    org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator70 = new org.jfree.chart.util.DefaultShadowGenerator((int)(byte)100, color66, (float)0, (int)'4', (double)1.0f);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.LegendItem legendItem71 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "series", "ZOOM_RESET_RANGE", "hi!", false, (java.awt.Shape)rectangle18, false, (java.awt.Paint)color20, true, (java.awt.Paint)color23, stroke34, false, (java.awt.Shape)rectangle54, stroke64, (java.awt.Paint)color66);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    org.junit.Assert.assertNotNull(color20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-192));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color66);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }

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
    long long18 = dateRange7.getLowerMillis();
    
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
    org.junit.Assert.assertTrue(long18 == 0L);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }

    org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions2 = categoryAxis1.getCategoryLabelPositions();
    double d3 = categoryAxis1.getUpperMargin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelPositions2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.05d);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }

    org.jfree.chart.HashUtilities hashUtilities0 = new org.jfree.chart.HashUtilities();

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }

    int i0 = java.awt.Frame.SE_RESIZE_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 5);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }

    org.jfree.chart.urls.TimeSeriesURLGenerator timeSeriesURLGenerator0 = new org.jfree.chart.urls.TimeSeriesURLGenerator();
    java.lang.String str1 = timeSeriesURLGenerator0.getPrefix();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "index.html"+ "'", str1.equals("index.html"));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }

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
    org.jfree.chart.plot.JThermometer jThermometer39 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event40 = null;
    org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b43 = jThermometer39.gotFocus(event40, (java.lang.Object)timeSeries42);
    jThermometer39.removeNotify();
    chartPanel14.remove((java.awt.Component)jThermometer39);
    jThermometer39.setName("DateTickMarkPosition.MIDDLE");
    
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
    org.junit.Assert.assertTrue(b43 == false);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }

    int i0 = java.awt.Transparency.OPAQUE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }

    java.io.File file0 = null;
    javax.servlet.http.HttpServletResponse httpServletResponse1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.servlet.ServletUtilities.sendTempFile(file0, httpServletResponse1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }

    // The following exception was thrown during execution in test generation
    try {
    java.util.ResourceBundle resourceBundle1 = java.util.ResourceBundle.getBundle("DateTickMarkPosition.MIDDLE");
      org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }

    org.jfree.data.xy.VectorSeries vectorSeries1 = new org.jfree.data.xy.VectorSeries((java.lang.Comparable)0.2d);
    // The following exception was thrown during execution in test generation
    try {
    double d3 = vectorSeries1.getVectorYValue(5);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }

    org.jfree.data.general.DatasetGroup datasetGroup1 = new org.jfree.data.general.DatasetGroup("Time");
    java.lang.String str2 = datasetGroup1.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Time"+ "'", str2.equals("Time"));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    jThermometer0.revalidate();
    jThermometer0.setSubrangeInfo(0, (double)8, (double)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }

    org.jfree.chart.encoders.EncoderUtil encoderUtil0 = new org.jfree.chart.encoders.EncoderUtil();

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }

    org.jfree.data.time.TimePeriodAnchor timePeriodAnchor0 = org.jfree.data.time.TimePeriodAnchor.END;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timePeriodAnchor0);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }

    org.jfree.data.xy.XIntervalDataItem xIntervalDataItem4 = new org.jfree.data.xy.XIntervalDataItem((double)(byte)-1, 100.0d, 0.0d, (double)100.0f);
    double d5 = xIntervalDataItem4.getYValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 100.0d);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    int i2 = jThermometer0.getShowAxisLocation();
    java.awt.FocusTraversalPolicy focusTraversalPolicy3 = jThermometer0.getFocusTraversalPolicy();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(focusTraversalPolicy3);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }

    int i0 = org.jfree.chart.axis.DateTickUnit.MILLISECOND;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 6);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }

    org.jfree.chart.plot.PlotOrientation plotOrientation0 = org.jfree.chart.plot.PlotOrientation.HORIZONTAL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(plotOrientation0);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }

    org.jfree.data.general.DefaultKeyedValueDataset defaultKeyedValueDataset0 = new org.jfree.data.general.DefaultKeyedValueDataset();

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }

    org.jfree.data.time.MovingAverage movingAverage0 = new org.jfree.data.time.MovingAverage();

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }

    float f0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_OUTSIDE_LENGTH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 2.0f);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }

    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.jdbc.JDBCXYDataset jDBCXYDataset4 = new org.jfree.data.jdbc.JDBCXYDataset("ZOOM_DOMAIN_BOTH", "hi!", "Time", "jfreechart-");
      org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }

    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    java.awt.Graphics2D graphics2D1 = null;
    org.jfree.chart.plot.XYPlot xYPlot2 = null;
    org.jfree.chart.axis.ValueAxis valueAxis3 = null;
    org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double)' ');
    double d6 = valueMarker5.getValue();
    java.awt.geom.Rectangle2D rectangle2D7 = null;
    // The following exception was thrown during execution in test generation
    try {
    xYShapeRenderer0.drawRangeMarker(graphics2D1, xYPlot2, valueAxis3, (org.jfree.chart.plot.Marker)valueMarker5, rectangle2D7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 32.0d);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }

    org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues("hi!", "hi!", "");
    int i4 = timePeriodValues3.getItemCount();
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.time.TimePeriodValue timePeriodValue6 = timePeriodValues3.getDataItem(10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }

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
    java.lang.Comparable comparable31 = legendItem26.getSeriesKey();
    
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
    org.junit.Assert.assertNull(comparable31);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }

    boolean b0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABELS_VISIBLE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b0 == true);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }

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
    java.lang.String str18 = lengthConstraintType5.toString();
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "RectangleConstraintType.RANGE"+ "'", str18.equals("RectangleConstraintType.RANGE"));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }

    java.util.TimeZone timeZone0 = org.jfree.chart.axis.SegmentedTimeline.DEFAULT_TIME_ZONE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(timeZone0);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }

    int i0 = java.awt.image.ImageObserver.ABORT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 128);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }

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
    java.awt.Insets insets41 = chartPanel14.insets();
    
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
    org.junit.Assert.assertNotNull(insets41);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    int i2 = jThermometer0.getShowAxisLocation();
    java.awt.Event event3 = null;
    boolean b6 = jThermometer0.mouseMove(event3, 1, (int)' ');
    jThermometer0.firePropertyChange("hi!", 0, 2);
    java.awt.Graphics graphics11 = null;
    jThermometer0.update(graphics11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }

    java.lang.Comparable comparable0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.ComparableObjectSeries comparableObjectSeries1 = new org.jfree.data.ComparableObjectSeries(comparable0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }

    org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset defaultBoxAndWhiskerXYDataset1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset((java.lang.Comparable)(-1));
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number4 = defaultBoxAndWhiskerXYDataset1.getMeanValue(10, (-557783151));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }

    org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    java.beans.VetoableChangeListener vetoableChangeListener2 = null;
    timeSeries1.addVetoableChangeListener(vetoableChangeListener2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number5 = timeSeries1.getValue((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }

    org.jfree.data.time.TimeSeriesCollection timeSeriesCollection0 = new org.jfree.data.time.TimeSeriesCollection();
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.time.TimeSeries timeSeries2 = timeSeriesCollection0.getSeries((-192));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }

    org.jfree.chart.axis.DateTickUnitType dateTickUnitType0 = org.jfree.chart.axis.DateTickUnitType.MILLISECOND;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTickUnitType0);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }

    org.jfree.chart.axis.QuarterDateFormat quarterDateFormat0 = new org.jfree.chart.axis.QuarterDateFormat();
    quarterDateFormat0.setLenient(true);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Date date4 = quarterDateFormat0.parse("series");
      org.junit.Assert.fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }

    int i0 = org.jfree.data.time.DynamicTimeSeriesCollection.END;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }

    org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues("hi!", "hi!", "");
    int i4 = timePeriodValues3.getMinEndIndex();
    org.jfree.chart.plot.JThermometer jThermometer5 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle6 = jThermometer5.getVisibleRect();
    jThermometer5.requestFocus();
    boolean b8 = timePeriodValues3.equals((java.lang.Object)jThermometer5);
    double[][] d_array_array9 = new double[][] {  };
    double[][] d_array_array10 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array9, d_array_array10);
    org.jfree.data.general.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset11, (java.lang.Comparable)0.5d);
    boolean b14 = timePeriodValues3.equals((java.lang.Object)pieDataset13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pieDataset13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }

    int i0 = java.awt.Frame.WAIT_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 3);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }

    org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle5 = jThermometer4.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge6 = null;
    double d7 = categoryAxis1.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle5, rectangleEdge6);
    categoryAxis1.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis1.setTickMarkStroke(stroke10);
    categoryAxis1.setMinorTickMarkInsideLength((float)2);
    float f14 = categoryAxis1.getMaximumCategoryLabelWidthRatio();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f14 == 0.0f);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }

    java.util.TimeZone timeZone0 = null;
    java.util.Locale locale1 = javax.swing.JComponent.getDefaultLocale();
    boolean[] b_array3 = new boolean[] {  };
    org.jfree.chart.axis.QuarterDateFormat quarterDateFormat4 = new org.jfree.chart.axis.QuarterDateFormat();
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.axis.MonthDateFormat monthDateFormat5 = new org.jfree.chart.axis.MonthDateFormat(timeZone0, locale1, 0, b_array3, (java.text.DateFormat)quarterDateFormat4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }

    org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues("hi!", "hi!", "");
    int i4 = timePeriodValues3.getMinEndIndex();
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.time.TimePeriod timePeriod6 = timePeriodValues3.getTimePeriod((int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.ChartTransferable chartTransferable8 = new org.jfree.chart.ChartTransferable(jFreeChart0, 4, (int)' ', (int)(byte)1, 0, (int)(byte)-1, 1, false);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }

    int i0 = java.text.DateFormat.LONG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }

    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline0 = org.jfree.chart.axis.SegmentedTimeline.newFifteenMinuteTimeline();
    org.jfree.chart.axis.SegmentedTimeline.Segment segment2 = segmentedTimeline0.getSegment((long)3);
    boolean b4 = segment2.contains((long)(-4));
    org.jfree.chart.plot.JThermometer jThermometer5 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event6 = null;
    boolean b8 = jThermometer5.keyDown(event6, 100);
    jThermometer5.setSize((int)(short)100, 8);
    jThermometer5.setToolTipText("ZOOM_RESET_RANGE");
    // The following exception was thrown during execution in test generation
    try {
    int i14 = segment2.compareTo((java.lang.Object)"ZOOM_RESET_RANGE");
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(segmentedTimeline0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(segment2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }

    int i0 = javax.swing.WindowConstants.EXIT_ON_CLOSE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 3);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }

    int i0 = org.jfree.chart.axis.ColorBar.DEFAULT_OUTERGAP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    boolean b3 = jThermometer0.keyDown(event1, 100);
    jThermometer0.setSize((int)(short)100, 8);
    java.awt.Dimension dimension7 = jThermometer0.minimumSize();
    java.awt.Dimension dimension8 = jThermometer0.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
    jThermometer0.removeHierarchyBoundsListener(hierarchyBoundsListener9);
    javax.swing.InputMap inputMap11 = jThermometer0.getInputMap();
    // The following exception was thrown during execution in test generation
    try {
    jThermometer0.setRange((double)(byte)100, (double)0L);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }

    org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset defaultBoxAndWhiskerXYDataset1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset((java.lang.Comparable)(-1));
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number4 = defaultBoxAndWhiskerXYDataset1.getQ3Value((int)(short)10, 4);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }

    java.lang.String str0 = org.jfree.chart.servlet.ServletUtilities.getTempOneTimeFilePrefix();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + ""+ "'", str0.equals(""));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }

    org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)100.0f);
    org.jfree.chart.plot.JThermometer jThermometer2 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event3 = null;
    org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b6 = jThermometer2.gotFocus(event3, (java.lang.Object)timeSeries5);
    java.lang.Class class7 = timeSeries5.getTimePeriodClass();
    java.util.List list8 = timeSeries5.getItems();
    org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = timeSeries9.getNextTimePeriod();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }

    java.lang.Number number1 = null;
    org.jfree.data.general.DefaultKeyedValueDataset defaultKeyedValueDataset2 = new org.jfree.data.general.DefaultKeyedValueDataset((java.lang.Comparable)0.0f, number1);
    java.lang.Number number3 = defaultKeyedValueDataset2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(number3);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    javax.servlet.http.HttpSession httpSession3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str4 = org.jfree.chart.servlet.ServletUtilities.saveChartAsPNG(jFreeChart0, 10, (int)(short)-1, httpSession3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }

    org.jfree.text.TextBox textBox3 = null;
    org.jfree.chart.plot.PieLabelRecord pieLabelRecord7 = new org.jfree.chart.plot.PieLabelRecord((java.lang.Comparable)(-1L), (double)10, (double)10.0f, textBox3, (double)(byte)10, (double)0L, (double)0.5f);
    double d8 = pieLabelRecord7.getLabelHeight();
    java.lang.Comparable comparable9 = pieLabelRecord7.getKey();
    pieLabelRecord7.setBaseY((double)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + comparable9 + "' != '" + (-1L)+ "'", comparable9.equals((-1L)));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }

    org.jfree.data.xy.YIntervalDataItem yIntervalDataItem4 = new org.jfree.data.xy.YIntervalDataItem((double)100, (double)100, (double)13, (double)' ');
    org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)100);
    int i6 = xYSeries5.getItemCount();
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries5.remove((-4));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }

    java.awt.Frame[] frame_array1 = java.awt.Frame.getFrames();
    java.awt.Paint[] paint_array2 = org.jfree.chart.ChartColor.createDefaultPaintArray();
    double[][] d_array_array5 = new double[][] {  };
    double[][] d_array_array6 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array5, d_array_array6);
    org.jfree.data.category.CategoryDataset categoryDataset8 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "jfreechart-", d_array_array6);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.contour.DefaultContourDataset defaultContourDataset9 = new org.jfree.data.contour.DefaultContourDataset((java.lang.Comparable)10L, (java.lang.Object[])frame_array1, (java.lang.Object[])paint_array2, (java.lang.Object[])d_array_array6);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(frame_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryDataset8);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }

    org.jfree.chart.renderer.xy.StandardXYBarPainter standardXYBarPainter0 = new org.jfree.chart.renderer.xy.StandardXYBarPainter();
    java.awt.Graphics2D graphics2D1 = null;
    org.jfree.chart.renderer.xy.XYBarRenderer xYBarRenderer2 = null;
    org.jfree.chart.axis.CategoryAxis categoryAxis10 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer13 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle14 = jThermometer13.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge15 = null;
    double d16 = categoryAxis10.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle14, rectangleEdge15);
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
    org.jfree.chart.axis.CategoryAxis categoryAxis45 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer48 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle49 = jThermometer48.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge50 = null;
    double d51 = categoryAxis45.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle49, rectangleEdge50);
    categoryAxis45.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke54 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis45.setTickMarkStroke(stroke54);
    org.jfree.chart.JFreeChart jFreeChart56 = null;
    org.jfree.chart.ChartPanel chartPanel70 = new org.jfree.chart.ChartPanel(jFreeChart56, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel70.setReshowDelay((int)(short)1);
    java.awt.Color color73 = java.awt.Color.WHITE;
    chartPanel70.setZoomOutlinePaint((java.awt.Paint)color73);
    org.jfree.chart.LegendItem legendItem75 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle14, (java.awt.Paint)color35, stroke54, (java.awt.Paint)color73);
    org.jfree.ui.RectangleEdge rectangleEdge76 = null;
    // The following exception was thrown during execution in test generation
    try {
    standardXYBarPainter0.paintBar(graphics2D1, xYBarRenderer2, 10, (int)(byte)100, (java.awt.geom.RectangularShape)rectangle14, rectangleEdge76);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
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
    org.junit.Assert.assertNotNull(rectangle49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d51 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color73);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    jThermometer0.revalidate();
    boolean b3 = jThermometer0.getVerifyInputWhenFocusTarget();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    boolean b3 = jThermometer0.keyDown(event1, 100);
    jThermometer0.setVisible(false);
    org.jfree.chart.plot.JThermometer jThermometer6 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event7 = null;
    boolean b9 = jThermometer6.keyDown(event7, 100);
    jThermometer6.setSize((int)(short)100, 8);
    org.jfree.chart.plot.JThermometer jThermometer13 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event14 = null;
    boolean b16 = jThermometer13.keyDown(event14, 100);
    jThermometer13.setSize((int)(short)100, 8);
    java.awt.Dimension dimension20 = jThermometer13.minimumSize();
    java.awt.Dimension dimension21 = jThermometer13.preferredSize();
    java.awt.Dimension dimension22 = jThermometer6.getSize(dimension21);
    jThermometer0.resize(dimension22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension22);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }

    java.util.ResourceBundle.clearCache();

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    javax.servlet.http.HttpSession httpSession3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str4 = org.jfree.chart.servlet.ServletUtilities.saveChartAsPNG(jFreeChart0, (int)(byte)1, (-557783151), httpSession3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }

    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline3 = new org.jfree.chart.axis.SegmentedTimeline((long)0, (int)(byte)-1, 3);
    java.util.Date date5 = segmentedTimeline3.getDate((long)'a');
    // The following exception was thrown during execution in test generation
    try {
    long long7 = segmentedTimeline3.toTimelineValue(100L);
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date5);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }

    org.jfree.chart.plot.CategoryCrosshairState categoryCrosshairState0 = new org.jfree.chart.plot.CategoryCrosshairState();
    org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions3 = categoryAxis2.getCategoryLabelPositions();
    org.jfree.chart.event.AxisChangeListener axisChangeListener4 = null;
    categoryAxis2.removeChangeListener(axisChangeListener4);
    org.jfree.data.xy.YIntervalDataItem yIntervalDataItem10 = new org.jfree.data.xy.YIntervalDataItem((double)9, (double)(byte)1, (double)4, (double)(byte)0);
    java.awt.Font font11 = categoryAxis2.getTickLabelFont((java.lang.Comparable)yIntervalDataItem10);
    org.jfree.chart.plot.PlotOrientation plotOrientation17 = org.jfree.chart.plot.PlotOrientation.VERTICAL;
    categoryCrosshairState0.updateCrosshairPoint((java.lang.Comparable)yIntervalDataItem10, (java.lang.Comparable)52, (double)10.0f, (int)'4', (double)7, 0.0d, plotOrientation17);
    double d19 = yIntervalDataItem10.getYValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelPositions3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(plotOrientation17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 1.0d);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }

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
    legendItem26.setSeriesIndex((int)' ');
    
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

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }

    org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset defaultBoxAndWhiskerXYDataset1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset((java.lang.Comparable)(-1));
    // The following exception was thrown during execution in test generation
    try {
    java.util.List list4 = defaultBoxAndWhiskerXYDataset1.getOutliers((int)'a', 10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }

    java.io.File file0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.category.CategoryDataset categoryDataset1 = org.jfree.data.xml.DatasetReader.readCategoryDatasetFromXML(file0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }

    org.jfree.data.xy.XYIntervalSeries xYIntervalSeries1 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.ComparableObjectItem comparableObjectItem3 = xYIntervalSeries1.getDataItem((-4));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }

    java.util.TimeZone timeZone0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.axis.MonthDateFormat monthDateFormat1 = new org.jfree.chart.axis.MonthDateFormat(timeZone0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b4 = jThermometer0.gotFocus(event1, (java.lang.Object)timeSeries3);
    boolean b5 = jThermometer0.requestDefaultFocus();
    boolean b6 = jThermometer0.isCursorSet();
    java.awt.Container container7 = jThermometer0.getTopLevelAncestor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container7);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }

    org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)100.0f);
    org.jfree.chart.plot.JThermometer jThermometer2 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event3 = null;
    org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b6 = jThermometer2.gotFocus(event3, (java.lang.Object)timeSeries5);
    java.lang.Class class7 = timeSeries5.getTimePeriodClass();
    java.util.List list8 = timeSeries5.getItems();
    org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
    org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
    java.lang.Number number11 = null;
    // The following exception was thrown during execution in test generation
    try {
    timeSeries5.update(regularTimePeriod10, number11);
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
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }

    java.lang.Number number2 = null;
    double[][] d_array_array8 = new double[][] {  };
    double[][] d_array_array9 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset10 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array8, d_array_array9);
    org.jfree.data.general.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset10, (java.lang.Comparable)0.5d);
    org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
    defaultIntervalCategoryDataset10.removeChangeListener(datasetChangeListener13);
    java.util.List list15 = defaultIntervalCategoryDataset10.getCategories();
    org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem16 = new org.jfree.data.statistics.BoxAndWhiskerItem((java.lang.Number)6, (java.lang.Number)(-143), number2, (java.lang.Number)1.0f, (java.lang.Number)(byte)1, (java.lang.Number)(-1L), (java.lang.Number)7, (java.lang.Number)1.0d, list15);
    java.lang.Number number17 = boxAndWhiskerItem16.getQ1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pieDataset12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(number17);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }

    org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues("hi!", "hi!", "");
    int i4 = timePeriodValues3.getMinEndIndex();
    int i5 = timePeriodValues3.getMaxStartIndex();
    // The following exception was thrown during execution in test generation
    try {
    timePeriodValues3.delete(2, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    int i2 = jThermometer0.getShowAxisLocation();
    java.awt.Event event3 = null;
    boolean b6 = jThermometer0.mouseMove(event3, 1, (int)' ');
    boolean b7 = jThermometer0.isOpaque();
    jThermometer0.list();
    jThermometer0.updateUI();
    
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
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }

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
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries3.getDataItem((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
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

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }

    java.awt.Window[] window_array0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(window_array0);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b4 = jThermometer0.gotFocus(event1, (java.lang.Object)timeSeries3);
    java.lang.Class class5 = timeSeries3.getTimePeriodClass();
    org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
    // The following exception was thrown during execution in test generation
    try {
    timeSeries3.add(regularTimePeriod6, (java.lang.Number)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class5);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }

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
    java.lang.String str30 = legendItem26.getLabel();
    
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
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }

    org.jfree.data.time.TimeSeriesCollection timeSeriesCollection0 = new org.jfree.data.time.TimeSeriesCollection();
    java.util.List list1 = timeSeriesCollection0.getSeries();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number4 = timeSeriesCollection0.getX(2, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list1);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }

    org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double)(-1.0f), "ZOOM_IN_BOTH", "E", false);
    java.text.NumberFormat numberFormat5 = logFormat4.getExponentFormat();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(numberFormat5);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }

    org.jfree.ui.RectangleAnchor rectangleAnchor0 = null;
    org.jfree.text.TextBlockAnchor textBlockAnchor1 = null;
    org.jfree.chart.axis.CategoryLabelWidthType categoryLabelWidthType2 = org.jfree.chart.axis.CategoryLabelWidthType.RANGE;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition4 = new org.jfree.chart.axis.CategoryLabelPosition(rectangleAnchor0, textBlockAnchor1, categoryLabelWidthType2, (float)128);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelWidthType2);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    int i2 = jThermometer0.getShowAxisLocation();
    java.awt.Event event3 = null;
    boolean b6 = jThermometer0.mouseMove(event3, 1, (int)' ');
    jThermometer0.firePropertyChange("hi!", 0, 2);
    javax.swing.KeyStroke keyStroke11 = null;
    jThermometer0.unregisterKeyboardAction(keyStroke11);
    org.jfree.chart.plot.JThermometer jThermometer13 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle14 = jThermometer13.getVisibleRect();
    int i15 = jThermometer13.getShowAxisLocation();
    java.awt.Event event16 = null;
    boolean b19 = jThermometer13.mouseMove(event16, 1, (int)' ');
    boolean b20 = jThermometer13.isOpaque();
    org.jfree.chart.plot.JThermometer jThermometer21 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event22 = null;
    boolean b24 = jThermometer21.keyDown(event22, 100);
    jThermometer21.setSize((int)(short)100, 8);
    org.jfree.chart.plot.JThermometer jThermometer28 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event29 = null;
    boolean b31 = jThermometer28.keyDown(event29, 100);
    jThermometer28.setSize((int)(short)100, 8);
    java.awt.Dimension dimension35 = jThermometer28.minimumSize();
    java.awt.Dimension dimension36 = jThermometer28.preferredSize();
    java.awt.Dimension dimension37 = jThermometer21.getSize(dimension36);
    // The following exception was thrown during execution in test generation
    try {
    jThermometer0.add((java.awt.Component)jThermometer13, (java.lang.Object)jThermometer21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension37);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }

    org.jfree.data.resources.DataPackageResources_fr dataPackageResources_fr0 = new org.jfree.data.resources.DataPackageResources_fr();
    java.util.Locale locale1 = dataPackageResources_fr0.getLocale();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(locale1);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }

    org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues("ZOOM_RESET_RANGE", "ZOOM_RESET_DOMAIN", "");
    org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy(100, 100);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number8 = timePeriodValues3.getValue(8);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timePeriodValues6);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }

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
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.imagemap.ImageMapUtilities.writeImageMap(printWriter0, "E", chartRenderingInfo41);
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
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }

    org.jfree.data.xml.RootHandler rootHandler0 = new org.jfree.data.xml.RootHandler();
    rootHandler0.unparsedEntityDecl("DateTickMarkPosition.MIDDLE", "series", "series", "DateTickMarkPosition.MIDDLE");

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }

    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.encoders.ImageEncoder imageEncoder1 = org.jfree.chart.encoders.ImageEncoderFactory.newInstance("Time");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }

    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline0 = org.jfree.chart.axis.SegmentedTimeline.newMondayThroughFridayTimeline();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(segmentedTimeline0);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }

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
    java.awt.Graphics graphics39 = null;
    java.awt.print.PageFormat pageFormat40 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i42 = chartPanel14.print(graphics39, pageFormat40, (int)(short)0);
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
    org.junit.Assert.assertNotNull(paint38);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }

    java.lang.Comparable[] comparable_array0 = new java.lang.Comparable[] {  };
    org.jfree.chart.axis.NumberTickUnit numberTickUnit2 = new org.jfree.chart.axis.NumberTickUnit((double)10.0f);
    org.jfree.chart.axis.CategoryLabelWidthType categoryLabelWidthType3 = org.jfree.chart.axis.CategoryLabelWidthType.RANGE;
    int i4 = numberTickUnit2.compareTo((java.lang.Object)categoryLabelWidthType3);
    org.jfree.text.TextBox textBox10 = null;
    org.jfree.chart.plot.PieLabelRecord pieLabelRecord14 = new org.jfree.chart.plot.PieLabelRecord((java.lang.Comparable)(-1L), (double)10, (double)10.0f, textBox10, (double)(byte)10, (double)0L, (double)0.5f);
    double d15 = pieLabelRecord14.getLabelHeight();
    java.lang.Comparable[] comparable_array17 = new java.lang.Comparable[] { numberTickUnit2, 100L, "hi!", d15, (short)0 };
    java.lang.Number[] number_array20 = new java.lang.Number[] {  };
    java.lang.Number[] number_array21 = new java.lang.Number[] {  };
    java.lang.Number[] number_array22 = new java.lang.Number[] {  };
    java.lang.Number[][] number_array_array23 = new java.lang.Number[][] { number_array20, number_array21, number_array22 };
    org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("LengthConstraintType.NONE", "ZOOM_RESET_DOMAIN", number_array_array23);
    java.lang.Number[] number_array25 = new java.lang.Number[] {  };
    java.lang.Number[] number_array26 = new java.lang.Number[] {  };
    java.lang.Number[][] number_array_array27 = new java.lang.Number[][] { number_array25, number_array26 };
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset28 = new org.jfree.data.category.DefaultIntervalCategoryDataset(comparable_array0, comparable_array17, number_array_array23, number_array_array27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparable_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelWidthType3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparable_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(number_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(number_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(number_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(number_array_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryDataset24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(number_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(number_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(number_array_array27);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }

    double[][] d_array_array0 = new double[][] {  };
    double[][] d_array_array1 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array0, d_array_array1);
    org.jfree.data.general.SeriesDataset[] seriesDataset_array3 = new org.jfree.data.general.SeriesDataset[] { defaultIntervalCategoryDataset2 };
    org.jfree.data.general.CombinedDataset combinedDataset4 = new org.jfree.data.general.CombinedDataset(seriesDataset_array3);
    org.jfree.data.Range range5 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset)combinedDataset4);
    combinedDataset4.validateObject();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number9 = combinedDataset4.getEndY(52, (int)(short)1);
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
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }

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
    java.lang.Number number17 = timePeriodValuesCollection14.getStartY(1, (int)(byte)1);
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
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }

    java.util.TimeZone timeZone0 = null;
    java.lang.String[] str_array2 = new java.lang.String[] { "E" };
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.axis.QuarterDateFormat quarterDateFormat3 = new org.jfree.chart.axis.QuarterDateFormat(timeZone0, str_array2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }

    java.awt.Color color1 = java.awt.Color.getColor("ZOOM_IN_BOTH");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(color1);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }

    org.jfree.chart.axis.CompassFormat compassFormat0 = new org.jfree.chart.axis.CompassFormat();
    int i1 = compassFormat0.getMinimumIntegerDigits();
    java.lang.String str3 = compassFormat0.format((long)100);
    int i4 = compassFormat0.getMaximumFractionDigits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "E"+ "'", str3.equals("E"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }

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
    java.awt.Color color90 = java.awt.Color.BLACK;
    xYShapeRenderer0.setGuideLinePaint((java.awt.Paint)color90);
    
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
    org.junit.Assert.assertNotNull(color90);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }

    org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE8;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelAnchor0);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }

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
    org.jfree.ui.TextAnchor textAnchor98 = itemLabelPosition96.getTextAnchor();
    
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
    org.junit.Assert.assertNotNull(textAnchor98);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }

    org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE5;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelAnchor0);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }

    org.jfree.data.function.PowerFunction2D powerFunction2D2 = new org.jfree.data.function.PowerFunction2D(100.0d, (double)(-192));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }

    java.io.InputStream inputStream0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.category.CategoryDataset categoryDataset1 = org.jfree.data.xml.DatasetReader.readCategoryDatasetFromXML(inputStream0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }

    org.jfree.chart.axis.DateTickMarkPosition dateTickMarkPosition0 = org.jfree.chart.axis.DateTickMarkPosition.START;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTickMarkPosition0);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }

    org.jfree.text.TextBox textBox3 = null;
    org.jfree.chart.plot.PieLabelRecord pieLabelRecord7 = new org.jfree.chart.plot.PieLabelRecord((java.lang.Comparable)(-1L), (double)10, (double)10.0f, textBox3, (double)(byte)10, (double)0L, (double)0.5f);
    double d8 = pieLabelRecord7.getLinkPercent();
    double d9 = pieLabelRecord7.getAngle();
    double d10 = pieLabelRecord7.getAllocatedY();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 10.0d);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }

    org.jfree.chart.axis.MonthDateFormat monthDateFormat0 = new org.jfree.chart.axis.MonthDateFormat();
    java.text.ParsePosition parsePosition2 = null;
    java.lang.Object obj3 = monthDateFormat0.parseObject("", parsePosition2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }

    org.jfree.data.time.TimeSeriesCollection timeSeriesCollection0 = new org.jfree.data.time.TimeSeriesCollection();
    // The following exception was thrown during execution in test generation
    try {
    int i2 = timeSeriesCollection0.getItemCount((-192));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }

    org.jfree.ui.HorizontalAlignment horizontalAlignment0 = null;
    org.jfree.ui.VerticalAlignment verticalAlignment1 = null;
    org.jfree.chart.block.FlowArrangement flowArrangement4 = new org.jfree.chart.block.FlowArrangement(horizontalAlignment0, verticalAlignment1, (double)0L, (double)1);
    org.jfree.chart.block.BlockContainer blockContainer5 = null;
    java.awt.Graphics2D graphics2D6 = null;
    org.jfree.data.time.DateRange dateRange8 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range11 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange8, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType12 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange14 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange15 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint16 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange14, (org.jfree.data.Range)dateRange15);
    org.jfree.chart.axis.CompassFormat compassFormat17 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType18 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b19 = compassFormat17.equals((java.lang.Object)lengthConstraintType18);
    org.jfree.chart.axis.CompassFormat compassFormat20 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType21 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b22 = compassFormat20.equals((java.lang.Object)lengthConstraintType21);
    boolean b23 = lengthConstraintType18.equals((java.lang.Object)b22);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint24 = new org.jfree.chart.block.RectangleConstraint(0.0d, range11, lengthConstraintType12, (double)1L, (org.jfree.data.Range)dateRange14, lengthConstraintType18);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint26 = rectangleConstraint24.toFixedWidth((double)0.0f);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.ui.Size2D size2D27 = flowArrangement4.arrange(blockContainer5, graphics2D6, rectangleConstraint24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleConstraint26);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }

    double[][] d_array_array0 = new double[][] {  };
    double[][] d_array_array1 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array0, d_array_array1);
    org.jfree.data.general.SeriesDataset[] seriesDataset_array3 = new org.jfree.data.general.SeriesDataset[] { defaultIntervalCategoryDataset2 };
    org.jfree.data.general.CombinedDataset combinedDataset4 = new org.jfree.data.general.CombinedDataset(seriesDataset_array3);
    org.jfree.data.Range range5 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset)combinedDataset4);
    org.jfree.data.Range range6 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset)combinedDataset4);
    // The following exception was thrown during execution in test generation
    try {
    int i8 = combinedDataset4.getItemCount(3);
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
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }

    org.jfree.chart.axis.AxisLocation axisLocation0 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(axisLocation0);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }

    org.jfree.data.resources.DataPackageResources_pl dataPackageResources_pl1 = new org.jfree.data.resources.DataPackageResources_pl();
    java.lang.Object[][] obj_array_array2 = dataPackageResources_pl1.getContents();
    java.lang.Object[][] obj_array_array3 = dataPackageResources_pl1.getContents();
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
    javax.swing.InputVerifier inputVerifier42 = chartPanel18.getInputVerifier();
    boolean b43 = chartPanel18.getRefreshBuffer();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array44 = chartPanel18.getMouseMotionListeners();
    org.jfree.data.resources.DataPackageResources_pl dataPackageResources_pl45 = new org.jfree.data.resources.DataPackageResources_pl();
    java.lang.Object[][] obj_array_array46 = dataPackageResources_pl45.getContents();
    java.lang.Object[][] obj_array_array47 = dataPackageResources_pl45.getContents();
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.contour.NonGridContourDataset nonGridContourDataset51 = new org.jfree.data.contour.NonGridContourDataset("series", (java.lang.Object[])obj_array_array3, (java.lang.Object[])mouseMotionListener_array44, (java.lang.Object[])obj_array_array47, (-192), (int)(byte)100, 255);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array3);
    
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
    org.junit.Assert.assertNull(inputVerifier42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array47);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }

    org.jfree.data.DomainOrder domainOrder0 = org.jfree.data.DomainOrder.ASCENDING;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(domainOrder0);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }

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
    org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries3.addOrUpdate(regularTimePeriod12, (java.lang.Number)(short)-1);
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

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }

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
    double[][] d_array_array42 = new double[][] {  };
    double[][] d_array_array43 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset44 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array42, d_array_array43);
    org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "jfreechart-", d_array_array43);
    org.jfree.data.general.DatasetChangeEvent datasetChangeEvent46 = new org.jfree.data.general.DatasetChangeEvent((java.lang.Object)chartPanel14, (org.jfree.data.general.Dataset)categoryDataset45);
    java.util.List list47 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.Range range49 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset45, list47, true);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
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
    org.junit.Assert.assertNotNull(d_array_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryDataset45);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }

    java.lang.String str1 = org.jfree.chart.imagemap.ImageMapUtilities.htmlEscape("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!"+ "'", str1.equals("hi!"));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }

    org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)100);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }

    org.jfree.chart.editor.DefaultChartEditorFactory defaultChartEditorFactory0 = new org.jfree.chart.editor.DefaultChartEditorFactory();
    org.jfree.chart.editor.ChartEditorManager.setChartEditorFactory((org.jfree.chart.editor.ChartEditorFactory)defaultChartEditorFactory0);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }

    org.jfree.chart.encoders.ImageEncoderFactory imageEncoderFactory0 = new org.jfree.chart.encoders.ImageEncoderFactory();

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }

    java.lang.String str0 = org.jfree.data.xml.DatasetTags.CATEGORYDATASET_TAG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "CategoryDataset"+ "'", str0.equals("CategoryDataset"));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }

    org.jfree.chart.plot.CategoryCrosshairState categoryCrosshairState0 = new org.jfree.chart.plot.CategoryCrosshairState();
    org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions3 = categoryAxis2.getCategoryLabelPositions();
    org.jfree.chart.event.AxisChangeListener axisChangeListener4 = null;
    categoryAxis2.removeChangeListener(axisChangeListener4);
    org.jfree.data.xy.YIntervalDataItem yIntervalDataItem10 = new org.jfree.data.xy.YIntervalDataItem((double)9, (double)(byte)1, (double)4, (double)(byte)0);
    java.awt.Font font11 = categoryAxis2.getTickLabelFont((java.lang.Comparable)yIntervalDataItem10);
    org.jfree.chart.plot.PlotOrientation plotOrientation17 = org.jfree.chart.plot.PlotOrientation.VERTICAL;
    categoryCrosshairState0.updateCrosshairPoint((java.lang.Comparable)yIntervalDataItem10, (java.lang.Comparable)52, (double)10.0f, (int)'4', (double)7, 0.0d, plotOrientation17);
    double d19 = categoryCrosshairState0.getCrosshairDistance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelPositions3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(plotOrientation17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 0.0d);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }

    org.jfree.data.ComparableObjectSeries comparableObjectSeries3 = new org.jfree.data.ComparableObjectSeries((java.lang.Comparable)(short)-1, true, true);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }

    org.jfree.data.xy.VectorSeries vectorSeries1 = new org.jfree.data.xy.VectorSeries((java.lang.Comparable)0.2d);
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    vectorSeries1.removePropertyChangeListener(propertyChangeListener2);
    // The following exception was thrown during execution in test generation
    try {
    double d5 = vectorSeries1.getXValue(4);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }

    double[][] d_array_array2 = new double[][] {  };
    double[][] d_array_array3 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset4 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array2, d_array_array3);
    org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "jfreechart-", d_array_array3);
    org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset5, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryDataset5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(range7);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }

    org.jfree.data.resources.DataPackageResources_pl dataPackageResources_pl0 = new org.jfree.data.resources.DataPackageResources_pl();
    java.util.Locale locale1 = dataPackageResources_pl0.getLocale();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str3 = dataPackageResources_pl0.getString("1.0, -1");
      org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(locale1);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }

    org.jfree.chart.plot.dial.DialLayer dialLayer0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.plot.dial.DialLayerChangeEvent dialLayerChangeEvent1 = new org.jfree.chart.plot.dial.DialLayerChangeEvent(dialLayer0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }

    java.awt.Paint paint0 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint0);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }

    org.jfree.data.time.TimeSeriesCollection timeSeriesCollection0 = new org.jfree.data.time.TimeSeriesCollection();
    timeSeriesCollection0.setDomainIsPointsInTime(true);
    // The following exception was thrown during execution in test generation
    try {
    int i6 = org.jfree.chart.renderer.RendererUtilities.findLiveItemsLowerBound((org.jfree.data.xy.XYDataset)timeSeriesCollection0, (int)(byte)-1, (double)(short)100, (double)0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }

    org.jfree.chart.util.XYCoordinateType xYCoordinateType0 = org.jfree.chart.util.XYCoordinateType.INDEX;
    java.lang.String str1 = xYCoordinateType0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xYCoordinateType0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "XYCoordinateType.INDEX"+ "'", str1.equals("XYCoordinateType.INDEX"));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }

    java.util.Locale locale1 = javax.swing.JComponent.getDefaultLocale();
    java.text.NumberFormat numberFormat2 = java.text.NumberFormat.getInstance(locale1);
    java.lang.ClassLoader classLoader3 = null;
    java.util.ResourceBundle.Control control4 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.ResourceBundle resourceBundle5 = java.util.ResourceBundle.getBundle("ZOOM_IN_BOTH", locale1, classLoader3, control4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(numberFormat2);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }

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
    categoryAxis1.setLabelAngle((double)255);
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions84 = new org.jfree.chart.axis.CategoryLabelPositions();
    categoryAxis1.setCategoryLabelPositions(categoryLabelPositions84);
    
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

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }

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
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo39 = chartPanel14.getChartRenderingInfo();
    java.awt.Cursor cursor40 = chartPanel14.getCursor();
    java.awt.event.MouseEvent mouseEvent41 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str42 = chartPanel14.getToolTipText(mouseEvent41);
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
    org.junit.Assert.assertTrue(i38 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor40);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    org.jfree.chart.plot.JThermometer jThermometer2 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle3 = jThermometer2.getVisibleRect();
    int i4 = jThermometer2.getShowAxisLocation();
    int i5 = jThermometer2.getWidth();
    java.awt.Component component6 = jThermometer0.add((java.awt.Component)jThermometer2);
    jThermometer0.addNotify();
    jThermometer0.validate();
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    int i11 = jThermometer9.getShowAxisLocation();
    java.awt.Event event12 = null;
    boolean b15 = jThermometer9.mouseMove(event12, 1, (int)' ');
    jThermometer9.firePropertyChange("hi!", 0, 2);
    boolean b20 = jThermometer9.isVisible();
    jThermometer9.setFocusTraversalKeysEnabled(true);
    jThermometer0.remove((java.awt.Component)jThermometer9);
    java.awt.Cursor cursor24 = jThermometer9.getCursor();
    
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
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor24);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    int i2 = jThermometer0.getShowAxisLocation();
    java.awt.Event event3 = null;
    boolean b6 = jThermometer0.mouseMove(event3, 1, (int)' ');
    java.awt.event.MouseWheelListener[] mouseWheelListener_array7 = jThermometer0.getMouseWheelListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseWheelListener_array7);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }

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
    org.jfree.ui.GradientPaintTransformer gradientPaintTransformer91 = legendItem1.getFillPaintTransformer();
    
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
    org.junit.Assert.assertNotNull(gradientPaintTransformer91);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }

    java.lang.Object obj0 = null;
    double[][] d_array_array1 = new double[][] {  };
    double[][] d_array_array2 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array1, d_array_array2);
    org.jfree.data.general.PieDataset pieDataset5 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset3, (java.lang.Comparable)0.5d);
    org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
    defaultIntervalCategoryDataset3.removeChangeListener(datasetChangeListener6);
    java.util.List list8 = defaultIntervalCategoryDataset3.getCategories();
    org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
    defaultIntervalCategoryDataset3.addChangeListener(datasetChangeListener9);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.general.DatasetChangeEvent datasetChangeEvent11 = new org.jfree.data.general.DatasetChangeEvent(obj0, (org.jfree.data.general.Dataset)defaultIntervalCategoryDataset3);
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
    org.junit.Assert.assertNotNull(list8);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }

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
    org.jfree.chart.annotations.XYAnnotation xYAnnotation98 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b99 = xYShapeRenderer0.removeAnnotation(xYAnnotation98);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
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
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b97);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }

    org.jfree.data.time.TimeSeriesCollection timeSeriesCollection0 = new org.jfree.data.time.TimeSeriesCollection();
    java.util.List list1 = timeSeriesCollection0.getSeries();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number4 = timeSeriesCollection0.getX((-1), (-192));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list1);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }

    java.awt.Color color0 = org.jfree.chart.ChartColor.VERY_LIGHT_YELLOW;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color0);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }

    java.awt.Color color0 = org.jfree.chart.ChartColor.LIGHT_BLUE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color0);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }

    org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)100.0f);
    org.jfree.chart.plot.JThermometer jThermometer2 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event3 = null;
    org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b6 = jThermometer2.gotFocus(event3, (java.lang.Object)timeSeries5);
    java.lang.Class class7 = timeSeries5.getTimePeriodClass();
    java.util.List list8 = timeSeries5.getItems();
    org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
    org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries5.addOrUpdate(timeSeriesDataItem10);
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
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel14.setReshowDelay((int)(short)1);
    int i17 = chartPanel14.getMinimumDrawWidth();
    boolean b18 = chartPanel14.requestFocusInWindow();
    boolean b19 = chartPanel14.getFillZoomRectangle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    jThermometer0.requestFocus();
    javax.swing.JPopupMenu jPopupMenu3 = jThermometer0.getComponentPopupMenu();
    // The following exception was thrown during execution in test generation
    try {
    jPopupMenu3.addNotify();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jPopupMenu3);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }

    org.jfree.data.xy.YInterval yInterval3 = new org.jfree.data.xy.YInterval((double)'a', (double)0.5f, (double)(byte)10);
    boolean b5 = yInterval3.equals((java.lang.Object)(-4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }

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
    java.io.PrintStream printStream10 = null;
    // The following exception was thrown during execution in test generation
    try {
    jThermometer0.list(printStream10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }

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
    boolean b80 = xYShapeRenderer0.getAutoPopulateSeriesOutlinePaint();
    java.awt.Paint paint81 = xYShapeRenderer0.getItemLabelPaint();
    
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
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(paint81);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    boolean b3 = jThermometer0.keyDown(event1, 100);
    jThermometer0.updateUI();
    jThermometer0.transferFocusDownCycle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b4 = jThermometer0.gotFocus(event1, (java.lang.Object)timeSeries3);
    org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
    // The following exception was thrown during execution in test generation
    try {
    timeSeries3.update(regularTimePeriod5, 0.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    boolean b3 = jThermometer0.keyDown(event1, 100);
    java.awt.Event event4 = null;
    boolean b7 = jThermometer0.mouseDown(event4, 6, (int)(byte)1);
    jThermometer0.setName("jfreechart-");
    javax.swing.InputVerifier inputVerifier10 = null;
    jThermometer0.setInputVerifier(inputVerifier10);
    javax.swing.KeyStroke keyStroke12 = null;
    int i13 = jThermometer0.getConditionForKeyStroke(keyStroke12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer20 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event21 = null;
    boolean b23 = jThermometer20.keyDown(event21, 100);
    jThermometer20.setSize((int)(short)100, 8);
    java.awt.Dimension dimension27 = jThermometer20.minimumSize();
    java.awt.Dimension dimension28 = jThermometer20.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener29 = null;
    jThermometer20.removeHierarchyBoundsListener(hierarchyBoundsListener29);
    org.jfree.chart.plot.JThermometer jThermometer31 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle32 = jThermometer31.getVisibleRect();
    java.awt.Rectangle rectangle33 = jThermometer20.getBounds(rectangle32);
    java.awt.Color color34 = java.awt.Color.black;
    float[] f_array40 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array41 = color34.getRGBComponents(f_array40);
    org.jfree.chart.LegendItem legendItem42 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle33, (java.awt.Paint)color34);
    chartRenderingInfo15.setChartArea((java.awt.geom.Rectangle2D)rectangle33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array41);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }

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
    java.awt.Stroke stroke77 = null;
    xYShapeRenderer0.setStroke(stroke77, true);
    org.jfree.chart.labels.XYItemLabelGenerator xYItemLabelGenerator80 = xYShapeRenderer0.getBaseItemLabelGenerator();
    
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
    org.junit.Assert.assertNull(xYItemLabelGenerator80);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }

    org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelAnchor0);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }

    org.jfree.data.general.DatasetGroup datasetGroup0 = new org.jfree.data.general.DatasetGroup();

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    jThermometer0.requestFocus();
    javax.swing.JPopupMenu jPopupMenu3 = jThermometer0.getComponentPopupMenu();
    // The following exception was thrown during execution in test generation
    try {
    java.awt.event.KeyListener[] keyListener_array4 = jPopupMenu3.getKeyListeners();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jPopupMenu3);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }

    org.jfree.chart.editor.ChartEditorFactory chartEditorFactory0 = org.jfree.chart.editor.ChartEditorManager.getChartEditorFactory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartEditorFactory0);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    boolean b15 = chartPanel14.isDomainZoomable();
    chartPanel14.setAutoscrolls(true);
    org.jfree.chart.JFreeChart jFreeChart18 = null;
    org.jfree.chart.ChartPanel chartPanel32 = new org.jfree.chart.ChartPanel(jFreeChart18, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel32.setReshowDelay((int)(short)1);
    java.awt.image.ImageProducer imageProducer35 = null;
    java.awt.Image image36 = chartPanel32.createImage(imageProducer35);
    org.jfree.chart.JFreeChart jFreeChart39 = null;
    org.jfree.chart.ChartPanel chartPanel53 = new org.jfree.chart.ChartPanel(jFreeChart39, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel53.setZoomAroundAnchor(false);
    // The following exception was thrown during execution in test generation
    try {
    boolean b56 = chartPanel14.prepareImage(image36, (int)(short)-1, (-192), (java.awt.image.ImageObserver)chartPanel53);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image36);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }

    org.jfree.chart.needle.LineNeedle lineNeedle0 = new org.jfree.chart.needle.LineNeedle();
    java.awt.Color color2 = java.awt.Color.BLACK;
    org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator6 = new org.jfree.chart.util.DefaultShadowGenerator((int)(byte)100, color2, (float)0, (int)'4', (double)1.0f);
    lineNeedle0.setOutlinePaint((java.awt.Paint)color2);
    java.awt.color.ColorSpace colorSpace8 = color2.getColorSpace();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorSpace8);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }

    org.jfree.chart.util.LogFormat logFormat3 = new org.jfree.chart.util.LogFormat((double)1L, "series", true);
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle5 = jThermometer4.getVisibleRect();
    int i6 = jThermometer4.getShowAxisLocation();
    int i7 = jThermometer4.getWidth();
    boolean b8 = logFormat3.equals((java.lang.Object)jThermometer4);
    java.io.PrintStream printStream9 = null;
    // The following exception was thrown during execution in test generation
    try {
    jThermometer4.list(printStream9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
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
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }

    org.jfree.data.time.TimePeriodAnchor timePeriodAnchor0 = org.jfree.data.time.TimePeriodAnchor.START;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timePeriodAnchor0);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }

    org.jfree.data.gantt.TaskSeries taskSeries1 = new org.jfree.data.gantt.TaskSeries("D");
    org.jfree.data.gantt.Task task3 = taskSeries1.get("ZOOM_RESET_DOMAIN");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(task3);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }

    org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double)' ');
    java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
    org.jfree.ui.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle5 = jThermometer4.getVisibleRect();
    org.jfree.chart.plot.JThermometer jThermometer6 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle7 = jThermometer6.getVisibleRect();
    int i8 = jThermometer6.getShowAxisLocation();
    int i9 = jThermometer6.getWidth();
    java.awt.Component component10 = jThermometer4.add((java.awt.Component)jThermometer6);
    jThermometer4.addNotify();
    java.awt.event.ContainerListener containerListener12 = null;
    jThermometer4.addContainerListener(containerListener12);
    java.awt.Font font14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
    jThermometer4.setValueFont(font14);
    valueMarker1.setLabelFont(font14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font14);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }

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
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions10 = org.jfree.chart.axis.CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions4, categoryLabelPosition6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelPositions10);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }

    org.jfree.chart.urls.StandardPieURLGenerator standardPieURLGenerator1 = new org.jfree.chart.urls.StandardPieURLGenerator("D");

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }

    // The following exception was thrown during execution in test generation
    try {
    java.util.ResourceBundle resourceBundle1 = org.jfree.chart.util.ResourceBundleWrapper.getBundle("jfreechart-");
      org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }

    int i0 = java.awt.Frame.MAXIMIZED_BOTH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 6);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }

    org.jfree.chart.plot.JThermometer jThermometer1 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event2 = null;
    boolean b4 = jThermometer1.keyDown(event2, 100);
    jThermometer1.setVisible(false);
    boolean b7 = jThermometer1.isFocusTraversable();
    java.util.Locale locale8 = javax.swing.JComponent.getDefaultLocale();
    jThermometer1.setLocale(locale8);
    java.util.ResourceBundle.Control control10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.ResourceBundle resourceBundle11 = java.util.ResourceBundle.getBundle("Time", locale8, control10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale8);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }

    org.jfree.chart.util.LogFormat logFormat3 = new org.jfree.chart.util.LogFormat((double)1L, "series", true);
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle5 = jThermometer4.getVisibleRect();
    int i6 = jThermometer4.getShowAxisLocation();
    int i7 = jThermometer4.getWidth();
    boolean b8 = logFormat3.equals((java.lang.Object)jThermometer4);
    java.lang.StringBuffer stringBuffer10 = null;
    java.text.FieldPosition fieldPosition11 = null;
    java.lang.StringBuffer stringBuffer12 = logFormat3.format((long)64, stringBuffer10, fieldPosition11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stringBuffer12);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }

    org.jfree.chart.renderer.AreaRendererEndType areaRendererEndType0 = org.jfree.chart.renderer.AreaRendererEndType.TAPER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(areaRendererEndType0);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }

    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition0 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition1 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition2 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition3 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions4 = new org.jfree.chart.axis.CategoryLabelPositions(categoryLabelPosition0, categoryLabelPosition1, categoryLabelPosition2, categoryLabelPosition3);
    double d5 = categoryLabelPosition1.getAngle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    boolean b3 = jThermometer0.keyDown(event1, 100);
    java.awt.Event event4 = null;
    boolean b7 = jThermometer0.mouseDown(event4, 6, (int)(byte)1);
    java.awt.Event event8 = null;
    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer9 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis15 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer18 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle19 = jThermometer18.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge20 = null;
    double d21 = categoryAxis15.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle19, rectangleEdge20);
    org.jfree.chart.plot.JThermometer jThermometer26 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event27 = null;
    boolean b29 = jThermometer26.keyDown(event27, 100);
    jThermometer26.setSize((int)(short)100, 8);
    java.awt.Dimension dimension33 = jThermometer26.minimumSize();
    java.awt.Dimension dimension34 = jThermometer26.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener35 = null;
    jThermometer26.removeHierarchyBoundsListener(hierarchyBoundsListener35);
    org.jfree.chart.plot.JThermometer jThermometer37 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle38 = jThermometer37.getVisibleRect();
    java.awt.Rectangle rectangle39 = jThermometer26.getBounds(rectangle38);
    java.awt.Color color40 = java.awt.Color.black;
    float[] f_array46 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array47 = color40.getRGBComponents(f_array46);
    org.jfree.chart.LegendItem legendItem48 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle39, (java.awt.Paint)color40);
    org.jfree.chart.axis.CategoryAxis categoryAxis50 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer53 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle54 = jThermometer53.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge55 = null;
    double d56 = categoryAxis50.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle54, rectangleEdge55);
    categoryAxis50.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke59 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis50.setTickMarkStroke(stroke59);
    org.jfree.chart.JFreeChart jFreeChart61 = null;
    org.jfree.chart.ChartPanel chartPanel75 = new org.jfree.chart.ChartPanel(jFreeChart61, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel75.setReshowDelay((int)(short)1);
    java.awt.Color color78 = java.awt.Color.WHITE;
    chartPanel75.setZoomOutlinePaint((java.awt.Paint)color78);
    org.jfree.chart.LegendItem legendItem80 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle19, (java.awt.Paint)color40, stroke59, (java.awt.Paint)color78);
    xYShapeRenderer9.setShape((java.awt.Shape)rectangle19);
    xYShapeRenderer9.setSeriesVisibleInLegend(100, (java.lang.Boolean)true, true);
    org.jfree.chart.labels.ItemLabelPosition itemLabelPosition86 = xYShapeRenderer9.getBasePositiveItemLabelPosition();
    org.jfree.chart.plot.XYPlot xYPlot87 = null;
    xYShapeRenderer9.setPlot(xYPlot87);
    xYShapeRenderer9.clearSeriesPaints(true);
    boolean b91 = jThermometer0.action(event8, (java.lang.Object)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d56 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelPosition86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }

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
    boolean b74 = xYShapeRenderer0.isSeriesItemLabelsVisible((int)(short)-1);
    
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
    org.junit.Assert.assertTrue(b74 == false);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }

    org.jfree.chart.plot.RainbowPalette rainbowPalette0 = new org.jfree.chart.plot.RainbowPalette();
    rainbowPalette0.setLogscale(false);
    java.awt.Color color4 = rainbowPalette0.getColor((int)'#');
    rainbowPalette0.setPaletteName("");
    rainbowPalette0.initialize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color4);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }

    // The following exception was thrown during execution in test generation
    try {
    java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(5, 768);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }

    int i0 = java.awt.Transparency.TRANSLUCENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 3);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }

    org.jfree.chart.ChartRenderingInfo chartRenderingInfo1 = null;
    org.jfree.chart.imagemap.OverLIBToolTipTagFragmentGenerator overLIBToolTipTagFragmentGenerator2 = new org.jfree.chart.imagemap.OverLIBToolTipTagFragmentGenerator();
    org.jfree.chart.imagemap.URLTagFragmentGenerator uRLTagFragmentGenerator3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str4 = org.jfree.chart.imagemap.ImageMapUtilities.getImageMap("DateTickMarkPosition.MIDDLE", chartRenderingInfo1, (org.jfree.chart.imagemap.ToolTipTagFragmentGenerator)overLIBToolTipTagFragmentGenerator2, uRLTagFragmentGenerator3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }

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
    chartPanel14.firePropertyChange("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=10,height=0]]", (double)(byte)100, 4.0d);
    
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
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }

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
    legendItem26.setDescription("D");
    legendItem26.setToolTipText("ZOOM_RESET_RANGE");
    
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

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }

    int i0 = java.awt.Frame.SW_RESIZE_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 4);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }

    org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
    categoryAxis0.setMinorTickMarksVisible(true);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }

    double[][] d_array_array0 = new double[][] {  };
    double[][] d_array_array1 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array0, d_array_array1);
    java.util.List list3 = defaultIntervalCategoryDataset2.getCategories();
    int i4 = defaultIntervalCategoryDataset2.getColumnCount();
    // The following exception was thrown during execution in test generation
    try {
    defaultIntervalCategoryDataset2.setStartValue(4, (java.lang.Comparable)128, (java.lang.Number)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }

    org.jfree.chart.axis.QuarterDateFormat quarterDateFormat2 = new org.jfree.chart.axis.QuarterDateFormat();
    quarterDateFormat2.setLenient(true);
    java.text.ParsePosition parsePosition6 = null;
    java.util.Date date7 = quarterDateFormat2.parse("E", parsePosition6);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.axis.DateTickUnit dateTickUnit8 = new org.jfree.chart.axis.DateTickUnit((-143), (int)'4', (java.text.DateFormat)quarterDateFormat2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(date7);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }

    org.jfree.data.xy.YIntervalSeries yIntervalSeries3 = new org.jfree.data.xy.YIntervalSeries((java.lang.Comparable)(byte)100, true, false);
    yIntervalSeries3.add((double)6, (double)(short)0, 0.05d, (double)(-1.0f));
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number10 = yIntervalSeries3.getX((int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }

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
    java.util.List list56 = defaultIntervalCategoryDataset30.getCategories();
    
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
    org.junit.Assert.assertNotNull(list56);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }

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
    java.awt.Font font81 = xYShapeRenderer0.getItemLabelFont();
    
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
    org.junit.Assert.assertNull(font81);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }

    org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator0 = new org.jfree.chart.util.DefaultShadowGenerator();

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }

    org.jfree.chart.axis.AxisLocation axisLocation0 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
    boolean b2 = axisLocation0.equals((java.lang.Object)"E");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(axisLocation0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }

    org.jfree.data.xy.YIntervalDataItem yIntervalDataItem4 = new org.jfree.data.xy.YIntervalDataItem((double)100, (double)100, (double)13, (double)' ');
    org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)100);
    int i6 = xYSeries5.getItemCount();
    java.lang.Number number8 = null;
    xYSeries5.add((double)9, number8, false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }

    org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE8;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelAnchor0);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }

    java.awt.Color color3 = java.awt.Color.getHSBColor(2.0f, (float)(-1), (float)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color3);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }

    double[][] d_array_array0 = new double[][] {  };
    double[][] d_array_array1 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array0, d_array_array1);
    java.util.List list3 = defaultIntervalCategoryDataset2.getCategories();
    java.util.List list4 = defaultIntervalCategoryDataset2.getCategories();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    int i2 = jThermometer0.getShowAxisLocation();
    int i3 = jThermometer0.getDebugGraphicsOptions();
    jThermometer0.setInheritsPopupMenu(true);
    java.awt.dnd.DropTarget dropTarget6 = jThermometer0.getDropTarget();
    java.awt.Component component7 = jThermometer0.getNextFocusableComponent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(dropTarget6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component7);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }

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
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number58 = defaultIntervalCategoryDataset30.getValue((java.lang.Comparable)false, (java.lang.Comparable)"ZOOM_RESET_RANGE");
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
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }

    org.jfree.chart.urls.StandardXYURLGenerator standardXYURLGenerator1 = new org.jfree.chart.urls.StandardXYURLGenerator("CategoryDataset");
    org.jfree.chart.axis.CategoryAxis3D categoryAxis3D2 = new org.jfree.chart.axis.CategoryAxis3D();
    boolean b3 = standardXYURLGenerator1.equals((java.lang.Object)categoryAxis3D2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }

    org.jfree.data.function.NormalDistributionFunction2D normalDistributionFunction2D2 = new org.jfree.data.function.NormalDistributionFunction2D((double)0, (double)13);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }

    org.jfree.data.time.DateRange dateRange0 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range3 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange0, (double)'a', true);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint5 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange0, (double)8);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType6 = rectangleConstraint5.getWidthConstraintType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType6);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    org.jfree.chart.plot.JThermometer jThermometer2 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle3 = jThermometer2.getVisibleRect();
    int i4 = jThermometer2.getShowAxisLocation();
    int i5 = jThermometer2.getWidth();
    java.awt.Component component6 = jThermometer0.add((java.awt.Component)jThermometer2);
    jThermometer0.addNotify();
    jThermometer0.validate();
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle10 = jThermometer9.getVisibleRect();
    int i11 = jThermometer9.getShowAxisLocation();
    java.awt.Event event12 = null;
    boolean b15 = jThermometer9.mouseMove(event12, 1, (int)' ');
    jThermometer9.firePropertyChange("hi!", 0, 2);
    boolean b20 = jThermometer9.isVisible();
    jThermometer9.setFocusTraversalKeysEnabled(true);
    jThermometer0.remove((java.awt.Component)jThermometer9);
    javax.swing.InputMap inputMap24 = jThermometer0.getInputMap();
    
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
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap24);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }

    org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset defaultBoxAndWhiskerXYDataset1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset((java.lang.Comparable)(-1));
    double d3 = defaultBoxAndWhiskerXYDataset1.getRangeLowerBound(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertEquals((double)d3, Double.NaN, 0);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }

    java.awt.Color color0 = org.jfree.chart.ChartColor.VERY_DARK_CYAN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color0);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    boolean b3 = jThermometer0.keyDown(event1, 100);
    jThermometer0.setSize((int)(short)100, 8);
    jThermometer0.setToolTipText("ZOOM_RESET_RANGE");
    java.awt.Dimension dimension9 = null;
    // The following exception was thrown during execution in test generation
    try {
    jThermometer0.setSize(dimension9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }

    org.jfree.ui.HorizontalAlignment horizontalAlignment0 = null;
    org.jfree.ui.VerticalAlignment verticalAlignment1 = null;
    org.jfree.chart.block.FlowArrangement flowArrangement4 = new org.jfree.chart.block.FlowArrangement(horizontalAlignment0, verticalAlignment1, (double)0L, (double)1);
    flowArrangement4.clear();
    org.jfree.chart.block.BlockContainer blockContainer6 = null;
    java.awt.Graphics2D graphics2D7 = null;
    org.jfree.data.time.DateRange dateRange9 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range12 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange9, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType13 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange15 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange16 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange15, (org.jfree.data.Range)dateRange16);
    org.jfree.chart.axis.CompassFormat compassFormat18 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType19 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b20 = compassFormat18.equals((java.lang.Object)lengthConstraintType19);
    org.jfree.chart.axis.CompassFormat compassFormat21 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType22 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b23 = compassFormat21.equals((java.lang.Object)lengthConstraintType22);
    boolean b24 = lengthConstraintType19.equals((java.lang.Object)b23);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint25 = new org.jfree.chart.block.RectangleConstraint(0.0d, range12, lengthConstraintType13, (double)1L, (org.jfree.data.Range)dateRange15, lengthConstraintType19);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint27 = rectangleConstraint25.toFixedWidth((double)0.0f);
    org.jfree.data.time.DateRange dateRange29 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range32 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange29, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType33 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange35 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange36 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint37 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange35, (org.jfree.data.Range)dateRange36);
    org.jfree.chart.axis.CompassFormat compassFormat38 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType39 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b40 = compassFormat38.equals((java.lang.Object)lengthConstraintType39);
    org.jfree.chart.axis.CompassFormat compassFormat41 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType42 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b43 = compassFormat41.equals((java.lang.Object)lengthConstraintType42);
    boolean b44 = lengthConstraintType39.equals((java.lang.Object)b43);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint45 = new org.jfree.chart.block.RectangleConstraint(0.0d, range32, lengthConstraintType33, (double)1L, (org.jfree.data.Range)dateRange35, lengthConstraintType39);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint46 = rectangleConstraint27.toRangeWidth(range32);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.ui.Size2D size2D47 = flowArrangement4.arrange(blockContainer6, graphics2D7, rectangleConstraint27);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleConstraint27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleConstraint46);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }

    boolean b0 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_VISIBLE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b0 == true);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }

    org.jfree.text.TextBox textBox3 = null;
    org.jfree.chart.plot.PieLabelRecord pieLabelRecord7 = new org.jfree.chart.plot.PieLabelRecord((java.lang.Comparable)(-1L), (double)10, (double)10.0f, textBox3, (double)(byte)10, (double)0L, (double)0.5f);
    double d8 = pieLabelRecord7.getLabelHeight();
    java.lang.Comparable comparable9 = pieLabelRecord7.getKey();
    pieLabelRecord7.setBaseY((double)' ');
    java.lang.Comparable[] comparable_array15 = new java.lang.Comparable[] { ' ', (short)1, (-143), "org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=10,height=0]]" };
    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline16 = org.jfree.chart.axis.SegmentedTimeline.newFifteenMinuteTimeline();
    org.jfree.chart.axis.SegmentedTimeline.Segment segment18 = segmentedTimeline16.getSegment((long)3);
    segment18.dec();
    java.lang.Comparable[] comparable_array23 = new java.lang.Comparable[] { segment18, 100.0f, "ZOOM_IN_BOTH", (-557783151) };
    double[] d_array24 = new double[] {  };
    double[] d_array25 = new double[] {  };
    double[] d_array26 = new double[] {  };
    double[][] d_array_array27 = new double[][] { d_array24, d_array25, d_array26 };
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparable_array15, comparable_array23, d_array_array27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + comparable9 + "' != '" + (-1L)+ "'", comparable9.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparable_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(segmentedTimeline16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(segment18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparable_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array27);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }

    int i0 = org.jfree.chart.ChartPanel.DEFAULT_MAXIMUM_DRAW_WIDTH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1024);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }

    org.jfree.data.time.TimeSeriesCollection timeSeriesCollection0 = new org.jfree.data.time.TimeSeriesCollection();
    // The following exception was thrown during execution in test generation
    try {
    double d3 = timeSeriesCollection0.getStartXValue((int)(short)-1, 13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }

    org.jfree.chart.LegendRenderingOrder legendRenderingOrder0 = org.jfree.chart.LegendRenderingOrder.REVERSE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(legendRenderingOrder0);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }

    java.awt.Color color0 = java.awt.Color.LIGHT_GRAY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color0);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }

    org.jfree.data.xy.XYIntervalSeries xYIntervalSeries1 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    double d3 = xYIntervalSeries1.getYLowValue(255);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }

    int i0 = org.jfree.data.time.DynamicTimeSeriesCollection.MIDDLE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }

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
    org.jfree.chart.JFreeChart jFreeChart16 = null;
    org.jfree.chart.ChartPanel chartPanel30 = new org.jfree.chart.ChartPanel(jFreeChart16, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo31 = chartPanel30.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer32 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle33 = jThermometer32.getVisibleRect();
    jThermometer32.requestFocus();
    org.jfree.data.time.DateRange dateRange36 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range39 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange36, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType40 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange42 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange43 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint44 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange42, (org.jfree.data.Range)dateRange43);
    org.jfree.chart.axis.CompassFormat compassFormat45 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType46 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b47 = compassFormat45.equals((java.lang.Object)lengthConstraintType46);
    org.jfree.chart.axis.CompassFormat compassFormat48 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType49 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b50 = compassFormat48.equals((java.lang.Object)lengthConstraintType49);
    boolean b51 = lengthConstraintType46.equals((java.lang.Object)b50);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint52 = new org.jfree.chart.block.RectangleConstraint(0.0d, range39, lengthConstraintType40, (double)1L, (org.jfree.data.Range)dateRange42, lengthConstraintType46);
    chartPanel30.add((java.awt.Component)jThermometer32, (java.lang.Object)lengthConstraintType40);
    boolean b54 = timePeriodAnchor15.equals((java.lang.Object)jThermometer32);
    
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
    org.junit.Assert.assertNotNull(chartRenderingInfo31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    int i2 = jThermometer0.getShowAxisLocation();
    java.awt.Event event3 = null;
    boolean b6 = jThermometer0.mouseMove(event3, 1, (int)' ');
    jThermometer0.firePropertyChange("hi!", 0, 2);
    javax.swing.KeyStroke keyStroke11 = null;
    jThermometer0.unregisterKeyboardAction(keyStroke11);
    java.awt.PopupMenu popupMenu13 = null;
    // The following exception was thrown during execution in test generation
    try {
    jThermometer0.add(popupMenu13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }

    org.jfree.chart.axis.SubCategoryAxis subCategoryAxis1 = new org.jfree.chart.axis.SubCategoryAxis("Time");
    org.jfree.chart.axis.CategoryAxis categoryAxis3 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer6 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle7 = jThermometer6.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge8 = null;
    double d9 = categoryAxis3.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle7, rectangleEdge8);
    categoryAxis3.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis3.setTickMarkStroke(stroke12);
    double d14 = categoryAxis3.getLowerMargin();
    org.jfree.ui.RectangleInsets rectangleInsets15 = categoryAxis3.getTickLabelInsets();
    subCategoryAxis1.setLabelInsets(rectangleInsets15);
    java.awt.Graphics2D graphics2D17 = null;
    org.jfree.chart.plot.Plot plot18 = null;
    org.jfree.chart.JFreeChart jFreeChart19 = null;
    org.jfree.chart.ChartPanel chartPanel33 = new org.jfree.chart.ChartPanel(jFreeChart19, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo34 = chartPanel33.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer35 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle36 = jThermometer35.getVisibleRect();
    jThermometer35.requestFocus();
    org.jfree.data.time.DateRange dateRange39 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range42 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange39, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType43 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange45 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange46 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint47 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange45, (org.jfree.data.Range)dateRange46);
    org.jfree.chart.axis.CompassFormat compassFormat48 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType49 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b50 = compassFormat48.equals((java.lang.Object)lengthConstraintType49);
    org.jfree.chart.axis.CompassFormat compassFormat51 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType52 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b53 = compassFormat51.equals((java.lang.Object)lengthConstraintType52);
    boolean b54 = lengthConstraintType49.equals((java.lang.Object)b53);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint55 = new org.jfree.chart.block.RectangleConstraint(0.0d, range42, lengthConstraintType43, (double)1L, (org.jfree.data.Range)dateRange45, lengthConstraintType49);
    chartPanel33.add((java.awt.Component)jThermometer35, (java.lang.Object)lengthConstraintType43);
    int i57 = chartPanel33.getMinimumDrawWidth();
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo58 = chartPanel33.getChartRenderingInfo();
    org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo59 = chartRenderingInfo58.getPlotInfo();
    org.jfree.chart.plot.JThermometer jThermometer60 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle61 = jThermometer60.getVisibleRect();
    org.jfree.chart.plot.JThermometer jThermometer62 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle63 = jThermometer62.getVisibleRect();
    int i64 = jThermometer62.getShowAxisLocation();
    int i65 = jThermometer62.getWidth();
    java.awt.Component component66 = jThermometer60.add((java.awt.Component)jThermometer62);
    jThermometer60.addNotify();
    org.jfree.chart.plot.JThermometer jThermometer72 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event73 = null;
    boolean b75 = jThermometer72.keyDown(event73, 100);
    jThermometer72.setSize((int)(short)100, 8);
    java.awt.Dimension dimension79 = jThermometer72.minimumSize();
    java.awt.Dimension dimension80 = jThermometer72.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener81 = null;
    jThermometer72.removeHierarchyBoundsListener(hierarchyBoundsListener81);
    org.jfree.chart.plot.JThermometer jThermometer83 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle84 = jThermometer83.getVisibleRect();
    java.awt.Rectangle rectangle85 = jThermometer72.getBounds(rectangle84);
    java.awt.Color color86 = java.awt.Color.black;
    float[] f_array92 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array93 = color86.getRGBComponents(f_array92);
    org.jfree.chart.LegendItem legendItem94 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle85, (java.awt.Paint)color86);
    java.awt.Rectangle rectangle95 = jThermometer60.getBounds(rectangle85);
    plotRenderingInfo59.setPlotArea((java.awt.geom.Rectangle2D)rectangle85);
    org.jfree.ui.RectangleEdge rectangleEdge97 = null;
    org.jfree.chart.axis.AxisSpace axisSpace98 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.axis.AxisSpace axisSpace99 = subCategoryAxis1.reserveSpace(graphics2D17, plot18, (java.awt.geom.Rectangle2D)rectangle85, rectangleEdge97, axisSpace98);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(plotRenderingInfo59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle95);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }

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
    java.awt.Shape shape83 = xYShapeRenderer0.getBaseLegendShape();
    
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
    org.junit.Assert.assertNull(shape83);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }

    org.jfree.chart.urls.StandardCategoryURLGenerator standardCategoryURLGenerator3 = new org.jfree.chart.urls.StandardCategoryURLGenerator("jfreechart-", "", "hi!");
    java.lang.Object obj4 = standardCategoryURLGenerator3.clone();
    org.jfree.chart.JFreeChart jFreeChart5 = null;
    org.jfree.chart.ChartPanel chartPanel19 = new org.jfree.chart.ChartPanel(jFreeChart5, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo20 = chartPanel19.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer21 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle22 = jThermometer21.getVisibleRect();
    jThermometer21.requestFocus();
    org.jfree.data.time.DateRange dateRange25 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range28 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange25, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType29 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange31 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange32 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint33 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange31, (org.jfree.data.Range)dateRange32);
    org.jfree.chart.axis.CompassFormat compassFormat34 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType35 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b36 = compassFormat34.equals((java.lang.Object)lengthConstraintType35);
    org.jfree.chart.axis.CompassFormat compassFormat37 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType38 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b39 = compassFormat37.equals((java.lang.Object)lengthConstraintType38);
    boolean b40 = lengthConstraintType35.equals((java.lang.Object)b39);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint41 = new org.jfree.chart.block.RectangleConstraint(0.0d, range28, lengthConstraintType29, (double)1L, (org.jfree.data.Range)dateRange31, lengthConstraintType35);
    chartPanel19.add((java.awt.Component)jThermometer21, (java.lang.Object)lengthConstraintType29);
    chartPanel19.updateUI();
    java.lang.Object obj44 = chartPanel19.getTreeLock();
    boolean b45 = standardCategoryURLGenerator3.equals(obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }

    org.jfree.chart.axis.MonthDateFormat monthDateFormat0 = new org.jfree.chart.axis.MonthDateFormat();
    java.lang.Object obj1 = monthDateFormat0.clone();
    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline5 = new org.jfree.chart.axis.SegmentedTimeline((long)0, (int)(byte)-1, 3);
    java.util.Date date7 = segmentedTimeline5.getDate((long)'a');
    java.lang.String str8 = monthDateFormat0.format(date7);
    org.jfree.ui.TextAnchor textAnchor10 = org.jfree.chart.annotations.TextAnnotation.DEFAULT_TEXT_ANCHOR;
    org.jfree.ui.TextAnchor textAnchor11 = org.jfree.chart.annotations.TextAnnotation.DEFAULT_TEXT_ANCHOR;
    org.jfree.chart.axis.DateTick dateTick13 = new org.jfree.chart.axis.DateTick(date7, "RectangleConstraintType.RANGE", textAnchor10, textAnchor11, (double)100);
    java.lang.String str14 = dateTick13.toString();
    
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "RectangleConstraintType.RANGE"+ "'", str14.equals("RectangleConstraintType.RANGE"));

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }

    java.lang.String str0 = javax.swing.JComponent.TOOL_TIP_TEXT_KEY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ToolTipText"+ "'", str0.equals("ToolTipText"));

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }

    org.jfree.data.xy.XYZDataset xYZDataset0 = null;
    double[][] d_array_array1 = new double[][] {  };
    double[][] d_array_array2 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array1, d_array_array2);
    org.jfree.data.general.PieDataset pieDataset5 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset3, (java.lang.Comparable)0.5d);
    org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
    defaultIntervalCategoryDataset3.removeChangeListener(datasetChangeListener6);
    java.util.List list8 = defaultIntervalCategoryDataset3.getCategories();
    org.jfree.data.time.DateRange dateRange9 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range12 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange9, (double)'a', true);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateToFindZBounds(xYZDataset0, list8, range12, true);
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
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range12);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }

    org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE9;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelAnchor0);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }

    org.jfree.chart.axis.MonthDateFormat monthDateFormat0 = new org.jfree.chart.axis.MonthDateFormat();
    java.lang.Object obj1 = monthDateFormat0.clone();
    org.jfree.chart.urls.TimeSeriesURLGenerator timeSeriesURLGenerator5 = new org.jfree.chart.urls.TimeSeriesURLGenerator((java.text.DateFormat)monthDateFormat0, "LengthConstraintType.NONE", "ZOOM_RESET_DOMAIN", "E");
    org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    java.beans.VetoableChangeListener vetoableChangeListener8 = null;
    timeSeries7.addVetoableChangeListener(vetoableChangeListener8);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = monthDateFormat0.format((java.lang.Object)timeSeries7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }

    int i0 = org.jfree.chart.event.ChartProgressEvent.DRAWING_FINISHED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }

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
    java.awt.Graphics graphics98 = null;
    jThermometer4.paintAll(graphics98);
    
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

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }

    org.jfree.chart.axis.ColorBar colorBar1 = new org.jfree.chart.axis.ColorBar("E");
    java.awt.Graphics2D graphics2D2 = null;
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
    org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo43 = chartRenderingInfo42.getPlotInfo();
    org.jfree.chart.plot.JThermometer jThermometer44 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle45 = jThermometer44.getVisibleRect();
    org.jfree.chart.plot.JThermometer jThermometer46 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle47 = jThermometer46.getVisibleRect();
    int i48 = jThermometer46.getShowAxisLocation();
    int i49 = jThermometer46.getWidth();
    java.awt.Component component50 = jThermometer44.add((java.awt.Component)jThermometer46);
    jThermometer44.addNotify();
    org.jfree.chart.plot.JThermometer jThermometer56 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event57 = null;
    boolean b59 = jThermometer56.keyDown(event57, 100);
    jThermometer56.setSize((int)(short)100, 8);
    java.awt.Dimension dimension63 = jThermometer56.minimumSize();
    java.awt.Dimension dimension64 = jThermometer56.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener65 = null;
    jThermometer56.removeHierarchyBoundsListener(hierarchyBoundsListener65);
    org.jfree.chart.plot.JThermometer jThermometer67 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle68 = jThermometer67.getVisibleRect();
    java.awt.Rectangle rectangle69 = jThermometer56.getBounds(rectangle68);
    java.awt.Color color70 = java.awt.Color.black;
    float[] f_array76 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array77 = color70.getRGBComponents(f_array76);
    org.jfree.chart.LegendItem legendItem78 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle69, (java.awt.Paint)color70);
    java.awt.Rectangle rectangle79 = jThermometer44.getBounds(rectangle69);
    plotRenderingInfo43.setPlotArea((java.awt.geom.Rectangle2D)rectangle69);
    org.jfree.ui.RectangleEdge rectangleEdge81 = null;
    // The following exception was thrown during execution in test generation
    try {
    colorBar1.drawColorBar(graphics2D2, (java.awt.geom.Rectangle2D)rectangle69, rectangleEdge81);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(plotRenderingInfo43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle79);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }

    org.jfree.chart.renderer.xy.GradientXYBarPainter gradientXYBarPainter0 = new org.jfree.chart.renderer.xy.GradientXYBarPainter();
    java.awt.Graphics2D graphics2D1 = null;
    org.jfree.chart.renderer.xy.XYBarRenderer xYBarRenderer2 = null;
    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer5 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis11 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer14 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle15 = jThermometer14.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge16 = null;
    double d17 = categoryAxis11.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle15, rectangleEdge16);
    org.jfree.chart.plot.JThermometer jThermometer22 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event23 = null;
    boolean b25 = jThermometer22.keyDown(event23, 100);
    jThermometer22.setSize((int)(short)100, 8);
    java.awt.Dimension dimension29 = jThermometer22.minimumSize();
    java.awt.Dimension dimension30 = jThermometer22.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener31 = null;
    jThermometer22.removeHierarchyBoundsListener(hierarchyBoundsListener31);
    org.jfree.chart.plot.JThermometer jThermometer33 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle34 = jThermometer33.getVisibleRect();
    java.awt.Rectangle rectangle35 = jThermometer22.getBounds(rectangle34);
    java.awt.Color color36 = java.awt.Color.black;
    float[] f_array42 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array43 = color36.getRGBComponents(f_array42);
    org.jfree.chart.LegendItem legendItem44 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle35, (java.awt.Paint)color36);
    org.jfree.chart.axis.CategoryAxis categoryAxis46 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer49 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle50 = jThermometer49.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge51 = null;
    double d52 = categoryAxis46.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle50, rectangleEdge51);
    categoryAxis46.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke55 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis46.setTickMarkStroke(stroke55);
    org.jfree.chart.JFreeChart jFreeChart57 = null;
    org.jfree.chart.ChartPanel chartPanel71 = new org.jfree.chart.ChartPanel(jFreeChart57, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel71.setReshowDelay((int)(short)1);
    java.awt.Color color74 = java.awt.Color.WHITE;
    chartPanel71.setZoomOutlinePaint((java.awt.Paint)color74);
    org.jfree.chart.LegendItem legendItem76 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle15, (java.awt.Paint)color36, stroke55, (java.awt.Paint)color74);
    xYShapeRenderer5.setShape((java.awt.Shape)rectangle15);
    org.jfree.ui.RectangleEdge rectangleEdge78 = null;
    // The following exception was thrown during execution in test generation
    try {
    gradientXYBarPainter0.paintBarShadow(graphics2D1, xYBarRenderer2, (int)(byte)10, 2, (java.awt.geom.RectangularShape)rectangle15, rectangleEdge78, true);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d52 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color74);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }

    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.axis.DateTickUnit dateTickUnit2 = new org.jfree.chart.axis.DateTickUnit(0, (int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }

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
    org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = chartRenderingInfo41.getPlotInfo();
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.imagemap.ImageMapUtilities.writeImageMap(printWriter0, "E", chartRenderingInfo41);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(plotRenderingInfo42);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }

    long long0 = org.jfree.chart.axis.SegmentedTimeline.MINUTE_SEGMENT_SIZE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long0 == 60000L);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }

    java.util.Locale locale0 = javax.swing.JComponent.getDefaultLocale();
    org.jfree.chart.axis.MonthDateFormat monthDateFormat2 = new org.jfree.chart.axis.MonthDateFormat(locale0, 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale0);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }

    org.jfree.chart.util.LogFormat logFormat3 = new org.jfree.chart.util.LogFormat((double)1L, "series", true);
    // The following exception was thrown during execution in test generation
    try {
    java.math.RoundingMode roundingMode4 = logFormat3.getRoundingMode();
      org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }

    org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE11;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemLabelAnchor0);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }

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
    org.jfree.chart.plot.JThermometer jThermometer39 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event40 = null;
    org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b43 = jThermometer39.gotFocus(event40, (java.lang.Object)timeSeries42);
    jThermometer39.removeNotify();
    chartPanel14.remove((java.awt.Component)jThermometer39);
    jThermometer39.enable();
    
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
    org.junit.Assert.assertTrue(b43 == false);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }

    org.jfree.chart.axis.SubCategoryAxis subCategoryAxis1 = new org.jfree.chart.axis.SubCategoryAxis("Time");
    org.jfree.chart.axis.CategoryAxis categoryAxis3 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer6 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle7 = jThermometer6.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge8 = null;
    double d9 = categoryAxis3.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle7, rectangleEdge8);
    categoryAxis3.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis3.setTickMarkStroke(stroke12);
    double d14 = categoryAxis3.getLowerMargin();
    org.jfree.ui.RectangleInsets rectangleInsets15 = categoryAxis3.getTickLabelInsets();
    subCategoryAxis1.setLabelInsets(rectangleInsets15);
    java.awt.Graphics2D graphics2D17 = null;
    org.jfree.chart.plot.JThermometer jThermometer19 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle20 = jThermometer19.getVisibleRect();
    org.jfree.chart.axis.CategoryAxis categoryAxis22 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer25 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle26 = jThermometer25.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge27 = null;
    double d28 = categoryAxis22.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle26, rectangleEdge27);
    org.jfree.ui.RectangleEdge rectangleEdge29 = null;
    org.jfree.chart.JFreeChart jFreeChart30 = null;
    org.jfree.chart.ChartPanel chartPanel44 = new org.jfree.chart.ChartPanel(jFreeChart30, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo45 = chartPanel44.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer46 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle47 = jThermometer46.getVisibleRect();
    jThermometer46.requestFocus();
    org.jfree.data.time.DateRange dateRange50 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range53 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange50, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType54 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange56 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange57 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint58 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange56, (org.jfree.data.Range)dateRange57);
    org.jfree.chart.axis.CompassFormat compassFormat59 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType60 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b61 = compassFormat59.equals((java.lang.Object)lengthConstraintType60);
    org.jfree.chart.axis.CompassFormat compassFormat62 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType63 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b64 = compassFormat62.equals((java.lang.Object)lengthConstraintType63);
    boolean b65 = lengthConstraintType60.equals((java.lang.Object)b64);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint66 = new org.jfree.chart.block.RectangleConstraint(0.0d, range53, lengthConstraintType54, (double)1L, (org.jfree.data.Range)dateRange56, lengthConstraintType60);
    chartPanel44.add((java.awt.Component)jThermometer46, (java.lang.Object)lengthConstraintType54);
    int i68 = chartPanel44.getMinimumDrawWidth();
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo69 = chartPanel44.getChartRenderingInfo();
    org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo70 = chartRenderingInfo69.getPlotInfo();
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.axis.AxisState axisState71 = subCategoryAxis1.draw(graphics2D17, (double)255, (java.awt.geom.Rectangle2D)rectangle20, (java.awt.geom.Rectangle2D)rectangle26, rectangleEdge29, plotRenderingInfo70);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(plotRenderingInfo70);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }

    org.jfree.chart.util.LogFormat logFormat3 = new org.jfree.chart.util.LogFormat((double)1L, "series", true);
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle5 = jThermometer4.getVisibleRect();
    int i6 = jThermometer4.getShowAxisLocation();
    int i7 = jThermometer4.getWidth();
    boolean b8 = logFormat3.equals((java.lang.Object)jThermometer4);
    int i9 = logFormat3.getMaximumFractionDigits();
    java.lang.Object obj10 = logFormat3.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }

    java.awt.Color color1 = java.awt.Color.BLACK;
    java.awt.Stroke stroke2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    org.jfree.chart.plot.CategoryMarker categoryMarker3 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)9, (java.awt.Paint)color1, stroke2);
    categoryMarker3.setDrawAsLine(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke2);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }

    org.jfree.chart.axis.SubCategoryAxis subCategoryAxis1 = new org.jfree.chart.axis.SubCategoryAxis("Time");
    org.jfree.chart.axis.CategoryAxis categoryAxis3 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer6 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle7 = jThermometer6.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge8 = null;
    double d9 = categoryAxis3.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle7, rectangleEdge8);
    categoryAxis3.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis3.setTickMarkStroke(stroke12);
    double d14 = categoryAxis3.getLowerMargin();
    org.jfree.ui.RectangleInsets rectangleInsets15 = categoryAxis3.getTickLabelInsets();
    subCategoryAxis1.setLabelInsets(rectangleInsets15);
    subCategoryAxis1.setTickMarkOutsideLength((float)9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets15);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }

    org.jfree.chart.axis.ColorBar colorBar1 = new org.jfree.chart.axis.ColorBar("E");
    org.jfree.chart.plot.ColorPalette colorPalette2 = colorBar1.getColorPalette();
    org.jfree.chart.plot.ContourPlot contourPlot3 = null;
    // The following exception was thrown during execution in test generation
    try {
    colorBar1.configure(contourPlot3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorPalette2);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }

    float f0 = java.awt.Component.TOP_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 0.0f);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }

    org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double)' ');
    java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
    java.awt.Paint paint3 = valueMarker1.getPaint();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint3);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    int i2 = jThermometer0.getShowAxisLocation();
    java.awt.Event event3 = null;
    boolean b6 = jThermometer0.mouseMove(event3, 1, (int)' ');
    jThermometer0.firePropertyChange("hi!", 0, 2);
    boolean b11 = jThermometer0.isVisible();
    jThermometer0.firePropertyChange("ZOOM_RESET_RANGE", (long)64, (long)52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }

    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline0 = org.jfree.chart.axis.SegmentedTimeline.newFifteenMinuteTimeline();
    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline4 = new org.jfree.chart.axis.SegmentedTimeline((long)0, (int)(byte)-1, 3);
    java.util.Date date6 = segmentedTimeline4.getDate((long)'a');
    org.jfree.data.time.DateRange dateRange7 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange8 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint9 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange7, (org.jfree.data.Range)dateRange8);
    boolean b11 = dateRange8.contains((double)64);
    java.util.Date date12 = dateRange8.getLowerDate();
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = segmentedTimeline0.containsDomainRange(date6, date12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(segmentedTimeline0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date12);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }

    org.jfree.data.time.RegularTimePeriod regularTimePeriod0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.time.ohlc.OHLCItem oHLCItem5 = new org.jfree.data.time.ohlc.OHLCItem(regularTimePeriod0, 0.0d, (double)6, (double)(short)100, (double)0L);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }

    org.jfree.chart.axis.AxisState axisState1 = new org.jfree.chart.axis.AxisState(Double.NaN);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    int i2 = jThermometer0.getShowAxisLocation();
    jThermometer0.setSubrangeInfo((int)(byte)1, (double)768, (double)5, (double)13, (double)(-1L));
    jThermometer0.doLayout();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }

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
    java.awt.event.MouseEvent mouseEvent41 = null;
    // The following exception was thrown during execution in test generation
    try {
    chartPanel14.mouseReleased(mouseEvent41);
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
    org.junit.Assert.assertTrue(i38 == 13);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }

    org.jfree.chart.JFreeChart jFreeChart1 = null;
    org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("series", jFreeChart1);
    boolean b3 = chartFrame2.isAlwaysOnTop();
    // The following exception was thrown during execution in test generation
    try {
    chartFrame2.createBufferStrategy((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }

    java.awt.Color color0 = java.awt.Color.RED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color0);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }

    int i0 = java.text.DateFormat.DAY_OF_WEEK_IN_MONTH_FIELD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 11);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }

    java.lang.String str0 = org.jfree.chart.urls.StandardXYURLGenerator.DEFAULT_ITEM_PARAMETER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "item"+ "'", str0.equals("item"));

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }

    int i0 = org.jfree.chart.ChartPanel.DEFAULT_WIDTH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 680);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }

    org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)100.0f);
    org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
    // The following exception was thrown during execution in test generation
    try {
    timeSeries1.update(regularTimePeriod2, (double)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }

    org.jfree.data.time.TimeSeriesCollection timeSeriesCollection0 = new org.jfree.data.time.TimeSeriesCollection();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number3 = timeSeriesCollection0.getEndY((int)(short)100, 5);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel6 = new org.jfree.chart.ChartPanel(jFreeChart0, false, false, true, false, true);
    int i9 = chartPanel6.getBaseline(6, 768);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    int i2 = jThermometer0.getShowAxisLocation();
    java.awt.Event event3 = null;
    boolean b6 = jThermometer0.mouseMove(event3, 1, (int)' ');
    jThermometer0.firePropertyChange("hi!", 0, 2);
    javax.swing.KeyStroke keyStroke11 = null;
    jThermometer0.unregisterKeyboardAction(keyStroke11);
    org.jfree.chart.JFreeChart jFreeChart13 = null;
    org.jfree.chart.ChartPanel chartPanel27 = new org.jfree.chart.ChartPanel(jFreeChart13, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel27.setReshowDelay((int)(short)1);
    java.awt.image.ImageProducer imageProducer30 = null;
    java.awt.Image image31 = chartPanel27.createImage(imageProducer30);
    org.jfree.chart.JFreeChart jFreeChart32 = null;
    org.jfree.chart.ChartPanel chartPanel46 = new org.jfree.chart.ChartPanel(jFreeChart32, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo47 = chartPanel46.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer48 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle49 = jThermometer48.getVisibleRect();
    jThermometer48.requestFocus();
    org.jfree.data.time.DateRange dateRange52 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range55 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange52, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType56 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange58 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange59 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint60 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange58, (org.jfree.data.Range)dateRange59);
    org.jfree.chart.axis.CompassFormat compassFormat61 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType62 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b63 = compassFormat61.equals((java.lang.Object)lengthConstraintType62);
    org.jfree.chart.axis.CompassFormat compassFormat64 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType65 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b66 = compassFormat64.equals((java.lang.Object)lengthConstraintType65);
    boolean b67 = lengthConstraintType62.equals((java.lang.Object)b66);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint68 = new org.jfree.chart.block.RectangleConstraint(0.0d, range55, lengthConstraintType56, (double)1L, (org.jfree.data.Range)dateRange58, lengthConstraintType62);
    chartPanel46.add((java.awt.Component)jThermometer48, (java.lang.Object)lengthConstraintType56);
    int i70 = jThermometer0.checkImage(image31, (java.awt.image.ImageObserver)chartPanel46);
    chartPanel46.setFillZoomRectangle(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthConstraintType65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }

    java.lang.String[] str_array0 = org.jfree.chart.axis.QuarterDateFormat.REGULAR_QUARTERS;
    java.lang.String[] str_array1 = org.jfree.chart.axis.QuarterDateFormat.REGULAR_QUARTERS;
    double[] d_array4 = new double[] { 680, '4' };
    double[][] d_array_array5 = new double[][] { d_array4 };
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable[])str_array0, (java.lang.Comparable[])str_array1, d_array_array5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array5);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }

    org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double)' ', (double)0, 10.0d, (double)(byte)-1, (double)'4', (double)0.0f);
    double d7 = xYIntervalDataItem6.getYLowValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 52.0d);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel14.setReshowDelay((int)(short)1);
    chartPanel14.requestFocus();
    java.awt.geom.Point2D point2D18 = chartPanel14.getAnchor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point2D18);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }

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
    java.lang.Boolean b97 = xYShapeRenderer0.getSeriesVisibleInLegend((int)(short)0);
    boolean b99 = xYShapeRenderer0.isSeriesVisible((-192));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b99 == true);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }

    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline0 = org.jfree.chart.axis.SegmentedTimeline.newFifteenMinuteTimeline();
    org.jfree.chart.axis.SegmentedTimeline.Segment segment2 = segmentedTimeline0.getSegment((long)3);
    segment2.dec();
    segment2.moveIndexToStart();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(segmentedTimeline0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(segment2);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }

    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.encoders.ImageEncoder imageEncoder3 = org.jfree.chart.encoders.ImageEncoderFactory.newInstance("1.0, -1", (float)7, false);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }

    org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues("hi!", "hi!", "");
    int i4 = timePeriodValues3.getMinEndIndex();
    org.jfree.chart.plot.JThermometer jThermometer5 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle6 = jThermometer5.getVisibleRect();
    jThermometer5.requestFocus();
    boolean b8 = timePeriodValues3.equals((java.lang.Object)jThermometer5);
    java.lang.String str9 = timePeriodValues3.getRangeDescription();
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.time.TimePeriodValue timePeriodValue11 = timePeriodValues3.getDataItem(13);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }

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
    java.lang.Number number17 = timePeriodValuesCollection14.getY(0, (int)(byte)1);
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
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }

    org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle5 = jThermometer4.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge6 = null;
    double d7 = categoryAxis1.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle5, rectangleEdge6);
    categoryAxis1.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis1.setTickMarkStroke(stroke10);
    double d12 = categoryAxis1.getLowerMargin();
    categoryAxis1.setUpperMargin((double)1);
    
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
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }

    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline0 = org.jfree.chart.axis.SegmentedTimeline.newFifteenMinuteTimeline();
    org.jfree.chart.axis.SegmentedTimeline.Segment segment2 = segmentedTimeline0.getSegment((long)3);
    boolean b4 = segment2.contains((long)(-4));
    boolean b5 = segment2.inExceptionSegments();
    long long6 = segment2.getSegmentNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(segmentedTimeline0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(segment2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 2454364L);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }

    org.jfree.chart.util.LogFormat logFormat0 = new org.jfree.chart.util.LogFormat();
    org.jfree.chart.axis.CompassFormat compassFormat1 = new org.jfree.chart.axis.CompassFormat();
    logFormat0.setExponentFormat((java.text.NumberFormat)compassFormat1);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }

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
    categoryAxis1.setMinorTickMarkOutsideLength((float)(-192));
    
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
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }

    org.jfree.data.contour.DefaultContourDataset defaultContourDataset0 = new org.jfree.data.contour.DefaultContourDataset();
    // The following exception was thrown during execution in test generation
    try {
    int i2 = defaultContourDataset0.getItemCount(4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }

    org.jfree.data.function.NormalDistributionFunction2D normalDistributionFunction2D2 = new org.jfree.data.function.NormalDistributionFunction2D((double)(byte)100, (double)100L);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }

    org.jfree.data.io.CSV cSV2 = new org.jfree.data.io.CSV('4', ' ');

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }

    org.jfree.text.TextBox textBox3 = null;
    org.jfree.chart.plot.PieLabelRecord pieLabelRecord7 = new org.jfree.chart.plot.PieLabelRecord((java.lang.Comparable)(-1L), (double)10, (double)10.0f, textBox3, (double)(byte)10, (double)0L, (double)0.5f);
    double d8 = pieLabelRecord7.getLinkPercent();
    org.jfree.text.TextBox textBox9 = pieLabelRecord7.getLabel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(textBox9);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    boolean b15 = chartPanel14.isDomainZoomable();
    double d16 = chartPanel14.getZoomOutFactor();
    java.awt.Event event17 = null;
    // The following exception was thrown during execution in test generation
    try {
    chartPanel14.deliverEvent(event17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 2.0d);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    boolean b3 = jThermometer0.keyDown(event1, 100);
    jThermometer0.setSize((int)(short)100, 8);
    java.awt.Dimension dimension7 = jThermometer0.minimumSize();
    java.awt.Dimension dimension8 = jThermometer0.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
    jThermometer0.removeHierarchyBoundsListener(hierarchyBoundsListener9);
    java.io.PrintWriter printWriter11 = null;
    // The following exception was thrown during execution in test generation
    try {
    jThermometer0.list(printWriter11, 52);
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
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }

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
    boolean b78 = xYShapeRenderer0.getAutoPopulateSeriesOutlineStroke();
    
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
    org.junit.Assert.assertTrue(b78 == false);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }

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
    java.awt.event.ActionEvent actionEvent38 = null;
    // The following exception was thrown during execution in test generation
    try {
    chartPanel14.actionPerformed(actionEvent38);
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

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }

    org.jfree.data.gantt.GanttCategoryDataset ganttCategoryDataset0 = null;
    org.jfree.data.gantt.SlidingGanttCategoryDataset slidingGanttCategoryDataset3 = new org.jfree.data.gantt.SlidingGanttCategoryDataset(ganttCategoryDataset0, 0, 64);
    // The following exception was thrown during execution in test generation
    try {
    int i6 = slidingGanttCategoryDataset3.getSubIntervalCount((java.lang.Comparable)(byte)100, (java.lang.Comparable)"RectangleConstraintType.RANGE");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }

    org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues("hi!", "hi!", "");
    int i4 = timePeriodValues3.getMinEndIndex();
    org.jfree.chart.plot.JThermometer jThermometer5 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle6 = jThermometer5.getVisibleRect();
    jThermometer5.requestFocus();
    boolean b8 = timePeriodValues3.equals((java.lang.Object)jThermometer5);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number12 = timePeriodValues3.getValue(255);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = chartPanel14.getChartRenderingInfo();
    int i16 = chartPanel14.getMaximumDrawWidth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 2);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }

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
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.imagemap.ImageMapUtilities.writeImageMap(printWriter0, "ToolTipText", chartRenderingInfo41);
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
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }

    long long0 = org.jfree.chart.axis.SegmentedTimeline.HOUR_SEGMENT_SIZE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long0 == 3600000L);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }

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
    javax.swing.KeyStroke keyStroke50 = null;
    chartPanel14.unregisterKeyboardAction(keyStroke50);
    
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
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }

    double[][] d_array_array0 = new double[][] {  };
    double[][] d_array_array1 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array0, d_array_array1);
    org.jfree.data.general.PieDataset pieDataset4 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset2, (java.lang.Comparable)0.5d);
    java.util.List list5 = defaultIntervalCategoryDataset2.getSeries();
    org.jfree.data.general.SeriesChangeEvent seriesChangeEvent6 = null;
    defaultIntervalCategoryDataset2.seriesChanged(seriesChangeEvent6);
    defaultIntervalCategoryDataset2.validateObject();
    java.lang.Comparable comparable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    defaultIntervalCategoryDataset2.setStartValue((int)(byte)-1, comparable10, (java.lang.Number)2454364L);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
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
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }

    org.jfree.chart.axis.MonthDateFormat monthDateFormat0 = new org.jfree.chart.axis.MonthDateFormat();
    java.awt.Color color1 = org.jfree.chart.ChartColor.VERY_LIGHT_GREEN;
    // The following exception was thrown during execution in test generation
    try {
    java.text.AttributedCharacterIterator attributedCharacterIterator2 = monthDateFormat0.formatToCharacterIterator((java.lang.Object)color1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color1);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }

    org.jfree.chart.imagemap.DynamicDriveToolTipTagFragmentGenerator dynamicDriveToolTipTagFragmentGenerator2 = new org.jfree.chart.imagemap.DynamicDriveToolTipTagFragmentGenerator("", (int)' ');
    java.lang.String str4 = dynamicDriveToolTipTagFragmentGenerator2.generateToolTipFragment("item");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " onMouseOver=\"return stm(['','item'],Style[32]);\" onMouseOut=\"return htm();\""+ "'", str4.equals(" onMouseOver=\"return stm(['','item'],Style[32]);\" onMouseOut=\"return htm();\""));

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }

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
    org.jfree.chart.axis.CategoryAxis categoryAxis75 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer78 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle79 = jThermometer78.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge80 = null;
    double d81 = categoryAxis75.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle79, rectangleEdge80);
    categoryAxis75.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Paint paint84 = categoryAxis75.getAxisLinePaint();
    xYShapeRenderer0.setGuideLinePaint(paint84);
    
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
    org.junit.Assert.assertNotNull(rectangle79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d81 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint84);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }

    java.lang.Class class3 = null;
    org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)13, "ZOOM_DOMAIN_BOTH", "", class3);
    java.util.TimeZone timeZone5 = org.jfree.chart.axis.SegmentedTimeline.NO_DST_TIME_ZONE;
    org.jfree.data.time.TimeSeriesCollection timeSeriesCollection6 = new org.jfree.data.time.TimeSeriesCollection(timeSeries4, timeZone5);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries4.getDataItem((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeZone5);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }

    org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double)' ');
    java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
    java.awt.Paint paint3 = valueMarker1.getLabelPaint();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint3);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }

    double[][] d_array_array0 = new double[][] {  };
    double[][] d_array_array1 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array0, d_array_array1);
    org.jfree.data.general.SeriesDataset[] seriesDataset_array3 = new org.jfree.data.general.SeriesDataset[] { defaultIntervalCategoryDataset2 };
    org.jfree.data.general.CombinedDataset combinedDataset4 = new org.jfree.data.general.CombinedDataset(seriesDataset_array3);
    org.jfree.data.Range range5 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset)combinedDataset4);
    org.jfree.data.Range range6 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset)combinedDataset4);
    org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset)combinedDataset4);
    
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
    org.junit.Assert.assertNull(range7);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    boolean b15 = chartPanel14.isDomainZoomable();
    chartPanel14.setAutoscrolls(true);
    chartPanel14.setDisplayToolTips(false);
    java.lang.Object obj20 = chartPanel14.getTreeLock();
    chartPanel14.setRequestFocusEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj20);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }

    org.jfree.data.resources.DataPackageResources_pl dataPackageResources_pl1 = new org.jfree.data.resources.DataPackageResources_pl();
    java.lang.Object[][] obj_array_array2 = dataPackageResources_pl1.getContents();
    java.lang.Number[] number_array5 = new java.lang.Number[] {  };
    java.lang.Number[] number_array6 = new java.lang.Number[] {  };
    java.lang.Number[] number_array7 = new java.lang.Number[] {  };
    java.lang.Number[][] number_array_array8 = new java.lang.Number[][] { number_array5, number_array6, number_array7 };
    org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("LengthConstraintType.NONE", "ZOOM_RESET_DOMAIN", number_array_array8);
    java.awt.Frame[] frame_array10 = java.awt.Frame.getFrames();
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.data.contour.NonGridContourDataset nonGridContourDataset14 = new org.jfree.data.contour.NonGridContourDataset("ZOOM_DOMAIN_BOTH", (java.lang.Object[])obj_array_array2, (java.lang.Object[])number_array_array8, (java.lang.Object[])frame_array10, (int)(byte)100, (int)(short)-1, 8);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(number_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(number_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(number_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(number_array_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryDataset9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(frame_array10);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }

    java.text.AttributedString attributedString0 = null;
    org.jfree.chart.renderer.xy.XYShapeRenderer xYShapeRenderer4 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CategoryAxis categoryAxis10 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer13 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle14 = jThermometer13.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge15 = null;
    double d16 = categoryAxis10.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle14, rectangleEdge15);
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
    org.jfree.chart.axis.CategoryAxis categoryAxis45 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer48 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle49 = jThermometer48.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge50 = null;
    double d51 = categoryAxis45.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle49, rectangleEdge50);
    categoryAxis45.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke54 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis45.setTickMarkStroke(stroke54);
    org.jfree.chart.JFreeChart jFreeChart56 = null;
    org.jfree.chart.ChartPanel chartPanel70 = new org.jfree.chart.ChartPanel(jFreeChart56, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel70.setReshowDelay((int)(short)1);
    java.awt.Color color73 = java.awt.Color.WHITE;
    chartPanel70.setZoomOutlinePaint((java.awt.Paint)color73);
    org.jfree.chart.LegendItem legendItem75 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle14, (java.awt.Paint)color35, stroke54, (java.awt.Paint)color73);
    xYShapeRenderer4.setShape((java.awt.Shape)rectangle14);
    java.awt.Stroke stroke77 = null;
    java.awt.Color color79 = java.awt.Color.BLACK;
    java.awt.Stroke stroke80 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    org.jfree.chart.plot.CategoryMarker categoryMarker81 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)9, (java.awt.Paint)color79, stroke80);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.LegendItem legendItem82 = new org.jfree.chart.LegendItem(attributedString0, "ZOOM_IN_BOTH", "Time", "series", (java.awt.Shape)rectangle14, stroke77, (java.awt.Paint)color79);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
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
    org.junit.Assert.assertNotNull(rectangle49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d51 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke80);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }

    int i0 = org.jfree.chart.util.HexNumberFormat.WORD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 4);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.JFreeChart jFreeChart3 = null;
    org.jfree.chart.ChartPanel chartPanel17 = new org.jfree.chart.ChartPanel(jFreeChart3, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo18 = chartPanel17.getChartRenderingInfo();
    javax.servlet.http.HttpSession httpSession19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = org.jfree.chart.servlet.ServletUtilities.saveChartAsJPEG(jFreeChart0, 10, 8, chartRenderingInfo18, httpSession19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo18);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }

    org.jfree.data.time.TimeSeriesCollection timeSeriesCollection0 = new org.jfree.data.time.TimeSeriesCollection();
    timeSeriesCollection0.setDomainIsPointsInTime(true);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number5 = timeSeriesCollection0.getX(128, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }

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
    org.xml.sax.Locator locator24 = null;
    rootHandler18.setDocumentLocator(locator24);
    
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
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }

    java.awt.image.BufferedImage bufferedImage0 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array2 = org.jfree.chart.encoders.EncoderUtil.encode(bufferedImage0, "ToolTipText");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }

    org.jfree.data.RangeType rangeType0 = org.jfree.data.RangeType.FULL;
    java.lang.String str1 = rangeType0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rangeType0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "RangeType.FULL"+ "'", str1.equals("RangeType.FULL"));

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }

    org.jfree.chart.JFreeChart jFreeChart1 = null;
    org.jfree.chart.ChartPanel chartPanel15 = new org.jfree.chart.ChartPanel(jFreeChart1, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo16 = chartPanel15.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer17 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle18 = jThermometer17.getVisibleRect();
    jThermometer17.requestFocus();
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
    chartPanel15.add((java.awt.Component)jThermometer17, (java.lang.Object)lengthConstraintType25);
    int i39 = chartPanel15.getMinimumDrawWidth();
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo40 = chartPanel15.getChartRenderingInfo();
    org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo41 = chartRenderingInfo40.getPlotInfo();
    org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = chartRenderingInfo40.getPlotInfo();
    java.lang.String str43 = org.jfree.chart.imagemap.ImageMapUtilities.getImageMap("index.html", chartRenderingInfo40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);
    
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
    org.junit.Assert.assertTrue(i39 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(plotRenderingInfo41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(plotRenderingInfo42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "<map id=\"index.html\" name=\"index.html\">\n</map>"+ "'", str43.equals("<map id=\"index.html\" name=\"index.html\">\n</map>"));

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }

    org.jfree.data.time.TimeSeriesCollection timeSeriesCollection0 = new org.jfree.data.time.TimeSeriesCollection();
    java.util.List list1 = timeSeriesCollection0.getSeries();
    org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset)timeSeriesCollection0);
    org.jfree.data.Range range4 = timeSeriesCollection0.getDomainBounds(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(range2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(range4);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }

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
    java.awt.Paint paint85 = xYShapeRenderer0.getGuideLinePaint();
    
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
    org.junit.Assert.assertNotNull(paint85);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    boolean b3 = jThermometer0.keyDown(event1, 100);
    jThermometer0.setVisible(false);
    boolean b6 = jThermometer0.isFocusTraversable();
    int i9 = jThermometer0.getBaseline((int)(short)1, 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }

    org.jfree.chart.axis.CompassFormat compassFormat0 = new org.jfree.chart.axis.CompassFormat();
    int i1 = compassFormat0.getMinimumIntegerDigits();
    int i2 = compassFormat0.getMaximumFractionDigits();
    java.lang.String str4 = compassFormat0.getDirectionCode((double)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "N"+ "'", str4.equals("N"));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }

    org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues("hi!", "hi!", "");
    java.beans.VetoableChangeListener vetoableChangeListener4 = null;
    timePeriodValues3.removeVetoableChangeListener(vetoableChangeListener4);
    int i6 = timePeriodValues3.getItemCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }

    double[][] d_array_array0 = new double[][] {  };
    double[][] d_array_array1 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array0, d_array_array1);
    org.jfree.data.general.SeriesDataset[] seriesDataset_array3 = new org.jfree.data.general.SeriesDataset[] { defaultIntervalCategoryDataset2 };
    org.jfree.data.general.CombinedDataset combinedDataset4 = new org.jfree.data.general.CombinedDataset(seriesDataset_array3);
    org.jfree.data.general.CombinedDataset combinedDataset5 = new org.jfree.data.general.CombinedDataset(seriesDataset_array3);
    // The following exception was thrown during execution in test generation
    try {
    double d8 = combinedDataset5.getLowValue(9, 680);
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

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }

    double[][] d_array_array0 = new double[][] {  };
    double[][] d_array_array1 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array0, d_array_array1);
    org.jfree.data.general.SeriesDataset[] seriesDataset_array3 = new org.jfree.data.general.SeriesDataset[] { defaultIntervalCategoryDataset2 };
    org.jfree.data.general.CombinedDataset combinedDataset4 = new org.jfree.data.general.CombinedDataset(seriesDataset_array3);
    java.lang.Number number5 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue((org.jfree.data.xy.XYDataset)combinedDataset4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(seriesDataset_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(number5);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }

    java.util.Locale locale0 = javax.swing.JComponent.getDefaultLocale();
    java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getInstance(locale0);
    java.text.NumberFormat numberFormat2 = java.text.NumberFormat.getIntegerInstance(locale0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(numberFormat1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(numberFormat2);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event1 = null;
    org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)6);
    boolean b4 = jThermometer0.gotFocus(event1, (java.lang.Object)timeSeries3);
    boolean b5 = jThermometer0.requestDefaultFocus();
    boolean b6 = jThermometer0.isCursorSet();
    org.jfree.chart.plot.JThermometer jThermometer7 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle8 = jThermometer7.getVisibleRect();
    int i9 = jThermometer7.getShowAxisLocation();
    javax.swing.plaf.PanelUI panelUI10 = jThermometer7.getUI();
    jThermometer0.setUI(panelUI10);
    jThermometer0.removeAll();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(panelUI10);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }

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
    org.jfree.chart.renderer.xy.StandardXYBarPainter standardXYBarPainter88 = new org.jfree.chart.renderer.xy.StandardXYBarPainter();
    java.awt.Font font89 = org.jfree.chart.annotations.TextAnnotation.DEFAULT_FONT;
    boolean b90 = standardXYBarPainter88.equals((java.lang.Object)font89);
    xYShapeRenderer0.setBaseItemLabelFont(font89);
    org.jfree.chart.plot.DrawingSupplier drawingSupplier92 = xYShapeRenderer0.getDrawingSupplier();
    
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
    org.junit.Assert.assertNotNull(font89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(drawingSupplier92);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }

    java.awt.Color color0 = java.awt.Color.CYAN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color0);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }

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
    int i44 = chartPanel14.getMaximumDrawHeight();
    
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
    org.junit.Assert.assertTrue(i44 == (-1));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }

    org.jfree.ui.HorizontalAlignment horizontalAlignment0 = null;
    org.jfree.ui.VerticalAlignment verticalAlignment1 = null;
    org.jfree.chart.block.FlowArrangement flowArrangement4 = new org.jfree.chart.block.FlowArrangement(horizontalAlignment0, verticalAlignment1, (double)0L, (double)1);
    org.jfree.chart.block.Block block5 = null;
    java.awt.Color color7 = java.awt.Color.BLACK;
    org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator11 = new org.jfree.chart.util.DefaultShadowGenerator((int)(byte)100, color7, (float)0, (int)'4', (double)1.0f);
    flowArrangement4.add(block5, (java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color7);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }

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
    java.awt.Color color81 = org.jfree.chart.ChartColor.DARK_YELLOW;
    org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator85 = new org.jfree.chart.util.DefaultShadowGenerator((int)'#', color81, (float)(-143), (int)(byte)-1, 0.2d);
    xYShapeRenderer0.setPaint((java.awt.Paint)color81);
    xYShapeRenderer0.setSeriesVisibleInLegend(768, (java.lang.Boolean)false, false);
    
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

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel6 = new org.jfree.chart.ChartPanel(jFreeChart0, false, true, true, false, true);
    chartPanel6.setFillZoomRectangle(false);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }

    org.jfree.chart.plot.JThermometer jThermometer0 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle1 = jThermometer0.getVisibleRect();
    int i2 = jThermometer0.getShowAxisLocation();
    java.awt.Event event3 = null;
    boolean b6 = jThermometer0.mouseMove(event3, 1, (int)' ');
    boolean b7 = jThermometer0.isOpaque();
    jThermometer0.list();
    org.jfree.chart.plot.JThermometer jThermometer9 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event10 = null;
    boolean b12 = jThermometer9.keyDown(event10, 100);
    jThermometer9.setVisible(false);
    java.awt.Point point15 = jThermometer9.location();
    boolean b16 = jThermometer0.contains(point15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }

    org.jfree.data.general.SeriesException seriesException1 = new org.jfree.data.general.SeriesException("");

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }

    org.jfree.chart.plot.CategoryCrosshairState categoryCrosshairState0 = new org.jfree.chart.plot.CategoryCrosshairState();
    org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions3 = categoryAxis2.getCategoryLabelPositions();
    org.jfree.chart.event.AxisChangeListener axisChangeListener4 = null;
    categoryAxis2.removeChangeListener(axisChangeListener4);
    org.jfree.data.xy.YIntervalDataItem yIntervalDataItem10 = new org.jfree.data.xy.YIntervalDataItem((double)9, (double)(byte)1, (double)4, (double)(byte)0);
    java.awt.Font font11 = categoryAxis2.getTickLabelFont((java.lang.Comparable)yIntervalDataItem10);
    org.jfree.chart.plot.PlotOrientation plotOrientation17 = org.jfree.chart.plot.PlotOrientation.VERTICAL;
    categoryCrosshairState0.updateCrosshairPoint((java.lang.Comparable)yIntervalDataItem10, (java.lang.Comparable)52, (double)10.0f, (int)'4', (double)7, 0.0d, plotOrientation17);
    java.lang.Comparable comparable19 = categoryCrosshairState0.getColumnKey();
    categoryCrosshairState0.setCrosshairX((double)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(categoryLabelPositions3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(plotOrientation17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparable19);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }

    org.jfree.data.gantt.GanttCategoryDataset ganttCategoryDataset0 = null;
    org.jfree.data.gantt.SlidingGanttCategoryDataset slidingGanttCategoryDataset3 = new org.jfree.data.gantt.SlidingGanttCategoryDataset(ganttCategoryDataset0, 0, 64);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number6 = slidingGanttCategoryDataset3.getStartValue((-1), (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }

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
    rootHandler18.processingInstruction("ZOOM_DOMAIN_BOTH", "CategoryDataset");
    
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
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }

    org.jfree.data.time.TimePeriodFormatException timePeriodFormatException1 = new org.jfree.data.time.TimePeriodFormatException("1.0, -1");
    java.lang.Throwable[] throwable_array2 = timePeriodFormatException1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array2);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }

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
    org.jfree.chart.labels.ItemLabelPosition itemLabelPosition80 = xYShapeRenderer0.getBasePositiveItemLabelPosition();
    java.lang.Boolean b81 = xYShapeRenderer0.getSeriesVisibleInLegend();
    
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
    org.junit.Assert.assertNotNull(itemLabelPosition80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b81);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }

    double[][] d_array_array0 = new double[][] {  };
    double[][] d_array_array1 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array0, d_array_array1);
    org.jfree.data.general.PieDataset pieDataset4 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset2, (java.lang.Comparable)0.5d);
    org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
    defaultIntervalCategoryDataset2.removeChangeListener(datasetChangeListener5);
    java.util.List list7 = defaultIntervalCategoryDataset2.getCategories();
    java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset2);
    org.jfree.data.xy.XYDatasetTableModel xYDatasetTableModel9 = new org.jfree.data.xy.XYDatasetTableModel();
    defaultIntervalCategoryDataset2.addChangeListener((org.jfree.data.general.DatasetChangeListener)xYDatasetTableModel9);
    javax.swing.event.TableModelListener tableModelListener11 = null;
    xYDatasetTableModel9.addTableModelListener(tableModelListener11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pieDataset4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(number8);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }

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
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo39 = chartPanel14.getChartRenderingInfo();
    java.io.PrintStream printStream40 = null;
    // The following exception was thrown during execution in test generation
    try {
    chartPanel14.list(printStream40);
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
    org.junit.Assert.assertTrue(i38 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chartRenderingInfo39);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }

    java.util.Locale locale0 = javax.swing.JComponent.getDefaultLocale();
    java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getInstance(locale0);
    boolean b2 = numberFormat1.isGroupingUsed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(numberFormat1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }

    org.jfree.chart.axis.TickType tickType0 = org.jfree.chart.axis.TickType.MAJOR;
    org.jfree.data.time.DateRange dateRange1 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange2 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint3 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange1, (org.jfree.data.Range)dateRange2);
    boolean b5 = dateRange2.contains((double)64);
    java.util.Date date6 = dateRange2.getLowerDate();
    org.jfree.ui.TextAnchor textAnchor8 = null;
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition9 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition10 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition11 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition categoryLabelPosition12 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions13 = new org.jfree.chart.axis.CategoryLabelPositions(categoryLabelPosition9, categoryLabelPosition10, categoryLabelPosition11, categoryLabelPosition12);
    org.jfree.ui.TextAnchor textAnchor14 = categoryLabelPosition9.getRotationAnchor();
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.axis.DateTick dateTick16 = new org.jfree.chart.axis.DateTick(tickType0, date6, "hi!", textAnchor8, textAnchor14, 4.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tickType0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor14);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }

    org.jfree.chart.JFreeChart jFreeChart0 = null;
    org.jfree.chart.ChartPanel chartPanel14 = new org.jfree.chart.ChartPanel(jFreeChart0, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel14.paintImmediately((int)(short)100, (int)(short)100, (int)'#', (int)(byte)1);
    java.lang.Class class20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.EventListener[] eventListener_array21 = chartPanel14.getListeners(class20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }

    org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer4 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle5 = jThermometer4.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge6 = null;
    double d7 = categoryAxis1.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle5, rectangleEdge6);
    categoryAxis1.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis1.setTickMarkStroke(stroke10);
    double d12 = categoryAxis1.getLowerMargin();
    categoryAxis1.setUpperMargin((double)100.0f);
    
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
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }

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
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Number number61 = defaultBoxAndWhiskerXYDataset1.getY((-4), (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }

    org.jfree.chart.plot.PieLabelLinkStyle pieLabelLinkStyle0 = org.jfree.chart.plot.PieLabelLinkStyle.QUAD_CURVE;
    java.lang.Number number3 = null;
    double[][] d_array_array9 = new double[][] {  };
    double[][] d_array_array10 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array9, d_array_array10);
    org.jfree.data.general.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset11, (java.lang.Comparable)0.5d);
    org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
    defaultIntervalCategoryDataset11.removeChangeListener(datasetChangeListener14);
    java.util.List list16 = defaultIntervalCategoryDataset11.getCategories();
    org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem17 = new org.jfree.data.statistics.BoxAndWhiskerItem((java.lang.Number)6, (java.lang.Number)(-143), number3, (java.lang.Number)1.0f, (java.lang.Number)(byte)1, (java.lang.Number)(-1L), (java.lang.Number)7, (java.lang.Number)1.0d, list16);
    boolean b18 = pieLabelLinkStyle0.equals((java.lang.Object)1.0f);
    java.lang.String str19 = pieLabelLinkStyle0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pieLabelLinkStyle0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(d_array_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pieDataset13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "PieLabelLinkStyle.QUAD_CURVE"+ "'", str19.equals("PieLabelLinkStyle.QUAD_CURVE"));

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }

    org.jfree.chart.plot.PieLabelLinkStyle pieLabelLinkStyle0 = org.jfree.chart.plot.PieLabelLinkStyle.QUAD_CURVE;
    org.jfree.data.time.TimePeriodValues timePeriodValues4 = new org.jfree.data.time.TimePeriodValues("hi!", "hi!", "");
    int i5 = timePeriodValues4.getMinEndIndex();
    org.jfree.chart.plot.JThermometer jThermometer6 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle7 = jThermometer6.getVisibleRect();
    jThermometer6.requestFocus();
    boolean b9 = timePeriodValues4.equals((java.lang.Object)jThermometer6);
    java.lang.String str10 = timePeriodValues4.getRangeDescription();
    java.lang.String str11 = timePeriodValues4.getDomainDescription();
    boolean b12 = pieLabelLinkStyle0.equals((java.lang.Object)timePeriodValues4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pieLabelLinkStyle0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }

    java.awt.Color color5 = java.awt.Color.getHSBColor((float)(-192), (float)(short)100, (float)1L);
    org.jfree.chart.axis.CategoryAxis categoryAxis11 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer14 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle15 = jThermometer14.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge16 = null;
    double d17 = categoryAxis11.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle15, rectangleEdge16);
    org.jfree.chart.plot.JThermometer jThermometer22 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event23 = null;
    boolean b25 = jThermometer22.keyDown(event23, 100);
    jThermometer22.setSize((int)(short)100, 8);
    java.awt.Dimension dimension29 = jThermometer22.minimumSize();
    java.awt.Dimension dimension30 = jThermometer22.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener31 = null;
    jThermometer22.removeHierarchyBoundsListener(hierarchyBoundsListener31);
    org.jfree.chart.plot.JThermometer jThermometer33 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle34 = jThermometer33.getVisibleRect();
    java.awt.Rectangle rectangle35 = jThermometer22.getBounds(rectangle34);
    java.awt.Color color36 = java.awt.Color.black;
    float[] f_array42 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array43 = color36.getRGBComponents(f_array42);
    org.jfree.chart.LegendItem legendItem44 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle35, (java.awt.Paint)color36);
    org.jfree.chart.axis.CategoryAxis categoryAxis46 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer49 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle50 = jThermometer49.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge51 = null;
    double d52 = categoryAxis46.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle50, rectangleEdge51);
    categoryAxis46.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke55 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis46.setTickMarkStroke(stroke55);
    org.jfree.chart.JFreeChart jFreeChart57 = null;
    org.jfree.chart.ChartPanel chartPanel71 = new org.jfree.chart.ChartPanel(jFreeChart57, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel71.setReshowDelay((int)(short)1);
    java.awt.Color color74 = java.awt.Color.WHITE;
    chartPanel71.setZoomOutlinePaint((java.awt.Paint)color74);
    org.jfree.chart.LegendItem legendItem76 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle15, (java.awt.Paint)color36, stroke55, (java.awt.Paint)color74);
    java.awt.Color color77 = java.awt.Color.GRAY;
    int i78 = color77.getAlpha();
    org.jfree.chart.axis.CategoryAxis categoryAxis80 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer83 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle84 = jThermometer83.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge85 = null;
    double d86 = categoryAxis80.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle84, rectangleEdge85);
    categoryAxis80.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke89 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis80.setTickMarkStroke(stroke89);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.chart.plot.IntervalMarker intervalMarker92 = new org.jfree.chart.plot.IntervalMarker((double)(-143), 0.2d, (java.awt.Paint)color5, stroke55, (java.awt.Paint)color77, stroke89, (float)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d52 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d86 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke89);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }

    org.jfree.chart.axis.CategoryAxis categoryAxis5 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer8 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle9 = jThermometer8.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge10 = null;
    double d11 = categoryAxis5.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle9, rectangleEdge10);
    org.jfree.chart.plot.JThermometer jThermometer16 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event17 = null;
    boolean b19 = jThermometer16.keyDown(event17, 100);
    jThermometer16.setSize((int)(short)100, 8);
    java.awt.Dimension dimension23 = jThermometer16.minimumSize();
    java.awt.Dimension dimension24 = jThermometer16.preferredSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener25 = null;
    jThermometer16.removeHierarchyBoundsListener(hierarchyBoundsListener25);
    org.jfree.chart.plot.JThermometer jThermometer27 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle28 = jThermometer27.getVisibleRect();
    java.awt.Rectangle rectangle29 = jThermometer16.getBounds(rectangle28);
    java.awt.Color color30 = java.awt.Color.black;
    float[] f_array36 = new float[] { 9, (short)1, (byte)10, 100.0f, (byte)10 };
    float[] f_array37 = color30.getRGBComponents(f_array36);
    org.jfree.chart.LegendItem legendItem38 = new org.jfree.chart.LegendItem("", "ZOOM_RESET_RANGE", "hi!", "hi!", (java.awt.Shape)rectangle29, (java.awt.Paint)color30);
    org.jfree.chart.axis.CategoryAxis categoryAxis40 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.plot.JThermometer jThermometer43 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle44 = jThermometer43.getVisibleRect();
    org.jfree.ui.RectangleEdge rectangleEdge45 = null;
    double d46 = categoryAxis40.getCategoryStart((-192), 7, (java.awt.geom.Rectangle2D)rectangle44, rectangleEdge45);
    categoryAxis40.setMinorTickMarkOutsideLength((float)(-4));
    java.awt.Stroke stroke49 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    categoryAxis40.setTickMarkStroke(stroke49);
    org.jfree.chart.JFreeChart jFreeChart51 = null;
    org.jfree.chart.ChartPanel chartPanel65 = new org.jfree.chart.ChartPanel(jFreeChart51, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    chartPanel65.setReshowDelay((int)(short)1);
    java.awt.Color color68 = java.awt.Color.WHITE;
    chartPanel65.setZoomOutlinePaint((java.awt.Paint)color68);
    org.jfree.chart.LegendItem legendItem70 = new org.jfree.chart.LegendItem("ZOOM_DOMAIN_BOTH", "", "LengthConstraintType.NONE", "ZOOM_RESET_RANGE", (java.awt.Shape)rectangle9, (java.awt.Paint)color30, stroke49, (java.awt.Paint)color68);
    java.lang.String str71 = legendItem70.getURLText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d46 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "ZOOM_RESET_RANGE"+ "'", str71.equals("ZOOM_RESET_RANGE"));

  }

}
