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
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting2 = org.apache.pdfbox.io.MemoryUsageSetting.setupMixed((long) 10, (long) 1);
        org.junit.Assert.assertNotNull(memoryUsageSetting2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test002");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary1 = null;
        pDAnnotationLine0.setBorderStyle(pDBorderStyleDictionary1);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDExternalDataDictionary pDExternalDataDictionary3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDExternalDataDictionary();
        pDAnnotationLine0.setExternalData(pDExternalDataDictionary3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test003");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        java.lang.String str4 = pDExportFormatAttributeObject1.getTextAlign();
        org.apache.pdfbox.pdmodel.graphics.color.PDGamma pDGamma5 = null;
        pDExportFormatAttributeObject1.setAllBorderColors(pDGamma5);
        java.lang.String str7 = pDExportFormatAttributeObject1.getScope();
        pDExportFormatAttributeObject1.setSpaceAfter((float) 10);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Start" + "'", str4.equals("Start"));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test004");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CALRGB;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test005");
        org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary pDRectlinearMeasureDictionary0 = new org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDRectlinearMeasureDictionary0.getCOSObject();
        org.junit.Assert.assertNotNull(cOSDictionary1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test006");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature pDSignature0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature();
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuild pDPropBuild1 = pDSignature0.getPropBuild();
        pDSignature0.setName("Do");
        org.junit.Assert.assertNull(pDPropBuild1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test007");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.BORDER_STYLE_HIDDEN;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Hidden" + "'", str0.equals("Hidden"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test008");
        org.apache.pdfbox.io.RandomAccessBuffer randomAccessBuffer0 = new org.apache.pdfbox.io.RandomAccessBuffer();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree2 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage4 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle3);
        int i5 = pDPageTree2.indexOf(pDPage4);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream6 = pDPage4.getContentStreams();
        org.apache.pdfbox.pdmodel.PDResources pDResources7 = pDPage4.getResources();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree8 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary9 = pDPageTree8.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition10 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary9);
        org.apache.pdfbox.cos.COSBase cOSBase11 = pDTransition10.getDirection();
        pDPage4.setTransition(pDTransition10, (float) (short) 1);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree14 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary15 = pDPageTree14.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition16 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary15);
        pDPage4.setTransition(pDTransition16);
        java.io.InputStream inputStream18 = pDPage4.getContents();
        java.io.File file20 = null;
        org.apache.pdfbox.io.ScratchFile scratchFile21 = new org.apache.pdfbox.io.ScratchFile(file20);
        org.apache.pdfbox.pdfparser.PDFParser pDFParser22 = new org.apache.pdfbox.pdfparser.PDFParser((org.apache.pdfbox.io.RandomAccessRead) randomAccessBuffer0, "RP", inputStream18, "StructElem", scratchFile21);
        boolean b23 = pDFParser22.isLenient();
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(iterator_pDStream6);
        org.junit.Assert.assertNull(pDResources7);
        org.junit.Assert.assertNotNull(cOSDictionary9);
        org.junit.Assert.assertNotNull(cOSBase11);
        org.junit.Assert.assertNotNull(cOSDictionary15);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue(b23 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test009");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        pDExportFormatAttributeObject1.setLineHeightNormal();
        float f5 = pDExportFormatAttributeObject1.getTextDecorationThickness();
        pDExportFormatAttributeObject1.setWidth(2);
        org.junit.Assert.assertTrue(f5 == (-1.0f));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test010");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CLR_FF;
        boolean b1 = cOSName0.isDirect();
        org.junit.Assert.assertNotNull(cOSName0);
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test011");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CID_SET;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test012");
        org.apache.pdfbox.pdmodel.font.PDType3Font pDType3Font0 = null;
        org.apache.pdfbox.pdmodel.PDDocument pDDocument1 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile2 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument1);
        pDDocument1.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata5 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument1);
        org.apache.pdfbox.cos.COSStream cOSStream6 = pDMetadata5.getCOSObject();
        java.io.OutputStream outputStream7 = cOSStream6.createFilteredStream();
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType2 pDShadingType2_8 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType2((org.apache.pdfbox.cos.COSDictionary) cOSStream6);
        org.apache.pdfbox.pdmodel.font.PDType3CharProc pDType3CharProc9 = new org.apache.pdfbox.pdmodel.font.PDType3CharProc(pDType3Font0, cOSStream6);
        org.apache.pdfbox.cos.COSStream cOSStream10 = pDType3CharProc9.getCOSObject();
        try {
            org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle11 = pDType3CharProc9.getBBox();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream6);
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(cOSStream10);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test013");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        java.lang.String str1 = pDAnnotationLine0.getSubject();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree2 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage4 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle3);
        int i5 = pDPageTree2.indexOf(pDPage4);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree6 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = pDPageTree6.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition8 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary7);
        org.apache.pdfbox.cos.COSBase cOSBase9 = pDTransition8.getDirection();
        pDPage4.setTransition(pDTransition8, (float) 1);
        pDAnnotationLine0.setPage(pDPage4);
        float[] f_array13 = pDAnnotationLine0.getLine();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDExternalDataDictionary pDExternalDataDictionary14 = pDAnnotationLine0.getExternalData();
        java.lang.String str15 = pDAnnotationLine0.getIntent();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertNotNull(cOSBase9);
        org.junit.Assert.assertNotNull(f_array13);
        org.junit.Assert.assertNull(pDExternalDataDictionary14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test014");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage1 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDPage1.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition3 = pDPage1.getTransition();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(pDTransition3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test015");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        java.awt.geom.GeneralPath generalPath1 = pDRectangle0.toGeneralPath();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle6 = new org.apache.pdfbox.pdmodel.common.PDRectangle((float) (byte) -1, (float) 10L, (float) (byte) 10, (-1.0f));
        org.apache.pdfbox.util.Matrix matrix7 = new org.apache.pdfbox.util.Matrix();
        java.awt.geom.Point2D.Float float10 = matrix7.transformPoint((float) (byte) 10, 12000.0f);
        float f11 = matrix7.getTranslateX();
        java.awt.geom.GeneralPath generalPath12 = pDRectangle6.transform(matrix7);
        java.awt.geom.GeneralPath generalPath13 = pDRectangle0.transform(matrix7);
        org.junit.Assert.assertNotNull(pDRectangle0);
        org.junit.Assert.assertNotNull(generalPath1);
        org.junit.Assert.assertNotNull(float10);
        org.junit.Assert.assertTrue(f11 == 0.0f);
        org.junit.Assert.assertNotNull(generalPath12);
        org.junit.Assert.assertNotNull(generalPath13);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test016");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        cOSDictionary1.setString("Highlight", "Start");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary5 = cOSDictionary1.asUnmodifiableDictionary();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test017");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.A5;
        org.junit.Assert.assertNotNull(pDRectangle0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test018");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDComboBox pDComboBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDComboBox(pDAcroForm0);
        pDComboBox1.setPartialName("");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test019");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode2 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern pDTilingPattern3 = new org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern(cOSDictionary1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = pDTilingPattern3.getBBox();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject6 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject6.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary9 = pDExportFormatAttributeObject6.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName11 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary9.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName11, (int) (short) 0);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache14 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources15 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary9, resourceCache14);
        java.lang.Iterable<org.apache.pdfbox.cos.COSName> iterable_cOSName16 = pDResources15.getPropertiesNames();
        org.apache.pdfbox.cos.COSName cOSName17 = org.apache.pdfbox.cos.COSName.EMPTY;
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree18 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary19 = pDPageTree18.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject20 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty21 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary19, pDUserAttributeObject20);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent22 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary19);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit23 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary19);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_24 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary19);
        pDResources15.put(cOSName17, (org.apache.pdfbox.pdmodel.graphics.shading.PDShading) pDShadingType1_24);
        org.apache.pdfbox.cos.COSName cOSName26 = org.apache.pdfbox.cos.COSName.URL;
        org.apache.pdfbox.pdmodel.graphics.color.PDSeparation pDSeparation27 = new org.apache.pdfbox.pdmodel.graphics.color.PDSeparation();
        pDResources15.put(cOSName26, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDSeparation27);
        pDTilingPattern3.setResources(pDResources15);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary30 = pDTilingPattern3.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary31 = pDTilingPattern3.getCOSObject();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNull(pDRectangle4);
        org.junit.Assert.assertNotNull(cOSDictionary9);
        org.junit.Assert.assertNotNull(cOSName11);
        org.junit.Assert.assertNotNull(iterable_cOSName16);
        org.junit.Assert.assertNotNull(cOSName17);
        org.junit.Assert.assertNotNull(cOSDictionary19);
        org.junit.Assert.assertNotNull(cOSName26);
        org.junit.Assert.assertNotNull(cOSDictionary30);
        org.junit.Assert.assertNotNull(cOSDictionary31);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test020");
        org.apache.pdfbox.pdfwriter.COSWriterXRefEntry cOSWriterXRefEntry0 = org.apache.pdfbox.pdfwriter.COSWriterXRefEntry.getNullEntry();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey1 = cOSWriterXRefEntry0.getKey();
        org.junit.Assert.assertNotNull(cOSWriterXRefEntry0);
        org.junit.Assert.assertNotNull(cOSObjectKey1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test021");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.BLACK_IS_1;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test022");
        org.apache.pdfbox.pdmodel.PageLayout pageLayout0 = org.apache.pdfbox.pdmodel.PageLayout.TWO_COLUMN_RIGHT;
        org.junit.Assert.assertTrue("'" + pageLayout0 + "' != '" + org.apache.pdfbox.pdmodel.PageLayout.TWO_COLUMN_RIGHT + "'", pageLayout0.equals(org.apache.pdfbox.pdmodel.PageLayout.TWO_COLUMN_RIGHT));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test023");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        org.apache.pdfbox.cos.COSDocument cOSDocument2 = pDDocument0.getDocument();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject4.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = pDExportFormatAttributeObject4.getCOSObject();
        int i9 = cOSDictionary7.getInt("Expired");
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.A;
        cOSDictionary7.setInt(cOSName10, 100);
        org.apache.pdfbox.cos.COSName cOSName13 = org.apache.pdfbox.cos.COSName.OUTPUT_INTENT;
        org.apache.pdfbox.cos.COSBase cOSBase14 = cOSDictionary7.getItem(cOSName13);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm15 = new org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm(pDDocument0, cOSDictionary7);
        org.apache.pdfbox.cos.COSName cOSName16 = org.apache.pdfbox.cos.COSName.ROOT;
        org.apache.pdfbox.pdmodel.interactive.form.PDXFAResource pDXFAResource17 = new org.apache.pdfbox.pdmodel.interactive.form.PDXFAResource((org.apache.pdfbox.cos.COSBase) cOSName16);
        pDAcroForm15.setXFA(pDXFAResource17);
        pDAcroForm15.flatten();
        boolean b20 = pDAcroForm15.isCachingFields();
        pDAcroForm15.setDefaultAppearance("Both");
        org.junit.Assert.assertNotNull(cOSDocument2);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertNotNull(cOSName13);
        org.junit.Assert.assertNull(cOSBase14);
        org.junit.Assert.assertNotNull(cOSName16);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test024");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode2 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary1);
        cOSDictionary1.setString("BlockQuote", "hi!");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie pDActionMovie6 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionRemoteGoTo pDActionRemoteGoTo7 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionRemoteGoTo(cOSDictionary1);
        boolean b8 = pDActionRemoteGoTo7.shouldOpenInNewWindow();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test025");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.RECT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test026");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata4 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument0);
        org.apache.pdfbox.cos.COSStream cOSStream5 = pDMetadata4.getCOSObject();
        java.lang.String str6 = cOSStream5.toTextString();
        java.io.OutputStream outputStream7 = cOSStream5.createUnfilteredStream();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureTreeRoot pDStructureTreeRoot8 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureTreeRoot((org.apache.pdfbox.cos.COSDictionary) cOSStream5);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument9 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile10 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument9);
        pDDocument9.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata13 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument9);
        org.apache.pdfbox.cos.COSStream cOSStream14 = pDMetadata13.getCOSObject();
        java.io.OutputStream outputStream15 = cOSStream14.createFilteredStream();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream16 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream14);
        org.apache.pdfbox.pdmodel.common.PDStream pDStream17 = pDAppearanceStream16.getContentStream();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject19 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject19.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary22 = pDExportFormatAttributeObject19.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName24 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary22.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName24, (int) (short) 0);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache27 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources28 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary22, resourceCache27);
        org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject pDFormXObject29 = null;
        org.apache.pdfbox.cos.COSName cOSName30 = pDResources28.add(pDFormXObject29);
        java.lang.Iterable<org.apache.pdfbox.cos.COSName> iterable_cOSName31 = pDResources28.getColorSpaceNames();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree32 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary33 = pDPageTree32.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions34 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary33);
        org.apache.pdfbox.cos.COSName cOSName36 = org.apache.pdfbox.cos.COSName.CROP_BOX;
        java.lang.String str37 = cOSDictionary33.getEmbeddedString("Overline", cOSName36);
        boolean b38 = pDResources28.hasColorSpace(cOSName36);
        pDAppearanceStream16.setResources(pDResources28);
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font40 = org.apache.pdfbox.pdmodel.font.PDType1Font.HELVETICA_BOLD;
        boolean b42 = pDType1Font40.hasGlyph("COSName{PageMode}");
        float f44 = pDType1Font40.getHeight(0);
        org.apache.pdfbox.cos.COSName cOSName45 = pDResources28.add((org.apache.pdfbox.pdmodel.font.PDFont) pDType1Font40);
        pDStructureTreeRoot8.setK((org.apache.pdfbox.cos.COSBase) cOSName45);
        java.util.Map<java.lang.String, java.lang.String> map_str_str47 = null;
        try {
            pDStructureTreeRoot8.setRoleMap(map_str_str47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(cOSStream14);
        org.junit.Assert.assertNotNull(outputStream15);
        org.junit.Assert.assertNotNull(pDStream17);
        org.junit.Assert.assertNotNull(cOSDictionary22);
        org.junit.Assert.assertNotNull(cOSName24);
        org.junit.Assert.assertNotNull(cOSName30);
        org.junit.Assert.assertNotNull(iterable_cOSName31);
        org.junit.Assert.assertNotNull(cOSDictionary33);
        org.junit.Assert.assertNotNull(cOSName36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(pDType1Font40);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(f44 == 0.0f);
        org.junit.Assert.assertNotNull(cOSName45);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test027");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.BLOCK_ALIGN_JUSTIFY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Justify" + "'", str0.equals("Justify"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test028");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue pDSeedValue0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue();
        pDSeedValue0.setSubFilterRequired(false);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp pDSeedValueTimeStamp3 = pDSeedValue0.getTimeStamp();
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP pDSeedValueMDP4 = pDSeedValue0.getMDP();
        org.junit.Assert.assertNull(pDSeedValueTimeStamp3);
        org.junit.Assert.assertNull(pDSeedValueMDP4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test029");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        pDExportFormatAttributeObject1.setLineHeightNormal();
        float f5 = pDExportFormatAttributeObject1.getStartIndent();
        java.lang.String str6 = pDExportFormatAttributeObject1.getSummary();
        org.junit.Assert.assertTrue(f5 == 0.0f);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test030");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata4 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument0);
        org.apache.pdfbox.cos.COSStream cOSStream5 = pDMetadata4.getCOSObject();
        java.lang.String str6 = cOSStream5.toTextString();
        java.io.OutputStream outputStream7 = cOSStream5.createUnfilteredStream();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureTreeRoot pDStructureTreeRoot8 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureTreeRoot((org.apache.pdfbox.cos.COSDictionary) cOSStream5);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument9 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile10 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument9);
        pDDocument9.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata13 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument9);
        org.apache.pdfbox.cos.COSStream cOSStream14 = pDMetadata13.getCOSObject();
        java.io.OutputStream outputStream15 = cOSStream14.createFilteredStream();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream16 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream14);
        org.apache.pdfbox.pdmodel.common.PDStream pDStream17 = pDAppearanceStream16.getContentStream();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject19 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject19.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary22 = pDExportFormatAttributeObject19.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName24 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary22.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName24, (int) (short) 0);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache27 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources28 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary22, resourceCache27);
        org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject pDFormXObject29 = null;
        org.apache.pdfbox.cos.COSName cOSName30 = pDResources28.add(pDFormXObject29);
        java.lang.Iterable<org.apache.pdfbox.cos.COSName> iterable_cOSName31 = pDResources28.getColorSpaceNames();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree32 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary33 = pDPageTree32.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions34 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary33);
        org.apache.pdfbox.cos.COSName cOSName36 = org.apache.pdfbox.cos.COSName.CROP_BOX;
        java.lang.String str37 = cOSDictionary33.getEmbeddedString("Overline", cOSName36);
        boolean b38 = pDResources28.hasColorSpace(cOSName36);
        pDAppearanceStream16.setResources(pDResources28);
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font40 = org.apache.pdfbox.pdmodel.font.PDType1Font.HELVETICA_BOLD;
        boolean b42 = pDType1Font40.hasGlyph("COSName{PageMode}");
        float f44 = pDType1Font40.getHeight(0);
        org.apache.pdfbox.cos.COSName cOSName45 = pDResources28.add((org.apache.pdfbox.pdmodel.font.PDFont) pDType1Font40);
        pDStructureTreeRoot8.setK((org.apache.pdfbox.cos.COSBase) cOSName45);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj47 = pDStructureTreeRoot8.getRoleMap();
        org.junit.Assert.assertNotNull(cOSStream5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(cOSStream14);
        org.junit.Assert.assertNotNull(outputStream15);
        org.junit.Assert.assertNotNull(pDStream17);
        org.junit.Assert.assertNotNull(cOSDictionary22);
        org.junit.Assert.assertNotNull(cOSName24);
        org.junit.Assert.assertNotNull(cOSName30);
        org.junit.Assert.assertNotNull(iterable_cOSName31);
        org.junit.Assert.assertNotNull(cOSDictionary33);
        org.junit.Assert.assertNotNull(cOSName36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(pDType1Font40);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(f44 == 0.0f);
        org.junit.Assert.assertNotNull(cOSName45);
        org.junit.Assert.assertNotNull(map_str_obj47);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test031");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDComboBox pDComboBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDComboBox(pDAcroForm0);
        pDComboBox1.setEdit(true);
        pDComboBox1.setMultiSelect(false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test032");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.AP_REF;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test033");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.READING_DIRECTION_R2L;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "R2L" + "'", str0.equals("R2L"));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test034");
        try {
            org.apache.pdfbox.io.RandomAccessBufferedFileInputStream randomAccessBufferedFileInputStream1 = new org.apache.pdfbox.io.RandomAccessBufferedFileInputStream("Disc");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test035");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget pDAnnotationWidget0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget();
        java.lang.String str1 = pDAnnotationWidget0.getHighlightingMode();
        org.apache.pdfbox.pdmodel.interactive.action.PDAnnotationAdditionalActions pDAnnotationAdditionalActions2 = new org.apache.pdfbox.pdmodel.interactive.action.PDAnnotationAdditionalActions();
        pDAnnotationWidget0.setActions(pDAnnotationAdditionalActions2);
        org.apache.pdfbox.pdmodel.font.PDType3Font pDType3Font4 = null;
        org.apache.pdfbox.pdmodel.PDDocument pDDocument5 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile6 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument5);
        org.apache.pdfbox.cos.COSDocument cOSDocument7 = pDDocument5.getDocument();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree8 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary9 = pDPageTree8.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode10 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary9);
        cOSDictionary9.setString("BlockQuote", "hi!");
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey14 = cOSDocument7.getKey((org.apache.pdfbox.cos.COSBase) cOSDictionary9);
        boolean b15 = cOSDocument7.isXRefStream();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument16 = new org.apache.pdfbox.pdmodel.PDDocument(cOSDocument7);
        org.apache.pdfbox.cos.COSStream cOSStream17 = cOSDocument7.createCOSStream();
        org.apache.pdfbox.pdmodel.font.PDType3CharProc pDType3CharProc18 = new org.apache.pdfbox.pdmodel.font.PDType3CharProc(pDType3Font4, cOSStream17);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed19 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed((org.apache.pdfbox.cos.COSDictionary) cOSStream17);
        pDAnnotationAdditionalActions2.setPC((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionNamed19);
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction21 = pDAnnotationAdditionalActions2.getD();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction22 = pDAnnotationAdditionalActions2.getE();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "I" + "'", str1.equals("I"));
        org.junit.Assert.assertNotNull(cOSDocument7);
        org.junit.Assert.assertNotNull(cOSDictionary9);
        org.junit.Assert.assertNull(cOSObjectKey14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(cOSStream17);
        org.junit.Assert.assertNull(pDAction21);
        org.junit.Assert.assertNull(pDAction22);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test036");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_6 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary1);
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation7 = new org.apache.pdfbox.pdmodel.PDDocumentInformation(cOSDictionary1);
        java.util.Calendar calendar8 = pDDocumentInformation7.getCreationDate();
        pDDocumentInformation7.setCustomMetadataValue("UpperAlpha", "def");
        java.lang.String str12 = pDDocumentInformation7.getCreator();
        java.lang.String str13 = pDDocumentInformation7.getTrapped();
        java.lang.String str14 = pDDocumentInformation7.getKeywords();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNull(calendar8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test037");
        org.w3c.dom.Element element0 = null;
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquiggly fDFAnnotationSquiggly1 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquiggly(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test038");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary1 = null;
        pDAnnotationLine0.setBorderStyle(pDBorderStyleDictionary1);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDExternalDataDictionary pDExternalDataDictionary3 = pDAnnotationLine0.getExternalData();
        boolean b4 = pDAnnotationLine0.isHidden();
        java.lang.String str5 = pDAnnotationLine0.getCaptionPositioning();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary6 = pDAnnotationLine0.getBorderStyle();
        org.junit.Assert.assertNull(pDExternalDataDictionary3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(pDBorderStyleDictionary6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test039");
        org.apache.pdfbox.io.RandomAccessBuffer randomAccessBuffer0 = new org.apache.pdfbox.io.RandomAccessBuffer();
        org.apache.pdfbox.pdfparser.PDFParser pDFParser1 = new org.apache.pdfbox.pdfparser.PDFParser((org.apache.pdfbox.io.RandomAccessRead) randomAccessBuffer0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test040");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.fdf.FDFIconFit.SCALE_TYPE_ANAMORPHIC;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "A" + "'", str0.equals("A"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test041");
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission2 = org.apache.pdfbox.pdmodel.encryption.AccessPermission.getOwnerAccessPermission();
        accessPermission2.setCanExtractContent(true);
        accessPermission2.setCanModify(false);
        org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy standardProtectionPolicy7 = new org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy("Sect", "s", accessPermission2);
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission8 = org.apache.pdfbox.pdmodel.encryption.AccessPermission.getOwnerAccessPermission();
        boolean b9 = accessPermission8.canAssembleDocument();
        accessPermission8.setCanPrint(true);
        standardProtectionPolicy7.setPermissions(accessPermission8);
        org.junit.Assert.assertNotNull(accessPermission2);
        org.junit.Assert.assertNotNull(accessPermission8);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test042");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.PLACEMENT_BLOCK;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Block" + "'", str0.equals("Block"));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test043");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        java.lang.String[] str_array3 = new java.lang.String[] { "BlockQuote" };
        pDExportFormatAttributeObject1.setHeaders(str_array3);
        pDExportFormatAttributeObject1.setHeightAuto();
        pDExportFormatAttributeObject1.setSummary("O=TD");
        org.junit.Assert.assertNotNull(str_array3);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test044");
        byte[] byte_array0 = org.apache.pdfbox.pdfwriter.COSWriter.ARRAY_OPEN;
        org.apache.pdfbox.cos.COSString cOSString1 = new org.apache.pdfbox.cos.COSString(byte_array0);
        boolean b2 = cOSString1.getForceHexForm();
        org.junit.Assert.assertNotNull(byte_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test045");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine.LE_SLASH;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Slash" + "'", str0.equals("Slash"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test046");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.PARENT_TREE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test047");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.PLACEMENT_BEFORE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Before" + "'", str0.equals("Before"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test048");
        org.apache.pdfbox.pdmodel.font.PDType3Font pDType3Font0 = null;
        org.apache.pdfbox.pdmodel.PDDocument pDDocument1 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile2 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument1);
        pDDocument1.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata5 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument1);
        org.apache.pdfbox.cos.COSStream cOSStream6 = pDMetadata5.getCOSObject();
        java.io.OutputStream outputStream7 = cOSStream6.createFilteredStream();
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType2 pDShadingType2_8 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType2((org.apache.pdfbox.cos.COSDictionary) cOSStream6);
        org.apache.pdfbox.pdmodel.font.PDType3CharProc pDType3CharProc9 = new org.apache.pdfbox.pdmodel.font.PDType3CharProc(pDType3Font0, cOSStream6);
        cOSStream6.close();
        cOSStream6.setName("Part", "off");
        org.junit.Assert.assertNotNull(cOSStream6);
        org.junit.Assert.assertNotNull(outputStream7);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test049");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_6 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary1);
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation7 = new org.apache.pdfbox.pdmodel.PDDocumentInformation(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams pDWindowsLaunchParams8 = new org.apache.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams(cOSDictionary1);
        pDWindowsLaunchParams8.setExecuteParam("XML-1.00");
        java.lang.String str11 = pDWindowsLaunchParams8.getOperation();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "open" + "'", str11.equals("open"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test050");
        org.apache.pdfbox.pdmodel.PageLayout pageLayout0 = org.apache.pdfbox.pdmodel.PageLayout.SINGLE_PAGE;
        org.junit.Assert.assertTrue("'" + pageLayout0 + "' != '" + org.apache.pdfbox.pdmodel.PageLayout.SINGLE_PAGE + "'", pageLayout0.equals(org.apache.pdfbox.pdmodel.PageLayout.SINGLE_PAGE));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test051");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject.OWNER_CSS_1_00;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "CSS-1.00" + "'", str0.equals("CSS-1.00"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test052");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.F_DECODE_PARMS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test053");
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline pDDocumentOutline0 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline();
        pDDocumentOutline0.openNode();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test054");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        org.apache.pdfbox.cos.COSDocument cOSDocument2 = pDDocument0.getDocument();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument3 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile4 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument3);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle5 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray6 = pDRectangle5.getCOSArray();
        cOSArray6.clear();
        org.apache.pdfbox.cos.COSName cOSName9 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray6.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName9);
        org.apache.pdfbox.pdmodel.graphics.color.PDGamma pDGamma11 = new org.apache.pdfbox.pdmodel.graphics.color.PDGamma(cOSArray6);
        org.apache.pdfbox.pdmodel.fdf.FDFOptionElement fDFOptionElement12 = new org.apache.pdfbox.pdmodel.fdf.FDFOptionElement(cOSArray6);
        java.util.List<java.lang.String> list_str13 = org.apache.pdfbox.pdmodel.common.COSArrayList.convertCOSStringCOSArrayToList(cOSArray6);
        java.io.InputStream inputStream14 = pDEmbeddedFile4.createInputStream(list_str13);
        try {
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont pDTrueTypeFont15 = org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.loadTTF(pDDocument0, inputStream14);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException");
        } catch (java.io.EOFException e) {
        }
        org.junit.Assert.assertNotNull(cOSDocument2);
        org.junit.Assert.assertNotNull(pDRectangle5);
        org.junit.Assert.assertNotNull(cOSArray6);
        org.junit.Assert.assertNotNull(cOSName9);
        org.junit.Assert.assertNotNull(list_str13);
        org.junit.Assert.assertNotNull(inputStream14);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test055");
        byte[] byte_array0 = org.apache.pdfbox.pdfwriter.COSStandardOutputStream.CRLF;
        org.apache.pdfbox.io.RandomAccessBuffer randomAccessBuffer2 = new org.apache.pdfbox.io.RandomAccessBuffer();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree4 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle5 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage6 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle5);
        int i7 = pDPageTree4.indexOf(pDPage6);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream8 = pDPage6.getContentStreams();
        org.apache.pdfbox.pdmodel.PDResources pDResources9 = pDPage6.getResources();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree10 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary11 = pDPageTree10.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition12 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary11);
        org.apache.pdfbox.cos.COSBase cOSBase13 = pDTransition12.getDirection();
        pDPage6.setTransition(pDTransition12, (float) (short) 1);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree16 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary17 = pDPageTree16.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition18 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary17);
        pDPage6.setTransition(pDTransition18);
        java.io.InputStream inputStream20 = pDPage6.getContents();
        java.io.File file22 = null;
        org.apache.pdfbox.io.ScratchFile scratchFile23 = new org.apache.pdfbox.io.ScratchFile(file22);
        org.apache.pdfbox.pdfparser.PDFParser pDFParser24 = new org.apache.pdfbox.pdfparser.PDFParser((org.apache.pdfbox.io.RandomAccessRead) randomAccessBuffer2, "RP", inputStream20, "StructElem", scratchFile23);
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting26 = null;
        try {
            org.apache.pdfbox.pdmodel.PDDocument pDDocument27 = org.apache.pdfbox.pdmodel.PDDocument.load(byte_array0, "on", inputStream20, "F", memoryUsageSetting26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array0);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNotNull(iterator_pDStream8);
        org.junit.Assert.assertNull(pDResources9);
        org.junit.Assert.assertNotNull(cOSDictionary11);
        org.junit.Assert.assertNotNull(cOSBase13);
        org.junit.Assert.assertNotNull(cOSDictionary17);
        org.junit.Assert.assertNotNull(inputStream20);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test056");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.LJ;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test057");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.printing.Scaling scaling1 = org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable5 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument0, scaling1, true, 1.0f, false);
        org.apache.pdfbox.pdmodel.DefaultResourceCache defaultResourceCache6 = new org.apache.pdfbox.pdmodel.DefaultResourceCache();
        pDDocument0.setResourceCache((org.apache.pdfbox.pdmodel.ResourceCache) defaultResourceCache6);
        org.apache.pdfbox.cos.COSObject cOSObject8 = null;
        org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState pDExtendedGraphicsState9 = new org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState();
        pDExtendedGraphicsState9.setStrokingAlphaConstant((java.lang.Float) 1.0f);
        defaultResourceCache6.put(cOSObject8, pDExtendedGraphicsState9);
        int i13 = pDExtendedGraphicsState9.getLineJoinStyle();
        java.lang.Float f14 = pDExtendedGraphicsState9.getNonStrokingAlphaConstant();
        pDExtendedGraphicsState9.setLineCapStyle((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + scaling1 + "' != '" + org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT + "'", scaling1.equals(org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT));
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertNull(f14);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test058");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle.SUB_TYPE_CIRCLE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Circle" + "'", str0.equals("Circle"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test059");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_6 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary1);
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation7 = new org.apache.pdfbox.pdmodel.PDDocumentInformation(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams pDWindowsLaunchParams8 = new org.apache.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuild pDPropBuild9 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuild(cOSDictionary1);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary10 = pDPropBuild9.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuildDataDict pDPropBuildDataDict11 = pDPropBuild9.getApp();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary10);
        org.junit.Assert.assertNull(pDPropBuildDataDict11);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test060");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = new org.apache.pdfbox.pdmodel.common.PDRectangle((float) (short) 100, (float) 0, 0.0f, (float) (-4));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test061");
        org.apache.pdfbox.pdmodel.PDDestinationNameTreeNode pDDestinationNameTreeNode0 = new org.apache.pdfbox.pdmodel.PDDestinationNameTreeNode();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test062");
        org.apache.pdfbox.util.Matrix matrix0 = new org.apache.pdfbox.util.Matrix();
        float f1 = matrix0.getShearY();
        java.awt.geom.Point2D.Float float4 = matrix0.transformPoint((float) (byte) 100, (float) (byte) 1);
        java.awt.geom.Point2D.Float float7 = matrix0.transformPoint((float) ' ', (float) (short) 1);
        org.junit.Assert.assertTrue(f1 == 0.0f);
        org.junit.Assert.assertNotNull(float4);
        org.junit.Assert.assertNotNull(float7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test063");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle1 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage2 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle1);
        int i3 = pDPageTree0.indexOf(pDPage2);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream4 = pDPage2.getContentStreams();
        org.apache.pdfbox.pdmodel.PDResources pDResources5 = pDPage2.getResources();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree6 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = pDPageTree6.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition8 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary7);
        org.apache.pdfbox.cos.COSBase cOSBase9 = pDTransition8.getDirection();
        pDPage2.setTransition(pDTransition8, (float) (short) 1);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream12 = pDPage2.getContentStreams();
        int i13 = pDPage2.getStructParents();
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertNotNull(iterator_pDStream4);
        org.junit.Assert.assertNull(pDResources5);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertNotNull(cOSBase9);
        org.junit.Assert.assertNotNull(iterator_pDStream12);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test064");
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
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle15 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray16 = pDRectangle15.getCOSArray();
        cOSArray16.clear();
        org.apache.pdfbox.cos.COSName cOSName19 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray16.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName19);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle21 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray22 = pDRectangle21.getCOSArray();
        cOSArray22.clear();
        org.apache.pdfbox.cos.COSName cOSName25 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray22.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName25);
        cOSArray16.addAll(cOSArray22);
        try {
            org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding28 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSName12, cOSArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertTrue(long11 == (-1L));
        org.junit.Assert.assertNotNull(cOSName12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "COSName{PageMode}" + "'", str13.equals("COSName{PageMode}"));
        org.junit.Assert.assertNull(cOSBase14);
        org.junit.Assert.assertNotNull(pDRectangle15);
        org.junit.Assert.assertNotNull(cOSArray16);
        org.junit.Assert.assertNotNull(cOSName19);
        org.junit.Assert.assertNotNull(pDRectangle21);
        org.junit.Assert.assertNotNull(cOSArray22);
        org.junit.Assert.assertNotNull(cOSName25);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test065");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions2 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary1);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.CROP_BOX;
        java.lang.String str5 = cOSDictionary1.getEmbeddedString("Overline", cOSName4);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch pDActionLaunch6 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch(cOSDictionary1);
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode7 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test066");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_6 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType7 pDShadingType7_7 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType7(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolygon fDFAnnotationPolygon8 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolygon(cOSDictionary1);
        float[] f_array9 = fDFAnnotationPolygon8.getVertices();
        float[] f_array10 = fDFAnnotationPolygon8.getVertices();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNull(f_array9);
        org.junit.Assert.assertNull(f_array10);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test067");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle1 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage2 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle1);
        int i3 = pDPageTree0.indexOf(pDPage2);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree4 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary5 = pDPageTree4.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition6 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary5);
        org.apache.pdfbox.cos.COSBase cOSBase7 = pDTransition6.getDirection();
        pDPage2.setTransition(pDTransition6, (float) 1);
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDimension pDTransitionDimension10 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDimension.H;
        pDTransition6.setDimension(pDTransitionDimension10);
        java.lang.String str12 = pDTransition6.getStyle();
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertNotNull(cOSDictionary5);
        org.junit.Assert.assertNotNull(cOSBase7);
        org.junit.Assert.assertTrue("'" + pDTransitionDimension10 + "' != '" + org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDimension.H + "'", pDTransitionDimension10.equals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDimension.H));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "R" + "'", str12.equals("R"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test068");
        org.apache.pdfbox.io.RandomAccessBuffer randomAccessBuffer0 = new org.apache.pdfbox.io.RandomAccessBuffer();
        int i1 = randomAccessBuffer0.read();
        byte[] byte_array5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        int i8 = randomAccessBuffer0.read(byte_array5, (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue(i1 == (-1));
        org.junit.Assert.assertNotNull(byte_array5);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test069");
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission0 = org.apache.pdfbox.pdmodel.encryption.AccessPermission.getOwnerAccessPermission();
        boolean b1 = accessPermission0.canAssembleDocument();
        boolean b2 = accessPermission0.canAssembleDocument();
        boolean b3 = accessPermission0.canAssembleDocument();
        accessPermission0.setCanExtractForAccessibility(false);
        accessPermission0.setCanModifyAnnotations(true);
        org.junit.Assert.assertNotNull(accessPermission0);
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test071");
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission2 = org.apache.pdfbox.pdmodel.encryption.AccessPermission.getOwnerAccessPermission();
        accessPermission2.setCanExtractContent(true);
        accessPermission2.setCanModify(false);
        org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy standardProtectionPolicy7 = new org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy("Sect", "s", accessPermission2);
        java.lang.String str8 = standardProtectionPolicy7.getOwnerPassword();
        org.junit.Assert.assertNotNull(accessPermission2);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Sect" + "'", str8.equals("Sect"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test072");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.HELVETICA_BOLD;
        java.lang.String str1 = pDType1Font0.toString();
        java.lang.String str2 = pDType1Font0.toString();
        org.apache.pdfbox.pdmodel.font.encoding.GlyphList glyphList3 = pDType1Font0.getGlyphList();
        java.lang.String str5 = glyphList3.codePointToName((int) (short) 1);
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "PDType1Font Helvetica-Bold" + "'", str1.equals("PDType1Font Helvetica-Bold"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "PDType1Font Helvetica-Bold" + "'", str2.equals("PDType1Font Helvetica-Bold"));
        org.junit.Assert.assertNotNull(glyphList3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "controlSTX" + "'", str5.equals("controlSTX"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test073");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode2 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern pDTilingPattern3 = new org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern(cOSDictionary1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = pDTilingPattern3.getBBox();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject6 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject6.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary9 = pDExportFormatAttributeObject6.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName11 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary9.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName11, (int) (short) 0);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache14 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources15 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary9, resourceCache14);
        java.lang.Iterable<org.apache.pdfbox.cos.COSName> iterable_cOSName16 = pDResources15.getPropertiesNames();
        org.apache.pdfbox.cos.COSName cOSName17 = org.apache.pdfbox.cos.COSName.EMPTY;
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree18 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary19 = pDPageTree18.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject20 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty21 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary19, pDUserAttributeObject20);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent22 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary19);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit23 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary19);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_24 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary19);
        pDResources15.put(cOSName17, (org.apache.pdfbox.pdmodel.graphics.shading.PDShading) pDShadingType1_24);
        org.apache.pdfbox.cos.COSName cOSName26 = org.apache.pdfbox.cos.COSName.URL;
        org.apache.pdfbox.pdmodel.graphics.color.PDSeparation pDSeparation27 = new org.apache.pdfbox.pdmodel.graphics.color.PDSeparation();
        pDResources15.put(cOSName26, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDSeparation27);
        pDTilingPattern3.setResources(pDResources15);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary30 = pDTilingPattern3.getCOSObject();
        float f31 = pDTilingPattern3.getYStep();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNull(pDRectangle4);
        org.junit.Assert.assertNotNull(cOSDictionary9);
        org.junit.Assert.assertNotNull(cOSName11);
        org.junit.Assert.assertNotNull(iterable_cOSName16);
        org.junit.Assert.assertNotNull(cOSName17);
        org.junit.Assert.assertNotNull(cOSDictionary19);
        org.junit.Assert.assertNotNull(cOSName26);
        org.junit.Assert.assertNotNull(cOSDictionary30);
        org.junit.Assert.assertTrue(f31 == 0.0f);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test074");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DEFAULT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test075");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.THUMB;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test076");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_6 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary1);
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation7 = new org.apache.pdfbox.pdmodel.PDDocumentInformation(cOSDictionary1);
        java.util.Calendar calendar8 = pDDocumentInformation7.getCreationDate();
        pDDocumentInformation7.setCustomMetadataValue("UpperAlpha", "def");
        java.lang.String str13 = pDDocumentInformation7.getCustomMetadataValue("Sect");
        java.lang.String str14 = pDDocumentInformation7.getTitle();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNull(calendar8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test077");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.A3;
        org.junit.Assert.assertNotNull(pDRectangle0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test078");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata4 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument0);
        org.apache.pdfbox.cos.COSStream cOSStream5 = pDMetadata4.getCOSObject();
        java.lang.String str6 = cOSStream5.toTextString();
        org.apache.pdfbox.pdmodel.font.PDTrueTypeFont pDTrueTypeFont7 = new org.apache.pdfbox.pdmodel.font.PDTrueTypeFont((org.apache.pdfbox.cos.COSDictionary) cOSStream5);
        org.apache.pdfbox.cos.COSName cOSName8 = org.apache.pdfbox.cos.COSName.OP_NS;
        org.apache.pdfbox.cos.COSBase cOSBase9 = cOSStream5.getDictionaryObject(cOSName8);
        org.junit.Assert.assertNotNull(cOSStream5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(cOSName8);
        org.junit.Assert.assertNull(cOSBase9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test079");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ID;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test080");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCircle fDFAnnotationCircle0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCircle();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree1 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle2 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage3 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle2);
        int i4 = pDPageTree1.indexOf(pDPage3);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree5 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary6 = pDPageTree5.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition7 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary6);
        org.apache.pdfbox.cos.COSBase cOSBase8 = pDTransition7.getDirection();
        pDPage3.setTransition(pDTransition7, (float) 1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle11 = pDPage3.getCropBox();
        fDFAnnotationCircle0.setFringe(pDRectangle11);
        boolean b13 = fDFAnnotationCircle0.isPrinted();
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNotNull(cOSDictionary6);
        org.junit.Assert.assertNotNull(cOSBase8);
        org.junit.Assert.assertNotNull(pDRectangle11);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test081");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle2 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray3 = pDRectangle2.getCOSArray();
        cOSArray3.clear();
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray3.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName6);
        org.apache.pdfbox.pdmodel.graphics.color.PDGamma pDGamma8 = new org.apache.pdfbox.pdmodel.graphics.color.PDGamma(cOSArray3);
        org.apache.pdfbox.pdmodel.fdf.FDFOptionElement fDFOptionElement9 = new org.apache.pdfbox.pdmodel.fdf.FDFOptionElement(cOSArray3);
        java.util.List<java.lang.String> list_str10 = org.apache.pdfbox.pdmodel.common.COSArrayList.convertCOSStringCOSArrayToList(cOSArray3);
        java.io.InputStream inputStream11 = pDEmbeddedFile1.createInputStream(list_str10);
        java.util.Calendar calendar12 = null;
        pDEmbeddedFile1.setCreationDate(calendar12);
        pDEmbeddedFile1.setCheckSum("CalRGB");
        java.lang.String str16 = pDEmbeddedFile1.getCheckSum();
        org.junit.Assert.assertNotNull(pDRectangle2);
        org.junit.Assert.assertNotNull(cOSArray3);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(list_str10);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "CalRGB" + "'", str16.equals("CalRGB"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test082");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument4 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile5 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument4);
        pDDocument4.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata8 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument4);
        org.apache.pdfbox.cos.COSStream cOSStream9 = pDMetadata8.getCOSObject();
        java.io.OutputStream outputStream10 = cOSStream9.createFilteredStream();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream11 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream9);
        org.apache.pdfbox.pdmodel.common.PDStream pDStream12 = pDAppearanceStream11.getContentStream();
        org.apache.pdfbox.io.RandomAccessWrite randomAccessWrite13 = null;
        org.apache.pdfbox.io.RandomAccessOutputStream randomAccessOutputStream14 = new org.apache.pdfbox.io.RandomAccessOutputStream(randomAccessWrite13);
        randomAccessOutputStream14.flush();
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream16 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream((java.io.OutputStream) randomAccessOutputStream14);
        org.apache.pdfbox.pdmodel.PDPageContentStream pDPageContentStream17 = new org.apache.pdfbox.pdmodel.PDPageContentStream(pDDocument0, pDAppearanceStream11, (java.io.OutputStream) cOSStandardOutputStream16);
        try {
            cOSStandardOutputStream16.writeCRLF();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test083");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        org.apache.pdfbox.cos.COSDocument cOSDocument2 = pDDocument0.getDocument();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        java.lang.String str4 = pDAnnotationLine3.getSubject();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree5 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle6 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage7 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle6);
        int i8 = pDPageTree5.indexOf(pDPage7);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree9 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary10 = pDPageTree9.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition11 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary10);
        org.apache.pdfbox.cos.COSBase cOSBase12 = pDTransition11.getDirection();
        pDPage7.setTransition(pDTransition11, (float) 1);
        pDAnnotationLine3.setPage(pDPage7);
        org.apache.pdfbox.pdmodel.interactive.action.PDPageAdditionalActions pDPageAdditionalActions16 = pDPage7.getActions();
        org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode appendMode17 = org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode.APPEND;
        org.apache.pdfbox.pdmodel.PDPageContentStream pDPageContentStream20 = new org.apache.pdfbox.pdmodel.PDPageContentStream(pDDocument0, pDPage7, appendMode17, true, true);
        pDPageContentStream20.endMarkedContent();
        org.junit.Assert.assertNotNull(cOSDocument2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNotNull(cOSDictionary10);
        org.junit.Assert.assertNotNull(cOSBase12);
        org.junit.Assert.assertNotNull(pDPageAdditionalActions16);
        org.junit.Assert.assertTrue("'" + appendMode17 + "' != '" + org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode.APPEND + "'", appendMode17.equals(org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode.APPEND));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test084");
        org.apache.pdfbox.pdmodel.font.PDFont pDFont0 = org.apache.pdfbox.pdmodel.font.PDFontFactory.createDefaultFont();
        org.junit.Assert.assertNotNull(pDFont0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test085");
        org.apache.pdfbox.io.RandomAccessBuffer randomAccessBuffer0 = new org.apache.pdfbox.io.RandomAccessBuffer();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree2 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage4 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle3);
        int i5 = pDPageTree2.indexOf(pDPage4);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream6 = pDPage4.getContentStreams();
        org.apache.pdfbox.pdmodel.PDResources pDResources7 = pDPage4.getResources();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree8 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary9 = pDPageTree8.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition10 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary9);
        org.apache.pdfbox.cos.COSBase cOSBase11 = pDTransition10.getDirection();
        pDPage4.setTransition(pDTransition10, (float) (short) 1);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree14 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary15 = pDPageTree14.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition16 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary15);
        pDPage4.setTransition(pDTransition16);
        java.io.InputStream inputStream18 = pDPage4.getContents();
        java.io.File file20 = null;
        org.apache.pdfbox.io.ScratchFile scratchFile21 = new org.apache.pdfbox.io.ScratchFile(file20);
        org.apache.pdfbox.pdfparser.PDFParser pDFParser22 = new org.apache.pdfbox.pdfparser.PDFParser((org.apache.pdfbox.io.RandomAccessRead) randomAccessBuffer0, "RP", inputStream18, "StructElem", scratchFile21);
        org.apache.pdfbox.io.RandomAccessBuffer randomAccessBuffer23 = randomAccessBuffer0.clone();
        org.apache.pdfbox.io.RandomAccessBuffer randomAccessBuffer24 = randomAccessBuffer23.clone();
        org.apache.pdfbox.io.RandomAccessBuffer randomAccessBuffer25 = randomAccessBuffer23.clone();
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(iterator_pDStream6);
        org.junit.Assert.assertNull(pDResources7);
        org.junit.Assert.assertNotNull(cOSDictionary9);
        org.junit.Assert.assertNotNull(cOSBase11);
        org.junit.Assert.assertNotNull(cOSDictionary15);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertNotNull(randomAccessBuffer23);
        org.junit.Assert.assertNotNull(randomAccessBuffer24);
        org.junit.Assert.assertNotNull(randomAccessBuffer25);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test086");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData pDActionImportData5 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFCatalog fDFCatalog6 = new org.apache.pdfbox.pdmodel.fdf.FDFCatalog(cOSDictionary1);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFDictionary fDFDictionary8 = new org.apache.pdfbox.pdmodel.fdf.FDFDictionary(cOSDictionary7);
        fDFCatalog6.setFDF(fDFDictionary8);
        org.junit.Assert.assertNotNull(cOSDictionary1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test087");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.RUBY_POSITION_WARICHU;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Warichu" + "'", str0.equals("Warichu"));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test088");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.SHADING_TYPE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test089");
        org.apache.pdfbox.pdfwriter.COSWriterXRefEntry cOSWriterXRefEntry0 = org.apache.pdfbox.pdfwriter.COSWriterXRefEntry.getNullEntry();
        cOSWriterXRefEntry0.setOffset((long) 10);
        cOSWriterXRefEntry0.setFree(false);
        org.junit.Assert.assertNotNull(cOSWriterXRefEntry0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test090");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        java.lang.String str5 = cOSDictionary1.getString("TD");
        org.apache.pdfbox.pdmodel.font.PDTrueTypeFont pDTrueTypeFont6 = new org.apache.pdfbox.pdmodel.font.PDTrueTypeFont(cOSDictionary1);
        boolean b8 = pDTrueTypeFont6.hasGlyph("COSName{Encode}");
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test091");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.SIZE;
        java.util.Calendar calendar8 = null;
        java.util.Calendar calendar9 = cOSDictionary1.getEmbeddedDate("BlockQuote", cOSName7, calendar8);
        org.apache.pdfbox.pdmodel.fdf.FDFField fDFField10 = new org.apache.pdfbox.pdmodel.fdf.FDFField(cOSDictionary1);
        cOSDictionary1.setEmbeddedInt("", "Center", (int) (byte) 1);
        org.apache.pdfbox.pdmodel.interactive.action.PDURIDictionary pDURIDictionary15 = new org.apache.pdfbox.pdmodel.interactive.action.PDURIDictionary(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNull(calendar9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test092");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.SIG;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test093");
        byte[] byte_array2 = org.apache.pdfbox.pdfwriter.COSStandardOutputStream.EOL;
        try {
            int i3 = org.apache.pdfbox.util.NumberFormatUtil.formatFloatFast((float) (-1), (int) (byte) 0, byte_array2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byte_array2);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test094");
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY bOUNDARY0 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY.CropBox;
        org.junit.Assert.assertTrue("'" + bOUNDARY0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY.CropBox + "'", bOUNDARY0.equals(org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY.CropBox));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test095");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject pDLayoutAttributeObject0 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine1 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        java.lang.String str2 = pDAnnotationLine1.getSubject();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree3 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage5 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle4);
        int i6 = pDPageTree3.indexOf(pDPage5);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree7 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary8 = pDPageTree7.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition9 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary8);
        org.apache.pdfbox.cos.COSBase cOSBase10 = pDTransition9.getDirection();
        pDPage5.setTransition(pDTransition9, (float) 1);
        pDAnnotationLine1.setPage(pDPage5);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine14 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        org.apache.pdfbox.pdmodel.interactive.annotation.handlers.PDLinkAppearanceHandler pDLinkAppearanceHandler15 = new org.apache.pdfbox.pdmodel.interactive.annotation.handlers.PDLinkAppearanceHandler((org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) pDAnnotationLine14);
        pDAnnotationLine1.setInReplyTo((org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) pDAnnotationLine14);
        boolean b17 = pDLayoutAttributeObject0.equals((java.lang.Object) pDAnnotationLine14);
        pDAnnotationLine14.setConstantOpacity((float) 10L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNotNull(cOSDictionary8);
        org.junit.Assert.assertNotNull(cOSBase10);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test096");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.WRITING_MODE_RLTB;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RlTb" + "'", str0.equals("RlTb"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test098");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_6 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType7 pDShadingType7_7 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType7(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolygon fDFAnnotationPolygon8 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolygon(cOSDictionary1);
        java.lang.String str9 = fDFAnnotationPolygon8.getSubject();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test099");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature pDSignature0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature();
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuild pDPropBuild1 = pDSignature0.getPropBuild();
        int[] i_array3 = new int[] { (-4) };
        pDSignature0.setByteRange(i_array3);
        java.lang.String str5 = pDSignature0.getLocation();
        java.lang.String str6 = pDSignature0.getFilter();
        org.junit.Assert.assertNull(pDPropBuild1);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test100");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.SIZE;
        java.util.Calendar calendar8 = null;
        java.util.Calendar calendar9 = cOSDictionary1.getEmbeddedDate("BlockQuote", cOSName7, calendar8);
        org.apache.pdfbox.pdmodel.fdf.FDFField fDFField10 = new org.apache.pdfbox.pdmodel.fdf.FDFField(cOSDictionary1);
        fDFField10.setPartialFieldName("List");
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions13 = fDFField10.getAdditionalActions();
        fDFField10.setClearFieldFlags((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNull(calendar9);
        org.junit.Assert.assertNull(pDAdditionalActions13);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test101");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup.SUB_TYPE_INK;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Ink" + "'", str0.equals("Ink"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test102");
        org.apache.pdfbox.pdmodel.graphics.PDLineDashPattern pDLineDashPattern0 = new org.apache.pdfbox.pdmodel.graphics.PDLineDashPattern();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test103");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        java.util.Set<java.util.Map.Entry<org.apache.pdfbox.cos.COSName, org.apache.pdfbox.cos.COSBase>> set_entry_cOSName_cOSBase2 = cOSDictionary1.entrySet();
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_3 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary1);
        int i4 = pDShadingType3_3.getShadingType();
        pDShadingType3_3.setAntiAlias(true);
        int i7 = pDShadingType3_3.getShadingType();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(set_entry_cOSName_cOSBase2);
        org.junit.Assert.assertTrue(i4 == 3);
        org.junit.Assert.assertTrue(i7 == 3);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test104");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationText pDAnnotationText0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationText();
        pDAnnotationText0.setName("COSInt{3}");
        pDAnnotationText0.setNoRotate(false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test105");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.printing.Scaling scaling1 = org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable5 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument0, scaling1, true, 1.0f, false);
        org.apache.pdfbox.pdmodel.DefaultResourceCache defaultResourceCache6 = new org.apache.pdfbox.pdmodel.DefaultResourceCache();
        pDDocument0.setResourceCache((org.apache.pdfbox.pdmodel.ResourceCache) defaultResourceCache6);
        org.apache.pdfbox.cos.COSObject cOSObject8 = null;
        org.apache.pdfbox.pdmodel.graphics.shading.PDShading pDShading9 = defaultResourceCache6.getShading(cOSObject8);
        org.junit.Assert.assertTrue("'" + scaling1 + "' != '" + org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT + "'", scaling1.equals(org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT));
        org.junit.Assert.assertNull(pDShading9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test106");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument4 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile5 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument4);
        pDDocument4.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata8 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument4);
        org.apache.pdfbox.cos.COSStream cOSStream9 = pDMetadata8.getCOSObject();
        java.io.OutputStream outputStream10 = cOSStream9.createFilteredStream();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream11 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream9);
        org.apache.pdfbox.pdmodel.common.PDStream pDStream12 = pDAppearanceStream11.getContentStream();
        org.apache.pdfbox.io.RandomAccessWrite randomAccessWrite13 = null;
        org.apache.pdfbox.io.RandomAccessOutputStream randomAccessOutputStream14 = new org.apache.pdfbox.io.RandomAccessOutputStream(randomAccessWrite13);
        randomAccessOutputStream14.flush();
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream16 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream((java.io.OutputStream) randomAccessOutputStream14);
        org.apache.pdfbox.pdmodel.PDPageContentStream pDPageContentStream17 = new org.apache.pdfbox.pdmodel.PDPageContentStream(pDDocument0, pDAppearanceStream11, (java.io.OutputStream) cOSStandardOutputStream16);
        try {
            pDPageContentStream17.drawLine((float) 100L, (float) 2, (float) 52L, (float) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test107");
        org.apache.pdfbox.multipdf.Overlay overlay0 = new org.apache.pdfbox.multipdf.Overlay();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument1 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.PDStream pDStream2 = new org.apache.pdfbox.pdmodel.common.PDStream(pDDocument1);
        overlay0.setLastPageOverlayPDF(pDDocument1);
        pDDocument1.save("Start");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test108");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        java.lang.String str2 = pDExportFormatAttributeObject1.getListNumbering();
        pDExportFormatAttributeObject1.setBaselineShift((float) 7L);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "None" + "'", str2.equals("None"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test109");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.SY;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test110");
        org.apache.pdfbox.contentstream.operator.text.MoveTextSetLeading moveTextSetLeading0 = new org.apache.pdfbox.contentstream.operator.text.MoveTextSetLeading();
        java.lang.String str1 = moveTextSetLeading0.getName();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "TD" + "'", str1.equals("TD"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test111");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode2 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern pDTilingPattern3 = new org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern(cOSDictionary1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = pDTilingPattern3.getBBox();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject6 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject6.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary9 = pDExportFormatAttributeObject6.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName11 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary9.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName11, (int) (short) 0);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache14 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources15 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary9, resourceCache14);
        java.lang.Iterable<org.apache.pdfbox.cos.COSName> iterable_cOSName16 = pDResources15.getPropertiesNames();
        org.apache.pdfbox.cos.COSName cOSName17 = org.apache.pdfbox.cos.COSName.EMPTY;
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree18 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary19 = pDPageTree18.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject20 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty21 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary19, pDUserAttributeObject20);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent22 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary19);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit23 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary19);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_24 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary19);
        pDResources15.put(cOSName17, (org.apache.pdfbox.pdmodel.graphics.shading.PDShading) pDShadingType1_24);
        org.apache.pdfbox.cos.COSName cOSName26 = org.apache.pdfbox.cos.COSName.URL;
        org.apache.pdfbox.pdmodel.graphics.color.PDSeparation pDSeparation27 = new org.apache.pdfbox.pdmodel.graphics.color.PDSeparation();
        pDResources15.put(cOSName26, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDSeparation27);
        pDTilingPattern3.setResources(pDResources15);
        pDTilingPattern3.setPatternType(10);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNull(pDRectangle4);
        org.junit.Assert.assertNotNull(cOSDictionary9);
        org.junit.Assert.assertNotNull(cOSName11);
        org.junit.Assert.assertNotNull(iterable_cOSName16);
        org.junit.Assert.assertNotNull(cOSName17);
        org.junit.Assert.assertNotNull(cOSDictionary19);
        org.junit.Assert.assertNotNull(cOSName26);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test112");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject.OWNER_PRINT_FIELD;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PrintField" + "'", str0.equals("PrintField"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test113");
        org.apache.pdfbox.cos.COSNull cOSNull0 = org.apache.pdfbox.cos.COSNull.NULL;
        org.apache.pdfbox.cos.ICOSVisitor iCOSVisitor1 = null;
        try {
            java.lang.Object obj2 = cOSNull0.accept(iCOSVisitor1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSNull0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test114");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions2 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary1);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.CROP_BOX;
        java.lang.String str5 = cOSDictionary1.getEmbeddedString("Overline", cOSName4);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch pDActionLaunch6 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch(cOSDictionary1);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree7 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary8 = pDPageTree7.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject9 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty10 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary8, pDUserAttributeObject9);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent11 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary8);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit12 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary8);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_13 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary8);
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation14 = new org.apache.pdfbox.pdmodel.PDDocumentInformation(cOSDictionary8);
        org.apache.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams pDWindowsLaunchParams15 = new org.apache.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams(cOSDictionary8);
        pDActionLaunch6.setWinLaunchParams(pDWindowsLaunchParams15);
        java.lang.String str17 = pDActionLaunch6.getO();
        java.lang.String str18 = pDActionLaunch6.getO();
        pDActionLaunch6.setP("MacExpertEncoding");
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cOSDictionary8);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test115");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary4.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName6, (int) (short) 0);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP pDSeedValueMDP9 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP(cOSDictionary4);
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.CID_TO_GID_MAP;
        org.apache.pdfbox.cos.COSName cOSName11 = org.apache.pdfbox.cos.COSName.JBIG2_GLOBALS;
        boolean b13 = cOSDictionary4.getBoolean(cOSName10, cOSName11, false);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertNotNull(cOSName11);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test116");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.PDDocumentCatalog pDDocumentCatalog4 = pDDocument0.getDocumentCatalog();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree5 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary6 = pDPageTree5.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject7 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty8 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary6, pDUserAttributeObject7);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent9 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary6);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit10 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary6);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary11 = fDFIconFit10.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences pDViewerPreferences12 = new org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences(cOSDictionary11);
        org.apache.pdfbox.pdmodel.PDDocumentNameDictionary pDDocumentNameDictionary13 = new org.apache.pdfbox.pdmodel.PDDocumentNameDictionary(pDDocumentCatalog4, cOSDictionary11);
        org.junit.Assert.assertNotNull(pDDocumentCatalog4);
        org.junit.Assert.assertNotNull(cOSDictionary6);
        org.junit.Assert.assertNotNull(cOSDictionary11);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test117");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ADBE_X509_RSA_SHA1;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test118");
        org.apache.pdfbox.pdmodel.encryption.SecurityHandlerFactory securityHandlerFactory0 = org.apache.pdfbox.pdmodel.encryption.SecurityHandlerFactory.INSTANCE;
        org.apache.pdfbox.pdmodel.encryption.PublicKeyProtectionPolicy publicKeyProtectionPolicy1 = new org.apache.pdfbox.pdmodel.encryption.PublicKeyProtectionPolicy();
        org.apache.pdfbox.pdmodel.encryption.PublicKeyRecipient publicKeyRecipient2 = new org.apache.pdfbox.pdmodel.encryption.PublicKeyRecipient();
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission3 = publicKeyRecipient2.getPermission();
        publicKeyProtectionPolicy1.addRecipient(publicKeyRecipient2);
        org.apache.pdfbox.pdmodel.encryption.PublicKeyRecipient publicKeyRecipient5 = new org.apache.pdfbox.pdmodel.encryption.PublicKeyRecipient();
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission6 = publicKeyRecipient5.getPermission();
        publicKeyProtectionPolicy1.addRecipient(publicKeyRecipient5);
        org.apache.pdfbox.pdmodel.encryption.SecurityHandler securityHandler8 = securityHandlerFactory0.newSecurityHandlerForPolicy((org.apache.pdfbox.pdmodel.encryption.ProtectionPolicy) publicKeyProtectionPolicy1);
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission9 = org.apache.pdfbox.pdmodel.encryption.AccessPermission.getOwnerAccessPermission();
        accessPermission9.setCanExtractContent(true);
        accessPermission9.setCanModify(false);
        securityHandler8.setCurrentAccessPermission(accessPermission9);
        securityHandler8.setAES(true);
        org.junit.Assert.assertNotNull(securityHandlerFactory0);
        org.junit.Assert.assertNull(accessPermission3);
        org.junit.Assert.assertNull(accessPermission6);
        org.junit.Assert.assertNotNull(securityHandler8);
        org.junit.Assert.assertNotNull(accessPermission9);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test119");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.SIZE;
        java.util.Calendar calendar8 = null;
        java.util.Calendar calendar9 = cOSDictionary1.getEmbeddedDate("BlockQuote", cOSName7, calendar8);
        org.apache.pdfbox.pdmodel.fdf.FDFField fDFField10 = new org.apache.pdfbox.pdmodel.fdf.FDFField(cOSDictionary1);
        fDFField10.setPartialFieldName("List");
        java.lang.String str13 = fDFField10.getRichText();
        fDFField10.setSetWidgetFieldFlags((int) (byte) 10);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNull(calendar9);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test120");
        org.apache.pdfbox.pdmodel.fdf.FDFField fDFField0 = new org.apache.pdfbox.pdmodel.fdf.FDFField();
        fDFField0.setSetFieldFlags((java.lang.Integer) 4);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test121");
        org.apache.pdfbox.multipdf.Overlay overlay0 = new org.apache.pdfbox.multipdf.Overlay();
        overlay0.setDefaultOverlayFile("Polygon");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test122");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.H5;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "H5" + "'", str0.equals("H5"));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test123");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata4 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument0);
        org.apache.pdfbox.cos.COSStream cOSStream5 = pDMetadata4.getCOSObject();
        java.io.OutputStream outputStream6 = cOSStream5.createFilteredStream();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream7 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream5);
        org.apache.pdfbox.pdmodel.common.PDStream pDStream8 = pDAppearanceStream7.getContentStream();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject10 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject10.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary13 = pDExportFormatAttributeObject10.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName15 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary13.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName15, (int) (short) 0);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache18 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources19 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary13, resourceCache18);
        org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject pDFormXObject20 = null;
        org.apache.pdfbox.cos.COSName cOSName21 = pDResources19.add(pDFormXObject20);
        java.lang.Iterable<org.apache.pdfbox.cos.COSName> iterable_cOSName22 = pDResources19.getColorSpaceNames();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree23 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary24 = pDPageTree23.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions25 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary24);
        org.apache.pdfbox.cos.COSName cOSName27 = org.apache.pdfbox.cos.COSName.CROP_BOX;
        java.lang.String str28 = cOSDictionary24.getEmbeddedString("Overline", cOSName27);
        boolean b29 = pDResources19.hasColorSpace(cOSName27);
        pDAppearanceStream7.setResources(pDResources19);
        org.apache.pdfbox.io.RandomAccessWrite randomAccessWrite31 = null;
        org.apache.pdfbox.io.RandomAccessOutputStream randomAccessOutputStream32 = new org.apache.pdfbox.io.RandomAccessOutputStream(randomAccessWrite31);
        randomAccessOutputStream32.flush();
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream34 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream((java.io.OutputStream) randomAccessOutputStream32);
        long long35 = cOSStandardOutputStream34.getPos();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream pDAppearanceContentStream36 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream(pDAppearanceStream7, (java.io.OutputStream) cOSStandardOutputStream34);
        org.apache.pdfbox.pdmodel.PDResources pDResources37 = pDAppearanceContentStream36.getResources();
        org.apache.pdfbox.cos.COSName cOSName38 = org.apache.pdfbox.cos.COSName.TIME_STAMP;
        try {
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace40 = pDResources37.getColorSpace(cOSName38, true);
            org.junit.Assert.fail("Expected exception of type org.apache.pdfbox.pdmodel.MissingResourceException");
        } catch (org.apache.pdfbox.pdmodel.MissingResourceException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream5);
        org.junit.Assert.assertNotNull(outputStream6);
        org.junit.Assert.assertNotNull(pDStream8);
        org.junit.Assert.assertNotNull(cOSDictionary13);
        org.junit.Assert.assertNotNull(cOSName15);
        org.junit.Assert.assertNotNull(cOSName21);
        org.junit.Assert.assertNotNull(iterable_cOSName22);
        org.junit.Assert.assertNotNull(cOSDictionary24);
        org.junit.Assert.assertNotNull(cOSName27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(long35 == 0L);
        org.junit.Assert.assertNotNull(pDResources37);
        org.junit.Assert.assertNotNull(cOSName38);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test124");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode pDStructureNode1 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement pDStructureElement2 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement("O=TD, Padding=10.0, LineHeight=Normal", pDStructureNode1);
        pDStructureElement2.setRevisionNumber(100);
        java.lang.String str5 = pDStructureElement2.getExpandedForm();
        java.util.List<java.lang.Object> list_obj6 = pDStructureElement2.getKids();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode pDStructureNode8 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement pDStructureElement9 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement("O=TD, Padding=10.0, LineHeight=Normal", pDStructureNode8);
        pDStructureElement9.setRevisionNumber(100);
        pDStructureElement9.incrementRevisionNumber();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode pDStructureNode14 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement pDStructureElement15 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement("O=TD, Padding=10.0, LineHeight=Normal", pDStructureNode14);
        pDStructureElement15.setRevisionNumber(100);
        org.apache.pdfbox.pdmodel.PDPage pDPage18 = pDStructureElement15.getPage();
        java.lang.String str19 = pDStructureElement15.getExpandedForm();
        pDStructureElement15.setLanguage("");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject23 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject23.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary26 = pDExportFormatAttributeObject23.getCOSObject();
        int i28 = cOSDictionary26.getInt("Expired");
        org.apache.pdfbox.cos.COSName cOSName29 = org.apache.pdfbox.cos.COSName.A;
        cOSDictionary26.setInt(cOSName29, 100);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo pDActionGoTo32 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo(cOSDictionary26);
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkedContentReference pDMarkedContentReference33 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkedContentReference(cOSDictionary26);
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageXYZDestination pDPageXYZDestination34 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageXYZDestination();
        int i35 = pDPageXYZDestination34.getPageNumber();
        int i36 = pDPageXYZDestination34.getLeft();
        pDStructureElement15.insertBefore(pDMarkedContentReference33, (java.lang.Object) i36);
        pDStructureElement9.removeKid(pDMarkedContentReference33);
        pDStructureElement2.insertBefore(pDMarkedContentReference33, (java.lang.Object) "-90");
        org.apache.pdfbox.pdmodel.PDPage pDPage41 = pDMarkedContentReference33.getPage();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_obj6);
        org.junit.Assert.assertNull(pDPage18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(cOSDictionary26);
        org.junit.Assert.assertTrue(i28 == (-1));
        org.junit.Assert.assertNotNull(cOSName29);
        org.junit.Assert.assertTrue(i35 == (-1));
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertNull(pDPage41);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test125");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.BTN;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test126");
        org.apache.pdfbox.pdmodel.PDPage pDPage0 = new org.apache.pdfbox.pdmodel.PDPage();
        java.util.List<org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDThreadBead> list_pDThreadBead1 = pDPage0.getThreadBeads();
        org.junit.Assert.assertNotNull(list_pDThreadBead1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test127");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CH;
        try {
            org.apache.pdfbox.pdmodel.common.function.PDFunction pDFunction1 = org.apache.pdfbox.pdmodel.common.function.PDFunction.create((org.apache.pdfbox.cos.COSBase) cOSName0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test128");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions2 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary1);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.CROP_BOX;
        java.lang.String str5 = cOSDictionary1.getEmbeddedString("Overline", cOSName4);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch pDActionLaunch6 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch(cOSDictionary1);
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor pDFontDescriptor7 = new org.apache.pdfbox.pdmodel.font.PDFontDescriptor(cOSDictionary1);
        org.apache.pdfbox.pdmodel.common.PDStream pDStream8 = pDFontDescriptor7.getCIDSet();
        boolean b9 = pDFontDescriptor7.isScript();
        pDFontDescriptor7.setFontStretch("");
        org.apache.pdfbox.pdmodel.common.PDStream pDStream12 = pDFontDescriptor7.getCIDSet();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(pDStream8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(pDStream12);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test129");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.printing.Scaling scaling1 = org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable5 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument0, scaling1, true, 1.0f, false);
        org.apache.pdfbox.printing.Scaling scaling6 = org.apache.pdfbox.printing.Scaling.STRETCH_TO_FIT;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable9 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument0, scaling6, false, (float) 1L);
        org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField[] pDSignatureField_array10 = new org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField[] {};
        java.util.ArrayList<org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField> arraylist_pDSignatureField11 = new java.util.ArrayList<org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField>) arraylist_pDSignatureField11, pDSignatureField_array10);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureInterface signatureInterface13 = null;
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions signatureOptions14 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions();
        pDDocument0.addSignatureField((java.util.List<org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField>) arraylist_pDSignatureField11, signatureInterface13, signatureOptions14);
        float f16 = pDDocument0.getVersion();
        org.junit.Assert.assertTrue("'" + scaling1 + "' != '" + org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT + "'", scaling1.equals(org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT));
        org.junit.Assert.assertTrue("'" + scaling6 + "' != '" + org.apache.pdfbox.printing.Scaling.STRETCH_TO_FIT + "'", scaling6.equals(org.apache.pdfbox.printing.Scaling.STRETCH_TO_FIT));
        org.junit.Assert.assertNotNull(pDSignatureField_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(f16 == 1.4f);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test130");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        org.apache.pdfbox.cos.COSDocument cOSDocument2 = pDDocument0.getDocument();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree3 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDPageTree3.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode5 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary4);
        cOSDictionary4.setString("BlockQuote", "hi!");
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey9 = cOSDocument2.getKey((org.apache.pdfbox.cos.COSBase) cOSDictionary4);
        boolean b10 = cOSDocument2.isXRefStream();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary11 = cOSDocument2.getEncryptionDictionary();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey12 = null;
        org.apache.pdfbox.cos.COSObject cOSObject13 = cOSDocument2.removeObject(cOSObjectKey12);
        org.apache.pdfbox.io.IOUtils.closeQuietly((java.io.Closeable) cOSDocument2);
        org.junit.Assert.assertNotNull(cOSDocument2);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNull(cOSObjectKey9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(cOSDictionary11);
        org.junit.Assert.assertNull(cOSObject13);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test131");
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting1 = org.apache.pdfbox.io.MemoryUsageSetting.setupMainMemoryOnly(52L);
        org.junit.Assert.assertNotNull(memoryUsageSetting1);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test132");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName3 = org.apache.pdfbox.cos.COSName.ST;
        java.util.Calendar calendar4 = cOSDictionary1.getEmbeddedDate("Link", cOSName3);
        org.apache.pdfbox.pdmodel.fdf.FDFPageInfo fDFPageInfo5 = new org.apache.pdfbox.pdmodel.fdf.FDFPageInfo(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName3);
        org.junit.Assert.assertNull(calendar4);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test133");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        org.apache.pdfbox.cos.COSDocument cOSDocument2 = pDDocument0.getDocument();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree3 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDPageTree3.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode5 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary4);
        cOSDictionary4.setString("BlockQuote", "hi!");
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey9 = cOSDocument2.getKey((org.apache.pdfbox.cos.COSBase) cOSDictionary4);
        boolean b10 = cOSDocument2.isXRefStream();
        org.apache.pdfbox.io.RandomAccessRead randomAccessRead11 = null;
        org.apache.pdfbox.pdmodel.PDDocument pDDocument12 = new org.apache.pdfbox.pdmodel.PDDocument(cOSDocument2, randomAccessRead11);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle13 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.pdmodel.PDPage pDPage14 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle13);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle15 = org.apache.pdfbox.pdmodel.common.PDRectangle.A4;
        pDPage14.setCropBox(pDRectangle15);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument17 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile18 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument17);
        pDDocument17.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata21 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument17);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument22 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile23 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument22);
        pDDocument22.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata26 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument22);
        org.apache.pdfbox.cos.COSStream cOSStream27 = pDMetadata26.getCOSObject();
        pDMetadata21.setMetadata(pDMetadata26);
        pDPage14.setContents((org.apache.pdfbox.pdmodel.common.PDStream) pDMetadata21);
        org.apache.pdfbox.pdmodel.PDPageContentStream pDPageContentStream30 = new org.apache.pdfbox.pdmodel.PDPageContentStream(pDDocument12, pDPage14);
        org.junit.Assert.assertNotNull(cOSDocument2);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNull(cOSObjectKey9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(pDRectangle13);
        org.junit.Assert.assertNotNull(pDRectangle15);
        org.junit.Assert.assertNotNull(cOSStream27);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test134");
        try {
            float f1 = org.apache.pdfbox.pdmodel.common.function.type4.InstructionSequenceBuilder.parseReal("C");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test135");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        float[] f_array7 = new float[] { (byte) 10, (byte) 1 };
        pDExportFormatAttributeObject1.setColumnGaps(f_array7);
        org.apache.pdfbox.pdmodel.graphics.color.PDTristimulus pDTristimulus9 = new org.apache.pdfbox.pdmodel.graphics.color.PDTristimulus(f_array7);
        float f10 = pDTristimulus9.getX();
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(f_array7);
        org.junit.Assert.assertTrue(f10 == 10.0f);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test136");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject.LIST_NUMBERING_SQUARE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Square" + "'", str0.equals("Square"));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test137");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue pDSeedValue0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue();
        pDSeedValue0.setSubFilterRequired(false);
        boolean b3 = pDSeedValue0.isAddRevInfoRequired();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject5 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject5.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary8 = pDExportFormatAttributeObject5.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary8.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName10, (int) (short) 0);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP pDSeedValueMDP13 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP(cOSDictionary8);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary14 = pDSeedValueMDP13.getCOSObject();
        pDSeedValue0.setMPD(pDSeedValueMDP13);
        boolean b16 = pDSeedValue0.isVRequired();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(cOSDictionary8);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertNotNull(cOSDictionary14);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test138");
        org.apache.pdfbox.util.SmallMap<org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStamp, org.apache.pdfbox.io.RandomAccessOutputStream> smallmap_fDFAnnotationStamp_randomAccessOutputStream0 = new org.apache.pdfbox.util.SmallMap<org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStamp, org.apache.pdfbox.io.RandomAccessOutputStream>();
        java.util.Set<java.util.Map.Entry<org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStamp, org.apache.pdfbox.io.RandomAccessOutputStream>> set_entry_fDFAnnotationStamp_randomAccessOutputStream1 = smallmap_fDFAnnotationStamp_randomAccessOutputStream0.entrySet();
        org.junit.Assert.assertNotNull(set_entry_fDFAnnotationStamp_randomAccessOutputStream1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test139");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle2 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray3 = pDRectangle2.getCOSArray();
        cOSArray3.clear();
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray3.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName6);
        org.apache.pdfbox.pdmodel.graphics.color.PDGamma pDGamma8 = new org.apache.pdfbox.pdmodel.graphics.color.PDGamma(cOSArray3);
        org.apache.pdfbox.pdmodel.fdf.FDFOptionElement fDFOptionElement9 = new org.apache.pdfbox.pdmodel.fdf.FDFOptionElement(cOSArray3);
        java.util.List<java.lang.String> list_str10 = org.apache.pdfbox.pdmodel.common.COSArrayList.convertCOSStringCOSArrayToList(cOSArray3);
        java.io.InputStream inputStream11 = pDEmbeddedFile1.createInputStream(list_str10);
        pDEmbeddedFile1.setCheckSum("0");
        org.junit.Assert.assertNotNull(pDRectangle2);
        org.junit.Assert.assertNotNull(cOSArray3);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(list_str10);
        org.junit.Assert.assertNotNull(inputStream11);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test140");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine.LE_CLOSED_ARROW;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ClosedArrow" + "'", str0.equals("ClosedArrow"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test141");
        org.apache.pdfbox.pdfwriter.COSWriter cOSWriter0 = null;
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.SigningSupport signingSupport1 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.SigningSupport(cOSWriter0);
        signingSupport1.close();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test142");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.PDDocumentCatalog pDDocumentCatalog4 = pDDocument0.getDocumentCatalog();
        java.lang.String str5 = pDDocumentCatalog4.getLanguage();
        java.lang.String str6 = pDDocumentCatalog4.getVersion();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject8 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject8.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary11 = pDExportFormatAttributeObject8.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName13 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary11.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName13, (int) (short) 0);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP pDSeedValueMDP16 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP(cOSDictionary11);
        org.apache.pdfbox.cos.COSName cOSName17 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        long long18 = cOSDictionary11.getLong(cOSName17);
        org.apache.pdfbox.cos.COSName cOSName19 = org.apache.pdfbox.cos.COSName.PAGE_MODE;
        java.lang.String str20 = cOSName19.toString();
        org.apache.pdfbox.cos.COSBase cOSBase21 = org.apache.pdfbox.pdmodel.PDPageTree.getInheritableAttribute(cOSDictionary11, cOSName19);
        org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties pDOptionalContentProperties22 = new org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties(cOSDictionary11);
        org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties.BaseState baseState23 = org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties.BaseState.ON;
        pDOptionalContentProperties22.setBaseState(baseState23);
        pDDocumentCatalog4.setOCProperties(pDOptionalContentProperties22);
        org.apache.pdfbox.pdmodel.PageLayout pageLayout26 = org.apache.pdfbox.pdmodel.PageLayout.TWO_PAGE_RIGHT;
        pDDocumentCatalog4.setPageLayout(pageLayout26);
        org.junit.Assert.assertNotNull(pDDocumentCatalog4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.4" + "'", str6.equals("1.4"));
        org.junit.Assert.assertNotNull(cOSDictionary11);
        org.junit.Assert.assertNotNull(cOSName13);
        org.junit.Assert.assertNotNull(cOSName17);
        org.junit.Assert.assertTrue(long18 == (-1L));
        org.junit.Assert.assertNotNull(cOSName19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "COSName{PageMode}" + "'", str20.equals("COSName{PageMode}"));
        org.junit.Assert.assertNull(cOSBase21);
        org.junit.Assert.assertTrue("'" + baseState23 + "' != '" + org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties.BaseState.ON + "'", baseState23.equals(org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties.BaseState.ON));
        org.junit.Assert.assertTrue("'" + pageLayout26 + "' != '" + org.apache.pdfbox.pdmodel.PageLayout.TWO_PAGE_RIGHT + "'", pageLayout26.equals(org.apache.pdfbox.pdmodel.PageLayout.TWO_PAGE_RIGHT));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test143");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        int i6 = cOSDictionary4.getInt("Expired");
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.A;
        cOSDictionary4.setInt(cOSName7, 100);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo pDActionGoTo10 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo(cOSDictionary4);
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkedContentReference pDMarkedContentReference11 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkedContentReference(cOSDictionary4);
        org.apache.pdfbox.pdmodel.graphics.state.PDSoftMask pDSoftMask12 = new org.apache.pdfbox.pdmodel.graphics.state.PDSoftMask(cOSDictionary4);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDExternalDataDictionary pDExternalDataDictionary13 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDExternalDataDictionary(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNotNull(cOSName7);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test144");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        int i6 = cOSDictionary4.getInt("Expired");
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.A;
        cOSDictionary4.setInt(cOSName7, 100);
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.OUTPUT_INTENT;
        org.apache.pdfbox.cos.COSBase cOSBase11 = cOSDictionary4.getItem(cOSName10);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceCharacteristicsDictionary pDAppearanceCharacteristicsDictionary12 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceCharacteristicsDictionary(cOSDictionary4);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_13 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertNull(cOSBase11);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test145");
        org.apache.pdfbox.filter.JPXFilter jPXFilter0 = new org.apache.pdfbox.filter.JPXFilter();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test146");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary6 = fDFIconFit5.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences pDViewerPreferences7 = new org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences(cOSDictionary6);
        java.lang.String str8 = pDViewerPreferences7.getNonFullScreenPageMode();
        pDViewerPreferences7.setPrintArea("SubmitForm");
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.DUPLEX dUPLEX11 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.DUPLEX.DuplexFlipLongEdge;
        pDViewerPreferences7.setDuplex(dUPLEX11);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "UseNone" + "'", str8.equals("UseNone"));
        org.junit.Assert.assertTrue("'" + dUPLEX11 + "' != '" + org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.DUPLEX.DuplexFlipLongEdge + "'", dUPLEX11.equals(org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.DUPLEX.DuplexFlipLongEdge));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test147");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DECODE_PARMS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test148");
        org.apache.pdfbox.pdmodel.interactive.action.PDAnnotationAdditionalActions pDAnnotationAdditionalActions0 = new org.apache.pdfbox.pdmodel.interactive.action.PDAnnotationAdditionalActions();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree1 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDPageTree1.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject3 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty4 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary2, pDUserAttributeObject3);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent5 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData pDActionImportData6 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData(cOSDictionary2);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument7 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile8 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument7);
        org.apache.pdfbox.cos.COSString cOSString9 = null;
        org.apache.pdfbox.pdmodel.common.filespecification.PDSimpleFileSpecification pDSimpleFileSpecification10 = new org.apache.pdfbox.pdmodel.common.filespecification.PDSimpleFileSpecification(cOSString9);
        pDEmbeddedFile8.setFile((org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification) pDSimpleFileSpecification10);
        pDActionImportData6.setFile((org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification) pDSimpleFileSpecification10);
        pDAnnotationAdditionalActions0.setPI((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionImportData6);
        org.junit.Assert.assertNotNull(cOSDictionary2);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test149");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.NON_STRUCT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "NonStruct" + "'", str0.equals("NonStruct"));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test150");
        org.apache.pdfbox.cos.COSName cOSName1 = org.apache.pdfbox.cos.COSName.getPDFName("R");
        org.junit.Assert.assertNotNull(cOSName1);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test151");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDRadioButton pDRadioButton1 = new org.apache.pdfbox.pdmodel.interactive.form.PDRadioButton(pDAcroForm0);
        try {
            java.lang.String str2 = pDRadioButton1.getDefaultValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test152");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        org.apache.pdfbox.cos.COSDocument cOSDocument2 = pDDocument0.getDocument();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject4.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = pDExportFormatAttributeObject4.getCOSObject();
        int i9 = cOSDictionary7.getInt("Expired");
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.A;
        cOSDictionary7.setInt(cOSName10, 100);
        org.apache.pdfbox.cos.COSName cOSName13 = org.apache.pdfbox.cos.COSName.OUTPUT_INTENT;
        org.apache.pdfbox.cos.COSBase cOSBase14 = cOSDictionary7.getItem(cOSName13);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm15 = new org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm(pDDocument0, cOSDictionary7);
        org.apache.pdfbox.cos.COSName cOSName16 = org.apache.pdfbox.cos.COSName.ROOT;
        org.apache.pdfbox.pdmodel.interactive.form.PDXFAResource pDXFAResource17 = new org.apache.pdfbox.pdmodel.interactive.form.PDXFAResource((org.apache.pdfbox.cos.COSBase) cOSName16);
        pDAcroForm15.setXFA(pDXFAResource17);
        boolean b19 = pDAcroForm15.isCachingFields();
        org.junit.Assert.assertNotNull(cOSDocument2);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertNotNull(cOSName13);
        org.junit.Assert.assertNull(cOSBase14);
        org.junit.Assert.assertNotNull(cOSName16);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test153");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary4.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName6, (int) (short) 0);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP pDSeedValueMDP9 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP(cOSDictionary4);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationText fDFAnnotationText10 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationText(cOSDictionary4);
        fDFAnnotationText10.setStateModel("Hide");
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSName6);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test154");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition2 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle pDAnnotationSquareCircle3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle(cOSDictionary1);
        java.lang.String str4 = pDAnnotationSquareCircle3.getSubtype();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test155");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions2 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary1);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.CROP_BOX;
        java.lang.String str5 = cOSDictionary1.getEmbeddedString("Overline", cOSName4);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch pDActionLaunch6 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch(cOSDictionary1);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree7 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary8 = pDPageTree7.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject9 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty10 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary8, pDUserAttributeObject9);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent11 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary8);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit12 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary8);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_13 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary8);
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation14 = new org.apache.pdfbox.pdmodel.PDDocumentInformation(cOSDictionary8);
        org.apache.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams pDWindowsLaunchParams15 = new org.apache.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams(cOSDictionary8);
        pDActionLaunch6.setWinLaunchParams(pDWindowsLaunchParams15);
        org.apache.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams pDWindowsLaunchParams17 = pDActionLaunch6.getWinLaunchParams();
        pDActionLaunch6.setO("Metadata");
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cOSDictionary8);
        org.junit.Assert.assertNotNull(pDWindowsLaunchParams17);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test156");
        org.apache.pdfbox.pdmodel.font.encoding.SymbolEncoding symbolEncoding0 = new org.apache.pdfbox.pdmodel.font.encoding.SymbolEncoding();
        java.lang.String str1 = symbolEncoding0.getEncodingName();
        org.apache.pdfbox.cos.COSBase cOSBase2 = symbolEncoding0.getCOSObject();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "SymbolEncoding" + "'", str1.equals("SymbolEncoding"));
        org.junit.Assert.assertNotNull(cOSBase2);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test157");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        java.lang.String str1 = pDAnnotationLine0.getSubject();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree2 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage4 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle3);
        int i5 = pDPageTree2.indexOf(pDPage4);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree6 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = pDPageTree6.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition8 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary7);
        org.apache.pdfbox.cos.COSBase cOSBase9 = pDTransition8.getDirection();
        pDPage4.setTransition(pDTransition8, (float) 1);
        pDAnnotationLine0.setPage(pDPage4);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine13 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        org.apache.pdfbox.pdmodel.interactive.annotation.handlers.PDLinkAppearanceHandler pDLinkAppearanceHandler14 = new org.apache.pdfbox.pdmodel.interactive.annotation.handlers.PDLinkAppearanceHandler((org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) pDAnnotationLine13);
        pDAnnotationLine0.setInReplyTo((org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) pDAnnotationLine13);
        float f16 = pDAnnotationLine0.getCaptionVerticalOffset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertNotNull(cOSBase9);
        org.junit.Assert.assertTrue(f16 == 0.0f);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test158");
        org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroupAttributes pDTransparencyGroupAttributes0 = new org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroupAttributes();
        boolean b1 = pDTransparencyGroupAttributes0.isIsolated();
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test159");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        boolean b1 = fDFAnnotationFreeText0.isNoView();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle2 = org.apache.pdfbox.pdmodel.common.PDRectangle.A0;
        fDFAnnotationFreeText0.setRectangle(pDRectangle2);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = fDFAnnotationFreeText0.getRectangle();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary5 = null;
        fDFAnnotationFreeText0.setBorderStyle(pDBorderStyleDictionary5);
        fDFAnnotationFreeText0.setJustification("Confidential");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary9 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary();
        fDFAnnotationFreeText0.setBorderStyle(pDBorderStyleDictionary9);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(pDRectangle2);
        org.junit.Assert.assertNotNull(pDRectangle4);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test160");
        org.apache.pdfbox.pdmodel.common.function.type4.Operators operators0 = null;
        org.apache.pdfbox.pdmodel.common.function.type4.ExecutionContext executionContext1 = new org.apache.pdfbox.pdmodel.common.function.type4.ExecutionContext(operators0);
        org.apache.pdfbox.pdmodel.common.function.type4.Operators operators2 = executionContext1.getOperators();
        try {
            float f3 = executionContext1.popReal();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertNull(operators2);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test161");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject7 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject7.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary10 = pDExportFormatAttributeObject7.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName12 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary10.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName12, (int) (short) 0);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP pDSeedValueMDP15 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP(cOSDictionary10);
        org.apache.pdfbox.cos.COSName cOSName16 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        long long17 = cOSDictionary10.getLong(cOSName16);
        org.apache.pdfbox.cos.COSName cOSName18 = org.apache.pdfbox.cos.COSName.PAGE_MODE;
        java.lang.String str19 = cOSName18.toString();
        org.apache.pdfbox.cos.COSBase cOSBase20 = org.apache.pdfbox.pdmodel.PDPageTree.getInheritableAttribute(cOSDictionary10, cOSName18);
        org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties pDOptionalContentProperties21 = new org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties(cOSDictionary10);
        org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties.BaseState baseState22 = org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties.BaseState.ON;
        pDOptionalContentProperties21.setBaseState(baseState22);
        org.apache.pdfbox.cos.COSName cOSName24 = cOSDictionary1.getKeyForValue((java.lang.Object) baseState22);
        try {
            org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentGroup pDOptionalContentGroup25 = new org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentGroup(cOSDictionary1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary10);
        org.junit.Assert.assertNotNull(cOSName12);
        org.junit.Assert.assertNotNull(cOSName16);
        org.junit.Assert.assertTrue(long17 == (-1L));
        org.junit.Assert.assertNotNull(cOSName18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "COSName{PageMode}" + "'", str19.equals("COSName{PageMode}"));
        org.junit.Assert.assertNull(cOSBase20);
        org.junit.Assert.assertTrue("'" + baseState22 + "' != '" + org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties.BaseState.ON + "'", baseState22.equals(org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties.BaseState.ON));
        org.junit.Assert.assertNull(cOSName24);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test162");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.SIZE;
        java.util.Calendar calendar8 = null;
        java.util.Calendar calendar9 = cOSDictionary1.getEmbeddedDate("BlockQuote", cOSName7, calendar8);
        org.apache.pdfbox.pdmodel.fdf.FDFField fDFField10 = new org.apache.pdfbox.pdmodel.fdf.FDFField(cOSDictionary1);
        fDFField10.setPartialFieldName("List");
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions13 = fDFField10.getAdditionalActions();
        fDFField10.setSetFieldFlags((java.lang.Integer) 6);
        fDFField10.setSetWidgetFieldFlags((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNull(calendar9);
        org.junit.Assert.assertNull(pDAdditionalActions13);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test163");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        org.apache.pdfbox.cos.COSDocument cOSDocument2 = pDDocument0.getDocument();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree3 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDPageTree3.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode5 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary4);
        cOSDictionary4.setString("BlockQuote", "hi!");
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey9 = cOSDocument2.getKey((org.apache.pdfbox.cos.COSBase) cOSDictionary4);
        boolean b10 = cOSDocument2.isXRefStream();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary11 = cOSDocument2.getEncryptionDictionary();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey12 = null;
        org.apache.pdfbox.cos.COSObject cOSObject13 = cOSDocument2.removeObject(cOSObjectKey12);
        cOSDocument2.setVersion((float) (-4));
        org.apache.pdfbox.pdmodel.common.PDStream pDStream16 = new org.apache.pdfbox.pdmodel.common.PDStream(cOSDocument2);
        org.junit.Assert.assertNotNull(cOSDocument2);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNull(cOSObjectKey9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(cOSDictionary11);
        org.junit.Assert.assertNull(cOSObject13);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test164");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        org.apache.pdfbox.cos.COSDocument cOSDocument2 = pDDocument0.getDocument();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject4.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = pDExportFormatAttributeObject4.getCOSObject();
        int i9 = cOSDictionary7.getInt("Expired");
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.A;
        cOSDictionary7.setInt(cOSName10, 100);
        org.apache.pdfbox.cos.COSName cOSName13 = org.apache.pdfbox.cos.COSName.OUTPUT_INTENT;
        org.apache.pdfbox.cos.COSBase cOSBase14 = cOSDictionary7.getItem(cOSName13);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm15 = new org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm(pDDocument0, cOSDictionary7);
        org.apache.pdfbox.cos.COSName cOSName16 = org.apache.pdfbox.cos.COSName.ROOT;
        org.apache.pdfbox.pdmodel.interactive.form.PDXFAResource pDXFAResource17 = new org.apache.pdfbox.pdmodel.interactive.form.PDXFAResource((org.apache.pdfbox.cos.COSBase) cOSName16);
        pDAcroForm15.setXFA(pDXFAResource17);
        pDAcroForm15.flatten();
        org.apache.pdfbox.pdmodel.PDResources pDResources20 = pDAcroForm15.getDefaultResources();
        org.apache.pdfbox.pdmodel.PDResources pDResources21 = pDAcroForm15.getDefaultResources();
        org.junit.Assert.assertNotNull(cOSDocument2);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertNotNull(cOSName13);
        org.junit.Assert.assertNull(cOSBase14);
        org.junit.Assert.assertNotNull(cOSName16);
        org.junit.Assert.assertNull(pDResources20);
        org.junit.Assert.assertNull(pDResources21);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test165");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget pDAnnotationWidget0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget();
        java.lang.String str1 = pDAnnotationWidget0.getHighlightingMode();
        org.apache.pdfbox.pdmodel.interactive.action.PDAnnotationAdditionalActions pDAnnotationAdditionalActions2 = new org.apache.pdfbox.pdmodel.interactive.action.PDAnnotationAdditionalActions();
        pDAnnotationWidget0.setActions(pDAnnotationAdditionalActions2);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDAnnotationAdditionalActions2.getCOSObject();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "I" + "'", str1.equals("I"));
        org.junit.Assert.assertNotNull(cOSDictionary4);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test166");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue pDSeedValue2 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue();
        pDSeedValue2.setSubFilterRequired(false);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm5 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDComboBox pDComboBox6 = new org.apache.pdfbox.pdmodel.interactive.form.PDComboBox(pDAcroForm5);
        pDComboBox6.setEdit(true);
        java.util.List<java.lang.String> list_str9 = pDComboBox6.getOptions();
        pDSeedValue2.setReasonsd(list_str9);
        java.io.InputStream inputStream11 = pDEmbeddedFile1.createInputStream(list_str9);
        org.apache.pdfbox.pdmodel.common.COSArrayList<org.apache.pdfbox.printing.PDFPageable> cosarraylist_pDFPageable12 = new org.apache.pdfbox.pdmodel.common.COSArrayList<org.apache.pdfbox.printing.PDFPageable>();
        org.apache.pdfbox.cos.COSArray cOSArray13 = cosarraylist_pDFPageable12.toList();
        pDEmbeddedFile1.setFileDecodeParams((java.util.List<org.apache.pdfbox.printing.PDFPageable>) cosarraylist_pDFPageable12);
        java.util.Calendar calendar15 = pDEmbeddedFile1.getModDate();
        org.junit.Assert.assertNotNull(list_str9);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(cOSArray13);
        org.junit.Assert.assertNull(calendar15);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test167");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode pDStructureNode1 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement pDStructureElement2 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement("O=TD, Padding=10.0, LineHeight=Normal", pDStructureNode1);
        pDStructureElement2.setRevisionNumber(100);
        java.lang.String str5 = pDStructureElement2.getExpandedForm();
        java.util.List<java.lang.Object> list_obj6 = pDStructureElement2.getKids();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode pDStructureNode8 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement pDStructureElement9 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement("O=TD, Padding=10.0, LineHeight=Normal", pDStructureNode8);
        pDStructureElement9.setRevisionNumber(100);
        pDStructureElement9.incrementRevisionNumber();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode pDStructureNode14 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement pDStructureElement15 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement("O=TD, Padding=10.0, LineHeight=Normal", pDStructureNode14);
        pDStructureElement15.setRevisionNumber(100);
        org.apache.pdfbox.pdmodel.PDPage pDPage18 = pDStructureElement15.getPage();
        java.lang.String str19 = pDStructureElement15.getExpandedForm();
        pDStructureElement15.setLanguage("");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject23 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject23.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary26 = pDExportFormatAttributeObject23.getCOSObject();
        int i28 = cOSDictionary26.getInt("Expired");
        org.apache.pdfbox.cos.COSName cOSName29 = org.apache.pdfbox.cos.COSName.A;
        cOSDictionary26.setInt(cOSName29, 100);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo pDActionGoTo32 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo(cOSDictionary26);
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkedContentReference pDMarkedContentReference33 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkedContentReference(cOSDictionary26);
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageXYZDestination pDPageXYZDestination34 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageXYZDestination();
        int i35 = pDPageXYZDestination34.getPageNumber();
        int i36 = pDPageXYZDestination34.getLeft();
        pDStructureElement15.insertBefore(pDMarkedContentReference33, (java.lang.Object) i36);
        pDStructureElement9.removeKid(pDMarkedContentReference33);
        pDStructureElement2.insertBefore(pDMarkedContentReference33, (java.lang.Object) "-90");
        pDStructureElement2.removeClassName("Insert");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_obj6);
        org.junit.Assert.assertNull(pDPage18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(cOSDictionary26);
        org.junit.Assert.assertTrue(i28 == (-1));
        org.junit.Assert.assertNotNull(cOSName29);
        org.junit.Assert.assertTrue(i35 == (-1));
        org.junit.Assert.assertTrue(i36 == (-1));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test168");
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission0 = org.apache.pdfbox.pdmodel.encryption.AccessPermission.getOwnerAccessPermission();
        boolean b1 = accessPermission0.isOwnerPermission();
        accessPermission0.setCanPrint(true);
        org.junit.Assert.assertNotNull(accessPermission0);
        org.junit.Assert.assertTrue(b1 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test169");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_6 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary1);
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation7 = new org.apache.pdfbox.pdmodel.PDDocumentInformation(cOSDictionary1);
        cOSDictionary1.setInt("COSName{PageMode}", (int) (byte) 0);
        org.apache.pdfbox.cos.COSName cOSName11 = org.apache.pdfbox.cos.COSName.A;
        long long13 = cOSDictionary1.getLong(cOSName11, (long) '4');
        org.apache.pdfbox.cos.COSName cOSName14 = org.apache.pdfbox.cos.COSName.ROOT;
        org.apache.pdfbox.pdmodel.interactive.form.PDXFAResource pDXFAResource15 = new org.apache.pdfbox.pdmodel.interactive.form.PDXFAResource((org.apache.pdfbox.cos.COSBase) cOSName14);
        java.lang.String str17 = cOSDictionary1.getNameAsString(cOSName14, "");
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName11);
        org.junit.Assert.assertTrue(long13 == 52L);
        org.junit.Assert.assertNotNull(cOSName14);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test170");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument4 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile5 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument4);
        pDDocument4.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata8 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument4);
        org.apache.pdfbox.cos.COSStream cOSStream9 = pDMetadata8.getCOSObject();
        java.io.OutputStream outputStream10 = cOSStream9.createFilteredStream();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream11 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream9);
        org.apache.pdfbox.pdmodel.common.PDStream pDStream12 = pDAppearanceStream11.getContentStream();
        org.apache.pdfbox.io.RandomAccessWrite randomAccessWrite13 = null;
        org.apache.pdfbox.io.RandomAccessOutputStream randomAccessOutputStream14 = new org.apache.pdfbox.io.RandomAccessOutputStream(randomAccessWrite13);
        randomAccessOutputStream14.flush();
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream16 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream((java.io.OutputStream) randomAccessOutputStream14);
        org.apache.pdfbox.pdmodel.PDPageContentStream pDPageContentStream17 = new org.apache.pdfbox.pdmodel.PDPageContentStream(pDDocument0, pDAppearanceStream11, (java.io.OutputStream) cOSStandardOutputStream16);
        pDPageContentStream17.close();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject20 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject20.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary23 = pDExportFormatAttributeObject20.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName25 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary23.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName25, (int) (short) 0);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache28 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources29 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary23, resourceCache28);
        java.lang.Iterable<org.apache.pdfbox.cos.COSName> iterable_cOSName30 = pDResources29.getPropertiesNames();
        org.apache.pdfbox.cos.COSName cOSName31 = org.apache.pdfbox.cos.COSName.EMPTY;
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree32 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary33 = pDPageTree32.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject34 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty35 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary33, pDUserAttributeObject34);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent36 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary33);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit37 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary33);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_38 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary33);
        pDResources29.put(cOSName31, (org.apache.pdfbox.pdmodel.graphics.shading.PDShading) pDShadingType1_38);
        org.apache.pdfbox.cos.COSName cOSName40 = org.apache.pdfbox.cos.COSName.URL;
        org.apache.pdfbox.pdmodel.graphics.color.PDSeparation pDSeparation41 = new org.apache.pdfbox.pdmodel.graphics.color.PDSeparation();
        pDResources29.put(cOSName40, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDSeparation41);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary43 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument44 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile45 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument44);
        pDDocument44.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata48 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument44);
        org.apache.pdfbox.cos.COSStream cOSStream49 = pDMetadata48.getCOSObject();
        java.io.OutputStream outputStream50 = cOSStream49.createFilteredStream();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream51 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream49);
        pDAppearanceDictionary43.setNormalAppearance(pDAppearanceStream51);
        org.apache.pdfbox.cos.COSName cOSName54 = pDResources29.add((org.apache.pdfbox.pdmodel.graphics.PDXObject) pDAppearanceStream51, "HTML-4.01");
        org.apache.pdfbox.cos.COSName cOSName55 = org.apache.pdfbox.cos.COSName.PUB_SEC;
        org.apache.pdfbox.pdmodel.graphics.shading.PDShading pDShading56 = pDResources29.getShading(cOSName55);
        try {
            pDPageContentStream17.appendCOSName(cOSName55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
        org.junit.Assert.assertNotNull(cOSDictionary23);
        org.junit.Assert.assertNotNull(cOSName25);
        org.junit.Assert.assertNotNull(iterable_cOSName30);
        org.junit.Assert.assertNotNull(cOSName31);
        org.junit.Assert.assertNotNull(cOSDictionary33);
        org.junit.Assert.assertNotNull(cOSName40);
        org.junit.Assert.assertNotNull(cOSStream49);
        org.junit.Assert.assertNotNull(outputStream50);
        org.junit.Assert.assertNotNull(cOSName54);
        org.junit.Assert.assertNotNull(cOSName55);
        org.junit.Assert.assertNull(pDShading56);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test171");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        org.apache.pdfbox.cos.COSDocument cOSDocument2 = pDDocument0.getDocument();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject4.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = pDExportFormatAttributeObject4.getCOSObject();
        int i9 = cOSDictionary7.getInt("Expired");
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.A;
        cOSDictionary7.setInt(cOSName10, 100);
        org.apache.pdfbox.cos.COSName cOSName13 = org.apache.pdfbox.cos.COSName.OUTPUT_INTENT;
        org.apache.pdfbox.cos.COSBase cOSBase14 = cOSDictionary7.getItem(cOSName13);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm15 = new org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm(pDDocument0, cOSDictionary7);
        org.apache.pdfbox.cos.COSName cOSName16 = org.apache.pdfbox.cos.COSName.ROOT;
        org.apache.pdfbox.pdmodel.interactive.form.PDXFAResource pDXFAResource17 = new org.apache.pdfbox.pdmodel.interactive.form.PDXFAResource((org.apache.pdfbox.cos.COSBase) cOSName16);
        pDAcroForm15.setXFA(pDXFAResource17);
        pDAcroForm15.setAppendOnly(true);
        org.junit.Assert.assertNotNull(cOSDocument2);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertNotNull(cOSName13);
        org.junit.Assert.assertNull(cOSBase14);
        org.junit.Assert.assertNotNull(cOSName16);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test172");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.H3;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "H3" + "'", str0.equals("H3"));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test173");
        int i0 = org.apache.pdfbox.pdmodel.graphics.pattern.PDAbstractPattern.TYPE_SHADING_PATTERN;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test174");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        boolean b5 = pDArtifactMarkedContent4.isTopAttached();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test175");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ART_BOX;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test176");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.V;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test177");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuildDataDict pDPropBuildDataDict0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuildDataDict();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPropBuildDataDict0.getCOSObject();
        org.junit.Assert.assertNotNull(cOSDictionary1);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test178");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.SCREEN;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test179");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions2 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary1);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.CROP_BOX;
        java.lang.String str5 = cOSDictionary1.getEmbeddedString("Overline", cOSName4);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch pDActionLaunch6 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch(cOSDictionary1);
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor pDFontDescriptor7 = new org.apache.pdfbox.pdmodel.font.PDFontDescriptor(cOSDictionary1);
        org.apache.pdfbox.pdmodel.common.PDStream pDStream8 = pDFontDescriptor7.getCIDSet();
        pDFontDescriptor7.setAllCap(false);
        pDFontDescriptor7.setFixedPitch(true);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(pDStream8);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test180");
        org.apache.pdfbox.text.PDFTextStripper pDFTextStripper0 = new org.apache.pdfbox.text.PDFTextStripper();
        java.lang.String str1 = pDFTextStripper0.getWordSeparator();
        org.apache.pdfbox.contentstream.operator.markedcontent.DrawObject drawObject2 = new org.apache.pdfbox.contentstream.operator.markedcontent.DrawObject();
        pDFTextStripper0.addOperator((org.apache.pdfbox.contentstream.operator.OperatorProcessor) drawObject2);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + " " + "'", str1.equals(" "));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test181");
        org.apache.pdfbox.pdmodel.font.encoding.StandardEncoding standardEncoding0 = new org.apache.pdfbox.pdmodel.font.encoding.StandardEncoding();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test182");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.AP;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test184");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata4 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument0);
        org.apache.pdfbox.cos.COSStream cOSStream5 = pDMetadata4.getCOSObject();
        java.lang.String str6 = cOSStream5.toTextString();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry pDAppearanceEntry7 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry((org.apache.pdfbox.cos.COSBase) cOSStream5);
        boolean b8 = pDAppearanceEntry7.isSubDictionary();
        try {
            java.util.Map<org.apache.pdfbox.cos.COSName, org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream> map_cOSName_pDAppearanceStream9 = pDAppearanceEntry7.getSubDictionary();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test185");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions2 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary1);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.CROP_BOX;
        java.lang.String str5 = cOSDictionary1.getEmbeddedString("Overline", cOSName4);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch pDActionLaunch6 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch(cOSDictionary1);
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor pDFontDescriptor7 = new org.apache.pdfbox.pdmodel.font.PDFontDescriptor(cOSDictionary1);
        org.apache.pdfbox.cos.COSName cOSName8 = org.apache.pdfbox.cos.COSName.DEFAULT_GRAY;
        cOSDictionary1.setLong(cOSName8, (long) (short) 0);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cOSName8);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test186");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        int i6 = cOSDictionary4.getInt("Expired");
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.A;
        cOSDictionary4.setInt(cOSName7, 100);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo pDActionGoTo10 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo(cOSDictionary4);
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkedContentReference pDMarkedContentReference11 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkedContentReference(cOSDictionary4);
        org.apache.pdfbox.pdmodel.graphics.state.PDSoftMask pDSoftMask12 = new org.apache.pdfbox.pdmodel.graphics.state.PDSoftMask(cOSDictionary4);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary13 = pDSoftMask12.getCOSObject();
        org.apache.pdfbox.cos.COSArray cOSArray14 = pDSoftMask12.getBackdropColor();
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(cOSDictionary13);
        org.junit.Assert.assertNull(cOSArray14);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test187");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionURI pDActionURI0 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionURI();
        java.lang.String str1 = pDActionURI0.getURI();
        boolean b2 = pDActionURI0.shouldTrackMousePosition();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test188");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray1 = pDRectangle0.getCOSArray();
        cOSArray1.clear();
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitHeightDestination pDPageFitHeightDestination3 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitHeightDestination(cOSArray1);
        org.apache.pdfbox.pdmodel.common.PDRange pDRange5 = new org.apache.pdfbox.pdmodel.common.PDRange(cOSArray1, (int) ' ');
        org.junit.Assert.assertNotNull(pDRectangle0);
        org.junit.Assert.assertNotNull(cOSArray1);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test189");
        org.apache.pdfbox.pdmodel.graphics.color.PDCalRGB pDCalRGB0 = new org.apache.pdfbox.pdmodel.graphics.color.PDCalRGB();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle1 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray2 = pDRectangle1.getCOSArray();
        cOSArray2.clear();
        org.apache.pdfbox.cos.COSName cOSName5 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray2.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName5);
        org.apache.pdfbox.pdmodel.graphics.color.PDGamma pDGamma7 = new org.apache.pdfbox.pdmodel.graphics.color.PDGamma(cOSArray2);
        pDCalRGB0.setGamma(pDGamma7);
        float[] f_array9 = pDCalRGB0.getMatrix();
        java.awt.image.WritableRaster writableRaster10 = null;
        try {
            java.awt.image.BufferedImage bufferedImage11 = pDCalRGB0.toRGBImage(writableRaster10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle1);
        org.junit.Assert.assertNotNull(cOSArray2);
        org.junit.Assert.assertNotNull(cOSName5);
        org.junit.Assert.assertNotNull(f_array9);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test190");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue pDSeedValue2 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue();
        pDSeedValue2.setSubFilterRequired(false);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm5 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDComboBox pDComboBox6 = new org.apache.pdfbox.pdmodel.interactive.form.PDComboBox(pDAcroForm5);
        pDComboBox6.setEdit(true);
        java.util.List<java.lang.String> list_str9 = pDComboBox6.getOptions();
        pDSeedValue2.setReasonsd(list_str9);
        java.io.InputStream inputStream11 = pDEmbeddedFile1.createInputStream(list_str9);
        org.apache.pdfbox.pdmodel.common.COSArrayList<org.apache.pdfbox.printing.PDFPageable> cosarraylist_pDFPageable12 = new org.apache.pdfbox.pdmodel.common.COSArrayList<org.apache.pdfbox.printing.PDFPageable>();
        org.apache.pdfbox.cos.COSArray cOSArray13 = cosarraylist_pDFPageable12.toList();
        pDEmbeddedFile1.setFileDecodeParams((java.util.List<org.apache.pdfbox.printing.PDFPageable>) cosarraylist_pDFPageable12);
        org.apache.pdfbox.cos.COSArray cOSArray15 = cosarraylist_pDFPageable12.toList();
        org.junit.Assert.assertNotNull(list_str9);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(cOSArray13);
        org.junit.Assert.assertNotNull(cOSArray15);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test191");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.PRODUCER;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test192");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition2 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle pDAnnotationSquareCircle3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle(cOSDictionary1);
        java.lang.String str4 = cOSDictionary1.toString();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "COSDictionary{COSName{Type}:COSName{Annot};COSName{Kids}:COSArray{[]};COSName{Count}:COSInt{0};}" + "'", str4.equals("COSDictionary{COSName{Type}:COSName{Annot};COSName{Kids}:COSArray{[]};COSName{Count}:COSInt{0};}"));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test193");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.FONT_MATRIX;
        java.util.Calendar calendar7 = null;
        java.util.Calendar calendar8 = cOSDictionary1.getEmbeddedDate("", cOSName6, calendar7);
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDThreadBead pDThreadBead9 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDThreadBead(cOSDictionary1);
        org.apache.pdfbox.pdmodel.PDPage pDPage10 = pDThreadBead9.getPage();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNull(calendar8);
        org.junit.Assert.assertNull(pDPage10);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test194");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.VERISIGN_PPKVS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test195");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        int i6 = cOSDictionary4.getInt("Expired");
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.A;
        cOSDictionary4.setInt(cOSName7, 100);
        cOSDictionary4.setString("Metadata", "-90");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary13 = cOSDictionary4.asUnmodifiableDictionary();
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(cOSDictionary13);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test196");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary4.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName6, (int) (short) 0);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache9 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources10 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary4, resourceCache9);
        java.lang.Iterable<org.apache.pdfbox.cos.COSName> iterable_cOSName11 = pDResources10.getPropertiesNames();
        org.apache.pdfbox.cos.COSName cOSName12 = org.apache.pdfbox.cos.COSName.EMPTY;
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree13 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary14 = pDPageTree13.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject15 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty16 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary14, pDUserAttributeObject15);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent17 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary14);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit18 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary14);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_19 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary14);
        pDResources10.put(cOSName12, (org.apache.pdfbox.pdmodel.graphics.shading.PDShading) pDShadingType1_19);
        org.apache.pdfbox.cos.COSName cOSName21 = org.apache.pdfbox.cos.COSName.URL;
        org.apache.pdfbox.pdmodel.graphics.color.PDSeparation pDSeparation22 = new org.apache.pdfbox.pdmodel.graphics.color.PDSeparation();
        pDResources10.put(cOSName21, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDSeparation22);
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor24 = pDSeparation22.getInitialColor();
        java.awt.image.WritableRaster writableRaster25 = null;
        try {
            java.awt.image.BufferedImage bufferedImage26 = pDSeparation22.toRGBImage(writableRaster25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(iterable_cOSName11);
        org.junit.Assert.assertNotNull(cOSName12);
        org.junit.Assert.assertNotNull(cOSDictionary14);
        org.junit.Assert.assertNotNull(cOSName21);
        org.junit.Assert.assertNotNull(pDColor24);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test197");
        int i0 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue.FLAG_SUBFILTER;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test198");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.PDDocumentCatalog pDDocumentCatalog4 = pDDocument0.getDocumentCatalog();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary5 = pDDocumentCatalog4.getCOSObject();
        org.junit.Assert.assertNotNull(pDDocumentCatalog4);
        org.junit.Assert.assertNotNull(cOSDictionary5);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test199");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.AESV3;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test200");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.BASE_FONT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test201");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_6 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle7 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray8 = pDRectangle7.getCOSArray();
        cOSArray8.clear();
        org.apache.pdfbox.cos.COSName cOSName11 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray8.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName11);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle13 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray14 = pDRectangle13.getCOSArray();
        cOSArray14.clear();
        org.apache.pdfbox.cos.COSName cOSName17 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray14.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName17);
        cOSArray8.addAll(cOSArray14);
        pDShadingType1_6.setBackground(cOSArray8);
        try {
            cOSArray8.setInt((int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(pDRectangle7);
        org.junit.Assert.assertNotNull(cOSArray8);
        org.junit.Assert.assertNotNull(cOSName11);
        org.junit.Assert.assertNotNull(pDRectangle13);
        org.junit.Assert.assertNotNull(cOSArray14);
        org.junit.Assert.assertNotNull(cOSName17);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test202");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        java.util.Set<java.util.Map.Entry<org.apache.pdfbox.cos.COSName, org.apache.pdfbox.cos.COSBase>> set_entry_cOSName_cOSBase2 = cOSDictionary1.entrySet();
        int i6 = cOSDictionary1.getEmbeddedInt("UpperAlpha", "StructElem", (int) (byte) 0);
        org.apache.pdfbox.cos.ICOSVisitor iCOSVisitor7 = null;
        try {
            java.lang.Object obj8 = cOSDictionary1.accept(iCOSVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(set_entry_cOSName_cOSBase2);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test203");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CL;
        org.apache.pdfbox.pdmodel.common.function.PDFunctionTypeIdentity pDFunctionTypeIdentity1 = new org.apache.pdfbox.pdmodel.common.function.PDFunctionTypeIdentity((org.apache.pdfbox.cos.COSBase) cOSName0);
        try {
            int i2 = pDFunctionTypeIdentity1.getFunctionType();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test204");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray1 = pDRectangle0.getCOSArray();
        cOSArray1.clear();
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray1.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName4);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle6 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray7 = pDRectangle6.getCOSArray();
        cOSArray7.clear();
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray7.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName10);
        cOSArray1.addAll(cOSArray7);
        org.apache.pdfbox.cos.COSArray cOSArray13 = new org.apache.pdfbox.cos.COSArray();
        cOSArray7.addAll(cOSArray13);
        java.util.List<java.lang.Integer> list_i15 = org.apache.pdfbox.pdmodel.common.COSArrayList.convertIntegerCOSArrayToList(cOSArray13);
        org.junit.Assert.assertNotNull(pDRectangle0);
        org.junit.Assert.assertNotNull(cOSArray1);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNotNull(pDRectangle6);
        org.junit.Assert.assertNotNull(cOSArray7);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertNotNull(list_i15);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test205");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        java.util.List<java.lang.String> list_str2 = pDEmbeddedFile1.getFileFilters();
        pDEmbeddedFile1.setMacResFork("Confidential");
        org.junit.Assert.assertNull(list_str2);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test206");
        java.awt.color.ColorSpace colorSpace0 = null;
        org.apache.pdfbox.pdmodel.graphics.color.PDJPXColorSpace pDJPXColorSpace1 = new org.apache.pdfbox.pdmodel.graphics.color.PDJPXColorSpace(colorSpace0);
        java.lang.String str2 = pDJPXColorSpace1.getName();
        java.lang.String str3 = pDJPXColorSpace1.getName();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "JPX" + "'", str2.equals("JPX"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "JPX" + "'", str3.equals("JPX"));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test207");
        try {
            org.apache.pdfbox.cos.COSString cOSString1 = org.apache.pdfbox.cos.COSString.parseHex("rg");
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test208");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData pDActionImportData5 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFCatalog fDFCatalog6 = new org.apache.pdfbox.pdmodel.fdf.FDFCatalog(cOSDictionary1);
        fDFCatalog6.setVersion("RT");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary9 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFDictionary fDFDictionary10 = new org.apache.pdfbox.pdmodel.fdf.FDFDictionary(cOSDictionary9);
        fDFCatalog6.setFDF(fDFDictionary10);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature pDSignature12 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature();
        fDFCatalog6.setSignature(pDSignature12);
        byte[] byte_array14 = null;
        try {
            byte[] byte_array15 = pDSignature12.getSignedContent(byte_array14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary1);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test209");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        pDExportFormatAttributeObject1.setLineHeightNormal();
        float f5 = pDExportFormatAttributeObject1.getTextDecorationThickness();
        float f6 = pDExportFormatAttributeObject1.getSpaceBefore();
        pDExportFormatAttributeObject1.setSummary("WT");
        pDExportFormatAttributeObject1.setRubyAlign("90");
        org.junit.Assert.assertTrue(f5 == (-1.0f));
        org.junit.Assert.assertTrue(f6 == 0.0f);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test210");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData pDActionImportData5 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuildDataDict pDPropBuildDataDict6 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuildDataDict(cOSDictionary1);
        long long7 = pDPropBuildDataDict6.getMinimumRevision();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertTrue(long7 == (-1L));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test211");
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission0 = org.apache.pdfbox.pdmodel.encryption.AccessPermission.getOwnerAccessPermission();
        accessPermission0.setCanExtractContent(true);
        int i3 = accessPermission0.getPermissionBytes();
        accessPermission0.setCanModify(false);
        org.junit.Assert.assertNotNull(accessPermission0);
        org.junit.Assert.assertTrue(i3 == (-4));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test212");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureTreeRoot pDStructureTreeRoot0 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureTreeRoot();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test213");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        org.apache.pdfbox.cos.COSDocument cOSDocument2 = pDDocument0.getDocument();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject4.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = pDExportFormatAttributeObject4.getCOSObject();
        int i9 = cOSDictionary7.getInt("Expired");
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.A;
        cOSDictionary7.setInt(cOSName10, 100);
        org.apache.pdfbox.cos.COSName cOSName13 = org.apache.pdfbox.cos.COSName.OUTPUT_INTENT;
        org.apache.pdfbox.cos.COSBase cOSBase14 = cOSDictionary7.getItem(cOSName13);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm15 = new org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm(pDDocument0, cOSDictionary7);
        org.apache.pdfbox.cos.COSName cOSName16 = org.apache.pdfbox.cos.COSName.ROOT;
        org.apache.pdfbox.pdmodel.interactive.form.PDXFAResource pDXFAResource17 = new org.apache.pdfbox.pdmodel.interactive.form.PDXFAResource((org.apache.pdfbox.cos.COSBase) cOSName16);
        pDAcroForm15.setXFA(pDXFAResource17);
        pDAcroForm15.flatten();
        org.apache.pdfbox.pdmodel.PDResources pDResources20 = pDAcroForm15.getDefaultResources();
        org.apache.pdfbox.pdmodel.interactive.form.PDXFAResource pDXFAResource21 = pDAcroForm15.getXFA();
        java.util.Iterator<org.apache.pdfbox.pdmodel.interactive.form.PDField> iterator_pDField22 = pDAcroForm15.getFieldIterator();
        java.util.List<org.apache.pdfbox.pdmodel.interactive.form.PDField> list_pDField23 = pDAcroForm15.getFields();
        org.junit.Assert.assertNotNull(cOSDocument2);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertNotNull(cOSName13);
        org.junit.Assert.assertNull(cOSBase14);
        org.junit.Assert.assertNotNull(cOSName16);
        org.junit.Assert.assertNull(pDResources20);
        org.junit.Assert.assertNotNull(pDXFAResource21);
        org.junit.Assert.assertNotNull(iterator_pDField22);
        org.junit.Assert.assertNotNull(list_pDField23);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test214");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle1 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage2 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle1);
        int i3 = pDPageTree0.indexOf(pDPage2);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream4 = pDPage2.getContentStreams();
        org.apache.pdfbox.pdmodel.PDResources pDResources5 = pDPage2.getResources();
        java.util.List<org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDThreadBead> list_pDThreadBead6 = pDPage2.getThreadBeads();
        org.apache.pdfbox.pdfparser.PDFStreamParser pDFStreamParser7 = new org.apache.pdfbox.pdfparser.PDFStreamParser((org.apache.pdfbox.contentstream.PDContentStream) pDPage2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertNotNull(iterator_pDStream4);
        org.junit.Assert.assertNull(pDResources5);
        org.junit.Assert.assertNotNull(list_pDThreadBead6);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test215");
        org.apache.pdfbox.pdmodel.font.encoding.MacExpertEncoding macExpertEncoding0 = org.apache.pdfbox.pdmodel.font.encoding.MacExpertEncoding.INSTANCE;
        org.apache.pdfbox.cos.COSBase cOSBase1 = macExpertEncoding0.getCOSObject();
        org.junit.Assert.assertNotNull(macExpertEncoding0);
        org.junit.Assert.assertNotNull(cOSBase1);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test216");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions2 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStrikeOut fDFAnnotationStrikeOut3 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStrikeOut(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.color.PDOutputIntent pDOutputIntent4 = new org.apache.pdfbox.pdmodel.graphics.color.PDOutputIntent(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test217");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine fDFAnnotationLine0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine();
        fDFAnnotationLine0.setLeaderExtend((float) 4);
        float[] f_array3 = fDFAnnotationLine0.getLine();
        org.junit.Assert.assertNull(f_array3);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test218");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.COURIER_BOLD;
        boolean b1 = pDType1Font0.isEmbedded();
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test219");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions2 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary1);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.CROP_BOX;
        java.lang.String str5 = cOSDictionary1.getEmbeddedString("Overline", cOSName4);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch pDActionLaunch6 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch(cOSDictionary1);
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor pDFontDescriptor7 = new org.apache.pdfbox.pdmodel.font.PDFontDescriptor(cOSDictionary1);
        org.apache.pdfbox.pdmodel.common.PDStream pDStream8 = pDFontDescriptor7.getCIDSet();
        pDFontDescriptor7.setAllCap(false);
        pDFontDescriptor7.setFontFamily("");
        boolean b13 = pDFontDescriptor7.isAllCap();
        pDFontDescriptor7.setForceBold(false);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(pDStream8);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test220");
        org.apache.pdfbox.contentstream.operator.graphics.FillNonZeroRule fillNonZeroRule0 = new org.apache.pdfbox.contentstream.operator.graphics.FillNonZeroRule();
        org.apache.pdfbox.text.PDFTextStripper pDFTextStripper1 = new org.apache.pdfbox.text.PDFTextStripper();
        java.lang.String str2 = pDFTextStripper1.getWordSeparator();
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem pDOutlineItem3 = null;
        pDFTextStripper1.setStartBookmark(pDOutlineItem3);
        try {
            fillNonZeroRule0.setContext((org.apache.pdfbox.contentstream.PDFStreamEngine) pDFTextStripper1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + " " + "'", str2.equals(" "));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test221");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.HELVETICA_BOLD;
        boolean b2 = pDType1Font0.hasGlyph("COSName{PageMode}");
        float f4 = pDType1Font0.getHeight(0);
        byte[] byte_array6 = pDType1Font0.encode("");
        org.apache.pdfbox.pdmodel.font.encoding.Encoding encoding7 = pDType1Font0.getEncoding();
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(f4 == 0.0f);
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNotNull(encoding7);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test222");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight fDFAnnotationHighlight0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight();
        java.lang.String str1 = fDFAnnotationHighlight0.getTitle();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree2 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = pDPageTree2.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject4 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty5 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary3, pDUserAttributeObject4);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent6 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit7 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary3);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_8 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary3);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType7 pDShadingType7_9 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType7(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolygon fDFAnnotationPolygon10 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolygon(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup12 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup("hi!");
        float[] f_array15 = new float[] { 7, (-1) };
        pDAnnotationTextMarkup12.setQuadPoints(f_array15);
        fDFAnnotationPolygon10.setVertices(f_array15);
        fDFAnnotationHighlight0.setCoords(f_array15);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(cOSDictionary3);
        org.junit.Assert.assertNotNull(f_array15);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test223");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup1 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup("hi!");
        float[] f_array4 = new float[] { 7, (-1) };
        pDAnnotationTextMarkup1.setQuadPoints(f_array4);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject7 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject7.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary10 = pDExportFormatAttributeObject7.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName12 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary10.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName12, (int) (short) 0);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache15 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources16 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary10, resourceCache15);
        org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject pDFormXObject17 = null;
        org.apache.pdfbox.cos.COSName cOSName18 = pDResources16.add(pDFormXObject17);
        java.awt.color.ColorSpace colorSpace19 = null;
        org.apache.pdfbox.pdmodel.graphics.color.PDJPXColorSpace pDJPXColorSpace20 = new org.apache.pdfbox.pdmodel.graphics.color.PDJPXColorSpace(colorSpace19);
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor21 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array4, cOSName18, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDJPXColorSpace20);
        org.junit.Assert.assertNotNull(f_array4);
        org.junit.Assert.assertNotNull(cOSDictionary10);
        org.junit.Assert.assertNotNull(cOSName12);
        org.junit.Assert.assertNotNull(cOSName18);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test224");
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline pDDocumentOutline0 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline();
        java.lang.Iterable<org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem> iterable_pDOutlineItem1 = pDDocumentOutline0.children();
        pDDocumentOutline0.closeNode();
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem pDOutlineItem3 = pDDocumentOutline0.getFirstChild();
        org.junit.Assert.assertNotNull(iterable_pDOutlineItem1);
        org.junit.Assert.assertNull(pDOutlineItem3);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test226");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStamp fDFAnnotationStamp0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStamp();
        fDFAnnotationStamp0.setToggleNoView(false);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = fDFAnnotationStamp0.getRectangle();
        org.junit.Assert.assertNull(pDRectangle3);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test227");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationText pDAnnotationText0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationText();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor1 = pDAnnotationText0.getColor();
        org.junit.Assert.assertNull(pDColor1);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test228");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        java.lang.String str1 = pDAnnotationLine0.getSubject();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree2 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage4 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle3);
        int i5 = pDPageTree2.indexOf(pDPage4);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree6 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = pDPageTree6.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition8 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary7);
        org.apache.pdfbox.cos.COSBase cOSBase9 = pDTransition8.getDirection();
        pDPage4.setTransition(pDTransition8, (float) 1);
        pDAnnotationLine0.setPage(pDPage4);
        org.apache.pdfbox.pdmodel.interactive.action.PDPageAdditionalActions pDPageAdditionalActions13 = pDPage4.getActions();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine14 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        java.lang.String str15 = pDAnnotationLine14.getSubject();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree16 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle17 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage18 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle17);
        int i19 = pDPageTree16.indexOf(pDPage18);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree20 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary21 = pDPageTree20.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition22 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary21);
        org.apache.pdfbox.cos.COSBase cOSBase23 = pDTransition22.getDirection();
        pDPage18.setTransition(pDTransition22, (float) 1);
        pDAnnotationLine14.setPage(pDPage18);
        org.apache.pdfbox.pdmodel.interactive.action.PDPageAdditionalActions pDPageAdditionalActions27 = pDPage18.getActions();
        pDPage4.setActions(pDPageAdditionalActions27);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertNotNull(cOSBase9);
        org.junit.Assert.assertNotNull(pDPageAdditionalActions13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertNotNull(cOSDictionary21);
        org.junit.Assert.assertNotNull(cOSBase23);
        org.junit.Assert.assertNotNull(pDPageAdditionalActions27);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test229");
        org.apache.pdfbox.pdmodel.font.PDType3Font pDType3Font0 = null;
        org.apache.pdfbox.pdmodel.PDDocument pDDocument1 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile2 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument1);
        pDDocument1.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata5 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument1);
        org.apache.pdfbox.cos.COSStream cOSStream6 = pDMetadata5.getCOSObject();
        java.io.OutputStream outputStream7 = cOSStream6.createFilteredStream();
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType2 pDShadingType2_8 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType2((org.apache.pdfbox.cos.COSDictionary) cOSStream6);
        org.apache.pdfbox.pdmodel.font.PDType3CharProc pDType3CharProc9 = new org.apache.pdfbox.pdmodel.font.PDType3CharProc(pDType3Font0, cOSStream6);
        org.apache.pdfbox.pdmodel.common.PDObjectStream pDObjectStream10 = new org.apache.pdfbox.pdmodel.common.PDObjectStream(cOSStream6);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata11 = new org.apache.pdfbox.pdmodel.common.PDMetadata(cOSStream6);
        org.junit.Assert.assertNotNull(cOSStream6);
        org.junit.Assert.assertNotNull(outputStream7);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test230");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition2 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle pDAnnotationSquareCircle3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle(cOSDictionary1);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject5 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject5.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary8 = pDExportFormatAttributeObject5.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary8.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName10, (int) (short) 0);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache13 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources14 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary8, resourceCache13);
        java.lang.Iterable<org.apache.pdfbox.cos.COSName> iterable_cOSName15 = pDResources14.getPropertiesNames();
        org.apache.pdfbox.cos.COSName cOSName16 = org.apache.pdfbox.cos.COSName.EMPTY;
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree17 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary18 = pDPageTree17.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject19 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty20 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary18, pDUserAttributeObject19);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent21 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary18);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit22 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary18);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_23 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary18);
        pDResources14.put(cOSName16, (org.apache.pdfbox.pdmodel.graphics.shading.PDShading) pDShadingType1_23);
        org.apache.pdfbox.cos.COSName cOSName25 = org.apache.pdfbox.cos.COSName.URL;
        org.apache.pdfbox.pdmodel.graphics.color.PDSeparation pDSeparation26 = new org.apache.pdfbox.pdmodel.graphics.color.PDSeparation();
        pDResources14.put(cOSName25, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDSeparation26);
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor28 = pDSeparation26.getInitialColor();
        pDAnnotationSquareCircle3.setInteriorColor(pDColor28);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary8);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertNotNull(iterable_cOSName15);
        org.junit.Assert.assertNotNull(cOSName16);
        org.junit.Assert.assertNotNull(cOSDictionary18);
        org.junit.Assert.assertNotNull(cOSName25);
        org.junit.Assert.assertNotNull(pDColor28);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test231");
        org.apache.pdfbox.pdmodel.encryption.PublicKeyProtectionPolicy publicKeyProtectionPolicy0 = new org.apache.pdfbox.pdmodel.encryption.PublicKeyProtectionPolicy();
        org.apache.pdfbox.pdmodel.encryption.PublicKeyRecipient publicKeyRecipient1 = new org.apache.pdfbox.pdmodel.encryption.PublicKeyRecipient();
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission2 = publicKeyRecipient1.getPermission();
        publicKeyProtectionPolicy0.addRecipient(publicKeyRecipient1);
        org.apache.pdfbox.pdmodel.encryption.PublicKeySecurityHandler publicKeySecurityHandler4 = new org.apache.pdfbox.pdmodel.encryption.PublicKeySecurityHandler(publicKeyProtectionPolicy0);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument5 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile6 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument5);
        pDDocument5.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata9 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument5);
        org.apache.pdfbox.cos.COSStream cOSStream10 = pDMetadata9.getCOSObject();
        java.io.OutputStream outputStream11 = cOSStream10.createFilteredStream();
        org.apache.pdfbox.pdmodel.fdf.FDFDictionary fDFDictionary12 = new org.apache.pdfbox.pdmodel.fdf.FDFDictionary((org.apache.pdfbox.cos.COSDictionary) cOSStream10);
        publicKeySecurityHandler4.decryptStream(cOSStream10, 1L, (long) 7);
        org.junit.Assert.assertNull(accessPermission2);
        org.junit.Assert.assertNotNull(cOSStream10);
        org.junit.Assert.assertNotNull(outputStream11);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test232");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary4.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName6, (int) (short) 0);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP pDSeedValueMDP9 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP(cOSDictionary4);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationText fDFAnnotationText10 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationText(cOSDictionary4);
        org.apache.pdfbox.cos.COSName cOSName11 = org.apache.pdfbox.cos.COSName.APP;
        java.lang.String str13 = cOSDictionary4.getString(cOSName11, "RP");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject15 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDFourColours pDFourColours16 = null;
        pDExportFormatAttributeObject15.setBorderColors(pDFourColours16);
        java.lang.Object obj18 = pDExportFormatAttributeObject15.getBorderThickness();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject20 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        java.lang.String[] str_array22 = new java.lang.String[] { "BlockQuote" };
        pDExportFormatAttributeObject20.setHeaders(str_array22);
        pDExportFormatAttributeObject15.setBorderStyles(str_array22);
        long long26 = cOSDictionary4.getLong(str_array22, (long) 7);
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode pDStructureNode28 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement pDStructureElement29 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement("O=TD, Padding=10.0, LineHeight=Normal", pDStructureNode28);
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDObjectReference pDObjectReference30 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDObjectReference();
        pDStructureElement29.appendKid(pDObjectReference30);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary32 = pDObjectReference30.getCOSObject();
        cOSDictionary4.addAll(cOSDictionary32);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(cOSName11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "RP" + "'", str13.equals("RP"));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(str_array22);
        org.junit.Assert.assertTrue(long26 == 7L);
        org.junit.Assert.assertNotNull(cOSDictionary32);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test233");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata4 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument0);
        org.apache.pdfbox.cos.COSStream cOSStream5 = pDMetadata4.getCOSObject();
        java.io.OutputStream outputStream6 = cOSStream5.createFilteredStream();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream7 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream5);
        org.apache.pdfbox.pdmodel.common.PDStream pDStream8 = pDAppearanceStream7.getContentStream();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject10 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject10.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary13 = pDExportFormatAttributeObject10.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName15 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary13.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName15, (int) (short) 0);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache18 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources19 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary13, resourceCache18);
        org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject pDFormXObject20 = null;
        org.apache.pdfbox.cos.COSName cOSName21 = pDResources19.add(pDFormXObject20);
        java.lang.Iterable<org.apache.pdfbox.cos.COSName> iterable_cOSName22 = pDResources19.getColorSpaceNames();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree23 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary24 = pDPageTree23.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions25 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary24);
        org.apache.pdfbox.cos.COSName cOSName27 = org.apache.pdfbox.cos.COSName.CROP_BOX;
        java.lang.String str28 = cOSDictionary24.getEmbeddedString("Overline", cOSName27);
        boolean b29 = pDResources19.hasColorSpace(cOSName27);
        pDAppearanceStream7.setResources(pDResources19);
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font31 = org.apache.pdfbox.pdmodel.font.PDType1Font.HELVETICA_BOLD;
        boolean b33 = pDType1Font31.hasGlyph("COSName{PageMode}");
        float f35 = pDType1Font31.getHeight(0);
        org.apache.pdfbox.cos.COSName cOSName36 = pDResources19.add((org.apache.pdfbox.pdmodel.font.PDFont) pDType1Font31);
        try {
            pDType1Font31.subset();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream5);
        org.junit.Assert.assertNotNull(outputStream6);
        org.junit.Assert.assertNotNull(pDStream8);
        org.junit.Assert.assertNotNull(cOSDictionary13);
        org.junit.Assert.assertNotNull(cOSName15);
        org.junit.Assert.assertNotNull(cOSName21);
        org.junit.Assert.assertNotNull(iterable_cOSName22);
        org.junit.Assert.assertNotNull(cOSDictionary24);
        org.junit.Assert.assertNotNull(cOSName27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(pDType1Font31);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(f35 == 0.0f);
        org.junit.Assert.assertNotNull(cOSName36);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test234");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.fdf.FDFAnnotationInk.SUBTYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Ink" + "'", str0.equals("Ink"));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test235");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary4.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName6, (int) (short) 0);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache9 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources10 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary4, resourceCache9);
        org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject pDFormXObject11 = null;
        org.apache.pdfbox.cos.COSName cOSName12 = pDResources10.add(pDFormXObject11);
        java.lang.Iterable<org.apache.pdfbox.cos.COSName> iterable_cOSName13 = pDResources10.getPatternNames();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree14 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary15 = pDPageTree14.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode16 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary15);
        org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern pDTilingPattern17 = new org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern(cOSDictionary15);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle18 = pDTilingPattern17.getBBox();
        org.apache.pdfbox.cos.COSName cOSName19 = pDResources10.add((org.apache.pdfbox.pdmodel.graphics.pattern.PDAbstractPattern) pDTilingPattern17);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(cOSName12);
        org.junit.Assert.assertNotNull(iterable_cOSName13);
        org.junit.Assert.assertNotNull(cOSDictionary15);
        org.junit.Assert.assertNull(pDRectangle18);
        org.junit.Assert.assertNotNull(cOSName19);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test236");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_6 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle7 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray8 = pDRectangle7.getCOSArray();
        cOSArray8.clear();
        org.apache.pdfbox.cos.COSName cOSName11 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray8.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName11);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle13 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray14 = pDRectangle13.getCOSArray();
        cOSArray14.clear();
        org.apache.pdfbox.cos.COSName cOSName17 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray14.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName17);
        cOSArray8.addAll(cOSArray14);
        pDShadingType1_6.setBackground(cOSArray8);
        org.apache.pdfbox.cos.COSArray cOSArray21 = pDShadingType1_6.getDomain();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary22 = pDShadingType1_6.getCOSObject();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(pDRectangle7);
        org.junit.Assert.assertNotNull(cOSArray8);
        org.junit.Assert.assertNotNull(cOSName11);
        org.junit.Assert.assertNotNull(pDRectangle13);
        org.junit.Assert.assertNotNull(cOSArray14);
        org.junit.Assert.assertNotNull(cOSName17);
        org.junit.Assert.assertNull(cOSArray21);
        org.junit.Assert.assertNotNull(cOSDictionary22);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test237");
        org.apache.pdfbox.pdmodel.fdf.FDFField fDFField0 = new org.apache.pdfbox.pdmodel.fdf.FDFField();
        org.apache.pdfbox.pdmodel.fdf.FDFNamedPageReference fDFNamedPageReference1 = fDFField0.getAppearanceStreamReference();
        org.junit.Assert.assertNull(fDFNamedPageReference1);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test238");
        org.apache.pdfbox.pdmodel.graphics.PDFontSetting pDFontSetting0 = new org.apache.pdfbox.pdmodel.graphics.PDFontSetting();
        org.apache.pdfbox.cos.COSBase cOSBase1 = pDFontSetting0.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName2 = org.apache.pdfbox.cos.COSName.DECODE;
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree3 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDPageTree3.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject5 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty6 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary4, pDUserAttributeObject5);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent7 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary4);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit8 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary4);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_9 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary4);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType7 pDShadingType7_10 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType7(cOSDictionary4);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType4 pDShadingType4_11 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType4(cOSDictionary4);
        int i14 = cOSDictionary4.getEmbeddedInt("MacRomanEncoding", "ExData");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle15 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray16 = pDRectangle15.getCOSArray();
        cOSArray16.clear();
        org.apache.pdfbox.cos.COSName cOSName19 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray16.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName19);
        org.apache.pdfbox.pdmodel.graphics.color.PDGamma pDGamma21 = new org.apache.pdfbox.pdmodel.graphics.color.PDGamma(cOSArray16);
        org.apache.pdfbox.cos.COSName cOSName22 = org.apache.pdfbox.cos.COSName.ORDER;
        cOSArray16.add((org.apache.pdfbox.pdmodel.common.COSObjectable) cOSName22);
        org.apache.pdfbox.pdmodel.common.COSArrayList<org.apache.pdfbox.pdmodel.graphics.PDFontSetting> cosarraylist_pDFontSetting24 = new org.apache.pdfbox.pdmodel.common.COSArrayList<org.apache.pdfbox.pdmodel.graphics.PDFontSetting>(pDFontSetting0, (org.apache.pdfbox.cos.COSBase) cOSName2, cOSDictionary4, cOSName22);
        try {
            org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font25 = new org.apache.pdfbox.pdmodel.font.PDType0Font(cOSDictionary4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSBase1);
        org.junit.Assert.assertNotNull(cOSName2);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertNotNull(pDRectangle15);
        org.junit.Assert.assertNotNull(cOSArray16);
        org.junit.Assert.assertNotNull(cOSName19);
        org.junit.Assert.assertNotNull(cOSName22);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test239");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.HARD_LIGHT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test240");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions2 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary1);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.CROP_BOX;
        java.lang.String str5 = cOSDictionary1.getEmbeddedString("Overline", cOSName4);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch pDActionLaunch6 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch(cOSDictionary1);
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor pDFontDescriptor7 = new org.apache.pdfbox.pdmodel.font.PDFontDescriptor(cOSDictionary1);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument8 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile9 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument8);
        java.lang.String str10 = pDEmbeddedFile9.getMacCreator();
        org.apache.pdfbox.pdmodel.common.COSArrayList<org.apache.pdfbox.printing.PDFPageable> cosarraylist_pDFPageable11 = new org.apache.pdfbox.pdmodel.common.COSArrayList<org.apache.pdfbox.printing.PDFPageable>();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument12 = null;
        org.apache.pdfbox.printing.PDFPageable pDFPageable13 = new org.apache.pdfbox.printing.PDFPageable(pDDocument12);
        org.apache.pdfbox.printing.PDFPageable[] pDFPageable_array14 = new org.apache.pdfbox.printing.PDFPageable[] { pDFPageable13 };
        java.util.ArrayList<org.apache.pdfbox.printing.PDFPageable> arraylist_pDFPageable15 = new java.util.ArrayList<org.apache.pdfbox.printing.PDFPageable>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.printing.PDFPageable>) arraylist_pDFPageable15, pDFPageable_array14);
        boolean b17 = cosarraylist_pDFPageable11.containsAll((java.util.Collection<org.apache.pdfbox.printing.PDFPageable>) arraylist_pDFPageable15);
        pDEmbeddedFile9.setFileDecodeParams((java.util.List<org.apache.pdfbox.printing.PDFPageable>) cosarraylist_pDFPageable11);
        pDFontDescriptor7.setCIDSet((org.apache.pdfbox.pdmodel.common.PDStream) pDEmbeddedFile9);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument20 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile21 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument20);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle22 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray23 = pDRectangle22.getCOSArray();
        cOSArray23.clear();
        org.apache.pdfbox.cos.COSName cOSName26 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray23.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName26);
        org.apache.pdfbox.pdmodel.graphics.color.PDGamma pDGamma28 = new org.apache.pdfbox.pdmodel.graphics.color.PDGamma(cOSArray23);
        org.apache.pdfbox.pdmodel.fdf.FDFOptionElement fDFOptionElement29 = new org.apache.pdfbox.pdmodel.fdf.FDFOptionElement(cOSArray23);
        java.util.List<java.lang.String> list_str30 = org.apache.pdfbox.pdmodel.common.COSArrayList.convertCOSStringCOSArrayToList(cOSArray23);
        java.io.InputStream inputStream31 = pDEmbeddedFile21.createInputStream(list_str30);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument32 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile33 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument32);
        pDDocument32.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata36 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument32);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument37 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile38 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument37);
        pDDocument37.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata41 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument37);
        org.apache.pdfbox.cos.COSStream cOSStream42 = pDMetadata41.getCOSObject();
        pDMetadata36.setMetadata(pDMetadata41);
        pDEmbeddedFile21.setMetadata(pDMetadata41);
        pDFontDescriptor7.setFontFile2((org.apache.pdfbox.pdmodel.common.PDStream) pDMetadata41);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(pDFPageable_array14);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(pDRectangle22);
        org.junit.Assert.assertNotNull(cOSArray23);
        org.junit.Assert.assertNotNull(cOSName26);
        org.junit.Assert.assertNotNull(list_str30);
        org.junit.Assert.assertNotNull(inputStream31);
        org.junit.Assert.assertNotNull(cOSStream42);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test242");
        org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState pDExtendedGraphicsState0 = new org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState();
        pDExtendedGraphicsState0.setStrokingAlphaConstant((java.lang.Float) 1.0f);
        boolean b3 = pDExtendedGraphicsState0.getAlphaSourceFlag();
        pDExtendedGraphicsState0.setNonStrokingAlphaConstant((java.lang.Float) 10.0f);
        int i6 = pDExtendedGraphicsState0.getLineJoinStyle();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i6 == (-1));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test243");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode pDStructureNode1 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement pDStructureElement2 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement("O=TD, Padding=10.0, LineHeight=Normal", pDStructureNode1);
        pDStructureElement2.setExpandedForm("BibEntry");
        pDStructureElement2.removeClassName("Line");
        java.lang.String str7 = pDStructureElement2.getElementIdentifier();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test244");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary4.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName6, (int) (short) 0);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache9 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources10 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary4, resourceCache9);
        java.lang.Iterable<org.apache.pdfbox.cos.COSName> iterable_cOSName11 = pDResources10.getPropertiesNames();
        org.apache.pdfbox.cos.COSName cOSName12 = org.apache.pdfbox.cos.COSName.EMPTY;
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree13 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary14 = pDPageTree13.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject15 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty16 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary14, pDUserAttributeObject15);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent17 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary14);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit18 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary14);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_19 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary14);
        pDResources10.put(cOSName12, (org.apache.pdfbox.pdmodel.graphics.shading.PDShading) pDShadingType1_19);
        org.apache.pdfbox.cos.COSName cOSName21 = org.apache.pdfbox.cos.COSName.URL;
        org.apache.pdfbox.pdmodel.graphics.color.PDSeparation pDSeparation22 = new org.apache.pdfbox.pdmodel.graphics.color.PDSeparation();
        pDResources10.put(cOSName21, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDSeparation22);
        org.apache.pdfbox.pdmodel.graphics.color.PDCalRGB pDCalRGB24 = new org.apache.pdfbox.pdmodel.graphics.color.PDCalRGB();
        org.apache.pdfbox.pdmodel.graphics.color.PDPattern pDPattern25 = new org.apache.pdfbox.pdmodel.graphics.color.PDPattern(pDResources10, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDCalRGB24);
        java.awt.image.WritableRaster writableRaster26 = null;
        try {
            java.awt.image.BufferedImage bufferedImage27 = pDPattern25.toRGBImage(writableRaster26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(iterable_cOSName11);
        org.junit.Assert.assertNotNull(cOSName12);
        org.junit.Assert.assertNotNull(cOSDictionary14);
        org.junit.Assert.assertNotNull(cOSName21);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test245");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary();
        pDBorderStyleDictionary0.setStyle("");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test246");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup1 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup("hi!");
        boolean b2 = pDAnnotationTextMarkup1.isInvisible();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree3 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDPageTree3.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject5 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty6 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary4, pDUserAttributeObject5);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent7 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary4);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit8 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary4);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_9 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary4);
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation10 = new org.apache.pdfbox.pdmodel.PDDocumentInformation(cOSDictionary4);
        cOSDictionary4.setInt("COSName{PageMode}", (int) (byte) 0);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary14 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary(cOSDictionary4);
        pDAnnotationTextMarkup1.setAppearance(pDAppearanceDictionary14);
        java.lang.String str16 = pDAnnotationTextMarkup1.getSubtype();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test247");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        java.lang.String str1 = pDAnnotationLine0.getSubject();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree2 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage4 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle3);
        int i5 = pDPageTree2.indexOf(pDPage4);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree6 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = pDPageTree6.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition8 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary7);
        org.apache.pdfbox.cos.COSBase cOSBase9 = pDTransition8.getDirection();
        pDPage4.setTransition(pDTransition8, (float) 1);
        pDAnnotationLine0.setPage(pDPage4);
        pDAnnotationLine0.setNoRotate(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertNotNull(cOSBase9);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test248");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        org.apache.pdfbox.cos.COSDocument cOSDocument2 = pDDocument0.getDocument();
        long long3 = cOSDocument2.getStartXref();
        cOSDocument2.print();
        boolean b5 = cOSDocument2.isDecrypted();
        org.junit.Assert.assertNotNull(cOSDocument2);
        org.junit.Assert.assertTrue(long3 == 0L);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test249");
        org.apache.pdfbox.multipdf.Splitter splitter0 = new org.apache.pdfbox.multipdf.Splitter();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument1 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.printing.Scaling scaling2 = org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable6 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument1, scaling2, true, 1.0f, false);
        pDDocument1.save("CropBox");
        java.util.List<org.apache.pdfbox.pdmodel.PDDocument> list_pDDocument9 = splitter0.split(pDDocument1);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument10 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile11 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument10);
        org.apache.pdfbox.cos.COSDocument cOSDocument12 = pDDocument10.getDocument();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree13 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary14 = pDPageTree13.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode15 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary14);
        cOSDictionary14.setString("BlockQuote", "hi!");
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey19 = cOSDocument12.getKey((org.apache.pdfbox.cos.COSBase) cOSDictionary14);
        boolean b20 = cOSDocument12.isXRefStream();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument21 = new org.apache.pdfbox.pdmodel.PDDocument(cOSDocument12);
        java.util.List<org.apache.pdfbox.pdmodel.PDDocument> list_pDDocument22 = splitter0.split(pDDocument21);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree23 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle24 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage25 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle24);
        int i26 = pDPageTree23.indexOf(pDPage25);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream27 = pDPage25.getContentStreams();
        org.apache.pdfbox.pdmodel.PDResources pDResources28 = pDPage25.getResources();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree29 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary30 = pDPageTree29.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition31 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary30);
        org.apache.pdfbox.cos.COSBase cOSBase32 = pDTransition31.getDirection();
        pDPage25.setTransition(pDTransition31, (float) (short) 1);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree35 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary36 = pDPageTree35.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition37 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary36);
        pDPage25.setTransition(pDTransition37);
        java.io.InputStream inputStream39 = pDPage25.getContents();
        org.apache.pdfbox.pdmodel.common.PDStream pDStream40 = new org.apache.pdfbox.pdmodel.common.PDStream(pDDocument21, inputStream39);
        org.junit.Assert.assertTrue("'" + scaling2 + "' != '" + org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT + "'", scaling2.equals(org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT));
        org.junit.Assert.assertNotNull(list_pDDocument9);
        org.junit.Assert.assertNotNull(cOSDocument12);
        org.junit.Assert.assertNotNull(cOSDictionary14);
        org.junit.Assert.assertNull(cOSObjectKey19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(list_pDDocument22);
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertNotNull(iterator_pDStream27);
        org.junit.Assert.assertNull(pDResources28);
        org.junit.Assert.assertNotNull(cOSDictionary30);
        org.junit.Assert.assertNotNull(cOSBase32);
        org.junit.Assert.assertNotNull(cOSDictionary36);
        org.junit.Assert.assertNotNull(inputStream39);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test250");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode2 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern pDTilingPattern3 = new org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern(cOSDictionary1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = pDTilingPattern3.getBBox();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject6 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject6.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary9 = pDExportFormatAttributeObject6.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName11 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary9.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName11, (int) (short) 0);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache14 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources15 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary9, resourceCache14);
        java.lang.Iterable<org.apache.pdfbox.cos.COSName> iterable_cOSName16 = pDResources15.getPropertiesNames();
        org.apache.pdfbox.cos.COSName cOSName17 = org.apache.pdfbox.cos.COSName.EMPTY;
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree18 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary19 = pDPageTree18.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject20 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty21 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary19, pDUserAttributeObject20);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent22 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary19);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit23 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary19);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_24 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary19);
        pDResources15.put(cOSName17, (org.apache.pdfbox.pdmodel.graphics.shading.PDShading) pDShadingType1_24);
        org.apache.pdfbox.cos.COSName cOSName26 = org.apache.pdfbox.cos.COSName.URL;
        org.apache.pdfbox.pdmodel.graphics.color.PDSeparation pDSeparation27 = new org.apache.pdfbox.pdmodel.graphics.color.PDSeparation();
        pDResources15.put(cOSName26, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDSeparation27);
        pDTilingPattern3.setResources(pDResources15);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle30 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDTilingPattern3.setBBox(pDRectangle30);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNull(pDRectangle4);
        org.junit.Assert.assertNotNull(cOSDictionary9);
        org.junit.Assert.assertNotNull(cOSName11);
        org.junit.Assert.assertNotNull(iterable_cOSName16);
        org.junit.Assert.assertNotNull(cOSName17);
        org.junit.Assert.assertNotNull(cOSDictionary19);
        org.junit.Assert.assertNotNull(cOSName26);
        org.junit.Assert.assertNotNull(pDRectangle30);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test251");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSound fDFAnnotationSound0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSound();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test252");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle1 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage2 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle1);
        int i3 = pDPageTree0.indexOf(pDPage2);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText5 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText(cOSDictionary4);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertNotNull(cOSDictionary4);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test253");
        java.io.OutputStream outputStream0 = null;
        org.apache.pdfbox.pdfwriter.ContentStreamWriter contentStreamWriter1 = new org.apache.pdfbox.pdfwriter.ContentStreamWriter(outputStream0);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument2 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile3 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument2);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue pDSeedValue4 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue();
        pDSeedValue4.setSubFilterRequired(false);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm7 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDComboBox pDComboBox8 = new org.apache.pdfbox.pdmodel.interactive.form.PDComboBox(pDAcroForm7);
        pDComboBox8.setEdit(true);
        java.util.List<java.lang.String> list_str11 = pDComboBox8.getOptions();
        pDSeedValue4.setReasonsd(list_str11);
        java.io.InputStream inputStream13 = pDEmbeddedFile3.createInputStream(list_str11);
        org.apache.pdfbox.pdmodel.common.COSArrayList<org.apache.pdfbox.printing.PDFPageable> cosarraylist_pDFPageable14 = new org.apache.pdfbox.pdmodel.common.COSArrayList<org.apache.pdfbox.printing.PDFPageable>();
        org.apache.pdfbox.cos.COSArray cOSArray15 = cosarraylist_pDFPageable14.toList();
        pDEmbeddedFile3.setFileDecodeParams((java.util.List<org.apache.pdfbox.printing.PDFPageable>) cosarraylist_pDFPageable14);
        contentStreamWriter1.writeTokens((java.util.List<org.apache.pdfbox.printing.PDFPageable>) cosarraylist_pDFPageable14);
        org.junit.Assert.assertNotNull(list_str11);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(cOSArray15);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test254");
        org.w3c.dom.Element element0 = null;
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFileAttachment fDFAnnotationFileAttachment1 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFileAttachment(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test255");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        pDExportFormatAttributeObject1.setLineHeightNormal();
        pDExportFormatAttributeObject1.setTextDecorationType("L2R");
        pDExportFormatAttributeObject1.setAllBorderThicknesses(3);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test256");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary6 = fDFIconFit5.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences pDViewerPreferences7 = new org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences(cOSDictionary6);
        java.lang.String str8 = pDViewerPreferences7.getViewArea();
        pDViewerPreferences7.setHideMenubar(true);
        boolean b11 = pDViewerPreferences7.hideMenubar();
        pDViewerPreferences7.setViewClip("cb");
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.DUPLEX dUPLEX14 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.DUPLEX.Simplex;
        pDViewerPreferences7.setDuplex(dUPLEX14);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "CropBox" + "'", str8.equals("CropBox"));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + dUPLEX14 + "' != '" + org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.DUPLEX.Simplex + "'", dUPLEX14.equals(org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.DUPLEX.Simplex));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test257");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary6 = fDFIconFit5.getCOSObject();
        org.apache.pdfbox.pdmodel.common.PDRange pDRange7 = fDFIconFit5.getFractionalSpaceToAllocate();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary6);
        org.junit.Assert.assertNotNull(pDRange7);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test258");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine fDFAnnotationLine0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine();
        fDFAnnotationLine0.setStartPointEndingStyle("Polygon");
        float f3 = fDFAnnotationLine0.getLeaderOffset();
        boolean b4 = fDFAnnotationLine0.isNoZoom();
        org.junit.Assert.assertTrue(f3 == (-1.0f));
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test259");
        org.apache.pdfbox.pdmodel.fdf.FDFOptionElement fDFOptionElement0 = new org.apache.pdfbox.pdmodel.fdf.FDFOptionElement();
        fDFOptionElement0.setDefaultAppearanceString("H3");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test260");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue pDSeedValue0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue();
        pDSeedValue0.setSubFilterRequired(false);
        pDSeedValue0.setFilterRequired(true);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument5 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile6 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument5);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm7 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDComboBox pDComboBox8 = new org.apache.pdfbox.pdmodel.interactive.form.PDComboBox(pDAcroForm7);
        pDComboBox8.setEdit(true);
        java.util.List<java.lang.String> list_str11 = pDComboBox8.getOptions();
        java.util.List<java.lang.String> list_str12 = pDComboBox8.getOptionsDisplayValues();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject pDDefaultAttributeObject13 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject();
        java.util.List<java.lang.String> list_str14 = pDDefaultAttributeObject13.getAttributeNames();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle15 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray16 = pDRectangle15.getCOSArray();
        cOSArray16.clear();
        org.apache.pdfbox.cos.COSName cOSName19 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray16.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName19);
        org.apache.pdfbox.pdmodel.graphics.color.PDGamma pDGamma21 = new org.apache.pdfbox.pdmodel.graphics.color.PDGamma(cOSArray16);
        org.apache.pdfbox.pdmodel.fdf.FDFOptionElement fDFOptionElement22 = new org.apache.pdfbox.pdmodel.fdf.FDFOptionElement(cOSArray16);
        java.util.List<java.lang.String> list_str23 = org.apache.pdfbox.pdmodel.common.COSArrayList.convertCOSStringCOSArrayToList(cOSArray16);
        pDComboBox8.setOptions(list_str14, list_str23);
        pDEmbeddedFile6.setFileFilters(list_str23);
        pDSeedValue0.setLegalAttestation(list_str23);
        org.junit.Assert.assertNotNull(list_str11);
        org.junit.Assert.assertNotNull(list_str12);
        org.junit.Assert.assertNotNull(list_str14);
        org.junit.Assert.assertNotNull(pDRectangle15);
        org.junit.Assert.assertNotNull(cOSArray16);
        org.junit.Assert.assertNotNull(cOSName19);
        org.junit.Assert.assertNotNull(list_str23);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test261");
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceN pDDeviceN0 = new org.apache.pdfbox.pdmodel.graphics.color.PDDeviceN();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree1 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDPageTree1.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode3 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary2);
        org.apache.pdfbox.pdmodel.common.function.PDFunctionTypeIdentity pDFunctionTypeIdentity4 = new org.apache.pdfbox.pdmodel.common.function.PDFunctionTypeIdentity((org.apache.pdfbox.cos.COSBase) cOSDictionary2);
        pDDeviceN0.setTintTransform((org.apache.pdfbox.pdmodel.common.function.PDFunction) pDFunctionTypeIdentity4);
        org.junit.Assert.assertNotNull(cOSDictionary2);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test262");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata4 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument0);
        org.apache.pdfbox.cos.COSStream cOSStream5 = pDMetadata4.getCOSObject();
        java.io.OutputStream outputStream6 = cOSStream5.createFilteredStream();
        org.apache.pdfbox.pdmodel.common.PDObjectStream pDObjectStream7 = new org.apache.pdfbox.pdmodel.common.PDObjectStream(cOSStream5);
        java.lang.String str8 = pDObjectStream7.getType();
        try {
            pDObjectStream7.addCompression();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream5);
        org.junit.Assert.assertNotNull(outputStream6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Metadata" + "'", str8.equals("Metadata"));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test263");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.TEXT_ALIGN_START;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Start" + "'", str0.equals("Start"));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test264");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDFourColours pDFourColours2 = null;
        pDExportFormatAttributeObject1.setBorderColors(pDFourColours2);
        java.lang.Object obj4 = pDExportFormatAttributeObject1.getTBorderStyle();
        float f5 = pDExportFormatAttributeObject1.getTextIndent();
        pDExportFormatAttributeObject1.setHeight((float) (byte) 1);
        java.lang.String str8 = pDExportFormatAttributeObject1.getListNumbering();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "None" + "'", obj4.equals("None"));
        org.junit.Assert.assertTrue(f5 == 0.0f);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "None" + "'", str8.equals("None"));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test265");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.pdmodel.PDPage pDPage1 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle0);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle2 = org.apache.pdfbox.pdmodel.common.PDRectangle.A4;
        pDPage1.setCropBox(pDRectangle2);
        org.apache.pdfbox.util.Matrix matrix4 = pDPage1.getMatrix();
        org.apache.pdfbox.util.Matrix matrix5 = new org.apache.pdfbox.util.Matrix();
        java.awt.geom.Point2D.Float float8 = matrix5.transformPoint((float) (byte) 10, 12000.0f);
        float f9 = matrix5.getTranslateX();
        org.apache.pdfbox.util.Matrix matrix10 = matrix4.multiply(matrix5);
        org.apache.pdfbox.cos.COSArray cOSArray11 = matrix4.toCOSArray();
        org.apache.pdfbox.pdmodel.graphics.color.PDGamma pDGamma12 = new org.apache.pdfbox.pdmodel.graphics.color.PDGamma(cOSArray11);
        org.apache.pdfbox.cos.COSArray cOSArray13 = pDGamma12.getCOSArray();
        org.junit.Assert.assertNotNull(pDRectangle0);
        org.junit.Assert.assertNotNull(pDRectangle2);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertNotNull(float8);
        org.junit.Assert.assertTrue(f9 == 0.0f);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(cOSArray11);
        org.junit.Assert.assertNotNull(cOSArray13);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test266");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        org.apache.pdfbox.cos.COSDocument cOSDocument2 = pDDocument0.getDocument();
        cOSDocument2.setIsXRefStream(true);
        java.util.List<org.apache.pdfbox.cos.COSObject> list_cOSObject6 = cOSDocument2.getObjectsByType("Disc");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode pDStructureNode8 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement pDStructureElement9 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement("O=TD, Padding=10.0, LineHeight=Normal", pDStructureNode8);
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDObjectReference pDObjectReference10 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDObjectReference();
        pDStructureElement9.appendKid(pDObjectReference10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary12 = pDObjectReference10.getCOSObject();
        org.apache.pdfbox.cos.COSStream cOSStream13 = cOSDocument2.createCOSStream(cOSDictionary12);
        org.junit.Assert.assertNotNull(cOSDocument2);
        org.junit.Assert.assertNotNull(list_cOSObject6);
        org.junit.Assert.assertNotNull(cOSDictionary12);
        org.junit.Assert.assertNotNull(cOSStream13);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test267");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject pDLayoutAttributeObject0 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine1 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        java.lang.String str2 = pDAnnotationLine1.getSubject();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree3 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage5 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle4);
        int i6 = pDPageTree3.indexOf(pDPage5);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree7 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary8 = pDPageTree7.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition9 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary8);
        org.apache.pdfbox.cos.COSBase cOSBase10 = pDTransition9.getDirection();
        pDPage5.setTransition(pDTransition9, (float) 1);
        pDAnnotationLine1.setPage(pDPage5);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine14 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        org.apache.pdfbox.pdmodel.interactive.annotation.handlers.PDLinkAppearanceHandler pDLinkAppearanceHandler15 = new org.apache.pdfbox.pdmodel.interactive.annotation.handlers.PDLinkAppearanceHandler((org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) pDAnnotationLine14);
        pDAnnotationLine1.setInReplyTo((org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) pDAnnotationLine14);
        boolean b17 = pDLayoutAttributeObject0.equals((java.lang.Object) pDAnnotationLine14);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle18 = pDLayoutAttributeObject0.getBBox();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup20 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup("hi!");
        java.lang.String str21 = pDAnnotationTextMarkup20.getIntent();
        java.lang.String str22 = pDAnnotationTextMarkup20.getTitlePopup();
        boolean b23 = pDAnnotationTextMarkup20.isNoRotate();
        java.lang.String str24 = pDAnnotationTextMarkup20.getSubtype();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject26 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject26.setAllPaddings((int) (short) 10);
        pDExportFormatAttributeObject26.setLineHeightNormal();
        float f30 = pDExportFormatAttributeObject26.getTextDecorationThickness();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup32 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup("hi!");
        float[] f_array36 = new float[] { (short) 1, '#', 100L };
        org.apache.pdfbox.cos.COSName cOSName37 = org.apache.pdfbox.cos.COSName.PAGE_LAYOUT;
        org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace38 = null;
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor39 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array36, cOSName37, pDColorSpace38);
        pDAnnotationTextMarkup32.setQuadPoints(f_array36);
        pDExportFormatAttributeObject26.setTPaddings(f_array36);
        pDAnnotationTextMarkup20.setQuadPoints(f_array36);
        pDLayoutAttributeObject0.setTPaddings(f_array36);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNotNull(cOSDictionary8);
        org.junit.Assert.assertNotNull(cOSBase10);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(pDRectangle18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue(f30 == (-1.0f));
        org.junit.Assert.assertNotNull(f_array36);
        org.junit.Assert.assertNotNull(cOSName37);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test268");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        org.apache.pdfbox.cos.COSDocument cOSDocument2 = pDDocument0.getDocument();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        java.lang.String str4 = pDAnnotationLine3.getSubject();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree5 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle6 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage7 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle6);
        int i8 = pDPageTree5.indexOf(pDPage7);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree9 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary10 = pDPageTree9.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition11 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary10);
        org.apache.pdfbox.cos.COSBase cOSBase12 = pDTransition11.getDirection();
        pDPage7.setTransition(pDTransition11, (float) 1);
        pDAnnotationLine3.setPage(pDPage7);
        org.apache.pdfbox.pdmodel.interactive.action.PDPageAdditionalActions pDPageAdditionalActions16 = pDPage7.getActions();
        org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode appendMode17 = org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode.APPEND;
        org.apache.pdfbox.pdmodel.PDPageContentStream pDPageContentStream20 = new org.apache.pdfbox.pdmodel.PDPageContentStream(pDDocument0, pDPage7, appendMode17, true, true);
        pDPageContentStream20.restoreGraphicsState();
        java.awt.color.ColorSpace colorSpace22 = null;
        org.apache.pdfbox.pdmodel.graphics.color.PDJPXColorSpace pDJPXColorSpace23 = new org.apache.pdfbox.pdmodel.graphics.color.PDJPXColorSpace(colorSpace22);
        try {
            pDPageContentStream20.setNonStrokingColorSpace((org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDJPXColorSpace23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(cOSDocument2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNotNull(cOSDictionary10);
        org.junit.Assert.assertNotNull(cOSBase12);
        org.junit.Assert.assertNotNull(pDPageAdditionalActions16);
        org.junit.Assert.assertTrue("'" + appendMode17 + "' != '" + org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode.APPEND + "'", appendMode17.equals(org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode.APPEND));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test269");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode pDStructureNode1 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement pDStructureElement2 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement("O=TD, Padding=10.0, LineHeight=Normal", pDStructureNode1);
        pDStructureElement2.setRevisionNumber(100);
        java.lang.String str5 = pDStructureElement2.getExpandedForm();
        java.util.List<java.lang.Object> list_obj6 = pDStructureElement2.getKids();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode pDStructureNode8 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement pDStructureElement9 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement("O=TD, Padding=10.0, LineHeight=Normal", pDStructureNode8);
        pDStructureElement9.setRevisionNumber(100);
        pDStructureElement9.incrementRevisionNumber();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode pDStructureNode14 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement pDStructureElement15 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement("O=TD, Padding=10.0, LineHeight=Normal", pDStructureNode14);
        pDStructureElement15.setRevisionNumber(100);
        org.apache.pdfbox.pdmodel.PDPage pDPage18 = pDStructureElement15.getPage();
        java.lang.String str19 = pDStructureElement15.getExpandedForm();
        pDStructureElement15.setLanguage("");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject23 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject23.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary26 = pDExportFormatAttributeObject23.getCOSObject();
        int i28 = cOSDictionary26.getInt("Expired");
        org.apache.pdfbox.cos.COSName cOSName29 = org.apache.pdfbox.cos.COSName.A;
        cOSDictionary26.setInt(cOSName29, 100);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo pDActionGoTo32 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo(cOSDictionary26);
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkedContentReference pDMarkedContentReference33 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkedContentReference(cOSDictionary26);
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageXYZDestination pDPageXYZDestination34 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageXYZDestination();
        int i35 = pDPageXYZDestination34.getPageNumber();
        int i36 = pDPageXYZDestination34.getLeft();
        pDStructureElement15.insertBefore(pDMarkedContentReference33, (java.lang.Object) i36);
        pDStructureElement9.removeKid(pDMarkedContentReference33);
        pDStructureElement2.insertBefore(pDMarkedContentReference33, (java.lang.Object) "-90");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.Revisions<java.lang.String> revisions_str41 = null;
        pDStructureElement2.setClassNames(revisions_str41);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_obj6);
        org.junit.Assert.assertNull(pDPage18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(cOSDictionary26);
        org.junit.Assert.assertTrue(i28 == (-1));
        org.junit.Assert.assertNotNull(cOSName29);
        org.junit.Assert.assertTrue(i35 == (-1));
        org.junit.Assert.assertTrue(i36 == (-1));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test270");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_6 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary1);
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation7 = new org.apache.pdfbox.pdmodel.PDDocumentInformation(cOSDictionary1);
        cOSDictionary1.setInt("COSName{PageMode}", (int) (byte) 0);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary11 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry pDAppearanceEntry12 = pDAppearanceDictionary11.getNormalAppearance();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNull(pDAppearanceEntry12);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test271");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuildDataDict pDPropBuildDataDict0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuildDataDict();
        pDPropBuildDataDict0.setMinimumRevision(100L);
        java.lang.String str3 = pDPropBuildDataDict0.getOS();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test272");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree3 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDPageTree3.getCOSObject();
        java.util.Set<java.util.Map.Entry<org.apache.pdfbox.cos.COSName, org.apache.pdfbox.cos.COSBase>> set_entry_cOSName_cOSBase5 = cOSDictionary4.entrySet();
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_6 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary4);
        int i7 = pDShadingType3_6.getShadingType();
        pDShadingType3_6.setAntiAlias(true);
        org.apache.pdfbox.util.Matrix matrix12 = org.apache.pdfbox.util.Matrix.getTranslateInstance(100.0f, (float) 5);
        java.awt.Paint paint13 = pDShadingType3_6.toPaint(matrix12);
        org.apache.pdfbox.util.Matrix matrix14 = new org.apache.pdfbox.util.Matrix();
        float f15 = matrix14.getShearY();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument16 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile17 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument16);
        pDDocument16.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata20 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument16);
        org.apache.pdfbox.cos.COSStream cOSStream21 = pDMetadata20.getCOSObject();
        java.io.OutputStream outputStream22 = cOSStream21.createFilteredStream();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream23 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream21);
        org.apache.pdfbox.util.Matrix matrix24 = pDAppearanceStream23.getMatrix();
        org.apache.pdfbox.util.Matrix matrix25 = matrix12.multiply(matrix14, matrix24);
        int[] i_array35 = new int[] { (byte) 0, (byte) 10, (short) -1 };
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font36 = org.apache.pdfbox.pdmodel.font.PDType1Font.HELVETICA_BOLD;
        java.lang.String str37 = pDType1Font36.toString();
        org.apache.pdfbox.text.TextPosition textPosition40 = new org.apache.pdfbox.text.TextPosition((int) '4', (float) (byte) -1, 2383.937f, matrix12, (float) (short) 1, (float) '4', (float) (-1L), (float) 0, (float) (short) -1, "COSInt{3}", i_array35, (org.apache.pdfbox.pdmodel.font.PDFont) pDType1Font36, (-1.0f), (int) (byte) 0);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree44 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary45 = pDPageTree44.getCOSObject();
        java.util.Set<java.util.Map.Entry<org.apache.pdfbox.cos.COSName, org.apache.pdfbox.cos.COSBase>> set_entry_cOSName_cOSBase46 = cOSDictionary45.entrySet();
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_47 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary45);
        int i48 = pDShadingType3_47.getShadingType();
        pDShadingType3_47.setAntiAlias(true);
        org.apache.pdfbox.util.Matrix matrix53 = org.apache.pdfbox.util.Matrix.getTranslateInstance(100.0f, (float) 5);
        java.awt.Paint paint54 = pDShadingType3_47.toPaint(matrix53);
        org.apache.pdfbox.util.Matrix matrix55 = new org.apache.pdfbox.util.Matrix();
        float f56 = matrix55.getShearY();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument57 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile58 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument57);
        pDDocument57.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata61 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument57);
        org.apache.pdfbox.cos.COSStream cOSStream62 = pDMetadata61.getCOSObject();
        java.io.OutputStream outputStream63 = cOSStream62.createFilteredStream();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream64 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream62);
        org.apache.pdfbox.util.Matrix matrix65 = pDAppearanceStream64.getMatrix();
        org.apache.pdfbox.util.Matrix matrix66 = matrix53.multiply(matrix55, matrix65);
        int[] i_array76 = new int[] { (byte) 0, (byte) 10, (short) -1 };
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font77 = org.apache.pdfbox.pdmodel.font.PDType1Font.HELVETICA_BOLD;
        java.lang.String str78 = pDType1Font77.toString();
        org.apache.pdfbox.text.TextPosition textPosition81 = new org.apache.pdfbox.text.TextPosition((int) '4', (float) (byte) -1, 2383.937f, matrix53, (float) (short) 1, (float) '4', (float) (-1L), (float) 0, (float) (short) -1, "COSInt{3}", i_array76, (org.apache.pdfbox.pdmodel.font.PDFont) pDType1Font77, (-1.0f), (int) (byte) 0);
        boolean b82 = textPosition40.contains(textPosition81);
        float f83 = textPosition81.getX();
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(set_entry_cOSName_cOSBase5);
        org.junit.Assert.assertTrue(i7 == 3);
        org.junit.Assert.assertNotNull(matrix12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue(f15 == 0.0f);
        org.junit.Assert.assertNotNull(cOSStream21);
        org.junit.Assert.assertNotNull(outputStream22);
        org.junit.Assert.assertNotNull(matrix24);
        org.junit.Assert.assertNotNull(matrix25);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(pDType1Font36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "PDType1Font Helvetica-Bold" + "'", str37.equals("PDType1Font Helvetica-Bold"));
        org.junit.Assert.assertNotNull(cOSDictionary45);
        org.junit.Assert.assertNotNull(set_entry_cOSName_cOSBase46);
        org.junit.Assert.assertTrue(i48 == 3);
        org.junit.Assert.assertNotNull(matrix53);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertTrue(f56 == 0.0f);
        org.junit.Assert.assertNotNull(cOSStream62);
        org.junit.Assert.assertNotNull(outputStream63);
        org.junit.Assert.assertNotNull(matrix65);
        org.junit.Assert.assertNotNull(matrix66);
        org.junit.Assert.assertNotNull(i_array76);
        org.junit.Assert.assertNotNull(pDType1Font77);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "PDType1Font Helvetica-Bold" + "'", str78.equals("PDType1Font Helvetica-Bold"));
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(f83 == 0.0f);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test273");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationText pDAnnotationText0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationText();
        pDAnnotationText0.setName(".notdef");
        pDAnnotationText0.setAppearanceState("5B");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test274");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.SIZE;
        java.util.Calendar calendar8 = null;
        java.util.Calendar calendar9 = cOSDictionary1.getEmbeddedDate("BlockQuote", cOSName7, calendar8);
        org.apache.pdfbox.pdmodel.fdf.FDFField fDFField10 = new org.apache.pdfbox.pdmodel.fdf.FDFField(cOSDictionary1);
        java.lang.Integer i11 = fDFField10.getClearWidgetFieldFlags();
        org.apache.pdfbox.pdmodel.fdf.FDFNamedPageReference fDFNamedPageReference12 = fDFField10.getAppearanceStreamReference();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNull(calendar9);
        org.junit.Assert.assertNull(i11);
        org.junit.Assert.assertNull(fDFNamedPageReference12);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test275");
        org.apache.pdfbox.text.PDFTextStripper pDFTextStripper0 = new org.apache.pdfbox.text.PDFTextStripper();
        java.lang.String str1 = pDFTextStripper0.getWordSeparator();
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem pDOutlineItem2 = null;
        pDFTextStripper0.setStartBookmark(pDOutlineItem2);
        java.lang.String str4 = pDFTextStripper0.getLineSeparator();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + " " + "'", str1.equals(" "));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\n" + "'", str4.equals("\n"));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test276");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode pDStructureNode1 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement pDStructureElement2 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement("O=TD, Padding=10.0, LineHeight=Normal", pDStructureNode1);
        pDStructureElement2.setRevisionNumber(100);
        pDStructureElement2.incrementRevisionNumber();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject7 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject7.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary10 = pDExportFormatAttributeObject7.getCOSObject();
        int i12 = cOSDictionary10.getInt("Expired");
        org.apache.pdfbox.cos.COSName cOSName13 = org.apache.pdfbox.cos.COSName.A;
        cOSDictionary10.setInt(cOSName13, 100);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo pDActionGoTo16 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo(cOSDictionary10);
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkedContentReference pDMarkedContentReference17 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkedContentReference(cOSDictionary10);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm18 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDComboBox pDComboBox19 = new org.apache.pdfbox.pdmodel.interactive.form.PDComboBox(pDAcroForm18);
        int i20 = pDComboBox19.getFieldFlags();
        java.util.List<java.lang.String> list_str21 = pDComboBox19.getOptionsDisplayValues();
        pDStructureElement2.insertBefore(pDMarkedContentReference17, (java.lang.Object) pDComboBox19);
        int i23 = pDMarkedContentReference17.getMCID();
        org.junit.Assert.assertNotNull(cOSDictionary10);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertNotNull(cOSName13);
        org.junit.Assert.assertTrue(i20 == 131072);
        org.junit.Assert.assertNotNull(list_str21);
        org.junit.Assert.assertTrue(i23 == (-1));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test277");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode pDStructureNode1 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement pDStructureElement2 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement("O=TD, Padding=10.0, LineHeight=Normal", pDStructureNode1);
        pDStructureElement2.setRevisionNumber(100);
        org.apache.pdfbox.pdmodel.PDPage pDPage5 = pDStructureElement2.getPage();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode pDStructureNode7 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement pDStructureElement8 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement("O=TD, Padding=10.0, LineHeight=Normal", pDStructureNode7);
        pDStructureElement8.setRevisionNumber(100);
        java.lang.String str11 = pDStructureElement8.getExpandedForm();
        java.util.List<java.lang.Object> list_obj12 = pDStructureElement8.getKids();
        pDStructureElement2.setKids(list_obj12);
        org.junit.Assert.assertNull(pDPage5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(list_obj12);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test278");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument4 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile5 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument4);
        pDDocument4.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata8 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument4);
        org.apache.pdfbox.cos.COSStream cOSStream9 = pDMetadata8.getCOSObject();
        java.io.OutputStream outputStream10 = cOSStream9.createFilteredStream();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream11 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream9);
        org.apache.pdfbox.pdmodel.common.PDStream pDStream12 = pDAppearanceStream11.getContentStream();
        org.apache.pdfbox.io.RandomAccessWrite randomAccessWrite13 = null;
        org.apache.pdfbox.io.RandomAccessOutputStream randomAccessOutputStream14 = new org.apache.pdfbox.io.RandomAccessOutputStream(randomAccessWrite13);
        randomAccessOutputStream14.flush();
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream16 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream((java.io.OutputStream) randomAccessOutputStream14);
        org.apache.pdfbox.pdmodel.PDPageContentStream pDPageContentStream17 = new org.apache.pdfbox.pdmodel.PDPageContentStream(pDDocument0, pDAppearanceStream11, (java.io.OutputStream) cOSStandardOutputStream16);
        try {
            pDPageContentStream17.moveTo(0.0f, (float) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test279");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject.ROLE_TV;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "tv" + "'", str0.equals("tv"));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test280");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata4 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument0);
        org.apache.pdfbox.cos.COSStream cOSStream5 = pDMetadata4.getCOSObject();
        java.io.OutputStream outputStream6 = cOSStream5.createFilteredStream();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream7 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream5);
        org.apache.pdfbox.pdmodel.common.PDStream pDStream8 = pDAppearanceStream7.getContentStream();
        try {
            org.apache.pdfbox.pdfparser.PDFStreamParser pDFStreamParser9 = new org.apache.pdfbox.pdfparser.PDFStreamParser((org.apache.pdfbox.contentstream.PDContentStream) pDAppearanceStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream5);
        org.junit.Assert.assertNotNull(outputStream6);
        org.junit.Assert.assertNotNull(pDStream8);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test282");
        org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState pDExtendedGraphicsState0 = new org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState();
        boolean b1 = pDExtendedGraphicsState0.getNonStrokingOverprintControl();
        java.lang.Float f2 = pDExtendedGraphicsState0.getNonStrokingAlphaConstant();
        org.apache.pdfbox.cos.COSBase cOSBase3 = null;
        pDExtendedGraphicsState0.setTransfer(cOSBase3);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(f2);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test283");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue pDSeedValue0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue();
        pDSeedValue0.setSubFilterRequired(false);
        pDSeedValue0.setFilterRequired(true);
        boolean b5 = pDSeedValue0.isReasonRequired();
        boolean b6 = pDSeedValue0.isLegalAttestationRequired();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test284");
        org.apache.pdfbox.cos.COSInteger cOSInteger0 = org.apache.pdfbox.cos.COSNumber.ONE;
        org.apache.pdfbox.cos.ICOSVisitor iCOSVisitor1 = null;
        try {
            java.lang.Object obj2 = cOSInteger0.accept(iCOSVisitor1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSInteger0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test285");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle1 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage2 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle1);
        int i3 = pDPageTree0.indexOf(pDPage2);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream4 = pDPage2.getContentStreams();
        org.apache.pdfbox.pdmodel.PDResources pDResources5 = pDPage2.getResources();
        java.util.List<org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDThreadBead> list_pDThreadBead6 = pDPage2.getThreadBeads();
        pDPage2.setStructParents((int) (short) 10);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertNotNull(iterator_pDStream4);
        org.junit.Assert.assertNull(pDResources5);
        org.junit.Assert.assertNotNull(list_pDThreadBead6);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test286");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition2 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle pDAnnotationSquareCircle3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderEffectDictionary pDBorderEffectDictionary4 = pDAnnotationSquareCircle3.getBorderEffect();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNull(pDBorderEffectDictionary4);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test287");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        org.apache.pdfbox.cos.COSDocument cOSDocument2 = pDDocument0.getDocument();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree3 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDPageTree3.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode5 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary4);
        cOSDictionary4.setString("BlockQuote", "hi!");
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey9 = cOSDocument2.getKey((org.apache.pdfbox.cos.COSBase) cOSDictionary4);
        boolean b10 = cOSDocument2.isXRefStream();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument11 = new org.apache.pdfbox.pdmodel.PDDocument(cOSDocument2);
        org.apache.pdfbox.cos.COSStream cOSStream12 = cOSDocument2.createCOSStream();
        cOSStream12.close();
        org.apache.pdfbox.pdmodel.DefaultResourceCache defaultResourceCache14 = new org.apache.pdfbox.pdmodel.DefaultResourceCache();
        org.apache.pdfbox.cos.COSObject cOSObject15 = null;
        org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState pDExtendedGraphicsState16 = null;
        defaultResourceCache14.put(cOSObject15, pDExtendedGraphicsState16);
        org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject pDFormXObject18 = new org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject(cOSStream12, (org.apache.pdfbox.pdmodel.ResourceCache) defaultResourceCache14);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument19 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile20 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument19);
        org.apache.pdfbox.cos.COSDocument cOSDocument21 = pDDocument19.getDocument();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree22 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary23 = pDPageTree22.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode24 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary23);
        cOSDictionary23.setString("BlockQuote", "hi!");
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey28 = cOSDocument21.getKey((org.apache.pdfbox.cos.COSBase) cOSDictionary23);
        boolean b29 = cOSDocument21.isXRefStream();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument30 = new org.apache.pdfbox.pdmodel.PDDocument(cOSDocument21);
        org.apache.pdfbox.pdfparser.XrefTrailerResolver xrefTrailerResolver31 = null;
        org.apache.pdfbox.pdfparser.PDFXrefStreamParser pDFXrefStreamParser32 = new org.apache.pdfbox.pdfparser.PDFXrefStreamParser(cOSStream12, cOSDocument21, xrefTrailerResolver31);
        org.junit.Assert.assertNotNull(cOSDocument2);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNull(cOSObjectKey9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(cOSStream12);
        org.junit.Assert.assertNotNull(cOSDocument21);
        org.junit.Assert.assertNotNull(cOSDictionary23);
        org.junit.Assert.assertNull(cOSObjectKey28);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test288");
        org.apache.pdfbox.util.Matrix matrix0 = new org.apache.pdfbox.util.Matrix();
        java.awt.geom.Point2D.Float float3 = matrix0.transformPoint((float) (byte) 10, 12000.0f);
        float f4 = matrix0.getTranslateX();
        float f5 = matrix0.getYPosition();
        org.apache.pdfbox.util.Vector vector6 = null;
        try {
            org.apache.pdfbox.util.Vector vector7 = matrix0.transform(vector6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(float3);
        org.junit.Assert.assertTrue(f4 == 0.0f);
        org.junit.Assert.assertTrue(f5 == 0.0f);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test289");
        org.apache.pdfbox.pdmodel.PDStructureElementNameTreeNode pDStructureElementNameTreeNode0 = new org.apache.pdfbox.pdmodel.PDStructureElementNameTreeNode();
        boolean b1 = pDStructureElementNameTreeNode0.isRootNode();
        java.util.List<org.apache.pdfbox.pdmodel.common.PDNameTreeNode<org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement>> list_pdnametreenode_pDStructureElement2 = pDStructureElementNameTreeNode0.getKids();
        org.apache.pdfbox.pdmodel.common.PDNameTreeNode<org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement> pdnametreenode_pDStructureElement3 = pDStructureElementNameTreeNode0.getParent();
        java.util.Map<java.lang.String, org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement> map_str_pDStructureElement4 = pDStructureElementNameTreeNode0.getNames();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(list_pdnametreenode_pDStructureElement2);
        org.junit.Assert.assertNull(pdnametreenode_pDStructureElement3);
        org.junit.Assert.assertNull(map_str_pDStructureElement4);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test290");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_6 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary1);
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation7 = new org.apache.pdfbox.pdmodel.PDDocumentInformation(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams pDWindowsLaunchParams8 = new org.apache.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuild pDPropBuild9 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuild(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuildDataDict pDPropBuildDataDict10 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuildDataDict();
        pDPropBuildDataDict10.setTrustedMode(true);
        pDPropBuild9.setPDPropBuildFilter(pDPropBuildDataDict10);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree14 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary15 = pDPageTree14.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject16 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty17 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary15, pDUserAttributeObject16);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent18 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary15);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit19 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary15);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_20 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary15);
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation21 = new org.apache.pdfbox.pdmodel.PDDocumentInformation(cOSDictionary15);
        org.apache.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams pDWindowsLaunchParams22 = new org.apache.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams(cOSDictionary15);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuild pDPropBuild23 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuild(cOSDictionary15);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuildDataDict pDPropBuildDataDict24 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuildDataDict();
        pDPropBuildDataDict24.setTrustedMode(true);
        pDPropBuild23.setPDPropBuildFilter(pDPropBuildDataDict24);
        pDPropBuild9.setPDPropBuildPubSec(pDPropBuildDataDict24);
        boolean b29 = pDPropBuildDataDict24.getPreRelease();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary30 = pDPropBuildDataDict24.getCOSObject();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary15);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(cOSDictionary30);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test291");
        org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary pDRectlinearMeasureDictionary0 = new org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary();
        org.apache.pdfbox.pdmodel.interactive.measurement.PDNumberFormatDictionary[] pDNumberFormatDictionary_array1 = pDRectlinearMeasureDictionary0.getChangeYs();
        org.junit.Assert.assertNull(pDNumberFormatDictionary_array1);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test292");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        pDExportFormatAttributeObject1.setLineHeightNormal();
        float f5 = pDExportFormatAttributeObject1.getStartIndent();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup7 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup("hi!");
        float[] f_array11 = new float[] { (short) 1, '#', 100L };
        org.apache.pdfbox.cos.COSName cOSName12 = org.apache.pdfbox.cos.COSName.PAGE_LAYOUT;
        org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace13 = null;
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor14 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array11, cOSName12, pDColorSpace13);
        pDAnnotationTextMarkup7.setQuadPoints(f_array11);
        pDExportFormatAttributeObject1.setColumnGaps(f_array11);
        org.junit.Assert.assertTrue(f5 == 0.0f);
        org.junit.Assert.assertNotNull(f_array11);
        org.junit.Assert.assertNotNull(cOSName12);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test293");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode2 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern pDTilingPattern3 = new org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern(cOSDictionary1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = pDTilingPattern3.getBBox();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject6 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject6.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary9 = pDExportFormatAttributeObject6.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName11 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary9.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName11, (int) (short) 0);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache14 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources15 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary9, resourceCache14);
        java.lang.Iterable<org.apache.pdfbox.cos.COSName> iterable_cOSName16 = pDResources15.getPropertiesNames();
        org.apache.pdfbox.cos.COSName cOSName17 = org.apache.pdfbox.cos.COSName.EMPTY;
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree18 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary19 = pDPageTree18.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject20 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty21 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary19, pDUserAttributeObject20);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent22 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary19);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit23 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary19);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_24 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary19);
        pDResources15.put(cOSName17, (org.apache.pdfbox.pdmodel.graphics.shading.PDShading) pDShadingType1_24);
        org.apache.pdfbox.cos.COSName cOSName26 = org.apache.pdfbox.cos.COSName.URL;
        org.apache.pdfbox.pdmodel.graphics.color.PDSeparation pDSeparation27 = new org.apache.pdfbox.pdmodel.graphics.color.PDSeparation();
        pDResources15.put(cOSName26, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDSeparation27);
        org.apache.pdfbox.cos.COSName cOSName29 = org.apache.pdfbox.cos.COSName.TR;
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font30 = org.apache.pdfbox.pdmodel.font.PDType1Font.HELVETICA;
        pDResources15.put(cOSName29, (org.apache.pdfbox.pdmodel.font.PDFont) pDType1Font30);
        pDTilingPattern3.setResources(pDResources15);
        pDTilingPattern3.setTilingType((int) (byte) 1);
        pDTilingPattern3.setPaintType(4);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNull(pDRectangle4);
        org.junit.Assert.assertNotNull(cOSDictionary9);
        org.junit.Assert.assertNotNull(cOSName11);
        org.junit.Assert.assertNotNull(iterable_cOSName16);
        org.junit.Assert.assertNotNull(cOSName17);
        org.junit.Assert.assertNotNull(cOSDictionary19);
        org.junit.Assert.assertNotNull(cOSName26);
        org.junit.Assert.assertNotNull(cOSName29);
        org.junit.Assert.assertNotNull(pDType1Font30);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test294");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.HELVETICA_BOLD;
        java.lang.String str1 = pDType1Font0.getName();
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Helvetica-Bold" + "'", str1.equals("Helvetica-Bold"));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test295");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.PDDocumentCatalog pDDocumentCatalog4 = pDDocument0.getDocumentCatalog();
        java.lang.String str5 = pDDocumentCatalog4.getLanguage();
        java.lang.String str6 = pDDocumentCatalog4.getVersion();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree7 = pDDocumentCatalog4.getPages();
        org.junit.Assert.assertNotNull(pDDocumentCatalog4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.4" + "'", str6.equals("1.4"));
        org.junit.Assert.assertNotNull(pDPageTree7);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test296");
        org.apache.pdfbox.contentstream.operator.text.BeginText beginText0 = new org.apache.pdfbox.contentstream.operator.text.BeginText();
        java.lang.String str1 = beginText0.getName();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BT" + "'", str1.equals("BT"));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test297");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData pDActionImportData5 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData(cOSDictionary1);
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.EMPTY;
        int i9 = cOSDictionary1.getEmbeddedInt("hi!", cOSName7, 10);
        org.apache.pdfbox.pdmodel.font.PDType1CFont pDType1CFont10 = new org.apache.pdfbox.pdmodel.font.PDType1CFont(cOSDictionary1);
        boolean b11 = pDType1CFont10.isDamaged();
        boolean b13 = pDType1CFont10.hasGlyph("");
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test298");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_6 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary1);
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation7 = new org.apache.pdfbox.pdmodel.PDDocumentInformation(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams pDWindowsLaunchParams8 = new org.apache.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuild pDPropBuild9 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuild(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNAttributes pDDeviceNAttributes10 = new org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNAttributes(cOSDictionary1);
        java.util.Map<java.lang.String, org.apache.pdfbox.pdmodel.graphics.color.PDSeparation> map_str_pDSeparation11 = pDDeviceNAttributes10.getColorants();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(map_str_pDSeparation11);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test299");
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting2 = org.apache.pdfbox.io.MemoryUsageSetting.setupMixed((long) (short) 1, (long) (short) 1);
        org.junit.Assert.assertNotNull(memoryUsageSetting2);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test300");
        java.awt.geom.AffineTransform affineTransform0 = null;
        try {
            org.apache.pdfbox.util.Matrix matrix1 = new org.apache.pdfbox.util.Matrix(affineTransform0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test302");
        java.util.Calendar calendar1 = org.apache.pdfbox.util.DateConverter.toCalendar("Helvetica-Bold");
        org.junit.Assert.assertNull(calendar1);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test303");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        cOSDictionary1.setString("Highlight", "Start");
        java.lang.String str5 = cOSDictionary1.toString();
        org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions pDFormFieldAdditionalActions6 = new org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionURI pDActionURI7 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionURI();
        java.lang.String str8 = pDActionURI7.getURI();
        pDFormFieldAdditionalActions6.setF((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionURI7);
        boolean b10 = pDActionURI7.shouldTrackMousePosition();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "COSDictionary{COSName{Type}:COSName{Pages};COSName{Kids}:COSArray{[]};COSName{Count}:COSInt{0};COSName{Highlight}:COSString{Start};}" + "'", str5.equals("COSDictionary{COSName{Type}:COSName{Pages};COSName{Kids}:COSArray{[]};COSName{Count}:COSInt{0};COSName{Highlight}:COSString{Start};}"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test304");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.AS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test305");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree3 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDPageTree3.getCOSObject();
        java.util.Set<java.util.Map.Entry<org.apache.pdfbox.cos.COSName, org.apache.pdfbox.cos.COSBase>> set_entry_cOSName_cOSBase5 = cOSDictionary4.entrySet();
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_6 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary4);
        int i7 = pDShadingType3_6.getShadingType();
        pDShadingType3_6.setAntiAlias(true);
        org.apache.pdfbox.util.Matrix matrix12 = org.apache.pdfbox.util.Matrix.getTranslateInstance(100.0f, (float) 5);
        java.awt.Paint paint13 = pDShadingType3_6.toPaint(matrix12);
        org.apache.pdfbox.util.Matrix matrix14 = new org.apache.pdfbox.util.Matrix();
        float f15 = matrix14.getShearY();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument16 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile17 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument16);
        pDDocument16.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata20 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument16);
        org.apache.pdfbox.cos.COSStream cOSStream21 = pDMetadata20.getCOSObject();
        java.io.OutputStream outputStream22 = cOSStream21.createFilteredStream();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream23 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream21);
        org.apache.pdfbox.util.Matrix matrix24 = pDAppearanceStream23.getMatrix();
        org.apache.pdfbox.util.Matrix matrix25 = matrix12.multiply(matrix14, matrix24);
        int[] i_array35 = new int[] { (byte) 0, (byte) 10, (short) -1 };
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font36 = org.apache.pdfbox.pdmodel.font.PDType1Font.HELVETICA_BOLD;
        java.lang.String str37 = pDType1Font36.toString();
        org.apache.pdfbox.text.TextPosition textPosition40 = new org.apache.pdfbox.text.TextPosition((int) '4', (float) (byte) -1, 2383.937f, matrix12, (float) (short) 1, (float) '4', (float) (-1L), (float) 0, (float) (short) -1, "COSInt{3}", i_array35, (org.apache.pdfbox.pdmodel.font.PDFont) pDType1Font36, (-1.0f), (int) (byte) 0);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree41 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary42 = pDPageTree41.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions43 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary42);
        org.apache.pdfbox.cos.COSName cOSName45 = org.apache.pdfbox.cos.COSName.CROP_BOX;
        java.lang.String str46 = cOSDictionary42.getEmbeddedString("Overline", cOSName45);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch pDActionLaunch47 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch(cOSDictionary42);
        org.apache.pdfbox.pdmodel.interactive.measurement.PDViewportDictionary pDViewportDictionary48 = new org.apache.pdfbox.pdmodel.interactive.measurement.PDViewportDictionary(cOSDictionary42);
        org.apache.pdfbox.pdmodel.interactive.measurement.PDMeasureDictionary pDMeasureDictionary49 = pDViewportDictionary48.getMeasure();
        boolean b50 = textPosition40.equals((java.lang.Object) pDMeasureDictionary49);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(set_entry_cOSName_cOSBase5);
        org.junit.Assert.assertTrue(i7 == 3);
        org.junit.Assert.assertNotNull(matrix12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue(f15 == 0.0f);
        org.junit.Assert.assertNotNull(cOSStream21);
        org.junit.Assert.assertNotNull(outputStream22);
        org.junit.Assert.assertNotNull(matrix24);
        org.junit.Assert.assertNotNull(matrix25);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(pDType1Font36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "PDType1Font Helvetica-Bold" + "'", str37.equals("PDType1Font Helvetica-Bold"));
        org.junit.Assert.assertNotNull(cOSDictionary42);
        org.junit.Assert.assertNotNull(cOSName45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(pDMeasureDictionary49);
        org.junit.Assert.assertTrue(b50 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test306");
        org.apache.pdfbox.contentstream.operator.graphics.FillEvenOddAndStrokePath fillEvenOddAndStrokePath0 = new org.apache.pdfbox.contentstream.operator.graphics.FillEvenOddAndStrokePath();
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test307");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary4.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName6, (int) (short) 0);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache9 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources10 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary4, resourceCache9);
        org.apache.pdfbox.pdmodel.graphics.color.PDCalRGB pDCalRGB11 = new org.apache.pdfbox.pdmodel.graphics.color.PDCalRGB();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle12 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray13 = pDRectangle12.getCOSArray();
        cOSArray13.clear();
        org.apache.pdfbox.cos.COSName cOSName16 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray13.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName16);
        org.apache.pdfbox.pdmodel.graphics.color.PDGamma pDGamma18 = new org.apache.pdfbox.pdmodel.graphics.color.PDGamma(cOSArray13);
        pDCalRGB11.setGamma(pDGamma18);
        float[] f_array21 = pDCalRGB11.getDefaultDecode((int) (byte) 0);
        java.lang.String str22 = pDCalRGB11.getName();
        org.apache.pdfbox.pdmodel.graphics.color.PDPattern pDPattern23 = new org.apache.pdfbox.pdmodel.graphics.color.PDPattern(pDResources10, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDCalRGB11);
        org.apache.pdfbox.cos.COSName cOSName24 = org.apache.pdfbox.cos.COSName.AIS;
        org.apache.pdfbox.pdmodel.PDDocument pDDocument25 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.printing.Scaling scaling26 = org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable30 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument25, scaling26, true, 1.0f, false);
        org.apache.pdfbox.pdmodel.DefaultResourceCache defaultResourceCache31 = new org.apache.pdfbox.pdmodel.DefaultResourceCache();
        pDDocument25.setResourceCache((org.apache.pdfbox.pdmodel.ResourceCache) defaultResourceCache31);
        org.apache.pdfbox.cos.COSObject cOSObject33 = null;
        org.apache.pdfbox.pdmodel.PDDocument pDDocument34 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.printing.Scaling scaling35 = org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable39 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument34, scaling35, true, 1.0f, false);
        org.apache.pdfbox.printing.Scaling scaling40 = org.apache.pdfbox.printing.Scaling.STRETCH_TO_FIT;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable43 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument34, scaling40, false, (float) 1L);
        org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject pDFormXObject44 = new org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject(pDDocument34);
        int i45 = pDFormXObject44.getFormType();
        defaultResourceCache31.put(cOSObject33, (org.apache.pdfbox.pdmodel.graphics.PDXObject) pDFormXObject44);
        org.apache.pdfbox.pdmodel.PDResources pDResources47 = pDFormXObject44.getResources();
        pDResources10.put(cOSName24, (org.apache.pdfbox.pdmodel.graphics.PDXObject) pDFormXObject44);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(pDRectangle12);
        org.junit.Assert.assertNotNull(cOSArray13);
        org.junit.Assert.assertNotNull(cOSName16);
        org.junit.Assert.assertNotNull(f_array21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "CalRGB" + "'", str22.equals("CalRGB"));
        org.junit.Assert.assertNotNull(cOSName24);
        org.junit.Assert.assertTrue("'" + scaling26 + "' != '" + org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT + "'", scaling26.equals(org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT));
        org.junit.Assert.assertTrue("'" + scaling35 + "' != '" + org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT + "'", scaling35.equals(org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT));
        org.junit.Assert.assertTrue("'" + scaling40 + "' != '" + org.apache.pdfbox.printing.Scaling.STRETCH_TO_FIT + "'", scaling40.equals(org.apache.pdfbox.printing.Scaling.STRETCH_TO_FIT));
        org.junit.Assert.assertTrue(i45 == 1);
        org.junit.Assert.assertNull(pDResources47);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test308");
        org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties pDOptionalContentProperties0 = new org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties();
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test309");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata4 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument0);
        org.apache.pdfbox.cos.COSStream cOSStream5 = pDMetadata4.getCOSObject();
        java.io.OutputStream outputStream6 = cOSStream5.createFilteredStream();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream7 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream5);
        org.apache.pdfbox.pdmodel.common.PDStream pDStream8 = pDAppearanceStream7.getContentStream();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject10 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject10.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary13 = pDExportFormatAttributeObject10.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName15 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary13.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName15, (int) (short) 0);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache18 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources19 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary13, resourceCache18);
        org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject pDFormXObject20 = null;
        org.apache.pdfbox.cos.COSName cOSName21 = pDResources19.add(pDFormXObject20);
        java.lang.Iterable<org.apache.pdfbox.cos.COSName> iterable_cOSName22 = pDResources19.getColorSpaceNames();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree23 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary24 = pDPageTree23.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions25 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary24);
        org.apache.pdfbox.cos.COSName cOSName27 = org.apache.pdfbox.cos.COSName.CROP_BOX;
        java.lang.String str28 = cOSDictionary24.getEmbeddedString("Overline", cOSName27);
        boolean b29 = pDResources19.hasColorSpace(cOSName27);
        pDAppearanceStream7.setResources(pDResources19);
        org.apache.pdfbox.io.RandomAccessWrite randomAccessWrite31 = null;
        org.apache.pdfbox.io.RandomAccessOutputStream randomAccessOutputStream32 = new org.apache.pdfbox.io.RandomAccessOutputStream(randomAccessWrite31);
        randomAccessOutputStream32.flush();
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream34 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream((java.io.OutputStream) randomAccessOutputStream32);
        long long35 = cOSStandardOutputStream34.getPos();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream pDAppearanceContentStream36 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream(pDAppearanceStream7, (java.io.OutputStream) cOSStandardOutputStream34);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject38 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject38.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary41 = pDExportFormatAttributeObject38.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName43 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary41.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName43, (int) (short) 0);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache46 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources47 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary41, resourceCache46);
        java.lang.Iterable<org.apache.pdfbox.cos.COSName> iterable_cOSName48 = pDResources47.getPropertiesNames();
        org.apache.pdfbox.cos.COSName cOSName49 = org.apache.pdfbox.cos.COSName.EMPTY;
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree50 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary51 = pDPageTree50.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject52 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty53 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary51, pDUserAttributeObject52);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent54 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary51);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit55 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary51);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_56 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary51);
        pDResources47.put(cOSName49, (org.apache.pdfbox.pdmodel.graphics.shading.PDShading) pDShadingType1_56);
        pDAppearanceContentStream36.setResources(pDResources47);
        try {
            pDAppearanceContentStream36.moveTo((float) (short) 0, (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream5);
        org.junit.Assert.assertNotNull(outputStream6);
        org.junit.Assert.assertNotNull(pDStream8);
        org.junit.Assert.assertNotNull(cOSDictionary13);
        org.junit.Assert.assertNotNull(cOSName15);
        org.junit.Assert.assertNotNull(cOSName21);
        org.junit.Assert.assertNotNull(iterable_cOSName22);
        org.junit.Assert.assertNotNull(cOSDictionary24);
        org.junit.Assert.assertNotNull(cOSName27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(long35 == 0L);
        org.junit.Assert.assertNotNull(cOSDictionary41);
        org.junit.Assert.assertNotNull(cOSName43);
        org.junit.Assert.assertNotNull(iterable_cOSName48);
        org.junit.Assert.assertNotNull(cOSName49);
        org.junit.Assert.assertNotNull(cOSDictionary51);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test310");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties pDVisibleSigProperties0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties();
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner pDVisibleSignDesigner1 = pDVisibleSigProperties0.getPdVisibleSignature();
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner pDVisibleSignDesigner2 = null;
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties pDVisibleSigProperties3 = pDVisibleSigProperties0.setPdVisibleSignature(pDVisibleSignDesigner2);
        try {
            pDVisibleSigProperties3.buildSignature();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(pDVisibleSignDesigner1);
        org.junit.Assert.assertNotNull(pDVisibleSigProperties3);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test311");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        org.apache.pdfbox.cos.COSDocument cOSDocument2 = pDDocument0.getDocument();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree3 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDPageTree3.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode5 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary4);
        cOSDictionary4.setString("BlockQuote", "hi!");
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey9 = cOSDocument2.getKey((org.apache.pdfbox.cos.COSBase) cOSDictionary4);
        boolean b10 = cOSDocument2.isXRefStream();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument11 = new org.apache.pdfbox.pdmodel.PDDocument(cOSDocument2);
        org.apache.pdfbox.pdmodel.PDPage pDPage12 = new org.apache.pdfbox.pdmodel.PDPage();
        pDDocument11.addPage(pDPage12);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree14 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle15 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage16 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle15);
        int i17 = pDPageTree14.indexOf(pDPage16);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream18 = pDPage16.getContentStreams();
        org.apache.pdfbox.pdmodel.PDResources pDResources19 = pDPage16.getResources();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree20 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary21 = pDPageTree20.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition22 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary21);
        org.apache.pdfbox.cos.COSBase cOSBase23 = pDTransition22.getDirection();
        pDPage16.setTransition(pDTransition22, (float) (short) 1);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree26 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary27 = pDPageTree26.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition28 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary27);
        pDPage16.setTransition(pDTransition28);
        java.io.InputStream inputStream30 = pDPage16.getContents();
        org.apache.pdfbox.cos.COSName cOSName31 = null;
        org.apache.pdfbox.pdmodel.common.PDStream pDStream32 = new org.apache.pdfbox.pdmodel.common.PDStream(pDDocument11, inputStream30, cOSName31);
        org.junit.Assert.assertNotNull(cOSDocument2);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNull(cOSObjectKey9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertNotNull(iterator_pDStream18);
        org.junit.Assert.assertNull(pDResources19);
        org.junit.Assert.assertNotNull(cOSDictionary21);
        org.junit.Assert.assertNotNull(cOSBase23);
        org.junit.Assert.assertNotNull(cOSDictionary27);
        org.junit.Assert.assertNotNull(inputStream30);
    }
}
