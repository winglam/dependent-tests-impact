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
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.LOCATION;
        cOSDictionary3.removeItem(cOSName4);
        org.apache.pdfbox.pdmodel.font.PDMMType1Font pDMMType1Font6 = new org.apache.pdfbox.pdmodel.font.PDMMType1Font(cOSDictionary3);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test002");
        java.io.InputStream inputStream0 = null;
        int[] i_array3 = new int[] { 10, (short) 100 };
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream cOSFilterInputStream4 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream(inputStream0, i_array3);
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font5 = org.apache.pdfbox.pdmodel.font.PDType1Font.COURIER_BOLD_OBLIQUE;
        byte[] byte_array7 = pDType1Font5.encode("Slash");
        try {
            int i8 = cOSFilterInputStream4.read(byte_array7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(pDType1Font5);
        org.junit.Assert.assertNotNull(byte_array7);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test003");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ADBE_PKCS7_DETACHED;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test004");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject0 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty1 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(pDUserAttributeObject0);
        try {
            pDUserProperty1.setName("D");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test005");
        org.apache.pdfbox.text.PDFMarkedContentExtractor pDFMarkedContentExtractor0 = new org.apache.pdfbox.text.PDFMarkedContentExtractor();
        org.apache.pdfbox.text.PDFMarkedContentExtractor pDFMarkedContentExtractor1 = new org.apache.pdfbox.text.PDFMarkedContentExtractor();
        org.apache.pdfbox.util.Matrix matrix8 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray9 = matrix8.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix10 = matrix8.extractScaling();
        pDFMarkedContentExtractor1.setTextMatrix(matrix8);
        matrix8.scale((float) (byte) 0, 10.0f);
        org.apache.pdfbox.util.Matrix matrix15 = matrix8.clone();
        pDFMarkedContentExtractor0.setTextMatrix(matrix15);
        byte[] byte_array18 = new byte[] { (byte) -1 };
        try {
            pDFMarkedContentExtractor0.showTextString(byte_array18);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertNotNull(cOSArray9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(matrix15);
        org.junit.Assert.assertNotNull(byte_array18);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test006");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNProcess pDDeviceNProcess4 = new org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNProcess(cOSDictionary2);
        java.util.List<java.lang.String> list_str5 = pDDeviceNProcess4.getComponents();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(list_str5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test007");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.H4;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "H4" + "'", str0.equals("H4"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test008");
        java.io.InputStream inputStream0 = null;
        int[] i_array3 = new int[] { 10, (short) 100 };
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream cOSFilterInputStream4 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream(inputStream0, i_array3);
        byte[] byte_array5 = org.apache.pdfbox.pdfwriter.COSWriter.STREAM;
        try {
            long long6 = org.apache.pdfbox.io.IOUtils.populateBuffer(inputStream0, byte_array5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(byte_array5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test009");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink pDAnnotationLink4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDDestination pDDestination5 = pDAnnotationLink4.getDestination();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(pDDestination5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test010");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.RB;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RB" + "'", str0.equals("RB"));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test011");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationRubberStamp pDAnnotationRubberStamp0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationRubberStamp();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test012");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding5 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline6 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary3);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_7 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary3);
        org.apache.pdfbox.util.Matrix matrix14 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray15 = matrix14.toCOSArray();
        pDShadingType3_7.setDomain(cOSArray15);
        try {
            java.util.List<java.lang.String> list_str17 = org.apache.pdfbox.pdmodel.common.COSArrayList.convertCOSStringCOSArrayToList(cOSArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSArray15);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test013");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.G;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test014");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DA;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test015");
        java.util.List<java.lang.String> list_str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.types;
        org.junit.Assert.assertNotNull(list_str0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test016");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DESC;
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry pDAppearanceEntry1 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry((org.apache.pdfbox.cos.COSBase) cOSName0);
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test017");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding5 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline6 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary3);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_7 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary3);
        org.apache.pdfbox.util.Matrix matrix14 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray15 = matrix14.toCOSArray();
        pDShadingType3_7.setDomain(cOSArray15);
        int i17 = pDShadingType3_7.getShadingType();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSArray15);
        org.junit.Assert.assertTrue(i17 == 3);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test018");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.LOCATION;
        cOSDictionary3.removeItem(cOSName4);
        org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font6 = null;
        org.apache.pdfbox.pdmodel.font.PDCIDFontType0 pDCIDFontType0_7 = new org.apache.pdfbox.pdmodel.font.PDCIDFontType0(cOSDictionary3, pDType0Font6);
        boolean b8 = pDCIDFontType0_7.isDamaged();
        try {
            int i10 = pDCIDFontType0_7.codeToGID(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test019");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject.LIST_NUMBERING_LOWER_ROMAN;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "LowerRoman" + "'", str0.equals("LowerRoman"));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test020");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        float[] f_array7 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName8 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray9 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i10 = pDDeviceGray9.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor11 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array7, cOSName8, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray9);
        fDFAnnotationFreeText0.setCallout(f_array7);
        java.lang.String str13 = fDFAnnotationFreeText0.getLineEndingStyle();
        java.lang.String str14 = fDFAnnotationFreeText0.getDefaultAppearance();
        float[] f_array15 = fDFAnnotationFreeText0.getCallout();
        org.junit.Assert.assertNotNull(f_array7);
        org.junit.Assert.assertNotNull(cOSName8);
        org.junit.Assert.assertNotNull(pDDeviceGray9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(f_array15);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test021");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink pDAnnotationLink4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction5 = pDAnnotationLink4.getAction();
        org.apache.pdfbox.pdmodel.interactive.action.PDActionURI pDActionURI6 = null;
        pDAnnotationLink4.setPreviousURI(pDActionURI6);
        pDAnnotationLink4.setModifiedDate("StructElem");
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(pDAction5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test022");
        org.apache.pdfbox.text.PDFMarkedContentExtractor pDFMarkedContentExtractor0 = new org.apache.pdfbox.text.PDFMarkedContentExtractor();
        org.apache.pdfbox.text.PDFMarkedContentExtractor pDFMarkedContentExtractor1 = new org.apache.pdfbox.text.PDFMarkedContentExtractor();
        org.apache.pdfbox.util.Matrix matrix8 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray9 = matrix8.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix10 = matrix8.extractScaling();
        pDFMarkedContentExtractor1.setTextMatrix(matrix8);
        matrix8.scale((float) (byte) 0, 10.0f);
        org.apache.pdfbox.util.Matrix matrix15 = matrix8.clone();
        pDFMarkedContentExtractor0.setTextMatrix(matrix15);
        java.awt.geom.AffineTransform affineTransform17 = null;
        try {
            matrix15.setFromAffineTransform(affineTransform17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSArray9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(matrix15);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test023");
        org.apache.fontbox.util.BoundingBox boundingBox0 = null;
        try {
            org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle1 = new org.apache.pdfbox.pdmodel.common.PDRectangle(boundingBox0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test024");
        int i0 = org.apache.pdfbox.pdmodel.graphics.shading.PDShading.SHADING_TYPE5;
        org.junit.Assert.assertTrue(i0 == 5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test025");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.DIV;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Div" + "'", str0.equals("Div"));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test026");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation4 = new org.apache.pdfbox.pdmodel.PDDocumentInformation(cOSDictionary3);
        java.lang.String str5 = pDDocumentInformation4.getAuthor();
        java.lang.String str6 = pDDocumentInformation4.getTrapped();
        java.lang.String str7 = pDDocumentInformation4.getAuthor();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test027");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine fDFAnnotationLine5 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine(cOSDictionary3);
        float f6 = fDFAnnotationLine5.getLeaderOffset();
        fDFAnnotationLine5.setCaptionStyle("Justify");
        java.lang.String str9 = fDFAnnotationLine5.getEndPointEndingStyle();
        java.awt.Color color10 = fDFAnnotationLine5.getInteriorColor();
        float f11 = fDFAnnotationLine5.getOpacity();
        fDFAnnotationLine5.setEndPointEndingStyle("Stamp");
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(f6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "None" + "'", str9.equals("None"));
        org.junit.Assert.assertNull(color10);
        org.junit.Assert.assertTrue(f11 == 1.0f);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test028");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        float[] f_array7 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName8 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray9 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i10 = pDDeviceGray9.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor11 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array7, cOSName8, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray9);
        fDFAnnotationFreeText0.setCallout(f_array7);
        java.lang.String str13 = fDFAnnotationFreeText0.getLineEndingStyle();
        java.lang.String str14 = fDFAnnotationFreeText0.getDefaultAppearance();
        boolean b15 = fDFAnnotationFreeText0.isInvisible();
        org.junit.Assert.assertNotNull(f_array7);
        org.junit.Assert.assertNotNull(cOSName8);
        org.junit.Assert.assertNotNull(pDDeviceGray9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test029");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationInk fDFAnnotationInk0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationInk();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle1 = null;
        fDFAnnotationInk0.setRectangle(pDRectangle1);
        fDFAnnotationInk0.setIntent("");
        boolean b5 = fDFAnnotationInk0.isNoRotate();
        java.util.List<float[]> list_f_array6 = fDFAnnotationInk0.getInkList();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(list_f_array6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test030");
        org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions pDFormFieldAdditionalActions0 = new org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions();
        org.apache.pdfbox.pdmodel.interactive.action.PDActionSound pDActionSound1 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionSound();
        pDActionSound1.setVolume((float) (byte) 1);
        pDFormFieldAdditionalActions0.setC((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionSound1);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionSound pDActionSound5 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionSound();
        float f6 = pDActionSound5.getVolume();
        pDFormFieldAdditionalActions0.setF((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionSound5);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary8 = pDFormFieldAdditionalActions0.getCOSObject();
        org.junit.Assert.assertTrue(f6 == 1.0f);
        org.junit.Assert.assertNotNull(cOSDictionary8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test031");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNProcess pDDeviceNProcess4 = new org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNProcess(cOSDictionary2);
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNProcess pDDeviceNProcess5 = new org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNProcess(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSDictionary2);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test032");
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle pDTransitionStyle0 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.R;
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition1 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(pDTransitionStyle0);
        java.lang.String str2 = pDTransition1.getDimension();
        org.junit.Assert.assertTrue("'" + pDTransitionStyle0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.R + "'", pDTransitionStyle0.equals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.R));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "H" + "'", str2.equals("H"));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test033");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        float f2 = pDExportFormatAttributeObject1.getBaselineShift();
        pDExportFormatAttributeObject1.setBlockAlign("ImportData");
        pDExportFormatAttributeObject1.setLineHeightNormal();
        java.lang.String str6 = pDExportFormatAttributeObject1.getRubyPosition();
        java.lang.Object obj7 = pDExportFormatAttributeObject1.getHeight();
        org.junit.Assert.assertTrue(f2 == 0.0f);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Before" + "'", str6.equals("Before"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "Auto" + "'", obj7.equals("Auto"));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test034");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ALT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test035");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary pDRectlinearMeasureDictionary1 = new org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary(cOSDictionary0);
        try {
            org.apache.pdfbox.pdmodel.interactive.measurement.PDNumberFormatDictionary[] pDNumberFormatDictionary_array2 = pDRectlinearMeasureDictionary1.getChangeYs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test036");
        int i0 = org.apache.pdfbox.pdmodel.graphics.pattern.PDAbstractPattern.TYPE_SHADING_PATTERN;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test037");
        byte[] byte_array0 = org.apache.pdfbox.pdfwriter.COSWriter.TRAILER;
        org.junit.Assert.assertNotNull(byte_array0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test038");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        org.apache.pdfbox.io.RandomAccessRead randomAccessRead1 = null;
        org.apache.pdfbox.io.RandomAccessInputStream randomAccessInputStream2 = new org.apache.pdfbox.io.RandomAccessInputStream(randomAccessRead1);
        try {
            org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile3 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0, (java.io.InputStream) randomAccessInputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test039");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.CODE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Code" + "'", str0.equals("Code"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test040");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar1 = null;
        pDAnnotationPopup0.setModifiedDate(calendar1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup0.setRectangle(pDRectangle3);
        org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState pDGraphicsState5 = new org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState(pDRectangle3);
        org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace6 = pDGraphicsState5.getStrokingColorSpace();
        org.apache.pdfbox.pdmodel.graphics.state.PDTextState pDTextState7 = null;
        pDGraphicsState5.setTextState(pDTextState7);
        try {
            org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState pDGraphicsState9 = pDGraphicsState5.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle3);
        org.junit.Assert.assertNotNull(pDColorSpace6);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test041");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDObjectReference pDObjectReference0 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDObjectReference();
        org.apache.pdfbox.cos.COSStream cOSStream1 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction2 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction((org.apache.pdfbox.cos.COSDictionary) cOSStream1);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream1);
        pDObjectReference0.setReferencedObject((org.apache.pdfbox.pdmodel.graphics.PDXObject) pDAppearanceStream3);
        java.awt.geom.AffineTransform affineTransform5 = null;
        try {
            pDAppearanceStream3.setMatrix(affineTransform5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(pDAction2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test042");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.A;
        org.apache.pdfbox.cos.COSObject cOSObject1 = new org.apache.pdfbox.cos.COSObject((org.apache.pdfbox.cos.COSBase) cOSName0);
        org.apache.pdfbox.cos.COSName cOSName2 = org.apache.pdfbox.cos.COSName.DS;
        org.apache.pdfbox.cos.COSBase cOSBase3 = cOSObject1.getDictionaryObject(cOSName2);
        org.apache.pdfbox.cos.ICOSVisitor iCOSVisitor4 = null;
        try {
            java.lang.Object obj5 = cOSObject1.accept(iCOSVisitor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSName0);
        org.junit.Assert.assertNotNull(cOSName2);
        org.junit.Assert.assertNull(cOSBase3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test043");
        org.apache.pdfbox.cos.COSStream cOSStream0 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquare fDFAnnotationSquare1 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquare((org.apache.pdfbox.cos.COSDictionary) cOSStream0);
        org.apache.pdfbox.pdmodel.common.PDObjectStream pDObjectStream2 = new org.apache.pdfbox.pdmodel.common.PDObjectStream(cOSStream0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata3 = pDObjectStream2.getMetadata();
        org.junit.Assert.assertNull(pDMetadata3);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test044");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.BORDER_STYLE_INSET;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Inset" + "'", str0.equals("Inset"));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test045");
        org.apache.pdfbox.util.Matrix matrix6 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray7 = matrix6.toCOSArray();
        java.util.Spliterator<org.apache.pdfbox.cos.COSBase> spliterator_cOSBase8 = cOSArray7.spliterator();
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageXYZDestination pDPageXYZDestination9 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageXYZDestination(cOSArray7);
        org.apache.pdfbox.pdmodel.PDPage pDPage10 = pDPageXYZDestination9.getPage();
        org.junit.Assert.assertNotNull(cOSArray7);
        org.junit.Assert.assertNotNull(spliterator_cOSBase8);
        org.junit.Assert.assertNull(pDPage10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test046");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.COURIER_BOLD_OBLIQUE;
        boolean b1 = pDType1Font0.isVertical();
        org.apache.fontbox.FontBoxFont fontBoxFont2 = pDType1Font0.getFontBoxFont();
        float f3 = pDType1Font0.getAverageFontWidth();
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(fontBoxFont2);
        org.junit.Assert.assertTrue(f3 == 600.0f);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test047");
        org.apache.pdfbox.pdmodel.common.filespecification.PDSimpleFileSpecification pDSimpleFileSpecification0 = new org.apache.pdfbox.pdmodel.common.filespecification.PDSimpleFileSpecification();
        java.lang.String str1 = pDSimpleFileSpecification0.getFile();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test048");
        java.lang.String str0 = org.apache.pdfbox.util.Version.getVersion();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "2.1.0-SNAPSHOT" + "'", str0.equals("2.1.0-SNAPSHOT"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test049");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine fDFAnnotationLine5 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent6 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDExternalDataDictionary pDExternalDataDictionary7 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDExternalDataDictionary(cOSDictionary3);
        try {
            org.apache.pdfbox.pdmodel.graphics.shading.PDShading pDShading8 = org.apache.pdfbox.pdmodel.graphics.shading.PDShading.create(cOSDictionary3);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test050");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationUnderline fDFAnnotationUnderline0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationUnderline();
        float[] f_array7 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName8 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray9 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i10 = pDDeviceGray9.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor11 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array7, cOSName8, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray9);
        fDFAnnotationUnderline0.setCoords(f_array7);
        fDFAnnotationUnderline0.setDate("Figure");
        org.junit.Assert.assertNotNull(f_array7);
        org.junit.Assert.assertNotNull(cOSName8);
        org.junit.Assert.assertNotNull(pDDeviceGray9);
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test051");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.VERTICES;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test052");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        try {
            org.apache.pdfbox.pdmodel.font.PDMMType1Font pDMMType1Font1 = new org.apache.pdfbox.pdmodel.font.PDMMType1Font(cOSDictionary0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test053");
        org.apache.pdfbox.cos.COSDocument cOSDocument0 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey1 = null;
        org.apache.pdfbox.cos.COSObject cOSObject2 = cOSDocument0.getObjectFromPool(cOSObjectKey1);
        org.apache.pdfbox.cos.COSName cOSName3 = org.apache.pdfbox.cos.COSName.CL;
        org.apache.pdfbox.cos.COSObject cOSObject4 = cOSDocument0.getObjectByType(cOSName3);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm5 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox6 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm5);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = pDCheckBox6.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary8 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary7);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine9 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary8);
        long long11 = cOSDictionary8.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed12 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary8);
        java.lang.String str15 = cOSDictionary8.getEmbeddedString("sc", "After");
        cOSDocument0.setTrailer(cOSDictionary8);
        boolean b17 = cOSDocument0.isClosed();
        org.junit.Assert.assertNotNull(cOSObject2);
        org.junit.Assert.assertNotNull(cOSName3);
        org.junit.Assert.assertNull(cOSObject4);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertTrue(long11 == (-1L));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test054");
        org.apache.pdfbox.contentstream.operator.DrawObject drawObject0 = new org.apache.pdfbox.contentstream.operator.DrawObject();
        org.apache.pdfbox.text.PDFMarkedContentExtractor pDFMarkedContentExtractor1 = new org.apache.pdfbox.text.PDFMarkedContentExtractor();
        drawObject0.setContext((org.apache.pdfbox.contentstream.PDFStreamEngine) pDFMarkedContentExtractor1);
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDObjectReference pDObjectReference3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDObjectReference();
        org.apache.pdfbox.cos.COSStream cOSStream4 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction5 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction((org.apache.pdfbox.cos.COSDictionary) cOSStream4);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream6 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream4);
        pDObjectReference3.setReferencedObject((org.apache.pdfbox.pdmodel.graphics.PDXObject) pDAppearanceStream6);
        try {
            pDFMarkedContentExtractor1.showForm((org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject) pDAppearanceStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(pDAction5);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test055");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject pDTableAttributeObject0 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject();
        java.lang.String[] str_array1 = pDTableAttributeObject0.getHeaders();
        org.junit.Assert.assertNull(str_array1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test056");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.STM_F;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test057");
        org.apache.pdfbox.contentstream.operator.text.ShowTextLineAndSpace showTextLineAndSpace0 = new org.apache.pdfbox.contentstream.operator.text.ShowTextLineAndSpace();
        org.apache.pdfbox.contentstream.operator.Operator operator2 = org.apache.pdfbox.contentstream.operator.Operator.getOperator("Final");
        org.apache.pdfbox.contentstream.operator.DrawObject drawObject3 = new org.apache.pdfbox.contentstream.operator.DrawObject();
        org.apache.pdfbox.contentstream.operator.Operator operator4 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm5 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox6 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm5);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = pDCheckBox6.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup8 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary7);
        java.lang.String[] str_array10 = new java.lang.String[] { "270" };
        org.apache.pdfbox.cos.COSBase cOSBase11 = cOSDictionary7.getDictionaryObject(str_array10);
        java.util.Calendar calendar13 = cOSDictionary7.getDate("180");
        org.apache.pdfbox.cos.COSName cOSName14 = org.apache.pdfbox.cos.COSName.SHADING_TYPE;
        org.apache.pdfbox.cos.COSName cOSName15 = org.apache.pdfbox.cos.COSName.TYPE1;
        int i16 = cOSDictionary7.getInt(cOSName14, cOSName15);
        org.apache.pdfbox.cos.COSName cOSName17 = org.apache.pdfbox.cos.COSName.BLEED_BOX;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm18 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox19 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm18);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary20 = pDCheckBox19.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary21 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary20);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie pDActionMovie22 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie(cOSDictionary20);
        org.apache.pdfbox.pdmodel.fdf.FDFPageInfo fDFPageInfo23 = new org.apache.pdfbox.pdmodel.fdf.FDFPageInfo(cOSDictionary20);
        org.apache.pdfbox.cos.COSName cOSName24 = org.apache.pdfbox.cos.COSName.LEGAL_ATTESTATION;
        org.apache.pdfbox.cos.COSName cOSName25 = org.apache.pdfbox.cos.COSName.OVERLAY;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm26 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox27 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm26);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary28 = pDCheckBox27.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo pDMarkInfo29 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo(cOSDictionary28);
        cOSDictionary28.setInt("JavaScript", 10);
        org.apache.pdfbox.cos.COSName cOSName33 = org.apache.pdfbox.cos.COSName.TYPE3;
        org.apache.pdfbox.cos.COSName cOSName34 = org.apache.pdfbox.cos.COSName.TYPE1;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm35 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox36 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm35);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary37 = pDCheckBox36.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary38 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary37);
        org.apache.pdfbox.cos.COSDocument cOSDocument39 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey40 = null;
        org.apache.pdfbox.cos.COSObject cOSObject41 = cOSDocument39.getObjectFromPool(cOSObjectKey40);
        org.apache.pdfbox.cos.COSName cOSName42 = org.apache.pdfbox.cos.COSName.CL;
        org.apache.pdfbox.cos.COSObject cOSObject43 = cOSDocument39.getObjectByType(cOSName42);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm44 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox45 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm44);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary46 = pDCheckBox45.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary47 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary46);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine48 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary47);
        long long50 = cOSDictionary47.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed51 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary47);
        java.lang.String str54 = cOSDictionary47.getEmbeddedString("sc", "After");
        cOSDocument39.setTrailer(cOSDictionary47);
        org.apache.pdfbox.cos.COSName cOSName57 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.FILTER_VERISIGN_PPKVS;
        cOSDictionary47.setEmbeddedInt("Index", cOSName57, (int) 'a');
        org.apache.pdfbox.cos.COSName cOSName60 = org.apache.pdfbox.cos.COSName.SET_FF;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm61 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox62 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm61);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary63 = pDCheckBox62.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject pDTableAttributeObject64 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject(cOSDictionary63);
        org.apache.pdfbox.cos.COSName cOSName65 = org.apache.pdfbox.cos.COSName.ROWS;
        org.apache.pdfbox.cos.COSBase[] cOSBase_array66 = new org.apache.pdfbox.cos.COSBase[] { cOSDictionary7, cOSName17, cOSDictionary20, cOSName24, cOSName25, cOSDictionary28, cOSName33, cOSName34, cOSDictionary38, cOSDictionary47, cOSName60, cOSDictionary63, cOSName65 };
        java.util.ArrayList<org.apache.pdfbox.cos.COSBase> arraylist_cOSBase67 = new java.util.ArrayList<org.apache.pdfbox.cos.COSBase>();
        boolean b68 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase67, cOSBase_array66);
        drawObject3.process(operator4, (java.util.List<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase67);
        try {
            showTextLineAndSpace0.process(operator2, (java.util.List<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(operator2);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertNull(cOSBase11);
        org.junit.Assert.assertNull(calendar13);
        org.junit.Assert.assertNotNull(cOSName14);
        org.junit.Assert.assertNotNull(cOSName15);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertNotNull(cOSName17);
        org.junit.Assert.assertNotNull(cOSDictionary20);
        org.junit.Assert.assertNotNull(cOSName24);
        org.junit.Assert.assertNotNull(cOSName25);
        org.junit.Assert.assertNotNull(cOSDictionary28);
        org.junit.Assert.assertNotNull(cOSName33);
        org.junit.Assert.assertNotNull(cOSName34);
        org.junit.Assert.assertNotNull(cOSDictionary37);
        org.junit.Assert.assertNotNull(cOSObject41);
        org.junit.Assert.assertNotNull(cOSName42);
        org.junit.Assert.assertNull(cOSObject43);
        org.junit.Assert.assertNotNull(cOSDictionary46);
        org.junit.Assert.assertTrue(long50 == (-1L));
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(cOSName57);
        org.junit.Assert.assertNotNull(cOSName60);
        org.junit.Assert.assertNotNull(cOSDictionary63);
        org.junit.Assert.assertNotNull(cOSName65);
        org.junit.Assert.assertNotNull(cOSBase_array66);
        org.junit.Assert.assertTrue(b68 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test058");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.X_STEP;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test059");
        char[] char_array1 = org.apache.pdfbox.util.Hex.getCharsUTF16BE("Underline");
        org.junit.Assert.assertNotNull(char_array1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test060");
        org.apache.pdfbox.contentstream.operator.DrawObject drawObject0 = new org.apache.pdfbox.contentstream.operator.DrawObject();
        org.apache.pdfbox.text.PDFMarkedContentExtractor pDFMarkedContentExtractor1 = new org.apache.pdfbox.text.PDFMarkedContentExtractor();
        drawObject0.setContext((org.apache.pdfbox.contentstream.PDFStreamEngine) pDFMarkedContentExtractor1);
        org.apache.pdfbox.pdmodel.PDPage pDPage3 = pDFMarkedContentExtractor1.getCurrentPage();
        org.junit.Assert.assertNull(pDPage3);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test061");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed0 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test062");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject pDTableAttributeObject3 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget pDAnnotationWidget4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName5 = org.apache.pdfbox.cos.COSName.FORM;
        cOSDictionary2.setString(cOSName5, "J");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry pDAppearanceEntry8 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry((org.apache.pdfbox.cos.COSBase) cOSName5);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName5);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test063");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation4 = new org.apache.pdfbox.pdmodel.PDDocumentInformation(cOSDictionary3);
        java.lang.String str5 = pDDocumentInformation4.getAuthor();
        pDDocumentInformation4.setProducer("J");
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test064");
        org.apache.pdfbox.cos.COSString cOSString0 = null;
        java.util.Calendar calendar1 = org.apache.pdfbox.util.DateConverter.toCalendar(cOSString0);
        org.junit.Assert.assertNull(calendar1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test065");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup1 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar2 = null;
        pDAnnotationPopup1.setModifiedDate(calendar2);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup1.setRectangle(pDRectangle4);
        org.apache.pdfbox.pdmodel.PDPage pDPage6 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle4);
        pDPageTree0.add(pDPage6);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle8 = pDPage6.getArtBox();
        org.junit.Assert.assertNotNull(pDRectangle4);
        org.junit.Assert.assertNotNull(pDRectangle8);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test066");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        java.lang.String[] str_array3 = new java.lang.String[] { "Underline" };
        java.util.ArrayList<java.lang.String> arraylist_str4 = new java.util.ArrayList<java.lang.String>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str4, str_array3);
        pDCheckBox1.setExportValues((java.util.List<java.lang.String>) arraylist_str4);
        int i7 = pDCheckBox1.getFieldFlags();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm8 = pDCheckBox1.getAcroForm();
        org.junit.Assert.assertNotNull(str_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(pDAcroForm8);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test067");
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.PRINT_SCALING pRINT_SCALING0 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.PRINT_SCALING.AppDefault;
        org.junit.Assert.assertTrue("'" + pRINT_SCALING0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.PRINT_SCALING.AppDefault + "'", pRINT_SCALING0.equals(org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.PRINT_SCALING.AppDefault));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test068");
        float[] f_array6 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray8 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i9 = pDDeviceGray8.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor10 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array6, cOSName7, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray8);
        org.apache.pdfbox.cos.COSArray cOSArray11 = pDColor10.toCOSArray();
        org.apache.pdfbox.cos.COSName cOSName12 = org.apache.pdfbox.cos.COSName.RESOURCES;
        cOSArray11.add((org.apache.pdfbox.pdmodel.common.COSObjectable) cOSName12);
        org.apache.pdfbox.pdmodel.common.COSObjectable cOSObjectable15 = null;
        try {
            cOSArray11.set((int) ' ', cOSObjectable15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(f_array6);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(pDDeviceGray8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(cOSArray11);
        org.junit.Assert.assertNotNull(cOSName12);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test069");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        org.apache.pdfbox.util.Matrix matrix7 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray8 = matrix7.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix9 = matrix7.extractScaling();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm10 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox11 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary12 = pDCheckBox11.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary13 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary12);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine14 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary13);
        long long16 = cOSDictionary13.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed17 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary13);
        boolean b18 = matrix7.equals((java.lang.Object) cOSDictionary13);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp pDSeedValueTimeStamp19 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp(cOSDictionary13);
        org.apache.pdfbox.pdmodel.PDDocumentCatalog pDDocumentCatalog20 = new org.apache.pdfbox.pdmodel.PDDocumentCatalog(pDDocument0, cOSDictionary13);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight fDFAnnotationHighlight21 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight(cOSDictionary13);
        org.junit.Assert.assertNotNull(cOSArray8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(cOSDictionary12);
        org.junit.Assert.assertTrue(long16 == (-1L));
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test070");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        java.lang.String str2 = pDExportFormatAttributeObject1.toString();
        pDExportFormatAttributeObject1.setLineHeightAuto();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDFourColours pDFourColours4 = null;
        pDExportFormatAttributeObject1.setBorderColors(pDFourColours4);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDFourColours pDFourColours6 = null;
        pDExportFormatAttributeObject1.setBorderColors(pDFourColours6);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "O=Final" + "'", str2.equals("O=Final"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test071");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.LOCATION;
        cOSDictionary3.removeItem(cOSName4);
        org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font6 = null;
        org.apache.pdfbox.pdmodel.font.PDCIDFontType0 pDCIDFontType0_7 = new org.apache.pdfbox.pdmodel.font.PDCIDFontType0(cOSDictionary3, pDType0Font6);
        org.apache.fontbox.cff.CFFFont cFFFont8 = pDCIDFontType0_7.getCFFFont();
        org.apache.pdfbox.pdmodel.font.PDCIDSystemInfo pDCIDSystemInfo9 = pDCIDFontType0_7.getCIDSystemInfo();
        org.apache.pdfbox.util.Matrix matrix10 = pDCIDFontType0_7.getFontMatrix();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(cFFFont8);
        org.junit.Assert.assertNull(pDCIDSystemInfo9);
        org.junit.Assert.assertNotNull(matrix10);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test072");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.ART;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Art" + "'", str0.equals("Art"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test073");
        org.apache.pdfbox.pdmodel.font.FontFormat fontFormat0 = org.apache.pdfbox.pdmodel.font.FontFormat.PFB;
        org.junit.Assert.assertTrue("'" + fontFormat0 + "' != '" + org.apache.pdfbox.pdmodel.font.FontFormat.PFB + "'", fontFormat0.equals(org.apache.pdfbox.pdmodel.font.FontFormat.PFB));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test074");
        org.apache.pdfbox.pdmodel.graphics.state.RenderingMode renderingMode0 = org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.FILL_STROKE;
        org.junit.Assert.assertTrue("'" + renderingMode0 + "' != '" + org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.FILL_STROKE + "'", renderingMode0.equals(org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.FILL_STROKE));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test075");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.NONE;
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDDestination pDDestination1 = org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDDestination.create((org.apache.pdfbox.cos.COSBase) cOSName0);
        org.junit.Assert.assertNotNull(cOSName0);
        org.junit.Assert.assertNotNull(pDDestination1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test076");
        org.apache.pdfbox.pdmodel.graphics.state.RenderingIntent renderingIntent0 = org.apache.pdfbox.pdmodel.graphics.state.RenderingIntent.ABSOLUTE_COLORIMETRIC;
        org.junit.Assert.assertTrue("'" + renderingIntent0 + "' != '" + org.apache.pdfbox.pdmodel.graphics.state.RenderingIntent.ABSOLUTE_COLORIMETRIC + "'", renderingIntent0.equals(org.apache.pdfbox.pdmodel.graphics.state.RenderingIntent.ABSOLUTE_COLORIMETRIC));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test077");
        java.lang.String[] str_array11 = new java.lang.String[] { "TFoot", "", "Span", "SinglePage", "Shading", "ImportData", "Shading", "SinglePage", "RlTb", "R", "Underline" };
        java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<java.lang.String>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str12, str_array11);
        java.util.Spliterator<java.lang.String> spliterator_str14 = arraylist_str12.spliterator();
        java.util.stream.Stream<java.lang.String> stream_str15 = arraylist_str12.parallelStream();
        org.apache.pdfbox.util.QuickSort.sort((java.util.List<java.lang.String>) arraylist_str12);
        org.junit.Assert.assertNotNull(str_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(spliterator_str14);
        org.junit.Assert.assertNotNull(stream_str15);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test078");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.MEDIA_BOX;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test079");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        long long6 = cOSDictionary3.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed7 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFField fDFField8 = new org.apache.pdfbox.pdmodel.fdf.FDFField(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary9 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary();
        fDFField8.setAppearanceDictionary(pDAppearanceDictionary9);
        fDFField8.setPartialFieldName("270");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm13 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox14 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm13);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary15 = pDCheckBox14.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary16 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary15);
        org.apache.pdfbox.cos.COSName cOSName17 = org.apache.pdfbox.cos.COSName.LOCATION;
        cOSDictionary16.removeItem(cOSName17);
        org.apache.pdfbox.cos.COSName cOSName20 = org.apache.pdfbox.cos.COSName.CREATOR;
        java.lang.String str22 = cOSDictionary16.getEmbeddedString("Artifact", cOSName20, "Center");
        fDFField8.setValue((org.apache.pdfbox.cos.COSBase) cOSDictionary16);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject24 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject(cOSDictionary16);
        pDExportFormatAttributeObject24.setAllPaddings(8);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertNotNull(cOSDictionary15);
        org.junit.Assert.assertNotNull(cOSName17);
        org.junit.Assert.assertNotNull(cOSName20);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Center" + "'", str22.equals("Center"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test080");
        org.apache.pdfbox.pdmodel.interactive.measurement.PDNumberFormatDictionary pDNumberFormatDictionary0 = new org.apache.pdfbox.pdmodel.interactive.measurement.PDNumberFormatDictionary();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test081");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding5 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine6 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary7 = pDAnnotationLine6.getBorderStyle();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(pDBorderStyleDictionary7);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test082");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.LOCATION;
        cOSDictionary3.removeItem(cOSName4);
        org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font6 = null;
        org.apache.pdfbox.pdmodel.font.PDCIDFontType0 pDCIDFontType0_7 = new org.apache.pdfbox.pdmodel.font.PDCIDFontType0(cOSDictionary3, pDType0Font6);
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences pDViewerPreferences8 = new org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences(cOSDictionary3);
        int i11 = cOSDictionary3.getInt("TH", (int) 'a');
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertTrue(i11 == 97);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test083");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.P;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test084");
        float[] f_array6 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray8 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i9 = pDDeviceGray8.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor10 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array6, cOSName7, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray8);
        org.apache.pdfbox.cos.COSArray cOSArray11 = pDColor10.toCOSArray();
        boolean b12 = cOSArray11.isNeedToBeUpdated();
        org.junit.Assert.assertNotNull(f_array6);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(pDDeviceGray8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(cOSArray11);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test085");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary pDRectlinearMeasureDictionary1 = new org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary(cOSDictionary0);
        try {
            org.apache.pdfbox.pdmodel.interactive.measurement.PDNumberFormatDictionary[] pDNumberFormatDictionary_array2 = pDRectlinearMeasureDictionary1.getDistances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test086");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject0 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty1 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(pDUserAttributeObject0);
        java.lang.String str2 = pDUserProperty1.getName();
        try {
            pDUserProperty1.setName("BlockQuote");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test087");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CHAR_PROCS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test088");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.LOCATION;
        cOSDictionary3.removeItem(cOSName4);
        org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font6 = null;
        org.apache.pdfbox.pdmodel.font.PDCIDFontType0 pDCIDFontType0_7 = new org.apache.pdfbox.pdmodel.font.PDCIDFontType0(cOSDictionary3, pDType0Font6);
        boolean b8 = pDCIDFontType0_7.isDamaged();
        try {
            int i10 = pDCIDFontType0_7.codeToGID((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test089");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions signatureOptions0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions();
        int i1 = signatureOptions0.getPage();
        signatureOptions0.setPage(8);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties pDVisibleSigProperties4 = null;
        try {
            signatureOptions0.setVisualSignature(pDVisibleSigProperties4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test090");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar1 = null;
        pDAnnotationPopup0.setModifiedDate(calendar1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup0.setRectangle(pDRectangle3);
        pDRectangle3.setUpperRightX((float) 100);
        pDRectangle3.setLowerLeftX(0.0f);
        org.apache.pdfbox.cos.COSBase cOSBase9 = pDRectangle3.getCOSObject();
        org.junit.Assert.assertNotNull(pDRectangle3);
        org.junit.Assert.assertNotNull(cOSBase9);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test091");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDTextField pDTextField1 = new org.apache.pdfbox.pdmodel.interactive.form.PDTextField(pDAcroForm0);
        pDTextField1.setComb(false);
        pDTextField1.setRichTextValue("TD");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test092");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink pDAnnotationLink4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline5 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData pDActionImportData6 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData(cOSDictionary3);
        org.junit.Assert.assertNotNull(cOSDictionary2);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test093");
        org.apache.pdfbox.pdmodel.documentinterchange.prepress.PDBoxStyle pDBoxStyle0 = new org.apache.pdfbox.pdmodel.documentinterchange.prepress.PDBoxStyle();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test094");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        float f2 = pDExportFormatAttributeObject1.getBaselineShift();
        pDExportFormatAttributeObject1.setWidth(0);
        pDExportFormatAttributeObject1.setInlineAlign("TH");
        float f7 = pDExportFormatAttributeObject1.getTextDecorationThickness();
        org.junit.Assert.assertTrue(f2 == 0.0f);
        org.junit.Assert.assertTrue(f7 == (-1.0f));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test095");
        org.apache.pdfbox.cos.COSStream cOSStream0 = null;
        org.apache.pdfbox.pdmodel.common.PDStream pDStream1 = new org.apache.pdfbox.pdmodel.common.PDStream(cOSStream0);
        try {
            org.apache.pdfbox.cos.COSInputStream cOSInputStream2 = pDStream1.createInputStream();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test096");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.T_HEAD;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "THead" + "'", str0.equals("THead"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test097");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLink fDFAnnotationLink0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLink();
        fDFAnnotationLink0.setPrinted(false);
        fDFAnnotationLink0.setDate("Before");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test098");
        org.apache.pdfbox.text.PDFMarkedContentExtractor pDFMarkedContentExtractor0 = new org.apache.pdfbox.text.PDFMarkedContentExtractor();
        org.apache.pdfbox.util.Matrix matrix7 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray8 = matrix7.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix9 = matrix7.extractScaling();
        pDFMarkedContentExtractor0.setTextMatrix(matrix7);
        org.apache.pdfbox.cos.COSArray cOSArray11 = null;
        try {
            pDFMarkedContentExtractor0.setLineDashPattern(cOSArray11, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSArray8);
        org.junit.Assert.assertNotNull(matrix9);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test099");
        java.io.InputStream inputStream0 = null;
        int[] i_array3 = new int[] { 10, (short) 100 };
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream cOSFilterInputStream4 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream(inputStream0, i_array3);
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting6 = org.apache.pdfbox.io.MemoryUsageSetting.setupMixed((long) 10);
        boolean b7 = memoryUsageSetting6.useMainMemory();
        try {
            org.apache.pdfbox.pdmodel.PDDocument pDDocument8 = org.apache.pdfbox.pdmodel.PDDocument.load((java.io.InputStream) cOSFilterInputStream4, memoryUsageSetting6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(memoryUsageSetting6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test100");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.Revisions<org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject> revisions_pDPrintFieldAttributeObject0 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.Revisions<org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject>();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject pDPrintFieldAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject();
        java.lang.String str2 = pDPrintFieldAttributeObject1.toString();
        revisions_pDPrintFieldAttributeObject0.addObject(pDPrintFieldAttributeObject1, (int) (byte) 10);
        java.lang.String str5 = pDPrintFieldAttributeObject1.getAlternateName();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "O=PrintField" + "'", str2.equals("O=PrintField"));
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test101");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.PLACEMENT_BEFORE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Before" + "'", str0.equals("Before"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test102");
        org.apache.pdfbox.pdmodel.font.PDFont pDFont0 = org.apache.pdfbox.pdmodel.font.PDFontFactory.createDefaultFont();
        java.lang.String str1 = pDFont0.getType();
        org.junit.Assert.assertNotNull(pDFont0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Font" + "'", str1.equals("Font"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test103");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.common.PDPageLabelRange.STYLE_ROMAN_UPPER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "R" + "'", str0.equals("R"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test104");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        float f2 = pDExportFormatAttributeObject1.getBaselineShift();
        pDExportFormatAttributeObject1.setHeight(6);
        java.lang.String str5 = pDExportFormatAttributeObject1.getRubyPosition();
        org.junit.Assert.assertTrue(f2 == 0.0f);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Before" + "'", str5.equals("Before"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test105");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.STRUCT_PARENT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test106");
        org.apache.pdfbox.contentstream.operator.color.SetNonStrokingColor setNonStrokingColor0 = new org.apache.pdfbox.contentstream.operator.color.SetNonStrokingColor();
        org.apache.pdfbox.contentstream.operator.Operator operator2 = org.apache.pdfbox.contentstream.operator.Operator.getOperator("Final");
        org.apache.pdfbox.contentstream.operator.DrawObject drawObject3 = new org.apache.pdfbox.contentstream.operator.DrawObject();
        org.apache.pdfbox.contentstream.operator.Operator operator4 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm5 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox6 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm5);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = pDCheckBox6.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup8 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary7);
        java.lang.String[] str_array10 = new java.lang.String[] { "270" };
        org.apache.pdfbox.cos.COSBase cOSBase11 = cOSDictionary7.getDictionaryObject(str_array10);
        java.util.Calendar calendar13 = cOSDictionary7.getDate("180");
        org.apache.pdfbox.cos.COSName cOSName14 = org.apache.pdfbox.cos.COSName.SHADING_TYPE;
        org.apache.pdfbox.cos.COSName cOSName15 = org.apache.pdfbox.cos.COSName.TYPE1;
        int i16 = cOSDictionary7.getInt(cOSName14, cOSName15);
        org.apache.pdfbox.cos.COSName cOSName17 = org.apache.pdfbox.cos.COSName.BLEED_BOX;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm18 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox19 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm18);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary20 = pDCheckBox19.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary21 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary20);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie pDActionMovie22 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie(cOSDictionary20);
        org.apache.pdfbox.pdmodel.fdf.FDFPageInfo fDFPageInfo23 = new org.apache.pdfbox.pdmodel.fdf.FDFPageInfo(cOSDictionary20);
        org.apache.pdfbox.cos.COSName cOSName24 = org.apache.pdfbox.cos.COSName.LEGAL_ATTESTATION;
        org.apache.pdfbox.cos.COSName cOSName25 = org.apache.pdfbox.cos.COSName.OVERLAY;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm26 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox27 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm26);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary28 = pDCheckBox27.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo pDMarkInfo29 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo(cOSDictionary28);
        cOSDictionary28.setInt("JavaScript", 10);
        org.apache.pdfbox.cos.COSName cOSName33 = org.apache.pdfbox.cos.COSName.TYPE3;
        org.apache.pdfbox.cos.COSName cOSName34 = org.apache.pdfbox.cos.COSName.TYPE1;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm35 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox36 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm35);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary37 = pDCheckBox36.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary38 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary37);
        org.apache.pdfbox.cos.COSDocument cOSDocument39 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey40 = null;
        org.apache.pdfbox.cos.COSObject cOSObject41 = cOSDocument39.getObjectFromPool(cOSObjectKey40);
        org.apache.pdfbox.cos.COSName cOSName42 = org.apache.pdfbox.cos.COSName.CL;
        org.apache.pdfbox.cos.COSObject cOSObject43 = cOSDocument39.getObjectByType(cOSName42);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm44 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox45 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm44);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary46 = pDCheckBox45.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary47 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary46);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine48 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary47);
        long long50 = cOSDictionary47.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed51 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary47);
        java.lang.String str54 = cOSDictionary47.getEmbeddedString("sc", "After");
        cOSDocument39.setTrailer(cOSDictionary47);
        org.apache.pdfbox.cos.COSName cOSName57 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.FILTER_VERISIGN_PPKVS;
        cOSDictionary47.setEmbeddedInt("Index", cOSName57, (int) 'a');
        org.apache.pdfbox.cos.COSName cOSName60 = org.apache.pdfbox.cos.COSName.SET_FF;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm61 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox62 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm61);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary63 = pDCheckBox62.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject pDTableAttributeObject64 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject(cOSDictionary63);
        org.apache.pdfbox.cos.COSName cOSName65 = org.apache.pdfbox.cos.COSName.ROWS;
        org.apache.pdfbox.cos.COSBase[] cOSBase_array66 = new org.apache.pdfbox.cos.COSBase[] { cOSDictionary7, cOSName17, cOSDictionary20, cOSName24, cOSName25, cOSDictionary28, cOSName33, cOSName34, cOSDictionary38, cOSDictionary47, cOSName60, cOSDictionary63, cOSName65 };
        java.util.ArrayList<org.apache.pdfbox.cos.COSBase> arraylist_cOSBase67 = new java.util.ArrayList<org.apache.pdfbox.cos.COSBase>();
        boolean b68 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase67, cOSBase_array66);
        drawObject3.process(operator4, (java.util.List<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase67);
        try {
            setNonStrokingColor0.process(operator2, (java.util.List<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(operator2);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertNull(cOSBase11);
        org.junit.Assert.assertNull(calendar13);
        org.junit.Assert.assertNotNull(cOSName14);
        org.junit.Assert.assertNotNull(cOSName15);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertNotNull(cOSName17);
        org.junit.Assert.assertNotNull(cOSDictionary20);
        org.junit.Assert.assertNotNull(cOSName24);
        org.junit.Assert.assertNotNull(cOSName25);
        org.junit.Assert.assertNotNull(cOSDictionary28);
        org.junit.Assert.assertNotNull(cOSName33);
        org.junit.Assert.assertNotNull(cOSName34);
        org.junit.Assert.assertNotNull(cOSDictionary37);
        org.junit.Assert.assertNotNull(cOSObject41);
        org.junit.Assert.assertNotNull(cOSName42);
        org.junit.Assert.assertNull(cOSObject43);
        org.junit.Assert.assertNotNull(cOSDictionary46);
        org.junit.Assert.assertTrue(long50 == (-1L));
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(cOSName57);
        org.junit.Assert.assertNotNull(cOSName60);
        org.junit.Assert.assertNotNull(cOSDictionary63);
        org.junit.Assert.assertNotNull(cOSName65);
        org.junit.Assert.assertNotNull(cOSBase_array66);
        org.junit.Assert.assertTrue(b68 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test107");
        org.apache.pdfbox.cos.COSDocument cOSDocument0 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey1 = null;
        org.apache.pdfbox.cos.COSObject cOSObject2 = cOSDocument0.getObjectFromPool(cOSObjectKey1);
        org.apache.pdfbox.cos.COSName cOSName3 = org.apache.pdfbox.cos.COSName.CL;
        org.apache.pdfbox.cos.COSObject cOSObject4 = cOSDocument0.getObjectByType(cOSName3);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm5 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox6 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm5);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = pDCheckBox6.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary8 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary7);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine9 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary8);
        long long11 = cOSDictionary8.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed12 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary8);
        java.lang.String str15 = cOSDictionary8.getEmbeddedString("sc", "After");
        cOSDocument0.setTrailer(cOSDictionary8);
        org.apache.pdfbox.io.IOUtils.closeQuietly((java.io.Closeable) cOSDocument0);
        org.junit.Assert.assertNotNull(cOSObject2);
        org.junit.Assert.assertNotNull(cOSName3);
        org.junit.Assert.assertNull(cOSObject4);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertTrue(long11 == (-1L));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test108");
        org.apache.pdfbox.io.RandomAccessBuffer randomAccessBuffer0 = new org.apache.pdfbox.io.RandomAccessBuffer();
        org.apache.pdfbox.io.ScratchFile scratchFile1 = null;
        org.apache.pdfbox.pdfparser.PDFParser pDFParser2 = new org.apache.pdfbox.pdfparser.PDFParser((org.apache.pdfbox.io.RandomAccessRead) randomAccessBuffer0, scratchFile1);
        randomAccessBuffer0.seek((long) 1);
        byte[] byte_array5 = org.apache.pdfbox.pdfwriter.COSWriter.REFERENCE;
        int i8 = randomAccessBuffer0.read(byte_array5, (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertNotNull(byte_array5);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test109");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo pDMarkInfo3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo(cOSDictionary2);
        cOSDictionary2.setInt("JavaScript", 10);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo pDActionGoTo7 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageXYZDestination pDPageXYZDestination8 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageXYZDestination();
        pDPageXYZDestination8.setLeft(1);
        try {
            pDActionGoTo7.setDestination((org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDDestination) pDPageXYZDestination8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test110");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.A;
        org.apache.pdfbox.cos.COSObject cOSObject1 = new org.apache.pdfbox.cos.COSObject((org.apache.pdfbox.cos.COSBase) cOSName0);
        org.apache.pdfbox.cos.COSName cOSName2 = org.apache.pdfbox.cos.COSName.DS;
        org.apache.pdfbox.cos.COSBase cOSBase3 = cOSObject1.getDictionaryObject(cOSName2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.A;
        org.apache.pdfbox.cos.COSObject cOSObject5 = new org.apache.pdfbox.cos.COSObject((org.apache.pdfbox.cos.COSBase) cOSName4);
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.DS;
        org.apache.pdfbox.cos.COSBase cOSBase7 = cOSObject5.getDictionaryObject(cOSName6);
        org.apache.pdfbox.cos.COSBase cOSBase8 = cOSObject1.getDictionaryObject(cOSName6);
        org.junit.Assert.assertNotNull(cOSName0);
        org.junit.Assert.assertNotNull(cOSName2);
        org.junit.Assert.assertNull(cOSBase3);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNull(cOSBase7);
        org.junit.Assert.assertNull(cOSBase8);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test111");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDTextField pDTextField1 = new org.apache.pdfbox.pdmodel.interactive.form.PDTextField(pDAcroForm0);
        try {
            int i2 = pDTextField1.getQ();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test112");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.OUTLINES;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test113");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction1 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction(cOSDictionary0);
        org.junit.Assert.assertNull(pDAction1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test114");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.HELVETICA_BOLD_OBLIQUE;
        boolean b2 = pDType1Font0.hasGlyph((int) ' ');
        boolean b4 = pDType1Font0.hasGlyph("656E6473747265616D");
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test115");
        org.apache.pdfbox.multipdf.Overlay.Position position0 = org.apache.pdfbox.multipdf.Overlay.Position.BACKGROUND;
        org.junit.Assert.assertTrue("'" + position0 + "' != '" + org.apache.pdfbox.multipdf.Overlay.Position.BACKGROUND + "'", position0.equals(org.apache.pdfbox.multipdf.Overlay.Position.BACKGROUND));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test116");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDTextField pDTextField1 = new org.apache.pdfbox.pdmodel.interactive.form.PDTextField(pDAcroForm0);
        boolean b2 = pDTextField1.doNotSpellCheck();
        pDTextField1.setMaxLen((int) (byte) 1);
        boolean b5 = pDTextField1.doNotSpellCheck();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test117");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar1 = null;
        pDAnnotationPopup0.setModifiedDate(calendar1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup0.setRectangle(pDRectangle3);
        org.apache.pdfbox.pdmodel.PDPage pDPage5 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle3);
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDThreadBead[] pDThreadBead_array6 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDThreadBead[] {};
        java.util.ArrayList<org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDThreadBead> arraylist_pDThreadBead7 = new java.util.ArrayList<org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDThreadBead>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDThreadBead>) arraylist_pDThreadBead7, pDThreadBead_array6);
        pDPage5.setThreadBeads((java.util.List<org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDThreadBead>) arraylist_pDThreadBead7);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup10 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar11 = null;
        pDAnnotationPopup10.setModifiedDate(calendar11);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle13 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup10.setRectangle(pDRectangle13);
        org.apache.pdfbox.pdmodel.PDPage pDPage15 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle13);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream16 = pDPage15.getContentStreams();
        org.apache.pdfbox.cos.COSStream cOSStream17 = null;
        org.apache.pdfbox.pdmodel.common.PDStream pDStream18 = new org.apache.pdfbox.pdmodel.common.PDStream(cOSStream17);
        org.apache.pdfbox.pdmodel.common.PDStream[] pDStream_array19 = new org.apache.pdfbox.pdmodel.common.PDStream[] { pDStream18 };
        java.util.ArrayList<org.apache.pdfbox.pdmodel.common.PDStream> arraylist_pDStream20 = new java.util.ArrayList<org.apache.pdfbox.pdmodel.common.PDStream>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.pdmodel.common.PDStream>) arraylist_pDStream20, pDStream_array19);
        pDPage15.setContents((java.util.List<org.apache.pdfbox.pdmodel.common.PDStream>) arraylist_pDStream20);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup23 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar24 = null;
        pDAnnotationPopup23.setModifiedDate(calendar24);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle26 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup23.setRectangle(pDRectangle26);
        org.apache.pdfbox.pdmodel.PDPage pDPage28 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle26);
        pDPage15.setMediaBox(pDRectangle26);
        java.util.List<org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation> list_pDAnnotation30 = pDPage15.getAnnotations();
        pDPage5.setAnnotations(list_pDAnnotation30);
        org.junit.Assert.assertNotNull(pDRectangle3);
        org.junit.Assert.assertNotNull(pDThreadBead_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(pDRectangle13);
        org.junit.Assert.assertNotNull(iterator_pDStream16);
        org.junit.Assert.assertNotNull(pDStream_array19);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(pDRectangle26);
        org.junit.Assert.assertNotNull(list_pDAnnotation30);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test118");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        long long6 = cOSDictionary3.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed7 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary3);
        java.lang.String str8 = pDActionNamed7.getN();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test119");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuild pDPropBuild0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuild();
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuildDataDict pDPropBuildDataDict1 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuildDataDict();
        pDPropBuildDataDict1.setPreRelease(false);
        pDPropBuild0.setPDPropBuildPubSec(pDPropBuildDataDict1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test120");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine.LE_CLOSED_ARROW;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ClosedArrow" + "'", str0.equals("ClosedArrow"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test121");
        org.apache.pdfbox.contentstream.operator.state.SetLineMiterLimit setLineMiterLimit0 = new org.apache.pdfbox.contentstream.operator.state.SetLineMiterLimit();
        java.lang.String str1 = setLineMiterLimit0.getName();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M" + "'", str1.equals("M"));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test122");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ST;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test123");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.SYMBOL;
        org.apache.pdfbox.pdmodel.font.encoding.GlyphList glyphList2 = org.apache.pdfbox.pdmodel.font.encoding.GlyphList.getAdobeGlyphList();
        java.lang.String str3 = pDType1Font0.toUnicode(8, glyphList2);
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertNotNull(glyphList2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test124");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject pDTableAttributeObject3 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget pDAnnotationWidget4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceCharacteristicsDictionary pDAppearanceCharacteristicsDictionary5 = null;
        pDAnnotationWidget4.setAppearanceCharacteristics(pDAppearanceCharacteristicsDictionary5);
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction7 = pDAnnotationWidget4.getAction();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(pDAction7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test125");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions signatureOptions0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions();
        int i1 = signatureOptions0.getPage();
        signatureOptions0.setPreferredSignatureSize(2);
        org.junit.Assert.assertTrue(i1 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test126");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary pDRectlinearMeasureDictionary1 = new org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary(cOSDictionary0);
        try {
            pDRectlinearMeasureDictionary1.setScaleRatio("B*");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test127");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.Revisions<org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject> revisions_pDPrintFieldAttributeObject0 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.Revisions<org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject>();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject pDPrintFieldAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject();
        java.lang.String str2 = pDPrintFieldAttributeObject1.toString();
        revisions_pDPrintFieldAttributeObject0.addObject(pDPrintFieldAttributeObject1, (int) (byte) 10);
        int i5 = revisions_pDPrintFieldAttributeObject0.size();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "O=PrintField" + "'", str2.equals("O=PrintField"));
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test128");
        float[] f_array6 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray8 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i9 = pDDeviceGray8.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor10 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array6, cOSName7, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray8);
        org.apache.pdfbox.cos.COSArray cOSArray11 = pDColor10.toCOSArray();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm13 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox14 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm13);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary15 = pDCheckBox14.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary16 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary15);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine17 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary16);
        long long19 = cOSDictionary16.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed20 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary16);
        org.apache.pdfbox.pdmodel.fdf.FDFField fDFField21 = new org.apache.pdfbox.pdmodel.fdf.FDFField(cOSDictionary16);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary22 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary();
        fDFField21.setAppearanceDictionary(pDAppearanceDictionary22);
        fDFField21.setPartialFieldName("270");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm26 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox27 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm26);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary28 = pDCheckBox27.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary29 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary28);
        org.apache.pdfbox.cos.COSName cOSName30 = org.apache.pdfbox.cos.COSName.LOCATION;
        cOSDictionary29.removeItem(cOSName30);
        org.apache.pdfbox.cos.COSName cOSName33 = org.apache.pdfbox.cos.COSName.CREATOR;
        java.lang.String str35 = cOSDictionary29.getEmbeddedString("Artifact", cOSName33, "Center");
        fDFField21.setValue((org.apache.pdfbox.cos.COSBase) cOSDictionary29);
        cOSArray11.growToSize((int) (byte) 10, (org.apache.pdfbox.cos.COSBase) cOSDictionary29);
        boolean b38 = cOSArray11.isDirect();
        org.junit.Assert.assertNotNull(f_array6);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(pDDeviceGray8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(cOSArray11);
        org.junit.Assert.assertNotNull(cOSDictionary15);
        org.junit.Assert.assertTrue(long19 == (-1L));
        org.junit.Assert.assertNotNull(cOSDictionary28);
        org.junit.Assert.assertNotNull(cOSName30);
        org.junit.Assert.assertNotNull(cOSName33);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Center" + "'", str35.equals("Center"));
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test129");
        int i0 = org.apache.pdfbox.pdmodel.graphics.shading.PDShading.SHADING_TYPE4;
        org.junit.Assert.assertTrue(i0 == 4);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test130");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie pDActionMovie4 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie(cOSDictionary2);
        org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font5 = null;
        org.apache.fontbox.ttf.TrueTypeFont trueTypeFont6 = null;
        try {
            org.apache.pdfbox.pdmodel.font.PDCIDFontType2 pDCIDFontType2_7 = new org.apache.pdfbox.pdmodel.font.PDCIDFontType2(cOSDictionary2, pDType0Font5, trueTypeFont6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test131");
        org.apache.pdfbox.cos.COSDocument cOSDocument0 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey1 = null;
        org.apache.pdfbox.cos.COSObject cOSObject2 = cOSDocument0.getObjectFromPool(cOSObjectKey1);
        org.apache.pdfbox.cos.COSName cOSName3 = org.apache.pdfbox.cos.COSName.CL;
        org.apache.pdfbox.cos.COSObject cOSObject4 = cOSDocument0.getObjectByType(cOSName3);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm5 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox6 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm5);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = pDCheckBox6.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary8 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary7);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine9 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary8);
        long long11 = cOSDictionary8.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed12 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary8);
        java.lang.String str15 = cOSDictionary8.getEmbeddedString("sc", "After");
        cOSDocument0.setTrailer(cOSDictionary8);
        org.apache.pdfbox.cos.COSName cOSName18 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.FILTER_VERISIGN_PPKVS;
        cOSDictionary8.setEmbeddedInt("Index", cOSName18, (int) 'a');
        org.apache.pdfbox.pdmodel.interactive.measurement.PDMeasureDictionary pDMeasureDictionary21 = new org.apache.pdfbox.pdmodel.interactive.measurement.PDMeasureDictionary(cOSDictionary8);
        int i24 = cOSDictionary8.getEmbeddedInt("ClosedArrow", "Note");
        org.junit.Assert.assertNotNull(cOSObject2);
        org.junit.Assert.assertNotNull(cOSName3);
        org.junit.Assert.assertNull(cOSObject4);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertTrue(long11 == (-1L));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(cOSName18);
        org.junit.Assert.assertTrue(i24 == (-1));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test132");
        long long0 = org.apache.pdfbox.filter.LZWFilter.EOD;
        org.junit.Assert.assertTrue(long0 == 257L);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test133");
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode0 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode();
        java.lang.String str1 = pDJavascriptNameTreeNode0.getLowerLimit();
        org.apache.pdfbox.pdmodel.common.PDNameTreeNode<org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript> pdnametreenode_pDActionJavaScript2 = pDJavascriptNameTreeNode0.getParent();
        try {
            boolean b3 = pdnametreenode_pDActionJavaScript2.isRootNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(pdnametreenode_pDActionJavaScript2);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test134");
        org.apache.pdfbox.io.RandomAccessBuffer randomAccessBuffer0 = new org.apache.pdfbox.io.RandomAccessBuffer();
        org.apache.pdfbox.io.ScratchFile scratchFile1 = null;
        org.apache.pdfbox.pdfparser.PDFParser pDFParser2 = new org.apache.pdfbox.pdfparser.PDFParser((org.apache.pdfbox.io.RandomAccessRead) randomAccessBuffer0, scratchFile1);
        try {
            pDFParser2.parse();
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test135");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.MASK;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test136");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.RUN_LENGTH_DECODE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test137");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.BLACK_POINT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test138");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSound fDFAnnotationSound1 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSound(cOSDictionary0);
        try {
            java.lang.String str2 = fDFAnnotationSound1.getSubject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test139");
        org.apache.pdfbox.io.RandomAccessBuffer randomAccessBuffer0 = new org.apache.pdfbox.io.RandomAccessBuffer();
        org.apache.pdfbox.io.ScratchFile scratchFile1 = null;
        org.apache.pdfbox.pdfparser.PDFParser pDFParser2 = new org.apache.pdfbox.pdfparser.PDFParser((org.apache.pdfbox.io.RandomAccessRead) randomAccessBuffer0, scratchFile1);
        randomAccessBuffer0.seek((long) 1);
        randomAccessBuffer0.seek((long) (byte) 1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test140");
        java.io.OutputStream outputStream0 = null;
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream1 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream(outputStream0);
        byte[] byte_array2 = org.apache.pdfbox.pdfwriter.COSWriter.ENDSTREAM;
        java.lang.String str3 = org.apache.pdfbox.util.Hex.getString(byte_array2);
        try {
            cOSStandardOutputStream1.write(byte_array2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "656E6473747265616D" + "'", str3.equals("656E6473747265616D"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test141");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine.IT_LINE_ARROW;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "LineArrow" + "'", str0.equals("LineArrow"));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test142");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.OPM;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test143");
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle pDTransitionStyle0 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Cover;
        org.junit.Assert.assertTrue("'" + pDTransitionStyle0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Cover + "'", pDTransitionStyle0.equals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Cover));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test144");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary.STYLE_SOLID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "S" + "'", str0.equals("S"));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test145");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties pDOptionalContentProperties1 = new org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties(cOSDictionary0);
        try {
            boolean b3 = pDOptionalContentProperties1.isGroupEnabled("R");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test146");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType6 pDShadingType6_1 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType6(cOSDictionary0);
        org.apache.pdfbox.text.PDFMarkedContentExtractor pDFMarkedContentExtractor2 = new org.apache.pdfbox.text.PDFMarkedContentExtractor();
        org.apache.pdfbox.util.Matrix matrix9 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray10 = matrix9.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix11 = matrix9.extractScaling();
        pDFMarkedContentExtractor2.setTextMatrix(matrix9);
        matrix9.scale((float) (byte) 0, 10.0f);
        org.apache.pdfbox.util.Matrix matrix16 = matrix9.clone();
        java.awt.Paint paint17 = pDShadingType6_1.toPaint(matrix9);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup18 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar19 = null;
        pDAnnotationPopup18.setModifiedDate(calendar19);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle21 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup18.setRectangle(pDRectangle21);
        org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState pDGraphicsState23 = new org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState(pDRectangle21);
        try {
            pDShadingType6_1.setBBox(pDRectangle21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSArray10);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(pDRectangle21);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test147");
        org.apache.pdfbox.cos.COSDocument cOSDocument0 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSName cOSName1 = org.apache.pdfbox.cos.COSName.JBIG2_GLOBALS;
        org.apache.pdfbox.cos.COSObject cOSObject2 = cOSDocument0.getObjectByType(cOSName1);
        cOSDocument0.close();
        cOSDocument0.setDecrypted();
        org.junit.Assert.assertNotNull(cOSName1);
        org.junit.Assert.assertNull(cOSObject2);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test148");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.LOCATION;
        cOSDictionary3.removeItem(cOSName4);
        org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font6 = null;
        org.apache.pdfbox.pdmodel.font.PDCIDFontType0 pDCIDFontType0_7 = new org.apache.pdfbox.pdmodel.font.PDCIDFontType0(cOSDictionary3, pDType0Font6);
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences pDViewerPreferences8 = new org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences(cOSDictionary3);
        java.lang.String str9 = pDViewerPreferences8.getPrintScaling();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "AppDefault" + "'", str9.equals("AppDefault"));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test149");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable1 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument0);
        java.awt.Graphics graphics2 = null;
        java.awt.print.PageFormat pageFormat3 = null;
        try {
            int i5 = pDFPrintable1.print(graphics2, pageFormat3, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test150");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight fDFAnnotationHighlight0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test151");
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission1 = new org.apache.pdfbox.pdmodel.encryption.AccessPermission((int) (byte) 100);
        boolean b2 = accessPermission1.canExtractContent();
        boolean b3 = accessPermission1.canExtractForAccessibility();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test152");
        int i0 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions.DEFAULT_SIGNATURE_SIZE;
        org.junit.Assert.assertTrue(i0 == 9472);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test153");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.PUB_SEC;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test154");
        org.apache.pdfbox.cos.COSStream cOSStream0 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction1 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction((org.apache.pdfbox.cos.COSDictionary) cOSStream0);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream2 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream0);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm3 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox4 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm3);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary5 = pDCheckBox4.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary6 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary5);
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.XREF;
        org.apache.pdfbox.cos.COSName cOSName8 = cOSDictionary6.getCOSName(cOSName7);
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.ROWS;
        cOSDictionary6.setEmbeddedInt("Underline", cOSName10, (int) (byte) 100);
        org.apache.pdfbox.cos.COSName cOSName13 = cOSStream0.getCOSName(cOSName10);
        org.junit.Assert.assertNull(pDAction1);
        org.junit.Assert.assertNotNull(cOSDictionary5);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNull(cOSName8);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertNull(cOSName13);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test155");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDRadioButton pDRadioButton1 = new org.apache.pdfbox.pdmodel.interactive.form.PDRadioButton(pDAcroForm0);
        pDRadioButton1.setPushButton(false);
        pDRadioButton1.setAlternateFieldName("H1");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test156");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuildDataDict pDPropBuildDataDict0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuildDataDict();
        pDPropBuildDataDict0.setPreRelease(false);
        boolean b3 = pDPropBuildDataDict0.getNonEFontNoWarn();
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test157");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary pDRectlinearMeasureDictionary1 = new org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary(cOSDictionary0);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText2 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        float[] f_array9 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray11 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i12 = pDDeviceGray11.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor13 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array9, cOSName10, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray11);
        fDFAnnotationFreeText2.setCallout(f_array9);
        try {
            pDRectlinearMeasureDictionary1.setCoordSystemOrigin(f_array9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(f_array9);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertNotNull(pDDeviceGray11);
        org.junit.Assert.assertTrue(i12 == 1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test158");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DEVICEN;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test159");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        pDExportFormatAttributeObject1.setGlyphOrientationVertical("THead");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test160");
        float[] f_array6 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray8 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i9 = pDDeviceGray8.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor10 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array6, cOSName7, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray8);
        org.apache.pdfbox.cos.COSArray cOSArray11 = pDColor10.toCOSArray();
        org.apache.pdfbox.cos.COSName cOSName12 = org.apache.pdfbox.cos.COSName.RESOURCES;
        cOSArray11.add((org.apache.pdfbox.pdmodel.common.COSObjectable) cOSName12);
        cOSArray11.growToSize((-1));
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm16 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox17 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm16);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary18 = pDCheckBox17.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary19 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary18);
        boolean b20 = cOSArray11.remove((org.apache.pdfbox.cos.COSBase) cOSDictionary19);
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences pDViewerPreferences21 = new org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences(cOSDictionary19);
        boolean b22 = pDViewerPreferences21.displayDocTitle();
        java.lang.String str23 = pDViewerPreferences21.getViewClip();
        pDViewerPreferences21.setFitWindow(false);
        org.junit.Assert.assertNotNull(f_array6);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(pDDeviceGray8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(cOSArray11);
        org.junit.Assert.assertNotNull(cOSName12);
        org.junit.Assert.assertNotNull(cOSDictionary18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "CropBox" + "'", str23.equals("CropBox"));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test161");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding5 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline6 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary3);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_7 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary3);
        org.apache.pdfbox.util.Matrix matrix14 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray15 = matrix14.toCOSArray();
        pDShadingType3_7.setDomain(cOSArray15);
        float[] f_array23 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName24 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray25 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i26 = pDDeviceGray25.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor27 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array23, cOSName24, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray25);
        org.apache.pdfbox.cos.COSArray cOSArray28 = pDColor27.toCOSArray();
        org.apache.pdfbox.cos.COSName cOSName29 = org.apache.pdfbox.cos.COSName.RESOURCES;
        cOSArray28.add((org.apache.pdfbox.pdmodel.common.COSObjectable) cOSName29);
        pDShadingType3_7.setDomain(cOSArray28);
        org.apache.pdfbox.pdmodel.common.PDRange pDRange32 = new org.apache.pdfbox.pdmodel.common.PDRange(cOSArray28);
        java.lang.String str33 = pDRange32.toString();
        pDRange32.setMax((float) 97);
        org.apache.pdfbox.cos.COSArray cOSArray36 = pDRange32.getCOSArray();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSArray15);
        org.junit.Assert.assertNotNull(f_array23);
        org.junit.Assert.assertNotNull(cOSName24);
        org.junit.Assert.assertNotNull(pDDeviceGray25);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertNotNull(cOSArray28);
        org.junit.Assert.assertNotNull(cOSName29);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "PDRange{100.0, -1.0}" + "'", str33.equals("PDRange{100.0, -1.0}"));
        org.junit.Assert.assertNotNull(cOSArray36);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test162");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.TYPE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test163");
        org.apache.pdfbox.io.RandomAccessBuffer randomAccessBuffer0 = new org.apache.pdfbox.io.RandomAccessBuffer();
        boolean b1 = randomAccessBuffer0.isClosed();
        randomAccessBuffer0.clear();
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test164");
        org.apache.pdfbox.text.PDFMarkedContentExtractor pDFMarkedContentExtractor0 = new org.apache.pdfbox.text.PDFMarkedContentExtractor();
        org.apache.pdfbox.text.PDFMarkedContentExtractor pDFMarkedContentExtractor1 = new org.apache.pdfbox.text.PDFMarkedContentExtractor();
        org.apache.pdfbox.util.Matrix matrix8 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray9 = matrix8.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix10 = matrix8.extractScaling();
        pDFMarkedContentExtractor1.setTextMatrix(matrix8);
        matrix8.scale((float) (byte) 0, 10.0f);
        org.apache.pdfbox.util.Matrix matrix15 = matrix8.clone();
        pDFMarkedContentExtractor0.setTextMatrix(matrix15);
        float f17 = matrix15.getScaleY();
        org.junit.Assert.assertNotNull(cOSArray9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(matrix15);
        org.junit.Assert.assertTrue(f17 == 0.0f);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test165");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.A;
        org.apache.pdfbox.cos.COSObject cOSObject1 = new org.apache.pdfbox.cos.COSObject((org.apache.pdfbox.cos.COSBase) cOSName0);
        long long2 = cOSObject1.getObjectNumber();
        org.junit.Assert.assertNotNull(cOSName0);
        org.junit.Assert.assertTrue(long2 == 0L);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test166");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        long long6 = cOSDictionary3.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed7 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFField fDFField8 = new org.apache.pdfbox.pdmodel.fdf.FDFField(cOSDictionary3);
        java.lang.Object obj9 = fDFField8.getValue();
        fDFField8.setFieldFlags((int) '4');
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test167");
        org.apache.pdfbox.cos.COSDocument cOSDocument0 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey1 = null;
        org.apache.pdfbox.cos.COSObject cOSObject2 = cOSDocument0.getObjectFromPool(cOSObjectKey1);
        org.apache.pdfbox.cos.COSName cOSName3 = org.apache.pdfbox.cos.COSName.CL;
        org.apache.pdfbox.cos.COSObject cOSObject4 = cOSDocument0.getObjectByType(cOSName3);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm5 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox6 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm5);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = pDCheckBox6.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary8 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary7);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine9 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary8);
        long long11 = cOSDictionary8.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed12 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary8);
        java.lang.String str15 = cOSDictionary8.getEmbeddedString("sc", "After");
        cOSDocument0.setTrailer(cOSDictionary8);
        boolean b17 = cOSDocument0.isXRefStream();
        float f18 = cOSDocument0.getVersion();
        try {
            org.apache.pdfbox.cos.COSObject cOSObject19 = cOSDocument0.getCatalog();
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(cOSObject2);
        org.junit.Assert.assertNotNull(cOSName3);
        org.junit.Assert.assertNull(cOSObject4);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertTrue(long11 == (-1L));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(f18 == 1.4f);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test168");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FLATE_DECODE_ABBREVIATION;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test169");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        long long6 = cOSDictionary3.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed7 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFField fDFField8 = new org.apache.pdfbox.pdmodel.fdf.FDFField(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary9 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary();
        fDFField8.setAppearanceDictionary(pDAppearanceDictionary9);
        fDFField8.setPartialFieldName("270");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm13 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox14 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm13);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary15 = pDCheckBox14.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary16 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary15);
        org.apache.pdfbox.cos.COSName cOSName17 = org.apache.pdfbox.cos.COSName.LOCATION;
        cOSDictionary16.removeItem(cOSName17);
        org.apache.pdfbox.cos.COSName cOSName20 = org.apache.pdfbox.cos.COSName.CREATOR;
        java.lang.String str22 = cOSDictionary16.getEmbeddedString("Artifact", cOSName20, "Center");
        fDFField8.setValue((org.apache.pdfbox.cos.COSBase) cOSDictionary16);
        org.apache.pdfbox.pdmodel.interactive.measurement.PDViewportDictionary pDViewportDictionary24 = new org.apache.pdfbox.pdmodel.interactive.measurement.PDViewportDictionary(cOSDictionary16);
        org.apache.pdfbox.pdmodel.interactive.measurement.PDMeasureDictionary pDMeasureDictionary25 = pDViewportDictionary24.getMeasure();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertNotNull(cOSDictionary15);
        org.junit.Assert.assertNotNull(cOSName17);
        org.junit.Assert.assertNotNull(cOSName20);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Center" + "'", str22.equals("Center"));
        org.junit.Assert.assertNull(pDMeasureDictionary25);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test170");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding5 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline6 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary3);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_7 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary3);
        org.apache.pdfbox.util.Matrix matrix14 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray15 = matrix14.toCOSArray();
        pDShadingType3_7.setDomain(cOSArray15);
        float[] f_array23 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName24 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray25 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i26 = pDDeviceGray25.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor27 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array23, cOSName24, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray25);
        org.apache.pdfbox.cos.COSArray cOSArray28 = pDColor27.toCOSArray();
        org.apache.pdfbox.cos.COSName cOSName29 = org.apache.pdfbox.cos.COSName.RESOURCES;
        cOSArray28.add((org.apache.pdfbox.pdmodel.common.COSObjectable) cOSName29);
        pDShadingType3_7.setDomain(cOSArray28);
        org.apache.pdfbox.pdmodel.common.PDRange pDRange32 = new org.apache.pdfbox.pdmodel.common.PDRange(cOSArray28);
        float f33 = pDRange32.getMin();
        pDRange32.setMax((float) (byte) 1);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSArray15);
        org.junit.Assert.assertNotNull(f_array23);
        org.junit.Assert.assertNotNull(cOSName24);
        org.junit.Assert.assertNotNull(pDDeviceGray25);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertNotNull(cOSArray28);
        org.junit.Assert.assertNotNull(cOSName29);
        org.junit.Assert.assertTrue(f33 == 100.0f);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test171");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSBase cOSBase5 = cOSDictionary2.getDictionaryObject("PushPin");
        org.apache.pdfbox.pdmodel.encryption.PDEncryption pDEncryption6 = new org.apache.pdfbox.pdmodel.encryption.PDEncryption(cOSDictionary2);
        cOSDictionary2.setEmbeddedString("D", "LowerAlpha", "");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLink fDFAnnotationLink11 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLink(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(cOSBase5);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test172");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        long long6 = cOSDictionary3.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed7 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFField fDFField8 = new org.apache.pdfbox.pdmodel.fdf.FDFField(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary9 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary();
        fDFField8.setAppearanceDictionary(pDAppearanceDictionary9);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry pDAppearanceEntry11 = pDAppearanceDictionary9.getNormalAppearance();
        boolean b12 = pDAppearanceEntry11.isStream();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertNotNull(pDAppearanceEntry11);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test173");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        float[] f_array7 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName8 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray9 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i10 = pDDeviceGray9.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor11 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array7, cOSName8, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray9);
        fDFAnnotationFreeText0.setCallout(f_array7);
        java.lang.String str13 = fDFAnnotationFreeText0.getLineEndingStyle();
        java.lang.String str14 = fDFAnnotationFreeText0.getDefaultAppearance();
        float f15 = fDFAnnotationFreeText0.getOpacity();
        java.lang.String str16 = fDFAnnotationFreeText0.getRotation();
        org.junit.Assert.assertNotNull(f_array7);
        org.junit.Assert.assertNotNull(cOSName8);
        org.junit.Assert.assertNotNull(pDDeviceGray9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(f15 == 1.0f);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test174");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        float f2 = pDExportFormatAttributeObject1.getBaselineShift();
        java.lang.Object obj3 = pDExportFormatAttributeObject1.getTPadding();
        pDExportFormatAttributeObject1.setSpaceAfter(7);
        pDExportFormatAttributeObject1.setLineHeight(792.0f);
        org.junit.Assert.assertTrue(f2 == 0.0f);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0f + "'", obj3.equals(0.0f));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test175");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding5 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary3);
        boolean b7 = dictionaryEncoding5.contains("Form");
        boolean b9 = dictionaryEncoding5.contains("A");
        boolean b11 = dictionaryEncoding5.contains("2.1.0-SNAPSHOT");
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test176");
        org.apache.pdfbox.pdmodel.font.encoding.GlyphList glyphList0 = org.apache.pdfbox.pdmodel.font.encoding.GlyphList.getZapfDingbats();
        java.lang.String str2 = glyphList0.sequenceToName("O=Final");
        org.junit.Assert.assertNotNull(glyphList0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ".notdef" + "'", str2.equals(".notdef"));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test177");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.HELVETICA_BOLD_OBLIQUE;
        boolean b2 = pDType1Font0.hasGlyph((int) ' ');
        org.apache.pdfbox.util.Matrix matrix3 = pDType1Font0.getFontMatrix();
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(matrix3);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test178");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        java.lang.String str2 = pDExportFormatAttributeObject1.toString();
        pDExportFormatAttributeObject1.setLineHeightAuto();
        java.lang.String str4 = pDExportFormatAttributeObject1.getTextAlign();
        java.lang.String[] str_array5 = pDExportFormatAttributeObject1.getHeaders();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "O=Final" + "'", str2.equals("O=Final"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Start" + "'", str4.equals("Start"));
        org.junit.Assert.assertNull(str_array5);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test179");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding5 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline6 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary3);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_7 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary3);
        org.apache.pdfbox.util.Matrix matrix14 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray15 = matrix14.toCOSArray();
        pDShadingType3_7.setDomain(cOSArray15);
        java.lang.String str18 = cOSArray15.getString(1);
        org.apache.pdfbox.contentstream.operator.DrawObject drawObject19 = new org.apache.pdfbox.contentstream.operator.DrawObject();
        org.apache.pdfbox.contentstream.operator.Operator operator20 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm21 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox22 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm21);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary23 = pDCheckBox22.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup24 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary23);
        java.lang.String[] str_array26 = new java.lang.String[] { "270" };
        org.apache.pdfbox.cos.COSBase cOSBase27 = cOSDictionary23.getDictionaryObject(str_array26);
        java.util.Calendar calendar29 = cOSDictionary23.getDate("180");
        org.apache.pdfbox.cos.COSName cOSName30 = org.apache.pdfbox.cos.COSName.SHADING_TYPE;
        org.apache.pdfbox.cos.COSName cOSName31 = org.apache.pdfbox.cos.COSName.TYPE1;
        int i32 = cOSDictionary23.getInt(cOSName30, cOSName31);
        org.apache.pdfbox.cos.COSName cOSName33 = org.apache.pdfbox.cos.COSName.BLEED_BOX;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm34 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox35 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm34);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary36 = pDCheckBox35.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary37 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary36);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie pDActionMovie38 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie(cOSDictionary36);
        org.apache.pdfbox.pdmodel.fdf.FDFPageInfo fDFPageInfo39 = new org.apache.pdfbox.pdmodel.fdf.FDFPageInfo(cOSDictionary36);
        org.apache.pdfbox.cos.COSName cOSName40 = org.apache.pdfbox.cos.COSName.LEGAL_ATTESTATION;
        org.apache.pdfbox.cos.COSName cOSName41 = org.apache.pdfbox.cos.COSName.OVERLAY;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm42 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox43 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm42);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary44 = pDCheckBox43.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo pDMarkInfo45 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo(cOSDictionary44);
        cOSDictionary44.setInt("JavaScript", 10);
        org.apache.pdfbox.cos.COSName cOSName49 = org.apache.pdfbox.cos.COSName.TYPE3;
        org.apache.pdfbox.cos.COSName cOSName50 = org.apache.pdfbox.cos.COSName.TYPE1;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm51 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox52 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm51);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary53 = pDCheckBox52.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary54 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary53);
        org.apache.pdfbox.cos.COSDocument cOSDocument55 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey56 = null;
        org.apache.pdfbox.cos.COSObject cOSObject57 = cOSDocument55.getObjectFromPool(cOSObjectKey56);
        org.apache.pdfbox.cos.COSName cOSName58 = org.apache.pdfbox.cos.COSName.CL;
        org.apache.pdfbox.cos.COSObject cOSObject59 = cOSDocument55.getObjectByType(cOSName58);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm60 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox61 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm60);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary62 = pDCheckBox61.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary63 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary62);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine64 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary63);
        long long66 = cOSDictionary63.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed67 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary63);
        java.lang.String str70 = cOSDictionary63.getEmbeddedString("sc", "After");
        cOSDocument55.setTrailer(cOSDictionary63);
        org.apache.pdfbox.cos.COSName cOSName73 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.FILTER_VERISIGN_PPKVS;
        cOSDictionary63.setEmbeddedInt("Index", cOSName73, (int) 'a');
        org.apache.pdfbox.cos.COSName cOSName76 = org.apache.pdfbox.cos.COSName.SET_FF;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm77 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox78 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm77);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary79 = pDCheckBox78.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject pDTableAttributeObject80 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject(cOSDictionary79);
        org.apache.pdfbox.cos.COSName cOSName81 = org.apache.pdfbox.cos.COSName.ROWS;
        org.apache.pdfbox.cos.COSBase[] cOSBase_array82 = new org.apache.pdfbox.cos.COSBase[] { cOSDictionary23, cOSName33, cOSDictionary36, cOSName40, cOSName41, cOSDictionary44, cOSName49, cOSName50, cOSDictionary54, cOSDictionary63, cOSName76, cOSDictionary79, cOSName81 };
        java.util.ArrayList<org.apache.pdfbox.cos.COSBase> arraylist_cOSBase83 = new java.util.ArrayList<org.apache.pdfbox.cos.COSBase>();
        boolean b84 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase83, cOSBase_array82);
        drawObject19.process(operator20, (java.util.List<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase83);
        cOSArray15.addAll((java.util.Collection<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase83);
        try {
            java.util.List<java.lang.String> list_str87 = org.apache.pdfbox.pdmodel.common.COSArrayList.convertCOSNameCOSArrayToList(cOSArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSArray15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(cOSDictionary23);
        org.junit.Assert.assertNotNull(str_array26);
        org.junit.Assert.assertNull(cOSBase27);
        org.junit.Assert.assertNull(calendar29);
        org.junit.Assert.assertNotNull(cOSName30);
        org.junit.Assert.assertNotNull(cOSName31);
        org.junit.Assert.assertTrue(i32 == (-1));
        org.junit.Assert.assertNotNull(cOSName33);
        org.junit.Assert.assertNotNull(cOSDictionary36);
        org.junit.Assert.assertNotNull(cOSName40);
        org.junit.Assert.assertNotNull(cOSName41);
        org.junit.Assert.assertNotNull(cOSDictionary44);
        org.junit.Assert.assertNotNull(cOSName49);
        org.junit.Assert.assertNotNull(cOSName50);
        org.junit.Assert.assertNotNull(cOSDictionary53);
        org.junit.Assert.assertNotNull(cOSObject57);
        org.junit.Assert.assertNotNull(cOSName58);
        org.junit.Assert.assertNull(cOSObject59);
        org.junit.Assert.assertNotNull(cOSDictionary62);
        org.junit.Assert.assertTrue(long66 == (-1L));
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(cOSName73);
        org.junit.Assert.assertNotNull(cOSName76);
        org.junit.Assert.assertNotNull(cOSDictionary79);
        org.junit.Assert.assertNotNull(cOSName81);
        org.junit.Assert.assertNotNull(cOSBase_array82);
        org.junit.Assert.assertTrue(b84 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test180");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        org.apache.pdfbox.printing.Orientation orientation1 = null;
        org.apache.pdfbox.printing.PDFPageable pDFPageable2 = new org.apache.pdfbox.printing.PDFPageable(pDDocument0, orientation1);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test181");
        float[] f_array6 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray8 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i9 = pDDeviceGray8.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor10 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array6, cOSName7, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray8);
        org.apache.pdfbox.cos.COSArray cOSArray11 = pDColor10.toCOSArray();
        org.apache.pdfbox.cos.COSName cOSName12 = org.apache.pdfbox.cos.COSName.RESOURCES;
        cOSArray11.add((org.apache.pdfbox.pdmodel.common.COSObjectable) cOSName12);
        cOSArray11.growToSize((-1));
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm16 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox17 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm16);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary18 = pDCheckBox17.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary19 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary18);
        boolean b20 = cOSArray11.remove((org.apache.pdfbox.cos.COSBase) cOSDictionary19);
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences pDViewerPreferences21 = new org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences(cOSDictionary19);
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition22 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary19);
        org.junit.Assert.assertNotNull(f_array6);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(pDDeviceGray8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(cOSArray11);
        org.junit.Assert.assertNotNull(cOSName12);
        org.junit.Assert.assertNotNull(cOSDictionary18);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test182");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.INKLIST;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test183");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.PROCESS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test184");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.Revisions<org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject> revisions_pDPrintFieldAttributeObject0 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.Revisions<org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject>();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject pDPrintFieldAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject();
        java.lang.String str2 = pDPrintFieldAttributeObject1.toString();
        revisions_pDPrintFieldAttributeObject0.addObject(pDPrintFieldAttributeObject1, (int) (byte) 10);
        try {
            org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject pDPrintFieldAttributeObject6 = revisions_pDPrintFieldAttributeObject0.getObject(40);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "O=PrintField" + "'", str2.equals("O=PrintField"));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test185");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationInk fDFAnnotationInk0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationInk();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle1 = null;
        fDFAnnotationInk0.setRectangle(pDRectangle1);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary3 = null;
        fDFAnnotationInk0.setBorderStyle(pDBorderStyleDictionary3);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test186");
        java.nio.charset.Charset charset0 = org.apache.pdfbox.util.Charsets.UTF_8;
        org.junit.Assert.assertNotNull(charset0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test187");
        org.apache.pdfbox.io.RandomAccessBuffer randomAccessBuffer0 = new org.apache.pdfbox.io.RandomAccessBuffer();
        org.apache.pdfbox.io.ScratchFile scratchFile1 = null;
        org.apache.pdfbox.pdfparser.PDFParser pDFParser2 = new org.apache.pdfbox.pdfparser.PDFParser((org.apache.pdfbox.io.RandomAccessRead) randomAccessBuffer0, scratchFile1);
        randomAccessBuffer0.seek((long) 1);
        int i5 = randomAccessBuffer0.read();
        org.junit.Assert.assertTrue(i5 == (-1));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test188");
        org.apache.pdfbox.contentstream.operator.graphics.CurveToReplicateInitialPoint curveToReplicateInitialPoint0 = new org.apache.pdfbox.contentstream.operator.graphics.CurveToReplicateInitialPoint();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test189");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DUR;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test190");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.BITS_PER_COORDINATE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test191");
        org.apache.pdfbox.util.Matrix matrix6 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray7 = matrix6.toCOSArray();
        float f8 = matrix6.getScaleX();
        java.lang.String[] str_array20 = new java.lang.String[] { "TFoot", "", "Span", "SinglePage", "Shading", "ImportData", "Shading", "SinglePage", "RlTb", "R", "Underline" };
        java.util.ArrayList<java.lang.String> arraylist_str21 = new java.util.ArrayList<java.lang.String>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str21, str_array20);
        java.util.Spliterator<java.lang.String> spliterator_str23 = arraylist_str21.spliterator();
        java.util.stream.Stream<java.lang.String> stream_str24 = arraylist_str21.parallelStream();
        boolean b25 = matrix6.equals((java.lang.Object) stream_str24);
        org.junit.Assert.assertNotNull(cOSArray7);
        org.junit.Assert.assertTrue(f8 == 1.0f);
        org.junit.Assert.assertNotNull(str_array20);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(spliterator_str23);
        org.junit.Assert.assertNotNull(stream_str24);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test192");
        java.lang.String[] str_array60 = new java.lang.String[] { "LowerRoman", "Groove", ".notdef", "Note", "Underline", "ForComment", "Popup", "Underline", "COSName{LegalAttestation}", "RlTb", "n", "Pattern", "Double", "Middle", "RB", "org.apache.pdfbox.pdfparser.nonSequentialPDFParser.eofLookupRange", "Dashed", "PrintField", "Thread", "O=Final", "COSInt{1}", ".notdef", "hi!", "O=Final", "Adobe.PubSec", "H", "Courier-BoldOblique", "OEB-1.00", "Before", "Adobe.PubSec", "Inset", "open", "Index", "Circle", "BT", "LowerAlpha", "LowerRoman", "Line", "Note", "Center", "Tag", "Shading", "Center", "I", "n", "Font", "Dashed", "J", "Groove", "Artifact", "JavaScript", "Stamp", "hi!", "Middle", "Art", "Viewport", "Font", "ClosedArrow", "Figure", "Square" };
        java.util.ArrayList<java.lang.String> arraylist_str61 = new java.util.ArrayList<java.lang.String>();
        boolean b62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str61, str_array60);
        java.util.Comparator<java.lang.String> comparator_str63 = null;
        try {
            org.apache.pdfbox.util.QuickSort.sort((java.util.List<java.lang.String>) arraylist_str61, comparator_str63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array60);
        org.junit.Assert.assertTrue(b62 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test193");
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.DUPLEX dUPLEX0 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.DUPLEX.DuplexFlipShortEdge;
        org.junit.Assert.assertTrue("'" + dUPLEX0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.DUPLEX.DuplexFlipShortEdge + "'", dUPLEX0.equals(org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.DUPLEX.DuplexFlipShortEdge));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test194");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderEffectDictionary.STYLE_CLOUDY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "C" + "'", str0.equals("C"));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test195");
        org.apache.pdfbox.filter.LZWFilter lZWFilter0 = new org.apache.pdfbox.filter.LZWFilter();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test196");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie pDActionMovie0 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test197");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.FILTER_ADOBE_PPKLITE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test198");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar1 = null;
        pDAnnotationPopup0.setModifiedDate(calendar1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup0.setRectangle(pDRectangle3);
        org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState pDGraphicsState5 = new org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState(pDRectangle3);
        int i6 = pDGraphicsState5.getLineCap();
        pDGraphicsState5.setAlphaSource(false);
        org.junit.Assert.assertNotNull(pDRectangle3);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test199");
        java.io.OutputStream outputStream0 = null;
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream1 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream(outputStream0);
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream3 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream(outputStream0, (long) 2);
        org.apache.pdfbox.pdfwriter.ContentStreamWriter contentStreamWriter4 = new org.apache.pdfbox.pdfwriter.ContentStreamWriter(outputStream0);
        org.apache.pdfbox.contentstream.operator.Operator operator6 = org.apache.pdfbox.contentstream.operator.Operator.getOperator("L");
        try {
            contentStreamWriter4.writeToken(operator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(operator6);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test200");
        java.io.InputStream inputStream0 = null;
        int[] i_array3 = new int[] { 10, (short) 100 };
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream cOSFilterInputStream4 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream(inputStream0, i_array3);
        try {
            boolean b5 = cOSFilterInputStream4.markSupported();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test201");
        org.apache.pdfbox.cos.COSDocument cOSDocument0 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSName cOSName1 = org.apache.pdfbox.cos.COSName.JBIG2_GLOBALS;
        org.apache.pdfbox.cos.COSObject cOSObject2 = cOSDocument0.getObjectByType(cOSName1);
        cOSDocument0.close();
        float f4 = cOSDocument0.getVersion();
        org.junit.Assert.assertNotNull(cOSName1);
        org.junit.Assert.assertNull(cOSObject2);
        org.junit.Assert.assertTrue(f4 == 1.4f);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test202");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        long long6 = cOSDictionary3.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed7 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFField fDFField8 = new org.apache.pdfbox.pdmodel.fdf.FDFField(cOSDictionary3);
        java.lang.Object obj9 = fDFField8.getValue();
        fDFField8.setWidgetFieldFlags((int) '#');
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test203");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CICI_SIGNIT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test204");
        byte[] byte_array0 = org.apache.pdfbox.pdfwriter.COSWriter.ARRAY_CLOSE;
        org.junit.Assert.assertNotNull(byte_array0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test205");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ON;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test206");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationFileAttachment.ATTACHMENT_NAME_PAPERCLIP;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Paperclip" + "'", str0.equals("Paperclip"));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test207");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationRubberStamp.NAME_NOT_APPROVED;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "NotApproved" + "'", str0.equals("NotApproved"));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test208");
        org.apache.pdfbox.io.RandomAccessRead randomAccessRead0 = null;
        org.apache.pdfbox.io.RandomAccessInputStream randomAccessInputStream1 = new org.apache.pdfbox.io.RandomAccessInputStream(randomAccessRead0);
        boolean b2 = randomAccessInputStream1.markSupported();
        try {
            int i3 = randomAccessInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test209");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.LOCATION;
        cOSDictionary3.removeItem(cOSName4);
        org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font6 = null;
        org.apache.pdfbox.pdmodel.font.PDCIDFontType0 pDCIDFontType0_7 = new org.apache.pdfbox.pdmodel.font.PDCIDFontType0(cOSDictionary3, pDType0Font6);
        org.apache.fontbox.cff.CFFFont cFFFont8 = pDCIDFontType0_7.getCFFFont();
        org.apache.pdfbox.pdmodel.font.PDCIDSystemInfo pDCIDSystemInfo9 = pDCIDFontType0_7.getCIDSystemInfo();
        org.apache.fontbox.cff.Type2CharString type2CharString11 = pDCIDFontType0_7.getType2CharString(97);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(cFFFont8);
        org.junit.Assert.assertNull(pDCIDSystemInfo9);
        org.junit.Assert.assertNull(type2CharString11);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test210");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.RGB;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test211");
        org.apache.pdfbox.contentstream.operator.text.ShowTextAdjusted showTextAdjusted0 = new org.apache.pdfbox.contentstream.operator.text.ShowTextAdjusted();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test212");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar1 = null;
        pDAnnotationPopup0.setModifiedDate(calendar1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup0.setRectangle(pDRectangle3);
        org.apache.pdfbox.pdmodel.PDPage pDPage5 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle3);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream6 = pDPage5.getContentStreams();
        org.apache.pdfbox.cos.COSStream cOSStream7 = null;
        org.apache.pdfbox.pdmodel.common.PDStream pDStream8 = new org.apache.pdfbox.pdmodel.common.PDStream(cOSStream7);
        org.apache.pdfbox.pdmodel.common.PDStream[] pDStream_array9 = new org.apache.pdfbox.pdmodel.common.PDStream[] { pDStream8 };
        java.util.ArrayList<org.apache.pdfbox.pdmodel.common.PDStream> arraylist_pDStream10 = new java.util.ArrayList<org.apache.pdfbox.pdmodel.common.PDStream>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.pdmodel.common.PDStream>) arraylist_pDStream10, pDStream_array9);
        pDPage5.setContents((java.util.List<org.apache.pdfbox.pdmodel.common.PDStream>) arraylist_pDStream10);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup13 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar14 = null;
        pDAnnotationPopup13.setModifiedDate(calendar14);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle16 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup13.setRectangle(pDRectangle16);
        org.apache.pdfbox.pdmodel.PDPage pDPage18 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle16);
        pDPage5.setMediaBox(pDRectangle16);
        float f20 = pDRectangle16.getUpperRightY();
        boolean b23 = pDRectangle16.contains(250.0f, (-1.0f));
        org.junit.Assert.assertNotNull(pDRectangle3);
        org.junit.Assert.assertNotNull(iterator_pDStream6);
        org.junit.Assert.assertNotNull(pDStream_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(pDRectangle16);
        org.junit.Assert.assertTrue(f20 == 792.0f);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test213");
        float[] f_array6 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray8 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i9 = pDDeviceGray8.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor10 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array6, cOSName7, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray8);
        org.apache.pdfbox.cos.COSArray cOSArray11 = pDColor10.toCOSArray();
        org.apache.pdfbox.cos.COSName cOSName12 = org.apache.pdfbox.cos.COSName.RESOURCES;
        cOSArray11.add((org.apache.pdfbox.pdmodel.common.COSObjectable) cOSName12);
        cOSArray11.growToSize((-1));
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm16 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox17 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm16);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary18 = pDCheckBox17.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary19 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary18);
        boolean b20 = cOSArray11.remove((org.apache.pdfbox.cos.COSBase) cOSDictionary19);
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences pDViewerPreferences21 = new org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences(cOSDictionary19);
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY bOUNDARY22 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY.MediaBox;
        pDViewerPreferences21.setViewArea(bOUNDARY22);
        org.junit.Assert.assertNotNull(f_array6);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(pDDeviceGray8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(cOSArray11);
        org.junit.Assert.assertNotNull(cOSName12);
        org.junit.Assert.assertNotNull(cOSDictionary18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + bOUNDARY22 + "' != '" + org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY.MediaBox + "'", bOUNDARY22.equals(org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY.MediaBox));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test214");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        float f5 = pDAnnotationLine4.getCaptionHorizontalOffset();
        java.util.Calendar calendar6 = null;
        pDAnnotationLine4.setModifiedDate(calendar6);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(f5 == 0.0f);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test215");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.measurement.PDNumberFormatDictionary.FRACTIONAL_DISPLAY_DECIMAL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "D" + "'", str0.equals("D"));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test216");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ADOBE_PPKLITE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test217");
        org.w3c.dom.Element element0 = null;
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStrikeOut fDFAnnotationStrikeOut1 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStrikeOut(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test218");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup.SUB_TYPE_HIGHLIGHT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Highlight" + "'", str0.equals("Highlight"));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test219");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.TI;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test220");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar1 = null;
        pDAnnotationPopup0.setModifiedDate(calendar1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup0.setRectangle(pDRectangle3);
        org.apache.pdfbox.pdmodel.PDPage pDPage5 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle3);
        org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState pDGraphicsState6 = new org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState(pDRectangle3);
        pDGraphicsState6.setOverprintMode((double) 100.0f);
        org.junit.Assert.assertNotNull(pDRectangle3);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test221");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        java.lang.String str2 = pDExportFormatAttributeObject1.toString();
        int i3 = pDExportFormatAttributeObject1.getColSpan();
        pDExportFormatAttributeObject1.setEndIndent((int) (short) 10);
        pDExportFormatAttributeObject1.setHeightAuto();
        pDExportFormatAttributeObject1.setInlineAlign("TrimBox");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "O=Final" + "'", str2.equals("O=Final"));
        org.junit.Assert.assertTrue(i3 == 1);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test222");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.LOCATION;
        cOSDictionary3.removeItem(cOSName4);
        org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font6 = null;
        org.apache.pdfbox.pdmodel.font.PDCIDFontType0 pDCIDFontType0_7 = new org.apache.pdfbox.pdmodel.font.PDCIDFontType0(cOSDictionary3, pDType0Font6);
        org.apache.fontbox.FontBoxFont fontBoxFont8 = pDCIDFontType0_7.getFontBoxFont();
        org.apache.pdfbox.pdmodel.font.PDCIDSystemInfo pDCIDSystemInfo9 = pDCIDFontType0_7.getCIDSystemInfo();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNotNull(fontBoxFont8);
        org.junit.Assert.assertNull(pDCIDSystemInfo9);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test223");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.MAC_EXPERT_ENCODING;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test224");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquare fDFAnnotationSquare4 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquare(cOSDictionary3);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType7 pDShadingType7_5 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType7(cOSDictionary3);
        org.junit.Assert.assertNotNull(cOSDictionary2);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test225");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        org.apache.pdfbox.util.Matrix matrix7 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray8 = matrix7.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix9 = matrix7.extractScaling();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm10 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox11 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary12 = pDCheckBox11.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary13 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary12);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine14 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary13);
        long long16 = cOSDictionary13.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed17 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary13);
        boolean b18 = matrix7.equals((java.lang.Object) cOSDictionary13);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp pDSeedValueTimeStamp19 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp(cOSDictionary13);
        org.apache.pdfbox.pdmodel.PDDocumentCatalog pDDocumentCatalog20 = new org.apache.pdfbox.pdmodel.PDDocumentCatalog(pDDocument0, cOSDictionary13);
        org.apache.pdfbox.pdmodel.common.PDDestinationOrAction pDDestinationOrAction21 = pDDocumentCatalog20.getOpenAction();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary22 = pDDocumentCatalog20.getCOSObject();
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata23 = pDDocumentCatalog20.getMetadata();
        try {
            org.apache.pdfbox.pdmodel.PDPageTree pDPageTree24 = pDDocumentCatalog20.getPages();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(cOSArray8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(cOSDictionary12);
        org.junit.Assert.assertTrue(long16 == (-1L));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(pDDestinationOrAction21);
        org.junit.Assert.assertNotNull(cOSDictionary22);
        org.junit.Assert.assertNull(pDMetadata23);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test226");
        org.apache.pdfbox.contentstream.operator.color.SetNonStrokingDeviceGrayColor setNonStrokingDeviceGrayColor0 = new org.apache.pdfbox.contentstream.operator.color.SetNonStrokingDeviceGrayColor();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test227");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_1 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary0);
        java.lang.String str2 = pDShadingType1_1.getType();
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCaret fDFAnnotationCaret3 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCaret();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar5 = null;
        pDAnnotationPopup4.setModifiedDate(calendar5);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle7 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup4.setRectangle(pDRectangle7);
        org.apache.pdfbox.pdmodel.PDPage pDPage9 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle7);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream10 = pDPage9.getContentStreams();
        org.apache.pdfbox.cos.COSStream cOSStream11 = null;
        org.apache.pdfbox.pdmodel.common.PDStream pDStream12 = new org.apache.pdfbox.pdmodel.common.PDStream(cOSStream11);
        org.apache.pdfbox.pdmodel.common.PDStream[] pDStream_array13 = new org.apache.pdfbox.pdmodel.common.PDStream[] { pDStream12 };
        java.util.ArrayList<org.apache.pdfbox.pdmodel.common.PDStream> arraylist_pDStream14 = new java.util.ArrayList<org.apache.pdfbox.pdmodel.common.PDStream>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.pdmodel.common.PDStream>) arraylist_pDStream14, pDStream_array13);
        pDPage9.setContents((java.util.List<org.apache.pdfbox.pdmodel.common.PDStream>) arraylist_pDStream14);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup17 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar18 = null;
        pDAnnotationPopup17.setModifiedDate(calendar18);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle20 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup17.setRectangle(pDRectangle20);
        org.apache.pdfbox.pdmodel.PDPage pDPage22 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle20);
        pDPage9.setMediaBox(pDRectangle20);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle24 = pDPage9.getCropBox();
        fDFAnnotationCaret3.setFringe(pDRectangle24);
        try {
            pDShadingType1_1.setBBox(pDRectangle24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Shading" + "'", str2.equals("Shading"));
        org.junit.Assert.assertNotNull(pDRectangle7);
        org.junit.Assert.assertNotNull(iterator_pDStream10);
        org.junit.Assert.assertNotNull(pDStream_array13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(pDRectangle20);
        org.junit.Assert.assertNotNull(pDRectangle24);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test228");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType6 pDShadingType6_1 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType6(cOSDictionary0);
        try {
            org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle2 = pDShadingType6_1.getBBox();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test229");
        java.io.BufferedInputStream bufferedInputStream0 = null;
        try {
            org.apache.pdfbox.util.filetypedetector.FileType fileType1 = org.apache.pdfbox.util.filetypedetector.FileTypeDetector.detectFileType(bufferedInputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test230");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        java.awt.image.BufferedImage bufferedImage1 = null;
        try {
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject pDImageXObject2 = org.apache.pdfbox.pdmodel.graphics.image.JPEGFactory.createFromImage(pDDocument0, bufferedImage1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test231");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        long long6 = cOSDictionary3.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed7 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFField fDFField8 = new org.apache.pdfbox.pdmodel.fdf.FDFField(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary9 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary();
        fDFField8.setAppearanceDictionary(pDAppearanceDictionary9);
        fDFField8.setPartialFieldName("270");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm13 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox14 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm13);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary15 = pDCheckBox14.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary16 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary15);
        org.apache.pdfbox.cos.COSName cOSName17 = org.apache.pdfbox.cos.COSName.LOCATION;
        cOSDictionary16.removeItem(cOSName17);
        org.apache.pdfbox.cos.COSName cOSName20 = org.apache.pdfbox.cos.COSName.CREATOR;
        java.lang.String str22 = cOSDictionary16.getEmbeddedString("Artifact", cOSName20, "Center");
        fDFField8.setValue((org.apache.pdfbox.cos.COSBase) cOSDictionary16);
        fDFField8.setClearWidgetFieldFlags(40);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertNotNull(cOSDictionary15);
        org.junit.Assert.assertNotNull(cOSName17);
        org.junit.Assert.assertNotNull(cOSName20);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Center" + "'", str22.equals("Center"));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test232");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationRubberStamp.NAME_AS_IS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AsIs" + "'", str0.equals("AsIs"));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test233");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        java.io.File file1 = null;
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font2 = org.apache.pdfbox.pdmodel.font.PDType1Font.TIMES_BOLD;
        org.apache.pdfbox.pdmodel.font.encoding.Encoding encoding3 = pDType1Font2.getEncoding();
        try {
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont pDTrueTypeFont4 = org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.load(pDDocument0, file1, encoding3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pDType1Font2);
        org.junit.Assert.assertNotNull(encoding3);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test234");
        org.apache.pdfbox.util.Matrix matrix6 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray7 = matrix6.toCOSArray();
        try {
            org.apache.pdfbox.cos.COSBase cOSBase9 = cOSArray7.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(cOSArray7);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test235");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        try {
            org.apache.pdfbox.multipdf.PageExtractor pageExtractor3 = new org.apache.pdfbox.multipdf.PageExtractor(pDDocument0, 1, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test236");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FUNCTION_TYPE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test237");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_90_DEGREES;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "90" + "'", str0.equals("90"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test238");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FUNCTION;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test239");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        long long6 = cOSDictionary3.getLong("Note");
        org.apache.pdfbox.pdmodel.encryption.PDEncryption pDEncryption7 = new org.apache.pdfbox.pdmodel.encryption.PDEncryption(cOSDictionary3);
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission10 = null;
        org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy standardProtectionPolicy11 = new org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy("270", "PushPin", accessPermission10);
        java.lang.String str12 = standardProtectionPolicy11.getOwnerPassword();
        org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler standardSecurityHandler13 = new org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler(standardProtectionPolicy11);
        pDEncryption7.setSecurityHandler((org.apache.pdfbox.pdmodel.encryption.SecurityHandler) standardSecurityHandler13);
        standardSecurityHandler13.setAES(true);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument17 = null;
        try {
            standardSecurityHandler13.prepareDocumentForEncryption(pDDocument17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "270" + "'", str12.equals("270"));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test240");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        long long6 = cOSDictionary3.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed7 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFField fDFField8 = new org.apache.pdfbox.pdmodel.fdf.FDFField(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary9 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary();
        fDFField8.setAppearanceDictionary(pDAppearanceDictionary9);
        java.lang.String str11 = fDFField8.getRichText();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test241");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine.IT_LINE_DIMENSION;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "LineDimension" + "'", str0.equals("LineDimension"));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test242");
        org.apache.pdfbox.pdmodel.PageLayout pageLayout0 = org.apache.pdfbox.pdmodel.PageLayout.TWO_PAGE_LEFT;
        org.junit.Assert.assertTrue("'" + pageLayout0 + "' != '" + org.apache.pdfbox.pdmodel.PageLayout.TWO_PAGE_LEFT + "'", pageLayout0.equals(org.apache.pdfbox.pdmodel.PageLayout.TWO_PAGE_LEFT));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test243");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary2);
        java.lang.String[] str_array5 = new java.lang.String[] { "270" };
        org.apache.pdfbox.cos.COSBase cOSBase6 = cOSDictionary2.getDictionaryObject(str_array5);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionResetForm pDActionResetForm7 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionResetForm(cOSDictionary2);
        org.apache.pdfbox.cos.COSArray cOSArray8 = pDActionResetForm7.getFields();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(str_array5);
        org.junit.Assert.assertNull(cOSBase6);
        org.junit.Assert.assertNull(cOSArray8);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test244");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.EF;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test245");
        java.io.InputStream inputStream0 = null;
        int[] i_array3 = new int[] { 10, (short) 100 };
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream cOSFilterInputStream4 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream(inputStream0, i_array3);
        try {
            long long6 = cOSFilterInputStream4.skip((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test246");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding5 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline6 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary3);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_7 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary3);
        org.apache.pdfbox.util.Matrix matrix14 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray15 = matrix14.toCOSArray();
        pDShadingType3_7.setDomain(cOSArray15);
        float[] f_array23 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName24 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray25 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i26 = pDDeviceGray25.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor27 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array23, cOSName24, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray25);
        org.apache.pdfbox.cos.COSArray cOSArray28 = pDColor27.toCOSArray();
        org.apache.pdfbox.cos.COSName cOSName29 = org.apache.pdfbox.cos.COSName.RESOURCES;
        cOSArray28.add((org.apache.pdfbox.pdmodel.common.COSObjectable) cOSName29);
        pDShadingType3_7.setDomain(cOSArray28);
        org.apache.pdfbox.pdmodel.common.PDRange pDRange32 = new org.apache.pdfbox.pdmodel.common.PDRange(cOSArray28);
        float f33 = pDRange32.getMin();
        org.apache.pdfbox.cos.COSArray cOSArray34 = pDRange32.getCOSArray();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSArray15);
        org.junit.Assert.assertNotNull(f_array23);
        org.junit.Assert.assertNotNull(cOSName24);
        org.junit.Assert.assertNotNull(pDDeviceGray25);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertNotNull(cOSArray28);
        org.junit.Assert.assertNotNull(cOSName29);
        org.junit.Assert.assertTrue(f33 == 100.0f);
        org.junit.Assert.assertNotNull(cOSArray34);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test247");
        org.apache.pdfbox.contentstream.operator.markedcontent.EndMarkedContentSequence endMarkedContentSequence0 = new org.apache.pdfbox.contentstream.operator.markedcontent.EndMarkedContentSequence();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test248");
        org.apache.pdfbox.contentstream.operator.text.SetFontAndSize setFontAndSize0 = new org.apache.pdfbox.contentstream.operator.text.SetFontAndSize();
        java.lang.String str1 = setFontAndSize0.getName();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Tf" + "'", str1.equals("Tf"));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test249");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.METADATA;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test250");
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting0 = org.apache.pdfbox.io.MemoryUsageSetting.setupMainMemoryOnly();
        org.junit.Assert.assertNotNull(memoryUsageSetting0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test251");
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting1 = org.apache.pdfbox.io.MemoryUsageSetting.setupMainMemoryOnly(0L);
        org.junit.Assert.assertNotNull(memoryUsageSetting1);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test252");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        long long6 = cOSDictionary3.getLong("Note");
        org.apache.pdfbox.pdmodel.encryption.PDEncryption pDEncryption7 = new org.apache.pdfbox.pdmodel.encryption.PDEncryption(cOSDictionary3);
        byte[] byte_array8 = pDEncryption7.getOwnerKey();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertNull(byte_array8);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test253");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.LOCATION;
        cOSDictionary3.removeItem(cOSName4);
        org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font6 = null;
        org.apache.pdfbox.pdmodel.font.PDCIDFontType0 pDCIDFontType0_7 = new org.apache.pdfbox.pdmodel.font.PDCIDFontType0(cOSDictionary3, pDType0Font6);
        org.apache.fontbox.cff.CFFFont cFFFont8 = pDCIDFontType0_7.getCFFFont();
        org.apache.pdfbox.pdmodel.font.PDCIDSystemInfo pDCIDSystemInfo9 = pDCIDFontType0_7.getCIDSystemInfo();
        float f10 = pDCIDFontType0_7.getAverageFontWidth();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(cFFFont8);
        org.junit.Assert.assertNull(pDCIDSystemInfo9);
        org.junit.Assert.assertTrue(f10 == 500.0f);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test254");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        pDExportFormatAttributeObject1.setTextIndent((float) 100);
        pDExportFormatAttributeObject1.setGlyphOrientationVertical("JavaScript");
        int i6 = pDExportFormatAttributeObject1.getColSpan();
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test255");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.A;
        org.apache.pdfbox.cos.COSObject cOSObject1 = new org.apache.pdfbox.cos.COSObject((org.apache.pdfbox.cos.COSBase) cOSName0);
        org.apache.pdfbox.cos.COSName cOSName2 = org.apache.pdfbox.cos.COSName.ROWS;
        org.apache.pdfbox.cos.COSBase cOSBase3 = cOSObject1.getItem(cOSName2);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm4 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox5 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm4);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary6 = pDCheckBox5.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary6);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine8 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary7);
        long long10 = cOSDictionary7.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed11 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary7);
        cOSObject1.setObject((org.apache.pdfbox.cos.COSBase) cOSDictionary7);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStrikeOut fDFAnnotationStrikeOut13 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStrikeOut(cOSDictionary7);
        java.lang.String str16 = cOSDictionary7.getNameAsString("Annot", "O=Final");
        org.junit.Assert.assertNotNull(cOSName0);
        org.junit.Assert.assertNotNull(cOSName2);
        org.junit.Assert.assertNull(cOSBase3);
        org.junit.Assert.assertNotNull(cOSDictionary6);
        org.junit.Assert.assertTrue(long10 == (-1L));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "O=Final" + "'", str16.equals("O=Final"));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test256");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCircle fDFAnnotationCircle0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCircle();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle1 = fDFAnnotationCircle0.getFringe();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup2 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar3 = null;
        pDAnnotationPopup2.setModifiedDate(calendar3);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle5 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup2.setRectangle(pDRectangle5);
        org.apache.pdfbox.pdmodel.PDPage pDPage7 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle5);
        fDFAnnotationCircle0.setFringe(pDRectangle5);
        org.junit.Assert.assertNull(pDRectangle1);
        org.junit.Assert.assertNotNull(pDRectangle5);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test257");
        java.io.InputStream inputStream0 = null;
        int[] i_array3 = new int[] { 10, (short) 100 };
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream cOSFilterInputStream4 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream(inputStream0, i_array3);
        java.io.InputStream inputStream6 = null;
        int[] i_array9 = new int[] { 10, (short) 100 };
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream cOSFilterInputStream10 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream(inputStream6, i_array9);
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting12 = null;
        try {
            org.apache.pdfbox.pdmodel.PDDocument pDDocument13 = org.apache.pdfbox.pdmodel.PDDocument.load(inputStream0, "Font", inputStream6, "TBody", memoryUsageSetting12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(i_array9);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test258");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream5 = pDAnnotationLine4.getNormalAppearanceStream();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(pDAppearanceStream5);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test259");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DIFFERENCE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test260");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine fDFAnnotationLine5 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent6 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDExternalDataDictionary pDExternalDataDictionary7 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDExternalDataDictionary(cOSDictionary3);
        cOSDictionary3.setBoolean("R", true);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm11 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox12 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm11);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary13 = pDCheckBox12.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary14 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary13);
        org.apache.pdfbox.cos.COSName cOSName15 = org.apache.pdfbox.cos.COSName.XREF;
        org.apache.pdfbox.cos.COSName cOSName16 = cOSDictionary14.getCOSName(cOSName15);
        cOSDictionary3.removeItem(cOSName16);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSDictionary13);
        org.junit.Assert.assertNotNull(cOSName15);
        org.junit.Assert.assertNull(cOSName16);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test261");
        org.apache.pdfbox.contentstream.operator.text.ShowText showText0 = new org.apache.pdfbox.contentstream.operator.text.ShowText();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test262");
        org.apache.pdfbox.pdmodel.encryption.StandardDecryptionMaterial standardDecryptionMaterial1 = new org.apache.pdfbox.pdmodel.encryption.StandardDecryptionMaterial("COSName{LegalAttestation}");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test263");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCaret fDFAnnotationCaret0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCaret();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup1 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar2 = null;
        pDAnnotationPopup1.setModifiedDate(calendar2);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup1.setRectangle(pDRectangle4);
        org.apache.pdfbox.pdmodel.PDPage pDPage6 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle4);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream7 = pDPage6.getContentStreams();
        org.apache.pdfbox.cos.COSStream cOSStream8 = null;
        org.apache.pdfbox.pdmodel.common.PDStream pDStream9 = new org.apache.pdfbox.pdmodel.common.PDStream(cOSStream8);
        org.apache.pdfbox.pdmodel.common.PDStream[] pDStream_array10 = new org.apache.pdfbox.pdmodel.common.PDStream[] { pDStream9 };
        java.util.ArrayList<org.apache.pdfbox.pdmodel.common.PDStream> arraylist_pDStream11 = new java.util.ArrayList<org.apache.pdfbox.pdmodel.common.PDStream>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.pdmodel.common.PDStream>) arraylist_pDStream11, pDStream_array10);
        pDPage6.setContents((java.util.List<org.apache.pdfbox.pdmodel.common.PDStream>) arraylist_pDStream11);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup14 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar15 = null;
        pDAnnotationPopup14.setModifiedDate(calendar15);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle17 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup14.setRectangle(pDRectangle17);
        org.apache.pdfbox.pdmodel.PDPage pDPage19 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle17);
        pDPage6.setMediaBox(pDRectangle17);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle21 = pDPage6.getCropBox();
        fDFAnnotationCaret0.setFringe(pDRectangle21);
        java.lang.String str23 = pDRectangle21.toString();
        org.junit.Assert.assertNotNull(pDRectangle4);
        org.junit.Assert.assertNotNull(iterator_pDStream7);
        org.junit.Assert.assertNotNull(pDStream_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(pDRectangle17);
        org.junit.Assert.assertNotNull(pDRectangle21);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[0.0,0.0,100.0,792.0]" + "'", str23.equals("[0.0,0.0,100.0,792.0]"));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test264");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding5 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline6 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary3);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_7 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary3);
        org.apache.pdfbox.util.Matrix matrix14 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray15 = matrix14.toCOSArray();
        pDShadingType3_7.setDomain(cOSArray15);
        float[] f_array23 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName24 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray25 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i26 = pDDeviceGray25.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor27 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array23, cOSName24, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray25);
        org.apache.pdfbox.cos.COSArray cOSArray28 = pDColor27.toCOSArray();
        org.apache.pdfbox.cos.COSName cOSName29 = org.apache.pdfbox.cos.COSName.RESOURCES;
        cOSArray28.add((org.apache.pdfbox.pdmodel.common.COSObjectable) cOSName29);
        pDShadingType3_7.setDomain(cOSArray28);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm32 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox33 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm32);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary34 = pDCheckBox33.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary35 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary34);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine36 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary35);
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding37 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary35);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline38 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary35);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_39 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary35);
        org.apache.pdfbox.util.Matrix matrix46 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray47 = matrix46.toCOSArray();
        pDShadingType3_39.setDomain(cOSArray47);
        java.lang.String str50 = cOSArray47.getString(1);
        org.apache.pdfbox.cos.COSName cOSName52 = org.apache.pdfbox.cos.COSName.ANTI_ALIAS;
        cOSArray47.set(2, (org.apache.pdfbox.pdmodel.common.COSObjectable) cOSName52);
        boolean b54 = cOSArray28.removeObject((org.apache.pdfbox.cos.COSBase) cOSName52);
        org.apache.pdfbox.cos.COSBase cOSBase56 = cOSArray28.get((int) (byte) 1);
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitDestination pDPageFitDestination57 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitDestination(cOSArray28);
        java.lang.String str60 = cOSArray28.getName(0, "FileAttachment");
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSArray15);
        org.junit.Assert.assertNotNull(f_array23);
        org.junit.Assert.assertNotNull(cOSName24);
        org.junit.Assert.assertNotNull(pDDeviceGray25);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertNotNull(cOSArray28);
        org.junit.Assert.assertNotNull(cOSName29);
        org.junit.Assert.assertNotNull(cOSDictionary34);
        org.junit.Assert.assertNotNull(cOSArray47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(cOSName52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(cOSBase56);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "FileAttachment" + "'", str60.equals("FileAttachment"));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test265");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink pDAnnotationLink4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink(cOSDictionary3);
        org.apache.pdfbox.io.ScratchFile scratchFile5 = null;
        org.apache.pdfbox.cos.COSStream cOSStream6 = new org.apache.pdfbox.cos.COSStream(scratchFile5);
        cOSDictionary3.mergeInto((org.apache.pdfbox.cos.COSDictionary) cOSStream6);
        boolean b8 = cOSStream6.isNeedToBeUpdated();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test266");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle2 = new org.apache.pdfbox.pdmodel.common.PDRectangle(10.0f, 500.0f);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test267");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject.ROLE_RB;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "rb" + "'", str0.equals("rb"));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test268");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup1 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar2 = null;
        pDAnnotationPopup1.setModifiedDate(calendar2);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup1.setRectangle(pDRectangle4);
        org.apache.pdfbox.pdmodel.PDPage pDPage6 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle4);
        pDPageTree0.add(pDPage6);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree8 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup9 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar10 = null;
        pDAnnotationPopup9.setModifiedDate(calendar10);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle12 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup9.setRectangle(pDRectangle12);
        org.apache.pdfbox.pdmodel.PDPage pDPage14 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle12);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream15 = pDPage14.getContentStreams();
        org.apache.pdfbox.pdmodel.PDResources pDResources16 = pDPage14.getResources();
        int i17 = pDPageTree8.indexOf(pDPage14);
        int i18 = pDPageTree0.indexOf(pDPage14);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle19 = pDPage14.getCropBox();
        org.junit.Assert.assertNotNull(pDRectangle4);
        org.junit.Assert.assertNotNull(pDRectangle12);
        org.junit.Assert.assertNotNull(iterator_pDStream15);
        org.junit.Assert.assertNull(pDResources16);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertNotNull(pDRectangle19);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test269");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.REFERENCE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Reference" + "'", str0.equals("Reference"));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test270");
        org.apache.pdfbox.io.RandomAccessRead randomAccessRead0 = null;
        org.apache.pdfbox.io.RandomAccessInputStream randomAccessInputStream1 = new org.apache.pdfbox.io.RandomAccessInputStream(randomAccessRead0);
        boolean b2 = randomAccessInputStream1.markSupported();
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFDocument fDFDocument3 = org.apache.pdfbox.pdmodel.fdf.FDFDocument.load((java.io.InputStream) randomAccessInputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test271");
        char[] char_array1 = org.apache.pdfbox.util.Hex.getChars((short) (byte) 100);
        org.junit.Assert.assertNotNull(char_array1);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test272");
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting1 = org.apache.pdfbox.io.MemoryUsageSetting.setupMainMemoryOnly((long) 4);
        org.junit.Assert.assertNotNull(memoryUsageSetting1);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test273");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary();
        org.apache.pdfbox.cos.COSStream cOSStream1 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction2 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction((org.apache.pdfbox.cos.COSDictionary) cOSStream1);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream1);
        pDAppearanceDictionary0.setNormalAppearance(pDAppearanceStream3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream pDAppearanceContentStream5 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream(pDAppearanceStream3);
        org.apache.pdfbox.pdmodel.PDResources pDResources6 = null;
        pDAppearanceContentStream5.setResources(pDResources6);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary8 = null;
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_9 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary8);
        try {
            pDAppearanceContentStream5.shadingFill((org.apache.pdfbox.pdmodel.graphics.shading.PDShading) pDShadingType1_9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(pDAction2);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test274");
        org.apache.pdfbox.pdmodel.graphics.color.PDSeparation pDSeparation0 = new org.apache.pdfbox.pdmodel.graphics.color.PDSeparation();
        java.awt.image.WritableRaster writableRaster1 = null;
        try {
            java.awt.image.BufferedImage bufferedImage2 = pDSeparation0.toRGBImage(writableRaster1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test275");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test276");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.LOCATION;
        cOSDictionary3.removeItem(cOSName4);
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.CREATOR;
        java.lang.String str9 = cOSDictionary3.getEmbeddedString("Artifact", cOSName7, "Center");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionURI pDActionURI10 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionURI(cOSDictionary3);
        boolean b11 = pDActionURI10.shouldTrackMousePosition();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Center" + "'", str9.equals("Center"));
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test277");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject.OWNER_XML_1_00;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "XML-1.00" + "'", str0.equals("XML-1.00"));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test278");
        org.apache.pdfbox.cos.COSInteger cOSInteger0 = org.apache.pdfbox.cos.COSNumber.ONE;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm1 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox2 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm1);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = pDCheckBox2.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary3);
        boolean b5 = cOSInteger0.equals((java.lang.Object) pDAnnotationTextMarkup4);
        java.lang.String str6 = pDAnnotationTextMarkup4.getIntent();
        java.lang.String str7 = pDAnnotationTextMarkup4.getSubtype();
        org.apache.pdfbox.pdmodel.PDPage pDPage8 = pDAnnotationTextMarkup4.getPage();
        org.junit.Assert.assertNotNull(cOSInteger0);
        org.junit.Assert.assertNotNull(cOSDictionary3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(pDPage8);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test279");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary();
        org.apache.pdfbox.cos.COSStream cOSStream1 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction2 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction((org.apache.pdfbox.cos.COSDictionary) cOSStream1);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream1);
        pDAppearanceDictionary0.setNormalAppearance(pDAppearanceStream3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream pDAppearanceContentStream5 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream(pDAppearanceStream3);
        org.apache.pdfbox.pdmodel.PDResources pDResources6 = null;
        pDAppearanceContentStream5.setResources(pDResources6);
        org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState pDExtendedGraphicsState8 = null;
        try {
            pDAppearanceContentStream5.setGraphicsStateParameters(pDExtendedGraphicsState8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(pDAction2);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test280");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.STATUS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test281");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        long long6 = cOSDictionary3.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed7 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFField fDFField8 = new org.apache.pdfbox.pdmodel.fdf.FDFField(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary9 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary();
        fDFField8.setAppearanceDictionary(pDAppearanceDictionary9);
        fDFField8.setPartialFieldName("270");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm13 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox14 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm13);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary15 = pDCheckBox14.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary16 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary15);
        org.apache.pdfbox.cos.COSName cOSName17 = org.apache.pdfbox.cos.COSName.LOCATION;
        cOSDictionary16.removeItem(cOSName17);
        org.apache.pdfbox.cos.COSName cOSName20 = org.apache.pdfbox.cos.COSName.CREATOR;
        java.lang.String str22 = cOSDictionary16.getEmbeddedString("Artifact", cOSName20, "Center");
        fDFField8.setValue((org.apache.pdfbox.cos.COSBase) cOSDictionary16);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject24 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject(cOSDictionary16);
        int i25 = pDExportFormatAttributeObject24.getColSpan();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertNotNull(cOSDictionary15);
        org.junit.Assert.assertNotNull(cOSName17);
        org.junit.Assert.assertNotNull(cOSName20);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Center" + "'", str22.equals("Center"));
        org.junit.Assert.assertTrue(i25 == 1);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test282");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.LOCATION;
        cOSDictionary3.removeItem(cOSName4);
        org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font6 = null;
        org.apache.pdfbox.pdmodel.font.PDCIDFontType0 pDCIDFontType0_7 = new org.apache.pdfbox.pdmodel.font.PDCIDFontType0(cOSDictionary3, pDType0Font6);
        float f8 = pDCIDFontType0_7.getAverageFontWidth();
        org.apache.pdfbox.util.Matrix matrix9 = pDCIDFontType0_7.getFontMatrix();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertTrue(f8 == 500.0f);
        org.junit.Assert.assertNotNull(matrix9);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test283");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        java.lang.String str2 = pDExportFormatAttributeObject1.toString();
        int i3 = pDExportFormatAttributeObject1.getColSpan();
        pDExportFormatAttributeObject1.setSpaceAfter((float) (-1));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "O=Final" + "'", str2.equals("O=Final"));
        org.junit.Assert.assertTrue(i3 == 1);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test284");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigBuilder pDVisibleSigBuilder0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigBuilder();
        pDVisibleSigBuilder0.createInnerFormResource();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument2 = null;
        try {
            pDVisibleSigBuilder0.createInnerFormStream(pDDocument2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test285");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        float f5 = pDAnnotationLine4.getLeaderLineOffsetLength();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(f5 == (-1.0f));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test286");
        org.apache.pdfbox.pdmodel.interactive.action.PDDocumentCatalogAdditionalActions pDDocumentCatalogAdditionalActions0 = new org.apache.pdfbox.pdmodel.interactive.action.PDDocumentCatalogAdditionalActions();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm1 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox2 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm1);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = pDCheckBox2.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine5 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary4);
        long long7 = cOSDictionary4.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed8 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary4);
        pDDocumentCatalogAdditionalActions0.setWC((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionNamed8);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm10 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox11 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary12 = pDCheckBox11.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup13 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary12);
        java.lang.String[] str_array15 = new java.lang.String[] { "270" };
        org.apache.pdfbox.cos.COSBase cOSBase16 = cOSDictionary12.getDictionaryObject(str_array15);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionResetForm pDActionResetForm17 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionResetForm(cOSDictionary12);
        pDDocumentCatalogAdditionalActions0.setWP((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionResetForm17);
        org.apache.pdfbox.cos.COSName cOSName19 = org.apache.pdfbox.cos.COSName.A;
        org.apache.pdfbox.cos.COSObject cOSObject20 = new org.apache.pdfbox.cos.COSObject((org.apache.pdfbox.cos.COSBase) cOSName19);
        org.apache.pdfbox.cos.COSName cOSName21 = org.apache.pdfbox.cos.COSName.ROWS;
        org.apache.pdfbox.cos.COSBase cOSBase22 = cOSObject20.getItem(cOSName21);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm23 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox24 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm23);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary25 = pDCheckBox24.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary26 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary25);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine27 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary26);
        long long29 = cOSDictionary26.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed30 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary26);
        cOSObject20.setObject((org.apache.pdfbox.cos.COSBase) cOSDictionary26);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStrikeOut fDFAnnotationStrikeOut32 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStrikeOut(cOSDictionary26);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch pDActionLaunch33 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch(cOSDictionary26);
        pDActionLaunch33.setD("DeviceN");
        pDDocumentCatalogAdditionalActions0.setWC((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionLaunch33);
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction37 = pDDocumentCatalogAdditionalActions0.getWS();
        org.junit.Assert.assertNotNull(cOSDictionary3);
        org.junit.Assert.assertTrue(long7 == (-1L));
        org.junit.Assert.assertNotNull(cOSDictionary12);
        org.junit.Assert.assertNotNull(str_array15);
        org.junit.Assert.assertNull(cOSBase16);
        org.junit.Assert.assertNotNull(cOSName19);
        org.junit.Assert.assertNotNull(cOSName21);
        org.junit.Assert.assertNull(cOSBase22);
        org.junit.Assert.assertNotNull(cOSDictionary25);
        org.junit.Assert.assertTrue(long29 == (-1L));
        org.junit.Assert.assertNull(pDAction37);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test287");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCaret fDFAnnotationCaret0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCaret();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup1 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar2 = null;
        pDAnnotationPopup1.setModifiedDate(calendar2);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup1.setRectangle(pDRectangle4);
        org.apache.pdfbox.pdmodel.PDPage pDPage6 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle4);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream7 = pDPage6.getContentStreams();
        org.apache.pdfbox.cos.COSStream cOSStream8 = null;
        org.apache.pdfbox.pdmodel.common.PDStream pDStream9 = new org.apache.pdfbox.pdmodel.common.PDStream(cOSStream8);
        org.apache.pdfbox.pdmodel.common.PDStream[] pDStream_array10 = new org.apache.pdfbox.pdmodel.common.PDStream[] { pDStream9 };
        java.util.ArrayList<org.apache.pdfbox.pdmodel.common.PDStream> arraylist_pDStream11 = new java.util.ArrayList<org.apache.pdfbox.pdmodel.common.PDStream>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.pdmodel.common.PDStream>) arraylist_pDStream11, pDStream_array10);
        pDPage6.setContents((java.util.List<org.apache.pdfbox.pdmodel.common.PDStream>) arraylist_pDStream11);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup14 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar15 = null;
        pDAnnotationPopup14.setModifiedDate(calendar15);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle17 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup14.setRectangle(pDRectangle17);
        org.apache.pdfbox.pdmodel.PDPage pDPage19 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle17);
        pDPage6.setMediaBox(pDRectangle17);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle21 = pDPage6.getCropBox();
        fDFAnnotationCaret0.setFringe(pDRectangle21);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle23 = fDFAnnotationCaret0.getFringe();
        org.junit.Assert.assertNotNull(pDRectangle4);
        org.junit.Assert.assertNotNull(iterator_pDStream7);
        org.junit.Assert.assertNotNull(pDStream_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(pDRectangle17);
        org.junit.Assert.assertNotNull(pDRectangle21);
        org.junit.Assert.assertNotNull(pDRectangle23);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test288");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        pDAnnotationPopup0.setContents("GoTo");
        org.apache.pdfbox.cos.COSArray cOSArray3 = pDAnnotationPopup0.getBorder();
        java.lang.String str4 = cOSArray3.toString();
        org.junit.Assert.assertNotNull(cOSArray3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "COSArray{[COSInt{0}, COSInt{0}, COSInt{1}]}" + "'", str4.equals("COSArray{[COSInt{0}, COSInt{0}, COSInt{1}]}"));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test289");
        org.apache.pdfbox.text.PDFMarkedContentExtractor pDFMarkedContentExtractor0 = new org.apache.pdfbox.text.PDFMarkedContentExtractor();
        org.apache.pdfbox.util.Matrix matrix7 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray8 = matrix7.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix9 = matrix7.extractScaling();
        pDFMarkedContentExtractor0.setTextMatrix(matrix7);
        matrix7.scale((float) (byte) 0, 10.0f);
        org.apache.pdfbox.util.Matrix matrix14 = matrix7.clone();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject16 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        float f17 = pDExportFormatAttributeObject16.getBaselineShift();
        pDExportFormatAttributeObject16.setBlockAlign("ImportData");
        pDExportFormatAttributeObject16.setWidthAuto();
        boolean b21 = matrix14.equals((java.lang.Object) pDExportFormatAttributeObject16);
        java.lang.String[] str_array22 = pDExportFormatAttributeObject16.getHeaders();
        org.junit.Assert.assertNotNull(cOSArray8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertTrue(f17 == 0.0f);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(str_array22);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test290");
        org.apache.pdfbox.pdmodel.font.encoding.MacOSRomanEncoding macOSRomanEncoding0 = new org.apache.pdfbox.pdmodel.font.encoding.MacOSRomanEncoding();
        org.apache.pdfbox.cos.COSBase cOSBase1 = macOSRomanEncoding0.getCOSObject();
        java.lang.String str2 = macOSRomanEncoding0.getEncodingName();
        java.lang.String str3 = macOSRomanEncoding0.getEncodingName();
        org.junit.Assert.assertNull(cOSBase1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MacRomanEncoding" + "'", str2.equals("MacRomanEncoding"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MacRomanEncoding" + "'", str3.equals("MacRomanEncoding"));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test291");
        org.apache.pdfbox.util.filetypedetector.FileType fileType0 = org.apache.pdfbox.util.filetypedetector.FileType.TIFF;
        org.junit.Assert.assertTrue("'" + fileType0 + "' != '" + org.apache.pdfbox.util.filetypedetector.FileType.TIFF + "'", fileType0.equals(org.apache.pdfbox.util.filetypedetector.FileType.TIFF));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test292");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar1 = null;
        pDAnnotationPopup0.setModifiedDate(calendar1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup0.setRectangle(pDRectangle3);
        org.apache.pdfbox.pdmodel.PDPage pDPage5 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle3);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream6 = pDPage5.getContentStreams();
        org.apache.pdfbox.cos.COSStream cOSStream7 = null;
        org.apache.pdfbox.pdmodel.common.PDStream pDStream8 = new org.apache.pdfbox.pdmodel.common.PDStream(cOSStream7);
        org.apache.pdfbox.pdmodel.common.PDStream[] pDStream_array9 = new org.apache.pdfbox.pdmodel.common.PDStream[] { pDStream8 };
        java.util.ArrayList<org.apache.pdfbox.pdmodel.common.PDStream> arraylist_pDStream10 = new java.util.ArrayList<org.apache.pdfbox.pdmodel.common.PDStream>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.pdmodel.common.PDStream>) arraylist_pDStream10, pDStream_array9);
        pDPage5.setContents((java.util.List<org.apache.pdfbox.pdmodel.common.PDStream>) arraylist_pDStream10);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup13 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar14 = null;
        pDAnnotationPopup13.setModifiedDate(calendar14);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle16 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup13.setRectangle(pDRectangle16);
        org.apache.pdfbox.pdmodel.PDPage pDPage18 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle16);
        pDPage5.setMediaBox(pDRectangle16);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle20 = pDPage5.getCropBox();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle21 = pDPage5.getCropBox();
        org.junit.Assert.assertNotNull(pDRectangle3);
        org.junit.Assert.assertNotNull(iterator_pDStream6);
        org.junit.Assert.assertNotNull(pDStream_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(pDRectangle16);
        org.junit.Assert.assertNotNull(pDRectangle20);
        org.junit.Assert.assertNotNull(pDRectangle21);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test293");
        int i0 = org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern.TILING_NO_DISTORTION;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test294");
        org.apache.pdfbox.util.Matrix matrix6 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray7 = matrix6.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix8 = matrix6.extractScaling();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm9 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox10 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm9);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary11 = pDCheckBox10.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary12 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary11);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine13 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary12);
        long long15 = cOSDictionary12.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed16 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary12);
        boolean b17 = matrix6.equals((java.lang.Object) cOSDictionary12);
        org.apache.pdfbox.cos.COSName cOSName18 = org.apache.pdfbox.cos.COSName.VOLUME;
        java.util.Calendar calendar19 = cOSDictionary12.getDate(cOSName18);
        cOSDictionary12.clear();
        org.junit.Assert.assertNotNull(cOSArray7);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(cOSDictionary11);
        org.junit.Assert.assertTrue(long15 == (-1L));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(cOSName18);
        org.junit.Assert.assertNull(calendar19);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test295");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        float f2 = pDExportFormatAttributeObject1.getBaselineShift();
        pDExportFormatAttributeObject1.setBlockAlign("ImportData");
        pDExportFormatAttributeObject1.setWidthAuto();
        java.lang.String str6 = pDExportFormatAttributeObject1.getRubyPosition();
        org.junit.Assert.assertTrue(f2 == 0.0f);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Before" + "'", str6.equals("Before"));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test296");
        org.apache.pdfbox.util.Vector vector2 = new org.apache.pdfbox.util.Vector((float) (short) 100, (float) (byte) 0);
        java.lang.String str3 = vector2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(100.0, 0.0)" + "'", str3.equals("(100.0, 0.0)"));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test297");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        fDFAnnotationFreeText0.setContents("MediaBox");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test298");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.A;
        org.apache.pdfbox.cos.COSObject cOSObject1 = new org.apache.pdfbox.cos.COSObject((org.apache.pdfbox.cos.COSBase) cOSName0);
        org.apache.pdfbox.cos.COSName cOSName2 = org.apache.pdfbox.cos.COSName.ROWS;
        org.apache.pdfbox.cos.COSBase cOSBase3 = cOSObject1.getItem(cOSName2);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm4 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox5 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm4);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary6 = pDCheckBox5.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary6);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine8 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary7);
        long long10 = cOSDictionary7.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed11 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary7);
        cOSObject1.setObject((org.apache.pdfbox.cos.COSBase) cOSDictionary7);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStrikeOut fDFAnnotationStrikeOut13 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStrikeOut(cOSDictionary7);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch pDActionLaunch14 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch(cOSDictionary7);
        java.lang.String str15 = pDActionLaunch14.getO();
        org.junit.Assert.assertNotNull(cOSName0);
        org.junit.Assert.assertNotNull(cOSName2);
        org.junit.Assert.assertNull(cOSBase3);
        org.junit.Assert.assertNotNull(cOSDictionary6);
        org.junit.Assert.assertTrue(long10 == (-1L));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test299");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCircle fDFAnnotationCircle0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCircle();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle1 = fDFAnnotationCircle0.getFringe();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup2 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar3 = null;
        pDAnnotationPopup2.setModifiedDate(calendar3);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle5 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup2.setRectangle(pDRectangle5);
        org.apache.pdfbox.pdmodel.PDPage pDPage7 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle5);
        org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState pDGraphicsState8 = new org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState(pDRectangle5);
        fDFAnnotationCircle0.setFringe(pDRectangle5);
        java.lang.String str10 = fDFAnnotationCircle0.getContents();
        org.junit.Assert.assertNull(pDRectangle1);
        org.junit.Assert.assertNotNull(pDRectangle5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test300");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar1 = null;
        pDAnnotationPopup0.setModifiedDate(calendar1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup0.setRectangle(pDRectangle3);
        org.apache.pdfbox.pdmodel.PDPage pDPage5 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle3);
        org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState pDGraphicsState6 = new org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState(pDRectangle3);
        pDGraphicsState6.setAlphaConstant((double) (byte) 10);
        org.junit.Assert.assertNotNull(pDRectangle3);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test301");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding5 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline6 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary3);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_7 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary3);
        org.apache.pdfbox.util.Matrix matrix14 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray15 = matrix14.toCOSArray();
        pDShadingType3_7.setDomain(cOSArray15);
        java.lang.String str18 = cOSArray15.getString(1);
        org.apache.pdfbox.contentstream.operator.DrawObject drawObject19 = new org.apache.pdfbox.contentstream.operator.DrawObject();
        org.apache.pdfbox.contentstream.operator.Operator operator20 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm21 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox22 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm21);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary23 = pDCheckBox22.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup24 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary23);
        java.lang.String[] str_array26 = new java.lang.String[] { "270" };
        org.apache.pdfbox.cos.COSBase cOSBase27 = cOSDictionary23.getDictionaryObject(str_array26);
        java.util.Calendar calendar29 = cOSDictionary23.getDate("180");
        org.apache.pdfbox.cos.COSName cOSName30 = org.apache.pdfbox.cos.COSName.SHADING_TYPE;
        org.apache.pdfbox.cos.COSName cOSName31 = org.apache.pdfbox.cos.COSName.TYPE1;
        int i32 = cOSDictionary23.getInt(cOSName30, cOSName31);
        org.apache.pdfbox.cos.COSName cOSName33 = org.apache.pdfbox.cos.COSName.BLEED_BOX;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm34 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox35 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm34);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary36 = pDCheckBox35.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary37 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary36);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie pDActionMovie38 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie(cOSDictionary36);
        org.apache.pdfbox.pdmodel.fdf.FDFPageInfo fDFPageInfo39 = new org.apache.pdfbox.pdmodel.fdf.FDFPageInfo(cOSDictionary36);
        org.apache.pdfbox.cos.COSName cOSName40 = org.apache.pdfbox.cos.COSName.LEGAL_ATTESTATION;
        org.apache.pdfbox.cos.COSName cOSName41 = org.apache.pdfbox.cos.COSName.OVERLAY;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm42 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox43 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm42);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary44 = pDCheckBox43.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo pDMarkInfo45 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo(cOSDictionary44);
        cOSDictionary44.setInt("JavaScript", 10);
        org.apache.pdfbox.cos.COSName cOSName49 = org.apache.pdfbox.cos.COSName.TYPE3;
        org.apache.pdfbox.cos.COSName cOSName50 = org.apache.pdfbox.cos.COSName.TYPE1;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm51 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox52 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm51);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary53 = pDCheckBox52.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary54 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary53);
        org.apache.pdfbox.cos.COSDocument cOSDocument55 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey56 = null;
        org.apache.pdfbox.cos.COSObject cOSObject57 = cOSDocument55.getObjectFromPool(cOSObjectKey56);
        org.apache.pdfbox.cos.COSName cOSName58 = org.apache.pdfbox.cos.COSName.CL;
        org.apache.pdfbox.cos.COSObject cOSObject59 = cOSDocument55.getObjectByType(cOSName58);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm60 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox61 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm60);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary62 = pDCheckBox61.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary63 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary62);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine64 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary63);
        long long66 = cOSDictionary63.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed67 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary63);
        java.lang.String str70 = cOSDictionary63.getEmbeddedString("sc", "After");
        cOSDocument55.setTrailer(cOSDictionary63);
        org.apache.pdfbox.cos.COSName cOSName73 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.FILTER_VERISIGN_PPKVS;
        cOSDictionary63.setEmbeddedInt("Index", cOSName73, (int) 'a');
        org.apache.pdfbox.cos.COSName cOSName76 = org.apache.pdfbox.cos.COSName.SET_FF;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm77 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox78 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm77);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary79 = pDCheckBox78.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject pDTableAttributeObject80 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject(cOSDictionary79);
        org.apache.pdfbox.cos.COSName cOSName81 = org.apache.pdfbox.cos.COSName.ROWS;
        org.apache.pdfbox.cos.COSBase[] cOSBase_array82 = new org.apache.pdfbox.cos.COSBase[] { cOSDictionary23, cOSName33, cOSDictionary36, cOSName40, cOSName41, cOSDictionary44, cOSName49, cOSName50, cOSDictionary54, cOSDictionary63, cOSName76, cOSDictionary79, cOSName81 };
        java.util.ArrayList<org.apache.pdfbox.cos.COSBase> arraylist_cOSBase83 = new java.util.ArrayList<org.apache.pdfbox.cos.COSBase>();
        boolean b84 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase83, cOSBase_array82);
        drawObject19.process(operator20, (java.util.List<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase83);
        cOSArray15.addAll((java.util.Collection<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase83);
        java.lang.String str87 = cOSArray15.toString();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSArray15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(cOSDictionary23);
        org.junit.Assert.assertNotNull(str_array26);
        org.junit.Assert.assertNull(cOSBase27);
        org.junit.Assert.assertNull(calendar29);
        org.junit.Assert.assertNotNull(cOSName30);
        org.junit.Assert.assertNotNull(cOSName31);
        org.junit.Assert.assertTrue(i32 == (-1));
        org.junit.Assert.assertNotNull(cOSName33);
        org.junit.Assert.assertNotNull(cOSDictionary36);
        org.junit.Assert.assertNotNull(cOSName40);
        org.junit.Assert.assertNotNull(cOSName41);
        org.junit.Assert.assertNotNull(cOSDictionary44);
        org.junit.Assert.assertNotNull(cOSName49);
        org.junit.Assert.assertNotNull(cOSName50);
        org.junit.Assert.assertNotNull(cOSDictionary53);
        org.junit.Assert.assertNotNull(cOSObject57);
        org.junit.Assert.assertNotNull(cOSName58);
        org.junit.Assert.assertNull(cOSObject59);
        org.junit.Assert.assertNotNull(cOSDictionary62);
        org.junit.Assert.assertTrue(long66 == (-1L));
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(cOSName73);
        org.junit.Assert.assertNotNull(cOSName76);
        org.junit.Assert.assertNotNull(cOSDictionary79);
        org.junit.Assert.assertNotNull(cOSName81);
        org.junit.Assert.assertNotNull(cOSBase_array82);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertTrue("'" + str87 + "' != '" + "COSArray{[COSFloat{1.0}, COSFloat{100.0}, COSFloat{100.0}, COSFloat{0.0}, COSFloat{-1.0}, COSFloat{0.0}, COSDictionary{COSName{FT}:COSName{Btn};COSName{Type}:COSName{Annot};}, COSName{BleedBox}, COSDictionary{COSName{FT}:COSName{Btn};}, COSName{LegalAttestation}, COSName{Overlay}, COSDictionary{COSName{FT}:COSName{Btn};COSName{JavaScript}:COSInt{10};}, COSName{Type3}, COSName{Type1}, COSDictionary{COSName{FT}:COSName{Btn};}, COSDictionary{COSName{FT}:COSName{Btn};COSName{Type}:COSName{Annot};COSName{Index}:COSDictionary{COSName{VeriSign.PPKVS}:COSInt{97};};}, COSName{SetFf}, COSDictionary{COSName{FT}:COSName{Btn};}, COSName{Rows}]}" + "'", str87.equals("COSArray{[COSFloat{1.0}, COSFloat{100.0}, COSFloat{100.0}, COSFloat{0.0}, COSFloat{-1.0}, COSFloat{0.0}, COSDictionary{COSName{FT}:COSName{Btn};COSName{Type}:COSName{Annot};}, COSName{BleedBox}, COSDictionary{COSName{FT}:COSName{Btn};}, COSName{LegalAttestation}, COSName{Overlay}, COSDictionary{COSName{FT}:COSName{Btn};COSName{JavaScript}:COSInt{10};}, COSName{Type3}, COSName{Type1}, COSDictionary{COSName{FT}:COSName{Btn};}, COSDictionary{COSName{FT}:COSName{Btn};COSName{Type}:COSName{Annot};COSName{Index}:COSDictionary{COSName{VeriSign.PPKVS}:COSInt{97};};}, COSName{SetFf}, COSDictionary{COSName{FT}:COSName{Btn};}, COSName{Rows}]}"));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test302");
        org.apache.pdfbox.util.Matrix matrix6 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray7 = matrix6.toCOSArray();
        float f8 = matrix6.getScaleX();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary9 = null;
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType6 pDShadingType6_10 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType6(cOSDictionary9);
        org.apache.pdfbox.text.PDFMarkedContentExtractor pDFMarkedContentExtractor11 = new org.apache.pdfbox.text.PDFMarkedContentExtractor();
        org.apache.pdfbox.util.Matrix matrix18 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray19 = matrix18.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix20 = matrix18.extractScaling();
        pDFMarkedContentExtractor11.setTextMatrix(matrix18);
        matrix18.scale((float) (byte) 0, 10.0f);
        org.apache.pdfbox.util.Matrix matrix25 = matrix18.clone();
        java.awt.Paint paint26 = pDShadingType6_10.toPaint(matrix18);
        org.apache.pdfbox.util.Matrix matrix27 = matrix18.clone();
        org.apache.pdfbox.util.Matrix matrix28 = org.apache.pdfbox.util.Matrix.concatenate(matrix6, matrix18);
        float f29 = matrix28.getScalingFactorY();
        org.junit.Assert.assertNotNull(cOSArray7);
        org.junit.Assert.assertTrue(f8 == 1.0f);
        org.junit.Assert.assertNotNull(cOSArray19);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertTrue(f29 == 100005.0f);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test303");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ARTIFACT;
        org.apache.pdfbox.pdmodel.common.function.PDFunctionType3 pDFunctionType3_1 = new org.apache.pdfbox.pdmodel.common.function.PDFunctionType3((org.apache.pdfbox.cos.COSBase) cOSName0);
        int i2 = pDFunctionType3_1.getFunctionType();
        org.junit.Assert.assertNotNull(cOSName0);
        org.junit.Assert.assertTrue(i2 == 3);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test304");
        org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions pDFormFieldAdditionalActions0 = new org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions();
        org.apache.pdfbox.pdmodel.interactive.action.PDActionSound pDActionSound1 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionSound();
        pDActionSound1.setVolume((float) (byte) 1);
        pDFormFieldAdditionalActions0.setC((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionSound1);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm5 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox6 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm5);
        java.lang.String[] str_array8 = new java.lang.String[] { "Underline" };
        java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<java.lang.String>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str9, str_array8);
        pDCheckBox6.setExportValues((java.util.List<java.lang.String>) arraylist_str9);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.types = arraylist_str9;
        pDActionSound1.setNext((java.util.List<java.lang.String>) arraylist_str9);
        java.util.stream.Stream<java.lang.String> stream_str14 = arraylist_str9.parallelStream();
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(stream_str14);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test305");
        java.io.OutputStream outputStream0 = null;
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream1 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream(outputStream0);
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream3 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream(outputStream0, (long) 2);
        try {
            cOSStandardOutputStream3.write((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test306");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNProcess pDDeviceNProcess4 = new org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNProcess(cOSDictionary2);
        org.apache.pdfbox.pdmodel.fdf.FDFNamedPageReference fDFNamedPageReference5 = new org.apache.pdfbox.pdmodel.fdf.FDFNamedPageReference(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSDictionary2);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test307");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ENCRYPT_META_DATA;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test308");
        java.io.InputStream inputStream0 = null;
        int[] i_array3 = new int[] { 10, (short) 100 };
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream cOSFilterInputStream4 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream(inputStream0, i_array3);
        try {
            cOSFilterInputStream4.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test309");
        org.apache.pdfbox.pdmodel.interactive.measurement.PDViewportDictionary pDViewportDictionary0 = new org.apache.pdfbox.pdmodel.interactive.measurement.PDViewportDictionary();
        java.lang.String str1 = pDViewportDictionary0.getType();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Viewport" + "'", str1.equals("Viewport"));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test310");
        java.lang.String[] str_array51 = new java.lang.String[] { "Caret", "0", "Circle", "L", "Final", "hi!", "M", "Middle", "Key", "S", "Middle", "Inset", "Square", "Form", "Standard", "UseOutlines", "O=PrintField", "Lbl", "n", "MediaBox", "Adobe.PubSec", "Link", "Popup", "Annot", "Slash", "FileAttachment", "D", "COSInt{1}", "Center", "Dashed", "ClosedArrow", "270", "BlockQuote", "MediaBox", "Auto", "Figure", "Square", "L", "CSS-1.00", "L", "ForComment", "Underline", "Pattern", "Outset", "RB", "J", "RlTb", "656E6473747265616D", "hi!", "O=Final", "Viewport" };
        java.util.ArrayList<java.lang.String> arraylist_str52 = new java.util.ArrayList<java.lang.String>();
        boolean b53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str52, str_array51);
        org.apache.pdfbox.cos.COSArray cOSArray54 = org.apache.pdfbox.pdmodel.common.COSArrayList.convertStringListToCOSNameCOSArray((java.util.List<java.lang.String>) arraylist_str52);
        try {
            cOSArray54.setName((int) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(str_array51);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(cOSArray54);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test311");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ROOT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test312");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        java.lang.String str2 = pDExportFormatAttributeObject1.toString();
        pDExportFormatAttributeObject1.setLineHeightAuto();
        java.lang.String str4 = pDExportFormatAttributeObject1.getTextAlign();
        pDExportFormatAttributeObject1.setAllPaddings(6);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "O=Final" + "'", str2.equals("O=Final"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Start" + "'", str4.equals("Start"));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test313");
        org.apache.pdfbox.pdmodel.PDEmbeddedFilesNameTreeNode pDEmbeddedFilesNameTreeNode0 = new org.apache.pdfbox.pdmodel.PDEmbeddedFilesNameTreeNode();
        boolean b1 = pDEmbeddedFilesNameTreeNode0.isRootNode();
        org.junit.Assert.assertTrue(b1 == true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test314");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor5 = pDAnnotationLine4.getInteriorColor();
        pDAnnotationLine4.setReplyType("Before");
        pDAnnotationLine4.setInvisible(true);
        pDAnnotationLine4.setLeaderLineExtensionLength(0.0f);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(pDColor5);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test315");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        org.apache.pdfbox.util.Matrix matrix7 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray8 = matrix7.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix9 = matrix7.extractScaling();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm10 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox11 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary12 = pDCheckBox11.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary13 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary12);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine14 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary13);
        long long16 = cOSDictionary13.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed17 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary13);
        boolean b18 = matrix7.equals((java.lang.Object) cOSDictionary13);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp pDSeedValueTimeStamp19 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp(cOSDictionary13);
        org.apache.pdfbox.pdmodel.PDDocumentCatalog pDDocumentCatalog20 = new org.apache.pdfbox.pdmodel.PDDocumentCatalog(pDDocument0, cOSDictionary13);
        org.apache.pdfbox.pdmodel.common.PDDestinationOrAction pDDestinationOrAction21 = pDDocumentCatalog20.getOpenAction();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary22 = pDDocumentCatalog20.getCOSObject();
        pDDocumentCatalog20.setLanguage("MacRomanEncoding");
        org.junit.Assert.assertNotNull(cOSArray8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(cOSDictionary12);
        org.junit.Assert.assertTrue(long16 == (-1L));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(pDDestinationOrAction21);
        org.junit.Assert.assertNotNull(cOSDictionary22);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test316");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject.OWNER_LIST;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "List" + "'", str0.equals("List"));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test317");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.SEPARATION;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test318");
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode0 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode();
        org.apache.pdfbox.pdmodel.common.PDNameTreeNode<org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript> pdnametreenode_pDActionJavaScript1 = pDJavascriptNameTreeNode0.getParent();
        boolean b2 = pDJavascriptNameTreeNode0.isRootNode();
        org.junit.Assert.assertNull(pdnametreenode_pDActionJavaScript1);
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test319");
        org.apache.pdfbox.text.PDFMarkedContentExtractor pDFMarkedContentExtractor0 = new org.apache.pdfbox.text.PDFMarkedContentExtractor();
        org.apache.pdfbox.text.PDFMarkedContentExtractor pDFMarkedContentExtractor1 = new org.apache.pdfbox.text.PDFMarkedContentExtractor();
        org.apache.pdfbox.util.Matrix matrix8 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray9 = matrix8.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix10 = matrix8.extractScaling();
        pDFMarkedContentExtractor1.setTextMatrix(matrix8);
        matrix8.scale((float) (byte) 0, 10.0f);
        org.apache.pdfbox.util.Matrix matrix15 = matrix8.clone();
        pDFMarkedContentExtractor0.setTextMatrix(matrix15);
        org.apache.pdfbox.util.Matrix matrix23 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray24 = matrix23.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix25 = matrix23.extractScaling();
        pDFMarkedContentExtractor0.setTextLineMatrix(matrix23);
        org.junit.Assert.assertNotNull(cOSArray9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(matrix15);
        org.junit.Assert.assertNotNull(cOSArray24);
        org.junit.Assert.assertNotNull(matrix25);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test320");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup1 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar2 = null;
        pDAnnotationPopup1.setModifiedDate(calendar2);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup1.setRectangle(pDRectangle4);
        org.apache.pdfbox.pdmodel.PDPage pDPage6 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle4);
        try {
            org.apache.pdfbox.pdmodel.PDPageContentStream pDPageContentStream7 = new org.apache.pdfbox.pdmodel.PDPageContentStream(pDDocument0, pDPage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle4);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test321");
        org.apache.pdfbox.cos.COSInteger cOSInteger0 = org.apache.pdfbox.cos.COSNumber.ONE;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm1 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox2 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm1);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = pDCheckBox2.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary3);
        boolean b5 = cOSInteger0.equals((java.lang.Object) pDAnnotationTextMarkup4);
        java.lang.String str6 = pDAnnotationTextMarkup4.getIntent();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup7 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        pDAnnotationPopup7.setReadOnly(false);
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor10 = pDAnnotationPopup7.getColor();
        pDAnnotationTextMarkup4.setPopup(pDAnnotationPopup7);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary12 = pDAnnotationTextMarkup4.getCOSObject();
        org.junit.Assert.assertNotNull(cOSInteger0);
        org.junit.Assert.assertNotNull(cOSDictionary3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(pDColor10);
        org.junit.Assert.assertNotNull(cOSDictionary12);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test322");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.TM;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test323");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        long long6 = cOSDictionary3.getLong("Note");
        org.apache.pdfbox.pdmodel.encryption.PDEncryption pDEncryption7 = new org.apache.pdfbox.pdmodel.encryption.PDEncryption(cOSDictionary3);
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission10 = null;
        org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy standardProtectionPolicy11 = new org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy("270", "PushPin", accessPermission10);
        java.lang.String str12 = standardProtectionPolicy11.getOwnerPassword();
        org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler standardSecurityHandler13 = new org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler(standardProtectionPolicy11);
        pDEncryption7.setSecurityHandler((org.apache.pdfbox.pdmodel.encryption.SecurityHandler) standardSecurityHandler13);
        standardSecurityHandler13.setAES(true);
        standardSecurityHandler13.setAES(false);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "270" + "'", str12.equals("270"));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test324");
        java.io.File file0 = null;
        org.apache.pdfbox.io.RandomAccessRead randomAccessRead2 = null;
        org.apache.pdfbox.io.RandomAccessInputStream randomAccessInputStream3 = new org.apache.pdfbox.io.RandomAccessInputStream(randomAccessRead2);
        try {
            org.apache.pdfbox.pdmodel.PDDocument pDDocument5 = org.apache.pdfbox.pdmodel.PDDocument.load(file0, "Caret", (java.io.InputStream) randomAccessInputStream3, "MacRomanEncoding");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test325");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject.CHECKED_STATE_ON;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "on" + "'", str0.equals("on"));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test326");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.PREV;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test327");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        long long6 = cOSDictionary3.getLong("Note");
        org.apache.pdfbox.pdmodel.encryption.PDEncryption pDEncryption7 = new org.apache.pdfbox.pdmodel.encryption.PDEncryption(cOSDictionary3);
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission10 = null;
        org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy standardProtectionPolicy11 = new org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy("270", "PushPin", accessPermission10);
        java.lang.String str12 = standardProtectionPolicy11.getOwnerPassword();
        org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler standardSecurityHandler13 = new org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler(standardProtectionPolicy11);
        pDEncryption7.setSecurityHandler((org.apache.pdfbox.pdmodel.encryption.SecurityHandler) standardSecurityHandler13);
        standardSecurityHandler13.setAES(true);
        org.apache.pdfbox.cos.COSStream cOSStream17 = new org.apache.pdfbox.cos.COSStream();
        try {
            standardSecurityHandler13.encryptStream(cOSStream17, (long) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "270" + "'", str12.equals("270"));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test328");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine.LE_OPEN_ARROW;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "OpenArrow" + "'", str0.equals("OpenArrow"));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test329");
        org.apache.pdfbox.cos.COSInteger cOSInteger0 = org.apache.pdfbox.cos.COSNumber.ONE;
        long long1 = cOSInteger0.longValue();
        java.lang.String str2 = cOSInteger0.toString();
        int i3 = cOSInteger0.intValue();
        org.junit.Assert.assertNotNull(cOSInteger0);
        org.junit.Assert.assertTrue(long1 == 1L);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "COSInt{1}" + "'", str2.equals("COSInt{1}"));
        org.junit.Assert.assertTrue(i3 == 1);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test330");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.H;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "H" + "'", str0.equals("H"));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test331");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.STEM_V;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test332");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary2);
        java.lang.String[] str_array5 = new java.lang.String[] { "270" };
        org.apache.pdfbox.cos.COSBase cOSBase6 = cOSDictionary2.getDictionaryObject(str_array5);
        java.util.Calendar calendar8 = cOSDictionary2.getDate("180");
        org.apache.pdfbox.cos.COSName cOSName9 = org.apache.pdfbox.cos.COSName.SHADING_TYPE;
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.TYPE1;
        int i11 = cOSDictionary2.getInt(cOSName9, cOSName10);
        org.apache.pdfbox.pdmodel.encryption.PDEncryption pDEncryption12 = new org.apache.pdfbox.pdmodel.encryption.PDEncryption(cOSDictionary2);
        pDEncryption12.setLength(4);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(str_array5);
        org.junit.Assert.assertNull(cOSBase6);
        org.junit.Assert.assertNull(calendar8);
        org.junit.Assert.assertNotNull(cOSName9);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertTrue(i11 == (-1));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test333");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FIRST_CHAR;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test334");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.COURIER_BOLD_OBLIQUE;
        boolean b1 = pDType1Font0.isVertical();
        org.apache.fontbox.FontBoxFont fontBoxFont2 = pDType1Font0.getFontBoxFont();
        org.apache.pdfbox.util.Matrix matrix3 = pDType1Font0.getFontMatrix();
        org.apache.pdfbox.pdmodel.font.encoding.GlyphList glyphList5 = org.apache.pdfbox.pdmodel.font.encoding.GlyphList.getZapfDingbats();
        java.lang.String str6 = pDType1Font0.toUnicode(97, glyphList5);
        boolean b8 = pDType1Font0.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(fontBoxFont2);
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertNotNull(glyphList5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test335");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolygon fDFAnnotationPolygon0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolygon();
        java.awt.Color color1 = null;
        fDFAnnotationPolygon0.setInteriorColor(color1);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test336");
        org.apache.pdfbox.pdmodel.font.PDType3Font pDType3Font0 = null;
        org.apache.pdfbox.cos.COSStream cOSStream1 = null;
        org.apache.pdfbox.pdmodel.font.PDType3CharProc pDType3CharProc2 = new org.apache.pdfbox.pdmodel.font.PDType3CharProc(pDType3Font0, cOSStream1);
        try {
            java.io.InputStream inputStream3 = pDType3CharProc2.getContents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test337");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding5 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline6 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary3);
        java.lang.String str9 = cOSDictionary3.getNameAsString("StructElem", "LowerRoman");
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "LowerRoman" + "'", str9.equals("LowerRoman"));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test338");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.OS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test339");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.NON_EFONT_NO_WARN;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test340");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine fDFAnnotationLine5 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine(cOSDictionary3);
        fDFAnnotationLine5.setSubject("Middle");
        org.junit.Assert.assertNotNull(cOSDictionary2);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test341");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink pDAnnotationLink0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary1 = pDAnnotationLink0.getAppearance();
        org.junit.Assert.assertNull(pDAppearanceDictionary1);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test342");
        org.apache.pdfbox.pdmodel.encryption.SecurityHandlerFactory securityHandlerFactory0 = org.apache.pdfbox.pdmodel.encryption.SecurityHandlerFactory.INSTANCE;
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission3 = null;
        org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy standardProtectionPolicy4 = new org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy("270", "PushPin", accessPermission3);
        java.lang.String str5 = standardProtectionPolicy4.getUserPassword();
        org.apache.pdfbox.pdmodel.encryption.SecurityHandler securityHandler6 = securityHandlerFactory0.newSecurityHandlerForPolicy((org.apache.pdfbox.pdmodel.encryption.ProtectionPolicy) standardProtectionPolicy4);
        org.junit.Assert.assertNotNull(securityHandlerFactory0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "PushPin" + "'", str5.equals("PushPin"));
        org.junit.Assert.assertNotNull(securityHandler6);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test343");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.COURIER_BOLD_OBLIQUE;
        boolean b1 = pDType1Font0.isVertical();
        org.apache.fontbox.FontBoxFont fontBoxFont2 = pDType1Font0.getFontBoxFont();
        org.apache.pdfbox.util.Matrix matrix3 = pDType1Font0.getFontMatrix();
        org.apache.pdfbox.pdmodel.font.encoding.GlyphList glyphList5 = org.apache.pdfbox.pdmodel.font.encoding.GlyphList.getZapfDingbats();
        java.lang.String str6 = pDType1Font0.toUnicode(97, glyphList5);
        java.awt.geom.GeneralPath generalPath8 = pDType1Font0.getNormalizedPath((int) (byte) 10);
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(fontBoxFont2);
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertNotNull(glyphList5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(generalPath8);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test344");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.cos.COSName cOSName5 = org.apache.pdfbox.cos.COSName.SUBJ;
        long long6 = cOSDictionary3.getLong(cOSName5);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit7 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary8 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary(cOSDictionary3);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName5);
        org.junit.Assert.assertTrue(long6 == (-1L));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test345");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDTextField pDTextField1 = new org.apache.pdfbox.pdmodel.interactive.form.PDTextField(pDAcroForm0);
        pDTextField1.setComb(false);
        pDTextField1.setDoNotScroll(true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test346");
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission2 = null;
        org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy standardProtectionPolicy3 = new org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy("270", "PushPin", accessPermission2);
        java.lang.String str4 = standardProtectionPolicy3.getOwnerPassword();
        org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler standardSecurityHandler5 = new org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler(standardProtectionPolicy3);
        org.apache.pdfbox.contentstream.operator.Operator operator7 = org.apache.pdfbox.contentstream.operator.Operator.getOperator("L");
        org.apache.pdfbox.contentstream.operator.DrawObject drawObject8 = new org.apache.pdfbox.contentstream.operator.DrawObject();
        org.apache.pdfbox.contentstream.operator.Operator operator9 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm10 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox11 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary12 = pDCheckBox11.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup13 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary12);
        java.lang.String[] str_array15 = new java.lang.String[] { "270" };
        org.apache.pdfbox.cos.COSBase cOSBase16 = cOSDictionary12.getDictionaryObject(str_array15);
        java.util.Calendar calendar18 = cOSDictionary12.getDate("180");
        org.apache.pdfbox.cos.COSName cOSName19 = org.apache.pdfbox.cos.COSName.SHADING_TYPE;
        org.apache.pdfbox.cos.COSName cOSName20 = org.apache.pdfbox.cos.COSName.TYPE1;
        int i21 = cOSDictionary12.getInt(cOSName19, cOSName20);
        org.apache.pdfbox.cos.COSName cOSName22 = org.apache.pdfbox.cos.COSName.BLEED_BOX;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm23 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox24 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm23);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary25 = pDCheckBox24.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary26 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary25);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie pDActionMovie27 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie(cOSDictionary25);
        org.apache.pdfbox.pdmodel.fdf.FDFPageInfo fDFPageInfo28 = new org.apache.pdfbox.pdmodel.fdf.FDFPageInfo(cOSDictionary25);
        org.apache.pdfbox.cos.COSName cOSName29 = org.apache.pdfbox.cos.COSName.LEGAL_ATTESTATION;
        org.apache.pdfbox.cos.COSName cOSName30 = org.apache.pdfbox.cos.COSName.OVERLAY;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm31 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox32 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm31);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary33 = pDCheckBox32.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo pDMarkInfo34 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo(cOSDictionary33);
        cOSDictionary33.setInt("JavaScript", 10);
        org.apache.pdfbox.cos.COSName cOSName38 = org.apache.pdfbox.cos.COSName.TYPE3;
        org.apache.pdfbox.cos.COSName cOSName39 = org.apache.pdfbox.cos.COSName.TYPE1;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm40 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox41 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm40);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary42 = pDCheckBox41.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary43 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary42);
        org.apache.pdfbox.cos.COSDocument cOSDocument44 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey45 = null;
        org.apache.pdfbox.cos.COSObject cOSObject46 = cOSDocument44.getObjectFromPool(cOSObjectKey45);
        org.apache.pdfbox.cos.COSName cOSName47 = org.apache.pdfbox.cos.COSName.CL;
        org.apache.pdfbox.cos.COSObject cOSObject48 = cOSDocument44.getObjectByType(cOSName47);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm49 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox50 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm49);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary51 = pDCheckBox50.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary52 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary51);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine53 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary52);
        long long55 = cOSDictionary52.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed56 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary52);
        java.lang.String str59 = cOSDictionary52.getEmbeddedString("sc", "After");
        cOSDocument44.setTrailer(cOSDictionary52);
        org.apache.pdfbox.cos.COSName cOSName62 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.FILTER_VERISIGN_PPKVS;
        cOSDictionary52.setEmbeddedInt("Index", cOSName62, (int) 'a');
        org.apache.pdfbox.cos.COSName cOSName65 = org.apache.pdfbox.cos.COSName.SET_FF;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm66 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox67 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm66);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary68 = pDCheckBox67.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject pDTableAttributeObject69 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject(cOSDictionary68);
        org.apache.pdfbox.cos.COSName cOSName70 = org.apache.pdfbox.cos.COSName.ROWS;
        org.apache.pdfbox.cos.COSBase[] cOSBase_array71 = new org.apache.pdfbox.cos.COSBase[] { cOSDictionary12, cOSName22, cOSDictionary25, cOSName29, cOSName30, cOSDictionary33, cOSName38, cOSName39, cOSDictionary43, cOSDictionary52, cOSName65, cOSDictionary68, cOSName70 };
        java.util.ArrayList<org.apache.pdfbox.cos.COSBase> arraylist_cOSBase72 = new java.util.ArrayList<org.apache.pdfbox.cos.COSBase>();
        boolean b73 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase72, cOSBase_array71);
        drawObject8.process(operator9, (java.util.List<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase72);
        org.apache.pdfbox.contentstream.operator.MissingOperandException missingOperandException75 = new org.apache.pdfbox.contentstream.operator.MissingOperandException(operator7, (java.util.List<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase72);
        byte[] byte_array76 = org.apache.pdfbox.pdfwriter.COSWriter.STREAM;
        operator7.setImageData(byte_array76);
        byte[] byte_array78 = org.apache.pdfbox.pdfwriter.COSWriter.ENDSTREAM;
        try {
            byte[] byte_array81 = standardSecurityHandler5.getUserPassword(byte_array76, byte_array78, 6, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "270" + "'", str4.equals("270"));
        org.junit.Assert.assertNotNull(operator7);
        org.junit.Assert.assertNotNull(cOSDictionary12);
        org.junit.Assert.assertNotNull(str_array15);
        org.junit.Assert.assertNull(cOSBase16);
        org.junit.Assert.assertNull(calendar18);
        org.junit.Assert.assertNotNull(cOSName19);
        org.junit.Assert.assertNotNull(cOSName20);
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertNotNull(cOSName22);
        org.junit.Assert.assertNotNull(cOSDictionary25);
        org.junit.Assert.assertNotNull(cOSName29);
        org.junit.Assert.assertNotNull(cOSName30);
        org.junit.Assert.assertNotNull(cOSDictionary33);
        org.junit.Assert.assertNotNull(cOSName38);
        org.junit.Assert.assertNotNull(cOSName39);
        org.junit.Assert.assertNotNull(cOSDictionary42);
        org.junit.Assert.assertNotNull(cOSObject46);
        org.junit.Assert.assertNotNull(cOSName47);
        org.junit.Assert.assertNull(cOSObject48);
        org.junit.Assert.assertNotNull(cOSDictionary51);
        org.junit.Assert.assertTrue(long55 == (-1L));
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(cOSName62);
        org.junit.Assert.assertNotNull(cOSName65);
        org.junit.Assert.assertNotNull(cOSDictionary68);
        org.junit.Assert.assertNotNull(cOSName70);
        org.junit.Assert.assertNotNull(cOSBase_array71);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertNotNull(byte_array76);
        org.junit.Assert.assertNotNull(byte_array78);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test347");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.TEXT_DECORATION_TYPE_NONE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "None" + "'", str0.equals("None"));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test348");
        org.apache.pdfbox.pdmodel.DefaultResourceCache defaultResourceCache0 = new org.apache.pdfbox.pdmodel.DefaultResourceCache();
        org.apache.pdfbox.cos.COSDocument cOSDocument1 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey2 = null;
        org.apache.pdfbox.cos.COSObject cOSObject3 = cOSDocument1.getObjectFromPool(cOSObjectKey2);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = null;
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_5 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary4);
        defaultResourceCache0.put(cOSObject3, (org.apache.pdfbox.pdmodel.graphics.shading.PDShading) pDShadingType1_5);
        org.junit.Assert.assertNotNull(cOSObject3);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test349");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        org.apache.pdfbox.printing.Scaling scaling1 = null;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable3 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument0, scaling1, true);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test350");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.fdf.FDFAnnotationInk.SUBTYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Ink" + "'", str0.equals("Ink"));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test351");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        long long6 = cOSDictionary3.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed7 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFField fDFField8 = new org.apache.pdfbox.pdmodel.fdf.FDFField(cOSDictionary3);
        org.apache.pdfbox.io.ScratchFile scratchFile9 = null;
        org.apache.pdfbox.cos.COSStream cOSStream10 = new org.apache.pdfbox.cos.COSStream(scratchFile9);
        org.apache.pdfbox.pdmodel.common.PDObjectStream pDObjectStream11 = new org.apache.pdfbox.pdmodel.common.PDObjectStream(cOSStream10);
        fDFField8.setRichText(cOSStream10);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit13 = fDFField8.getIconFit();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertNull(fDFIconFit13);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test352");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties pDOptionalContentProperties1 = new org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties(cOSDictionary0);
        try {
            org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentGroup pDOptionalContentGroup3 = pDOptionalContentProperties1.getGroup("H");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test353");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.WIDGET;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test354");
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission2 = null;
        org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy standardProtectionPolicy3 = new org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy("270", "PushPin", accessPermission2);
        java.lang.String str4 = standardProtectionPolicy3.getOwnerPassword();
        org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler standardSecurityHandler5 = new org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler(standardProtectionPolicy3);
        byte[] byte_array7 = null;
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigBuilder pDVisibleSigBuilder8 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigBuilder();
        pDVisibleSigBuilder8.createInnerFormResource();
        byte[] byte_array10 = org.apache.pdfbox.pdfwriter.COSWriter.STREAM;
        pDVisibleSigBuilder8.createFormatterRectangle(byte_array10);
        org.apache.pdfbox.contentstream.operator.Operator operator14 = org.apache.pdfbox.contentstream.operator.Operator.getOperator("L");
        org.apache.pdfbox.contentstream.operator.DrawObject drawObject15 = new org.apache.pdfbox.contentstream.operator.DrawObject();
        org.apache.pdfbox.contentstream.operator.Operator operator16 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm17 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox18 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm17);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary19 = pDCheckBox18.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup20 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary19);
        java.lang.String[] str_array22 = new java.lang.String[] { "270" };
        org.apache.pdfbox.cos.COSBase cOSBase23 = cOSDictionary19.getDictionaryObject(str_array22);
        java.util.Calendar calendar25 = cOSDictionary19.getDate("180");
        org.apache.pdfbox.cos.COSName cOSName26 = org.apache.pdfbox.cos.COSName.SHADING_TYPE;
        org.apache.pdfbox.cos.COSName cOSName27 = org.apache.pdfbox.cos.COSName.TYPE1;
        int i28 = cOSDictionary19.getInt(cOSName26, cOSName27);
        org.apache.pdfbox.cos.COSName cOSName29 = org.apache.pdfbox.cos.COSName.BLEED_BOX;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm30 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox31 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm30);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary32 = pDCheckBox31.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary33 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary32);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie pDActionMovie34 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie(cOSDictionary32);
        org.apache.pdfbox.pdmodel.fdf.FDFPageInfo fDFPageInfo35 = new org.apache.pdfbox.pdmodel.fdf.FDFPageInfo(cOSDictionary32);
        org.apache.pdfbox.cos.COSName cOSName36 = org.apache.pdfbox.cos.COSName.LEGAL_ATTESTATION;
        org.apache.pdfbox.cos.COSName cOSName37 = org.apache.pdfbox.cos.COSName.OVERLAY;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm38 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox39 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm38);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary40 = pDCheckBox39.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo pDMarkInfo41 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo(cOSDictionary40);
        cOSDictionary40.setInt("JavaScript", 10);
        org.apache.pdfbox.cos.COSName cOSName45 = org.apache.pdfbox.cos.COSName.TYPE3;
        org.apache.pdfbox.cos.COSName cOSName46 = org.apache.pdfbox.cos.COSName.TYPE1;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm47 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox48 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm47);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary49 = pDCheckBox48.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary50 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary49);
        org.apache.pdfbox.cos.COSDocument cOSDocument51 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey52 = null;
        org.apache.pdfbox.cos.COSObject cOSObject53 = cOSDocument51.getObjectFromPool(cOSObjectKey52);
        org.apache.pdfbox.cos.COSName cOSName54 = org.apache.pdfbox.cos.COSName.CL;
        org.apache.pdfbox.cos.COSObject cOSObject55 = cOSDocument51.getObjectByType(cOSName54);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm56 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox57 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm56);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary58 = pDCheckBox57.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary59 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary58);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine60 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary59);
        long long62 = cOSDictionary59.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed63 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary59);
        java.lang.String str66 = cOSDictionary59.getEmbeddedString("sc", "After");
        cOSDocument51.setTrailer(cOSDictionary59);
        org.apache.pdfbox.cos.COSName cOSName69 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.FILTER_VERISIGN_PPKVS;
        cOSDictionary59.setEmbeddedInt("Index", cOSName69, (int) 'a');
        org.apache.pdfbox.cos.COSName cOSName72 = org.apache.pdfbox.cos.COSName.SET_FF;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm73 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox74 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm73);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary75 = pDCheckBox74.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject pDTableAttributeObject76 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject(cOSDictionary75);
        org.apache.pdfbox.cos.COSName cOSName77 = org.apache.pdfbox.cos.COSName.ROWS;
        org.apache.pdfbox.cos.COSBase[] cOSBase_array78 = new org.apache.pdfbox.cos.COSBase[] { cOSDictionary19, cOSName29, cOSDictionary32, cOSName36, cOSName37, cOSDictionary40, cOSName45, cOSName46, cOSDictionary50, cOSDictionary59, cOSName72, cOSDictionary75, cOSName77 };
        java.util.ArrayList<org.apache.pdfbox.cos.COSBase> arraylist_cOSBase79 = new java.util.ArrayList<org.apache.pdfbox.cos.COSBase>();
        boolean b80 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase79, cOSBase_array78);
        drawObject15.process(operator16, (java.util.List<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase79);
        org.apache.pdfbox.contentstream.operator.MissingOperandException missingOperandException82 = new org.apache.pdfbox.contentstream.operator.MissingOperandException(operator14, (java.util.List<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase79);
        byte[] byte_array83 = org.apache.pdfbox.pdfwriter.COSWriter.STREAM;
        operator14.setImageData(byte_array83);
        try {
            boolean b88 = standardSecurityHandler5.isOwnerPassword("Stamp", byte_array7, byte_array10, 1, byte_array83, 100, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "270" + "'", str4.equals("270"));
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(operator14);
        org.junit.Assert.assertNotNull(cOSDictionary19);
        org.junit.Assert.assertNotNull(str_array22);
        org.junit.Assert.assertNull(cOSBase23);
        org.junit.Assert.assertNull(calendar25);
        org.junit.Assert.assertNotNull(cOSName26);
        org.junit.Assert.assertNotNull(cOSName27);
        org.junit.Assert.assertTrue(i28 == (-1));
        org.junit.Assert.assertNotNull(cOSName29);
        org.junit.Assert.assertNotNull(cOSDictionary32);
        org.junit.Assert.assertNotNull(cOSName36);
        org.junit.Assert.assertNotNull(cOSName37);
        org.junit.Assert.assertNotNull(cOSDictionary40);
        org.junit.Assert.assertNotNull(cOSName45);
        org.junit.Assert.assertNotNull(cOSName46);
        org.junit.Assert.assertNotNull(cOSDictionary49);
        org.junit.Assert.assertNotNull(cOSObject53);
        org.junit.Assert.assertNotNull(cOSName54);
        org.junit.Assert.assertNull(cOSObject55);
        org.junit.Assert.assertNotNull(cOSDictionary58);
        org.junit.Assert.assertTrue(long62 == (-1L));
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(cOSName69);
        org.junit.Assert.assertNotNull(cOSName72);
        org.junit.Assert.assertNotNull(cOSDictionary75);
        org.junit.Assert.assertNotNull(cOSName77);
        org.junit.Assert.assertNotNull(cOSBase_array78);
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertNotNull(byte_array83);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test355");
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitWidthDestination pDPageFitWidthDestination0 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitWidthDestination();
        int i1 = pDPageFitWidthDestination0.getTop();
        org.junit.Assert.assertTrue(i1 == (-1));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test356");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CREATION_DATE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test357");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType6 pDShadingType6_1 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType6(cOSDictionary0);
        try {
            pDShadingType6_1.setBitsPerCoordinate(3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test358");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.HEIGHT_AUTO;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Auto" + "'", str0.equals("Auto"));
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test359");
        org.apache.pdfbox.cos.COSDocument cOSDocument0 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey1 = null;
        org.apache.pdfbox.cos.COSObject cOSObject2 = cOSDocument0.getObjectFromPool(cOSObjectKey1);
        org.apache.pdfbox.cos.COSName cOSName3 = org.apache.pdfbox.cos.COSName.CL;
        org.apache.pdfbox.cos.COSObject cOSObject4 = cOSDocument0.getObjectByType(cOSName3);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm5 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox6 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm5);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = pDCheckBox6.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary8 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary7);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine9 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary8);
        long long11 = cOSDictionary8.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed12 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary8);
        java.lang.String str15 = cOSDictionary8.getEmbeddedString("sc", "After");
        cOSDocument0.setTrailer(cOSDictionary8);
        org.apache.pdfbox.cos.COSName cOSName18 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.FILTER_VERISIGN_PPKVS;
        cOSDictionary8.setEmbeddedInt("Index", cOSName18, (int) 'a');
        org.apache.pdfbox.cos.COSName cOSName21 = org.apache.pdfbox.cos.COSName.BASE_ENCODING;
        cOSDictionary8.setBoolean(cOSName21, false);
        cOSDictionary8.setNeedToBeUpdated(false);
        org.apache.pdfbox.io.RandomAccessBuffer randomAccessBuffer26 = new org.apache.pdfbox.io.RandomAccessBuffer();
        boolean b27 = randomAccessBuffer26.isClosed();
        byte[] byte_array28 = org.apache.pdfbox.pdfwriter.COSWriter.ENDSTREAM;
        int i31 = randomAccessBuffer26.read(byte_array28, (int) '4', (int) ' ');
        java.lang.String str32 = org.apache.pdfbox.util.Hex.getString(byte_array28);
        org.apache.pdfbox.pdmodel.PDResources pDResources33 = null;
        org.apache.pdfbox.pdmodel.graphics.image.PDInlineImage pDInlineImage34 = new org.apache.pdfbox.pdmodel.graphics.image.PDInlineImage(cOSDictionary8, byte_array28, pDResources33);
        java.util.List<java.lang.String> list_str35 = pDInlineImage34.getFilters();
        org.junit.Assert.assertNotNull(cOSObject2);
        org.junit.Assert.assertNotNull(cOSName3);
        org.junit.Assert.assertNull(cOSObject4);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertTrue(long11 == (-1L));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(cOSName18);
        org.junit.Assert.assertNotNull(cOSName21);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(byte_array28);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "656E6473747265616D" + "'", str32.equals("656E6473747265616D"));
        org.junit.Assert.assertNull(list_str35);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test360");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor5 = pDAnnotationLine4.getInteriorColor();
        pDAnnotationLine4.setReplyType("Before");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation pDAnnotation8 = pDAnnotationLine4.getInReplyTo();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup9 = pDAnnotationLine4.getPopup();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(pDColor5);
        org.junit.Assert.assertNull(pDAnnotation8);
        org.junit.Assert.assertNull(pDAnnotationPopup9);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test361");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        long long6 = cOSDictionary3.getLong("Note");
        org.apache.pdfbox.pdmodel.encryption.PDEncryption pDEncryption7 = new org.apache.pdfbox.pdmodel.encryption.PDEncryption(cOSDictionary3);
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission10 = null;
        org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy standardProtectionPolicy11 = new org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy("270", "PushPin", accessPermission10);
        java.lang.String str12 = standardProtectionPolicy11.getOwnerPassword();
        org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler standardSecurityHandler13 = new org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler(standardProtectionPolicy11);
        pDEncryption7.setSecurityHandler((org.apache.pdfbox.pdmodel.encryption.SecurityHandler) standardSecurityHandler13);
        standardSecurityHandler13.setAES(true);
        int i17 = standardSecurityHandler13.getKeyLength();
        boolean b18 = standardSecurityHandler13.hasProtectionPolicy();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm19 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox20 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm19);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary21 = pDCheckBox20.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary22 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary21);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink pDAnnotationLink23 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink(cOSDictionary22);
        org.apache.pdfbox.io.ScratchFile scratchFile24 = null;
        org.apache.pdfbox.cos.COSStream cOSStream25 = new org.apache.pdfbox.cos.COSStream(scratchFile24);
        cOSDictionary22.mergeInto((org.apache.pdfbox.cos.COSDictionary) cOSStream25);
        try {
            standardSecurityHandler13.decryptStream(cOSStream25, (long) 97, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "270" + "'", str12.equals("270"));
        org.junit.Assert.assertTrue(i17 == 40);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(cOSDictionary21);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test362");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        org.apache.pdfbox.util.Matrix matrix7 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray8 = matrix7.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix9 = matrix7.extractScaling();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm10 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox11 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary12 = pDCheckBox11.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary13 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary12);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine14 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary13);
        long long16 = cOSDictionary13.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed17 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary13);
        boolean b18 = matrix7.equals((java.lang.Object) cOSDictionary13);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp pDSeedValueTimeStamp19 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp(cOSDictionary13);
        org.apache.pdfbox.pdmodel.PDDocumentCatalog pDDocumentCatalog20 = new org.apache.pdfbox.pdmodel.PDDocumentCatalog(pDDocument0, cOSDictionary13);
        org.apache.pdfbox.pdmodel.common.PDDestinationOrAction pDDestinationOrAction21 = pDDocumentCatalog20.getOpenAction();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument22 = null;
        org.apache.pdfbox.util.Matrix matrix29 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray30 = matrix29.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix31 = matrix29.extractScaling();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm32 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox33 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm32);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary34 = pDCheckBox33.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary35 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary34);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine36 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary35);
        long long38 = cOSDictionary35.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed39 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary35);
        boolean b40 = matrix29.equals((java.lang.Object) cOSDictionary35);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp pDSeedValueTimeStamp41 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp(cOSDictionary35);
        org.apache.pdfbox.pdmodel.PDDocumentCatalog pDDocumentCatalog42 = new org.apache.pdfbox.pdmodel.PDDocumentCatalog(pDDocument22, cOSDictionary35);
        org.apache.pdfbox.pdmodel.common.PDDestinationOrAction pDDestinationOrAction43 = pDDocumentCatalog42.getOpenAction();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary44 = pDDocumentCatalog42.getCOSObject();
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata45 = pDDocumentCatalog42.getMetadata();
        org.apache.pdfbox.pdmodel.graphics.color.PDOutputIntent[] pDOutputIntent_array46 = new org.apache.pdfbox.pdmodel.graphics.color.PDOutputIntent[] {};
        java.util.ArrayList<org.apache.pdfbox.pdmodel.graphics.color.PDOutputIntent> arraylist_pDOutputIntent47 = new java.util.ArrayList<org.apache.pdfbox.pdmodel.graphics.color.PDOutputIntent>();
        boolean b48 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.pdmodel.graphics.color.PDOutputIntent>) arraylist_pDOutputIntent47, pDOutputIntent_array46);
        pDDocumentCatalog42.setOutputIntents((java.util.List<org.apache.pdfbox.pdmodel.graphics.color.PDOutputIntent>) arraylist_pDOutputIntent47);
        org.apache.pdfbox.pdmodel.PageMode pageMode50 = pDDocumentCatalog42.getPageMode();
        pDDocumentCatalog20.setPageMode(pageMode50);
        org.junit.Assert.assertNotNull(cOSArray8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(cOSDictionary12);
        org.junit.Assert.assertTrue(long16 == (-1L));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(pDDestinationOrAction21);
        org.junit.Assert.assertNotNull(cOSArray30);
        org.junit.Assert.assertNotNull(matrix31);
        org.junit.Assert.assertNotNull(cOSDictionary34);
        org.junit.Assert.assertTrue(long38 == (-1L));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(pDDestinationOrAction43);
        org.junit.Assert.assertNotNull(cOSDictionary44);
        org.junit.Assert.assertNull(pDMetadata45);
        org.junit.Assert.assertNotNull(pDOutputIntent_array46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + pageMode50 + "' != '" + org.apache.pdfbox.pdmodel.PageMode.USE_NONE + "'", pageMode50.equals(org.apache.pdfbox.pdmodel.PageMode.USE_NONE));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test363");
        float[] f_array6 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray8 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i9 = pDDeviceGray8.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor10 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array6, cOSName7, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray8);
        org.apache.pdfbox.cos.COSArray cOSArray11 = pDColor10.toCOSArray();
        org.apache.pdfbox.cos.COSName cOSName12 = org.apache.pdfbox.cos.COSName.RESOURCES;
        cOSArray11.add((org.apache.pdfbox.pdmodel.common.COSObjectable) cOSName12);
        cOSArray11.growToSize((-1));
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm16 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox17 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm16);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary18 = pDCheckBox17.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary19 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary18);
        boolean b20 = cOSArray11.remove((org.apache.pdfbox.cos.COSBase) cOSDictionary19);
        org.apache.pdfbox.cos.COSName cOSName21 = org.apache.pdfbox.cos.COSName.CROP_BOX;
        boolean b23 = cOSDictionary19.getFlag(cOSName21, (int) (byte) 10);
        org.junit.Assert.assertNotNull(f_array6);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(pDDeviceGray8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(cOSArray11);
        org.junit.Assert.assertNotNull(cOSName12);
        org.junit.Assert.assertNotNull(cOSDictionary18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(cOSName21);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test364");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.BLACK_IS_1;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test365");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.action.PDActionHide.SUB_TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Hide" + "'", str0.equals("Hide"));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test366");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.COURIER_BOLD_OBLIQUE;
        byte[] byte_array2 = pDType1Font0.encode("Slash");
        float f3 = pDType1Font0.getAverageFontWidth();
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertNotNull(byte_array2);
        org.junit.Assert.assertTrue(f3 == 600.0f);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test367");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCaret fDFAnnotationCaret0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCaret();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup1 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar2 = null;
        pDAnnotationPopup1.setModifiedDate(calendar2);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup1.setRectangle(pDRectangle4);
        org.apache.pdfbox.pdmodel.PDPage pDPage6 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle4);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream7 = pDPage6.getContentStreams();
        org.apache.pdfbox.cos.COSStream cOSStream8 = null;
        org.apache.pdfbox.pdmodel.common.PDStream pDStream9 = new org.apache.pdfbox.pdmodel.common.PDStream(cOSStream8);
        org.apache.pdfbox.pdmodel.common.PDStream[] pDStream_array10 = new org.apache.pdfbox.pdmodel.common.PDStream[] { pDStream9 };
        java.util.ArrayList<org.apache.pdfbox.pdmodel.common.PDStream> arraylist_pDStream11 = new java.util.ArrayList<org.apache.pdfbox.pdmodel.common.PDStream>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.pdmodel.common.PDStream>) arraylist_pDStream11, pDStream_array10);
        pDPage6.setContents((java.util.List<org.apache.pdfbox.pdmodel.common.PDStream>) arraylist_pDStream11);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup14 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar15 = null;
        pDAnnotationPopup14.setModifiedDate(calendar15);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle17 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup14.setRectangle(pDRectangle17);
        org.apache.pdfbox.pdmodel.PDPage pDPage19 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle17);
        pDPage6.setMediaBox(pDRectangle17);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle21 = pDPage6.getCropBox();
        fDFAnnotationCaret0.setFringe(pDRectangle21);
        org.apache.pdfbox.cos.COSArray cOSArray23 = pDRectangle21.getCOSArray();
        try {
            org.apache.pdfbox.util.Matrix matrix24 = new org.apache.pdfbox.util.Matrix(cOSArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle4);
        org.junit.Assert.assertNotNull(iterator_pDStream7);
        org.junit.Assert.assertNotNull(pDStream_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(pDRectangle17);
        org.junit.Assert.assertNotNull(pDRectangle21);
        org.junit.Assert.assertNotNull(cOSArray23);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test368");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle.SUB_TYPE_CIRCLE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Circle" + "'", str0.equals("Circle"));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test369");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.COURIER_BOLD_OBLIQUE;
        boolean b1 = pDType1Font0.isVertical();
        org.apache.fontbox.FontBoxFont fontBoxFont2 = pDType1Font0.getFontBoxFont();
        org.apache.pdfbox.util.Matrix matrix3 = pDType1Font0.getFontMatrix();
        boolean b4 = pDType1Font0.isSymbolic();
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(fontBoxFont2);
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test370");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationRubberStamp.NAME_APPROVED;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Approved" + "'", str0.equals("Approved"));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test371");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.COURIER_OBLIQUE;
        org.junit.Assert.assertNotNull(pDType1Font0);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test372");
        org.apache.pdfbox.text.PDFTextStripper pDFTextStripper0 = new org.apache.pdfbox.text.PDFTextStripper();
        try {
            pDFTextStripper0.restoreGraphicsState();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test373");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.PRINT_SCALING;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test374");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.END_OF_LINE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test375");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        float f1 = pDRectangle0.getLowerLeftY();
        pDRectangle0.setLowerLeftY((float) (short) -1);
        org.junit.Assert.assertNotNull(pDRectangle0);
        org.junit.Assert.assertTrue(f1 == 0.0f);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test376");
        org.apache.pdfbox.pdfparser.XrefTrailerResolver xrefTrailerResolver0 = new org.apache.pdfbox.pdfparser.XrefTrailerResolver();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = xrefTrailerResolver0.getLastTrailer();
        int i2 = xrefTrailerResolver0.getTrailerCount();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = xrefTrailerResolver0.getLastTrailer();
        org.junit.Assert.assertNull(cOSDictionary1);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(cOSDictionary3);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test377");
        org.apache.pdfbox.pdmodel.interactive.action.PDAnnotationAdditionalActions pDAnnotationAdditionalActions0 = new org.apache.pdfbox.pdmodel.interactive.action.PDAnnotationAdditionalActions();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction1 = pDAnnotationAdditionalActions0.getPO();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction2 = pDAnnotationAdditionalActions0.getU();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction3 = null;
        pDAnnotationAdditionalActions0.setD(pDAction3);
        org.junit.Assert.assertNull(pDAction1);
        org.junit.Assert.assertNull(pDAction2);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test378");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink pDAnnotationLink4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline5 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary3);
        java.lang.String str6 = fDFAnnotationPolyline5.getStartPointEndingStyle();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "None" + "'", str6.equals("None"));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test379");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject.OWNER_USER_PROPERTIES;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UserProperties" + "'", str0.equals("UserProperties"));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test380");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DOS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test381");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.fdf.FDFIconFit.SCALE_TYPE_ANAMORPHIC;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "A" + "'", str0.equals("A"));
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test382");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject pDLayoutAttributeObject0 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject();
        pDLayoutAttributeObject0.setEndIndent((int) (byte) 100);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test383");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.T;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test384");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSBase cOSBase5 = cOSDictionary2.getDictionaryObject("PushPin");
        org.apache.pdfbox.pdmodel.encryption.PDEncryption pDEncryption6 = new org.apache.pdfbox.pdmodel.encryption.PDEncryption(cOSDictionary2);
        cOSDictionary2.setEmbeddedString("D", "LowerAlpha", "");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent11 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject pDListAttributeObject12 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionURI pDActionURI13 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionURI(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName14 = org.apache.pdfbox.cos.COSName.ANNOT;
        org.apache.pdfbox.cos.COSName cOSName15 = org.apache.pdfbox.cos.COSName.CENTER_WINDOW;
        boolean b17 = cOSDictionary2.getBoolean(cOSName14, cOSName15, false);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(cOSBase5);
        org.junit.Assert.assertNotNull(cOSName14);
        org.junit.Assert.assertNotNull(cOSName15);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test385");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink pDAnnotationLink4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction5 = pDAnnotationLink4.getAction();
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDDestination pDDestination6 = pDAnnotationLink4.getDestination();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(pDAction5);
        org.junit.Assert.assertNull(pDDestination6);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test386");
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting1 = org.apache.pdfbox.io.MemoryUsageSetting.setupMixed((long) 10);
        boolean b2 = memoryUsageSetting1.useMainMemory();
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting4 = memoryUsageSetting1.getPartitionedCopy((int) (short) 100);
        java.io.File file5 = memoryUsageSetting4.getTempDir();
        boolean b6 = memoryUsageSetting4.isStorageRestricted();
        org.junit.Assert.assertNotNull(memoryUsageSetting1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(memoryUsageSetting4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test387");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup1 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar2 = null;
        pDAnnotationPopup1.setModifiedDate(calendar2);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup1.setRectangle(pDRectangle4);
        org.apache.pdfbox.pdmodel.PDPage pDPage6 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle4);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream7 = pDPage6.getContentStreams();
        org.apache.pdfbox.pdmodel.PDResources pDResources8 = pDPage6.getResources();
        java.io.InputStream inputStream9 = pDPage6.getContents();
        try {
            org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner pDVisibleSignDesigner11 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner("I", inputStream9, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle4);
        org.junit.Assert.assertNotNull(iterator_pDStream7);
        org.junit.Assert.assertNull(pDResources8);
        org.junit.Assert.assertNotNull(inputStream9);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test388");
        org.apache.pdfbox.cos.COSStream cOSStream0 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction1 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction((org.apache.pdfbox.cos.COSDictionary) cOSStream0);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream2 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream0);
        org.apache.pdfbox.util.Matrix matrix3 = pDAppearanceStream2.getMatrix();
        org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroupAttributes pDTransparencyGroupAttributes4 = pDAppearanceStream2.getGroup();
        org.junit.Assert.assertNull(pDAction1);
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertNull(pDTransparencyGroupAttributes4);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test389");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary pDRectlinearMeasureDictionary1 = new org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary(cOSDictionary0);
        try {
            java.lang.String str2 = pDRectlinearMeasureDictionary1.getScaleRatio();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test390");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DIFFERENCES;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test391");
        org.apache.pdfbox.pdmodel.graphics.color.PDLab pDLab0 = new org.apache.pdfbox.pdmodel.graphics.color.PDLab();
        org.apache.pdfbox.pdmodel.graphics.color.PDTristimulus pDTristimulus1 = null;
        try {
            pDLab0.setWhitePoint(pDTristimulus1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test392");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine fDFAnnotationLine5 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine(cOSDictionary3);
        float f6 = fDFAnnotationLine5.getLeaderOffset();
        fDFAnnotationLine5.setCaptionStyle("Justify");
        java.awt.Color color9 = fDFAnnotationLine5.getColor();
        fDFAnnotationLine5.setNoRotate(true);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(f6 == (-1.0f));
        org.junit.Assert.assertNull(color9);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test393");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject.OWNER_HTML_4_01;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "HTML-4.01" + "'", str0.equals("HTML-4.01"));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test394");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject.OWNER_TABLE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Table" + "'", str0.equals("Table"));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test395");
        org.apache.pdfbox.cos.COSDocument cOSDocument0 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey1 = null;
        org.apache.pdfbox.cos.COSObject cOSObject2 = cOSDocument0.getObjectFromPool(cOSObjectKey1);
        org.apache.pdfbox.cos.COSName cOSName3 = org.apache.pdfbox.cos.COSName.CL;
        org.apache.pdfbox.cos.COSObject cOSObject4 = cOSDocument0.getObjectByType(cOSName3);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm5 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox6 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm5);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = pDCheckBox6.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary8 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary7);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine9 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary8);
        long long11 = cOSDictionary8.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed12 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary8);
        java.lang.String str15 = cOSDictionary8.getEmbeddedString("sc", "After");
        cOSDocument0.setTrailer(cOSDictionary8);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument17 = new org.apache.pdfbox.pdmodel.PDDocument(cOSDocument0);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature pDSignature18 = null;
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions signatureOptions19 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions();
        int i20 = signatureOptions19.getPage();
        signatureOptions19.setPage(8);
        try {
            pDDocument17.addSignature(pDSignature18, signatureOptions19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSObject2);
        org.junit.Assert.assertNotNull(cOSName3);
        org.junit.Assert.assertNull(cOSObject4);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertTrue(long11 == (-1L));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test396");
        org.apache.pdfbox.pdmodel.graphics.color.PDLab pDLab0 = new org.apache.pdfbox.pdmodel.graphics.color.PDLab();
        org.apache.pdfbox.pdmodel.graphics.color.PDTristimulus pDTristimulus1 = pDLab0.getWhitepoint();
        org.junit.Assert.assertNotNull(pDTristimulus1);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test397");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionSound pDActionSound0 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionSound();
        pDActionSound0.setSynchronous(false);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test398");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ACTUAL_TEXT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test399");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar1 = null;
        pDAnnotationPopup0.setModifiedDate(calendar1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup0.setRectangle(pDRectangle3);
        org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState pDGraphicsState5 = new org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState(pDRectangle3);
        org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace6 = pDGraphicsState5.getStrokingColorSpace();
        boolean b7 = pDGraphicsState5.isAlphaSource();
        org.apache.pdfbox.pdmodel.graphics.state.RenderingIntent renderingIntent8 = org.apache.pdfbox.pdmodel.graphics.state.RenderingIntent.RELATIVE_COLORIMETRIC;
        pDGraphicsState5.setRenderingIntent(renderingIntent8);
        org.junit.Assert.assertNotNull(pDRectangle3);
        org.junit.Assert.assertNotNull(pDColorSpace6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + renderingIntent8 + "' != '" + org.apache.pdfbox.pdmodel.graphics.state.RenderingIntent.RELATIVE_COLORIMETRIC + "'", renderingIntent8.equals(org.apache.pdfbox.pdmodel.graphics.state.RenderingIntent.RELATIVE_COLORIMETRIC));
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test400");
        org.apache.pdfbox.pdmodel.font.encoding.MacExpertEncoding macExpertEncoding0 = new org.apache.pdfbox.pdmodel.font.encoding.MacExpertEncoding();
        java.lang.String str1 = macExpertEncoding0.getEncodingName();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "MacExpertEncoding" + "'", str1.equals("MacExpertEncoding"));
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test401");
        org.apache.pdfbox.pdmodel.interactive.action.PDAnnotationAdditionalActions pDAnnotationAdditionalActions0 = new org.apache.pdfbox.pdmodel.interactive.action.PDAnnotationAdditionalActions();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction1 = pDAnnotationAdditionalActions0.getE();
        org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions pDFormFieldAdditionalActions2 = new org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions();
        org.apache.pdfbox.pdmodel.interactive.action.PDActionSound pDActionSound3 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionSound();
        pDActionSound3.setVolume((float) (byte) 1);
        pDFormFieldAdditionalActions2.setC((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionSound3);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionSound pDActionSound7 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionSound();
        float f8 = pDActionSound7.getVolume();
        pDFormFieldAdditionalActions2.setF((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionSound7);
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction10 = pDFormFieldAdditionalActions2.getC();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction11 = pDFormFieldAdditionalActions2.getK();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm12 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox13 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm12);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary14 = pDCheckBox13.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup15 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary14);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionRemoteGoTo pDActionRemoteGoTo16 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionRemoteGoTo(cOSDictionary14);
        org.apache.pdfbox.pdmodel.common.filespecification.PDSimpleFileSpecification pDSimpleFileSpecification17 = new org.apache.pdfbox.pdmodel.common.filespecification.PDSimpleFileSpecification();
        pDActionRemoteGoTo16.setFile((org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification) pDSimpleFileSpecification17);
        pDFormFieldAdditionalActions2.setC((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionRemoteGoTo16);
        pDActionRemoteGoTo16.setOpenInNewWindow(true);
        pDAnnotationAdditionalActions0.setPV((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionRemoteGoTo16);
        org.junit.Assert.assertNull(pDAction1);
        org.junit.Assert.assertTrue(f8 == 1.0f);
        org.junit.Assert.assertNotNull(pDAction10);
        org.junit.Assert.assertNull(pDAction11);
        org.junit.Assert.assertNotNull(cOSDictionary14);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test402");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary();
        org.apache.pdfbox.cos.COSStream cOSStream1 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction2 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction((org.apache.pdfbox.cos.COSDictionary) cOSStream1);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream1);
        pDAppearanceDictionary0.setNormalAppearance(pDAppearanceStream3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream pDAppearanceContentStream5 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream(pDAppearanceStream3);
        org.apache.pdfbox.pdmodel.PDResources pDResources6 = null;
        pDAppearanceContentStream5.setResources(pDResources6);
        pDAppearanceContentStream5.moveTo((float) 4, (float) (byte) 1);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm11 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox12 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm11);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary13 = pDCheckBox12.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary14 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary13);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine15 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary14);
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding16 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary14);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline17 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary14);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_18 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary14);
        org.apache.pdfbox.util.Matrix matrix25 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray26 = matrix25.toCOSArray();
        pDShadingType3_18.setDomain(cOSArray26);
        float[] f_array34 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName35 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray36 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i37 = pDDeviceGray36.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor38 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array34, cOSName35, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray36);
        org.apache.pdfbox.cos.COSArray cOSArray39 = pDColor38.toCOSArray();
        org.apache.pdfbox.cos.COSName cOSName40 = org.apache.pdfbox.cos.COSName.RESOURCES;
        cOSArray39.add((org.apache.pdfbox.pdmodel.common.COSObjectable) cOSName40);
        pDShadingType3_18.setDomain(cOSArray39);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary43 = pDShadingType3_18.getCOSObject();
        pDShadingType3_18.setAntiAlias(true);
        org.apache.pdfbox.cos.COSArray cOSArray46 = pDShadingType3_18.getBackground();
        try {
            pDAppearanceContentStream5.shadingFill((org.apache.pdfbox.pdmodel.graphics.shading.PDShading) pDShadingType3_18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(pDAction2);
        org.junit.Assert.assertNotNull(cOSDictionary13);
        org.junit.Assert.assertNotNull(cOSArray26);
        org.junit.Assert.assertNotNull(f_array34);
        org.junit.Assert.assertNotNull(cOSName35);
        org.junit.Assert.assertNotNull(pDDeviceGray36);
        org.junit.Assert.assertTrue(i37 == 1);
        org.junit.Assert.assertNotNull(cOSArray39);
        org.junit.Assert.assertNotNull(cOSName40);
        org.junit.Assert.assertNotNull(cOSDictionary43);
        org.junit.Assert.assertNull(cOSArray46);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test403");
        byte[] byte_array0 = org.apache.pdfbox.pdfwriter.COSStandardOutputStream.LF;
        org.apache.pdfbox.pdfparser.PDFStreamParser pDFStreamParser1 = new org.apache.pdfbox.pdfparser.PDFStreamParser(byte_array0);
        org.junit.Assert.assertNotNull(byte_array0);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test404");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        long long6 = cOSDictionary3.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed7 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFField fDFField8 = new org.apache.pdfbox.pdmodel.fdf.FDFField(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary9 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary();
        fDFField8.setAppearanceDictionary(pDAppearanceDictionary9);
        fDFField8.setFieldFlags((int) (short) -1);
        java.lang.Integer i13 = fDFField8.getWidgetFieldFlags();
        java.lang.Integer i14 = fDFField8.getClearWidgetFieldFlags();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNull(i14);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test405");
        java.nio.charset.Charset charset0 = org.apache.pdfbox.util.Charsets.UTF_16BE;
        org.junit.Assert.assertNotNull(charset0);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test406");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CLR_F;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test407");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationRubberStamp.NAME_SOLD;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Sold" + "'", str0.equals("Sold"));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test408");
        org.apache.pdfbox.pdmodel.graphics.color.PDLab pDLab0 = new org.apache.pdfbox.pdmodel.graphics.color.PDLab();
        java.lang.String str1 = pDLab0.getName();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Lab" + "'", str1.equals("Lab"));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test409");
        org.apache.pdfbox.contentstream.operator.graphics.CloseFillEvenOddAndStrokePath closeFillEvenOddAndStrokePath0 = new org.apache.pdfbox.contentstream.operator.graphics.CloseFillEvenOddAndStrokePath();
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test410");
        org.apache.pdfbox.util.Matrix matrix6 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray7 = matrix6.toCOSArray();
        java.util.Iterator<org.apache.pdfbox.cos.COSBase> iterator_cOSBase8 = cOSArray7.iterator();
        org.junit.Assert.assertNotNull(cOSArray7);
        org.junit.Assert.assertNotNull(iterator_cOSBase8);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test411");
        org.apache.pdfbox.text.PDFTextStripper pDFTextStripper0 = new org.apache.pdfbox.text.PDFTextStripper();
        java.lang.String str1 = pDFTextStripper0.getWordSeparator();
        float f2 = pDFTextStripper0.getIndentThreshold();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm3 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox4 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm3);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary5 = pDCheckBox4.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary6 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary5);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine7 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary6);
        pDFTextStripper0.showAnnotation((org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) pDAnnotationLine7);
        org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup pDTransparencyGroup9 = null;
        try {
            pDFTextStripper0.showTransparencyGroup(pDTransparencyGroup9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + " " + "'", str1.equals(" "));
        org.junit.Assert.assertTrue(f2 == 2.0f);
        org.junit.Assert.assertNotNull(cOSDictionary5);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test412");
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY bOUNDARY0 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY.CropBox;
        org.junit.Assert.assertTrue("'" + bOUNDARY0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY.CropBox + "'", bOUNDARY0.equals(org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY.CropBox));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test413");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        float f2 = pDExportFormatAttributeObject1.getBaselineShift();
        pDExportFormatAttributeObject1.setBlockAlign("ImportData");
        pDExportFormatAttributeObject1.setWidthAuto();
        char[] char_array7 = org.apache.pdfbox.util.Hex.getChars((short) (byte) -1);
        boolean b8 = pDExportFormatAttributeObject1.equals((java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue(f2 == 0.0f);
        org.junit.Assert.assertNotNull(char_array7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test414");
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission0 = org.apache.pdfbox.pdmodel.encryption.AccessPermission.getOwnerAccessPermission();
        accessPermission0.setCanExtractContent(true);
        int i3 = accessPermission0.getPermissionBytes();
        org.junit.Assert.assertNotNull(accessPermission0);
        org.junit.Assert.assertTrue(i3 == (-4));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test415");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        org.apache.pdfbox.util.Matrix matrix7 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray8 = matrix7.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix9 = matrix7.extractScaling();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm10 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox11 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary12 = pDCheckBox11.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary13 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary12);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine14 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary13);
        long long16 = cOSDictionary13.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed17 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary13);
        boolean b18 = matrix7.equals((java.lang.Object) cOSDictionary13);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp pDSeedValueTimeStamp19 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp(cOSDictionary13);
        org.apache.pdfbox.pdmodel.PDDocumentCatalog pDDocumentCatalog20 = new org.apache.pdfbox.pdmodel.PDDocumentCatalog(pDDocument0, cOSDictionary13);
        org.apache.pdfbox.pdmodel.graphics.color.PDOutputIntent pDOutputIntent21 = null;
        try {
            pDDocumentCatalog20.addOutputIntent(pDOutputIntent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSArray8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(cOSDictionary12);
        org.junit.Assert.assertTrue(long16 == (-1L));
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test416");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquiggly.SUBTYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Squiggly" + "'", str0.equals("Squiggly"));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test417");
        byte[] byte_array0 = org.apache.pdfbox.pdfwriter.COSWriter.DICT_CLOSE;
        org.junit.Assert.assertNotNull(byte_array0);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test418");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ID;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test419");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.interactive.measurement.PDViewportDictionary pDViewportDictionary1 = new org.apache.pdfbox.pdmodel.interactive.measurement.PDViewportDictionary(cOSDictionary0);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test420");
        org.apache.pdfbox.cos.COSInteger cOSInteger0 = org.apache.pdfbox.cos.COSNumber.ONE;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm1 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox2 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm1);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = pDCheckBox2.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary3);
        boolean b5 = cOSInteger0.equals((java.lang.Object) pDAnnotationTextMarkup4);
        java.lang.String str6 = pDAnnotationTextMarkup4.getIntent();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDExternalDataDictionary pDExternalDataDictionary7 = pDAnnotationTextMarkup4.getExternalData();
        org.junit.Assert.assertNotNull(cOSInteger0);
        org.junit.Assert.assertNotNull(cOSDictionary3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(pDExternalDataDictionary7);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test421");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink pDAnnotationLink4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline5 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight fDFAnnotationHighlight6 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight(cOSDictionary3);
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.ANNOT;
        org.apache.pdfbox.cos.COSBase cOSBase8 = org.apache.pdfbox.pdmodel.PDPageTree.getInheritableAttribute(cOSDictionary3, cOSName7);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionHide pDActionHide9 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionHide(cOSDictionary3);
        boolean b10 = pDActionHide9.getH();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNull(cOSBase8);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test422");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.LOCATION;
        cOSDictionary3.removeItem(cOSName4);
        org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font6 = null;
        org.apache.pdfbox.pdmodel.font.PDCIDFontType0 pDCIDFontType0_7 = new org.apache.pdfbox.pdmodel.font.PDCIDFontType0(cOSDictionary3, pDType0Font6);
        org.apache.fontbox.cff.CFFFont cFFFont8 = pDCIDFontType0_7.getCFFFont();
        org.apache.pdfbox.pdmodel.font.PDCIDSystemInfo pDCIDSystemInfo9 = pDCIDFontType0_7.getCIDSystemInfo();
        try {
            java.awt.geom.GeneralPath generalPath11 = pDCIDFontType0_7.getNormalizedPath(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(cFFFont8);
        org.junit.Assert.assertNull(pDCIDSystemInfo9);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test423");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        long long6 = cOSDictionary3.getLong("Note");
        org.apache.pdfbox.pdmodel.encryption.PDEncryption pDEncryption7 = new org.apache.pdfbox.pdmodel.encryption.PDEncryption(cOSDictionary3);
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission10 = null;
        org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy standardProtectionPolicy11 = new org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy("270", "PushPin", accessPermission10);
        java.lang.String str12 = standardProtectionPolicy11.getOwnerPassword();
        org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler standardSecurityHandler13 = new org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler(standardProtectionPolicy11);
        pDEncryption7.setSecurityHandler((org.apache.pdfbox.pdmodel.encryption.SecurityHandler) standardSecurityHandler13);
        try {
            org.apache.pdfbox.cos.COSString cOSString16 = pDEncryption7.getRecipientStringAt(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "270" + "'", str12.equals("270"));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test424");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.SYMBOL;
        try {
            pDType1Font0.addToSubset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(pDType1Font0);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test425");
        org.apache.pdfbox.cos.COSStream cOSStream0 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction1 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction((org.apache.pdfbox.cos.COSDictionary) cOSStream0);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream2 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream0);
        org.apache.pdfbox.util.Matrix matrix9 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray10 = matrix9.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix11 = matrix9.extractScaling();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm12 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox13 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm12);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary14 = pDCheckBox13.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary15 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary14);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine16 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary15);
        long long18 = cOSDictionary15.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed19 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary15);
        boolean b20 = matrix9.equals((java.lang.Object) cOSDictionary15);
        cOSStream0.setFilters((org.apache.pdfbox.cos.COSBase) cOSDictionary15);
        java.io.OutputStream outputStream22 = cOSStream0.createOutputStream();
        org.junit.Assert.assertNull(pDAction1);
        org.junit.Assert.assertNotNull(cOSArray10);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(cOSDictionary14);
        org.junit.Assert.assertTrue(long18 == (-1L));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(outputStream22);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test426");
        org.apache.pdfbox.cos.COSDocument cOSDocument0 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey1 = null;
        org.apache.pdfbox.cos.COSObject cOSObject2 = cOSDocument0.getObjectFromPool(cOSObjectKey1);
        org.apache.pdfbox.cos.COSName cOSName3 = org.apache.pdfbox.cos.COSName.CL;
        org.apache.pdfbox.cos.COSObject cOSObject4 = cOSDocument0.getObjectByType(cOSName3);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm5 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox6 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm5);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = pDCheckBox6.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary8 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary7);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine9 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary8);
        long long11 = cOSDictionary8.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed12 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary8);
        java.lang.String str15 = cOSDictionary8.getEmbeddedString("sc", "After");
        cOSDocument0.setTrailer(cOSDictionary8);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument17 = new org.apache.pdfbox.pdmodel.PDDocument(cOSDocument0);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm18 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox19 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm18);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary20 = pDCheckBox19.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary21 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary20);
        org.apache.pdfbox.cos.COSName cOSName22 = org.apache.pdfbox.cos.COSName.LOCATION;
        cOSDictionary21.removeItem(cOSName22);
        org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font24 = null;
        org.apache.pdfbox.pdmodel.font.PDCIDFontType0 pDCIDFontType0_25 = new org.apache.pdfbox.pdmodel.font.PDCIDFontType0(cOSDictionary21, pDType0Font24);
        java.util.Set<java.util.Map.Entry<org.apache.pdfbox.cos.COSName, org.apache.pdfbox.cos.COSBase>> set_entry_cOSName_cOSBase26 = cOSDictionary21.entrySet();
        org.apache.pdfbox.pdmodel.common.PDPageLabels pDPageLabels27 = new org.apache.pdfbox.pdmodel.common.PDPageLabels(pDDocument17, cOSDictionary21);
        int i28 = pDPageLabels27.getPageRangeCount();
        org.junit.Assert.assertNotNull(cOSObject2);
        org.junit.Assert.assertNotNull(cOSName3);
        org.junit.Assert.assertNull(cOSObject4);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertTrue(long11 == (-1L));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(cOSDictionary20);
        org.junit.Assert.assertNotNull(cOSName22);
        org.junit.Assert.assertNotNull(set_entry_cOSName_cOSBase26);
        org.junit.Assert.assertTrue(i28 == 1);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test427");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDObjectReference pDObjectReference0 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDObjectReference();
        org.apache.pdfbox.cos.COSStream cOSStream1 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction2 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction((org.apache.pdfbox.cos.COSDictionary) cOSStream1);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream1);
        pDObjectReference0.setReferencedObject((org.apache.pdfbox.pdmodel.graphics.PDXObject) pDAppearanceStream3);
        org.apache.pdfbox.util.Matrix matrix5 = pDAppearanceStream3.getMatrix();
        org.junit.Assert.assertNull(pDAction2);
        org.junit.Assert.assertNotNull(matrix5);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test428");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties pDOptionalContentProperties1 = new org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties(cOSDictionary0);
        try {
            org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentGroup pDOptionalContentGroup3 = pDOptionalContentProperties1.getGroup("90");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test429");
        org.apache.pdfbox.contentstream.operator.state.SetMatrix setMatrix0 = new org.apache.pdfbox.contentstream.operator.state.SetMatrix();
        java.lang.String str1 = setMatrix0.getName();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Tm" + "'", str1.equals("Tm"));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test430");
        java.io.InputStream inputStream0 = null;
        int[] i_array3 = new int[] { 10, (short) 100 };
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream cOSFilterInputStream4 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream(inputStream0, i_array3);
        try {
            org.apache.pdfbox.pdfparser.FDFParser fDFParser5 = new org.apache.pdfbox.pdfparser.FDFParser((java.io.InputStream) cOSFilterInputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test431");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding5 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine6 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        java.lang.String str7 = pDAnnotationLine6.getStartPointEndingStyle();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "None" + "'", str7.equals("None"));
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test432");
        org.apache.pdfbox.cos.COSStream cOSStream0 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction1 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction((org.apache.pdfbox.cos.COSDictionary) cOSStream0);
        org.apache.pdfbox.cos.COSDocument cOSDocument2 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey3 = null;
        org.apache.pdfbox.cos.COSObject cOSObject4 = cOSDocument2.getObjectFromPool(cOSObjectKey3);
        org.apache.pdfbox.cos.COSName cOSName5 = org.apache.pdfbox.cos.COSName.CL;
        org.apache.pdfbox.cos.COSObject cOSObject6 = cOSDocument2.getObjectByType(cOSName5);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm7 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox8 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm7);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary9 = pDCheckBox8.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary10 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary9);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine11 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary10);
        long long13 = cOSDictionary10.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed14 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary10);
        java.lang.String str17 = cOSDictionary10.getEmbeddedString("sc", "After");
        cOSDocument2.setTrailer(cOSDictionary10);
        org.apache.pdfbox.cos.COSName cOSName20 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.FILTER_VERISIGN_PPKVS;
        cOSDictionary10.setEmbeddedInt("Index", cOSName20, (int) 'a');
        cOSStream0.setLong(cOSName20, (long) (short) 100);
        cOSStream0.close();
        org.apache.pdfbox.pdmodel.PDPage pDPage26 = new org.apache.pdfbox.pdmodel.PDPage((org.apache.pdfbox.cos.COSDictionary) cOSStream0);
        org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary pDRectlinearMeasureDictionary27 = new org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary((org.apache.pdfbox.cos.COSDictionary) cOSStream0);
        org.junit.Assert.assertNull(pDAction1);
        org.junit.Assert.assertNotNull(cOSObject4);
        org.junit.Assert.assertNotNull(cOSName5);
        org.junit.Assert.assertNull(cOSObject6);
        org.junit.Assert.assertNotNull(cOSDictionary9);
        org.junit.Assert.assertTrue(long13 == (-1L));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(cOSName20);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test433");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup1 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar2 = null;
        pDAnnotationPopup1.setModifiedDate(calendar2);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup1.setRectangle(pDRectangle4);
        org.apache.pdfbox.pdmodel.PDPage pDPage6 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle4);
        pDPageTree0.add(pDPage6);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree8 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup9 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar10 = null;
        pDAnnotationPopup9.setModifiedDate(calendar10);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle12 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup9.setRectangle(pDRectangle12);
        org.apache.pdfbox.pdmodel.PDPage pDPage14 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle12);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream15 = pDPage14.getContentStreams();
        org.apache.pdfbox.pdmodel.PDResources pDResources16 = pDPage14.getResources();
        int i17 = pDPageTree8.indexOf(pDPage14);
        int i18 = pDPageTree0.indexOf(pDPage14);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup19 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar20 = null;
        pDAnnotationPopup19.setModifiedDate(calendar20);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle22 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup19.setRectangle(pDRectangle22);
        org.apache.pdfbox.pdmodel.PDPage pDPage24 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle22);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream25 = pDPage24.getContentStreams();
        org.apache.pdfbox.cos.COSStream cOSStream26 = null;
        org.apache.pdfbox.pdmodel.common.PDStream pDStream27 = new org.apache.pdfbox.pdmodel.common.PDStream(cOSStream26);
        org.apache.pdfbox.pdmodel.common.PDStream[] pDStream_array28 = new org.apache.pdfbox.pdmodel.common.PDStream[] { pDStream27 };
        java.util.ArrayList<org.apache.pdfbox.pdmodel.common.PDStream> arraylist_pDStream29 = new java.util.ArrayList<org.apache.pdfbox.pdmodel.common.PDStream>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.pdmodel.common.PDStream>) arraylist_pDStream29, pDStream_array28);
        pDPage24.setContents((java.util.List<org.apache.pdfbox.pdmodel.common.PDStream>) arraylist_pDStream29);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup32 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar33 = null;
        pDAnnotationPopup32.setModifiedDate(calendar33);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle35 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup32.setRectangle(pDRectangle35);
        org.apache.pdfbox.pdmodel.PDPage pDPage37 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle35);
        pDPage24.setMediaBox(pDRectangle35);
        java.util.List<org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation> list_pDAnnotation39 = pDPage24.getAnnotations();
        pDPageTree0.add(pDPage24);
        org.junit.Assert.assertNotNull(pDRectangle4);
        org.junit.Assert.assertNotNull(pDRectangle12);
        org.junit.Assert.assertNotNull(iterator_pDStream15);
        org.junit.Assert.assertNull(pDResources16);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertNotNull(pDRectangle22);
        org.junit.Assert.assertNotNull(iterator_pDStream25);
        org.junit.Assert.assertNotNull(pDStream_array28);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(pDRectangle35);
        org.junit.Assert.assertNotNull(list_pDAnnotation39);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test434");
        float[] f_array6 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray8 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i9 = pDDeviceGray8.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor10 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array6, cOSName7, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray8);
        org.apache.pdfbox.cos.COSArray cOSArray11 = pDColor10.toCOSArray();
        org.apache.pdfbox.cos.COSName cOSName12 = org.apache.pdfbox.cos.COSName.RESOURCES;
        cOSArray11.add((org.apache.pdfbox.pdmodel.common.COSObjectable) cOSName12);
        cOSArray11.growToSize((-1));
        java.lang.String str18 = cOSArray11.getString(8, "SinglePage");
        org.junit.Assert.assertNotNull(f_array6);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(pDDeviceGray8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(cOSArray11);
        org.junit.Assert.assertNotNull(cOSName12);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "SinglePage" + "'", str18.equals("SinglePage"));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test435");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigBuilder pDVisibleSigBuilder0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigBuilder();
        org.apache.pdfbox.pdmodel.PDResources pDResources1 = null;
        org.apache.pdfbox.cos.COSStream cOSStream2 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquare fDFAnnotationSquare3 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquare((org.apache.pdfbox.cos.COSDictionary) cOSStream2);
        org.apache.pdfbox.pdmodel.common.PDObjectStream pDObjectStream4 = new org.apache.pdfbox.pdmodel.common.PDObjectStream(cOSStream2);
        java.util.List<java.lang.Object> list_obj5 = pDObjectStream4.getDecodeParms();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle6 = org.apache.pdfbox.pdmodel.common.PDRectangle.A5;
        pDRectangle6.setLowerLeftX((float) 100);
        pDVisibleSigBuilder0.createHolderForm(pDResources1, (org.apache.pdfbox.pdmodel.common.PDStream) pDObjectStream4, pDRectangle6);
        org.apache.pdfbox.pdmodel.PDPage pDPage10 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle6);
        org.junit.Assert.assertNull(list_obj5);
        org.junit.Assert.assertNotNull(pDRectangle6);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test436");
        org.apache.pdfbox.text.PDFTextStripper pDFTextStripper0 = new org.apache.pdfbox.text.PDFTextStripper();
        java.lang.String str1 = pDFTextStripper0.getWordSeparator();
        float f2 = pDFTextStripper0.getIndentThreshold();
        boolean b3 = pDFTextStripper0.getSeparateByBeads();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + " " + "'", str1.equals(" "));
        org.junit.Assert.assertTrue(f2 == 2.0f);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test437");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.COURIER_BOLD_OBLIQUE;
        boolean b1 = pDType1Font0.isVertical();
        boolean b2 = pDType1Font0.isSymbolic();
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test438");
        byte[] byte_array0 = org.apache.pdfbox.pdfwriter.COSWriter.ENDSTREAM;
        java.lang.String str1 = org.apache.pdfbox.util.Hex.getString(byte_array0);
        org.apache.pdfbox.pdmodel.font.PDPanose pDPanose2 = new org.apache.pdfbox.pdmodel.font.PDPanose(byte_array0);
        int i3 = pDPanose2.getFamilyClass();
        org.junit.Assert.assertNotNull(byte_array0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "656E6473747265616D" + "'", str1.equals("656E6473747265616D"));
        org.junit.Assert.assertTrue(i3 == 25966);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test439");
        org.apache.fontbox.ttf.OpenTypeFont openTypeFont0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm1 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox2 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm1);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = pDCheckBox2.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary3);
        org.apache.pdfbox.cos.COSName cOSName5 = org.apache.pdfbox.cos.COSName.LOCATION;
        cOSDictionary4.removeItem(cOSName5);
        org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font7 = null;
        org.apache.pdfbox.pdmodel.font.PDCIDFontType0 pDCIDFontType0_8 = new org.apache.pdfbox.pdmodel.font.PDCIDFontType0(cOSDictionary4, pDType0Font7);
        org.apache.fontbox.FontBoxFont fontBoxFont9 = pDCIDFontType0_8.getFontBoxFont();
        org.apache.pdfbox.pdmodel.font.CIDFontMapping cIDFontMapping11 = new org.apache.pdfbox.pdmodel.font.CIDFontMapping(openTypeFont0, fontBoxFont9, false);
        org.junit.Assert.assertNotNull(cOSDictionary3);
        org.junit.Assert.assertNotNull(cOSName5);
        org.junit.Assert.assertNotNull(fontBoxFont9);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test440");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.LOCATION;
        cOSDictionary3.removeItem(cOSName4);
        org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font6 = null;
        org.apache.pdfbox.pdmodel.font.PDCIDFontType0 pDCIDFontType0_7 = new org.apache.pdfbox.pdmodel.font.PDCIDFontType0(cOSDictionary3, pDType0Font6);
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences pDViewerPreferences8 = new org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences(cOSDictionary3);
        boolean b9 = pDViewerPreferences8.hideMenubar();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test441");
        java.security.KeyStore keyStore0 = null;
        org.apache.pdfbox.pdmodel.encryption.PublicKeyDecryptionMaterial publicKeyDecryptionMaterial3 = new org.apache.pdfbox.pdmodel.encryption.PublicKeyDecryptionMaterial(keyStore0, "Inline", "PDRange{100.0, -1.0}");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test442");
        java.io.OutputStream outputStream0 = null;
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream1 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream(outputStream0);
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream3 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream(outputStream0, (long) 2);
        byte[] byte_array4 = null;
        try {
            cOSStandardOutputStream3.write(byte_array4, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test443");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding5 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline6 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary3);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_7 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary3);
        org.apache.pdfbox.util.Matrix matrix14 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray15 = matrix14.toCOSArray();
        pDShadingType3_7.setDomain(cOSArray15);
        float[] f_array23 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName24 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray25 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i26 = pDDeviceGray25.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor27 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array23, cOSName24, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray25);
        org.apache.pdfbox.cos.COSArray cOSArray28 = pDColor27.toCOSArray();
        org.apache.pdfbox.cos.COSName cOSName29 = org.apache.pdfbox.cos.COSName.RESOURCES;
        cOSArray28.add((org.apache.pdfbox.pdmodel.common.COSObjectable) cOSName29);
        pDShadingType3_7.setDomain(cOSArray28);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm32 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox33 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm32);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary34 = pDCheckBox33.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary35 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary34);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine36 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary35);
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding37 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary35);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline38 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary35);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_39 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary35);
        org.apache.pdfbox.util.Matrix matrix46 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray47 = matrix46.toCOSArray();
        pDShadingType3_39.setDomain(cOSArray47);
        java.lang.String str50 = cOSArray47.getString(1);
        org.apache.pdfbox.cos.COSName cOSName52 = org.apache.pdfbox.cos.COSName.ANTI_ALIAS;
        cOSArray47.set(2, (org.apache.pdfbox.pdmodel.common.COSObjectable) cOSName52);
        boolean b54 = cOSArray28.removeObject((org.apache.pdfbox.cos.COSBase) cOSName52);
        org.apache.pdfbox.cos.COSBase cOSBase56 = cOSArray28.get((int) (byte) 1);
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitDestination pDPageFitDestination57 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitDestination(cOSArray28);
        boolean b58 = pDPageFitDestination57.fitBoundingBox();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSArray15);
        org.junit.Assert.assertNotNull(f_array23);
        org.junit.Assert.assertNotNull(cOSName24);
        org.junit.Assert.assertNotNull(pDDeviceGray25);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertNotNull(cOSArray28);
        org.junit.Assert.assertNotNull(cOSName29);
        org.junit.Assert.assertNotNull(cOSDictionary34);
        org.junit.Assert.assertNotNull(cOSArray47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(cOSName52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(cOSBase56);
        org.junit.Assert.assertTrue(b58 == false);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test444");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        org.apache.pdfbox.printing.Orientation orientation1 = null;
        org.apache.pdfbox.printing.PDFPageable pDFPageable4 = new org.apache.pdfbox.printing.PDFPageable(pDDocument0, orientation1, true, (float) 1);
        try {
            java.awt.print.Printable printable6 = pDFPageable4.getPrintable(9472);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test445");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        boolean b4 = cOSDictionary2.isNeedToBeUpdated();
        org.apache.pdfbox.cos.COSName cOSName5 = org.apache.pdfbox.cos.COSName.VERTICES_PER_ROW;
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.UNIX;
        int i7 = cOSDictionary2.getInt(cOSName5, cOSName6);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(cOSName5);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertTrue(i7 == (-1));
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test446");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        float f2 = pDExportFormatAttributeObject1.getBaselineShift();
        pDExportFormatAttributeObject1.setWidth(0);
        pDExportFormatAttributeObject1.setEndIndent((-4));
        org.junit.Assert.assertTrue(f2 == 0.0f);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test447");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.A;
        org.apache.pdfbox.cos.COSObject cOSObject1 = new org.apache.pdfbox.cos.COSObject((org.apache.pdfbox.cos.COSBase) cOSName0);
        org.apache.pdfbox.cos.COSName cOSName2 = org.apache.pdfbox.cos.COSName.ROWS;
        org.apache.pdfbox.cos.COSBase cOSBase3 = cOSObject1.getItem(cOSName2);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm4 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox5 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm4);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary6 = pDCheckBox5.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary6);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine8 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary7);
        long long10 = cOSDictionary7.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed11 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary7);
        cOSObject1.setObject((org.apache.pdfbox.cos.COSBase) cOSDictionary7);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStrikeOut fDFAnnotationStrikeOut13 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStrikeOut(cOSDictionary7);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch pDActionLaunch14 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch(cOSDictionary7);
        org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font15 = null;
        try {
            org.apache.pdfbox.pdmodel.font.PDCIDFontType2 pDCIDFontType2_16 = new org.apache.pdfbox.pdmodel.font.PDCIDFontType2(cOSDictionary7, pDType0Font15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSName0);
        org.junit.Assert.assertNotNull(cOSName2);
        org.junit.Assert.assertNull(cOSBase3);
        org.junit.Assert.assertNotNull(cOSDictionary6);
        org.junit.Assert.assertTrue(long10 == (-1L));
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test448");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.COURIER_BOLD;
        org.junit.Assert.assertNotNull(pDType1Font0);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test449");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding5 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline6 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary3);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_7 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary3);
        org.apache.pdfbox.text.PDFMarkedContentExtractor pDFMarkedContentExtractor8 = new org.apache.pdfbox.text.PDFMarkedContentExtractor();
        org.apache.pdfbox.util.Matrix matrix15 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray16 = matrix15.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix17 = matrix15.extractScaling();
        pDFMarkedContentExtractor8.setTextMatrix(matrix15);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm19 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox20 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm19);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary21 = pDCheckBox20.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary22 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary21);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink pDAnnotationLink23 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink(cOSDictionary22);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText24 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        float[] f_array31 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName32 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray33 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i34 = pDDeviceGray33.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor35 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array31, cOSName32, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray33);
        fDFAnnotationFreeText24.setCallout(f_array31);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText37 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        float[] f_array44 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName45 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray46 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i47 = pDDeviceGray46.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor48 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array44, cOSName45, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray46);
        fDFAnnotationFreeText37.setCallout(f_array44);
        java.lang.String str50 = fDFAnnotationFreeText37.getLineEndingStyle();
        float[] f_array51 = fDFAnnotationFreeText37.getCallout();
        fDFAnnotationFreeText24.setCallout(f_array51);
        pDAnnotationLink23.setQuadPoints(f_array51);
        pDFMarkedContentExtractor8.showAnnotation((org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) pDAnnotationLink23);
        org.apache.pdfbox.text.PDFMarkedContentExtractor pDFMarkedContentExtractor55 = new org.apache.pdfbox.text.PDFMarkedContentExtractor();
        org.apache.pdfbox.util.Matrix matrix62 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray63 = matrix62.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix64 = matrix62.extractScaling();
        pDFMarkedContentExtractor55.setTextMatrix(matrix62);
        pDFMarkedContentExtractor8.setTextLineMatrix(matrix62);
        java.awt.Paint paint67 = pDShadingType3_7.toPaint(matrix62);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSArray16);
        org.junit.Assert.assertNotNull(matrix17);
        org.junit.Assert.assertNotNull(cOSDictionary21);
        org.junit.Assert.assertNotNull(f_array31);
        org.junit.Assert.assertNotNull(cOSName32);
        org.junit.Assert.assertNotNull(pDDeviceGray33);
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertNotNull(f_array44);
        org.junit.Assert.assertNotNull(cOSName45);
        org.junit.Assert.assertNotNull(pDDeviceGray46);
        org.junit.Assert.assertTrue(i47 == 1);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(f_array51);
        org.junit.Assert.assertNotNull(cOSArray63);
        org.junit.Assert.assertNotNull(matrix64);
        org.junit.Assert.assertNotNull(paint67);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test450");
        org.apache.pdfbox.pdmodel.graphics.color.PDLab pDLab0 = new org.apache.pdfbox.pdmodel.graphics.color.PDLab();
        org.apache.pdfbox.pdmodel.graphics.color.PDTristimulus pDTristimulus1 = pDLab0.getBlackPoint();
        org.junit.Assert.assertNotNull(pDTristimulus1);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test451");
        org.apache.pdfbox.contentstream.operator.graphics.LegacyFillNonZeroRule legacyFillNonZeroRule0 = new org.apache.pdfbox.contentstream.operator.graphics.LegacyFillNonZeroRule();
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test452");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionRemoteGoTo pDActionRemoteGoTo4 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionRemoteGoTo(cOSDictionary2);
        pDActionRemoteGoTo4.setOpenInNewWindow(false);
        java.util.List<org.apache.pdfbox.pdmodel.interactive.action.PDAction> list_pDAction7 = pDActionRemoteGoTo4.getNext();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(list_pDAction7);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test453");
        org.apache.pdfbox.pdmodel.graphics.state.PDTextState pDTextState0 = new org.apache.pdfbox.pdmodel.graphics.state.PDTextState();
        pDTextState0.setLeading((float) (byte) 100);
        float f3 = pDTextState0.getWordSpacing();
        org.junit.Assert.assertTrue(f3 == 0.0f);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test454");
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFDocument fDFDocument1 = org.apache.pdfbox.pdmodel.fdf.FDFDocument.loadXFDF("StructElem");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test455");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCircle fDFAnnotationCircle0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCircle();
        java.awt.Color color1 = null;
        fDFAnnotationCircle0.setInteriorColor(color1);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test456");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.MIX;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test457");
        org.apache.pdfbox.pdmodel.encryption.PublicKeyRecipient publicKeyRecipient0 = new org.apache.pdfbox.pdmodel.encryption.PublicKeyRecipient();
        java.security.cert.X509Certificate x509Certificate1 = publicKeyRecipient0.getX509();
        org.junit.Assert.assertNull(x509Certificate1);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test458");
        org.apache.pdfbox.util.filetypedetector.FileType fileType0 = org.apache.pdfbox.util.filetypedetector.FileType.RAF;
        org.junit.Assert.assertTrue("'" + fileType0 + "' != '" + org.apache.pdfbox.util.filetypedetector.FileType.RAF + "'", fileType0.equals(org.apache.pdfbox.util.filetypedetector.FileType.RAF));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test459");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.TEXT_DECORATION_TYPE_OVERLINE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Overline" + "'", str0.equals("Overline"));
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test460");
        org.apache.pdfbox.contentstream.operator.DrawObject drawObject0 = new org.apache.pdfbox.contentstream.operator.DrawObject();
        org.apache.pdfbox.text.PDFMarkedContentExtractor pDFMarkedContentExtractor1 = new org.apache.pdfbox.text.PDFMarkedContentExtractor();
        drawObject0.setContext((org.apache.pdfbox.contentstream.PDFStreamEngine) pDFMarkedContentExtractor1);
        org.apache.pdfbox.util.Matrix matrix9 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        pDFMarkedContentExtractor1.setTextLineMatrix(matrix9);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test461");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        org.apache.pdfbox.util.Matrix matrix7 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray8 = matrix7.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix9 = matrix7.extractScaling();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm10 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox11 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary12 = pDCheckBox11.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary13 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary12);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine14 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary13);
        long long16 = cOSDictionary13.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed17 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary13);
        boolean b18 = matrix7.equals((java.lang.Object) cOSDictionary13);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp pDSeedValueTimeStamp19 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp(cOSDictionary13);
        org.apache.pdfbox.pdmodel.PDDocumentCatalog pDDocumentCatalog20 = new org.apache.pdfbox.pdmodel.PDDocumentCatalog(pDDocument0, cOSDictionary13);
        org.apache.pdfbox.pdmodel.common.PDDestinationOrAction pDDestinationOrAction21 = pDDocumentCatalog20.getOpenAction();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary22 = pDDocumentCatalog20.getCOSObject();
        org.apache.pdfbox.pdmodel.PDDocumentNameDestinationDictionary pDDocumentNameDestinationDictionary23 = pDDocumentCatalog20.getDests();
        org.junit.Assert.assertNotNull(cOSArray8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(cOSDictionary12);
        org.junit.Assert.assertTrue(long16 == (-1L));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(pDDestinationOrAction21);
        org.junit.Assert.assertNotNull(cOSDictionary22);
        org.junit.Assert.assertNull(pDDocumentNameDestinationDictionary23);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test462");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        long long6 = cOSDictionary3.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed7 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFField fDFField8 = new org.apache.pdfbox.pdmodel.fdf.FDFField(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary9 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary();
        fDFField8.setAppearanceDictionary(pDAppearanceDictionary9);
        fDFField8.setFieldFlags((int) (short) -1);
        fDFField8.setFieldFlags((int) (byte) 10);
        org.apache.pdfbox.cos.COSString cOSString15 = null;
        fDFField8.setRichText(cOSString15);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test463");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar1 = null;
        pDAnnotationPopup0.setModifiedDate(calendar1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup0.setRectangle(pDRectangle3);
        org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState pDGraphicsState5 = new org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState(pDRectangle3);
        org.apache.pdfbox.util.Matrix matrix6 = pDGraphicsState5.getCurrentTransformationMatrix();
        pDGraphicsState5.setNonStrokingOverprint(false);
        org.junit.Assert.assertNotNull(pDRectangle3);
        org.junit.Assert.assertNotNull(matrix6);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test464");
        org.apache.pdfbox.pdmodel.graphics.color.PDSeparation pDSeparation0 = new org.apache.pdfbox.pdmodel.graphics.color.PDSeparation();
        org.apache.pdfbox.cos.COSName cOSName1 = org.apache.pdfbox.cos.COSName.ARTIFACT;
        org.apache.pdfbox.pdmodel.common.function.PDFunctionType3 pDFunctionType3_2 = new org.apache.pdfbox.pdmodel.common.function.PDFunctionType3((org.apache.pdfbox.cos.COSBase) cOSName1);
        pDSeparation0.setTintTransform((org.apache.pdfbox.pdmodel.common.function.PDFunction) pDFunctionType3_2);
        int i4 = pDFunctionType3_2.getFunctionType();
        org.junit.Assert.assertNotNull(cOSName1);
        org.junit.Assert.assertTrue(i4 == 3);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test465");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_MINUS_180_DEGREES;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "-180" + "'", str0.equals("-180"));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test466");
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting1 = org.apache.pdfbox.io.MemoryUsageSetting.setupMixed((long) 10);
        boolean b2 = memoryUsageSetting1.useMainMemory();
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting4 = memoryUsageSetting1.getPartitionedCopy((int) (short) 100);
        java.io.File file5 = memoryUsageSetting4.getTempDir();
        org.apache.pdfbox.io.ScratchFile scratchFile6 = new org.apache.pdfbox.io.ScratchFile(memoryUsageSetting4);
        org.apache.pdfbox.io.RandomAccessRead randomAccessRead7 = null;
        org.apache.pdfbox.io.RandomAccessInputStream randomAccessInputStream8 = new org.apache.pdfbox.io.RandomAccessInputStream(randomAccessRead7);
        boolean b9 = randomAccessInputStream8.markSupported();
        try {
            org.apache.pdfbox.io.RandomAccess randomAccess10 = scratchFile6.createBuffer((java.io.InputStream) randomAccessInputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(memoryUsageSetting1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(memoryUsageSetting4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test467");
        java.nio.charset.Charset charset0 = org.apache.pdfbox.util.Charsets.WINDOWS_1252;
        org.junit.Assert.assertNotNull(charset0);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test468");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary2);
        java.lang.String[] str_array5 = new java.lang.String[] { "270" };
        org.apache.pdfbox.cos.COSBase cOSBase6 = cOSDictionary2.getDictionaryObject(str_array5);
        java.util.Calendar calendar8 = cOSDictionary2.getDate("180");
        org.apache.pdfbox.cos.COSName cOSName9 = org.apache.pdfbox.cos.COSName.SHADING_TYPE;
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.TYPE1;
        int i11 = cOSDictionary2.getInt(cOSName9, cOSName10);
        java.lang.String str13 = cOSDictionary2.getString("Pattern");
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(str_array5);
        org.junit.Assert.assertNull(cOSBase6);
        org.junit.Assert.assertNull(calendar8);
        org.junit.Assert.assertNotNull(cOSName9);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test469");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        java.lang.String str2 = pDCheckBox1.getOnValue();
        org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions pDFormFieldAdditionalActions3 = pDCheckBox1.getActions();
        pDCheckBox1.setNoExport(false);
        boolean b6 = pDCheckBox1.isRadioButton();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNull(pDFormFieldAdditionalActions3);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test470");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType6 pDShadingType6_1 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType6(cOSDictionary0);
        try {
            pDShadingType6_1.setAntiAlias(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test471");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.handlers.PDCircleAppearanceHandler pDCircleAppearanceHandler5 = new org.apache.pdfbox.pdmodel.interactive.annotation.handlers.PDCircleAppearanceHandler((org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) pDAnnotationLine4);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary6 = pDAnnotationLine4.getBorderStyle();
        pDAnnotationLine4.setEndPointEndingStyle("PrintField");
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(pDBorderStyleDictionary6);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test472");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.LIGHTEN;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test473");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.SMASK;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test474");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding5 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline6 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary3);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_7 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary3);
        org.apache.pdfbox.util.Matrix matrix14 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray15 = matrix14.toCOSArray();
        pDShadingType3_7.setDomain(cOSArray15);
        float[] f_array23 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName24 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray25 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i26 = pDDeviceGray25.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor27 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array23, cOSName24, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray25);
        org.apache.pdfbox.cos.COSArray cOSArray28 = pDColor27.toCOSArray();
        org.apache.pdfbox.cos.COSName cOSName29 = org.apache.pdfbox.cos.COSName.RESOURCES;
        cOSArray28.add((org.apache.pdfbox.pdmodel.common.COSObjectable) cOSName29);
        pDShadingType3_7.setDomain(cOSArray28);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup32 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar33 = null;
        pDAnnotationPopup32.setModifiedDate(calendar33);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle35 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup32.setRectangle(pDRectangle35);
        org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState pDGraphicsState37 = new org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState(pDRectangle35);
        org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace38 = pDGraphicsState37.getStrokingColorSpace();
        org.apache.pdfbox.cos.COSBase cOSBase39 = pDColorSpace38.getCOSObject();
        int i40 = cOSArray28.indexOfObject(cOSBase39);
        int i41 = cOSArray28.size();
        try {
            org.apache.pdfbox.pdmodel.graphics.color.PDDeviceN pDDeviceN42 = new org.apache.pdfbox.pdmodel.graphics.color.PDDeviceN(cOSArray28);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSArray15);
        org.junit.Assert.assertNotNull(f_array23);
        org.junit.Assert.assertNotNull(cOSName24);
        org.junit.Assert.assertNotNull(pDDeviceGray25);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertNotNull(cOSArray28);
        org.junit.Assert.assertNotNull(cOSName29);
        org.junit.Assert.assertNotNull(pDRectangle35);
        org.junit.Assert.assertNotNull(pDColorSpace38);
        org.junit.Assert.assertNotNull(cOSBase39);
        org.junit.Assert.assertTrue(i40 == (-1));
        org.junit.Assert.assertTrue(i41 == 8);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test475");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.MAX_LEN;
        try {
            org.apache.pdfbox.pdmodel.common.function.PDFunction pDFunction1 = org.apache.pdfbox.pdmodel.common.function.PDFunction.create((org.apache.pdfbox.cos.COSBase) cOSName0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test476");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.Revisions<org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject> revisions_pDPrintFieldAttributeObject0 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.Revisions<org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject>();
        java.lang.String str1 = revisions_pDPrintFieldAttributeObject0.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test477");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.TR;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test478");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary();
        org.apache.pdfbox.cos.COSStream cOSStream1 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction2 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction((org.apache.pdfbox.cos.COSDictionary) cOSStream1);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream1);
        pDAppearanceDictionary0.setNormalAppearance(pDAppearanceStream3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream pDAppearanceContentStream5 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream(pDAppearanceStream3);
        org.apache.pdfbox.pdmodel.PDResources pDResources6 = null;
        pDAppearanceContentStream5.setResources(pDResources6);
        pDAppearanceContentStream5.moveTo((float) 4, (float) (byte) 1);
        java.util.Stack<org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace> stack_pDColorSpace11 = pDAppearanceContentStream5.getStrokingColorSpaceStack();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm12 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox13 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm12);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary14 = pDCheckBox13.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary15 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary14);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine16 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary15);
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding17 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary15);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline18 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary15);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_19 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary15);
        org.apache.pdfbox.util.Matrix matrix26 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray27 = matrix26.toCOSArray();
        pDShadingType3_19.setDomain(cOSArray27);
        float[] f_array35 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName36 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray37 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i38 = pDDeviceGray37.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor39 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array35, cOSName36, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray37);
        org.apache.pdfbox.cos.COSArray cOSArray40 = pDColor39.toCOSArray();
        org.apache.pdfbox.cos.COSName cOSName41 = org.apache.pdfbox.cos.COSName.RESOURCES;
        cOSArray40.add((org.apache.pdfbox.pdmodel.common.COSObjectable) cOSName41);
        pDShadingType3_19.setDomain(cOSArray40);
        try {
            pDAppearanceContentStream5.shadingFill((org.apache.pdfbox.pdmodel.graphics.shading.PDShading) pDShadingType3_19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(pDAction2);
        org.junit.Assert.assertNotNull(stack_pDColorSpace11);
        org.junit.Assert.assertNotNull(cOSDictionary14);
        org.junit.Assert.assertNotNull(cOSArray27);
        org.junit.Assert.assertNotNull(f_array35);
        org.junit.Assert.assertNotNull(cOSName36);
        org.junit.Assert.assertNotNull(pDDeviceGray37);
        org.junit.Assert.assertTrue(i38 == 1);
        org.junit.Assert.assertNotNull(cOSArray40);
        org.junit.Assert.assertNotNull(cOSName41);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test479");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary();
        org.apache.pdfbox.cos.COSStream cOSStream1 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction2 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction((org.apache.pdfbox.cos.COSDictionary) cOSStream1);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream1);
        pDAppearanceDictionary0.setNormalAppearance(pDAppearanceStream3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream pDAppearanceContentStream5 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream(pDAppearanceStream3);
        org.apache.pdfbox.pdmodel.PDResources pDResources6 = null;
        pDAppearanceContentStream5.setResources(pDResources6);
        try {
            pDAppearanceContentStream5.newLineAtOffset(10.0f, (float) 9472);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(pDAction2);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test480");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink pDAnnotationLink4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary5 = null;
        pDAnnotationLink4.setBorderStyle(pDBorderStyleDictionary5);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary7 = null;
        pDAnnotationLink4.setBorderStyle(pDBorderStyleDictionary7);
        org.junit.Assert.assertNotNull(cOSDictionary2);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test481");
        java.io.OutputStream outputStream0 = null;
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream1 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream(outputStream0);
        byte[] byte_array2 = null;
        try {
            cOSStandardOutputStream1.write(byte_array2, 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test482");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding5 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline6 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary3);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_7 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary3);
        org.apache.pdfbox.util.Matrix matrix14 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray15 = matrix14.toCOSArray();
        pDShadingType3_7.setDomain(cOSArray15);
        org.apache.pdfbox.cos.COSDocument cOSDocument17 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey18 = null;
        org.apache.pdfbox.cos.COSObject cOSObject19 = cOSDocument17.getObjectFromPool(cOSObjectKey18);
        cOSArray15.add((org.apache.pdfbox.cos.COSBase) cOSDocument17);
        boolean b21 = cOSDocument17.isClosed();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSArray15);
        org.junit.Assert.assertNotNull(cOSObject19);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test483");
        org.apache.pdfbox.pdmodel.graphics.PDLineDashPattern pDLineDashPattern0 = new org.apache.pdfbox.pdmodel.graphics.PDLineDashPattern();
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test484");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar1 = null;
        pDAnnotationPopup0.setModifiedDate(calendar1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup0.setRectangle(pDRectangle3);
        org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState pDGraphicsState5 = new org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState(pDRectangle3);
        org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState pDGraphicsState6 = new org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState(pDRectangle3);
        org.junit.Assert.assertNotNull(pDRectangle3);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test485");
        org.apache.pdfbox.cos.COSStream cOSStream0 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquare fDFAnnotationSquare1 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquare((org.apache.pdfbox.cos.COSDictionary) cOSStream0);
        org.apache.pdfbox.pdmodel.common.PDObjectStream pDObjectStream2 = new org.apache.pdfbox.pdmodel.common.PDObjectStream(cOSStream0);
        org.apache.pdfbox.cos.COSStream cOSStream3 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquare fDFAnnotationSquare4 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquare((org.apache.pdfbox.cos.COSDictionary) cOSStream3);
        org.apache.pdfbox.pdmodel.common.PDObjectStream pDObjectStream5 = new org.apache.pdfbox.pdmodel.common.PDObjectStream(cOSStream3);
        pDObjectStream2.setExtends(pDObjectStream5);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test486");
        java.io.InputStream inputStream0 = null;
        try {
            org.apache.pdfbox.pdmodel.PDDocument pDDocument1 = org.apache.pdfbox.pdmodel.PDDocument.load(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test487");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary2);
        java.lang.String[] str_array5 = new java.lang.String[] { "270" };
        org.apache.pdfbox.cos.COSBase cOSBase6 = cOSDictionary2.getDictionaryObject(str_array5);
        java.util.Calendar calendar8 = cOSDictionary2.getDate("180");
        org.apache.pdfbox.cos.COSName cOSName9 = org.apache.pdfbox.cos.COSName.SHADING_TYPE;
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.TYPE1;
        int i11 = cOSDictionary2.getInt(cOSName9, cOSName10);
        org.apache.pdfbox.pdmodel.graphics.pattern.PDShadingPattern pDShadingPattern12 = new org.apache.pdfbox.pdmodel.graphics.pattern.PDShadingPattern(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName13 = org.apache.pdfbox.cos.COSName.URL;
        cOSDictionary2.setString(cOSName13, "Thread");
        org.apache.pdfbox.pdmodel.fdf.FDFJavaScript fDFJavaScript16 = new org.apache.pdfbox.pdmodel.fdf.FDFJavaScript(cOSDictionary2);
        java.util.Map<java.lang.String, org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript> map_str_pDActionJavaScript17 = fDFJavaScript16.getDoc();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(str_array5);
        org.junit.Assert.assertNull(cOSBase6);
        org.junit.Assert.assertNull(calendar8);
        org.junit.Assert.assertNotNull(cOSName9);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertNotNull(cOSName13);
        org.junit.Assert.assertNull(map_str_pDActionJavaScript17);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test488");
        org.apache.pdfbox.util.Matrix matrix6 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray7 = matrix6.toCOSArray();
        java.lang.String str9 = cOSArray7.getString((int) (byte) 1);
        try {
            org.apache.pdfbox.cos.COSBase cOSBase11 = cOSArray7.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(cOSArray7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test489");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.cos.COSName cOSName5 = org.apache.pdfbox.cos.COSName.SUBJ;
        long long6 = cOSDictionary3.getLong(cOSName5);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit7 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary3);
        fDFIconFit7.setScaleType("M");
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName5);
        org.junit.Assert.assertTrue(long6 == (-1L));
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test490");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.RT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RT" + "'", str0.equals("RT"));
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test491");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit1 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = fDFIconFit1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = fDFIconFit1.getCOSObject();
        org.junit.Assert.assertNull(cOSDictionary2);
        org.junit.Assert.assertNull(cOSDictionary3);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test492");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionSubmitForm pDActionSubmitForm0 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionSubmitForm();
        org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification pDFileSpecification1 = pDActionSubmitForm0.getFile();
        org.junit.Assert.assertNull(pDFileSpecification1);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test493");
        org.apache.fontbox.ttf.OpenTypeFont openTypeFont0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm1 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox2 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm1);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = pDCheckBox2.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary3);
        org.apache.pdfbox.cos.COSName cOSName5 = org.apache.pdfbox.cos.COSName.LOCATION;
        cOSDictionary4.removeItem(cOSName5);
        org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font7 = null;
        org.apache.pdfbox.pdmodel.font.PDCIDFontType0 pDCIDFontType0_8 = new org.apache.pdfbox.pdmodel.font.PDCIDFontType0(cOSDictionary4, pDType0Font7);
        org.apache.fontbox.FontBoxFont fontBoxFont9 = pDCIDFontType0_8.getFontBoxFont();
        org.apache.pdfbox.pdmodel.font.CIDFontMapping cIDFontMapping11 = new org.apache.pdfbox.pdmodel.font.CIDFontMapping(openTypeFont0, fontBoxFont9, true);
        org.apache.pdfbox.pdmodel.font.FontMapping<org.apache.fontbox.FontBoxFont> fontmapping_fontBoxFont13 = new org.apache.pdfbox.pdmodel.font.FontMapping<org.apache.fontbox.FontBoxFont>((org.apache.fontbox.FontBoxFont) openTypeFont0, false);
        org.junit.Assert.assertNotNull(cOSDictionary3);
        org.junit.Assert.assertNotNull(cOSName5);
        org.junit.Assert.assertNotNull(fontBoxFont9);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test494");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDTextField pDTextField1 = new org.apache.pdfbox.pdmodel.interactive.form.PDTextField(pDAcroForm0);
        boolean b2 = pDTextField1.doNotScroll();
        pDTextField1.setMaxLen(10);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test495");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FILTER;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test496");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary.STYLE_UNDERLINE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "U" + "'", str0.equals("U"));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test497");
        org.apache.pdfbox.contentstream.operator.text.ShowTextLineAndSpace showTextLineAndSpace0 = new org.apache.pdfbox.contentstream.operator.text.ShowTextLineAndSpace();
        org.apache.pdfbox.contentstream.operator.text.SetTextRise setTextRise1 = new org.apache.pdfbox.contentstream.operator.text.SetTextRise();
        org.apache.pdfbox.contentstream.operator.Operator operator3 = org.apache.pdfbox.contentstream.operator.Operator.getOperator("Final");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm4 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox5 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm4);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary6 = pDCheckBox5.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary6);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine8 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary7);
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding9 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary7);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline10 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary7);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_11 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary7);
        org.apache.pdfbox.util.Matrix matrix18 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray19 = matrix18.toCOSArray();
        pDShadingType3_11.setDomain(cOSArray19);
        java.lang.String str22 = cOSArray19.getString(1);
        org.apache.pdfbox.contentstream.operator.DrawObject drawObject23 = new org.apache.pdfbox.contentstream.operator.DrawObject();
        org.apache.pdfbox.contentstream.operator.Operator operator24 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm25 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox26 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm25);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary27 = pDCheckBox26.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup28 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary27);
        java.lang.String[] str_array30 = new java.lang.String[] { "270" };
        org.apache.pdfbox.cos.COSBase cOSBase31 = cOSDictionary27.getDictionaryObject(str_array30);
        java.util.Calendar calendar33 = cOSDictionary27.getDate("180");
        org.apache.pdfbox.cos.COSName cOSName34 = org.apache.pdfbox.cos.COSName.SHADING_TYPE;
        org.apache.pdfbox.cos.COSName cOSName35 = org.apache.pdfbox.cos.COSName.TYPE1;
        int i36 = cOSDictionary27.getInt(cOSName34, cOSName35);
        org.apache.pdfbox.cos.COSName cOSName37 = org.apache.pdfbox.cos.COSName.BLEED_BOX;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm38 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox39 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm38);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary40 = pDCheckBox39.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary41 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary40);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie pDActionMovie42 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie(cOSDictionary40);
        org.apache.pdfbox.pdmodel.fdf.FDFPageInfo fDFPageInfo43 = new org.apache.pdfbox.pdmodel.fdf.FDFPageInfo(cOSDictionary40);
        org.apache.pdfbox.cos.COSName cOSName44 = org.apache.pdfbox.cos.COSName.LEGAL_ATTESTATION;
        org.apache.pdfbox.cos.COSName cOSName45 = org.apache.pdfbox.cos.COSName.OVERLAY;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm46 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox47 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm46);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary48 = pDCheckBox47.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo pDMarkInfo49 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo(cOSDictionary48);
        cOSDictionary48.setInt("JavaScript", 10);
        org.apache.pdfbox.cos.COSName cOSName53 = org.apache.pdfbox.cos.COSName.TYPE3;
        org.apache.pdfbox.cos.COSName cOSName54 = org.apache.pdfbox.cos.COSName.TYPE1;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm55 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox56 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm55);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary57 = pDCheckBox56.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary58 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary57);
        org.apache.pdfbox.cos.COSDocument cOSDocument59 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey60 = null;
        org.apache.pdfbox.cos.COSObject cOSObject61 = cOSDocument59.getObjectFromPool(cOSObjectKey60);
        org.apache.pdfbox.cos.COSName cOSName62 = org.apache.pdfbox.cos.COSName.CL;
        org.apache.pdfbox.cos.COSObject cOSObject63 = cOSDocument59.getObjectByType(cOSName62);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm64 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox65 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm64);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary66 = pDCheckBox65.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary67 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary66);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine68 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary67);
        long long70 = cOSDictionary67.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed71 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary67);
        java.lang.String str74 = cOSDictionary67.getEmbeddedString("sc", "After");
        cOSDocument59.setTrailer(cOSDictionary67);
        org.apache.pdfbox.cos.COSName cOSName77 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.FILTER_VERISIGN_PPKVS;
        cOSDictionary67.setEmbeddedInt("Index", cOSName77, (int) 'a');
        org.apache.pdfbox.cos.COSName cOSName80 = org.apache.pdfbox.cos.COSName.SET_FF;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm81 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox82 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm81);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary83 = pDCheckBox82.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject pDTableAttributeObject84 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject(cOSDictionary83);
        org.apache.pdfbox.cos.COSName cOSName85 = org.apache.pdfbox.cos.COSName.ROWS;
        org.apache.pdfbox.cos.COSBase[] cOSBase_array86 = new org.apache.pdfbox.cos.COSBase[] { cOSDictionary27, cOSName37, cOSDictionary40, cOSName44, cOSName45, cOSDictionary48, cOSName53, cOSName54, cOSDictionary58, cOSDictionary67, cOSName80, cOSDictionary83, cOSName85 };
        java.util.ArrayList<org.apache.pdfbox.cos.COSBase> arraylist_cOSBase87 = new java.util.ArrayList<org.apache.pdfbox.cos.COSBase>();
        boolean b88 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase87, cOSBase_array86);
        drawObject23.process(operator24, (java.util.List<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase87);
        cOSArray19.addAll((java.util.Collection<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase87);
        setTextRise1.process(operator3, (java.util.List<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase87);
        java.util.List<org.apache.pdfbox.cos.COSBase> list_cOSBase92 = null;
        try {
            showTextLineAndSpace0.process(operator3, list_cOSBase92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(operator3);
        org.junit.Assert.assertNotNull(cOSDictionary6);
        org.junit.Assert.assertNotNull(cOSArray19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(cOSDictionary27);
        org.junit.Assert.assertNotNull(str_array30);
        org.junit.Assert.assertNull(cOSBase31);
        org.junit.Assert.assertNull(calendar33);
        org.junit.Assert.assertNotNull(cOSName34);
        org.junit.Assert.assertNotNull(cOSName35);
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertNotNull(cOSName37);
        org.junit.Assert.assertNotNull(cOSDictionary40);
        org.junit.Assert.assertNotNull(cOSName44);
        org.junit.Assert.assertNotNull(cOSName45);
        org.junit.Assert.assertNotNull(cOSDictionary48);
        org.junit.Assert.assertNotNull(cOSName53);
        org.junit.Assert.assertNotNull(cOSName54);
        org.junit.Assert.assertNotNull(cOSDictionary57);
        org.junit.Assert.assertNotNull(cOSObject61);
        org.junit.Assert.assertNotNull(cOSName62);
        org.junit.Assert.assertNull(cOSObject63);
        org.junit.Assert.assertNotNull(cOSDictionary66);
        org.junit.Assert.assertTrue(long70 == (-1L));
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(cOSName77);
        org.junit.Assert.assertNotNull(cOSName80);
        org.junit.Assert.assertNotNull(cOSDictionary83);
        org.junit.Assert.assertNotNull(cOSName85);
        org.junit.Assert.assertNotNull(cOSBase_array86);
        org.junit.Assert.assertTrue(b88 == true);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test498");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink pDAnnotationLink4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline5 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight fDFAnnotationHighlight6 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight(cOSDictionary3);
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.ANNOT;
        org.apache.pdfbox.cos.COSBase cOSBase8 = org.apache.pdfbox.pdmodel.PDPageTree.getInheritableAttribute(cOSDictionary3, cOSName7);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget pDAnnotationWidget9 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget(cOSDictionary3);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNull(cOSBase8);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test499");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DIGEST_RIPEMD160;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test500");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup.SUB_TYPE_POLYLINE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PolyLine" + "'", str0.equals("PolyLine"));
    }
}

