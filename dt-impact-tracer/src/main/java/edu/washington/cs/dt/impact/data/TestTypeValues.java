package edu.washington.cs.dt.impact.data;

import com.reedoei.eunomia.collections.ListUtil;
import com.reedoei.eunomia.collections.PairStream;
import edu.washington.cs.dt.impact.util.XmlSerializable;
import org.dom4j.Element;
import org.dom4j.dom.DOMElement;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestTypeValues<T extends XmlSerializable<T>> implements XmlSerializable<TestTypeValues<T>> {
    private final T orig;
    private final T auto;

    public TestTypeValues(final Supplier<T> supplier) {
        this(supplier.get(), supplier.get());
    }

    public TestTypeValues(final T orig, final T auto) {
        this.orig = orig;
        this.auto = auto;
    }

    public T testType(final boolean orig) {
        if (orig) {
            return testType("orig");
        } else {
            return testType("auto");
        }
    }

    public T testType(final String testType) {
        if (testType.equals("orig")) {
            return orig();
        } else {
            return auto();
        }
    }

    public T orig() {
        return orig;
    }

    public T auto() {
        return auto;
    }

    public void forEach(final BiConsumer<String, T> consumer) {
        stream().forEach(consumer);
    }

    public PairStream<String, T> stream() {
        return PairStream.zip(
                ListUtil.fromArray("orig", "auto"),
                ListUtil.fromArray(orig(), auto()));
    }

    public <U extends XmlSerializable<U>> TestTypeValues<U> fmap(final Function<T, U> f) {
        return new TestTypeValues<>(f.apply(orig()), f.apply(auto()));
    }

    @Override
    public Element toXml() {
        final Element root = new DOMElement("TestTypeValues");
        root.addElement("Orig").add(orig().toXml());
        root.addElement("Auto").add(auto().toXml());

        return root;
    }

    @Override
    public TestTypeValues<T> fromXml(final Element element) {
        return new TestTypeValues<>(
                orig().fromXml(element.element("Orig").elements().get(0)),
                auto().fromXml(element.element("Auto").elements().get(0)));
    }
}
