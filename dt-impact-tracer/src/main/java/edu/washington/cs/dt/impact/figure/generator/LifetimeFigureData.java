package edu.washington.cs.dt.impact.figure.generator;

import com.reedoei.eunomia.collections.ListUtil;
import com.reedoei.eunomia.data.caching.FileCache;
import com.reedoei.eunomia.math.Averager;
import com.reedoei.eunomia.util.RuntimeThrower;
import com.reedoei.eunomia.util.Util;
import edu.washington.cs.dt.impact.data.TechniqueValues;
import edu.washington.cs.dt.impact.data.TestTypeValues;
import edu.washington.cs.dt.impact.tools.lifetime.LifetimeDataGenerator;
import edu.washington.cs.dt.impact.tools.lifetime.Lifetimes;
import edu.washington.cs.dt.impact.util.Constants;
import edu.washington.cs.dt.impact.util.XmlSerializable;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.dom.DOMElement;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class LifetimeFigureData extends FileCache<LifetimeFigureData> {
    public static Properties subjectProperties(final Path path) throws IOException {
        final Properties properties = new Properties();
        properties.load(new FileInputStream(path.resolve("subject.properties").toFile()));
        return properties;
    }

    private final Path lifetimePaths;

    private final List<TestTypeValues<SubjectLifetimeData>> subjectLifetimeData = new ArrayList<>();

    public LifetimeFigureData(final Path lifetimePaths) {
        this.lifetimePaths = lifetimePaths;
    }

    @Override
    public @NonNull Path path() {
        return lifetimePaths.resolve("lifetimes.xml");
    }

    @Override
    protected LifetimeFigureData load() {
        try {
            final @NonNull Document document = Util.readXmlDoc(path().toFile());
            final Element root = document.getRootElement();

            for (final Element element : root.elements("TestTypeValues")) {
                final TestTypeValues<SubjectLifetimeData> values =
                        new TestTypeValues<>(SubjectLifetimeData::new);
                subjectLifetimeData.add(values.fromXml(element));
            }
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }

        return this;
    }

    private Averager<Double> readElement(final Element element) {
        return new Averager<>(element.elements("Value").stream().map(e -> Double.parseDouble(e.getText())));
    }

    @Override
    protected void save() {
        final Element root = new DOMElement("Results");
        subjectLifetimeData.forEach(subject -> root.add(subject.toXml()));

        try {
            Files.write(path(), Util.elementToString(root).getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected LifetimeFigureData generate() {
        try {
            Files.list(lifetimePaths).map(Path::toAbsolutePath).forEach(this::apply);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        new RuntimeThrower<>(() -> Files.list(lifetimePaths).map(this::apply)).run();

        return this;
    }

    private Void apply(final Path path) {
        if (Files.isDirectory(path) && path.toString().endsWith("lifetime")) {
            try {
                subjectLifetimeData.add(new TestTypeValues<>(
                        new SubjectLifetimeData(path, true),
                        new SubjectLifetimeData(path, false)));
            } catch (IOException | ParseException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public List<TestTypeValues<SubjectLifetimeData>> subjectLifetimeData() {
        return subjectLifetimeData;
    }

    public class SubjectLifetimeData implements XmlSerializable<SubjectLifetimeData> {
        private final Path path;
        private final TechniqueValues<Averager<Double>> averagers;
        private final Properties properties;

        private final boolean orig;

        public SubjectLifetimeData() {
            this.path = Paths.get("");
            this.averagers = new TechniqueValues<>(Averager::new);
            this.orig = true;

            this.properties = new Properties();
        }

        private SubjectLifetimeData(final Element element) throws IOException {
            this(Paths.get(element.attributeValue("path")),
                    Boolean.parseBoolean(element.attributeValue("orig")),
                    new TechniqueValues<>(
                    readElement(element.element("Prioritization")),
                    readElement(element.element("Selection")),
                    readElement(element.element("Parallelization"))));
        }

        public SubjectLifetimeData(final Path path, final boolean orig) throws IOException, ParseException {
            this(path, orig, new LifetimeDataGenerator(path).calculateResults(orig));
        }

        private SubjectLifetimeData(final Path path, final boolean orig, final TechniqueValues<Averager<Double>> averagers)
                throws IOException {
            this.path = path;
            this.orig = orig;
            this.averagers = new TechniqueValues<>(Averager::new);

            averagers.forEach(this::addAveragerValues);

            // TODO: MODIFY THIS SO THAT WE CAN GET THE PROPERTIES FOR THE START DATE
            // TODO: ADD START DATE TO THE PROPERTIES FILES
            this.properties = subjectProperties(path);
        }

        private void addAveragerValues(final Constants.TECHNIQUE technique, final Averager<Double> averager) {
            averagers().technique(technique).addAll(ListUtil.filter(Double::isFinite, averager.getValues()));
        }

        public Properties properties() {
            return properties;
        }

        public TechniqueValues<Averager<Double>> averagers() {
            return averagers;
        }

        public Element toXml() {
            final Element subject = new DOMElement("Subject");
            subject.addAttribute("path", path.toAbsolutePath().toString());
            subject.addAttribute("orig", String.valueOf(orig));

            subject.add(fillElement("Prioritization", averagers().prio()));
            subject.add(fillElement("Selection", averagers().sele()));
            subject.add(fillElement("Parallelization", averagers().para()));

            return subject;
        }

        private Element fillElement(final String name, final Averager<Double> averager) {
            final Element element = new DOMElement(name);

            for (final double v : averager.getValues()) {
                element.addElement("Value").setText(String.valueOf(v));
            }

            return element;
        }

        @Override
        public SubjectLifetimeData fromXml(final Element element) {
            return new RuntimeThrower<>(() -> new SubjectLifetimeData(element)).run();
        }

        public String property(final String s) {
            return properties().getProperty(s);
        }
    }
}