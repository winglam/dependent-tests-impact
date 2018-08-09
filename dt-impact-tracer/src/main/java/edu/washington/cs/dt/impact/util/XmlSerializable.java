package edu.washington.cs.dt.impact.util;

import org.dom4j.Element;

public interface XmlSerializable<T> {
    Element toXml();
    T fromXml(final Element element);
}
