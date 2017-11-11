import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer0 = null;
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver1 = new com.thoughtworks.xstream.io.xml.StaxDriver(xmlFriendlyReplacer0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int i0 = com.thoughtworks.xstream.XStream.XPATH_ABSOLUTE_REFERENCES;
        org.junit.Assert.assertTrue(i0 == 1004);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        try {
            java.lang.Class class3 = xmlFriendlyMapper1.realClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        byte byte0 = java.io.ObjectStreamConstants.TC_MAX;
        org.junit.Assert.assertTrue(byte0 == (byte) 126);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.Enumeration<java.net.URL> enumeration_uRL1 = java.lang.ClassLoader.getSystemResources("hi!");
        org.junit.Assert.assertNotNull(enumeration_uRL1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        try {
            com.thoughtworks.xstream.alias.ClassMapper classMapper2 = xStream1.getClassMapper();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.jdom.Element element0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader2 = new com.thoughtworks.xstream.io.xml.JDomReader(element0, xmlFriendlyReplacer1);
        try {
            jDomReader2.moveUp();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.w3c.dom.Element element0 = null;
        try {
            com.thoughtworks.xstream.io.xml.DomWriter domWriter1 = new com.thoughtworks.xstream.io.xml.DomWriter(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        java.lang.Class class4 = null;
        try {
            com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter5 = attributeMapper2.getConverterFromItemType("hi!", class4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int i0 = com.thoughtworks.xstream.XStream.PRIORITY_VERY_LOW;
        org.junit.Assert.assertTrue(i0 == (-20));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap0 = null;
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver2 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap0, true);
        java.io.Reader reader3 = null;
        try {
            com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader4 = staxDriver2.createReader(reader3);
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider3 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter4 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1, reflectionProvider3);
        java.lang.Class class5 = null;
        try {
            boolean b6 = xmlFriendlyMapper1.isImmutableValueType(class5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        byte byte0 = java.io.ObjectStreamConstants.TC_NULL;
        org.junit.Assert.assertTrue(byte0 == (byte) 112);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.thoughtworks.xstream.converters.extended.ISO8601GregorianCalendarConverter iSO8601GregorianCalendarConverter0 = new com.thoughtworks.xstream.converters.extended.ISO8601GregorianCalendarConverter();
        try {
            java.lang.Object obj2 = iSO8601GregorianCalendarConverter0.fromString("hi!");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.converters.ConversionException");
        } catch (com.thoughtworks.xstream.converters.ConversionException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamDriver hierarchicalStreamDriver1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream(reflectionProvider0, hierarchicalStreamDriver1);
        java.io.Writer writer3 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer4 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter5 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer3, xmlFriendlyReplacer4);
        try {
            java.io.ObjectOutputStream objectOutputStream6 = xStream2.createObjectOutputStream((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        byte byte0 = java.io.ObjectStreamConstants.TC_BASE;
        org.junit.Assert.assertTrue(byte0 == (byte) 112);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.thoughtworks.xstream.persistence.StreamStrategy streamStrategy0 = null;
        com.thoughtworks.xstream.persistence.XmlMap xmlMap1 = new com.thoughtworks.xstream.persistence.XmlMap(streamStrategy0);
        try {
            java.lang.Object obj4 = xmlMap1.put((java.lang.Object) 1.0d, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SUBSTITUTION_PERMISSION;
        org.junit.Assert.assertNotNull(serializablePermission0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.dom4j.Element element0 = null;
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader1 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element0);
        try {
            java.lang.String str3 = dom4JReader1.getAttributeName(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.Class class0 = null;
        try {
            com.thoughtworks.xstream.converters.extended.ToStringConverter toStringConverter1 = new com.thoughtworks.xstream.converters.extended.ToStringConverter(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        java.lang.Class class3 = null;
        try {
            com.thoughtworks.xstream.mapper.Mapper mapper4 = attributeMapper2.lookupMapperOfType(class3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        int i0 = com.thoughtworks.xstream.io.StatefulWriter.STATE_NODE_START;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.dom4j.Element element0 = null;
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader1 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element0);
        try {
            int i2 = dom4JReader1.getAttributeCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.dom4j.Element element0 = null;
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader1 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element0);
        try {
            java.lang.String str2 = dom4JReader1.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.jdom.Element element0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader2 = new com.thoughtworks.xstream.io.xml.JDomReader(element0, xmlFriendlyReplacer1);
        try {
            com.thoughtworks.xstream.io.AttributeNameIterator attributeNameIterator3 = new com.thoughtworks.xstream.io.AttributeNameIterator((com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper2 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        try {
            java.lang.String str4 = xmlFriendlyMapper1.attributeForAlias("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        org.jdom.Element element2 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader3 = new com.thoughtworks.xstream.io.xml.JDomReader(element2);
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        java.io.Writer writer9 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer10 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter11 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer9, xmlFriendlyReplacer10);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup12 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper13 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper14 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper13);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper15 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper14);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider16 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter17 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper14, reflectionProvider16);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter18 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper14);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller19 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter11, converterLookup12, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper14);
        try {
            java.lang.Object obj20 = xStream1.unmarshal((com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader3, (java.lang.Object) xmlFriendlyMapper5, (com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper2 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        dynamicProxyMapper2.setAlias("hi!");
        java.lang.Class class5 = null;
        try {
            boolean b7 = dynamicProxyMapper2.shouldSerializeMember(class5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        boolean b0 = com.thoughtworks.xstream.core.JVM.is14();
        org.junit.Assert.assertTrue(b0 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.converters.extended.JavaClassConverter javaClassConverter1 = new com.thoughtworks.xstream.converters.extended.JavaClassConverter(classLoader0);
        try {
            java.lang.Object obj3 = javaClassConverter1.fromString("hi!");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.converters.ConversionException");
        } catch (com.thoughtworks.xstream.converters.ConversionException e) {
        }
        org.junit.Assert.assertNotNull(classLoader0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        int i0 = com.thoughtworks.xstream.XStream.PRIORITY_NORMAL;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        int i0 = java.io.ObjectStreamConstants.PROTOCOL_VERSION_1;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream12 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback11);
        java.io.ObjectOutputStream.PutField putField13 = customObjectOutputStream12.putFields();
        java.io.Writer writer14 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer15 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter16 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer14, xmlFriendlyReplacer15);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup17 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper18 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper19 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper18);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper20 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider21 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter22 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19, reflectionProvider21);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter23 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller24 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter16, converterLookup17, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        referenceByIdMarshaller10.put((java.lang.Object) customObjectOutputStream12, (java.lang.Object) referenceByIdMarshaller24);
        org.dom4j.Element element26 = null;
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader27 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element26);
        java.io.Writer writer28 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer29 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter30 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer28, xmlFriendlyReplacer29);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup31 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper32 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper33 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper32);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper34 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper33);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider35 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter36 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper33, reflectionProvider35);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter37 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper33);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller38 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter30, converterLookup31, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper33);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback39 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream40 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback39);
        java.io.ObjectOutputStream.PutField putField41 = customObjectOutputStream40.putFields();
        java.io.Writer writer42 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer43 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter44 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer42, xmlFriendlyReplacer43);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup45 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper46 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper47 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper46);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper48 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper47);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider49 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter50 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper47, reflectionProvider49);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter51 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper47);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller52 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter44, converterLookup45, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper47);
        referenceByIdMarshaller38.put((java.lang.Object) customObjectOutputStream40, (java.lang.Object) referenceByIdMarshaller52);
        try {
            referenceByIdMarshaller10.start((java.lang.Object) element26, (com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(putField13);
        org.junit.Assert.assertNotNull(putField41);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.thoughtworks.xstream.io.StatefulWriter.STATE_CLOSED = (short) 0;
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter0 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        try {
            saxWriter0.addAttribute("", "hi!");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        byte byte0 = java.io.ObjectStreamConstants.TC_EXCEPTION;
        org.junit.Assert.assertTrue(byte0 == (byte) 123);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream12 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback11);
        java.io.ObjectOutputStream.PutField putField13 = customObjectOutputStream12.putFields();
        java.io.Writer writer14 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer15 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter16 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer14, xmlFriendlyReplacer15);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup17 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper18 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper19 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper18);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper20 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider21 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter22 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19, reflectionProvider21);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter23 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller24 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter16, converterLookup17, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        referenceByIdMarshaller10.put((java.lang.Object) customObjectOutputStream12, (java.lang.Object) referenceByIdMarshaller24);
        try {
            customObjectOutputStream12.writeFloat((float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(putField13);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamDriver hierarchicalStreamDriver1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream(reflectionProvider0, hierarchicalStreamDriver1);
        org.jdom.Element element3 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer4 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader5 = new com.thoughtworks.xstream.io.xml.JDomReader(element3, xmlFriendlyReplacer4);
        java.lang.Object obj6 = jDomReader5.peekUnderlyingNode();
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback7 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream8 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback7);
        java.io.ObjectOutputStream.PutField putField9 = customObjectOutputStream8.putFields();
        try {
            xStream2.toXML((java.lang.Object) jDomReader5, (java.io.OutputStream) customObjectOutputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(putField9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamDriver hierarchicalStreamDriver1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream(reflectionProvider0, hierarchicalStreamDriver1);
        try {
            com.thoughtworks.xstream.alias.ClassMapper classMapper3 = xStream2.getClassMapper();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        byte byte0 = java.io.ObjectStreamConstants.TC_ENUM;
        org.junit.Assert.assertTrue(byte0 == (byte) 126);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        int i0 = com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy.RELATIVE;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.ClassAliasingMapper classAliasingMapper1 = new com.thoughtworks.xstream.mapper.ClassAliasingMapper(classMapper0);
        java.lang.Class class3 = null;
        try {
            classAliasingMapper1.addTypeAlias("", class3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker serializationMethodInvoker0 = new com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker();
        java.lang.Class class1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter3 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream2.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter3);
        java.lang.Object obj6 = textAttributeConverter3.fromString("hi!");
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback7 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream8 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback7);
        try {
            serializationMethodInvoker0.callWriteObject(class1, (java.lang.Object) "hi!", (java.io.ObjectOutputStream) customObjectOutputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream12 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback11);
        java.io.ObjectOutputStream.PutField putField13 = customObjectOutputStream12.putFields();
        java.io.Writer writer14 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer15 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter16 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer14, xmlFriendlyReplacer15);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup17 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper18 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper19 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper18);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper20 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider21 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter22 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19, reflectionProvider21);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter23 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller24 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter16, converterLookup17, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        referenceByIdMarshaller10.put((java.lang.Object) customObjectOutputStream12, (java.lang.Object) referenceByIdMarshaller24);
        byte[] byte_array30 = new byte[] { (byte) 126, (byte) -1, (byte) 112, (byte) 112 };
        try {
            customObjectOutputStream12.write(byte_array30, (int) (short) 100, (int) (byte) 126);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(putField13);
        org.junit.Assert.assertNotNull(byte_array30);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.dom4j.Element element0 = null;
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader1 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element0);
        com.thoughtworks.xstream.converters.ConversionException conversionException3 = new com.thoughtworks.xstream.converters.ConversionException("hi!");
        try {
            dom4JReader1.appendErrors((com.thoughtworks.xstream.converters.ErrorWriter) conversionException3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.thoughtworks.xstream.XStream xStream0 = new com.thoughtworks.xstream.XStream();
        try {
            java.lang.Object obj2 = xStream0.fromXML("");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.jdom.Document document0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        try {
            com.thoughtworks.xstream.io.xml.JDomReader jDomReader4 = new com.thoughtworks.xstream.io.xml.JDomReader(document0, xmlFriendlyReplacer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter jsonHierarchicalStreamWriter1 = new com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter(writer0);
        try {
            jsonHierarchicalStreamWriter1.endNode();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper1 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper2 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper1);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper3 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper2);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider4 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter5 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper2, reflectionProvider4);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter6 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper2);
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer7 = null;
        com.thoughtworks.xstream.io.xml.JDomDriver jDomDriver8 = new com.thoughtworks.xstream.io.xml.JDomDriver(xmlFriendlyReplacer7);
        try {
            com.thoughtworks.xstream.XStream xStream9 = new com.thoughtworks.xstream.XStream(reflectionProvider0, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper2, (com.thoughtworks.xstream.io.HierarchicalStreamDriver) jDomDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream12 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback11);
        java.io.ObjectOutputStream.PutField putField13 = customObjectOutputStream12.putFields();
        java.io.Writer writer14 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer15 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter16 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer14, xmlFriendlyReplacer15);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup17 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper18 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper19 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper18);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper20 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider21 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter22 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19, reflectionProvider21);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter23 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller24 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter16, converterLookup17, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        referenceByIdMarshaller10.put((java.lang.Object) customObjectOutputStream12, (java.lang.Object) referenceByIdMarshaller24);
        try {
            customObjectOutputStream12.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(putField13);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.thoughtworks.xstream.converters.extended.ISO8601GregorianCalendarConverter iSO8601GregorianCalendarConverter0 = new com.thoughtworks.xstream.converters.extended.ISO8601GregorianCalendarConverter();
        try {
            java.lang.Object obj2 = iSO8601GregorianCalendarConverter0.fromString("");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.converters.ConversionException");
        } catch (com.thoughtworks.xstream.converters.ConversionException e) {
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.dom4j.Element element0 = null;
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader1 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element0);
        try {
            java.lang.String str2 = dom4JReader1.getNodeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy referenceByXPathMarshallingStrategy0 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy();
        java.io.Writer writer1 = null;
        com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter jsonHierarchicalStreamWriter4 = new com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter(writer1, "", "hi!");
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer7 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XomDriver xomDriver8 = new com.thoughtworks.xstream.io.xml.XomDriver(xmlFriendlyReplacer7);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup9 = null;
        java.io.Writer writer10 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer11 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter12 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer10, xmlFriendlyReplacer11);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup13 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper14 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper15 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper14);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper16 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper15);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider17 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter18 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper15, reflectionProvider17);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter19 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper15);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller20 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter12, converterLookup13, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper15);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider21 = null;
        com.thoughtworks.xstream.XStream xStream22 = new com.thoughtworks.xstream.XStream(reflectionProvider21);
        org.jdom.Element element23 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer24 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader25 = new com.thoughtworks.xstream.io.xml.JDomReader(element23, xmlFriendlyReplacer24);
        java.lang.Object obj26 = jDomReader25.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup27 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper28 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper29 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper28);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper30 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper29);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller31 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider21, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader25, converterLookup27, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper30);
        try {
            referenceByXPathMarshallingStrategy0.marshal((com.thoughtworks.xstream.io.HierarchicalStreamWriter) jsonHierarchicalStreamWriter4, (java.lang.Object) xmlFriendlyReplacer7, converterLookup9, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper15, (com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback0 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream1 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback0);
        try {
            customObjectOutputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy referenceByXPathMarshallingStrategy0 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy();
        java.io.Writer writer1 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer2 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter3 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer1, xmlFriendlyReplacer2);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter4 = compactWriter3.underlyingWriter();
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer7 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XomDriver xomDriver8 = new com.thoughtworks.xstream.io.xml.XomDriver(xmlFriendlyReplacer7);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup9 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper10 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper11 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper10);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper12 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider13 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter14 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11, reflectionProvider13);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter15 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider16 = null;
        com.thoughtworks.xstream.XStream xStream17 = new com.thoughtworks.xstream.XStream(reflectionProvider16);
        org.jdom.Element element18 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer19 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader20 = new com.thoughtworks.xstream.io.xml.JDomReader(element18, xmlFriendlyReplacer19);
        java.lang.Object obj21 = jDomReader20.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup22 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper23 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper24 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper23);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper25 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper24);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller26 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider16, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader20, converterLookup22, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper25);
        try {
            referenceByXPathMarshallingStrategy0.marshal((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter3, (java.lang.Object) xmlFriendlyReplacer7, converterLookup9, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11, (com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter4);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        byte byte0 = java.io.ObjectStreamConstants.SC_ENUM;
        org.junit.Assert.assertTrue(byte0 == (byte) 16);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamDriver hierarchicalStreamDriver1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream(reflectionProvider0, hierarchicalStreamDriver1);
        com.thoughtworks.xstream.alias.ClassMapper classMapper3 = null;
        com.thoughtworks.xstream.mapper.ClassAliasingMapper classAliasingMapper4 = new com.thoughtworks.xstream.mapper.ClassAliasingMapper(classMapper3);
        java.io.Writer writer5 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer6 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter7 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer5, xmlFriendlyReplacer6);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter8 = compactWriter7.underlyingWriter();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup9 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper10 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper11 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper10);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller.IDGenerator iDGenerator12 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller13 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter7, converterLookup9, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11, iDGenerator12);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider14 = null;
        com.thoughtworks.xstream.XStream xStream15 = new com.thoughtworks.xstream.XStream(reflectionProvider14);
        org.jdom.Element element16 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer17 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader18 = new com.thoughtworks.xstream.io.xml.JDomReader(element16, xmlFriendlyReplacer17);
        java.lang.Object obj19 = jDomReader18.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup20 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper21 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper22 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper21);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper23 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper22);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller24 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider14, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader18, converterLookup20, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper23);
        try {
            xStream2.marshal((java.lang.Object) classAliasingMapper4, (com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter7, (com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter8);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper1 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper0);
        try {
            java.lang.String str2 = immutableTypesMapper1.attributeForClassDefiningField();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter4 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer0, xmlFriendlyReplacer3);
        prettyPrintWriter4.startNode("hi!");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter3 = compactWriter2.underlyingWriter();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup4 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper5 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper6 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller.IDGenerator iDGenerator7 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller8 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup4, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper6, iDGenerator7);
        com.thoughtworks.xstream.alias.ClassMapper classMapper10 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper11 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper10);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper12 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11);
        java.lang.String str14 = xmlFriendlyMapper11.mapNameToXML("hi!");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider15 = null;
        com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter cGLIBEnhancedConverter16 = new com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11, reflectionProvider15);
        try {
            referenceByIdMarshaller8.convert((java.lang.Object) '4', (com.thoughtworks.xstream.converters.Converter) cGLIBEnhancedConverter16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter3);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        org.jdom.Element element2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader4 = new com.thoughtworks.xstream.io.xml.JDomReader(element2, xmlFriendlyReplacer3);
        java.lang.Object obj5 = jDomReader4.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup6 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper7 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper8 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper7);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper9 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper8);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller10 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider0, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader4, converterLookup6, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9);
        java.lang.Class class12 = null;
        try {
            java.lang.Object obj13 = treeUnmarshaller10.convertAnother((java.lang.Object) (byte) 10, class12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider3 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter4 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1, reflectionProvider3);
        java.lang.Class class5 = null;
        try {
            boolean b6 = serializableConverter4.canConvert(class5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        int i0 = java.io.ObjectStreamConstants.baseWireHandle;
        org.junit.Assert.assertTrue(i0 == 8257536);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer0 = null;
        com.thoughtworks.xstream.io.xml.JDomDriver jDomDriver1 = new com.thoughtworks.xstream.io.xml.JDomDriver(xmlFriendlyReplacer0);
        java.io.InputStream inputStream2 = null;
        try {
            com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader3 = jDomDriver1.createReader(inputStream2);
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap0 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter1 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer6 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        try {
            com.thoughtworks.xstream.io.xml.StaxWriter staxWriter7 = new com.thoughtworks.xstream.io.xml.StaxWriter(qNameMap0, xMLStreamWriter1, true, false, xmlFriendlyReplacer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper1 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper0);
        java.lang.Class class2 = null;
        try {
            boolean b3 = immutableTypesMapper1.isImmutableValueType(class2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.ClassAliasingMapper classAliasingMapper1 = new com.thoughtworks.xstream.mapper.ClassAliasingMapper(classMapper0);
        java.lang.Class class2 = null;
        try {
            java.lang.String str4 = classAliasingMapper1.realMember(class2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.thoughtworks.xstream.XStream xStream0 = new com.thoughtworks.xstream.XStream();
        java.io.Reader reader1 = null;
        java.lang.Object obj2 = null;
        try {
            java.lang.Object obj3 = xStream0.fromXML(reader1, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.dom4j.Element element0 = null;
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader1 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element0);
        com.thoughtworks.xstream.core.TreeMarshaller.CircularReferenceException circularReferenceException2 = new com.thoughtworks.xstream.core.TreeMarshaller.CircularReferenceException();
        com.thoughtworks.xstream.converters.ConversionException conversionException3 = new com.thoughtworks.xstream.converters.ConversionException((java.lang.Throwable) circularReferenceException2);
        try {
            dom4JReader1.appendErrors((com.thoughtworks.xstream.converters.ErrorWriter) conversionException3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamDriver hierarchicalStreamDriver1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream(reflectionProvider0, hierarchicalStreamDriver1);
        java.lang.Class class4 = null;
        xStream2.useAttributeFor("", class4);
        java.io.Writer writer7 = null;
        try {
            xStream2.toXML((java.lang.Object) "class", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.thoughtworks.xstream.XStream xStream0 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter1 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream0.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter1);
        com.thoughtworks.xstream.MarshallingStrategy marshallingStrategy3 = null;
        xStream0.setMarshallingStrategy(marshallingStrategy3);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider5 = null;
        com.thoughtworks.xstream.XStream xStream6 = new com.thoughtworks.xstream.XStream(reflectionProvider5);
        org.jdom.Element element7 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer8 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader9 = new com.thoughtworks.xstream.io.xml.JDomReader(element7, xmlFriendlyReplacer8);
        java.lang.Object obj10 = jDomReader9.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup11 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper12 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper13 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper12);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper14 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper13);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller15 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider5, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader9, converterLookup11, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper14);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider16 = null;
        com.thoughtworks.xstream.XStream xStream17 = new com.thoughtworks.xstream.XStream(reflectionProvider16);
        org.jdom.Element element18 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer19 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader20 = new com.thoughtworks.xstream.io.xml.JDomReader(element18, xmlFriendlyReplacer19);
        java.lang.Object obj21 = jDomReader20.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup22 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper23 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper24 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper23);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper25 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper24);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller26 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider16, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader20, converterLookup22, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper25);
        java.lang.String str27 = dynamicProxyMapper25.getAlias();
        com.thoughtworks.xstream.converters.DataHolder dataHolder28 = null;
        try {
            java.lang.Object obj29 = xStream0.unmarshal((com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader9, (java.lang.Object) dynamicProxyMapper25, dataHolder28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "dynamic-proxy" + "'", str27.equals("dynamic-proxy"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter4 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer0, xmlFriendlyReplacer3);
        com.thoughtworks.xstream.io.xml.XppDomDriver xppDomDriver5 = new com.thoughtworks.xstream.io.xml.XppDomDriver(xmlFriendlyReplacer3);
        java.io.Reader reader6 = null;
        try {
            com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader7 = xppDomDriver5.createReader(reader6);
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.thoughtworks.xstream.io.xml.DomDriver domDriver0 = new com.thoughtworks.xstream.io.xml.DomDriver();
        java.io.Reader reader1 = null;
        try {
            com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader2 = domDriver0.createReader(reader1);
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter jsonHierarchicalStreamWriter3 = new com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter(writer0, "", "hi!");
        try {
            jsonHierarchicalStreamWriter3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.thoughtworks.xstream.io.xml.JDomWriter jDomWriter0 = new com.thoughtworks.xstream.io.xml.JDomWriter();
        try {
            jDomWriter0.startNode("");
            org.junit.Assert.fail("Expected exception of type org.jdom.IllegalNameException");
        } catch (org.jdom.IllegalNameException e) {
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback0 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream1 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback0);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback2 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream3 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback2);
        java.io.ObjectOutputStream.PutField putField4 = customObjectOutputStream3.putFields();
        try {
            customObjectOutputStream1.writeUnshared((java.lang.Object) putField4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(putField4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.thoughtworks.xstream.XStream xStream0 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter1 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream0.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter1);
        com.thoughtworks.xstream.MarshallingStrategy marshallingStrategy3 = null;
        xStream0.setMarshallingStrategy(marshallingStrategy3);
        org.dom4j.Element element5 = null;
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader6 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element5);
        java.io.Writer writer8 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer9 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter10 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer8, xmlFriendlyReplacer9);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup11 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper12 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper13 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper12);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper14 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper13);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider15 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter16 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper13, reflectionProvider15);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter17 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper13);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller18 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter10, converterLookup11, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper13);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback19 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream20 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback19);
        java.io.ObjectOutputStream.PutField putField21 = customObjectOutputStream20.putFields();
        java.io.Writer writer22 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer23 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter24 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer22, xmlFriendlyReplacer23);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup25 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper26 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper27 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper26);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper28 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper27);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider29 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter30 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper27, reflectionProvider29);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter31 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper27);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller32 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter24, converterLookup25, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper27);
        referenceByIdMarshaller18.put((java.lang.Object) customObjectOutputStream20, (java.lang.Object) referenceByIdMarshaller32);
        try {
            java.lang.Object obj34 = xStream0.unmarshal((com.thoughtworks.xstream.io.HierarchicalStreamReader) dom4JReader6, (java.lang.Object) (byte) -1, (com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(putField21);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.thoughtworks.xstream.io.StatefulWriter.STATE_VALUE = (byte) 100;
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        org.jdom.Element element2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader4 = new com.thoughtworks.xstream.io.xml.JDomReader(element2, xmlFriendlyReplacer3);
        java.lang.Object obj5 = jDomReader4.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup6 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper7 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper8 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper7);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper9 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper8);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller10 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider0, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader4, converterLookup6, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9);
        try {
            boolean b11 = jDomReader4.hasMoreChildren();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        int i0 = com.thoughtworks.xstream.io.StatefulWriter.STATE_NODE_END;
        org.junit.Assert.assertTrue(i0 == 3);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        java.lang.String str4 = xmlFriendlyMapper1.mapNameToXML("hi!");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider5 = null;
        com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter cGLIBEnhancedConverter6 = new com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1, reflectionProvider5);
        java.lang.ClassLoader classLoader7 = java.lang.ClassLoader.getSystemClassLoader();
        org.jdom.Element element8 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer9 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader10 = new com.thoughtworks.xstream.io.xml.JDomReader(element8, xmlFriendlyReplacer9);
        java.lang.Object obj11 = jDomReader10.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider12 = null;
        com.thoughtworks.xstream.XStream xStream13 = new com.thoughtworks.xstream.XStream(reflectionProvider12);
        org.jdom.Element element14 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer15 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader16 = new com.thoughtworks.xstream.io.xml.JDomReader(element14, xmlFriendlyReplacer15);
        java.lang.Object obj17 = jDomReader16.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup18 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper19 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper20 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper19);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper21 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper20);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller22 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider12, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader16, converterLookup18, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper21);
        java.lang.Runnable runnable23 = null;
        treeUnmarshaller22.addCompletionCallback(runnable23, 0);
        try {
            java.lang.Object obj26 = cGLIBEnhancedConverter6.doUnmarshal((java.lang.Object) classLoader7, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader10, (com.thoughtworks.xstream.converters.UnmarshallingContext) treeUnmarshaller22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        boolean b0 = com.thoughtworks.xstream.core.JVM.reverseFieldDefinition();
        org.junit.Assert.assertTrue(b0 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.thoughtworks.xstream.converters.collections.BitSetConverter bitSetConverter0 = new com.thoughtworks.xstream.converters.collections.BitSetConverter();
        java.io.Writer writer2 = null;
        com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter jsonHierarchicalStreamWriter4 = new com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter(writer2, "");
        java.io.Writer writer5 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer6 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter7 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer5, xmlFriendlyReplacer6);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup8 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper9 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper10 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper9);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper11 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper10);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider12 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter13 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper10, reflectionProvider12);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter14 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper10);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller15 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter7, converterLookup8, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper10);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback16 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream17 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback16);
        java.io.ObjectOutputStream.PutField putField18 = customObjectOutputStream17.putFields();
        java.io.Writer writer19 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer20 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter21 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer19, xmlFriendlyReplacer20);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup22 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper23 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper24 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper23);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper25 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper24);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider26 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter27 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper24, reflectionProvider26);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter28 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper24);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller29 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter21, converterLookup22, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper24);
        referenceByIdMarshaller15.put((java.lang.Object) customObjectOutputStream17, (java.lang.Object) referenceByIdMarshaller29);
        try {
            bitSetConverter0.marshal((java.lang.Object) 100, (com.thoughtworks.xstream.io.HierarchicalStreamWriter) jsonHierarchicalStreamWriter4, (com.thoughtworks.xstream.converters.MarshallingContext) referenceByIdMarshaller15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(putField18);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.thoughtworks.xstream.persistence.StreamStrategy streamStrategy0 = null;
        com.thoughtworks.xstream.persistence.XmlMap xmlMap1 = new com.thoughtworks.xstream.persistence.XmlMap(streamStrategy0);
        com.thoughtworks.xstream.alias.ClassMapper classMapper2 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper3 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper2);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper4 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper3);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider5 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter6 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper3, reflectionProvider5);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter7 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper3);
        com.thoughtworks.xstream.alias.ClassMapper classMapper8 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper9 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper8);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper10 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper9);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider11 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter12 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper9, reflectionProvider11);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter13 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper9);
        try {
            java.lang.Object obj14 = xmlMap1.put((java.lang.Object) mapConverter7, (java.lang.Object) mapConverter13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper1 = null;
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap2 = null;
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver4 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap2, true);
        com.thoughtworks.xstream.XStream xStream6 = new com.thoughtworks.xstream.XStream(reflectionProvider0, classMapper1, (com.thoughtworks.xstream.io.HierarchicalStreamDriver) staxDriver4, "hi!");
        java.lang.Class class8 = null;
        java.lang.Class class9 = null;
        try {
            xStream6.alias("dynamic-proxy", class8, class9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter3 = compactWriter2.underlyingWriter();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup4 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper5 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper6 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller.IDGenerator iDGenerator7 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller8 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup4, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper6, iDGenerator7);
        try {
            compactWriter2.endNode();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter3);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider3 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter4 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1, reflectionProvider3);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter5 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        java.lang.String str7 = xmlFriendlyMapper1.mapNameToXML("");
        com.thoughtworks.xstream.mapper.CachingMapper cachingMapper8 = new com.thoughtworks.xstream.mapper.CachingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        try {
            java.lang.String str9 = cachingMapper8.attributeForImplementationClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider3 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter4 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1, reflectionProvider3);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter5 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        java.lang.String str7 = xmlFriendlyMapper1.mapNameToXML("");
        try {
            java.lang.Class class9 = xmlFriendlyMapper1.realClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.ClassAliasingMapper classAliasingMapper1 = new com.thoughtworks.xstream.mapper.ClassAliasingMapper(classMapper0);
        try {
            java.lang.Class class3 = classAliasingMapper1.realClass("class");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.thoughtworks.xstream.XStream xStream0 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter1 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream0.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter1);
        com.thoughtworks.xstream.MarshallingStrategy marshallingStrategy3 = null;
        xStream0.setMarshallingStrategy(marshallingStrategy3);
        com.thoughtworks.xstream.converters.collections.BitSetConverter bitSetConverter5 = new com.thoughtworks.xstream.converters.collections.BitSetConverter();
        xStream0.registerConverter((com.thoughtworks.xstream.converters.Converter) bitSetConverter5, (int) (byte) 126);
        java.lang.Class class8 = null;
        try {
            xStream0.omitField(class8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback0 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream1 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback0);
        java.io.ObjectOutputStream.PutField putField2 = customObjectOutputStream1.putFields();
        try {
            customObjectOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(putField2);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        int i0 = com.thoughtworks.xstream.io.StatefulWriter.STATE_CLOSED;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        int i0 = com.thoughtworks.xstream.XStream.PRIORITY_VERY_HIGH;
        org.junit.Assert.assertTrue(i0 == 10000);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.thoughtworks.xstream.io.xml.JDomWriter jDomWriter0 = new com.thoughtworks.xstream.io.xml.JDomWriter();
        try {
            jDomWriter0.endNode();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        org.jdom.Element element2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader4 = new com.thoughtworks.xstream.io.xml.JDomReader(element2, xmlFriendlyReplacer3);
        java.lang.Object obj5 = jDomReader4.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup6 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper7 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper8 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper7);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper9 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper8);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller10 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider0, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader4, converterLookup6, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9);
        try {
            java.util.Iterator iterator11 = jDomReader4.getAttributeNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamDriver hierarchicalStreamDriver1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream(reflectionProvider0, hierarchicalStreamDriver1);
        java.lang.Class class4 = null;
        xStream2.useAttributeFor("", class4);
        java.io.Writer writer6 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer7 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter8 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer6, xmlFriendlyReplacer7);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup9 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper10 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper11 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper10);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper12 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider13 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter14 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11, reflectionProvider13);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter15 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller16 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter8, converterLookup9, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback17 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream18 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller16, streamCallback17);
        try {
            java.lang.Object obj19 = xStream2.fromXML((java.io.InputStream) customObjectInputStream18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(customObjectInputStream18);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.jdom.Document document0 = null;
        try {
            com.thoughtworks.xstream.io.xml.JDomReader jDomReader1 = new com.thoughtworks.xstream.io.xml.JDomReader(document0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.thoughtworks.xstream.converters.reflection.FieldDictionary fieldDictionary0 = new com.thoughtworks.xstream.converters.reflection.FieldDictionary();
        java.lang.Class class1 = null;
        try {
            java.util.Iterator iterator2 = fieldDictionary0.serializableFieldsFor(class1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider3 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter4 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1, reflectionProvider3);
        java.lang.Class class5 = null;
        try {
            java.lang.String str7 = xmlFriendlyMapper1.serializedMember(class5, "class");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        java.lang.String str4 = xmlFriendlyMapper1.mapNameToXML("hi!");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider5 = null;
        com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter cGLIBEnhancedConverter6 = new com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1, reflectionProvider5);
        java.lang.Class class7 = null;
        try {
            boolean b8 = cGLIBEnhancedConverter6.canConvert(class7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        int i0 = com.thoughtworks.xstream.io.StatefulWriter.STATE_VALUE;
        org.junit.Assert.assertTrue(i0 == 100);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.io.Reader reader0 = null;
        try {
            com.thoughtworks.xstream.io.xml.XppReader xppReader1 = new com.thoughtworks.xstream.io.xml.XppReader(reader0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.String str0 = com.thoughtworks.xstream.io.xml.TraxSource.XSTREAM_FEATURE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://com.thoughtworks.xstream/XStreamSource/feature" + "'", str0.equals("http://com.thoughtworks.xstream/XStreamSource/feature"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SUBCLASS_IMPLEMENTATION_PERMISSION;
        org.junit.Assert.assertNotNull(serializablePermission0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        nu.xom.Element element0 = null;
        com.thoughtworks.xstream.io.xml.XomReader xomReader1 = new com.thoughtworks.xstream.io.xml.XomReader(element0);
        try {
            java.lang.String str3 = xomReader1.getAttributeName(8257536);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream12 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller10, streamCallback11);
        try {
            customObjectInputStream12.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(customObjectInputStream12);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        int i0 = com.thoughtworks.xstream.XStream.XPATH_REFERENCES;
        org.junit.Assert.assertTrue(i0 == 1003);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper1 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader0);
        java.lang.String str2 = defaultMapper1.attributeForImplementationClass();
        java.lang.Class class3 = null;
        try {
            java.lang.String str4 = defaultMapper1.serializedClass(class3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(classLoader0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "class" + "'", str2.equals("class"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.thoughtworks.xstream.converters.extended.CurrencyConverter currencyConverter0 = new com.thoughtworks.xstream.converters.extended.CurrencyConverter();
        try {
            java.lang.Object obj2 = currencyConverter0.fromString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        org.jdom.Element element2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader4 = new com.thoughtworks.xstream.io.xml.JDomReader(element2, xmlFriendlyReplacer3);
        java.lang.Object obj5 = jDomReader4.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup6 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper7 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper8 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper7);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper9 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper8);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller10 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider0, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader4, converterLookup6, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream12 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller10, streamCallback11);
        try {
            int i13 = customObjectInputStream12.read();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(customObjectInputStream12);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup11 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper12 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller13 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup11, classMapper12);
        java.lang.Object obj14 = null;
        com.thoughtworks.xstream.converters.collections.PropertiesConverter propertiesConverter15 = new com.thoughtworks.xstream.converters.collections.PropertiesConverter();
        try {
            referenceByIdMarshaller13.convert(obj14, (com.thoughtworks.xstream.converters.Converter) propertiesConverter15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.net.URL uRL1 = java.lang.ClassLoader.getSystemResource("");
        org.junit.Assert.assertNotNull(uRL1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        byte byte0 = java.io.ObjectStreamConstants.SC_SERIALIZABLE;
        org.junit.Assert.assertTrue(byte0 == (byte) 2);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper2 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.mapper.AttributeAliasingMapper attributeAliasingMapper3 = new com.thoughtworks.xstream.mapper.AttributeAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper2);
        try {
            java.lang.String str5 = attributeAliasingMapper3.aliasForAttribute("dynamic-proxy");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.ClassAliasingMapper classAliasingMapper2 = new com.thoughtworks.xstream.mapper.ClassAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        java.lang.Class class4 = null;
        try {
            classAliasingMapper2.addClassAlias("http://com.thoughtworks.xstream/XStreamSource/feature", class4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        org.jdom.Element element2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader4 = new com.thoughtworks.xstream.io.xml.JDomReader(element2, xmlFriendlyReplacer3);
        java.lang.Object obj5 = jDomReader4.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup6 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper7 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper8 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper7);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper9 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper8);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller10 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider0, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader4, converterLookup6, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream12 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller10, streamCallback11);
        try {
            int i14 = customObjectInputStream12.skipBytes((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(customObjectInputStream12);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.thoughtworks.xstream.io.xml.Dom4JDriver dom4JDriver0 = new com.thoughtworks.xstream.io.xml.Dom4JDriver();
        org.dom4j.io.OutputFormat outputFormat1 = null;
        dom4JDriver0.setOutputFormat(outputFormat1);
        org.dom4j.DocumentFactory documentFactory3 = null;
        dom4JDriver0.setDocumentFactory(documentFactory3);
        org.dom4j.io.OutputFormat outputFormat5 = null;
        dom4JDriver0.setOutputFormat(outputFormat5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.util.List list0 = null;
        try {
            com.thoughtworks.xstream.io.xml.TraxSource traxSource1 = new com.thoughtworks.xstream.io.xml.TraxSource(list0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.io.Writer writer0 = null;
        java.io.Writer writer1 = null;
        java.io.Writer writer2 = null;
        char[] char_array7 = new char[] { 'a', '4', '4', ' ' };
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter8 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer2, char_array7);
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter9 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer1, char_array7);
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter10 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer0, char_array7);
        org.dom4j.Element element11 = null;
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader12 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element11);
        com.thoughtworks.xstream.alias.ClassMapper classMapper13 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup14 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper13);
        com.thoughtworks.xstream.alias.ClassMapper classMapper15 = null;
        try {
            com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller referenceByXPathUnmarshaller16 = new com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller((java.lang.Object) char_array7, (com.thoughtworks.xstream.io.HierarchicalStreamReader) dom4JReader12, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup14, classMapper15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(char_array7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.dom4j.DocumentFactory documentFactory0 = null;
        org.dom4j.io.OutputFormat outputFormat1 = null;
        java.io.Writer writer2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer5 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter6 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer2, xmlFriendlyReplacer5);
        com.thoughtworks.xstream.io.xml.Dom4JDriver dom4JDriver7 = new com.thoughtworks.xstream.io.xml.Dom4JDriver(documentFactory0, outputFormat1, xmlFriendlyReplacer5);
        org.dom4j.io.OutputFormat outputFormat8 = dom4JDriver7.getOutputFormat();
        org.junit.Assert.assertNull(outputFormat8);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.ClassAliasingMapper classAliasingMapper2 = new com.thoughtworks.xstream.mapper.ClassAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        java.lang.Class class4 = null;
        try {
            classAliasingMapper2.addClassAttributeAlias("hi!", class4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.thoughtworks.xstream.converters.extended.CharsetConverter charsetConverter0 = new com.thoughtworks.xstream.converters.extended.CharsetConverter();
        java.lang.Class class1 = null;
        try {
            boolean b2 = charsetConverter0.canConvert(class1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.dom4j.DocumentFactory documentFactory0 = null;
        org.dom4j.io.OutputFormat outputFormat1 = null;
        java.io.Writer writer2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer5 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter6 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer2, xmlFriendlyReplacer5);
        com.thoughtworks.xstream.io.xml.Dom4JDriver dom4JDriver7 = new com.thoughtworks.xstream.io.xml.Dom4JDriver(documentFactory0, outputFormat1, xmlFriendlyReplacer5);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback8 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream9 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback8);
        java.io.ObjectOutputStream.PutField putField10 = customObjectOutputStream9.putFields();
        try {
            com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter11 = dom4JDriver7.createWriter((java.io.OutputStream) customObjectOutputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(putField10);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.io.Writer writer0 = null;
        char[] char_array5 = new char[] { 'a', '4', '4', ' ' };
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter6 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer0, char_array5);
        com.thoughtworks.xstream.io.path.PathTracker pathTracker7 = null;
        com.thoughtworks.xstream.io.path.PathTrackingWriter pathTrackingWriter8 = new com.thoughtworks.xstream.io.path.PathTrackingWriter((com.thoughtworks.xstream.io.HierarchicalStreamWriter) prettyPrintWriter6, pathTracker7);
        try {
            pathTrackingWriter8.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(char_array5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper1 = null;
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap2 = null;
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver4 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap2, true);
        com.thoughtworks.xstream.XStream xStream6 = new com.thoughtworks.xstream.XStream(reflectionProvider0, classMapper1, (com.thoughtworks.xstream.io.HierarchicalStreamDriver) staxDriver4, "hi!");
        java.io.Writer writer7 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer8 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter9 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer7, xmlFriendlyReplacer8);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup10 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper11 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper12 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper11);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper13 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper12);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider14 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter15 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper12, reflectionProvider14);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter16 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper12);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller17 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter9, converterLookup10, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper12);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback18 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream19 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller17, streamCallback18);
        try {
            com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader20 = staxDriver4.createReader((java.io.InputStream) customObjectInputStream19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(customObjectInputStream19);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback0 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream1 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback0);
        try {
            customObjectOutputStream1.writeShort((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        nu.xom.Element element2 = null;
        java.io.Writer writer3 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer6 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter7 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer3, xmlFriendlyReplacer6);
        com.thoughtworks.xstream.io.xml.XomReader xomReader8 = new com.thoughtworks.xstream.io.xml.XomReader(element2, xmlFriendlyReplacer6);
        try {
            java.lang.Object obj9 = xStream1.unmarshal((com.thoughtworks.xstream.io.HierarchicalStreamReader) xomReader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamDriver hierarchicalStreamDriver1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream(reflectionProvider0, hierarchicalStreamDriver1);
        com.thoughtworks.xstream.mapper.Mapper mapper3 = xStream2.getMapper();
        com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy referenceByXPathMarshallingStrategy5 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy((int) (byte) 0);
        xStream2.setMarshallingStrategy((com.thoughtworks.xstream.MarshallingStrategy) referenceByXPathMarshallingStrategy5);
        java.io.Reader reader7 = null;
        try {
            java.lang.Object obj8 = xStream2.fromXML(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(mapper3);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter4 = attributeMapper2.getConverterFromAttribute("dynamic-proxy");
        java.lang.Class class5 = null;
        attributeMapper2.addAttributeFor(class5);
        com.thoughtworks.xstream.converters.collections.CollectionConverter collectionConverter7 = new com.thoughtworks.xstream.converters.collections.CollectionConverter((com.thoughtworks.xstream.mapper.Mapper) attributeMapper2);
        java.lang.Class class8 = null;
        try {
            java.lang.String str10 = attributeMapper2.realMember(class8, "http://com.thoughtworks.xstream/XStreamSource/feature");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(singleValueConverter4);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup11 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper12 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller13 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup11, classMapper12);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter14 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter15 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter16 = saxWriter15.underlyingWriter();
        referenceByIdMarshaller13.put((java.lang.Object) saxWriter14, (java.lang.Object) saxWriter15);
        try {
            boolean b19 = saxWriter15.getFeature("http://com.thoughtworks.xstream/XStreamSource/feature");
            org.junit.Assert.fail("Expected exception of type org.xml.sax.SAXNotRecognizedException");
        } catch (org.xml.sax.SAXNotRecognizedException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter16);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        org.jdom.Element element2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader4 = new com.thoughtworks.xstream.io.xml.JDomReader(element2, xmlFriendlyReplacer3);
        java.lang.Object obj5 = jDomReader4.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup6 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper7 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper8 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper7);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper9 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper8);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller10 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider0, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader4, converterLookup6, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream12 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller10, streamCallback11);
        try {
            int i13 = customObjectInputStream12.readUnsignedShort();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(customObjectInputStream12);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup11 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper12 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller13 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup11, classMapper12);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter14 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter15 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter16 = saxWriter15.underlyingWriter();
        referenceByIdMarshaller13.put((java.lang.Object) saxWriter14, (java.lang.Object) saxWriter15);
        com.thoughtworks.xstream.XStream xStream18 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter19 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream18.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter19);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup21 = xStream18.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper22 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper23 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper22);
        com.thoughtworks.xstream.mapper.ClassAliasingMapper classAliasingMapper24 = new com.thoughtworks.xstream.mapper.ClassAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper23);
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller26 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) saxWriter15, converterLookup21, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper23, (int) 'a');
        java.lang.Class class28 = null;
        try {
            com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter29 = xmlFriendlyMapper23.getConverterFromItemType("dynamic-proxy", class28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter16);
        org.junit.Assert.assertNotNull(converterLookup21);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper1 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper0);
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper3 = new com.thoughtworks.xstream.mapper.CGLIBMapper((com.thoughtworks.xstream.mapper.Mapper) classMapper0, "hi!");
        java.lang.Class class4 = null;
        try {
            java.lang.String str5 = cGLIBMapper3.serializedClass(class4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap0 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter1 = null;
        try {
            com.thoughtworks.xstream.io.xml.StaxWriter staxWriter2 = new com.thoughtworks.xstream.io.xml.StaxWriter(qNameMap0, xMLStreamWriter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup11 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper12 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller13 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup11, classMapper12);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter14 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter15 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter16 = saxWriter15.underlyingWriter();
        referenceByIdMarshaller13.put((java.lang.Object) saxWriter14, (java.lang.Object) saxWriter15);
        try {
            saxWriter14.endNode();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter16);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.thoughtworks.xstream.io.StreamException streamException1 = new com.thoughtworks.xstream.io.StreamException("enum-type");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XomDriver xomDriver4 = new com.thoughtworks.xstream.io.xml.XomDriver(xmlFriendlyReplacer3);
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver5 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap0, xmlFriendlyReplacer3);
        javax.xml.stream.XMLStreamReader xMLStreamReader6 = null;
        try {
            com.thoughtworks.xstream.io.xml.AbstractPullReader abstractPullReader7 = staxDriver5.createStaxReader(xMLStreamReader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter0 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter1 = saxWriter0.underlyingWriter();
        try {
            saxWriter0.parse("");
            org.junit.Assert.fail("Expected exception of type org.xml.sax.SAXException");
        } catch (org.xml.sax.SAXException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback0 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream1 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback0);
        java.io.ObjectOutputStream.PutField putField2 = customObjectOutputStream1.putFields();
        java.io.ObjectOutputStream.PutField putField3 = customObjectOutputStream1.putFields();
        try {
            customObjectOutputStream1.writeFields();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(putField2);
        org.junit.Assert.assertNotNull(putField3);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.thoughtworks.xstream.io.xml.Dom4JDriver dom4JDriver0 = new com.thoughtworks.xstream.io.xml.Dom4JDriver();
        org.dom4j.io.OutputFormat outputFormat1 = null;
        dom4JDriver0.setOutputFormat(outputFormat1);
        java.io.Writer writer3 = null;
        try {
            com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter4 = dom4JDriver0.createWriter(writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.io.Writer writer0 = null;
        char[] char_array5 = new char[] { 'a', '4', '4', ' ' };
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter6 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer0, char_array5);
        com.thoughtworks.xstream.io.path.PathTracker pathTracker7 = null;
        com.thoughtworks.xstream.io.path.PathTrackingWriter pathTrackingWriter8 = new com.thoughtworks.xstream.io.path.PathTrackingWriter((com.thoughtworks.xstream.io.HierarchicalStreamWriter) prettyPrintWriter6, pathTracker7);
        try {
            pathTrackingWriter8.startNode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(char_array5);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter0 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        try {
            saxWriter0.setProperty("class", (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type org.xml.sax.SAXNotRecognizedException");
        } catch (org.xml.sax.SAXNotRecognizedException e) {
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        boolean b0 = com.thoughtworks.xstream.core.JVM.is15();
        org.junit.Assert.assertTrue(b0 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider3 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter4 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1, reflectionProvider3);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter5 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        try {
            com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter7 = xmlFriendlyMapper1.getConverterFromAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup1 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper0);
        java.lang.Class class2 = null;
        try {
            com.thoughtworks.xstream.converters.Converter converter3 = defaultConverterLookup1.lookupConverterForType(class2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter3 = compactWriter2.underlyingWriter();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup4 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper5 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper6 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller.IDGenerator iDGenerator7 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller8 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup4, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper6, iDGenerator7);
        java.lang.Object obj10 = referenceByIdMarshaller8.get((java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter3);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.thoughtworks.xstream.converters.basic.FloatConverter floatConverter0 = new com.thoughtworks.xstream.converters.basic.FloatConverter();
        java.lang.Class class1 = null;
        try {
            boolean b2 = floatConverter0.canConvert(class1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper1 = null;
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap2 = null;
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver4 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap2, true);
        com.thoughtworks.xstream.XStream xStream6 = new com.thoughtworks.xstream.XStream(reflectionProvider0, classMapper1, (com.thoughtworks.xstream.io.HierarchicalStreamDriver) staxDriver4, "hi!");
        try {
            xStream6.setMode((int) (byte) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider3 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter4 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1, reflectionProvider3);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter5 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        nu.xom.Element element6 = null;
        java.io.Writer writer7 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer10 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter11 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer7, xmlFriendlyReplacer10);
        com.thoughtworks.xstream.io.xml.XomReader xomReader12 = new com.thoughtworks.xstream.io.xml.XomReader(element6, xmlFriendlyReplacer10);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider13 = null;
        com.thoughtworks.xstream.XStream xStream14 = new com.thoughtworks.xstream.XStream(reflectionProvider13);
        org.jdom.Element element15 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer16 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader17 = new com.thoughtworks.xstream.io.xml.JDomReader(element15, xmlFriendlyReplacer16);
        java.lang.Object obj18 = jDomReader17.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup19 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper20 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper21 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper20);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper22 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper21);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller23 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider13, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader17, converterLookup19, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper22);
        try {
            java.lang.Object obj24 = arrayConverter5.unmarshal((com.thoughtworks.xstream.io.HierarchicalStreamReader) xomReader12, (com.thoughtworks.xstream.converters.UnmarshallingContext) treeUnmarshaller23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback0 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream1 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback0);
        java.io.ObjectOutputStream.PutField putField2 = customObjectOutputStream1.putFields();
        try {
            customObjectOutputStream1.writeByte((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(putField2);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.mapper.ArrayMapper arrayMapper3 = new com.thoughtworks.xstream.mapper.ArrayMapper((com.thoughtworks.xstream.mapper.Mapper) attributeMapper2);
        java.lang.Class class4 = null;
        try {
            java.lang.String str5 = arrayMapper3.serializedClass(class4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap0 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader1 = null;
        java.io.Writer writer2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer5 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter6 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer5);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter7 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer2, xmlFriendlyReplacer5);
        try {
            com.thoughtworks.xstream.io.xml.StaxReader staxReader8 = new com.thoughtworks.xstream.io.xml.StaxReader(qNameMap0, xMLStreamReader1, xmlFriendlyReplacer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.thoughtworks.xstream.converters.basic.LongConverter longConverter0 = new com.thoughtworks.xstream.converters.basic.LongConverter();
        try {
            java.lang.Object obj2 = longConverter0.fromString("http://com.thoughtworks.xstream/XStreamSource/feature");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        org.jdom.Element element2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader4 = new com.thoughtworks.xstream.io.xml.JDomReader(element2, xmlFriendlyReplacer3);
        java.lang.Object obj5 = jDomReader4.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup6 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper7 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper8 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper7);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper9 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper8);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller10 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider0, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader4, converterLookup6, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9);
        java.lang.String str11 = dynamicProxyMapper9.getAlias();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup12 = null;
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper13 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9, converterLookup12);
        try {
            java.lang.String str14 = attributeMapper13.attributeForReadResolveField();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "dynamic-proxy" + "'", str11.equals("dynamic-proxy"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper1 = null;
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap2 = null;
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver4 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap2, true);
        com.thoughtworks.xstream.XStream xStream6 = new com.thoughtworks.xstream.XStream(reflectionProvider0, classMapper1, (com.thoughtworks.xstream.io.HierarchicalStreamDriver) staxDriver4, "hi!");
        java.io.Writer writer7 = null;
        try {
            com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter8 = staxDriver4.createWriter(writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker serializationMethodInvoker0 = new com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker();
        java.lang.Class class1 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback3 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream4 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback3);
        java.io.ObjectOutputStream.PutField putField5 = customObjectOutputStream4.putFields();
        java.io.ObjectOutputStream.PutField putField6 = customObjectOutputStream4.putFields();
        try {
            serializationMethodInvoker0.callWriteObject(class1, (java.lang.Object) "defined-in", (java.io.ObjectOutputStream) customObjectOutputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(putField5);
        org.junit.Assert.assertNotNull(putField6);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.lang.Class class0 = null;
        try {
            java.lang.reflect.Field field2 = com.thoughtworks.xstream.core.util.Fields.find(class0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper2 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.mapper.AttributeAliasingMapper attributeAliasingMapper3 = new com.thoughtworks.xstream.mapper.AttributeAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper2);
        try {
            java.lang.String str5 = attributeAliasingMapper3.aliasForAttribute("defined-in");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        int i0 = com.thoughtworks.xstream.io.StatefulWriter.STATE_OPEN;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.thoughtworks.xstream.XStream xStream0 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter1 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream0.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter1);
        com.thoughtworks.xstream.MarshallingStrategy marshallingStrategy3 = null;
        xStream0.setMarshallingStrategy(marshallingStrategy3);
        java.io.Writer writer5 = null;
        try {
            java.io.ObjectOutputStream objectOutputStream6 = xStream0.createObjectOutputStream(writer5);
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper2 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.mapper.EnumMapper enumMapper3 = new com.thoughtworks.xstream.mapper.EnumMapper((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper2);
        java.lang.Class class4 = null;
        try {
            java.lang.String str5 = dynamicProxyMapper2.serializedClass(class4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter4 = attributeMapper2.getConverterFromAttribute("dynamic-proxy");
        java.lang.Class class5 = null;
        attributeMapper2.addAttributeFor(class5);
        com.thoughtworks.xstream.converters.collections.CollectionConverter collectionConverter7 = new com.thoughtworks.xstream.converters.collections.CollectionConverter((com.thoughtworks.xstream.mapper.Mapper) attributeMapper2);
        nu.xom.Element element8 = null;
        java.io.Writer writer9 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer12 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter13 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer9, xmlFriendlyReplacer12);
        com.thoughtworks.xstream.io.xml.XomReader xomReader14 = new com.thoughtworks.xstream.io.xml.XomReader(element8, xmlFriendlyReplacer12);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider15 = null;
        com.thoughtworks.xstream.XStream xStream16 = new com.thoughtworks.xstream.XStream(reflectionProvider15);
        org.jdom.Element element17 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer18 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader19 = new com.thoughtworks.xstream.io.xml.JDomReader(element17, xmlFriendlyReplacer18);
        java.lang.Object obj20 = jDomReader19.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup21 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper22 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper23 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper22);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper24 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper23);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller25 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider15, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader19, converterLookup21, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper24);
        java.lang.Runnable runnable26 = null;
        treeUnmarshaller25.addCompletionCallback(runnable26, 0);
        java.lang.Object obj29 = treeUnmarshaller25.currentObject();
        try {
            java.lang.Object obj30 = collectionConverter7.unmarshal((com.thoughtworks.xstream.io.HierarchicalStreamReader) xomReader14, (com.thoughtworks.xstream.converters.UnmarshallingContext) treeUnmarshaller25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(singleValueConverter4);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.thoughtworks.xstream.converters.extended.StackTraceElementConverter stackTraceElementConverter0 = new com.thoughtworks.xstream.converters.extended.StackTraceElementConverter();
        try {
            java.lang.Object obj2 = stackTraceElementConverter0.fromString("");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.converters.ConversionException");
        } catch (com.thoughtworks.xstream.converters.ConversionException e) {
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        org.jdom.Element element2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader4 = new com.thoughtworks.xstream.io.xml.JDomReader(element2, xmlFriendlyReplacer3);
        java.lang.Object obj5 = jDomReader4.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup6 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper7 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper8 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper7);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper9 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper8);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller10 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider0, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader4, converterLookup6, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9);
        java.lang.String str11 = dynamicProxyMapper9.getAlias();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup12 = null;
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper13 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9, converterLookup12);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter15 = attributeMapper13.getConverterFromAttribute("class");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "dynamic-proxy" + "'", str11.equals("dynamic-proxy"));
        org.junit.Assert.assertNull(singleValueConverter15);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        java.io.Writer writer2 = null;
        try {
            java.io.ObjectOutputStream objectOutputStream4 = xStream1.createObjectOutputStream(writer2, "class");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.thoughtworks.xstream.converters.collections.BitSetConverter bitSetConverter0 = new com.thoughtworks.xstream.converters.collections.BitSetConverter();
        java.lang.Class class1 = null;
        try {
            boolean b2 = bitSetConverter0.canConvert(class1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter3 = compactWriter2.underlyingWriter();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup4 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper5 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper6 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller.IDGenerator iDGenerator7 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller8 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup4, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper6, iDGenerator7);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback9 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream10 = com.thoughtworks.xstream.core.util.CustomObjectOutputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller8, streamCallback9);
        try {
            customObjectOutputStream10.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter3);
        org.junit.Assert.assertNotNull(customObjectOutputStream10);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider pureJavaReflectionProvider0 = new com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider();
        com.thoughtworks.xstream.alias.ClassMapper classMapper1 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper2 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper1);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper3 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper2);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider4 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter5 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper2, reflectionProvider4);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter6 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper2);
        com.thoughtworks.xstream.io.HierarchicalStreamDriver hierarchicalStreamDriver7 = null;
        try {
            com.thoughtworks.xstream.XStream xStream8 = new com.thoughtworks.xstream.XStream((com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider0, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper2, hierarchicalStreamDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.thoughtworks.xstream.mapper.Mapper mapper0 = null;
        com.thoughtworks.xstream.converters.reflection.ExternalizableConverter externalizableConverter1 = new com.thoughtworks.xstream.converters.reflection.ExternalizableConverter(mapper0);
        java.lang.Class class2 = null;
        try {
            boolean b3 = externalizableConverter1.canConvert(class2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider3 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter4 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1, reflectionProvider3);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter5 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        java.lang.String str7 = xmlFriendlyMapper1.mapNameToXML("");
        com.thoughtworks.xstream.mapper.CachingMapper cachingMapper8 = new com.thoughtworks.xstream.mapper.CachingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider9 = null;
        com.thoughtworks.xstream.XStream xStream10 = new com.thoughtworks.xstream.XStream(reflectionProvider9);
        org.jdom.Element element11 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer12 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader13 = new com.thoughtworks.xstream.io.xml.JDomReader(element11, xmlFriendlyReplacer12);
        java.lang.Object obj14 = jDomReader13.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup15 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper16 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper17 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper16);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper18 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper17);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller19 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider9, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader13, converterLookup15, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper18);
        java.io.Writer writer20 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer21 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter22 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer20, xmlFriendlyReplacer21);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup23 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper24 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper25 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper24);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper26 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper25);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider27 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter28 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper25, reflectionProvider27);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter29 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper25);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller30 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter22, converterLookup23, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper25);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup31 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper32 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller33 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter22, converterLookup31, classMapper32);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter34 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter35 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter36 = saxWriter35.underlyingWriter();
        referenceByIdMarshaller33.put((java.lang.Object) saxWriter34, (java.lang.Object) saxWriter35);
        com.thoughtworks.xstream.XStream xStream38 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter39 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream38.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter39);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup41 = xStream38.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper42 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper43 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper42);
        com.thoughtworks.xstream.mapper.ClassAliasingMapper classAliasingMapper44 = new com.thoughtworks.xstream.mapper.ClassAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper43);
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller46 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) saxWriter35, converterLookup41, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper43, (int) 'a');
        com.thoughtworks.xstream.alias.ClassMapper classMapper47 = null;
        com.thoughtworks.xstream.core.ReferenceByIdUnmarshaller referenceByIdUnmarshaller48 = new com.thoughtworks.xstream.core.ReferenceByIdUnmarshaller((java.lang.Object) cachingMapper8, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader13, converterLookup41, classMapper47);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider49 = null;
        com.thoughtworks.xstream.XStream xStream50 = new com.thoughtworks.xstream.XStream(reflectionProvider49);
        org.jdom.Element element51 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer52 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader53 = new com.thoughtworks.xstream.io.xml.JDomReader(element51, xmlFriendlyReplacer52);
        java.lang.Object obj54 = jDomReader53.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup55 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper56 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper57 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper56);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper58 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper57);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller59 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider49, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader53, converterLookup55, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper58);
        java.lang.Runnable runnable60 = null;
        treeUnmarshaller59.addCompletionCallback(runnable60, 0);
        try {
            java.lang.Object obj63 = referenceByIdUnmarshaller48.start((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter36);
        org.junit.Assert.assertNotNull(converterLookup41);
        org.junit.Assert.assertNull(obj54);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback0 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream1 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback0);
        java.io.ObjectOutputStream.PutField putField2 = customObjectOutputStream1.putFields();
        try {
            customObjectOutputStream1.writeBytes("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(putField2);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper1 = null;
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap2 = null;
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver4 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap2, true);
        com.thoughtworks.xstream.XStream xStream6 = new com.thoughtworks.xstream.XStream(reflectionProvider0, classMapper1, (com.thoughtworks.xstream.io.HierarchicalStreamDriver) staxDriver4, "hi!");
        java.io.Writer writer8 = null;
        try {
            xStream6.toXML((java.lang.Object) '#', writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream12 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller10, streamCallback11);
        try {
            long long14 = customObjectInputStream12.skip((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(customObjectInputStream12);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.thoughtworks.xstream.converters.basic.IntConverter intConverter0 = new com.thoughtworks.xstream.converters.basic.IntConverter();
        java.lang.Class class1 = null;
        try {
            boolean b2 = intConverter0.canConvert(class1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream12 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback11);
        java.io.ObjectOutputStream.PutField putField13 = customObjectOutputStream12.putFields();
        java.io.Writer writer14 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer15 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter16 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer14, xmlFriendlyReplacer15);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup17 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper18 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper19 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper18);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper20 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider21 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter22 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19, reflectionProvider21);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter23 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller24 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter16, converterLookup17, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        referenceByIdMarshaller10.put((java.lang.Object) customObjectOutputStream12, (java.lang.Object) referenceByIdMarshaller24);
        try {
            customObjectOutputStream12.writeBoolean(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(putField13);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup11 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper12 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller13 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup11, classMapper12);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter14 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter15 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter16 = saxWriter15.underlyingWriter();
        referenceByIdMarshaller13.put((java.lang.Object) saxWriter14, (java.lang.Object) saxWriter15);
        com.thoughtworks.xstream.XStream xStream18 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter19 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream18.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter19);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup21 = xStream18.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper22 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper23 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper22);
        com.thoughtworks.xstream.mapper.ClassAliasingMapper classAliasingMapper24 = new com.thoughtworks.xstream.mapper.ClassAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper23);
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller26 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) saxWriter15, converterLookup21, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper23, (int) 'a');
        saxWriter15.close();
        try {
            saxWriter15.setFeature("hi!", true);
            org.junit.Assert.fail("Expected exception of type org.xml.sax.SAXNotRecognizedException");
        } catch (org.xml.sax.SAXNotRecognizedException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter16);
        org.junit.Assert.assertNotNull(converterLookup21);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.io.Writer writer0 = null;
        java.io.Writer writer1 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer4 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XomDriver xomDriver5 = new com.thoughtworks.xstream.io.xml.XomDriver(xmlFriendlyReplacer4);
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter6 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer1, xmlFriendlyReplacer4);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter7 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer4);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.thoughtworks.xstream.XStream xStream0 = new com.thoughtworks.xstream.XStream();
        java.io.Writer writer1 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer2 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter3 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer1, xmlFriendlyReplacer2);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter4 = compactWriter3.underlyingWriter();
        try {
            java.io.ObjectOutputStream objectOutputStream5 = xStream0.createObjectOutputStream((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter3);
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter4);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper2 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.mapper.EnumMapper enumMapper3 = new com.thoughtworks.xstream.mapper.EnumMapper((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper2);
        try {
            java.lang.String str4 = dynamicProxyMapper2.attributeForImplementationClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.lang.Class class0 = null;
        try {
            java.lang.reflect.Field field2 = com.thoughtworks.xstream.core.util.Fields.find(class0, "enum-type");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.thoughtworks.xstream.converters.extended.GregorianCalendarConverter gregorianCalendarConverter0 = new com.thoughtworks.xstream.converters.extended.GregorianCalendarConverter();
        org.dom4j.Element element1 = null;
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader2 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element1);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider3 = null;
        com.thoughtworks.xstream.XStream xStream4 = new com.thoughtworks.xstream.XStream(reflectionProvider3);
        org.jdom.Element element5 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer6 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader7 = new com.thoughtworks.xstream.io.xml.JDomReader(element5, xmlFriendlyReplacer6);
        java.lang.Object obj8 = jDomReader7.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup9 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper10 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper11 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper10);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper12 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller13 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider3, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader7, converterLookup9, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper12);
        java.lang.Runnable runnable14 = null;
        treeUnmarshaller13.addCompletionCallback(runnable14, 0);
        try {
            java.lang.Object obj17 = gregorianCalendarConverter0.unmarshal((com.thoughtworks.xstream.io.HierarchicalStreamReader) dom4JReader2, (com.thoughtworks.xstream.converters.UnmarshallingContext) treeUnmarshaller13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter jsonHierarchicalStreamWriter1 = new com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter(writer0);
        try {
            jsonHierarchicalStreamWriter1.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.thoughtworks.xstream.converters.javabean.JavaBeanConverter.DuplicateFieldException duplicateFieldException2 = new com.thoughtworks.xstream.converters.javabean.JavaBeanConverter.DuplicateFieldException("hi!");
        com.thoughtworks.xstream.io.StreamException streamException3 = new com.thoughtworks.xstream.io.StreamException((java.lang.Throwable) duplicateFieldException2);
        com.thoughtworks.xstream.converters.ConversionException conversionException4 = new com.thoughtworks.xstream.converters.ConversionException((java.lang.Throwable) streamException3);
        com.thoughtworks.xstream.XStream.InitializationException initializationException5 = new com.thoughtworks.xstream.XStream.InitializationException("enum-type", (java.lang.Throwable) streamException3);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream12 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller10, streamCallback11);
        try {
            boolean b13 = customObjectInputStream12.readBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(customObjectInputStream12);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.thoughtworks.xstream.io.xml.DomDriver domDriver0 = new com.thoughtworks.xstream.io.xml.DomDriver();
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream(reflectionProvider1);
        org.jdom.Element element3 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer4 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader5 = new com.thoughtworks.xstream.io.xml.JDomReader(element3, xmlFriendlyReplacer4);
        java.lang.Object obj6 = jDomReader5.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup7 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper8 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper9 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper8);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper10 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper9);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller11 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider1, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader5, converterLookup7, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper10);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback12 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream13 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller11, streamCallback12);
        try {
            com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader14 = domDriver0.createReader((java.io.InputStream) customObjectInputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(customObjectInputStream13);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.thoughtworks.xstream.XStream xStream0 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter1 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream0.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter1);
        com.thoughtworks.xstream.MarshallingStrategy marshallingStrategy3 = null;
        xStream0.setMarshallingStrategy(marshallingStrategy3);
        com.thoughtworks.xstream.converters.collections.BitSetConverter bitSetConverter5 = new com.thoughtworks.xstream.converters.collections.BitSetConverter();
        xStream0.registerConverter((com.thoughtworks.xstream.converters.Converter) bitSetConverter5, (int) (byte) 126);
        com.thoughtworks.xstream.converters.extended.ThrowableConverter throwableConverter8 = new com.thoughtworks.xstream.converters.extended.ThrowableConverter((com.thoughtworks.xstream.converters.Converter) bitSetConverter5);
        nu.xom.Element element9 = null;
        java.io.Writer writer10 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer13 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter14 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer10, xmlFriendlyReplacer13);
        com.thoughtworks.xstream.io.xml.XomReader xomReader15 = new com.thoughtworks.xstream.io.xml.XomReader(element9, xmlFriendlyReplacer13);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider16 = null;
        com.thoughtworks.xstream.XStream xStream17 = new com.thoughtworks.xstream.XStream(reflectionProvider16);
        org.jdom.Element element18 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer19 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader20 = new com.thoughtworks.xstream.io.xml.JDomReader(element18, xmlFriendlyReplacer19);
        java.lang.Object obj21 = jDomReader20.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup22 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper23 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper24 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper23);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper25 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper24);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller26 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider16, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader20, converterLookup22, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper25);
        java.lang.Runnable runnable27 = null;
        treeUnmarshaller26.addCompletionCallback(runnable27, 0);
        java.lang.Object obj30 = treeUnmarshaller26.currentObject();
        nu.xom.Element element31 = null;
        java.io.Writer writer32 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer35 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter36 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer32, xmlFriendlyReplacer35);
        com.thoughtworks.xstream.io.xml.XomReader xomReader37 = new com.thoughtworks.xstream.io.xml.XomReader(element31, xmlFriendlyReplacer35);
        java.lang.Object obj38 = null;
        treeUnmarshaller26.put((java.lang.Object) xmlFriendlyReplacer35, obj38);
        try {
            java.lang.Object obj40 = throwableConverter8.unmarshal((com.thoughtworks.xstream.io.HierarchicalStreamReader) xomReader15, (com.thoughtworks.xstream.converters.UnmarshallingContext) treeUnmarshaller26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.thoughtworks.xstream.io.xml.XppDriver xppDriver0 = new com.thoughtworks.xstream.io.xml.XppDriver();
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback1 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream2 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback1);
        java.io.ObjectOutputStream.PutField putField3 = customObjectOutputStream2.putFields();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter4 = xppDriver0.createWriter((java.io.OutputStream) customObjectOutputStream2);
        try {
            customObjectOutputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(putField3);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter4);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.dom4j.Element element0 = null;
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader1 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element0);
        try {
            dom4JReader1.moveUp();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter4 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer0, xmlFriendlyReplacer3);
        com.thoughtworks.xstream.io.xml.XppDomDriver xppDomDriver5 = new com.thoughtworks.xstream.io.xml.XppDomDriver(xmlFriendlyReplacer3);
        java.io.Writer writer6 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer7 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter8 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer6, xmlFriendlyReplacer7);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup9 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper10 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper11 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper10);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper12 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider13 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter14 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11, reflectionProvider13);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter15 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller16 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter8, converterLookup9, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback17 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream18 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller16, streamCallback17);
        try {
            com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader19 = xppDomDriver5.createReader((java.io.InputStream) customObjectInputStream18);
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
        }
        org.junit.Assert.assertNotNull(customObjectInputStream18);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper1 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper0);
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper3 = new com.thoughtworks.xstream.mapper.CGLIBMapper((com.thoughtworks.xstream.mapper.Mapper) classMapper0, "hi!");
        java.lang.Class class4 = null;
        java.lang.Class class5 = null;
        try {
            java.lang.String str7 = cGLIBMapper3.getFieldNameForItemTypeAndName(class4, class5, "class");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper2 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.mapper.AttributeAliasingMapper attributeAliasingMapper3 = new com.thoughtworks.xstream.mapper.AttributeAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper2);
        try {
            java.lang.String str5 = attributeAliasingMapper3.attributeForAlias("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.thoughtworks.xstream.io.xml.DomDriver domDriver0 = new com.thoughtworks.xstream.io.xml.DomDriver();
        java.io.Writer writer1 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer2 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter3 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer1, xmlFriendlyReplacer2);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup4 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper5 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper6 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper5);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper7 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper6);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider8 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter9 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper6, reflectionProvider8);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter10 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper6);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller11 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter3, converterLookup4, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper6);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback12 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream13 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller11, streamCallback12);
        try {
            com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader14 = domDriver0.createReader((java.io.InputStream) customObjectInputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(customObjectInputStream13);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter4 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer0, xmlFriendlyReplacer3);
        com.thoughtworks.xstream.io.xml.XppDomDriver xppDomDriver5 = new com.thoughtworks.xstream.io.xml.XppDomDriver(xmlFriendlyReplacer3);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback6 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream7 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback6);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter8 = xppDomDriver5.createWriter((java.io.OutputStream) customObjectOutputStream7);
        com.thoughtworks.xstream.XStreamer xStreamer9 = new com.thoughtworks.xstream.XStreamer();
        try {
            customObjectOutputStream7.writeObject((java.lang.Object) xStreamer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter8);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.dom4j.Element element0 = null;
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader1 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element0);
        try {
            dom4JReader1.moveDown();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer2 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XomDriver xomDriver3 = new com.thoughtworks.xstream.io.xml.XomDriver(xmlFriendlyReplacer2);
        java.io.Writer writer4 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter5 = xomDriver3.createWriter(writer4);
        java.io.Reader reader6 = null;
        try {
            com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader7 = xomDriver3.createReader(reader6);
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter5);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.thoughtworks.xstream.converters.extended.ISO8601SqlTimestampConverter iSO8601SqlTimestampConverter0 = new com.thoughtworks.xstream.converters.extended.ISO8601SqlTimestampConverter();
        java.lang.Class class1 = null;
        try {
            boolean b2 = iSO8601SqlTimestampConverter0.canConvert(class1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.thoughtworks.xstream.converters.basic.FloatConverter floatConverter0 = new com.thoughtworks.xstream.converters.basic.FloatConverter();
        try {
            java.lang.Object obj2 = floatConverter0.fromString("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.thoughtworks.xstream.converters.extended.CharsetConverter charsetConverter0 = new com.thoughtworks.xstream.converters.extended.CharsetConverter();
        try {
            java.lang.Object obj2 = charsetConverter0.fromString("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.thoughtworks.xstream.XStream xStream0 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter1 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream0.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter1);
        java.lang.Class<?> cls3 = null;
        java.lang.Class[] class_array5 = new java.lang.Class[1];
        @SuppressWarnings("unchecked") java.lang.Class<?>[] cls_array6 = (java.lang.Class<?>[]) class_array5;
        cls_array6[0] = cls3;
        com.thoughtworks.xstream.annotations.Annotations.configureAliases(xStream0, cls_array6);
        java.lang.Class class10 = null;
        java.lang.Class class13 = null;
        try {
            xStream0.addImplicitCollection(class10, "defined-in", "hi!", class13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(class_array5);
        org.junit.Assert.assertNotNull(cls_array6);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.thoughtworks.xstream.mapper.DynamicProxyMapper.DynamicProxy dynamicProxy0 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper.DynamicProxy();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream12 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller10, streamCallback11);
        byte[] byte_array16 = new byte[] { (byte) 0, (byte) 10, (byte) 10 };
        try {
            customObjectInputStream12.readFully(byte_array16, (int) (byte) -1, (int) (byte) 112);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(customObjectInputStream12);
        org.junit.Assert.assertNotNull(byte_array16);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.thoughtworks.xstream.mapper.Mapper mapper0 = null;
        com.thoughtworks.xstream.converters.reflection.ExternalizableConverter externalizableConverter1 = new com.thoughtworks.xstream.converters.reflection.ExternalizableConverter(mapper0);
        org.jdom.Element element2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader4 = new com.thoughtworks.xstream.io.xml.JDomReader(element2, xmlFriendlyReplacer3);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider5 = null;
        com.thoughtworks.xstream.XStream xStream6 = new com.thoughtworks.xstream.XStream(reflectionProvider5);
        org.jdom.Element element7 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer8 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader9 = new com.thoughtworks.xstream.io.xml.JDomReader(element7, xmlFriendlyReplacer8);
        java.lang.Object obj10 = jDomReader9.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup11 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper12 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper13 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper12);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper14 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper13);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller15 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider5, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader9, converterLookup11, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper14);
        java.lang.Runnable runnable16 = null;
        treeUnmarshaller15.addCompletionCallback(runnable16, 0);
        java.lang.Object obj19 = treeUnmarshaller15.currentObject();
        try {
            java.lang.Object obj20 = externalizableConverter1.unmarshal((com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader4, (com.thoughtworks.xstream.converters.UnmarshallingContext) treeUnmarshaller15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.io.InputStream inputStream1 = java.lang.ClassLoader.getSystemResourceAsStream("http://com.thoughtworks.xstream/XStreamSource/feature");
        org.junit.Assert.assertNull(inputStream1);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        java.lang.ClassLoader classLoader2 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper3 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader2);
        java.lang.String str4 = defaultMapper3.attributeForEnumType();
        java.io.Writer writer5 = null;
        try {
            xStream1.toXML((java.lang.Object) defaultMapper3, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "enum-type" + "'", str4.equals("enum-type"));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream12 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller10, streamCallback11);
        try {
            double d13 = customObjectInputStream12.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(customObjectInputStream12);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider3 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter4 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1, reflectionProvider3);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter5 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        java.lang.Class class6 = null;
        try {
            boolean b7 = arrayConverter5.canConvert(class6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        org.jdom.Element element2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader4 = new com.thoughtworks.xstream.io.xml.JDomReader(element2, xmlFriendlyReplacer3);
        java.lang.Object obj5 = jDomReader4.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup6 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper7 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper8 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper7);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper9 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper8);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller10 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider0, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader4, converterLookup6, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9);
        java.lang.Object obj11 = treeUnmarshaller10.currentObject();
        java.lang.Class class13 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper14 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper15 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper14);
        com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider pureJavaReflectionProvider16 = new com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider();
        com.thoughtworks.xstream.converters.reflection.ReflectionConverter reflectionConverter17 = new com.thoughtworks.xstream.converters.reflection.ReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) classMapper14, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider16);
        try {
            java.lang.Object obj18 = treeUnmarshaller10.convertAnother((java.lang.Object) (short) -1, class13, (com.thoughtworks.xstream.converters.Converter) reflectionConverter17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.thoughtworks.xstream.converters.extended.ISO8601SqlTimestampConverter iSO8601SqlTimestampConverter0 = new com.thoughtworks.xstream.converters.extended.ISO8601SqlTimestampConverter();
        java.lang.Class class1 = null;
        try {
            boolean b2 = iSO8601SqlTimestampConverter0.canConvert(class1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        byte byte0 = java.io.ObjectStreamConstants.TC_REFERENCE;
        org.junit.Assert.assertTrue(byte0 == (byte) 113);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper2 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.mapper.EnumMapper enumMapper3 = new com.thoughtworks.xstream.mapper.EnumMapper((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper2);
        java.lang.Class class4 = null;
        try {
            java.lang.String str5 = enumMapper3.serializedClass(class4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        nu.xom.Element element0 = null;
        java.io.Writer writer1 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer4 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter5 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer1, xmlFriendlyReplacer4);
        com.thoughtworks.xstream.io.xml.XomReader xomReader6 = new com.thoughtworks.xstream.io.xml.XomReader(element0, xmlFriendlyReplacer4);
        try {
            java.lang.String str8 = xomReader6.getAttribute("class");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream12 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback11);
        java.io.ObjectOutputStream.PutField putField13 = customObjectOutputStream12.putFields();
        java.io.Writer writer14 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer15 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter16 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer14, xmlFriendlyReplacer15);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup17 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper18 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper19 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper18);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper20 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider21 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter22 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19, reflectionProvider21);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter23 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller24 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter16, converterLookup17, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        referenceByIdMarshaller10.put((java.lang.Object) customObjectOutputStream12, (java.lang.Object) referenceByIdMarshaller24);
        java.io.Writer writer26 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer27 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter28 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer26, xmlFriendlyReplacer27);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup29 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper30 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper31 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper30);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper32 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper31);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider33 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter34 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper31, reflectionProvider33);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter35 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper31);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller36 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter28, converterLookup29, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper31);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup37 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper38 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller39 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter28, converterLookup37, classMapper38);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup40 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper41 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper42 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper41);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper43 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper42);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider44 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter45 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper42, reflectionProvider44);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter46 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper42);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller.IDGenerator iDGenerator47 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller48 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter28, converterLookup40, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper42, iDGenerator47);
        java.lang.Object obj49 = referenceByIdMarshaller24.get((java.lang.Object) xmlFriendlyMapper42);
        java.lang.Class class50 = null;
        try {
            java.lang.String str51 = xmlFriendlyMapper42.serializedClass(class50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(putField13);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter jsonHierarchicalStreamWriter1 = new com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter(writer0);
        try {
            jsonHierarchicalStreamWriter1.startNode("enum-type");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper1 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader0);
        java.lang.Class class2 = null;
        boolean b4 = defaultMapper1.shouldSerializeMember(class2, "");
        java.lang.Class class5 = null;
        boolean b7 = defaultMapper1.shouldSerializeMember(class5, "enum-type");
        try {
            java.lang.Class class9 = defaultMapper1.realClass("dynamic-proxy");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.mapper.CannotResolveClassException");
        } catch (com.thoughtworks.xstream.mapper.CannotResolveClassException e) {
        }
        org.junit.Assert.assertNotNull(classLoader0);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        java.lang.String str4 = xmlFriendlyMapper1.mapNameToXML("hi!");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider5 = null;
        com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter cGLIBEnhancedConverter6 = new com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1, reflectionProvider5);
        java.lang.Class class7 = null;
        try {
            boolean b8 = cGLIBEnhancedConverter6.canConvert(class7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap0 = new com.thoughtworks.xstream.io.xml.QNameMap();
        javax.xml.namespace.QName qName1 = null;
        try {
            java.lang.String str2 = qNameMap0.getJavaClassName(qName1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.thoughtworks.xstream.converters.javabean.BeanProvider beanProvider0 = new com.thoughtworks.xstream.converters.javabean.BeanProvider();
        com.thoughtworks.xstream.core.util.OrderRetainingMap orderRetainingMap1 = new com.thoughtworks.xstream.core.util.OrderRetainingMap();
        com.thoughtworks.xstream.alias.ClassMapper classMapper2 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper3 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper2);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper4 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper3);
        java.lang.String str6 = xmlFriendlyMapper3.mapNameToXML("hi!");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter cGLIBEnhancedConverter8 = new com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper3, reflectionProvider7);
        java.io.Writer writer9 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer12 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter13 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer9, xmlFriendlyReplacer12);
        java.lang.Object obj14 = orderRetainingMap1.put((java.lang.Object) xmlFriendlyMapper3, (java.lang.Object) prettyPrintWriter13);
        try {
            java.lang.Class class16 = beanProvider0.getPropertyType((java.lang.Object) prettyPrintWriter13, "hi!");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.converters.reflection.ObjectAccessException");
        } catch (com.thoughtworks.xstream.converters.reflection.ObjectAccessException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup11 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper12 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller13 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup11, classMapper12);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter14 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter15 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter16 = saxWriter15.underlyingWriter();
        referenceByIdMarshaller13.put((java.lang.Object) saxWriter14, (java.lang.Object) saxWriter15);
        org.xml.sax.InputSource inputSource18 = null;
        try {
            saxWriter15.parse(inputSource18);
            org.junit.Assert.fail("Expected exception of type org.xml.sax.SAXException");
        } catch (org.xml.sax.SAXException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter16);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap0 = new com.thoughtworks.xstream.io.xml.QNameMap();
        javax.xml.stream.XMLStreamWriter xMLStreamWriter1 = null;
        try {
            com.thoughtworks.xstream.io.xml.StaxWriter staxWriter2 = new com.thoughtworks.xstream.io.xml.StaxWriter(qNameMap0, xMLStreamWriter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.thoughtworks.xstream.converters.basic.ThreadSafeSimpleDateFormat threadSafeSimpleDateFormat3 = new com.thoughtworks.xstream.converters.basic.ThreadSafeSimpleDateFormat("", (int) (byte) 112, (int) (byte) 123);
        try {
            java.util.Date date5 = threadSafeSimpleDateFormat3.parse("enum-type");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException");
        } catch (java.text.ParseException e) {
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.thoughtworks.xstream.mapper.Mapper mapper0 = null;
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper2 = new com.thoughtworks.xstream.mapper.CGLIBMapper(mapper0, "hi!");
        java.lang.Class class3 = null;
        try {
            java.lang.String str4 = cGLIBMapper2.serializedClass(class3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.thoughtworks.xstream.io.ExtendedHierarchicalStreamWriterHelper extendedHierarchicalStreamWriterHelper0 = new com.thoughtworks.xstream.io.ExtendedHierarchicalStreamWriterHelper();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        org.jdom.Element element2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader4 = new com.thoughtworks.xstream.io.xml.JDomReader(element2, xmlFriendlyReplacer3);
        java.lang.Object obj5 = jDomReader4.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup6 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper7 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper8 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper7);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper9 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper8);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller10 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider0, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader4, converterLookup6, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream12 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller10, streamCallback11);
        try {
            customObjectInputStream12.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(customObjectInputStream12);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter4 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer0, xmlFriendlyReplacer3);
        com.thoughtworks.xstream.io.xml.XppDomDriver xppDomDriver5 = new com.thoughtworks.xstream.io.xml.XppDomDriver(xmlFriendlyReplacer3);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider6 = null;
        com.thoughtworks.xstream.XStream xStream7 = new com.thoughtworks.xstream.XStream(reflectionProvider6);
        org.jdom.Element element8 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer9 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader10 = new com.thoughtworks.xstream.io.xml.JDomReader(element8, xmlFriendlyReplacer9);
        java.lang.Object obj11 = jDomReader10.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup12 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper13 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper14 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper13);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper15 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper14);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller16 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider6, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader10, converterLookup12, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper15);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback17 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream18 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller16, streamCallback17);
        try {
            com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader19 = xppDomDriver5.createReader((java.io.InputStream) customObjectInputStream18);
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(customObjectInputStream18);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.thoughtworks.xstream.converters.extended.CurrencyConverter currencyConverter0 = new com.thoughtworks.xstream.converters.extended.CurrencyConverter();
        java.lang.Class class1 = null;
        try {
            boolean b2 = currencyConverter0.canConvert(class1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream12 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller10, streamCallback11);
        try {
            java.io.ObjectInputStream.GetField getField13 = customObjectInputStream12.readFields();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(customObjectInputStream12);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        byte byte0 = java.io.ObjectStreamConstants.TC_LONGSTRING;
        org.junit.Assert.assertTrue(byte0 == (byte) 124);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter4 = attributeMapper2.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.converters.collections.TreeMapConverter treeMapConverter5 = new com.thoughtworks.xstream.converters.collections.TreeMapConverter((com.thoughtworks.xstream.mapper.Mapper) attributeMapper2);
        org.jdom.Element element6 = null;
        nu.xom.Element element7 = null;
        java.io.Writer writer8 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer11 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter12 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer8, xmlFriendlyReplacer11);
        com.thoughtworks.xstream.io.xml.XomReader xomReader13 = new com.thoughtworks.xstream.io.xml.XomReader(element7, xmlFriendlyReplacer11);
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader14 = new com.thoughtworks.xstream.io.xml.JDomReader(element6, xmlFriendlyReplacer11);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider15 = null;
        com.thoughtworks.xstream.XStream xStream16 = new com.thoughtworks.xstream.XStream(reflectionProvider15);
        org.jdom.Element element17 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer18 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader19 = new com.thoughtworks.xstream.io.xml.JDomReader(element17, xmlFriendlyReplacer18);
        java.lang.Object obj20 = jDomReader19.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup21 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper22 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper23 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper22);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper24 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper23);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller25 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider15, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader19, converterLookup21, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper24);
        java.lang.Runnable runnable26 = null;
        treeUnmarshaller25.addCompletionCallback(runnable26, 0);
        java.lang.Object obj29 = treeUnmarshaller25.currentObject();
        try {
            java.lang.Object obj30 = treeMapConverter5.unmarshal((com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader14, (com.thoughtworks.xstream.converters.UnmarshallingContext) treeUnmarshaller25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(singleValueConverter4);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream12 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller10, streamCallback11);
        try {
            java.lang.Object obj13 = customObjectInputStream12.readObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(customObjectInputStream12);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider3 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter4 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1, reflectionProvider3);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter5 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        java.lang.String str7 = xmlFriendlyMapper1.mapNameToXML("");
        com.thoughtworks.xstream.mapper.CachingMapper cachingMapper8 = new com.thoughtworks.xstream.mapper.CachingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider9 = null;
        com.thoughtworks.xstream.XStream xStream10 = new com.thoughtworks.xstream.XStream(reflectionProvider9);
        org.jdom.Element element11 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer12 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader13 = new com.thoughtworks.xstream.io.xml.JDomReader(element11, xmlFriendlyReplacer12);
        java.lang.Object obj14 = jDomReader13.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup15 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper16 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper17 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper16);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper18 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper17);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller19 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider9, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader13, converterLookup15, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper18);
        java.io.Writer writer20 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer21 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter22 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer20, xmlFriendlyReplacer21);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup23 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper24 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper25 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper24);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper26 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper25);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider27 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter28 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper25, reflectionProvider27);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter29 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper25);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller30 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter22, converterLookup23, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper25);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup31 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper32 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller33 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter22, converterLookup31, classMapper32);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter34 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter35 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter36 = saxWriter35.underlyingWriter();
        referenceByIdMarshaller33.put((java.lang.Object) saxWriter34, (java.lang.Object) saxWriter35);
        com.thoughtworks.xstream.XStream xStream38 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter39 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream38.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter39);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup41 = xStream38.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper42 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper43 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper42);
        com.thoughtworks.xstream.mapper.ClassAliasingMapper classAliasingMapper44 = new com.thoughtworks.xstream.mapper.ClassAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper43);
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller46 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) saxWriter35, converterLookup41, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper43, (int) 'a');
        com.thoughtworks.xstream.alias.ClassMapper classMapper47 = null;
        com.thoughtworks.xstream.core.ReferenceByIdUnmarshaller referenceByIdUnmarshaller48 = new com.thoughtworks.xstream.core.ReferenceByIdUnmarshaller((java.lang.Object) cachingMapper8, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader13, converterLookup41, classMapper47);
        java.lang.Class class50 = null;
        com.thoughtworks.xstream.XStream xStream51 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter52 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream51.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter52);
        com.thoughtworks.xstream.MarshallingStrategy marshallingStrategy54 = null;
        xStream51.setMarshallingStrategy(marshallingStrategy54);
        com.thoughtworks.xstream.converters.collections.BitSetConverter bitSetConverter56 = new com.thoughtworks.xstream.converters.collections.BitSetConverter();
        xStream51.registerConverter((com.thoughtworks.xstream.converters.Converter) bitSetConverter56, (int) (byte) 126);
        com.thoughtworks.xstream.converters.extended.ThrowableConverter throwableConverter59 = new com.thoughtworks.xstream.converters.extended.ThrowableConverter((com.thoughtworks.xstream.converters.Converter) bitSetConverter56);
        try {
            java.lang.Object obj60 = referenceByIdUnmarshaller48.convertAnother((java.lang.Object) (byte) 1, class50, (com.thoughtworks.xstream.converters.Converter) throwableConverter59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter36);
        org.junit.Assert.assertNotNull(converterLookup41);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback0 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream1 = new com.thoughtworks.xstream.core.util.CustomObjectInputStream(streamCallback0);
        try {
            int i2 = customObjectInputStream1.readInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        byte byte0 = java.io.ObjectStreamConstants.TC_STRING;
        org.junit.Assert.assertTrue(byte0 == (byte) 116);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamDriver hierarchicalStreamDriver1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream(reflectionProvider0, hierarchicalStreamDriver1);
        com.thoughtworks.xstream.mapper.Mapper mapper3 = xStream2.getMapper();
        java.lang.Class class4 = null;
        java.lang.Class class7 = null;
        try {
            xStream2.addImplicitCollection(class4, "http://com.thoughtworks.xstream/XStreamSource/feature", "dynamic-proxy", class7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(mapper3);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        org.jdom.Element element2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader4 = new com.thoughtworks.xstream.io.xml.JDomReader(element2, xmlFriendlyReplacer3);
        java.lang.Object obj5 = jDomReader4.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup6 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper7 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper8 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper7);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper9 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper8);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller10 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider0, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader4, converterLookup6, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream12 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller10, streamCallback11);
        try {
            long long14 = customObjectInputStream12.skip((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(customObjectInputStream12);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider3 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter4 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1, reflectionProvider3);
        org.jdom.Element element5 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer6 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader7 = new com.thoughtworks.xstream.io.xml.JDomReader(element5, xmlFriendlyReplacer6);
        java.lang.Object obj8 = jDomReader7.peekUnderlyingNode();
        com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader9 = jDomReader7.underlyingReader();
        com.thoughtworks.xstream.alias.ClassMapper classMapper10 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper11 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper10);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper12 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11);
        com.thoughtworks.xstream.mapper.EnumMapper enumMapper13 = new com.thoughtworks.xstream.mapper.EnumMapper((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper12);
        org.jdom.Element element14 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer15 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader16 = new com.thoughtworks.xstream.io.xml.JDomReader(element14, xmlFriendlyReplacer15);
        java.lang.Object obj17 = jDomReader16.peekUnderlyingNode();
        com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader18 = jDomReader16.underlyingReader();
        com.thoughtworks.xstream.alias.ClassMapper classMapper19 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper20 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper19);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper21 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper20);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider22 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter23 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper20, reflectionProvider22);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter24 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper20);
        com.thoughtworks.xstream.alias.ClassMapper classMapper25 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup26 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper25);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper27 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper20, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup26);
        com.thoughtworks.xstream.alias.ClassMapper classMapper28 = null;
        com.thoughtworks.xstream.mapper.DefaultImplementationsMapper defaultImplementationsMapper29 = new com.thoughtworks.xstream.mapper.DefaultImplementationsMapper(classMapper28);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller30 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) dynamicProxyMapper12, hierarchicalStreamReader18, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup26, (com.thoughtworks.xstream.mapper.Mapper) defaultImplementationsMapper29);
        try {
            java.lang.Object obj31 = serializableConverter4.unmarshal((com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader7, (com.thoughtworks.xstream.converters.UnmarshallingContext) treeUnmarshaller30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(hierarchicalStreamReader9);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(hierarchicalStreamReader18);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamDriver hierarchicalStreamDriver1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream(reflectionProvider0, hierarchicalStreamDriver1);
        com.thoughtworks.xstream.mapper.Mapper mapper3 = xStream2.getMapper();
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider4 = null;
        com.thoughtworks.xstream.XStream xStream5 = new com.thoughtworks.xstream.XStream(reflectionProvider4);
        org.jdom.Element element6 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer7 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader8 = new com.thoughtworks.xstream.io.xml.JDomReader(element6, xmlFriendlyReplacer7);
        java.lang.Object obj9 = jDomReader8.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup10 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper11 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper12 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper11);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper13 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper12);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller14 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider4, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader8, converterLookup10, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper13);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback15 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream16 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller14, streamCallback15);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter17 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter18 = saxWriter17.underlyingWriter();
        com.thoughtworks.xstream.io.StatefulWriter statefulWriter19 = new com.thoughtworks.xstream.io.StatefulWriter(hierarchicalStreamWriter18);
        try {
            java.lang.Object obj20 = xStream2.fromXML((java.io.InputStream) customObjectInputStream16, (java.lang.Object) hierarchicalStreamWriter18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(mapper3);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(customObjectInputStream16);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter18);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.thoughtworks.xstream.converters.extended.StackTraceElementFactory stackTraceElementFactory0 = new com.thoughtworks.xstream.converters.extended.StackTraceElementFactory();
        java.lang.StackTraceElement stackTraceElement3 = stackTraceElementFactory0.nativeMethodElement("", "hi!");
        java.lang.StackTraceElement stackTraceElement6 = stackTraceElementFactory0.unknownSourceElement("hi!", "class");
        org.junit.Assert.assertNotNull(stackTraceElement3);
        org.junit.Assert.assertNotNull(stackTraceElement6);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper2 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.mapper.EnumMapper enumMapper3 = new com.thoughtworks.xstream.mapper.EnumMapper((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper2);
        try {
            java.lang.Class class5 = dynamicProxyMapper2.realClass("enum-type");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.thoughtworks.xstream.converters.collections.PropertiesConverter propertiesConverter0 = new com.thoughtworks.xstream.converters.collections.PropertiesConverter();
        org.jdom.Element element1 = null;
        nu.xom.Element element2 = null;
        java.io.Writer writer3 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer6 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter7 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer3, xmlFriendlyReplacer6);
        com.thoughtworks.xstream.io.xml.XomReader xomReader8 = new com.thoughtworks.xstream.io.xml.XomReader(element2, xmlFriendlyReplacer6);
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader9 = new com.thoughtworks.xstream.io.xml.JDomReader(element1, xmlFriendlyReplacer6);
        com.thoughtworks.xstream.alias.ClassMapper classMapper10 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper11 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper10);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper12 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider13 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter14 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11, reflectionProvider13);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter15 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11);
        java.lang.String str17 = xmlFriendlyMapper11.mapNameToXML("");
        com.thoughtworks.xstream.mapper.CachingMapper cachingMapper18 = new com.thoughtworks.xstream.mapper.CachingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider19 = null;
        com.thoughtworks.xstream.XStream xStream20 = new com.thoughtworks.xstream.XStream(reflectionProvider19);
        org.jdom.Element element21 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer22 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader23 = new com.thoughtworks.xstream.io.xml.JDomReader(element21, xmlFriendlyReplacer22);
        java.lang.Object obj24 = jDomReader23.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup25 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper26 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper27 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper26);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper28 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper27);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller29 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider19, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader23, converterLookup25, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper28);
        java.io.Writer writer30 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer31 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter32 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer30, xmlFriendlyReplacer31);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup33 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper34 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper35 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper34);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper36 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper35);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider37 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter38 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper35, reflectionProvider37);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter39 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper35);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller40 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter32, converterLookup33, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper35);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup41 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper42 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller43 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter32, converterLookup41, classMapper42);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter44 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter45 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter46 = saxWriter45.underlyingWriter();
        referenceByIdMarshaller43.put((java.lang.Object) saxWriter44, (java.lang.Object) saxWriter45);
        com.thoughtworks.xstream.XStream xStream48 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter49 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream48.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter49);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup51 = xStream48.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper52 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper53 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper52);
        com.thoughtworks.xstream.mapper.ClassAliasingMapper classAliasingMapper54 = new com.thoughtworks.xstream.mapper.ClassAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper53);
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller56 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) saxWriter45, converterLookup51, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper53, (int) 'a');
        com.thoughtworks.xstream.alias.ClassMapper classMapper57 = null;
        com.thoughtworks.xstream.core.ReferenceByIdUnmarshaller referenceByIdUnmarshaller58 = new com.thoughtworks.xstream.core.ReferenceByIdUnmarshaller((java.lang.Object) cachingMapper18, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader23, converterLookup51, classMapper57);
        try {
            java.lang.Object obj59 = propertiesConverter0.unmarshal((com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader9, (com.thoughtworks.xstream.converters.UnmarshallingContext) referenceByIdUnmarshaller58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter46);
        org.junit.Assert.assertNotNull(converterLookup51);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.thoughtworks.xstream.XStreamer xStreamer0 = new com.thoughtworks.xstream.XStreamer();
        com.thoughtworks.xstream.io.xml.DomDriver domDriver2 = new com.thoughtworks.xstream.io.xml.DomDriver("class");
        java.io.Reader reader3 = null;
        try {
            java.lang.Object obj4 = xStreamer0.fromXML((com.thoughtworks.xstream.io.HierarchicalStreamDriver) domDriver2, reader3);
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        nu.xom.Document document0 = null;
        try {
            com.thoughtworks.xstream.io.xml.XomReader xomReader1 = new com.thoughtworks.xstream.io.xml.XomReader(document0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.thoughtworks.xstream.persistence.StreamStrategy streamStrategy0 = null;
        com.thoughtworks.xstream.persistence.XmlSet xmlSet1 = new com.thoughtworks.xstream.persistence.XmlSet(streamStrategy0);
        try {
            java.util.Iterator iterator2 = xmlSet1.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter4 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer3);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter5 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer3);
        com.thoughtworks.xstream.XStream xStream6 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter7 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream6.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter7);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup9 = xStream6.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper10 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper11 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper10);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper12 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter14 = attributeMapper12.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller15 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter5, converterLookup9, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper12);
        try {
            compactWriter5.endNode();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(converterLookup9);
        org.junit.Assert.assertNull(singleValueConverter14);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        nu.xom.Element element0 = null;
        java.io.Writer writer1 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer4 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter5 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer1, xmlFriendlyReplacer4);
        com.thoughtworks.xstream.io.xml.XomReader xomReader6 = new com.thoughtworks.xstream.io.xml.XomReader(element0, xmlFriendlyReplacer4);
        try {
            java.lang.String str8 = xomReader6.getAttribute("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.io.Writer writer0 = null;
        char[] char_array5 = new char[] { 'a', '4', '4', ' ' };
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter6 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer0, char_array5);
        com.thoughtworks.xstream.io.path.PathTracker pathTracker7 = null;
        com.thoughtworks.xstream.io.path.PathTrackingWriter pathTrackingWriter8 = new com.thoughtworks.xstream.io.path.PathTrackingWriter((com.thoughtworks.xstream.io.HierarchicalStreamWriter) prettyPrintWriter6, pathTracker7);
        try {
            pathTrackingWriter8.startNode("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(char_array5);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.thoughtworks.xstream.mapper.CannotResolveClassException cannotResolveClassException1 = new com.thoughtworks.xstream.mapper.CannotResolveClassException("dynamic-proxy");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.thoughtworks.xstream.converters.basic.ByteConverter byteConverter0 = new com.thoughtworks.xstream.converters.basic.ByteConverter();
        try {
            java.lang.Object obj2 = byteConverter0.fromString("class");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer0 = null;
        com.thoughtworks.xstream.io.xml.JDomDriver jDomDriver1 = new com.thoughtworks.xstream.io.xml.JDomDriver(xmlFriendlyReplacer0);
        java.io.Reader reader2 = null;
        try {
            com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader3 = jDomDriver1.createReader(reader2);
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter jsonHierarchicalStreamWriter2 = new com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter(writer0, "class");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        java.lang.String str4 = xmlFriendlyMapper1.mapNameToXML("hi!");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider5 = null;
        com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter cGLIBEnhancedConverter6 = new com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1, reflectionProvider5);
        java.lang.Class class7 = null;
        try {
            java.lang.String str9 = xmlFriendlyMapper1.realMember(class7, "defined-in");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.thoughtworks.xstream.converters.basic.BigIntegerConverter bigIntegerConverter0 = new com.thoughtworks.xstream.converters.basic.BigIntegerConverter();
        try {
            java.lang.Object obj2 = bigIntegerConverter0.fromString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.jdom.Element element0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader2 = new com.thoughtworks.xstream.io.xml.JDomReader(element0, xmlFriendlyReplacer1);
        java.lang.Object obj3 = jDomReader2.peekUnderlyingNode();
        com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader4 = jDomReader2.underlyingReader();
        try {
            java.util.Iterator iterator5 = jDomReader2.getAttributeNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(hierarchicalStreamReader4);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider3 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter4 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1, reflectionProvider3);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter5 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.alias.ClassMapper classMapper6 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup7 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper6);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper8 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup7);
        try {
            java.lang.String str9 = xmlFriendlyMapper1.attributeForReadResolveField();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        org.jdom.Element element2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader4 = new com.thoughtworks.xstream.io.xml.JDomReader(element2, xmlFriendlyReplacer3);
        java.lang.Object obj5 = jDomReader4.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup6 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper7 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper8 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper7);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper9 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper8);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller10 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider0, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader4, converterLookup6, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream12 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller10, streamCallback11);
        byte[] byte_array18 = new byte[] { (byte) 123, (byte) -1, (byte) 100, (byte) 1, (byte) 0 };
        try {
            int i19 = customObjectInputStream12.read(byte_array18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(customObjectInputStream12);
        org.junit.Assert.assertNotNull(byte_array18);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        byte byte0 = java.io.ObjectStreamConstants.TC_RESET;
        org.junit.Assert.assertTrue(byte0 == (byte) 121);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        byte byte0 = java.io.ObjectStreamConstants.TC_CLASS;
        org.junit.Assert.assertTrue(byte0 == (byte) 118);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter jsonHierarchicalStreamWriter2 = new com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter(writer0, "");
        java.lang.Class class4 = null;
        try {
            jsonHierarchicalStreamWriter2.startNode("", class4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.thoughtworks.xstream.converters.javabean.PropertyDictionary propertyDictionary0 = new com.thoughtworks.xstream.converters.javabean.PropertyDictionary();
        java.lang.Class class1 = null;
        try {
            java.util.Iterator iterator2 = propertyDictionary0.serializablePropertiesFor(class1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream12 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback11);
        java.io.ObjectOutputStream.PutField putField13 = customObjectOutputStream12.putFields();
        java.io.Writer writer14 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer15 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter16 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer14, xmlFriendlyReplacer15);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup17 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper18 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper19 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper18);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper20 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider21 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter22 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19, reflectionProvider21);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter23 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller24 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter16, converterLookup17, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        referenceByIdMarshaller10.put((java.lang.Object) customObjectOutputStream12, (java.lang.Object) referenceByIdMarshaller24);
        java.io.Writer writer26 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer27 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter28 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer26, xmlFriendlyReplacer27);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup29 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper30 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper31 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper30);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper32 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper31);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider33 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter34 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper31, reflectionProvider33);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter35 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper31);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller36 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter28, converterLookup29, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper31);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup37 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper38 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller39 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter28, converterLookup37, classMapper38);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup40 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper41 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper42 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper41);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper43 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper42);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider44 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter45 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper42, reflectionProvider44);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter46 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper42);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller.IDGenerator iDGenerator47 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller48 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter28, converterLookup40, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper42, iDGenerator47);
        java.lang.Object obj49 = referenceByIdMarshaller24.get((java.lang.Object) xmlFriendlyMapper42);
        java.lang.Class class51 = null;
        try {
            com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter52 = xmlFriendlyMapper42.getConverterFromItemType("class", class51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(putField13);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.FieldAliasingMapper fieldAliasingMapper1 = new com.thoughtworks.xstream.mapper.FieldAliasingMapper(classMapper0);
        java.lang.Class class2 = null;
        try {
            java.lang.String str4 = fieldAliasingMapper1.realMember(class2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper2 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        java.lang.String str4 = xmlFriendlyMapper1.mapNameToXML("");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        nu.xom.Element element0 = null;
        com.thoughtworks.xstream.io.xml.XomReader xomReader1 = new com.thoughtworks.xstream.io.xml.XomReader(element0);
        try {
            java.lang.String str3 = xomReader1.getAttributeName((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback0 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream1 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback0);
        java.io.ObjectOutputStream.PutField putField2 = customObjectOutputStream1.putFields();
        try {
            customObjectOutputStream1.writeChar((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(putField2);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback0 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream1 = new com.thoughtworks.xstream.core.util.CustomObjectInputStream(streamCallback0);
        try {
            long long2 = customObjectInputStream1.readLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        org.jdom.Element element2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader4 = new com.thoughtworks.xstream.io.xml.JDomReader(element2, xmlFriendlyReplacer3);
        java.lang.Object obj5 = jDomReader4.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup6 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper7 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper8 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper7);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper9 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper8);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller10 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider0, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader4, converterLookup6, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream12 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller10, streamCallback11);
        try {
            java.lang.Object obj13 = customObjectInputStream12.readObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(customObjectInputStream12);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        nu.xom.Element element0 = null;
        com.thoughtworks.xstream.io.path.Path path2 = new com.thoughtworks.xstream.io.path.Path("");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider3 = null;
        com.thoughtworks.xstream.XStream xStream4 = new com.thoughtworks.xstream.XStream(reflectionProvider3);
        org.jdom.Element element5 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer6 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader7 = new com.thoughtworks.xstream.io.xml.JDomReader(element5, xmlFriendlyReplacer6);
        java.lang.Object obj8 = jDomReader7.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup9 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper10 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper11 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper10);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper12 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller13 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider3, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader7, converterLookup9, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper12);
        java.lang.Runnable runnable14 = null;
        treeUnmarshaller13.addCompletionCallback(runnable14, 0);
        java.lang.Object obj17 = treeUnmarshaller13.currentObject();
        nu.xom.Element element18 = null;
        java.io.Writer writer19 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer22 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter23 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer19, xmlFriendlyReplacer22);
        com.thoughtworks.xstream.io.xml.XomReader xomReader24 = new com.thoughtworks.xstream.io.xml.XomReader(element18, xmlFriendlyReplacer22);
        java.lang.Object obj25 = null;
        treeUnmarshaller13.put((java.lang.Object) xmlFriendlyReplacer22, obj25);
        boolean b27 = path2.equals((java.lang.Object) xmlFriendlyReplacer22);
        com.thoughtworks.xstream.io.xml.XomWriter xomWriter28 = new com.thoughtworks.xstream.io.xml.XomWriter(element0, xmlFriendlyReplacer22);
        try {
            xomWriter28.addAttribute("class", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.thoughtworks.xstream.XStream xStream0 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter1 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream0.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter1);
        com.thoughtworks.xstream.MarshallingStrategy marshallingStrategy3 = null;
        xStream0.setMarshallingStrategy(marshallingStrategy3);
        xStream0.aliasAttribute("http://com.thoughtworks.xstream/XStreamSource/feature", "class");
        java.lang.ClassLoader classLoader8 = xStream0.getClassLoader();
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer11 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter12 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer11);
        xppDomWriter12.startNode("hi!");
        try {
            java.io.ObjectOutputStream objectOutputStream15 = xStream0.createObjectOutputStream((com.thoughtworks.xstream.io.HierarchicalStreamWriter) xppDomWriter12);
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
        }
        org.junit.Assert.assertNotNull(classLoader8);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        org.jdom.Element element2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader4 = new com.thoughtworks.xstream.io.xml.JDomReader(element2, xmlFriendlyReplacer3);
        java.lang.Object obj5 = jDomReader4.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup6 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper7 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper8 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper7);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper9 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper8);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller10 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider0, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader4, converterLookup6, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream12 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller10, streamCallback11);
        try {
            byte byte13 = customObjectInputStream12.readByte();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(customObjectInputStream12);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.converters.extended.JavaClassConverter javaClassConverter1 = new com.thoughtworks.xstream.converters.extended.JavaClassConverter(classLoader0);
        try {
            java.lang.Object obj3 = javaClassConverter1.fromString("enum-type");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.converters.ConversionException");
        } catch (com.thoughtworks.xstream.converters.ConversionException e) {
        }
        org.junit.Assert.assertNotNull(classLoader0);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter0 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter1 = saxWriter0.underlyingWriter();
        com.thoughtworks.xstream.io.StatefulWriter statefulWriter2 = new com.thoughtworks.xstream.io.StatefulWriter(hierarchicalStreamWriter1);
        try {
            statefulWriter2.flush();
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter1);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer0 = null;
        com.thoughtworks.xstream.io.xml.JDomDriver jDomDriver1 = new com.thoughtworks.xstream.io.xml.JDomDriver(xmlFriendlyReplacer0);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider2 = null;
        com.thoughtworks.xstream.XStream xStream3 = new com.thoughtworks.xstream.XStream(reflectionProvider2);
        org.jdom.Element element4 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer5 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader6 = new com.thoughtworks.xstream.io.xml.JDomReader(element4, xmlFriendlyReplacer5);
        java.lang.Object obj7 = jDomReader6.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup8 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper9 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper10 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper9);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper11 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper10);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller12 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider2, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader6, converterLookup8, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper11);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback13 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream14 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller12, streamCallback13);
        try {
            com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader15 = jDomDriver1.createReader((java.io.InputStream) customObjectInputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(customObjectInputStream14);
    }
/*
    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.dom4j.io.XMLWriter xMLWriter0 = null;
        try {
            com.thoughtworks.xstream.io.xml.Dom4JWriter dom4JWriter1 = new com.thoughtworks.xstream.io.xml.Dom4JWriter(xMLWriter0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }*/

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.io.Writer writer0 = null;
        char[] char_array5 = new char[] { 'a', '4', '4', ' ' };
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter6 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer0, char_array5);
        com.thoughtworks.xstream.io.path.PathTracker pathTracker7 = null;
        com.thoughtworks.xstream.io.path.PathTrackingWriter pathTrackingWriter8 = new com.thoughtworks.xstream.io.path.PathTrackingWriter((com.thoughtworks.xstream.io.HierarchicalStreamWriter) prettyPrintWriter6, pathTracker7);
        try {
            pathTrackingWriter8.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(char_array5);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper2 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.mapper.EnumMapper enumMapper3 = new com.thoughtworks.xstream.mapper.EnumMapper((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper2);
        org.jdom.Element element4 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer5 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader6 = new com.thoughtworks.xstream.io.xml.JDomReader(element4, xmlFriendlyReplacer5);
        java.lang.Object obj7 = jDomReader6.peekUnderlyingNode();
        com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader8 = jDomReader6.underlyingReader();
        com.thoughtworks.xstream.alias.ClassMapper classMapper9 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper10 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper9);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper11 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper10);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider12 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter13 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper10, reflectionProvider12);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter14 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper10);
        com.thoughtworks.xstream.alias.ClassMapper classMapper15 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup16 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper15);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper17 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper10, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup16);
        com.thoughtworks.xstream.alias.ClassMapper classMapper18 = null;
        com.thoughtworks.xstream.mapper.DefaultImplementationsMapper defaultImplementationsMapper19 = new com.thoughtworks.xstream.mapper.DefaultImplementationsMapper(classMapper18);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller20 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) dynamicProxyMapper2, hierarchicalStreamReader8, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup16, (com.thoughtworks.xstream.mapper.Mapper) defaultImplementationsMapper19);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider21 = null;
        com.thoughtworks.xstream.XStream xStream22 = new com.thoughtworks.xstream.XStream(reflectionProvider21);
        org.jdom.Element element23 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer24 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader25 = new com.thoughtworks.xstream.io.xml.JDomReader(element23, xmlFriendlyReplacer24);
        java.lang.Object obj26 = jDomReader25.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup27 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper28 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper29 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper28);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper30 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper29);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller31 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider21, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader25, converterLookup27, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper30);
        java.lang.Runnable runnable32 = null;
        treeUnmarshaller31.addCompletionCallback(runnable32, 0);
        java.lang.Object obj35 = treeUnmarshaller31.currentObject();
        com.thoughtworks.xstream.converters.reflection.FieldDictionary fieldDictionary36 = new com.thoughtworks.xstream.converters.reflection.FieldDictionary();
        java.lang.Object obj37 = treeUnmarshaller31.get((java.lang.Object) fieldDictionary36);
        try {
            java.lang.Object obj38 = treeUnmarshaller20.start((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(hierarchicalStreamReader8);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.FieldAliasingMapper fieldAliasingMapper1 = new com.thoughtworks.xstream.mapper.FieldAliasingMapper(classMapper0);
        java.lang.Class class2 = null;
        try {
            boolean b4 = fieldAliasingMapper1.shouldSerializeMember(class2, "enum-type");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        org.jdom.Element element2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader4 = new com.thoughtworks.xstream.io.xml.JDomReader(element2, xmlFriendlyReplacer3);
        java.lang.Object obj5 = jDomReader4.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup6 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper7 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper8 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper7);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper9 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper8);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller10 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider0, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader4, converterLookup6, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9);
        try {
            jDomReader4.moveDown();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        byte byte0 = java.io.ObjectStreamConstants.SC_WRITE_METHOD;
        org.junit.Assert.assertTrue(byte0 == (byte) 1);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamDriver hierarchicalStreamDriver1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream(reflectionProvider0, hierarchicalStreamDriver1);
        java.io.Writer writer3 = null;
        try {
            java.io.ObjectOutputStream objectOutputStream4 = xStream2.createObjectOutputStream(writer3);
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamDriver hierarchicalStreamDriver1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream(reflectionProvider0, hierarchicalStreamDriver1);
        com.thoughtworks.xstream.mapper.Mapper mapper3 = xStream2.getMapper();
        java.io.Reader reader4 = null;
        try {
            java.io.ObjectInputStream objectInputStream5 = xStream2.createObjectInputStream(reader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(mapper3);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.OuterClassMapper outerClassMapper1 = new com.thoughtworks.xstream.mapper.OuterClassMapper(classMapper0);
        java.lang.Class class2 = null;
        java.lang.Class class3 = null;
        try {
            java.lang.String str5 = outerClassMapper1.getFieldNameForItemTypeAndName(class2, class3, "class");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter4 = attributeMapper2.getConverterFromAttribute("dynamic-proxy");
        java.lang.Class class5 = null;
        attributeMapper2.addAttributeFor(class5);
        com.thoughtworks.xstream.converters.collections.CollectionConverter collectionConverter7 = new com.thoughtworks.xstream.converters.collections.CollectionConverter((com.thoughtworks.xstream.mapper.Mapper) attributeMapper2);
        com.thoughtworks.xstream.converters.extended.SubjectConverter subjectConverter8 = new com.thoughtworks.xstream.converters.extended.SubjectConverter((com.thoughtworks.xstream.mapper.Mapper) attributeMapper2);
        try {
            java.lang.String str10 = attributeMapper2.aliasForAttribute("http://com.thoughtworks.xstream/XStreamSource/feature");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(singleValueConverter4);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        nu.xom.Element element0 = null;
        com.thoughtworks.xstream.io.path.Path path2 = new com.thoughtworks.xstream.io.path.Path("");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider3 = null;
        com.thoughtworks.xstream.XStream xStream4 = new com.thoughtworks.xstream.XStream(reflectionProvider3);
        org.jdom.Element element5 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer6 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader7 = new com.thoughtworks.xstream.io.xml.JDomReader(element5, xmlFriendlyReplacer6);
        java.lang.Object obj8 = jDomReader7.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup9 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper10 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper11 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper10);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper12 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller13 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider3, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader7, converterLookup9, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper12);
        java.lang.Runnable runnable14 = null;
        treeUnmarshaller13.addCompletionCallback(runnable14, 0);
        java.lang.Object obj17 = treeUnmarshaller13.currentObject();
        nu.xom.Element element18 = null;
        java.io.Writer writer19 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer22 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter23 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer19, xmlFriendlyReplacer22);
        com.thoughtworks.xstream.io.xml.XomReader xomReader24 = new com.thoughtworks.xstream.io.xml.XomReader(element18, xmlFriendlyReplacer22);
        java.lang.Object obj25 = null;
        treeUnmarshaller13.put((java.lang.Object) xmlFriendlyReplacer22, obj25);
        boolean b27 = path2.equals((java.lang.Object) xmlFriendlyReplacer22);
        com.thoughtworks.xstream.io.xml.XomWriter xomWriter28 = new com.thoughtworks.xstream.io.xml.XomWriter(element0, xmlFriendlyReplacer22);
        try {
            xomWriter28.startNode("");
            org.junit.Assert.fail("Expected exception of type nu.xom.IllegalNameException");
        } catch (nu.xom.IllegalNameException e) {
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        byte byte0 = java.io.ObjectStreamConstants.TC_BLOCKDATALONG;
        org.junit.Assert.assertTrue(byte0 == (byte) 122);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.CachingMapper cachingMapper1 = new com.thoughtworks.xstream.mapper.CachingMapper(classMapper0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.w3c.dom.Document document0 = null;
        com.thoughtworks.xstream.io.xml.XStream11XmlFriendlyReplacer xStream11XmlFriendlyReplacer1 = new com.thoughtworks.xstream.io.xml.XStream11XmlFriendlyReplacer();
        try {
            com.thoughtworks.xstream.io.xml.DomReader domReader2 = new com.thoughtworks.xstream.io.xml.DomReader(document0, (com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer) xStream11XmlFriendlyReplacer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        java.lang.String str4 = xmlFriendlyMapper1.mapNameToXML("hi!");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider5 = null;
        com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter cGLIBEnhancedConverter6 = new com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1, reflectionProvider5);
        java.io.Writer writer7 = null;
        com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter jsonHierarchicalStreamWriter9 = new com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter(writer7, "");
        java.io.Writer writer10 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer13 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter14 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer13);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter15 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer10, xmlFriendlyReplacer13);
        com.thoughtworks.xstream.XStream xStream16 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter17 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream16.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter17);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup19 = xStream16.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper20 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper21 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper20);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper22 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper21);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter24 = attributeMapper22.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller25 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter15, converterLookup19, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper22);
        com.thoughtworks.xstream.alias.ClassMapper classMapper26 = null;
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller27 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) jsonHierarchicalStreamWriter9, converterLookup19, classMapper26);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter28 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        org.xml.sax.ErrorHandler errorHandler29 = saxWriter28.getErrorHandler();
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer32 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter33 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer32);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter34 = xppDomWriter33.underlyingWriter();
        com.thoughtworks.xstream.alias.ClassMapper classMapper35 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper36 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper35);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper37 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper36);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider38 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter39 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper36, reflectionProvider38);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter40 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper36);
        com.thoughtworks.xstream.alias.ClassMapper classMapper41 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup42 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper41);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper43 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper36, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup42);
        com.thoughtworks.xstream.alias.ClassMapper classMapper44 = null;
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller45 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller(hierarchicalStreamWriter34, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup42, classMapper44);
        try {
            cGLIBEnhancedConverter6.marshal((java.lang.Object) jsonHierarchicalStreamWriter9, (com.thoughtworks.xstream.io.HierarchicalStreamWriter) saxWriter28, (com.thoughtworks.xstream.converters.MarshallingContext) referenceByXPathMarshaller45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(converterLookup19);
        org.junit.Assert.assertNull(singleValueConverter24);
        org.junit.Assert.assertNull(errorHandler29);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter34);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.dom4j.Element element0 = null;
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream(reflectionProvider1);
        org.jdom.Element element3 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer4 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader5 = new com.thoughtworks.xstream.io.xml.JDomReader(element3, xmlFriendlyReplacer4);
        java.lang.Object obj6 = jDomReader5.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup7 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper8 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper9 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper8);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper10 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper9);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller11 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider1, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader5, converterLookup7, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper10);
        java.lang.Runnable runnable12 = null;
        treeUnmarshaller11.addCompletionCallback(runnable12, 0);
        java.lang.Object obj15 = treeUnmarshaller11.currentObject();
        nu.xom.Element element16 = null;
        java.io.Writer writer17 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer20 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter21 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer17, xmlFriendlyReplacer20);
        com.thoughtworks.xstream.io.xml.XomReader xomReader22 = new com.thoughtworks.xstream.io.xml.XomReader(element16, xmlFriendlyReplacer20);
        java.lang.Object obj23 = null;
        treeUnmarshaller11.put((java.lang.Object) xmlFriendlyReplacer20, obj23);
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader25 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element0, xmlFriendlyReplacer20);
        dom4JReader25.close();
        try {
            boolean b27 = dom4JReader25.hasMoreChildren();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper2 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        dynamicProxyMapper2.setAlias("hi!");
        com.thoughtworks.xstream.alias.ClassMapper classMapper5 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper6 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper5);
        com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider pureJavaReflectionProvider7 = new com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider();
        com.thoughtworks.xstream.converters.reflection.ReflectionConverter reflectionConverter8 = new com.thoughtworks.xstream.converters.reflection.ReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) classMapper5, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider7);
        com.thoughtworks.xstream.annotations.AnnotationProvider annotationProvider9 = new com.thoughtworks.xstream.annotations.AnnotationProvider();
        com.thoughtworks.xstream.annotations.AnnotationReflectionConverter annotationReflectionConverter10 = new com.thoughtworks.xstream.annotations.AnnotationReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper2, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider7, annotationProvider9);
        java.lang.Class class11 = null;
        try {
            boolean b12 = dynamicProxyMapper2.isImmutableValueType(class11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.thoughtworks.xstream.XStreamer xStreamer0 = new com.thoughtworks.xstream.XStreamer();
        java.io.Reader reader1 = null;
        try {
            java.lang.Object obj2 = xStreamer0.fromXML(reader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker serializationMethodInvoker0 = new com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker();
        java.lang.Class class1 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer4 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XomDriver xomDriver5 = new com.thoughtworks.xstream.io.xml.XomDriver(xmlFriendlyReplacer4);
        java.io.Writer writer6 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter7 = xomDriver5.createWriter(writer6);
        java.io.Writer writer8 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter9 = xomDriver5.createWriter(writer8);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider10 = null;
        com.thoughtworks.xstream.XStream xStream11 = new com.thoughtworks.xstream.XStream(reflectionProvider10);
        org.jdom.Element element12 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer13 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader14 = new com.thoughtworks.xstream.io.xml.JDomReader(element12, xmlFriendlyReplacer13);
        java.lang.Object obj15 = jDomReader14.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup16 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper17 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper18 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper17);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper19 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper18);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller20 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider10, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader14, converterLookup16, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper19);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback21 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream22 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller20, streamCallback21);
        try {
            serializationMethodInvoker0.callReadObject(class1, (java.lang.Object) xomDriver5, (java.io.ObjectInputStream) customObjectInputStream22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter7);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter9);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(customObjectInputStream22);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider3 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter4 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1, reflectionProvider3);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter5 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        java.lang.String str7 = xmlFriendlyMapper1.mapNameToXML("");
        com.thoughtworks.xstream.mapper.CachingMapper cachingMapper8 = new com.thoughtworks.xstream.mapper.CachingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        java.lang.ClassLoader classLoader9 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.converters.extended.DynamicProxyConverter dynamicProxyConverter10 = new com.thoughtworks.xstream.converters.extended.DynamicProxyConverter((com.thoughtworks.xstream.mapper.Mapper) cachingMapper8, classLoader9);
        org.dom4j.Element element11 = null;
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider12 = null;
        com.thoughtworks.xstream.XStream xStream13 = new com.thoughtworks.xstream.XStream(reflectionProvider12);
        org.jdom.Element element14 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer15 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader16 = new com.thoughtworks.xstream.io.xml.JDomReader(element14, xmlFriendlyReplacer15);
        java.lang.Object obj17 = jDomReader16.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup18 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper19 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper20 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper19);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper21 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper20);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller22 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider12, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader16, converterLookup18, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper21);
        java.lang.Runnable runnable23 = null;
        treeUnmarshaller22.addCompletionCallback(runnable23, 0);
        java.lang.Object obj26 = treeUnmarshaller22.currentObject();
        nu.xom.Element element27 = null;
        java.io.Writer writer28 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer31 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter32 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer28, xmlFriendlyReplacer31);
        com.thoughtworks.xstream.io.xml.XomReader xomReader33 = new com.thoughtworks.xstream.io.xml.XomReader(element27, xmlFriendlyReplacer31);
        java.lang.Object obj34 = null;
        treeUnmarshaller22.put((java.lang.Object) xmlFriendlyReplacer31, obj34);
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader36 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element11, xmlFriendlyReplacer31);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider37 = null;
        com.thoughtworks.xstream.XStream xStream38 = new com.thoughtworks.xstream.XStream(reflectionProvider37);
        org.jdom.Element element39 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer40 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader41 = new com.thoughtworks.xstream.io.xml.JDomReader(element39, xmlFriendlyReplacer40);
        java.lang.Object obj42 = jDomReader41.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup43 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper44 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper45 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper44);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper46 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper45);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller47 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider37, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader41, converterLookup43, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper46);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback48 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream49 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller47, streamCallback48);
        try {
            java.lang.Object obj50 = dynamicProxyConverter10.unmarshal((com.thoughtworks.xstream.io.HierarchicalStreamReader) dom4JReader36, (com.thoughtworks.xstream.converters.UnmarshallingContext) treeUnmarshaller47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(customObjectInputStream49);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        org.jdom.Element element2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader4 = new com.thoughtworks.xstream.io.xml.JDomReader(element2, xmlFriendlyReplacer3);
        java.lang.Object obj5 = jDomReader4.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup6 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper7 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper8 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper7);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper9 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper8);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller10 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider0, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader4, converterLookup6, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream12 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller10, streamCallback11);
        try {
            int i13 = customObjectInputStream12.readInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(customObjectInputStream12);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        com.thoughtworks.xstream.converters.extended.ISO8601GregorianCalendarConverter iSO8601GregorianCalendarConverter0 = new com.thoughtworks.xstream.converters.extended.ISO8601GregorianCalendarConverter();
        java.lang.Class class1 = null;
        try {
            boolean b2 = iSO8601GregorianCalendarConverter0.canConvert(class1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper2 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        dynamicProxyMapper2.setAlias("hi!");
        com.thoughtworks.xstream.alias.ClassMapper classMapper5 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper6 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper5);
        com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider pureJavaReflectionProvider7 = new com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider();
        com.thoughtworks.xstream.converters.reflection.ReflectionConverter reflectionConverter8 = new com.thoughtworks.xstream.converters.reflection.ReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) classMapper5, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider7);
        com.thoughtworks.xstream.annotations.AnnotationProvider annotationProvider9 = new com.thoughtworks.xstream.annotations.AnnotationProvider();
        com.thoughtworks.xstream.annotations.AnnotationReflectionConverter annotationReflectionConverter10 = new com.thoughtworks.xstream.annotations.AnnotationReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper2, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider7, annotationProvider9);
        java.lang.Class class11 = null;
        try {
            java.lang.reflect.Field field13 = pureJavaReflectionProvider7.getField(class11, "class");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider pureJavaReflectionProvider2 = new com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider();
        com.thoughtworks.xstream.converters.reflection.ReflectionConverter reflectionConverter3 = new com.thoughtworks.xstream.converters.reflection.ReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) classMapper0, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider2);
        java.lang.ClassLoader classLoader4 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper5 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader4);
        java.lang.Class class6 = null;
        boolean b8 = defaultMapper5.shouldSerializeMember(class6, "");
        java.lang.Class class9 = null;
        boolean b11 = defaultMapper5.shouldSerializeMember(class9, "enum-type");
        com.thoughtworks.xstream.alias.ClassMapper classMapper12 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper13 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper12);
        com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider pureJavaReflectionProvider14 = new com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider();
        com.thoughtworks.xstream.converters.reflection.ReflectionConverter reflectionConverter15 = new com.thoughtworks.xstream.converters.reflection.ReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) classMapper12, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider14);
        com.thoughtworks.xstream.annotations.AnnotationProvider annotationProvider16 = null;
        com.thoughtworks.xstream.annotations.AnnotationReflectionConverter annotationReflectionConverter17 = new com.thoughtworks.xstream.annotations.AnnotationReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) defaultMapper5, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider14, annotationProvider16);
        com.thoughtworks.xstream.alias.ClassMapper classMapper18 = null;
        com.thoughtworks.xstream.io.xml.Dom4JDriver dom4JDriver19 = new com.thoughtworks.xstream.io.xml.Dom4JDriver();
        org.dom4j.io.OutputFormat outputFormat20 = null;
        dom4JDriver19.setOutputFormat(outputFormat20);
        org.dom4j.DocumentFactory documentFactory22 = null;
        dom4JDriver19.setDocumentFactory(documentFactory22);
        com.thoughtworks.xstream.XStream xStream24 = new com.thoughtworks.xstream.XStream((com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider14, classMapper18, (com.thoughtworks.xstream.io.HierarchicalStreamDriver) dom4JDriver19);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider.Visitor visitor25 = null;
        try {
            pureJavaReflectionProvider2.visitSerializableFields((java.lang.Object) classMapper18, visitor25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.jdom.Element element0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader2 = new com.thoughtworks.xstream.io.xml.JDomReader(element0, xmlFriendlyReplacer1);
        java.lang.Object obj3 = jDomReader2.peekUnderlyingNode();
        try {
            java.lang.String str5 = jDomReader2.getAttributeName((int) (byte) 121);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter jsonHierarchicalStreamWriter2 = new com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter(writer0, "");
        try {
            jsonHierarchicalStreamWriter2.endNode();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter0 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter1 = saxWriter0.underlyingWriter();
        org.xml.sax.EntityResolver entityResolver2 = null;
        try {
            saxWriter0.setEntityResolver(entityResolver2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter1);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.thoughtworks.xstream.io.path.PathTracker pathTracker0 = new com.thoughtworks.xstream.io.path.PathTracker();
        java.lang.String str1 = pathTracker0.getCurrentPath();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.thoughtworks.xstream.converters.basic.LongConverter longConverter0 = new com.thoughtworks.xstream.converters.basic.LongConverter();
        try {
            java.lang.Object obj2 = longConverter0.fromString("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.thoughtworks.xstream.converters.extended.ISO8601SqlTimestampConverter iSO8601SqlTimestampConverter0 = new com.thoughtworks.xstream.converters.extended.ISO8601SqlTimestampConverter();
        try {
            java.lang.Object obj2 = iSO8601SqlTimestampConverter0.fromString("http://com.thoughtworks.xstream/XStreamSource/feature");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamDriver hierarchicalStreamDriver1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream(reflectionProvider0, hierarchicalStreamDriver1);
        java.lang.Class class4 = null;
        xStream2.useAttributeFor("", class4);
        java.io.Writer writer7 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer8 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter9 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer7, xmlFriendlyReplacer8);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup10 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper11 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper12 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper11);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper13 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper12);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider14 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter15 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper12, reflectionProvider14);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter16 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper12);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller17 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter9, converterLookup10, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper12);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup18 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper19 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller20 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter9, converterLookup18, classMapper19);
        try {
            xStream2.marshal((java.lang.Object) 0L, (com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.dom4j.Element element1 = null;
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider2 = null;
        com.thoughtworks.xstream.XStream xStream3 = new com.thoughtworks.xstream.XStream(reflectionProvider2);
        org.jdom.Element element4 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer5 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader6 = new com.thoughtworks.xstream.io.xml.JDomReader(element4, xmlFriendlyReplacer5);
        java.lang.Object obj7 = jDomReader6.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup8 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper9 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper10 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper9);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper11 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper10);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller12 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider2, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader6, converterLookup8, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper11);
        java.lang.Runnable runnable13 = null;
        treeUnmarshaller12.addCompletionCallback(runnable13, 0);
        java.lang.Object obj16 = treeUnmarshaller12.currentObject();
        nu.xom.Element element17 = null;
        java.io.Writer writer18 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer21 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter22 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer18, xmlFriendlyReplacer21);
        com.thoughtworks.xstream.io.xml.XomReader xomReader23 = new com.thoughtworks.xstream.io.xml.XomReader(element17, xmlFriendlyReplacer21);
        java.lang.Object obj24 = null;
        treeUnmarshaller12.put((java.lang.Object) xmlFriendlyReplacer21, obj24);
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader26 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element1, xmlFriendlyReplacer21);
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer29 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter30 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer29);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter31 = xppDomWriter30.underlyingWriter();
        com.thoughtworks.xstream.alias.ClassMapper classMapper32 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper33 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper32);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper34 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper33);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider35 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter36 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper33, reflectionProvider35);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter37 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper33);
        com.thoughtworks.xstream.alias.ClassMapper classMapper38 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup39 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper38);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper40 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper33, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup39);
        com.thoughtworks.xstream.alias.ClassMapper classMapper41 = null;
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller42 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller(hierarchicalStreamWriter31, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup39, classMapper41);
        com.thoughtworks.xstream.alias.ClassMapper classMapper43 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper44 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper43);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper45 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper44);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider46 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter47 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper44, reflectionProvider46);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter48 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper44);
        com.thoughtworks.xstream.alias.ClassMapper classMapper49 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup50 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper49);
        com.thoughtworks.xstream.alias.ClassMapper classMapper51 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper52 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper51);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper53 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper52);
        java.lang.String str55 = xmlFriendlyMapper52.mapNameToXML("hi!");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider56 = null;
        com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter cGLIBEnhancedConverter57 = new com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper52, reflectionProvider56);
        defaultConverterLookup50.registerConverter((com.thoughtworks.xstream.converters.Converter) cGLIBEnhancedConverter57, 0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper60 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper44, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup50);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller61 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) 1003, (com.thoughtworks.xstream.io.HierarchicalStreamReader) dom4JReader26, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup39, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper60);
        com.thoughtworks.xstream.converters.javabean.JavaBeanConverter.DuplicateFieldException duplicateFieldException63 = new com.thoughtworks.xstream.converters.javabean.JavaBeanConverter.DuplicateFieldException("hi!");
        try {
            dom4JReader26.appendErrors((com.thoughtworks.xstream.converters.ErrorWriter) duplicateFieldException63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter31);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider pureJavaReflectionProvider2 = new com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider();
        com.thoughtworks.xstream.converters.reflection.ReflectionConverter reflectionConverter3 = new com.thoughtworks.xstream.converters.reflection.ReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) classMapper0, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider2);
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer6 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XomDriver xomDriver7 = new com.thoughtworks.xstream.io.xml.XomDriver(xmlFriendlyReplacer6);
        java.io.Writer writer8 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter9 = xomDriver7.createWriter(writer8);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider.Visitor visitor10 = null;
        try {
            pureJavaReflectionProvider2.visitSerializableFields((java.lang.Object) hierarchicalStreamWriter9, visitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter9);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker serializationMethodInvoker0 = new com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker();
        java.lang.Class class1 = null;
        java.lang.ClassLoader classLoader2 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.converters.extended.JavaClassConverter javaClassConverter3 = new com.thoughtworks.xstream.converters.extended.JavaClassConverter(classLoader2);
        com.thoughtworks.xstream.io.xml.DomDriver domDriver4 = new com.thoughtworks.xstream.io.xml.DomDriver();
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback5 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream6 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback5);
        java.io.ObjectOutputStream.PutField putField7 = customObjectOutputStream6.putFields();
        java.io.ObjectOutputStream.PutField putField8 = customObjectOutputStream6.putFields();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter9 = domDriver4.createWriter((java.io.OutputStream) customObjectOutputStream6);
        try {
            serializationMethodInvoker0.callWriteObject(class1, (java.lang.Object) javaClassConverter3, (java.io.ObjectOutputStream) customObjectOutputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(putField7);
        org.junit.Assert.assertNotNull(putField8);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter9);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        com.thoughtworks.xstream.io.StatefulWriter.STATE_NODE_START = (byte) 121;
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        java.io.File file0 = null;
        com.thoughtworks.xstream.persistence.FileStreamStrategy fileStreamStrategy1 = new com.thoughtworks.xstream.persistence.FileStreamStrategy(file0);
        nu.xom.Element element2 = null;
        java.io.Writer writer3 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer6 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter7 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer3, xmlFriendlyReplacer6);
        com.thoughtworks.xstream.io.xml.XomReader xomReader8 = new com.thoughtworks.xstream.io.xml.XomReader(element2, xmlFriendlyReplacer6);
        try {
            boolean b9 = fileStreamStrategy1.containsKey((java.lang.Object) element2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback0 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream1 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback0);
        java.io.ObjectOutputStream.PutField putField2 = customObjectOutputStream1.putFields();
        java.io.ObjectOutputStream.PutField putField3 = customObjectOutputStream1.putFields();
        com.thoughtworks.xstream.core.util.OrderRetainingMap orderRetainingMap4 = new com.thoughtworks.xstream.core.util.OrderRetainingMap();
        java.util.Collection collection5 = orderRetainingMap4.values();
        try {
            customObjectOutputStream1.writeUnshared((java.lang.Object) collection5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(putField2);
        org.junit.Assert.assertNotNull(putField3);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter0 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter1 = saxWriter0.underlyingWriter();
        com.thoughtworks.xstream.io.StatefulWriter statefulWriter2 = new com.thoughtworks.xstream.io.StatefulWriter(hierarchicalStreamWriter1);
        try {
            statefulWriter2.setValue("http://com.thoughtworks.xstream/XStreamSource/feature");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter1);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        com.thoughtworks.xstream.converters.extended.ISO8601DateConverter iSO8601DateConverter0 = new com.thoughtworks.xstream.converters.extended.ISO8601DateConverter();
        try {
            java.lang.Object obj2 = iSO8601DateConverter0.fromString("hi!");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.converters.ConversionException");
        } catch (com.thoughtworks.xstream.converters.ConversionException e) {
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        org.jdom.Element element2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader4 = new com.thoughtworks.xstream.io.xml.JDomReader(element2, xmlFriendlyReplacer3);
        java.lang.Object obj5 = jDomReader4.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup6 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper7 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper8 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper7);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper9 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper8);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller10 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider0, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader4, converterLookup6, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream12 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller10, streamCallback11);
        try {
            java.lang.Object obj13 = customObjectInputStream12.readUnshared();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(customObjectInputStream12);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper1 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper(classMapper0);
        try {
            java.lang.String str3 = dynamicProxyMapper1.attributeForAlias("class");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        java.io.Reader reader0 = null;
        com.thoughtworks.xstream.io.xml.XStream11XmlFriendlyReplacer xStream11XmlFriendlyReplacer1 = new com.thoughtworks.xstream.io.xml.XStream11XmlFriendlyReplacer();
        java.lang.String str3 = xStream11XmlFriendlyReplacer1.unescapeName("http://com.thoughtworks.xstream/XStreamSource/feature");
        try {
            com.thoughtworks.xstream.io.xml.XppReader xppReader4 = new com.thoughtworks.xstream.io.xml.XppReader(reader0, (com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer) xStream11XmlFriendlyReplacer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "http://com.thoughtworks.xstream/XStreamSource/feature" + "'", str3.equals("http://com.thoughtworks.xstream/XStreamSource/feature"));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider pureJavaReflectionProvider2 = new com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider();
        com.thoughtworks.xstream.converters.reflection.ReflectionConverter reflectionConverter3 = new com.thoughtworks.xstream.converters.reflection.ReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) classMapper0, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider2);
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider5 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper6 = null;
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap7 = null;
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver9 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap7, true);
        com.thoughtworks.xstream.XStream xStream11 = new com.thoughtworks.xstream.XStream(reflectionProvider5, classMapper6, (com.thoughtworks.xstream.io.HierarchicalStreamDriver) staxDriver9, "hi!");
        com.thoughtworks.xstream.XStream xStream13 = new com.thoughtworks.xstream.XStream((com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider2, classMapper4, (com.thoughtworks.xstream.io.HierarchicalStreamDriver) staxDriver9, "");
        javax.xml.stream.XMLStreamReader xMLStreamReader14 = null;
        try {
            com.thoughtworks.xstream.io.xml.AbstractPullReader abstractPullReader15 = staxDriver9.createStaxReader(xMLStreamReader14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream12 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback11);
        java.io.ObjectOutputStream.PutField putField13 = customObjectOutputStream12.putFields();
        java.io.Writer writer14 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer15 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter16 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer14, xmlFriendlyReplacer15);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup17 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper18 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper19 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper18);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper20 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider21 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter22 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19, reflectionProvider21);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter23 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller24 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter16, converterLookup17, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        referenceByIdMarshaller10.put((java.lang.Object) customObjectOutputStream12, (java.lang.Object) referenceByIdMarshaller24);
        java.io.Writer writer26 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer27 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter28 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer26, xmlFriendlyReplacer27);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup29 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper30 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper31 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper30);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper32 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper31);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider33 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter34 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper31, reflectionProvider33);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter35 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper31);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller36 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter28, converterLookup29, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper31);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup37 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper38 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller39 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter28, converterLookup37, classMapper38);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup40 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper41 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper42 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper41);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper43 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper42);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider44 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter45 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper42, reflectionProvider44);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter46 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper42);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller.IDGenerator iDGenerator47 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller48 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter28, converterLookup40, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper42, iDGenerator47);
        java.lang.Object obj49 = referenceByIdMarshaller24.get((java.lang.Object) xmlFriendlyMapper42);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback50 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream51 = com.thoughtworks.xstream.core.util.CustomObjectOutputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller24, streamCallback50);
        try {
            customObjectOutputStream51.writeChar(1003);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(putField13);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(customObjectOutputStream51);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        byte byte0 = java.io.ObjectStreamConstants.TC_OBJECT;
        org.junit.Assert.assertTrue(byte0 == (byte) 115);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup11 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper12 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller13 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup11, classMapper12);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter14 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter15 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter16 = saxWriter15.underlyingWriter();
        referenceByIdMarshaller13.put((java.lang.Object) saxWriter14, (java.lang.Object) saxWriter15);
        org.xml.sax.EntityResolver entityResolver18 = null;
        try {
            saxWriter14.setEntityResolver(entityResolver18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter16);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        com.thoughtworks.xstream.XStreamer xStreamer0 = new com.thoughtworks.xstream.XStreamer();
        try {
            java.lang.Object obj2 = xStreamer0.fromXML("enum-type");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
        }
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        com.thoughtworks.xstream.io.xml.DomDriver domDriver0 = new com.thoughtworks.xstream.io.xml.DomDriver();
        java.io.Writer writer1 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter2 = domDriver0.createWriter(writer1);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter2);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        java.io.Writer writer11 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer12 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter13 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer11, xmlFriendlyReplacer12);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup14 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper15 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper16 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper15);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper17 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper16);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider18 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter19 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper16, reflectionProvider18);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter20 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper16);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller21 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter13, converterLookup14, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper16);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback22 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream23 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback22);
        java.io.ObjectOutputStream.PutField putField24 = customObjectOutputStream23.putFields();
        java.io.Writer writer25 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer26 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter27 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer25, xmlFriendlyReplacer26);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup28 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper29 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper30 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper29);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper31 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper30);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider32 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter33 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper30, reflectionProvider32);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter34 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper30);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller35 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter27, converterLookup28, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper30);
        referenceByIdMarshaller21.put((java.lang.Object) customObjectOutputStream23, (java.lang.Object) referenceByIdMarshaller35);
        java.io.Writer writer37 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer38 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter39 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer37, xmlFriendlyReplacer38);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup40 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper41 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper42 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper41);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper43 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper42);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider44 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter45 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper42, reflectionProvider44);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter46 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper42);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller47 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter39, converterLookup40, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper42);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup48 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper49 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller50 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter39, converterLookup48, classMapper49);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup51 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper52 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper53 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper52);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper54 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper53);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider55 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter56 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper53, reflectionProvider55);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter57 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper53);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller.IDGenerator iDGenerator58 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller59 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter39, converterLookup51, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper53, iDGenerator58);
        java.lang.Object obj60 = referenceByIdMarshaller35.get((java.lang.Object) xmlFriendlyMapper53);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback61 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream62 = com.thoughtworks.xstream.core.util.CustomObjectOutputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller35, streamCallback61);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback63 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream64 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback63);
        referenceByIdMarshaller10.put((java.lang.Object) customObjectOutputStream62, (java.lang.Object) customObjectOutputStream64);
        try {
            customObjectOutputStream62.write(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(putField24);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(customObjectOutputStream62);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        java.io.Writer writer11 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer12 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter13 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer11, xmlFriendlyReplacer12);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup14 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper15 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper16 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper15);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper17 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper16);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider18 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter19 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper16, reflectionProvider18);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter20 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper16);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller21 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter13, converterLookup14, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper16);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback22 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream23 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback22);
        java.io.ObjectOutputStream.PutField putField24 = customObjectOutputStream23.putFields();
        java.io.Writer writer25 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer26 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter27 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer25, xmlFriendlyReplacer26);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup28 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper29 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper30 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper29);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper31 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper30);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider32 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter33 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper30, reflectionProvider32);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter34 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper30);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller35 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter27, converterLookup28, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper30);
        referenceByIdMarshaller21.put((java.lang.Object) customObjectOutputStream23, (java.lang.Object) referenceByIdMarshaller35);
        java.io.Writer writer37 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer38 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter39 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer37, xmlFriendlyReplacer38);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup40 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper41 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper42 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper41);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper43 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper42);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider44 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter45 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper42, reflectionProvider44);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter46 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper42);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller47 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter39, converterLookup40, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper42);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup48 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper49 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller50 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter39, converterLookup48, classMapper49);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup51 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper52 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper53 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper52);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper54 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper53);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider55 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter56 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper53, reflectionProvider55);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter57 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper53);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller.IDGenerator iDGenerator58 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller59 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter39, converterLookup51, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper53, iDGenerator58);
        java.lang.Object obj60 = referenceByIdMarshaller35.get((java.lang.Object) xmlFriendlyMapper53);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback61 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream62 = com.thoughtworks.xstream.core.util.CustomObjectOutputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller35, streamCallback61);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback63 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream64 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback63);
        referenceByIdMarshaller10.put((java.lang.Object) customObjectOutputStream62, (java.lang.Object) customObjectOutputStream64);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider66 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper67 = null;
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap68 = null;
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver70 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap68, true);
        com.thoughtworks.xstream.XStream xStream72 = new com.thoughtworks.xstream.XStream(reflectionProvider66, classMapper67, (com.thoughtworks.xstream.io.HierarchicalStreamDriver) staxDriver70, "hi!");
        try {
            referenceByIdMarshaller10.convertAnother((java.lang.Object) classMapper67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(putField24);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(customObjectOutputStream62);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup11 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper12 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller13 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup11, classMapper12);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter14 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter15 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter16 = saxWriter15.underlyingWriter();
        referenceByIdMarshaller13.put((java.lang.Object) saxWriter14, (java.lang.Object) saxWriter15);
        com.thoughtworks.xstream.XStream xStream18 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter19 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream18.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter19);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup21 = xStream18.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper22 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper23 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper22);
        com.thoughtworks.xstream.mapper.ClassAliasingMapper classAliasingMapper24 = new com.thoughtworks.xstream.mapper.ClassAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper23);
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller26 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) saxWriter15, converterLookup21, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper23, (int) 'a');
        saxWriter15.close();
        try {
            saxWriter15.setFeature("defined-in", false);
            org.junit.Assert.fail("Expected exception of type org.xml.sax.SAXNotRecognizedException");
        } catch (org.xml.sax.SAXNotRecognizedException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter16);
        org.junit.Assert.assertNotNull(converterLookup21);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        org.jdom.Element element2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader4 = new com.thoughtworks.xstream.io.xml.JDomReader(element2, xmlFriendlyReplacer3);
        java.lang.Object obj5 = jDomReader4.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup6 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper7 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper8 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper7);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper9 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper8);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller10 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider0, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader4, converterLookup6, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream12 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller10, streamCallback11);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback13 = customObjectInputStream12.popCallback();
        try {
            int i14 = customObjectInputStream12.readUnsignedByte();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(customObjectInputStream12);
        org.junit.Assert.assertNull(streamCallback13);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamDriver hierarchicalStreamDriver1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream(reflectionProvider0, hierarchicalStreamDriver1);
        com.thoughtworks.xstream.alias.ClassMapper classMapper3 = null;
        com.thoughtworks.xstream.converters.javabean.JavaBeanConverter javaBeanConverter5 = new com.thoughtworks.xstream.converters.javabean.JavaBeanConverter(classMapper3, "");
        xStream2.registerConverter((com.thoughtworks.xstream.converters.Converter) javaBeanConverter5);
        com.thoughtworks.xstream.converters.basic.FloatConverter floatConverter7 = new com.thoughtworks.xstream.converters.basic.FloatConverter();
        xStream2.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) floatConverter7);
        java.lang.Class class9 = null;
        try {
            boolean b10 = floatConverter7.canConvert(class9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        com.thoughtworks.xstream.converters.javabean.JavaBeanConverter.DuplicateFieldException duplicateFieldException1 = new com.thoughtworks.xstream.converters.javabean.JavaBeanConverter.DuplicateFieldException("hi!");
        java.lang.String str2 = duplicateFieldException1.getShortMessage();
        duplicateFieldException1.add("http://com.thoughtworks.xstream/XStreamSource/feature", "[]");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        com.thoughtworks.xstream.XStream xStream0 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter1 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream0.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter1);
        com.thoughtworks.xstream.MarshallingStrategy marshallingStrategy3 = null;
        xStream0.setMarshallingStrategy(marshallingStrategy3);
        xStream0.aliasAttribute("http://com.thoughtworks.xstream/XStreamSource/feature", "class");
        java.io.Writer writer8 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer9 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter10 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer8, xmlFriendlyReplacer9);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup11 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper12 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper13 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper12);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper14 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper13);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider15 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter16 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper13, reflectionProvider15);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter17 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper13);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller18 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter10, converterLookup11, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper13);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback19 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream20 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller18, streamCallback19);
        com.thoughtworks.xstream.mapper.Mapper mapper21 = null;
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper23 = new com.thoughtworks.xstream.mapper.CGLIBMapper(mapper21, "hi!");
        try {
            java.lang.Object obj24 = xStream0.fromXML((java.io.InputStream) customObjectInputStream20, (java.lang.Object) cGLIBMapper23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(customObjectInputStream20);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.w3c.dom.Element element0 = null;
        org.dom4j.DocumentFactory documentFactory1 = null;
        org.dom4j.io.OutputFormat outputFormat2 = null;
        java.io.Writer writer3 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer6 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter7 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer3, xmlFriendlyReplacer6);
        com.thoughtworks.xstream.io.xml.Dom4JDriver dom4JDriver8 = new com.thoughtworks.xstream.io.xml.Dom4JDriver(documentFactory1, outputFormat2, xmlFriendlyReplacer6);
        try {
            com.thoughtworks.xstream.io.xml.DomReader domReader9 = new com.thoughtworks.xstream.io.xml.DomReader(element0, xmlFriendlyReplacer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.w3c.dom.Element element0 = null;
        try {
            com.thoughtworks.xstream.io.xml.DomReader domReader1 = new com.thoughtworks.xstream.io.xml.DomReader(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.dom4j.Element element0 = null;
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream(reflectionProvider1);
        org.jdom.Element element3 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer4 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader5 = new com.thoughtworks.xstream.io.xml.JDomReader(element3, xmlFriendlyReplacer4);
        java.lang.Object obj6 = jDomReader5.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup7 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper8 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper9 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper8);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper10 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper9);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller11 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider1, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader5, converterLookup7, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper10);
        java.lang.Runnable runnable12 = null;
        treeUnmarshaller11.addCompletionCallback(runnable12, 0);
        java.lang.Object obj15 = treeUnmarshaller11.currentObject();
        nu.xom.Element element16 = null;
        java.io.Writer writer17 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer20 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter21 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer17, xmlFriendlyReplacer20);
        com.thoughtworks.xstream.io.xml.XomReader xomReader22 = new com.thoughtworks.xstream.io.xml.XomReader(element16, xmlFriendlyReplacer20);
        java.lang.Object obj23 = null;
        treeUnmarshaller11.put((java.lang.Object) xmlFriendlyReplacer20, obj23);
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader25 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element0, xmlFriendlyReplacer20);
        try {
            java.lang.String str26 = dom4JReader25.getNodeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        com.thoughtworks.xstream.converters.basic.LongConverter longConverter0 = new com.thoughtworks.xstream.converters.basic.LongConverter();
        java.lang.Class class1 = null;
        try {
            boolean b2 = longConverter0.canConvert(class1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.thoughtworks.xstream.converters.extended.StackTraceElementConverter stackTraceElementConverter0 = new com.thoughtworks.xstream.converters.extended.StackTraceElementConverter();
        java.lang.Class class1 = null;
        boolean b2 = stackTraceElementConverter0.canConvert(class1);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        com.thoughtworks.xstream.XStream xStream0 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter1 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream0.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter1);
        java.lang.Object obj4 = textAttributeConverter1.fromString("hi!");
        com.thoughtworks.xstream.converters.SingleValueConverterWrapper singleValueConverterWrapper5 = new com.thoughtworks.xstream.converters.SingleValueConverterWrapper((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter1);
        try {
            java.lang.String str7 = singleValueConverterWrapper5.toString((java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        java.io.Reader reader0 = null;
        try {
            com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom1 = com.thoughtworks.xstream.io.xml.xppdom.Xpp3DomBuilder.build(reader0);
            org.junit.Assert.fail("Expected exception of type org.xmlpull.v1.XmlPullParserException");
        } catch (org.xmlpull.v1.XmlPullParserException e) {
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.dom4j.Element element0 = null;
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream(reflectionProvider1);
        org.jdom.Element element3 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer4 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader5 = new com.thoughtworks.xstream.io.xml.JDomReader(element3, xmlFriendlyReplacer4);
        java.lang.Object obj6 = jDomReader5.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup7 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper8 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper9 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper8);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper10 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper9);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller11 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider1, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader5, converterLookup7, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper10);
        java.lang.Runnable runnable12 = null;
        treeUnmarshaller11.addCompletionCallback(runnable12, 0);
        java.lang.Object obj15 = treeUnmarshaller11.currentObject();
        nu.xom.Element element16 = null;
        java.io.Writer writer17 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer20 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter21 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer17, xmlFriendlyReplacer20);
        com.thoughtworks.xstream.io.xml.XomReader xomReader22 = new com.thoughtworks.xstream.io.xml.XomReader(element16, xmlFriendlyReplacer20);
        java.lang.Object obj23 = null;
        treeUnmarshaller11.put((java.lang.Object) xmlFriendlyReplacer20, obj23);
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader25 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element0, xmlFriendlyReplacer20);
        dom4JReader25.close();
        java.lang.Object obj27 = dom4JReader25.peekUnderlyingNode();
        try {
            boolean b28 = dom4JReader25.hasMoreChildren();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        nu.xom.Element element0 = null;
        java.io.Writer writer1 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer4 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter5 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer1, xmlFriendlyReplacer4);
        com.thoughtworks.xstream.io.xml.XomReader xomReader6 = new com.thoughtworks.xstream.io.xml.XomReader(element0, xmlFriendlyReplacer4);
        try {
            java.lang.String str8 = xomReader6.getAttribute((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter3 = compactWriter2.underlyingWriter();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup4 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper5 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper6 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller.IDGenerator iDGenerator7 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller8 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup4, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper6, iDGenerator7);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback9 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream10 = com.thoughtworks.xstream.core.util.CustomObjectOutputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller8, streamCallback9);
        try {
            customObjectOutputStream10.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter3);
        org.junit.Assert.assertNotNull(customObjectOutputStream10);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        org.jdom.Element element2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader4 = new com.thoughtworks.xstream.io.xml.JDomReader(element2, xmlFriendlyReplacer3);
        java.lang.Object obj5 = jDomReader4.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup6 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper7 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper8 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper7);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper9 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper8);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller10 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider0, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader4, converterLookup6, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream12 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller10, streamCallback11);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback13 = customObjectInputStream12.popCallback();
        try {
            int i15 = customObjectInputStream12.skipBytes(100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(customObjectInputStream12);
        org.junit.Assert.assertNull(streamCallback13);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback0 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream1 = new com.thoughtworks.xstream.core.util.CustomObjectInputStream(streamCallback0);
        byte[] byte_array2 = null;
        try {
            int i5 = customObjectInputStream1.read(byte_array2, (int) 'a', (int) (byte) 121);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        int i0 = com.thoughtworks.xstream.XStream.PRIORITY_LOW;
        org.junit.Assert.assertTrue(i0 == (-10));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup11 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper12 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller13 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup11, classMapper12);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter14 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter15 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter16 = saxWriter15.underlyingWriter();
        referenceByIdMarshaller13.put((java.lang.Object) saxWriter14, (java.lang.Object) saxWriter15);
        com.thoughtworks.xstream.core.util.OrderRetainingMap orderRetainingMap18 = new com.thoughtworks.xstream.core.util.OrderRetainingMap();
        com.thoughtworks.xstream.alias.ClassMapper classMapper19 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper20 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper19);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper21 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper20);
        java.lang.String str23 = xmlFriendlyMapper20.mapNameToXML("hi!");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider24 = null;
        com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter cGLIBEnhancedConverter25 = new com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper20, reflectionProvider24);
        java.io.Writer writer26 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer29 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter30 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer26, xmlFriendlyReplacer29);
        java.lang.Object obj31 = orderRetainingMap18.put((java.lang.Object) xmlFriendlyMapper20, (java.lang.Object) prettyPrintWriter30);
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap32 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer35 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XomDriver xomDriver36 = new com.thoughtworks.xstream.io.xml.XomDriver(xmlFriendlyReplacer35);
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver37 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap32, xmlFriendlyReplacer35);
        com.thoughtworks.xstream.alias.ClassMapper classMapper38 = null;
        com.thoughtworks.xstream.mapper.FieldAliasingMapper fieldAliasingMapper39 = new com.thoughtworks.xstream.mapper.FieldAliasingMapper(classMapper38);
        java.lang.Object obj40 = orderRetainingMap18.put((java.lang.Object) qNameMap32, (java.lang.Object) classMapper38);
        try {
            referenceByIdMarshaller13.convertAnother((java.lang.Object) orderRetainingMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter16);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.dom4j.Element element0 = null;
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream(reflectionProvider1);
        org.jdom.Element element3 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer4 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader5 = new com.thoughtworks.xstream.io.xml.JDomReader(element3, xmlFriendlyReplacer4);
        java.lang.Object obj6 = jDomReader5.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup7 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper8 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper9 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper8);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper10 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper9);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller11 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider1, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader5, converterLookup7, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper10);
        java.lang.Runnable runnable12 = null;
        treeUnmarshaller11.addCompletionCallback(runnable12, 0);
        java.lang.Object obj15 = treeUnmarshaller11.currentObject();
        nu.xom.Element element16 = null;
        java.io.Writer writer17 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer20 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter21 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer17, xmlFriendlyReplacer20);
        com.thoughtworks.xstream.io.xml.XomReader xomReader22 = new com.thoughtworks.xstream.io.xml.XomReader(element16, xmlFriendlyReplacer20);
        java.lang.Object obj23 = null;
        treeUnmarshaller11.put((java.lang.Object) xmlFriendlyReplacer20, obj23);
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader25 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element0, xmlFriendlyReplacer20);
        java.lang.String str27 = xmlFriendlyReplacer20.unescapeName("");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamDriver hierarchicalStreamDriver1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream(reflectionProvider0, hierarchicalStreamDriver1);
        java.lang.Class class3 = null;
        xStream2.useAttributeFor(class3);
        org.dom4j.Element element5 = null;
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider6 = null;
        com.thoughtworks.xstream.XStream xStream7 = new com.thoughtworks.xstream.XStream(reflectionProvider6);
        org.jdom.Element element8 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer9 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader10 = new com.thoughtworks.xstream.io.xml.JDomReader(element8, xmlFriendlyReplacer9);
        java.lang.Object obj11 = jDomReader10.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup12 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper13 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper14 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper13);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper15 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper14);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller16 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider6, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader10, converterLookup12, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper15);
        java.lang.Runnable runnable17 = null;
        treeUnmarshaller16.addCompletionCallback(runnable17, 0);
        java.lang.Object obj20 = treeUnmarshaller16.currentObject();
        nu.xom.Element element21 = null;
        java.io.Writer writer22 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer25 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter26 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer22, xmlFriendlyReplacer25);
        com.thoughtworks.xstream.io.xml.XomReader xomReader27 = new com.thoughtworks.xstream.io.xml.XomReader(element21, xmlFriendlyReplacer25);
        java.lang.Object obj28 = null;
        treeUnmarshaller16.put((java.lang.Object) xmlFriendlyReplacer25, obj28);
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader30 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element5, xmlFriendlyReplacer25);
        dom4JReader30.close();
        java.lang.Object obj32 = dom4JReader30.peekUnderlyingNode();
        try {
            java.lang.Object obj34 = xStream2.unmarshal((com.thoughtworks.xstream.io.HierarchicalStreamReader) dom4JReader30, (java.lang.Object) (byte) 124);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        com.thoughtworks.xstream.mapper.CannotResolveClassException cannotResolveClassException1 = new com.thoughtworks.xstream.mapper.CannotResolveClassException("class");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback0 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream1 = new com.thoughtworks.xstream.core.util.CustomObjectInputStream(streamCallback0);
        byte[] byte_array7 = new byte[] { (byte) 116, (byte) 118, (byte) 113, (byte) 112, (byte) 124 };
        try {
            customObjectInputStream1.readFully(byte_array7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array7);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.converters.extended.JavaClassConverter javaClassConverter1 = new com.thoughtworks.xstream.converters.extended.JavaClassConverter(classLoader0);
        try {
            java.lang.Object obj3 = javaClassConverter1.fromString("dynamic-proxy");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.converters.ConversionException");
        } catch (com.thoughtworks.xstream.converters.ConversionException e) {
        }
        org.junit.Assert.assertNotNull(classLoader0);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        com.thoughtworks.xstream.converters.extended.GregorianCalendarConverter gregorianCalendarConverter0 = new com.thoughtworks.xstream.converters.extended.GregorianCalendarConverter();
        com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker serializationMethodInvoker1 = new com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker();
        java.io.Writer writer2 = null;
        java.io.Writer writer3 = null;
        java.io.Writer writer4 = null;
        char[] char_array9 = new char[] { 'a', '4', '4', ' ' };
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter10 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer4, char_array9);
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter11 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer3, char_array9);
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter12 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer2, char_array9);
        java.lang.Object obj13 = serializationMethodInvoker1.callWriteReplace((java.lang.Object) prettyPrintWriter12);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter14 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter15 = saxWriter14.underlyingWriter();
        com.thoughtworks.xstream.io.StatefulWriter statefulWriter16 = new com.thoughtworks.xstream.io.StatefulWriter(hierarchicalStreamWriter15);
        java.io.Writer writer17 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer18 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter19 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer17, xmlFriendlyReplacer18);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup20 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper21 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper22 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper21);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper23 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper22);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider24 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter25 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper22, reflectionProvider24);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter26 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper22);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller27 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter19, converterLookup20, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper22);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback28 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream29 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback28);
        java.io.ObjectOutputStream.PutField putField30 = customObjectOutputStream29.putFields();
        java.io.Writer writer31 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer32 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter33 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer31, xmlFriendlyReplacer32);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup34 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper35 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper36 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper35);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper37 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper36);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider38 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter39 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper36, reflectionProvider38);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter40 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper36);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller41 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter33, converterLookup34, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper36);
        referenceByIdMarshaller27.put((java.lang.Object) customObjectOutputStream29, (java.lang.Object) referenceByIdMarshaller41);
        java.io.Writer writer43 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer44 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter45 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer43, xmlFriendlyReplacer44);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup46 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper47 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper48 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper47);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper49 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper48);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider50 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter51 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper48, reflectionProvider50);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter52 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper48);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller53 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter45, converterLookup46, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper48);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup54 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper55 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller56 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter45, converterLookup54, classMapper55);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup57 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper58 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper59 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper58);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper60 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper59);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider61 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter62 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper59, reflectionProvider61);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter63 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper59);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller.IDGenerator iDGenerator64 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller65 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter45, converterLookup57, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper59, iDGenerator64);
        java.lang.Object obj66 = referenceByIdMarshaller41.get((java.lang.Object) xmlFriendlyMapper59);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback67 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream68 = com.thoughtworks.xstream.core.util.CustomObjectOutputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller41, streamCallback67);
        try {
            gregorianCalendarConverter0.marshal((java.lang.Object) prettyPrintWriter12, hierarchicalStreamWriter15, (com.thoughtworks.xstream.converters.MarshallingContext) referenceByIdMarshaller41);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(char_array9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter15);
        org.junit.Assert.assertNotNull(putField30);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(customObjectOutputStream68);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        nu.xom.Element element0 = null;
        java.io.Writer writer1 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer4 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter5 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer1, xmlFriendlyReplacer4);
        com.thoughtworks.xstream.io.xml.XomReader xomReader6 = new com.thoughtworks.xstream.io.xml.XomReader(element0, xmlFriendlyReplacer4);
        try {
            java.lang.String str7 = xomReader6.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter1 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer0);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.enums.EnumMapConverter enumMapConverter11 = new com.thoughtworks.xstream.converters.enums.EnumMapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.alias.ClassMapper classMapper12 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper13 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper12);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper14 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper13);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider15 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter16 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper13, reflectionProvider15);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter17 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper13);
        java.lang.String str19 = xmlFriendlyMapper13.mapNameToXML("");
        com.thoughtworks.xstream.mapper.CachingMapper cachingMapper20 = new com.thoughtworks.xstream.mapper.CachingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper13);
        java.lang.ClassLoader classLoader21 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.converters.extended.DynamicProxyConverter dynamicProxyConverter22 = new com.thoughtworks.xstream.converters.extended.DynamicProxyConverter((com.thoughtworks.xstream.mapper.Mapper) cachingMapper20, classLoader21);
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer25 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XomDriver xomDriver26 = new com.thoughtworks.xstream.io.xml.XomDriver(xmlFriendlyReplacer25);
        java.io.Writer writer27 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter28 = xomDriver26.createWriter(writer27);
        com.thoughtworks.xstream.io.xml.DomDriver domDriver29 = new com.thoughtworks.xstream.io.xml.DomDriver();
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback30 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream31 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback30);
        java.io.ObjectOutputStream.PutField putField32 = customObjectOutputStream31.putFields();
        java.io.ObjectOutputStream.PutField putField33 = customObjectOutputStream31.putFields();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter34 = domDriver29.createWriter((java.io.OutputStream) customObjectOutputStream31);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter35 = xomDriver26.createWriter((java.io.OutputStream) customObjectOutputStream31);
        java.io.Writer writer36 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer37 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter38 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer36, xmlFriendlyReplacer37);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup39 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper40 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper41 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper40);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper42 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper41);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider43 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter44 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper41, reflectionProvider43);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter45 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper41);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller46 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter38, converterLookup39, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper41);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup47 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper48 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller49 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter38, converterLookup47, classMapper48);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter50 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter51 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter52 = saxWriter51.underlyingWriter();
        referenceByIdMarshaller49.put((java.lang.Object) saxWriter50, (java.lang.Object) saxWriter51);
        com.thoughtworks.xstream.XStream xStream54 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter55 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream54.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter55);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup57 = xStream54.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper58 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper59 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper58);
        com.thoughtworks.xstream.mapper.ClassAliasingMapper classAliasingMapper60 = new com.thoughtworks.xstream.mapper.ClassAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper59);
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller62 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) saxWriter51, converterLookup57, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper59, (int) 'a');
        try {
            enumMapConverter11.marshal((java.lang.Object) cachingMapper20, hierarchicalStreamWriter35, (com.thoughtworks.xstream.converters.MarshallingContext) referenceByXPathMarshaller62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertNotNull(classLoader21);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter28);
        org.junit.Assert.assertNotNull(putField32);
        org.junit.Assert.assertNotNull(putField33);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter34);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter35);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter52);
        org.junit.Assert.assertNotNull(converterLookup57);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker serializationMethodInvoker0 = new com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker();
        java.lang.Class class1 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper2 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper3 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper2);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper4 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper3);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider5 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter6 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper3, reflectionProvider5);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter7 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper3);
        java.lang.String str9 = xmlFriendlyMapper3.mapNameToXML("");
        com.thoughtworks.xstream.mapper.CachingMapper cachingMapper10 = new com.thoughtworks.xstream.mapper.CachingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper3);
        java.io.Writer writer11 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer12 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter13 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer11, xmlFriendlyReplacer12);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup14 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper15 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper16 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper15);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper17 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper16);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider18 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter19 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper16, reflectionProvider18);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter20 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper16);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller21 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter13, converterLookup14, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper16);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback22 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream23 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback22);
        java.io.ObjectOutputStream.PutField putField24 = customObjectOutputStream23.putFields();
        java.io.Writer writer25 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer26 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter27 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer25, xmlFriendlyReplacer26);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup28 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper29 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper30 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper29);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper31 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper30);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider32 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter33 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper30, reflectionProvider32);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter34 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper30);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller35 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter27, converterLookup28, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper30);
        referenceByIdMarshaller21.put((java.lang.Object) customObjectOutputStream23, (java.lang.Object) referenceByIdMarshaller35);
        try {
            serializationMethodInvoker0.callWriteObject(class1, (java.lang.Object) xmlFriendlyMapper3, (java.io.ObjectOutputStream) customObjectOutputStream23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(putField24);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.converters.extended.JavaClassConverter javaClassConverter1 = new com.thoughtworks.xstream.converters.extended.JavaClassConverter(classLoader0);
        java.net.URL uRL3 = classLoader0.getResource("enum-type");
        org.junit.Assert.assertNotNull(classLoader0);
        org.junit.Assert.assertNull(uRL3);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        java.io.File file0 = null;
        com.thoughtworks.xstream.persistence.FileStreamStrategy fileStreamStrategy1 = new com.thoughtworks.xstream.persistence.FileStreamStrategy(file0);
        boolean b3 = fileStreamStrategy1.containsKey((java.lang.Object) (-1L));
        java.io.Writer writer4 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer7 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter8 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer4, xmlFriendlyReplacer7);
        try {
            java.lang.Object obj9 = fileStreamStrategy1.remove((java.lang.Object) writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider pureJavaReflectionProvider0 = new com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider();
        java.lang.ClassLoader classLoader1 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper2 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader1);
        java.lang.Class class3 = null;
        boolean b5 = defaultMapper2.shouldSerializeMember(class3, "");
        java.lang.Class class6 = null;
        boolean b8 = defaultMapper2.shouldSerializeMember(class6, "enum-type");
        java.lang.Class class10 = null;
        try {
            java.lang.Class class11 = pureJavaReflectionProvider0.getFieldType((java.lang.Object) defaultMapper2, "enum-type", class10);
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.converters.reflection.ObjectAccessException");
        } catch (com.thoughtworks.xstream.converters.reflection.ObjectAccessException e) {
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        com.thoughtworks.xstream.io.xml.DomDriver domDriver0 = new com.thoughtworks.xstream.io.xml.DomDriver();
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback1 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream2 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback1);
        java.io.ObjectOutputStream.PutField putField3 = customObjectOutputStream2.putFields();
        java.io.ObjectOutputStream.PutField putField4 = customObjectOutputStream2.putFields();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter5 = domDriver0.createWriter((java.io.OutputStream) customObjectOutputStream2);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider6 = null;
        com.thoughtworks.xstream.XStream xStream7 = new com.thoughtworks.xstream.XStream(reflectionProvider6);
        org.jdom.Element element8 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer9 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader10 = new com.thoughtworks.xstream.io.xml.JDomReader(element8, xmlFriendlyReplacer9);
        java.lang.Object obj11 = jDomReader10.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup12 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper13 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper14 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper13);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper15 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper14);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller16 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider6, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader10, converterLookup12, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper15);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback17 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream18 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller16, streamCallback17);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback19 = customObjectInputStream18.popCallback();
        try {
            com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader20 = domDriver0.createReader((java.io.InputStream) customObjectInputStream18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(putField3);
        org.junit.Assert.assertNotNull(putField4);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(customObjectInputStream18);
        org.junit.Assert.assertNull(streamCallback19);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup11 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper12 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller13 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup11, classMapper12);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter14 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter15 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter16 = saxWriter15.underlyingWriter();
        referenceByIdMarshaller13.put((java.lang.Object) saxWriter14, (java.lang.Object) saxWriter15);
        com.thoughtworks.xstream.XStream xStream18 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter19 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream18.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter19);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup21 = xStream18.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper22 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper23 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper22);
        com.thoughtworks.xstream.mapper.ClassAliasingMapper classAliasingMapper24 = new com.thoughtworks.xstream.mapper.ClassAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper23);
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller26 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) saxWriter15, converterLookup21, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper23, (int) 'a');
        saxWriter15.close();
        org.xml.sax.ContentHandler contentHandler28 = saxWriter15.getContentHandler();
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter16);
        org.junit.Assert.assertNotNull(converterLookup21);
        org.junit.Assert.assertNull(contentHandler28);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        java.lang.String str0 = com.thoughtworks.xstream.io.xml.SaxWriter.SOURCE_OBJECT_LIST_PROPERTY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://com.thoughtworks.xstream/sax/property/source-object-list" + "'", str0.equals("http://com.thoughtworks.xstream/sax/property/source-object-list"));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        com.thoughtworks.xstream.converters.extended.ISO8601DateConverter iSO8601DateConverter0 = new com.thoughtworks.xstream.converters.extended.ISO8601DateConverter();
        try {
            java.lang.Object obj2 = iSO8601DateConverter0.fromString("dynamic-proxy");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.converters.ConversionException");
        } catch (com.thoughtworks.xstream.converters.ConversionException e) {
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap0 = null;
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap1 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer4 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XomDriver xomDriver5 = new com.thoughtworks.xstream.io.xml.XomDriver(xmlFriendlyReplacer4);
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver6 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap1, xmlFriendlyReplacer4);
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver7 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap0, xmlFriendlyReplacer4);
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap8 = null;
        staxDriver7.setQnameMap(qNameMap8);
        java.io.Reader reader10 = null;
        try {
            com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader11 = staxDriver7.createReader(reader10);
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
        }
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        javax.xml.transform.Source source0 = null;
        org.xml.sax.InputSource inputSource1 = javax.xml.transform.sax.SAXSource.sourceToInputSource(source0);
        org.junit.Assert.assertNull(inputSource1);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        short s0 = java.io.ObjectStreamConstants.STREAM_MAGIC;
        org.junit.Assert.assertTrue(s0 == (short) -21267);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter4 = attributeMapper2.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.converters.collections.TreeMapConverter treeMapConverter5 = new com.thoughtworks.xstream.converters.collections.TreeMapConverter((com.thoughtworks.xstream.mapper.Mapper) attributeMapper2);
        java.lang.Class class6 = null;
        try {
            boolean b7 = treeMapConverter5.canConvert(class6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(singleValueConverter4);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        com.thoughtworks.xstream.converters.extended.ColorConverter colorConverter0 = new com.thoughtworks.xstream.converters.extended.ColorConverter();
        java.lang.Class class1 = null;
        try {
            boolean b2 = colorConverter0.canConvert(class1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy.RELATIVE = '4';
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter0 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter1 = saxWriter0.underlyingWriter();
        com.thoughtworks.xstream.io.StatefulWriter statefulWriter2 = new com.thoughtworks.xstream.io.StatefulWriter(hierarchicalStreamWriter1);
        try {
            statefulWriter2.addAttribute("dynamic-proxy", "defined-in");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter1);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper2 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.mapper.EnumMapper enumMapper3 = new com.thoughtworks.xstream.mapper.EnumMapper((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper2);
        com.thoughtworks.xstream.mapper.AttributeAliasingMapper attributeAliasingMapper4 = new com.thoughtworks.xstream.mapper.AttributeAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) enumMapper3);
        com.thoughtworks.xstream.mapper.DefaultImplementationsMapper defaultImplementationsMapper5 = new com.thoughtworks.xstream.mapper.DefaultImplementationsMapper((com.thoughtworks.xstream.mapper.Mapper) enumMapper3);
        java.lang.Class class6 = null;
        try {
            java.lang.Class class7 = defaultImplementationsMapper5.defaultImplementationOf(class6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream12 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller10, streamCallback11);
        byte[] byte_array17 = new byte[] { (byte) 115, (byte) 113, (byte) 1, (byte) 100 };
        try {
            customObjectInputStream12.readFully(byte_array17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(customObjectInputStream12);
        org.junit.Assert.assertNotNull(byte_array17);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        org.jdom.Element element2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader4 = new com.thoughtworks.xstream.io.xml.JDomReader(element2, xmlFriendlyReplacer3);
        java.lang.Object obj5 = jDomReader4.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup6 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper7 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper8 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper7);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper9 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper8);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller10 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider0, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader4, converterLookup6, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream12 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller10, streamCallback11);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback13 = customObjectInputStream12.peekCallback();
        try {
            byte byte14 = customObjectInputStream12.readByte();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(customObjectInputStream12);
        org.junit.Assert.assertNull(streamCallback13);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter4 = attributeMapper2.getConverterFromAttribute("dynamic-proxy");
        java.lang.Class class5 = null;
        attributeMapper2.addAttributeFor(class5);
        com.thoughtworks.xstream.converters.collections.CollectionConverter collectionConverter7 = new com.thoughtworks.xstream.converters.collections.CollectionConverter((com.thoughtworks.xstream.mapper.Mapper) attributeMapper2);
        com.thoughtworks.xstream.converters.extended.SubjectConverter subjectConverter8 = new com.thoughtworks.xstream.converters.extended.SubjectConverter((com.thoughtworks.xstream.mapper.Mapper) attributeMapper2);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter10 = attributeMapper2.getConverterFromAttribute("");
        org.junit.Assert.assertNull(singleValueConverter4);
        org.junit.Assert.assertNull(singleValueConverter10);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper2 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.mapper.AttributeAliasingMapper attributeAliasingMapper3 = new com.thoughtworks.xstream.mapper.AttributeAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper2);
        try {
            java.lang.String str5 = attributeAliasingMapper3.attributeForAlias("dynamic-proxy");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper1 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader0);
        java.lang.Class class2 = null;
        boolean b4 = defaultMapper1.shouldSerializeMember(class2, "");
        java.lang.Class class5 = null;
        boolean b7 = defaultMapper1.shouldSerializeMember(class5, "enum-type");
        com.thoughtworks.xstream.alias.ClassMapper classMapper8 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper9 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper8);
        com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider pureJavaReflectionProvider10 = new com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider();
        com.thoughtworks.xstream.converters.reflection.ReflectionConverter reflectionConverter11 = new com.thoughtworks.xstream.converters.reflection.ReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) classMapper8, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider10);
        com.thoughtworks.xstream.annotations.AnnotationProvider annotationProvider12 = null;
        com.thoughtworks.xstream.annotations.AnnotationReflectionConverter annotationReflectionConverter13 = new com.thoughtworks.xstream.annotations.AnnotationReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) defaultMapper1, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider10, annotationProvider12);
        com.thoughtworks.xstream.alias.ClassMapper classMapper14 = null;
        com.thoughtworks.xstream.io.xml.Dom4JDriver dom4JDriver15 = new com.thoughtworks.xstream.io.xml.Dom4JDriver();
        org.dom4j.io.OutputFormat outputFormat16 = null;
        dom4JDriver15.setOutputFormat(outputFormat16);
        org.dom4j.DocumentFactory documentFactory18 = null;
        dom4JDriver15.setDocumentFactory(documentFactory18);
        com.thoughtworks.xstream.XStream xStream20 = new com.thoughtworks.xstream.XStream((com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider10, classMapper14, (com.thoughtworks.xstream.io.HierarchicalStreamDriver) dom4JDriver15);
        com.thoughtworks.xstream.alias.ClassMapper classMapper21 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper22 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper21);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper23 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper22);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider24 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter25 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper22, reflectionProvider24);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter26 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper22);
        java.lang.ClassLoader classLoader27 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper28 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader27);
        java.lang.Class class29 = null;
        boolean b31 = defaultMapper28.shouldSerializeMember(class29, "");
        java.lang.Class class32 = null;
        boolean b34 = defaultMapper28.shouldSerializeMember(class32, "enum-type");
        com.thoughtworks.xstream.alias.ClassMapper classMapper35 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper36 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper35);
        com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider pureJavaReflectionProvider37 = new com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider();
        com.thoughtworks.xstream.converters.reflection.ReflectionConverter reflectionConverter38 = new com.thoughtworks.xstream.converters.reflection.ReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) classMapper35, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider37);
        com.thoughtworks.xstream.annotations.AnnotationProvider annotationProvider39 = null;
        com.thoughtworks.xstream.annotations.AnnotationReflectionConverter annotationReflectionConverter40 = new com.thoughtworks.xstream.annotations.AnnotationReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) defaultMapper28, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider37, annotationProvider39);
        com.thoughtworks.xstream.alias.ClassMapper classMapper41 = null;
        com.thoughtworks.xstream.io.xml.Dom4JDriver dom4JDriver42 = new com.thoughtworks.xstream.io.xml.Dom4JDriver();
        org.dom4j.io.OutputFormat outputFormat43 = null;
        dom4JDriver42.setOutputFormat(outputFormat43);
        org.dom4j.DocumentFactory documentFactory45 = null;
        dom4JDriver42.setDocumentFactory(documentFactory45);
        com.thoughtworks.xstream.XStream xStream47 = new com.thoughtworks.xstream.XStream((com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider37, classMapper41, (com.thoughtworks.xstream.io.HierarchicalStreamDriver) dom4JDriver42);
        try {
            com.thoughtworks.xstream.XStream xStream48 = new com.thoughtworks.xstream.XStream((com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider10, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper22, (com.thoughtworks.xstream.io.HierarchicalStreamDriver) dom4JDriver42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(classLoader0);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(classLoader27);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == true);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        com.thoughtworks.xstream.XStreamer xStreamer0 = new com.thoughtworks.xstream.XStreamer();
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XomDriver xomDriver4 = new com.thoughtworks.xstream.io.xml.XomDriver(xmlFriendlyReplacer3);
        com.thoughtworks.xstream.io.xml.XppDriver xppDriver5 = new com.thoughtworks.xstream.io.xml.XppDriver(xmlFriendlyReplacer3);
        try {
            java.lang.Object obj7 = xStreamer0.fromXML((com.thoughtworks.xstream.io.HierarchicalStreamDriver) xppDriver5, "dynamic-proxy");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
        }
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper1 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader0);
        java.lang.Class class2 = null;
        boolean b4 = defaultMapper1.shouldSerializeMember(class2, "");
        java.lang.Class class5 = null;
        boolean b7 = defaultMapper1.shouldSerializeMember(class5, "enum-type");
        com.thoughtworks.xstream.alias.ClassMapper classMapper8 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper9 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper8);
        com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider pureJavaReflectionProvider10 = new com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider();
        com.thoughtworks.xstream.converters.reflection.ReflectionConverter reflectionConverter11 = new com.thoughtworks.xstream.converters.reflection.ReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) classMapper8, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider10);
        com.thoughtworks.xstream.annotations.AnnotationProvider annotationProvider12 = null;
        com.thoughtworks.xstream.annotations.AnnotationReflectionConverter annotationReflectionConverter13 = new com.thoughtworks.xstream.annotations.AnnotationReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) defaultMapper1, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider10, annotationProvider12);
        com.thoughtworks.xstream.alias.ClassMapper classMapper14 = null;
        com.thoughtworks.xstream.io.xml.Dom4JDriver dom4JDriver15 = new com.thoughtworks.xstream.io.xml.Dom4JDriver();
        org.dom4j.io.OutputFormat outputFormat16 = null;
        dom4JDriver15.setOutputFormat(outputFormat16);
        org.dom4j.DocumentFactory documentFactory18 = null;
        dom4JDriver15.setDocumentFactory(documentFactory18);
        com.thoughtworks.xstream.XStream xStream20 = new com.thoughtworks.xstream.XStream((com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider10, classMapper14, (com.thoughtworks.xstream.io.HierarchicalStreamDriver) dom4JDriver15);
        com.thoughtworks.xstream.alias.ClassMapper classMapper21 = null;
        com.thoughtworks.xstream.converters.javabean.JavaBeanConverter javaBeanConverter23 = new com.thoughtworks.xstream.converters.javabean.JavaBeanConverter(classMapper21, "hi!");
        xStream20.registerConverter((com.thoughtworks.xstream.converters.Converter) javaBeanConverter23);
        com.thoughtworks.xstream.converters.Converter converter25 = null;
        xStream20.registerConverter(converter25);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter27 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter28 = saxWriter27.underlyingWriter();
        com.thoughtworks.xstream.alias.ClassMapper classMapper29 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup30 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper29);
        com.thoughtworks.xstream.alias.ClassMapper classMapper31 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper32 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper31);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper33 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper32);
        java.lang.String str35 = xmlFriendlyMapper32.mapNameToXML("hi!");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider36 = null;
        com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter cGLIBEnhancedConverter37 = new com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper32, reflectionProvider36);
        defaultConverterLookup30.registerConverter((com.thoughtworks.xstream.converters.Converter) cGLIBEnhancedConverter37, 0);
        com.thoughtworks.xstream.alias.ClassMapper classMapper40 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper41 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper40);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper42 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper41);
        com.thoughtworks.xstream.mapper.ArrayMapper arrayMapper43 = new com.thoughtworks.xstream.mapper.ArrayMapper((com.thoughtworks.xstream.mapper.Mapper) attributeMapper42);
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller45 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) saxWriter27, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup30, (com.thoughtworks.xstream.mapper.Mapper) arrayMapper43, 1003);
        try {
            java.lang.String str46 = xStream20.toXML((java.lang.Object) referenceByXPathMarshaller45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(classLoader0);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter28);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper2 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        dynamicProxyMapper2.setAlias("hi!");
        com.thoughtworks.xstream.alias.ClassMapper classMapper5 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper6 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper5);
        com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider pureJavaReflectionProvider7 = new com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider();
        com.thoughtworks.xstream.converters.reflection.ReflectionConverter reflectionConverter8 = new com.thoughtworks.xstream.converters.reflection.ReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) classMapper5, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider7);
        com.thoughtworks.xstream.annotations.AnnotationProvider annotationProvider9 = new com.thoughtworks.xstream.annotations.AnnotationProvider();
        com.thoughtworks.xstream.annotations.AnnotationReflectionConverter annotationReflectionConverter10 = new com.thoughtworks.xstream.annotations.AnnotationReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper2, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider7, annotationProvider9);
        com.thoughtworks.xstream.alias.ClassMapper classMapper11 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper12 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper11);
        com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider pureJavaReflectionProvider13 = new com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider();
        com.thoughtworks.xstream.converters.reflection.ReflectionConverter reflectionConverter14 = new com.thoughtworks.xstream.converters.reflection.ReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) classMapper11, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider13);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider15 = null;
        com.thoughtworks.xstream.XStream xStream16 = new com.thoughtworks.xstream.XStream(reflectionProvider15);
        org.jdom.Element element17 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer18 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader19 = new com.thoughtworks.xstream.io.xml.JDomReader(element17, xmlFriendlyReplacer18);
        java.lang.Object obj20 = jDomReader19.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup21 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper22 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper23 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper22);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper24 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper23);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller25 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider15, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader19, converterLookup21, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper24);
        com.thoughtworks.xstream.alias.ClassMapper classMapper26 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper27 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper26);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper28 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper27);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider29 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter30 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper27, reflectionProvider29);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter31 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper27);
        java.lang.String str33 = xmlFriendlyMapper27.mapNameToXML("");
        com.thoughtworks.xstream.mapper.CachingMapper cachingMapper34 = new com.thoughtworks.xstream.mapper.CachingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper27);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider35 = null;
        com.thoughtworks.xstream.XStream xStream36 = new com.thoughtworks.xstream.XStream(reflectionProvider35);
        org.jdom.Element element37 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer38 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader39 = new com.thoughtworks.xstream.io.xml.JDomReader(element37, xmlFriendlyReplacer38);
        java.lang.Object obj40 = jDomReader39.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup41 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper42 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper43 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper42);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper44 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper43);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller45 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider35, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader39, converterLookup41, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper44);
        java.io.Writer writer46 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer47 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter48 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer46, xmlFriendlyReplacer47);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup49 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper50 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper51 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper50);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper52 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper51);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider53 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter54 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper51, reflectionProvider53);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter55 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper51);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller56 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter48, converterLookup49, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper51);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup57 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper58 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller59 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter48, converterLookup57, classMapper58);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter60 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter61 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter62 = saxWriter61.underlyingWriter();
        referenceByIdMarshaller59.put((java.lang.Object) saxWriter60, (java.lang.Object) saxWriter61);
        com.thoughtworks.xstream.XStream xStream64 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter65 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream64.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter65);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup67 = xStream64.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper68 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper69 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper68);
        com.thoughtworks.xstream.mapper.ClassAliasingMapper classAliasingMapper70 = new com.thoughtworks.xstream.mapper.ClassAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper69);
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller72 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) saxWriter61, converterLookup67, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper69, (int) 'a');
        com.thoughtworks.xstream.alias.ClassMapper classMapper73 = null;
        com.thoughtworks.xstream.core.ReferenceByIdUnmarshaller referenceByIdUnmarshaller74 = new com.thoughtworks.xstream.core.ReferenceByIdUnmarshaller((java.lang.Object) cachingMapper34, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader39, converterLookup67, classMapper73);
        try {
            java.lang.Object obj75 = annotationReflectionConverter10.doUnmarshal((java.lang.Object) reflectionConverter14, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader19, (com.thoughtworks.xstream.converters.UnmarshallingContext) referenceByIdUnmarshaller74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter62);
        org.junit.Assert.assertNotNull(converterLookup67);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        com.thoughtworks.xstream.io.xml.XppDriver xppDriver0 = new com.thoughtworks.xstream.io.xml.XppDriver();
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback1 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream2 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback1);
        java.io.ObjectOutputStream.PutField putField3 = customObjectOutputStream2.putFields();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter4 = xppDriver0.createWriter((java.io.OutputStream) customObjectOutputStream2);
        com.thoughtworks.xstream.XStream xStream5 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter6 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream5.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter6);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup8 = xStream5.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper9 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper10 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper9);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper11 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper10);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter13 = attributeMapper11.getConverterFromAttribute("dynamic-proxy");
        java.lang.Class class14 = null;
        attributeMapper11.addAttributeFor(class14);
        com.thoughtworks.xstream.converters.collections.CollectionConverter collectionConverter16 = new com.thoughtworks.xstream.converters.collections.CollectionConverter((com.thoughtworks.xstream.mapper.Mapper) attributeMapper11);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller17 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller(hierarchicalStreamWriter4, converterLookup8, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper11);
        java.lang.Class class19 = null;
        try {
            com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter20 = attributeMapper11.getConverterFromItemType("[]", class19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(putField3);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter4);
        org.junit.Assert.assertNotNull(converterLookup8);
        org.junit.Assert.assertNull(singleValueConverter13);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker serializationMethodInvoker0 = new com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker();
        java.io.Writer writer1 = null;
        java.io.Writer writer2 = null;
        java.io.Writer writer3 = null;
        char[] char_array8 = new char[] { 'a', '4', '4', ' ' };
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter9 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer3, char_array8);
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter10 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer2, char_array8);
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter11 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer1, char_array8);
        java.lang.Object obj12 = serializationMethodInvoker0.callWriteReplace((java.lang.Object) prettyPrintWriter11);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider13 = null;
        com.thoughtworks.xstream.XStream xStream14 = new com.thoughtworks.xstream.XStream(reflectionProvider13);
        org.jdom.Element element15 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer16 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader17 = new com.thoughtworks.xstream.io.xml.JDomReader(element15, xmlFriendlyReplacer16);
        java.lang.Object obj18 = jDomReader17.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup19 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper20 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper21 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper20);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper22 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper21);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller23 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider13, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader17, converterLookup19, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper22);
        java.lang.Object obj24 = serializationMethodInvoker0.callReadResolve((java.lang.Object) jDomReader17);
        java.lang.Class class25 = null;
        com.thoughtworks.xstream.XStream xStream26 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter27 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream26.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter27);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup29 = xStream26.getConverterLookup();
        com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy referenceByXPathMarshallingStrategy31 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy((int) (byte) 0);
        xStream26.setMarshallingStrategy((com.thoughtworks.xstream.MarshallingStrategy) referenceByXPathMarshallingStrategy31);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider33 = null;
        com.thoughtworks.xstream.XStream xStream34 = new com.thoughtworks.xstream.XStream(reflectionProvider33);
        org.jdom.Element element35 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer36 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader37 = new com.thoughtworks.xstream.io.xml.JDomReader(element35, xmlFriendlyReplacer36);
        java.lang.Object obj38 = jDomReader37.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup39 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper40 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper41 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper40);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper42 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper41);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller43 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider33, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader37, converterLookup39, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper42);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback44 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream45 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller43, streamCallback44);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback46 = customObjectInputStream45.popCallback();
        try {
            serializationMethodInvoker0.callReadObject(class25, (java.lang.Object) xStream26, (java.io.ObjectInputStream) customObjectInputStream45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(char_array8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(converterLookup29);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(customObjectInputStream45);
        org.junit.Assert.assertNull(streamCallback46);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        nu.xom.Element element0 = null;
        com.thoughtworks.xstream.io.path.Path path2 = new com.thoughtworks.xstream.io.path.Path("");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider3 = null;
        com.thoughtworks.xstream.XStream xStream4 = new com.thoughtworks.xstream.XStream(reflectionProvider3);
        org.jdom.Element element5 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer6 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader7 = new com.thoughtworks.xstream.io.xml.JDomReader(element5, xmlFriendlyReplacer6);
        java.lang.Object obj8 = jDomReader7.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup9 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper10 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper11 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper10);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper12 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller13 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider3, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader7, converterLookup9, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper12);
        java.lang.Runnable runnable14 = null;
        treeUnmarshaller13.addCompletionCallback(runnable14, 0);
        java.lang.Object obj17 = treeUnmarshaller13.currentObject();
        nu.xom.Element element18 = null;
        java.io.Writer writer19 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer22 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter23 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer19, xmlFriendlyReplacer22);
        com.thoughtworks.xstream.io.xml.XomReader xomReader24 = new com.thoughtworks.xstream.io.xml.XomReader(element18, xmlFriendlyReplacer22);
        java.lang.Object obj25 = null;
        treeUnmarshaller13.put((java.lang.Object) xmlFriendlyReplacer22, obj25);
        boolean b27 = path2.equals((java.lang.Object) xmlFriendlyReplacer22);
        com.thoughtworks.xstream.io.xml.XomWriter xomWriter28 = new com.thoughtworks.xstream.io.xml.XomWriter(element0, xmlFriendlyReplacer22);
        try {
            xomWriter28.endNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        com.thoughtworks.xstream.converters.extended.SqlTimeConverter sqlTimeConverter0 = new com.thoughtworks.xstream.converters.extended.SqlTimeConverter();
        try {
            java.lang.Object obj2 = sqlTimeConverter0.fromString("dynamic-proxy");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper1 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader0);
        java.lang.Class class2 = null;
        boolean b4 = defaultMapper1.shouldSerializeMember(class2, "");
        java.lang.Class class5 = null;
        boolean b7 = defaultMapper1.shouldSerializeMember(class5, "enum-type");
        com.thoughtworks.xstream.alias.ClassMapper classMapper8 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper9 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper8);
        com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider pureJavaReflectionProvider10 = new com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider();
        com.thoughtworks.xstream.converters.reflection.ReflectionConverter reflectionConverter11 = new com.thoughtworks.xstream.converters.reflection.ReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) classMapper8, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider10);
        com.thoughtworks.xstream.annotations.AnnotationProvider annotationProvider12 = null;
        com.thoughtworks.xstream.annotations.AnnotationReflectionConverter annotationReflectionConverter13 = new com.thoughtworks.xstream.annotations.AnnotationReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) defaultMapper1, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider10, annotationProvider12);
        com.thoughtworks.xstream.alias.ClassMapper classMapper14 = null;
        com.thoughtworks.xstream.io.xml.Dom4JDriver dom4JDriver15 = new com.thoughtworks.xstream.io.xml.Dom4JDriver();
        org.dom4j.io.OutputFormat outputFormat16 = null;
        dom4JDriver15.setOutputFormat(outputFormat16);
        org.dom4j.DocumentFactory documentFactory18 = null;
        dom4JDriver15.setDocumentFactory(documentFactory18);
        com.thoughtworks.xstream.XStream xStream20 = new com.thoughtworks.xstream.XStream((com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider10, classMapper14, (com.thoughtworks.xstream.io.HierarchicalStreamDriver) dom4JDriver15);
        java.lang.Class class22 = null;
        try {
            xStream20.aliasType("", class22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(classLoader0);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.converters.extended.JavaClassConverter javaClassConverter1 = new com.thoughtworks.xstream.converters.extended.JavaClassConverter(classLoader0);
        try {
            java.lang.Object obj3 = javaClassConverter1.fromString("http://com.thoughtworks.xstream/sax/property/source-object-list");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.converters.ConversionException");
        } catch (com.thoughtworks.xstream.converters.ConversionException e) {
        }
        org.junit.Assert.assertNotNull(classLoader0);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamDriver hierarchicalStreamDriver1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream(reflectionProvider0, hierarchicalStreamDriver1);
        com.thoughtworks.xstream.alias.ClassMapper classMapper3 = null;
        com.thoughtworks.xstream.converters.javabean.JavaBeanConverter javaBeanConverter5 = new com.thoughtworks.xstream.converters.javabean.JavaBeanConverter(classMapper3, "");
        xStream2.registerConverter((com.thoughtworks.xstream.converters.Converter) javaBeanConverter5);
        com.thoughtworks.xstream.converters.basic.FloatConverter floatConverter7 = new com.thoughtworks.xstream.converters.basic.FloatConverter();
        xStream2.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) floatConverter7);
        try {
            java.lang.Object obj10 = floatConverter7.fromString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter4 = attributeMapper2.getConverterFromAttribute("dynamic-proxy");
        java.lang.Class class5 = null;
        attributeMapper2.addAttributeFor(class5);
        com.thoughtworks.xstream.converters.collections.CollectionConverter collectionConverter7 = new com.thoughtworks.xstream.converters.collections.CollectionConverter((com.thoughtworks.xstream.mapper.Mapper) attributeMapper2);
        com.thoughtworks.xstream.converters.extended.SubjectConverter subjectConverter8 = new com.thoughtworks.xstream.converters.extended.SubjectConverter((com.thoughtworks.xstream.mapper.Mapper) attributeMapper2);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter10 = attributeMapper2.getConverterFromAttribute("http://com.thoughtworks.xstream/XStreamSource/feature");
        java.lang.Class class11 = null;
        try {
            java.lang.Class class12 = attributeMapper2.defaultImplementationOf(class11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(singleValueConverter4);
        org.junit.Assert.assertNull(singleValueConverter10);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper1 = null;
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap2 = null;
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver4 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap2, true);
        com.thoughtworks.xstream.XStream xStream6 = new com.thoughtworks.xstream.XStream(reflectionProvider0, classMapper1, (com.thoughtworks.xstream.io.HierarchicalStreamDriver) staxDriver4, "hi!");
        boolean b7 = staxDriver4.isRepairingNamespace();
        javax.xml.stream.XMLInputFactory xMLInputFactory8 = staxDriver4.getInputFactory();
        staxDriver4.setRepairingNamespace(false);
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap11 = staxDriver4.getQnameMap();
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(xMLInputFactory8);
        org.junit.Assert.assertNull(qNameMap11);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        com.thoughtworks.xstream.XStream xStream0 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter1 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream0.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter1);
        com.thoughtworks.xstream.MarshallingStrategy marshallingStrategy3 = null;
        xStream0.setMarshallingStrategy(marshallingStrategy3);
        com.thoughtworks.xstream.converters.collections.BitSetConverter bitSetConverter5 = new com.thoughtworks.xstream.converters.collections.BitSetConverter();
        xStream0.registerConverter((com.thoughtworks.xstream.converters.Converter) bitSetConverter5, (int) (byte) 126);
        com.thoughtworks.xstream.converters.extended.ThrowableConverter throwableConverter8 = new com.thoughtworks.xstream.converters.extended.ThrowableConverter((com.thoughtworks.xstream.converters.Converter) bitSetConverter5);
        java.lang.Class class9 = null;
        try {
            boolean b10 = throwableConverter8.canConvert(class9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        com.thoughtworks.xstream.converters.extended.ISO8601DateConverter iSO8601DateConverter0 = new com.thoughtworks.xstream.converters.extended.ISO8601DateConverter();
        java.io.File file1 = null;
        com.thoughtworks.xstream.persistence.FileStreamStrategy fileStreamStrategy2 = new com.thoughtworks.xstream.persistence.FileStreamStrategy(file1);
        java.lang.Object obj4 = fileStreamStrategy2.get((java.lang.Object) 'a');
        try {
            java.lang.String str5 = iSO8601DateConverter0.toString((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        java.io.Writer writer2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter4 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer2, xmlFriendlyReplacer3);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup5 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper6 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper7 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper6);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper8 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper7);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider9 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter10 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper7, reflectionProvider9);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter11 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper7);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller12 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter4, converterLookup5, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper7);
        com.thoughtworks.xstream.converters.enums.EnumMapConverter enumMapConverter13 = new com.thoughtworks.xstream.converters.enums.EnumMapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper7);
        xStream1.registerConverter((com.thoughtworks.xstream.converters.Converter) enumMapConverter13);
        java.lang.Class class15 = null;
        boolean b16 = enumMapConverter13.canConvert(class15);
        java.lang.Class class17 = null;
        boolean b18 = enumMapConverter13.canConvert(class17);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter3 = compactWriter2.underlyingWriter();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup4 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper5 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper6 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller.IDGenerator iDGenerator7 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller8 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup4, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper6, iDGenerator7);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback9 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream10 = com.thoughtworks.xstream.core.util.CustomObjectOutputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller8, streamCallback9);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider11 = null;
        com.thoughtworks.xstream.XStream xStream12 = new com.thoughtworks.xstream.XStream(reflectionProvider11);
        org.jdom.Element element13 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer14 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader15 = new com.thoughtworks.xstream.io.xml.JDomReader(element13, xmlFriendlyReplacer14);
        java.lang.Object obj16 = jDomReader15.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup17 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper18 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper19 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper18);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper20 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller21 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider11, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader15, converterLookup17, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper20);
        java.lang.Runnable runnable22 = null;
        treeUnmarshaller21.addCompletionCallback(runnable22, 0);
        java.lang.Object obj25 = treeUnmarshaller21.currentObject();
        com.thoughtworks.xstream.converters.extended.GregorianCalendarConverter gregorianCalendarConverter26 = new com.thoughtworks.xstream.converters.extended.GregorianCalendarConverter();
        try {
            referenceByIdMarshaller8.convert(obj25, (com.thoughtworks.xstream.converters.Converter) gregorianCalendarConverter26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter3);
        org.junit.Assert.assertNotNull(customObjectOutputStream10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        java.util.List list0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter2 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream1.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter2);
        com.thoughtworks.xstream.MarshallingStrategy marshallingStrategy4 = null;
        xStream1.setMarshallingStrategy(marshallingStrategy4);
        xStream1.aliasAttribute("http://com.thoughtworks.xstream/XStreamSource/feature", "class");
        java.lang.ClassLoader classLoader9 = xStream1.getClassLoader();
        try {
            com.thoughtworks.xstream.io.xml.TraxSource traxSource10 = new com.thoughtworks.xstream.io.xml.TraxSource(list0, xStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(classLoader9);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        nu.xom.Element element0 = null;
        com.thoughtworks.xstream.io.path.Path path2 = new com.thoughtworks.xstream.io.path.Path("");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider3 = null;
        com.thoughtworks.xstream.XStream xStream4 = new com.thoughtworks.xstream.XStream(reflectionProvider3);
        org.jdom.Element element5 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer6 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader7 = new com.thoughtworks.xstream.io.xml.JDomReader(element5, xmlFriendlyReplacer6);
        java.lang.Object obj8 = jDomReader7.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup9 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper10 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper11 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper10);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper12 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller13 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider3, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader7, converterLookup9, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper12);
        java.lang.Runnable runnable14 = null;
        treeUnmarshaller13.addCompletionCallback(runnable14, 0);
        java.lang.Object obj17 = treeUnmarshaller13.currentObject();
        nu.xom.Element element18 = null;
        java.io.Writer writer19 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer22 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter23 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer19, xmlFriendlyReplacer22);
        com.thoughtworks.xstream.io.xml.XomReader xomReader24 = new com.thoughtworks.xstream.io.xml.XomReader(element18, xmlFriendlyReplacer22);
        java.lang.Object obj25 = null;
        treeUnmarshaller13.put((java.lang.Object) xmlFriendlyReplacer22, obj25);
        boolean b27 = path2.equals((java.lang.Object) xmlFriendlyReplacer22);
        com.thoughtworks.xstream.io.xml.XomWriter xomWriter28 = new com.thoughtworks.xstream.io.xml.XomWriter(element0, xmlFriendlyReplacer22);
        try {
            xomWriter28.addAttribute("http://com.thoughtworks.xstream/XStreamSource/feature", "dynamic-proxy");
            org.junit.Assert.fail("Expected exception of type nu.xom.IllegalNameException");
        } catch (nu.xom.IllegalNameException e) {
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        com.thoughtworks.xstream.converters.extended.StackTraceElementFactory stackTraceElementFactory0 = new com.thoughtworks.xstream.converters.extended.StackTraceElementFactory();
        java.lang.StackTraceElement stackTraceElement3 = stackTraceElementFactory0.nativeMethodElement("", "hi!");
        java.lang.StackTraceElement stackTraceElement6 = stackTraceElementFactory0.nativeMethodElement("class", "http://com.thoughtworks.xstream/XStreamSource/feature");
        java.lang.StackTraceElement stackTraceElement9 = stackTraceElementFactory0.nativeMethodElement("class", "http://com.thoughtworks.xstream/XStreamSource/feature");
        org.junit.Assert.assertNotNull(stackTraceElement3);
        org.junit.Assert.assertNotNull(stackTraceElement6);
        org.junit.Assert.assertNotNull(stackTraceElement9);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper1 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader0);
        com.thoughtworks.xstream.converters.extended.JavaMethodConverter javaMethodConverter2 = new com.thoughtworks.xstream.converters.extended.JavaMethodConverter(classLoader0);
        classLoader0.setPackageAssertionStatus("defined-in", false);
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper7 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader0, "http://com.thoughtworks.xstream/sax/property/source-object-list");
        classLoader0.clearAssertionStatus();
        org.junit.Assert.assertNotNull(classLoader0);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper1 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper0);
        com.thoughtworks.xstream.mapper.ImplicitCollectionMapper implicitCollectionMapper2 = new com.thoughtworks.xstream.mapper.ImplicitCollectionMapper((com.thoughtworks.xstream.mapper.Mapper) classMapper0);
        java.lang.Class class3 = null;
        java.lang.Class class5 = implicitCollectionMapper2.getItemTypeForItemFieldName(class3, "http://com.thoughtworks.xstream/sax/property/source-object-list");
        org.junit.Assert.assertNull(class5);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper1 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader0);
        java.lang.String str2 = defaultMapper1.attributeForEnumType();
        java.lang.String str3 = defaultMapper1.attributeForClassDefiningField();
        java.lang.String str5 = defaultMapper1.attributeForAlias("class");
        java.lang.Class class6 = null;
        java.lang.String str8 = defaultMapper1.realMember(class6, "http://com.thoughtworks.xstream/sax/property/source-object-list");
        org.junit.Assert.assertNotNull(classLoader0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "enum-type" + "'", str2.equals("enum-type"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "defined-in" + "'", str3.equals("defined-in"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "class" + "'", str5.equals("class"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "http://com.thoughtworks.xstream/sax/property/source-object-list" + "'", str8.equals("http://com.thoughtworks.xstream/sax/property/source-object-list"));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer2 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter3 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer2);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter4 = xppDomWriter3.underlyingWriter();
        java.lang.Class class6 = null;
        xppDomWriter3.startNode("class", class6);
        java.io.Writer writer8 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer11 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter12 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer11);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter13 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer8, xmlFriendlyReplacer11);
        com.thoughtworks.xstream.XStream xStream14 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter15 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream14.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter15);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup17 = xStream14.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper18 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper19 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper18);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper20 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter22 = attributeMapper20.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller23 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter13, converterLookup17, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper20);
        com.thoughtworks.xstream.alias.ClassMapper classMapper24 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller25 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) xppDomWriter3, converterLookup17, classMapper24);
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom26 = xppDomWriter3.getConfiguration();
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom27 = xppDomWriter3.getConfiguration();
        java.lang.String str28 = xpp3Dom27.getName();
        java.lang.String[] str_array29 = xpp3Dom27.getAttributeNames();
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter4);
        org.junit.Assert.assertNotNull(converterLookup17);
        org.junit.Assert.assertNull(singleValueConverter22);
        org.junit.Assert.assertNotNull(xpp3Dom26);
        org.junit.Assert.assertNotNull(xpp3Dom27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "class" + "'", str28.equals("class"));
        org.junit.Assert.assertNotNull(str_array29);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy referenceByXPathMarshallingStrategy1 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy((int) (byte) 1);
        java.io.Writer writer2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer5 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter6 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer2, xmlFriendlyReplacer5);
        com.thoughtworks.xstream.io.xml.XppDomDriver xppDomDriver7 = new com.thoughtworks.xstream.io.xml.XppDomDriver(xmlFriendlyReplacer5);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback8 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream9 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback8);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter10 = xppDomDriver7.createWriter((java.io.OutputStream) customObjectOutputStream9);
        com.thoughtworks.xstream.alias.ClassMapper classMapper11 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup12 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper11);
        com.thoughtworks.xstream.alias.ClassMapper classMapper13 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper14 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper13);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper15 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper14);
        java.lang.String str17 = xmlFriendlyMapper14.mapNameToXML("hi!");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider18 = null;
        com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter cGLIBEnhancedConverter19 = new com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper14, reflectionProvider18);
        defaultConverterLookup12.registerConverter((com.thoughtworks.xstream.converters.Converter) cGLIBEnhancedConverter19, 0);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter22 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter23 = saxWriter22.underlyingWriter();
        com.thoughtworks.xstream.alias.ClassMapper classMapper24 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup25 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper24);
        com.thoughtworks.xstream.alias.ClassMapper classMapper26 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper27 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper26);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper28 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper27);
        java.lang.String str30 = xmlFriendlyMapper27.mapNameToXML("hi!");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider31 = null;
        com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter cGLIBEnhancedConverter32 = new com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper27, reflectionProvider31);
        defaultConverterLookup25.registerConverter((com.thoughtworks.xstream.converters.Converter) cGLIBEnhancedConverter32, 0);
        com.thoughtworks.xstream.alias.ClassMapper classMapper35 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper36 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper35);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper37 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper36);
        com.thoughtworks.xstream.mapper.ArrayMapper arrayMapper38 = new com.thoughtworks.xstream.mapper.ArrayMapper((com.thoughtworks.xstream.mapper.Mapper) attributeMapper37);
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller40 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) saxWriter22, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup25, (com.thoughtworks.xstream.mapper.Mapper) arrayMapper38, 1003);
        com.thoughtworks.xstream.alias.ClassMapper classMapper41 = null;
        org.jdom.Element element42 = null;
        org.jdom.JDOMFactory jDOMFactory43 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer46 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.JDomWriter jDomWriter47 = new com.thoughtworks.xstream.io.xml.JDomWriter(element42, jDOMFactory43, xmlFriendlyReplacer46);
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer50 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter51 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer50);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter52 = xppDomWriter51.underlyingWriter();
        com.thoughtworks.xstream.alias.ClassMapper classMapper53 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper54 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper53);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper55 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper54);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider56 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter57 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper54, reflectionProvider56);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter58 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper54);
        com.thoughtworks.xstream.alias.ClassMapper classMapper59 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup60 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper59);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper61 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper54, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup60);
        com.thoughtworks.xstream.alias.ClassMapper classMapper62 = null;
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller63 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller(hierarchicalStreamWriter52, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup60, classMapper62);
        com.thoughtworks.xstream.alias.ClassMapper classMapper64 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller65 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) jDomWriter47, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup60, classMapper64);
        try {
            referenceByXPathMarshallingStrategy1.marshal(hierarchicalStreamWriter10, (java.lang.Object) 0, defaultConverterLookup25, classMapper41, (com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter10);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter23);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter52);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        com.thoughtworks.xstream.converters.collections.PropertiesConverter propertiesConverter0 = new com.thoughtworks.xstream.converters.collections.PropertiesConverter();
        com.thoughtworks.xstream.alias.ClassMapper classMapper1 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper2 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper1);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper3 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper2);
        com.thoughtworks.xstream.mapper.EnumMapper enumMapper4 = new com.thoughtworks.xstream.mapper.EnumMapper((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper3);
        org.jdom.Element element5 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer6 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader7 = new com.thoughtworks.xstream.io.xml.JDomReader(element5, xmlFriendlyReplacer6);
        java.lang.Object obj8 = jDomReader7.peekUnderlyingNode();
        com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader9 = jDomReader7.underlyingReader();
        com.thoughtworks.xstream.alias.ClassMapper classMapper10 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper11 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper10);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper12 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider13 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter14 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11, reflectionProvider13);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter15 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11);
        com.thoughtworks.xstream.alias.ClassMapper classMapper16 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup17 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper16);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper18 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup17);
        com.thoughtworks.xstream.alias.ClassMapper classMapper19 = null;
        com.thoughtworks.xstream.mapper.DefaultImplementationsMapper defaultImplementationsMapper20 = new com.thoughtworks.xstream.mapper.DefaultImplementationsMapper(classMapper19);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller21 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) dynamicProxyMapper3, hierarchicalStreamReader9, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup17, (com.thoughtworks.xstream.mapper.Mapper) defaultImplementationsMapper20);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider22 = null;
        com.thoughtworks.xstream.XStream xStream23 = new com.thoughtworks.xstream.XStream(reflectionProvider22);
        org.jdom.Element element24 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer25 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader26 = new com.thoughtworks.xstream.io.xml.JDomReader(element24, xmlFriendlyReplacer25);
        java.lang.Object obj27 = jDomReader26.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup28 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper29 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper30 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper29);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper31 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper30);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller32 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider22, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader26, converterLookup28, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper31);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback33 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream34 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller32, streamCallback33);
        try {
            java.lang.Object obj35 = propertiesConverter0.unmarshal(hierarchicalStreamReader9, (com.thoughtworks.xstream.converters.UnmarshallingContext) treeUnmarshaller32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(hierarchicalStreamReader9);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(customObjectInputStream34);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter0 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter1 = saxWriter0.underlyingWriter();
        com.thoughtworks.xstream.io.StatefulWriter statefulWriter2 = new com.thoughtworks.xstream.io.StatefulWriter(hierarchicalStreamWriter1);
        try {
            statefulWriter2.addAttribute("http://com.thoughtworks.xstream/sax/property/source-object-list", "[]");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter1);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.dom4j.Element element0 = null;
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream(reflectionProvider1);
        org.jdom.Element element3 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer4 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader5 = new com.thoughtworks.xstream.io.xml.JDomReader(element3, xmlFriendlyReplacer4);
        java.lang.Object obj6 = jDomReader5.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup7 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper8 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper9 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper8);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper10 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper9);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller11 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider1, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader5, converterLookup7, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper10);
        java.lang.Runnable runnable12 = null;
        treeUnmarshaller11.addCompletionCallback(runnable12, 0);
        java.lang.Object obj15 = treeUnmarshaller11.currentObject();
        nu.xom.Element element16 = null;
        java.io.Writer writer17 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer20 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter21 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer17, xmlFriendlyReplacer20);
        com.thoughtworks.xstream.io.xml.XomReader xomReader22 = new com.thoughtworks.xstream.io.xml.XomReader(element16, xmlFriendlyReplacer20);
        java.lang.Object obj23 = null;
        treeUnmarshaller11.put((java.lang.Object) xmlFriendlyReplacer20, obj23);
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader25 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element0, xmlFriendlyReplacer20);
        dom4JReader25.close();
        java.lang.Object obj27 = dom4JReader25.peekUnderlyingNode();
        try {
            int i28 = dom4JReader25.getAttributeCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        com.thoughtworks.xstream.persistence.StreamStrategy streamStrategy0 = null;
        com.thoughtworks.xstream.persistence.XmlSet xmlSet1 = new com.thoughtworks.xstream.persistence.XmlSet(streamStrategy0);
        try {
            int i2 = xmlSet1.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        com.thoughtworks.xstream.converters.extended.ISO8601SqlTimestampConverter iSO8601SqlTimestampConverter0 = new com.thoughtworks.xstream.converters.extended.ISO8601SqlTimestampConverter();
        com.thoughtworks.xstream.alias.ClassMapper classMapper1 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper2 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper1);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper3 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper2);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider4 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter5 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper2, reflectionProvider4);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter6 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper2);
        java.lang.String str8 = xmlFriendlyMapper2.mapNameToXML("");
        com.thoughtworks.xstream.mapper.CachingMapper cachingMapper9 = new com.thoughtworks.xstream.mapper.CachingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper2);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider10 = null;
        com.thoughtworks.xstream.XStream xStream11 = new com.thoughtworks.xstream.XStream(reflectionProvider10);
        org.jdom.Element element12 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer13 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader14 = new com.thoughtworks.xstream.io.xml.JDomReader(element12, xmlFriendlyReplacer13);
        java.lang.Object obj15 = jDomReader14.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup16 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper17 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper18 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper17);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper19 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper18);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller20 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider10, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader14, converterLookup16, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper19);
        java.io.Writer writer21 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer22 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter23 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer21, xmlFriendlyReplacer22);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup24 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper25 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper26 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper25);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper27 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper26);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider28 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter29 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper26, reflectionProvider28);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter30 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper26);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller31 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter23, converterLookup24, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper26);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup32 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper33 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller34 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter23, converterLookup32, classMapper33);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter35 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter36 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter37 = saxWriter36.underlyingWriter();
        referenceByIdMarshaller34.put((java.lang.Object) saxWriter35, (java.lang.Object) saxWriter36);
        com.thoughtworks.xstream.XStream xStream39 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter40 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream39.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter40);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup42 = xStream39.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper43 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper44 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper43);
        com.thoughtworks.xstream.mapper.ClassAliasingMapper classAliasingMapper45 = new com.thoughtworks.xstream.mapper.ClassAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper44);
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller47 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) saxWriter36, converterLookup42, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper44, (int) 'a');
        com.thoughtworks.xstream.alias.ClassMapper classMapper48 = null;
        com.thoughtworks.xstream.core.ReferenceByIdUnmarshaller referenceByIdUnmarshaller49 = new com.thoughtworks.xstream.core.ReferenceByIdUnmarshaller((java.lang.Object) cachingMapper9, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader14, converterLookup42, classMapper48);
        try {
            java.lang.String str50 = iSO8601SqlTimestampConverter0.toString((java.lang.Object) cachingMapper9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter37);
        org.junit.Assert.assertNotNull(converterLookup42);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.ClassAliasingMapper classAliasingMapper1 = new com.thoughtworks.xstream.mapper.ClassAliasingMapper(classMapper0);
        java.lang.Class class2 = null;
        boolean b3 = classAliasingMapper1.itemTypeAsAttribute(class2);
        java.lang.Class class4 = null;
        try {
            java.lang.String str6 = classAliasingMapper1.serializedMember(class4, "dynamic-proxy");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamDriver hierarchicalStreamDriver1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream(reflectionProvider0, hierarchicalStreamDriver1);
        com.thoughtworks.xstream.mapper.Mapper mapper3 = xStream2.getMapper();
        org.jdom.Element element4 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader5 = new com.thoughtworks.xstream.io.xml.JDomReader(element4);
        try {
            java.lang.Object obj6 = xStream2.unmarshal((com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(mapper3);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        com.thoughtworks.xstream.converters.extended.JavaMethodConverter javaMethodConverter0 = new com.thoughtworks.xstream.converters.extended.JavaMethodConverter();
        org.jdom.Element element1 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer2 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader3 = new com.thoughtworks.xstream.io.xml.JDomReader(element1, xmlFriendlyReplacer2);
        java.lang.Object obj4 = jDomReader3.peekUnderlyingNode();
        com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader5 = jDomReader3.underlyingReader();
        org.dom4j.Element element7 = null;
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider8 = null;
        com.thoughtworks.xstream.XStream xStream9 = new com.thoughtworks.xstream.XStream(reflectionProvider8);
        org.jdom.Element element10 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer11 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader12 = new com.thoughtworks.xstream.io.xml.JDomReader(element10, xmlFriendlyReplacer11);
        java.lang.Object obj13 = jDomReader12.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup14 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper15 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper16 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper15);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper17 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper16);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller18 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider8, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader12, converterLookup14, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper17);
        java.lang.Runnable runnable19 = null;
        treeUnmarshaller18.addCompletionCallback(runnable19, 0);
        java.lang.Object obj22 = treeUnmarshaller18.currentObject();
        nu.xom.Element element23 = null;
        java.io.Writer writer24 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer27 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter28 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer24, xmlFriendlyReplacer27);
        com.thoughtworks.xstream.io.xml.XomReader xomReader29 = new com.thoughtworks.xstream.io.xml.XomReader(element23, xmlFriendlyReplacer27);
        java.lang.Object obj30 = null;
        treeUnmarshaller18.put((java.lang.Object) xmlFriendlyReplacer27, obj30);
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader32 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element7, xmlFriendlyReplacer27);
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer35 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter36 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer35);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter37 = xppDomWriter36.underlyingWriter();
        com.thoughtworks.xstream.alias.ClassMapper classMapper38 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper39 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper38);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper40 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper39);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider41 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter42 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper39, reflectionProvider41);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter43 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper39);
        com.thoughtworks.xstream.alias.ClassMapper classMapper44 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup45 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper44);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper46 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper39, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup45);
        com.thoughtworks.xstream.alias.ClassMapper classMapper47 = null;
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller48 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller(hierarchicalStreamWriter37, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup45, classMapper47);
        com.thoughtworks.xstream.alias.ClassMapper classMapper49 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper50 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper49);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper51 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper50);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider52 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter53 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper50, reflectionProvider52);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter54 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper50);
        com.thoughtworks.xstream.alias.ClassMapper classMapper55 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup56 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper55);
        com.thoughtworks.xstream.alias.ClassMapper classMapper57 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper58 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper57);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper59 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper58);
        java.lang.String str61 = xmlFriendlyMapper58.mapNameToXML("hi!");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider62 = null;
        com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter cGLIBEnhancedConverter63 = new com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper58, reflectionProvider62);
        defaultConverterLookup56.registerConverter((com.thoughtworks.xstream.converters.Converter) cGLIBEnhancedConverter63, 0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper66 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper50, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup56);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller67 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) 1003, (com.thoughtworks.xstream.io.HierarchicalStreamReader) dom4JReader32, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup45, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper66);
        try {
            java.lang.Object obj68 = javaMethodConverter0.unmarshal(hierarchicalStreamReader5, (com.thoughtworks.xstream.converters.UnmarshallingContext) treeUnmarshaller67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(hierarchicalStreamReader5);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter37);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!" + "'", str61.equals("hi!"));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        com.thoughtworks.xstream.XStream xStream0 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter1 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream0.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter1);
        com.thoughtworks.xstream.MarshallingStrategy marshallingStrategy3 = null;
        xStream0.setMarshallingStrategy(marshallingStrategy3);
        com.thoughtworks.xstream.converters.collections.BitSetConverter bitSetConverter5 = new com.thoughtworks.xstream.converters.collections.BitSetConverter();
        xStream0.registerConverter((com.thoughtworks.xstream.converters.Converter) bitSetConverter5, (int) (byte) 126);
        com.thoughtworks.xstream.converters.extended.ThrowableConverter throwableConverter8 = new com.thoughtworks.xstream.converters.extended.ThrowableConverter((com.thoughtworks.xstream.converters.Converter) bitSetConverter5);
        java.lang.Class class9 = null;
        try {
            boolean b10 = bitSetConverter5.canConvert(class9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper1 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader0);
        java.lang.Class class2 = null;
        boolean b4 = defaultMapper1.shouldSerializeMember(class2, "");
        java.lang.String str6 = defaultMapper1.attributeForAlias("hi!");
        java.lang.Class class7 = null;
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter8 = defaultMapper1.getConverterFromItemType(class7);
        java.lang.Class class9 = null;
        com.thoughtworks.xstream.mapper.Mapper.ImplicitCollectionMapping implicitCollectionMapping11 = defaultMapper1.getImplicitCollectionDefForFieldName(class9, "http://com.thoughtworks.xstream/XStreamSource/feature");
        org.junit.Assert.assertNotNull(classLoader0);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(singleValueConverter8);
        org.junit.Assert.assertNull(implicitCollectionMapping11);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter0 = new com.thoughtworks.xstream.io.xml.XppDomWriter();
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        com.thoughtworks.xstream.io.xml.DomDriver domDriver0 = new com.thoughtworks.xstream.io.xml.DomDriver();
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback1 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream2 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback1);
        java.io.ObjectOutputStream.PutField putField3 = customObjectOutputStream2.putFields();
        java.io.ObjectOutputStream.PutField putField4 = customObjectOutputStream2.putFields();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter5 = domDriver0.createWriter((java.io.OutputStream) customObjectOutputStream2);
        try {
            customObjectOutputStream2.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(putField3);
        org.junit.Assert.assertNotNull(putField4);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter5);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        com.thoughtworks.xstream.converters.basic.FloatConverter floatConverter0 = new com.thoughtworks.xstream.converters.basic.FloatConverter();
        try {
            java.lang.Object obj2 = floatConverter0.fromString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        org.jdom.Element element2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader4 = new com.thoughtworks.xstream.io.xml.JDomReader(element2, xmlFriendlyReplacer3);
        java.lang.Object obj5 = jDomReader4.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup6 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper7 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper8 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper7);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper9 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper8);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller10 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider0, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader4, converterLookup6, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9);
        org.jdom.Element element11 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer12 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader13 = new com.thoughtworks.xstream.io.xml.JDomReader(element11, xmlFriendlyReplacer12);
        java.lang.Object obj14 = jDomReader13.peekUnderlyingNode();
        com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader15 = jDomReader13.underlyingReader();
        java.lang.Class class16 = null;
        try {
            java.lang.Object obj17 = treeUnmarshaller10.convertAnother((java.lang.Object) jDomReader13, class16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(hierarchicalStreamReader15);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        com.thoughtworks.xstream.io.xml.Dom4JDriver dom4JDriver0 = new com.thoughtworks.xstream.io.xml.Dom4JDriver();
        org.dom4j.io.OutputFormat outputFormat1 = null;
        dom4JDriver0.setOutputFormat(outputFormat1);
        java.io.Reader reader3 = null;
        try {
            com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader4 = dom4JDriver0.createReader(reader3);
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
        }
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        com.thoughtworks.xstream.converters.basic.NullConverter nullConverter0 = new com.thoughtworks.xstream.converters.basic.NullConverter();
        org.dom4j.Element element1 = null;
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider2 = null;
        com.thoughtworks.xstream.XStream xStream3 = new com.thoughtworks.xstream.XStream(reflectionProvider2);
        org.jdom.Element element4 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer5 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader6 = new com.thoughtworks.xstream.io.xml.JDomReader(element4, xmlFriendlyReplacer5);
        java.lang.Object obj7 = jDomReader6.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup8 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper9 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper10 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper9);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper11 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper10);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller12 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider2, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader6, converterLookup8, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper11);
        java.lang.Runnable runnable13 = null;
        treeUnmarshaller12.addCompletionCallback(runnable13, 0);
        java.lang.Object obj16 = treeUnmarshaller12.currentObject();
        nu.xom.Element element17 = null;
        java.io.Writer writer18 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer21 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter22 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer18, xmlFriendlyReplacer21);
        com.thoughtworks.xstream.io.xml.XomReader xomReader23 = new com.thoughtworks.xstream.io.xml.XomReader(element17, xmlFriendlyReplacer21);
        java.lang.Object obj24 = null;
        treeUnmarshaller12.put((java.lang.Object) xmlFriendlyReplacer21, obj24);
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader26 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element1, xmlFriendlyReplacer21);
        com.thoughtworks.xstream.alias.ClassMapper classMapper27 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper28 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper27);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper29 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper28);
        com.thoughtworks.xstream.mapper.EnumMapper enumMapper30 = new com.thoughtworks.xstream.mapper.EnumMapper((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper29);
        org.jdom.Element element31 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer32 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader33 = new com.thoughtworks.xstream.io.xml.JDomReader(element31, xmlFriendlyReplacer32);
        java.lang.Object obj34 = jDomReader33.peekUnderlyingNode();
        com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader35 = jDomReader33.underlyingReader();
        com.thoughtworks.xstream.alias.ClassMapper classMapper36 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper37 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper36);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper38 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper37);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider39 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter40 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper37, reflectionProvider39);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter41 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper37);
        com.thoughtworks.xstream.alias.ClassMapper classMapper42 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup43 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper42);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper44 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper37, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup43);
        com.thoughtworks.xstream.alias.ClassMapper classMapper45 = null;
        com.thoughtworks.xstream.mapper.DefaultImplementationsMapper defaultImplementationsMapper46 = new com.thoughtworks.xstream.mapper.DefaultImplementationsMapper(classMapper45);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller47 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) dynamicProxyMapper29, hierarchicalStreamReader35, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup43, (com.thoughtworks.xstream.mapper.Mapper) defaultImplementationsMapper46);
        java.lang.Object obj48 = nullConverter0.unmarshal((com.thoughtworks.xstream.io.HierarchicalStreamReader) dom4JReader26, (com.thoughtworks.xstream.converters.UnmarshallingContext) treeUnmarshaller47);
        java.io.Writer writer49 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer52 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter53 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer52);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter54 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer49, xmlFriendlyReplacer52);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter55 = compactWriter54.underlyingWriter();
        java.lang.Class class56 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper57 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper58 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper57);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper59 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper58);
        com.thoughtworks.xstream.converters.collections.CollectionConverter collectionConverter60 = new com.thoughtworks.xstream.converters.collections.CollectionConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper58);
        try {
            java.lang.Object obj61 = treeUnmarshaller47.convertAnother((java.lang.Object) hierarchicalStreamWriter55, class56, (com.thoughtworks.xstream.converters.Converter) collectionConverter60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(hierarchicalStreamReader35);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter55);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        com.thoughtworks.xstream.XStream xStream0 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter1 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream0.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = xStream0.getConverterLookup();
        java.io.Reader reader4 = null;
        try {
            java.io.ObjectInputStream objectInputStream5 = xStream0.createObjectInputStream(reader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(converterLookup3);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream12 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback11);
        java.io.ObjectOutputStream.PutField putField13 = customObjectOutputStream12.putFields();
        java.io.Writer writer14 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer15 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter16 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer14, xmlFriendlyReplacer15);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup17 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper18 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper19 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper18);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper20 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider21 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter22 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19, reflectionProvider21);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter23 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller24 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter16, converterLookup17, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        referenceByIdMarshaller10.put((java.lang.Object) customObjectOutputStream12, (java.lang.Object) referenceByIdMarshaller24);
        java.io.Writer writer26 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer27 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter28 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer26, xmlFriendlyReplacer27);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup29 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper30 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper31 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper30);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper32 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper31);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider33 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter34 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper31, reflectionProvider33);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter35 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper31);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller36 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter28, converterLookup29, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper31);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup37 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper38 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller39 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter28, converterLookup37, classMapper38);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup40 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper41 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper42 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper41);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper43 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper42);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider44 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter45 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper42, reflectionProvider44);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter46 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper42);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller.IDGenerator iDGenerator47 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller48 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter28, converterLookup40, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper42, iDGenerator47);
        java.lang.Object obj49 = referenceByIdMarshaller24.get((java.lang.Object) xmlFriendlyMapper42);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback50 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream51 = com.thoughtworks.xstream.core.util.CustomObjectOutputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller24, streamCallback50);
        try {
            customObjectOutputStream51.writeInt((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(putField13);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(customObjectOutputStream51);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.jdom.Element element0 = null;
        org.jdom.JDOMFactory jDOMFactory1 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer2 = null;
        com.thoughtworks.xstream.io.xml.JDomWriter jDomWriter3 = new com.thoughtworks.xstream.io.xml.JDomWriter(element0, jDOMFactory1, xmlFriendlyReplacer2);
        jDomWriter3.endNode();
        try {
            jDomWriter3.addAttribute("defined-in", "http://com.thoughtworks.xstream/sax/property/source-object-list");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider3 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter4 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1, reflectionProvider3);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter5 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        java.lang.String str7 = xmlFriendlyMapper1.mapNameToXML("");
        com.thoughtworks.xstream.mapper.CachingMapper cachingMapper8 = new com.thoughtworks.xstream.mapper.CachingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider9 = null;
        com.thoughtworks.xstream.XStream xStream10 = new com.thoughtworks.xstream.XStream(reflectionProvider9);
        org.jdom.Element element11 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer12 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader13 = new com.thoughtworks.xstream.io.xml.JDomReader(element11, xmlFriendlyReplacer12);
        java.lang.Object obj14 = jDomReader13.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup15 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper16 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper17 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper16);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper18 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper17);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller19 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider9, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader13, converterLookup15, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper18);
        java.io.Writer writer20 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer21 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter22 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer20, xmlFriendlyReplacer21);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup23 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper24 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper25 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper24);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper26 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper25);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider27 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter28 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper25, reflectionProvider27);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter29 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper25);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller30 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter22, converterLookup23, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper25);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup31 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper32 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller33 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter22, converterLookup31, classMapper32);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter34 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter35 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter36 = saxWriter35.underlyingWriter();
        referenceByIdMarshaller33.put((java.lang.Object) saxWriter34, (java.lang.Object) saxWriter35);
        com.thoughtworks.xstream.XStream xStream38 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter39 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream38.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter39);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup41 = xStream38.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper42 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper43 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper42);
        com.thoughtworks.xstream.mapper.ClassAliasingMapper classAliasingMapper44 = new com.thoughtworks.xstream.mapper.ClassAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper43);
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller46 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) saxWriter35, converterLookup41, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper43, (int) 'a');
        com.thoughtworks.xstream.alias.ClassMapper classMapper47 = null;
        com.thoughtworks.xstream.core.ReferenceByIdUnmarshaller referenceByIdUnmarshaller48 = new com.thoughtworks.xstream.core.ReferenceByIdUnmarshaller((java.lang.Object) cachingMapper8, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader13, converterLookup41, classMapper47);
        com.thoughtworks.xstream.mapper.OuterClassMapper outerClassMapper49 = new com.thoughtworks.xstream.mapper.OuterClassMapper((com.thoughtworks.xstream.mapper.Mapper) classMapper47);
        java.lang.Class class50 = null;
        try {
            java.lang.String str52 = outerClassMapper49.realMember(class50, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter36);
        org.junit.Assert.assertNotNull(converterLookup41);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap0 = new com.thoughtworks.xstream.io.xml.QNameMap();
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver2 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap0, true);
        java.lang.String str3 = qNameMap0.getDefaultPrefix();
        javax.xml.namespace.QName qName5 = qNameMap0.getQName("hi!");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter6 = null;
        java.io.Writer writer9 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer12 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XomDriver xomDriver13 = new com.thoughtworks.xstream.io.xml.XomDriver(xmlFriendlyReplacer12);
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter14 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer9, xmlFriendlyReplacer12);
        try {
            com.thoughtworks.xstream.io.xml.StaxWriter staxWriter15 = new com.thoughtworks.xstream.io.xml.StaxWriter(qNameMap0, xMLStreamWriter6, true, true, xmlFriendlyReplacer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(qName5);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        org.jdom.Element element2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader4 = new com.thoughtworks.xstream.io.xml.JDomReader(element2, xmlFriendlyReplacer3);
        java.lang.Object obj5 = jDomReader4.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup6 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper7 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper8 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper7);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper9 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper8);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller10 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider0, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader4, converterLookup6, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream12 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller10, streamCallback11);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback13 = customObjectInputStream12.peekCallback();
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback14 = customObjectInputStream12.popCallback();
        try {
            java.lang.String str15 = customObjectInputStream12.readUTF();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(customObjectInputStream12);
        org.junit.Assert.assertNull(streamCallback13);
        org.junit.Assert.assertNull(streamCallback14);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker serializationMethodInvoker0 = new com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker();
        java.io.Writer writer1 = null;
        java.io.Writer writer2 = null;
        java.io.Writer writer3 = null;
        char[] char_array8 = new char[] { 'a', '4', '4', ' ' };
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter9 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer3, char_array8);
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter10 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer2, char_array8);
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter11 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer1, char_array8);
        java.lang.Object obj12 = serializationMethodInvoker0.callWriteReplace((java.lang.Object) prettyPrintWriter11);
        java.lang.Class class13 = null;
        java.io.Writer writer14 = null;
        java.io.Writer writer15 = null;
        char[] char_array20 = new char[] { 'a', '4', '4', ' ' };
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter21 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer15, char_array20);
        org.dom4j.DocumentFactory documentFactory23 = null;
        org.dom4j.io.OutputFormat outputFormat24 = null;
        java.io.Writer writer25 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer28 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter29 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer25, xmlFriendlyReplacer28);
        com.thoughtworks.xstream.io.xml.Dom4JDriver dom4JDriver30 = new com.thoughtworks.xstream.io.xml.Dom4JDriver(documentFactory23, outputFormat24, xmlFriendlyReplacer28);
        com.thoughtworks.xstream.io.xml.XomDriver xomDriver31 = new com.thoughtworks.xstream.io.xml.XomDriver(xmlFriendlyReplacer28);
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter32 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer14, char_array20, "enum-type", xmlFriendlyReplacer28);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider33 = null;
        com.thoughtworks.xstream.XStream xStream34 = new com.thoughtworks.xstream.XStream(reflectionProvider33);
        org.jdom.Element element35 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer36 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader37 = new com.thoughtworks.xstream.io.xml.JDomReader(element35, xmlFriendlyReplacer36);
        java.lang.Object obj38 = jDomReader37.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup39 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper40 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper41 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper40);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper42 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper41);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller43 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider33, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader37, converterLookup39, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper42);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback44 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream45 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller43, streamCallback44);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback46 = customObjectInputStream45.peekCallback();
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback47 = customObjectInputStream45.popCallback();
        try {
            serializationMethodInvoker0.callReadObject(class13, (java.lang.Object) prettyPrintWriter32, (java.io.ObjectInputStream) customObjectInputStream45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(char_array8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(char_array20);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(customObjectInputStream45);
        org.junit.Assert.assertNull(streamCallback46);
        org.junit.Assert.assertNull(streamCallback47);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        com.thoughtworks.xstream.converters.collections.CharArrayConverter charArrayConverter0 = new com.thoughtworks.xstream.converters.collections.CharArrayConverter();
        java.lang.Class class1 = null;
        try {
            boolean b2 = charArrayConverter0.canConvert(class1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        int i0 = java.io.ObjectStreamConstants.PROTOCOL_VERSION_2;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        java.lang.String str4 = xmlFriendlyMapper1.mapNameToXML("");
        java.lang.Class class5 = null;
        try {
            boolean b7 = xmlFriendlyMapper1.shouldSerializeMember(class5, "http://com.thoughtworks.xstream/sax/property/source-object-list");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        java.lang.Class class0 = null;
        java.lang.Class class2 = null;
        com.thoughtworks.xstream.converters.javabean.BeanProperty beanProperty3 = new com.thoughtworks.xstream.converters.javabean.BeanProperty(class0, "", class2);
        java.lang.Class class4 = beanProperty3.getBeanClass();
        java.lang.String str5 = beanProperty3.getName();
        java.lang.Class class6 = beanProperty3.getBeanClass();
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(class6);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup1 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper0);
        com.thoughtworks.xstream.alias.ClassMapper classMapper2 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper3 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper2);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper4 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper3);
        java.lang.String str6 = xmlFriendlyMapper3.mapNameToXML("hi!");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter cGLIBEnhancedConverter8 = new com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper3, reflectionProvider7);
        defaultConverterLookup1.registerConverter((com.thoughtworks.xstream.converters.Converter) cGLIBEnhancedConverter8, 0);
        com.thoughtworks.xstream.converters.extended.RegexPatternConverter regexPatternConverter11 = new com.thoughtworks.xstream.converters.extended.RegexPatternConverter((com.thoughtworks.xstream.converters.Converter) cGLIBEnhancedConverter8);
        org.jdom.Element element12 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer13 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader14 = new com.thoughtworks.xstream.io.xml.JDomReader(element12, xmlFriendlyReplacer13);
        java.lang.Object obj15 = jDomReader14.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider16 = null;
        com.thoughtworks.xstream.XStream xStream17 = new com.thoughtworks.xstream.XStream(reflectionProvider16);
        org.jdom.Element element18 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer19 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader20 = new com.thoughtworks.xstream.io.xml.JDomReader(element18, xmlFriendlyReplacer19);
        java.lang.Object obj21 = jDomReader20.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup22 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper23 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper24 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper23);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper25 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper24);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller26 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider16, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader20, converterLookup22, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper25);
        java.lang.Runnable runnable27 = null;
        treeUnmarshaller26.addCompletionCallback(runnable27, 0);
        java.lang.Object obj30 = treeUnmarshaller26.currentObject();
        com.thoughtworks.xstream.converters.basic.ThreadSafeSimpleDateFormat threadSafeSimpleDateFormat34 = new com.thoughtworks.xstream.converters.basic.ThreadSafeSimpleDateFormat("", (int) (byte) 112, (int) (byte) 123);
        java.lang.Object obj35 = treeUnmarshaller26.get((java.lang.Object) (byte) 123);
        try {
            java.lang.Object obj36 = cGLIBEnhancedConverter8.unmarshal((com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader14, (com.thoughtworks.xstream.converters.UnmarshallingContext) treeUnmarshaller26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        com.thoughtworks.xstream.XStream xStream0 = new com.thoughtworks.xstream.XStream();
        org.dom4j.Element element1 = null;
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider2 = null;
        com.thoughtworks.xstream.XStream xStream3 = new com.thoughtworks.xstream.XStream(reflectionProvider2);
        org.jdom.Element element4 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer5 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader6 = new com.thoughtworks.xstream.io.xml.JDomReader(element4, xmlFriendlyReplacer5);
        java.lang.Object obj7 = jDomReader6.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup8 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper9 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper10 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper9);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper11 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper10);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller12 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider2, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader6, converterLookup8, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper11);
        java.lang.Runnable runnable13 = null;
        treeUnmarshaller12.addCompletionCallback(runnable13, 0);
        java.lang.Object obj16 = treeUnmarshaller12.currentObject();
        nu.xom.Element element17 = null;
        java.io.Writer writer18 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer21 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter22 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer18, xmlFriendlyReplacer21);
        com.thoughtworks.xstream.io.xml.XomReader xomReader23 = new com.thoughtworks.xstream.io.xml.XomReader(element17, xmlFriendlyReplacer21);
        java.lang.Object obj24 = null;
        treeUnmarshaller12.put((java.lang.Object) xmlFriendlyReplacer21, obj24);
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader26 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element1, xmlFriendlyReplacer21);
        dom4JReader26.close();
        com.thoughtworks.xstream.alias.ClassMapper classMapper28 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper29 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper28);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper30 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper29);
        try {
            java.lang.Object obj31 = xStream0.unmarshal((com.thoughtworks.xstream.io.HierarchicalStreamReader) dom4JReader26, (java.lang.Object) dynamicProxyMapper30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.dom4j.Element element1 = null;
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider2 = null;
        com.thoughtworks.xstream.XStream xStream3 = new com.thoughtworks.xstream.XStream(reflectionProvider2);
        org.jdom.Element element4 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer5 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader6 = new com.thoughtworks.xstream.io.xml.JDomReader(element4, xmlFriendlyReplacer5);
        java.lang.Object obj7 = jDomReader6.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup8 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper9 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper10 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper9);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper11 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper10);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller12 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider2, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader6, converterLookup8, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper11);
        java.lang.Runnable runnable13 = null;
        treeUnmarshaller12.addCompletionCallback(runnable13, 0);
        java.lang.Object obj16 = treeUnmarshaller12.currentObject();
        nu.xom.Element element17 = null;
        java.io.Writer writer18 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer21 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter22 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer18, xmlFriendlyReplacer21);
        com.thoughtworks.xstream.io.xml.XomReader xomReader23 = new com.thoughtworks.xstream.io.xml.XomReader(element17, xmlFriendlyReplacer21);
        java.lang.Object obj24 = null;
        treeUnmarshaller12.put((java.lang.Object) xmlFriendlyReplacer21, obj24);
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader26 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element1, xmlFriendlyReplacer21);
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer29 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter30 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer29);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter31 = xppDomWriter30.underlyingWriter();
        com.thoughtworks.xstream.alias.ClassMapper classMapper32 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper33 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper32);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper34 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper33);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider35 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter36 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper33, reflectionProvider35);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter37 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper33);
        com.thoughtworks.xstream.alias.ClassMapper classMapper38 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup39 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper38);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper40 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper33, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup39);
        com.thoughtworks.xstream.alias.ClassMapper classMapper41 = null;
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller42 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller(hierarchicalStreamWriter31, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup39, classMapper41);
        com.thoughtworks.xstream.alias.ClassMapper classMapper43 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper44 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper43);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper45 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper44);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider46 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter47 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper44, reflectionProvider46);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter48 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper44);
        com.thoughtworks.xstream.alias.ClassMapper classMapper49 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup50 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper49);
        com.thoughtworks.xstream.alias.ClassMapper classMapper51 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper52 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper51);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper53 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper52);
        java.lang.String str55 = xmlFriendlyMapper52.mapNameToXML("hi!");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider56 = null;
        com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter cGLIBEnhancedConverter57 = new com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper52, reflectionProvider56);
        defaultConverterLookup50.registerConverter((com.thoughtworks.xstream.converters.Converter) cGLIBEnhancedConverter57, 0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper60 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper44, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup50);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller61 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) 1003, (com.thoughtworks.xstream.io.HierarchicalStreamReader) dom4JReader26, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup39, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper60);
        java.lang.Class class62 = null;
        attributeMapper60.addAttributeFor(class62);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter31);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        org.jdom.Element element2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader4 = new com.thoughtworks.xstream.io.xml.JDomReader(element2, xmlFriendlyReplacer3);
        java.lang.Object obj5 = jDomReader4.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup6 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper7 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper8 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper7);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper9 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper8);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller10 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider0, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader4, converterLookup6, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9);
        java.lang.Runnable runnable11 = null;
        treeUnmarshaller10.addCompletionCallback(runnable11, 0);
        java.lang.Object obj14 = treeUnmarshaller10.currentObject();
        nu.xom.Element element15 = null;
        java.io.Writer writer16 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer19 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter20 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer16, xmlFriendlyReplacer19);
        com.thoughtworks.xstream.io.xml.XomReader xomReader21 = new com.thoughtworks.xstream.io.xml.XomReader(element15, xmlFriendlyReplacer19);
        java.lang.Object obj22 = null;
        treeUnmarshaller10.put((java.lang.Object) xmlFriendlyReplacer19, obj22);
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver24 = new com.thoughtworks.xstream.io.xml.StaxDriver(xmlFriendlyReplacer19);
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter25 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer19);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        com.thoughtworks.xstream.io.path.Path path1 = new com.thoughtworks.xstream.io.path.Path("");
        com.thoughtworks.xstream.io.path.PathTracker pathTracker2 = new com.thoughtworks.xstream.io.path.PathTracker();
        com.thoughtworks.xstream.io.path.Path path3 = pathTracker2.getPath();
        boolean b4 = path1.isAncestor(path3);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker serializationMethodInvoker0 = new com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker();
        java.io.Writer writer1 = null;
        java.io.Writer writer2 = null;
        java.io.Writer writer3 = null;
        char[] char_array8 = new char[] { 'a', '4', '4', ' ' };
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter9 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer3, char_array8);
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter10 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer2, char_array8);
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter11 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer1, char_array8);
        java.lang.Object obj12 = serializationMethodInvoker0.callWriteReplace((java.lang.Object) prettyPrintWriter11);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider13 = null;
        com.thoughtworks.xstream.XStream xStream14 = new com.thoughtworks.xstream.XStream(reflectionProvider13);
        org.jdom.Element element15 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer16 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader17 = new com.thoughtworks.xstream.io.xml.JDomReader(element15, xmlFriendlyReplacer16);
        java.lang.Object obj18 = jDomReader17.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup19 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper20 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper21 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper20);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper22 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper21);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller23 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider13, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader17, converterLookup19, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper22);
        java.lang.Object obj24 = serializationMethodInvoker0.callReadResolve((java.lang.Object) jDomReader17);
        try {
            java.lang.String str25 = jDomReader17.getNodeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(char_array8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper1 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader0);
        java.lang.Class class2 = null;
        boolean b4 = defaultMapper1.shouldSerializeMember(class2, "");
        java.lang.Class class5 = null;
        boolean b7 = defaultMapper1.shouldSerializeMember(class5, "enum-type");
        com.thoughtworks.xstream.alias.ClassMapper classMapper8 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper9 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper8);
        com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider pureJavaReflectionProvider10 = new com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider();
        com.thoughtworks.xstream.converters.reflection.ReflectionConverter reflectionConverter11 = new com.thoughtworks.xstream.converters.reflection.ReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) classMapper8, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider10);
        com.thoughtworks.xstream.annotations.AnnotationProvider annotationProvider12 = null;
        com.thoughtworks.xstream.annotations.AnnotationReflectionConverter annotationReflectionConverter13 = new com.thoughtworks.xstream.annotations.AnnotationReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) defaultMapper1, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider10, annotationProvider12);
        try {
            java.lang.Class class15 = defaultMapper1.lookupType("defined-in");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.mapper.CannotResolveClassException");
        } catch (com.thoughtworks.xstream.mapper.CannotResolveClassException e) {
        }
        org.junit.Assert.assertNotNull(classLoader0);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        com.thoughtworks.xstream.XStream xStream0 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter1 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream0.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter1);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider3 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamDriver hierarchicalStreamDriver4 = null;
        com.thoughtworks.xstream.XStream xStream5 = new com.thoughtworks.xstream.XStream(reflectionProvider3, hierarchicalStreamDriver4);
        com.thoughtworks.xstream.mapper.Mapper mapper6 = xStream5.getMapper();
        com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy referenceByXPathMarshallingStrategy8 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy((int) (byte) 0);
        xStream5.setMarshallingStrategy((com.thoughtworks.xstream.MarshallingStrategy) referenceByXPathMarshallingStrategy8);
        xStream0.setMarshallingStrategy((com.thoughtworks.xstream.MarshallingStrategy) referenceByXPathMarshallingStrategy8);
        java.lang.Class class11 = null;
        java.lang.Class class14 = null;
        try {
            xStream0.addImplicitCollection(class11, "cwpx", "http://com.thoughtworks.xstream/XStreamSource/feature", class14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(mapper6);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter0 = null;
        com.thoughtworks.xstream.converters.SingleValueConverterWrapper singleValueConverterWrapper1 = new com.thoughtworks.xstream.converters.SingleValueConverterWrapper(singleValueConverter0);
        java.lang.Class class2 = null;
        try {
            boolean b3 = singleValueConverterWrapper1.canConvert(class2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        com.thoughtworks.xstream.converters.basic.LongConverter longConverter0 = new com.thoughtworks.xstream.converters.basic.LongConverter();
        try {
            java.lang.Object obj2 = longConverter0.fromString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        com.thoughtworks.xstream.converters.extended.CharsetConverter charsetConverter0 = new com.thoughtworks.xstream.converters.extended.CharsetConverter();
        com.thoughtworks.xstream.alias.ClassMapper classMapper1 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper2 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper1);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper3 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper2);
        com.thoughtworks.xstream.mapper.AttributeAliasingMapper attributeAliasingMapper4 = new com.thoughtworks.xstream.mapper.AttributeAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper3);
        com.thoughtworks.xstream.mapper.OuterClassMapper outerClassMapper6 = new com.thoughtworks.xstream.mapper.OuterClassMapper((com.thoughtworks.xstream.mapper.Mapper) attributeAliasingMapper4, "class");
        try {
            java.lang.String str7 = charsetConverter0.toString((java.lang.Object) attributeAliasingMapper4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter4 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer0, xmlFriendlyReplacer3);
        com.thoughtworks.xstream.io.path.PathTracker pathTracker5 = new com.thoughtworks.xstream.io.path.PathTracker();
        com.thoughtworks.xstream.io.path.PathTrackingWriter pathTrackingWriter6 = new com.thoughtworks.xstream.io.path.PathTrackingWriter((com.thoughtworks.xstream.io.HierarchicalStreamWriter) prettyPrintWriter4, pathTracker5);
        try {
            pathTrackingWriter6.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup11 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper12 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller13 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup11, classMapper12);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter14 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter15 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter16 = saxWriter15.underlyingWriter();
        referenceByIdMarshaller13.put((java.lang.Object) saxWriter14, (java.lang.Object) saxWriter15);
        com.thoughtworks.xstream.XStream xStream18 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter19 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream18.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter19);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup21 = xStream18.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper22 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper23 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper22);
        com.thoughtworks.xstream.mapper.ClassAliasingMapper classAliasingMapper24 = new com.thoughtworks.xstream.mapper.ClassAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper23);
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller26 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) saxWriter15, converterLookup21, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper23, (int) 'a');
        try {
            boolean b28 = saxWriter15.getFeature("hi!");
            org.junit.Assert.fail("Expected exception of type org.xml.sax.SAXNotRecognizedException");
        } catch (org.xml.sax.SAXNotRecognizedException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter16);
        org.junit.Assert.assertNotNull(converterLookup21);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        nu.xom.Element element0 = null;
        com.thoughtworks.xstream.io.path.Path path2 = new com.thoughtworks.xstream.io.path.Path("");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider3 = null;
        com.thoughtworks.xstream.XStream xStream4 = new com.thoughtworks.xstream.XStream(reflectionProvider3);
        org.jdom.Element element5 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer6 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader7 = new com.thoughtworks.xstream.io.xml.JDomReader(element5, xmlFriendlyReplacer6);
        java.lang.Object obj8 = jDomReader7.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup9 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper10 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper11 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper10);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper12 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller13 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider3, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader7, converterLookup9, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper12);
        java.lang.Runnable runnable14 = null;
        treeUnmarshaller13.addCompletionCallback(runnable14, 0);
        java.lang.Object obj17 = treeUnmarshaller13.currentObject();
        nu.xom.Element element18 = null;
        java.io.Writer writer19 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer22 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter23 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer19, xmlFriendlyReplacer22);
        com.thoughtworks.xstream.io.xml.XomReader xomReader24 = new com.thoughtworks.xstream.io.xml.XomReader(element18, xmlFriendlyReplacer22);
        java.lang.Object obj25 = null;
        treeUnmarshaller13.put((java.lang.Object) xmlFriendlyReplacer22, obj25);
        boolean b27 = path2.equals((java.lang.Object) xmlFriendlyReplacer22);
        com.thoughtworks.xstream.io.xml.XomWriter xomWriter28 = new com.thoughtworks.xstream.io.xml.XomWriter(element0, xmlFriendlyReplacer22);
        try {
            xomWriter28.startNode("http://com.thoughtworks.xstream/sax/property/source-object-list");
            org.junit.Assert.fail("Expected exception of type nu.xom.NamespaceConflictException");
        } catch (nu.xom.NamespaceConflictException e) {
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap0 = new com.thoughtworks.xstream.io.xml.QNameMap();
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver2 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap0, true);
        java.lang.String str3 = qNameMap0.getDefaultPrefix();
        java.lang.String str4 = qNameMap0.getDefaultNamespace();
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap5 = new com.thoughtworks.xstream.io.xml.QNameMap();
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver7 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap5, true);
        java.lang.String str8 = qNameMap5.getDefaultPrefix();
        javax.xml.namespace.QName qName10 = qNameMap5.getQName("hi!");
        java.lang.String str11 = qNameMap0.getJavaClassName(qName10);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(qName10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper1 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader0);
        java.lang.String str2 = defaultMapper1.attributeForEnumType();
        java.lang.String str4 = defaultMapper1.attributeForAlias("dynamic-proxy");
        try {
            java.lang.Class class6 = defaultMapper1.lookupType("dynamic-proxy");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.mapper.CannotResolveClassException");
        } catch (com.thoughtworks.xstream.mapper.CannotResolveClassException e) {
        }
        org.junit.Assert.assertNotNull(classLoader0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "enum-type" + "'", str2.equals("enum-type"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "dynamic-proxy" + "'", str4.equals("dynamic-proxy"));
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter jsonHierarchicalStreamWriter2 = new com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter(writer0, "");
        java.io.Writer writer3 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer6 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter7 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer6);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter8 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer3, xmlFriendlyReplacer6);
        com.thoughtworks.xstream.XStream xStream9 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter10 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream9.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter10);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup12 = xStream9.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper13 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper14 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper13);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper15 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper14);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter17 = attributeMapper15.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller18 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter8, converterLookup12, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper15);
        com.thoughtworks.xstream.alias.ClassMapper classMapper19 = null;
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller20 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) jsonHierarchicalStreamWriter2, converterLookup12, classMapper19);
        try {
            jsonHierarchicalStreamWriter2.startNode("cwpx");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(converterLookup12);
        org.junit.Assert.assertNull(singleValueConverter17);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider pureJavaReflectionProvider2 = new com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider();
        com.thoughtworks.xstream.converters.reflection.ReflectionConverter reflectionConverter3 = new com.thoughtworks.xstream.converters.reflection.ReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) classMapper0, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider2);
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider5 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper6 = null;
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap7 = null;
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver9 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap7, true);
        com.thoughtworks.xstream.XStream xStream11 = new com.thoughtworks.xstream.XStream(reflectionProvider5, classMapper6, (com.thoughtworks.xstream.io.HierarchicalStreamDriver) staxDriver9, "hi!");
        com.thoughtworks.xstream.XStream xStream13 = new com.thoughtworks.xstream.XStream((com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider2, classMapper4, (com.thoughtworks.xstream.io.HierarchicalStreamDriver) staxDriver9, "");
        com.thoughtworks.xstream.converters.reflection.ReflectionProviderWrapper reflectionProviderWrapper14 = new com.thoughtworks.xstream.converters.reflection.ReflectionProviderWrapper((com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider2);
        java.lang.Class class15 = null;
        try {
            java.lang.reflect.Field field17 = reflectionProviderWrapper14.getField(class15, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy.ABSOLUTE = (byte) 118;
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter0 = null;
        com.thoughtworks.xstream.converters.SingleValueConverterWrapper singleValueConverterWrapper1 = new com.thoughtworks.xstream.converters.SingleValueConverterWrapper(singleValueConverter0);
        java.lang.Object obj2 = null;
        try {
            java.lang.String str3 = singleValueConverterWrapper1.toString(obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter4 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer0, xmlFriendlyReplacer3);
        com.thoughtworks.xstream.io.xml.XppDomDriver xppDomDriver5 = new com.thoughtworks.xstream.io.xml.XppDomDriver(xmlFriendlyReplacer3);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback6 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream7 = new com.thoughtworks.xstream.core.util.CustomObjectInputStream(streamCallback6);
        try {
            com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader8 = xppDomDriver5.createReader((java.io.InputStream) customObjectInputStream7);
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
        }
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper1 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader0);
        com.thoughtworks.xstream.converters.extended.JavaMethodConverter javaMethodConverter2 = new com.thoughtworks.xstream.converters.extended.JavaMethodConverter(classLoader0);
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer5 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver6 = new com.thoughtworks.xstream.io.xml.StaxDriver(xmlFriendlyReplacer5);
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer9 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XomDriver xomDriver10 = new com.thoughtworks.xstream.io.xml.XomDriver(xmlFriendlyReplacer9);
        java.io.Writer writer11 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter12 = xomDriver10.createWriter(writer11);
        com.thoughtworks.xstream.io.xml.DomDriver domDriver13 = new com.thoughtworks.xstream.io.xml.DomDriver();
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback14 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream15 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback14);
        java.io.ObjectOutputStream.PutField putField16 = customObjectOutputStream15.putFields();
        java.io.ObjectOutputStream.PutField putField17 = customObjectOutputStream15.putFields();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter18 = domDriver13.createWriter((java.io.OutputStream) customObjectOutputStream15);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter19 = xomDriver10.createWriter((java.io.OutputStream) customObjectOutputStream15);
        java.io.Writer writer20 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer21 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter22 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer20, xmlFriendlyReplacer21);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup23 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper24 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper25 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper24);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper26 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper25);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider27 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter28 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper25, reflectionProvider27);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter29 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper25);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller30 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter22, converterLookup23, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper25);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup31 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper32 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller33 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter22, converterLookup31, classMapper32);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup34 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper35 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper36 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper35);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper37 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper36);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider38 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter39 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper36, reflectionProvider38);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter40 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper36);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller.IDGenerator iDGenerator41 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller42 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter22, converterLookup34, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper36, iDGenerator41);
        try {
            javaMethodConverter2.marshal((java.lang.Object) xmlFriendlyReplacer5, hierarchicalStreamWriter19, (com.thoughtworks.xstream.converters.MarshallingContext) referenceByIdMarshaller42);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(classLoader0);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter12);
        org.junit.Assert.assertNotNull(putField16);
        org.junit.Assert.assertNotNull(putField17);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter18);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter19);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter jsonHierarchicalStreamWriter1 = new com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter(writer0);
        java.lang.Class class3 = null;
        com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter.Node node4 = jsonHierarchicalStreamWriter1.new Node("defined-in", class3);
        java.lang.Class class5 = node4.clazz;
        org.junit.Assert.assertNull(class5);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        com.thoughtworks.xstream.XStream xStream0 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter1 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream0.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter1);
        java.lang.Object obj4 = textAttributeConverter1.fromString("hi!");
        com.thoughtworks.xstream.converters.SingleValueConverterWrapper singleValueConverterWrapper5 = new com.thoughtworks.xstream.converters.SingleValueConverterWrapper((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter1);
        java.lang.Object obj7 = singleValueConverterWrapper5.fromString("[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback0 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream1 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback0);
        java.io.ObjectOutputStream.PutField putField2 = customObjectOutputStream1.putFields();
        java.io.ObjectOutputStream.PutField putField3 = customObjectOutputStream1.putFields();
        try {
            customObjectOutputStream1.writeShort((int) (byte) 112);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(putField2);
        org.junit.Assert.assertNotNull(putField3);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup11 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper12 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller13 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup11, classMapper12);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter14 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter15 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter16 = saxWriter15.underlyingWriter();
        referenceByIdMarshaller13.put((java.lang.Object) saxWriter14, (java.lang.Object) saxWriter15);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter18 = saxWriter15.underlyingWriter();
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter16);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter18);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter0 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter1 = saxWriter0.underlyingWriter();
        com.thoughtworks.xstream.io.StatefulWriter statefulWriter2 = new com.thoughtworks.xstream.io.StatefulWriter(hierarchicalStreamWriter1);
        int i3 = statefulWriter2.state();
        java.lang.Class class5 = null;
        try {
            statefulWriter2.startNode("cwpx", class5);
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter1);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter4 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer3);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter5 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer3);
        com.thoughtworks.xstream.io.xml.XppDomDriver xppDomDriver6 = new com.thoughtworks.xstream.io.xml.XppDomDriver(xmlFriendlyReplacer3);
        java.io.OutputStream outputStream7 = null;
        try {
            com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter8 = xppDomDriver6.createWriter(outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        com.thoughtworks.xstream.XStream xStream0 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter1 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream0.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter1);
        java.lang.Object obj4 = textAttributeConverter1.fromString("hi!");
        com.thoughtworks.xstream.converters.SingleValueConverterWrapper singleValueConverterWrapper5 = new com.thoughtworks.xstream.converters.SingleValueConverterWrapper((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter1);
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer8 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XomDriver xomDriver9 = new com.thoughtworks.xstream.io.xml.XomDriver(xmlFriendlyReplacer8);
        java.io.Writer writer10 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter11 = xomDriver9.createWriter(writer10);
        com.thoughtworks.xstream.io.xml.DomDriver domDriver12 = new com.thoughtworks.xstream.io.xml.DomDriver();
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback13 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream14 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback13);
        java.io.ObjectOutputStream.PutField putField15 = customObjectOutputStream14.putFields();
        java.io.ObjectOutputStream.PutField putField16 = customObjectOutputStream14.putFields();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter17 = domDriver12.createWriter((java.io.OutputStream) customObjectOutputStream14);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter18 = xomDriver9.createWriter((java.io.OutputStream) customObjectOutputStream14);
        try {
            java.lang.String str19 = textAttributeConverter1.toString((java.lang.Object) xomDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter11);
        org.junit.Assert.assertNotNull(putField15);
        org.junit.Assert.assertNotNull(putField16);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter17);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter18);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper1 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader0);
        java.lang.Class class2 = null;
        boolean b4 = defaultMapper1.shouldSerializeMember(class2, "");
        java.lang.Class class5 = null;
        boolean b7 = defaultMapper1.shouldSerializeMember(class5, "enum-type");
        com.thoughtworks.xstream.alias.ClassMapper classMapper8 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper9 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper8);
        com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider pureJavaReflectionProvider10 = new com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider();
        com.thoughtworks.xstream.converters.reflection.ReflectionConverter reflectionConverter11 = new com.thoughtworks.xstream.converters.reflection.ReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) classMapper8, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider10);
        com.thoughtworks.xstream.annotations.AnnotationProvider annotationProvider12 = null;
        com.thoughtworks.xstream.annotations.AnnotationReflectionConverter annotationReflectionConverter13 = new com.thoughtworks.xstream.annotations.AnnotationReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) defaultMapper1, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider10, annotationProvider12);
        com.thoughtworks.xstream.converters.reflection.ReflectionProviderWrapper reflectionProviderWrapper14 = new com.thoughtworks.xstream.converters.reflection.ReflectionProviderWrapper((com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider10);
        java.lang.Class class16 = null;
        try {
            boolean b17 = reflectionProviderWrapper14.fieldDefinedInClass("hi!", class16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(classLoader0);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream12 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback11);
        java.io.ObjectOutputStream.PutField putField13 = customObjectOutputStream12.putFields();
        java.io.Writer writer14 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer15 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter16 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer14, xmlFriendlyReplacer15);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup17 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper18 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper19 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper18);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper20 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider21 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter22 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19, reflectionProvider21);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter23 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller24 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter16, converterLookup17, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        referenceByIdMarshaller10.put((java.lang.Object) customObjectOutputStream12, (java.lang.Object) referenceByIdMarshaller24);
        com.thoughtworks.xstream.io.binary.BinaryStreamWriter binaryStreamWriter26 = new com.thoughtworks.xstream.io.binary.BinaryStreamWriter((java.io.OutputStream) customObjectOutputStream12);
        try {
            binaryStreamWriter26.setValue("class");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(putField13);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper2 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.mapper.AttributeAliasingMapper attributeAliasingMapper3 = new com.thoughtworks.xstream.mapper.AttributeAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper2);
        com.thoughtworks.xstream.mapper.OuterClassMapper outerClassMapper5 = new com.thoughtworks.xstream.mapper.OuterClassMapper((com.thoughtworks.xstream.mapper.Mapper) attributeAliasingMapper3, "class");
        java.lang.Class class6 = null;
        try {
            java.lang.String str8 = outerClassMapper5.realMember(class6, "defined-in");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        com.thoughtworks.xstream.converters.basic.NullConverter nullConverter0 = new com.thoughtworks.xstream.converters.basic.NullConverter();
        org.dom4j.Element element1 = null;
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider2 = null;
        com.thoughtworks.xstream.XStream xStream3 = new com.thoughtworks.xstream.XStream(reflectionProvider2);
        org.jdom.Element element4 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer5 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader6 = new com.thoughtworks.xstream.io.xml.JDomReader(element4, xmlFriendlyReplacer5);
        java.lang.Object obj7 = jDomReader6.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup8 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper9 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper10 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper9);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper11 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper10);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller12 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider2, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader6, converterLookup8, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper11);
        java.lang.Runnable runnable13 = null;
        treeUnmarshaller12.addCompletionCallback(runnable13, 0);
        java.lang.Object obj16 = treeUnmarshaller12.currentObject();
        nu.xom.Element element17 = null;
        java.io.Writer writer18 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer21 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter22 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer18, xmlFriendlyReplacer21);
        com.thoughtworks.xstream.io.xml.XomReader xomReader23 = new com.thoughtworks.xstream.io.xml.XomReader(element17, xmlFriendlyReplacer21);
        java.lang.Object obj24 = null;
        treeUnmarshaller12.put((java.lang.Object) xmlFriendlyReplacer21, obj24);
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader26 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element1, xmlFriendlyReplacer21);
        com.thoughtworks.xstream.alias.ClassMapper classMapper27 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper28 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper27);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper29 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper28);
        com.thoughtworks.xstream.mapper.EnumMapper enumMapper30 = new com.thoughtworks.xstream.mapper.EnumMapper((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper29);
        org.jdom.Element element31 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer32 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader33 = new com.thoughtworks.xstream.io.xml.JDomReader(element31, xmlFriendlyReplacer32);
        java.lang.Object obj34 = jDomReader33.peekUnderlyingNode();
        com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader35 = jDomReader33.underlyingReader();
        com.thoughtworks.xstream.alias.ClassMapper classMapper36 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper37 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper36);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper38 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper37);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider39 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter40 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper37, reflectionProvider39);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter41 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper37);
        com.thoughtworks.xstream.alias.ClassMapper classMapper42 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup43 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper42);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper44 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper37, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup43);
        com.thoughtworks.xstream.alias.ClassMapper classMapper45 = null;
        com.thoughtworks.xstream.mapper.DefaultImplementationsMapper defaultImplementationsMapper46 = new com.thoughtworks.xstream.mapper.DefaultImplementationsMapper(classMapper45);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller47 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) dynamicProxyMapper29, hierarchicalStreamReader35, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup43, (com.thoughtworks.xstream.mapper.Mapper) defaultImplementationsMapper46);
        java.lang.Object obj48 = nullConverter0.unmarshal((com.thoughtworks.xstream.io.HierarchicalStreamReader) dom4JReader26, (com.thoughtworks.xstream.converters.UnmarshallingContext) treeUnmarshaller47);
        try {
            java.lang.String str50 = dom4JReader26.getAttribute((int) (byte) 113);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(hierarchicalStreamReader35);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter0 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        java.lang.Object obj2 = textAttributeConverter0.fromString("enum-type");
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        com.thoughtworks.xstream.io.xml.DomDriver domDriver0 = new com.thoughtworks.xstream.io.xml.DomDriver();
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback1 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream2 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback1);
        java.io.ObjectOutputStream.PutField putField3 = customObjectOutputStream2.putFields();
        java.io.ObjectOutputStream.PutField putField4 = customObjectOutputStream2.putFields();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter5 = domDriver0.createWriter((java.io.OutputStream) customObjectOutputStream2);
        try {
            customObjectOutputStream2.writeFields();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(putField3);
        org.junit.Assert.assertNotNull(putField4);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter5);
    }
/*
    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        java.io.File file0 = null;
        com.thoughtworks.xstream.persistence.FileStreamStrategy fileStreamStrategy1 = new com.thoughtworks.xstream.persistence.FileStreamStrategy(file0);
        boolean b3 = fileStreamStrategy1.containsKey((java.lang.Object) (-1L));
        java.io.Writer writer4 = null;
        com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter jsonHierarchicalStreamWriter6 = new com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter(writer4, "");
        java.io.Writer writer7 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer10 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter11 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer10);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter12 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer7, xmlFriendlyReplacer10);
        com.thoughtworks.xstream.XStream xStream13 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter14 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream13.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter14);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup16 = xStream13.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper17 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper18 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper17);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper19 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper18);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter21 = attributeMapper19.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller22 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter12, converterLookup16, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper19);
        com.thoughtworks.xstream.alias.ClassMapper classMapper23 = null;
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller24 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) jsonHierarchicalStreamWriter6, converterLookup16, classMapper23);
        java.lang.Object obj25 = fileStreamStrategy1.remove((java.lang.Object) treeMarshaller24);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter27 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter28 = saxWriter27.underlyingWriter();
        com.thoughtworks.xstream.io.StatefulWriter statefulWriter29 = new com.thoughtworks.xstream.io.StatefulWriter(hierarchicalStreamWriter28);
        int i30 = statefulWriter29.state();
        java.lang.Object obj31 = fileStreamStrategy1.put((java.lang.Object) "http://com.thoughtworks.xstream/sax/property/source-object-list", (java.lang.Object) i30);
        com.thoughtworks.xstream.persistence.XmlArrayList xmlArrayList32 = new com.thoughtworks.xstream.persistence.XmlArrayList((com.thoughtworks.xstream.persistence.StreamStrategy) fileStreamStrategy1);
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer36 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        try {
            xmlArrayList32.add((int) (byte) 16, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(converterLookup16);
        org.junit.Assert.assertNull(singleValueConverter21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter28);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0 + "'", obj31.equals(0));
    }*/

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        java.io.File file0 = null;
        com.thoughtworks.xstream.persistence.FileStreamStrategy fileStreamStrategy1 = new com.thoughtworks.xstream.persistence.FileStreamStrategy(file0);
        boolean b3 = fileStreamStrategy1.containsKey((java.lang.Object) (-1L));
        java.io.Writer writer4 = null;
        com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter jsonHierarchicalStreamWriter6 = new com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter(writer4, "");
        java.io.Writer writer7 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer10 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter11 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer10);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter12 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer7, xmlFriendlyReplacer10);
        com.thoughtworks.xstream.XStream xStream13 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter14 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream13.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter14);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup16 = xStream13.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper17 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper18 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper17);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper19 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper18);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter21 = attributeMapper19.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller22 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter12, converterLookup16, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper19);
        com.thoughtworks.xstream.alias.ClassMapper classMapper23 = null;
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller24 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) jsonHierarchicalStreamWriter6, converterLookup16, classMapper23);
        java.lang.Object obj25 = fileStreamStrategy1.remove((java.lang.Object) treeMarshaller24);
        com.thoughtworks.xstream.persistence.XmlMap xmlMap26 = new com.thoughtworks.xstream.persistence.XmlMap((com.thoughtworks.xstream.persistence.StreamStrategy) fileStreamStrategy1);
        com.thoughtworks.xstream.io.xml.Dom4JDriver dom4JDriver27 = new com.thoughtworks.xstream.io.xml.Dom4JDriver();
        org.dom4j.io.OutputFormat outputFormat28 = null;
        dom4JDriver27.setOutputFormat(outputFormat28);
        try {
            java.lang.Object obj30 = fileStreamStrategy1.get((java.lang.Object) outputFormat28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(converterLookup16);
        org.junit.Assert.assertNull(singleValueConverter21);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter4 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer3);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter5 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer3);
        try {
            compactWriter5.endNode();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        java.io.Writer writer0 = null;
        char[] char_array5 = new char[] { 'a', '4', '4', ' ' };
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter6 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer0, char_array5);
        com.thoughtworks.xstream.io.path.PathTracker pathTracker7 = null;
        com.thoughtworks.xstream.io.path.PathTrackingWriter pathTrackingWriter8 = new com.thoughtworks.xstream.io.path.PathTrackingWriter((com.thoughtworks.xstream.io.HierarchicalStreamWriter) prettyPrintWriter6, pathTracker7);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter9 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        org.xml.sax.ErrorHandler errorHandler10 = saxWriter9.getErrorHandler();
        org.dom4j.Element element12 = null;
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider13 = null;
        com.thoughtworks.xstream.XStream xStream14 = new com.thoughtworks.xstream.XStream(reflectionProvider13);
        org.jdom.Element element15 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer16 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader17 = new com.thoughtworks.xstream.io.xml.JDomReader(element15, xmlFriendlyReplacer16);
        java.lang.Object obj18 = jDomReader17.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup19 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper20 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper21 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper20);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper22 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper21);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller23 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider13, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader17, converterLookup19, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper22);
        java.lang.Runnable runnable24 = null;
        treeUnmarshaller23.addCompletionCallback(runnable24, 0);
        java.lang.Object obj27 = treeUnmarshaller23.currentObject();
        nu.xom.Element element28 = null;
        java.io.Writer writer29 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer32 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter33 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer29, xmlFriendlyReplacer32);
        com.thoughtworks.xstream.io.xml.XomReader xomReader34 = new com.thoughtworks.xstream.io.xml.XomReader(element28, xmlFriendlyReplacer32);
        java.lang.Object obj35 = null;
        treeUnmarshaller23.put((java.lang.Object) xmlFriendlyReplacer32, obj35);
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader37 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element12, xmlFriendlyReplacer32);
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer40 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter41 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer40);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter42 = xppDomWriter41.underlyingWriter();
        com.thoughtworks.xstream.alias.ClassMapper classMapper43 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper44 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper43);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper45 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper44);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider46 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter47 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper44, reflectionProvider46);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter48 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper44);
        com.thoughtworks.xstream.alias.ClassMapper classMapper49 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup50 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper49);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper51 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper44, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup50);
        com.thoughtworks.xstream.alias.ClassMapper classMapper52 = null;
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller53 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller(hierarchicalStreamWriter42, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup50, classMapper52);
        com.thoughtworks.xstream.alias.ClassMapper classMapper54 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper55 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper54);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper56 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper55);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider57 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter58 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper55, reflectionProvider57);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter59 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper55);
        com.thoughtworks.xstream.alias.ClassMapper classMapper60 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup61 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper60);
        com.thoughtworks.xstream.alias.ClassMapper classMapper62 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper63 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper62);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper64 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper63);
        java.lang.String str66 = xmlFriendlyMapper63.mapNameToXML("hi!");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider67 = null;
        com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter cGLIBEnhancedConverter68 = new com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper63, reflectionProvider67);
        defaultConverterLookup61.registerConverter((com.thoughtworks.xstream.converters.Converter) cGLIBEnhancedConverter68, 0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper71 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper55, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup61);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller72 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) 1003, (com.thoughtworks.xstream.io.HierarchicalStreamReader) dom4JReader37, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup50, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper71);
        com.thoughtworks.xstream.alias.ClassMapper classMapper73 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller.IDGenerator iDGenerator74 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller75 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) saxWriter9, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup50, classMapper73, iDGenerator74);
        com.thoughtworks.xstream.alias.ClassMapper classMapper76 = null;
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller77 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) prettyPrintWriter6, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup50, classMapper76);
        org.junit.Assert.assertNotNull(char_array5);
        org.junit.Assert.assertNull(errorHandler10);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter42);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!" + "'", str66.equals("hi!"));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.dom4j.Element element1 = null;
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider2 = null;
        com.thoughtworks.xstream.XStream xStream3 = new com.thoughtworks.xstream.XStream(reflectionProvider2);
        org.jdom.Element element4 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer5 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader6 = new com.thoughtworks.xstream.io.xml.JDomReader(element4, xmlFriendlyReplacer5);
        java.lang.Object obj7 = jDomReader6.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup8 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper9 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper10 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper9);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper11 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper10);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller12 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider2, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader6, converterLookup8, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper11);
        java.lang.Runnable runnable13 = null;
        treeUnmarshaller12.addCompletionCallback(runnable13, 0);
        java.lang.Object obj16 = treeUnmarshaller12.currentObject();
        nu.xom.Element element17 = null;
        java.io.Writer writer18 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer21 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter22 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer18, xmlFriendlyReplacer21);
        com.thoughtworks.xstream.io.xml.XomReader xomReader23 = new com.thoughtworks.xstream.io.xml.XomReader(element17, xmlFriendlyReplacer21);
        java.lang.Object obj24 = null;
        treeUnmarshaller12.put((java.lang.Object) xmlFriendlyReplacer21, obj24);
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader26 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element1, xmlFriendlyReplacer21);
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer29 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter30 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer29);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter31 = xppDomWriter30.underlyingWriter();
        com.thoughtworks.xstream.alias.ClassMapper classMapper32 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper33 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper32);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper34 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper33);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider35 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter36 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper33, reflectionProvider35);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter37 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper33);
        com.thoughtworks.xstream.alias.ClassMapper classMapper38 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup39 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper38);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper40 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper33, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup39);
        com.thoughtworks.xstream.alias.ClassMapper classMapper41 = null;
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller42 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller(hierarchicalStreamWriter31, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup39, classMapper41);
        com.thoughtworks.xstream.alias.ClassMapper classMapper43 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper44 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper43);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper45 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper44);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider46 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter47 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper44, reflectionProvider46);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter48 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper44);
        com.thoughtworks.xstream.alias.ClassMapper classMapper49 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup50 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper49);
        com.thoughtworks.xstream.alias.ClassMapper classMapper51 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper52 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper51);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper53 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper52);
        java.lang.String str55 = xmlFriendlyMapper52.mapNameToXML("hi!");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider56 = null;
        com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter cGLIBEnhancedConverter57 = new com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper52, reflectionProvider56);
        defaultConverterLookup50.registerConverter((com.thoughtworks.xstream.converters.Converter) cGLIBEnhancedConverter57, 0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper60 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper44, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup50);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller61 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) 1003, (com.thoughtworks.xstream.io.HierarchicalStreamReader) dom4JReader26, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup39, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper60);
        try {
            java.lang.String str63 = dom4JReader26.getAttribute((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter31);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider3 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter4 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1, reflectionProvider3);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter5 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        java.lang.String str7 = xmlFriendlyMapper1.mapNameToXML("");
        com.thoughtworks.xstream.mapper.CachingMapper cachingMapper8 = new com.thoughtworks.xstream.mapper.CachingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        java.lang.ClassLoader classLoader9 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.converters.extended.DynamicProxyConverter dynamicProxyConverter10 = new com.thoughtworks.xstream.converters.extended.DynamicProxyConverter((com.thoughtworks.xstream.mapper.Mapper) cachingMapper8, classLoader9);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider11 = null;
        com.thoughtworks.xstream.XStream xStream12 = new com.thoughtworks.xstream.XStream(reflectionProvider11);
        org.jdom.Element element13 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer14 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader15 = new com.thoughtworks.xstream.io.xml.JDomReader(element13, xmlFriendlyReplacer14);
        java.lang.Object obj16 = jDomReader15.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup17 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper18 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper19 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper18);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper20 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller21 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider11, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader15, converterLookup17, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper20);
        com.thoughtworks.xstream.alias.ClassMapper classMapper22 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper23 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper22);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper24 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper23);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider25 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter26 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper23, reflectionProvider25);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter27 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper23);
        java.lang.String str29 = xmlFriendlyMapper23.mapNameToXML("");
        com.thoughtworks.xstream.mapper.CachingMapper cachingMapper30 = new com.thoughtworks.xstream.mapper.CachingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper23);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider31 = null;
        com.thoughtworks.xstream.XStream xStream32 = new com.thoughtworks.xstream.XStream(reflectionProvider31);
        org.jdom.Element element33 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer34 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader35 = new com.thoughtworks.xstream.io.xml.JDomReader(element33, xmlFriendlyReplacer34);
        java.lang.Object obj36 = jDomReader35.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup37 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper38 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper39 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper38);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper40 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper39);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller41 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider31, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader35, converterLookup37, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper40);
        java.io.Writer writer42 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer43 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter44 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer42, xmlFriendlyReplacer43);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup45 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper46 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper47 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper46);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper48 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper47);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider49 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter50 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper47, reflectionProvider49);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter51 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper47);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller52 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter44, converterLookup45, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper47);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup53 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper54 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller55 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter44, converterLookup53, classMapper54);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter56 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter57 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter58 = saxWriter57.underlyingWriter();
        referenceByIdMarshaller55.put((java.lang.Object) saxWriter56, (java.lang.Object) saxWriter57);
        com.thoughtworks.xstream.XStream xStream60 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter61 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream60.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter61);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup63 = xStream60.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper64 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper65 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper64);
        com.thoughtworks.xstream.mapper.ClassAliasingMapper classAliasingMapper66 = new com.thoughtworks.xstream.mapper.ClassAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper65);
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller68 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) saxWriter57, converterLookup63, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper65, (int) 'a');
        com.thoughtworks.xstream.alias.ClassMapper classMapper69 = null;
        com.thoughtworks.xstream.core.ReferenceByIdUnmarshaller referenceByIdUnmarshaller70 = new com.thoughtworks.xstream.core.ReferenceByIdUnmarshaller((java.lang.Object) cachingMapper30, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader35, converterLookup63, classMapper69);
        try {
            java.lang.Object obj71 = dynamicProxyConverter10.unmarshal((com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader15, (com.thoughtworks.xstream.converters.UnmarshallingContext) referenceByIdUnmarshaller70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter58);
        org.junit.Assert.assertNotNull(converterLookup63);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        byte byte0 = java.io.ObjectStreamConstants.TC_PROXYCLASSDESC;
        org.junit.Assert.assertTrue(byte0 == (byte) 125);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        com.thoughtworks.xstream.converters.reflection.ObjectAccessException objectAccessException1 = new com.thoughtworks.xstream.converters.reflection.ObjectAccessException("http://com.thoughtworks.xstream/XStreamSource/feature");
        com.thoughtworks.xstream.converters.ConversionException conversionException2 = new com.thoughtworks.xstream.converters.ConversionException((java.lang.Throwable) objectAccessException1);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        com.thoughtworks.xstream.converters.extended.ISO8601DateConverter iSO8601DateConverter0 = new com.thoughtworks.xstream.converters.extended.ISO8601DateConverter();
        java.lang.Class class1 = null;
        try {
            boolean b2 = iSO8601DateConverter0.canConvert(class1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup11 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper12 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller13 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup11, classMapper12);
        java.lang.ClassLoader classLoader14 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper15 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader14);
        java.lang.Class class16 = null;
        boolean b18 = defaultMapper15.shouldSerializeMember(class16, "");
        java.lang.Class class19 = null;
        boolean b21 = defaultMapper15.shouldSerializeMember(class19, "enum-type");
        com.thoughtworks.xstream.alias.ClassMapper classMapper22 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper23 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper22);
        com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider pureJavaReflectionProvider24 = new com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider();
        com.thoughtworks.xstream.converters.reflection.ReflectionConverter reflectionConverter25 = new com.thoughtworks.xstream.converters.reflection.ReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) classMapper22, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider24);
        com.thoughtworks.xstream.annotations.AnnotationProvider annotationProvider26 = null;
        com.thoughtworks.xstream.annotations.AnnotationReflectionConverter annotationReflectionConverter27 = new com.thoughtworks.xstream.annotations.AnnotationReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) defaultMapper15, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider24, annotationProvider26);
        com.thoughtworks.xstream.converters.reflection.ReflectionProviderWrapper reflectionProviderWrapper28 = new com.thoughtworks.xstream.converters.reflection.ReflectionProviderWrapper((com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider24);
        com.thoughtworks.xstream.alias.ClassMapper classMapper29 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper30 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper29);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper31 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper30);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider32 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter33 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper30, reflectionProvider32);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter34 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper30);
        java.lang.String str36 = xmlFriendlyMapper30.mapNameToXML("");
        com.thoughtworks.xstream.mapper.CachingMapper cachingMapper37 = new com.thoughtworks.xstream.mapper.CachingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper30);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider38 = null;
        com.thoughtworks.xstream.XStream xStream39 = new com.thoughtworks.xstream.XStream(reflectionProvider38);
        org.jdom.Element element40 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer41 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader42 = new com.thoughtworks.xstream.io.xml.JDomReader(element40, xmlFriendlyReplacer41);
        java.lang.Object obj43 = jDomReader42.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup44 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper45 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper46 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper45);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper47 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper46);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller48 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider38, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader42, converterLookup44, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper47);
        java.io.Writer writer49 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer50 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter51 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer49, xmlFriendlyReplacer50);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup52 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper53 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper54 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper53);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper55 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper54);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider56 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter57 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper54, reflectionProvider56);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter58 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper54);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller59 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter51, converterLookup52, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper54);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup60 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper61 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller62 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter51, converterLookup60, classMapper61);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter63 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter64 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter65 = saxWriter64.underlyingWriter();
        referenceByIdMarshaller62.put((java.lang.Object) saxWriter63, (java.lang.Object) saxWriter64);
        com.thoughtworks.xstream.XStream xStream67 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter68 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream67.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter68);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup70 = xStream67.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper71 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper72 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper71);
        com.thoughtworks.xstream.mapper.ClassAliasingMapper classAliasingMapper73 = new com.thoughtworks.xstream.mapper.ClassAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper72);
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller75 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) saxWriter64, converterLookup70, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper72, (int) 'a');
        com.thoughtworks.xstream.alias.ClassMapper classMapper76 = null;
        com.thoughtworks.xstream.core.ReferenceByIdUnmarshaller referenceByIdUnmarshaller77 = new com.thoughtworks.xstream.core.ReferenceByIdUnmarshaller((java.lang.Object) cachingMapper37, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader42, converterLookup70, classMapper76);
        try {
            referenceByIdMarshaller13.start((java.lang.Object) reflectionProviderWrapper28, (com.thoughtworks.xstream.converters.DataHolder) referenceByIdUnmarshaller77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(classLoader14);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter65);
        org.junit.Assert.assertNotNull(converterLookup70);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        com.thoughtworks.xstream.converters.javabean.PropertyDictionary propertyDictionary0 = new com.thoughtworks.xstream.converters.javabean.PropertyDictionary();
        java.lang.Class class1 = null;
        try {
            com.thoughtworks.xstream.converters.javabean.BeanProperty beanProperty3 = propertyDictionary0.property(class1, "[]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        com.thoughtworks.xstream.converters.collections.CharArrayConverter charArrayConverter0 = new com.thoughtworks.xstream.converters.collections.CharArrayConverter();
        org.jdom.Element element1 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader2 = new com.thoughtworks.xstream.io.xml.JDomReader(element1);
        com.thoughtworks.xstream.alias.ClassMapper classMapper3 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper4 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper3);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper5 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper4);
        com.thoughtworks.xstream.mapper.EnumMapper enumMapper6 = new com.thoughtworks.xstream.mapper.EnumMapper((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper5);
        org.jdom.Element element7 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer8 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader9 = new com.thoughtworks.xstream.io.xml.JDomReader(element7, xmlFriendlyReplacer8);
        java.lang.Object obj10 = jDomReader9.peekUnderlyingNode();
        com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader11 = jDomReader9.underlyingReader();
        com.thoughtworks.xstream.alias.ClassMapper classMapper12 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper13 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper12);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper14 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper13);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider15 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter16 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper13, reflectionProvider15);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter17 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper13);
        com.thoughtworks.xstream.alias.ClassMapper classMapper18 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup19 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper18);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper20 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper13, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup19);
        com.thoughtworks.xstream.alias.ClassMapper classMapper21 = null;
        com.thoughtworks.xstream.mapper.DefaultImplementationsMapper defaultImplementationsMapper22 = new com.thoughtworks.xstream.mapper.DefaultImplementationsMapper(classMapper21);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller23 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) dynamicProxyMapper5, hierarchicalStreamReader11, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup19, (com.thoughtworks.xstream.mapper.Mapper) defaultImplementationsMapper22);
        java.util.Iterator iterator24 = treeUnmarshaller23.keys();
        try {
            java.lang.Object obj25 = charArrayConverter0.unmarshal((com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader2, (com.thoughtworks.xstream.converters.UnmarshallingContext) treeUnmarshaller23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(hierarchicalStreamReader11);
        org.junit.Assert.assertNotNull(iterator24);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.jdom.Element element0 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader1 = new com.thoughtworks.xstream.io.xml.JDomReader(element0);
        try {
            com.thoughtworks.xstream.io.AttributeNameIterator attributeNameIterator2 = new com.thoughtworks.xstream.io.AttributeNameIterator((com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.jdom.Element element0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader2 = new com.thoughtworks.xstream.io.xml.JDomReader(element0, xmlFriendlyReplacer1);
        java.lang.Object obj3 = jDomReader2.peekUnderlyingNode();
        try {
            java.lang.String str5 = jDomReader2.getAttribute((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer0 = null;
        com.thoughtworks.xstream.io.xml.JDomDriver jDomDriver1 = new com.thoughtworks.xstream.io.xml.JDomDriver(xmlFriendlyReplacer0);
        java.io.Writer writer2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter4 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer2, xmlFriendlyReplacer3);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup5 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper6 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper7 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper6);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper8 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper7);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider9 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter10 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper7, reflectionProvider9);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter11 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper7);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller12 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter4, converterLookup5, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper7);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback13 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream14 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback13);
        java.io.ObjectOutputStream.PutField putField15 = customObjectOutputStream14.putFields();
        java.io.Writer writer16 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer17 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter18 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer16, xmlFriendlyReplacer17);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup19 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper20 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper21 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper20);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper22 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper21);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider23 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter24 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper21, reflectionProvider23);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter25 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper21);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller26 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter18, converterLookup19, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper21);
        referenceByIdMarshaller12.put((java.lang.Object) customObjectOutputStream14, (java.lang.Object) referenceByIdMarshaller26);
        java.io.Writer writer28 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer29 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter30 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer28, xmlFriendlyReplacer29);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup31 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper32 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper33 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper32);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper34 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper33);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider35 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter36 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper33, reflectionProvider35);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter37 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper33);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller38 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter30, converterLookup31, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper33);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup39 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper40 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller41 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter30, converterLookup39, classMapper40);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup42 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper43 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper44 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper43);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper45 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper44);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider46 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter47 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper44, reflectionProvider46);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter48 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper44);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller.IDGenerator iDGenerator49 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller50 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter30, converterLookup42, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper44, iDGenerator49);
        java.lang.Object obj51 = referenceByIdMarshaller26.get((java.lang.Object) xmlFriendlyMapper44);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback52 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream53 = com.thoughtworks.xstream.core.util.CustomObjectOutputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller26, streamCallback52);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter54 = jDomDriver1.createWriter((java.io.OutputStream) customObjectOutputStream53);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider55 = null;
        com.thoughtworks.xstream.XStream xStream56 = new com.thoughtworks.xstream.XStream(reflectionProvider55);
        org.jdom.Element element57 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer58 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader59 = new com.thoughtworks.xstream.io.xml.JDomReader(element57, xmlFriendlyReplacer58);
        java.lang.Object obj60 = jDomReader59.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup61 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper62 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper63 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper62);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper64 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper63);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller65 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider55, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader59, converterLookup61, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper64);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback66 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream67 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller65, streamCallback66);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback68 = customObjectInputStream67.peekCallback();
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback69 = customObjectInputStream67.popCallback();
        try {
            com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader70 = jDomDriver1.createReader((java.io.InputStream) customObjectInputStream67);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(putField15);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(customObjectOutputStream53);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter54);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(customObjectInputStream67);
        org.junit.Assert.assertNull(streamCallback68);
        org.junit.Assert.assertNull(streamCallback69);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.dom4j.Element element0 = null;
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream(reflectionProvider1);
        org.jdom.Element element3 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer4 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader5 = new com.thoughtworks.xstream.io.xml.JDomReader(element3, xmlFriendlyReplacer4);
        java.lang.Object obj6 = jDomReader5.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup7 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper8 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper9 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper8);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper10 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper9);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller11 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider1, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader5, converterLookup7, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper10);
        java.lang.Runnable runnable12 = null;
        treeUnmarshaller11.addCompletionCallback(runnable12, 0);
        java.lang.Object obj15 = treeUnmarshaller11.currentObject();
        nu.xom.Element element16 = null;
        java.io.Writer writer17 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer20 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter21 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer17, xmlFriendlyReplacer20);
        com.thoughtworks.xstream.io.xml.XomReader xomReader22 = new com.thoughtworks.xstream.io.xml.XomReader(element16, xmlFriendlyReplacer20);
        java.lang.Object obj23 = null;
        treeUnmarshaller11.put((java.lang.Object) xmlFriendlyReplacer20, obj23);
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader25 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element0, xmlFriendlyReplacer20);
        try {
            java.lang.String str27 = dom4JReader25.getAttribute("enum-type");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        nu.xom.Builder builder0 = null;
        com.thoughtworks.xstream.io.xml.XStream11XmlFriendlyReplacer xStream11XmlFriendlyReplacer1 = new com.thoughtworks.xstream.io.xml.XStream11XmlFriendlyReplacer();
        java.lang.String str3 = xStream11XmlFriendlyReplacer1.unescapeName("http://com.thoughtworks.xstream/XStreamSource/feature");
        com.thoughtworks.xstream.io.xml.XomDriver xomDriver4 = new com.thoughtworks.xstream.io.xml.XomDriver(builder0, (com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer) xStream11XmlFriendlyReplacer1);
        java.io.Reader reader5 = null;
        try {
            com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader6 = xomDriver4.createReader(reader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "http://com.thoughtworks.xstream/XStreamSource/feature" + "'", str3.equals("http://com.thoughtworks.xstream/XStreamSource/feature"));
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper1 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader0);
        java.lang.Class class2 = null;
        boolean b4 = defaultMapper1.shouldSerializeMember(class2, "");
        java.lang.Class class5 = null;
        boolean b7 = defaultMapper1.shouldSerializeMember(class5, "enum-type");
        com.thoughtworks.xstream.alias.ClassMapper classMapper8 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper9 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper8);
        com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider pureJavaReflectionProvider10 = new com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider();
        com.thoughtworks.xstream.converters.reflection.ReflectionConverter reflectionConverter11 = new com.thoughtworks.xstream.converters.reflection.ReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) classMapper8, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider10);
        com.thoughtworks.xstream.annotations.AnnotationProvider annotationProvider12 = null;
        com.thoughtworks.xstream.annotations.AnnotationReflectionConverter annotationReflectionConverter13 = new com.thoughtworks.xstream.annotations.AnnotationReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) defaultMapper1, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider10, annotationProvider12);
        com.thoughtworks.xstream.alias.ClassMapper classMapper14 = null;
        com.thoughtworks.xstream.io.xml.Dom4JDriver dom4JDriver15 = new com.thoughtworks.xstream.io.xml.Dom4JDriver();
        org.dom4j.io.OutputFormat outputFormat16 = null;
        dom4JDriver15.setOutputFormat(outputFormat16);
        org.dom4j.DocumentFactory documentFactory18 = null;
        dom4JDriver15.setDocumentFactory(documentFactory18);
        com.thoughtworks.xstream.XStream xStream20 = new com.thoughtworks.xstream.XStream((com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider10, classMapper14, (com.thoughtworks.xstream.io.HierarchicalStreamDriver) dom4JDriver15);
        java.lang.Class class21 = null;
        xStream20.addImplicitCollection(class21, "class");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider24 = null;
        com.thoughtworks.xstream.XStream xStream25 = new com.thoughtworks.xstream.XStream(reflectionProvider24);
        org.jdom.Element element26 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer27 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader28 = new com.thoughtworks.xstream.io.xml.JDomReader(element26, xmlFriendlyReplacer27);
        java.lang.Object obj29 = jDomReader28.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup30 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper31 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper32 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper31);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper33 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper32);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller34 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider24, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader28, converterLookup30, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper33);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback35 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream36 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller34, streamCallback35);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback37 = customObjectInputStream36.peekCallback();
        try {
            java.lang.Object obj38 = xStream20.fromXML((java.io.InputStream) customObjectInputStream36);
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
        }
        org.junit.Assert.assertNotNull(classLoader0);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(customObjectInputStream36);
        org.junit.Assert.assertNull(streamCallback37);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        org.jdom.Element element2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader4 = new com.thoughtworks.xstream.io.xml.JDomReader(element2, xmlFriendlyReplacer3);
        java.lang.Object obj5 = jDomReader4.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup6 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper7 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper8 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper7);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper9 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper8);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller10 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider0, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader4, converterLookup6, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream12 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller10, streamCallback11);
        try {
            java.lang.String str13 = customObjectInputStream12.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(customObjectInputStream12);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer2 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter3 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer2);
        try {
            xppDomWriter3.endNode();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter4 = attributeMapper2.getConverterFromAttribute("dynamic-proxy");
        java.lang.Class class5 = null;
        attributeMapper2.addAttributeFor(class5);
        com.thoughtworks.xstream.converters.collections.CollectionConverter collectionConverter7 = new com.thoughtworks.xstream.converters.collections.CollectionConverter((com.thoughtworks.xstream.mapper.Mapper) attributeMapper2);
        com.thoughtworks.xstream.converters.extended.SubjectConverter subjectConverter8 = new com.thoughtworks.xstream.converters.extended.SubjectConverter((com.thoughtworks.xstream.mapper.Mapper) attributeMapper2);
        org.jdom.Element element9 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer10 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader11 = new com.thoughtworks.xstream.io.xml.JDomReader(element9, xmlFriendlyReplacer10);
        java.lang.Object obj12 = jDomReader11.peekUnderlyingNode();
        com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader13 = jDomReader11.underlyingReader();
        com.thoughtworks.xstream.alias.ClassMapper classMapper14 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper15 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper14);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper16 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper15);
        com.thoughtworks.xstream.mapper.EnumMapper enumMapper17 = new com.thoughtworks.xstream.mapper.EnumMapper((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper16);
        org.jdom.Element element18 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer19 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader20 = new com.thoughtworks.xstream.io.xml.JDomReader(element18, xmlFriendlyReplacer19);
        java.lang.Object obj21 = jDomReader20.peekUnderlyingNode();
        com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader22 = jDomReader20.underlyingReader();
        com.thoughtworks.xstream.alias.ClassMapper classMapper23 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper24 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper23);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper25 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper24);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider26 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter27 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper24, reflectionProvider26);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter28 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper24);
        com.thoughtworks.xstream.alias.ClassMapper classMapper29 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup30 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper29);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper31 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper24, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup30);
        com.thoughtworks.xstream.alias.ClassMapper classMapper32 = null;
        com.thoughtworks.xstream.mapper.DefaultImplementationsMapper defaultImplementationsMapper33 = new com.thoughtworks.xstream.mapper.DefaultImplementationsMapper(classMapper32);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller34 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) dynamicProxyMapper16, hierarchicalStreamReader22, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup30, (com.thoughtworks.xstream.mapper.Mapper) defaultImplementationsMapper33);
        java.util.Iterator iterator35 = treeUnmarshaller34.keys();
        try {
            java.lang.Object obj36 = subjectConverter8.unmarshal(hierarchicalStreamReader13, (com.thoughtworks.xstream.converters.UnmarshallingContext) treeUnmarshaller34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(singleValueConverter4);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(hierarchicalStreamReader13);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(hierarchicalStreamReader22);
        org.junit.Assert.assertNotNull(iterator35);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter0 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter1 = saxWriter0.underlyingWriter();
        com.thoughtworks.xstream.alias.ClassMapper classMapper2 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup3 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper2);
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        java.lang.String str8 = xmlFriendlyMapper5.mapNameToXML("hi!");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider9 = null;
        com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter cGLIBEnhancedConverter10 = new com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider9);
        defaultConverterLookup3.registerConverter((com.thoughtworks.xstream.converters.Converter) cGLIBEnhancedConverter10, 0);
        com.thoughtworks.xstream.alias.ClassMapper classMapper13 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper14 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper13);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper15 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper14);
        com.thoughtworks.xstream.mapper.ArrayMapper arrayMapper16 = new com.thoughtworks.xstream.mapper.ArrayMapper((com.thoughtworks.xstream.mapper.Mapper) attributeMapper15);
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller18 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) saxWriter0, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup3, (com.thoughtworks.xstream.mapper.Mapper) arrayMapper16, 1003);
        java.io.Writer writer19 = null;
        com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter jsonHierarchicalStreamWriter21 = new com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter(writer19, "");
        java.io.Writer writer22 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer25 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter26 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer25);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter27 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer22, xmlFriendlyReplacer25);
        com.thoughtworks.xstream.XStream xStream28 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter29 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream28.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter29);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup31 = xStream28.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper32 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper33 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper32);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper34 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper33);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter36 = attributeMapper34.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller37 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter27, converterLookup31, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper34);
        com.thoughtworks.xstream.alias.ClassMapper classMapper38 = null;
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller39 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) jsonHierarchicalStreamWriter21, converterLookup31, classMapper38);
        com.thoughtworks.xstream.alias.ClassMapper classMapper40 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller.IDGenerator iDGenerator41 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller42 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) saxWriter0, converterLookup31, classMapper40, iDGenerator41);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter1);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(converterLookup31);
        org.junit.Assert.assertNull(singleValueConverter36);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        java.lang.reflect.Field field0 = null;
        com.thoughtworks.xstream.io.path.Path path2 = new com.thoughtworks.xstream.io.path.Path("");
        com.thoughtworks.xstream.converters.javabean.JavaBeanConverter.DuplicateFieldException duplicateFieldException4 = new com.thoughtworks.xstream.converters.javabean.JavaBeanConverter.DuplicateFieldException("hi!");
        com.thoughtworks.xstream.io.StreamException streamException5 = new com.thoughtworks.xstream.io.StreamException((java.lang.Throwable) duplicateFieldException4);
        java.lang.Throwable[] throwable_array6 = duplicateFieldException4.getSuppressed();
        com.thoughtworks.xstream.converters.ConversionException conversionException7 = new com.thoughtworks.xstream.converters.ConversionException((java.lang.Throwable) duplicateFieldException4);
        try {
            com.thoughtworks.xstream.core.util.Fields.write(field0, (java.lang.Object) "", (java.lang.Object) duplicateFieldException4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(throwable_array6);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        com.thoughtworks.xstream.converters.extended.SqlTimeConverter sqlTimeConverter0 = new com.thoughtworks.xstream.converters.extended.SqlTimeConverter();
        java.lang.Class class1 = null;
        try {
            boolean b2 = sqlTimeConverter0.canConvert(class1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        java.io.File file0 = null;
        com.thoughtworks.xstream.persistence.FileStreamStrategy fileStreamStrategy1 = new com.thoughtworks.xstream.persistence.FileStreamStrategy(file0);
        boolean b3 = fileStreamStrategy1.containsKey((java.lang.Object) (-1L));
        java.io.Writer writer4 = null;
        com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter jsonHierarchicalStreamWriter6 = new com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter(writer4, "");
        java.io.Writer writer7 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer10 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter11 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer10);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter12 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer7, xmlFriendlyReplacer10);
        com.thoughtworks.xstream.XStream xStream13 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter14 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream13.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter14);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup16 = xStream13.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper17 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper18 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper17);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper19 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper18);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter21 = attributeMapper19.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller22 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter12, converterLookup16, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper19);
        com.thoughtworks.xstream.alias.ClassMapper classMapper23 = null;
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller24 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) jsonHierarchicalStreamWriter6, converterLookup16, classMapper23);
        java.lang.Object obj25 = fileStreamStrategy1.remove((java.lang.Object) treeMarshaller24);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter27 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter28 = saxWriter27.underlyingWriter();
        com.thoughtworks.xstream.io.StatefulWriter statefulWriter29 = new com.thoughtworks.xstream.io.StatefulWriter(hierarchicalStreamWriter28);
        int i30 = statefulWriter29.state();
        java.lang.Object obj31 = fileStreamStrategy1.put((java.lang.Object) "http://com.thoughtworks.xstream/sax/property/source-object-list", (java.lang.Object) i30);
        com.thoughtworks.xstream.persistence.XmlArrayList xmlArrayList32 = new com.thoughtworks.xstream.persistence.XmlArrayList((com.thoughtworks.xstream.persistence.StreamStrategy) fileStreamStrategy1);
        com.thoughtworks.xstream.XStream xStream33 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter34 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream33.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter34);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider36 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamDriver hierarchicalStreamDriver37 = null;
        com.thoughtworks.xstream.XStream xStream38 = new com.thoughtworks.xstream.XStream(reflectionProvider36, hierarchicalStreamDriver37);
        com.thoughtworks.xstream.mapper.Mapper mapper39 = xStream38.getMapper();
        com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy referenceByXPathMarshallingStrategy41 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy((int) (byte) 0);
        xStream38.setMarshallingStrategy((com.thoughtworks.xstream.MarshallingStrategy) referenceByXPathMarshallingStrategy41);
        xStream33.setMarshallingStrategy((com.thoughtworks.xstream.MarshallingStrategy) referenceByXPathMarshallingStrategy41);
        try {
            com.thoughtworks.xstream.io.xml.TraxSource traxSource44 = new com.thoughtworks.xstream.io.xml.TraxSource((java.util.List) xmlArrayList32, xStream33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(converterLookup16);
        org.junit.Assert.assertNull(singleValueConverter21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter28);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0 + "'", obj31.equals(0));
        org.junit.Assert.assertNotNull(mapper39);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        com.thoughtworks.xstream.mapper.Mapper mapper0 = null;
        com.thoughtworks.xstream.converters.reflection.ExternalizableConverter externalizableConverter1 = new com.thoughtworks.xstream.converters.reflection.ExternalizableConverter(mapper0);
        com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader2 = null;
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider3 = null;
        com.thoughtworks.xstream.XStream xStream4 = new com.thoughtworks.xstream.XStream(reflectionProvider3);
        org.jdom.Element element5 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer6 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader7 = new com.thoughtworks.xstream.io.xml.JDomReader(element5, xmlFriendlyReplacer6);
        java.lang.Object obj8 = jDomReader7.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup9 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper10 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper11 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper10);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper12 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller13 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider3, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader7, converterLookup9, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper12);
        try {
            java.lang.Object obj14 = externalizableConverter1.unmarshal(hierarchicalStreamReader2, (com.thoughtworks.xstream.converters.UnmarshallingContext) treeUnmarshaller13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.dom4j.Element element0 = null;
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream(reflectionProvider1);
        org.jdom.Element element3 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer4 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader5 = new com.thoughtworks.xstream.io.xml.JDomReader(element3, xmlFriendlyReplacer4);
        java.lang.Object obj6 = jDomReader5.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup7 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper8 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper9 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper8);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper10 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper9);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller11 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider1, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader5, converterLookup7, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper10);
        java.lang.Runnable runnable12 = null;
        treeUnmarshaller11.addCompletionCallback(runnable12, 0);
        java.lang.Object obj15 = treeUnmarshaller11.currentObject();
        nu.xom.Element element16 = null;
        java.io.Writer writer17 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer20 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter21 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer17, xmlFriendlyReplacer20);
        com.thoughtworks.xstream.io.xml.XomReader xomReader22 = new com.thoughtworks.xstream.io.xml.XomReader(element16, xmlFriendlyReplacer20);
        java.lang.Object obj23 = null;
        treeUnmarshaller11.put((java.lang.Object) xmlFriendlyReplacer20, obj23);
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader25 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element0, xmlFriendlyReplacer20);
        try {
            java.lang.String str27 = dom4JReader25.getAttributeName(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        org.jdom.Element element2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader4 = new com.thoughtworks.xstream.io.xml.JDomReader(element2, xmlFriendlyReplacer3);
        java.lang.Object obj5 = jDomReader4.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup6 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper7 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper8 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper7);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper9 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper8);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller10 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider0, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader4, converterLookup6, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9);
        java.lang.String str11 = dynamicProxyMapper9.getAlias();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup12 = null;
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper13 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9, converterLookup12);
        java.lang.Class class14 = null;
        java.lang.Class class15 = null;
        try {
            java.lang.String str17 = dynamicProxyMapper9.getFieldNameForItemTypeAndName(class14, class15, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "dynamic-proxy" + "'", str11.equals("dynamic-proxy"));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer2 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter3 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer2);
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom4 = xppDomWriter3.getConfiguration();
        org.junit.Assert.assertNull(xpp3Dom4);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider3 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter4 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1, reflectionProvider3);
        org.jdom.Element element5 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer6 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader7 = new com.thoughtworks.xstream.io.xml.JDomReader(element5, xmlFriendlyReplacer6);
        java.lang.Object obj8 = jDomReader7.peekUnderlyingNode();
        com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader9 = jDomReader7.underlyingReader();
        com.thoughtworks.xstream.alias.ClassMapper classMapper10 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper11 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper10);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper12 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper11);
        com.thoughtworks.xstream.mapper.EnumMapper enumMapper13 = new com.thoughtworks.xstream.mapper.EnumMapper((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper12);
        org.jdom.Element element14 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer15 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader16 = new com.thoughtworks.xstream.io.xml.JDomReader(element14, xmlFriendlyReplacer15);
        java.lang.Object obj17 = jDomReader16.peekUnderlyingNode();
        com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader18 = jDomReader16.underlyingReader();
        com.thoughtworks.xstream.alias.ClassMapper classMapper19 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper20 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper19);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper21 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper20);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider22 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter23 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper20, reflectionProvider22);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter24 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper20);
        com.thoughtworks.xstream.alias.ClassMapper classMapper25 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup26 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper25);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper27 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper20, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup26);
        com.thoughtworks.xstream.alias.ClassMapper classMapper28 = null;
        com.thoughtworks.xstream.mapper.DefaultImplementationsMapper defaultImplementationsMapper29 = new com.thoughtworks.xstream.mapper.DefaultImplementationsMapper(classMapper28);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller30 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) dynamicProxyMapper12, hierarchicalStreamReader18, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup26, (com.thoughtworks.xstream.mapper.Mapper) defaultImplementationsMapper29);
        try {
            java.lang.Object obj31 = serializableConverter4.unmarshal(hierarchicalStreamReader9, (com.thoughtworks.xstream.converters.UnmarshallingContext) treeUnmarshaller30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(hierarchicalStreamReader9);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(hierarchicalStreamReader18);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup3 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller10 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup3, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper11 = new com.thoughtworks.xstream.mapper.CGLIBMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper12 = new com.thoughtworks.xstream.mapper.CGLIBMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        java.lang.Class class13 = null;
        try {
            java.lang.String str15 = xmlFriendlyMapper5.realMember(class13, "cwpx");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamDriver hierarchicalStreamDriver1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream(reflectionProvider0, hierarchicalStreamDriver1);
        com.thoughtworks.xstream.alias.ClassMapper classMapper3 = null;
        com.thoughtworks.xstream.converters.javabean.JavaBeanConverter javaBeanConverter5 = new com.thoughtworks.xstream.converters.javabean.JavaBeanConverter(classMapper3, "");
        xStream2.registerConverter((com.thoughtworks.xstream.converters.Converter) javaBeanConverter5);
        com.thoughtworks.xstream.converters.basic.FloatConverter floatConverter7 = new com.thoughtworks.xstream.converters.basic.FloatConverter();
        xStream2.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) floatConverter7);
        try {
            java.lang.Object obj10 = floatConverter7.fromString("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper1 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader0);
        com.thoughtworks.xstream.converters.extended.JavaMethodConverter javaMethodConverter2 = new com.thoughtworks.xstream.converters.extended.JavaMethodConverter(classLoader0);
        com.thoughtworks.xstream.alias.ClassMapper classMapper3 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper4 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper3);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper5 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper4);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter7 = attributeMapper5.getConverterFromAttribute("dynamic-proxy");
        java.lang.Class class8 = null;
        attributeMapper5.addAttributeFor(class8);
        com.thoughtworks.xstream.converters.collections.CollectionConverter collectionConverter10 = new com.thoughtworks.xstream.converters.collections.CollectionConverter((com.thoughtworks.xstream.mapper.Mapper) attributeMapper5);
        com.thoughtworks.xstream.converters.extended.SubjectConverter subjectConverter11 = new com.thoughtworks.xstream.converters.extended.SubjectConverter((com.thoughtworks.xstream.mapper.Mapper) attributeMapper5);
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer14 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter15 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer14);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter16 = xppDomWriter15.underlyingWriter();
        java.io.Writer writer17 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer18 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter19 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer17, xmlFriendlyReplacer18);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter20 = compactWriter19.underlyingWriter();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup21 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper22 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper23 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper22);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller.IDGenerator iDGenerator24 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller25 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter19, converterLookup21, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper23, iDGenerator24);
        try {
            javaMethodConverter2.marshal((java.lang.Object) subjectConverter11, hierarchicalStreamWriter16, (com.thoughtworks.xstream.converters.MarshallingContext) referenceByIdMarshaller25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(classLoader0);
        org.junit.Assert.assertNull(singleValueConverter7);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter16);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter20);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        org.jdom.Element element2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader4 = new com.thoughtworks.xstream.io.xml.JDomReader(element2, xmlFriendlyReplacer3);
        java.lang.Object obj5 = jDomReader4.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup6 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper7 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper8 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper7);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper9 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper8);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller10 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider0, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader4, converterLookup6, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream12 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller10, streamCallback11);
        try {
            long long13 = customObjectInputStream12.readLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(customObjectInputStream12);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer2 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter3 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer2);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter4 = xppDomWriter3.underlyingWriter();
        java.lang.Class class6 = null;
        xppDomWriter3.startNode("class", class6);
        java.io.Writer writer8 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer11 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter12 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer11);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter13 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer8, xmlFriendlyReplacer11);
        com.thoughtworks.xstream.XStream xStream14 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter15 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream14.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter15);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup17 = xStream14.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper18 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper19 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper18);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper20 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter22 = attributeMapper20.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller23 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter13, converterLookup17, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper20);
        com.thoughtworks.xstream.alias.ClassMapper classMapper24 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller25 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) xppDomWriter3, converterLookup17, classMapper24);
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom26 = xppDomWriter3.getConfiguration();
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom27 = xppDomWriter3.getConfiguration();
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom28 = null;
        xpp3Dom27.setParent(xpp3Dom28);
        org.jdom.Element element30 = null;
        nu.xom.Element element31 = null;
        java.io.Writer writer32 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer35 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter36 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer32, xmlFriendlyReplacer35);
        com.thoughtworks.xstream.io.xml.XomReader xomReader37 = new com.thoughtworks.xstream.io.xml.XomReader(element31, xmlFriendlyReplacer35);
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader38 = new com.thoughtworks.xstream.io.xml.JDomReader(element30, xmlFriendlyReplacer35);
        com.thoughtworks.xstream.io.xml.XppDomReader xppDomReader39 = new com.thoughtworks.xstream.io.xml.XppDomReader(xpp3Dom27, xmlFriendlyReplacer35);
        try {
            java.lang.String str41 = xppDomReader39.getAttribute((int) (byte) 115);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter4);
        org.junit.Assert.assertNotNull(converterLookup17);
        org.junit.Assert.assertNull(singleValueConverter22);
        org.junit.Assert.assertNotNull(xpp3Dom26);
        org.junit.Assert.assertNotNull(xpp3Dom27);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        java.io.Writer writer0 = null;
        java.io.Writer writer1 = null;
        char[] char_array6 = new char[] { 'a', '4', '4', ' ' };
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter7 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer1, char_array6);
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter9 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer0, char_array6, "enum-type");
        try {
            prettyPrintWriter9.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(char_array6);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.jdom.JDOMFactory jDOMFactory0 = null;
        com.thoughtworks.xstream.io.xml.JDomWriter jDomWriter1 = new com.thoughtworks.xstream.io.xml.JDomWriter(jDOMFactory0);
        try {
            jDomWriter1.addAttribute("http://com.thoughtworks.xstream/XStreamSource/feature", "http://com.thoughtworks.xstream/XStreamSource/feature");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter4 = attributeMapper2.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.converters.collections.TreeMapConverter treeMapConverter5 = new com.thoughtworks.xstream.converters.collections.TreeMapConverter((com.thoughtworks.xstream.mapper.Mapper) attributeMapper2);
        java.lang.Class class6 = null;
        try {
            boolean b7 = treeMapConverter5.canConvert(class6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(singleValueConverter4);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        org.w3c.dom.Document document0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        try {
            com.thoughtworks.xstream.io.xml.DomReader domReader2 = new com.thoughtworks.xstream.io.xml.DomReader(document0, xmlFriendlyReplacer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback0 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream1 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback0);
        java.io.ObjectOutputStream.PutField putField2 = customObjectOutputStream1.putFields();
        byte[] byte_array9 = new byte[] { (byte) 118, (byte) 123, (byte) 10, (byte) 122, (byte) 126, (byte) 124 };
        try {
            customObjectOutputStream1.write(byte_array9, (int) (byte) 115, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(putField2);
        org.junit.Assert.assertNotNull(byte_array9);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        com.thoughtworks.xstream.mapper.CannotResolveClassException cannotResolveClassException1 = new com.thoughtworks.xstream.mapper.CannotResolveClassException("");
        java.lang.String str2 = cannotResolveClassException1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "com.thoughtworks.xstream.mapper.CannotResolveClassException: " + "'", str2.equals("com.thoughtworks.xstream.mapper.CannotResolveClassException: "));
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider pureJavaReflectionProvider2 = new com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider();
        com.thoughtworks.xstream.converters.reflection.ReflectionConverter reflectionConverter3 = new com.thoughtworks.xstream.converters.reflection.ReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) classMapper0, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider2);
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider5 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper6 = null;
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap7 = null;
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver9 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap7, true);
        com.thoughtworks.xstream.XStream xStream11 = new com.thoughtworks.xstream.XStream(reflectionProvider5, classMapper6, (com.thoughtworks.xstream.io.HierarchicalStreamDriver) staxDriver9, "hi!");
        com.thoughtworks.xstream.XStream xStream13 = new com.thoughtworks.xstream.XStream((com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider2, classMapper4, (com.thoughtworks.xstream.io.HierarchicalStreamDriver) staxDriver9, "");
        com.thoughtworks.xstream.converters.reflection.ReflectionProviderWrapper reflectionProviderWrapper14 = new com.thoughtworks.xstream.converters.reflection.ReflectionProviderWrapper((com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider2);
        com.thoughtworks.xstream.alias.ClassMapper classMapper15 = null;
        nu.xom.Builder builder16 = null;
        com.thoughtworks.xstream.io.xml.XStream11XmlFriendlyReplacer xStream11XmlFriendlyReplacer17 = new com.thoughtworks.xstream.io.xml.XStream11XmlFriendlyReplacer();
        java.lang.String str19 = xStream11XmlFriendlyReplacer17.unescapeName("http://com.thoughtworks.xstream/XStreamSource/feature");
        com.thoughtworks.xstream.io.xml.XomDriver xomDriver20 = new com.thoughtworks.xstream.io.xml.XomDriver(builder16, (com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer) xStream11XmlFriendlyReplacer17);
        com.thoughtworks.xstream.XStream xStream21 = new com.thoughtworks.xstream.XStream((com.thoughtworks.xstream.converters.reflection.ReflectionProvider) reflectionProviderWrapper14, classMapper15, (com.thoughtworks.xstream.io.HierarchicalStreamDriver) xomDriver20);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "http://com.thoughtworks.xstream/XStreamSource/feature" + "'", str19.equals("http://com.thoughtworks.xstream/XStreamSource/feature"));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        org.jdom.Element element2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader4 = new com.thoughtworks.xstream.io.xml.JDomReader(element2, xmlFriendlyReplacer3);
        java.lang.Object obj5 = jDomReader4.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup6 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper7 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper8 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper7);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper9 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper8);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller10 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider0, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader4, converterLookup6, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback11 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream12 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller10, streamCallback11);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback13 = customObjectInputStream12.peekCallback();
        try {
            customObjectInputStream12.mark(100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(customObjectInputStream12);
        org.junit.Assert.assertNull(streamCallback13);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        com.thoughtworks.xstream.mapper.Mapper mapper0 = null;
        com.thoughtworks.xstream.converters.reflection.ExternalizableConverter externalizableConverter1 = new com.thoughtworks.xstream.converters.reflection.ExternalizableConverter(mapper0);
        java.io.Writer writer3 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer6 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter7 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer6);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter8 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer3, xmlFriendlyReplacer6);
        com.thoughtworks.xstream.io.xml.XppDomDriver xppDomDriver9 = new com.thoughtworks.xstream.io.xml.XppDomDriver(xmlFriendlyReplacer6);
        java.io.Writer writer10 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer11 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter12 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer10, xmlFriendlyReplacer11);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter13 = compactWriter12.underlyingWriter();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup14 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper15 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper16 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper15);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller.IDGenerator iDGenerator17 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller18 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter12, converterLookup14, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper16, iDGenerator17);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback19 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream20 = com.thoughtworks.xstream.core.util.CustomObjectOutputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller18, streamCallback19);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter21 = xppDomDriver9.createWriter((java.io.OutputStream) customObjectOutputStream20);
        java.io.File file22 = null;
        com.thoughtworks.xstream.persistence.FileStreamStrategy fileStreamStrategy23 = new com.thoughtworks.xstream.persistence.FileStreamStrategy(file22);
        boolean b25 = fileStreamStrategy23.containsKey((java.lang.Object) (-1L));
        java.io.Writer writer26 = null;
        com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter jsonHierarchicalStreamWriter28 = new com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter(writer26, "");
        java.io.Writer writer29 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer32 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter33 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer32);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter34 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer29, xmlFriendlyReplacer32);
        com.thoughtworks.xstream.XStream xStream35 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter36 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream35.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter36);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup38 = xStream35.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper39 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper40 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper39);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper41 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper40);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter43 = attributeMapper41.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller44 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter34, converterLookup38, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper41);
        com.thoughtworks.xstream.alias.ClassMapper classMapper45 = null;
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller46 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) jsonHierarchicalStreamWriter28, converterLookup38, classMapper45);
        java.lang.Object obj47 = fileStreamStrategy23.remove((java.lang.Object) treeMarshaller46);
        try {
            externalizableConverter1.marshal((java.lang.Object) (short) 100, hierarchicalStreamWriter21, (com.thoughtworks.xstream.converters.MarshallingContext) treeMarshaller46);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter13);
        org.junit.Assert.assertNotNull(customObjectOutputStream20);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(converterLookup38);
        org.junit.Assert.assertNull(singleValueConverter43);
        org.junit.Assert.assertNull(obj47);
    }
}

