
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test01"); }

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
    javax.swing.InputVerifier inputVerifier39 = chartPanel15.getInputVerifier();
    boolean b40 = chartPanel15.getRefreshBuffer();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array41 = chartPanel15.getMouseMotionListeners();
    double[][] d_array_array44 = new double[][] {  };
    double[][] d_array_array45 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset46 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array44, d_array_array45);
    org.jfree.data.category.CategoryDataset categoryDataset47 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "jfreechart-", d_array_array45);
    org.jfree.chart.JFreeChart jFreeChart48 = null;
    org.jfree.chart.ChartPanel chartPanel62 = new org.jfree.chart.ChartPanel(jFreeChart48, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo63 = chartPanel62.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer64 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle65 = jThermometer64.getVisibleRect();
    jThermometer64.requestFocus();
    org.jfree.data.time.DateRange dateRange68 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range71 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange68, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType72 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange74 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange75 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint76 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange74, (org.jfree.data.Range)dateRange75);
    org.jfree.chart.axis.CompassFormat compassFormat77 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType78 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b79 = compassFormat77.equals((java.lang.Object)lengthConstraintType78);
    org.jfree.chart.axis.CompassFormat compassFormat80 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType81 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b82 = compassFormat80.equals((java.lang.Object)lengthConstraintType81);
    boolean b83 = lengthConstraintType78.equals((java.lang.Object)b82);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint84 = new org.jfree.chart.block.RectangleConstraint(0.0d, range71, lengthConstraintType72, (double)1L, (org.jfree.data.Range)dateRange74, lengthConstraintType78);
    chartPanel62.add((java.awt.Component)jThermometer64, (java.lang.Object)lengthConstraintType72);
    javax.swing.InputVerifier inputVerifier86 = chartPanel62.getInputVerifier();
    boolean b87 = chartPanel62.getRefreshBuffer();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array88 = chartPanel62.getMouseMotionListeners();
    org.jfree.data.contour.DefaultContourDataset defaultContourDataset89 = new org.jfree.data.contour.DefaultContourDataset((java.lang.Comparable)(short)-1, (java.lang.Object[])mouseMotionListener_array41, (java.lang.Object[])d_array_array45, (java.lang.Object[])mouseMotionListener_array88);
    
    // Checks the contract:  equals-hashcode on chartRenderingInfo16 and chartRenderingInfo63
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo16 and chartRenderingInfo63", chartRenderingInfo16.equals(chartRenderingInfo63) ? chartRenderingInfo16.hashCode() == chartRenderingInfo63.hashCode() : true);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test02"); }

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
    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline82 = org.jfree.chart.axis.SegmentedTimeline.newFifteenMinuteTimeline();
    org.jfree.chart.axis.SegmentedTimeline.Segment segment84 = segmentedTimeline82.getSegment((long)3);
    boolean b86 = segment84.contains((long)(-4));
    boolean b87 = segment84.inExceptionSegments();
    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline88 = org.jfree.chart.axis.SegmentedTimeline.newFifteenMinuteTimeline();
    org.jfree.chart.axis.SegmentedTimeline.Segment segment90 = segmentedTimeline88.getSegment((long)3);
    boolean b92 = segment90.contains((long)(-4));
    boolean b93 = segment90.inExceptionSegments();
    boolean b94 = segment84.contains(segment90);
    java.awt.Color color96 = java.awt.Color.BLACK;
    java.awt.Stroke stroke97 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
    org.jfree.chart.plot.CategoryMarker categoryMarker98 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)9, (java.awt.Paint)color96, stroke97);
    categoryAxis1.setTickLabelPaint((java.lang.Comparable)b94, (java.awt.Paint)color96);
    
    // Checks the contract:  equals-hashcode on segment84 and segment90
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on segment84 and segment90", segment84.equals(segment90) ? segment84.hashCode() == segment90.hashCode() : true);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test03"); }

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
    org.jfree.chart.plot.CategoryCrosshairState categoryCrosshairState24 = new org.jfree.chart.plot.CategoryCrosshairState();
    org.jfree.chart.axis.CategoryAxis categoryAxis26 = new org.jfree.chart.axis.CategoryAxis("E");
    org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions27 = categoryAxis26.getCategoryLabelPositions();
    org.jfree.chart.event.AxisChangeListener axisChangeListener28 = null;
    categoryAxis26.removeChangeListener(axisChangeListener28);
    org.jfree.data.xy.YIntervalDataItem yIntervalDataItem34 = new org.jfree.data.xy.YIntervalDataItem((double)9, (double)(byte)1, (double)4, (double)(byte)0);
    java.awt.Font font35 = categoryAxis26.getTickLabelFont((java.lang.Comparable)yIntervalDataItem34);
    org.jfree.chart.plot.PlotOrientation plotOrientation41 = org.jfree.chart.plot.PlotOrientation.VERTICAL;
    categoryCrosshairState24.updateCrosshairPoint((java.lang.Comparable)yIntervalDataItem34, (java.lang.Comparable)52, (double)10.0f, (int)'4', (double)7, 0.0d, plotOrientation41);
    categoryCrosshairState0.updateCrosshairPoint((double)(-1L), (double)(short)10, 0.2d, (double)0, plotOrientation41);
    
    // Checks the contract:  equals-hashcode on yIntervalDataItem34 and yIntervalDataItem10
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on yIntervalDataItem34 and yIntervalDataItem10", yIntervalDataItem34.equals(yIntervalDataItem10) ? yIntervalDataItem34.hashCode() == yIntervalDataItem10.hashCode() : true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test04"); }

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
    org.jfree.chart.entity.ChartEntity chartEntity49 = chartPanel14.getEntityForPoint(0, 2);
    
    // This assertion (symmetry of equals) fails 
    org.junit.Assert.assertTrue("Contract failed: equals-symmetric on categoryDataset45 and defaultIntervalCategoryDataset44.", categoryDataset45.equals(defaultIntervalCategoryDataset44) == defaultIntervalCategoryDataset44.equals(categoryDataset45));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test05"); }

    double[][] d_array_array0 = new double[][] {  };
    double[][] d_array_array1 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array0, d_array_array1);
    org.jfree.data.general.SeriesDataset[] seriesDataset_array3 = new org.jfree.data.general.SeriesDataset[] { defaultIntervalCategoryDataset2 };
    org.jfree.data.general.CombinedDataset combinedDataset4 = new org.jfree.data.general.CombinedDataset(seriesDataset_array3);
    org.jfree.data.Range range5 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset)combinedDataset4);
    combinedDataset4.validateObject();
    java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset)combinedDataset4);
    double[][] d_array_array8 = new double[][] {  };
    double[][] d_array_array9 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset10 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array8, d_array_array9);
    org.jfree.data.general.SeriesDataset[] seriesDataset_array11 = new org.jfree.data.general.SeriesDataset[] { defaultIntervalCategoryDataset10 };
    org.jfree.data.general.CombinedDataset combinedDataset12 = new org.jfree.data.general.CombinedDataset(seriesDataset_array11);
    combinedDataset4.add(seriesDataset_array11);
    
    // Checks the contract:  equals-hashcode on defaultIntervalCategoryDataset10 and defaultIntervalCategoryDataset2
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultIntervalCategoryDataset10 and defaultIntervalCategoryDataset2", defaultIntervalCategoryDataset10.equals(defaultIntervalCategoryDataset2) ? defaultIntervalCategoryDataset10.hashCode() == defaultIntervalCategoryDataset2.hashCode() : true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test06"); }

    org.jfree.data.contour.DefaultContourDataset defaultContourDataset0 = new org.jfree.data.contour.DefaultContourDataset();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.findZBounds((org.jfree.data.xy.XYZDataset)defaultContourDataset0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test07"); }

    double[][] d_array_array0 = new double[][] {  };
    double[][] d_array_array1 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array0, d_array_array1);
    org.jfree.data.general.SeriesDataset[] seriesDataset_array3 = new org.jfree.data.general.SeriesDataset[] { defaultIntervalCategoryDataset2 };
    org.jfree.data.general.CombinedDataset combinedDataset4 = new org.jfree.data.general.CombinedDataset(seriesDataset_array3);
    org.jfree.data.Range range5 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset)combinedDataset4);
    combinedDataset4.validateObject();
    java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset)combinedDataset4);
    java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue((org.jfree.data.xy.XYDataset)combinedDataset4);
    double[][] d_array_array9 = new double[][] {  };
    double[][] d_array_array10 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array9, d_array_array10);
    org.jfree.data.general.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset11, (java.lang.Comparable)0.5d);
    java.util.List list14 = defaultIntervalCategoryDataset11.getSeries();
    org.jfree.data.general.SeriesChangeEvent seriesChangeEvent15 = null;
    defaultIntervalCategoryDataset11.seriesChanged(seriesChangeEvent15);
    double[][] d_array_array17 = new double[][] {  };
    double[][] d_array_array18 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset19 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array17, d_array_array18);
    org.jfree.data.general.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset19, (java.lang.Comparable)0.5d);
    org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
    defaultIntervalCategoryDataset19.removeChangeListener(datasetChangeListener22);
    java.util.List list24 = defaultIntervalCategoryDataset19.getCategories();
    org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds((org.jfree.data.category.CategoryDataset)defaultIntervalCategoryDataset11, list24, true);
    org.jfree.data.time.DateRange dateRange27 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range30 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange27, (double)'a', true);
    org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds((org.jfree.data.xy.XYDataset)combinedDataset4, list24, (org.jfree.data.Range)dateRange27, false);
    
    // Checks the contract:  equals-hashcode on defaultIntervalCategoryDataset11 and defaultIntervalCategoryDataset19
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultIntervalCategoryDataset11 and defaultIntervalCategoryDataset19", defaultIntervalCategoryDataset11.equals(defaultIntervalCategoryDataset19) ? defaultIntervalCategoryDataset11.hashCode() == defaultIntervalCategoryDataset19.hashCode() : true);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test08"); }

    org.jfree.data.xml.PieDatasetHandler pieDatasetHandler0 = new org.jfree.data.xml.PieDatasetHandler();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    pieDatasetHandler0.addItem((java.lang.Comparable)6, (java.lang.Number)(byte)-1);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test09"); }

    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline0 = org.jfree.chart.axis.SegmentedTimeline.newFifteenMinuteTimeline();
    org.jfree.chart.axis.SegmentedTimeline.Segment segment2 = segmentedTimeline0.getSegment((long)3);
    boolean b4 = segment2.contains((long)(-4));
    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline5 = org.jfree.chart.axis.SegmentedTimeline.newFifteenMinuteTimeline();
    org.jfree.chart.axis.SegmentedTimeline.Segment segment7 = segmentedTimeline5.getSegment((long)3);
    boolean b9 = segment7.contains((long)(-4));
    boolean b10 = segment7.inExceptionSegments();
    org.jfree.chart.axis.SegmentedTimeline segmentedTimeline11 = org.jfree.chart.axis.SegmentedTimeline.newFifteenMinuteTimeline();
    org.jfree.chart.axis.SegmentedTimeline.Segment segment13 = segmentedTimeline11.getSegment((long)3);
    boolean b15 = segment13.contains((long)(-4));
    boolean b16 = segment13.inExceptionSegments();
    boolean b17 = segment7.contains(segment13);
    boolean b18 = segment2.before(segment13);
    long long19 = segment13.getMillisecond();
    
    // Checks the contract:  equals-hashcode on segment7 and segment2
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on segment7 and segment2", segment7.equals(segment2) ? segment7.hashCode() == segment2.hashCode() : true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test10"); }

    org.jfree.data.contour.DefaultContourDataset defaultContourDataset0 = new org.jfree.data.contour.DefaultContourDataset();
    java.lang.Number[] number_array1 = defaultContourDataset0.getXValues();
    org.jfree.data.time.DateRange dateRange2 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange3 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint4 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange2, (org.jfree.data.Range)dateRange3);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint5 = org.jfree.chart.block.RectangleConstraint.NONE;
    org.jfree.data.time.DateRange dateRange7 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range10 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange7, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType11 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange13 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange14 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint15 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange13, (org.jfree.data.Range)dateRange14);
    org.jfree.chart.axis.CompassFormat compassFormat16 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType17 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b18 = compassFormat16.equals((java.lang.Object)lengthConstraintType17);
    org.jfree.chart.axis.CompassFormat compassFormat19 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType20 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b21 = compassFormat19.equals((java.lang.Object)lengthConstraintType20);
    boolean b22 = lengthConstraintType17.equals((java.lang.Object)b21);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint23 = new org.jfree.chart.block.RectangleConstraint(0.0d, range10, lengthConstraintType11, (double)1L, (org.jfree.data.Range)dateRange13, lengthConstraintType17);
    double d24 = dateRange13.getLowerBound();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint25 = rectangleConstraint5.toRangeWidth((org.jfree.data.Range)dateRange13);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.jfree.data.Range range26 = defaultContourDataset0.getZValueRange((org.jfree.data.Range)dateRange2, (org.jfree.data.Range)dateRange13);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test11"); }

    org.jfree.chart.needle.LineNeedle lineNeedle0 = new org.jfree.chart.needle.LineNeedle();
    java.awt.Color color2 = java.awt.Color.BLACK;
    org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator6 = new org.jfree.chart.util.DefaultShadowGenerator((int)(byte)100, color2, (float)0, (int)'4', (double)1.0f);
    lineNeedle0.setOutlinePaint((java.awt.Paint)color2);
    org.jfree.chart.JFreeChart jFreeChart8 = null;
    org.jfree.chart.ChartPanel chartPanel22 = new org.jfree.chart.ChartPanel(jFreeChart8, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo23 = chartPanel22.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer24 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle25 = jThermometer24.getVisibleRect();
    jThermometer24.requestFocus();
    org.jfree.data.time.DateRange dateRange28 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range31 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange28, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType32 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange34 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange35 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint36 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange34, (org.jfree.data.Range)dateRange35);
    org.jfree.chart.axis.CompassFormat compassFormat37 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType38 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b39 = compassFormat37.equals((java.lang.Object)lengthConstraintType38);
    org.jfree.chart.axis.CompassFormat compassFormat40 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType41 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b42 = compassFormat40.equals((java.lang.Object)lengthConstraintType41);
    boolean b43 = lengthConstraintType38.equals((java.lang.Object)b42);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint44 = new org.jfree.chart.block.RectangleConstraint(0.0d, range31, lengthConstraintType32, (double)1L, (org.jfree.data.Range)dateRange34, lengthConstraintType38);
    chartPanel22.add((java.awt.Component)jThermometer24, (java.lang.Object)lengthConstraintType32);
    javax.swing.InputVerifier inputVerifier46 = chartPanel22.getInputVerifier();
    boolean b47 = chartPanel22.getRefreshBuffer();
    double[][] d_array_array50 = new double[][] {  };
    double[][] d_array_array51 = new double[][] {  };
    org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset52 = new org.jfree.data.category.DefaultIntervalCategoryDataset(d_array_array50, d_array_array51);
    org.jfree.data.category.CategoryDataset categoryDataset53 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "jfreechart-", d_array_array51);
    org.jfree.data.general.DatasetChangeEvent datasetChangeEvent54 = new org.jfree.data.general.DatasetChangeEvent((java.lang.Object)chartPanel22, (org.jfree.data.general.Dataset)categoryDataset53);
    boolean b55 = lineNeedle0.equals((java.lang.Object)datasetChangeEvent54);
    
    // This assertion (symmetry of equals) fails 
    org.junit.Assert.assertTrue("Contract failed: equals-symmetric on categoryDataset53 and defaultIntervalCategoryDataset52.", categoryDataset53.equals(defaultIntervalCategoryDataset52) == defaultIntervalCategoryDataset52.equals(categoryDataset53));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test12"); }

    org.jfree.data.contour.DefaultContourDataset defaultContourDataset0 = new org.jfree.data.contour.DefaultContourDataset();
    java.lang.Number[] number_array1 = defaultContourDataset0.getXValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.jfree.data.Range range3 = org.jfree.data.general.DatasetUtilities.iterateZBounds((org.jfree.data.xy.XYZDataset)defaultContourDataset0, false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test13"); }

    org.jfree.data.contour.DefaultContourDataset defaultContourDataset0 = new org.jfree.data.contour.DefaultContourDataset();
    java.lang.Number[] number_array1 = defaultContourDataset0.getXValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.Number number4 = defaultContourDataset0.getZ(0, 5);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test14"); }

    org.jfree.data.contour.DefaultContourDataset defaultContourDataset0 = new org.jfree.data.contour.DefaultContourDataset();
    java.lang.Number[] number_array1 = defaultContourDataset0.getXValues();
    int i2 = defaultContourDataset0.getSeriesCount();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.jfree.data.Range range3 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset)defaultContourDataset0);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test15"); }

    org.jfree.data.contour.DefaultContourDataset defaultContourDataset0 = new org.jfree.data.contour.DefaultContourDataset();
    java.lang.Number[] number_array1 = defaultContourDataset0.getXValues();
    int i2 = defaultContourDataset0.getSeriesCount();
    int[] i_array3 = defaultContourDataset0.getXIndices();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.Number number6 = defaultContourDataset0.getZ((-557783151), (int)(short)0);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test16"); }

    org.jfree.data.contour.DefaultContourDataset defaultContourDataset0 = new org.jfree.data.contour.DefaultContourDataset();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    double d1 = defaultContourDataset0.getMinZValue();

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test17"); }

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
    org.jfree.chart.JFreeChart jFreeChart49 = null;
    org.jfree.chart.ChartPanel chartPanel63 = new org.jfree.chart.ChartPanel(jFreeChart49, (int)(short)10, 0, 13, (int)(byte)-1, 2, (int)(short)-1, false, true, true, true, true, false, false);
    org.jfree.chart.ChartRenderingInfo chartRenderingInfo64 = chartPanel63.getChartRenderingInfo();
    org.jfree.chart.plot.JThermometer jThermometer65 = new org.jfree.chart.plot.JThermometer();
    java.awt.Rectangle rectangle66 = jThermometer65.getVisibleRect();
    jThermometer65.requestFocus();
    org.jfree.data.time.DateRange dateRange69 = new org.jfree.data.time.DateRange();
    org.jfree.data.Range range72 = org.jfree.data.Range.shift((org.jfree.data.Range)dateRange69, (double)'a', true);
    org.jfree.chart.block.LengthConstraintType lengthConstraintType73 = org.jfree.chart.block.LengthConstraintType.RANGE;
    org.jfree.data.time.DateRange dateRange75 = new org.jfree.data.time.DateRange();
    org.jfree.data.time.DateRange dateRange76 = new org.jfree.data.time.DateRange();
    org.jfree.chart.block.RectangleConstraint rectangleConstraint77 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)dateRange75, (org.jfree.data.Range)dateRange76);
    org.jfree.chart.axis.CompassFormat compassFormat78 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType79 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b80 = compassFormat78.equals((java.lang.Object)lengthConstraintType79);
    org.jfree.chart.axis.CompassFormat compassFormat81 = new org.jfree.chart.axis.CompassFormat();
    org.jfree.chart.block.LengthConstraintType lengthConstraintType82 = org.jfree.chart.block.LengthConstraintType.RANGE;
    boolean b83 = compassFormat81.equals((java.lang.Object)lengthConstraintType82);
    boolean b84 = lengthConstraintType79.equals((java.lang.Object)b83);
    org.jfree.chart.block.RectangleConstraint rectangleConstraint85 = new org.jfree.chart.block.RectangleConstraint(0.0d, range72, lengthConstraintType73, (double)1L, (org.jfree.data.Range)dateRange75, lengthConstraintType79);
    chartPanel63.add((java.awt.Component)jThermometer65, (java.lang.Object)lengthConstraintType73);
    org.jfree.chart.plot.JThermometer jThermometer87 = new org.jfree.chart.plot.JThermometer();
    java.awt.Event event88 = null;
    boolean b90 = jThermometer87.keyDown(event88, 100);
    jThermometer87.setVisible(false);
    java.awt.Point point93 = jThermometer87.location();
    java.awt.Point point94 = chartPanel63.getLocation(point93);
    java.awt.Point point95 = chartPanel14.getLocation(point93);
    
    // Checks the contract:  equals-hashcode on chartRenderingInfo15 and chartRenderingInfo64
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo15 and chartRenderingInfo64", chartRenderingInfo15.equals(chartRenderingInfo64) ? chartRenderingInfo15.hashCode() == chartRenderingInfo64.hashCode() : true);

  }

}
