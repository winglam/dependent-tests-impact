package edu.washington.cs.dt.impact.figure.generator.graphs;

import edu.washington.cs.dt.impact.tools.lifetime.Lifetimes;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.jfree.graphics2d.svg.SVGGraphics2D;
import org.jfree.graphics2d.svg.SVGUtils;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class DTNumGraph {
    public DTNumGraph() {

    }

    public void run() throws IOException {
        final JFreeChart chart = ChartFactory.createXYLineChart(
                "Dependent tests vs. time",
                "Date",
                "# of dependent tests",
                getDataset());

        final SVGGraphics2D svgGraphics2D = new SVGGraphics2D(600, 400);
        final Rectangle r = new Rectangle(0, 0, 600, 400);
        chart.draw(svgGraphics2D, r);

        SVGUtils.writeToSVG(new File("output.txt"), svgGraphics2D.getSVGElement());
    }

    public XYDataset getDataset() {
        final TimeSeriesCollection seriesCollection = new TimeSeriesCollection();

        String[] subjects = new String[0];
        for (final String subjectName : subjects) {
            seriesCollection.addSeries(getData(subjectName));
        }

        return seriesCollection;
    }

    public TimeSeries getData(final String subjectName) {
        final TimeSeries series = new TimeSeries(subjectName);

        series.add(new Day(2018, 1, 17), 10);

        return series;
    }
}
