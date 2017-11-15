import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test001");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ADOBE_PPKLITE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test002");
        org.apache.pdfbox.pdmodel.font.FontCache fontCache0 = new org.apache.pdfbox.pdmodel.font.FontCache();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test003");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDComboBox pDComboBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDComboBox(pDAcroForm0);
        pDComboBox1.setEdit(true);
        java.util.List<java.lang.String> list_str4 = pDComboBox1.getOptions();
        boolean b5 = pDComboBox1.isNoExport();
        boolean b6 = pDComboBox1.isSort();
        org.junit.Assert.assertNotNull(list_str4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test004");
        org.apache.pdfbox.printing.Orientation orientation0 = org.apache.pdfbox.printing.Orientation.LANDSCAPE;
        org.junit.Assert.assertTrue("'" + orientation0 + "' != '" + org.apache.pdfbox.printing.Orientation.LANDSCAPE + "'", orientation0.equals(org.apache.pdfbox.printing.Orientation.LANDSCAPE));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test005");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.COURIER_BOLD_OBLIQUE;
        float f2 = pDType1Font0.getStringWidth("AbsoluteColorimetric");
        try {
            org.apache.pdfbox.util.Vector vector4 = pDType1Font0.getPositionVector((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertTrue(f2 == 12000.0f);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test006");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary1 = null;
        pDAnnotationLine0.setBorderStyle(pDBorderStyleDictionary1);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDExternalDataDictionary pDExternalDataDictionary3 = pDAnnotationLine0.getExternalData();
        boolean b4 = pDAnnotationLine0.isHidden();
        java.lang.String str5 = pDAnnotationLine0.getCaptionPositioning();
        pDAnnotationLine0.setContents("PDType1Font Helvetica-Bold");
        org.junit.Assert.assertNull(pDExternalDataDictionary3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test007");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata4 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument0);
        org.apache.pdfbox.cos.COSStream cOSStream5 = pDMetadata4.getCOSObject();
        java.io.OutputStream outputStream6 = cOSStream5.createFilteredStream();
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType2 pDShadingType2_7 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType2((org.apache.pdfbox.cos.COSDictionary) cOSStream5);
        org.apache.pdfbox.cos.COSArray cOSArray8 = pDShadingType2_7.getExtend();
        org.junit.Assert.assertNotNull(cOSStream5);
        org.junit.Assert.assertNotNull(outputStream6);
        org.junit.Assert.assertNull(cOSArray8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test008");
        org.apache.pdfbox.util.filetypedetector.FileType fileType0 = org.apache.pdfbox.util.filetypedetector.FileType.PCX;
        org.junit.Assert.assertTrue("'" + fileType0 + "' != '" + org.apache.pdfbox.util.filetypedetector.FileType.PCX + "'", fileType0.equals(org.apache.pdfbox.util.filetypedetector.FileType.PCX));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test009");
        org.apache.pdfbox.contentstream.operator.color.SetNonStrokingDeviceGrayColor setNonStrokingDeviceGrayColor0 = new org.apache.pdfbox.contentstream.operator.color.SetNonStrokingDeviceGrayColor();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test010");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions signatureOptions0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions();
        java.io.File file1 = null;
        try {
            signatureOptions0.setVisualSignature(file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test011");
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting1 = org.apache.pdfbox.io.MemoryUsageSetting.setupMixed(10L);
        java.lang.String str2 = memoryUsageSetting1.toString();
        org.junit.Assert.assertNotNull(memoryUsageSetting1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Mixed mode with max. of 10 main memory bytes and unrestricted scratch file size" + "'", str2.equals("Mixed mode with max. of 10 main memory bytes and unrestricted scratch file size"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test012");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CID_FONT_TYPE2;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test013");
        byte[] byte_array0 = org.apache.pdfbox.cos.COSNull.NULL_BYTES;
        org.junit.Assert.assertNotNull(byte_array0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test014");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDFourColours pDFourColours2 = null;
        pDExportFormatAttributeObject1.setBorderColors(pDFourColours2);
        java.lang.Object obj4 = pDExportFormatAttributeObject1.getBorderThickness();
        pDExportFormatAttributeObject1.setListNumbering("Name=null, Value=null, FormattedValue=null, Hidden=false");
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test015");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DIGEST_SHA256;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test016");
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission1 = new org.apache.pdfbox.pdmodel.encryption.AccessPermission((int) (short) -1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test017");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray1 = pDRectangle0.getCOSArray();
        cOSArray1.clear();
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray1.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName4);
        org.apache.pdfbox.pdmodel.graphics.color.PDGamma pDGamma6 = new org.apache.pdfbox.pdmodel.graphics.color.PDGamma(cOSArray1);
        org.apache.pdfbox.pdmodel.fdf.FDFOptionElement fDFOptionElement7 = new org.apache.pdfbox.pdmodel.fdf.FDFOptionElement(cOSArray1);
        try {
            fDFOptionElement7.setDefaultAppearanceString("180");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle0);
        org.junit.Assert.assertNotNull(cOSArray1);
        org.junit.Assert.assertNotNull(cOSName4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test018");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary4.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName6, (int) (short) 0);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache9 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources10 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary4, resourceCache9);
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject11 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject(cOSDictionary4);
        java.util.Collection<org.apache.pdfbox.cos.COSBase> collection_cOSBase12 = cOSDictionary4.getValues();
        float f14 = cOSDictionary4.getFloat("TH");
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(collection_cOSBase12);
        org.junit.Assert.assertTrue(f14 == (-1.0f));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test019");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray1 = pDRectangle0.getCOSArray();
        cOSArray1.clear();
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitHeightDestination pDPageFitHeightDestination3 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitHeightDestination(cOSArray1);
        boolean b4 = cOSArray1.isNeedToBeUpdated();
        try {
            org.apache.pdfbox.pdmodel.graphics.color.PDDeviceN pDDeviceN5 = new org.apache.pdfbox.pdmodel.graphics.color.PDDeviceN(cOSArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle0);
        org.junit.Assert.assertNotNull(cOSArray1);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test020");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed.SUB_TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Named" + "'", str0.equals("Named"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test021");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationText.SUB_TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Text" + "'", str0.equals("Text"));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test022");
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
        java.io.OutputStream outputStream19 = pDPageContentStream17.getOutput();
        org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject pDFormXObject20 = null;
        try {
            pDPageContentStream17.drawForm(pDFormXObject20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
        org.junit.Assert.assertNotNull(outputStream19);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test023");
        org.apache.pdfbox.contentstream.operator.graphics.CurveTo curveTo0 = new org.apache.pdfbox.contentstream.operator.graphics.CurveTo();
        org.apache.pdfbox.contentstream.PDFStreamEngine pDFStreamEngine1 = null;
        curveTo0.setContext(pDFStreamEngine1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test024");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.MDP;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test025");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.K;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test026");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        org.apache.pdfbox.printing.PDFPageable pDFPageable1 = new org.apache.pdfbox.printing.PDFPageable(pDDocument0);
        try {
            int i2 = pDFPageable1.getNumberOfPages();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test027");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.TYPE1;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test028");
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
        pDDocument0.setDocumentId((java.lang.Long) 100L);
        org.apache.pdfbox.printing.Scaling scaling20 = org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable23 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument0, scaling20, true, (float) (short) -1);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree24 = pDDocument0.getPages();
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
        org.junit.Assert.assertTrue("'" + scaling20 + "' != '" + org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT + "'", scaling20.equals(org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT));
        org.junit.Assert.assertNotNull(pDPageTree24);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test029");
        char[] char_array1 = org.apache.pdfbox.util.Hex.getCharsUTF16BE("");
        org.junit.Assert.assertNotNull(char_array1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test030");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument1 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile2 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument1);
        pDDocument1.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata5 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument1);
        org.apache.pdfbox.cos.COSStream cOSStream6 = pDMetadata5.getCOSObject();
        java.io.OutputStream outputStream7 = cOSStream6.createFilteredStream();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream8 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream6);
        pDAppearanceDictionary0.setNormalAppearance(pDAppearanceStream8);
        int i10 = pDAppearanceStream8.getFormType();
        org.junit.Assert.assertNotNull(cOSStream6);
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test031");
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
        java.awt.Color color18 = null;
        try {
            pDPageContentStream17.setNonStrokingColor(color18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test032");
        org.w3c.dom.Element element0 = null;
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCircle fDFAnnotationCircle1 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCircle(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test033");
        java.io.File file0 = null;
        java.io.InputStream inputStream2 = null;
        try {
            org.apache.pdfbox.pdmodel.PDDocument pDDocument4 = org.apache.pdfbox.pdmodel.PDDocument.load(file0, "a", inputStream2, "Butt");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test034");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DOS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test035");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DR;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test036");
        org.apache.pdfbox.contentstream.operator.graphics.LegacyFillNonZeroRule legacyFillNonZeroRule0 = new org.apache.pdfbox.contentstream.operator.graphics.LegacyFillNonZeroRule();
        java.lang.String str1 = legacyFillNonZeroRule0.getName();
        java.lang.String str2 = legacyFillNonZeroRule0.getName();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "F" + "'", str1.equals("F"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "F" + "'", str2.equals("F"));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test037");
        org.apache.pdfbox.io.RandomAccessWrite randomAccessWrite0 = null;
        org.apache.pdfbox.io.RandomAccessOutputStream randomAccessOutputStream1 = new org.apache.pdfbox.io.RandomAccessOutputStream(randomAccessWrite0);
        randomAccessOutputStream1.flush();
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream3 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream((java.io.OutputStream) randomAccessOutputStream1);
        byte[] byte_array4 = org.apache.pdfbox.pdfwriter.COSWriter.STARTXREF;
        try {
            randomAccessOutputStream1.write(byte_array4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test038");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.action.PDActionSound.SUB_TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Sound" + "'", str0.equals("Sound"));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test039");
        org.apache.pdfbox.pdmodel.font.encoding.MacExpertEncoding macExpertEncoding0 = org.apache.pdfbox.pdmodel.font.encoding.MacExpertEncoding.INSTANCE;
        java.lang.String str1 = macExpertEncoding0.getEncodingName();
        org.junit.Assert.assertNotNull(macExpertEncoding0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "MacExpertEncoding" + "'", str1.equals("MacExpertEncoding"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test040");
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
        org.apache.pdfbox.io.RandomAccessWrite randomAccessWrite13 = null;
        org.apache.pdfbox.io.RandomAccessOutputStream randomAccessOutputStream14 = new org.apache.pdfbox.io.RandomAccessOutputStream(randomAccessWrite13);
        randomAccessOutputStream14.flush();
        randomAccessOutputStream14.close();
        randomAccessOutputStream14.flush();
        try {
            pDDocument12.saveIncremental((java.io.OutputStream) randomAccessOutputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(cOSDocument2);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNull(cOSObjectKey9);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test041");
        org.apache.pdfbox.pdmodel.interactive.measurement.PDViewportDictionary pDViewportDictionary0 = new org.apache.pdfbox.pdmodel.interactive.measurement.PDViewportDictionary();
        java.lang.String str1 = pDViewportDictionary0.getName();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test042");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        int i6 = cOSDictionary4.getInt("Expired");
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.A;
        cOSDictionary4.setInt(cOSName7, 100);
        java.lang.String str13 = cOSDictionary4.getEmbeddedString("Start", "UpperAlpha", "Name=null, Value=null, FormattedValue=null, Hidden=false");
        org.apache.pdfbox.cos.COSName cOSName14 = org.apache.pdfbox.cos.COSName.CREATION_DATE;
        cOSDictionary4.setString(cOSName14, "def");
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Name=null, Value=null, FormattedValue=null, Hidden=false" + "'", str13.equals("Name=null, Value=null, FormattedValue=null, Hidden=false"));
        org.junit.Assert.assertNotNull(cOSName14);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test043");
        org.apache.pdfbox.io.RandomAccessWrite randomAccessWrite0 = null;
        org.apache.pdfbox.io.RandomAccessOutputStream randomAccessOutputStream1 = new org.apache.pdfbox.io.RandomAccessOutputStream(randomAccessWrite0);
        randomAccessOutputStream1.flush();
        randomAccessOutputStream1.close();
        byte[] byte_array4 = org.apache.pdfbox.pdfwriter.COSWriter.ENDSTREAM;
        try {
            randomAccessOutputStream1.write(byte_array4, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array4);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test044");
        java.lang.String str1 = org.apache.pdfbox.util.Hex.getString((byte) -1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FF" + "'", str1.equals("FF"));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test045");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.action.PDActionResetForm.SUB_TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ResetForm" + "'", str0.equals("ResetForm"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test046");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.LINK;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Link" + "'", str0.equals("Link"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test047");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        int i6 = cOSDictionary4.getInt("Expired");
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.A;
        cOSDictionary4.setInt(cOSName7, 100);
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.OUTPUT_INTENT;
        org.apache.pdfbox.cos.COSBase cOSBase11 = cOSDictionary4.getItem(cOSName10);
        org.apache.pdfbox.cos.COSBase cOSBase13 = cOSDictionary4.getItem("Auto");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotation fDFAnnotation14 = org.apache.pdfbox.pdmodel.fdf.FDFAnnotation.create(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertNull(cOSBase11);
        org.junit.Assert.assertNull(cOSBase13);
        org.junit.Assert.assertNull(fDFAnnotation14);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test048");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode pDStructureNode1 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement pDStructureElement2 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement("O=TD, Padding=10.0, LineHeight=Normal", pDStructureNode1);
        java.lang.String str3 = pDStructureElement2.getType();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode pDStructureNode5 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement pDStructureElement6 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement("O=TD, Padding=10.0, LineHeight=Normal", pDStructureNode5);
        pDStructureElement6.setRevisionNumber(100);
        org.apache.pdfbox.pdmodel.PDPage pDPage9 = pDStructureElement6.getPage();
        boolean b10 = pDStructureElement2.removeKid(pDStructureElement6);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "StructElem" + "'", str3.equals("StructElem"));
        org.junit.Assert.assertNull(pDPage9);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test049");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_6 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationFileAttachment pDAnnotationFileAttachment7 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationFileAttachment(cOSDictionary1);
        java.lang.String str8 = pDAnnotationFileAttachment7.getAttachmentName();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument9 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile10 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument9);
        org.apache.pdfbox.cos.COSString cOSString11 = null;
        org.apache.pdfbox.pdmodel.common.filespecification.PDSimpleFileSpecification pDSimpleFileSpecification12 = new org.apache.pdfbox.pdmodel.common.filespecification.PDSimpleFileSpecification(cOSString11);
        pDEmbeddedFile10.setFile((org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification) pDSimpleFileSpecification12);
        pDAnnotationFileAttachment7.setFile((org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification) pDSimpleFileSpecification12);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup15 = null;
        pDAnnotationFileAttachment7.setPopup(pDAnnotationPopup15);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "PushPin" + "'", str8.equals("PushPin"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test050");
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
        java.lang.Float f14 = pDExtendedGraphicsState9.getFlatnessTolerance();
        org.junit.Assert.assertTrue("'" + scaling1 + "' != '" + org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT + "'", scaling1.equals(org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT));
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertNull(f14);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test051");
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
        java.io.OutputStream outputStream19 = pDPageContentStream17.getOutput();
        org.apache.pdfbox.util.Matrix matrix22 = org.apache.pdfbox.util.Matrix.getTranslateInstance(100.0f, (float) 5);
        try {
            pDPageContentStream17.setTextMatrix(matrix22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
        org.junit.Assert.assertNotNull(outputStream19);
        org.junit.Assert.assertNotNull(matrix22);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test052");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        try {
            org.apache.pdfbox.pdmodel.font.PDType3Font pDType3Font1 = new org.apache.pdfbox.pdmodel.font.PDType3Font(cOSDictionary0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test053");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        boolean b1 = fDFAnnotationFreeText0.isPrinted();
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test054");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode pDStructureNode1 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement pDStructureElement2 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement("O=TD, Padding=10.0, LineHeight=Normal", pDStructureNode1);
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDObjectReference pDObjectReference3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDObjectReference();
        pDStructureElement2.appendKid(pDObjectReference3);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary5 = pDObjectReference3.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition6 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary5);
        org.junit.Assert.assertNotNull(cOSDictionary5);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test055");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray1 = pDRectangle0.getCOSArray();
        cOSArray1.clear();
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray1.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName4);
        org.apache.pdfbox.pdmodel.graphics.color.PDGamma pDGamma6 = new org.apache.pdfbox.pdmodel.graphics.color.PDGamma(cOSArray1);
        org.apache.pdfbox.pdmodel.fdf.FDFOptionElement fDFOptionElement7 = new org.apache.pdfbox.pdmodel.fdf.FDFOptionElement(cOSArray1);
        org.apache.pdfbox.cos.COSBase cOSBase8 = fDFOptionElement7.getCOSObject();
        org.junit.Assert.assertNotNull(pDRectangle0);
        org.junit.Assert.assertNotNull(cOSArray1);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNotNull(cOSBase8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test056");
        org.apache.pdfbox.pdmodel.fdf.FDFDocument fDFDocument0 = new org.apache.pdfbox.pdmodel.fdf.FDFDocument();
        java.io.File file1 = null;
        try {
            fDFDocument0.saveXFDF(file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test057");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.LAST_CHAR;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test058");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DEST;
        org.apache.pdfbox.cos.ICOSVisitor iCOSVisitor1 = null;
        try {
            java.lang.Object obj2 = cOSName0.accept(iCOSVisitor1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test059");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ROOT;
        org.apache.pdfbox.pdmodel.interactive.form.PDXFAResource pDXFAResource1 = new org.apache.pdfbox.pdmodel.interactive.form.PDXFAResource((org.apache.pdfbox.cos.COSBase) cOSName0);
        try {
            org.w3c.dom.Document document2 = pDXFAResource1.getDocument();
            org.junit.Assert.fail("Expected exception of type org.xml.sax.SAXParseException");
        } catch (org.xml.sax.SAXParseException e) {
        }
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test060");
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
        java.awt.Color color18 = null;
        try {
            pDPageContentStream17.setStrokingColor(color18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test061");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.RESOURCES;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test062");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.IC;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test063");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata4 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument0);
        org.apache.pdfbox.cos.COSStream cOSStream5 = pDMetadata4.getCOSObject();
        java.io.OutputStream outputStream6 = cOSStream5.createFilteredStream();
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType2 pDShadingType2_7 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType2((org.apache.pdfbox.cos.COSDictionary) cOSStream5);
        org.apache.pdfbox.cos.COSName cOSName8 = org.apache.pdfbox.cos.COSName.CRYPT;
        int i9 = cOSStream5.getInt(cOSName8);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument10 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile11 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument10);
        org.apache.pdfbox.cos.COSDocument cOSDocument12 = pDDocument10.getDocument();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree13 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary14 = pDPageTree13.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode15 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary14);
        cOSDictionary14.setString("BlockQuote", "hi!");
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey19 = cOSDocument12.getKey((org.apache.pdfbox.cos.COSBase) cOSDictionary14);
        org.apache.pdfbox.pdfparser.XrefTrailerResolver xrefTrailerResolver20 = null;
        try {
            org.apache.pdfbox.pdfparser.PDFXrefStreamParser pDFXrefStreamParser21 = new org.apache.pdfbox.pdfparser.PDFXrefStreamParser(cOSStream5, cOSDocument12, xrefTrailerResolver20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream5);
        org.junit.Assert.assertNotNull(outputStream6);
        org.junit.Assert.assertNotNull(cOSName8);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNotNull(cOSDocument12);
        org.junit.Assert.assertNotNull(cOSDictionary14);
        org.junit.Assert.assertNull(cOSObjectKey19);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test064");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.PAGES;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test065");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        float[] f_array1 = fDFAnnotationFreeText0.getCallout();
        fDFAnnotationFreeText0.setDefaultAppearance("I");
        java.lang.String str4 = fDFAnnotationFreeText0.getLineEndingStyle();
        boolean b5 = fDFAnnotationFreeText0.isNoRotate();
        fDFAnnotationFreeText0.setOpacity((float) ' ');
        fDFAnnotationFreeText0.setPage((int) '#');
        org.junit.Assert.assertNull(f_array1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test066");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray1 = pDRectangle0.getCOSArray();
        cOSArray1.clear();
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray1.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName4);
        org.apache.pdfbox.pdmodel.graphics.color.PDGamma pDGamma6 = new org.apache.pdfbox.pdmodel.graphics.color.PDGamma(cOSArray1);
        try {
            org.apache.pdfbox.cos.COSBase cOSBase8 = cOSArray1.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle0);
        org.junit.Assert.assertNotNull(cOSArray1);
        org.junit.Assert.assertNotNull(cOSName4);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test068");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        int i6 = cOSDictionary4.getInt("Expired");
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.A;
        cOSDictionary4.setInt(cOSName7, 100);
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.OUTPUT_INTENT;
        org.apache.pdfbox.cos.COSBase cOSBase11 = cOSDictionary4.getItem(cOSName10);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceCharacteristicsDictionary pDAppearanceCharacteristicsDictionary12 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceCharacteristicsDictionary(cOSDictionary4);
        org.apache.pdfbox.cos.COSName cOSName14 = org.apache.pdfbox.cos.COSName.DA;
        java.util.Calendar calendar15 = null;
        java.util.Calendar calendar16 = cOSDictionary4.getEmbeddedDate("Both", cOSName14, calendar15);
        org.apache.pdfbox.cos.COSName cOSName17 = org.apache.pdfbox.cos.COSName.APP;
        cOSDictionary4.setFlag(cOSName17, (int) (short) 0, true);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertNull(cOSBase11);
        org.junit.Assert.assertNotNull(cOSName14);
        org.junit.Assert.assertNull(calendar16);
        org.junit.Assert.assertNotNull(cOSName17);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test069");
        int i0 = org.apache.pdfbox.pdmodel.encryption.PDEncryption.VERSION0_UNDOCUMENTED_UNSUPPORTED;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test070");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.PREV;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test071");
        org.apache.pdfbox.pdmodel.font.encoding.MacOSRomanEncoding macOSRomanEncoding0 = new org.apache.pdfbox.pdmodel.font.encoding.MacOSRomanEncoding();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test072");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        int i6 = cOSDictionary4.getInt("Expired");
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.A;
        cOSDictionary4.setInt(cOSName7, 100);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo pDActionGoTo10 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo(cOSDictionary4);
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkedContentReference pDMarkedContentReference11 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkedContentReference(cOSDictionary4);
        cOSDictionary4.setName("LowerAlpha", "cb");
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNotNull(cOSName7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test073");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        pDExportFormatAttributeObject1.setLineHeightNormal();
        pDExportFormatAttributeObject1.setTextDecorationType("L2R");
        org.apache.pdfbox.pdmodel.graphics.color.PDGamma pDGamma7 = pDExportFormatAttributeObject1.getTextDecorationColor();
        pDExportFormatAttributeObject1.setScope("D");
        org.junit.Assert.assertNull(pDGamma7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test074");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CA_NS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test075");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_90_DEGREES;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "90" + "'", str0.equals("90"));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test076");
        int i0 = org.apache.pdfbox.pdmodel.graphics.shading.PDShading.SHADING_TYPE2;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test077");
        org.apache.pdfbox.util.filetypedetector.FileType fileType0 = org.apache.pdfbox.util.filetypedetector.FileType.GIF;
        org.junit.Assert.assertTrue("'" + fileType0 + "' != '" + org.apache.pdfbox.util.filetypedetector.FileType.GIF + "'", fileType0.equals(org.apache.pdfbox.util.filetypedetector.FileType.GIF));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test078");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.STATE_MODEL;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test079");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue pDSeedValue0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue();
        pDSeedValue0.setSubFilterRequired(false);
        pDSeedValue0.setFilterRequired(true);
        org.apache.pdfbox.cos.COSName cOSName5 = org.apache.pdfbox.cos.COSName.R;
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.DM;
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.OS;
        org.apache.pdfbox.cos.COSName cOSName8 = org.apache.pdfbox.cos.COSName.CID_FONT_TYPE2;
        org.apache.pdfbox.cos.COSName cOSName9 = org.apache.pdfbox.cos.COSName.COUNT;
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.OUTPUT_INTENT;
        org.apache.pdfbox.cos.COSName cOSName11 = org.apache.pdfbox.cos.COSName.LIMITS;
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject13 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject13.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary16 = pDExportFormatAttributeObject13.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName18 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary16.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName18, (int) (short) 0);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP pDSeedValueMDP21 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP(cOSDictionary16);
        org.apache.pdfbox.cos.COSName cOSName22 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        long long23 = cOSDictionary16.getLong(cOSName22);
        org.apache.pdfbox.cos.COSName cOSName24 = org.apache.pdfbox.cos.COSName.ORDER;
        org.apache.pdfbox.cos.COSName cOSName25 = org.apache.pdfbox.cos.COSName.DESCENT;
        org.apache.pdfbox.cos.COSName cOSName26 = org.apache.pdfbox.cos.COSName.CP;
        org.apache.pdfbox.cos.COSName cOSName27 = org.apache.pdfbox.cos.COSName.DECODE;
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject29 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject29.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary32 = pDExportFormatAttributeObject29.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName34 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary32.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName34, (int) (short) 0);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP pDSeedValueMDP37 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP(cOSDictionary32);
        org.apache.pdfbox.cos.COSName cOSName38 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        long long39 = cOSDictionary32.getLong(cOSName38);
        org.apache.pdfbox.cos.COSName cOSName40 = org.apache.pdfbox.cos.COSName.PAGE_MODE;
        java.lang.String str41 = cOSName40.toString();
        org.apache.pdfbox.cos.COSBase cOSBase42 = org.apache.pdfbox.pdmodel.PDPageTree.getInheritableAttribute(cOSDictionary32, cOSName40);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject44 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject44.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary47 = pDExportFormatAttributeObject44.getCOSObject();
        int i49 = cOSDictionary47.getInt("Expired");
        org.apache.pdfbox.cos.COSName cOSName50 = org.apache.pdfbox.cos.COSName.A;
        cOSDictionary47.setInt(cOSName50, 100);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject54 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject54.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary57 = pDExportFormatAttributeObject54.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName59 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary57.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName59, (int) (short) 0);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP pDSeedValueMDP62 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP(cOSDictionary57);
        org.apache.pdfbox.cos.COSName cOSName63 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        long long64 = cOSDictionary57.getLong(cOSName63);
        org.apache.pdfbox.cos.COSName cOSName65 = org.apache.pdfbox.cos.COSName.PAGE_MODE;
        java.lang.String str66 = cOSName65.toString();
        org.apache.pdfbox.cos.COSBase cOSBase67 = org.apache.pdfbox.pdmodel.PDPageTree.getInheritableAttribute(cOSDictionary57, cOSName65);
        org.apache.pdfbox.cos.COSName cOSName68 = org.apache.pdfbox.cos.COSName.CALGRAY;
        org.apache.pdfbox.cos.COSName cOSName69 = org.apache.pdfbox.cos.COSName.TR;
        float[] f_array73 = new float[] { (short) 1, '#', 100L };
        org.apache.pdfbox.cos.COSName cOSName74 = org.apache.pdfbox.cos.COSName.PAGE_LAYOUT;
        org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace75 = null;
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor76 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array73, cOSName74, pDColorSpace75);
        org.apache.pdfbox.cos.COSName cOSName77 = org.apache.pdfbox.cos.COSName.FLATE_DECODE_ABBREVIATION;
        org.apache.pdfbox.cos.COSName cOSName78 = org.apache.pdfbox.cos.COSName.DECODE;
        org.apache.pdfbox.cos.COSName cOSName79 = org.apache.pdfbox.cos.COSName.PUB_SEC;
        org.apache.pdfbox.cos.COSName cOSName80 = org.apache.pdfbox.cos.COSName.U;
        org.apache.pdfbox.cos.COSName[] cOSName_array81 = new org.apache.pdfbox.cos.COSName[] { cOSName5, cOSName6, cOSName7, cOSName8, cOSName9, cOSName10, cOSName11, cOSName22, cOSName24, cOSName25, cOSName26, cOSName27, cOSName40, cOSName50, cOSName65, cOSName68, cOSName69, cOSName74, cOSName77, cOSName78, cOSName79, cOSName80 };
        java.util.ArrayList<org.apache.pdfbox.cos.COSName> arraylist_cOSName82 = new java.util.ArrayList<org.apache.pdfbox.cos.COSName>();
        boolean b83 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.cos.COSName>) arraylist_cOSName82, cOSName_array81);
        try {
            pDSeedValue0.setDigestMethod((java.util.List<org.apache.pdfbox.cos.COSName>) arraylist_cOSName82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(cOSName5);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(cOSName8);
        org.junit.Assert.assertNotNull(cOSName9);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertNotNull(cOSName11);
        org.junit.Assert.assertNotNull(cOSDictionary16);
        org.junit.Assert.assertNotNull(cOSName18);
        org.junit.Assert.assertNotNull(cOSName22);
        org.junit.Assert.assertTrue(long23 == (-1L));
        org.junit.Assert.assertNotNull(cOSName24);
        org.junit.Assert.assertNotNull(cOSName25);
        org.junit.Assert.assertNotNull(cOSName26);
        org.junit.Assert.assertNotNull(cOSName27);
        org.junit.Assert.assertNotNull(cOSDictionary32);
        org.junit.Assert.assertNotNull(cOSName34);
        org.junit.Assert.assertNotNull(cOSName38);
        org.junit.Assert.assertTrue(long39 == (-1L));
        org.junit.Assert.assertNotNull(cOSName40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "COSName{PageMode}" + "'", str41.equals("COSName{PageMode}"));
        org.junit.Assert.assertNull(cOSBase42);
        org.junit.Assert.assertNotNull(cOSDictionary47);
        org.junit.Assert.assertTrue(i49 == (-1));
        org.junit.Assert.assertNotNull(cOSName50);
        org.junit.Assert.assertNotNull(cOSDictionary57);
        org.junit.Assert.assertNotNull(cOSName59);
        org.junit.Assert.assertNotNull(cOSName63);
        org.junit.Assert.assertTrue(long64 == (-1L));
        org.junit.Assert.assertNotNull(cOSName65);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "COSName{PageMode}" + "'", str66.equals("COSName{PageMode}"));
        org.junit.Assert.assertNull(cOSBase67);
        org.junit.Assert.assertNotNull(cOSName68);
        org.junit.Assert.assertNotNull(cOSName69);
        org.junit.Assert.assertNotNull(f_array73);
        org.junit.Assert.assertNotNull(cOSName74);
        org.junit.Assert.assertNotNull(cOSName77);
        org.junit.Assert.assertNotNull(cOSName78);
        org.junit.Assert.assertNotNull(cOSName79);
        org.junit.Assert.assertNotNull(cOSName80);
        org.junit.Assert.assertNotNull(cOSName_array81);
        org.junit.Assert.assertTrue(b83 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test080");
        org.apache.pdfbox.filter.MissingImageReaderException missingImageReaderException1 = new org.apache.pdfbox.filter.MissingImageReaderException("CropBox");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test081");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        pDExportFormatAttributeObject1.setLineHeightNormal();
        pDExportFormatAttributeObject1.setTextDecorationType("L2R");
        org.apache.pdfbox.pdmodel.graphics.color.PDGamma pDGamma7 = pDExportFormatAttributeObject1.getTextDecorationColor();
        pDExportFormatAttributeObject1.setAllPaddings(32);
        org.junit.Assert.assertNull(pDGamma7);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test082");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationFileAttachment pDAnnotationFileAttachment0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationFileAttachment();
        java.util.Calendar calendar1 = null;
        pDAnnotationFileAttachment0.setModifiedDate(calendar1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test083");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        cOSDictionary1.setString("Highlight", "Start");
        java.lang.String str5 = cOSDictionary1.toString();
        org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions pDFormFieldAdditionalActions6 = new org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionURI pDActionURI7 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionURI();
        java.lang.String str8 = pDActionURI7.getURI();
        pDFormFieldAdditionalActions6.setF((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionURI7);
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction10 = pDFormFieldAdditionalActions6.getK();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "COSDictionary{COSName{Type}:COSName{Pages};COSName{Kids}:COSArray{[]};COSName{Count}:COSInt{0};COSName{Highlight}:COSString{Start};}" + "'", str5.equals("COSDictionary{COSName{Type}:COSName{Pages};COSName{Kids}:COSArray{[]};COSName{Count}:COSInt{0};COSName{Highlight}:COSString{Start};}"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(pDAction10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test084");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ENCODING_90MS_RKSJ_V;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test085");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.MISSING_WIDTH;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test086");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.AESV2;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test087");
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions0 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree1 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDPageTree1.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject3 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty4 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary2, pDUserAttributeObject3);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent5 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData pDActionImportData6 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData(cOSDictionary2);
        org.apache.pdfbox.pdmodel.fdf.FDFCatalog fDFCatalog7 = new org.apache.pdfbox.pdmodel.fdf.FDFCatalog(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionThread pDActionThread8 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionThread(cOSDictionary2);
        pDActionThread8.setSubType("Butt");
        pDAdditionalActions0.setF((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionThread8);
        org.junit.Assert.assertNotNull(cOSDictionary2);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test088");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDRadioButton pDRadioButton1 = new org.apache.pdfbox.pdmodel.interactive.form.PDRadioButton(pDAcroForm0);
        try {
            java.util.Set<java.lang.String> set_str2 = pDRadioButton1.getOnValues();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test089");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode2 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern pDTilingPattern3 = new org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern(cOSDictionary1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = pDTilingPattern3.getBBox();
        org.apache.pdfbox.util.Matrix matrix5 = pDTilingPattern3.getMatrix();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNull(pDRectangle4);
        org.junit.Assert.assertNotNull(matrix5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test090");
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
        try {
            org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle15 = new org.apache.pdfbox.pdmodel.common.PDRectangle(cOSArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle0);
        org.junit.Assert.assertNotNull(cOSArray1);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNotNull(pDRectangle6);
        org.junit.Assert.assertNotNull(cOSArray7);
        org.junit.Assert.assertNotNull(cOSName10);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test091");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        java.lang.String str1 = pDAnnotationLine0.getSubject();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle2 = pDAnnotationLine0.getRectangle();
        java.lang.String str3 = pDAnnotationLine0.getRichContents();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(pDRectangle2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test092");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        int i6 = cOSDictionary4.getInt("Expired");
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.A;
        cOSDictionary4.setInt(cOSName7, 100);
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.OUTPUT_INTENT;
        org.apache.pdfbox.cos.COSBase cOSBase11 = cOSDictionary4.getItem(cOSName10);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceCharacteristicsDictionary pDAppearanceCharacteristicsDictionary12 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceCharacteristicsDictionary(cOSDictionary4);
        pDAppearanceCharacteristicsDictionary12.setRotation((int) (byte) -1);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertNull(cOSBase11);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test093");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFileAttachment fDFAnnotationFileAttachment0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFileAttachment();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test095");
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
        org.apache.pdfbox.cos.COSName cOSName25 = pDColor24.getPatternName();
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(iterable_cOSName11);
        org.junit.Assert.assertNotNull(cOSName12);
        org.junit.Assert.assertNotNull(cOSDictionary14);
        org.junit.Assert.assertNotNull(cOSName21);
        org.junit.Assert.assertNotNull(pDColor24);
        org.junit.Assert.assertNull(cOSName25);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test096");
        org.apache.pdfbox.contentstream.operator.color.SetNonStrokingDeviceCMYKColor setNonStrokingDeviceCMYKColor0 = new org.apache.pdfbox.contentstream.operator.color.SetNonStrokingDeviceCMYKColor();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test097");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ENCODE;
        java.lang.String str1 = cOSName0.toString();
        org.junit.Assert.assertNotNull(cOSName0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "COSName{Encode}" + "'", str1.equals("COSName{Encode}"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test099");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.SYNCHRONOUS;
        java.lang.String str1 = cOSName0.toString();
        org.junit.Assert.assertNotNull(cOSName0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "COSName{Synchronous}" + "'", str1.equals("COSName{Synchronous}"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test100");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDExternalDataDictionary pDExternalDataDictionary0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDExternalDataDictionary();
        java.lang.String str1 = pDExternalDataDictionary0.getType();
        java.lang.String str2 = pDExternalDataDictionary0.getSubtype();
        java.lang.String str3 = pDExternalDataDictionary0.getSubtype();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ExData" + "'", str1.equals("ExData"));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test101");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.SUBFILTER_ADBE_X509_RSA_SHA1;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test102");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FONT_STRETCH;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test103");
        org.apache.pdfbox.pdmodel.graphics.state.RenderingMode renderingMode0 = org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.FILL_STROKE_CLIP;
        int i1 = renderingMode0.intValue();
        org.junit.Assert.assertTrue("'" + renderingMode0 + "' != '" + org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.FILL_STROKE_CLIP + "'", renderingMode0.equals(org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.FILL_STROKE_CLIP));
        org.junit.Assert.assertTrue(i1 == 6);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test104");
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
        java.util.Map<org.apache.pdfbox.cos.COSObjectKey, java.lang.Long> map_cOSObjectKey_long13 = null;
        try {
            cOSDocument2.addXRefTable(map_cOSObjectKey_long13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDocument2);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNull(cOSObjectKey9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(cOSStream12);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test105");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.GTS_PDFA1;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test106");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue pDSeedValue0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue();
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP pDSeedValueMDP1 = pDSeedValue0.getMDP();
        org.junit.Assert.assertNull(pDSeedValueMDP1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test107");
        org.apache.pdfbox.util.Matrix matrix0 = new org.apache.pdfbox.util.Matrix();
        java.awt.geom.Point2D.Float float3 = matrix0.transformPoint((float) (byte) 10, 12000.0f);
        float f4 = matrix0.getYPosition();
        org.junit.Assert.assertNotNull(float3);
        org.junit.Assert.assertTrue(f4 == 0.0f);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test108");
        org.apache.pdfbox.contentstream.operator.graphics.EndPath endPath0 = new org.apache.pdfbox.contentstream.operator.graphics.EndPath();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test109");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.RUBY_ALIGN_CENTER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Center" + "'", str0.equals("Center"));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test110");
        org.apache.pdfbox.util.filetypedetector.FileType fileType0 = org.apache.pdfbox.util.filetypedetector.FileType.ORF;
        org.junit.Assert.assertTrue("'" + fileType0 + "' != '" + org.apache.pdfbox.util.filetypedetector.FileType.ORF + "'", fileType0.equals(org.apache.pdfbox.util.filetypedetector.FileType.ORF));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test111");
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
        try {
            fDFDictionary10.setEncoding("TH");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test113");
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation0 = new org.apache.pdfbox.pdmodel.PDDocumentInformation();
        java.lang.String str1 = pDDocumentInformation0.getTrapped();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test114");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.action.PDActionHide.SUB_TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Hide" + "'", str0.equals("Hide"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test115");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.TYPE0;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test116");
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
        pDAcroForm15.setNeedAppearances((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(cOSDocument2);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertNotNull(cOSName13);
        org.junit.Assert.assertNull(cOSBase14);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test117");
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
        byte[] byte_array19 = org.apache.pdfbox.pdfwriter.COSWriter.ENDSTREAM;
        try {
            pDPageContentStream17.appendRawCommands(byte_array19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
        org.junit.Assert.assertNotNull(byte_array19);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test118");
        org.w3c.dom.Element element0 = null;
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFAnnotationText fDFAnnotationText1 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationText(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test119");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature pDSignature0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature();
        java.lang.String str1 = pDSignature0.getLocation();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test120");
        java.io.OutputStream outputStream0 = null;
        org.apache.pdfbox.pdfwriter.ContentStreamWriter contentStreamWriter1 = new org.apache.pdfbox.pdfwriter.ContentStreamWriter(outputStream0);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle2 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray3 = pDRectangle2.getCOSArray();
        cOSArray3.clear();
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray3.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName6);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle8 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray9 = pDRectangle8.getCOSArray();
        cOSArray9.clear();
        org.apache.pdfbox.cos.COSName cOSName12 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray9.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName12);
        cOSArray3.addAll(cOSArray9);
        java.util.List<java.lang.Integer> list_i15 = org.apache.pdfbox.pdmodel.common.COSArrayList.convertIntegerCOSArrayToList(cOSArray9);
        try {
            contentStreamWriter1.writeToken((org.apache.pdfbox.cos.COSBase) cOSArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle2);
        org.junit.Assert.assertNotNull(cOSArray3);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(pDRectangle8);
        org.junit.Assert.assertNotNull(cOSArray9);
        org.junit.Assert.assertNotNull(cOSName12);
        org.junit.Assert.assertNotNull(list_i15);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test121");
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
        float f13 = pDFontDescriptor7.getAverageWidth();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(pDStream8);
        org.junit.Assert.assertTrue(f13 == 0.0f);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test122");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        java.util.Set<java.util.Map.Entry<org.apache.pdfbox.cos.COSName, org.apache.pdfbox.cos.COSBase>> set_entry_cOSName_cOSBase2 = cOSDictionary1.entrySet();
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_3 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary1);
        int i4 = pDShadingType3_3.getShadingType();
        pDShadingType3_3.setAntiAlias(true);
        org.apache.pdfbox.util.Matrix matrix9 = org.apache.pdfbox.util.Matrix.getTranslateInstance(100.0f, (float) 5);
        java.awt.Paint paint10 = pDShadingType3_3.toPaint(matrix9);
        org.apache.pdfbox.cos.COSArray cOSArray11 = matrix9.toCOSArray();
        java.lang.String str14 = cOSArray11.getString((int) (byte) 100, "COSName{PageMode}");
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(set_entry_cOSName_cOSBase2);
        org.junit.Assert.assertTrue(i4 == 3);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(cOSArray11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "COSName{PageMode}" + "'", str14.equals("COSName{PageMode}"));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test123");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode2 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary1);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree3 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDPageTree3.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode5 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary4);
        java.util.List<org.apache.pdfbox.pdmodel.common.PDNameTreeNode<org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript>> list_pdnametreenode_pDActionJavaScript6 = pDJavascriptNameTreeNode5.getKids();
        pDJavascriptNameTreeNode2.setParent((org.apache.pdfbox.pdmodel.common.PDNameTreeNode<org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript>) pDJavascriptNameTreeNode5);
        boolean b8 = pDJavascriptNameTreeNode2.isRootNode();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(list_pdnametreenode_pDActionJavaScript6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test124");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        java.util.Set<java.util.Map.Entry<org.apache.pdfbox.cos.COSName, org.apache.pdfbox.cos.COSBase>> set_entry_cOSName_cOSBase2 = cOSDictionary1.entrySet();
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_3 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary1);
        int i4 = pDShadingType3_3.getShadingType();
        pDShadingType3_3.setShadingType((int) (byte) 100);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(set_entry_cOSName_cOSBase2);
        org.junit.Assert.assertTrue(i4 == 3);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test125");
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
        float f14 = pDAnnotationLine0.getLeaderLineExtensionLength();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertNotNull(cOSBase9);
        org.junit.Assert.assertNotNull(f_array13);
        org.junit.Assert.assertTrue(f14 == (-1.0f));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test126");
        org.apache.pdfbox.pdmodel.PDPage pDPage0 = new org.apache.pdfbox.pdmodel.PDPage();
        org.apache.pdfbox.pdfparser.PDFStreamParser pDFStreamParser1 = new org.apache.pdfbox.pdfparser.PDFStreamParser((org.apache.pdfbox.contentstream.PDContentStream) pDPage0);
        java.lang.Object obj2 = pDFStreamParser1.parseNextToken();
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test127");
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
            pDPageContentStream17.addComment("TD");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test128");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.HELVETICA_BOLD;
        float f2 = pDType1Font0.getHeight((int) (byte) 0);
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertTrue(f2 == 0.0f);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test130");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.TYPE3;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test131");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition2 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionMotion pDTransitionMotion3 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionMotion.O;
        pDTransition2.setMotion(pDTransitionMotion3);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertTrue("'" + pDTransitionMotion3 + "' != '" + org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionMotion.O + "'", pDTransitionMotion3.equals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionMotion.O));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test132");
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
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary14 = pDAnnotationLine0.getBorderStyle();
        org.apache.pdfbox.pdmodel.interactive.annotation.handlers.PDCircleAppearanceHandler pDCircleAppearanceHandler15 = new org.apache.pdfbox.pdmodel.interactive.annotation.handlers.PDCircleAppearanceHandler((org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) pDAnnotationLine0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertNotNull(cOSBase9);
        org.junit.Assert.assertNotNull(f_array13);
        org.junit.Assert.assertNull(pDBorderStyleDictionary14);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test133");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        boolean b1 = fDFAnnotationFreeText0.isNoView();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle2 = org.apache.pdfbox.pdmodel.common.PDRectangle.A0;
        fDFAnnotationFreeText0.setRectangle(pDRectangle2);
        fDFAnnotationFreeText0.setContents("Link");
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(pDRectangle2);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test134");
        org.apache.pdfbox.contentstream.operator.graphics.ClipEvenOddRule clipEvenOddRule0 = new org.apache.pdfbox.contentstream.operator.graphics.ClipEvenOddRule();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test135");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDComboBox pDComboBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDComboBox(pDAcroForm0);
        pDComboBox1.setEdit(true);
        java.util.List<java.lang.String> list_str4 = pDComboBox1.getOptions();
        java.util.List<java.lang.String> list_str5 = pDComboBox1.getOptionsDisplayValues();
        boolean b6 = pDComboBox1.isDoNotSpellCheck();
        org.junit.Assert.assertNotNull(list_str4);
        org.junit.Assert.assertNotNull(list_str5);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test136");
        org.w3c.dom.Element element0 = null;
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStamp fDFAnnotationStamp1 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStamp(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test137");
        org.apache.pdfbox.contentstream.operator.text.SetTextLeading setTextLeading0 = new org.apache.pdfbox.contentstream.operator.text.SetTextLeading();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test138");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.OVERLAY;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test139");
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection pDTransitionDirection0 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection.TOP_LEFT_TO_BOTTOM_RIGHT;
        org.junit.Assert.assertTrue("'" + pDTransitionDirection0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection.TOP_LEFT_TO_BOTTOM_RIGHT + "'", pDTransitionDirection0.equals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection.TOP_LEFT_TO_BOTTOM_RIGHT));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test140");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        boolean b1 = fDFAnnotationFreeText0.isNoView();
        fDFAnnotationFreeText0.setDefaultStyle("Line");
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test141");
        int i0 = org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern.TILING_CONSTANT_SPACING;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test142");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationInk fDFAnnotationInk0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationInk();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test143");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.A1;
        org.junit.Assert.assertNotNull(pDRectangle0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test144");
        org.apache.pdfbox.pdmodel.graphics.state.RenderingMode renderingMode0 = org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.STROKE_CLIP;
        boolean b1 = renderingMode0.isFill();
        boolean b2 = renderingMode0.isStroke();
        org.junit.Assert.assertTrue("'" + renderingMode0 + "' != '" + org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.STROKE_CLIP + "'", renderingMode0.equals(org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.STROKE_CLIP));
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test145");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FL;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test146");
        org.apache.pdfbox.pdfwriter.COSWriterXRefEntry cOSWriterXRefEntry0 = org.apache.pdfbox.pdfwriter.COSWriterXRefEntry.getNullEntry();
        cOSWriterXRefEntry0.setFree(true);
        org.junit.Assert.assertNotNull(cOSWriterXRefEntry0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test147");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        java.awt.image.BufferedImage bufferedImage1 = null;
        try {
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject pDImageXObject2 = org.apache.pdfbox.pdmodel.graphics.image.JPEGFactory.createFromImage(pDDocument0, bufferedImage1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test148");
        org.apache.pdfbox.contentstream.operator.color.SetStrokingDeviceCMYKColor setStrokingDeviceCMYKColor0 = new org.apache.pdfbox.contentstream.operator.color.SetStrokingDeviceCMYKColor();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test149");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode2 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern pDTilingPattern3 = new org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern(cOSDictionary1);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.COLOR_DODGE;
        java.lang.String str5 = cOSDictionary1.getNameAsString(cOSName4);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test150");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject0 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree1 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDPageTree1.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject3 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty4 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary2, pDUserAttributeObject3);
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty[] pDUserProperty_array5 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty[] { pDUserProperty4 };
        java.util.ArrayList<org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty> arraylist_pDUserProperty6 = new java.util.ArrayList<org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty>) arraylist_pDUserProperty6, pDUserProperty_array5);
        pDUserAttributeObject0.setUserProperties((java.util.List<org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty>) arraylist_pDUserProperty6);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree9 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary10 = pDPageTree9.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject11 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty12 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary10, pDUserAttributeObject11);
        java.lang.String str13 = pDUserProperty12.toString();
        pDUserProperty12.setHidden(false);
        java.lang.String str16 = pDUserProperty12.getName();
        pDUserAttributeObject0.addUserProperty(pDUserProperty12);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(pDUserProperty_array5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(cOSDictionary10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Name=null, Value=null, FormattedValue=null, Hidden=false" + "'", str13.equals("Name=null, Value=null, FormattedValue=null, Hidden=false"));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test151");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject.LIST_NUMBERING_DISC;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Disc" + "'", str0.equals("Disc"));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test152");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuildDataDict pDPropBuildDataDict0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuildDataDict();
        pDPropBuildDataDict0.setTrustedMode(true);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = pDPropBuildDataDict0.getCOSObject();
        boolean b4 = pDPropBuildDataDict0.getPreRelease();
        org.junit.Assert.assertNotNull(cOSDictionary3);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test153");
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
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree37 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary38 = pDPageTree37.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject39 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty40 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary38, pDUserAttributeObject39);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent41 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary38);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit42 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary38);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_43 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary38);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle44 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray45 = pDRectangle44.getCOSArray();
        cOSArray45.clear();
        org.apache.pdfbox.cos.COSName cOSName48 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray45.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName48);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle50 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray51 = pDRectangle50.getCOSArray();
        cOSArray51.clear();
        org.apache.pdfbox.cos.COSName cOSName54 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray51.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName54);
        cOSArray45.addAll(cOSArray51);
        pDShadingType1_43.setBackground(cOSArray45);
        org.apache.pdfbox.cos.COSArray cOSArray58 = new org.apache.pdfbox.cos.COSArray();
        pDShadingType1_43.setBackground(cOSArray58);
        try {
            pDAppearanceContentStream36.shadingFill((org.apache.pdfbox.pdmodel.graphics.shading.PDShading) pDShadingType1_43);
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
        org.junit.Assert.assertNotNull(cOSDictionary38);
        org.junit.Assert.assertNotNull(pDRectangle44);
        org.junit.Assert.assertNotNull(cOSArray45);
        org.junit.Assert.assertNotNull(cOSName48);
        org.junit.Assert.assertNotNull(pDRectangle50);
        org.junit.Assert.assertNotNull(cOSArray51);
        org.junit.Assert.assertNotNull(cOSName54);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test154");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.BLOCK_ALIGN_BEFORE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Before" + "'", str0.equals("Before"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test155");
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
        java.io.OutputStream outputStream19 = pDPageContentStream17.getOutput();
        try {
            pDPageContentStream17.closeSubPath();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
        org.junit.Assert.assertNotNull(outputStream19);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test156");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        java.lang.String str5 = pDArtifactMarkedContent4.getAlternateDescription();
        java.lang.String str6 = pDArtifactMarkedContent4.getExpandedForm();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test157");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        boolean b1 = fDFAnnotationFreeText0.isNoView();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle2 = org.apache.pdfbox.pdmodel.common.PDRectangle.A0;
        fDFAnnotationFreeText0.setRectangle(pDRectangle2);
        java.lang.String str4 = fDFAnnotationFreeText0.getContents();
        java.util.Calendar calendar5 = fDFAnnotationFreeText0.getCreationDate();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(pDRectangle2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(calendar5);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test158");
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
        org.apache.pdfbox.pdmodel.PDDocument pDDocument19 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile20 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument19);
        pDDocument19.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata23 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument19);
        org.apache.pdfbox.cos.COSStream cOSStream24 = pDMetadata23.getCOSObject();
        java.io.OutputStream outputStream25 = cOSStream24.createFilteredStream();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream26 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream24);
        org.apache.pdfbox.pdmodel.common.PDStream pDStream27 = pDAppearanceStream26.getContentStream();
        org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroupAttributes pDTransparencyGroupAttributes28 = pDAppearanceStream26.getGroup();
        java.awt.geom.AffineTransform affineTransform29 = null;
        try {
            pDPageContentStream17.drawXObject((org.apache.pdfbox.pdmodel.graphics.PDXObject) pDAppearanceStream26, affineTransform29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
        org.junit.Assert.assertNotNull(cOSStream24);
        org.junit.Assert.assertNotNull(outputStream25);
        org.junit.Assert.assertNotNull(pDStream27);
        org.junit.Assert.assertNull(pDTransparencyGroupAttributes28);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test159");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.WT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "WT" + "'", str0.equals("WT"));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test160");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ENCRYPT_META_DATA;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test161");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData pDActionImportData5 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData(cOSDictionary1);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree6 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = pDPageTree6.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode8 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary7);
        org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern pDTilingPattern9 = new org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern(cOSDictionary7);
        org.apache.pdfbox.cos.COSName cOSName10 = cOSDictionary1.getKeyForValue((java.lang.Object) pDTilingPattern9);
        java.awt.geom.AffineTransform affineTransform11 = null;
        try {
            pDTilingPattern9.setMatrix(affineTransform11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertNull(cOSName10);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test162");
        org.apache.pdfbox.filter.LZWFilter lZWFilter0 = new org.apache.pdfbox.filter.LZWFilter();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test163");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.NAMES;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test164");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup1 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup("StructElem");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test165");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.printing.Scaling scaling1 = org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable5 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument0, scaling1, true, 1.0f, false);
        org.apache.pdfbox.pdmodel.DefaultResourceCache defaultResourceCache6 = new org.apache.pdfbox.pdmodel.DefaultResourceCache();
        pDDocument0.setResourceCache((org.apache.pdfbox.pdmodel.ResourceCache) defaultResourceCache6);
        org.apache.pdfbox.cos.COSObject cOSObject8 = null;
        org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState pDExtendedGraphicsState9 = new org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState();
        pDExtendedGraphicsState9.setStrokingAlphaConstant((java.lang.Float) 1.0f);
        defaultResourceCache6.put(cOSObject8, pDExtendedGraphicsState9);
        pDExtendedGraphicsState9.setStrokingOverprintControl(false);
        org.junit.Assert.assertTrue("'" + scaling1 + "' != '" + org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT + "'", scaling1.equals(org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test166");
        try {
            org.apache.pdfbox.io.RandomAccessBufferedFileInputStream randomAccessBufferedFileInputStream1 = new org.apache.pdfbox.io.RandomAccessBufferedFileInputStream("THead");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test167");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_6 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary1);
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation7 = new org.apache.pdfbox.pdmodel.PDDocumentInformation(cOSDictionary1);
        pDDocumentInformation7.setCreator("Inset");
        java.lang.String str11 = pDDocumentInformation7.getCustomMetadataValue("");
        java.lang.String str12 = pDDocumentInformation7.getAuthor();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test168");
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
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree12 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary13 = pDPageTree12.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject14 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty15 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary13, pDUserAttributeObject14);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent16 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary13);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit17 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary13);
        org.apache.pdfbox.cos.COSName cOSName19 = org.apache.pdfbox.cos.COSName.SIZE;
        java.util.Calendar calendar20 = null;
        java.util.Calendar calendar21 = cOSDictionary13.getEmbeddedDate("BlockQuote", cOSName19, calendar20);
        org.apache.pdfbox.pdmodel.fdf.FDFField fDFField22 = new org.apache.pdfbox.pdmodel.fdf.FDFField(cOSDictionary13);
        java.lang.Integer i23 = fDFField22.getClearWidgetFieldFlags();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree24 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary25 = pDPageTree24.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject26 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty27 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary25, pDUserAttributeObject26);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent28 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary25);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit29 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary25);
        org.apache.pdfbox.cos.COSName cOSName31 = org.apache.pdfbox.cos.COSName.SIZE;
        java.util.Calendar calendar32 = null;
        java.util.Calendar calendar33 = cOSDictionary25.getEmbeddedDate("BlockQuote", cOSName31, calendar32);
        org.apache.pdfbox.pdmodel.fdf.FDFField fDFField34 = new org.apache.pdfbox.pdmodel.fdf.FDFField(cOSDictionary25);
        java.lang.Integer i35 = fDFField34.getClearWidgetFieldFlags();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree36 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary37 = pDPageTree36.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject38 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty39 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary37, pDUserAttributeObject38);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent40 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary37);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit41 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary37);
        org.apache.pdfbox.cos.COSName cOSName43 = org.apache.pdfbox.cos.COSName.SIZE;
        java.util.Calendar calendar44 = null;
        java.util.Calendar calendar45 = cOSDictionary37.getEmbeddedDate("BlockQuote", cOSName43, calendar44);
        org.apache.pdfbox.pdmodel.fdf.FDFField fDFField46 = new org.apache.pdfbox.pdmodel.fdf.FDFField(cOSDictionary37);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree47 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary48 = pDPageTree47.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject49 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty50 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary48, pDUserAttributeObject49);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent51 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary48);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit52 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary48);
        org.apache.pdfbox.cos.COSName cOSName54 = org.apache.pdfbox.cos.COSName.SIZE;
        java.util.Calendar calendar55 = null;
        java.util.Calendar calendar56 = cOSDictionary48.getEmbeddedDate("BlockQuote", cOSName54, calendar55);
        org.apache.pdfbox.pdmodel.fdf.FDFField fDFField57 = new org.apache.pdfbox.pdmodel.fdf.FDFField(cOSDictionary48);
        fDFField57.setPartialFieldName("List");
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions60 = fDFField57.getAdditionalActions();
        org.apache.pdfbox.pdmodel.fdf.FDFField[] fDFField_array61 = new org.apache.pdfbox.pdmodel.fdf.FDFField[] { fDFField22, fDFField34, fDFField46, fDFField57 };
        java.util.ArrayList<org.apache.pdfbox.pdmodel.fdf.FDFField> arraylist_fDFField62 = new java.util.ArrayList<org.apache.pdfbox.pdmodel.fdf.FDFField>();
        boolean b63 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.pdmodel.fdf.FDFField>) arraylist_fDFField62, fDFField_array61);
        try {
            fDFDictionary10.setFields((java.util.List<org.apache.pdfbox.pdmodel.fdf.FDFField>) arraylist_fDFField62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary13);
        org.junit.Assert.assertNotNull(cOSName19);
        org.junit.Assert.assertNull(calendar21);
        org.junit.Assert.assertNull(i23);
        org.junit.Assert.assertNotNull(cOSDictionary25);
        org.junit.Assert.assertNotNull(cOSName31);
        org.junit.Assert.assertNull(calendar33);
        org.junit.Assert.assertNull(i35);
        org.junit.Assert.assertNotNull(cOSDictionary37);
        org.junit.Assert.assertNotNull(cOSName43);
        org.junit.Assert.assertNull(calendar45);
        org.junit.Assert.assertNotNull(cOSDictionary48);
        org.junit.Assert.assertNotNull(cOSName54);
        org.junit.Assert.assertNull(calendar56);
        org.junit.Assert.assertNull(pDAdditionalActions60);
        org.junit.Assert.assertNotNull(fDFField_array61);
        org.junit.Assert.assertTrue(b63 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test169");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata4 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument0);
        org.apache.pdfbox.cos.COSStream cOSStream5 = pDMetadata4.getCOSObject();
        java.io.OutputStream outputStream6 = cOSStream5.createFilteredStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDActionHide pDActionHide7 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionHide((org.apache.pdfbox.cos.COSDictionary) cOSStream5);
        org.apache.pdfbox.cos.COSBase cOSBase8 = null;
        pDActionHide7.setT(cOSBase8);
        org.junit.Assert.assertNotNull(cOSStream5);
        org.junit.Assert.assertNotNull(outputStream6);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test170");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FRM;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test171");
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
        try {
            pDAppearanceContentStream36.setLineCapStyle((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test172");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDComboBox pDComboBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDComboBox(pDAcroForm0);
        int i2 = pDComboBox1.getFieldFlags();
        try {
            java.lang.String str3 = pDComboBox1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i2 == 131072);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test173");
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
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree12 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary13 = pDPageTree12.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition14 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary13);
        pDPage2.setTransition(pDTransition14);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree16 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle17 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage18 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle17);
        int i19 = pDPageTree16.indexOf(pDPage18);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree20 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary21 = pDPageTree20.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition22 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary21);
        org.apache.pdfbox.cos.COSBase cOSBase23 = pDTransition22.getDirection();
        pDPage18.setTransition(pDTransition22, (float) 1);
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDimension pDTransitionDimension26 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDimension.H;
        pDTransition22.setDimension(pDTransitionDimension26);
        pDTransition14.setDimension(pDTransitionDimension26);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertNotNull(iterator_pDStream4);
        org.junit.Assert.assertNull(pDResources5);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertNotNull(cOSBase9);
        org.junit.Assert.assertNotNull(cOSDictionary13);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertNotNull(cOSDictionary21);
        org.junit.Assert.assertNotNull(cOSBase23);
        org.junit.Assert.assertTrue("'" + pDTransitionDimension26 + "' != '" + org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDimension.H + "'", pDTransitionDimension26.equals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDimension.H));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test174");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("XML-1.00");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test175");
        java.io.File file0 = null;
        try {
            org.apache.pdfbox.pdfparser.FDFParser fDFParser1 = new org.apache.pdfbox.pdfparser.FDFParser(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test176");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle1 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage2 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle1);
        int i3 = pDPageTree0.indexOf(pDPage2);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree4 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary5 = pDPageTree4.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition6 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary5);
        org.apache.pdfbox.cos.COSBase cOSBase7 = pDTransition6.getDirection();
        pDPage2.setTransition(pDTransition6, (float) 1);
        java.util.List<org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDThreadBead> list_pDThreadBead10 = pDPage2.getThreadBeads();
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertNotNull(cOSDictionary5);
        org.junit.Assert.assertNotNull(cOSBase7);
        org.junit.Assert.assertNotNull(list_pDThreadBead10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test178");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ACRO_FORM;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test179");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray1 = pDRectangle0.getCOSArray();
        cOSArray1.clear();
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitHeightDestination pDPageFitHeightDestination3 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitHeightDestination(cOSArray1);
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
        int i19 = cOSArray6.getInt((int) (short) 100);
        try {
            cOSArray1.set((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle0);
        org.junit.Assert.assertNotNull(cOSArray1);
        org.junit.Assert.assertNotNull(pDRectangle5);
        org.junit.Assert.assertNotNull(cOSArray6);
        org.junit.Assert.assertNotNull(cOSName9);
        org.junit.Assert.assertNotNull(pDRectangle11);
        org.junit.Assert.assertNotNull(cOSArray12);
        org.junit.Assert.assertNotNull(cOSName15);
        org.junit.Assert.assertTrue(i19 == (-1));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test180");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        java.lang.String str1 = pDAnnotationLine0.getSubject();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle2 = pDAnnotationLine0.getRectangle();
        pDAnnotationLine0.setCaptionHorizontalOffset(10.0f);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree5 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle6 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage7 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle6);
        int i8 = pDPageTree5.indexOf(pDPage7);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream9 = pDPage7.getContentStreams();
        org.apache.pdfbox.pdmodel.PDResources pDResources10 = pDPage7.getResources();
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream11 = pDPage7.getContentStreams();
        pDAnnotationLine0.setPage(pDPage7);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(pDRectangle2);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNotNull(iterator_pDStream9);
        org.junit.Assert.assertNull(pDResources10);
        org.junit.Assert.assertNotNull(iterator_pDStream11);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test181");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.LEGAL_ATTESTATION;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test182");
        org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState pDExtendedGraphicsState0 = new org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState();
        boolean b1 = pDExtendedGraphicsState0.getNonStrokingOverprintControl();
        java.lang.Float f2 = pDExtendedGraphicsState0.getNonStrokingAlphaConstant();
        org.apache.pdfbox.pdmodel.graphics.PDFontSetting pDFontSetting3 = pDExtendedGraphicsState0.getFontSetting();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(f2);
        org.junit.Assert.assertNull(pDFontSetting3);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test183");
        org.w3c.dom.Element element0 = null;
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFCatalog fDFCatalog1 = new org.apache.pdfbox.pdmodel.fdf.FDFCatalog(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test184");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDComboBox pDComboBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDComboBox(pDAcroForm0);
        pDComboBox1.setQ(5);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm4 = pDComboBox1.getAcroForm();
        org.junit.Assert.assertNull(pDAcroForm4);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test185");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine fDFAnnotationLine0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine();
        fDFAnnotationLine0.setStartPointEndingStyle("Polygon");
        java.lang.Integer i3 = fDFAnnotationLine0.getPage();
        fDFAnnotationLine0.setSubject("Span");
        float f6 = fDFAnnotationLine0.getLeaderExtend();
        org.junit.Assert.assertNull(i3);
        org.junit.Assert.assertTrue(f6 == (-1.0f));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test186");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        org.apache.pdfbox.cos.COSString cOSString2 = null;
        org.apache.pdfbox.pdmodel.common.filespecification.PDSimpleFileSpecification pDSimpleFileSpecification3 = new org.apache.pdfbox.pdmodel.common.filespecification.PDSimpleFileSpecification(cOSString2);
        pDEmbeddedFile1.setFile((org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification) pDSimpleFileSpecification3);
        pDEmbeddedFile1.setSize((int) (byte) -1);
        java.lang.String str7 = pDEmbeddedFile1.getMacResFork();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test187");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationFileAttachment.SUB_TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "FileAttachment" + "'", str0.equals("FileAttachment"));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test188");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDComboBox pDComboBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDComboBox(pDAcroForm0);
        pDComboBox1.setEdit(true);
        java.util.List<java.lang.String> list_str4 = pDComboBox1.getOptions();
        java.util.List<java.lang.String> list_str5 = pDComboBox1.getOptionsDisplayValues();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject pDDefaultAttributeObject6 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject();
        java.util.List<java.lang.String> list_str7 = pDDefaultAttributeObject6.getAttributeNames();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle8 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray9 = pDRectangle8.getCOSArray();
        cOSArray9.clear();
        org.apache.pdfbox.cos.COSName cOSName12 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray9.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName12);
        org.apache.pdfbox.pdmodel.graphics.color.PDGamma pDGamma14 = new org.apache.pdfbox.pdmodel.graphics.color.PDGamma(cOSArray9);
        org.apache.pdfbox.pdmodel.fdf.FDFOptionElement fDFOptionElement15 = new org.apache.pdfbox.pdmodel.fdf.FDFOptionElement(cOSArray9);
        java.util.List<java.lang.String> list_str16 = org.apache.pdfbox.pdmodel.common.COSArrayList.convertCOSStringCOSArrayToList(cOSArray9);
        pDComboBox1.setOptions(list_str7, list_str16);
        boolean b18 = pDComboBox1.isCombo();
        org.junit.Assert.assertNotNull(list_str4);
        org.junit.Assert.assertNotNull(list_str5);
        org.junit.Assert.assertNotNull(list_str7);
        org.junit.Assert.assertNotNull(pDRectangle8);
        org.junit.Assert.assertNotNull(cOSArray9);
        org.junit.Assert.assertNotNull(cOSName12);
        org.junit.Assert.assertNotNull(list_str16);
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test189");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationText pDAnnotationText0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationText();
        pDAnnotationText0.setState("ExData");
        pDAnnotationText0.setPrinted(false);
        boolean b5 = pDAnnotationText0.isNoZoom();
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test190");
        org.apache.pdfbox.cos.COSBoolean cOSBoolean1 = org.apache.pdfbox.cos.COSBoolean.getBoolean(false);
        org.apache.pdfbox.io.RandomAccessWrite randomAccessWrite2 = null;
        org.apache.pdfbox.io.RandomAccessOutputStream randomAccessOutputStream3 = new org.apache.pdfbox.io.RandomAccessOutputStream(randomAccessWrite2);
        randomAccessOutputStream3.flush();
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream5 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream((java.io.OutputStream) randomAccessOutputStream3);
        long long6 = cOSStandardOutputStream5.getPos();
        try {
            cOSBoolean1.writePDF((java.io.OutputStream) cOSStandardOutputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSBoolean1);
        org.junit.Assert.assertTrue(long6 == 0L);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test191");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CENTER_WINDOW;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test192");
        org.apache.pdfbox.pdmodel.graphics.color.PDCalRGB pDCalRGB0 = new org.apache.pdfbox.pdmodel.graphics.color.PDCalRGB();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle1 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray2 = pDRectangle1.getCOSArray();
        cOSArray2.clear();
        org.apache.pdfbox.cos.COSName cOSName5 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray2.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName5);
        org.apache.pdfbox.pdmodel.graphics.color.PDGamma pDGamma7 = new org.apache.pdfbox.pdmodel.graphics.color.PDGamma(cOSArray2);
        pDCalRGB0.setGamma(pDGamma7);
        try {
            pDGamma7.setG((float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle1);
        org.junit.Assert.assertNotNull(cOSArray2);
        org.junit.Assert.assertNotNull(cOSName5);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test193");
        org.apache.pdfbox.pdmodel.fdf.FDFDictionary fDFDictionary0 = new org.apache.pdfbox.pdmodel.fdf.FDFDictionary();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test194");
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.DUPLEX dUPLEX0 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.DUPLEX.DuplexFlipShortEdge;
        org.junit.Assert.assertTrue("'" + dUPLEX0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.DUPLEX.DuplexFlipShortEdge + "'", dUPLEX0.equals(org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.DUPLEX.DuplexFlipShortEdge));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test195");
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
        java.lang.Integer i14 = fDFField10.getClearFieldFlags();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNull(calendar9);
        org.junit.Assert.assertNull(pDAdditionalActions13);
        org.junit.Assert.assertNull(i14);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test196");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNAttributes pDDeviceNAttributes1 = new org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNAttributes(cOSDictionary0);
        try {
            java.lang.String str2 = pDDeviceNAttributes1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test197");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        boolean b1 = fDFAnnotationFreeText0.isNoView();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle2 = org.apache.pdfbox.pdmodel.common.PDRectangle.A0;
        fDFAnnotationFreeText0.setRectangle(pDRectangle2);
        org.apache.pdfbox.pdmodel.PDPage pDPage4 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle2);
        org.apache.pdfbox.pdmodel.PDPage pDPage5 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle2);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(pDRectangle2);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test198");
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
        fDFField10.setClearWidgetFieldFlags((-1));
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNull(calendar9);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test199");
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
        java.util.List<java.lang.Integer> list_i13 = org.apache.pdfbox.pdmodel.common.COSArrayList.convertIntegerCOSArrayToList(cOSArray7);
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitHeightDestination pDPageFitHeightDestination14 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitHeightDestination(cOSArray7);
        int i15 = pDPageFitHeightDestination14.findPageNumber();
        org.junit.Assert.assertNotNull(pDRectangle0);
        org.junit.Assert.assertNotNull(cOSArray1);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNotNull(pDRectangle6);
        org.junit.Assert.assertNotNull(cOSArray7);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertNotNull(list_i13);
        org.junit.Assert.assertTrue(i15 == (-1));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test200");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFDictionary fDFDictionary1 = new org.apache.pdfbox.pdmodel.fdf.FDFDictionary(cOSDictionary0);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree2 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = pDPageTree2.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject4 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty5 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary3, pDUserAttributeObject4);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent6 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit7 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary3);
        org.apache.pdfbox.cos.COSName cOSName9 = org.apache.pdfbox.cos.COSName.SIZE;
        java.util.Calendar calendar10 = null;
        java.util.Calendar calendar11 = cOSDictionary3.getEmbeddedDate("BlockQuote", cOSName9, calendar10);
        org.apache.pdfbox.pdmodel.fdf.FDFField fDFField12 = new org.apache.pdfbox.pdmodel.fdf.FDFField(cOSDictionary3);
        fDFField12.setPartialFieldName("List");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree15 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary16 = pDPageTree15.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject17 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty18 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary16, pDUserAttributeObject17);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent19 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary16);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit20 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary16);
        org.apache.pdfbox.cos.COSName cOSName22 = org.apache.pdfbox.cos.COSName.SIZE;
        java.util.Calendar calendar23 = null;
        java.util.Calendar calendar24 = cOSDictionary16.getEmbeddedDate("BlockQuote", cOSName22, calendar23);
        org.apache.pdfbox.pdmodel.fdf.FDFField fDFField25 = new org.apache.pdfbox.pdmodel.fdf.FDFField(cOSDictionary16);
        fDFField25.setPartialFieldName("List");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree28 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary29 = pDPageTree28.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject30 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty31 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary29, pDUserAttributeObject30);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent32 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary29);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit33 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary29);
        org.apache.pdfbox.cos.COSName cOSName35 = org.apache.pdfbox.cos.COSName.SIZE;
        java.util.Calendar calendar36 = null;
        java.util.Calendar calendar37 = cOSDictionary29.getEmbeddedDate("BlockQuote", cOSName35, calendar36);
        org.apache.pdfbox.pdmodel.fdf.FDFField fDFField38 = new org.apache.pdfbox.pdmodel.fdf.FDFField(cOSDictionary29);
        fDFField38.setPartialFieldName("List");
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions41 = fDFField38.getAdditionalActions();
        java.lang.Integer i42 = fDFField38.getClearFieldFlags();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree43 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary44 = pDPageTree43.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject45 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty46 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary44, pDUserAttributeObject45);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent47 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary44);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit48 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary44);
        org.apache.pdfbox.cos.COSName cOSName50 = org.apache.pdfbox.cos.COSName.SIZE;
        java.util.Calendar calendar51 = null;
        java.util.Calendar calendar52 = cOSDictionary44.getEmbeddedDate("BlockQuote", cOSName50, calendar51);
        org.apache.pdfbox.pdmodel.fdf.FDFField fDFField53 = new org.apache.pdfbox.pdmodel.fdf.FDFField(cOSDictionary44);
        fDFField53.setPartialFieldName("List");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree56 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary57 = pDPageTree56.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject58 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty59 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary57, pDUserAttributeObject58);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent60 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary57);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit61 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary57);
        org.apache.pdfbox.cos.COSName cOSName63 = org.apache.pdfbox.cos.COSName.SIZE;
        java.util.Calendar calendar64 = null;
        java.util.Calendar calendar65 = cOSDictionary57.getEmbeddedDate("BlockQuote", cOSName63, calendar64);
        org.apache.pdfbox.pdmodel.fdf.FDFField fDFField66 = new org.apache.pdfbox.pdmodel.fdf.FDFField(cOSDictionary57);
        fDFField66.setPartialFieldName("List");
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions69 = fDFField66.getAdditionalActions();
        fDFField66.setWidgetFieldFlags((java.lang.Integer) 2);
        org.apache.pdfbox.pdmodel.fdf.FDFField[] fDFField_array72 = new org.apache.pdfbox.pdmodel.fdf.FDFField[] { fDFField12, fDFField25, fDFField38, fDFField53, fDFField66 };
        java.util.ArrayList<org.apache.pdfbox.pdmodel.fdf.FDFField> arraylist_fDFField73 = new java.util.ArrayList<org.apache.pdfbox.pdmodel.fdf.FDFField>();
        boolean b74 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.pdmodel.fdf.FDFField>) arraylist_fDFField73, fDFField_array72);
        try {
            fDFDictionary1.setFields((java.util.List<org.apache.pdfbox.pdmodel.fdf.FDFField>) arraylist_fDFField73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary3);
        org.junit.Assert.assertNotNull(cOSName9);
        org.junit.Assert.assertNull(calendar11);
        org.junit.Assert.assertNotNull(cOSDictionary16);
        org.junit.Assert.assertNotNull(cOSName22);
        org.junit.Assert.assertNull(calendar24);
        org.junit.Assert.assertNotNull(cOSDictionary29);
        org.junit.Assert.assertNotNull(cOSName35);
        org.junit.Assert.assertNull(calendar37);
        org.junit.Assert.assertNull(pDAdditionalActions41);
        org.junit.Assert.assertNull(i42);
        org.junit.Assert.assertNotNull(cOSDictionary44);
        org.junit.Assert.assertNotNull(cOSName50);
        org.junit.Assert.assertNull(calendar52);
        org.junit.Assert.assertNotNull(cOSDictionary57);
        org.junit.Assert.assertNotNull(cOSName63);
        org.junit.Assert.assertNull(calendar65);
        org.junit.Assert.assertNull(pDAdditionalActions69);
        org.junit.Assert.assertNotNull(fDFField_array72);
        org.junit.Assert.assertTrue(b74 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test201");
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
        org.apache.pdfbox.pdmodel.interactive.form.PDXFAResource pDXFAResource19 = pDAcroForm15.getXFA();
        org.junit.Assert.assertNotNull(cOSDocument2);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertNotNull(cOSName13);
        org.junit.Assert.assertNull(cOSBase14);
        org.junit.Assert.assertNotNull(cOSName16);
        org.junit.Assert.assertNotNull(pDXFAResource19);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test202");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        float[] f_array1 = fDFAnnotationFreeText0.getCallout();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle2 = org.apache.pdfbox.pdmodel.common.PDRectangle.A0;
        fDFAnnotationFreeText0.setFringe(pDRectangle2);
        pDRectangle2.setLowerLeftY((float) (byte) 1);
        org.junit.Assert.assertNull(f_array1);
        org.junit.Assert.assertNotNull(pDRectangle2);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test203");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.PDDocumentCatalog pDDocumentCatalog4 = pDDocument0.getDocumentCatalog();
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText5 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        boolean b6 = fDFAnnotationFreeText5.isNoView();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle7 = org.apache.pdfbox.pdmodel.common.PDRectangle.A0;
        fDFAnnotationFreeText5.setRectangle(pDRectangle7);
        org.apache.pdfbox.pdmodel.PDPage pDPage9 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle7);
        pDDocument0.addPage(pDPage9);
        org.junit.Assert.assertNotNull(pDDocumentCatalog4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(pDRectangle7);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test204");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationText pDAnnotationText0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationText();
        java.lang.String str1 = pDAnnotationText0.getName();
        pDAnnotationText0.setOpen(true);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Note" + "'", str1.equals("Note"));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test205");
        org.apache.pdfbox.cos.COSString cOSString0 = null;
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDNamedDestination pDNamedDestination1 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDNamedDestination(cOSString0);
        org.apache.pdfbox.cos.COSBase cOSBase2 = pDNamedDestination1.getCOSObject();
        org.junit.Assert.assertNull(cOSBase2);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test206");
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
        try {
            pDPageContentStream17.setTextScaling(0.0d, (double) (byte) 1, 10.0d, (double) 1.4f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test207");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue pDSeedValue0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue();
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp pDSeedValueTimeStamp1 = null;
        pDSeedValue0.setTimeStamp(pDSeedValueTimeStamp1);
        pDSeedValue0.setVRequired(true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test208");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode pDStructureNode1 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement pDStructureElement2 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement("O=TD, Padding=10.0, LineHeight=Normal", pDStructureNode1);
        pDStructureElement2.setRevisionNumber(100);
        pDStructureElement2.incrementRevisionNumber();
        pDStructureElement2.setRevisionNumber((int) (short) 0);
        int i8 = pDStructureElement2.getRevisionNumber();
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test209");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDComboBox pDComboBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDComboBox(pDAcroForm0);
        pDComboBox1.setEdit(true);
        java.util.List<java.lang.String> list_str4 = pDComboBox1.getOptions();
        boolean b5 = pDComboBox1.isNoExport();
        try {
            java.lang.String str6 = pDComboBox1.getDefaultStyleString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(list_str4);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test210");
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
        pDAppearanceStream11.setFormType((-4));
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test212");
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
        org.apache.pdfbox.cos.COSArray cOSArray21 = pDShadingType1_19.getBackground();
        org.apache.pdfbox.cos.COSArray cOSArray22 = pDShadingType1_19.getDomain();
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(iterable_cOSName11);
        org.junit.Assert.assertNotNull(cOSName12);
        org.junit.Assert.assertNotNull(cOSDictionary14);
        org.junit.Assert.assertNull(cOSArray21);
        org.junit.Assert.assertNull(cOSArray22);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test213");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDComboBox pDComboBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDComboBox(pDAcroForm0);
        int i2 = pDComboBox1.getFieldFlags();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray4 = pDRectangle3.getCOSArray();
        cOSArray4.clear();
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray4.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName7);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle9 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray10 = pDRectangle9.getCOSArray();
        cOSArray10.clear();
        org.apache.pdfbox.cos.COSName cOSName13 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray10.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName13);
        cOSArray4.addAll(cOSArray10);
        java.util.List<java.lang.Integer> list_i16 = org.apache.pdfbox.pdmodel.common.COSArrayList.convertIntegerCOSArrayToList(cOSArray10);
        pDComboBox1.setSelectedOptionsIndex(list_i16);
        org.junit.Assert.assertTrue(i2 == 131072);
        org.junit.Assert.assertNotNull(pDRectangle3);
        org.junit.Assert.assertNotNull(cOSArray4);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(pDRectangle9);
        org.junit.Assert.assertNotNull(cOSArray10);
        org.junit.Assert.assertNotNull(cOSName13);
        org.junit.Assert.assertNotNull(list_i16);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test214");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary.STYLE_BEVELED;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "B" + "'", str0.equals("B"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test215");
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFDocument fDFDocument1 = org.apache.pdfbox.pdmodel.fdf.FDFDocument.loadXFDF("THead");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test216");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "0" + "'", str0.equals("0"));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test217");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStrikeOut.SUBTYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StrikeOut" + "'", str0.equals("StrikeOut"));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test218");
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
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject19 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDFourColours pDFourColours20 = null;
        pDExportFormatAttributeObject19.setBorderColors(pDFourColours20);
        pDExportFormatAttributeObject19.setTextIndent((float) 0L);
        java.lang.String str24 = pDExportFormatAttributeObject19.getInlineAlign();
        pDExportFormatAttributeObject19.setAllTBorderStyles("TH");
        pDExportFormatAttributeObject19.setListNumbering("");
        pDExportFormatAttributeObject19.setEndIndent((float) (short) 100);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup32 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup("hi!");
        boolean b33 = pDAnnotationTextMarkup32.isInvisible();
        float[] f_array40 = new float[] { ' ', (short) 1, 0.0f, 1, 1L, 0 };
        pDAnnotationTextMarkup32.setQuadPoints(f_array40);
        pDExportFormatAttributeObject19.setPaddings(f_array40);
        pDLayoutAttributeObject0.setBorderThicknesses(f_array40);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNotNull(cOSDictionary8);
        org.junit.Assert.assertNotNull(cOSBase10);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Start" + "'", str24.equals("Start"));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(f_array40);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test219");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.printing.Scaling scaling1 = org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable5 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument0, scaling1, true, 1.0f, false);
        org.apache.pdfbox.pdmodel.DefaultResourceCache defaultResourceCache6 = new org.apache.pdfbox.pdmodel.DefaultResourceCache();
        pDDocument0.setResourceCache((org.apache.pdfbox.pdmodel.ResourceCache) defaultResourceCache6);
        org.apache.pdfbox.cos.COSObject cOSObject8 = null;
        org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState pDExtendedGraphicsState9 = new org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState();
        pDExtendedGraphicsState9.setStrokingAlphaConstant((java.lang.Float) 1.0f);
        defaultResourceCache6.put(cOSObject8, pDExtendedGraphicsState9);
        org.apache.pdfbox.cos.COSObject cOSObject13 = null;
        org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState pDExtendedGraphicsState14 = defaultResourceCache6.getExtGState(cOSObject13);
        org.junit.Assert.assertTrue("'" + scaling1 + "' != '" + org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT + "'", scaling1.equals(org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT));
        org.junit.Assert.assertNotNull(pDExtendedGraphicsState14);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test220");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject.CHECKED_STATE_NEUTRAL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "neutral" + "'", str0.equals("neutral"));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test221");
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
        try {
            pDPageContentStream17.addComment("StructElem");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test222");
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
        float f13 = pDGamma12.getG();
        org.junit.Assert.assertNotNull(pDRectangle0);
        org.junit.Assert.assertNotNull(pDRectangle2);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertNotNull(float8);
        org.junit.Assert.assertTrue(f9 == 0.0f);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(cOSArray11);
        org.junit.Assert.assertTrue(f13 == 0.0f);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test223");
        org.apache.pdfbox.pdmodel.common.function.type4.Operators operators0 = null;
        org.apache.pdfbox.pdmodel.common.function.type4.ExecutionContext executionContext1 = new org.apache.pdfbox.pdmodel.common.function.type4.ExecutionContext(operators0);
        try {
            int i2 = executionContext1.popInt();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test224");
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission0 = org.apache.pdfbox.pdmodel.encryption.AccessPermission.getOwnerAccessPermission();
        accessPermission0.setCanExtractContent(true);
        int i3 = accessPermission0.getPermissionBytes();
        accessPermission0.setCanFillInForm(false);
        org.junit.Assert.assertNotNull(accessPermission0);
        org.junit.Assert.assertTrue(i3 == (-4));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test225");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.O;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test226");
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
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree12 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary13 = pDPageTree12.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition14 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary13);
        pDPage2.setTransition(pDTransition14);
        java.io.InputStream inputStream16 = pDPage2.getContents();
        java.io.InputStream inputStream17 = null;
        try {
            org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner pDVisibleSignDesigner19 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner(inputStream16, inputStream17, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertNotNull(iterator_pDStream4);
        org.junit.Assert.assertNull(pDResources5);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertNotNull(cOSBase9);
        org.junit.Assert.assertNotNull(cOSDictionary13);
        org.junit.Assert.assertNotNull(inputStream16);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test227");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.INDEXED;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test228");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        pDExportFormatAttributeObject1.setLineHeightNormal();
        float f5 = pDExportFormatAttributeObject1.getTextDecorationThickness();
        java.lang.Object obj6 = pDExportFormatAttributeObject1.getWidth();
        org.junit.Assert.assertTrue(f5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "Auto" + "'", obj6.equals("Auto"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test229");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject.SCOPE_ROW;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Row" + "'", str0.equals("Row"));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test230");
        org.apache.pdfbox.contentstream.operator.state.SetMatrix setMatrix0 = new org.apache.pdfbox.contentstream.operator.state.SetMatrix();
        java.lang.String str1 = setMatrix0.getName();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Tm" + "'", str1.equals("Tm"));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test231");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.REPEAT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test232");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CAP;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test233");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument1 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile2 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument1);
        pDDocument1.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata5 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument1);
        org.apache.pdfbox.cos.COSStream cOSStream6 = pDMetadata5.getCOSObject();
        java.io.OutputStream outputStream7 = cOSStream6.createFilteredStream();
        org.apache.pdfbox.util.Hex.writeHexByte((byte) -1, outputStream7);
        org.junit.Assert.assertNotNull(cOSStream6);
        org.junit.Assert.assertNotNull(outputStream7);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test234");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray1 = pDRectangle0.getCOSArray();
        cOSArray1.clear();
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray1.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName4);
        try {
            cOSArray1.set(32, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle0);
        org.junit.Assert.assertNotNull(cOSArray1);
        org.junit.Assert.assertNotNull(cOSName4);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test235");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDFourColours pDFourColours2 = null;
        pDExportFormatAttributeObject1.setBorderColors(pDFourColours2);
        pDExportFormatAttributeObject1.setTextIndent((float) 0L);
        java.lang.String str6 = pDExportFormatAttributeObject1.getInlineAlign();
        pDExportFormatAttributeObject1.setAllTBorderStyles("TH");
        pDExportFormatAttributeObject1.setListNumbering("");
        pDExportFormatAttributeObject1.setAllBorderThicknesses((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Start" + "'", str6.equals("Start"));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test236");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode pDStructureNode1 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement pDStructureElement2 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement("O=TD, Padding=10.0, LineHeight=Normal", pDStructureNode1);
        pDStructureElement2.setRevisionNumber(100);
        pDStructureElement2.incrementRevisionNumber();
        pDStructureElement2.setActualText("Final");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test237");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle1 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage2 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle1);
        int i3 = pDPageTree0.indexOf(pDPage2);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree4 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle5 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage6 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle5);
        int i7 = pDPageTree4.indexOf(pDPage6);
        int i8 = pDPageTree0.indexOf(pDPage6);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(i8 == (-1));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test238");
        int i0 = java.awt.Transparency.TRANSLUCENT;
        org.junit.Assert.assertTrue(i0 == 3);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test239");
        org.apache.pdfbox.io.RandomAccessWrite randomAccessWrite0 = null;
        org.apache.pdfbox.io.RandomAccessOutputStream randomAccessOutputStream1 = new org.apache.pdfbox.io.RandomAccessOutputStream(randomAccessWrite0);
        randomAccessOutputStream1.flush();
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream3 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream((java.io.OutputStream) randomAccessOutputStream1);
        try {
            randomAccessOutputStream1.write((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test240");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties pDVisibleSigProperties0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties();
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner pDVisibleSignDesigner1 = pDVisibleSigProperties0.getPdVisibleSignature();
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties pDVisibleSigProperties3 = pDVisibleSigProperties0.signatureReason("Hide");
        org.junit.Assert.assertNull(pDVisibleSignDesigner1);
        org.junit.Assert.assertNotNull(pDVisibleSigProperties3);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test241");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        pDExportFormatAttributeObject1.setLineHeightNormal();
        java.lang.String str5 = pDExportFormatAttributeObject1.toString();
        pDExportFormatAttributeObject1.setStartIndent((float) 1L);
        java.lang.String str8 = pDExportFormatAttributeObject1.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "O=TD, Padding=10.0, LineHeight=Normal" + "'", str5.equals("O=TD, Padding=10.0, LineHeight=Normal"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "O=TD, Padding=10.0, StartIndent=1.0, LineHeight=Normal" + "'", str8.equals("O=TD, Padding=10.0, StartIndent=1.0, LineHeight=Normal"));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test242");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.PDDocumentCatalog pDDocumentCatalog4 = pDDocument0.getDocumentCatalog();
        pDDocumentCatalog4.setVersion("cb");
        org.junit.Assert.assertNotNull(pDDocumentCatalog4);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test243");
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
        java.io.OutputStream outputStream19 = pDPageContentStream17.getOutput();
        org.apache.pdfbox.pdmodel.graphics.image.PDInlineImage pDInlineImage20 = null;
        try {
            pDPageContentStream17.drawInlineImage(pDInlineImage20, 5723.0f, (float) 2, 10.0f, (float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
        org.junit.Assert.assertNotNull(outputStream19);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test244");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.TIMES_ITALIC;
        org.junit.Assert.assertNotNull(pDType1Font0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test245");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.RANGE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test246");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.TEXT_DECORATION_TYPE_UNDERLINE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Underline" + "'", str0.equals("Underline"));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test247");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_MINUS_180_DEGREES;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "-180" + "'", str0.equals("-180"));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test248");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.printing.Scaling scaling1 = org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable5 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument0, scaling1, true, 1.0f, false);
        org.apache.pdfbox.pdmodel.DefaultResourceCache defaultResourceCache6 = new org.apache.pdfbox.pdmodel.DefaultResourceCache();
        pDDocument0.setResourceCache((org.apache.pdfbox.pdmodel.ResourceCache) defaultResourceCache6);
        org.apache.pdfbox.cos.COSObject cOSObject8 = null;
        org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState pDExtendedGraphicsState9 = new org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState();
        pDExtendedGraphicsState9.setStrokingAlphaConstant((java.lang.Float) 1.0f);
        defaultResourceCache6.put(cOSObject8, pDExtendedGraphicsState9);
        pDExtendedGraphicsState9.setLineJoinStyle((int) '#');
        org.junit.Assert.assertTrue("'" + scaling1 + "' != '" + org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT + "'", scaling1.equals(org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test249");
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
        boolean b37 = pDAppearanceContentStream36.isInTextMode();
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font38 = org.apache.pdfbox.pdmodel.font.PDType1Font.HELVETICA_BOLD;
        java.lang.String str39 = pDType1Font38.toString();
        java.lang.String str40 = pDType1Font38.toString();
        try {
            pDAppearanceContentStream36.setFont((org.apache.pdfbox.pdmodel.font.PDFont) pDType1Font38, (float) (byte) -1);
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
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(pDType1Font38);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "PDType1Font Helvetica-Bold" + "'", str39.equals("PDType1Font Helvetica-Bold"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "PDType1Font Helvetica-Bold" + "'", str40.equals("PDType1Font Helvetica-Bold"));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test250");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.SYMBOL;
        org.junit.Assert.assertNotNull(pDType1Font0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test251");
        org.apache.pdfbox.contentstream.operator.state.SetLineMiterLimit setLineMiterLimit0 = new org.apache.pdfbox.contentstream.operator.state.SetLineMiterLimit();
        org.apache.pdfbox.contentstream.operator.Operator operator1 = null;
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle2 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray3 = pDRectangle2.getCOSArray();
        org.apache.pdfbox.pdmodel.common.PDRange pDRange4 = new org.apache.pdfbox.pdmodel.common.PDRange(cOSArray3);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject6 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject6.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary9 = pDExportFormatAttributeObject6.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName11 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary9.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName11, (int) (short) 0);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP pDSeedValueMDP14 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP(cOSDictionary9);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree15 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary16 = pDPageTree15.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject17 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty18 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary16, pDUserAttributeObject17);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent19 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary16);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit20 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary16);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_21 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary16);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType7 pDShadingType7_22 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType7(cOSDictionary16);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolygon fDFAnnotationPolygon23 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolygon(cOSDictionary16);
        org.apache.pdfbox.cos.COSName cOSName24 = org.apache.pdfbox.cos.COSName.FLATE_DECODE;
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree25 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary26 = pDPageTree25.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions27 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary26);
        org.apache.pdfbox.cos.COSName cOSName29 = org.apache.pdfbox.cos.COSName.CROP_BOX;
        java.lang.String str30 = cOSDictionary26.getEmbeddedString("Overline", cOSName29);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch pDActionLaunch31 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch(cOSDictionary26);
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor pDFontDescriptor32 = new org.apache.pdfbox.pdmodel.font.PDFontDescriptor(cOSDictionary26);
        org.apache.pdfbox.cos.COSName cOSName33 = org.apache.pdfbox.cos.COSName.BE;
        org.apache.pdfbox.cos.COSName cOSName34 = org.apache.pdfbox.cos.COSName.LEADING;
        org.apache.pdfbox.cos.COSName cOSName35 = org.apache.pdfbox.cos.COSName.DS;
        org.apache.pdfbox.cos.COSName cOSName36 = org.apache.pdfbox.cos.COSName.ASCII_HEX_DECODE;
        org.apache.pdfbox.cos.COSName cOSName37 = org.apache.pdfbox.cos.COSName.CROP_BOX;
        org.apache.pdfbox.cos.COSBase[] cOSBase_array38 = new org.apache.pdfbox.cos.COSBase[] { cOSDictionary9, cOSDictionary16, cOSName24, cOSDictionary26, cOSName33, cOSName34, cOSName35, cOSName36, cOSName37 };
        java.util.ArrayList<org.apache.pdfbox.cos.COSBase> arraylist_cOSBase39 = new java.util.ArrayList<org.apache.pdfbox.cos.COSBase>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase39, cOSBase_array38);
        cOSArray3.removeAll((java.util.Collection<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase39);
        try {
            setLineMiterLimit0.process(operator1, (java.util.List<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase39);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle2);
        org.junit.Assert.assertNotNull(cOSArray3);
        org.junit.Assert.assertNotNull(cOSDictionary9);
        org.junit.Assert.assertNotNull(cOSName11);
        org.junit.Assert.assertNotNull(cOSDictionary16);
        org.junit.Assert.assertNotNull(cOSName24);
        org.junit.Assert.assertNotNull(cOSDictionary26);
        org.junit.Assert.assertNotNull(cOSName29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(cOSName33);
        org.junit.Assert.assertNotNull(cOSName34);
        org.junit.Assert.assertNotNull(cOSName35);
        org.junit.Assert.assertNotNull(cOSName36);
        org.junit.Assert.assertNotNull(cOSName37);
        org.junit.Assert.assertNotNull(cOSBase_array38);
        org.junit.Assert.assertTrue(b40 == true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test252");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationRubberStamp.NAME_SOLD;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Sold" + "'", str0.equals("Sold"));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test253");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary4.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName6, (int) (short) 0);
        org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroupAttributes pDTransparencyGroupAttributes9 = new org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroupAttributes(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSName6);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test254");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        java.util.Calendar calendar1 = pDAnnotationLine0.getCreationDate();
        float f2 = pDAnnotationLine0.getCaptionHorizontalOffset();
        java.util.Calendar calendar3 = pDAnnotationLine0.getCreationDate();
        org.junit.Assert.assertNull(calendar1);
        org.junit.Assert.assertTrue(f2 == 0.0f);
        org.junit.Assert.assertNull(calendar3);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test255");
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
        fDFField10.setWidgetFieldFlags((java.lang.Integer) 2);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit16 = fDFField10.getIconFit();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNull(calendar9);
        org.junit.Assert.assertNull(pDAdditionalActions13);
        org.junit.Assert.assertNull(fDFIconFit16);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test256");
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitDestination pDPageFitDestination0 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitDestination();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test257");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.measurement.PDNumberFormatDictionary.FRACTIONAL_DISPLAY_FRACTION;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "F" + "'", str0.equals("F"));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test258");
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation0 = new org.apache.pdfbox.pdmodel.PDDocumentInformation();
        java.lang.String str1 = pDDocumentInformation0.getCreator();
        java.lang.String str2 = pDDocumentInformation0.getProducer();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test259");
        org.apache.pdfbox.contentstream.operator.text.ShowText showText0 = new org.apache.pdfbox.contentstream.operator.text.ShowText();
        org.apache.pdfbox.contentstream.operator.Operator operator1 = null;
        java.util.List<org.apache.pdfbox.cos.COSBase> list_cOSBase2 = null;
        try {
            showText0.process(operator1, list_cOSBase2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test260");
        org.apache.pdfbox.pdmodel.encryption.PublicKeyProtectionPolicy publicKeyProtectionPolicy0 = new org.apache.pdfbox.pdmodel.encryption.PublicKeyProtectionPolicy();
        org.apache.pdfbox.pdmodel.encryption.PublicKeyRecipient publicKeyRecipient1 = new org.apache.pdfbox.pdmodel.encryption.PublicKeyRecipient();
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission2 = publicKeyRecipient1.getPermission();
        publicKeyProtectionPolicy0.addRecipient(publicKeyRecipient1);
        org.apache.pdfbox.pdmodel.encryption.PublicKeySecurityHandler publicKeySecurityHandler4 = new org.apache.pdfbox.pdmodel.encryption.PublicKeySecurityHandler(publicKeyProtectionPolicy0);
        org.apache.pdfbox.pdmodel.encryption.PDEncryption pDEncryption5 = null;
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree6 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = pDPageTree6.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject8 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty9 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary7, pDUserAttributeObject8);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent10 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary7);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit11 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary7);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_12 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary7);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle13 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray14 = pDRectangle13.getCOSArray();
        cOSArray14.clear();
        org.apache.pdfbox.cos.COSName cOSName17 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray14.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName17);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle19 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray20 = pDRectangle19.getCOSArray();
        cOSArray20.clear();
        org.apache.pdfbox.cos.COSName cOSName23 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray20.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName23);
        cOSArray14.addAll(cOSArray20);
        pDShadingType1_12.setBackground(cOSArray14);
        org.apache.pdfbox.pdmodel.encryption.DecryptionMaterial decryptionMaterial27 = null;
        try {
            publicKeySecurityHandler4.prepareForDecryption(pDEncryption5, cOSArray14, decryptionMaterial27);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNull(accessPermission2);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertNotNull(pDRectangle13);
        org.junit.Assert.assertNotNull(cOSArray14);
        org.junit.Assert.assertNotNull(cOSName17);
        org.junit.Assert.assertNotNull(pDRectangle19);
        org.junit.Assert.assertNotNull(cOSArray20);
        org.junit.Assert.assertNotNull(cOSName23);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test261");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.HELVETICA_BOLD;
        boolean b2 = pDType1Font0.hasGlyph("COSName{PageMode}");
        org.apache.pdfbox.pdmodel.font.encoding.GlyphList glyphList4 = org.apache.pdfbox.pdmodel.font.encoding.GlyphList.getAdobeGlyphList();
        java.lang.String str5 = pDType1Font0.toUnicode((-4), glyphList4);
        java.lang.String str7 = glyphList4.toUnicode("LowerAlpha");
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(glyphList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test262");
        org.apache.pdfbox.pdmodel.common.COSArrayList<org.apache.pdfbox.printing.PDFPageable> cosarraylist_pDFPageable0 = new org.apache.pdfbox.pdmodel.common.COSArrayList<org.apache.pdfbox.printing.PDFPageable>();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument1 = null;
        org.apache.pdfbox.printing.PDFPageable pDFPageable2 = new org.apache.pdfbox.printing.PDFPageable(pDDocument1);
        org.apache.pdfbox.printing.PDFPageable[] pDFPageable_array3 = new org.apache.pdfbox.printing.PDFPageable[] { pDFPageable2 };
        java.util.ArrayList<org.apache.pdfbox.printing.PDFPageable> arraylist_pDFPageable4 = new java.util.ArrayList<org.apache.pdfbox.printing.PDFPageable>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.printing.PDFPageable>) arraylist_pDFPageable4, pDFPageable_array3);
        boolean b6 = cosarraylist_pDFPageable0.containsAll((java.util.Collection<org.apache.pdfbox.printing.PDFPageable>) arraylist_pDFPageable4);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine7 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary8 = null;
        pDAnnotationLine7.setBorderStyle(pDBorderStyleDictionary8);
        float[] f_array13 = new float[] { (short) 1, '#', 100L };
        org.apache.pdfbox.cos.COSName cOSName14 = org.apache.pdfbox.cos.COSName.PAGE_LAYOUT;
        org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace15 = null;
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor16 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array13, cOSName14, pDColorSpace15);
        org.apache.pdfbox.cos.COSName cOSName17 = pDColor16.getPatternName();
        pDAnnotationLine7.setColor(pDColor16);
        org.apache.pdfbox.cos.COSName cOSName19 = pDColor16.getPatternName();
        org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace20 = pDColor16.getColorSpace();
        int i21 = cosarraylist_pDFPageable0.indexOf((java.lang.Object) pDColor16);
        org.junit.Assert.assertNotNull(pDFPageable_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(f_array13);
        org.junit.Assert.assertNotNull(cOSName14);
        org.junit.Assert.assertNotNull(cOSName17);
        org.junit.Assert.assertNotNull(cOSName19);
        org.junit.Assert.assertNull(pDColorSpace20);
        org.junit.Assert.assertTrue(i21 == (-1));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test263");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DEVICERGB;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test264");
        org.apache.pdfbox.contentstream.operator.markedcontent.DrawObject drawObject0 = new org.apache.pdfbox.contentstream.operator.markedcontent.DrawObject();
        java.lang.String str1 = drawObject0.getName();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Do" + "'", str1.equals("Do"));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test265");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions2 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary1);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.CROP_BOX;
        java.lang.String str5 = cOSDictionary1.getEmbeddedString("Overline", cOSName4);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch pDActionLaunch6 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch(cOSDictionary1);
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor pDFontDescriptor7 = new org.apache.pdfbox.pdmodel.font.PDFontDescriptor(cOSDictionary1);
        org.apache.pdfbox.pdmodel.common.PDStream pDStream8 = pDFontDescriptor7.getCIDSet();
        boolean b9 = pDFontDescriptor7.isScript();
        boolean b10 = pDFontDescriptor7.isAllCap();
        pDFontDescriptor7.setForceBold(false);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(pDStream8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test266");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions2 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary1);
        java.lang.String str5 = cOSDictionary1.getEmbeddedString("Final", "List");
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test267");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.RUBY_POSITION_AFTER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "After" + "'", str0.equals("After"));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test268");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        java.lang.String str5 = pDArtifactMarkedContent4.toString();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "tag=Artifact, properties=COSDictionary{COSName{Type}:COSName{Pages};COSName{Kids}:COSArray{[]};COSName{Count}:COSInt{0};}, contents=[]" + "'", str5.equals("tag=Artifact, properties=COSDictionary{COSName{Type}:COSName{Pages};COSName{Kids}:COSArray{[]};COSName{Count}:COSInt{0};}, contents=[]"));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test269");
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
        java.util.List<java.lang.Float> list_f13 = org.apache.pdfbox.pdmodel.common.COSArrayList.convertFloatCOSArrayToList(cOSArray1);
        org.junit.Assert.assertNotNull(pDRectangle0);
        org.junit.Assert.assertNotNull(cOSArray1);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNotNull(pDRectangle6);
        org.junit.Assert.assertNotNull(cOSArray7);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertNotNull(list_f13);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test270");
        org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode appendMode0 = org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode.PREPEND;
        org.junit.Assert.assertTrue("'" + appendMode0 + "' != '" + org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode.PREPEND + "'", appendMode0.equals(org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode.PREPEND));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test271");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.P;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "P" + "'", str0.equals("P"));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test272");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata4 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument0);
        org.apache.pdfbox.cos.COSStream cOSStream5 = pDMetadata4.getCOSObject();
        java.io.OutputStream outputStream6 = cOSStream5.createFilteredStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDActionHide pDActionHide7 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionHide((org.apache.pdfbox.cos.COSDictionary) cOSStream5);
        java.util.Collection<org.apache.pdfbox.cos.COSBase> collection_cOSBase8 = cOSStream5.getValues();
        org.junit.Assert.assertNotNull(cOSStream5);
        org.junit.Assert.assertNotNull(outputStream6);
        org.junit.Assert.assertNotNull(collection_cOSBase8);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test273");
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
        boolean b15 = accessPermission9.isReadOnly();
        org.junit.Assert.assertNotNull(securityHandlerFactory0);
        org.junit.Assert.assertNull(accessPermission3);
        org.junit.Assert.assertNull(accessPermission6);
        org.junit.Assert.assertNotNull(securityHandler8);
        org.junit.Assert.assertNotNull(accessPermission9);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test274");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary4.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName6, (int) (short) 0);
        org.apache.pdfbox.pdmodel.font.encoding.MacRomanEncoding macRomanEncoding10 = org.apache.pdfbox.pdmodel.font.encoding.MacRomanEncoding.INSTANCE;
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding11 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary4, false, (org.apache.pdfbox.pdmodel.font.encoding.Encoding) macRomanEncoding10);
        boolean b13 = dictionaryEncoding11.contains((-4));
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str14 = dictionaryEncoding11.getCodeToNameMap();
        org.apache.pdfbox.cos.COSBase cOSBase15 = dictionaryEncoding11.getCOSObject();
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(macRomanEncoding10);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map_i_str14);
        org.junit.Assert.assertNotNull(cOSBase15);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test275");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.SUBFILTER_ADBE_PKCS7_SHA1;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test276");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        float[] f_array1 = fDFAnnotationFreeText0.getCallout();
        boolean b2 = fDFAnnotationFreeText0.isReadOnly();
        fDFAnnotationFreeText0.setJustification("BlockQuote");
        org.junit.Assert.assertNull(f_array1);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test277");
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
        org.apache.pdfbox.pdmodel.graphics.PDLineDashPattern pDLineDashPattern22 = new org.apache.pdfbox.pdmodel.graphics.PDLineDashPattern(cOSArray8, (int) (short) 100);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(pDRectangle7);
        org.junit.Assert.assertNotNull(cOSArray8);
        org.junit.Assert.assertNotNull(cOSName11);
        org.junit.Assert.assertNotNull(pDRectangle13);
        org.junit.Assert.assertNotNull(cOSArray14);
        org.junit.Assert.assertNotNull(cOSName17);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test278");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata4 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument0);
        org.apache.pdfbox.cos.COSStream cOSStream5 = pDMetadata4.getCOSObject();
        java.io.OutputStream outputStream6 = cOSStream5.createFilteredStream();
        org.apache.pdfbox.pdmodel.common.PDObjectStream pDObjectStream7 = new org.apache.pdfbox.pdmodel.common.PDObjectStream(cOSStream5);
        java.lang.String str8 = pDObjectStream7.getType();
        int i9 = pDObjectStream7.getFirstByteOffset();
        org.junit.Assert.assertNotNull(cOSStream5);
        org.junit.Assert.assertNotNull(outputStream6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Metadata" + "'", str8.equals("Metadata"));
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test279");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine.LE_NONE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "None" + "'", str0.equals("None"));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test280");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue pDSeedValue0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue();
        pDSeedValue0.setSubFilterRequired(false);
        boolean b3 = pDSeedValue0.isAddRevInfoRequired();
        boolean b4 = pDSeedValue0.isReasonRequired();
        boolean b5 = pDSeedValue0.isAddRevInfoRequired();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test281");
        org.apache.pdfbox.pdmodel.common.COSArrayList<org.apache.pdfbox.printing.PDFPageable> cosarraylist_pDFPageable0 = new org.apache.pdfbox.pdmodel.common.COSArrayList<org.apache.pdfbox.printing.PDFPageable>();
        org.apache.pdfbox.cos.COSArray cOSArray1 = cosarraylist_pDFPageable0.toList();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument2 = null;
        org.apache.pdfbox.printing.PDFPageable pDFPageable3 = new org.apache.pdfbox.printing.PDFPageable(pDDocument2);
        org.apache.pdfbox.printing.PDFPageable[] pDFPageable_array4 = new org.apache.pdfbox.printing.PDFPageable[] { pDFPageable3 };
        java.util.ArrayList<org.apache.pdfbox.printing.PDFPageable> arraylist_pDFPageable5 = new java.util.ArrayList<org.apache.pdfbox.printing.PDFPageable>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.printing.PDFPageable>) arraylist_pDFPageable5, pDFPageable_array4);
        try {
            boolean b7 = cosarraylist_pDFPageable0.retainAll((java.util.Collection<org.apache.pdfbox.printing.PDFPageable>) arraylist_pDFPageable5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(cOSArray1);
        org.junit.Assert.assertNotNull(pDFPageable_array4);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test282");
        org.apache.pdfbox.pdmodel.PageLayout pageLayout0 = org.apache.pdfbox.pdmodel.PageLayout.TWO_PAGE_RIGHT;
        java.lang.String str1 = pageLayout0.stringValue();
        org.junit.Assert.assertTrue("'" + pageLayout0 + "' != '" + org.apache.pdfbox.pdmodel.PageLayout.TWO_PAGE_RIGHT + "'", pageLayout0.equals(org.apache.pdfbox.pdmodel.PageLayout.TWO_PAGE_RIGHT));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "TwoPageRight" + "'", str1.equals("TwoPageRight"));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test283");
        org.apache.pdfbox.pdfwriter.COSWriter cOSWriter0 = null;
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.SigningSupport signingSupport1 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.SigningSupport(cOSWriter0);
        try {
            java.io.InputStream inputStream2 = signingSupport1.getContent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test284");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray1 = pDRectangle0.getCOSArray();
        cOSArray1.clear();
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray1.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName4);
        org.apache.pdfbox.pdmodel.graphics.color.PDGamma pDGamma6 = new org.apache.pdfbox.pdmodel.graphics.color.PDGamma(cOSArray1);
        try {
            float f7 = pDGamma6.getB();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle0);
        org.junit.Assert.assertNotNull(cOSArray1);
        org.junit.Assert.assertNotNull(cOSName4);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test285");
        org.apache.pdfbox.util.filetypedetector.FileType fileType0 = org.apache.pdfbox.util.filetypedetector.FileType.PSD;
        org.junit.Assert.assertTrue("'" + fileType0 + "' != '" + org.apache.pdfbox.util.filetypedetector.FileType.PSD + "'", fileType0.equals(org.apache.pdfbox.util.filetypedetector.FileType.PSD));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test286");
        org.apache.pdfbox.pdmodel.common.function.type4.Operators operators0 = null;
        org.apache.pdfbox.pdmodel.common.function.type4.ExecutionContext executionContext1 = new org.apache.pdfbox.pdmodel.common.function.type4.ExecutionContext(operators0);
        try {
            float f2 = executionContext1.popReal();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test287");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.printing.Scaling scaling1 = org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable5 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument0, scaling1, true, 1.0f, false);
        org.apache.pdfbox.printing.Scaling scaling6 = org.apache.pdfbox.printing.Scaling.STRETCH_TO_FIT;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable9 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument0, scaling6, false, (float) 1L);
        org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject pDFormXObject10 = new org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject(pDDocument0);
        org.apache.pdfbox.cos.COSDocument cOSDocument11 = pDDocument0.getDocument();
        org.apache.pdfbox.cos.COSDocument cOSDocument12 = pDDocument0.getDocument();
        org.junit.Assert.assertTrue("'" + scaling1 + "' != '" + org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT + "'", scaling1.equals(org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT));
        org.junit.Assert.assertTrue("'" + scaling6 + "' != '" + org.apache.pdfbox.printing.Scaling.STRETCH_TO_FIT + "'", scaling6.equals(org.apache.pdfbox.printing.Scaling.STRETCH_TO_FIT));
        org.junit.Assert.assertNotNull(cOSDocument11);
        org.junit.Assert.assertNotNull(cOSDocument12);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test288");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_6 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType7 pDShadingType7_7 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType7(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolygon fDFAnnotationPolygon8 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolygon(cOSDictionary1);
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo pDMarkInfo9 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary1);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test289");
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
        boolean b12 = cOSDocument2.isClosed();
        org.junit.Assert.assertNotNull(cOSDocument2);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNull(cOSObjectKey9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test290");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        pDExportFormatAttributeObject1.setLineHeightNormal();
        java.lang.String str5 = pDExportFormatAttributeObject1.toString();
        pDExportFormatAttributeObject1.setStartIndent((float) 1L);
        org.apache.pdfbox.pdmodel.graphics.color.PDGamma pDGamma8 = pDExportFormatAttributeObject1.getTextDecorationColor();
        pDExportFormatAttributeObject1.setHeight((int) (short) -1);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "O=TD, Padding=10.0, LineHeight=Normal" + "'", str5.equals("O=TD, Padding=10.0, LineHeight=Normal"));
        org.junit.Assert.assertNull(pDGamma8);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test291");
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions0 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree1 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDPageTree1.getCOSObject();
        cOSDictionary2.setString("Highlight", "Start");
        java.lang.String str6 = cOSDictionary2.toString();
        org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions pDFormFieldAdditionalActions7 = new org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionSound pDActionSound8 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionSound();
        pDActionSound8.setMix(false);
        pDFormFieldAdditionalActions7.setF((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionSound8);
        pDAdditionalActions0.setF((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionSound8);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "COSDictionary{COSName{Type}:COSName{Pages};COSName{Kids}:COSArray{[]};COSName{Count}:COSInt{0};COSName{Highlight}:COSString{Start};}" + "'", str6.equals("COSDictionary{COSName{Type}:COSName{Pages};COSName{Kids}:COSArray{[]};COSName{Count}:COSInt{0};COSName{Highlight}:COSString{Start};}"));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test292");
        org.apache.pdfbox.cos.COSStream cOSStream0 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions1 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions((org.apache.pdfbox.cos.COSDictionary) cOSStream0);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test293");
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
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions14 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions();
        fDFField10.setAdditionalActions(pDAdditionalActions14);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNull(calendar9);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test294");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties pDVisibleSigProperties0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties();
        java.lang.String str1 = pDVisibleSigProperties0.getSignerName();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test295");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        int i6 = cOSDictionary4.getInt("Expired");
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.A;
        cOSDictionary4.setInt(cOSName7, 100);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo pDActionGoTo10 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo(cOSDictionary4);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree11 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary12 = pDPageTree11.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject13 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty14 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary12, pDUserAttributeObject13);
        java.lang.String str16 = cOSDictionary12.getString("TD");
        cOSDictionary4.addAll(cOSDictionary12);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(cOSDictionary12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test296");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        java.util.Calendar calendar3 = null;
        java.util.Calendar calendar4 = cOSDictionary1.getDate("Inline", calendar3);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNull(calendar4);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test297");
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
        pDSeparation22.setColorantName("Underline");
        org.apache.pdfbox.cos.COSName cOSName26 = org.apache.pdfbox.cos.COSName.STD_CF;
        org.apache.pdfbox.pdmodel.common.function.PDFunctionTypeIdentity pDFunctionTypeIdentity27 = new org.apache.pdfbox.pdmodel.common.function.PDFunctionTypeIdentity((org.apache.pdfbox.cos.COSBase) cOSName26);
        pDSeparation22.setTintTransform((org.apache.pdfbox.pdmodel.common.function.PDFunction) pDFunctionTypeIdentity27);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(iterable_cOSName11);
        org.junit.Assert.assertNotNull(cOSName12);
        org.junit.Assert.assertNotNull(cOSDictionary14);
        org.junit.Assert.assertNotNull(cOSName21);
        org.junit.Assert.assertNotNull(cOSName26);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test298");
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle pDTransitionStyle0 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Cover;
        org.junit.Assert.assertTrue("'" + pDTransitionStyle0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Cover + "'", pDTransitionStyle0.equals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Cover));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test299");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.PART;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Part" + "'", str0.equals("Part"));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test300");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.HELVETICA_BOLD;
        boolean b2 = pDType1Font0.hasGlyph("COSName{PageMode}");
        org.apache.pdfbox.pdmodel.font.encoding.GlyphList glyphList4 = org.apache.pdfbox.pdmodel.font.encoding.GlyphList.getAdobeGlyphList();
        java.lang.String str5 = pDType1Font0.toUnicode((-4), glyphList4);
        java.lang.String str7 = glyphList4.sequenceToName("Sect");
        java.lang.String str9 = glyphList4.toUnicode("Tag");
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(glyphList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ".notdef" + "'", str7.equals(".notdef"));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test301");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        float[] f_array1 = fDFAnnotationFreeText0.getCallout();
        fDFAnnotationFreeText0.setDefaultAppearance("I");
        java.lang.String str4 = fDFAnnotationFreeText0.getLineEndingStyle();
        java.lang.String str5 = fDFAnnotationFreeText0.getDefaultAppearance();
        float f6 = fDFAnnotationFreeText0.getOpacity();
        org.junit.Assert.assertNull(f_array1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "I" + "'", str5.equals("I"));
        org.junit.Assert.assertTrue(f6 == 1.0f);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test302");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.printing.Scaling scaling1 = org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable5 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument0, scaling1, true, 1.0f, false);
        org.apache.pdfbox.pdmodel.DefaultResourceCache defaultResourceCache6 = new org.apache.pdfbox.pdmodel.DefaultResourceCache();
        pDDocument0.setResourceCache((org.apache.pdfbox.pdmodel.ResourceCache) defaultResourceCache6);
        org.apache.pdfbox.cos.COSObject cOSObject8 = null;
        org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState pDExtendedGraphicsState9 = new org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState();
        pDExtendedGraphicsState9.setStrokingAlphaConstant((java.lang.Float) 1.0f);
        defaultResourceCache6.put(cOSObject8, pDExtendedGraphicsState9);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary13 = pDExtendedGraphicsState9.getCOSObject();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree14 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary15 = pDPageTree14.getCOSObject();
        cOSDictionary15.setString("Highlight", "Start");
        org.apache.pdfbox.cos.COSName cOSName19 = org.apache.pdfbox.cos.COSName.OFF;
        java.lang.String str20 = cOSDictionary15.getNameAsString(cOSName19);
        java.lang.String str22 = cOSDictionary13.getNameAsString(cOSName19, "Quote");
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions23 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary13);
        org.junit.Assert.assertTrue("'" + scaling1 + "' != '" + org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT + "'", scaling1.equals(org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT));
        org.junit.Assert.assertNotNull(cOSDictionary13);
        org.junit.Assert.assertNotNull(cOSDictionary15);
        org.junit.Assert.assertNotNull(cOSName19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Quote" + "'", str22.equals("Quote"));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test303");
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitWidthDestination pDPageFitWidthDestination0 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitWidthDestination();
        boolean b1 = pDPageFitWidthDestination0.fitBoundingBox();
        int i2 = pDPageFitWidthDestination0.findPageNumber();
        pDPageFitWidthDestination0.setFitBoundingBox(false);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i2 == (-1));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test304");
        org.apache.pdfbox.pdmodel.fdf.FDFOptionElement fDFOptionElement0 = new org.apache.pdfbox.pdmodel.fdf.FDFOptionElement();
        fDFOptionElement0.setOption("90");
        java.lang.String str3 = fDFOptionElement0.getDefaultAppearanceString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test305");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        float[] f_array1 = fDFAnnotationFreeText0.getCallout();
        fDFAnnotationFreeText0.setJustification("Document");
        org.junit.Assert.assertNull(f_array1);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test306");
        org.apache.pdfbox.contentstream.PDContentStream pDContentStream0 = null;
        try {
            org.apache.pdfbox.pdfparser.PDFStreamParser pDFStreamParser1 = new org.apache.pdfbox.pdfparser.PDFStreamParser(pDContentStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test307");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        java.lang.String str5 = cOSDictionary1.getString("TD");
        org.apache.pdfbox.pdmodel.font.PDTrueTypeFont pDTrueTypeFont6 = new org.apache.pdfbox.pdmodel.font.PDTrueTypeFont(cOSDictionary1);
        java.awt.geom.GeneralPath generalPath8 = pDTrueTypeFont6.getNormalizedPath((int) (byte) 100);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(generalPath8);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test308");
        org.apache.pdfbox.pdmodel.graphics.PDFontSetting pDFontSetting0 = new org.apache.pdfbox.pdmodel.graphics.PDFontSetting();
        org.apache.pdfbox.cos.COSBase cOSBase1 = pDFontSetting0.getCOSObject();
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font2 = org.apache.pdfbox.pdmodel.font.PDType1Font.HELVETICA_BOLD;
        boolean b4 = pDType1Font2.hasGlyph("COSName{PageMode}");
        boolean b5 = pDType1Font2.willBeSubset();
        pDFontSetting0.setFont((org.apache.pdfbox.pdmodel.font.PDFont) pDType1Font2);
        org.junit.Assert.assertNotNull(cOSBase1);
        org.junit.Assert.assertNotNull(pDType1Font2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test309");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.LI;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "LI" + "'", str0.equals("LI"));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test310");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray1 = pDRectangle0.getCOSArray();
        cOSArray1.clear();
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitHeightDestination pDPageFitHeightDestination3 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitHeightDestination(cOSArray1);
        boolean b4 = cOSArray1.isNeedToBeUpdated();
        float[] f_array5 = cOSArray1.toFloatArray();
        org.junit.Assert.assertNotNull(pDRectangle0);
        org.junit.Assert.assertNotNull(cOSArray1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(f_array5);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test311");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.MOD_DATE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test312");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDComboBox pDComboBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDComboBox(pDAcroForm0);
        pDComboBox1.setQ(5);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDComboBox1.getCOSObject();
        org.junit.Assert.assertNotNull(cOSDictionary4);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test313");
        org.apache.pdfbox.pdmodel.fdf.FDFOptionElement fDFOptionElement0 = new org.apache.pdfbox.pdmodel.fdf.FDFOptionElement();
        org.apache.pdfbox.cos.COSArray cOSArray1 = fDFOptionElement0.getCOSArray();
        org.junit.Assert.assertNotNull(cOSArray1);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test314");
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
        pDExportFormatAttributeObject20.setLineHeightNormal();
        float f24 = pDExportFormatAttributeObject20.getTextDecorationThickness();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup26 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup("hi!");
        float[] f_array30 = new float[] { (short) 1, '#', 100L };
        org.apache.pdfbox.cos.COSName cOSName31 = org.apache.pdfbox.cos.COSName.PAGE_LAYOUT;
        org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace32 = null;
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor33 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array30, cOSName31, pDColorSpace32);
        pDAnnotationTextMarkup26.setQuadPoints(f_array30);
        pDExportFormatAttributeObject20.setTPaddings(f_array30);
        try {
            pDPageContentStream17.setStrokingColor(f_array30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
        org.junit.Assert.assertTrue(f24 == (-1.0f));
        org.junit.Assert.assertNotNull(f_array30);
        org.junit.Assert.assertNotNull(cOSName31);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test315");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle1 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage2 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle1);
        int i3 = pDPageTree0.indexOf(pDPage2);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary5 = pDPageTree0.getCOSObject();
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSDictionary5);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test316");
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFDocument fDFDocument1 = org.apache.pdfbox.pdmodel.fdf.FDFDocument.loadXFDF("JavaScript");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test317");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        boolean b1 = fDFAnnotationFreeText0.isNoView();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle2 = org.apache.pdfbox.pdmodel.common.PDRectangle.A0;
        fDFAnnotationFreeText0.setRectangle(pDRectangle2);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = fDFAnnotationFreeText0.getRectangle();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary5 = null;
        fDFAnnotationFreeText0.setBorderStyle(pDBorderStyleDictionary5);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary7 = null;
        fDFAnnotationFreeText0.setBorderStyle(pDBorderStyleDictionary7);
        java.lang.String str9 = fDFAnnotationFreeText0.getDate();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(pDRectangle2);
        org.junit.Assert.assertNotNull(pDRectangle4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test318");
        org.apache.pdfbox.pdfparser.PDFXRefStream pDFXRefStream0 = new org.apache.pdfbox.pdfparser.PDFXRefStream();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject2 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject2.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary5 = pDExportFormatAttributeObject2.getCOSObject();
        pDFXRefStream0.addTrailerInfo(cOSDictionary5);
        org.junit.Assert.assertNotNull(cOSDictionary5);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test319");
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
        org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentGroup pDOptionalContentGroup18 = null;
        try {
            pDOptionalContentProperties15.addGroup(pDOptionalContentGroup18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertTrue(long11 == (-1L));
        org.junit.Assert.assertNotNull(cOSName12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "COSName{PageMode}" + "'", str13.equals("COSName{PageMode}"));
        org.junit.Assert.assertNull(cOSBase14);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test320");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.COORDS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test321");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        try {
            org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata1 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test322");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData pDActionImportData5 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData(cOSDictionary1);
        int i6 = cOSDictionary1.size();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertTrue(i6 == 3);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test323");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams pDWindowsLaunchParams4 = new org.apache.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary1);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test324");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        java.awt.image.BufferedImage bufferedImage1 = null;
        try {
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject pDImageXObject3 = org.apache.pdfbox.pdmodel.graphics.image.JPEGFactory.createFromImage(pDDocument0, bufferedImage1, (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test325");
        org.apache.pdfbox.contentstream.operator.state.Concatenate concatenate0 = new org.apache.pdfbox.contentstream.operator.state.Concatenate();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test326");
        org.apache.pdfbox.pdmodel.graphics.blend.BlendMode blendMode0 = null;
        java.awt.Composite composite2 = org.apache.pdfbox.pdmodel.graphics.blend.BlendComposite.getInstance(blendMode0, (float) (byte) 100);
        org.junit.Assert.assertNotNull(composite2);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test327");
        org.apache.pdfbox.contentstream.operator.graphics.CloseAndStrokePath closeAndStrokePath0 = new org.apache.pdfbox.contentstream.operator.graphics.CloseAndStrokePath();
        org.apache.pdfbox.contentstream.PDFStreamEngine pDFStreamEngine1 = null;
        closeAndStrokePath0.setContext(pDFStreamEngine1);
        java.lang.String str3 = closeAndStrokePath0.getName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "s" + "'", str3.equals("s"));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test328");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationText.NAME_INSERT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Insert" + "'", str0.equals("Insert"));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test329");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionSound pDActionSound0 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionSound();
        pDActionSound0.setMix(false);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument3 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile4 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument3);
        pDDocument3.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata7 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument3);
        org.apache.pdfbox.cos.COSStream cOSStream8 = pDMetadata7.getCOSObject();
        java.lang.String str9 = cOSStream8.toTextString();
        java.io.OutputStream outputStream10 = cOSStream8.createUnfilteredStream();
        pDActionSound0.setSound(cOSStream8);
        org.apache.pdfbox.cos.COSStream cOSStream12 = pDActionSound0.getSound();
        org.junit.Assert.assertNotNull(cOSStream8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(cOSStream12);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test330");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        java.lang.String str2 = pDEmbeddedFile1.getMacCreator();
        org.apache.pdfbox.pdmodel.common.COSArrayList<org.apache.pdfbox.printing.PDFPageable> cosarraylist_pDFPageable3 = new org.apache.pdfbox.pdmodel.common.COSArrayList<org.apache.pdfbox.printing.PDFPageable>();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument4 = null;
        org.apache.pdfbox.printing.PDFPageable pDFPageable5 = new org.apache.pdfbox.printing.PDFPageable(pDDocument4);
        org.apache.pdfbox.printing.PDFPageable[] pDFPageable_array6 = new org.apache.pdfbox.printing.PDFPageable[] { pDFPageable5 };
        java.util.ArrayList<org.apache.pdfbox.printing.PDFPageable> arraylist_pDFPageable7 = new java.util.ArrayList<org.apache.pdfbox.printing.PDFPageable>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.printing.PDFPageable>) arraylist_pDFPageable7, pDFPageable_array6);
        boolean b9 = cosarraylist_pDFPageable3.containsAll((java.util.Collection<org.apache.pdfbox.printing.PDFPageable>) arraylist_pDFPageable7);
        pDEmbeddedFile1.setFileDecodeParams((java.util.List<org.apache.pdfbox.printing.PDFPageable>) cosarraylist_pDFPageable3);
        java.lang.String str11 = pDEmbeddedFile1.getMacSubtype();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(pDFPageable_array6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test331");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FUNCTION;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test332");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.RUBY_ALIGN_END;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "End" + "'", str0.equals("End"));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test333");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData pDActionImportData5 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFCatalog fDFCatalog6 = new org.apache.pdfbox.pdmodel.fdf.FDFCatalog(cOSDictionary1);
        java.util.Calendar calendar8 = null;
        cOSDictionary1.setDate("StructElem", calendar8);
        org.junit.Assert.assertNotNull(cOSDictionary1);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test334");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStamp fDFAnnotationStamp0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStamp();
        java.util.Calendar calendar1 = null;
        fDFAnnotationStamp0.setCreationDate(calendar1);
        boolean b3 = fDFAnnotationStamp0.isPrinted();
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test335");
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
        try {
            float f13 = pDType1CFont10.getHeight((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test336");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.pdmodel.PDPage pDPage1 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle0);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle2 = org.apache.pdfbox.pdmodel.common.PDRectangle.A4;
        pDPage1.setCropBox(pDRectangle2);
        org.apache.pdfbox.util.Matrix matrix4 = pDPage1.getMatrix();
        org.apache.pdfbox.util.Matrix matrix5 = new org.apache.pdfbox.util.Matrix();
        java.awt.geom.Point2D.Float float8 = matrix5.transformPoint((float) (byte) 10, 12000.0f);
        float f9 = matrix5.getTranslateX();
        org.apache.pdfbox.util.Matrix matrix10 = matrix4.multiply(matrix5);
        matrix10.reset();
        org.junit.Assert.assertNotNull(pDRectangle0);
        org.junit.Assert.assertNotNull(pDRectangle2);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertNotNull(float8);
        org.junit.Assert.assertTrue(f9 == 0.0f);
        org.junit.Assert.assertNotNull(matrix10);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test337");
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
        boolean b37 = pDAppearanceContentStream36.isInTextMode();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary39 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary();
        try {
            pDAppearanceContentStream36.setBorderLine((float) (byte) 0, pDBorderStyleDictionary39);
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
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test339");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary6 = fDFIconFit5.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences pDViewerPreferences7 = new org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences(cOSDictionary6);
        java.lang.String str8 = pDViewerPreferences7.getPrintArea();
        java.lang.String str9 = pDViewerPreferences7.getNonFullScreenPageMode();
        java.lang.String str10 = pDViewerPreferences7.getDuplex();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "CropBox" + "'", str8.equals("CropBox"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UseNone" + "'", str9.equals("UseNone"));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test340");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        java.util.Set<java.util.Map.Entry<org.apache.pdfbox.cos.COSName, org.apache.pdfbox.cos.COSBase>> set_entry_cOSName_cOSBase2 = cOSDictionary1.entrySet();
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_3 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary1);
        int i4 = pDShadingType3_3.getShadingType();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject6 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        java.lang.String[] str_array8 = new java.lang.String[] { "BlockQuote" };
        pDExportFormatAttributeObject6.setHeaders(str_array8);
        pDExportFormatAttributeObject6.setScope("List");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle12 = org.apache.pdfbox.pdmodel.common.PDRectangle.A4;
        pDExportFormatAttributeObject6.setBBox(pDRectangle12);
        pDShadingType3_3.setBBox(pDRectangle12);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(set_entry_cOSName_cOSBase2);
        org.junit.Assert.assertTrue(i4 == 3);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertNotNull(pDRectangle12);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test341");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        org.apache.pdfbox.pdmodel.interactive.annotation.handlers.PDLinkAppearanceHandler pDLinkAppearanceHandler1 = new org.apache.pdfbox.pdmodel.interactive.annotation.handlers.PDLinkAppearanceHandler((org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) pDAnnotationLine0);
        boolean b2 = pDAnnotationLine0.isLocked();
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test342");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionSound pDActionSound0 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionSound();
        pDActionSound0.setMix(false);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument3 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile4 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument3);
        pDDocument3.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata7 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument3);
        org.apache.pdfbox.cos.COSStream cOSStream8 = pDMetadata7.getCOSObject();
        java.lang.String str9 = cOSStream8.toTextString();
        java.io.OutputStream outputStream10 = cOSStream8.createUnfilteredStream();
        pDActionSound0.setSound(cOSStream8);
        try {
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject pDImageXObject12 = org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.createThumbnail(cOSStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(outputStream10);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test343");
        org.apache.pdfbox.pdmodel.PDEmbeddedFilesNameTreeNode pDEmbeddedFilesNameTreeNode0 = new org.apache.pdfbox.pdmodel.PDEmbeddedFilesNameTreeNode();
        java.util.Map<java.lang.String, org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification> map_str_pDComplexFileSpecification1 = null;
        pDEmbeddedFilesNameTreeNode0.setNames(map_str_pDComplexFileSpecification1);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test344");
        org.apache.pdfbox.pdmodel.font.PDType3Font pDType3Font0 = null;
        org.apache.pdfbox.pdmodel.PDDocument pDDocument1 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile2 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument1);
        org.apache.pdfbox.cos.COSDocument cOSDocument3 = pDDocument1.getDocument();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree4 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary5 = pDPageTree4.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode6 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary5);
        cOSDictionary5.setString("BlockQuote", "hi!");
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey10 = cOSDocument3.getKey((org.apache.pdfbox.cos.COSBase) cOSDictionary5);
        boolean b11 = cOSDocument3.isXRefStream();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument12 = new org.apache.pdfbox.pdmodel.PDDocument(cOSDocument3);
        org.apache.pdfbox.cos.COSStream cOSStream13 = cOSDocument3.createCOSStream();
        org.apache.pdfbox.pdmodel.font.PDType3CharProc pDType3CharProc14 = new org.apache.pdfbox.pdmodel.font.PDType3CharProc(pDType3Font0, cOSStream13);
        java.lang.String str15 = cOSStream13.getString();
        org.junit.Assert.assertNotNull(cOSDocument3);
        org.junit.Assert.assertNotNull(cOSDictionary5);
        org.junit.Assert.assertNull(cOSObjectKey10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(cOSStream13);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test345");
        byte[] byte_array0 = org.apache.pdfbox.pdfwriter.ContentStreamWriter.SPACE;
        org.junit.Assert.assertNotNull(byte_array0);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test346");
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle pDTransitionStyle0 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Dissolve;
        org.junit.Assert.assertTrue("'" + pDTransitionStyle0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Dissolve + "'", pDTransitionStyle0.equals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Dissolve));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test347");
        org.apache.pdfbox.pdmodel.font.encoding.MacOSRomanEncoding macOSRomanEncoding0 = org.apache.pdfbox.pdmodel.font.encoding.MacOSRomanEncoding.INSTANCE;
        org.junit.Assert.assertNotNull(macOSRomanEncoding0);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test348");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        java.util.Set<java.util.Map.Entry<org.apache.pdfbox.cos.COSName, org.apache.pdfbox.cos.COSBase>> set_entry_cOSName_cOSBase2 = cOSDictionary1.entrySet();
        org.apache.pdfbox.cos.COSBase cOSBase4 = cOSDictionary1.getObjectFromPath("NumberFormat");
        int i7 = cOSDictionary1.getInt("Insert", (int) (short) 100);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(set_entry_cOSName_cOSBase2);
        org.junit.Assert.assertNull(cOSBase4);
        org.junit.Assert.assertTrue(i7 == 100);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test349");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData pDActionImportData5 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData(cOSDictionary1);
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.EMPTY;
        int i9 = cOSDictionary1.getEmbeddedInt("hi!", cOSName7, 10);
        org.apache.pdfbox.pdmodel.font.PDType1CFont pDType1CFont10 = new org.apache.pdfbox.pdmodel.font.PDType1CFont(cOSDictionary1);
        float f12 = pDType1CFont10.getWidthFromFont((int) (short) 0);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(f12 == 500.00003f);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test350");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.HELVETICA_BOLD;
        boolean b2 = pDType1Font0.hasGlyph("COSName{PageMode}");
        org.apache.pdfbox.pdmodel.font.encoding.GlyphList glyphList4 = org.apache.pdfbox.pdmodel.font.encoding.GlyphList.getAdobeGlyphList();
        java.lang.String str5 = pDType1Font0.toUnicode((-4), glyphList4);
        java.lang.String str7 = glyphList4.sequenceToName("Sect");
        java.lang.String str9 = glyphList4.codePointToName(4);
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(glyphList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ".notdef" + "'", str7.equals(".notdef"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "controlEOT" + "'", str9.equals("controlEOT"));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test351");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ENCODING;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test352");
        org.apache.pdfbox.pdmodel.interactive.action.PDDocumentCatalogAdditionalActions pDDocumentCatalogAdditionalActions0 = new org.apache.pdfbox.pdmodel.interactive.action.PDDocumentCatalogAdditionalActions();
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test353");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        cOSDictionary1.setString("Highlight", "Start");
        org.apache.pdfbox.cos.COSName cOSName5 = org.apache.pdfbox.cos.COSName.OFF;
        java.lang.String str6 = cOSDictionary1.getNameAsString(cOSName5);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationText pDAnnotationText7 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationText(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test354");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry pDAppearanceEntry1 = null;
        pDAppearanceDictionary0.setRolloverAppearance(pDAppearanceEntry1);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test355");
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
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary38 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary();
        try {
            pDAppearanceContentStream36.setBorderLine((float) (short) 100, pDBorderStyleDictionary38);
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
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test356");
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
        org.apache.pdfbox.pdmodel.PDDocument pDDocument16 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile17 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument16);
        pDDocument16.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata20 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument16);
        org.apache.pdfbox.cos.COSStream cOSStream21 = pDMetadata20.getCOSObject();
        java.io.OutputStream outputStream22 = cOSStream21.createFilteredStream();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream23 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream21);
        org.apache.pdfbox.pdmodel.common.PDStream pDStream24 = pDAppearanceStream23.getContentStream();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject26 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject26.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary29 = pDExportFormatAttributeObject26.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName31 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary29.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName31, (int) (short) 0);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache34 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources35 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary29, resourceCache34);
        org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject pDFormXObject36 = null;
        org.apache.pdfbox.cos.COSName cOSName37 = pDResources35.add(pDFormXObject36);
        java.lang.Iterable<org.apache.pdfbox.cos.COSName> iterable_cOSName38 = pDResources35.getColorSpaceNames();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree39 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary40 = pDPageTree39.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions41 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary40);
        org.apache.pdfbox.cos.COSName cOSName43 = org.apache.pdfbox.cos.COSName.CROP_BOX;
        java.lang.String str44 = cOSDictionary40.getEmbeddedString("Overline", cOSName43);
        boolean b45 = pDResources35.hasColorSpace(cOSName43);
        pDAppearanceStream23.setResources(pDResources35);
        pDAcroForm15.setDefaultResources(pDResources35);
        org.junit.Assert.assertNotNull(cOSDocument2);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertNotNull(cOSName13);
        org.junit.Assert.assertNull(cOSBase14);
        org.junit.Assert.assertNotNull(cOSStream21);
        org.junit.Assert.assertNotNull(outputStream22);
        org.junit.Assert.assertNotNull(pDStream24);
        org.junit.Assert.assertNotNull(cOSDictionary29);
        org.junit.Assert.assertNotNull(cOSName31);
        org.junit.Assert.assertNotNull(cOSName37);
        org.junit.Assert.assertNotNull(iterable_cOSName38);
        org.junit.Assert.assertNotNull(cOSDictionary40);
        org.junit.Assert.assertNotNull(cOSName43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test357");
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
        int i21 = pDShadingType1_6.getShadingType();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(pDRectangle7);
        org.junit.Assert.assertNotNull(cOSArray8);
        org.junit.Assert.assertNotNull(cOSName11);
        org.junit.Assert.assertNotNull(pDRectangle13);
        org.junit.Assert.assertNotNull(cOSArray14);
        org.junit.Assert.assertNotNull(cOSName17);
        org.junit.Assert.assertTrue(i21 == 1);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test358");
        org.apache.pdfbox.pdmodel.font.encoding.MacRomanEncoding macRomanEncoding0 = org.apache.pdfbox.pdmodel.font.encoding.MacRomanEncoding.INSTANCE;
        java.lang.String str1 = macRomanEncoding0.getEncodingName();
        org.apache.pdfbox.cos.COSBase cOSBase2 = macRomanEncoding0.getCOSObject();
        org.junit.Assert.assertNotNull(macRomanEncoding0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "MacRomanEncoding" + "'", str1.equals("MacRomanEncoding"));
        org.junit.Assert.assertNotNull(cOSBase2);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test359");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition2 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary1);
        org.apache.pdfbox.cos.COSBase cOSBase3 = pDTransition2.getDirection();
        org.apache.pdfbox.pdmodel.common.function.PDFunctionType0 pDFunctionType0_4 = new org.apache.pdfbox.pdmodel.common.function.PDFunctionType0(cOSBase3);
        float[] f_array8 = new float[] { (short) 1, '#', 100L };
        org.apache.pdfbox.cos.COSName cOSName9 = org.apache.pdfbox.cos.COSName.PAGE_LAYOUT;
        org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace10 = null;
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor11 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array8, cOSName9, pDColorSpace10);
        try {
            float[] f_array12 = pDFunctionType0_4.eval(f_array8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSBase3);
        org.junit.Assert.assertNotNull(f_array8);
        org.junit.Assert.assertNotNull(cOSName9);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test360");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        boolean b1 = fDFAnnotationFreeText0.isNoView();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle2 = org.apache.pdfbox.pdmodel.common.PDRectangle.A0;
        fDFAnnotationFreeText0.setRectangle(pDRectangle2);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = fDFAnnotationFreeText0.getRectangle();
        float f5 = pDRectangle4.getUpperRightX();
        java.lang.String str6 = pDRectangle4.toString();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(pDRectangle2);
        org.junit.Assert.assertNotNull(pDRectangle4);
        org.junit.Assert.assertTrue(f5 == 2383.937f);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0.0,1.0,2383.937,3370.3938]" + "'", str6.equals("[0.0,1.0,2383.937,3370.3938]"));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test361");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.io.IOUtils.closeQuietly((java.io.Closeable) pDDocument0);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test362");
        java.util.Calendar calendar1 = org.apache.pdfbox.util.DateConverter.toCalendar("THead");
        org.junit.Assert.assertNull(calendar1);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test363");
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
        pDSeparation22.setColorantName("Underline");
        org.apache.pdfbox.cos.COSBase cOSBase26 = pDSeparation22.getCOSObject();
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(iterable_cOSName11);
        org.junit.Assert.assertNotNull(cOSName12);
        org.junit.Assert.assertNotNull(cOSDictionary14);
        org.junit.Assert.assertNotNull(cOSName21);
        org.junit.Assert.assertNotNull(cOSBase26);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test364");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.TILING_TYPE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test365");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = new org.apache.pdfbox.pdmodel.common.PDRectangle((float) (byte) -1, (float) 10L, (float) (byte) 10, (-1.0f));
        org.apache.pdfbox.util.Matrix matrix5 = new org.apache.pdfbox.util.Matrix();
        java.awt.geom.Point2D.Float float8 = matrix5.transformPoint((float) (byte) 10, 12000.0f);
        float f9 = matrix5.getTranslateX();
        java.awt.geom.GeneralPath generalPath10 = pDRectangle4.transform(matrix5);
        double[][] d_array_array11 = matrix5.getValuesAsDouble();
        org.junit.Assert.assertNotNull(float8);
        org.junit.Assert.assertTrue(f9 == 0.0f);
        org.junit.Assert.assertNotNull(generalPath10);
        org.junit.Assert.assertNotNull(d_array_array11);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test366");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary1 = null;
        pDAnnotationLine0.setBorderStyle(pDBorderStyleDictionary1);
        float[] f_array6 = new float[] { (short) 1, '#', 100L };
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.PAGE_LAYOUT;
        org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace8 = null;
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor9 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array6, cOSName7, pDColorSpace8);
        org.apache.pdfbox.cos.COSName cOSName10 = pDColor9.getPatternName();
        pDAnnotationLine0.setColor(pDColor9);
        float f12 = pDAnnotationLine0.getLeaderLineExtensionLength();
        boolean b13 = pDAnnotationLine0.isPrinted();
        org.junit.Assert.assertNotNull(f_array6);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertTrue(f12 == (-1.0f));
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test367");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions2 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary1);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.CROP_BOX;
        java.lang.String str5 = cOSDictionary1.getEmbeddedString("Overline", cOSName4);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch pDActionLaunch6 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.measurement.PDViewportDictionary pDViewportDictionary7 = new org.apache.pdfbox.pdmodel.interactive.measurement.PDViewportDictionary(cOSDictionary1);
        java.lang.String str8 = pDViewportDictionary7.getName();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test368");
        org.apache.pdfbox.pdmodel.font.encoding.WinAnsiEncoding winAnsiEncoding0 = new org.apache.pdfbox.pdmodel.font.encoding.WinAnsiEncoding();
        java.lang.String str1 = winAnsiEncoding0.getEncodingName();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "WinAnsiEncoding" + "'", str1.equals("WinAnsiEncoding"));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test369");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.printing.Scaling scaling1 = org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable5 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument0, scaling1, true, 1.0f, false);
        org.apache.pdfbox.pdmodel.DefaultResourceCache defaultResourceCache6 = new org.apache.pdfbox.pdmodel.DefaultResourceCache();
        pDDocument0.setResourceCache((org.apache.pdfbox.pdmodel.ResourceCache) defaultResourceCache6);
        org.apache.pdfbox.cos.COSObject cOSObject8 = null;
        org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState pDExtendedGraphicsState9 = new org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState();
        pDExtendedGraphicsState9.setStrokingAlphaConstant((java.lang.Float) 1.0f);
        defaultResourceCache6.put(cOSObject8, pDExtendedGraphicsState9);
        org.apache.pdfbox.cos.COSObject cOSObject13 = null;
        org.apache.pdfbox.pdmodel.font.PDFont pDFont14 = defaultResourceCache6.getFont(cOSObject13);
        org.junit.Assert.assertTrue("'" + scaling1 + "' != '" + org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT + "'", scaling1.equals(org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT));
        org.junit.Assert.assertNull(pDFont14);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test370");
        org.apache.pdfbox.multipdf.Splitter splitter0 = new org.apache.pdfbox.multipdf.Splitter();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument1 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.printing.Scaling scaling2 = org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable6 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument1, scaling2, true, 1.0f, false);
        pDDocument1.save("CropBox");
        java.util.List<org.apache.pdfbox.pdmodel.PDDocument> list_pDDocument9 = splitter0.split(pDDocument1);
        splitter0.setEndPage((int) (short) 1);
        org.junit.Assert.assertTrue("'" + scaling2 + "' != '" + org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT + "'", scaling2.equals(org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT));
        org.junit.Assert.assertNotNull(list_pDDocument9);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test371");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions2 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStrikeOut fDFAnnotationStrikeOut3 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStrikeOut(cOSDictionary1);
        float[] f_array4 = fDFAnnotationStrikeOut3.getCoords();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNull(f_array4);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test372");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test373");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.C0;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test374");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary6 = fDFIconFit5.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences pDViewerPreferences7 = new org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences(cOSDictionary6);
        pDViewerPreferences7.setNonFullScreenPageMode("CropBox");
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary6);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test375");
        try {
            float f1 = org.apache.pdfbox.pdmodel.common.function.type4.InstructionSequenceBuilder.parseReal("on");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test376");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.BLOCK_ALIGN_AFTER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "After" + "'", str0.equals("After"));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test377");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.ZAPF_DINGBATS;
        org.junit.Assert.assertNotNull(pDType1Font0);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test378");
        org.apache.pdfbox.contentstream.operator.color.SetStrokingDeviceRGBColor setStrokingDeviceRGBColor0 = new org.apache.pdfbox.contentstream.operator.color.SetStrokingDeviceRGBColor();
        java.lang.String str1 = setStrokingDeviceRGBColor0.getName();
        java.lang.String str2 = setStrokingDeviceRGBColor0.getName();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "RG" + "'", str1.equals("RG"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "RG" + "'", str2.equals("RG"));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test379");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDFourColours pDFourColours2 = null;
        pDExportFormatAttributeObject1.setBorderColors(pDFourColours2);
        int i4 = pDExportFormatAttributeObject1.getColumnCount();
        pDExportFormatAttributeObject1.setHeight((int) '#');
        org.junit.Assert.assertTrue(i4 == 1);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test380");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DEST_OUTPUT_PROFILE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test381");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary4.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName6, (int) (short) 0);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache9 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources10 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary4, resourceCache9);
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject11 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject(cOSDictionary4);
        java.util.Collection<org.apache.pdfbox.cos.COSBase> collection_cOSBase12 = cOSDictionary4.getValues();
        java.util.Calendar calendar15 = null;
        cOSDictionary4.setEmbeddedDate("Name=null, Value=null, FormattedValue=null, Hidden=false", "None", calendar15);
        org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font17 = null;
        org.apache.fontbox.ttf.TrueTypeFont trueTypeFont18 = null;
        try {
            org.apache.pdfbox.pdmodel.font.PDCIDFontType2 pDCIDFontType2_19 = new org.apache.pdfbox.pdmodel.font.PDCIDFontType2(cOSDictionary4, pDType0Font17, trueTypeFont18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(collection_cOSBase12);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test382");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.action.PDActionThread.SUB_TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Thread" + "'", str0.equals("Thread"));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test383");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.printing.Scaling scaling1 = org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable5 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument0, scaling1, true, 1.0f, false);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree6 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle7 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage8 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle7);
        int i9 = pDPageTree6.indexOf(pDPage8);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream10 = pDPage8.getContentStreams();
        org.apache.pdfbox.pdmodel.PDResources pDResources11 = pDPage8.getResources();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree12 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary13 = pDPageTree12.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition14 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary13);
        org.apache.pdfbox.cos.COSBase cOSBase15 = pDTransition14.getDirection();
        pDPage8.setTransition(pDTransition14, (float) (short) 1);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree18 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary19 = pDPageTree18.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition20 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary19);
        pDPage8.setTransition(pDTransition20);
        java.io.InputStream inputStream22 = pDPage8.getContents();
        try {
            org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font23 = org.apache.pdfbox.pdmodel.font.PDType0Font.load(pDDocument0, inputStream22);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException");
        } catch (java.io.EOFException e) {
        }
        org.junit.Assert.assertTrue("'" + scaling1 + "' != '" + org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT + "'", scaling1.equals(org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT));
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNotNull(iterator_pDStream10);
        org.junit.Assert.assertNull(pDResources11);
        org.junit.Assert.assertNotNull(cOSDictionary13);
        org.junit.Assert.assertNotNull(cOSBase15);
        org.junit.Assert.assertNotNull(cOSDictionary19);
        org.junit.Assert.assertNotNull(inputStream22);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test384");
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
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle13 = fDFAnnotationCircle0.getFringe();
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNotNull(cOSDictionary6);
        org.junit.Assert.assertNotNull(cOSBase8);
        org.junit.Assert.assertNotNull(pDRectangle11);
        org.junit.Assert.assertNotNull(pDRectangle13);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test385");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties pDVisibleSigProperties0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties();
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner pDVisibleSignDesigner1 = pDVisibleSigProperties0.getPdVisibleSignature();
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties pDVisibleSigProperties3 = pDVisibleSigProperties0.preferredSize((-4));
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties pDVisibleSigProperties5 = pDVisibleSigProperties0.visualSignEnabled(true);
        org.junit.Assert.assertNull(pDVisibleSignDesigner1);
        org.junit.Assert.assertNotNull(pDVisibleSigProperties3);
        org.junit.Assert.assertNotNull(pDVisibleSigProperties5);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test386");
        org.apache.pdfbox.pdmodel.encryption.PublicKeyProtectionPolicy publicKeyProtectionPolicy0 = new org.apache.pdfbox.pdmodel.encryption.PublicKeyProtectionPolicy();
        org.apache.pdfbox.pdmodel.encryption.PublicKeyRecipient publicKeyRecipient1 = new org.apache.pdfbox.pdmodel.encryption.PublicKeyRecipient();
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission2 = publicKeyRecipient1.getPermission();
        publicKeyProtectionPolicy0.addRecipient(publicKeyRecipient1);
        org.apache.pdfbox.pdmodel.encryption.PublicKeyRecipient publicKeyRecipient4 = new org.apache.pdfbox.pdmodel.encryption.PublicKeyRecipient();
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission5 = publicKeyRecipient4.getPermission();
        publicKeyProtectionPolicy0.addRecipient(publicKeyRecipient4);
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission7 = org.apache.pdfbox.pdmodel.encryption.AccessPermission.getOwnerAccessPermission();
        accessPermission7.setCanExtractContent(true);
        int i10 = accessPermission7.getPermissionBytes();
        publicKeyRecipient4.setPermission(accessPermission7);
        org.junit.Assert.assertNull(accessPermission2);
        org.junit.Assert.assertNull(accessPermission5);
        org.junit.Assert.assertNotNull(accessPermission7);
        org.junit.Assert.assertTrue(i10 == (-4));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test387");
        org.apache.pdfbox.pdmodel.interactive.action.PDPageAdditionalActions pDPageAdditionalActions0 = new org.apache.pdfbox.pdmodel.interactive.action.PDPageAdditionalActions();
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test388");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DEVICEN;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test389");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams.OPERATION_OPEN;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "open" + "'", str0.equals("open"));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test390");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.PROC_SET;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test391");
        org.apache.pdfbox.io.RandomAccessRead randomAccessRead0 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.pdfbox.io.RandomAccessBuffer randomAccessBuffer4 = new org.apache.pdfbox.io.RandomAccessBuffer();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree6 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle7 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage8 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle7);
        int i9 = pDPageTree6.indexOf(pDPage8);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream10 = pDPage8.getContentStreams();
        org.apache.pdfbox.pdmodel.PDResources pDResources11 = pDPage8.getResources();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree12 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary13 = pDPageTree12.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition14 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary13);
        org.apache.pdfbox.cos.COSBase cOSBase15 = pDTransition14.getDirection();
        pDPage8.setTransition(pDTransition14, (float) (short) 1);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree18 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary19 = pDPageTree18.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition20 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary19);
        pDPage8.setTransition(pDTransition20);
        java.io.InputStream inputStream22 = pDPage8.getContents();
        java.io.File file24 = null;
        org.apache.pdfbox.io.ScratchFile scratchFile25 = new org.apache.pdfbox.io.ScratchFile(file24);
        org.apache.pdfbox.pdfparser.PDFParser pDFParser26 = new org.apache.pdfbox.pdfparser.PDFParser((org.apache.pdfbox.io.RandomAccessRead) randomAccessBuffer4, "RP", inputStream22, "StructElem", scratchFile25);
        try {
            org.apache.pdfbox.pdfparser.PDFParser pDFParser27 = new org.apache.pdfbox.pdfparser.PDFParser(randomAccessRead0, "COSName{Synchronous}", inputStream2, "Dashed", scratchFile25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNotNull(iterator_pDStream10);
        org.junit.Assert.assertNull(pDResources11);
        org.junit.Assert.assertNotNull(cOSDictionary13);
        org.junit.Assert.assertNotNull(cOSBase15);
        org.junit.Assert.assertNotNull(cOSDictionary19);
        org.junit.Assert.assertNotNull(inputStream22);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test392");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCircle fDFAnnotationCircle0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCircle();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle1 = fDFAnnotationCircle0.getFringe();
        org.junit.Assert.assertNull(pDRectangle1);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test393");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue pDSeedValue0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue();
        pDSeedValue0.setSubFilterRequired(false);
        boolean b3 = pDSeedValue0.isAddRevInfoRequired();
        boolean b4 = pDSeedValue0.isReasonRequired();
        pDSeedValue0.setReasonRequired(false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test394");
        org.apache.pdfbox.contentstream.operator.color.SetStrokingDeviceRGBColor setStrokingDeviceRGBColor0 = new org.apache.pdfbox.contentstream.operator.color.SetStrokingDeviceRGBColor();
        org.apache.pdfbox.contentstream.operator.Operator operator1 = null;
        org.apache.pdfbox.contentstream.operator.text.MoveTextSetLeading moveTextSetLeading2 = new org.apache.pdfbox.contentstream.operator.text.MoveTextSetLeading();
        org.apache.pdfbox.contentstream.operator.Operator operator3 = null;
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray5 = pDRectangle4.getCOSArray();
        org.apache.pdfbox.pdmodel.common.PDRange pDRange6 = new org.apache.pdfbox.pdmodel.common.PDRange(cOSArray5);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject8 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject8.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary11 = pDExportFormatAttributeObject8.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName13 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary11.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName13, (int) (short) 0);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP pDSeedValueMDP16 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP(cOSDictionary11);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree17 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary18 = pDPageTree17.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject19 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty20 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary18, pDUserAttributeObject19);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent21 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary18);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit22 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary18);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_23 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary18);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType7 pDShadingType7_24 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType7(cOSDictionary18);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolygon fDFAnnotationPolygon25 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolygon(cOSDictionary18);
        org.apache.pdfbox.cos.COSName cOSName26 = org.apache.pdfbox.cos.COSName.FLATE_DECODE;
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree27 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary28 = pDPageTree27.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions29 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary28);
        org.apache.pdfbox.cos.COSName cOSName31 = org.apache.pdfbox.cos.COSName.CROP_BOX;
        java.lang.String str32 = cOSDictionary28.getEmbeddedString("Overline", cOSName31);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch pDActionLaunch33 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch(cOSDictionary28);
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor pDFontDescriptor34 = new org.apache.pdfbox.pdmodel.font.PDFontDescriptor(cOSDictionary28);
        org.apache.pdfbox.cos.COSName cOSName35 = org.apache.pdfbox.cos.COSName.BE;
        org.apache.pdfbox.cos.COSName cOSName36 = org.apache.pdfbox.cos.COSName.LEADING;
        org.apache.pdfbox.cos.COSName cOSName37 = org.apache.pdfbox.cos.COSName.DS;
        org.apache.pdfbox.cos.COSName cOSName38 = org.apache.pdfbox.cos.COSName.ASCII_HEX_DECODE;
        org.apache.pdfbox.cos.COSName cOSName39 = org.apache.pdfbox.cos.COSName.CROP_BOX;
        org.apache.pdfbox.cos.COSBase[] cOSBase_array40 = new org.apache.pdfbox.cos.COSBase[] { cOSDictionary11, cOSDictionary18, cOSName26, cOSDictionary28, cOSName35, cOSName36, cOSName37, cOSName38, cOSName39 };
        java.util.ArrayList<org.apache.pdfbox.cos.COSBase> arraylist_cOSBase41 = new java.util.ArrayList<org.apache.pdfbox.cos.COSBase>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase41, cOSBase_array40);
        cOSArray5.removeAll((java.util.Collection<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase41);
        moveTextSetLeading2.process(operator3, (java.util.List<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase41);
        try {
            setStrokingDeviceRGBColor0.process(operator1, (java.util.List<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle4);
        org.junit.Assert.assertNotNull(cOSArray5);
        org.junit.Assert.assertNotNull(cOSDictionary11);
        org.junit.Assert.assertNotNull(cOSName13);
        org.junit.Assert.assertNotNull(cOSDictionary18);
        org.junit.Assert.assertNotNull(cOSName26);
        org.junit.Assert.assertNotNull(cOSDictionary28);
        org.junit.Assert.assertNotNull(cOSName31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(cOSName35);
        org.junit.Assert.assertNotNull(cOSName36);
        org.junit.Assert.assertNotNull(cOSName37);
        org.junit.Assert.assertNotNull(cOSName38);
        org.junit.Assert.assertNotNull(cOSName39);
        org.junit.Assert.assertNotNull(cOSBase_array40);
        org.junit.Assert.assertTrue(b42 == true);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test395");
        org.apache.pdfbox.multipdf.Overlay overlay0 = new org.apache.pdfbox.multipdf.Overlay();
        java.lang.String str1 = overlay0.getDefaultOverlayFile();
        overlay0.setOddPageOverlayFile("hi!");
        overlay0.setFirstPageOverlayFile("Center");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test396");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions2 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary1);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.CROP_BOX;
        java.lang.String str5 = cOSDictionary1.getEmbeddedString("Overline", cOSName4);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch pDActionLaunch6 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch(cOSDictionary1);
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor pDFontDescriptor7 = new org.apache.pdfbox.pdmodel.font.PDFontDescriptor(cOSDictionary1);
        org.apache.pdfbox.pdmodel.common.PDStream pDStream8 = pDFontDescriptor7.getCIDSet();
        boolean b9 = pDFontDescriptor7.isForceBold();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(pDStream8);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test397");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        org.apache.pdfbox.cos.COSDocument cOSDocument2 = pDDocument0.getDocument();
        float f3 = pDDocument0.getVersion();
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature pDSignature4 = pDDocument0.getLastSignatureDictionary();
        org.junit.Assert.assertNotNull(cOSDocument2);
        org.junit.Assert.assertTrue(f3 == 1.4f);
        org.junit.Assert.assertNull(pDSignature4);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test398");
        org.apache.pdfbox.pdmodel.fdf.FDFDocument fDFDocument0 = new org.apache.pdfbox.pdmodel.fdf.FDFDocument();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree1 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDPageTree1.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject3 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty4 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary2, pDUserAttributeObject3);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent5 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData pDActionImportData6 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData(cOSDictionary2);
        org.apache.pdfbox.pdmodel.fdf.FDFCatalog fDFCatalog7 = new org.apache.pdfbox.pdmodel.fdf.FDFCatalog(cOSDictionary2);
        fDFDocument0.setCatalog(fDFCatalog7);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree9 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary10 = pDPageTree9.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject11 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty12 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary10, pDUserAttributeObject11);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent13 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary10);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData pDActionImportData14 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData(cOSDictionary10);
        org.apache.pdfbox.pdmodel.fdf.FDFCatalog fDFCatalog15 = new org.apache.pdfbox.pdmodel.fdf.FDFCatalog(cOSDictionary10);
        fDFCatalog15.setVersion("RT");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary18 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFDictionary fDFDictionary19 = new org.apache.pdfbox.pdmodel.fdf.FDFDictionary(cOSDictionary18);
        fDFCatalog15.setFDF(fDFDictionary19);
        fDFCatalog7.setFDF(fDFDictionary19);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary22 = fDFCatalog7.getCOSObject();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSDictionary10);
        org.junit.Assert.assertNotNull(cOSDictionary22);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test399");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.M;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test400");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        java.util.Set<java.util.Map.Entry<org.apache.pdfbox.cos.COSName, org.apache.pdfbox.cos.COSBase>> set_entry_cOSName_cOSBase2 = cOSDictionary1.entrySet();
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_3 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary1);
        int i4 = pDShadingType3_3.getShadingType();
        pDShadingType3_3.setAntiAlias(true);
        org.apache.pdfbox.util.Matrix matrix9 = org.apache.pdfbox.util.Matrix.getTranslateInstance(100.0f, (float) 5);
        java.awt.Paint paint10 = pDShadingType3_3.toPaint(matrix9);
        org.apache.pdfbox.util.Matrix matrix11 = new org.apache.pdfbox.util.Matrix();
        float f12 = matrix11.getShearY();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument13 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile14 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument13);
        pDDocument13.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata17 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument13);
        org.apache.pdfbox.cos.COSStream cOSStream18 = pDMetadata17.getCOSObject();
        java.io.OutputStream outputStream19 = cOSStream18.createFilteredStream();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream20 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream18);
        org.apache.pdfbox.util.Matrix matrix21 = pDAppearanceStream20.getMatrix();
        org.apache.pdfbox.util.Matrix matrix22 = matrix9.multiply(matrix11, matrix21);
        try {
            float f25 = matrix21.getValue(32, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(set_entry_cOSName_cOSBase2);
        org.junit.Assert.assertTrue(i4 == 3);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue(f12 == 0.0f);
        org.junit.Assert.assertNotNull(cOSStream18);
        org.junit.Assert.assertNotNull(outputStream19);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(matrix22);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test401");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine fDFAnnotationLine0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine();
        fDFAnnotationLine0.setStartPointEndingStyle("Polygon");
        java.lang.Integer i3 = fDFAnnotationLine0.getPage();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderEffectDictionary pDBorderEffectDictionary4 = null;
        fDFAnnotationLine0.setBorderEffect(pDBorderEffectDictionary4);
        org.junit.Assert.assertNull(i3);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test402");
        org.apache.pdfbox.pdmodel.graphics.PDFontSetting pDFontSetting0 = new org.apache.pdfbox.pdmodel.graphics.PDFontSetting();
        float f1 = pDFontSetting0.getFontSize();
        org.junit.Assert.assertTrue(f1 == 1.0f);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test403");
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
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine18 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        java.lang.String str19 = pDAnnotationLine18.getSubject();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree20 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle21 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage22 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle21);
        int i23 = pDPageTree20.indexOf(pDPage22);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree24 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary25 = pDPageTree24.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition26 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary25);
        org.apache.pdfbox.cos.COSBase cOSBase27 = pDTransition26.getDirection();
        pDPage22.setTransition(pDTransition26, (float) 1);
        pDAnnotationLine18.setPage(pDPage22);
        float[] f_array31 = pDAnnotationLine18.getLine();
        try {
            pDPageContentStream17.setNonStrokingColor(f_array31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertNotNull(cOSDictionary25);
        org.junit.Assert.assertNotNull(cOSBase27);
        org.junit.Assert.assertNotNull(f_array31);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test404");
        org.apache.pdfbox.pdmodel.font.encoding.WinAnsiEncoding winAnsiEncoding0 = org.apache.pdfbox.pdmodel.font.encoding.WinAnsiEncoding.INSTANCE;
        java.lang.String str1 = winAnsiEncoding0.getEncodingName();
        org.junit.Assert.assertNotNull(winAnsiEncoding0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "WinAnsiEncoding" + "'", str1.equals("WinAnsiEncoding"));
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test405");
        org.w3c.dom.Element element0 = null;
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCaret fDFAnnotationCaret1 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCaret(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test406");
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
        org.apache.pdfbox.cos.COSName cOSName15 = org.apache.pdfbox.cos.COSName.FIRST_CHAR;
        securityHandler8.decrypt((org.apache.pdfbox.cos.COSBase) cOSName15, (long) 7, (long) 6);
        org.junit.Assert.assertNotNull(securityHandlerFactory0);
        org.junit.Assert.assertNull(accessPermission3);
        org.junit.Assert.assertNull(accessPermission6);
        org.junit.Assert.assertNotNull(securityHandler8);
        org.junit.Assert.assertNotNull(accessPermission9);
        org.junit.Assert.assertNotNull(cOSName15);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test407");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        pDExportFormatAttributeObject1.setLineHeightNormal();
        float f5 = pDExportFormatAttributeObject1.getTextDecorationThickness();
        float f6 = pDExportFormatAttributeObject1.getSpaceBefore();
        float f7 = pDExportFormatAttributeObject1.getBaselineShift();
        pDExportFormatAttributeObject1.setInlineAlign("[");
        org.junit.Assert.assertTrue(f5 == (-1.0f));
        org.junit.Assert.assertTrue(f6 == 0.0f);
        org.junit.Assert.assertTrue(f7 == 0.0f);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test408");
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
        java.awt.image.BufferedImage bufferedImage12 = null;
        try {
            org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner pDVisibleSignDesigner14 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner(inputStream11, bufferedImage12, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle2);
        org.junit.Assert.assertNotNull(cOSArray3);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(list_str10);
        org.junit.Assert.assertNotNull(inputStream11);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test409");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue pDSeedValue0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue();
        pDSeedValue0.setSubFilterRequired(false);
        boolean b3 = pDSeedValue0.isReasonRequired();
        boolean b4 = pDSeedValue0.isVRequired();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test410");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode pDStructureNode1 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement pDStructureElement2 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement("O=TD, Padding=10.0, LineHeight=Normal", pDStructureNode1);
        pDStructureElement2.setRevisionNumber(100);
        org.apache.pdfbox.pdmodel.PDPage pDPage5 = pDStructureElement2.getPage();
        java.lang.String str6 = pDStructureElement2.getExpandedForm();
        pDStructureElement2.setStructureType("");
        org.junit.Assert.assertNull(pDPage5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test411");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary6 = fDFIconFit5.getCOSObject();
        fDFIconFit5.setScaleOption("Figure");
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary6);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test414");
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
        org.apache.pdfbox.io.RandomAccessBuffer randomAccessBuffer13 = new org.apache.pdfbox.io.RandomAccessBuffer();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree15 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle16 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage17 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle16);
        int i18 = pDPageTree15.indexOf(pDPage17);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream19 = pDPage17.getContentStreams();
        org.apache.pdfbox.pdmodel.PDResources pDResources20 = pDPage17.getResources();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree21 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary22 = pDPageTree21.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition23 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary22);
        org.apache.pdfbox.cos.COSBase cOSBase24 = pDTransition23.getDirection();
        pDPage17.setTransition(pDTransition23, (float) (short) 1);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree27 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary28 = pDPageTree27.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition29 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary28);
        pDPage17.setTransition(pDTransition29);
        java.io.InputStream inputStream31 = pDPage17.getContents();
        java.io.File file33 = null;
        org.apache.pdfbox.io.ScratchFile scratchFile34 = new org.apache.pdfbox.io.ScratchFile(file33);
        org.apache.pdfbox.pdfparser.PDFParser pDFParser35 = new org.apache.pdfbox.pdfparser.PDFParser((org.apache.pdfbox.io.RandomAccessRead) randomAccessBuffer13, "RP", inputStream31, "StructElem", scratchFile34);
        try {
            org.apache.pdfbox.pdmodel.PDDocument pDDocument37 = org.apache.pdfbox.pdmodel.PDDocument.load(inputStream11, "Link", inputStream31, "FileAttachment");
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle2);
        org.junit.Assert.assertNotNull(cOSArray3);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(list_str10);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertNotNull(iterator_pDStream19);
        org.junit.Assert.assertNull(pDResources20);
        org.junit.Assert.assertNotNull(cOSDictionary22);
        org.junit.Assert.assertNotNull(cOSBase24);
        org.junit.Assert.assertNotNull(cOSDictionary28);
        org.junit.Assert.assertNotNull(inputStream31);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test415");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.encryption.PublicKeySecurityHandler.FILTER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Adobe.PubSec" + "'", str0.equals("Adobe.PubSec"));
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test416");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFDictionary fDFDictionary1 = new org.apache.pdfbox.pdmodel.fdf.FDFDictionary(cOSDictionary0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = fDFDictionary1.getCOSObject();
        try {
            fDFDictionary1.setStatus("Squiggly");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(cOSDictionary2);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test417");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata4 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument0);
        org.apache.pdfbox.cos.COSStream cOSStream5 = pDMetadata4.getCOSObject();
        java.io.OutputStream outputStream6 = cOSStream5.createFilteredStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDActionHide pDActionHide7 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionHide((org.apache.pdfbox.cos.COSDictionary) cOSStream5);
        pDActionHide7.setH(true);
        org.junit.Assert.assertNotNull(cOSStream5);
        org.junit.Assert.assertNotNull(outputStream6);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test418");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata4 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument0);
        org.apache.pdfbox.cos.COSStream cOSStream5 = pDMetadata4.getCOSObject();
        java.io.OutputStream outputStream6 = cOSStream5.createFilteredStream();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream7 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream5);
        try {
            org.apache.pdfbox.cos.COSInputStream cOSInputStream8 = cOSStream5.createInputStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream5);
        org.junit.Assert.assertNotNull(outputStream6);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test419");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        pDExportFormatAttributeObject1.setLineHeightNormal();
        float f5 = pDExportFormatAttributeObject1.getTextDecorationThickness();
        pDExportFormatAttributeObject1.setTextAlign("O=TD, Padding=10.0, StartIndent=1.0, LineHeight=Normal");
        org.junit.Assert.assertTrue(f5 == (-1.0f));
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test420");
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
        org.apache.pdfbox.pdmodel.interactive.action.PDURIDictionary pDURIDictionary26 = pDDocumentCatalog4.getURI();
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
        org.junit.Assert.assertNull(pDURIDictionary26);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test421");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.PDDocumentCatalog pDDocumentCatalog4 = pDDocument0.getDocumentCatalog();
        org.apache.pdfbox.pdmodel.interactive.action.PDURIDictionary pDURIDictionary5 = pDDocumentCatalog4.getURI();
        org.apache.pdfbox.pdmodel.common.PDDestinationOrAction pDDestinationOrAction6 = pDDocumentCatalog4.getOpenAction();
        org.apache.pdfbox.pdmodel.PageMode pageMode7 = null;
        try {
            pDDocumentCatalog4.setPageMode(pageMode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pDDocumentCatalog4);
        org.junit.Assert.assertNull(pDURIDictionary5);
        org.junit.Assert.assertNull(pDDestinationOrAction6);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test422");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationRubberStamp pDAnnotationRubberStamp0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationRubberStamp();
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test423");
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
        pDExportFormatAttributeObject15.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary18 = pDExportFormatAttributeObject15.getCOSObject();
        int i20 = cOSDictionary18.getInt("Expired");
        org.apache.pdfbox.cos.COSName cOSName21 = org.apache.pdfbox.cos.COSName.A;
        cOSDictionary18.setInt(cOSName21, 100);
        java.lang.String str27 = cOSDictionary18.getEmbeddedString("Start", "UpperAlpha", "Name=null, Value=null, FormattedValue=null, Hidden=false");
        boolean b28 = cOSDictionary4.containsValue((java.lang.Object) cOSDictionary18);
        org.apache.pdfbox.cos.COSName cOSName29 = org.apache.pdfbox.cos.COSName.DS;
        org.apache.pdfbox.cos.COSName cOSName30 = cOSDictionary4.getCOSName(cOSName29);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(cOSName11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "RP" + "'", str13.equals("RP"));
        org.junit.Assert.assertNotNull(cOSDictionary18);
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertNotNull(cOSName21);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Name=null, Value=null, FormattedValue=null, Hidden=false" + "'", str27.equals("Name=null, Value=null, FormattedValue=null, Hidden=false"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(cOSName29);
        org.junit.Assert.assertNull(cOSName30);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test424");
        org.apache.pdfbox.io.RandomAccessBuffer randomAccessBuffer0 = new org.apache.pdfbox.io.RandomAccessBuffer();
        byte[] byte_array1 = org.apache.pdfbox.pdfwriter.COSWriter.STARTXREF;
        randomAccessBuffer0.write(byte_array1);
        int i3 = randomAccessBuffer0.available();
        org.junit.Assert.assertNotNull(byte_array1);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test425");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.SET_F;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test426");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata4 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument0);
        org.apache.pdfbox.cos.COSStream cOSStream5 = pDMetadata4.getCOSObject();
        java.lang.String str6 = cOSStream5.toTextString();
        org.apache.pdfbox.pdmodel.font.PDTrueTypeFont pDTrueTypeFont7 = new org.apache.pdfbox.pdmodel.font.PDTrueTypeFont((org.apache.pdfbox.cos.COSDictionary) cOSStream5);
        boolean b8 = pDTrueTypeFont7.isSymbolic();
        org.junit.Assert.assertNotNull(cOSStream5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test427");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        org.apache.pdfbox.cos.COSDocument cOSDocument2 = pDDocument0.getDocument();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree3 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDPageTree3.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject5 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty6 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary4, pDUserAttributeObject5);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent7 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary4);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit8 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary4);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_9 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary4);
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation10 = new org.apache.pdfbox.pdmodel.PDDocumentInformation(cOSDictionary4);
        java.util.Calendar calendar11 = pDDocumentInformation10.getCreationDate();
        pDDocumentInformation10.setCustomMetadataValue("UpperAlpha", "def");
        pDDocument0.setDocumentInformation(pDDocumentInformation10);
        pDDocumentInformation10.setSubject("TH");
        org.junit.Assert.assertNotNull(cOSDocument2);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNull(calendar11);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test428");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        float[] f_array1 = fDFAnnotationFreeText0.getCallout();
        fDFAnnotationFreeText0.setDefaultAppearance("I");
        java.lang.String str4 = fDFAnnotationFreeText0.getLineEndingStyle();
        boolean b5 = fDFAnnotationFreeText0.isNoRotate();
        java.lang.String str6 = fDFAnnotationFreeText0.getLineEndingStyle();
        fDFAnnotationFreeText0.setToggleNoView(false);
        org.junit.Assert.assertNull(f_array1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test429");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        org.apache.pdfbox.cos.COSDocument cOSDocument2 = pDDocument0.getDocument();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(pDDocument0);
        org.junit.Assert.assertNotNull(cOSDocument2);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test430");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode2 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary1);
        java.util.List<org.apache.pdfbox.pdmodel.common.PDNameTreeNode<org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript>> list_pdnametreenode_pDActionJavaScript3 = pDJavascriptNameTreeNode2.getKids();
        java.util.List<org.apache.pdfbox.pdmodel.common.PDNameTreeNode<org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript>> list_pdnametreenode_pDActionJavaScript4 = pDJavascriptNameTreeNode2.getKids();
        java.util.List<org.apache.pdfbox.pdmodel.common.PDNameTreeNode<org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript>> list_pdnametreenode_pDActionJavaScript5 = pDJavascriptNameTreeNode2.getKids();
        java.util.List<org.apache.pdfbox.pdmodel.common.PDNameTreeNode<org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript>> list_pdnametreenode_pDActionJavaScript6 = pDJavascriptNameTreeNode2.getKids();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(list_pdnametreenode_pDActionJavaScript3);
        org.junit.Assert.assertNotNull(list_pdnametreenode_pDActionJavaScript4);
        org.junit.Assert.assertNotNull(list_pdnametreenode_pDActionJavaScript5);
        org.junit.Assert.assertNotNull(list_pdnametreenode_pDActionJavaScript6);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test431");
        org.apache.pdfbox.pdmodel.fdf.FDFJavaScript fDFJavaScript0 = new org.apache.pdfbox.pdmodel.fdf.FDFJavaScript();
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test432");
        org.apache.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams pDWindowsLaunchParams0 = new org.apache.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams();
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test433");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject.CHECKED_STATE_OFF;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "off" + "'", str0.equals("off"));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test434");
        org.apache.pdfbox.cos.COSBoolean cOSBoolean1 = org.apache.pdfbox.cos.COSBoolean.getBoolean(false);
        java.lang.Boolean b2 = cOSBoolean1.getValueAsObject();
        org.junit.Assert.assertNotNull(cOSBoolean1);
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + false + "'", b2.equals(false));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test435");
        org.apache.pdfbox.io.RandomAccessWrite randomAccessWrite0 = null;
        org.apache.pdfbox.io.RandomAccessOutputStream randomAccessOutputStream1 = new org.apache.pdfbox.io.RandomAccessOutputStream(randomAccessWrite0);
        randomAccessOutputStream1.flush();
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream3 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream((java.io.OutputStream) randomAccessOutputStream1);
        byte[] byte_array4 = org.apache.pdfbox.pdfwriter.COSStandardOutputStream.LF;
        try {
            randomAccessOutputStream1.write(byte_array4, 32, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array4);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test436");
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting0 = org.apache.pdfbox.io.MemoryUsageSetting.setupMainMemoryOnly();
        org.junit.Assert.assertNotNull(memoryUsageSetting0);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test437");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree1 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle2 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage3 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle2);
        int i4 = pDPageTree1.indexOf(pDPage3);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream5 = pDPage3.getContentStreams();
        org.apache.pdfbox.pdmodel.PDResources pDResources6 = pDPage3.getResources();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree7 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary8 = pDPageTree7.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition9 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary8);
        org.apache.pdfbox.cos.COSBase cOSBase10 = pDTransition9.getDirection();
        pDPage3.setTransition(pDTransition9, (float) (short) 1);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree13 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary14 = pDPageTree13.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition15 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary14);
        pDPage3.setTransition(pDTransition15);
        java.io.InputStream inputStream17 = pDPage3.getContents();
        try {
            org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner pDVisibleSignDesigner19 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner("Pages", inputStream17, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNotNull(iterator_pDStream5);
        org.junit.Assert.assertNull(pDResources6);
        org.junit.Assert.assertNotNull(cOSDictionary8);
        org.junit.Assert.assertNotNull(cOSBase10);
        org.junit.Assert.assertNotNull(cOSDictionary14);
        org.junit.Assert.assertNotNull(inputStream17);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test438");
        org.apache.pdfbox.pdmodel.graphics.state.RenderingMode renderingMode0 = org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.FILL_STROKE;
        org.junit.Assert.assertTrue("'" + renderingMode0 + "' != '" + org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.FILL_STROKE + "'", renderingMode0.equals(org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.FILL_STROKE));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test439");
        org.apache.pdfbox.pdmodel.fdf.FDFNamedPageReference fDFNamedPageReference0 = new org.apache.pdfbox.pdmodel.fdf.FDFNamedPageReference();
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test440");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray1 = pDRectangle0.getCOSArray();
        cOSArray1.clear();
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitHeightDestination pDPageFitHeightDestination3 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitHeightDestination(cOSArray1);
        boolean b4 = pDPageFitHeightDestination3.fitBoundingBox();
        boolean b5 = pDPageFitHeightDestination3.fitBoundingBox();
        int i6 = pDPageFitHeightDestination3.getLeft();
        org.junit.Assert.assertNotNull(pDRectangle0);
        org.junit.Assert.assertNotNull(cOSArray1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == (-1));
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test441");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary1 = null;
        pDAnnotationLine0.setBorderStyle(pDBorderStyleDictionary1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray4 = pDRectangle3.getCOSArray();
        org.apache.pdfbox.pdmodel.common.PDRange pDRange5 = new org.apache.pdfbox.pdmodel.common.PDRange(cOSArray4);
        pDAnnotationLine0.setBorder(cOSArray4);
        try {
            org.apache.pdfbox.cos.COSBase cOSBase8 = cOSArray4.getObject(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle3);
        org.junit.Assert.assertNotNull(cOSArray4);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test442");
        org.apache.pdfbox.multipdf.Overlay overlay0 = new org.apache.pdfbox.multipdf.Overlay();
        java.lang.String str1 = overlay0.getDefaultOverlayFile();
        java.lang.String str2 = overlay0.getDefaultOverlayFile();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument3 = new org.apache.pdfbox.pdmodel.PDDocument();
        overlay0.setEvenPageOverlayPDF(pDDocument3);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test443");
        org.apache.pdfbox.pdmodel.documentinterchange.prepress.PDBoxStyle pDBoxStyle0 = new org.apache.pdfbox.pdmodel.documentinterchange.prepress.PDBoxStyle();
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test444");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DOMAIN;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test445");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions2 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary1);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.CROP_BOX;
        java.lang.String str5 = cOSDictionary1.getEmbeddedString("Overline", cOSName4);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch pDActionLaunch6 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch(cOSDictionary1);
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor pDFontDescriptor7 = new org.apache.pdfbox.pdmodel.font.PDFontDescriptor(cOSDictionary1);
        pDFontDescriptor7.setStemH((float) (short) 10);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test446");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_6 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType7 pDShadingType7_7 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType7(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolygon fDFAnnotationPolygon8 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolygon(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit9 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.pdmodel.font.PDMMType1Font pDMMType1Font10 = new org.apache.pdfbox.pdmodel.font.PDMMType1Font(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary1);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test447");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLink.SUBTYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Link" + "'", str0.equals("Link"));
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test448");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.PDDocumentCatalog pDDocumentCatalog4 = pDDocument0.getDocumentCatalog();
        java.lang.String str5 = pDDocumentCatalog4.getLanguage();
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences pDViewerPreferences6 = pDDocumentCatalog4.getViewerPreferences();
        org.junit.Assert.assertNotNull(pDDocumentCatalog4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(pDViewerPreferences6);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test449");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams.OPERATION_PRINT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "print" + "'", str0.equals("print"));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test450");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData pDActionImportData5 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData(cOSDictionary1);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree6 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = pDPageTree6.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode8 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary7);
        org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern pDTilingPattern9 = new org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern(cOSDictionary7);
        org.apache.pdfbox.cos.COSName cOSName10 = cOSDictionary1.getKeyForValue((java.lang.Object) pDTilingPattern9);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotation fDFAnnotation11 = org.apache.pdfbox.pdmodel.fdf.FDFAnnotation.create(cOSDictionary1);
        org.apache.pdfbox.cos.COSName cOSName12 = org.apache.pdfbox.cos.COSName.CAP_HEIGHT;
        boolean b14 = cOSDictionary1.getFlag(cOSName12, (int) (byte) 1);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertNull(cOSName10);
        org.junit.Assert.assertNull(fDFAnnotation11);
        org.junit.Assert.assertNotNull(cOSName12);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test451");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStamp.SUBTYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Stamp" + "'", str0.equals("Stamp"));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test452");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNAttributes pDDeviceNAttributes1 = new org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNAttributes(cOSDictionary0);
        try {
            java.util.Map<java.lang.String, org.apache.pdfbox.pdmodel.graphics.color.PDSeparation> map_str_pDSeparation2 = pDDeviceNAttributes1.getColorants();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test453");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.INKLIST;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test454");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLink fDFAnnotationLink0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLink();
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test455");
        org.apache.pdfbox.contentstream.operator.text.ShowTextAdjusted showTextAdjusted0 = new org.apache.pdfbox.contentstream.operator.text.ShowTextAdjusted();
        java.lang.String str1 = showTextAdjusted0.getName();
        org.apache.pdfbox.contentstream.operator.Operator operator2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject4.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = pDExportFormatAttributeObject4.getCOSObject();
        int i9 = cOSDictionary7.getInt("Expired");
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.A;
        cOSDictionary7.setInt(cOSName10, 100);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo pDActionGoTo13 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo(cOSDictionary7);
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkedContentReference pDMarkedContentReference14 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkedContentReference(cOSDictionary7);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_15 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary7);
        org.apache.pdfbox.cos.COSArray cOSArray16 = new org.apache.pdfbox.cos.COSArray();
        pDShadingType1_15.setBackground(cOSArray16);
        java.util.Iterator<org.apache.pdfbox.cos.COSBase> iterator_cOSBase18 = cOSArray16.iterator();
        java.util.List<? extends org.apache.pdfbox.cos.COSBase> list_wildcard19 = cOSArray16.toList();
        showTextAdjusted0.process(operator2, (java.util.List<org.apache.pdfbox.cos.COSBase>) list_wildcard19);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "TJ" + "'", str1.equals("TJ"));
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertNotNull(iterator_cOSBase18);
        org.junit.Assert.assertNotNull(list_wildcard19);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test456");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        java.lang.String str2 = pDEmbeddedFile1.getMacCreator();
        org.apache.pdfbox.pdmodel.common.COSArrayList<org.apache.pdfbox.printing.PDFPageable> cosarraylist_pDFPageable3 = new org.apache.pdfbox.pdmodel.common.COSArrayList<org.apache.pdfbox.printing.PDFPageable>();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument4 = null;
        org.apache.pdfbox.printing.PDFPageable pDFPageable5 = new org.apache.pdfbox.printing.PDFPageable(pDDocument4);
        org.apache.pdfbox.printing.PDFPageable[] pDFPageable_array6 = new org.apache.pdfbox.printing.PDFPageable[] { pDFPageable5 };
        java.util.ArrayList<org.apache.pdfbox.printing.PDFPageable> arraylist_pDFPageable7 = new java.util.ArrayList<org.apache.pdfbox.printing.PDFPageable>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.printing.PDFPageable>) arraylist_pDFPageable7, pDFPageable_array6);
        boolean b9 = cosarraylist_pDFPageable3.containsAll((java.util.Collection<org.apache.pdfbox.printing.PDFPageable>) arraylist_pDFPageable7);
        pDEmbeddedFile1.setFileDecodeParams((java.util.List<org.apache.pdfbox.printing.PDFPageable>) cosarraylist_pDFPageable3);
        java.lang.String str11 = pDEmbeddedFile1.getMacCreator();
        java.util.List<java.lang.Object> list_obj12 = pDEmbeddedFile1.getDecodeParms();
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata13 = pDEmbeddedFile1.getMetadata();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(pDFPageable_array6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(list_obj12);
        org.junit.Assert.assertNull(pDMetadata13);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test457");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions2 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary1);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.CROP_BOX;
        java.lang.String str5 = cOSDictionary1.getEmbeddedString("Overline", cOSName4);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch pDActionLaunch6 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch(cOSDictionary1);
        org.apache.pdfbox.cos.COSBase cOSBase8 = cOSDictionary1.getDictionaryObject("MediaBox");
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(cOSBase8);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test458");
        byte[] byte_array0 = org.apache.pdfbox.pdfwriter.COSWriter.TRAILER;
        org.junit.Assert.assertNotNull(byte_array0);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test459");
        org.apache.pdfbox.io.RandomAccessWrite randomAccessWrite0 = null;
        org.apache.pdfbox.io.RandomAccessOutputStream randomAccessOutputStream1 = new org.apache.pdfbox.io.RandomAccessOutputStream(randomAccessWrite0);
        randomAccessOutputStream1.flush();
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream3 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream((java.io.OutputStream) randomAccessOutputStream1);
        long long4 = cOSStandardOutputStream3.getPos();
        cOSStandardOutputStream3.flush();
        org.junit.Assert.assertTrue(long4 == 0L);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test460");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine fDFAnnotationLine0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine();
        float[] f_array4 = new float[] { (short) 1, '#', 100L };
        org.apache.pdfbox.cos.COSName cOSName5 = org.apache.pdfbox.cos.COSName.PAGE_LAYOUT;
        org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace6 = null;
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor7 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array4, cOSName5, pDColorSpace6);
        fDFAnnotationLine0.setLine(f_array4);
        java.lang.String str9 = fDFAnnotationLine0.getEndPointEndingStyle();
        fDFAnnotationLine0.setNoRotate(false);
        org.junit.Assert.assertNotNull(f_array4);
        org.junit.Assert.assertNotNull(cOSName5);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "None" + "'", str9.equals("None"));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test461");
        org.apache.pdfbox.multipdf.Overlay overlay0 = new org.apache.pdfbox.multipdf.Overlay();
        java.lang.String str1 = overlay0.getDefaultOverlayFile();
        java.lang.String str2 = overlay0.getDefaultOverlayFile();
        overlay0.setDefaultOverlayFile("Sect");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test462");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDComboBox pDComboBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDComboBox(pDAcroForm0);
        pDComboBox1.setReadOnly(false);
        java.lang.String str4 = pDComboBox1.getAlternateFieldName();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree5 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary6 = pDPageTree5.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject7 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty8 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary6, pDUserAttributeObject7);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent9 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary6);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit10 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary6);
        org.apache.pdfbox.cos.COSName cOSName12 = org.apache.pdfbox.cos.COSName.SIZE;
        java.util.Calendar calendar13 = null;
        java.util.Calendar calendar14 = cOSDictionary6.getEmbeddedDate("BlockQuote", cOSName12, calendar13);
        org.apache.pdfbox.pdmodel.fdf.FDFField fDFField15 = new org.apache.pdfbox.pdmodel.fdf.FDFField(cOSDictionary6);
        fDFField15.setPartialFieldName("List");
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions18 = fDFField15.getAdditionalActions();
        fDFField15.setSetFieldFlags((java.lang.Integer) 6);
        pDComboBox1.importFDF(fDFField15);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cOSDictionary6);
        org.junit.Assert.assertNotNull(cOSName12);
        org.junit.Assert.assertNull(calendar14);
        org.junit.Assert.assertNull(pDAdditionalActions18);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test463");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        cOSDictionary1.setString("Highlight", "Start");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree5 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary6 = pDPageTree5.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject7 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty8 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary6, pDUserAttributeObject7);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent9 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary6);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData pDActionImportData10 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData(cOSDictionary6);
        org.apache.pdfbox.cos.COSName cOSName12 = org.apache.pdfbox.cos.COSName.EMPTY;
        int i14 = cOSDictionary6.getEmbeddedInt("hi!", cOSName12, 10);
        org.apache.pdfbox.cos.COSName cOSName15 = org.apache.pdfbox.cos.COSName.CREATOR;
        int i17 = cOSDictionary1.getInt(cOSName12, cOSName15, (int) (short) 0);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCircle fDFAnnotationCircle18 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCircle(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary6);
        org.junit.Assert.assertNotNull(cOSName12);
        org.junit.Assert.assertTrue(i14 == 10);
        org.junit.Assert.assertNotNull(cOSName15);
        org.junit.Assert.assertTrue(i17 == 0);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test464");
        try {
            org.apache.pdfbox.io.RandomAccessBufferedFileInputStream randomAccessBufferedFileInputStream1 = new org.apache.pdfbox.io.RandomAccessBufferedFileInputStream("MacExpertEncoding");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test465");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.BORDER;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test466");
        org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState pDExtendedGraphicsState0 = new org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState();
        org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState pDGraphicsState1 = null;
        pDExtendedGraphicsState0.copyIntoGraphicsState(pDGraphicsState1);
        pDExtendedGraphicsState0.setLineJoinStyle(32);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test467");
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
        org.apache.pdfbox.printing.Scaling scaling13 = org.apache.pdfbox.printing.Scaling.SCALE_TO_FIT;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable17 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument12, scaling13, true, (float) '#', true);
        org.junit.Assert.assertNotNull(cOSDocument2);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNull(cOSObjectKey9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + scaling13 + "' != '" + org.apache.pdfbox.printing.Scaling.SCALE_TO_FIT + "'", scaling13.equals(org.apache.pdfbox.printing.Scaling.SCALE_TO_FIT));
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test468");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        org.apache.pdfbox.cos.COSString cOSString2 = null;
        org.apache.pdfbox.pdmodel.common.filespecification.PDSimpleFileSpecification pDSimpleFileSpecification3 = new org.apache.pdfbox.pdmodel.common.filespecification.PDSimpleFileSpecification(cOSString2);
        pDEmbeddedFile1.setFile((org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification) pDSimpleFileSpecification3);
        org.apache.pdfbox.cos.COSString cOSString5 = null;
        org.apache.pdfbox.pdmodel.common.filespecification.PDSimpleFileSpecification pDSimpleFileSpecification6 = new org.apache.pdfbox.pdmodel.common.filespecification.PDSimpleFileSpecification(cOSString5);
        pDEmbeddedFile1.setFile((org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification) pDSimpleFileSpecification6);
        pDSimpleFileSpecification6.setFile("Caption");
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test469");
        org.apache.pdfbox.pdmodel.interactive.measurement.PDViewportDictionary pDViewportDictionary0 = new org.apache.pdfbox.pdmodel.interactive.measurement.PDViewportDictionary();
        pDViewportDictionary0.setName("LI");
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test470");
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.NON_FULL_SCREEN_PAGE_MODE nON_FULL_SCREEN_PAGE_MODE0 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.NON_FULL_SCREEN_PAGE_MODE.UseNone;
        org.junit.Assert.assertTrue("'" + nON_FULL_SCREEN_PAGE_MODE0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.NON_FULL_SCREEN_PAGE_MODE.UseNone + "'", nON_FULL_SCREEN_PAGE_MODE0.equals(org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.NON_FULL_SCREEN_PAGE_MODE.UseNone));
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test471");
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
        java.io.OutputStream outputStream19 = pDPageContentStream17.getOutput();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree20 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary21 = pDPageTree20.getCOSObject();
        java.util.Set<java.util.Map.Entry<org.apache.pdfbox.cos.COSName, org.apache.pdfbox.cos.COSBase>> set_entry_cOSName_cOSBase22 = cOSDictionary21.entrySet();
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_23 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary21);
        int i24 = pDShadingType3_23.getShadingType();
        pDShadingType3_23.setAntiAlias(true);
        org.apache.pdfbox.util.Matrix matrix29 = org.apache.pdfbox.util.Matrix.getTranslateInstance(100.0f, (float) 5);
        java.awt.Paint paint30 = pDShadingType3_23.toPaint(matrix29);
        org.apache.pdfbox.cos.COSArray cOSArray31 = matrix29.toCOSArray();
        try {
            pDPageContentStream17.transform(matrix29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
        org.junit.Assert.assertNotNull(outputStream19);
        org.junit.Assert.assertNotNull(cOSDictionary21);
        org.junit.Assert.assertNotNull(set_entry_cOSName_cOSBase22);
        org.junit.Assert.assertTrue(i24 == 3);
        org.junit.Assert.assertNotNull(matrix29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(cOSArray31);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test472");
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
        int i24 = randomAccessBuffer0.read();
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(iterator_pDStream6);
        org.junit.Assert.assertNull(pDResources7);
        org.junit.Assert.assertNotNull(cOSDictionary9);
        org.junit.Assert.assertNotNull(cOSBase11);
        org.junit.Assert.assertNotNull(cOSDictionary15);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertNotNull(randomAccessBuffer23);
        org.junit.Assert.assertTrue(i24 == (-1));
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test473");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        int i6 = cOSDictionary4.getInt("Expired");
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.A;
        cOSDictionary4.setInt(cOSName7, 100);
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.OUTPUT_INTENT;
        org.apache.pdfbox.cos.COSBase cOSBase11 = cOSDictionary4.getItem(cOSName10);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceCharacteristicsDictionary pDAppearanceCharacteristicsDictionary12 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceCharacteristicsDictionary(cOSDictionary4);
        org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject pDFormXObject13 = pDAppearanceCharacteristicsDictionary12.getAlternateIcon();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary14 = pDAppearanceCharacteristicsDictionary12.getCOSObject();
        pDAppearanceCharacteristicsDictionary12.setAlternateCaption("Quote");
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor17 = null;
        try {
            pDAppearanceCharacteristicsDictionary12.setBorderColour(pDColor17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertNull(cOSBase11);
        org.junit.Assert.assertNull(pDFormXObject13);
        org.junit.Assert.assertNotNull(cOSDictionary14);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test474");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDComboBox pDComboBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDComboBox(pDAcroForm0);
        pDComboBox1.setReadOnly(false);
        java.lang.String str4 = pDComboBox1.getAlternateFieldName();
        try {
            int i5 = pDComboBox1.getQ();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test475");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        float[] f_array1 = fDFAnnotationFreeText0.getCallout();
        fDFAnnotationFreeText0.setDefaultAppearance("I");
        java.lang.String str4 = fDFAnnotationFreeText0.getLineEndingStyle();
        boolean b5 = fDFAnnotationFreeText0.isNoRotate();
        java.lang.String str6 = fDFAnnotationFreeText0.getLineEndingStyle();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree7 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle8 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage9 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle8);
        int i10 = pDPageTree7.indexOf(pDPage9);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree11 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary12 = pDPageTree11.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition13 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary12);
        org.apache.pdfbox.cos.COSBase cOSBase14 = pDTransition13.getDirection();
        pDPage9.setTransition(pDTransition13, (float) 1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle17 = pDPage9.getCropBox();
        fDFAnnotationFreeText0.setFringe(pDRectangle17);
        org.junit.Assert.assertNull(f_array1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNotNull(cOSDictionary12);
        org.junit.Assert.assertNotNull(cOSBase14);
        org.junit.Assert.assertNotNull(pDRectangle17);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test476");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.OPEN_ACTION;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test477");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties pDVisibleSigProperties0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties();
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner pDVisibleSignDesigner1 = pDVisibleSigProperties0.getPdVisibleSignature();
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties pDVisibleSigProperties3 = pDVisibleSigProperties0.preferredSize((-4));
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties pDVisibleSigProperties5 = pDVisibleSigProperties3.page((int) 'a');
        org.junit.Assert.assertNull(pDVisibleSignDesigner1);
        org.junit.Assert.assertNotNull(pDVisibleSigProperties3);
        org.junit.Assert.assertNotNull(pDVisibleSigProperties5);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test478");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle1 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage2 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle1);
        int i3 = pDPageTree0.indexOf(pDPage2);
        int i4 = pDPageTree0.getCount();
        try {
            org.apache.pdfbox.pdmodel.PDPage pDPage6 = pDPageTree0.get(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test479");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        java.util.Set<java.util.Map.Entry<org.apache.pdfbox.cos.COSName, org.apache.pdfbox.cos.COSBase>> set_entry_cOSName_cOSBase2 = cOSDictionary1.entrySet();
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_3 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary1);
        int i4 = pDShadingType3_3.getShadingType();
        pDShadingType3_3.setAntiAlias(true);
        org.apache.pdfbox.util.Matrix matrix9 = org.apache.pdfbox.util.Matrix.getTranslateInstance(100.0f, (float) 5);
        java.awt.Paint paint10 = pDShadingType3_3.toPaint(matrix9);
        org.apache.pdfbox.util.Matrix matrix11 = new org.apache.pdfbox.util.Matrix();
        float f12 = matrix11.getShearY();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument13 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile14 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument13);
        pDDocument13.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata17 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument13);
        org.apache.pdfbox.cos.COSStream cOSStream18 = pDMetadata17.getCOSObject();
        java.io.OutputStream outputStream19 = cOSStream18.createFilteredStream();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream20 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream18);
        org.apache.pdfbox.util.Matrix matrix21 = pDAppearanceStream20.getMatrix();
        org.apache.pdfbox.util.Matrix matrix22 = matrix9.multiply(matrix11, matrix21);
        java.awt.geom.AffineTransform affineTransform23 = null;
        try {
            matrix11.setFromAffineTransform(affineTransform23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(set_entry_cOSName_cOSBase2);
        org.junit.Assert.assertTrue(i4 == 3);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue(f12 == 0.0f);
        org.junit.Assert.assertNotNull(cOSStream18);
        org.junit.Assert.assertNotNull(outputStream19);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(matrix22);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test480");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDComboBox pDComboBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDComboBox(pDAcroForm0);
        int i2 = pDComboBox1.getFieldFlags();
        java.util.List<java.lang.String> list_str3 = pDComboBox1.getOptionsDisplayValues();
        pDComboBox1.setNoExport(false);
        org.junit.Assert.assertTrue(i2 == 131072);
        org.junit.Assert.assertNotNull(list_str3);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test481");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.L;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test482");
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition0 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition();
        java.lang.String str1 = pDTransition0.getMotion();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "I" + "'", str1.equals("I"));
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test483");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.PLACEMENT_INLINE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Inline" + "'", str0.equals("Inline"));
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test484");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup1 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup("hi!");
        boolean b2 = pDAnnotationTextMarkup1.isInvisible();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject pDLayoutAttributeObject3 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject5 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject5.setAllPaddings((int) (short) 10);
        pDExportFormatAttributeObject5.setLineHeightNormal();
        float f9 = pDExportFormatAttributeObject5.getTextDecorationThickness();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup11 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup("hi!");
        float[] f_array15 = new float[] { (short) 1, '#', 100L };
        org.apache.pdfbox.cos.COSName cOSName16 = org.apache.pdfbox.cos.COSName.PAGE_LAYOUT;
        org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace17 = null;
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor18 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array15, cOSName16, pDColorSpace17);
        pDAnnotationTextMarkup11.setQuadPoints(f_array15);
        pDExportFormatAttributeObject5.setTPaddings(f_array15);
        pDLayoutAttributeObject3.setBorderThicknesses(f_array15);
        pDAnnotationTextMarkup1.setQuadPoints(f_array15);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(f9 == (-1.0f));
        org.junit.Assert.assertNotNull(f_array15);
        org.junit.Assert.assertNotNull(cOSName16);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test485");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.printing.Scaling scaling1 = org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable5 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument0, scaling1, true, 1.0f, false);
        org.apache.pdfbox.printing.Scaling scaling6 = org.apache.pdfbox.printing.Scaling.STRETCH_TO_FIT;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable9 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument0, scaling6, false, (float) 1L);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature pDSignature10 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument11 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.printing.Scaling scaling12 = org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable16 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument11, scaling12, true, 1.0f, false);
        org.apache.pdfbox.printing.Scaling scaling17 = org.apache.pdfbox.printing.Scaling.STRETCH_TO_FIT;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable20 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument11, scaling17, false, (float) 1L);
        org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField[] pDSignatureField_array21 = new org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField[] {};
        java.util.ArrayList<org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField> arraylist_pDSignatureField22 = new java.util.ArrayList<org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField>) arraylist_pDSignatureField22, pDSignatureField_array21);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureInterface signatureInterface24 = null;
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions signatureOptions25 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions();
        pDDocument11.addSignatureField((java.util.List<org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField>) arraylist_pDSignatureField22, signatureInterface24, signatureOptions25);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument27 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile28 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument27);
        pDDocument27.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument31 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile32 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument31);
        pDDocument31.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata35 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument31);
        org.apache.pdfbox.cos.COSStream cOSStream36 = pDMetadata35.getCOSObject();
        java.io.OutputStream outputStream37 = cOSStream36.createFilteredStream();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream38 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream36);
        org.apache.pdfbox.pdmodel.common.PDStream pDStream39 = pDAppearanceStream38.getContentStream();
        org.apache.pdfbox.io.RandomAccessWrite randomAccessWrite40 = null;
        org.apache.pdfbox.io.RandomAccessOutputStream randomAccessOutputStream41 = new org.apache.pdfbox.io.RandomAccessOutputStream(randomAccessWrite40);
        randomAccessOutputStream41.flush();
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream43 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream((java.io.OutputStream) randomAccessOutputStream41);
        org.apache.pdfbox.pdmodel.PDPageContentStream pDPageContentStream44 = new org.apache.pdfbox.pdmodel.PDPageContentStream(pDDocument27, pDAppearanceStream38, (java.io.OutputStream) cOSStandardOutputStream43);
        pDDocument27.setDocumentId((java.lang.Long) 100L);
        org.apache.pdfbox.printing.Scaling scaling47 = org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable50 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument27, scaling47, true, (float) (short) -1);
        java.util.List<org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField> list_pDSignatureField51 = pDDocument27.getSignatureFields();
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureInterface signatureInterface52 = null;
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions signatureOptions53 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions();
        pDDocument11.addSignatureField(list_pDSignatureField51, signatureInterface52, signatureOptions53);
        try {
            pDDocument0.addSignature(pDSignature10, signatureOptions53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertTrue("'" + scaling1 + "' != '" + org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT + "'", scaling1.equals(org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT));
        org.junit.Assert.assertTrue("'" + scaling6 + "' != '" + org.apache.pdfbox.printing.Scaling.STRETCH_TO_FIT + "'", scaling6.equals(org.apache.pdfbox.printing.Scaling.STRETCH_TO_FIT));
        org.junit.Assert.assertTrue("'" + scaling12 + "' != '" + org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT + "'", scaling12.equals(org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT));
        org.junit.Assert.assertTrue("'" + scaling17 + "' != '" + org.apache.pdfbox.printing.Scaling.STRETCH_TO_FIT + "'", scaling17.equals(org.apache.pdfbox.printing.Scaling.STRETCH_TO_FIT));
        org.junit.Assert.assertNotNull(pDSignatureField_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(cOSStream36);
        org.junit.Assert.assertNotNull(outputStream37);
        org.junit.Assert.assertNotNull(pDStream39);
        org.junit.Assert.assertTrue("'" + scaling47 + "' != '" + org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT + "'", scaling47.equals(org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT));
        org.junit.Assert.assertNotNull(list_pDSignatureField51);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test486");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        boolean b1 = fDFAnnotationFreeText0.isNoView();
        fDFAnnotationFreeText0.setName("Annot");
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test487");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        org.apache.pdfbox.printing.PDFPageable pDFPageable1 = new org.apache.pdfbox.printing.PDFPageable(pDDocument0);
        try {
            java.awt.print.PageFormat pageFormat3 = pDFPageable1.getPageFormat(5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test488");
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
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission15 = securityHandler8.getCurrentAccessPermission();
        org.junit.Assert.assertNotNull(securityHandlerFactory0);
        org.junit.Assert.assertNull(accessPermission3);
        org.junit.Assert.assertNull(accessPermission6);
        org.junit.Assert.assertNotNull(securityHandler8);
        org.junit.Assert.assertNotNull(accessPermission9);
        org.junit.Assert.assertNotNull(accessPermission15);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test489");
        org.apache.pdfbox.pdmodel.interactive.action.PDAnnotationAdditionalActions pDAnnotationAdditionalActions0 = new org.apache.pdfbox.pdmodel.interactive.action.PDAnnotationAdditionalActions();
        org.apache.pdfbox.pdmodel.interactive.action.PDActionHide pDActionHide1 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionHide();
        pDAnnotationAdditionalActions0.setD((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionHide1);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree3 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDPageTree3.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions5 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary4);
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.CROP_BOX;
        java.lang.String str8 = cOSDictionary4.getEmbeddedString("Overline", cOSName7);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch pDActionLaunch9 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch(cOSDictionary4);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree10 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary11 = pDPageTree10.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject12 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty13 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary11, pDUserAttributeObject12);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent14 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary11);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit15 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary11);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_16 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary11);
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation17 = new org.apache.pdfbox.pdmodel.PDDocumentInformation(cOSDictionary11);
        org.apache.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams pDWindowsLaunchParams18 = new org.apache.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams(cOSDictionary11);
        pDActionLaunch9.setWinLaunchParams(pDWindowsLaunchParams18);
        java.lang.String str20 = pDActionLaunch9.getO();
        java.lang.String str21 = pDActionLaunch9.getO();
        pDAnnotationAdditionalActions0.setBl((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionLaunch9);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(cOSDictionary11);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test490");
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
        java.util.List<java.lang.Integer> list_i13 = org.apache.pdfbox.pdmodel.common.COSArrayList.convertIntegerCOSArrayToList(cOSArray7);
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitHeightDestination pDPageFitHeightDestination14 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitHeightDestination(cOSArray7);
        org.apache.pdfbox.cos.COSBase cOSBase16 = null;
        try {
            cOSArray7.set(0, cOSBase16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle0);
        org.junit.Assert.assertNotNull(cOSArray1);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNotNull(pDRectangle6);
        org.junit.Assert.assertNotNull(cOSArray7);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertNotNull(list_i13);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test491");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray1 = pDRectangle0.getCOSArray();
        cOSArray1.clear();
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitHeightDestination pDPageFitHeightDestination3 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitHeightDestination(cOSArray1);
        boolean b4 = pDPageFitHeightDestination3.fitBoundingBox();
        org.apache.pdfbox.cos.COSArray cOSArray5 = pDPageFitHeightDestination3.getCOSObject();
        org.junit.Assert.assertNotNull(pDRectangle0);
        org.junit.Assert.assertNotNull(cOSArray1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(cOSArray5);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test492");
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
        java.io.OutputStream outputStream19 = pDPageContentStream17.getOutput();
        try {
            pDPageContentStream17.fillAndStroke();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
        org.junit.Assert.assertNotNull(outputStream19);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test493");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine fDFAnnotationLine0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine();
        fDFAnnotationLine0.setStartPointEndingStyle("Polygon");
        float f3 = fDFAnnotationLine0.getLeaderOffset();
        java.lang.Integer i4 = fDFAnnotationLine0.getPage();
        org.junit.Assert.assertTrue(f3 == (-1.0f));
        org.junit.Assert.assertNull(i4);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test494");
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
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup19 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup("hi!");
        float[] f_array23 = new float[] { (short) 1, '#', 100L };
        org.apache.pdfbox.cos.COSName cOSName24 = org.apache.pdfbox.cos.COSName.PAGE_LAYOUT;
        org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace25 = null;
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor26 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array23, cOSName24, pDColorSpace25);
        pDAnnotationTextMarkup19.setQuadPoints(f_array23);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject29 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject29.setAllPaddings((int) (short) 10);
        pDExportFormatAttributeObject29.setLineHeightNormal();
        float f33 = pDExportFormatAttributeObject29.getTextDecorationThickness();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup35 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup("hi!");
        float[] f_array39 = new float[] { (short) 1, '#', 100L };
        org.apache.pdfbox.cos.COSName cOSName40 = org.apache.pdfbox.cos.COSName.PAGE_LAYOUT;
        org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace41 = null;
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor42 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array39, cOSName40, pDColorSpace41);
        pDAnnotationTextMarkup35.setQuadPoints(f_array39);
        pDExportFormatAttributeObject29.setTPaddings(f_array39);
        try {
            pDPageContentStream17.addPolygon(f_array23, f_array39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
        org.junit.Assert.assertNotNull(f_array23);
        org.junit.Assert.assertNotNull(cOSName24);
        org.junit.Assert.assertTrue(f33 == (-1.0f));
        org.junit.Assert.assertNotNull(f_array39);
        org.junit.Assert.assertNotNull(cOSName40);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test495");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_6 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType7 pDShadingType7_7 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType7(cOSDictionary1);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent8 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine fDFAnnotationLine9 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary1);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test496");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        org.apache.pdfbox.cos.COSString cOSString2 = null;
        org.apache.pdfbox.pdmodel.common.filespecification.PDSimpleFileSpecification pDSimpleFileSpecification3 = new org.apache.pdfbox.pdmodel.common.filespecification.PDSimpleFileSpecification(cOSString2);
        pDEmbeddedFile1.setFile((org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification) pDSimpleFileSpecification3);
        pDSimpleFileSpecification3.setFile("-90");
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test497");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        org.apache.pdfbox.cos.COSString cOSString2 = null;
        org.apache.pdfbox.pdmodel.common.filespecification.PDSimpleFileSpecification pDSimpleFileSpecification3 = new org.apache.pdfbox.pdmodel.common.filespecification.PDSimpleFileSpecification(cOSString2);
        pDEmbeddedFile1.setFile((org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification) pDSimpleFileSpecification3);
        org.apache.pdfbox.cos.COSString cOSString5 = null;
        org.apache.pdfbox.pdmodel.common.filespecification.PDSimpleFileSpecification pDSimpleFileSpecification6 = new org.apache.pdfbox.pdmodel.common.filespecification.PDSimpleFileSpecification(cOSString5);
        pDEmbeddedFile1.setFile((org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification) pDSimpleFileSpecification6);
        java.lang.String str8 = pDEmbeddedFile1.getMacSubtype();
        int i9 = pDEmbeddedFile1.getSize();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue(i9 == (-1));
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test498");
        org.apache.pdfbox.multipdf.Overlay overlay0 = new org.apache.pdfbox.multipdf.Overlay();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument1 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.PDStream pDStream2 = new org.apache.pdfbox.pdmodel.common.PDStream(pDDocument1);
        overlay0.setLastPageOverlayPDF(pDDocument1);
        pDDocument1.save("print");
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test499");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.UNIX;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test500");
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
        try {
            pDPageContentStream17.closeAndFillAndStroke();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
    }
}
