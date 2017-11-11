import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        com.thoughtworks.xstream.io.xml.JDomWriter jDomWriter0 = new com.thoughtworks.xstream.io.xml.JDomWriter();
        jDomWriter0.setValue("class");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.thoughtworks.xstream.io.xml.SaxWriter saxWriter0 = new com.thoughtworks.xstream.io.xml.SaxWriter();
        com.thoughtworks.xstream.io.HierarchicalStreamWriter hierarchicalStreamWriter1 = saxWriter0.underlyingWriter();
        saxWriter0.startNode("");
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.thoughtworks.xstream.io.xml.JDomWriter jDomWriter0 = new com.thoughtworks.xstream.io.xml.JDomWriter();
        jDomWriter0.addAttribute("class", "defined-in");
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        com.thoughtworks.xstream.core.util.OrderRetainingMap orderRetainingMap0 = new com.thoughtworks.xstream.core.util.OrderRetainingMap();
        java.util.Collection collection1 = orderRetainingMap0.values();
        com.thoughtworks.xstream.core.MapBackedDataHolder mapBackedDataHolder2 = new com.thoughtworks.xstream.core.MapBackedDataHolder((java.util.Map) orderRetainingMap0);
        java.util.Iterator iterator3 = mapBackedDataHolder2.keys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on orderRetainingMap0 and orderRetainingMap0", orderRetainingMap0.equals(orderRetainingMap0) ? orderRetainingMap0.hashCode() == orderRetainingMap0.hashCode() : true);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        com.thoughtworks.xstream.core.util.OrderRetainingMap orderRetainingMap0 = new com.thoughtworks.xstream.core.util.OrderRetainingMap();
        java.util.Collection collection1 = orderRetainingMap0.values();
        com.thoughtworks.xstream.core.MapBackedDataHolder mapBackedDataHolder2 = new com.thoughtworks.xstream.core.MapBackedDataHolder((java.util.Map) orderRetainingMap0);
        com.thoughtworks.xstream.alias.ClassMapper classMapper3 = null;
        com.thoughtworks.xstream.mapper.XmlFriendlyMapper xmlFriendlyMapper4 = new com.thoughtworks.xstream.mapper.XmlFriendlyMapper(classMapper3);
        com.thoughtworks.xstream.mapper.AttributeMapper attributeMapper5 = new com.thoughtworks.xstream.mapper.AttributeMapper((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper4);
        com.thoughtworks.xstream.converters.reflection.ReflectionProvider reflectionProvider6 = null;
        com.thoughtworks.xstream.converters.reflection.SerializableConverter serializableConverter7 = new com.thoughtworks.xstream.converters.reflection.SerializableConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper4, reflectionProvider6);
        com.thoughtworks.xstream.converters.collections.MapConverter mapConverter8 = new com.thoughtworks.xstream.converters.collections.MapConverter((com.thoughtworks.xstream.mapper.Mapper) xmlFriendlyMapper4);
        com.thoughtworks.xstream.XStream xStream9 = new com.thoughtworks.xstream.XStream();
        com.thoughtworks.xstream.converters.extended.TextAttributeConverter textAttributeConverter10 = new com.thoughtworks.xstream.converters.extended.TextAttributeConverter();
        xStream9.registerConverter((com.thoughtworks.xstream.converters.SingleValueConverter) textAttributeConverter10);
        java.lang.Object obj13 = textAttributeConverter10.fromString("hi!");
        mapBackedDataHolder2.put((java.lang.Object) xmlFriendlyMapper4, (java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on orderRetainingMap0 and orderRetainingMap0", orderRetainingMap0.equals(orderRetainingMap0) ? orderRetainingMap0.hashCode() == orderRetainingMap0.hashCode() : true);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        com.thoughtworks.xstream.persistence.StreamStrategy streamStrategy0 = null;
        com.thoughtworks.xstream.persistence.XmlMap xmlMap1 = new com.thoughtworks.xstream.persistence.XmlMap(streamStrategy0);
        java.util.Set set2 = xmlMap1.entrySet();
        java.util.Set set3 = xmlMap1.entrySet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on set2 and set2", set2.equals(set2) ? set2.hashCode() == set2.hashCode() : true);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        com.thoughtworks.xstream.core.util.OrderRetainingMap orderRetainingMap0 = new com.thoughtworks.xstream.core.util.OrderRetainingMap();
        java.util.Collection collection1 = orderRetainingMap0.values();
        com.thoughtworks.xstream.core.MapBackedDataHolder mapBackedDataHolder2 = new com.thoughtworks.xstream.core.MapBackedDataHolder((java.util.Map) orderRetainingMap0);
        com.thoughtworks.xstream.io.xml.xppdom.Xpp3DomBuilder xpp3DomBuilder3 = new com.thoughtworks.xstream.io.xml.xppdom.Xpp3DomBuilder();
        com.thoughtworks.xstream.converters.ConversionException conversionException5 = new com.thoughtworks.xstream.converters.ConversionException("hi!");
        mapBackedDataHolder2.put((java.lang.Object) xpp3DomBuilder3, (java.lang.Object) conversionException5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on orderRetainingMap0 and orderRetainingMap0", orderRetainingMap0.equals(orderRetainingMap0) ? orderRetainingMap0.hashCode() == orderRetainingMap0.hashCode() : true);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
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
        int i76 = xppDomReader73.getAttributeCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xmlMap26 and xmlMap26", xmlMap26.equals(xmlMap26) ? xmlMap26.hashCode() == xmlMap26.hashCode() : true);
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test9");
        com.thoughtworks.xstream.io.xml.JDomWriter jDomWriter0 = new com.thoughtworks.xstream.io.xml.JDomWriter();
        jDomWriter0.close();
        jDomWriter0.addAttribute("dynamic-proxy", "hi!\n---- Debugging information ----\n-------------------------------");
    }
}

