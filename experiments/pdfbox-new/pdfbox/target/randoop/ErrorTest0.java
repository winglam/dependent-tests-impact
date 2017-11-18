import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.apache.pdfbox.cos.COSName cOSName1 = org.apache.pdfbox.cos.COSName.RV;
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey2 = null;
        org.apache.pdfbox.pdfwriter.COSWriterXRefEntry cOSWriterXRefEntry3 = new org.apache.pdfbox.pdfwriter.COSWriterXRefEntry(0L, (org.apache.pdfbox.cos.COSBase) cOSName1, cOSObjectKey2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-reflexive on cOSWriterXRefEntry3", cOSWriterXRefEntry3.compareTo(cOSWriterXRefEntry3) == 0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.VERTICES;
        org.apache.pdfbox.pdmodel.common.function.PDFunctionType4 pDFunctionType4_1 = new org.apache.pdfbox.pdmodel.common.function.PDFunctionType4((org.apache.pdfbox.cos.COSBase) cOSName0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary4.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName6, (int) (short) 0);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP pDSeedValueMDP9 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP(cOSDictionary4);
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        long long11 = cOSDictionary4.getLong(cOSName10);
        cOSDictionary4.setNeedToBeUpdated(false);
        org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font14 = new org.apache.pdfbox.pdmodel.font.PDType0Font(cOSDictionary4);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition2 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary1);
        org.apache.pdfbox.cos.COSBase cOSBase3 = pDTransition2.getDirection();
        org.apache.pdfbox.pdmodel.common.function.PDFunctionType0 pDFunctionType0_4 = new org.apache.pdfbox.pdmodel.common.function.PDFunctionType0(cOSBase3);
        pDFunctionType0_4.setBitsPerSample(10);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition2 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary1);
        org.apache.pdfbox.cos.COSBase cOSBase3 = pDTransition2.getDirection();
        org.apache.pdfbox.pdmodel.common.function.PDFunctionType0 pDFunctionType0_4 = new org.apache.pdfbox.pdmodel.common.function.PDFunctionType0(cOSBase3);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle5 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray6 = pDRectangle5.getCOSArray();
        cOSArray6.clear();
        org.apache.pdfbox.cos.COSName cOSName9 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray6.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName9);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle11 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray12 = pDRectangle11.getCOSArray();
        cOSArray12.clear();
        org.apache.pdfbox.cos.COSName cOSName15 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray12.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName15);
        cOSArray6.addAll(cOSArray12);
        java.util.List<java.lang.Integer> list_i18 = org.apache.pdfbox.pdmodel.common.COSArrayList.convertIntegerCOSArrayToList(cOSArray12);
        pDFunctionType0_4.setEncodeValues(cOSArray12);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject2 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject2.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary5 = pDExportFormatAttributeObject2.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary5.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName7, (int) (short) 0);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache10 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources11 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary5, resourceCache10);
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject12 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject(cOSDictionary5);
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty13 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary0, pDUserAttributeObject12);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on pDUserProperty13, pDExportFormatAttributeObject2, and cOSDictionary5.", !(pDUserProperty13.equals(pDExportFormatAttributeObject2) && pDExportFormatAttributeObject2.equals(cOSDictionary5)) || pDUserProperty13.equals(cOSDictionary5));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition2 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary1);
        org.apache.pdfbox.cos.COSBase cOSBase3 = pDTransition2.getDirection();
        org.apache.pdfbox.pdmodel.common.function.PDFunctionType0 pDFunctionType0_4 = new org.apache.pdfbox.pdmodel.common.function.PDFunctionType0(cOSBase3);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle5 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray6 = pDRectangle5.getCOSArray();
        cOSArray6.clear();
        org.apache.pdfbox.cos.COSName cOSName9 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray6.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName9);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle11 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray12 = pDRectangle11.getCOSArray();
        cOSArray12.clear();
        org.apache.pdfbox.cos.COSName cOSName15 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray12.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName15);
        cOSArray6.addAll(cOSArray12);
        org.apache.pdfbox.cos.COSArray cOSArray18 = new org.apache.pdfbox.cos.COSArray();
        cOSArray12.addAll(cOSArray18);
        pDFunctionType0_4.setDecodeValues(cOSArray18);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition2 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary1);
        org.apache.pdfbox.cos.COSBase cOSBase3 = pDTransition2.getDirection();
        org.apache.pdfbox.pdmodel.common.function.PDFunctionType0 pDFunctionType0_4 = new org.apache.pdfbox.pdmodel.common.function.PDFunctionType0(cOSBase3);
        org.apache.pdfbox.pdmodel.common.PDRange pDRange6 = pDFunctionType0_4.getDecodeForParameter((int) (short) 1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition2 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary1);
        org.apache.pdfbox.cos.COSBase cOSBase3 = pDTransition2.getDirection();
        org.apache.pdfbox.pdmodel.common.function.PDFunctionType0 pDFunctionType0_4 = new org.apache.pdfbox.pdmodel.common.function.PDFunctionType0(cOSBase3);
        org.apache.pdfbox.cos.COSArray cOSArray5 = pDFunctionType0_4.getSize();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions signatureOptions0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions();
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties pDVisibleSigProperties1 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties();
        signatureOptions0.setVisualSignature(pDVisibleSigProperties1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary4.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName6, (int) (short) 0);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP pDSeedValueMDP9 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP(cOSDictionary4);
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        long long11 = cOSDictionary4.getLong(cOSName10);
        org.apache.pdfbox.cos.COSName cOSName12 = org.apache.pdfbox.cos.COSName.PAGE_MODE;
        java.lang.String str13 = cOSName12.toString();
        org.apache.pdfbox.cos.COSBase cOSBase14 = org.apache.pdfbox.pdmodel.PDPageTree.getInheritableAttribute(cOSDictionary4, cOSName12);
        org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties pDOptionalContentProperties15 = new org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties(cOSDictionary4);
        java.lang.String[] str_array16 = pDOptionalContentProperties15.getGroupNames();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition2 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary1);
        org.apache.pdfbox.cos.COSBase cOSBase3 = pDTransition2.getDirection();
        org.apache.pdfbox.pdmodel.common.function.PDFunctionType0 pDFunctionType0_4 = new org.apache.pdfbox.pdmodel.common.function.PDFunctionType0(cOSBase3);
        org.apache.pdfbox.pdmodel.common.PDRange pDRange6 = pDFunctionType0_4.getDecodeForParameter(5);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DA;
        org.apache.pdfbox.pdmodel.common.function.PDFunctionType2 pDFunctionType2_1 = new org.apache.pdfbox.pdmodel.common.function.PDFunctionType2((org.apache.pdfbox.cos.COSBase) cOSName0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition2 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary1);
        org.apache.pdfbox.cos.COSBase cOSBase3 = pDTransition2.getDirection();
        org.apache.pdfbox.pdmodel.common.function.PDFunctionType0 pDFunctionType0_4 = new org.apache.pdfbox.pdmodel.common.function.PDFunctionType0(cOSBase3);
        int i5 = pDFunctionType0_4.getBitsPerSample();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary4.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName6, (int) (short) 0);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP pDSeedValueMDP9 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP(cOSDictionary4);
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        long long11 = cOSDictionary4.getLong(cOSName10);
        org.apache.pdfbox.cos.COSName cOSName12 = org.apache.pdfbox.cos.COSName.PAGE_MODE;
        java.lang.String str13 = cOSName12.toString();
        org.apache.pdfbox.cos.COSBase cOSBase14 = org.apache.pdfbox.pdmodel.PDPageTree.getInheritableAttribute(cOSDictionary4, cOSName12);
        org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties pDOptionalContentProperties15 = new org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties(cOSDictionary4);
        boolean b17 = pDOptionalContentProperties15.isGroupEnabled("StructElem");
        boolean b19 = pDOptionalContentProperties15.isGroupEnabled("");
        java.lang.String[] str_array20 = pDOptionalContentProperties15.getGroupNames();
    }
}
