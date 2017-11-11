import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test001");
        com.thoughtworks.xstream.XStream xStream0 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter1 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream0.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter1);
        com.thoughtworks.xstream.MarshallingStrategy marshallingStrategy3 = null;
        xStream0.setMarshallingStrategy(marshallingStrategy3);
        xStream0.aliasAttribute("http://com.thoughtworks.xstream/XStreamSource/feature", "class");
        java.lang.ClassLoader classLoader8 = xStream0.getClassLoader();
        java.lang.ClassLoader classLoader9 = classLoader8.getParent();
        classLoader9.setDefaultAssertionStatus(false);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(classLoader9);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test002");
        com.thoughtworks.xstream.converters.basic.FloatConverter floatConverter0 = new com.thoughtworks.xstream.converters.basic.FloatConverter();
        try {
            java.lang.Object obj2 = floatConverter0.fromString("com.thoughtworks.xstream.mapper.CannotResolveClassException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test003");
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
            com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback15 = customObjectInputStream12.popCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(customObjectInputStream12);
        org.junit.Assert.assertNull(streamCallback13);
        org.junit.Assert.assertNull(streamCallback14);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test004");
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
        com.thoughtworks.xstream.alias.ClassMapper classMapper16 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper17 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper16);
        com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider pureJavaReflectionProvider18 = new com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider();
        com.thoughtworks.xstream.converters.reflection.ReflectionConverter reflectionConverter19 = new com.thoughtworks.xstream.converters.reflection.ReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) classMapper16, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider18);
        com.thoughtworks.xstream.converters.reflection.ReflectionConverter reflectionConverter20 = new com.thoughtworks.xstream.converters.reflection.ReflectionConverter((com.thoughtworks.xstream.mapper.Mapper) attributeMapper12, (com.thoughtworks.xstream.converters.reflection.ReflectionProvider) pureJavaReflectionProvider18);
        java.lang.ClassLoader classLoader21 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper22 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader21);
        java.lang.Class class23 = null;
        boolean b25 = defaultMapper22.shouldSerializeMember(class23, "");
        java.lang.String str27 = defaultMapper22.attributeForAlias("hi!");
        java.lang.Class class28 = null;
        boolean b30 = defaultMapper22.shouldSerializeMember(class28, "defined-in");
        java.lang.String str32 = defaultMapper22.attributeForAlias("http://com.thoughtworks.xstream/sax/property/source-object-list");
        com.thoughtworks.xstream.mapper.DefaultImplementationsMapper defaultImplementationsMapper33 = new com.thoughtworks.xstream.mapper.DefaultImplementationsMapper((com.thoughtworks.xstream.mapper.Mapper) defaultMapper22);
        org.dom4j.Element element34 = null;
        org.dom4j.DocumentFactory documentFactory35 = null;
        org.dom4j.io.OutputFormat outputFormat36 = null;
        java.io.Writer writer37 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer40 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter41 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer37, xmlFriendlyReplacer40);
        com.thoughtworks.xstream.io.xml.Dom4JDriver dom4JDriver42 = new com.thoughtworks.xstream.io.xml.Dom4JDriver(documentFactory35, outputFormat36, xmlFriendlyReplacer40);
        com.thoughtworks.xstream.io.xml.XomDriver xomDriver43 = new com.thoughtworks.xstream.io.xml.XomDriver(xmlFriendlyReplacer40);
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader44 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element34, xmlFriendlyReplacer40);
        com.thoughtworks.xstream.alias.ClassMapper classMapper45 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper46 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper45);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper47 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper46);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider48 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter49 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper46, reflectionProvider48);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter50 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper46);
        java.lang.String str52 = xmlFriendlyMapper46.mapNameToXML("");
        com.thoughtworks.xstream.mapper.CachingMapper cachingMapper53 = new com.thoughtworks.xstream.mapper.CachingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper46);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider54 = null;
        com.thoughtworks.xstream.XStream xStream55 = new com.thoughtworks.xstream.XStream(reflectionProvider54);
        org.jdom.Element element56 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer57 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader58 = new com.thoughtworks.xstream.io.xml.JDomReader(element56, xmlFriendlyReplacer57);
        java.lang.Object obj59 = jDomReader58.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup60 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper61 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper62 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper61);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper63 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper62);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller64 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider54, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader58, converterLookup60, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper63);
        java.io.Writer writer65 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer66 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter67 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer65, xmlFriendlyReplacer66);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup68 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper69 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper70 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper69);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper71 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper70);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider72 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter73 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper70, reflectionProvider72);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter74 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper70);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller75 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter67, converterLookup68, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper70);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup76 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper77 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller78 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter67, converterLookup76, classMapper77);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter79 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter80 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter81 = saxWriter80.underlyingWriter();
        referenceByIdMarshaller78.put((java.lang.Object) saxWriter79, (java.lang.Object) saxWriter80);
        com.thoughtworks.xstream.XStream xStream83 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter84 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream83.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter84);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup86 = xStream83.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper87 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper88 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper87);
        com.thoughtworks.xstream.mapper.ClassAliasingMapper classAliasingMapper89 = new com.thoughtworks.xstream.mapper.ClassAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper88);
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller91 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) saxWriter80, converterLookup86, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper88, (int) 'a');
        com.thoughtworks.xstream.alias.ClassMapper classMapper92 = null;
        com.thoughtworks.xstream.core.ReferenceByIdUnmarshaller referenceByIdUnmarshaller93 = new com.thoughtworks.xstream.core.ReferenceByIdUnmarshaller((java.lang.Object) cachingMapper53, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader58, converterLookup86, classMapper92);
        try {
            java.lang.Object obj94 = reflectionConverter20.doUnmarshal((java.lang.Object) defaultMapper22, (com.thoughtworks.xstream.io.HierarchicalStreamReader) dom4JReader44, (com.thoughtworks.xstream.converters.UnmarshallingContext) referenceByIdUnmarshaller93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(converterLookup9);
        org.junit.Assert.assertNull(singleValueConverter14);
        org.junit.Assert.assertNotNull(classLoader21);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "http://com.thoughtworks.xstream/sax/property/source-object-list" + "'", str32.equals("http://com.thoughtworks.xstream/sax/property/source-object-list"));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter81);
        org.junit.Assert.assertNotNull(converterLookup86);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test005");
        com.thoughtworks.xstream.io.path.PathTracker pathTracker0 = new com.thoughtworks.xstream.io.path.PathTracker();
        com.thoughtworks.xstream.io.path.Path path1 = pathTracker0.getPath();
        java.lang.String str2 = pathTracker0.getCurrentPath();
        java.lang.String str3 = pathTracker0.getCurrentPath();
        org.junit.Assert.assertNotNull(path1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test006");
        nu.xom.Element element0 = null;
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap1 = null;
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer5 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XomDriver xomDriver6 = new com.thoughtworks.xstream.io.xml.XomDriver(xmlFriendlyReplacer5);
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver7 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap2, xmlFriendlyReplacer5);
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver8 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap1, xmlFriendlyReplacer5);
        com.thoughtworks.xstream.io.xml.JDomDriver jDomDriver9 = new com.thoughtworks.xstream.io.xml.JDomDriver(xmlFriendlyReplacer5);
        com.thoughtworks.xstream.io.xml.XomWriter xomWriter10 = new com.thoughtworks.xstream.io.xml.XomWriter(element0, xmlFriendlyReplacer5);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter11 = xomWriter10.underlyingWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter12 = xomWriter10.underlyingWriter();
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter11);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter12);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test007");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.OuterClassMapper outerClassMapper2 = new com.thoughtworks.xstream.mapper.OuterClassMapper(classMapper0, "");
        com.thoughtworks.xstream.converters.extended.ColorConverter colorConverter3 = new com.thoughtworks.xstream.converters.extended.ColorConverter();
        com.thoughtworks.xstream.converters.extended.FontConverter fontConverter4 = new com.thoughtworks.xstream.converters.extended.FontConverter();
        java.lang.ClassLoader classLoader5 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper6 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader5);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper7 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) defaultMapper6);
        com.thoughtworks.xstream.converters.javabean.JavaBeanConverter javaBeanConverter9 = new com.thoughtworks.xstream.converters.javabean.JavaBeanConverter((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper7, "/");
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer12 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter13 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer12);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter14 = xppDomWriter13.underlyingWriter();
        java.lang.Class class16 = null;
        xppDomWriter13.startNode("class", class16);
        java.io.Writer writer18 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer21 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter22 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer21);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter23 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer18, xmlFriendlyReplacer21);
        com.thoughtworks.xstream.XStream xStream24 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter25 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream24.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter25);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup27 = xStream24.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper28 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper29 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper28);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper30 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper29);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter32 = attributeMapper30.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller33 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter23, converterLookup27, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper30);
        com.thoughtworks.xstream.alias.ClassMapper classMapper34 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller35 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) xppDomWriter13, converterLookup27, classMapper34);
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom36 = xppDomWriter13.getConfiguration();
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom37 = xppDomWriter13.getConfiguration();
        com.thoughtworks.xstream.alias.ClassMapper classMapper39 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper40 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper39);
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper42 = new com.thoughtworks.xstream.mapper.CGLIBMapper((com.thoughtworks.xstream.mapper.Mapper) classMapper39, "hi!");
        java.lang.Class class44 = cGLIBMapper42.realClass("hi!");
        xppDomWriter13.startNode("/", class44);
        boolean b47 = dynamicProxyMapper7.shouldSerializeMember(class44, "class");
        boolean b48 = fontConverter4.canConvert(class44);
        boolean b49 = colorConverter3.canConvert(class44);
        try {
            java.lang.String str51 = outerClassMapper2.realMember(class44, "hi!\n---- Debugging information ----\n-------------------------------");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter14);
        org.junit.Assert.assertNotNull(converterLookup27);
        org.junit.Assert.assertNull(singleValueConverter32);
        org.junit.Assert.assertNotNull(xpp3Dom36);
        org.junit.Assert.assertNotNull(xpp3Dom37);
        org.junit.Assert.assertNotNull(class44);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test008");
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter1 = new com.thoughtworks.xstream.io.xml.SaxWriter(false);
        saxWriter1.startNode("hi!\n---- Debugging information ----\n-------------------------------");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test009");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamDriver hierarchicalStreamDriver1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream(reflectionProvider0, hierarchicalStreamDriver1);
        com.thoughtworks.xstream.mapper.Mapper mapper3 = xStream2.getMapper();
        com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy referenceByXPathMarshallingStrategy5 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy((int) (byte) 0);
        xStream2.setMarshallingStrategy((com.thoughtworks.xstream.MarshallingStrategy) referenceByXPathMarshallingStrategy5);
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap7 = new com.thoughtworks.xstream.io.xml.QNameMap();
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver9 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap7, true);
        javax.xml.stream.XMLStreamWriter xMLStreamWriter10 = null;
        com.thoughtworks.xstream.io.xml.StaxWriter staxWriter13 = new com.thoughtworks.xstream.io.xml.StaxWriter(qNameMap7, xMLStreamWriter10, false, true);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter14 = staxWriter13.underlyingWriter();
        try {
            java.io.ObjectOutputStream objectOutputStream15 = xStream2.createObjectOutputStream(hierarchicalStreamWriter14);
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
        }
        org.junit.Assert.assertNotNull(mapper3);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter14);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test010");
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter0 = null;
        com.thoughtworks.xstream.converters.SingleValueConverterWrapper singleValueConverterWrapper1 = new com.thoughtworks.xstream.converters.SingleValueConverterWrapper(singleValueConverter0);
        com.thoughtworks.xstream.converters.extended.FileConverter fileConverter2 = new com.thoughtworks.xstream.converters.extended.FileConverter();
        java.lang.Object obj4 = fileConverter2.fromString("");
        java.lang.Object obj6 = fileConverter2.fromString("[]");
        try {
            java.lang.String str7 = singleValueConverterWrapper1.toString(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test011");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamDriver hierarchicalStreamDriver1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream(reflectionProvider0, hierarchicalStreamDriver1);
        java.lang.Class class3 = null;
        xStream2.useAttributeFor(class3);
        java.lang.ClassLoader classLoader5 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper6 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader5);
        com.thoughtworks.xstream.converters.extended.JavaMethodConverter javaMethodConverter7 = new com.thoughtworks.xstream.converters.extended.JavaMethodConverter(classLoader5);
        xStream2.setClassLoader(classLoader5);
        classLoader5.clearAssertionStatus();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper10 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader5);
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper11 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper((com.thoughtworks.xstream.mapper.Mapper) defaultMapper10);
        com.thoughtworks.xstream.alias.ClassMapper classMapper12 = null;
        com.thoughtworks.xstream.mapper.FieldAliasingMapper fieldAliasingMapper13 = new com.thoughtworks.xstream.mapper.FieldAliasingMapper(classMapper12);
        com.thoughtworks.xstream.alias.ClassMapper classMapper14 = null;
        com.thoughtworks.xstream.mapper.ImplicitCollectionMapper implicitCollectionMapper15 = new com.thoughtworks.xstream.mapper.ImplicitCollectionMapper(classMapper14);
        com.thoughtworks.xstream.alias.ClassMapper classMapper16 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper17 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper16);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper18 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper17);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter20 = attributeMapper18.getConverterFromAttribute("dynamic-proxy");
        java.lang.Class class21 = null;
        attributeMapper18.addAttributeFor(class21);
        com.thoughtworks.xstream.converters.collections.CollectionConverter collectionConverter23 = new com.thoughtworks.xstream.converters.collections.CollectionConverter((com.thoughtworks.xstream.mapper.Mapper) attributeMapper18);
        com.thoughtworks.xstream.mapper.CachingMapper cachingMapper24 = new com.thoughtworks.xstream.mapper.CachingMapper((com.thoughtworks.xstream.mapper.Mapper) attributeMapper18);
        com.thoughtworks.xstream.mapper.FieldAliasingMapper fieldAliasingMapper25 = new com.thoughtworks.xstream.mapper.FieldAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) attributeMapper18);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider26 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamDriver hierarchicalStreamDriver27 = null;
        com.thoughtworks.xstream.XStream xStream28 = new com.thoughtworks.xstream.XStream(reflectionProvider26, hierarchicalStreamDriver27);
        com.thoughtworks.xstream.alias.ClassMapper classMapper29 = null;
        com.thoughtworks.xstream.converters.javabean.JavaBeanConverter javaBeanConverter31 = new com.thoughtworks.xstream.converters.javabean.JavaBeanConverter(classMapper29, "");
        xStream28.registerConverter((com.thoughtworks.xstream.converters.Converter) javaBeanConverter31);
        java.lang.Class[] class_array34 = new java.lang.Class[0];
        @SuppressWarnings("unchecked") java.lang.Class<?>[] cls_array35 = (java.lang.Class<?>[]) class_array34;
        com.thoughtworks.xstream.annotations.Annotations.configureAliases(xStream28, cls_array35);
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer40 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter41 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer40);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter42 = xppDomWriter41.underlyingWriter();
        java.lang.Class class44 = null;
        xppDomWriter41.startNode("class", class44);
        java.io.Writer writer46 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer49 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter50 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer49);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter51 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer46, xmlFriendlyReplacer49);
        com.thoughtworks.xstream.XStream xStream52 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter53 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream52.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter53);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup55 = xStream52.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper56 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper57 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper56);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper58 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper57);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter60 = attributeMapper58.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller61 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter51, converterLookup55, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper58);
        com.thoughtworks.xstream.alias.ClassMapper classMapper62 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller63 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) xppDomWriter41, converterLookup55, classMapper62);
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom64 = xppDomWriter41.getConfiguration();
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom65 = xppDomWriter41.getConfiguration();
        com.thoughtworks.xstream.alias.ClassMapper classMapper67 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper68 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper67);
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper70 = new com.thoughtworks.xstream.mapper.CGLIBMapper((com.thoughtworks.xstream.mapper.Mapper) classMapper67, "hi!");
        java.lang.Class class72 = cGLIBMapper70.realClass("hi!");
        xppDomWriter41.startNode("/", class72);
        xStream28.alias("resolves-to", class72);
        fieldAliasingMapper25.omitField(class72, "hi!");
        com.thoughtworks.xstream.alias.ClassMapper classMapper78 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper79 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper78);
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper81 = new com.thoughtworks.xstream.mapper.CGLIBMapper((com.thoughtworks.xstream.mapper.Mapper) classMapper78, "hi!");
        java.lang.Class class83 = cGLIBMapper81.realClass("hi!");
        implicitCollectionMapper15.add(class72, "/", class83);
        boolean b86 = fieldAliasingMapper13.shouldSerializeMember(class72, "hi!");
        immutableTypesMapper11.addImmutableType(class72);
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertNull(singleValueConverter20);
        org.junit.Assert.assertNotNull(class_array34);
        org.junit.Assert.assertNotNull(cls_array35);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter42);
        org.junit.Assert.assertNotNull(converterLookup55);
        org.junit.Assert.assertNull(singleValueConverter60);
        org.junit.Assert.assertNotNull(xpp3Dom64);
        org.junit.Assert.assertNotNull(xpp3Dom65);
        org.junit.Assert.assertNotNull(class72);
        org.junit.Assert.assertNotNull(class83);
        org.junit.Assert.assertTrue(b86 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test012");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper2 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.mapper.AttributeAliasingMapper attributeAliasingMapper3 = new com.thoughtworks.xstream.mapper.AttributeAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper2);
        try {
            java.lang.String str5 = attributeAliasingMapper3.aliasForAttribute("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test013");
        com.thoughtworks.xstream.XStream xStream0 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter1 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream0.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter1);
        com.thoughtworks.xstream.MarshallingStrategy marshallingStrategy3 = null;
        xStream0.setMarshallingStrategy(marshallingStrategy3);
        com.thoughtworks.xstream.converters.collections.BitSetConverter bitSetConverter5 = new com.thoughtworks.xstream.converters.collections.BitSetConverter();
        xStream0.registerConverter((com.thoughtworks.xstream.converters.Converter) bitSetConverter5, (int) (byte) 126);
        com.thoughtworks.xstream.converters.extended.ThrowableConverter throwableConverter8 = new com.thoughtworks.xstream.converters.extended.ThrowableConverter((com.thoughtworks.xstream.converters.Converter) bitSetConverter5);
        com.thoughtworks.xstream.converters.extended.RegexPatternConverter regexPatternConverter9 = new com.thoughtworks.xstream.converters.extended.RegexPatternConverter((com.thoughtworks.xstream.converters.Converter) throwableConverter8);
        com.thoughtworks.xstream.alias.ClassMapper classMapper10 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper11 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper10);
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper13 = new com.thoughtworks.xstream.mapper.CGLIBMapper((com.thoughtworks.xstream.mapper.Mapper) classMapper10, "hi!");
        java.lang.Class class15 = cGLIBMapper13.realClass("hi!");
        boolean b16 = regexPatternConverter9.canConvert(class15);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test014");
        java.lang.Class class0 = null;
        java.lang.Class class2 = null;
        com.thoughtworks.xstream.converters.javabean.BeanProperty beanProperty3 = new com.thoughtworks.xstream.converters.javabean.BeanProperty(class0, "", class2);
        java.lang.reflect.Method method4 = null;
        beanProperty3.setSetterMethod(method4);
        java.lang.reflect.Method method6 = null;
        beanProperty3.setGetterMethod(method6);
        boolean b8 = beanProperty3.isWritable();
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test015");
        com.thoughtworks.xstream.io.path.PathTracker pathTracker1 = new com.thoughtworks.xstream.io.path.PathTracker(100);
        com.thoughtworks.xstream.io.path.Path path2 = pathTracker1.getPath();
        org.junit.Assert.assertNotNull(path2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test016");
        java.io.Writer writer0 = null;
        char[] char_array1 = null;
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter3 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer0, char_array1, "");
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter4 = prettyPrintWriter3.underlyingWriter();
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter4);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test017");
        com.thoughtworks.xstream.converters.extended.StackTraceElementConverter stackTraceElementConverter0 = new com.thoughtworks.xstream.converters.extended.StackTraceElementConverter();
        com.thoughtworks.xstream.alias.ClassMapper classMapper1 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper2 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper1);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper3 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper2);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider4 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter5 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper2, reflectionProvider4);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter6 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper2);
        java.lang.String str8 = xmlFriendlyMapper2.mapNameToXML("");
        com.thoughtworks.xstream.mapper.CachingMapper cachingMapper9 = new com.thoughtworks.xstream.mapper.CachingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper2);
        java.lang.String str10 = stackTraceElementConverter0.toString((java.lang.Object) xmlFriendlyMapper2);
        com.thoughtworks.xstream.mapper.OuterClassMapper outerClassMapper12 = new com.thoughtworks.xstream.mapper.OuterClassMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper2, "hi!\n---- Debugging information ----\n-------------------------------");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test018");
        com.thoughtworks.xstream.core.util.FastStack fastStack1 = new com.thoughtworks.xstream.core.util.FastStack((int) (short) 10);
        com.thoughtworks.xstream.core.SequenceGenerator sequenceGenerator3 = new com.thoughtworks.xstream.core.SequenceGenerator((int) (byte) 112);
        java.lang.String str4 = sequenceGenerator3.next();
        java.lang.Object obj5 = fastStack1.push((java.lang.Object) str4);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "112" + "'", str4.equals("112"));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "112" + "'", obj5.equals("112"));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test019");
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
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap27 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer30 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XomDriver xomDriver31 = new com.thoughtworks.xstream.io.xml.XomDriver(xmlFriendlyReplacer30);
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver32 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap27, xmlFriendlyReplacer30);
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap33 = staxDriver32.getQnameMap();
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer36 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter37 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer36);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter38 = xppDomWriter37.underlyingWriter();
        java.lang.Class class40 = null;
        xppDomWriter37.startNode("class", class40);
        java.io.Writer writer42 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer45 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter46 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer45);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter47 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer42, xmlFriendlyReplacer45);
        com.thoughtworks.xstream.XStream xStream48 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter49 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream48.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter49);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup51 = xStream48.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper52 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper53 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper52);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper54 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper53);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter56 = attributeMapper54.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller57 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter47, converterLookup51, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper54);
        com.thoughtworks.xstream.alias.ClassMapper classMapper58 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller59 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) xppDomWriter37, converterLookup51, classMapper58);
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom60 = xppDomWriter37.getConfiguration();
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom61 = xppDomWriter37.getConfiguration();
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom62 = null;
        xpp3Dom61.setParent(xpp3Dom62);
        org.jdom.Element element64 = null;
        nu.xom.Element element65 = null;
        java.io.Writer writer66 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer69 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter70 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer66, xmlFriendlyReplacer69);
        com.thoughtworks.xstream.io.xml.XomReader xomReader71 = new com.thoughtworks.xstream.io.xml.XomReader(element65, xmlFriendlyReplacer69);
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader72 = new com.thoughtworks.xstream.io.xml.JDomReader(element64, xmlFriendlyReplacer69);
        com.thoughtworks.xstream.io.xml.XppDomReader xppDomReader73 = new com.thoughtworks.xstream.io.xml.XppDomReader(xpp3Dom61, xmlFriendlyReplacer69);
        xppDomReader73.close();
        java.lang.Object obj75 = xmlMap26.put((java.lang.Object) staxDriver32, (java.lang.Object) xppDomReader73);
        try {
            java.lang.String str77 = xppDomReader73.getAttribute((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(converterLookup16);
        org.junit.Assert.assertNull(singleValueConverter21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(qNameMap33);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter38);
        org.junit.Assert.assertNotNull(converterLookup51);
        org.junit.Assert.assertNull(singleValueConverter56);
        org.junit.Assert.assertNotNull(xpp3Dom60);
        org.junit.Assert.assertNotNull(xpp3Dom61);
        org.junit.Assert.assertNull(obj75);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test020");
        com.thoughtworks.xstream.mapper.Mapper mapper0 = null;
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter1 = new com.thoughtworks.xstream.converters.collections.ArrayConverter(mapper0);
        com.thoughtworks.xstream.converters.basic.CharConverter charConverter2 = new com.thoughtworks.xstream.converters.basic.CharConverter();
        java.lang.Object obj3 = null;
        com.thoughtworks.xstream.converters.reflection.SelfStreamingInstanceChecker selfStreamingInstanceChecker4 = new com.thoughtworks.xstream.converters.reflection.SelfStreamingInstanceChecker((com.thoughtworks.xstream.converters.Converter) charConverter2, obj3);
        com.thoughtworks.xstream.converters.extended.ColorConverter colorConverter5 = new com.thoughtworks.xstream.converters.extended.ColorConverter();
        com.thoughtworks.xstream.converters.extended.FontConverter fontConverter6 = new com.thoughtworks.xstream.converters.extended.FontConverter();
        java.lang.ClassLoader classLoader7 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper8 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader7);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper9 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) defaultMapper8);
        com.thoughtworks.xstream.converters.javabean.JavaBeanConverter javaBeanConverter11 = new com.thoughtworks.xstream.converters.javabean.JavaBeanConverter((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9, "/");
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer14 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter15 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer14);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter16 = xppDomWriter15.underlyingWriter();
        java.lang.Class class18 = null;
        xppDomWriter15.startNode("class", class18);
        java.io.Writer writer20 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer23 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter24 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer23);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter25 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer20, xmlFriendlyReplacer23);
        com.thoughtworks.xstream.XStream xStream26 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter27 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream26.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter27);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup29 = xStream26.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper30 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper31 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper30);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper32 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper31);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter34 = attributeMapper32.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller35 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter25, converterLookup29, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper32);
        com.thoughtworks.xstream.alias.ClassMapper classMapper36 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller37 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) xppDomWriter15, converterLookup29, classMapper36);
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom38 = xppDomWriter15.getConfiguration();
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom39 = xppDomWriter15.getConfiguration();
        com.thoughtworks.xstream.alias.ClassMapper classMapper41 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper42 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper41);
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper44 = new com.thoughtworks.xstream.mapper.CGLIBMapper((com.thoughtworks.xstream.mapper.Mapper) classMapper41, "hi!");
        java.lang.Class class46 = cGLIBMapper44.realClass("hi!");
        xppDomWriter15.startNode("/", class46);
        boolean b49 = dynamicProxyMapper9.shouldSerializeMember(class46, "class");
        boolean b50 = fontConverter6.canConvert(class46);
        boolean b51 = colorConverter5.canConvert(class46);
        boolean b52 = charConverter2.canConvert(class46);
        boolean b53 = arrayConverter1.canConvert(class46);
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter16);
        org.junit.Assert.assertNotNull(converterLookup29);
        org.junit.Assert.assertNull(singleValueConverter34);
        org.junit.Assert.assertNotNull(xpp3Dom38);
        org.junit.Assert.assertNotNull(xpp3Dom39);
        org.junit.Assert.assertNotNull(class46);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test021");
        com.thoughtworks.xstream.core.util.FastStack fastStack1 = new com.thoughtworks.xstream.core.util.FastStack((int) ' ');
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
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup13 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper14 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller15 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter4, converterLookup13, classMapper14);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter16 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter17 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter18 = saxWriter17.underlyingWriter();
        referenceByIdMarshaller15.put((java.lang.Object) saxWriter16, (java.lang.Object) saxWriter17);
        com.thoughtworks.xstream.XStream xStream20 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter21 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream20.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter21);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup23 = xStream20.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper24 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper25 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper24);
        com.thoughtworks.xstream.mapper.ClassAliasingMapper classAliasingMapper26 = new com.thoughtworks.xstream.mapper.ClassAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper25);
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller28 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) saxWriter17, converterLookup23, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper25, (int) 'a');
        java.lang.Object obj29 = fastStack1.push((java.lang.Object) xmlFriendlyMapper25);
        try {
            java.lang.Object obj31 = fastStack1.get((int) (byte) 115);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter18);
        org.junit.Assert.assertNotNull(converterLookup23);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test022");
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback0 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream1 = new com.thoughtworks.xstream.core.util.CustomObjectInputStream(streamCallback0);
        try {
            int i2 = customObjectInputStream1.available();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test023");
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap0 = null;
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap1 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer4 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XomDriver xomDriver5 = new com.thoughtworks.xstream.io.xml.XomDriver(xmlFriendlyReplacer4);
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver6 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap1, xmlFriendlyReplacer4);
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver7 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap0, xmlFriendlyReplacer4);
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap8 = staxDriver7.getQnameMap();
        org.junit.Assert.assertNull(qNameMap8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test024");
        com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver jsonHierarchicalStreamDriver0 = new com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver();
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
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback14 = customObjectInputStream13.peekCallback();
        try {
            com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader15 = jsonHierarchicalStreamDriver0.createReader((java.io.InputStream) customObjectInputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(customObjectInputStream13);
        org.junit.Assert.assertNull(streamCallback14);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test025");
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
        xppDomReader39.close();
        java.lang.String str41 = xppDomReader39.getValue();
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter4);
        org.junit.Assert.assertNotNull(converterLookup17);
        org.junit.Assert.assertNull(singleValueConverter22);
        org.junit.Assert.assertNotNull(xpp3Dom26);
        org.junit.Assert.assertNotNull(xpp3Dom27);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test026");
        java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper1 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader0);
        java.lang.Class class2 = null;
        boolean b4 = defaultMapper1.shouldSerializeMember(class2, "");
        java.lang.String str6 = defaultMapper1.attributeForAlias("hi!");
        java.lang.Class class7 = null;
        java.lang.Class class8 = defaultMapper1.defaultImplementationOf(class7);
        java.lang.String str9 = defaultMapper1.attributeForEnumType();
        org.junit.Assert.assertNotNull(classLoader0);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "enum-type" + "'", str9.equals("enum-type"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test027");
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
        java.util.Iterator iterator52 = referenceByIdMarshaller24.keys();
        org.junit.Assert.assertNotNull(putField13);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(customObjectOutputStream51);
        org.junit.Assert.assertNotNull(iterator52);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test028");
        nu.xom.Element element0 = null;
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
        com.thoughtworks.xstream.io.xml.XomReader xomReader25 = new com.thoughtworks.xstream.io.xml.XomReader(element0, xmlFriendlyReplacer20);
        try {
            java.lang.String str27 = xomReader25.getAttribute("enum-type");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test029");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper1 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper0);
        org.dom4j.Element element2 = null;
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader3 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element2);
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper5 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper4);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter8 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, reflectionProvider7);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter9 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5);
        com.thoughtworks.xstream.alias.ClassMapper classMapper10 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup11 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper10);
        com.thoughtworks.xstream.alias.ClassMapper classMapper12 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper13 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper12);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper14 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper13);
        java.lang.String str16 = xmlFriendlyMapper13.mapNameToXML("hi!");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider17 = null;
        com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter cGLIBEnhancedConverter18 = new com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper13, reflectionProvider17);
        defaultConverterLookup11.registerConverter((com.thoughtworks.xstream.converters.Converter) cGLIBEnhancedConverter18, 0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper21 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper5, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup11);
        com.thoughtworks.xstream.alias.ClassMapper classMapper22 = null;
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller23 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) immutableTypesMapper1, (com.thoughtworks.xstream.io.HierarchicalStreamReader) dom4JReader3, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup11, classMapper22);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test030");
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
        com.thoughtworks.xstream.io.binary.BinaryStreamWriter binaryStreamWriter11 = new com.thoughtworks.xstream.io.binary.BinaryStreamWriter((java.io.OutputStream) customObjectOutputStream10);
        try {
            binaryStreamWriter11.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter3);
        org.junit.Assert.assertNotNull(customObjectOutputStream10);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test031");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper2 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter4 = attributeMapper2.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.converters.collections.TreeMapConverter treeMapConverter5 = new com.thoughtworks.xstream.converters.collections.TreeMapConverter((com.thoughtworks.xstream.mapper.Mapper) attributeMapper2);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper6 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) attributeMapper2);
        try {
            java.lang.String str7 = attributeMapper6.attributeForEnumType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(singleValueConverter4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test032");
        com.thoughtworks.xstream.io.StatefulWriter.STATE_OPEN = (byte) 121;
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test033");
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
        java.lang.Class class22 = null;
        com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter.Node node23 = jsonHierarchicalStreamWriter2.new Node("defined-in", class22);
        com.thoughtworks.xstream.converters.extended.FontConverter fontConverter25 = new com.thoughtworks.xstream.converters.extended.FontConverter();
        java.lang.ClassLoader classLoader26 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper27 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader26);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper28 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) defaultMapper27);
        com.thoughtworks.xstream.converters.javabean.JavaBeanConverter javaBeanConverter30 = new com.thoughtworks.xstream.converters.javabean.JavaBeanConverter((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper28, "/");
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer33 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter34 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer33);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter35 = xppDomWriter34.underlyingWriter();
        java.lang.Class class37 = null;
        xppDomWriter34.startNode("class", class37);
        java.io.Writer writer39 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer42 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter43 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer42);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter44 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer39, xmlFriendlyReplacer42);
        com.thoughtworks.xstream.XStream xStream45 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter46 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream45.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter46);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup48 = xStream45.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper49 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper50 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper49);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper51 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper50);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter53 = attributeMapper51.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller54 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter44, converterLookup48, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper51);
        com.thoughtworks.xstream.alias.ClassMapper classMapper55 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller56 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) xppDomWriter34, converterLookup48, classMapper55);
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom57 = xppDomWriter34.getConfiguration();
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom58 = xppDomWriter34.getConfiguration();
        com.thoughtworks.xstream.alias.ClassMapper classMapper60 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper61 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper60);
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper63 = new com.thoughtworks.xstream.mapper.CGLIBMapper((com.thoughtworks.xstream.mapper.Mapper) classMapper60, "hi!");
        java.lang.Class class65 = cGLIBMapper63.realClass("hi!");
        xppDomWriter34.startNode("/", class65);
        boolean b68 = dynamicProxyMapper28.shouldSerializeMember(class65, "class");
        boolean b69 = fontConverter25.canConvert(class65);
        com.thoughtworks.xstream.io.ExtendedHierarchicalStreamWriterHelper.startNode((com.thoughtworks.xstream.io.HierarchicalStreamWriter) jsonHierarchicalStreamWriter2, "/", class65);
        try {
            jsonHierarchicalStreamWriter2.startNode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(converterLookup12);
        org.junit.Assert.assertNull(singleValueConverter17);
        org.junit.Assert.assertNotNull(classLoader26);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter35);
        org.junit.Assert.assertNotNull(converterLookup48);
        org.junit.Assert.assertNull(singleValueConverter53);
        org.junit.Assert.assertNotNull(xpp3Dom57);
        org.junit.Assert.assertNotNull(xpp3Dom58);
        org.junit.Assert.assertNotNull(class65);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b69 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test034");
        java.io.Writer writer0 = null;
        org.dom4j.Element element1 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer4 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("com.thoughtworks.xstream.mapper.CannotResolveClassException: ", "");
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader5 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element1, xmlFriendlyReplacer4);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter6 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer4);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test035");
        com.thoughtworks.xstream.io.xml.DomDriver domDriver1 = new com.thoughtworks.xstream.io.xml.DomDriver("/");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test036");
        com.thoughtworks.xstream.io.xml.Dom4JDriver dom4JDriver0 = new com.thoughtworks.xstream.io.xml.Dom4JDriver();
        org.dom4j.io.OutputFormat outputFormat1 = null;
        dom4JDriver0.setOutputFormat(outputFormat1);
        org.dom4j.io.OutputFormat outputFormat3 = null;
        dom4JDriver0.setOutputFormat(outputFormat3);
        java.io.Writer writer5 = null;
        com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter jsonHierarchicalStreamWriter7 = new com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter(writer5, "");
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
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller25 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) jsonHierarchicalStreamWriter7, converterLookup17, classMapper24);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback26 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream27 = com.thoughtworks.xstream.core.util.CustomObjectOutputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeMarshaller25, streamCallback26);
        java.io.ObjectOutputStream.PutField putField28 = customObjectOutputStream27.putFields();
        try {
            com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter29 = dom4JDriver0.createWriter((java.io.OutputStream) customObjectOutputStream27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(converterLookup17);
        org.junit.Assert.assertNull(singleValueConverter22);
        org.junit.Assert.assertNotNull(customObjectOutputStream27);
        org.junit.Assert.assertNotNull(putField28);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test037");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter4 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer0, xmlFriendlyReplacer3);
        com.thoughtworks.xstream.io.xml.XppDomDriver xppDomDriver5 = new com.thoughtworks.xstream.io.xml.XppDomDriver(xmlFriendlyReplacer3);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback6 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream7 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback6);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter8 = xppDomDriver5.createWriter((java.io.OutputStream) customObjectOutputStream7);
        try {
            customObjectOutputStream7.defaultWriteObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test038");
        com.thoughtworks.xstream.converters.basic.CharConverter charConverter0 = new com.thoughtworks.xstream.converters.basic.CharConverter();
        java.lang.Object obj1 = null;
        com.thoughtworks.xstream.converters.reflection.SelfStreamingInstanceChecker selfStreamingInstanceChecker2 = new com.thoughtworks.xstream.converters.reflection.SelfStreamingInstanceChecker((com.thoughtworks.xstream.converters.Converter) charConverter0, obj1);
        com.thoughtworks.xstream.converters.extended.ColorConverter colorConverter3 = new com.thoughtworks.xstream.converters.extended.ColorConverter();
        com.thoughtworks.xstream.converters.extended.FontConverter fontConverter4 = new com.thoughtworks.xstream.converters.extended.FontConverter();
        java.lang.ClassLoader classLoader5 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper6 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader5);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper7 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) defaultMapper6);
        com.thoughtworks.xstream.converters.javabean.JavaBeanConverter javaBeanConverter9 = new com.thoughtworks.xstream.converters.javabean.JavaBeanConverter((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper7, "/");
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer12 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter13 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer12);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter14 = xppDomWriter13.underlyingWriter();
        java.lang.Class class16 = null;
        xppDomWriter13.startNode("class", class16);
        java.io.Writer writer18 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer21 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter22 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer21);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter23 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer18, xmlFriendlyReplacer21);
        com.thoughtworks.xstream.XStream xStream24 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter25 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream24.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter25);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup27 = xStream24.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper28 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper29 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper28);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper30 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper29);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter32 = attributeMapper30.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller33 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter23, converterLookup27, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper30);
        com.thoughtworks.xstream.alias.ClassMapper classMapper34 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller35 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) xppDomWriter13, converterLookup27, classMapper34);
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom36 = xppDomWriter13.getConfiguration();
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom37 = xppDomWriter13.getConfiguration();
        com.thoughtworks.xstream.alias.ClassMapper classMapper39 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper40 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper39);
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper42 = new com.thoughtworks.xstream.mapper.CGLIBMapper((com.thoughtworks.xstream.mapper.Mapper) classMapper39, "hi!");
        java.lang.Class class44 = cGLIBMapper42.realClass("hi!");
        xppDomWriter13.startNode("/", class44);
        boolean b47 = dynamicProxyMapper7.shouldSerializeMember(class44, "class");
        boolean b48 = fontConverter4.canConvert(class44);
        boolean b49 = colorConverter3.canConvert(class44);
        boolean b50 = charConverter0.canConvert(class44);
        java.io.Writer writer51 = null;
        com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter jsonHierarchicalStreamWriter54 = new com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter(writer51, "dynamic-proxy", "defined-in");
        com.thoughtworks.xstream.io.xml.XppDriver xppDriver55 = new com.thoughtworks.xstream.io.xml.XppDriver();
        java.io.Writer writer56 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter57 = xppDriver55.createWriter(writer56);
        java.io.Writer writer58 = null;
        java.io.Writer writer59 = null;
        char[] char_array64 = new char[] { 'a', '4', '4', ' ' };
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter65 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer59, char_array64);
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter66 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer58, char_array64);
        com.thoughtworks.xstream.alias.ClassMapper classMapper67 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup68 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper67);
        com.thoughtworks.xstream.alias.ClassMapper classMapper69 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper70 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper69);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper71 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper70);
        java.lang.String str73 = xmlFriendlyMapper70.mapNameToXML("hi!");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider74 = null;
        com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter cGLIBEnhancedConverter75 = new com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper70, reflectionProvider74);
        defaultConverterLookup68.registerConverter((com.thoughtworks.xstream.converters.Converter) cGLIBEnhancedConverter75, 0);
        com.thoughtworks.xstream.alias.ClassMapper classMapper78 = null;
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller79 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) prettyPrintWriter66, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup68, classMapper78);
        charConverter0.marshal((java.lang.Object) "dynamic-proxy", hierarchicalStreamWriter57, (com.thoughtworks.xstream.converters.MarshallingContext) treeMarshaller79);
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter14);
        org.junit.Assert.assertNotNull(converterLookup27);
        org.junit.Assert.assertNull(singleValueConverter32);
        org.junit.Assert.assertNotNull(xpp3Dom36);
        org.junit.Assert.assertNotNull(xpp3Dom37);
        org.junit.Assert.assertNotNull(class44);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter57);
        org.junit.Assert.assertNotNull(char_array64);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "hi!" + "'", str73.equals("hi!"));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test039");
        java.io.Writer writer0 = null;
        java.io.Writer writer1 = null;
        char[] char_array4 = new char[] { ' ', '#' };
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter6 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer1, char_array4, "enum-type");
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer8 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer();
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter9 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer0, char_array4, "dynamic-proxy", xmlFriendlyReplacer8);
        org.junit.Assert.assertNotNull(char_array4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test040");
        com.thoughtworks.xstream.converters.extended.ISO8601GregorianCalendarConverter iSO8601GregorianCalendarConverter0 = new com.thoughtworks.xstream.converters.extended.ISO8601GregorianCalendarConverter();
        try {
            java.lang.Object obj2 = iSO8601GregorianCalendarConverter0.fromString("class");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.converters.ConversionException");
        } catch (com.thoughtworks.xstream.converters.ConversionException e) {
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test041");
        com.thoughtworks.xstream.converters.basic.BigDecimalConverter bigDecimalConverter0 = new com.thoughtworks.xstream.converters.basic.BigDecimalConverter();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test042");
        com.thoughtworks.xstream.core.SequenceGenerator sequenceGenerator1 = new com.thoughtworks.xstream.core.SequenceGenerator((int) (byte) -1);
        java.lang.String str2 = sequenceGenerator1.next();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1" + "'", str2.equals("-1"));
    }

    /*@Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test043");
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
        java.io.File file27 = null;
        com.thoughtworks.xstream.persistence.FileStreamStrategy fileStreamStrategy28 = new com.thoughtworks.xstream.persistence.FileStreamStrategy(file27);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider29 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper30 = null;
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap31 = null;
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver33 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap31, true);
        com.thoughtworks.xstream.XStream xStream35 = new com.thoughtworks.xstream.XStream(reflectionProvider29, classMapper30, (com.thoughtworks.xstream.io.HierarchicalStreamDriver) staxDriver33, "hi!");
        boolean b36 = staxDriver33.isRepairingNamespace();
        javax.xml.stream.XMLInputFactory xMLInputFactory37 = staxDriver33.getInputFactory();
        boolean b38 = fileStreamStrategy28.containsKey((java.lang.Object) staxDriver33);
        javax.xml.stream.XMLOutputFactory xMLOutputFactory39 = staxDriver33.getOutputFactory();
        java.lang.Object obj40 = xmlMap26.remove((java.lang.Object) xMLOutputFactory39);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(converterLookup16);
        org.junit.Assert.assertNull(singleValueConverter21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(xMLInputFactory37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(xMLOutputFactory39);
        org.junit.Assert.assertNull(obj40);
    }*/

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test044");
        java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.converters.extended.JavaClassConverter javaClassConverter1 = new com.thoughtworks.xstream.converters.extended.JavaClassConverter(classLoader0);
        java.lang.Class class2 = null;
        boolean b3 = javaClassConverter1.canConvert(class2);
        try {
            java.lang.Object obj5 = javaClassConverter1.fromString("http://com.thoughtworks.xstream/XStreamSource/feature");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.converters.ConversionException");
        } catch (com.thoughtworks.xstream.converters.ConversionException e) {
        }
        org.junit.Assert.assertNotNull(classLoader0);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test045");
        com.thoughtworks.xstream.core.util.FastStack fastStack1 = new com.thoughtworks.xstream.core.util.FastStack((int) (short) 10);
        try {
            fastStack1.popSilently();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test046");
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
            java.util.Iterator iterator26 = dom4JReader25.getAttributeNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test047");
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
            saxWriter14.setValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter16);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test048");
        com.thoughtworks.xstream.converters.basic.ShortConverter shortConverter0 = new com.thoughtworks.xstream.converters.basic.ShortConverter();
        try {
            java.lang.Object obj2 = shortConverter0.fromString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test049");
        java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper1 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader0);
        java.lang.String str2 = defaultMapper1.attributeForEnumType();
        java.lang.String str3 = defaultMapper1.attributeForClassDefiningField();
        java.lang.Class class4 = null;
        boolean b5 = defaultMapper1.isImmutableValueType(class4);
        java.lang.String str6 = defaultMapper1.attributeForReadResolveField();
        org.junit.Assert.assertNotNull(classLoader0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "enum-type" + "'", str2.equals("enum-type"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "defined-in" + "'", str3.equals("defined-in"));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "resolves-to" + "'", str6.equals("resolves-to"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test050");
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
            binaryStreamWriter26.setValue("defined-in");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(putField13);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test051");
        com.thoughtworks.xstream.mapper.Mapper mapper0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter2 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream1.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter2);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup4 = xStream1.getConverterLookup();
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper5 = new com.thoughtworks.xstream.mapper.AttributeMapper(mapper0, converterLookup4);
        org.junit.Assert.assertNotNull(converterLookup4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test052");
        org.w3c.dom.Element element0 = null;
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap1 = new com.thoughtworks.xstream.io.xml.QNameMap();
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver3 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap1, true);
        qNameMap1.setDefaultPrefix("hi!");
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
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver30 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap1, xmlFriendlyReplacer25);
        try {
            com.thoughtworks.xstream.io.xml.DomWriter domWriter31 = new com.thoughtworks.xstream.io.xml.DomWriter(element0, xmlFriendlyReplacer25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test053");
        java.io.File file0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.persistence.FileStreamStrategy fileStreamStrategy2 = new com.thoughtworks.xstream.persistence.FileStreamStrategy(file0, xStream1);
        com.thoughtworks.xstream.converters.basic.DoubleConverter doubleConverter3 = new com.thoughtworks.xstream.converters.basic.DoubleConverter();
        xStream1.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) doubleConverter3, (-20));
        com.thoughtworks.xstream.converters.basic.CharConverter charConverter6 = new com.thoughtworks.xstream.converters.basic.CharConverter();
        java.lang.Object obj7 = null;
        com.thoughtworks.xstream.converters.reflection.SelfStreamingInstanceChecker selfStreamingInstanceChecker8 = new com.thoughtworks.xstream.converters.reflection.SelfStreamingInstanceChecker((com.thoughtworks.xstream.converters.Converter) charConverter6, obj7);
        com.thoughtworks.xstream.converters.extended.ColorConverter colorConverter9 = new com.thoughtworks.xstream.converters.extended.ColorConverter();
        com.thoughtworks.xstream.converters.extended.FontConverter fontConverter10 = new com.thoughtworks.xstream.converters.extended.FontConverter();
        java.lang.ClassLoader classLoader11 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper12 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader11);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper13 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) defaultMapper12);
        com.thoughtworks.xstream.converters.javabean.JavaBeanConverter javaBeanConverter15 = new com.thoughtworks.xstream.converters.javabean.JavaBeanConverter((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper13, "/");
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer18 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter19 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer18);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter20 = xppDomWriter19.underlyingWriter();
        java.lang.Class class22 = null;
        xppDomWriter19.startNode("class", class22);
        java.io.Writer writer24 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer27 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter28 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer27);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter29 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer24, xmlFriendlyReplacer27);
        com.thoughtworks.xstream.XStream xStream30 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter31 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream30.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter31);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup33 = xStream30.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper34 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper35 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper34);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper36 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper35);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter38 = attributeMapper36.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller39 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter29, converterLookup33, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper36);
        com.thoughtworks.xstream.alias.ClassMapper classMapper40 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller41 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) xppDomWriter19, converterLookup33, classMapper40);
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom42 = xppDomWriter19.getConfiguration();
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom43 = xppDomWriter19.getConfiguration();
        com.thoughtworks.xstream.alias.ClassMapper classMapper45 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper46 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper45);
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper48 = new com.thoughtworks.xstream.mapper.CGLIBMapper((com.thoughtworks.xstream.mapper.Mapper) classMapper45, "hi!");
        java.lang.Class class50 = cGLIBMapper48.realClass("hi!");
        xppDomWriter19.startNode("/", class50);
        boolean b53 = dynamicProxyMapper13.shouldSerializeMember(class50, "class");
        boolean b54 = fontConverter10.canConvert(class50);
        boolean b55 = colorConverter9.canConvert(class50);
        boolean b56 = charConverter6.canConvert(class50);
        boolean b57 = doubleConverter3.canConvert(class50);
        org.junit.Assert.assertNotNull(classLoader11);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter20);
        org.junit.Assert.assertNotNull(converterLookup33);
        org.junit.Assert.assertNull(singleValueConverter38);
        org.junit.Assert.assertNotNull(xpp3Dom42);
        org.junit.Assert.assertNotNull(xpp3Dom43);
        org.junit.Assert.assertNotNull(class50);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b57 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test054");
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
        org.jdom.Element element14 = null;
        java.io.Writer writer15 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer18 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XomDriver xomDriver19 = new com.thoughtworks.xstream.io.xml.XomDriver(xmlFriendlyReplacer18);
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter20 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer15, xmlFriendlyReplacer18);
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader21 = new com.thoughtworks.xstream.io.xml.JDomReader(element14, xmlFriendlyReplacer18);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup22 = null;
        java.io.Writer writer23 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer24 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter25 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer23, xmlFriendlyReplacer24);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup26 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper27 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper28 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper27);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper29 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper28);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider30 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter31 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper28, reflectionProvider30);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter32 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper28);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller33 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter25, converterLookup26, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper28);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback34 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream35 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback34);
        java.io.ObjectOutputStream.PutField putField36 = customObjectOutputStream35.putFields();
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
        referenceByIdMarshaller33.put((java.lang.Object) customObjectOutputStream35, (java.lang.Object) referenceByIdMarshaller47);
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
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup63 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper64 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper65 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper64);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper66 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper65);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider67 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter68 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper65, reflectionProvider67);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter69 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper65);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller.IDGenerator iDGenerator70 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller71 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter51, converterLookup63, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper65, iDGenerator70);
        java.lang.Object obj72 = referenceByIdMarshaller47.get((java.lang.Object) xmlFriendlyMapper65);
        java.lang.String str74 = xmlFriendlyMapper65.mapNameFromXML("dynamic-proxy");
        com.thoughtworks.xstream.core.ReferenceByIdUnmarshaller referenceByIdUnmarshaller75 = new com.thoughtworks.xstream.core.ReferenceByIdUnmarshaller((java.lang.Object) defaultMapper1, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader21, converterLookup22, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper65);
        com.thoughtworks.xstream.converters.collections.TreeSetConverter treeSetConverter76 = new com.thoughtworks.xstream.converters.collections.TreeSetConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper65);
        com.thoughtworks.xstream.alias.ClassMapper classMapper77 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper78 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper77);
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper80 = new com.thoughtworks.xstream.mapper.CGLIBMapper((com.thoughtworks.xstream.mapper.Mapper) classMapper77, "hi!");
        java.lang.Class class82 = cGLIBMapper80.realClass("hi!");
        boolean b83 = treeSetConverter76.canConvert(class82);
        org.junit.Assert.assertNotNull(classLoader0);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(putField36);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "dynamic-proxy" + "'", str74.equals("dynamic-proxy"));
        org.junit.Assert.assertNotNull(class82);
        org.junit.Assert.assertTrue(b83 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test055");
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter0 = null;
        com.thoughtworks.xstream.converters.SingleValueConverterWrapper singleValueConverterWrapper1 = new com.thoughtworks.xstream.converters.SingleValueConverterWrapper(singleValueConverter0);
        java.io.Writer writer2 = null;
        java.io.Writer writer3 = null;
        char[] char_array8 = new char[] { 'a', '4', '4', ' ' };
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter9 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer3, char_array8);
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter10 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer2, char_array8);
        com.thoughtworks.xstream.alias.ClassMapper classMapper11 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup12 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper11);
        com.thoughtworks.xstream.alias.ClassMapper classMapper13 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper14 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper13);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper15 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper14);
        java.lang.String str17 = xmlFriendlyMapper14.mapNameToXML("hi!");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider18 = null;
        com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter cGLIBEnhancedConverter19 = new com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper14, reflectionProvider18);
        defaultConverterLookup12.registerConverter((com.thoughtworks.xstream.converters.Converter) cGLIBEnhancedConverter19, 0);
        com.thoughtworks.xstream.alias.ClassMapper classMapper22 = null;
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller23 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) prettyPrintWriter10, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup12, classMapper22);
        java.lang.ClassLoader classLoader25 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper26 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader25);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper27 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) defaultMapper26);
        com.thoughtworks.xstream.converters.javabean.JavaBeanConverter javaBeanConverter29 = new com.thoughtworks.xstream.converters.javabean.JavaBeanConverter((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper27, "/");
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer32 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter33 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer32);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter34 = xppDomWriter33.underlyingWriter();
        java.lang.Class class36 = null;
        xppDomWriter33.startNode("class", class36);
        java.io.Writer writer38 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer41 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter42 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer41);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter43 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer38, xmlFriendlyReplacer41);
        com.thoughtworks.xstream.XStream xStream44 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter45 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream44.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter45);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup47 = xStream44.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper48 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper49 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper48);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper50 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper49);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter52 = attributeMapper50.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller53 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter43, converterLookup47, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper50);
        com.thoughtworks.xstream.alias.ClassMapper classMapper54 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller55 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) xppDomWriter33, converterLookup47, classMapper54);
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom56 = xppDomWriter33.getConfiguration();
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom57 = xppDomWriter33.getConfiguration();
        com.thoughtworks.xstream.alias.ClassMapper classMapper59 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper60 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper59);
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper62 = new com.thoughtworks.xstream.mapper.CGLIBMapper((com.thoughtworks.xstream.mapper.Mapper) classMapper59, "hi!");
        java.lang.Class class64 = cGLIBMapper62.realClass("hi!");
        xppDomWriter33.startNode("/", class64);
        boolean b67 = dynamicProxyMapper27.shouldSerializeMember(class64, "class");
        com.thoughtworks.xstream.io.ExtendedHierarchicalStreamWriterHelper.startNode((com.thoughtworks.xstream.io.HierarchicalStreamWriter) prettyPrintWriter10, "http://com.thoughtworks.xstream/XStreamSource/feature", class64);
        try {
            boolean b69 = singleValueConverterWrapper1.canConvert(class64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(char_array8);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(classLoader25);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter34);
        org.junit.Assert.assertNotNull(converterLookup47);
        org.junit.Assert.assertNull(singleValueConverter52);
        org.junit.Assert.assertNotNull(xpp3Dom56);
        org.junit.Assert.assertNotNull(xpp3Dom57);
        org.junit.Assert.assertNotNull(class64);
        org.junit.Assert.assertTrue(b67 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test056");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter4 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer0, xmlFriendlyReplacer3);
        com.thoughtworks.xstream.io.path.PathTracker pathTracker5 = new com.thoughtworks.xstream.io.path.PathTracker();
        com.thoughtworks.xstream.io.path.PathTrackingWriter pathTrackingWriter6 = new com.thoughtworks.xstream.io.path.PathTrackingWriter((com.thoughtworks.xstream.io.HierarchicalStreamWriter) prettyPrintWriter4, pathTracker5);
        com.thoughtworks.xstream.io.path.Path path7 = pathTracker5.getPath();
        com.thoughtworks.xstream.io.path.Path path9 = new com.thoughtworks.xstream.io.path.Path("");
        java.lang.String str10 = path9.toString();
        com.thoughtworks.xstream.io.path.PathTracker pathTracker11 = new com.thoughtworks.xstream.io.path.PathTracker();
        com.thoughtworks.xstream.io.path.Path path12 = pathTracker11.getPath();
        com.thoughtworks.xstream.io.path.Path path13 = path9.apply(path12);
        boolean b14 = path7.isAncestor(path13);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(path12);
        org.junit.Assert.assertNotNull(path13);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test057");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper2 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.extended.SubjectConverter subjectConverter3 = new com.thoughtworks.xstream.converters.extended.SubjectConverter((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper2);
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.ImplicitCollectionMapper implicitCollectionMapper5 = new com.thoughtworks.xstream.mapper.ImplicitCollectionMapper(classMapper4);
        com.thoughtworks.xstream.alias.ClassMapper classMapper6 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper7 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper6);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper8 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper7);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter10 = attributeMapper8.getConverterFromAttribute("dynamic-proxy");
        java.lang.Class class11 = null;
        attributeMapper8.addAttributeFor(class11);
        com.thoughtworks.xstream.converters.collections.CollectionConverter collectionConverter13 = new com.thoughtworks.xstream.converters.collections.CollectionConverter((com.thoughtworks.xstream.mapper.Mapper) attributeMapper8);
        com.thoughtworks.xstream.mapper.CachingMapper cachingMapper14 = new com.thoughtworks.xstream.mapper.CachingMapper((com.thoughtworks.xstream.mapper.Mapper) attributeMapper8);
        com.thoughtworks.xstream.mapper.FieldAliasingMapper fieldAliasingMapper15 = new com.thoughtworks.xstream.mapper.FieldAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) attributeMapper8);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider16 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamDriver hierarchicalStreamDriver17 = null;
        com.thoughtworks.xstream.XStream xStream18 = new com.thoughtworks.xstream.XStream(reflectionProvider16, hierarchicalStreamDriver17);
        com.thoughtworks.xstream.alias.ClassMapper classMapper19 = null;
        com.thoughtworks.xstream.converters.javabean.JavaBeanConverter javaBeanConverter21 = new com.thoughtworks.xstream.converters.javabean.JavaBeanConverter(classMapper19, "");
        xStream18.registerConverter((com.thoughtworks.xstream.converters.Converter) javaBeanConverter21);
        java.lang.Class[] class_array24 = new java.lang.Class[0];
        @SuppressWarnings("unchecked") java.lang.Class<?>[] cls_array25 = (java.lang.Class<?>[]) class_array24;
        com.thoughtworks.xstream.annotations.Annotations.configureAliases(xStream18, cls_array25);
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer30 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter31 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer30);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter32 = xppDomWriter31.underlyingWriter();
        java.lang.Class class34 = null;
        xppDomWriter31.startNode("class", class34);
        java.io.Writer writer36 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer39 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter40 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer39);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter41 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer36, xmlFriendlyReplacer39);
        com.thoughtworks.xstream.XStream xStream42 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter43 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream42.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter43);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup45 = xStream42.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper46 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper47 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper46);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper48 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper47);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter50 = attributeMapper48.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller51 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter41, converterLookup45, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper48);
        com.thoughtworks.xstream.alias.ClassMapper classMapper52 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller53 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) xppDomWriter31, converterLookup45, classMapper52);
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom54 = xppDomWriter31.getConfiguration();
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom55 = xppDomWriter31.getConfiguration();
        com.thoughtworks.xstream.alias.ClassMapper classMapper57 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper58 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper57);
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper60 = new com.thoughtworks.xstream.mapper.CGLIBMapper((com.thoughtworks.xstream.mapper.Mapper) classMapper57, "hi!");
        java.lang.Class class62 = cGLIBMapper60.realClass("hi!");
        xppDomWriter31.startNode("/", class62);
        xStream18.alias("resolves-to", class62);
        fieldAliasingMapper15.omitField(class62, "hi!");
        com.thoughtworks.xstream.alias.ClassMapper classMapper68 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper69 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper68);
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper71 = new com.thoughtworks.xstream.mapper.CGLIBMapper((com.thoughtworks.xstream.mapper.Mapper) classMapper68, "hi!");
        java.lang.Class class73 = cGLIBMapper71.realClass("hi!");
        implicitCollectionMapper5.add(class62, "/", class73);
        try {
            com.thoughtworks.xstream.mapper.Mapper mapper75 = dynamicProxyMapper2.lookupMapperOfType(class73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(singleValueConverter10);
        org.junit.Assert.assertNotNull(class_array24);
        org.junit.Assert.assertNotNull(cls_array25);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter32);
        org.junit.Assert.assertNotNull(converterLookup45);
        org.junit.Assert.assertNull(singleValueConverter50);
        org.junit.Assert.assertNotNull(xpp3Dom54);
        org.junit.Assert.assertNotNull(xpp3Dom55);
        org.junit.Assert.assertNotNull(class62);
        org.junit.Assert.assertNotNull(class73);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test058");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamDriver hierarchicalStreamDriver1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream(reflectionProvider0, hierarchicalStreamDriver1);
        com.thoughtworks.xstream.converters.collections.BitSetConverter bitSetConverter3 = new com.thoughtworks.xstream.converters.collections.BitSetConverter();
        xStream2.registerConverter((com.thoughtworks.xstream.converters.Converter) bitSetConverter3);
        com.thoughtworks.xstream.converters.extended.LocaleConverter localeConverter5 = new com.thoughtworks.xstream.converters.extended.LocaleConverter();
        xStream2.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) localeConverter5, 8257536);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test059");
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
        org.xml.sax.ErrorHandler errorHandler28 = saxWriter15.getErrorHandler();
        org.xml.sax.ErrorHandler errorHandler29 = saxWriter15.getErrorHandler();
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter16);
        org.junit.Assert.assertNotNull(converterLookup21);
        org.junit.Assert.assertNull(errorHandler28);
        org.junit.Assert.assertNull(errorHandler29);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test060");
        com.thoughtworks.xstream.XStream xStream0 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter1 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream0.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter1);
        com.thoughtworks.xstream.MarshallingStrategy marshallingStrategy3 = null;
        xStream0.setMarshallingStrategy(marshallingStrategy3);
        com.thoughtworks.xstream.converters.Converter converter5 = null;
        try {
            xStream0.registerConverter(converter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test061");
        nu.xom.Element element0 = null;
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
        com.thoughtworks.xstream.io.xml.XomReader xomReader25 = new com.thoughtworks.xstream.io.xml.XomReader(element0, xmlFriendlyReplacer20);
        com.thoughtworks.xstream.io.xml.JDomDriver jDomDriver26 = new com.thoughtworks.xstream.io.xml.JDomDriver(xmlFriendlyReplacer20);
        com.thoughtworks.xstream.io.xml.XomDriver xomDriver27 = new com.thoughtworks.xstream.io.xml.XomDriver(xmlFriendlyReplacer20);
        java.io.Reader reader28 = null;
        try {
            com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader29 = xomDriver27.createReader(reader28);
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test062");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper1 = null;
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap2 = null;
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver4 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap2, true);
        com.thoughtworks.xstream.XStream xStream6 = new com.thoughtworks.xstream.XStream(reflectionProvider0, classMapper1, (com.thoughtworks.xstream.io.HierarchicalStreamDriver) staxDriver4, "hi!");
        boolean b7 = staxDriver4.isRepairingNamespace();
        javax.xml.stream.XMLInputFactory xMLInputFactory8 = staxDriver4.getInputFactory();
        staxDriver4.setRepairingNamespace(false);
        javax.xml.stream.XMLStreamWriter xMLStreamWriter11 = null;
        com.thoughtworks.xstream.io.xml.StaxWriter staxWriter13 = staxDriver4.createStaxWriter(xMLStreamWriter11, false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(xMLInputFactory8);
        org.junit.Assert.assertNotNull(staxWriter13);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test063");
        java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.converters.extended.JavaClassConverter javaClassConverter1 = new com.thoughtworks.xstream.converters.extended.JavaClassConverter(classLoader0);
        java.lang.Class class2 = null;
        boolean b3 = javaClassConverter1.canConvert(class2);
        com.thoughtworks.xstream.alias.ClassMapper classMapper4 = null;
        com.thoughtworks.xstream.mapper.ImplicitCollectionMapper implicitCollectionMapper5 = new com.thoughtworks.xstream.mapper.ImplicitCollectionMapper(classMapper4);
        com.thoughtworks.xstream.alias.ClassMapper classMapper6 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper7 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper6);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper8 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper7);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter10 = attributeMapper8.getConverterFromAttribute("dynamic-proxy");
        java.lang.Class class11 = null;
        attributeMapper8.addAttributeFor(class11);
        com.thoughtworks.xstream.converters.collections.CollectionConverter collectionConverter13 = new com.thoughtworks.xstream.converters.collections.CollectionConverter((com.thoughtworks.xstream.mapper.Mapper) attributeMapper8);
        com.thoughtworks.xstream.mapper.CachingMapper cachingMapper14 = new com.thoughtworks.xstream.mapper.CachingMapper((com.thoughtworks.xstream.mapper.Mapper) attributeMapper8);
        com.thoughtworks.xstream.mapper.FieldAliasingMapper fieldAliasingMapper15 = new com.thoughtworks.xstream.mapper.FieldAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) attributeMapper8);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider16 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamDriver hierarchicalStreamDriver17 = null;
        com.thoughtworks.xstream.XStream xStream18 = new com.thoughtworks.xstream.XStream(reflectionProvider16, hierarchicalStreamDriver17);
        com.thoughtworks.xstream.alias.ClassMapper classMapper19 = null;
        com.thoughtworks.xstream.converters.javabean.JavaBeanConverter javaBeanConverter21 = new com.thoughtworks.xstream.converters.javabean.JavaBeanConverter(classMapper19, "");
        xStream18.registerConverter((com.thoughtworks.xstream.converters.Converter) javaBeanConverter21);
        java.lang.Class[] class_array24 = new java.lang.Class[0];
        @SuppressWarnings("unchecked") java.lang.Class<?>[] cls_array25 = (java.lang.Class<?>[]) class_array24;
        com.thoughtworks.xstream.annotations.Annotations.configureAliases(xStream18, cls_array25);
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer30 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter31 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer30);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter32 = xppDomWriter31.underlyingWriter();
        java.lang.Class class34 = null;
        xppDomWriter31.startNode("class", class34);
        java.io.Writer writer36 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer39 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter40 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer39);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter41 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer36, xmlFriendlyReplacer39);
        com.thoughtworks.xstream.XStream xStream42 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter43 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream42.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter43);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup45 = xStream42.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper46 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper47 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper46);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper48 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper47);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter50 = attributeMapper48.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller51 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter41, converterLookup45, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper48);
        com.thoughtworks.xstream.alias.ClassMapper classMapper52 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller53 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) xppDomWriter31, converterLookup45, classMapper52);
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom54 = xppDomWriter31.getConfiguration();
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom55 = xppDomWriter31.getConfiguration();
        com.thoughtworks.xstream.alias.ClassMapper classMapper57 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper58 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper57);
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper60 = new com.thoughtworks.xstream.mapper.CGLIBMapper((com.thoughtworks.xstream.mapper.Mapper) classMapper57, "hi!");
        java.lang.Class class62 = cGLIBMapper60.realClass("hi!");
        xppDomWriter31.startNode("/", class62);
        xStream18.alias("resolves-to", class62);
        fieldAliasingMapper15.omitField(class62, "hi!");
        com.thoughtworks.xstream.alias.ClassMapper classMapper68 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper69 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper68);
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper71 = new com.thoughtworks.xstream.mapper.CGLIBMapper((com.thoughtworks.xstream.mapper.Mapper) classMapper68, "hi!");
        java.lang.Class class73 = cGLIBMapper71.realClass("hi!");
        implicitCollectionMapper5.add(class62, "/", class73);
        boolean b75 = javaClassConverter1.canConvert(class73);
        org.junit.Assert.assertNotNull(classLoader0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(singleValueConverter10);
        org.junit.Assert.assertNotNull(class_array24);
        org.junit.Assert.assertNotNull(cls_array25);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter32);
        org.junit.Assert.assertNotNull(converterLookup45);
        org.junit.Assert.assertNull(singleValueConverter50);
        org.junit.Assert.assertNotNull(xpp3Dom54);
        org.junit.Assert.assertNotNull(xpp3Dom55);
        org.junit.Assert.assertNotNull(class62);
        org.junit.Assert.assertNotNull(class73);
        org.junit.Assert.assertTrue(b75 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test064");
        nu.xom.Element element0 = null;
        nu.xom.Element element1 = null;
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
        com.thoughtworks.xstream.io.xml.XomReader xomReader26 = new com.thoughtworks.xstream.io.xml.XomReader(element1, xmlFriendlyReplacer21);
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter27 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer21);
        com.thoughtworks.xstream.io.xml.XomReader xomReader28 = new com.thoughtworks.xstream.io.xml.XomReader(element0, xmlFriendlyReplacer21);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test065");
        com.thoughtworks.xstream.core.util.ObjectIdDictionary objectIdDictionary0 = new com.thoughtworks.xstream.core.util.ObjectIdDictionary();
        com.thoughtworks.xstream.alias.ClassMapper classMapper1 = null;
        com.thoughtworks.xstream.mapper.EnumMapper enumMapper2 = new com.thoughtworks.xstream.mapper.EnumMapper(classMapper1);
        com.thoughtworks.xstream.mapper.EnumMapper enumMapper3 = new com.thoughtworks.xstream.mapper.EnumMapper((com.thoughtworks.xstream.mapper.Mapper) enumMapper2);
        com.thoughtworks.xstream.io.path.PathTracker pathTracker4 = new com.thoughtworks.xstream.io.path.PathTracker();
        com.thoughtworks.xstream.io.path.Path path5 = pathTracker4.getPath();
        java.lang.String str6 = pathTracker4.getCurrentPath();
        objectIdDictionary0.associateId((java.lang.Object) enumMapper3, (java.lang.Object) str6);
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
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup19 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper20 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller21 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter10, converterLookup19, classMapper20);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter22 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter23 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter24 = saxWriter23.underlyingWriter();
        referenceByIdMarshaller21.put((java.lang.Object) saxWriter22, (java.lang.Object) saxWriter23);
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer28 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter29 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer28);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter30 = xppDomWriter29.underlyingWriter();
        com.thoughtworks.xstream.alias.ClassMapper classMapper31 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper32 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper31);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper33 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper32);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider34 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter35 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper32, reflectionProvider34);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter36 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper32);
        com.thoughtworks.xstream.alias.ClassMapper classMapper37 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup38 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper37);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper39 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper32, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup38);
        com.thoughtworks.xstream.alias.ClassMapper classMapper40 = null;
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller41 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller(hierarchicalStreamWriter30, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup38, classMapper40);
        com.thoughtworks.xstream.alias.ClassMapper classMapper42 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper43 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper42);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper44 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper43);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter46 = attributeMapper44.getConverterFromAttribute("dynamic-proxy");
        java.lang.Class class47 = null;
        attributeMapper44.addAttributeFor(class47);
        com.thoughtworks.xstream.converters.collections.CollectionConverter collectionConverter49 = new com.thoughtworks.xstream.converters.collections.CollectionConverter((com.thoughtworks.xstream.mapper.Mapper) attributeMapper44);
        defaultConverterLookup38.registerConverter((com.thoughtworks.xstream.converters.Converter) collectionConverter49, (-20));
        com.thoughtworks.xstream.alias.ClassMapper classMapper52 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller.IDGenerator iDGenerator53 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller54 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) saxWriter23, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup38, classMapper52, iDGenerator53);
        objectIdDictionary0.removeId((java.lang.Object) saxWriter23);
        org.dom4j.DocumentFactory documentFactory56 = null;
        org.dom4j.io.OutputFormat outputFormat57 = null;
        java.io.Writer writer58 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer61 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter62 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer58, xmlFriendlyReplacer61);
        com.thoughtworks.xstream.io.xml.Dom4JDriver dom4JDriver63 = new com.thoughtworks.xstream.io.xml.Dom4JDriver(documentFactory56, outputFormat57, xmlFriendlyReplacer61);
        org.dom4j.DocumentFactory documentFactory64 = null;
        dom4JDriver63.setDocumentFactory(documentFactory64);
        objectIdDictionary0.removeId((java.lang.Object) documentFactory64);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter24);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter30);
        org.junit.Assert.assertNull(singleValueConverter46);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test066");
        com.thoughtworks.xstream.converters.extended.SqlTimeConverter sqlTimeConverter0 = new com.thoughtworks.xstream.converters.extended.SqlTimeConverter();
        try {
            java.lang.Object obj2 = sqlTimeConverter0.fromString("com.thoughtworks.xstream.mapper.CannotResolveClassException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test067");
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
        java.lang.String str14 = dynamicProxyMapper9.getAlias();
        com.thoughtworks.xstream.converters.extended.FontConverter fontConverter15 = new com.thoughtworks.xstream.converters.extended.FontConverter();
        java.lang.ClassLoader classLoader16 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper17 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader16);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper18 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) defaultMapper17);
        com.thoughtworks.xstream.converters.javabean.JavaBeanConverter javaBeanConverter20 = new com.thoughtworks.xstream.converters.javabean.JavaBeanConverter((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper18, "/");
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer23 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter24 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer23);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter25 = xppDomWriter24.underlyingWriter();
        java.lang.Class class27 = null;
        xppDomWriter24.startNode("class", class27);
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
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller46 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) xppDomWriter24, converterLookup38, classMapper45);
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom47 = xppDomWriter24.getConfiguration();
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom48 = xppDomWriter24.getConfiguration();
        com.thoughtworks.xstream.alias.ClassMapper classMapper50 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper51 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper50);
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper53 = new com.thoughtworks.xstream.mapper.CGLIBMapper((com.thoughtworks.xstream.mapper.Mapper) classMapper50, "hi!");
        java.lang.Class class55 = cGLIBMapper53.realClass("hi!");
        xppDomWriter24.startNode("/", class55);
        boolean b58 = dynamicProxyMapper18.shouldSerializeMember(class55, "class");
        boolean b59 = fontConverter15.canConvert(class55);
        try {
            java.lang.String str60 = dynamicProxyMapper9.serializedClass(class55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "dynamic-proxy" + "'", str11.equals("dynamic-proxy"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "dynamic-proxy" + "'", str14.equals("dynamic-proxy"));
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter25);
        org.junit.Assert.assertNotNull(converterLookup38);
        org.junit.Assert.assertNull(singleValueConverter43);
        org.junit.Assert.assertNotNull(xpp3Dom47);
        org.junit.Assert.assertNotNull(xpp3Dom48);
        org.junit.Assert.assertNotNull(class55);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b59 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test068");
        java.io.File file0 = null;
        com.thoughtworks.xstream.persistence.FileStreamStrategy fileStreamStrategy1 = new com.thoughtworks.xstream.persistence.FileStreamStrategy(file0);
        com.thoughtworks.xstream.persistence.XmlMap xmlMap2 = new com.thoughtworks.xstream.persistence.XmlMap((com.thoughtworks.xstream.persistence.StreamStrategy) fileStreamStrategy1);
        com.thoughtworks.xstream.core.MapBackedDataHolder mapBackedDataHolder3 = new com.thoughtworks.xstream.core.MapBackedDataHolder((java.util.Map) xmlMap2);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test069");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup1 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper0);
        com.thoughtworks.xstream.alias.ClassMapper classMapper2 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper3 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper2);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper4 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper3);
        java.lang.String str6 = xmlFriendlyMapper3.mapNameToXML("hi!");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider7 = null;
        com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter cGLIBEnhancedConverter8 = new com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper3, reflectionProvider7);
        defaultConverterLookup1.registerConverter((com.thoughtworks.xstream.converters.Converter) cGLIBEnhancedConverter8, 0);
        java.lang.Class class11 = null;
        try {
            boolean b12 = cGLIBEnhancedConverter8.canConvert(class11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test070");
        java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper1 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader0);
        java.lang.Class class2 = null;
        boolean b4 = defaultMapper1.shouldSerializeMember(class2, "");
        java.lang.Class class5 = null;
        java.lang.Class class6 = defaultMapper1.defaultImplementationOf(class5);
        java.lang.String str7 = defaultMapper1.attributeForClassDefiningField();
        java.io.Writer writer8 = null;
        com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter jsonHierarchicalStreamWriter10 = new com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter(writer8, "");
        java.io.Writer writer11 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer14 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter15 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer14);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter16 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer11, xmlFriendlyReplacer14);
        com.thoughtworks.xstream.XStream xStream17 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter18 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream17.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter18);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup20 = xStream17.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper21 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper22 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper21);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper23 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper22);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter25 = attributeMapper23.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller26 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter16, converterLookup20, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper23);
        com.thoughtworks.xstream.alias.ClassMapper classMapper27 = null;
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller28 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) jsonHierarchicalStreamWriter10, converterLookup20, classMapper27);
        java.lang.Class class30 = null;
        com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter.Node node31 = jsonHierarchicalStreamWriter10.new Node("defined-in", class30);
        com.thoughtworks.xstream.converters.extended.FontConverter fontConverter33 = new com.thoughtworks.xstream.converters.extended.FontConverter();
        java.lang.ClassLoader classLoader34 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper35 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader34);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper36 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) defaultMapper35);
        com.thoughtworks.xstream.converters.javabean.JavaBeanConverter javaBeanConverter38 = new com.thoughtworks.xstream.converters.javabean.JavaBeanConverter((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper36, "/");
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer41 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter42 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer41);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter43 = xppDomWriter42.underlyingWriter();
        java.lang.Class class45 = null;
        xppDomWriter42.startNode("class", class45);
        java.io.Writer writer47 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer50 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter51 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer50);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter52 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer47, xmlFriendlyReplacer50);
        com.thoughtworks.xstream.XStream xStream53 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter54 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream53.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter54);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup56 = xStream53.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper57 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper58 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper57);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper59 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper58);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter61 = attributeMapper59.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller62 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter52, converterLookup56, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper59);
        com.thoughtworks.xstream.alias.ClassMapper classMapper63 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller64 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) xppDomWriter42, converterLookup56, classMapper63);
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom65 = xppDomWriter42.getConfiguration();
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom66 = xppDomWriter42.getConfiguration();
        com.thoughtworks.xstream.alias.ClassMapper classMapper68 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper69 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper68);
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper71 = new com.thoughtworks.xstream.mapper.CGLIBMapper((com.thoughtworks.xstream.mapper.Mapper) classMapper68, "hi!");
        java.lang.Class class73 = cGLIBMapper71.realClass("hi!");
        xppDomWriter42.startNode("/", class73);
        boolean b76 = dynamicProxyMapper36.shouldSerializeMember(class73, "class");
        boolean b77 = fontConverter33.canConvert(class73);
        com.thoughtworks.xstream.io.ExtendedHierarchicalStreamWriterHelper.startNode((com.thoughtworks.xstream.io.HierarchicalStreamWriter) jsonHierarchicalStreamWriter10, "/", class73);
        java.lang.Class class79 = defaultMapper1.defaultImplementationOf(class73);
        org.junit.Assert.assertNotNull(classLoader0);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(class6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "defined-in" + "'", str7.equals("defined-in"));
        org.junit.Assert.assertNotNull(converterLookup20);
        org.junit.Assert.assertNull(singleValueConverter25);
        org.junit.Assert.assertNotNull(classLoader34);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter43);
        org.junit.Assert.assertNotNull(converterLookup56);
        org.junit.Assert.assertNull(singleValueConverter61);
        org.junit.Assert.assertNotNull(xpp3Dom65);
        org.junit.Assert.assertNotNull(xpp3Dom66);
        org.junit.Assert.assertNotNull(class73);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(class79);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test071");
        com.thoughtworks.xstream.io.xml.TraxSource traxSource0 = new com.thoughtworks.xstream.io.xml.TraxSource();
        com.thoughtworks.xstream.io.xml.XStream11XmlFriendlyReplacer xStream11XmlFriendlyReplacer1 = new com.thoughtworks.xstream.io.xml.XStream11XmlFriendlyReplacer();
        java.lang.String str3 = xStream11XmlFriendlyReplacer1.unescapeName("http://com.thoughtworks.xstream/XStreamSource/feature");
        com.thoughtworks.xstream.io.xml.JDomDriver jDomDriver4 = new com.thoughtworks.xstream.io.xml.JDomDriver((com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer) xStream11XmlFriendlyReplacer1);
        java.io.Writer writer5 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter6 = jDomDriver4.createWriter(writer5);
        com.thoughtworks.xstream.XStream xStream7 = new com.thoughtworks.xstream.XStream((com.thoughtworks.xstream.io.HierarchicalStreamDriver) jDomDriver4);
        traxSource0.setXStream(xStream7);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "http://com.thoughtworks.xstream/XStreamSource/feature" + "'", str3.equals("http://com.thoughtworks.xstream/XStreamSource/feature"));
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test072");
        com.thoughtworks.xstream.core.ReferenceByIdMarshallingStrategy referenceByIdMarshallingStrategy0 = new com.thoughtworks.xstream.core.ReferenceByIdMarshallingStrategy();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test073");
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
        java.lang.String str51 = xmlFriendlyMapper42.mapNameFromXML("dynamic-proxy");
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper52 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper42);
        try {
            java.lang.String str53 = immutableTypesMapper52.attributeForClassDefiningField();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(putField13);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "dynamic-proxy" + "'", str51.equals("dynamic-proxy"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test074");
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter0 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        try {
            saxWriter0.parse("enum-type");
            org.junit.Assert.fail("Expected exception of type org.xml.sax.SAXException");
        } catch (org.xml.sax.SAXException e) {
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test075");
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap0 = new com.thoughtworks.xstream.io.xml.QNameMap();
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver2 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap0, true);
        javax.xml.stream.XMLStreamWriter xMLStreamWriter3 = null;
        com.thoughtworks.xstream.io.xml.StaxWriter staxWriter6 = new com.thoughtworks.xstream.io.xml.StaxWriter(qNameMap0, xMLStreamWriter3, false, true);
        javax.xml.stream.XMLStreamReader xMLStreamReader7 = null;
        try {
            com.thoughtworks.xstream.io.xml.StaxReader staxReader8 = new com.thoughtworks.xstream.io.xml.StaxReader(qNameMap0, xMLStreamReader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test076");
        com.thoughtworks.xstream.converters.extended.ISO8601SqlTimestampConverter iSO8601SqlTimestampConverter0 = new com.thoughtworks.xstream.converters.extended.ISO8601SqlTimestampConverter();
        com.thoughtworks.xstream.converters.extended.StackTraceElementConverter stackTraceElementConverter1 = new com.thoughtworks.xstream.converters.extended.StackTraceElementConverter();
        com.thoughtworks.xstream.alias.ClassMapper classMapper2 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper3 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper2);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper4 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper3);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider5 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter6 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper3, reflectionProvider5);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter7 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper3);
        java.lang.String str9 = xmlFriendlyMapper3.mapNameToXML("");
        com.thoughtworks.xstream.mapper.CachingMapper cachingMapper10 = new com.thoughtworks.xstream.mapper.CachingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper3);
        java.lang.String str11 = stackTraceElementConverter1.toString((java.lang.Object) xmlFriendlyMapper3);
        try {
            java.lang.String str12 = iSO8601SqlTimestampConverter0.toString((java.lang.Object) stackTraceElementConverter1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test077");
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
        java.io.ObjectOutputStream.PutField putField11 = customObjectOutputStream10.putFields();
        com.thoughtworks.xstream.core.util.Base64Encoder base64Encoder12 = new com.thoughtworks.xstream.core.util.Base64Encoder();
        byte[] byte_array16 = new byte[] { (byte) 115, (byte) 10, (byte) 113 };
        java.lang.String str17 = base64Encoder12.encode(byte_array16);
        try {
            customObjectOutputStream10.write(byte_array16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter3);
        org.junit.Assert.assertNotNull(customObjectOutputStream10);
        org.junit.Assert.assertNotNull(putField11);
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "cwpx" + "'", str17.equals("cwpx"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test078");
        nu.xom.Element element0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("dynamic-proxy", "http://com.thoughtworks.xstream/XStreamSource/feature");
        com.thoughtworks.xstream.io.xml.XomReader xomReader4 = new com.thoughtworks.xstream.io.xml.XomReader(element0, xmlFriendlyReplacer3);
        try {
            java.lang.String str5 = xomReader4.getNodeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test079");
        com.thoughtworks.xstream.core.util.ObjectIdDictionary objectIdDictionary0 = new com.thoughtworks.xstream.core.util.ObjectIdDictionary();
        org.dom4j.Element element2 = null;
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
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader27 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element2, xmlFriendlyReplacer22);
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer30 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter31 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer30);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter32 = xppDomWriter31.underlyingWriter();
        com.thoughtworks.xstream.alias.ClassMapper classMapper33 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper34 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper33);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper35 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper34);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider36 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter37 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper34, reflectionProvider36);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter38 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper34);
        com.thoughtworks.xstream.alias.ClassMapper classMapper39 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup40 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper39);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper41 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper34, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup40);
        com.thoughtworks.xstream.alias.ClassMapper classMapper42 = null;
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller43 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller(hierarchicalStreamWriter32, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup40, classMapper42);
        com.thoughtworks.xstream.alias.ClassMapper classMapper44 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper45 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper44);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper46 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper45);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider47 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter48 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper45, reflectionProvider47);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter49 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper45);
        com.thoughtworks.xstream.alias.ClassMapper classMapper50 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup51 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper50);
        com.thoughtworks.xstream.alias.ClassMapper classMapper52 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper53 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper52);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper54 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper53);
        java.lang.String str56 = xmlFriendlyMapper53.mapNameToXML("hi!");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider57 = null;
        com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter cGLIBEnhancedConverter58 = new com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper53, reflectionProvider57);
        defaultConverterLookup51.registerConverter((com.thoughtworks.xstream.converters.Converter) cGLIBEnhancedConverter58, 0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper61 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper45, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup51);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller62 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) 1003, (com.thoughtworks.xstream.io.HierarchicalStreamReader) dom4JReader27, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup40, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper61);
        objectIdDictionary0.removeId((java.lang.Object) attributeMapper61);
        java.io.Writer writer64 = null;
        java.io.Writer writer65 = null;
        com.thoughtworks.xstream.core.util.QuickWriter quickWriter66 = new com.thoughtworks.xstream.core.util.QuickWriter(writer65);
        quickWriter66.write("enum-type");
        char[] char_array73 = new char[] { '#', '4', ' ', ' ' };
        quickWriter66.write(char_array73);
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter76 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer64, char_array73, "/");
        boolean b77 = objectIdDictionary0.containsId((java.lang.Object) prettyPrintWriter76);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter32);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!" + "'", str56.equals("hi!"));
        org.junit.Assert.assertNotNull(char_array73);
        org.junit.Assert.assertTrue(b77 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test080");
        com.thoughtworks.xstream.XStream xStream0 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter1 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream0.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter1);
        com.thoughtworks.xstream.MarshallingStrategy marshallingStrategy3 = null;
        xStream0.setMarshallingStrategy(marshallingStrategy3);
        xStream0.aliasAttribute("http://com.thoughtworks.xstream/XStreamSource/feature", "class");
        java.lang.ClassLoader classLoader8 = xStream0.getClassLoader();
        java.lang.ClassLoader classLoader9 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper10 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader9);
        java.lang.Class class11 = null;
        boolean b13 = defaultMapper10.shouldSerializeMember(class11, "");
        java.lang.String str15 = defaultMapper10.attributeForAlias("hi!");
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter17 = defaultMapper10.getConverterFromAttribute("hi!");
        java.lang.Class class18 = null;
        java.lang.Class class19 = defaultMapper10.defaultImplementationOf(class18);
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
        org.xml.sax.ErrorHandler errorHandler38 = saxWriter35.getErrorHandler();
        com.thoughtworks.xstream.XStream xStream39 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter40 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream39.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter40);
        com.thoughtworks.xstream.converters.DataHolder dataHolder42 = xStream39.newDataHolder();
        try {
            xStream0.marshal((java.lang.Object) class18, (com.thoughtworks.xstream.io.HierarchicalStreamWriter) saxWriter35, dataHolder42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNull(singleValueConverter17);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter36);
        org.junit.Assert.assertNull(errorHandler38);
        org.junit.Assert.assertNotNull(dataHolder42);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test081");
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap0 = new com.thoughtworks.xstream.io.xml.QNameMap();
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver2 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap0, true);
        javax.xml.stream.XMLStreamWriter xMLStreamWriter3 = null;
        com.thoughtworks.xstream.io.xml.StaxWriter staxWriter6 = new com.thoughtworks.xstream.io.xml.StaxWriter(qNameMap0, xMLStreamWriter3, false, true);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter7 = staxWriter6.underlyingWriter();
        com.thoughtworks.xstream.converters.basic.CharConverter charConverter9 = new com.thoughtworks.xstream.converters.basic.CharConverter();
        java.lang.Object obj10 = null;
        com.thoughtworks.xstream.converters.reflection.SelfStreamingInstanceChecker selfStreamingInstanceChecker11 = new com.thoughtworks.xstream.converters.reflection.SelfStreamingInstanceChecker((com.thoughtworks.xstream.converters.Converter) charConverter9, obj10);
        com.thoughtworks.xstream.converters.extended.ColorConverter colorConverter12 = new com.thoughtworks.xstream.converters.extended.ColorConverter();
        com.thoughtworks.xstream.converters.extended.FontConverter fontConverter13 = new com.thoughtworks.xstream.converters.extended.FontConverter();
        java.lang.ClassLoader classLoader14 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper15 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader14);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper16 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) defaultMapper15);
        com.thoughtworks.xstream.converters.javabean.JavaBeanConverter javaBeanConverter18 = new com.thoughtworks.xstream.converters.javabean.JavaBeanConverter((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper16, "/");
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer21 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter22 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer21);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter23 = xppDomWriter22.underlyingWriter();
        java.lang.Class class25 = null;
        xppDomWriter22.startNode("class", class25);
        java.io.Writer writer27 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer30 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter31 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer30);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter32 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer27, xmlFriendlyReplacer30);
        com.thoughtworks.xstream.XStream xStream33 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter34 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream33.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter34);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup36 = xStream33.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper37 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper38 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper37);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper39 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper38);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter41 = attributeMapper39.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller42 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter32, converterLookup36, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper39);
        com.thoughtworks.xstream.alias.ClassMapper classMapper43 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller44 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) xppDomWriter22, converterLookup36, classMapper43);
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom45 = xppDomWriter22.getConfiguration();
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom46 = xppDomWriter22.getConfiguration();
        com.thoughtworks.xstream.alias.ClassMapper classMapper48 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper49 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper48);
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper51 = new com.thoughtworks.xstream.mapper.CGLIBMapper((com.thoughtworks.xstream.mapper.Mapper) classMapper48, "hi!");
        java.lang.Class class53 = cGLIBMapper51.realClass("hi!");
        xppDomWriter22.startNode("/", class53);
        boolean b56 = dynamicProxyMapper16.shouldSerializeMember(class53, "class");
        boolean b57 = fontConverter13.canConvert(class53);
        boolean b58 = colorConverter12.canConvert(class53);
        boolean b59 = charConverter9.canConvert(class53);
        try {
            staxWriter6.startNode("enum-type", class53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter7);
        org.junit.Assert.assertNotNull(classLoader14);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter23);
        org.junit.Assert.assertNotNull(converterLookup36);
        org.junit.Assert.assertNull(singleValueConverter41);
        org.junit.Assert.assertNotNull(xpp3Dom45);
        org.junit.Assert.assertNotNull(xpp3Dom46);
        org.junit.Assert.assertNotNull(class53);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b59 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test082");
        com.thoughtworks.xstream.converters.ConversionException conversionException1 = new com.thoughtworks.xstream.converters.ConversionException("");
        java.lang.String str3 = conversionException1.get("enum-type");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test083");
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback0 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream1 = new com.thoughtworks.xstream.core.util.CustomObjectInputStream(streamCallback0);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback2 = null;
        customObjectInputStream1.pushCallback(streamCallback2);
        try {
            java.lang.String str4 = customObjectInputStream1.readUTF();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test084");
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback0 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream1 = new com.thoughtworks.xstream.core.util.CustomObjectInputStream(streamCallback0);
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback2 = null;
        customObjectInputStream1.pushCallback(streamCallback2);
        byte[] byte_array10 = new byte[] { (byte) 100, (byte) 121, (byte) 121, (byte) 121, (byte) 125, (byte) 10 };
        try {
            customObjectInputStream1.readFully(byte_array10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test085");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.XStream xStream1 = new com.thoughtworks.xstream.XStream(reflectionProvider0);
        java.io.Writer writer2 = null;
        java.io.ObjectOutputStream objectOutputStream3 = xStream1.createObjectOutputStream(writer2);
        org.junit.Assert.assertNotNull(objectOutputStream3);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test086");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.OuterClassMapper outerClassMapper1 = new com.thoughtworks.xstream.mapper.OuterClassMapper(classMapper0);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter2 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) outerClassMapper1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test087");
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap0 = null;
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap1 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer4 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XomDriver xomDriver5 = new com.thoughtworks.xstream.io.xml.XomDriver(xmlFriendlyReplacer4);
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver6 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap1, xmlFriendlyReplacer4);
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver7 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap0, xmlFriendlyReplacer4);
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap8 = null;
        staxDriver7.setQnameMap(qNameMap8);
        javax.xml.stream.XMLInputFactory xMLInputFactory10 = staxDriver7.getInputFactory();
        org.junit.Assert.assertNotNull(xMLInputFactory10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test088");
        com.thoughtworks.xstream.converters.reflection.Sun14ReflectionProvider sun14ReflectionProvider0 = new com.thoughtworks.xstream.converters.reflection.Sun14ReflectionProvider();
        com.thoughtworks.xstream.alias.ClassMapper classMapper1 = null;
        com.thoughtworks.xstream.mapper.ImplicitCollectionMapper implicitCollectionMapper2 = new com.thoughtworks.xstream.mapper.ImplicitCollectionMapper(classMapper1);
        com.thoughtworks.xstream.alias.ClassMapper classMapper3 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper4 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper3);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper5 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper4);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter7 = attributeMapper5.getConverterFromAttribute("dynamic-proxy");
        java.lang.Class class8 = null;
        attributeMapper5.addAttributeFor(class8);
        com.thoughtworks.xstream.converters.collections.CollectionConverter collectionConverter10 = new com.thoughtworks.xstream.converters.collections.CollectionConverter((com.thoughtworks.xstream.mapper.Mapper) attributeMapper5);
        com.thoughtworks.xstream.mapper.CachingMapper cachingMapper11 = new com.thoughtworks.xstream.mapper.CachingMapper((com.thoughtworks.xstream.mapper.Mapper) attributeMapper5);
        com.thoughtworks.xstream.mapper.FieldAliasingMapper fieldAliasingMapper12 = new com.thoughtworks.xstream.mapper.FieldAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) attributeMapper5);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider13 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamDriver hierarchicalStreamDriver14 = null;
        com.thoughtworks.xstream.XStream xStream15 = new com.thoughtworks.xstream.XStream(reflectionProvider13, hierarchicalStreamDriver14);
        com.thoughtworks.xstream.alias.ClassMapper classMapper16 = null;
        com.thoughtworks.xstream.converters.javabean.JavaBeanConverter javaBeanConverter18 = new com.thoughtworks.xstream.converters.javabean.JavaBeanConverter(classMapper16, "");
        xStream15.registerConverter((com.thoughtworks.xstream.converters.Converter) javaBeanConverter18);
        java.lang.Class[] class_array21 = new java.lang.Class[0];
        @SuppressWarnings("unchecked") java.lang.Class<?>[] cls_array22 = (java.lang.Class<?>[]) class_array21;
        com.thoughtworks.xstream.annotations.Annotations.configureAliases(xStream15, cls_array22);
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer27 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter28 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer27);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter29 = xppDomWriter28.underlyingWriter();
        java.lang.Class class31 = null;
        xppDomWriter28.startNode("class", class31);
        java.io.Writer writer33 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer36 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter37 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer36);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter38 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer33, xmlFriendlyReplacer36);
        com.thoughtworks.xstream.XStream xStream39 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter40 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream39.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter40);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup42 = xStream39.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper43 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper44 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper43);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper45 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper44);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter47 = attributeMapper45.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller48 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter38, converterLookup42, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper45);
        com.thoughtworks.xstream.alias.ClassMapper classMapper49 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller50 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) xppDomWriter28, converterLookup42, classMapper49);
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom51 = xppDomWriter28.getConfiguration();
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom52 = xppDomWriter28.getConfiguration();
        com.thoughtworks.xstream.alias.ClassMapper classMapper54 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper55 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper54);
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper57 = new com.thoughtworks.xstream.mapper.CGLIBMapper((com.thoughtworks.xstream.mapper.Mapper) classMapper54, "hi!");
        java.lang.Class class59 = cGLIBMapper57.realClass("hi!");
        xppDomWriter28.startNode("/", class59);
        xStream15.alias("resolves-to", class59);
        fieldAliasingMapper12.omitField(class59, "hi!");
        com.thoughtworks.xstream.alias.ClassMapper classMapper65 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper66 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper65);
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper68 = new com.thoughtworks.xstream.mapper.CGLIBMapper((com.thoughtworks.xstream.mapper.Mapper) classMapper65, "hi!");
        java.lang.Class class70 = cGLIBMapper68.realClass("hi!");
        implicitCollectionMapper2.add(class59, "/", class70);
        try {
            java.lang.Object obj72 = sun14ReflectionProvider0.newInstance(class70);
            org.junit.Assert.fail("Expected exception of type java.lang.InstantiationError");
        } catch (java.lang.InstantiationError e) {
        }
        org.junit.Assert.assertNull(singleValueConverter7);
        org.junit.Assert.assertNotNull(class_array21);
        org.junit.Assert.assertNotNull(cls_array22);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter29);
        org.junit.Assert.assertNotNull(converterLookup42);
        org.junit.Assert.assertNull(singleValueConverter47);
        org.junit.Assert.assertNotNull(xpp3Dom51);
        org.junit.Assert.assertNotNull(xpp3Dom52);
        org.junit.Assert.assertNotNull(class59);
        org.junit.Assert.assertNotNull(class70);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test089");
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer2 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XomDriver xomDriver3 = new com.thoughtworks.xstream.io.xml.XomDriver(xmlFriendlyReplacer2);
        com.thoughtworks.xstream.io.xml.XppDriver xppDriver4 = new com.thoughtworks.xstream.io.xml.XppDriver(xmlFriendlyReplacer2);
        com.thoughtworks.xstream.io.xml.XppDomDriver xppDomDriver5 = new com.thoughtworks.xstream.io.xml.XppDomDriver(xmlFriendlyReplacer2);
        java.io.OutputStream outputStream6 = null;
        try {
            com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter7 = xppDomDriver5.createWriter(outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test090");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter4 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer3);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter5 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer3);
        com.thoughtworks.xstream.io.xml.XppDomDriver xppDomDriver6 = new com.thoughtworks.xstream.io.xml.XppDomDriver(xmlFriendlyReplacer3);
        java.io.Writer writer7 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer8 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter9 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer7, xmlFriendlyReplacer8);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter10 = compactWriter9.underlyingWriter();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup11 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper12 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper13 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper12);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller.IDGenerator iDGenerator14 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller15 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter9, converterLookup11, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper13, iDGenerator14);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback16 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream17 = com.thoughtworks.xstream.core.util.CustomObjectOutputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller15, streamCallback16);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter18 = xppDomDriver6.createWriter((java.io.OutputStream) customObjectOutputStream17);
        try {
            customObjectOutputStream17.writeChars("http://com.thoughtworks.xstream/sax/property/configured-xstream");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter10);
        org.junit.Assert.assertNotNull(customObjectOutputStream17);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter18);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test091");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper2 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.converters.extended.SubjectConverter subjectConverter3 = new com.thoughtworks.xstream.converters.extended.SubjectConverter((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper2);
        dynamicProxyMapper2.setAlias("http://com.thoughtworks.xstream/sax/property/source-object-list");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test092");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.io.HierarchicalStreamDriver hierarchicalStreamDriver1 = null;
        com.thoughtworks.xstream.XStream xStream2 = new com.thoughtworks.xstream.XStream(reflectionProvider0, hierarchicalStreamDriver1);
        com.thoughtworks.xstream.mapper.Mapper mapper3 = xStream2.getMapper();
        com.thoughtworks.xstream.converters.enums.EnumSetConverter enumSetConverter4 = new com.thoughtworks.xstream.converters.enums.EnumSetConverter(mapper3);
        org.junit.Assert.assertNotNull(mapper3);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test093");
        java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper1 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader0);
        com.thoughtworks.xstream.converters.extended.JavaMethodConverter javaMethodConverter2 = new com.thoughtworks.xstream.converters.extended.JavaMethodConverter(classLoader0);
        classLoader0.setPackageAssertionStatus("defined-in", false);
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper7 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader0, "http://com.thoughtworks.xstream/sax/property/source-object-list");
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper8 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper((com.thoughtworks.xstream.mapper.Mapper) defaultMapper7);
        com.thoughtworks.xstream.converters.extended.FontConverter fontConverter9 = new com.thoughtworks.xstream.converters.extended.FontConverter();
        java.lang.ClassLoader classLoader10 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper11 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader10);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper12 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) defaultMapper11);
        com.thoughtworks.xstream.converters.javabean.JavaBeanConverter javaBeanConverter14 = new com.thoughtworks.xstream.converters.javabean.JavaBeanConverter((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper12, "/");
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer17 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter18 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer17);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter19 = xppDomWriter18.underlyingWriter();
        java.lang.Class class21 = null;
        xppDomWriter18.startNode("class", class21);
        java.io.Writer writer23 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer26 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter27 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer26);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter28 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer23, xmlFriendlyReplacer26);
        com.thoughtworks.xstream.XStream xStream29 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter30 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream29.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter30);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup32 = xStream29.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper33 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper34 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper33);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper35 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper34);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter37 = attributeMapper35.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller38 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter28, converterLookup32, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper35);
        com.thoughtworks.xstream.alias.ClassMapper classMapper39 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller40 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) xppDomWriter18, converterLookup32, classMapper39);
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom41 = xppDomWriter18.getConfiguration();
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom42 = xppDomWriter18.getConfiguration();
        com.thoughtworks.xstream.alias.ClassMapper classMapper44 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper45 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper44);
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper47 = new com.thoughtworks.xstream.mapper.CGLIBMapper((com.thoughtworks.xstream.mapper.Mapper) classMapper44, "hi!");
        java.lang.Class class49 = cGLIBMapper47.realClass("hi!");
        xppDomWriter18.startNode("/", class49);
        boolean b52 = dynamicProxyMapper12.shouldSerializeMember(class49, "class");
        boolean b53 = fontConverter9.canConvert(class49);
        java.lang.Class class55 = defaultMapper7.getItemTypeForItemFieldName(class49, "resolves-to");
        org.junit.Assert.assertNotNull(classLoader0);
        org.junit.Assert.assertNotNull(classLoader10);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter19);
        org.junit.Assert.assertNotNull(converterLookup32);
        org.junit.Assert.assertNull(singleValueConverter37);
        org.junit.Assert.assertNotNull(xpp3Dom41);
        org.junit.Assert.assertNotNull(xpp3Dom42);
        org.junit.Assert.assertNotNull(class49);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNull(class55);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test094");
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
        com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback streamCallback18 = null;
        com.thoughtworks.xstream.core.util.CustomObjectInputStream customObjectInputStream19 = com.thoughtworks.xstream.core.util.CustomObjectInputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller17, streamCallback18);
        org.junit.Assert.assertNotNull(putField3);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter4);
        org.junit.Assert.assertNotNull(converterLookup8);
        org.junit.Assert.assertNull(singleValueConverter13);
        org.junit.Assert.assertNotNull(customObjectInputStream19);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test095");
        org.w3c.dom.Document document0 = null;
        try {
            com.thoughtworks.xstream.io.xml.DomWriter domWriter1 = new com.thoughtworks.xstream.io.xml.DomWriter(document0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test096");
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
        java.util.Iterator iterator39 = referenceByIdMarshaller34.keys();
        com.thoughtworks.xstream.alias.ClassMapper classMapper40 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper41 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper40);
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper43 = new com.thoughtworks.xstream.mapper.CGLIBMapper((com.thoughtworks.xstream.mapper.Mapper) classMapper40, "hi!");
        java.lang.Class class45 = cGLIBMapper43.realClass("hi!");
        try {
            java.lang.Object obj46 = treeUnmarshaller20.convertAnother((java.lang.Object) iterator39, class45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(hierarchicalStreamReader8);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter37);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(class45);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test097");
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
        java.lang.Class class22 = null;
        com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter.Node node23 = jsonHierarchicalStreamWriter2.new Node("defined-in", class22);
        com.thoughtworks.xstream.converters.extended.FontConverter fontConverter25 = new com.thoughtworks.xstream.converters.extended.FontConverter();
        java.lang.ClassLoader classLoader26 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper27 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader26);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper28 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) defaultMapper27);
        com.thoughtworks.xstream.converters.javabean.JavaBeanConverter javaBeanConverter30 = new com.thoughtworks.xstream.converters.javabean.JavaBeanConverter((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper28, "/");
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer33 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter34 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer33);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter35 = xppDomWriter34.underlyingWriter();
        java.lang.Class class37 = null;
        xppDomWriter34.startNode("class", class37);
        java.io.Writer writer39 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer42 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter43 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer42);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter44 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer39, xmlFriendlyReplacer42);
        com.thoughtworks.xstream.XStream xStream45 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter46 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream45.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter46);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup48 = xStream45.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper49 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper50 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper49);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper51 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper50);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter53 = attributeMapper51.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller54 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter44, converterLookup48, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper51);
        com.thoughtworks.xstream.alias.ClassMapper classMapper55 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller56 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) xppDomWriter34, converterLookup48, classMapper55);
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom57 = xppDomWriter34.getConfiguration();
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom58 = xppDomWriter34.getConfiguration();
        com.thoughtworks.xstream.alias.ClassMapper classMapper60 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper61 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper60);
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper63 = new com.thoughtworks.xstream.mapper.CGLIBMapper((com.thoughtworks.xstream.mapper.Mapper) classMapper60, "hi!");
        java.lang.Class class65 = cGLIBMapper63.realClass("hi!");
        xppDomWriter34.startNode("/", class65);
        boolean b68 = dynamicProxyMapper28.shouldSerializeMember(class65, "class");
        boolean b69 = fontConverter25.canConvert(class65);
        com.thoughtworks.xstream.io.ExtendedHierarchicalStreamWriterHelper.startNode((com.thoughtworks.xstream.io.HierarchicalStreamWriter) jsonHierarchicalStreamWriter2, "/", class65);
        jsonHierarchicalStreamWriter2.addAttribute("http://com.thoughtworks.xstream/sax/property/configured-xstream", "com.thoughtworks.xstream.mapper.CannotResolveClassException: ");
        org.junit.Assert.assertNotNull(converterLookup12);
        org.junit.Assert.assertNull(singleValueConverter17);
        org.junit.Assert.assertNotNull(classLoader26);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter35);
        org.junit.Assert.assertNotNull(converterLookup48);
        org.junit.Assert.assertNull(singleValueConverter53);
        org.junit.Assert.assertNotNull(xpp3Dom57);
        org.junit.Assert.assertNotNull(xpp3Dom58);
        org.junit.Assert.assertNotNull(class65);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b69 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test098");
        com.thoughtworks.xstream.converters.javabean.JavaBeanConverter.DuplicateFieldException duplicateFieldException1 = new com.thoughtworks.xstream.converters.javabean.JavaBeanConverter.DuplicateFieldException("hi!");
        com.thoughtworks.xstream.io.StreamException streamException2 = new com.thoughtworks.xstream.io.StreamException((java.lang.Throwable) duplicateFieldException1);
        java.lang.Throwable[] throwable_array3 = duplicateFieldException1.getSuppressed();
        com.thoughtworks.xstream.converters.ConversionException conversionException4 = new com.thoughtworks.xstream.converters.ConversionException((java.lang.Throwable) duplicateFieldException1);
        duplicateFieldException1.add("cwpx", "cwpx");
        java.util.Iterator iterator8 = duplicateFieldException1.keys();
        org.junit.Assert.assertNotNull(throwable_array3);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test099");
        com.thoughtworks.xstream.core.util.ObjectIdDictionary objectIdDictionary0 = new com.thoughtworks.xstream.core.util.ObjectIdDictionary();
        com.thoughtworks.xstream.alias.ClassMapper classMapper1 = null;
        com.thoughtworks.xstream.mapper.EnumMapper enumMapper2 = new com.thoughtworks.xstream.mapper.EnumMapper(classMapper1);
        com.thoughtworks.xstream.mapper.EnumMapper enumMapper3 = new com.thoughtworks.xstream.mapper.EnumMapper((com.thoughtworks.xstream.mapper.Mapper) enumMapper2);
        com.thoughtworks.xstream.io.path.PathTracker pathTracker4 = new com.thoughtworks.xstream.io.path.PathTracker();
        com.thoughtworks.xstream.io.path.Path path5 = pathTracker4.getPath();
        java.lang.String str6 = pathTracker4.getCurrentPath();
        objectIdDictionary0.associateId((java.lang.Object) enumMapper3, (java.lang.Object) str6);
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
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup19 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper20 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller21 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter10, converterLookup19, classMapper20);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter22 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter23 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter24 = saxWriter23.underlyingWriter();
        referenceByIdMarshaller21.put((java.lang.Object) saxWriter22, (java.lang.Object) saxWriter23);
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer28 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter29 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer28);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter30 = xppDomWriter29.underlyingWriter();
        com.thoughtworks.xstream.alias.ClassMapper classMapper31 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper32 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper31);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper33 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper32);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider34 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter35 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper32, reflectionProvider34);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter36 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper32);
        com.thoughtworks.xstream.alias.ClassMapper classMapper37 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup38 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper37);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper39 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper32, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup38);
        com.thoughtworks.xstream.alias.ClassMapper classMapper40 = null;
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller41 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller(hierarchicalStreamWriter30, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup38, classMapper40);
        com.thoughtworks.xstream.alias.ClassMapper classMapper42 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper43 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper42);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper44 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper43);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter46 = attributeMapper44.getConverterFromAttribute("dynamic-proxy");
        java.lang.Class class47 = null;
        attributeMapper44.addAttributeFor(class47);
        com.thoughtworks.xstream.converters.collections.CollectionConverter collectionConverter49 = new com.thoughtworks.xstream.converters.collections.CollectionConverter((com.thoughtworks.xstream.mapper.Mapper) attributeMapper44);
        defaultConverterLookup38.registerConverter((com.thoughtworks.xstream.converters.Converter) collectionConverter49, (-20));
        com.thoughtworks.xstream.alias.ClassMapper classMapper52 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller.IDGenerator iDGenerator53 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller54 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) saxWriter23, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup38, classMapper52, iDGenerator53);
        objectIdDictionary0.removeId((java.lang.Object) saxWriter23);
        saxWriter23.flush();
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter24);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter30);
        org.junit.Assert.assertNull(singleValueConverter46);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test100");
        java.io.Reader reader0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer3 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver4 = new com.thoughtworks.xstream.io.xml.StaxDriver(xmlFriendlyReplacer3);
        try {
            com.thoughtworks.xstream.io.xml.XppReader xppReader5 = new com.thoughtworks.xstream.io.xml.XppReader(reader0, xmlFriendlyReplacer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test101");
        java.io.Writer writer0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter2 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer0, xmlFriendlyReplacer1);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter3 = compactWriter2.underlyingWriter();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup4 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper5 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper6 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper5);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller.IDGenerator iDGenerator7 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller8 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter2, converterLookup4, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper6, iDGenerator7);
        com.thoughtworks.xstream.converters.enums.EnumSetConverter enumSetConverter9 = new com.thoughtworks.xstream.converters.enums.EnumSetConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper6);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test102");
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer2 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter3 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer2);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter4 = xppDomWriter3.underlyingWriter();
        java.lang.Class class6 = null;
        xppDomWriter3.startNode("class", class6);
        xppDomWriter3.setValue("resolves-to");
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test103");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.converters.javabean.JavaBeanConverter javaBeanConverter2 = new com.thoughtworks.xstream.converters.javabean.JavaBeanConverter(classMapper0, "");
        com.thoughtworks.xstream.converters.extended.RegexPatternConverter regexPatternConverter3 = new com.thoughtworks.xstream.converters.extended.RegexPatternConverter((com.thoughtworks.xstream.converters.Converter) javaBeanConverter2);
        java.io.Writer writer4 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer5 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter6 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer4, xmlFriendlyReplacer5);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup7 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper8 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper9 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper8);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper10 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper9);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider11 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter12 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper9, reflectionProvider11);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter13 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper9);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller14 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter6, converterLookup7, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper9);
        com.thoughtworks.xstream.mapper.OuterClassMapper outerClassMapper15 = new com.thoughtworks.xstream.mapper.OuterClassMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper9);
        com.thoughtworks.xstream.converters.collections.CollectionConverter collectionConverter16 = new com.thoughtworks.xstream.converters.collections.CollectionConverter((com.thoughtworks.xstream.mapper.Mapper) outerClassMapper15);
        com.thoughtworks.xstream.alias.ClassMapper classMapper17 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup18 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper17);
        com.thoughtworks.xstream.alias.ClassMapper classMapper19 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper20 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper19);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper21 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper20);
        java.lang.String str23 = xmlFriendlyMapper20.mapNameToXML("hi!");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider24 = null;
        com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter cGLIBEnhancedConverter25 = new com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper20, reflectionProvider24);
        defaultConverterLookup18.registerConverter((com.thoughtworks.xstream.converters.Converter) cGLIBEnhancedConverter25, 0);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper28 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) outerClassMapper15, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup18);
        java.io.Writer writer29 = null;
        com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter jsonHierarchicalStreamWriter30 = new com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter(writer29);
        java.io.Writer writer31 = null;
        java.io.Writer writer32 = null;
        char[] char_array37 = new char[] { 'a', '4', '4', ' ' };
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter38 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer32, char_array37);
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter39 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer31, char_array37);
        com.thoughtworks.xstream.alias.ClassMapper classMapper40 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup41 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper40);
        com.thoughtworks.xstream.alias.ClassMapper classMapper42 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper43 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper42);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper44 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper43);
        java.lang.String str46 = xmlFriendlyMapper43.mapNameToXML("hi!");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider47 = null;
        com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter cGLIBEnhancedConverter48 = new com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper43, reflectionProvider47);
        defaultConverterLookup41.registerConverter((com.thoughtworks.xstream.converters.Converter) cGLIBEnhancedConverter48, 0);
        com.thoughtworks.xstream.alias.ClassMapper classMapper51 = null;
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller52 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) prettyPrintWriter39, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup41, classMapper51);
        regexPatternConverter3.marshal((java.lang.Object) attributeMapper28, (com.thoughtworks.xstream.io.HierarchicalStreamWriter) jsonHierarchicalStreamWriter30, (com.thoughtworks.xstream.converters.MarshallingContext) treeMarshaller52);
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap54 = new com.thoughtworks.xstream.io.xml.QNameMap();
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver56 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap54, true);
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap57 = null;
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap58 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer61 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XomDriver xomDriver62 = new com.thoughtworks.xstream.io.xml.XomDriver(xmlFriendlyReplacer61);
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver63 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap58, xmlFriendlyReplacer61);
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver64 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap57, xmlFriendlyReplacer61);
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver65 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap54, xmlFriendlyReplacer61);
        javax.xml.namespace.QName qName67 = qNameMap54.getQName("enum-type");
        com.thoughtworks.xstream.mapper.Mapper mapper68 = null;
        com.thoughtworks.xstream.converters.reflection.ExternalizableConverter externalizableConverter69 = new com.thoughtworks.xstream.converters.reflection.ExternalizableConverter(mapper68);
        try {
            treeMarshaller52.convertAnother((java.lang.Object) qNameMap54, (com.thoughtworks.xstream.converters.Converter) externalizableConverter69);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNotNull(char_array37);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!" + "'", str46.equals("hi!"));
        org.junit.Assert.assertNotNull(qName67);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test104");
        org.dom4j.Element element0 = null;
        com.thoughtworks.xstream.io.xml.Dom4JReader dom4JReader1 = new com.thoughtworks.xstream.io.xml.Dom4JReader(element0);
        dom4JReader1.close();
        try {
            com.thoughtworks.xstream.io.AttributeNameIterator attributeNameIterator3 = new com.thoughtworks.xstream.io.AttributeNameIterator((com.thoughtworks.xstream.io.HierarchicalStreamReader) dom4JReader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test105");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper1 = null;
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap2 = null;
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver4 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap2, true);
        com.thoughtworks.xstream.XStream xStream6 = new com.thoughtworks.xstream.XStream(reflectionProvider0, classMapper1, (com.thoughtworks.xstream.io.HierarchicalStreamDriver) staxDriver4, "hi!");
        boolean b7 = staxDriver4.isRepairingNamespace();
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap8 = new com.thoughtworks.xstream.io.xml.QNameMap();
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver10 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap8, true);
        java.lang.String str11 = qNameMap8.getDefaultPrefix();
        java.lang.String str12 = qNameMap8.getDefaultNamespace();
        staxDriver4.setQnameMap(qNameMap8);
        java.lang.String str14 = qNameMap8.getDefaultNamespace();
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test106");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = null;
        java.lang.Object obj2 = null;
        try {
            com.thoughtworks.xstream.core.util.Fields.write(field0, obj1, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test107");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper1 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper0);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper2 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper1);
        com.thoughtworks.xstream.mapper.EnumMapper enumMapper3 = new com.thoughtworks.xstream.mapper.EnumMapper((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper2);
        com.thoughtworks.xstream.mapper.AttributeAliasingMapper attributeAliasingMapper4 = new com.thoughtworks.xstream.mapper.AttributeAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) enumMapper3);
        com.thoughtworks.xstream.mapper.DefaultImplementationsMapper defaultImplementationsMapper5 = new com.thoughtworks.xstream.mapper.DefaultImplementationsMapper((com.thoughtworks.xstream.mapper.Mapper) enumMapper3);
        java.lang.ClassLoader classLoader6 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper7 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader6);
        com.thoughtworks.xstream.converters.extended.JavaMethodConverter javaMethodConverter8 = new com.thoughtworks.xstream.converters.extended.JavaMethodConverter(classLoader6);
        classLoader6.setPackageAssertionStatus("defined-in", false);
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper13 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader6, "http://com.thoughtworks.xstream/sax/property/source-object-list");
        java.util.Enumeration<java.net.URL> enumeration_uRL15 = classLoader6.getResources("dynamic-proxy");
        com.thoughtworks.xstream.converters.extended.DynamicProxyConverter dynamicProxyConverter16 = new com.thoughtworks.xstream.converters.extended.DynamicProxyConverter((com.thoughtworks.xstream.mapper.Mapper) enumMapper3, classLoader6);
        org.jdom.Element element17 = null;
        nu.xom.Element element18 = null;
        java.io.Writer writer19 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer22 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter23 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer19, xmlFriendlyReplacer22);
        com.thoughtworks.xstream.io.xml.XomReader xomReader24 = new com.thoughtworks.xstream.io.xml.XomReader(element18, xmlFriendlyReplacer22);
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader25 = new com.thoughtworks.xstream.io.xml.JDomReader(element17, xmlFriendlyReplacer22);
        java.io.Writer writer26 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer29 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter30 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer29);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter31 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer26, xmlFriendlyReplacer29);
        com.thoughtworks.xstream.io.xml.XppDomDriver xppDomDriver32 = new com.thoughtworks.xstream.io.xml.XppDomDriver(xmlFriendlyReplacer29);
        java.io.Writer writer33 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer34 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter35 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer33, xmlFriendlyReplacer34);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter36 = compactWriter35.underlyingWriter();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup37 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper38 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper39 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper38);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller.IDGenerator iDGenerator40 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller41 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter35, converterLookup37, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper39, iDGenerator40);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback42 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream43 = com.thoughtworks.xstream.core.util.CustomObjectOutputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) referenceByIdMarshaller41, streamCallback42);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter44 = xppDomDriver32.createWriter((java.io.OutputStream) customObjectOutputStream43);
        com.thoughtworks.xstream.io.StatefulWriter statefulWriter45 = new com.thoughtworks.xstream.io.StatefulWriter(hierarchicalStreamWriter44);
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
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer66 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter67 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer66);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter68 = xppDomWriter67.underlyingWriter();
        com.thoughtworks.xstream.alias.ClassMapper classMapper69 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper70 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper69);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper71 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper70);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider72 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter73 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper70, reflectionProvider72);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter74 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper70);
        com.thoughtworks.xstream.alias.ClassMapper classMapper75 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup76 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper75);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper77 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper70, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup76);
        com.thoughtworks.xstream.alias.ClassMapper classMapper78 = null;
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller79 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller(hierarchicalStreamWriter68, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup76, classMapper78);
        com.thoughtworks.xstream.alias.ClassMapper classMapper80 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper81 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper80);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper82 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper81);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter84 = attributeMapper82.getConverterFromAttribute("dynamic-proxy");
        java.lang.Class class85 = null;
        attributeMapper82.addAttributeFor(class85);
        com.thoughtworks.xstream.converters.collections.CollectionConverter collectionConverter87 = new com.thoughtworks.xstream.converters.collections.CollectionConverter((com.thoughtworks.xstream.mapper.Mapper) attributeMapper82);
        defaultConverterLookup76.registerConverter((com.thoughtworks.xstream.converters.Converter) collectionConverter87, (-20));
        com.thoughtworks.xstream.alias.ClassMapper classMapper90 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller.IDGenerator iDGenerator91 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller92 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) saxWriter61, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup76, classMapper90, iDGenerator91);
        try {
            dynamicProxyConverter16.marshal((java.lang.Object) element17, (com.thoughtworks.xstream.io.HierarchicalStreamWriter) statefulWriter45, (com.thoughtworks.xstream.converters.MarshallingContext) referenceByIdMarshaller92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(classLoader6);
        org.junit.Assert.assertNotNull(enumeration_uRL15);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter36);
        org.junit.Assert.assertNotNull(customObjectOutputStream43);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter44);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter62);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter68);
        org.junit.Assert.assertNull(singleValueConverter84);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test108");
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
        org.jdom.Element element14 = null;
        java.io.Writer writer15 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer18 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XomDriver xomDriver19 = new com.thoughtworks.xstream.io.xml.XomDriver(xmlFriendlyReplacer18);
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter20 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer15, xmlFriendlyReplacer18);
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader21 = new com.thoughtworks.xstream.io.xml.JDomReader(element14, xmlFriendlyReplacer18);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup22 = null;
        java.io.Writer writer23 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer24 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter25 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer23, xmlFriendlyReplacer24);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup26 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper27 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper28 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper27);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper29 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper28);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider30 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter31 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper28, reflectionProvider30);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter32 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper28);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller33 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter25, converterLookup26, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper28);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback34 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream35 = new com.thoughtworks.xstream.core.util.CustomObjectOutputStream(streamCallback34);
        java.io.ObjectOutputStream.PutField putField36 = customObjectOutputStream35.putFields();
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
        referenceByIdMarshaller33.put((java.lang.Object) customObjectOutputStream35, (java.lang.Object) referenceByIdMarshaller47);
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
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup63 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper64 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper65 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper64);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper66 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper65);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider67 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter68 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper65, reflectionProvider67);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter69 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper65);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller.IDGenerator iDGenerator70 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller71 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter51, converterLookup63, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper65, iDGenerator70);
        java.lang.Object obj72 = referenceByIdMarshaller47.get((java.lang.Object) xmlFriendlyMapper65);
        java.lang.String str74 = xmlFriendlyMapper65.mapNameFromXML("dynamic-proxy");
        com.thoughtworks.xstream.core.ReferenceByIdUnmarshaller referenceByIdUnmarshaller75 = new com.thoughtworks.xstream.core.ReferenceByIdUnmarshaller((java.lang.Object) defaultMapper1, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader21, converterLookup22, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper65);
        try {
            int i76 = jDomReader21.getAttributeCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(classLoader0);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(putField36);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "dynamic-proxy" + "'", str74.equals("dynamic-proxy"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test109");
        nu.xom.Element element0 = null;
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap1 = null;
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap2 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer5 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XomDriver xomDriver6 = new com.thoughtworks.xstream.io.xml.XomDriver(xmlFriendlyReplacer5);
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver7 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap2, xmlFriendlyReplacer5);
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver8 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap1, xmlFriendlyReplacer5);
        com.thoughtworks.xstream.io.xml.JDomDriver jDomDriver9 = new com.thoughtworks.xstream.io.xml.JDomDriver(xmlFriendlyReplacer5);
        com.thoughtworks.xstream.io.xml.XomWriter xomWriter10 = new com.thoughtworks.xstream.io.xml.XomWriter(element0, xmlFriendlyReplacer5);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter11 = xomWriter10.underlyingWriter();
        com.thoughtworks.xstream.converters.extended.SqlTimeConverter sqlTimeConverter12 = new com.thoughtworks.xstream.converters.extended.SqlTimeConverter();
        org.jdom.Element element13 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer14 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader15 = new com.thoughtworks.xstream.io.xml.JDomReader(element13, xmlFriendlyReplacer14);
        java.lang.Object obj16 = jDomReader15.peekUnderlyingNode();
        com.thoughtworks.xstream.io.HierarchicalStreamReader hierarchicalStreamReader17 = jDomReader15.underlyingReader();
        com.thoughtworks.xstream.alias.ClassMapper classMapper18 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper19 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper18);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper20 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider21 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter22 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19, reflectionProvider21);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter23 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        java.lang.String str25 = xmlFriendlyMapper19.mapNameToXML("");
        com.thoughtworks.xstream.mapper.CachingMapper cachingMapper26 = new com.thoughtworks.xstream.mapper.CachingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper19);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider27 = null;
        com.thoughtworks.xstream.XStream xStream28 = new com.thoughtworks.xstream.XStream(reflectionProvider27);
        org.jdom.Element element29 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer30 = null;
        com.thoughtworks.xstream.io.xml.JDomReader jDomReader31 = new com.thoughtworks.xstream.io.xml.JDomReader(element29, xmlFriendlyReplacer30);
        java.lang.Object obj32 = jDomReader31.peekUnderlyingNode();
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup33 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper34 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper35 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper34);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper36 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper35);
        com.thoughtworks.xstream.core.TreeUnmarshaller treeUnmarshaller37 = new com.thoughtworks.xstream.core.TreeUnmarshaller((java.lang.Object) reflectionProvider27, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader31, converterLookup33, (com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper36);
        java.io.Writer writer38 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer39 = null;
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter40 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer38, xmlFriendlyReplacer39);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup41 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper42 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper43 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper42);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper44 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper43);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider45 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter46 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper43, reflectionProvider45);
        com.thoughtworks.xstream.converters.collections.ArrayConverter arrayConverter47 = new com.thoughtworks.xstream.converters.collections.ArrayConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper43);
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller48 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter40, converterLookup41, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper43);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup49 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper50 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller51 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter40, converterLookup49, classMapper50);
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter52 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter53 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter54 = saxWriter53.underlyingWriter();
        referenceByIdMarshaller51.put((java.lang.Object) saxWriter52, (java.lang.Object) saxWriter53);
        com.thoughtworks.xstream.XStream xStream56 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter57 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream56.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter57);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup59 = xStream56.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper60 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper61 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper60);
        com.thoughtworks.xstream.mapper.ClassAliasingMapper classAliasingMapper62 = new com.thoughtworks.xstream.mapper.ClassAliasingMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper61);
        com.thoughtworks.xstream.core.ReferenceByXPathMarshaller referenceByXPathMarshaller64 = new com.thoughtworks.xstream.core.ReferenceByXPathMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) saxWriter53, converterLookup59, (com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper61, (int) 'a');
        com.thoughtworks.xstream.alias.ClassMapper classMapper65 = null;
        com.thoughtworks.xstream.core.ReferenceByIdUnmarshaller referenceByIdUnmarshaller66 = new com.thoughtworks.xstream.core.ReferenceByIdUnmarshaller((java.lang.Object) cachingMapper26, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader31, converterLookup59, classMapper65);
        com.thoughtworks.xstream.alias.ClassMapper classMapper67 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper68 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper67);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper69 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper68);
        com.thoughtworks.xstream.core.ReferenceByIdUnmarshaller referenceByIdUnmarshaller70 = new com.thoughtworks.xstream.core.ReferenceByIdUnmarshaller((java.lang.Object) sqlTimeConverter12, (com.thoughtworks.xstream.io.HierarchicalStreamReader) jDomReader15, converterLookup59, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper69);
        com.thoughtworks.xstream.alias.ClassMapper classMapper71 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller72 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller(hierarchicalStreamWriter11, converterLookup59, classMapper71);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(hierarchicalStreamReader17);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter54);
        org.junit.Assert.assertNotNull(converterLookup59);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test110");
        com.thoughtworks.xstream.XStream.InitializationException initializationException1 = new com.thoughtworks.xstream.XStream.InitializationException("hi!");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test111");
        org.jdom.Element element0 = null;
        org.jdom.JDOMFactory jDOMFactory1 = null;
        org.dom4j.DocumentFactory documentFactory2 = null;
        org.dom4j.io.OutputFormat outputFormat3 = null;
        java.io.Writer writer4 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer7 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter8 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer4, xmlFriendlyReplacer7);
        com.thoughtworks.xstream.io.xml.Dom4JDriver dom4JDriver9 = new com.thoughtworks.xstream.io.xml.Dom4JDriver(documentFactory2, outputFormat3, xmlFriendlyReplacer7);
        com.thoughtworks.xstream.io.xml.JDomWriter jDomWriter10 = new com.thoughtworks.xstream.io.xml.JDomWriter(element0, jDOMFactory1, xmlFriendlyReplacer7);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test112");
        com.thoughtworks.xstream.alias.ClassMapper classMapper0 = null;
        com.thoughtworks.xstream.mapper.ClassAliasingMapper classAliasingMapper1 = new com.thoughtworks.xstream.mapper.ClassAliasingMapper(classMapper0);
        java.lang.Class class2 = null;
        boolean b3 = classAliasingMapper1.itemTypeAsAttribute(class2);
        com.thoughtworks.xstream.converters.extended.ISO8601SqlTimestampConverter iSO8601SqlTimestampConverter5 = new com.thoughtworks.xstream.converters.extended.ISO8601SqlTimestampConverter();
        com.thoughtworks.xstream.converters.extended.FontConverter fontConverter6 = new com.thoughtworks.xstream.converters.extended.FontConverter();
        java.lang.ClassLoader classLoader7 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper8 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader7);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper9 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) defaultMapper8);
        com.thoughtworks.xstream.converters.javabean.JavaBeanConverter javaBeanConverter11 = new com.thoughtworks.xstream.converters.javabean.JavaBeanConverter((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper9, "/");
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer14 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter15 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer14);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter16 = xppDomWriter15.underlyingWriter();
        java.lang.Class class18 = null;
        xppDomWriter15.startNode("class", class18);
        java.io.Writer writer20 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer23 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter24 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer23);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter25 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer20, xmlFriendlyReplacer23);
        com.thoughtworks.xstream.XStream xStream26 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter27 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream26.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter27);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup29 = xStream26.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper30 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper31 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper30);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper32 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper31);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter34 = attributeMapper32.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller35 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter25, converterLookup29, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper32);
        com.thoughtworks.xstream.alias.ClassMapper classMapper36 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller37 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) xppDomWriter15, converterLookup29, classMapper36);
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom38 = xppDomWriter15.getConfiguration();
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom39 = xppDomWriter15.getConfiguration();
        com.thoughtworks.xstream.alias.ClassMapper classMapper41 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper42 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper41);
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper44 = new com.thoughtworks.xstream.mapper.CGLIBMapper((com.thoughtworks.xstream.mapper.Mapper) classMapper41, "hi!");
        java.lang.Class class46 = cGLIBMapper44.realClass("hi!");
        xppDomWriter15.startNode("/", class46);
        boolean b49 = dynamicProxyMapper9.shouldSerializeMember(class46, "class");
        boolean b50 = fontConverter6.canConvert(class46);
        boolean b51 = iSO8601SqlTimestampConverter5.canConvert(class46);
        classAliasingMapper1.addClassAttributeAlias("hi!", class46);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter16);
        org.junit.Assert.assertNotNull(converterLookup29);
        org.junit.Assert.assertNull(singleValueConverter34);
        org.junit.Assert.assertNotNull(xpp3Dom38);
        org.junit.Assert.assertNotNull(xpp3Dom39);
        org.junit.Assert.assertNotNull(class46);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b51 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test113");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider0 = null;
        com.thoughtworks.xstream.alias.ClassMapper classMapper1 = null;
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap2 = null;
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver4 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap2, true);
        com.thoughtworks.xstream.XStream xStream6 = new com.thoughtworks.xstream.XStream(reflectionProvider0, classMapper1, (com.thoughtworks.xstream.io.HierarchicalStreamDriver) staxDriver4, "hi!");
        boolean b7 = staxDriver4.isRepairingNamespace();
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap8 = new com.thoughtworks.xstream.io.xml.QNameMap();
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver10 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap8, true);
        java.lang.String str11 = qNameMap8.getDefaultPrefix();
        java.lang.String str12 = qNameMap8.getDefaultNamespace();
        staxDriver4.setQnameMap(qNameMap8);
        java.io.Writer writer14 = null;
        nu.xom.Element element15 = null;
        java.io.Writer writer16 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer19 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter20 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer16, xmlFriendlyReplacer19);
        com.thoughtworks.xstream.io.xml.XomReader xomReader21 = new com.thoughtworks.xstream.io.xml.XomReader(element15, xmlFriendlyReplacer19);
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter22 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer14, xmlFriendlyReplacer19);
        com.thoughtworks.xstream.io.xml.StaxDriver staxDriver23 = new com.thoughtworks.xstream.io.xml.StaxDriver(qNameMap8, xmlFriendlyReplacer19);
        com.thoughtworks.xstream.io.xml.QNameMap qNameMap24 = staxDriver23.getQnameMap();
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(qNameMap24);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test114");
        com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker serializationMethodInvoker0 = new com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker();
        java.io.Writer writer1 = null;
        java.io.Writer writer2 = null;
        java.io.Writer writer3 = null;
        char[] char_array8 = new char[] { 'a', '4', '4', ' ' };
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter9 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer3, char_array8);
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter10 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer2, char_array8);
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter11 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer1, char_array8);
        java.lang.Object obj12 = serializationMethodInvoker0.callWriteReplace((java.lang.Object) prettyPrintWriter11);
        com.thoughtworks.xstream.io.path.PathTracker pathTracker13 = new com.thoughtworks.xstream.io.path.PathTracker();
        com.thoughtworks.xstream.io.path.PathTrackingWriter pathTrackingWriter14 = new com.thoughtworks.xstream.io.path.PathTrackingWriter((com.thoughtworks.xstream.io.HierarchicalStreamWriter) prettyPrintWriter11, pathTracker13);
        org.junit.Assert.assertNotNull(char_array8);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test115");
        com.thoughtworks.xstream.converters.basic.DoubleConverter doubleConverter0 = new com.thoughtworks.xstream.converters.basic.DoubleConverter();
        try {
            java.lang.Object obj2 = doubleConverter0.fromString("http://com.thoughtworks.xstream/XStreamSource/feature");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test116");
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
        try {
            java.lang.Object obj34 = xmlArrayList32.get((int) (byte) 113);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(converterLookup16);
        org.junit.Assert.assertNull(singleValueConverter21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter28);
        org.junit.Assert.assertTrue(i30 == 121);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0 + "'", obj31.equals(0));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test117");
        org.jdom.Document document0 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer1 = null;
        try {
            com.thoughtworks.xstream.io.xml.JDomReader jDomReader2 = new com.thoughtworks.xstream.io.xml.JDomReader(document0, xmlFriendlyReplacer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test118");
        com.thoughtworks.xstream.converters.extended.SqlDateConverter sqlDateConverter0 = new com.thoughtworks.xstream.converters.extended.SqlDateConverter();
        java.io.Writer writer1 = null;
        java.io.Writer writer2 = null;
        char[] char_array7 = new char[] { 'a', '4', '4', ' ' };
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter8 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer2, char_array7);
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter9 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer1, char_array7);
        com.thoughtworks.xstream.alias.ClassMapper classMapper10 = null;
        com.thoughtworks.xstream.core.DefaultConverterLookup defaultConverterLookup11 = new com.thoughtworks.xstream.core.DefaultConverterLookup(classMapper10);
        com.thoughtworks.xstream.alias.ClassMapper classMapper12 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper13 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper12);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper14 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper13);
        java.lang.String str16 = xmlFriendlyMapper13.mapNameToXML("hi!");
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider17 = null;
        com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter cGLIBEnhancedConverter18 = new com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper13, reflectionProvider17);
        defaultConverterLookup11.registerConverter((com.thoughtworks.xstream.converters.Converter) cGLIBEnhancedConverter18, 0);
        com.thoughtworks.xstream.alias.ClassMapper classMapper21 = null;
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller22 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) prettyPrintWriter9, (com.thoughtworks.xstream.converters.ConverterLookup) defaultConverterLookup11, classMapper21);
        java.lang.ClassLoader classLoader24 = java.lang.ClassLoader.getSystemClassLoader();
        com.thoughtworks.xstream.mapper.DefaultMapper defaultMapper25 = new com.thoughtworks.xstream.mapper.DefaultMapper(classLoader24);
        com.thoughtworks.xstream.mapper.DynamicProxyMapper dynamicProxyMapper26 = new com.thoughtworks.xstream.mapper.DynamicProxyMapper((com.thoughtworks.xstream.mapper.Mapper) defaultMapper25);
        com.thoughtworks.xstream.converters.javabean.JavaBeanConverter javaBeanConverter28 = new com.thoughtworks.xstream.converters.javabean.JavaBeanConverter((com.thoughtworks.xstream.mapper.Mapper) dynamicProxyMapper26, "/");
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer31 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter32 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer31);
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter33 = xppDomWriter32.underlyingWriter();
        java.lang.Class class35 = null;
        xppDomWriter32.startNode("class", class35);
        java.io.Writer writer37 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer40 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.XppDomWriter xppDomWriter41 = new com.thoughtworks.xstream.io.xml.XppDomWriter(xmlFriendlyReplacer40);
        com.thoughtworks.xstream.io.xml.CompactWriter compactWriter42 = new com.thoughtworks.xstream.io.xml.CompactWriter(writer37, xmlFriendlyReplacer40);
        com.thoughtworks.xstream.XStream xStream43 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter44 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream43.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter44);
        com.thoughtworks.xstream.converters.ConverterLookup converterLookup46 = xStream43.getConverterLookup();
        com.thoughtworks.xstream.alias.ClassMapper classMapper47 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper48 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper47);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper49 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper48);
        com.thoughtworks.xstream.converters.SingleValueConverter singleValueConverter51 = attributeMapper49.getConverterFromAttribute("dynamic-proxy");
        com.thoughtworks.xstream.core.TreeMarshaller treeMarshaller52 = new com.thoughtworks.xstream.core.TreeMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) compactWriter42, converterLookup46, (com.thoughtworks.xstream.mapper.Mapper) attributeMapper49);
        com.thoughtworks.xstream.alias.ClassMapper classMapper53 = null;
        com.thoughtworks.xstream.core.ReferenceByIdMarshaller referenceByIdMarshaller54 = new com.thoughtworks.xstream.core.ReferenceByIdMarshaller((com.thoughtworks.xstream.io.HierarchicalStreamWriter) xppDomWriter32, converterLookup46, classMapper53);
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom55 = xppDomWriter32.getConfiguration();
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom xpp3Dom56 = xppDomWriter32.getConfiguration();
        com.thoughtworks.xstream.alias.ClassMapper classMapper58 = null;
        com.thoughtworks.xstream.mapper.ImmutableTypesMapper immutableTypesMapper59 = new com.thoughtworks.xstream.mapper.ImmutableTypesMapper(classMapper58);
        com.thoughtworks.xstream.mapper.CGLIBMapper cGLIBMapper61 = new com.thoughtworks.xstream.mapper.CGLIBMapper((com.thoughtworks.xstream.mapper.Mapper) classMapper58, "hi!");
        java.lang.Class class63 = cGLIBMapper61.realClass("hi!");
        xppDomWriter32.startNode("/", class63);
        boolean b66 = dynamicProxyMapper26.shouldSerializeMember(class63, "class");
        com.thoughtworks.xstream.io.ExtendedHierarchicalStreamWriterHelper.startNode((com.thoughtworks.xstream.io.HierarchicalStreamWriter) prettyPrintWriter9, "http://com.thoughtworks.xstream/XStreamSource/feature", class63);
        boolean b68 = sqlDateConverter0.canConvert(class63);
        org.junit.Assert.assertNotNull(char_array7);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(classLoader24);
        org.junit.Assert.assertNotNull(hierarchicalStreamWriter33);
        org.junit.Assert.assertNotNull(converterLookup46);
        org.junit.Assert.assertNull(singleValueConverter51);
        org.junit.Assert.assertNotNull(xpp3Dom55);
        org.junit.Assert.assertNotNull(xpp3Dom56);
        org.junit.Assert.assertNotNull(class63);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue(b68 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test119");
        nu.xom.Element element0 = null;
        org.dom4j.DocumentFactory documentFactory1 = null;
        org.dom4j.io.OutputFormat outputFormat2 = null;
        java.io.Writer writer3 = null;
        com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer xmlFriendlyReplacer6 = new com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer("", "");
        com.thoughtworks.xstream.io.xml.PrettyPrintWriter prettyPrintWriter7 = new com.thoughtworks.xstream.io.xml.PrettyPrintWriter(writer3, xmlFriendlyReplacer6);
        com.thoughtworks.xstream.io.xml.Dom4JDriver dom4JDriver8 = new com.thoughtworks.xstream.io.xml.Dom4JDriver(documentFactory1, outputFormat2, xmlFriendlyReplacer6);
        com.thoughtworks.xstream.io.xml.XomWriter xomWriter9 = new com.thoughtworks.xstream.io.xml.XomWriter(element0, xmlFriendlyReplacer6);
        try {
            xomWriter9.setValue("dynamic-proxy");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test120");
        com.thoughtworks.xstream.converters.extended.SqlTimestampConverter sqlTimestampConverter0 = new com.thoughtworks.xstream.converters.extended.SqlTimestampConverter();
        try {
            java.lang.Object obj2 = sqlTimestampConverter0.fromString("enum-type");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test121");
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
        com.thoughtworks.xstream.converters.basic.ThreadSafeSimpleDateFormat threadSafeSimpleDateFormat18 = new com.thoughtworks.xstream.converters.basic.ThreadSafeSimpleDateFormat("", (int) (byte) 112, (int) (byte) 123);
        java.lang.Object obj19 = treeUnmarshaller10.get((java.lang.Object) (byte) 123);
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback streamCallback20 = null;
        com.thoughtworks.xstream.core.util.CustomObjectOutputStream customObjectOutputStream21 = com.thoughtworks.xstream.core.util.CustomObjectOutputStream.getInstance((com.thoughtworks.xstream.converters.DataHolder) treeUnmarshaller10, streamCallback20);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(customObjectOutputStream21);
    }
}

