package edu.washington.cs.dt.impact.figure.generator;

import com.reedoei.eunomia.data.caching.FileCache;
import com.reedoei.eunomia.math.Averager;
import com.reedoei.eunomia.util.Util;
import edu.washington.cs.dt.impact.data.TechniqueValues;
import edu.washington.cs.dt.impact.tools.lifetime.Lifetimes;
import edu.washington.cs.dt.impact.tools.lifetime.PrecomputedLifetime;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class LifetimeFigureData extends FileCache<LifetimeFigureData> {
    private final Path lifetimePaths;

    private final List<SubjectLifetimeData> subjectLifetimeData = new ArrayList<>();

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

            for (final Element element : root.elements("Subject")) {
                subjectLifetimeData.add(new SubjectLifetimeData(element));
            }
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }

        return this;
    }

    private Averager<Double> readElement(final Element element) {
        return new Averager<>(element.elements("Value").stream().map(e -> Double.parseDouble(e.getText())));
    }

    private Element fillElement(final String name, final Averager<Double> averager) {
        final Element element = new DOMElement(name);

        for (final double v : averager.getValues()) {
            element.addElement("Value").setText(String.valueOf(v));
        }

        return element;
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
                subjectLifetimeData.add(new SubjectLifetimeData(path));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public List<SubjectLifetimeData> subjectLifetimeData() {
        return subjectLifetimeData;
    }

    public class SubjectLifetimeData {
        private final Path path;
        private final TechniqueValues<Averager<Double>> averagers;
        private final Properties properties;

        private SubjectLifetimeData(final Element element) throws IOException {
            this(Paths.get(element.attributeValue("path")),
                    new TechniqueValues<>(
                    readElement(element.element("Prioritization")),
                    readElement(element.element("Selection")),
                    readElement(element.element("Parallelization"))));
        }

        public SubjectLifetimeData(final Path path) throws IOException {
            this(path, new PrecomputedLifetime(Lifetimes.dateFromDir(path), path).calculateResults());
        }

        private SubjectLifetimeData(final Path path, final TechniqueValues<Averager<Double>> averagers) throws IOException {
            this.path = path;
            this.averagers = averagers;

            this.properties = new Properties();
            properties.load(new FileInputStream(path.resolve("subject.properties").toFile()));
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

            subject.add(fillElement("Prioritization", averagers.prio()));
            subject.add(fillElement("Selection", averagers.sele()));
            subject.add(fillElement("Parallelization", averagers.para()));

            return subject;
        }

        public String property(final String s) {
            return properties().getProperty(s);
        }
    }
}